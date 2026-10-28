package io.getstream.chat.android.p226ui.common.feature.messages.list;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.api.state.ChatClientExtensions;
import io.getstream.chat.android.models.Channel;
import l83.C23454a0;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import o23.C27478h;
import o23.InterfaceC27474d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$scrollToFirstUnreadMessage$1$3$1", m100430f = "MessageListController.kt", m100431l = {665}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class MessageListController$scrollToFirstUnreadMessage$1$3$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ MessageListController $this_run;
    final /* synthetic */ MessageListController.UnreadLabel $unreadLabel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListController$scrollToFirstUnreadMessage$1$3$1(MessageListController messageListController, MessageListController.UnreadLabel unreadLabel, InterfaceC30057d<? super MessageListController$scrollToFirstUnreadMessage$1$3$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.$this_run = messageListController;
        this.$unreadLabel = unreadLabel;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new MessageListController$scrollToFirstUnreadMessage$1$3$1(this.$this_run, this.$unreadLabel, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((MessageListController$scrollToFirstUnreadMessage$1$3$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC27474d interfaceC27474dLoadMessagesAroundId = ChatClientExtensions.loadMessagesAroundId(this.$this_run.chatClient, this.$this_run.cid, this.$unreadLabel.getLastReadMessageId());
            this.label = 1;
            obj = ((C27478h) interfaceC27474dLoadMessagesAroundId).await(this);
            if (obj == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        AbstractC26205h abstractC26205h = (AbstractC26205h) obj;
        MessageListController messageListController = this.$this_run;
        MessageListController.UnreadLabel unreadLabel = this.$unreadLabel;
        if (abstractC26205h instanceof C26204g) {
            messageListController.focusUnreadMessage(((Channel) ((C26204g) abstractC26205h).f103919a).getMessages(), unreadLabel.getLastReadMessageId());
        } else if (!(abstractC26205h instanceof C26203f)) {
            throw new NoWhenBranchMatchedException();
        }
        return C23454a0.f92919a;
    }
}
