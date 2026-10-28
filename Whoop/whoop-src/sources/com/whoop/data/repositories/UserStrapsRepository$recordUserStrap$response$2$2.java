package com.whoop.data.repositories;

import c93.InterfaceC4351m;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.domain.model.WhoopStrapInfo;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes8.dex */
@InterfaceC32271e(m100429c = "com.whoop.data.repositories.UserStrapsRepository$recordUserStrap$response$2$2", m100430f = "UserStrapsRepository.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "it", "<anonymous>", "(Lpg3/v0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
public final class UserStrapsRepository$recordUserStrap$response$2$2 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ WhoopStrapInfo $strapInfo;
    int label;
    final /* synthetic */ UserStrapsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserStrapsRepository$recordUserStrap$response$2$2(UserStrapsRepository userStrapsRepository, WhoopStrapInfo whoopStrapInfo, InterfaceC30057d<? super UserStrapsRepository$recordUserStrap$response$2$2> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = userStrapsRepository;
        this.$strapInfo = whoopStrapInfo;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new UserStrapsRepository$recordUserStrap$response$2$2(this.this$0, this.$strapInfo, interfaceC30057d);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        this.this$0.preferenceHelper.putStringValueIntoMainPrefs(SharedPreferenceConstants.KEY_LAST_RECORDED_STRAP_SERIAL, this.$strapInfo.getSerialNumber());
        return C23454a0.f92919a;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(C29218v0<C23454a0> c29218v0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((UserStrapsRepository$recordUserStrap$response$2$2) create(c29218v0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }
}
