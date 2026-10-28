package com.whoop.data.repositories;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.service.network.FeatureFlagsApi;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: com.whoop.data.repositories.FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOn$result$1 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32271e(m100429c = "com.whoop.data.repositories.FeatureFlagRepositoryImpl$isOnboardingFeatureFlagTurnedOn$result$1", m100430f = "FeatureFlagRepositoryImpl.kt", m100431l = {86}, m100432m = "invokeSuspend", m100433v = 2)
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
public final class C6561x12360e4e extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ String $featureFlagName;
    int label;
    final /* synthetic */ FeatureFlagRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6561x12360e4e(FeatureFlagRepositoryImpl featureFlagRepositoryImpl, String str, InterfaceC30057d<? super C6561x12360e4e> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = featureFlagRepositoryImpl;
        this.$featureFlagName = str;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new C6561x12360e4e(this.this$0, this.$featureFlagName, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return ((C6561x12360e4e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 != 0) {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        AbstractC34132o.m107864I(obj);
        FeatureFlagsApi featureFlagsApi = this.this$0.api;
        String str = this.$featureFlagName;
        this.label = 1;
        Object objIsOnboardingFeatureFlagTurnedOn = featureFlagsApi.isOnboardingFeatureFlagTurnedOn(str, this);
        return objIsOnboardingFeatureFlagTurnedOn == enumC31071a ? enumC31071a : objIsOnboardingFeatureFlagTurnedOn;
    }
}
