package com.mapbox.common;

import java.util.concurrent.CountDownLatch;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lcom/mapbox/common/LifecycleState;", "it", "Ll83/a0;", "invoke", "(Lcom/mapbox/common/LifecycleState;)V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
public final class LifecycleService$lifecycleState$1 extends AbstractC22680m implements Function1 {
    final /* synthetic */ CountDownLatch $latch;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleService$lifecycleState$1(CountDownLatch countDownLatch) {
        super(1);
        this.$latch = countDownLatch;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LifecycleState) obj);
        return C23454a0.f92919a;
    }

    public final void invoke(LifecycleState it) {
        AbstractC22676k.m65750j(it, "it");
        this.$latch.countDown();
    }
}
