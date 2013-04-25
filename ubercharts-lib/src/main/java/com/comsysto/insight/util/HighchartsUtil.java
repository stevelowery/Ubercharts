package com.comsysto.insight.util;

import org.apache.wicket.Session;
import org.apache.wicket.protocol.http.request.WebClientInfo;

/**
 * Utilities for charts.
 * 
 * @author Steve Lowery
 * 
 */
public final class HighchartsUtil {

	private static final String WHITE = "#FFF";
	private static final String TRANSPARENT = "transparent";
	private static final int IE8 = 8;

	private HighchartsUtil() {
		super();
	}

	public static String getTransparentColor() {
		Session session = Session.get();
		if (session != null) {
			WebClientInfo clientInfo = (WebClientInfo) session.getClientInfo();
			if (clientInfo != null) {
				if (!clientInfo.getProperties().isBrowserInternetExplorer() || clientInfo.getProperties().getBrowserVersionMajor() > IE8) {
					return TRANSPARENT;
				}
			}
		}
		return WHITE;
	}
}
