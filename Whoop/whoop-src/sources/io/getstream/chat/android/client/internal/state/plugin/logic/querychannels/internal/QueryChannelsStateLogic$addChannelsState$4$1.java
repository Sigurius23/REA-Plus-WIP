package io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic;
import io.getstream.chat.android.models.Channel;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsStateLogic$addChannelsState$4$1", m100430f = "QueryChannelsStateLogic.kt", m100431l = {167}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class QueryChannelsStateLogic$addChannelsState$4$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ Channel $channel;
    int label;
    final /* synthetic */ QueryChannelsStateLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryChannelsStateLogic$addChannelsState$4$1(QueryChannelsStateLogic queryChannelsStateLogic, Channel channel, InterfaceC30057d<? super QueryChannelsStateLogic$addChannelsState$4$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = queryChannelsStateLogic;
        this.$channel = channel;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new QueryChannelsStateLogic$addChannelsState$4$1(this.this$0, this.$channel, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((QueryChannelsStateLogic$addChannelsState$4$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            ChannelLogic channelLogicChannel = this.this$0.logicRegistry.channel(this.$channel.getType(), this.$channel.getId());
            Channel channel = this.$channel;
            int size = channel.getMessages().size();
            this.label = 1;
            if (ChannelLogic.updateDataForChannel$default(channelLogicChannel, channel, size, false, false, false, true, this, 28, null) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return C23454a0.f92919a;
    }
}
