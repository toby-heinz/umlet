package com.baselet.diagram.commandnew;

import com.baselet.element.GridElement;

public class RemoveGridElementCommand extends Command {

	private CanAddAndRemoveGridElement target;
	private GridElement[] elements;

	public RemoveGridElementCommand(CanAddAndRemoveGridElement target, GridElement ... elements) {
		this.target = target;
		this.elements = elements;
	}

	@Override
	public void execute() {
		target.removeGridElements(elements);
	}

	@Override
	public void undo() {
		target.addGridElements(elements);
	}
	
}
