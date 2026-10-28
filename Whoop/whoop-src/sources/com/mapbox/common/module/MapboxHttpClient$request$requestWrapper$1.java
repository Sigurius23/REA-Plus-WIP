package com.mapbox.common.module;

import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"", "Lcom/mapbox/common/module/RequestId;", "it", "Ll83/a0;", "invoke", "(J)V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
public final class MapboxHttpClient$request$requestWrapper$1 extends AbstractC22680m implements Function1 {
    final /* synthetic */ MapboxHttpClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxHttpClient$request$requestWrapper$1(MapboxHttpClient mapboxHttpClient) {
        super(1);
        this.this$0 = mapboxHttpClient;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return C23454a0.f92919a;
    }

    public final void invoke(long j7) {
        this.this$0.removeCall(j7);
    }
}
