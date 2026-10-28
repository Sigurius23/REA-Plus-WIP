package io.getstream.chat.android.p226ui.common.feature.channel.header;

import c93.InterfaceC4353o;
import io.getstream.chat.android.client.channel.state.ChannelState;
import io.getstream.chat.android.models.ChannelData;
import io.getstream.chat.android.models.ConnectionState;
import io.getstream.chat.android.p226ui.common.state.messages.list.ChannelHeaderViewState;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.channel.header.ChannelHeaderViewController$state$1$1", m100430f = "ChannelHeaderViewController.kt", m100431l = {}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0006H\n"}, m65681d2 = {"<anonymous>", "Lio/getstream/chat/android/ui/common/state/messages/list/ChannelHeaderViewState$Content;", "connectionState", "Lio/getstream/chat/android/models/ConnectionState;", "<unused var>", "Lio/getstream/chat/android/models/ChannelData;", ""}, m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelHeaderViewController$state$1$1 extends AbstractC32275i implements InterfaceC4353o {
    final /* synthetic */ ChannelState $state;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChannelHeaderViewController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelHeaderViewController$state$1$1(ChannelHeaderViewController channelHeaderViewController, ChannelState channelState, InterfaceC30057d<? super ChannelHeaderViewController$state$1$1> interfaceC30057d) {
        super(5, interfaceC30057d);
        this.this$0 = channelHeaderViewController;
        this.$state = channelState;
    }

    public final Object invoke(ConnectionState connectionState, ChannelData channelData, int i13, int i14, InterfaceC30057d<? super ChannelHeaderViewState.Content> interfaceC30057d) {
        ChannelHeaderViewController$state$1$1 channelHeaderViewController$state$1$1 = new ChannelHeaderViewController$state$1$1(this.this$0, this.$state, interfaceC30057d);
        channelHeaderViewController$state$1$1.L$0 = connectionState;
        return channelHeaderViewController$state$1$1.invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        ConnectionState connectionState = (ConnectionState) this.L$0;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        return new ChannelHeaderViewState.Content(this.this$0.chatClient.getCurrentUser(), connectionState, this.$state.toChannel());
    }

    @Override // c93.InterfaceC4353o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return invoke((ConnectionState) obj, (ChannelData) obj2, ((Number) obj3).intValue(), ((Number) obj4).intValue(), (InterfaceC30057d<? super ChannelHeaderViewState.Content>) obj5);
    }
}
