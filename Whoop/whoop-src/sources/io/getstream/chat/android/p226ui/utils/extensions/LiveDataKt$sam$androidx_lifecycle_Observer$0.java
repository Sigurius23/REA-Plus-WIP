package io.getstream.chat.android.p226ui.utils.extensions;

import androidx.lifecycle.InterfaceC1633v0;
import l83.InterfaceC23459e;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.InterfaceC22666f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class LiveDataKt$sam$androidx_lifecycle_Observer$0 implements InterfaceC1633v0, InterfaceC22666f {
    private final /* synthetic */ Function1 function;

    public LiveDataKt$sam$androidx_lifecycle_Observer$0(Function1 function) {
        AbstractC22676k.m65750j(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
            return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22666f
    public final InterfaceC23459e getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.InterfaceC1633v0
    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }
}
