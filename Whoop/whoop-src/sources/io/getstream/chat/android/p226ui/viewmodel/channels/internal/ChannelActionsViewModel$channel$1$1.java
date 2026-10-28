package io.getstream.chat.android.p226ui.viewmodel.channels.internal;

import c93.InterfaceC4352n;
import io.getstream.chat.android.client.channel.state.ChannelState;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ChannelData;
import io.getstream.chat.android.models.Member;
import java.util.List;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.viewmodel.channels.internal.ChannelActionsViewModel$channel$1$1", m100430f = "ChannelActionsViewModel.kt", m100431l = {}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0002\u001a\u00020\u0006H\n"}, m65681d2 = {"<anonymous>", "Lio/getstream/chat/android/models/Channel;", "<unused var>", "Lio/getstream/chat/android/models/ChannelData;", "", "Lio/getstream/chat/android/models/Member;", ""}, m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelActionsViewModel$channel$1$1 extends AbstractC32275i implements InterfaceC4352n {
    final /* synthetic */ ChannelState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelActionsViewModel$channel$1$1(ChannelState channelState, InterfaceC30057d<? super ChannelActionsViewModel$channel$1$1> interfaceC30057d) {
        super(4, interfaceC30057d);
        this.$state = channelState;
    }

    public final Object invoke(ChannelData channelData, List<Member> list, int i13, InterfaceC30057d<? super Channel> interfaceC30057d) {
        return new ChannelActionsViewModel$channel$1$1(this.$state, interfaceC30057d).invokeSuspend(C23454a0.f92919a);
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

    @Override // c93.InterfaceC4352n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return invoke((ChannelData) obj, (List<Member>) obj2, ((Number) obj3).intValue(), (InterfaceC30057d<? super Channel>) obj4);
    }
}
