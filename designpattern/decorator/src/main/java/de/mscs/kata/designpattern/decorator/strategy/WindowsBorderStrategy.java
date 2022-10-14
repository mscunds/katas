package de.mscs.kata.designpattern.decorator.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class WindowsBorderStrategy implements PaintStrategy {
	@Override
	public void draw(Window.Dimension size) {
		log.info("drawing window of size {} in window style.", size);
	}
}
