package bj;

import android.graphics.PointF;
import p049cj.AbstractC4737c;
import p108e4.AbstractC12682p;
import p581we.C37199o;
import p584wi.C37302b;

/* JADX INFO: renamed from: bj.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C3309h implements InterfaceC3306e0 {

    /* JADX INFO: renamed from: a */
    public static final C3309h f12876a = new C3309h();

    /* JADX INFO: renamed from: b */
    public static final C37199o f12877b = C37199o.m119195L("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // bj.InterfaceC3306e0
    /* JADX INFO: renamed from: a */
    public final Object mo9604a(AbstractC4737c abstractC4737c, float f13) {
        abstractC4737c.beginObject();
        String strNextString = null;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        int iNextInt = 0;
        int iM9610a = 0;
        int iM9610a2 = 0;
        boolean zMo14821h = true;
        int i13 = 3;
        String strNextString2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (abstractC4737c.hasNext()) {
            switch (abstractC4737c.mo14824m(f12877b)) {
                case 0:
                    strNextString = abstractC4737c.nextString();
                    break;
                case 1:
                    strNextString2 = abstractC4737c.nextString();
                    break;
                case 2:
                    fNextDouble = (float) abstractC4737c.nextDouble();
                    pointF = pointF;
                    break;
                case 3:
                    PointF pointF3 = pointF;
                    int iNextInt2 = abstractC4737c.nextInt();
                    i13 = (iNextInt2 > 2 || iNextInt2 < 0) ? 3 : AbstractC12682p.m35486f(3)[iNextInt2];
                    pointF = pointF3;
                    pointF2 = pointF2;
                    break;
                case 4:
                    iNextInt = abstractC4737c.nextInt();
                    break;
                case 5:
                    fNextDouble2 = (float) abstractC4737c.nextDouble();
                    pointF = pointF;
                    break;
                case 6:
                    fNextDouble3 = (float) abstractC4737c.nextDouble();
                    pointF = pointF;
                    break;
                case 7:
                    iM9610a = AbstractC3316o.m9610a(abstractC4737c);
                    break;
                case 8:
                    iM9610a2 = AbstractC3316o.m9610a(abstractC4737c);
                    break;
                case 9:
                    fNextDouble4 = (float) abstractC4737c.nextDouble();
                    pointF = pointF;
                    break;
                case 10:
                    zMo14821h = abstractC4737c.mo14821h();
                    break;
                case 11:
                    abstractC4737c.beginArray();
                    PointF pointF4 = new PointF(((float) abstractC4737c.nextDouble()) * f13, ((float) abstractC4737c.nextDouble()) * f13);
                    abstractC4737c.endArray();
                    pointF = pointF4;
                    pointF2 = pointF2;
                    break;
                case 12:
                    abstractC4737c.beginArray();
                    pointF2 = new PointF(((float) abstractC4737c.nextDouble()) * f13, ((float) abstractC4737c.nextDouble()) * f13);
                    abstractC4737c.endArray();
                    pointF = pointF;
                    break;
                default:
                    abstractC4737c.mo14825s();
                    abstractC4737c.skipValue();
                    break;
            }
        }
        abstractC4737c.endObject();
        C37302b c37302b = new C37302b();
        c37302b.f159495a = strNextString;
        c37302b.f159496b = strNextString2;
        c37302b.f159497c = fNextDouble;
        c37302b.f159498d = i13;
        c37302b.f159499e = iNextInt;
        c37302b.f159500f = fNextDouble2;
        c37302b.f159501g = fNextDouble3;
        c37302b.f159502h = iM9610a;
        c37302b.f159503i = iM9610a2;
        c37302b.f159504j = fNextDouble4;
        c37302b.f159505k = zMo14821h;
        c37302b.f159506l = pointF;
        c37302b.f159507m = pointF2;
        return c37302b;
    }
}
