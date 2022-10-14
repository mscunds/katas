package de.mscs.kata.designpattern.decorator.strategy;

import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.Value;

@AllArgsConstructor
@ToString
public class Window {

	@Value
	public static class Dimension {
		int height;
		int width;
	}

	@ToString.Include
	private String title;
	@ToString.Include
	private Dimension size;
	@ToString.Exclude
	private final PaintStrategy windowsBorderStrategy = new WindowsBorderStrategy();
	@ToString.Exclude
	private final PaintStrategy iosBorderStrategy = new IosBorderStrategy();

	public void draw() {
		String strategy = Optional.ofNullable(System.getProperty("strategy"))
				.orElse("").toLowerCase();
		if ("ios".equals(strategy)) {
			iosBorderStrategy.draw(size);
		} else {
			windowsBorderStrategy.draw(size);
		}
	}

	public void resize(int height, int width) {
		this.size = new Dimension(height, width);
	}
}
