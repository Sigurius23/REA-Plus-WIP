package u10;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import h53.C16940e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: u10.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C34434v extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w */
    public final C16940e f144685w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC2994c0 f144686x;

    public C34434v(C16940e c16940e, InterfaceC2994c0 customViewModelScope) {
        AbstractC22676k.m65750j(customViewModelScope, "customViewModelScope");
        this.f144685w = c16940e;
        this.f144686x = customViewModelScope;
    }

    @Override // androidx.lifecycle.AbstractC1637w1
    public final void onCleared() {
        AbstractC3006f0.m8714h(this.f144686x, null);
    }
}
