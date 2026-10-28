package p389p0;

import c93.InterfaceC4339a;
import j93.InterfaceC21493z;
import p002a0.C0006a1;
import p005a3.InterfaceC0216j2;
import p026b2.AbstractC2316v;
import p180h0.EnumC16377d2;
import p209i3.AbstractC18029k;
import p209i3.AbstractC18039u;
import p209i3.AbstractC18041w;
import p209i3.C18017a;
import p209i3.C18019b;
import p209i3.C18028j;
import p209i3.C18030l;
import p209i3.C18043y;
import p209i3.InterfaceC18044z;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p0.v0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28555v0 extends AbstractC2316v implements InterfaceC0216j2 {

    /* JADX INFO: renamed from: O */
    public InterfaceC4339a f115525O;

    /* JADX INFO: renamed from: P */
    public InterfaceC28549s0 f115526P;

    /* JADX INFO: renamed from: Q */
    public EnumC16377d2 f115527Q;

    /* JADX INFO: renamed from: R */
    public boolean f115528R;

    /* JADX INFO: renamed from: S */
    public C18028j f115529S;

    /* JADX INFO: renamed from: T */
    public final C28551t0 f115530T = new C28551t0(this, 0);

    /* JADX INFO: renamed from: U */
    public C28551t0 f115531U;

    public C28555v0(InterfaceC4339a interfaceC4339a, InterfaceC28549s0 interfaceC28549s0, EnumC16377d2 enumC16377d2, boolean z4) {
        this.f115525O = interfaceC4339a;
        this.f115526P = interfaceC28549s0;
        this.f115527Q = enumC16377d2;
        this.f115528R = z4;
        m86862X0();
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: M0 */
    public final boolean mo3462M0() {
        return false;
    }

    /* JADX INFO: renamed from: X0 */
    public final void m86862X0() {
        this.f115529S = new C18028j(new C28553u0(this, 0), new C28553u0(this, 1));
        this.f115531U = this.f115528R ? new C28551t0(this, 1) : null;
    }

    @Override // p005a3.InterfaceC0216j2
    /* JADX INFO: renamed from: n */
    public final void mo471n(InterfaceC18044z interfaceC18044z) {
        AbstractC18041w.m51815n(interfaceC18044z);
        C18030l c18030l = (C18030l) interfaceC18044z;
        c18030l.m51772e(AbstractC18039u.f70030L, this.f115530T);
        if (this.f115527Q == EnumC16377d2.f62971w) {
            C18028j c18028j = this.f115529S;
            if (c18028j == null) {
                AbstractC22676k.m65757q("scrollAxisRange");
                throw null;
            }
            C18043y c18043y = AbstractC18039u.f70054u;
            InterfaceC21493z interfaceC21493z = AbstractC18041w.f70062a[12];
            c18043y.m51817a(interfaceC18044z, c18028j);
        } else {
            C18028j c18028j2 = this.f115529S;
            if (c18028j2 == null) {
                AbstractC22676k.m65757q("scrollAxisRange");
                throw null;
            }
            C18043y c18043y2 = AbstractC18039u.f70053t;
            InterfaceC21493z interfaceC21493z2 = AbstractC18041w.f70062a[11];
            c18043y2.m51817a(interfaceC18044z, c18028j2);
        }
        C28551t0 c28551t0 = this.f115531U;
        if (c28551t0 != null) {
            c18030l.m51772e(AbstractC18029k.f69959f, new C18017a(null, c28551t0));
        }
        c18030l.m51772e(AbstractC18029k.f69953B, new C18017a(null, new C0006a1(new C28553u0(this, 2), 25)));
        C18019b c18019bMo77520d = this.f115526P.mo77520d();
        C18043y c18043y3 = AbstractC18039u.f70039f;
        InterfaceC21493z interfaceC21493z3 = AbstractC18041w.f70062a[22];
        c18043y3.m51817a(interfaceC18044z, c18019bMo77520d);
    }
}
