package z71;

import hg3.AbstractC17269i;
import i91.AbstractC18254h;
import i91.C18251e;
import i91.C18253g;
import p208i2.AbstractC17897m;
import p208i2.C17891j;
import p208i2.InterfaceC17910s0;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z71.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\r\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000b\u001a3\u0010\u0014\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lk2/e;", "", "overlayStrokeInPx", "Li2/s0;", "a", "(Lk2/e;F)Li2/s0;", "Li91/h;", "background", "meterCanvasPx", "Ll83/a0;", "d", "(Lk2/e;Li91/h;FF)V", "borderStrokePx", "c", "Lk2/i;", "stroke", "Lh2/e;", "size", "Lh2/b;", "topLeft", "b", "(Lk2/e;Li91/h;Lk2/i;JJ)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40146e {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC17910s0 m128732a(InterfaceC22131e interfaceC22131e, float f13) {
        AbstractC22676k.m65750j(interfaceC22131e, "<this>");
        C17891j c17891jM51478a = AbstractC17897m.m51478a();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32));
        c17891jM51478a.m51458e(AbstractC17269i.m48894h(jFloatToRawIntBits, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC22131e.mo731d() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), 0.0f, 220.0f);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32)) / 2.0f;
        double d3 = fIntBitsToFloat2;
        double dCos = Math.cos(3.839724354387525d) * d3;
        double dSin = Math.sin(3.839724354387525d) * d3;
        double d14 = fIntBitsToFloat2 - f13;
        double dCos2 = Math.cos(3.839724354387525d) * d14;
        double dSin2 = Math.sin(3.839724354387525d) * d14;
        double d15 = 2;
        float f14 = 2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32)) / f14;
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (interfaceC22131e.mo731d() & 4294967295L)) / f14) + ((float) ((dSin + dSin2) / d15)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3 + ((float) ((dCos + dCos2) / d15))) << 32);
        float f15 = f13 / f14;
        c17891jM51478a.m51458e(AbstractC17269i.m48895i(f15, jFloatToRawIntBits2), 220.0f, 180.0f);
        float f16 = f13 + 0.0f;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f16)) & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32)) - f13;
        c17891jM51478a.m51458e(AbstractC17269i.m48894h(jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC22131e.mo731d() & 4294967295L)) - f13)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat4) << 32)), 220.0f, -220.0f);
        c17891jM51478a.m51458e(AbstractC17269i.m48895i(f15, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32)) - f15)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC22131e.mo731d() & 4294967295L)) / f14)) & 4294967295L)), 180.0f, 180.0f);
        return c17891jM51478a;
    }

    /* JADX INFO: renamed from: b */
    private static final void m128733b(InterfaceC22131e interfaceC22131e, AbstractC18254h abstractC18254h, C22135i c22135i, long j7, long j13) {
        if (abstractC18254h instanceof C18251e) {
            InterfaceC22131e.m63381X(interfaceC22131e, ((C18251e) abstractC18254h).getBrush(), 0.0f, 360.0f, false, j13, j7, c22135i, 0, 832);
        } else {
            if (!(abstractC18254h instanceof C18253g)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC22131e.m63380P(interfaceC22131e, ((C18253g) abstractC18254h).getColor(), 0.0f, 360.0f, j13, j7, 0.0f, c22135i, 832);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m128734c(InterfaceC22131e interfaceC22131e, AbstractC18254h background, float f13, float f14) {
        AbstractC22676k.m65750j(interfaceC22131e, "<this>");
        AbstractC22676k.m65750j(background, "background");
        float f15 = f14 - f13;
        float f16 = f13 / 2.0f;
        m128733b(interfaceC22131e, background, new C22135i(f13, 0.0f, 0, 0, null, 30), (((long) Float.floatToRawIntBits(f15)) & 4294967295L) | (Float.floatToRawIntBits(f15) << 32), (((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f16)) & 4294967295L));
    }

    /* JADX INFO: renamed from: d */
    public static final void m128735d(InterfaceC22131e interfaceC22131e, AbstractC18254h background, float f13, float f14) {
        AbstractC22676k.m65750j(interfaceC22131e, "<this>");
        AbstractC22676k.m65750j(background, "background");
        float f15 = f14 - f13;
        float f16 = f13 / 2.0f;
        m128733b(interfaceC22131e, background, new C22135i(f13, 0.0f, 0, 0, null, 30), (((long) Float.floatToRawIntBits(f15)) & 4294967295L) | (Float.floatToRawIntBits(f15) << 32), (((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f16)) & 4294967295L));
    }
}
