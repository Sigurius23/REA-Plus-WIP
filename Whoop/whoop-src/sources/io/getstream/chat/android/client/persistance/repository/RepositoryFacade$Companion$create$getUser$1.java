package io.getstream.chat.android.client.persistance.repository;

import c93.InterfaceC4351m;
import io.getstream.chat.android.models.User;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.persistance.repository.RepositoryFacade$Companion$create$getUser$1", m100430f = "RepositoryFacade.kt", m100431l = {248}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m65681d2 = {"<anonymous>", "Lio/getstream/chat/android/models/User;", "userId", ""}, m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class RepositoryFacade$Companion$create$getUser$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ UserRepository $userRepository;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepositoryFacade$Companion$create$getUser$1(UserRepository userRepository, InterfaceC30057d<? super RepositoryFacade$Companion$create$getUser$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.$userRepository = userRepository;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        RepositoryFacade$Companion$create$getUser$1 repositoryFacade$Companion$create$getUser$1 = new RepositoryFacade$Companion$create$getUser$1(this.$userRepository, interfaceC30057d);
        repositoryFacade$Companion$create$getUser$1.L$0 = obj;
        return repositoryFacade$Companion$create$getUser$1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object objSelectUser;
        String str = (String) this.L$0;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            UserRepository userRepository = this.$userRepository;
            this.L$0 = str;
            this.label = 1;
            objSelectUser = userRepository.selectUser(str, this);
            if (objSelectUser == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            objSelectUser = obj;
        }
        User user = (User) objSelectUser;
        return user == null ? new User(str, null, null, null, null, null, null, null, null, false, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, 33554430, null) : user;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(String str, InterfaceC30057d<? super User> interfaceC30057d) {
        return ((RepositoryFacade$Companion$create$getUser$1) create(str, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }
}
