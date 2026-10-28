package io.getstream.chat.android.p226ui.common.feature.messages.list;

import c93.InterfaceC4351m;
import io.getstream.chat.android.models.Channel;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$channel$2", m100430f = "MessageListController.kt", m100431l = {}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/models/Channel;", "channel", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/models/Channel;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class MessageListController$channel$2 extends AbstractC32275i implements InterfaceC4351m {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MessageListController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListController$channel$2(MessageListController messageListController, InterfaceC30057d<? super MessageListController$channel$2> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = messageListController;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        MessageListController$channel$2 messageListController$channel$2 = new MessageListController$channel$2(this.this$0, interfaceC30057d);
        messageListController$channel$2.L$0 = obj;
        return messageListController$channel$2;
    }

    public final Object invoke(Channel channel, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        MessageListController$channel$2 messageListController$channel$2 = (MessageListController$channel$2) create(channel, interfaceC30057d);
        C23454a0 c23454a0 = C23454a0.f92919a;
        messageListController$channel$2.invokeSuspend(c23454a0);
        return c23454a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Channel channel = (Channel) this.L$0;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        this.this$0.chatClient.dismissChannelNotifications(channel.getType(), channel.getId());
        return C23454a0.f92919a;
    }

    @Override // c93.InterfaceC4351m
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Channel) obj, (InterfaceC30057d<? super C23454a0>) obj2);
        return C23454a0.f92919a;
    }
}
