package io.getstream.chat.android.p226ui.viewmodel.messages;

import io.getstream.chat.android.p226ui.common.state.messages.MessageMode;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessageListState;
import l83.C23454a0;
import l83.C23465k;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.viewmodel.messages.MessageListViewModel$1$listState$1", m100430f = "MessageListViewModel.kt", m100431l = {}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;", "listState", "Lio/getstream/chat/android/ui/common/state/messages/MessageMode;", "mode", "Ll83/k;", "<anonymous>", "(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)Ll83/k;"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class MessageListViewModel$1$listState$1 extends AbstractC32275i implements Function3 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public MessageListViewModel$1$listState$1(InterfaceC30057d<? super MessageListViewModel$1$listState$1> interfaceC30057d) {
        super(3, interfaceC30057d);
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(MessageListState messageListState, MessageMode messageMode, InterfaceC30057d<? super C23465k> interfaceC30057d) {
        MessageListViewModel$1$listState$1 messageListViewModel$1$listState$1 = new MessageListViewModel$1$listState$1(3, interfaceC30057d);
        messageListViewModel$1$listState$1.L$0 = messageListState;
        messageListViewModel$1$listState$1.L$1 = messageMode;
        return messageListViewModel$1$listState$1.invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        MessageListState messageListState = (MessageListState) this.L$0;
        MessageMode messageMode = (MessageMode) this.L$1;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        return new C23465k(messageListState, messageMode);
    }
}
