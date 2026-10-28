package io.getstream.chat.android.p226ui.common.feature.messages.list;

import c93.InterfaceC4354p;
import io.getstream.chat.android.client.channel.state.ChannelState;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ChannelData;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Message;
import java.util.List;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$channel$1$1", m100430f = "MessageListController.kt", m100431l = {}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\n"}, m65681d2 = {"<anonymous>", "Lio/getstream/chat/android/models/Channel;", "<unused var>", "Lio/getstream/chat/android/models/ChannelData;", "", "Lio/getstream/chat/android/models/Member;", "", "Lio/getstream/chat/android/models/Message;"}, m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageListController$channel$1$1 extends AbstractC32275i implements InterfaceC4354p {
    final /* synthetic */ ChannelState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListController$channel$1$1(ChannelState channelState, InterfaceC30057d<? super MessageListController$channel$1$1> interfaceC30057d) {
        super(6, interfaceC30057d);
        this.$state = channelState;
    }

    public final Object invoke(ChannelData channelData, List<Member> list, int i13, int i14, List<Message> list2, InterfaceC30057d<? super Channel> interfaceC30057d) {
        return new MessageListController$channel$1$1(this.$state, interfaceC30057d).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        return this.$state.toChannel();
    }

    @Override // c93.InterfaceC4354p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return invoke((ChannelData) obj, (List<Member>) obj2, ((Number) obj3).intValue(), ((Number) obj4).intValue(), (List<Message>) obj5, (InterfaceC30057d<? super Channel>) obj6);
    }
}
