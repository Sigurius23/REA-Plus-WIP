package p114eb;

import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1585g0;
import p027b3.C2390i3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: eb.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C12991u0 extends AbstractC12939a0 {
    /* JADX INFO: renamed from: O */
    public final void m36502O(InterfaceC1585g0 owner) {
        AbstractC1638x lifecycle;
        AbstractC22676k.m65750j(owner, "owner");
        if (owner.equals(this.f44695p)) {
            return;
        }
        InterfaceC1585g0 interfaceC1585g0 = this.f44695p;
        C2390i3 c2390i3 = this.f44699t;
        if (interfaceC1585g0 != null && (lifecycle = interfaceC1585g0.getLifecycle()) != null) {
            lifecycle.mo4988d(c2390i3);
        }
        this.f44695p = owner;
        owner.getLifecycle().mo4986a(c2390i3);
    }

    /* JADX INFO: renamed from: P */
    public final void m36503P(C1579e2 viewModelStore) {
        AbstractC22676k.m65750j(viewModelStore, "viewModelStore");
        if (AbstractC22676k.m65745e(this.f44696q, AbstractC30060g.m92134y(viewModelStore))) {
            return;
        }
        if (!this.f44686g.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
        this.f44696q = AbstractC30060g.m92134y(viewModelStore);
    }
}
