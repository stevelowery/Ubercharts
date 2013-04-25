package com.comsysto.insight.model.options.more;

import java.io.Serializable;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Dial implements Serializable {

	private static final long serialVersionUID = 1L;

	private String backgroundColor;

	private String baseLength;

	private Integer baseWidth;

	private String borderColor;

	private Integer borderWidth;

	private String radius;

	private String rearLength;

	private String topWidth;

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public String getBaseLength() {
		return baseLength;
	}

	public Integer getBaseWidth() {
		return baseWidth;
	}

	public String getBorderColor() {
		return borderColor;
	}

	public Integer getBorderWidth() {
		return borderWidth;
	}

	public String getRadius() {
		return radius;
	}

	public String getRearLength() {
		return rearLength;
	}

	public String getTopWidth() {
		return topWidth;
	}

	public Dial setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
		return this;
	}

	public Dial setBaseLength(String baseLength) {
		this.baseLength = baseLength;
		return this;
	}

	public Dial setBaseWidth(Integer baseWidth) {
		this.baseWidth = baseWidth;
		return this;
	}

	public Dial setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		return this;
	}

	public Dial setBorderWidth(Integer borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	public Dial setRadius(String radius) {
		this.radius = radius;
		return this;
	}

	public Dial setRearLength(String rearLength) {
		this.rearLength = rearLength;
		return this;
	}

	public Dial setTopWidth(String topWidth) {
		this.topWidth = topWidth;
		return this;
	}

}
