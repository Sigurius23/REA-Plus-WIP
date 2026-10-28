package io.getstream.chat.android.client.internal.state.event.handler.internal;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.internal.state.event.handler.internal.batch.BatchEvent;
import io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsLogic;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$updateChannelsState$10$1", m100430f = "EventHandlerSequential.kt", m100431l = {521}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class EventHandlerSequential$updateChannelsState$10$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ BatchEvent $batchEvent;
    final /* synthetic */ QueryChannelsLogic $channelsLogic;
    int label;
    final /* synthetic */ EventHandlerSequential this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventHandlerSequential$updateChannelsState$10$1(EventHandlerSequential eventHandlerSequential, BatchEvent batchEvent, QueryChannelsLogic queryChannelsLogic, InterfaceC30057d<? super EventHandlerSequential$updateChannelsState$10$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = eventHandlerSequential;
        this.$batchEvent = batchEvent;
        this.$channelsLogic = queryChannelsLogic;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new EventHandlerSequential$updateChannelsState$10$1(this.this$0, this.$batchEvent, this.$channelsLogic, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((EventHandlerSequential$updateChannelsState$10$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            EventHandlerSequential eventHandlerSequential = this.this$0;
            BatchEvent batchEvent = this.$batchEvent;
            QueryChannelsLogic queryChannelsLogic = this.$channelsLogic;
            this.label = 1;
            if (eventHandlerSequential.handleChatEvents(batchEvent, queryChannelsLogic, this) == enumC31071a) {
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
