package androidx.compose.material;

import c93.InterfaceC4339a;
import l83.C23454a0;
import p005a3.AbstractC0201g;
import p077d0.C11347e2;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15067l1;
import p163g1.AbstractC15210z4;
import p163g1.C14970c1;
import p163g1.C15200y4;
import p208i2.C17919x;
import p238j0.InterfaceC21083i;
import p269k1.AbstractC22115f;
import p269k1.C22110a;
import p269k1.C22111b;
import se.AbstractC32410a;

/* JADX INFO: renamed from: androidx.compose.material.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1116a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f4719w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ DelegatingThemeAwareRippleNode f4720x;

    public /* synthetic */ C1116a(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode, int i13) {
        this.f4719w = i13;
        this.f4720x = delegatingThemeAwareRippleNode;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        C22111b c22111b;
        int i13 = this.f4719w;
        DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = this.f4720x;
        switch (i13) {
            case 0:
                if (((C15200y4) AbstractC0201g.m506f(delegatingThemeAwareRippleNode, AbstractC15210z4.f57110a)) == null) {
                    C22110a c22110a = delegatingThemeAwareRippleNode.f4715T;
                    if (c22110a != null) {
                        delegatingThemeAwareRippleNode.m666Y0(c22110a);
                    }
                    delegatingThemeAwareRippleNode.f4715T = null;
                } else if (delegatingThemeAwareRippleNode.f4715T == null) {
                    C1117b c1117b = new C1117b(delegatingThemeAwareRippleNode);
                    C1116a c1116a = new C1116a(delegatingThemeAwareRippleNode, 1);
                    InterfaceC21083i interfaceC21083i = delegatingThemeAwareRippleNode.f4712Q;
                    boolean z4 = delegatingThemeAwareRippleNode.f4713R;
                    float f13 = delegatingThemeAwareRippleNode.f4714S;
                    C11347e2 c11347e2 = AbstractC22115f.f85807a;
                    C22110a c22110a2 = new C22110a(interfaceC21083i, z4, f13, c1117b, c1116a);
                    delegatingThemeAwareRippleNode.m665X0(c22110a2);
                    delegatingThemeAwareRippleNode.f4715T = c22110a2;
                }
                return C23454a0.f92919a;
            default:
                C15200y4 c15200y4 = (C15200y4) AbstractC0201g.m506f(delegatingThemeAwareRippleNode, AbstractC15210z4.f57110a);
                return (c15200y4 == null || (c22111b = c15200y4.f57062b) == null) ? AbstractC32410a.m101016Y(((C17919x) AbstractC0201g.m506f(delegatingThemeAwareRippleNode, AbstractC15067l1.f56420a)).f69639a, ((C14970c1) AbstractC0201g.m506f(delegatingThemeAwareRippleNode, AbstractC14981d1.f55997a)).m43094i()) : c22111b;
        }
    }
}
