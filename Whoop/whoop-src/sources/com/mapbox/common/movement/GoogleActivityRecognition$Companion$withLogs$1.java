package com.mapbox.common.movement;

import com.mapbox.common.MapboxCommonLogger;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"T", "kotlin.jvm.PlatformType", "it", "Ll83/a0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
public final class GoogleActivityRecognition$Companion$withLogs$1 extends AbstractC22680m implements Function1 {
    final /* synthetic */ String $name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleActivityRecognition$Companion$withLogs$1(String str) {
        super(1);
        this.$name = str;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m134081invoke(obj);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m134081invoke(T t14) {
        MapboxCommonLogger.INSTANCE.logD$common_release(GoogleActivityRecognition.TAG, this.$name + " success");
    }
}
