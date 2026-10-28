package sq2;

import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import ej1.C13256s;
import hg3.AbstractC17269i;
import hr2.C17584d;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p181h2.C16618c;
import p208i2.AbstractC17897m;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17887h;
import p208i2.C17891j;
import p208i2.C17909s;
import p208i2.C17919x;
import p208i2.InterfaceC17910s0;
import p208i2.InterfaceC17915v;
import p270k2.C22134h;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: sq2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a%\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001aK\u0010\u001a\u001a\u00020\u0005*\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001aO\u0010!\u001a\u00020 2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010\"\u001a3\u0010%\u001a\u00020\u0005*\u00020#2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020 H\u0002¢\u0006\u0004\b%\u0010&\u001a\u001b\u0010(\u001a\u00020\u0005*\u00020\u00132\u0006\u0010'\u001a\u00020#H\u0002¢\u0006\u0004\b(\u0010)\u001aC\u0010*\u001a\u00020\u0005*\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b*\u0010+\u001a]\u0010-\u001a\u00020\u0005*\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010,\u001a\u00020\u001dH\u0002¢\u0006\u0004\b-\u0010.¨\u0006/"}, m65681d2 = {"", "Lsq2/b;", "statItems", "Li2/x;", "backgroundColor", "Ll83/a0;", "c", "(Ljava/util/List;JLandroidx/compose/runtime/Composer;I)V", "Lsq2/i;", "f", "(Ljava/util/List;)Ljava/util/List;", "color", "Lh2/b;", "center", "", "outerRadius", "Li2/t;", "l", "(JJF)Li2/t;", "Lk2/e;", "innerRadius", "", "startAngle", "sliceAngle", "gradientBrush", "lineWidth", "m", "(Lk2/e;JFFDDLi2/t;F)V", "endAngle", "", "isFirstSlice", "isLastSlice", "Lsq2/h;", "k", "(JFFDDFZZ)Lsq2/h;", "Li2/s0;", "geometry", "g", "(Li2/s0;JFFLsq2/h;)V", "maskPath", "r", "(Lk2/e;Li2/s0;)V", "n", "(Lk2/e;JFFDDF)V", "debugCorners", "s", "(Lk2/e;JFFDDJZZZ)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32884a {
    /* JADX INFO: renamed from: c */
    public static final void m103221c(List<C32885b> statItems, long j7, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(statItems, "statItems");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1771922781);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(statItems) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9116y, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3384f(c2314t, false, 1.0f));
            boolean zM87157i = c28655q.m87157i(statItems);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C13256s(statItems, 4);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21478l0.m60421a(modifierM3409f2, (Function1) objM87133R, c28655q, 6);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17584d(statItems, j7, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m103222d(List list, InterfaceC22131e interfaceC22131e) {
        InterfaceC22131e Canvas = interfaceC22131e;
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        float f13 = 2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)) / f13)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() >> 32)) - 3.0f)) << 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & Canvas.mo731d())) / f13;
        float f14 = fIntBitsToFloat * 0.61f;
        float f15 = 1.0f * fIntBitsToFloat;
        List<C32892i> listM103224f = m103224f(AbstractC25265s.m74143q0(list));
        int i13 = 0;
        for (Object obj : listM103224f) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            C32892i c32892i = (C32892i) obj;
            double dM103287c = c32892i.getStartAngle();
            double dM103286b = c32892i.getEndAngle();
            long jM103285a = c32892i.getColor();
            boolean z4 = true;
            boolean z13 = i13 == 0;
            if (i13 != AbstractC37056f.m118951C(listM103224f)) {
                z4 = false;
            }
            m103238t(Canvas, jFloatToRawIntBits, f15, f14, dM103287c, dM103286b, jM103285a, z13, z4, false, 256, null);
            Canvas = interfaceC22131e;
            i13 = i14;
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m103223e(List list, long j7, int i13, Composer composer, int i14) {
        m103221c(list, j7, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    private static final List<C32892i> m103224f(List<C32885b> list) {
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            List<C32885b> list2 = list;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            for (C32885b c32885b : list2) {
                float fillPercentage = c32885b.getFillPercentage();
                arrayList2.add(C32885b.m103239b(c32885b, 0L, fillPercentage < 0.02f ? 0.02f : fillPercentage, false, null, null, 29, null));
            }
            Iterator it = arrayList2.iterator();
            double fillPercentage2 = 0.0d;
            while (it.hasNext()) {
                fillPercentage2 += (double) ((C32885b) it.next()).getFillPercentage();
            }
            int size = arrayList2.size() - 1;
            int i13 = 0;
            if (size < 0) {
                size = 0;
            }
            double d3 = 180.0d - (((double) size) * 1.5d);
            double d14 = 90.0d;
            for (Object obj : arrayList2) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C32885b c32885b2 = (C32885b) obj;
                if (i13 > 0) {
                    d14 += 1.5d;
                }
                double d15 = d14;
                double fillPercentage3 = ((((double) c32885b2.getFillPercentage()) / fillPercentage2) * d3) + d15;
                arrayList.add(new C32892i(d15, fillPercentage3, c32885b2.getColor(), c32885b2.getIsPrimary(), null));
                i13 = i14;
                d14 = fillPercentage3;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    private static final void m103225g(InterfaceC17910s0 interfaceC17910s0, long j7, float f13, float f14, C32891h c32891h) {
        if (c32891h.getSweepAngle() <= 0.01d) {
            return;
        }
        long jM103278i = c32891h.getInnerArcStart();
        C17891j c17891j = (C17891j) interfaceC17910s0;
        c17891j.m51462i(Float.intBitsToFloat((int) (jM103278i >> 32)), Float.intBitsToFloat((int) (jM103278i & 4294967295L)));
        m103226h(c17891j, c32891h.getStartInner(), m103228j(c32891h.getStartInner(), c32891h.getStartAngleRad(), c32891h.getCornerRadius(), false, 8, null));
        long jM103228j = m103228j(c32891h.getStartOuter(), c32891h.getStartAngleRad(), -c32891h.getCornerRadius(), false, 8, null);
        c17891j.m51461h(Float.intBitsToFloat((int) (jM103228j >> 32)), Float.intBitsToFloat((int) (jM103228j & 4294967295L)));
        m103226h(c17891j, c32891h.getStartOuter(), c32891h.getOuterArcStart());
        double dM103284o = (c32891h.getSweepAngle() - ((double) c32891h.getOuterArcAdjustment())) - ((double) c32891h.getOuterArcAdjustment());
        if (dM103284o > 0.0d) {
            c17891j.m51458e(AbstractC17269i.m48895i(f13, j7), (float) c32891h.getAdjustedOuterStartAngle(), (float) dM103284o);
        }
        m103226h(c17891j, c32891h.getEndOuter(), m103228j(c32891h.getEndOuter(), c32891h.getEndAngleRad(), -c32891h.getCornerRadius(), false, 8, null));
        long jM103228j2 = m103228j(c32891h.getEndInner(), c32891h.getEndAngleRad(), c32891h.getCornerRadius(), false, 8, null);
        c17891j.m51461h(Float.intBitsToFloat((int) (jM103228j2 >> 32)), Float.intBitsToFloat((int) (jM103228j2 & 4294967295L)));
        m103226h(c17891j, c32891h.getEndInner(), c32891h.getInnerArcEnd());
        double d3 = -((c32891h.getSweepAngle() - ((double) c32891h.getInnerArcAdjustment())) - ((double) c32891h.getInnerArcAdjustment()));
        if (d3 < 0.0d) {
            c17891j.m51458e(AbstractC17269i.m48895i(f14, j7), (float) c32891h.getAdjustedInnerEndAngle(), (float) d3);
        }
        c17891j.m51459f();
    }

    /* JADX INFO: renamed from: h */
    private static final void m103226h(InterfaceC17910s0 interfaceC17910s0, long j7, long j13) {
        ((C17891j) interfaceC17910s0).f69587a.quadTo(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)), Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)));
    }

    /* JADX INFO: renamed from: i */
    private static final long m103227i(long j7, float f13, float f14, boolean z4) {
        if (z4) {
            f13 -= 1.5707964f;
        }
        double d3 = f13;
        return (((long) Float.floatToRawIntBits((((float) Math.cos(d3)) * f14) + Float.intBitsToFloat((int) (j7 >> 32)))) << 32) | (((long) Float.floatToRawIntBits((f14 * ((float) Math.sin(d3))) + Float.intBitsToFloat((int) (j7 & 4294967295L)))) & 4294967295L);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ long m103228j(long j7, float f13, float f14, boolean z4, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            z4 = false;
        }
        return m103227i(j7, f13, f14, z4);
    }

    /* JADX INFO: renamed from: k */
    private static final C32891h m103229k(long j7, float f13, float f14, double d3, double d14, float f15, boolean z4, boolean z13) {
        double d15 = d14 - d3;
        float f16 = f15 / 8.0f;
        float radians = (float) Math.toRadians(d3);
        float radians2 = (float) Math.toRadians(d14);
        double d16 = radians;
        float fCos = (float) Math.cos(d16);
        float fSin = (float) Math.sin(d16);
        double d17 = radians2;
        float fCos2 = (float) Math.cos(d17);
        float fSin2 = (float) Math.sin(d17);
        int i13 = (int) (j7 >> 32);
        int i14 = (int) (j7 & 4294967295L);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((f13 * fSin) + Float.intBitsToFloat(i14))) & 4294967295L) | (((long) Float.floatToRawIntBits((f13 * fCos) + Float.intBitsToFloat(i13))) << 32);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits((f14 * fSin) + Float.intBitsToFloat(i14))) & 4294967295L) | (((long) Float.floatToRawIntBits((f14 * fCos) + Float.intBitsToFloat(i13))) << 32);
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits((f13 * fSin2) + Float.intBitsToFloat(i14))) & 4294967295L) | (((long) Float.floatToRawIntBits((f13 * fCos2) + Float.intBitsToFloat(i13))) << 32);
        long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits((f14 * fCos2) + Float.intBitsToFloat(i13))) << 32) | (((long) Float.floatToRawIntBits((f14 * fSin2) + Float.intBitsToFloat(i14))) & 4294967295L);
        float f17 = ((z4 || z13) && z4 && z13) ? 0.0f : (f16 / f13) * 57.295776f * 1.2f;
        float f18 = ((z4 || z13) && z4 && z13) ? 0.0f : (f16 / f14) * 57.295776f * 1.2f;
        double d18 = d3 + ((double) f17);
        double d19 = f18;
        double d24 = d3 + d19;
        double d25 = d14 - d19;
        float f19 = f18;
        float radians3 = (float) Math.toRadians(d18);
        float radians4 = (float) Math.toRadians(d24);
        float radians5 = (float) Math.toRadians(d25);
        double d26 = radians3;
        long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits((((float) Math.cos(d26)) * f13) + Float.intBitsToFloat(i13))) << 32) | (((long) Float.floatToRawIntBits((((float) Math.sin(d26)) * f13) + Float.intBitsToFloat(i14))) & 4294967295L);
        double d27 = radians4;
        double d28 = radians5;
        return new C32891h(d15, f16, radians, radians2, fCos, fSin, fCos2, fSin2, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, jFloatToRawIntBits4, f17, f19, d18, d24, d25, radians3, radians4, radians5, jFloatToRawIntBits5, (((long) Float.floatToRawIntBits((((float) Math.cos(d27)) * f14) + Float.intBitsToFloat(i13))) << 32) | (((long) Float.floatToRawIntBits((((float) Math.sin(d27)) * f14) + Float.intBitsToFloat(i14))) & 4294967295L), (((long) Float.floatToRawIntBits((((float) Math.cos(d28)) * f14) + Float.intBitsToFloat(i13))) << 32) | (((long) Float.floatToRawIntBits((((float) Math.sin(d28)) * f14) + Float.intBitsToFloat(i14))) & 4294967295L), null);
    }

    /* JADX INFO: renamed from: l */
    private static final AbstractC17911t m103230l(long j7, long j13, float f13) {
        return C17909s.m51490h(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.m51541c(0.2f, j7))), new C23465k(Float.valueOf(1.0f), new C17919x(j7))}, j13, f13, 8);
    }

    /* JADX INFO: renamed from: m */
    private static final void m103231m(InterfaceC22131e interfaceC22131e, long j7, float f13, float f14, double d3, double d14, AbstractC17911t abstractC17911t, float f15) {
        C17891j c17891jM51478a = AbstractC17897m.m51478a();
        C16618c c16618cM48895i = AbstractC17269i.m48895i((f13 + f14) / 2.0f, j7);
        float f16 = (float) d3;
        float f17 = (float) d14;
        C17891j.m51456n(c16618cM48895i);
        if (c17891jM51478a.f69588b == null) {
            c17891jM51478a.f69588b = new RectF();
        }
        RectF rectF = c17891jM51478a.f69588b;
        AbstractC22676k.m65747g(rectF);
        rectF.set(c16618cM48895i.f63939a, c16618cM48895i.f63940b, c16618cM48895i.f63941c, c16618cM48895i.f63942d);
        Path path = c17891jM51478a.f69587a;
        RectF rectF2 = c17891jM51478a.f69588b;
        AbstractC22676k.m65747g(rectF2);
        path.addArc(rectF2, f16, f17);
        InterfaceC22131e.m63378L(interfaceC22131e, c17891jM51478a, abstractC17911t, 0.0f, new C22135i(f15, 0.0f, 0, 1, null, 18), 52);
    }

    /* JADX INFO: renamed from: n */
    private static final void m103232n(InterfaceC22131e interfaceC22131e, long j7, float f13, float f14, double d3, double d14, float f15) {
        float f16 = f15 / 8.0f;
        float radians = (float) Math.toRadians(d3);
        float radians2 = (float) Math.toRadians(d14);
        double d15 = radians;
        float fCos = (float) Math.cos(d15);
        float fSin = (float) Math.sin(d15);
        double d16 = radians2;
        float fCos2 = (float) Math.cos(d16);
        float fSin2 = (float) Math.sin(d16);
        int i13 = (int) (j7 >> 32);
        int i14 = (int) (j7 & 4294967295L);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((f13 * fCos) + Float.intBitsToFloat(i13))) << 32) | (((long) Float.floatToRawIntBits((f13 * fSin) + Float.intBitsToFloat(i14))) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits((fCos * f14) + Float.intBitsToFloat(i13))) << 32) | (((long) Float.floatToRawIntBits((fSin * f14) + Float.intBitsToFloat(i14))) & 4294967295L);
        float fIntBitsToFloat = (f13 * fCos2) + Float.intBitsToFloat(i13);
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits((f13 * fSin2) + Float.intBitsToFloat(i14))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits((fCos2 * f14) + Float.intBitsToFloat(i13))) << 32) | (((long) Float.floatToRawIntBits((fSin2 * f14) + Float.intBitsToFloat(i14))) & 4294967295L);
        double d17 = (f16 / f13) * 57.295776f * 1.2f;
        double d18 = (f16 / f14) * 57.295776f * 1.2f;
        float radians3 = (float) Math.toRadians(d3 + d17);
        float radians4 = (float) Math.toRadians(d3 + d18);
        double d19 = radians3;
        long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits((((float) Math.cos(d19)) * f13) + Float.intBitsToFloat(i13))) << 32) | (((long) Float.floatToRawIntBits((((float) Math.sin(d19)) * f13) + Float.intBitsToFloat(i14))) & 4294967295L);
        double d24 = radians4;
        long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits((((float) Math.cos(d24)) * f14) + Float.intBitsToFloat(i13))) << 32) | (((long) Float.floatToRawIntBits((((float) Math.sin(d24)) * f14) + Float.intBitsToFloat(i14))) & 4294967295L);
        float radians5 = (float) Math.toRadians(d14 - d17);
        float radians6 = (float) Math.toRadians(d14 - d18);
        double d25 = radians5;
        float fCos3 = (((float) Math.cos(d25)) * f13) + Float.intBitsToFloat(i13);
        long jFloatToRawIntBits7 = (((long) Float.floatToRawIntBits((((float) Math.sin(d25)) * f13) + Float.intBitsToFloat(i14))) & 4294967295L) | (Float.floatToRawIntBits(fCos3) << 32);
        double d26 = radians6;
        long jFloatToRawIntBits8 = (((long) Float.floatToRawIntBits((((float) Math.cos(d26)) * f14) + Float.intBitsToFloat(i13))) << 32) | (((long) Float.floatToRawIntBits((((float) Math.sin(d26)) * f14) + Float.intBitsToFloat(i14))) & 4294967295L);
        long jM103235q = m103235q(jFloatToRawIntBits2, radians, f16, false, 8, null);
        int i15 = C17919x.f69638o;
        m103233o(interfaceC22131e, jFloatToRawIntBits6, jFloatToRawIntBits2, jM103235q, C17919x.f69634k);
        float f17 = -f16;
        m103233o(interfaceC22131e, m103235q(jFloatToRawIntBits, radians, f17, false, 8, null), jFloatToRawIntBits, jFloatToRawIntBits5, C17919x.f69635l);
        m103233o(interfaceC22131e, jFloatToRawIntBits7, jFloatToRawIntBits3, m103235q(jFloatToRawIntBits3, radians2, f17, false, 8, null), C17919x.f69633j);
        m103233o(interfaceC22131e, m103235q(jFloatToRawIntBits4, radians2, f16, false, 8, null), jFloatToRawIntBits4, jFloatToRawIntBits8, C17919x.f69631h);
    }

    /* JADX INFO: renamed from: o */
    private static final void m103233o(InterfaceC22131e interfaceC22131e, long j7, long j13, long j14, long j15) {
        C17891j c17891jM51478a = AbstractC17897m.m51478a();
        c17891jM51478a.m51462i(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)));
        c17891jM51478a.f69587a.quadTo(Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)), Float.intBitsToFloat((int) (j14 >> 32)), Float.intBitsToFloat((int) (j14 & 4294967295L)));
        InterfaceC22131e.m63386z(interfaceC22131e, c17891jM51478a, j15, 0.0f, new C22135i(4.0f, 0.0f, 0, 0, null, 30), 52);
    }

    /* JADX INFO: renamed from: p */
    private static final long m103234p(long j7, float f13, float f14, boolean z4) {
        if (z4) {
            f13 -= 1.5707964f;
        }
        double d3 = f13;
        return (((long) Float.floatToRawIntBits((((float) Math.cos(d3)) * f14) + Float.intBitsToFloat((int) (j7 >> 32)))) << 32) | (((long) Float.floatToRawIntBits((f14 * ((float) Math.sin(d3))) + Float.intBitsToFloat((int) (j7 & 4294967295L)))) & 4294967295L);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ long m103235q(long j7, float f13, float f14, boolean z4, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            z4 = false;
        }
        return m103234p(j7, f13, f14, z4);
    }

    /* JADX INFO: renamed from: r */
    private static final void m103236r(InterfaceC22131e interfaceC22131e, InterfaceC17910s0 interfaceC17910s0) {
        InterfaceC22131e.m63386z(interfaceC22131e, interfaceC17910s0, C17919x.f69629f, 0.0f, C22134h.f85857a, 52);
    }

    /* JADX INFO: renamed from: s */
    private static final void m103237s(InterfaceC22131e interfaceC22131e, long j7, float f13, float f14, double d3, double d14, long j13, boolean z4, boolean z13, boolean z14) {
        double d15 = d14 - d3;
        double d16 = d15 < 0.0d ? 0.0d : d15;
        float f15 = f13 - f14;
        AbstractC17911t abstractC17911tM103230l = m103230l(j13, j7, f13);
        C16618c c16618c = new C16618c(0.0f, 0.0f, Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32)), Float.intBitsToFloat((int) (interfaceC22131e.mo731d() & 4294967295L)));
        InterfaceC17915v interfaceC17915vM716w = interfaceC22131e.mo744t0().m716w();
        interfaceC17915vM716w.mo51425p(c16618c, AbstractC17918w0.m51522j());
        m103231m(interfaceC22131e, j7, f14, f13, d3, d16, abstractC17911tM103230l, f15);
        C17887h c17887hM51522j = AbstractC17918w0.m51522j();
        c17887hM51522j.m51446d(6);
        interfaceC17915vM716w.mo51425p(c16618c, c17887hM51522j);
        C32891h c32891hM103229k = m103229k(j7, f13, f14, d3, d14, f15, z4, z13);
        C17891j c17891jM51478a = AbstractC17897m.m51478a();
        m103225g(c17891jM51478a, j7, f13, f14, c32891hM103229k);
        m103236r(interfaceC22131e, c17891jM51478a);
        interfaceC17915vM716w.mo51417g();
        interfaceC17915vM716w.mo51417g();
        if (z14) {
            m103232n(interfaceC22131e, j7, f13, f14, d3, d14, f15);
        }
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m103238t(InterfaceC22131e interfaceC22131e, long j7, float f13, float f14, double d3, double d14, long j13, boolean z4, boolean z13, boolean z14, int i13, Object obj) {
        m103237s(interfaceC22131e, j7, f13, f14, d3, d14, j13, z4, z13, (i13 & 256) != 0 ? false : z14);
    }
}
