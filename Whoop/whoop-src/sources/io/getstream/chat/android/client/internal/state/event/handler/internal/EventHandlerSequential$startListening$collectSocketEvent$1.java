package io.getstream.chat.android.client.internal.state.event.handler.internal;

import androidx.core.app.NotificationCompat;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.events.ChatEvent;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$startListening$collectSocketEvent$1", m100430f = "EventHandlerSequential.kt", m100431l = {259, 260, 261}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/client/events/ChatEvent;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/client/events/ChatEvent;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class EventHandlerSequential$startListening$collectSocketEvent$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ InterfaceC3027k1 $initJob;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EventHandlerSequential this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventHandlerSequential$startListening$collectSocketEvent$1(EventHandlerSequential eventHandlerSequential, InterfaceC3027k1 interfaceC3027k1, InterfaceC30057d<? super EventHandlerSequential$startListening$collectSocketEvent$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = eventHandlerSequential;
        this.$initJob = interfaceC3027k1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        EventHandlerSequential$startListening$collectSocketEvent$1 eventHandlerSequential$startListening$collectSocketEvent$1 = new EventHandlerSequential$startListening$collectSocketEvent$1(this.this$0, this.$initJob, interfaceC30057d);
        eventHandlerSequential$startListening$collectSocketEvent$1.L$0 = obj;
        return eventHandlerSequential$startListening$collectSocketEvent$1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(ChatEvent chatEvent, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((EventHandlerSequential$startListening$collectSocketEvent$1) create(chatEvent, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        if (r7.collect$stream_chat_android_client_release(r0, r6) == r1) goto L20;
     */
    @Override // s83.AbstractC32267a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.L$0
            io.getstream.chat.android.client.events.ChatEvent r0 = (io.getstream.chat.android.client.events.ChatEvent) r0
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r6.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L27
            if (r2 == r5) goto L23
            if (r2 == r4) goto L1f
            if (r2 != r3) goto L17
            p505ts.AbstractC34132o.m107864I(r7)
            goto L63
        L17:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1f:
            p505ts.AbstractC34132o.m107864I(r7)
            goto L51
        L23:
            p505ts.AbstractC34132o.m107864I(r7)
            goto L40
        L27:
            p505ts.AbstractC34132o.m107864I(r7)
            io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential r7 = r6.this$0
            java.util.concurrent.atomic.AtomicInteger r7 = io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential.access$getCollectedCount$p(r7)
            r7.incrementAndGet()
            bc3.k1 r7 = r6.$initJob
            r6.L$0 = r0
            r6.label = r5
            java.lang.Object r7 = r7.join(r6)
            if (r7 != r1) goto L40
            goto L62
        L40:
            io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential r7 = r6.this$0
            kotlin.jvm.functions.Function1 r7 = io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential.access$getSideEffect$p(r7)
            r6.L$0 = r0
            r6.label = r4
            java.lang.Object r7 = r7.invoke(r6)
            if (r7 != r1) goto L51
            goto L62
        L51:
            io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential r7 = r6.this$0
            io.getstream.chat.android.client.internal.state.event.handler.internal.batch.SocketEventCollector r7 = io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential.access$getSocketEventCollector$p(r7)
            r2 = 0
            r6.L$0 = r2
            r6.label = r3
            java.lang.Object r7 = r7.collect$stream_chat_android_client_release(r0, r6)
            if (r7 != r1) goto L63
        L62:
            return r1
        L63:
            l83.a0 r7 = l83.C23454a0.f92919a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$startListening$collectSocketEvent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
