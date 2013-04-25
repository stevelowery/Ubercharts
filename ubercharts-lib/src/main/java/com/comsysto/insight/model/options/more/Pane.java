package com.comsysto.insight.model.options.more;

import java.io.Serializable;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Pane implements Serializable {

	private static final long serialVersionUID = 1L;

	private Object[] background;

	private Object[] center;

	private Integer endAngle;

	private Integer startAngle;

	private Integer size;

	public Object[] getBackground() {
		return background;
	}

	public Object[] getCenter() {
		return center;
	}

	public Integer getEndAngle() {
		return endAngle;
	}

	public Integer getStartAngle() {
		return startAngle;
	}

	public Integer getSize() {
		return size;
	}

	public Pane setBackground(Object... background) {
		this.background = background;
		return this;
	}

	public Pane setCenter(Object... center) {
		this.center = center;
		return this;
	}

	public Pane setEndAngle(Integer endAngle) {
		this.endAngle = endAngle;
		return this;
	}

	public Pane setStartAngle(Integer startAngle) {
		this.startAngle = startAngle;
		return this;
	}

	public Pane setSize(Integer size) {
		this.size = size;
		return this;
	}

}
