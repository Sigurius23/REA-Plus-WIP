package io.getstream.chat.android.client.socket;

import c93.InterfaceC4351m;
import com.mapbox.common.logger.LogPriority;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.socket.ChatSocket$observeSocketStateService$connectUser$4$1", m100430f = "ChatSocket.kt", m100431l = {LogPriority.NONE, 101, 102}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/StreamWebSocketEvent;", "it", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/client/socket/StreamWebSocketEvent;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class ChatSocket$observeSocketStateService$connectUser$4$1 extends AbstractC32275i implements InterfaceC4351m {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ChatSocket this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSocket$observeSocketStateService$connectUser$4$1(ChatSocket chatSocket, InterfaceC30057d<? super ChatSocket$observeSocketStateService$connectUser$4$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = chatSocket;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        ChatSocket$observeSocketStateService$connectUser$4$1 chatSocket$observeSocketStateService$connectUser$4$1 = new ChatSocket$observeSocketStateService$connectUser$4$1(this.this$0, interfaceC30057d);
        chatSocket$observeSocketStateService$connectUser$4$1.L$0 = obj;
        return chatSocket$observeSocketStateService$connectUser$4$1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(StreamWebSocketEvent streamWebSocketEvent, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((ChatSocket$observeSocketStateService$connectUser$4$1) create(streamWebSocketEvent, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r7.handleError(r0, r6) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r0.handleError(r7, r6) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r0.handleEvent(r7, r6) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        return r1;
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
            io.getstream.chat.android.client.socket.StreamWebSocketEvent r0 = (io.getstream.chat.android.client.socket.StreamWebSocketEvent) r0
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r6.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L24
            if (r2 == r5) goto L20
            if (r2 == r4) goto L1c
            if (r2 != r3) goto L14
            goto L1c
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            java.lang.Object r0 = r6.L$1
            io.getstream.chat.android.client.events.ChatEvent r0 = (io.getstream.chat.android.client.events.ChatEvent) r0
        L20:
            p505ts.AbstractC34132o.m107864I(r7)
            goto L71
        L24:
            p505ts.AbstractC34132o.m107864I(r7)
            boolean r7 = r0 instanceof io.getstream.chat.android.client.socket.StreamWebSocketEvent.Error
            r2 = 0
            if (r7 == 0) goto L3f
            io.getstream.chat.android.client.socket.ChatSocket r7 = r6.this$0
            io.getstream.chat.android.client.socket.StreamWebSocketEvent$Error r0 = (io.getstream.chat.android.client.socket.StreamWebSocketEvent.Error) r0
            n23.e r0 = r0.getStreamError()
            r6.L$0 = r2
            r6.label = r5
            java.lang.Object r7 = io.getstream.chat.android.client.socket.ChatSocket.access$handleError(r7, r0, r6)
            if (r7 != r1) goto L71
            goto L70
        L3f:
            boolean r7 = r0 instanceof io.getstream.chat.android.client.socket.StreamWebSocketEvent.Message
            if (r7 == 0) goto L74
            io.getstream.chat.android.client.socket.StreamWebSocketEvent$Message r0 = (io.getstream.chat.android.client.socket.StreamWebSocketEvent.Message) r0
            io.getstream.chat.android.client.events.ChatEvent r7 = r0.getChatEvent()
            boolean r0 = r7 instanceof io.getstream.chat.android.client.events.ConnectionErrorEvent
            if (r0 == 0) goto L62
            io.getstream.chat.android.client.socket.ChatSocket r0 = r6.this$0
            io.getstream.chat.android.client.events.ConnectionErrorEvent r7 = (io.getstream.chat.android.client.events.ConnectionErrorEvent) r7
            n23.c r7 = io.getstream.chat.android.client.socket.ChatSocket.access$toNetworkError(r0, r7)
            r6.L$0 = r2
            r6.L$1 = r2
            r6.label = r4
            java.lang.Object r7 = io.getstream.chat.android.client.socket.ChatSocket.access$handleError(r0, r7, r6)
            if (r7 != r1) goto L71
            goto L70
        L62:
            io.getstream.chat.android.client.socket.ChatSocket r0 = r6.this$0
            r6.L$0 = r2
            r6.L$1 = r2
            r6.label = r3
            java.lang.Object r7 = io.getstream.chat.android.client.socket.ChatSocket.access$handleEvent(r0, r7, r6)
            if (r7 != r1) goto L71
        L70:
            return r1
        L71:
            l83.a0 r7 = l83.C23454a0.f92919a
            return r7
        L74:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.socket.ChatSocket$observeSocketStateService$connectUser$4$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
