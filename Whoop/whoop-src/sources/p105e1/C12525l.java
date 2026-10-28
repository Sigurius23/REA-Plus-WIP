package p105e1;

import androidx.compose.p018ui.node.NodeCoordinator;
import p208i2.C17891j;
import p294l3.C23277r0;
import p635y2.InterfaceC39147y;

/* JADX INFO: renamed from: e1.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C12525l {

    /* JADX INFO: renamed from: c */
    public static final C12525l f42788c = new C12525l(null, null);

    /* JADX INFO: renamed from: a */
    public final InterfaceC39147y f42789a;

    /* JADX INFO: renamed from: b */
    public final C23277r0 f42790b;

    public C12525l(C23277r0 c23277r0, InterfaceC39147y interfaceC39147y) {
        this.f42789a = interfaceC39147y;
        this.f42790b = c23277r0;
    }

    /* JADX INFO: renamed from: a */
    public static C12525l m35186a(C12525l c12525l, NodeCoordinator nodeCoordinator, C23277r0 c23277r0, int i13) {
        InterfaceC39147y interfaceC39147y = nodeCoordinator;
        if ((i13 & 1) != 0) {
            interfaceC39147y = c12525l.f42789a;
        }
        if ((i13 & 2) != 0) {
            c23277r0 = c12525l.f42790b;
        }
        return new C12525l(c23277r0, interfaceC39147y);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC39147y m35187b() {
        return this.f42789a;
    }

    /* JADX INFO: renamed from: c */
    public final C17891j m35188c(int i13, int i14) {
        C23277r0 c23277r0 = this.f42790b;
        if (c23277r0 != null) {
            return c23277r0.m67341j(i13, i14);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m35189d() {
        C23277r0 c23277r0 = this.f42790b;
        return (c23277r0 == null || c23277r0.f92227a.f92221f == 3 || !c23277r0.m67336e()) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public final C23277r0 m35190e() {
        return this.f42790b;
    }
}
