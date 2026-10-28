package androidx.compose.material;

import p005a3.AbstractC0201g;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15067l1;
import p163g1.AbstractC15210z4;
import p163g1.C14970c1;
import p163g1.C15200y4;
import p208i2.C17919x;
import p208i2.InterfaceC17868a0;
import se.AbstractC32410a;

/* JADX INFO: renamed from: androidx.compose.material.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1117b implements InterfaceC17868a0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ DelegatingThemeAwareRippleNode f4721w;

    public C1117b(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        this.f4721w = delegatingThemeAwareRippleNode;
    }

    @Override // p208i2.InterfaceC17868a0
    /* JADX INFO: renamed from: a */
    public final long mo3457a() {
        DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = this.f4721w;
        long jMo3457a = delegatingThemeAwareRippleNode.color.mo3457a();
        if (jMo3457a != 16) {
            return jMo3457a;
        }
        C15200y4 c15200y4 = (C15200y4) AbstractC0201g.m506f(delegatingThemeAwareRippleNode, AbstractC15210z4.f57110a);
        if (c15200y4 != null) {
            long j7 = c15200y4.f57061a;
            if (j7 != 16) {
                return j7;
            }
        }
        return AbstractC32410a.m101017Z(((C17919x) AbstractC0201g.m506f(delegatingThemeAwareRippleNode, AbstractC15067l1.f56420a)).f69639a, ((C14970c1) AbstractC0201g.m506f(delegatingThemeAwareRippleNode, AbstractC14981d1.f55997a)).m43094i());
    }
}
