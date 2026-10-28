package androidx.compose.material3;

import p005a3.AbstractC0201g;
import p208i2.C17919x;
import p208i2.InterfaceC17868a0;
import p292l1.AbstractC23130l3;
import p292l1.AbstractC23168s;
import p292l1.C23118j3;

/* JADX INFO: renamed from: androidx.compose.material3.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C1121b implements InterfaceC17868a0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ DelegatingThemeAwareRippleNode f4751w;

    public C1121b(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        this.f4751w = delegatingThemeAwareRippleNode;
    }

    @Override // p208i2.InterfaceC17868a0
    /* JADX INFO: renamed from: a */
    public final long mo3457a() {
        DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = this.f4751w;
        long jMo3457a = delegatingThemeAwareRippleNode.color.mo3457a();
        if (jMo3457a != 16) {
            return jMo3457a;
        }
        C23118j3 c23118j3 = (C23118j3) AbstractC0201g.m506f(delegatingThemeAwareRippleNode, AbstractC23130l3.f91392a);
        if (c23118j3 != null) {
            long j7 = c23118j3.f91346a;
            if (j7 != 16) {
                return j7;
            }
        }
        return ((C17919x) AbstractC0201g.m506f(delegatingThemeAwareRippleNode, AbstractC23168s.f91626a)).f69639a;
    }
}
