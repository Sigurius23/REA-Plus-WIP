package com.mapbox.maps;

import com.mapbox.common.Cancelable;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0001\u0018\u0001\"\u0016\b\u0002\u0010\u0003\u0018\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m65681d2 = {"E", "V", "Lcom/mapbox/bindgen/Expected;", "T", "", "it", "Ll83/a0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
public final class UtilsKt$suspendMapboxCancellableCoroutine$2$1 extends AbstractC22680m implements Function1 {
    final /* synthetic */ Cancelable $cancelable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilsKt$suspendMapboxCancellableCoroutine$2$1(Cancelable cancelable) {
        super(1);
        this.$cancelable = cancelable;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C23454a0.f92919a;
    }

    public final void invoke(Throwable th3) {
        this.$cancelable.cancel();
    }
}
