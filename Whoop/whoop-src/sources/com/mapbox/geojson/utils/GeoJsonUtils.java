package com.mapbox.geojson.utils;

/* JADX INFO: loaded from: classes6.dex */
public class GeoJsonUtils {
    private static long MAX_DOUBLE_TO_ROUND = (long) (9.223372036854776E18d / 1.0E7d);
    private static double ROUND_PRECISION = 1.0E7d;

    public static double trim(double d3) {
        long j7 = MAX_DOUBLE_TO_ROUND;
        return (d3 > ((double) j7) || d3 < ((double) (-j7))) ? d3 : Math.round(d3 * ROUND_PRECISION) / ROUND_PRECISION;
    }
}
