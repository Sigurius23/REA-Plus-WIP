package p005a3;

import androidx.compose.p018ui.node.NodeCoordinator;
import com.google.crypto.tink.internal.C5101l0;
import p446r1.C30849c;
import p635y2.AbstractC39071a;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a3.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0261w extends AbstractC0265x0 {
    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: C */
    public final int mo438C(int i13) {
        C5101l0 c5101l0M585E = this.f904O.f4858O.m585E();
        InterfaceC39127r0 interfaceC39127r0M16038R = c5101l0M585E.m16038R();
        C0230n0 c0230n0 = (C0230n0) c5101l0M585E.f21443x;
        return interfaceC39127r0M16038R.mo537b((NodeCoordinator) c0230n0.f783e0.f741e, c0230n0.m634o(), i13);
    }

    @Override // p005a3.AbstractC0262w0
    /* JADX INFO: renamed from: F0 */
    public final int mo475F0(AbstractC39071a abstractC39071a) {
        C0187c1 c0187c1 = this.f904O.f4858O.m643t().f855q;
        AbstractC22676k.m65747g(c0187c1);
        C0250s0 c0250s0 = c0187c1.f601S;
        if (!c0187c1.f593K) {
            C0246r0 c0246r0 = c0187c1.f588F;
            if (c0246r0.f842d == EnumC0206h0.f692x) {
                c0250s0.f575f = true;
                if (c0250s0.f571b) {
                    c0246r0.f844f = true;
                    c0246r0.f845g = true;
                }
            } else {
                c0250s0.f576g = true;
            }
        }
        C0261w c0261w = c0187c1.mo424J().f4882q0;
        if (c0261w != null) {
            c0261w.f898K = true;
        }
        c0187c1.mo429t();
        C0261w c0261w2 = c0187c1.mo424J().f4882q0;
        if (c0261w2 != null) {
            c0261w2.f898K = false;
        }
        Integer num = (Integer) c0250s0.f578i.get(abstractC39071a);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.f909T.m95h(abstractC39071a, iIntValue);
        return iIntValue;
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: O */
    public final int mo446O(int i13) {
        C5101l0 c5101l0M585E = this.f904O.f4858O.m585E();
        InterfaceC39127r0 interfaceC39127r0M16038R = c5101l0M585E.m16038R();
        C0230n0 c0230n0 = (C0230n0) c5101l0M585E.f21443x;
        return interfaceC39127r0M16038R.mo540e((NodeCoordinator) c0230n0.f783e0.f741e, c0230n0.m634o(), i13);
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: Q */
    public final int mo447Q(int i13) {
        C5101l0 c5101l0M585E = this.f904O.f4858O.m585E();
        InterfaceC39127r0 interfaceC39127r0M16038R = c5101l0M585E.m16038R();
        C0230n0 c0230n0 = (C0230n0) c5101l0M585E.f21443x;
        return interfaceC39127r0M16038R.mo538c((NodeCoordinator) c0230n0.f783e0.f741e, c0230n0.m634o(), i13);
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: T */
    public final AbstractC39104j1 mo448T(long j7) {
        m124636v0(j7);
        NodeCoordinator nodeCoordinator = this.f904O;
        C30849c c30849cM595M = nodeCoordinator.f4858O.m595M();
        Object[] objArr = c30849cM595M.f127227w;
        int i13 = c30849cM595M.f127229y;
        for (int i14 = 0; i14 < i13; i14++) {
            C0187c1 c0187c1M650y = ((C0230n0) objArr[i14]).m650y();
            AbstractC22676k.m65747g(c0187c1M650y);
            c0187c1M650y.f592J = EnumC0214j0.f715y;
        }
        C0230n0 c0230n0 = nodeCoordinator.f4858O;
        AbstractC0265x0.m804V0(this, c0230n0.f774V.mo521a(this, c0230n0.m634o(), j7));
        return this;
    }

    @Override // p005a3.AbstractC0265x0
    /* JADX INFO: renamed from: W0 */
    public final void mo779W0() {
        C0187c1 c0187c1M650y = this.f904O.f4858O.m650y();
        AbstractC22676k.m65747g(c0187c1M650y);
        c0187c1M650y.m443I0();
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: b */
    public final int mo449b(int i13) {
        C5101l0 c5101l0M585E = this.f904O.f4858O.m585E();
        InterfaceC39127r0 interfaceC39127r0M16038R = c5101l0M585E.m16038R();
        C0230n0 c0230n0 = (C0230n0) c5101l0M585E.f21443x;
        return interfaceC39127r0M16038R.mo539d((NodeCoordinator) c0230n0.f783e0.f741e, c0230n0.m634o(), i13);
    }
}
