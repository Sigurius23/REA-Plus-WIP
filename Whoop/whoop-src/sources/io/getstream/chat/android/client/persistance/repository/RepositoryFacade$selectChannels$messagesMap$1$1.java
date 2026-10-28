package io.getstream.chat.android.client.persistance.repository;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.query.pagination.AnyChannelPaginationRequest;
import l83.C23454a0;
import l83.C23465k;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.persistance.repository.RepositoryFacade$selectChannels$messagesMap$1$1", m100430f = "RepositoryFacade.kt", m100431l = {80}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lbc3/c0;", "Ll83/k;", "", "", "Lio/getstream/chat/android/models/Message;", "<anonymous>", "(Lbc3/c0;)Ll83/k;"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class RepositoryFacade$selectChannels$messagesMap$1$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ String $cid;
    final /* synthetic */ AnyChannelPaginationRequest $pagination;
    Object L$0;
    int label;
    final /* synthetic */ RepositoryFacade this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepositoryFacade$selectChannels$messagesMap$1$1(String str, RepositoryFacade repositoryFacade, AnyChannelPaginationRequest anyChannelPaginationRequest, InterfaceC30057d<? super RepositoryFacade$selectChannels$messagesMap$1$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.$cid = str;
        this.this$0 = repositoryFacade;
        this.$pagination = anyChannelPaginationRequest;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new RepositoryFacade$selectChannels$messagesMap$1$1(this.$cid, this.this$0, this.$pagination, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23465k> interfaceC30057d) {
        return ((RepositoryFacade$selectChannels$messagesMap$1$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            String str2 = this.$cid;
            RepositoryFacade repositoryFacade = this.this$0;
            AnyChannelPaginationRequest anyChannelPaginationRequest = this.$pagination;
            this.L$0 = str2;
            this.label = 1;
            Object objSelectMessagesForChannel = repositoryFacade.selectMessagesForChannel(str2, anyChannelPaginationRequest, this);
            if (objSelectMessagesForChannel == enumC31071a) {
                return enumC31071a;
            }
            str = str2;
            obj = objSelectMessagesForChannel;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$0;
            AbstractC34132o.m107864I(obj);
        }
        return new C23465k(str, obj);
    }
}
