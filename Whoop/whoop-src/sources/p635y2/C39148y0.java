package p635y2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.node.NodeCoordinator;
import d13.AbstractC11478a;
import p005a3.InterfaceC0180a2;

/* JADX INFO: renamed from: y2.y0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C39148y0 {

    /* JADX INFO: renamed from: a */
    public final Modifier f168301a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC39147y f168302b;

    /* JADX INFO: renamed from: c */
    public final Object f168303c;

    public C39148y0(Modifier modifier, NodeCoordinator nodeCoordinator, InterfaceC0180a2 interfaceC0180a2) {
        this.f168301a = modifier;
        this.f168302b = nodeCoordinator;
        this.f168303c = interfaceC0180a2;
    }

    /* JADX INFO: renamed from: a */
    public final Modifier m124666a() {
        return this.f168301a;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ModifierInfo(");
        sb4.append(this.f168301a);
        sb4.append(", ");
        sb4.append(this.f168302b);
        sb4.append(", ");
        return AbstractC11478a.m30860l(sb4, this.f168303c, ')');
    }
}
