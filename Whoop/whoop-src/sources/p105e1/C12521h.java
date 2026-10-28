package p105e1;

import androidx.compose.p018ui.node.NodeCoordinator;
import java.util.List;
import p005a3.AbstractC0233o;
import p005a3.AbstractC0262w0;
import p005a3.C0238p0;
import p005a3.InterfaceC0186c0;
import p005a3.InterfaceC0245r;
import p005a3.InterfaceC0249s;
import p133f1.C13926b1;
import p133f1.C13928c0;
import p133f1.InterfaceC13922a1;
import p208i2.InterfaceC17868a0;
import p268k0.AbstractC22086a;
import p294l3.C23254g;
import p294l3.C23285v0;
import p392p3.InterfaceC28770h;
import p510u0.InterfaceC34372z0;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: e1.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C12521h extends AbstractC0233o implements InterfaceC0186c0, InterfaceC0245r, InterfaceC0249s {

    /* JADX INFO: renamed from: Q */
    public C12523j f42773Q;

    /* JADX INFO: renamed from: R */
    public final C12529p f42774R;

    public C12521h(C23254g c23254g, C23285v0 c23285v0, InterfaceC28770h interfaceC28770h, Function1 function1, int i13, boolean z4, int i14, int i15, List list, Function1 function2, C12523j c12523j, InterfaceC17868a0 interfaceC17868a0, InterfaceC34372z0 interfaceC34372z0) {
        this.f42773Q = c12523j;
        C12529p c12529p = new C12529p(c23254g, c23285v0, interfaceC28770h, function1, i13, z4, i14, i15, list, function2, c12523j, interfaceC17868a0, interfaceC34372z0, null);
        m665X0(c12529p);
        this.f42774R = c12529p;
        if (this.f42773Q != null) {
            return;
        }
        AbstractC22086a.m63159b("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        throw new KotlinNothingValueException();
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: E */
    public final int mo433E(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        return this.f42774R.mo433E(abstractC0262w0, interfaceC39124q0, i13);
    }

    @Override // p005a3.InterfaceC0249s
    /* JADX INFO: renamed from: I0 */
    public final void mo284I0(NodeCoordinator nodeCoordinator) {
        C12523j c12523j = this.f42773Q;
        if (c12523j != null) {
            c12523j.f42782z = C12525l.m35186a(c12523j.f42782z, nodeCoordinator, null, 2);
            InterfaceC13922a1 interfaceC13922a1 = c12523j.f42780x;
            long j7 = c12523j.f42779w;
            C13926b1 c13926b1 = (C13926b1) interfaceC13922a1;
            c13926b1.f49646a = false;
            C13928c0 c13928c0 = c13926b1.f49650e;
            if (c13928c0 != null) {
                c13928c0.invoke(Long.valueOf(j7));
            }
        }
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: M0 */
    public final boolean mo3462M0() {
        return false;
    }

    @Override // p005a3.InterfaceC0245r
    /* JADX INFO: renamed from: O */
    public final void mo459O(C0238p0 c0238p0) throws Throwable {
        this.f42774R.mo459O(c0238p0);
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC39130s0 mo434b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7) {
        return this.f42774R.mo434b(interfaceC39133t0, interfaceC39124q0, j7);
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: g0 */
    public final int mo435g0(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        return this.f42774R.mo435g0(abstractC0262w0, interfaceC39124q0, i13);
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: o */
    public final int mo436o(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        return this.f42774R.mo436o(abstractC0262w0, interfaceC39124q0, i13);
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: y */
    public final int mo437y(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        return this.f42774R.mo437y(abstractC0262w0, interfaceC39124q0, i13);
    }
}
