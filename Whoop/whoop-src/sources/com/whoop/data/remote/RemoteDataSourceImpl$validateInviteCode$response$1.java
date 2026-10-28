package com.whoop.data.remote;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.remote.domain.dto.InvitationDto;
import com.whoop.service.network.LegacyTeamServiceApi;
import com.whoop.service.network.model.UserState;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes8.dex */
@InterfaceC32271e(m100429c = "com.whoop.data.remote.RemoteDataSourceImpl$validateInviteCode$response$1", m100430f = "RemoteDataSourceImpl.kt", m100431l = {73}, m100432m = "invokeSuspend", m100433v = 2)
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lpg3/v0;", "Lcom/whoop/data/remote/domain/dto/InvitationDto;", "<anonymous>", "(Lbc3/c0;)Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
public final class RemoteDataSourceImpl$validateInviteCode$response$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ String $inviteCode;
    int label;
    final /* synthetic */ RemoteDataSourceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteDataSourceImpl$validateInviteCode$response$1(RemoteDataSourceImpl remoteDataSourceImpl, String str, InterfaceC30057d<? super RemoteDataSourceImpl$validateInviteCode$response$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = remoteDataSourceImpl;
        this.$inviteCode = str;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new RemoteDataSourceImpl$validateInviteCode$response$1(this.this$0, this.$inviteCode, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C29218v0<InvitationDto>> interfaceC30057d) {
        return ((RemoteDataSourceImpl$validateInviteCode$response$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
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
        LegacyTeamServiceApi legacyTeamServiceApi = this.this$0.legacyTeamServiceApi;
        String str = this.$inviteCode;
        this.label = 1;
        Object objValidateInviteCode = legacyTeamServiceApi.validateInviteCode(str, UserState.Sources.USER, this);
        return objValidateInviteCode == enumC31071a ? enumC31071a : objValidateInviteCode;
    }
}
