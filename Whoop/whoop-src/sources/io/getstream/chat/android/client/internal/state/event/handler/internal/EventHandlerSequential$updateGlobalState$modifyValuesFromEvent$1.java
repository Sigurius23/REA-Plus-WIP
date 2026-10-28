package io.getstream.chat.android.client.internal.state.event.handler.internal;

import c93.InterfaceC4351m;
import io.getstream.chat.android.client.events.HasUnreadCounts;
import io.getstream.chat.android.core.internal.lazy.ParameterizedLazy;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.C22665e0;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1", m100430f = "EventHandlerSequential.kt", m100431l = {384, 387, 389}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/client/events/HasUnreadCounts;", "it", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/client/events/HasUnreadCounts;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ C22665e0 $channelUnreadCount;
    final /* synthetic */ ParameterizedLazy<String, Boolean> $hasReadEventsCapability;
    final /* synthetic */ C22665e0 $totalUnreadCount;
    int I$0;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1(ParameterizedLazy<String, Boolean> parameterizedLazy, C22665e0 c22665e0, C22665e0 c22665e1, InterfaceC30057d<? super EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.$hasReadEventsCapability = parameterizedLazy;
        this.$totalUnreadCount = c22665e0;
        this.$channelUnreadCount = c22665e1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1 eventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1 = new EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1(this.$hasReadEventsCapability, this.$totalUnreadCount, this.$channelUnreadCount, interfaceC30057d);
        eventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1.L$0 = obj;
        return eventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(HasUnreadCounts hasUnreadCounts, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1) create(hasUnreadCounts, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3 A[PHI: r0
      0x00b3: PHI (r0v4 io.getstream.chat.android.client.events.HasUnreadCounts) = 
      (r0v1 io.getstream.chat.android.client.events.HasUnreadCounts)
      (r0v5 io.getstream.chat.android.client.events.HasUnreadCounts)
     binds: [B:32:0x0093, B:37:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (r9 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (r9 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d2, code lost:
    
        if (r9 == r1) goto L46;
     */
    @Override // s83.AbstractC32267a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$updateGlobalState$modifyValuesFromEvent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
