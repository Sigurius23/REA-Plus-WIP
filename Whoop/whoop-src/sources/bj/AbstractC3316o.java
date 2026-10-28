package bj;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import p031b9.AbstractC2875y;
import p049cj.AbstractC4737c;
import p108e4.AbstractC12682p;
import p581we.C37199o;

/* JADX INFO: renamed from: bj.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3316o {

    /* JADX INFO: renamed from: a */
    public static final C37199o f12894a = C37199o.m119195L("x", "y");

    /* JADX INFO: renamed from: a */
    public static int m9610a(AbstractC4737c abstractC4737c) {
        abstractC4737c.beginArray();
        int iNextDouble = (int) (abstractC4737c.nextDouble() * 255.0d);
        int iNextDouble2 = (int) (abstractC4737c.nextDouble() * 255.0d);
        int iNextDouble3 = (int) (abstractC4737c.nextDouble() * 255.0d);
        while (abstractC4737c.hasNext()) {
            abstractC4737c.skipValue();
        }
        abstractC4737c.endArray();
        return Color.argb(255, iNextDouble, iNextDouble2, iNextDouble3);
    }

    /* JADX INFO: renamed from: b */
    public static PointF m9611b(AbstractC4737c abstractC4737c, float f13) {
        int iM35485e = AbstractC12682p.m35485e(abstractC4737c.mo14822i());
        if (iM35485e == 0) {
            abstractC4737c.beginArray();
            float fNextDouble = (float) abstractC4737c.nextDouble();
            float fNextDouble2 = (float) abstractC4737c.nextDouble();
            while (abstractC4737c.mo14822i() != 2) {
                abstractC4737c.skipValue();
            }
            abstractC4737c.endArray();
            return new PointF(fNextDouble * f13, fNextDouble2 * f13);
        }
        if (iM35485e != 2) {
            if (iM35485e != 6) {
                throw new IllegalArgumentException("Unknown point starts with ".concat(AbstractC2875y.m8287C(abstractC4737c.mo14822i())));
            }
            float fNextDouble3 = (float) abstractC4737c.nextDouble();
            float fNextDouble4 = (float) abstractC4737c.nextDouble();
            while (abstractC4737c.hasNext()) {
                abstractC4737c.skipValue();
            }
            return new PointF(fNextDouble3 * f13, fNextDouble4 * f13);
        }
        abstractC4737c.beginObject();
        float fM9613d = 0.0f;
        float fM9613d2 = 0.0f;
        while (abstractC4737c.hasNext()) {
            int iMo14824m = abstractC4737c.mo14824m(f12894a);
            if (iMo14824m == 0) {
                fM9613d = m9613d(abstractC4737c);
            } else if (iMo14824m != 1) {
                abstractC4737c.mo14825s();
                abstractC4737c.skipValue();
            } else {
                fM9613d2 = m9613d(abstractC4737c);
            }
        }
        abstractC4737c.endObject();
        return new PointF(fM9613d * f13, fM9613d2 * f13);
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList m9612c(AbstractC4737c abstractC4737c, float f13) {
        ArrayList arrayList = new ArrayList();
        abstractC4737c.beginArray();
        while (abstractC4737c.mo14822i() == 1) {
            abstractC4737c.beginArray();
            arrayList.add(m9611b(abstractC4737c, f13));
            abstractC4737c.endArray();
        }
        abstractC4737c.endArray();
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static float m9613d(AbstractC4737c abstractC4737c) {
        int iMo14822i = abstractC4737c.mo14822i();
        int iM35485e = AbstractC12682p.m35485e(iMo14822i);
        if (iM35485e != 0) {
            if (iM35485e == 6) {
                return (float) abstractC4737c.nextDouble();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(AbstractC2875y.m8287C(iMo14822i)));
        }
        abstractC4737c.beginArray();
        float fNextDouble = (float) abstractC4737c.nextDouble();
        while (abstractC4737c.hasNext()) {
            abstractC4737c.skipValue();
        }
        abstractC4737c.endArray();
        return fNextDouble;
    }
}
