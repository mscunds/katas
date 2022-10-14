package de.mscs.kata.designpattern.decorator.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class IosBorderStrategy implements PaintStrategy {

	@Override
	public void draw(Window.Dimension size) {
		log.info("drawing window of size {} in iOS style.", size);
	}
}
