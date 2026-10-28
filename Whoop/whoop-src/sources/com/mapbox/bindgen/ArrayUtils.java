package com.mapbox.bindgen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ArrayUtils {
    private ArrayUtils() {
    }

    public static List<Boolean> convert(boolean[] zArr) {
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z4 : zArr) {
            arrayList.add(Boolean.valueOf(z4));
        }
        return arrayList;
    }

    public static Object[] convertListToArray(List<Object> list) {
        return list.toArray();
    }

    public static List<Byte> convert(byte[] bArr) {
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf(b));
        }
        return arrayList;
    }

    public static List<Character> convert(char[] cArr) {
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c3 : cArr) {
            arrayList.add(Character.valueOf(c3));
        }
        return arrayList;
    }

    public static List<Short> convert(short[] sArr) {
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s13 : sArr) {
            arrayList.add(Short.valueOf(s13));
        }
        return arrayList;
    }

    public static List<Integer> convert(int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i13 : iArr) {
            arrayList.add(Integer.valueOf(i13));
        }
        return arrayList;
    }

    public static List<Long> convert(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j7 : jArr) {
            arrayList.add(Long.valueOf(j7));
        }
        return arrayList;
    }

    public static List<Float> convert(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f13 : fArr) {
            arrayList.add(Float.valueOf(f13));
        }
        return arrayList;
    }

    public static List<Double> convert(double[] dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d3 : dArr) {
            arrayList.add(Double.valueOf(d3));
        }
        return arrayList;
    }

    public static List<Object> convert(Object[] objArr) {
        return Arrays.asList(objArr);
    }
}
