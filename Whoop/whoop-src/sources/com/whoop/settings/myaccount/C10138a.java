package com.whoop.settings.myaccount;

import androidx.lifecycle.InterfaceC1633v0;
import l83.InterfaceC23459e;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.InterfaceC22666f;

/* JADX INFO: renamed from: com.whoop.settings.myaccount.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* synthetic */ class C10138a implements InterfaceC1633v0, InterfaceC22666f {

    /* JADX INFO: renamed from: w */
    private final /* synthetic */ Function1 f30602w;

    public C10138a(Function1 function) {
        AbstractC22676k.m65750j(function, "function");
        this.f30602w = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
            return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22666f
    public final InterfaceC23459e getFunctionDelegate() {
        return this.f30602w;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.InterfaceC1633v0
    public final /* synthetic */ void onChanged(Object obj) {
        this.f30602w.invoke(obj);
    }
}
