package p292l1;

import androidx.compose.material3.AbstractC1123d;
import bc3.AbstractC3006f0;
import m83.C25272z;
import p005a3.InterfaceC0186c0;
import p026b2.AbstractC2316v;
import p077d0.C11344e;
import p077d0.C11362i1;
import p180h0.C16367b4;
import p238j0.InterfaceC21083i;
import p279kd.C22379f;
import p354o1.AbstractC27386y;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.AbstractC39170b;
import p636y3.AbstractC39177i;
import p636y3.C39169a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: l1.q4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23161q4 extends AbstractC2316v implements InterfaceC0186c0 {

    /* JADX INFO: renamed from: O */
    public InterfaceC21083i f91609O;

    /* JADX INFO: renamed from: P */
    public boolean f91610P;

    /* JADX INFO: renamed from: Q */
    public C11362i1 f91611Q;

    /* JADX INFO: renamed from: R */
    public boolean f91612R;

    /* JADX INFO: renamed from: S */
    public C11344e f91613S;

    /* JADX INFO: renamed from: T */
    public C11344e f91614T;

    /* JADX INFO: renamed from: U */
    public float f91615U;

    /* JADX INFO: renamed from: V */
    public float f91616V;

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: M0 */
    public final boolean mo3462M0() {
        return false;
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: P0 */
    public final void mo285P0() {
        AbstractC3006f0.m8732z(m7158L0(), null, null, new C22379f(this, (InterfaceC30057d) null, 4), 3);
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC39130s0 mo434b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7) {
        float f13;
        boolean z4 = (interfaceC39124q0.mo449b(C39169a.m124765i(j7)) == 0 || interfaceC39124q0.mo447Q(C39169a.m124764h(j7)) == 0) ? false : true;
        if (this.f91612R) {
            f13 = AbstractC27386y.f110081n;
        } else {
            f13 = (z4 || this.f91610P) ? AbstractC1123d.f4755a : AbstractC1123d.f4756b;
        }
        float fMo743q0 = interfaceC39133t0.mo743q0(f13);
        C11344e c11344e = this.f91614T;
        int iFloatValue = (int) (c11344e != null ? ((Number) c11344e.m30549e()).floatValue() : fMo743q0);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            AbstractC39177i.m124789a("width and height must be >= 0");
        }
        AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0.mo448T(AbstractC39170b.m124776h(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fMo743q1 = interfaceC39133t0.mo743q0((AbstractC1123d.f4758d - interfaceC39133t0.mo734f0(fMo743q0)) / 2.0f);
        float fMo743q2 = interfaceC39133t0.mo743q0((AbstractC1123d.f4757c - AbstractC1123d.f4755a) - AbstractC1123d.f4759e);
        boolean z13 = this.f91612R;
        if (z13 && this.f91610P) {
            fMo743q1 = fMo743q2 - interfaceC39133t0.mo743q0(AbstractC27386y.f110088u);
        } else if (z13 && !this.f91610P) {
            fMo743q1 = interfaceC39133t0.mo743q0(AbstractC27386y.f110088u);
        } else if (this.f91610P) {
            fMo743q1 = fMo743q2;
        }
        C11344e c11344e2 = this.f91614T;
        InterfaceC30057d interfaceC30057d = null;
        if (!AbstractC22676k.m65743c(c11344e2 != null ? (Float) c11344e2.f36345e.getValue() : null, fMo743q0)) {
            AbstractC3006f0.m8732z(m7158L0(), null, null, new C23155p4(this, fMo743q0, interfaceC30057d, 0), 3);
        }
        C11344e c11344e3 = this.f91613S;
        if (!AbstractC22676k.m65743c(c11344e3 != null ? (Float) c11344e3.f36345e.getValue() : null, fMo743q1)) {
            AbstractC3006f0.m8732z(m7158L0(), null, null, new C23155p4(this, fMo743q1, interfaceC30057d, 1), 3);
        }
        if (Float.isNaN(this.f91616V) && Float.isNaN(this.f91615U)) {
            this.f91616V = fMo743q0;
            this.f91615U = fMo743q1;
        }
        return interfaceC39133t0.mo86822W(iFloatValue, iFloatValue, C25272z.f99163w, new C16367b4(abstractC39104j1Mo448T, this, fMo743q1));
    }
}
