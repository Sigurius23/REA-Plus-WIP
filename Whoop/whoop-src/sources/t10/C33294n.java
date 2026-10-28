package t10;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: t10.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C33294n extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w */
    public final C33282b f138853w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC2994c0 f138854x;

    public C33294n(C33282b c33282b, InterfaceC2994c0 customViewModelScope) {
        AbstractC22676k.m65750j(customViewModelScope, "customViewModelScope");
        this.f138853w = c33282b;
        this.f138854x = customViewModelScope;
    }

    @Override // androidx.lifecycle.AbstractC1637w1
    public final void onCleared() {
        AbstractC3006f0.m8714h(this.f138854x, null);
    }
}
