package com.whoop.profile.domain.edit;

import f63.AbstractC14155c;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import u02.C34387c;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32271e(m100429c = "com.whoop.profile.domain.edit.EditProfileInteractor$handleRefresh$1$apiResult$1", m100430f = "EditProfileInteractor.kt", m100431l = {494}, m100432m = "invokeSuspend", m100433v = 2)
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lf63/c;", "<anonymous>", "()Lf63/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
public final class EditProfileInteractor$handleRefresh$1$apiResult$1 extends AbstractC32275i implements Function1 {
    final /* synthetic */ GetEditProfileRequest $apiRequest;
    int label;
    final /* synthetic */ EditProfileInteractor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProfileInteractor$handleRefresh$1$apiResult$1(EditProfileInteractor editProfileInteractor, GetEditProfileRequest getEditProfileRequest, InterfaceC30057d<? super EditProfileInteractor$handleRefresh$1$apiResult$1> interfaceC30057d) {
        super(1, interfaceC30057d);
        this.this$0 = editProfileInteractor;
        this.$apiRequest = getEditProfileRequest;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
        return new EditProfileInteractor$handleRefresh$1$apiResult$1(this.this$0, this.$apiRequest, interfaceC30057d);
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
        C34387c c34387c = this.this$0.apiClient;
        GetEditProfileRequest getEditProfileRequest = this.$apiRequest;
        InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
        C32236a c32236aM44445Y = AbstractC15751g.m44445Y(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, AbstractC21478l0.m60396B(interfaceC21456a0M65689b));
        this.label = 1;
        Object objM108748d = c34387c.m108748d(getEditProfileRequest, c32236aM44445Y, this);
        return objM108748d == enumC31071a ? enumC31071a : objM108748d;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC30057d<? super AbstractC14155c> interfaceC30057d) {
        return ((EditProfileInteractor$handleRefresh$1$apiResult$1) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }
}
