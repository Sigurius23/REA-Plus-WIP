package p005a3;

import androidx.compose.p018ui.node.NodeCoordinator;
import java.util.Map;
import p181h2.C16617b;
import p635y2.AbstractC39071a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a3.s0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0250s0 extends AbstractC0177a {
    public C0250s0(C0187c1 c0187c1) {
        super(c0187c1);
    }

    @Override // p005a3.AbstractC0177a
    /* JADX INFO: renamed from: b */
    public final long mo414b(NodeCoordinator nodeCoordinator, long j7) {
        AbstractC0265x0 abstractC0265x0Mo3530e1 = nodeCoordinator.mo3530e1();
        AbstractC22676k.m65747g(abstractC0265x0Mo3530e1);
        long j13 = abstractC0265x0Mo3530e1.f905P;
        return C16617b.m47192h((((long) Float.floatToRawIntBits((int) (j13 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j13 & 4294967295L))) & 4294967295L), j7);
    }

    @Override // p005a3.AbstractC0177a
    /* JADX INFO: renamed from: c */
    public final Map mo415c(NodeCoordinator nodeCoordinator) {
        AbstractC0265x0 abstractC0265x0Mo3530e1 = nodeCoordinator.mo3530e1();
        AbstractC22676k.m65747g(abstractC0265x0Mo3530e1);
        return abstractC0265x0Mo3530e1.mo789O0().mo776a();
    }

    @Override // p005a3.AbstractC0177a
    /* JADX INFO: renamed from: d */
    public final int mo416d(NodeCoordinator nodeCoordinator, AbstractC39071a abstractC39071a) {
        AbstractC0265x0 abstractC0265x0Mo3530e1 = nodeCoordinator.mo3530e1();
        AbstractC22676k.m65747g(abstractC0265x0Mo3530e1);
        return abstractC0265x0Mo3530e1.mo450c0(abstractC39071a);
    }
}
