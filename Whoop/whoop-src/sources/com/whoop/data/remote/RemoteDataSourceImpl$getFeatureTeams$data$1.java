package com.whoop.data.remote;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.domain.model.RecordsDto;
import com.whoop.domain.model.teams.FeatureCommunityDto;
import com.whoop.service.network.CommunityApi;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes8.dex */
@InterfaceC32271e(m100429c = "com.whoop.data.remote.RemoteDataSourceImpl$getFeatureTeams$data$1", m100430f = "RemoteDataSourceImpl.kt", m100431l = {200}, m100432m = "invokeSuspend", m100433v = 2)
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/domain/model/RecordsDto;", "Lcom/whoop/domain/model/teams/FeatureCommunityDto;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/domain/model/RecordsDto;"}, m65682k = 3, m65683mv = {2, 3, 0})
public final class RemoteDataSourceImpl$getFeatureTeams$data$1 extends AbstractC32275i implements InterfaceC4351m {
    int label;
    final /* synthetic */ RemoteDataSourceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteDataSourceImpl$getFeatureTeams$data$1(RemoteDataSourceImpl remoteDataSourceImpl, InterfaceC30057d<? super RemoteDataSourceImpl$getFeatureTeams$data$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = remoteDataSourceImpl;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new RemoteDataSourceImpl$getFeatureTeams$data$1(this.this$0, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super RecordsDto<FeatureCommunityDto>> interfaceC30057d) {
        return ((RemoteDataSourceImpl$getFeatureTeams$data$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
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
        CommunityApi communityApi = this.this$0.communityApi;
        this.label = 1;
        Object featureTeamsForUser = communityApi.getFeatureTeamsForUser(this);
        return featureTeamsForUser == enumC31071a ? enumC31071a : featureTeamsForUser;
    }
}
