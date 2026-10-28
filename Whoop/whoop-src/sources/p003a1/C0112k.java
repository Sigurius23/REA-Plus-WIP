package p003a1;

import bc3.C2996c2;
import p005a3.AbstractC0233o;
import p005a3.InterfaceC0225m;
import p025b1.InterfaceC2215f;
import p181h2.C16618c;
import p390p1.AbstractC28683x;
import p390p1.C28612f0;
import p601x0.C37792c;
import p635y2.InterfaceC39147y;
import p715kotlin.jvm.functions.Function1;
import ro.C31624i;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: a1.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C0112k extends AbstractC0233o implements InterfaceC0225m, InterfaceC2215f {

    /* JADX INFO: renamed from: Q */
    public C31624i f346Q;

    /* JADX INFO: renamed from: R */
    public AbstractC32275i f347R;

    /* JADX INFO: renamed from: S */
    public Function1 f348S;

    /* JADX INFO: renamed from: T */
    public Function1 f349T;

    /* JADX INFO: renamed from: U */
    public C2996c2 f350U;

    /* JADX INFO: renamed from: V */
    public final C28612f0 f351V = AbstractC28683x.m87264r(new C0111j(this, 0));

    /* JADX INFO: renamed from: W */
    public C16618c f352W = C16618c.f63938e;

    /* JADX WARN: Multi-variable type inference failed */
    public C0112k(C31624i c31624i, Function1 function1, Function1 function2, Function1 function3) {
        this.f346Q = c31624i;
        this.f347R = (AbstractC32275i) function1;
        this.f348S = function2;
        this.f349T = function3;
    }

    @Override // p025b1.InterfaceC2215f
    /* JADX INFO: renamed from: G0 */
    public final long mo277G0(InterfaceC39147y interfaceC39147y) {
        return mo279v0(interfaceC39147y).m47200f();
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: P0 */
    public final void mo285P0() {
        this.f346Q.f130665x = this;
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: Q0 */
    public final void mo286Q0() {
        this.f346Q.f130665x = null;
    }

    @Override // p025b1.InterfaceC2215f
    /* JADX INFO: renamed from: s */
    public final C37792c mo278s() {
        return (C37792c) this.f351V.getValue();
    }

    @Override // p025b1.InterfaceC2215f
    /* JADX INFO: renamed from: v0 */
    public final C16618c mo279v0(InterfaceC39147y interfaceC39147y) {
        C16618c c16618c;
        if (this.f9141N && (c16618c = (C16618c) this.f349T.invoke(interfaceC39147y)) != null) {
            this.f352W = c16618c;
            return c16618c;
        }
        return this.f352W;
    }
}
