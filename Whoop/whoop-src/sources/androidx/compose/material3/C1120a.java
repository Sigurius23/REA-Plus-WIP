package androidx.compose.material3;

import c93.InterfaceC4339a;
import l83.C23454a0;
import p005a3.AbstractC0201g;
import p077d0.C11347e2;
import p238j0.InterfaceC21083i;
import p269k1.AbstractC22115f;
import p269k1.C22110a;
import p292l1.AbstractC23124k3;
import p292l1.AbstractC23130l3;
import p292l1.C23118j3;

/* JADX INFO: renamed from: androidx.compose.material3.a */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C1120a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f4749w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ DelegatingThemeAwareRippleNode f4750x;

    public /* synthetic */ C1120a(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode, int i13) {
        this.f4749w = i13;
        this.f4750x = delegatingThemeAwareRippleNode;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f4749w;
        DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = this.f4750x;
        switch (i13) {
            case 0:
                if (((C23118j3) AbstractC0201g.m506f(delegatingThemeAwareRippleNode, AbstractC23130l3.f91392a)) == null) {
                    C22110a c22110a = delegatingThemeAwareRippleNode.f4740T;
                    if (c22110a != null) {
                        delegatingThemeAwareRippleNode.m666Y0(c22110a);
                    }
                    delegatingThemeAwareRippleNode.f4740T = null;
                } else if (delegatingThemeAwareRippleNode.f4740T == null) {
                    C1121b c1121b = new C1121b(delegatingThemeAwareRippleNode);
                    C1120a c1120a = new C1120a(delegatingThemeAwareRippleNode, 1);
                    InterfaceC21083i interfaceC21083i = delegatingThemeAwareRippleNode.f4737Q;
                    boolean z4 = delegatingThemeAwareRippleNode.f4738R;
                    float f13 = delegatingThemeAwareRippleNode.f4739S;
                    C11347e2 c11347e2 = AbstractC22115f.f85807a;
                    C22110a c22110a2 = new C22110a(interfaceC21083i, z4, f13, c1121b, c1120a);
                    delegatingThemeAwareRippleNode.m665X0(c22110a2);
                    delegatingThemeAwareRippleNode.f4740T = c22110a2;
                }
                return C23454a0.f92919a;
            default:
                return AbstractC23124k3.f91358a;
        }
    }
}
