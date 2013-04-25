package com.comsysto.insight.model.options;

import java.io.Serializable;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.comsysto.insight.model.options.more.Dial;
import com.comsysto.insight.model.options.more.Pivot;

/**
 * @author zutherb
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class PlotOption implements Serializable {

	private static final long serialVersionUID = -1641413182537105513L;

	private Point point;
	private Boolean animation;
	private Boolean allowPointSelect;
	private String cursor;
	private DataLabels dataLabels;
	private String stacking;
	private Dial dial;
	private Pivot pivot;

	public Boolean getAnimation() {
		return animation;
	}

	public void setAnimation(Boolean animation) {
		this.animation = animation;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public void setAllowPointSelect(boolean allowPointSelect) {
		this.allowPointSelect = allowPointSelect;
	}

	public Boolean getAllowPointSelect() {
		return allowPointSelect;
	}

	public void setAllowPointSelect(Boolean allowPointSelect) {
		this.allowPointSelect = allowPointSelect;
	}

	public String getCursor() {
		return cursor;
	}

	public void setCursor(String cursor) {
		this.cursor = cursor;
	}

	public DataLabels getDataLabels() {
		return dataLabels;
	}

	public void setDataLabels(DataLabels dataLabels) {
		this.dataLabels = dataLabels;
	}

	public String getStacking() {
		return stacking;
	}

	public PlotOption setStacking(String stacking) {
		this.stacking = stacking;
		return this;
	}

	public Dial getDial() {
		return dial;
	}

	public PlotOption setDial(Dial dial) {
		this.dial = dial;
		return this;
	}

	public Pivot getPivot() {
		return pivot;
	}

	public PlotOption setPivot(Pivot pivot) {
		this.pivot = pivot;
		return this;
	}
}
