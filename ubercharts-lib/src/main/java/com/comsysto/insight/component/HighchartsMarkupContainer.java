/*
 * Copyright 2011 comSysto GmbH
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.comsysto.insight.component;

import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.IModel;
import org.apache.wicket.request.resource.JavaScriptResourceReference;

import com.comsysto.insight.model.Highchart;

/**
 * This is written for wicket 6.0
 * 
 * @author Steve Lowery
 * 
 */
public class HighchartsMarkupContainer extends WebMarkupContainer {

	private static final long serialVersionUID = 1L;
	private static final String[] PGI_CHART_COLOR_PALLETTE = new String[] {
			"#2f6e91",
			"#ff9332",
			"#6a2329",
			"#092f46",
			"#d95c1f",
			"#33765e",
			"#845285",
			"#70bde8",
			"#12484f",
			"#4d3d5a"
	};

	public HighchartsMarkupContainer(String id, IModel<Highchart> highchartsModel) {
		super(id, highchartsModel);
		setOutputMarkupId(true);
	}

	private String generateHighchartsJS() {
		Highchart highchart = (Highchart) getDefaultModelObject();

		if (highchart.getColors() == null) {
			highchart.setColors(PGI_CHART_COLOR_PALLETTE);
		}

		highchart.getChart().setClassName("chart");

		StringBuffer js = new StringBuffer();
		js.append("$(\"#").append(getMarkupId()).append("\").highcharts(");
		js.append(highchart.toJson());
		js.append(" );");
		return js.toString();
	}

	@Override
	public void renderHead(IHeaderResponse response) {
		response.render(JavaScriptHeaderItem.forReference(new JavaScriptResourceReference(HighchartsMarkupContainer.class, "highcharts.js")));
		response.render(JavaScriptHeaderItem.forReference(new JavaScriptResourceReference(HighchartsMarkupContainer.class, "highcharts-more.js")));
		response.render(JavaScriptHeaderItem.forReference(new JavaScriptResourceReference(HighchartsMarkupContainer.class, "exporting.js")));
		response.render(OnDomReadyHeaderItem.forScript(generateHighchartsJS()));
	}
}