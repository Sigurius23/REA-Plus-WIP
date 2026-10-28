package com.mapbox.common;

import java.util.ArrayList;
import java.util.Collection;
import l83.C23454a0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"", "hasForegroundService", "Ll83/a0;", "invoke", "(Z)V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
public final class LifecycleService$getLifecycleState$3$1 extends AbstractC22680m implements Function1 {
    final /* synthetic */ Function1 $callback;
    final /* synthetic */ LifecycleService $this_runCatching;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleService$getLifecycleState$3$1(LifecycleService lifecycleService, Function1 function1) {
        super(1);
        this.$this_runCatching = lifecycleService;
        this.$callback = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return C23454a0.f92919a;
    }

    public final void invoke(boolean z4) {
        if (z4) {
            LifecycleService lifecycleService = this.$this_runCatching;
            LifecycleState lifecycleState = LifecycleState.FOREGROUND;
            lifecycleService.updateLifecycleState(lifecycleState);
            this.$callback.invoke(lifecycleState);
            return;
        }
        Collection collectionValues = this.$this_runCatching.registeredActivities.values();
        AbstractC22676k.m65749i(collectionValues, "registeredActivities.values");
        Collection<LifecycleService.ActivityState> collection = collectionValues;
        LifecycleService lifecycleService2 = this.$this_runCatching;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(collection, 10));
        for (LifecycleService.ActivityState it : collection) {
            AbstractC22676k.m65749i(it, "it");
            arrayList.add(lifecycleService2.toLifecycleState(it));
        }
        LifecycleState[] lifecycleStateArr = {LifecycleState.FOREGROUND, LifecycleState.MOVING_FOREGROUND, LifecycleState.INACTIVE, LifecycleState.MOVING_BACKGROUND};
        for (int i13 = 0; i13 < 4; i13++) {
            LifecycleState lifecycleState2 = lifecycleStateArr[i13];
            if (arrayList.contains(lifecycleState2)) {
                this.$this_runCatching.updateLifecycleState(lifecycleState2);
                this.$callback.invoke(lifecycleState2);
                return;
            }
        }
        LifecycleService lifecycleService3 = this.$this_runCatching;
        LifecycleState lifecycleState3 = LifecycleState.BACKGROUND;
        lifecycleService3.updateLifecycleState(lifecycleState3);
        this.$callback.invoke(lifecycleState3);
    }
}
