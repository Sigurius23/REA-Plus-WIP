package io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Message;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogicImpl$updateDataForChannel$sortedMessages$1", m100430f = "ChannelLogicImpl.kt", m100431l = {}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "", "Lio/getstream/chat/android/models/Message;", "<anonymous>", "(Lbc3/c0;)Ljava/util/List;"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class ChannelLogicImpl$updateDataForChannel$sortedMessages$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ Channel $channel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelLogicImpl$updateDataForChannel$sortedMessages$1(Channel channel, InterfaceC30057d<? super ChannelLogicImpl$updateDataForChannel$sortedMessages$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.$channel = channel;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new ChannelLogicImpl$updateDataForChannel$sortedMessages$1(this.$channel, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super List<Message>> interfaceC30057d) {
        return ((ChannelLogicImpl$updateDataForChannel$sortedMessages$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        return AbstractC25265s.m74152u1(this.$channel.getMessages(), new C19299x393fc33e());
    }
}
