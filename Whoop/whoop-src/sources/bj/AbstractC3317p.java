package bj;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import dj.AbstractC12062g;
import dj.AbstractC12064i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p049cj.AbstractC4737c;
import p119ej.C13224a;
import p426qi.C30387i;
import p581we.C37199o;

/* JADX INFO: renamed from: bj.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3317p {

    /* JADX INFO: renamed from: a */
    public static final LinearInterpolator f12895a = new LinearInterpolator();

    /* JADX INFO: renamed from: b */
    public static final C37199o f12896b = C37199o.m119195L("t", "s", "e", "o", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "to", "ti");

    /* JADX INFO: renamed from: c */
    public static final C37199o f12897c = C37199o.m119195L("x", "y");

    /* JADX INFO: renamed from: a */
    public static BaseInterpolator m9614a(PointF pointF, PointF pointF2) {
        pointF.x = AbstractC12062g.m33252b(pointF.x, -1.0f, 1.0f);
        pointF.y = AbstractC12062g.m33252b(pointF.y, -100.0f, 100.0f);
        pointF2.x = AbstractC12062g.m33252b(pointF2.x, -1.0f, 1.0f);
        float fM33252b = AbstractC12062g.m33252b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fM33252b;
        Matrix matrix = AbstractC12064i.f40031a;
        try {
            return new PathInterpolator(pointF.x, pointF.y, pointF2.x, fM33252b);
        } catch (IllegalArgumentException e5) {
            return "The Path cannot loop back on itself.".equals(e5.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
    }

    /* JADX WARN: Code duplicated, block: B:99:0x01f6  */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002d. Please report as an issue. */
    /* JADX INFO: renamed from: b */
    public static C13224a m9615b(AbstractC4737c abstractC4737c, C30387i c30387i, float f13, InterfaceC3306e0 interfaceC3306e0, boolean z4, boolean z13) {
        Object obj;
        BaseInterpolator baseInterpolatorM9614a;
        BaseInterpolator baseInterpolatorM9614a2;
        BaseInterpolator baseInterpolatorM9614a3;
        Object obj2;
        C13224a c13224a;
        C37199o c37199o;
        C37199o c37199o2;
        PointF pointF;
        C37199o c37199o3 = f12896b;
        LinearInterpolator linearInterpolator = f12895a;
        if (!z4 || !z13) {
            C37199o c37199o4 = c37199o3;
            if (!z4) {
                return new C13224a(interfaceC3306e0.mo9604a(abstractC4737c, f13));
            }
            abstractC4737c.beginObject();
            PointF pointFM9611b = null;
            PointF pointFM9611b2 = null;
            PointF pointFM9611b3 = null;
            PointF pointFM9611b4 = null;
            boolean z14 = false;
            Object objMo9604a = null;
            float fNextDouble = 0.0f;
            Object objMo9604a2 = null;
            while (abstractC4737c.hasNext()) {
                c37199o4 = c37199o4;
                switch (abstractC4737c.mo14824m(c37199o4)) {
                    case 0:
                        fNextDouble = (float) abstractC4737c.nextDouble();
                        continue;
                    case 1:
                        objMo9604a = interfaceC3306e0.mo9604a(abstractC4737c, f13);
                        break;
                    case 2:
                        objMo9604a2 = interfaceC3306e0.mo9604a(abstractC4737c, f13);
                        break;
                    case 3:
                        pointFM9611b4 = AbstractC3316o.m9611b(abstractC4737c, 1.0f);
                        break;
                    case 4:
                        pointFM9611b = AbstractC3316o.m9611b(abstractC4737c, 1.0f);
                        break;
                    case 5:
                        z14 = abstractC4737c.nextInt() == 1;
                        break;
                    case 6:
                        pointFM9611b2 = AbstractC3316o.m9611b(abstractC4737c, f13);
                        break;
                    case 7:
                        pointFM9611b3 = AbstractC3316o.m9611b(abstractC4737c, f13);
                        break;
                    default:
                        abstractC4737c.skipValue();
                        break;
                }
            }
            abstractC4737c.endObject();
            if (!z14) {
                if (pointFM9611b4 == null || pointFM9611b == null) {
                    obj = objMo9604a2;
                } else {
                    baseInterpolatorM9614a = m9614a(pointFM9611b4, pointFM9611b);
                    obj = objMo9604a2;
                }
                C13224a c13224a2 = new C13224a(c30387i, objMo9604a, obj, baseInterpolatorM9614a, fNextDouble, (Float) null);
                c13224a2.f45829o = pointFM9611b2;
                c13224a2.f45830p = pointFM9611b3;
                return c13224a2;
            }
            obj = objMo9604a;
            baseInterpolatorM9614a = linearInterpolator;
            C13224a c13224a3 = new C13224a(c30387i, objMo9604a, obj, baseInterpolatorM9614a, fNextDouble, (Float) null);
            c13224a3.f45829o = pointFM9611b2;
            c13224a3.f45830p = pointFM9611b3;
            return c13224a3;
        }
        abstractC4737c.beginObject();
        PointF pointF2 = null;
        PointF pointFM9611b5 = null;
        PointF pointFM9611b6 = null;
        boolean z15 = false;
        PointF pointFM9611b7 = null;
        PointF pointFM9611b8 = null;
        PointF pointF3 = null;
        Object objMo9604a3 = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        float fNextDouble2 = 0.0f;
        Object objMo9604a4 = null;
        while (abstractC4737c.hasNext()) {
            int iMo14824m = abstractC4737c.mo14824m(c37199o3);
            C37199o c37199o5 = f12897c;
            linearInterpolator = linearInterpolator;
            switch (iMo14824m) {
                case 0:
                    c37199o = c37199o3;
                    fNextDouble2 = (float) abstractC4737c.nextDouble();
                    c37199o3 = c37199o;
                    break;
                case 1:
                    c37199o = c37199o3;
                    objMo9604a3 = interfaceC3306e0.mo9604a(abstractC4737c, f13);
                    c37199o3 = c37199o;
                    break;
                case 2:
                    c37199o = c37199o3;
                    objMo9604a4 = interfaceC3306e0.mo9604a(abstractC4737c, f13);
                    c37199o3 = c37199o;
                    break;
                case 3:
                    c37199o = c37199o3;
                    boolean z16 = z15;
                    Object obj3 = objMo9604a3;
                    PointF pointF6 = pointF4;
                    if (abstractC4737c.mo14822i() == 3) {
                        abstractC4737c.beginObject();
                        float fNextDouble3 = 0.0f;
                        float fNextDouble4 = 0.0f;
                        float fNextDouble5 = 0.0f;
                        float fNextDouble6 = 0.0f;
                        while (abstractC4737c.hasNext()) {
                            int iMo14824m2 = abstractC4737c.mo14824m(c37199o5);
                            if (iMo14824m2 != 0) {
                                if (iMo14824m2 != 1) {
                                    abstractC4737c.skipValue();
                                } else if (abstractC4737c.mo14822i() == 7) {
                                    fNextDouble6 = (float) abstractC4737c.nextDouble();
                                    fNextDouble4 = fNextDouble6;
                                } else {
                                    abstractC4737c.beginArray();
                                    fNextDouble4 = (float) abstractC4737c.nextDouble();
                                    fNextDouble6 = abstractC4737c.mo14822i() == 7 ? (float) abstractC4737c.nextDouble() : fNextDouble4;
                                    abstractC4737c.endArray();
                                }
                            } else if (abstractC4737c.mo14822i() == 7) {
                                fNextDouble5 = (float) abstractC4737c.nextDouble();
                                fNextDouble3 = fNextDouble5;
                            } else {
                                abstractC4737c.beginArray();
                                fNextDouble3 = (float) abstractC4737c.nextDouble();
                                fNextDouble5 = abstractC4737c.mo14822i() == 7 ? (float) abstractC4737c.nextDouble() : fNextDouble3;
                                abstractC4737c.endArray();
                            }
                        }
                        PointF pointF7 = new PointF(fNextDouble3, fNextDouble4);
                        pointF4 = new PointF(fNextDouble5, fNextDouble6);
                        abstractC4737c.endObject();
                        pointF3 = pointF7;
                    } else {
                        pointFM9611b7 = AbstractC3316o.m9611b(abstractC4737c, f13);
                        pointF4 = pointF6;
                    }
                    z15 = z16;
                    objMo9604a3 = obj3;
                    c37199o3 = c37199o;
                    break;
                case 4:
                    boolean z17 = z15;
                    if (abstractC4737c.mo14822i() == 3) {
                        abstractC4737c.beginObject();
                        float fNextDouble7 = 0.0f;
                        float fNextDouble8 = 0.0f;
                        float fNextDouble9 = 0.0f;
                        float fNextDouble10 = 0.0f;
                        while (abstractC4737c.hasNext()) {
                            Object obj4 = objMo9604a3;
                            int iMo14824m3 = abstractC4737c.mo14824m(c37199o5);
                            if (iMo14824m3 != 0) {
                                c37199o2 = c37199o3;
                                if (iMo14824m3 != 1) {
                                    abstractC4737c.skipValue();
                                } else if (abstractC4737c.mo14822i() == 7) {
                                    fNextDouble10 = (float) abstractC4737c.nextDouble();
                                    pointF4 = pointF4;
                                    fNextDouble8 = fNextDouble10;
                                } else {
                                    pointF = pointF4;
                                    abstractC4737c.beginArray();
                                    fNextDouble8 = (float) abstractC4737c.nextDouble();
                                    fNextDouble10 = abstractC4737c.mo14822i() == 7 ? (float) abstractC4737c.nextDouble() : fNextDouble8;
                                    abstractC4737c.endArray();
                                    pointF4 = pointF;
                                }
                            } else {
                                c37199o2 = c37199o3;
                                pointF = pointF4;
                                if (abstractC4737c.mo14822i() == 7) {
                                    fNextDouble9 = (float) abstractC4737c.nextDouble();
                                    pointF4 = pointF;
                                    fNextDouble7 = fNextDouble9;
                                } else {
                                    abstractC4737c.beginArray();
                                    fNextDouble7 = (float) abstractC4737c.nextDouble();
                                    fNextDouble9 = abstractC4737c.mo14822i() == 7 ? (float) abstractC4737c.nextDouble() : fNextDouble7;
                                    abstractC4737c.endArray();
                                    pointF4 = pointF;
                                }
                            }
                            objMo9604a3 = obj4;
                            c37199o3 = c37199o2;
                        }
                        c37199o = c37199o3;
                        PointF pointF8 = new PointF(fNextDouble7, fNextDouble8);
                        pointF2 = new PointF(fNextDouble9, fNextDouble10);
                        abstractC4737c.endObject();
                        pointF5 = pointF8;
                    } else {
                        c37199o = c37199o3;
                        pointFM9611b8 = AbstractC3316o.m9611b(abstractC4737c, f13);
                    }
                    z15 = z17;
                    c37199o3 = c37199o;
                    break;
                case 5:
                    z15 = abstractC4737c.nextInt() == 1;
                    linearInterpolator = linearInterpolator;
                    break;
                case 6:
                    pointFM9611b5 = AbstractC3316o.m9611b(abstractC4737c, f13);
                    linearInterpolator = linearInterpolator;
                    break;
                case 7:
                    pointFM9611b6 = AbstractC3316o.m9611b(abstractC4737c, f13);
                    linearInterpolator = linearInterpolator;
                    break;
                default:
                    abstractC4737c.skipValue();
                    linearInterpolator = linearInterpolator;
                    break;
            }
        }
        BaseInterpolator baseInterpolatorM9614a4 = linearInterpolator;
        boolean z18 = z15;
        Object obj5 = objMo9604a3;
        PointF pointF9 = pointF4;
        abstractC4737c.endObject();
        if (z18) {
            obj2 = obj5;
        } else {
            if (pointFM9611b7 == null || pointFM9611b8 == null) {
                if (pointF3 != null && pointF9 != null && pointF5 != null && pointF2 != null) {
                    baseInterpolatorM9614a2 = m9614a(pointF3, pointF5);
                    baseInterpolatorM9614a3 = m9614a(pointF9, pointF2);
                    obj2 = objMo9604a4;
                    baseInterpolatorM9614a4 = null;
                }
                if (baseInterpolatorM9614a2 != null || baseInterpolatorM9614a3 == null) {
                    c13224a = new C13224a(c30387i, obj5, obj2, baseInterpolatorM9614a4, fNextDouble2, (Float) null);
                } else {
                    c13224a = new C13224a(c30387i, obj5, obj2, baseInterpolatorM9614a2, baseInterpolatorM9614a3, fNextDouble2);
                }
                c13224a.f45829o = pointFM9611b5;
                c13224a.f45830p = pointFM9611b6;
                return c13224a;
            }
            baseInterpolatorM9614a4 = m9614a(pointFM9611b7, pointFM9611b8);
            obj2 = objMo9604a4;
        }
        baseInterpolatorM9614a2 = null;
        baseInterpolatorM9614a3 = null;
        if (baseInterpolatorM9614a2 != null) {
            c13224a = new C13224a(c30387i, obj5, obj2, baseInterpolatorM9614a4, fNextDouble2, (Float) null);
        } else {
            c13224a = new C13224a(c30387i, obj5, obj2, baseInterpolatorM9614a4, fNextDouble2, (Float) null);
        }
        c13224a.f45829o = pointFM9611b5;
        c13224a.f45830p = pointFM9611b6;
        return c13224a;
    }
}
