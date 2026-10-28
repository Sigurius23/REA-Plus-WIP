package coil.compose;

import ch.AbstractC4601v;
import ch.C4592m;
import e93.AbstractC12889b;
import m83.C25272z;
import p005a3.AbstractC0262w0;
import p005a3.C0238p0;
import p005a3.InterfaceC0186c0;
import p005a3.InterfaceC0245r;
import p014aj.C0929d;
import p026b2.AbstractC2316v;
import p026b2.InterfaceC2302h;
import p181h2.C16620e;
import p249jc.AbstractC21598x;
import p270k2.C22128b;
import p331n2.AbstractC26165a;
import p341nh.C26711e;
import p635y2.AbstractC39104j1;
import p635y2.AbstractC39122p1;
import p635y2.AbstractC39125q1;
import p635y2.InterfaceC39105k;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.AbstractC39170b;
import p636y3.C39169a;
import p715kotlin.Metadata;
import v63.AbstractC35744b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lcoil/compose/ContentPainterNode;", "Lb2/v;", "La3/r;", "La3/c0;", "Ln2/a;", "painter", "Ln2/a;", "Y0", "()Ln2/a;", "a1", "(Ln2/a;)V", "coil-compose-base_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class ContentPainterNode extends AbstractC2316v implements InterfaceC0245r, InterfaceC0186c0 {

    /* JADX INFO: renamed from: O */
    public InterfaceC2302h f20231O;

    /* JADX INFO: renamed from: P */
    public InterfaceC39105k f20232P;

    /* JADX INFO: renamed from: Q */
    public float f20233Q;
    private AbstractC26165a painter;

    public ContentPainterNode(AbstractC26165a abstractC26165a, InterfaceC2302h interfaceC2302h, InterfaceC39105k interfaceC39105k, float f13) {
        this.painter = abstractC26165a;
        this.f20231O = interfaceC2302h;
        this.f20232P = interfaceC39105k;
        this.f20233Q = f13;
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: E */
    public final int mo433E(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        if (this.painter.getF4822H() == 9205357640488583168L) {
            return interfaceC39124q0.mo449b(i13);
        }
        int iMo449b = interfaceC39124q0.mo449b(C39169a.m124765i(m15510Z0(AbstractC39170b.m124770b(i13, 0, 13))));
        return Math.max(AbstractC12889b.m36258X(C16620e.m47211c(m15508X0(AbstractC21598x.m60672b(i13, iMo449b)))), iMo449b);
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
        long jM15508X0 = m15508X0(c22128b.mo731d());
        InterfaceC2302h interfaceC2302h = this.f20231O;
        C26711e c26711e = AbstractC4601v.f18506b;
        long jM113228a = AbstractC35744b.m113228a(AbstractC12889b.m36258X(C16620e.m47213e(jM15508X0)), AbstractC12889b.m36258X(C16620e.m47211c(jM15508X0)));
        long jMo731d = c22128b.mo731d();
        long jMo7156a = interfaceC2302h.mo7156a(jM113228a, AbstractC35744b.m113228a(AbstractC12889b.m36258X(C16620e.m47213e(jMo731d)), AbstractC12889b.m36258X(C16620e.m47211c(jMo731d))), c0238p0.getLayoutDirection());
        float f13 = (int) (jMo7156a >> 32);
        float f14 = (int) (jMo7156a & 4294967295L);
        ((C0929d) c22128b.f85852x.f812x).m2339B(f13, f14);
        this.painter.m77712g(c0238p0, jM15508X0, this.f20233Q, null);
        ((C0929d) c22128b.f85852x.f812x).m2339B(-f13, -f14);
        c0238p0.m728a();
    }

    /* JADX INFO: renamed from: X0 */
    public final long m15508X0(long j7) {
        if (C16620e.m47214f(j7)) {
            return 0L;
        }
        long f4822h = this.painter.getF4822H();
        if (f4822h == 9205357640488583168L) {
            return j7;
        }
        float fM47213e = C16620e.m47213e(f4822h);
        if (Float.isInfinite(fM47213e) || Float.isNaN(fM47213e)) {
            fM47213e = C16620e.m47213e(j7);
        }
        float fM47211c = C16620e.m47211c(f4822h);
        if (Float.isInfinite(fM47211c) || Float.isNaN(fM47211c)) {
            fM47211c = C16620e.m47211c(j7);
        }
        long jM60672b = AbstractC21598x.m60672b(fM47213e, fM47211c);
        long jMo124615a = this.f20232P.mo124615a(jM60672b, j7);
        int i13 = AbstractC39122p1.f168258a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo124615a >> 32));
        if (Float.isInfinite(fIntBitsToFloat) || Float.isNaN(fIntBitsToFloat)) {
            return j7;
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & jMo124615a));
        return (Float.isInfinite(fIntBitsToFloat2) || Float.isNaN(fIntBitsToFloat2)) ? j7 : AbstractC39125q1.m124663i(jM60672b, jMo124615a);
    }

    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final AbstractC26165a getPainter() {
        return this.painter;
    }

    /* JADX INFO: renamed from: Z0 */
    public final long m15510Z0(long j7) {
        float fM124767k;
        int iM124766j;
        float fM36283m;
        boolean zM124763g = C39169a.m124763g(j7);
        boolean zM124762f = C39169a.m124762f(j7);
        if (!zM124763g || !zM124762f) {
            boolean z4 = C39169a.m124761e(j7) && C39169a.m124760d(j7);
            long f4822h = this.painter.getF4822H();
            if (f4822h != 9205357640488583168L) {
                if (!z4 || (!zM124763g && !zM124762f)) {
                    float fM47213e = C16620e.m47213e(f4822h);
                    float fM47211c = C16620e.m47211c(f4822h);
                    if (Float.isInfinite(fM47213e) || Float.isNaN(fM47213e)) {
                        fM124767k = C39169a.m124767k(j7);
                    } else {
                        C26711e c26711e = AbstractC4601v.f18506b;
                        fM124767k = AbstractC12889b.m36283m(fM47213e, C39169a.m124767k(j7), C39169a.m124765i(j7));
                    }
                    if (Float.isInfinite(fM47211c) || Float.isNaN(fM47211c)) {
                        iM124766j = C39169a.m124766j(j7);
                    } else {
                        C26711e c26711e2 = AbstractC4601v.f18506b;
                        fM36283m = AbstractC12889b.m36283m(fM47211c, C39169a.m124766j(j7), C39169a.m124764h(j7));
                    }
                    long jM15508X0 = m15508X0(AbstractC21598x.m60672b(fM124767k, fM36283m));
                    return C39169a.m124758b(j7, AbstractC39170b.m124775g(AbstractC12889b.m36258X(C16620e.m47213e(jM15508X0)), j7), 0, AbstractC39170b.m124774f(AbstractC12889b.m36258X(C16620e.m47211c(jM15508X0)), j7), 0, 10);
                }
                fM124767k = C39169a.m124765i(j7);
                iM124766j = C39169a.m124764h(j7);
                fM36283m = iM124766j;
                long jM15508X1 = m15508X0(AbstractC21598x.m60672b(fM124767k, fM36283m));
                return C39169a.m124758b(j7, AbstractC39170b.m124775g(AbstractC12889b.m36258X(C16620e.m47213e(jM15508X1)), j7), 0, AbstractC39170b.m124774f(AbstractC12889b.m36258X(C16620e.m47211c(jM15508X1)), j7), 0, 10);
            }
            if (z4) {
                return C39169a.m124758b(j7, C39169a.m124765i(j7), 0, C39169a.m124764h(j7), 0, 10);
            }
        }
        return j7;
    }

    /* JADX INFO: renamed from: a1 */
    public final void m15511a1(AbstractC26165a abstractC26165a) {
        this.painter = abstractC26165a;
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC39130s0 mo434b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7) {
        AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0.mo448T(m15510Z0(j7));
        return interfaceC39133t0.mo86822W(abstractC39104j1Mo448T.f168211w, abstractC39104j1Mo448T.f168212x, C25272z.f99163w, new C4592m(abstractC39104j1Mo448T, 1));
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: g0 */
    public final int mo435g0(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        if (this.painter.getF4822H() == 9205357640488583168L) {
            return interfaceC39124q0.mo446O(i13);
        }
        int iMo446O = interfaceC39124q0.mo446O(C39169a.m124764h(m15510Z0(AbstractC39170b.m124770b(0, i13, 7))));
        return Math.max(AbstractC12889b.m36258X(C16620e.m47213e(m15508X0(AbstractC21598x.m60672b(iMo446O, i13)))), iMo446O);
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: o */
    public final int mo436o(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        if (this.painter.getF4822H() == 9205357640488583168L) {
            return interfaceC39124q0.mo447Q(i13);
        }
        int iMo447Q = interfaceC39124q0.mo447Q(C39169a.m124764h(m15510Z0(AbstractC39170b.m124770b(0, i13, 7))));
        return Math.max(AbstractC12889b.m36258X(C16620e.m47213e(m15508X0(AbstractC21598x.m60672b(iMo447Q, i13)))), iMo447Q);
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: y */
    public final int mo437y(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        if (this.painter.getF4822H() == 9205357640488583168L) {
            return interfaceC39124q0.mo438C(i13);
        }
        int iMo438C = interfaceC39124q0.mo438C(C39169a.m124765i(m15510Z0(AbstractC39170b.m124770b(i13, 0, 13))));
        return Math.max(AbstractC12889b.m36258X(C16620e.m47211c(m15508X0(AbstractC21598x.m60672b(i13, iMo438C)))), iMo438C);
    }
}
