package bj;

import android.graphics.Color;
import android.graphics.PointF;
import p031b9.AbstractC2875y;
import p049cj.AbstractC4737c;
import p119ej.C13226c;

/* JADX INFO: renamed from: bj.f */
/* JADX INFO: loaded from: classes.dex */
public final class C3307f implements InterfaceC3306e0 {

    /* JADX INFO: renamed from: b */
    public static final C3307f f12868b = new C3307f(0);

    /* JADX INFO: renamed from: c */
    public static final C3307f f12869c = new C3307f(1);

    /* JADX INFO: renamed from: d */
    public static final C3307f f12870d = new C3307f(2);

    /* JADX INFO: renamed from: e */
    public static final C3307f f12871e = new C3307f(3);

    /* JADX INFO: renamed from: f */
    public static final C3307f f12872f = new C3307f(4);

    /* JADX INFO: renamed from: g */
    public static final C3307f f12873g = new C3307f(5);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12874a;

    public /* synthetic */ C3307f(int i13) {
        this.f12874a = i13;
    }

    @Override // bj.InterfaceC3306e0
    /* JADX INFO: renamed from: a */
    public final Object mo9604a(AbstractC4737c abstractC4737c, float f13) {
        switch (this.f12874a) {
            case 0:
                boolean z4 = abstractC4737c.mo14822i() == 1;
                if (z4) {
                    abstractC4737c.beginArray();
                }
                double dNextDouble = abstractC4737c.nextDouble();
                double dNextDouble2 = abstractC4737c.nextDouble();
                double dNextDouble3 = abstractC4737c.nextDouble();
                double dNextDouble4 = abstractC4737c.mo14822i() == 7 ? abstractC4737c.nextDouble() : 1.0d;
                if (z4) {
                    abstractC4737c.endArray();
                }
                if (dNextDouble <= 1.0d && dNextDouble2 <= 1.0d && dNextDouble3 <= 1.0d) {
                    dNextDouble *= 255.0d;
                    dNextDouble2 *= 255.0d;
                    dNextDouble3 *= 255.0d;
                    if (dNextDouble4 <= 1.0d) {
                        dNextDouble4 *= 255.0d;
                    }
                }
                return Integer.valueOf(Color.argb((int) dNextDouble4, (int) dNextDouble, (int) dNextDouble2, (int) dNextDouble3));
            case 1:
                return Float.valueOf(AbstractC3316o.m9613d(abstractC4737c) * f13);
            case 2:
                return Integer.valueOf(Math.round(AbstractC3316o.m9613d(abstractC4737c) * f13));
            case 3:
                return AbstractC3316o.m9611b(abstractC4737c, f13);
            case 4:
                int iMo14822i = abstractC4737c.mo14822i();
                if (iMo14822i != 1 && iMo14822i != 3) {
                    if (iMo14822i != 7) {
                        throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(AbstractC2875y.m8287C(iMo14822i)));
                    }
                    PointF pointF = new PointF(((float) abstractC4737c.nextDouble()) * f13, ((float) abstractC4737c.nextDouble()) * f13);
                    while (abstractC4737c.hasNext()) {
                        abstractC4737c.skipValue();
                    }
                    return pointF;
                }
                return AbstractC3316o.m9611b(abstractC4737c, f13);
            default:
                boolean z13 = abstractC4737c.mo14822i() == 1;
                if (z13) {
                    abstractC4737c.beginArray();
                }
                float fNextDouble = (float) abstractC4737c.nextDouble();
                float fNextDouble2 = (float) abstractC4737c.nextDouble();
                while (abstractC4737c.hasNext()) {
                    abstractC4737c.skipValue();
                }
                if (z13) {
                    abstractC4737c.endArray();
                }
                return new C13226c((fNextDouble / 100.0f) * f13, (fNextDouble2 / 100.0f) * f13);
        }
    }
}
