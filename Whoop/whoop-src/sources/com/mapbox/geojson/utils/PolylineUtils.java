package com.mapbox.geojson.utils;

import com.mapbox.geojson.Point;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class PolylineUtils {
    private static final boolean SIMPLIFY_DEFAULT_HIGHEST_QUALITY = false;
    private static final double SIMPLIFY_DEFAULT_TOLERANCE = 1.0d;

    private PolylineUtils() {
    }

    public static List<Point> decode(String str, int i13) {
        int i14;
        int i15;
        int length = str.length();
        double dPow = Math.pow(10.0d, i13);
        ArrayList arrayList = new ArrayList();
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < length) {
            int i19 = 1;
            int i24 = 0;
            int i25 = 1;
            while (true) {
                i14 = i16 + 1;
                int iCharAt = str.charAt(i16) - '@';
                i25 += iCharAt << i24;
                i24 += 5;
                if (iCharAt < 31) {
                    break;
                }
                i16 = i14;
            }
            int i26 = ((i25 & 1) != 0 ? ~(i25 >> 1) : i25 >> 1) + i17;
            int i27 = 0;
            while (true) {
                i15 = i14 + 1;
                int iCharAt2 = str.charAt(i14) - '@';
                i19 += iCharAt2 << i27;
                i27 += 5;
                if (iCharAt2 < 31) {
                    break;
                }
                i14 = i15;
            }
            i18 += (i19 & 1) != 0 ? ~(i19 >> 1) : i19 >> 1;
            arrayList.add(Point.fromLngLat(((double) i18) / dPow, ((double) i26) / dPow));
            i17 = i26;
            i16 = i15;
        }
        return arrayList;
    }

    public static String encode(List<Point> list, int i13) {
        StringBuilder sb4 = new StringBuilder();
        double dPow = Math.pow(10.0d, i13);
        long j7 = 0;
        long j13 = 0;
        for (Point point : list) {
            long jRound = Math.round(point.latitude() * dPow);
            long jRound2 = Math.round(point.longitude() * dPow);
            encode(jRound - j7, sb4);
            encode(jRound2 - j13, sb4);
            j7 = jRound;
            j13 = jRound2;
        }
        return sb4.toString();
    }

    private static double getSqDist(Point point, Point point2) {
        double dLongitude = point.longitude() - point2.longitude();
        double dLatitude = point.latitude() - point2.latitude();
        return (dLatitude * dLatitude) + (dLongitude * dLongitude);
    }

    private static double getSqSegDist(Point point, Point point2, Point point3) {
        double dLongitude = point2.longitude();
        double dLatitude = point2.latitude();
        double dLongitude2 = point3.longitude() - dLongitude;
        double dLatitude2 = point3.latitude() - dLatitude;
        if (dLongitude2 != 0.0d || dLatitude2 != 0.0d) {
            double dLatitude3 = (((point.latitude() - dLatitude) * dLatitude2) + ((point.longitude() - dLongitude) * dLongitude2)) / ((dLatitude2 * dLatitude2) + (dLongitude2 * dLongitude2));
            if (dLatitude3 > SIMPLIFY_DEFAULT_TOLERANCE) {
                dLongitude = point3.longitude();
                dLatitude = point3.latitude();
            } else if (dLatitude3 > 0.0d) {
                dLongitude += dLongitude2 * dLatitude3;
                dLatitude += dLatitude2 * dLatitude3;
            }
        }
        double dLongitude3 = point.longitude() - dLongitude;
        double dLatitude4 = point.latitude() - dLatitude;
        return (dLatitude4 * dLatitude4) + (dLongitude3 * dLongitude3);
    }

    @Deprecated
    public static List<Point> simplify(List<Point> list) {
        return simplify(list, SIMPLIFY_DEFAULT_TOLERANCE, false);
    }

    private static List<Point> simplifyDouglasPeucker(List<Point> list, double d3) {
        int size = list.size() - 1;
        ArrayList arrayList = new ArrayList();
        arrayList.add(list.get(0));
        arrayList.addAll(simplifyDpStep(list, 0, size, d3, arrayList));
        arrayList.add(list.get(size));
        return arrayList;
    }

    private static List<Point> simplifyDpStep(List<Point> list, int i13, int i14, double d3, List<Point> list2) {
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        double d14 = d3;
        for (int i16 = i13 + 1; i16 < i14; i16++) {
            double sqSegDist = getSqSegDist(list.get(i16), list.get(i13), list.get(i14));
            if (sqSegDist > d14) {
                i15 = i16;
                d14 = sqSegDist;
            }
        }
        if (d14 > d3) {
            if (i15 - i13 > 1) {
                arrayList.addAll(simplifyDpStep(list, i13, i15, d3, list2));
            }
            arrayList.add(list.get(i15));
            if (i14 - i15 > 1) {
                arrayList.addAll(simplifyDpStep(list, i15, i14, d3, list2));
            }
        }
        return arrayList;
    }

    private static List<Point> simplifyRadialDist(List<Point> list, double d3) {
        Point point = list.get(0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(point);
        int size = list.size();
        Point point2 = null;
        for (int i13 = 1; i13 < size; i13++) {
            point2 = list.get(i13);
            if (getSqDist(point2, point) > d3) {
                arrayList.add(point2);
                point = point2;
            }
        }
        if (!point.equals(point2)) {
            arrayList.add(point2);
        }
        return arrayList;
    }

    @Deprecated
    public static List<Point> simplify(List<Point> list, double d3) {
        return simplify(list, d3, false);
    }

    @Deprecated
    public static List<Point> simplify(List<Point> list, boolean z4) {
        return simplify(list, SIMPLIFY_DEFAULT_TOLERANCE, z4);
    }

    @Deprecated
    public static List<Point> simplify(List<Point> list, double d3, boolean z4) {
        if (list.size() <= 2) {
            return list;
        }
        double d14 = d3 * d3;
        if (!z4) {
            list = simplifyRadialDist(list, d14);
        }
        return simplifyDouglasPeucker(list, d14);
    }

    private static void encode(long j7, StringBuilder sb4) {
        long j13 = j7 << 1;
        if (j7 < 0) {
            j13 = ~j13;
        }
        while (j13 >= 32) {
            sb4.append(Character.toChars((int) ((32 | (31 & j13)) + 63)));
            j13 >>= 5;
        }
        sb4.append(Character.toChars((int) (j13 + 63)));
    }
}
