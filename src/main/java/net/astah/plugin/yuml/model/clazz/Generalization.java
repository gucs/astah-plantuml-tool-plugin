package net.astah.plugin.yuml.model.clazz;


import net.astah.plugin.yuml.model.ClassUtils;
import net.astah.plugin.yuml.model.Relation;

import com.change_vision.jude.api.inf.model.IClass;
import com.change_vision.jude.api.inf.presentation.IPresentation;

public class Generalization extends Relation {
	public Generalization(IPresentation presentation, IClass left, IClass right) {
		super(presentation, left, right);
	}

	public String toPlantuml() {
		String left = ClassUtils.getNameLabel(getLeft());
		String right = ClassUtils.getNameLabel(getRight());
		return left + "<|--" + right;
	}
}
