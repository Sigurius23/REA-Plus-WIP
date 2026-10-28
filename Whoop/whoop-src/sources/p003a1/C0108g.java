package p003a1;

import bi.AbstractC3269g;
import hg3.AbstractC17269i;
import p025b1.InterfaceC2215f;
import p181h2.C16618c;
import p268k0.AbstractC22086a;
import p601x0.C37792c;
import p635y2.InterfaceC39147y;
import p715kotlin.KotlinNothingValueException;

/* JADX INFO: renamed from: a1.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C0108g implements InterfaceC2215f {

    /* JADX INFO: renamed from: w */
    public final long f335w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C0110i f336x;

    public C0108g(C0110i c0110i, long j7) {
        this.f336x = c0110i;
        this.f335w = j7;
    }

    @Override // p025b1.InterfaceC2215f
    /* JADX INFO: renamed from: G0 */
    public final long mo277G0(InterfaceC39147y interfaceC39147y) {
        InterfaceC39147y interfaceC39147y2 = (InterfaceC39147y) this.f336x.f343R.getValue();
        if (interfaceC39147y2 != null) {
            return interfaceC39147y.mo3537k(interfaceC39147y2, this.f335w);
        }
        AbstractC22086a.m63161d("Tried to open context menu before the anchor was placed.");
        throw new KotlinNothingValueException();
    }

    @Override // p025b1.InterfaceC2215f
    /* JADX INFO: renamed from: s */
    public final C37792c mo278s() {
        return AbstractC3269g.m9508o(this.f336x);
    }

    @Override // p025b1.InterfaceC2215f
    /* JADX INFO: renamed from: v0 */
    public final C16618c mo279v0(InterfaceC39147y interfaceC39147y) {
        return AbstractC17269i.m48896j(mo277G0(interfaceC39147y), 0L);
    }
}
