package com.comsysto.insight.model.options.more;

import java.io.Serializable;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Pivot implements Serializable {

	private static final long serialVersionUID = 1L;

	private String backgroundColor;

	private String borderColor;

	private Integer borderWidth;

	private Integer radius;

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public String getBorderColor() {
		return borderColor;
	}

	public Integer getBorderWidth() {
		return borderWidth;
	}

	public Integer getRadius() {
		return radius;
	}

	public Pivot setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
		return this;
	}

	public Pivot setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	public Pivot setBorderWidth(Integer borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	public Pivot setRadius(Integer radius) {
		this.radius = radius;
		return this;
	}
}