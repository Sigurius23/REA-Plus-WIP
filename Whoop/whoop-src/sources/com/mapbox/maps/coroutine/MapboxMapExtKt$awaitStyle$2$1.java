package com.mapbox.maps.coroutine;

import com.mapbox.maps.Style;
import l83.InterfaceC23459e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.InterfaceC22666f;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
public /* synthetic */ class MapboxMapExtKt$awaitStyle$2$1 implements Style.OnStyleLoaded, InterfaceC22666f {
    final /* synthetic */ InterfaceC30057d<Style> $tmp0;

    /* JADX WARN: Multi-variable type inference failed */
    public MapboxMapExtKt$awaitStyle$2$1(InterfaceC30057d<? super Style> interfaceC30057d) {
        this.$tmp0 = interfaceC30057d;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Style.OnStyleLoaded) && (obj instanceof InterfaceC22666f)) {
            return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22666f
    public final InterfaceC23459e getFunctionDelegate() {
        return new C22672i(1, 1, AbstractC30060g.class, this.$tmp0, "resume", "resume(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.mapbox.maps.Style.OnStyleLoaded
    public final void onStyleLoaded(Style p13) {
        AbstractC22676k.m65750j(p13, "p0");
        this.$tmp0.resumeWith(p13);
    }
}
