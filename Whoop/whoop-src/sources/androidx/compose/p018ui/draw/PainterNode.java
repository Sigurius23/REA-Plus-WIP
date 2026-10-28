package androidx.compose.p018ui.draw;

import m83.C25272z;
import p005a3.AbstractC0262w0;
import p005a3.C0238p0;
import p005a3.InterfaceC0186c0;
import p005a3.InterfaceC0245r;
import p014aj.C0929d;
import p026b2.AbstractC2316v;
import p026b2.InterfaceC2302h;
import p040c0.C3741g0;
import p181h2.C16620e;
import p208i2.AbstractC17921y;
import p270k2.C22128b;
import p331n2.AbstractC26165a;
import p635y2.AbstractC39104j1;
import p635y2.AbstractC39125q1;
import p635y2.InterfaceC39105k;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.AbstractC39170b;
import p636y3.C39169a;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Landroidx/compose/ui/draw/PainterNode;", "La3/c0;", "Lb2/v;", "La3/r;", "Ln2/a;", "painter", "Ln2/a;", "X0", "()Ln2/a;", "c1", "(Ln2/a;)V", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class PainterNode extends AbstractC2316v implements InterfaceC0186c0, InterfaceC0245r {

    /* JADX INFO: renamed from: O */
    public InterfaceC2302h f4782O;

    /* JADX INFO: renamed from: P */
    public InterfaceC39105k f4783P;

    /* JADX INFO: renamed from: Q */
    public float f4784Q;

    /* JADX INFO: renamed from: R */
    public AbstractC17921y f4785R;
    private AbstractC26165a painter;

    public PainterNode(AbstractC26165a abstractC26165a, InterfaceC2302h interfaceC2302h, InterfaceC39105k interfaceC39105k, float f13, AbstractC17921y abstractC17921y) {
        this.painter = abstractC26165a;
        this.f4782O = interfaceC2302h;
        this.f4783P = interfaceC39105k;
        this.f4784Q = f13;
        this.f4785R = abstractC17921y;
    }

    /* JADX INFO: renamed from: Z0 */
    public static boolean m3472Z0(long j7) {
        return !C16620e.m47210b(j7, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* JADX INFO: renamed from: a1 */
    public static boolean m3473a1(long j7) {
        return !C16620e.m47210b(j7, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: E */
    public final int mo433E(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        if (!m3475Y0()) {
            return interfaceC39124q0.mo449b(i13);
        }
        long jM3476b1 = m3476b1(AbstractC39170b.m124770b(i13, 0, 13));
        return Math.max(C39169a.m124766j(jM3476b1), interfaceC39124q0.mo449b(i13));
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: M0 */
    public final boolean mo3462M0() {
        return false;
    }

    @Override // p005a3.InterfaceC0245r
    /* JADX INFO: renamed from: O */
    public final void mo459O(C0238p0 c0238p0) {
        C22128b c22128b = c0238p0.f815w;
        long f4822h = this.painter.getF4822H();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(m3473a1(f4822h) ? Float.intBitsToFloat((int) (f4822h >> 32)) : Float.intBitsToFloat((int) (c22128b.mo731d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(m3472Z0(f4822h) ? Float.intBitsToFloat((int) (f4822h & 4294967295L)) : Float.intBitsToFloat((int) (c22128b.mo731d() & 4294967295L)))) & 4294967295L);
        long jM124663i = (Float.intBitsToFloat((int) (c22128b.mo731d() >> 32)) == 0.0f || Float.intBitsToFloat((int) (c22128b.mo731d() & 4294967295L)) == 0.0f) ? 0L : AbstractC39125q1.m124663i(jFloatToRawIntBits, this.f4783P.mo124615a(jFloatToRawIntBits, c22128b.mo731d()));
        long jMo7156a = this.f4782O.mo7156a((((long) Math.round(Float.intBitsToFloat((int) (jM124663i >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jM124663i & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (c22128b.mo731d() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (c22128b.mo731d() & 4294967295L)))) & 4294967295L), c0238p0.getLayoutDirection());
        float f13 = (int) (jMo7156a >> 32);
        float f14 = (int) (jMo7156a & 4294967295L);
        ((C0929d) c22128b.f85852x.f812x).m2339B(f13, f14);
        try {
            this.painter.m77712g(c0238p0, jM124663i, this.f4784Q, this.f4785R);
            ((C0929d) c22128b.f85852x.f812x).m2339B(-f13, -f14);
            c0238p0.m728a();
        } catch (Throwable th3) {
            ((C0929d) c22128b.f85852x.f812x).m2339B(-f13, -f14);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: X0, reason: from getter */
    public final AbstractC26165a getPainter() {
        return this.painter;
    }

    /* JADX INFO: renamed from: Y0 */
    public final boolean m3475Y0() {
        return this.painter.getF4822H() != 9205357640488583168L;
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC39130s0 mo434b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7) {
        AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0.mo448T(m3476b1(j7));
        return interfaceC39133t0.mo86822W(abstractC39104j1Mo448T.f168211w, abstractC39104j1Mo448T.f168212x, C25272z.f99163w, new C3741g0(abstractC39104j1Mo448T, 1));
    }

    /* JADX INFO: renamed from: b1 */
    public final long m3476b1(long j7) {
        boolean z4 = false;
        boolean z13 = C39169a.m124761e(j7) && C39169a.m124760d(j7);
        if (C39169a.m124763g(j7) && C39169a.m124762f(j7)) {
            z4 = true;
        }
        if ((!m3475Y0() && z13) || z4) {
            return C39169a.m124758b(j7, C39169a.m124765i(j7), 0, C39169a.m124764h(j7), 0, 10);
        }
        long f4822h = this.painter.getF4822H();
        int iRound = m3473a1(f4822h) ? Math.round(Float.intBitsToFloat((int) (f4822h >> 32))) : C39169a.m124767k(j7);
        int iRound2 = m3472Z0(f4822h) ? Math.round(Float.intBitsToFloat((int) (f4822h & 4294967295L))) : C39169a.m124766j(j7);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(AbstractC39170b.m124774f(iRound2, j7))) & 4294967295L) | (((long) Float.floatToRawIntBits(AbstractC39170b.m124775g(iRound, j7))) << 32);
        if (m3475Y0()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!m3473a1(this.painter.getF4822H()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.painter.getF4822H() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!m3472Z0(this.painter.getF4822H()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.painter.getF4822H() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : AbstractC39125q1.m124663i(jFloatToRawIntBits2, this.f4783P.mo124615a(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return C39169a.m124758b(j7, AbstractC39170b.m124775g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j7), 0, AbstractC39170b.m124774f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j7), 0, 10);
    }

    /* JADX INFO: renamed from: c1 */
    public final void m3477c1(AbstractC26165a abstractC26165a) {
        this.painter = abstractC26165a;
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: g0 */
    public final int mo435g0(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        if (!m3475Y0()) {
            return interfaceC39124q0.mo446O(i13);
        }
        long jM3476b1 = m3476b1(AbstractC39170b.m124770b(0, i13, 7));
        return Math.max(C39169a.m124767k(jM3476b1), interfaceC39124q0.mo446O(i13));
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: o */
    public final int mo436o(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        if (!m3475Y0()) {
            return interfaceC39124q0.mo447Q(i13);
        }
        long jM3476b1 = m3476b1(AbstractC39170b.m124770b(0, i13, 7));
        return Math.max(C39169a.m124767k(jM3476b1), interfaceC39124q0.mo447Q(i13));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=true, alignment=" + this.f4782O + ", alpha=" + this.f4784Q + ", colorFilter=" + this.f4785R + ')';
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: y */
    public final int mo437y(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        if (!m3475Y0()) {
            return interfaceC39124q0.mo438C(i13);
        }
        long jM3476b1 = m3476b1(AbstractC39170b.m124770b(i13, 0, 13));
        return Math.max(C39169a.m124766j(jM3476b1), interfaceC39124q0.mo438C(i13));
    }
}
