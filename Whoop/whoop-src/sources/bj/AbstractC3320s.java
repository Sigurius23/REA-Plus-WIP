package bj;

import android.graphics.Rect;
import dj.AbstractC12058c;
import dj.AbstractC12064i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;
import p002a0.C0024g1;
import p002a0.C0062y;
import p049cj.C4736b;
import p049cj.C4738d;
import p426qi.C30387i;
import p426qi.C30404y;
import p581we.C37199o;
import p584wi.C37303c;
import p584wi.C37304d;
import p584wi.C37308h;
import p682zi.C40655e;

/* JADX INFO: renamed from: bj.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3320s {

    /* JADX INFO: renamed from: a */
    public static final C37199o f12902a = C37199o.m119195L(StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* JADX INFO: renamed from: b */
    public static final C37199o f12903b = C37199o.m119195L("id", "layers", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "p", "u");

    /* JADX INFO: renamed from: c */
    public static final C37199o f12904c = C37199o.m119195L("list");

    /* JADX INFO: renamed from: d */
    public static final C37199o f12905d = C37199o.m119195L("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0046. Please report as an issue. */
    /* JADX INFO: renamed from: a */
    public static C30387i m9619a(C4738d c4738d) throws C4736b, EOFException {
        float f13;
        int i13;
        float f14;
        HashMap map;
        HashMap map2;
        ArrayList arrayList;
        float f15;
        float fM33265c = AbstractC12064i.m33265c();
        C0062y c0062y = new C0062y((Object) null);
        ArrayList arrayList2 = new ArrayList();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        HashMap map5 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        C0024g1 c0024g1 = new C0024g1((Object) null);
        C30387i c30387i = new C30387i();
        c4738d.beginObject();
        float fNextDouble = 0.0f;
        int iNextDouble = 0;
        int iNextDouble2 = 0;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        while (c4738d.hasNext()) {
            switch (c4738d.mo14824m(f12902a)) {
                case 0:
                    iNextDouble = (int) c4738d.nextDouble();
                    arrayList3 = arrayList3;
                    break;
                case 1:
                    iNextDouble2 = (int) c4738d.nextDouble();
                    fNextDouble2 = fNextDouble2;
                    arrayList3 = arrayList3;
                    break;
                case 2:
                    fNextDouble2 = (float) c4738d.nextDouble();
                    iNextDouble2 = iNextDouble2;
                    arrayList3 = arrayList3;
                    break;
                case 3:
                    f13 = fM33265c;
                    arrayList3 = arrayList3;
                    fNextDouble = ((float) c4738d.nextDouble()) - 0.01f;
                    map5 = map5;
                    arrayList3 = arrayList3;
                    fM33265c = f13;
                    break;
                case 4:
                    f13 = fM33265c;
                    arrayList3 = arrayList3;
                    i13 = iNextDouble2;
                    fNextDouble3 = (float) c4738d.nextDouble();
                    fNextDouble2 = fNextDouble2;
                    iNextDouble2 = i13;
                    arrayList3 = arrayList3;
                    fM33265c = f13;
                    break;
                case 5:
                    f13 = fM33265c;
                    arrayList3 = arrayList3;
                    i13 = iNextDouble2;
                    f14 = fNextDouble2;
                    map = map5;
                    String[] strArrSplit = c4738d.nextString().split("\\.");
                    int i14 = Integer.parseInt(strArrSplit[0]);
                    int i15 = Integer.parseInt(strArrSplit[1]);
                    int i16 = Integer.parseInt(strArrSplit[2]);
                    if (i14 < 4 || (i14 <= 4 && (i15 < 4 || (i15 <= 4 && i16 < 0)))) {
                        c30387i.m92858a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    fNextDouble2 = f14;
                    map5 = map;
                    iNextDouble2 = i13;
                    arrayList3 = arrayList3;
                    fM33265c = f13;
                    break;
                case 6:
                    f13 = fM33265c;
                    arrayList3 = arrayList3;
                    i13 = iNextDouble2;
                    f14 = fNextDouble2;
                    HashMap map6 = map5;
                    c4738d.beginArray();
                    int i17 = 0;
                    while (c4738d.hasNext()) {
                        C40655e c40655eM9618a = AbstractC3319r.m9618a(c4738d, c30387i);
                        if (c40655eM9618a.f175513e == 3) {
                            i17++;
                        }
                        arrayList2.add(c40655eM9618a);
                        HashMap map7 = map6;
                        c0062y.m155g(c40655eM9618a.f175512d, c40655eM9618a);
                        if (i17 > 4) {
                            AbstractC12058c.m33239b("You have " + i17 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        map6 = map7;
                    }
                    map = map6;
                    c4738d.endArray();
                    fNextDouble2 = f14;
                    map5 = map;
                    iNextDouble2 = i13;
                    arrayList3 = arrayList3;
                    fM33265c = f13;
                    break;
                case 7:
                    f13 = fM33265c;
                    i13 = iNextDouble2;
                    f14 = fNextDouble2;
                    c4738d.beginArray();
                    while (c4738d.hasNext()) {
                        ArrayList arrayList4 = new ArrayList();
                        C0062y c0062y2 = new C0062y((Object) null);
                        c4738d.beginObject();
                        String strNextString = null;
                        String strNextString2 = null;
                        String strNextString3 = null;
                        int iNextInt = 0;
                        int iNextInt2 = 0;
                        while (c4738d.hasNext()) {
                            int iMo14824m = c4738d.mo14824m(f12903b);
                            if (iMo14824m != 0) {
                                if (iMo14824m == 1) {
                                    c4738d.beginArray();
                                    while (c4738d.hasNext()) {
                                        C40655e c40655eM9618a2 = AbstractC3319r.m9618a(c4738d, c30387i);
                                        c0062y2.m155g(c40655eM9618a2.f175512d, c40655eM9618a2);
                                        arrayList4.add(c40655eM9618a2);
                                        map5 = map5;
                                        arrayList3 = arrayList3;
                                    }
                                    map2 = map5;
                                    arrayList = arrayList3;
                                    c4738d.endArray();
                                } else if (iMo14824m == 2) {
                                    iNextInt = c4738d.nextInt();
                                } else if (iMo14824m == 3) {
                                    iNextInt2 = c4738d.nextInt();
                                } else if (iMo14824m == 4) {
                                    strNextString2 = c4738d.nextString();
                                } else if (iMo14824m != 5) {
                                    c4738d.mo14825s();
                                    c4738d.skipValue();
                                    map2 = map5;
                                    arrayList = arrayList3;
                                } else {
                                    strNextString3 = c4738d.nextString();
                                }
                                map5 = map2;
                                arrayList3 = arrayList;
                            } else {
                                strNextString = c4738d.nextString();
                            }
                        }
                        HashMap map8 = map5;
                        ArrayList arrayList5 = arrayList3;
                        c4738d.endObject();
                        if (strNextString2 != null) {
                            C30404y c30404y = new C30404y(iNextInt, iNextInt2, strNextString, strNextString2, strNextString3);
                            map4.put(c30404y.m92901d(), c30404y);
                        } else {
                            map3.put(strNextString, arrayList4);
                        }
                        map5 = map8;
                        arrayList3 = arrayList5;
                    }
                    arrayList3 = arrayList3;
                    c4738d.endArray();
                    map = map5;
                    fNextDouble2 = f14;
                    map5 = map;
                    iNextDouble2 = i13;
                    arrayList3 = arrayList3;
                    fM33265c = f13;
                    break;
                case 8:
                    f13 = fM33265c;
                    i13 = iNextDouble2;
                    f14 = fNextDouble2;
                    c4738d.beginObject();
                    while (c4738d.hasNext()) {
                        if (c4738d.mo14824m(f12904c) != 0) {
                            c4738d.mo14825s();
                            c4738d.skipValue();
                        } else {
                            c4738d.beginArray();
                            while (c4738d.hasNext()) {
                                C37303c c37303cM9608a = AbstractC3312k.m9608a(c4738d);
                                map5.put(c37303cM9608a.m119474b(), c37303cM9608a);
                            }
                            c4738d.endArray();
                        }
                    }
                    c4738d.endObject();
                    map = map5;
                    fNextDouble2 = f14;
                    map5 = map;
                    iNextDouble2 = i13;
                    arrayList3 = arrayList3;
                    fM33265c = f13;
                    break;
                case 9:
                    f13 = fM33265c;
                    i13 = iNextDouble2;
                    f14 = fNextDouble2;
                    c4738d.beginArray();
                    while (c4738d.hasNext()) {
                        C37304d c37304dM9607a = AbstractC3311j.m9607a(c4738d, c30387i);
                        c0024g1.m57f(c37304dM9607a.hashCode(), c37304dM9607a);
                    }
                    c4738d.endArray();
                    map = map5;
                    fNextDouble2 = f14;
                    map5 = map;
                    iNextDouble2 = i13;
                    arrayList3 = arrayList3;
                    fM33265c = f13;
                    break;
                case 10:
                    c4738d.beginArray();
                    while (c4738d.hasNext()) {
                        c4738d.beginObject();
                        String strNextString4 = null;
                        float fNextDouble4 = 0.0f;
                        float fNextDouble5 = 0.0f;
                        while (c4738d.hasNext()) {
                            int iMo14824m2 = c4738d.mo14824m(f12905d);
                            if (iMo14824m2 != 0) {
                                f15 = fM33265c;
                                if (iMo14824m2 == 1) {
                                    fNextDouble2 = fNextDouble2;
                                    fNextDouble4 = (float) c4738d.nextDouble();
                                } else if (iMo14824m2 != 2) {
                                    c4738d.mo14825s();
                                    c4738d.skipValue();
                                } else {
                                    fNextDouble2 = fNextDouble2;
                                    fNextDouble5 = (float) c4738d.nextDouble();
                                }
                                iNextDouble2 = iNextDouble2;
                            } else {
                                f15 = fM33265c;
                                strNextString4 = c4738d.nextString();
                            }
                            fM33265c = f15;
                        }
                        c4738d.endObject();
                        arrayList3.add(new C37308h(strNextString4, fNextDouble4, fNextDouble5));
                        fNextDouble2 = fNextDouble2;
                        iNextDouble2 = iNextDouble2;
                        fM33265c = fM33265c;
                    }
                    f13 = fM33265c;
                    i13 = iNextDouble2;
                    f14 = fNextDouble2;
                    c4738d.endArray();
                    map = map5;
                    fNextDouble2 = f14;
                    map5 = map;
                    iNextDouble2 = i13;
                    arrayList3 = arrayList3;
                    fM33265c = f13;
                    break;
                default:
                    c4738d.mo14825s();
                    c4738d.skipValue();
                    f13 = fM33265c;
                    i13 = iNextDouble2;
                    f14 = fNextDouble2;
                    map = map5;
                    fNextDouble2 = f14;
                    map5 = map;
                    iNextDouble2 = i13;
                    arrayList3 = arrayList3;
                    fM33265c = f13;
                    break;
            }
        }
        float f16 = fM33265c;
        ArrayList arrayList6 = arrayList3;
        HashMap map9 = map5;
        Rect rect = new Rect(0, 0, (int) (iNextDouble * f16), (int) (iNextDouble2 * f16));
        float fM33265c2 = AbstractC12064i.m33265c();
        c30387i.f124691k = rect;
        c30387i.f124692l = fNextDouble2;
        c30387i.f124693m = fNextDouble;
        c30387i.f124694n = fNextDouble3;
        c30387i.f124690j = arrayList2;
        c30387i.f124689i = c0062y;
        c30387i.f124683c = map3;
        c30387i.f124684d = map4;
        c30387i.f124685e = fM33265c2;
        c30387i.f124688h = c0024g1;
        c30387i.f124686f = map9;
        c30387i.f124687g = arrayList6;
        return c30387i;
    }
}
