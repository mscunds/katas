package de.mscs.kata.designpattern.decorator;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import de.mscs.kata.designpattern.decorator.strategy.Window;
import de.mscs.kata.designpattern.decorator.wrapper.AgeDecorator;
import de.mscs.kata.designpattern.decorator.wrapper.FinishedDecorator;
import de.mscs.kata.designpattern.decorator.wrapper.SimpleDecorator;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "de.mscs.kata.designpattern.decorator")
@Slf4j
public class DecoratorApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new SpringApplicationBuilder(DecoratorApplication.class)
				.web(WebApplicationType.NONE)
				.allowCircularReferences(false)
				.logStartupInfo(true)
				.build().run(args);

		DecoratorApplication application = context.getBean(DecoratorApplication.class);
		log.info(StringUtils.leftPad("", 20, '*'));
		log.info("Decotator - Sample");
		log.info(StringUtils.leftPad("", 20, '*'));
		application.showWrapper();

		log.info(StringUtils.leftPad("", 20, '*'));
		log.info("Strategy - Sample");
		log.info(StringUtils.leftPad("", 20, '*'));
		application.showStrategy();
	}

	private void showWrapper() {
		Instant now = Instant.now();
		SimpleDecorator decorator = new SimpleDecorator(now.minus(5, ChronoUnit.DAYS), "Ein Titel");

		AgeDecorator ageDecorator = new AgeDecorator(decorator);
		FinishedDecorator finishedDecorator = new FinishedDecorator(decorator);
		log.info("Der Datencontainer ist \"{}\"", decorator);
		log.info("Der AgeDecorator sagt: \"{}\" ist {} Tage alt", ageDecorator.getTitle(), ageDecorator.getAge().toDaysPart());
		log.info("Der FinishedDecorator sagt: \"{}\" ist{}beendet,", finishedDecorator.getTitle(), finishedDecorator.isFinished() ?
				" " : " nicht ");

		try {
			finishedDecorator.setFinishedAt(now);
		}
		catch(UnsupportedOperationException uoe) {
			log.info("Der FinishedDecorator \"{}\" erlaubt das Setzen des finished Dates nicht", finishedDecorator.getTitle());
		}

		ageDecorator.setFinishedAt(now.minus(1, ChronoUnit.DAYS));
		finishedDecorator = new FinishedDecorator(ageDecorator);
		log.info("Der FinishedDecorator sagt: \"{}\" ist{}beendet.", finishedDecorator.getTitle(),
                finishedDecorator.isFinished() ? " " : " nicht ");

	}

	private void showStrategy() {
		Window window = new Window("Mein Fenster", new Window.Dimension(100, 150));
		window.draw();
		System.setProperty("strategy", "ios");
		window.draw();
		System.setProperty("strategy", "windows");
		window.resize(1920, 1080);
		window.draw();
	}
}
