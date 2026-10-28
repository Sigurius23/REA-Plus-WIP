package androidx.compose.material3;

import p005a3.AbstractC0201g;
import p005a3.AbstractC0233o;
import p005a3.InterfaceC0225m;
import p005a3.InterfaceC0263w1;
import p208i2.InterfaceC17868a0;
import p238j0.InterfaceC21083i;
import p269k1.C22110a;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Landroidx/compose/material3/DelegatingThemeAwareRippleNode;", "La3/o;", "La3/m;", "La3/w1;", "Li2/a0;", "color", "Li2/a0;", "material3"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class DelegatingThemeAwareRippleNode extends AbstractC0233o implements InterfaceC0225m, InterfaceC0263w1 {

    /* JADX INFO: renamed from: Q */
    public final InterfaceC21083i f4737Q;

    /* JADX INFO: renamed from: R */
    public final boolean f4738R;

    /* JADX INFO: renamed from: S */
    public final float f4739S;

    /* JADX INFO: renamed from: T */
    public C22110a f4740T;
    private final InterfaceC17868a0 color;

    public DelegatingThemeAwareRippleNode(InterfaceC21083i interfaceC21083i, boolean z4, float f13, InterfaceC17868a0 interfaceC17868a0) {
        this.f4737Q = interfaceC21083i;
        this.f4738R = z4;
        this.f4739S = f13;
        this.color = interfaceC17868a0;
    }

    @Override // p005a3.InterfaceC0263w1
    /* JADX INFO: renamed from: C */
    public final void mo796C() {
        AbstractC0201g.m512l(this, new C1120a(this, 0));
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: P0 */
    public final void mo285P0() {
        AbstractC0201g.m512l(this, new C1120a(this, 0));
    }
}
