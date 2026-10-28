package com.mapbox.bindgen;

/* JADX INFO: loaded from: classes6.dex */
public final class PartialEq {
    private static double epsilonD = Math.ulp(1.0d);
    private static float epsilonF = Math.ulp(1.0f);

    public static boolean compare(double d3, double d14) {
        return Math.abs(d3 - d14) <= epsilonD * Math.max(1.0d, Math.max(Math.abs(d3), Math.abs(d14)));
    }

    public static boolean compare(float f13, float f14) {
        return Math.abs(f13 - f14) <= epsilonF * Math.max(1.0f, Math.max(Math.abs(f13), Math.abs(f14)));
    }
}
