package io.getstream.chat.android.client.internal.state.event.handler.internal;

import c93.InterfaceC4351m;
import io.getstream.chat.android.client.internal.state.event.handler.internal.batch.BatchEvent;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$socketEventCollector$1", m100430f = "EventHandlerSequential.kt", m100431l = {191}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;", "batchEvent", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class EventHandlerSequential$socketEventCollector$1 extends AbstractC32275i implements InterfaceC4351m {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EventHandlerSequential this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventHandlerSequential$socketEventCollector$1(EventHandlerSequential eventHandlerSequential, InterfaceC30057d<? super EventHandlerSequential$socketEventCollector$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = eventHandlerSequential;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        EventHandlerSequential$socketEventCollector$1 eventHandlerSequential$socketEventCollector$1 = new EventHandlerSequential$socketEventCollector$1(this.this$0, interfaceC30057d);
        eventHandlerSequential$socketEventCollector$1.L$0 = obj;
        return eventHandlerSequential$socketEventCollector$1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(BatchEvent batchEvent, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((EventHandlerSequential$socketEventCollector$1) create(batchEvent, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        BatchEvent batchEvent = (BatchEvent) this.L$0;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            EventHandlerSequential eventHandlerSequential = this.this$0;
            this.L$0 = null;
            this.label = 1;
            if (eventHandlerSequential.handleBatchEvent(batchEvent, this) == enumC31071a) {
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
