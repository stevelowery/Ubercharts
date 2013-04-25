package com.comsysto.insight.model.options;

import java.io.Serializable;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.ALWAYS)
public class Background implements Serializable {

	private String backgroundColor;
	private Integer borderWidth;
	private String borderColor;

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public Integer getBorderWidth() {
		return borderWidth;
	}

	public String getBorderColor() {
		return borderColor;
	}

	public Background setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
		return this;
	}

	public Background setBorderWidth(Integer borderWidth) {
		this.borderWidth = borderWidth;
		return this;
	}

	public Background setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		return this;
	}

}
