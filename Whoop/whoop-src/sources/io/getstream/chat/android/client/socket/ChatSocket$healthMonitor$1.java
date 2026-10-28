package io.getstream.chat.android.client.socket;

import io.getstream.chat.android.client.events.ConnectedEvent;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.socket.ChatSocket$healthMonitor$1", m100430f = "ChatSocket.kt", m100431l = {}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class ChatSocket$healthMonitor$1 extends AbstractC32275i implements Function1 {
    int label;
    final /* synthetic */ ChatSocket this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSocket$healthMonitor$1(ChatSocket chatSocket, InterfaceC30057d<? super ChatSocket$healthMonitor$1> interfaceC30057d) {
        super(1, interfaceC30057d);
        this.this$0 = chatSocket;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
        return new ChatSocket$healthMonitor$1(this.this$0, interfaceC30057d);
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC30057d<? super C23454a0>) obj);
        return C23454a0.f92919a;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        ConnectedEvent event;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        ChatSocketStateService.State currentState = this.this$0.chatSocketStateService.getCurrentState();
        ChatSocketStateService.State.Connected connected = currentState instanceof ChatSocketStateService.State.Connected ? (ChatSocketStateService.State.Connected) currentState : null;
        if (connected != null && (event = connected.getEvent()) != null) {
            ChatSocket chatSocket = this.this$0;
            if (chatSocket.sendEvent$stream_chat_android_client_release(event)) {
                chatSocket.serverClockOffset.onHealthCheckSent$stream_chat_android_client_release();
            }
        }
        return C23454a0.f92919a;
    }

    public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        ChatSocket$healthMonitor$1 chatSocket$healthMonitor$1 = (ChatSocket$healthMonitor$1) create(interfaceC30057d);
        C23454a0 c23454a0 = C23454a0.f92919a;
        chatSocket$healthMonitor$1.invokeSuspend(c23454a0);
        return c23454a0;
    }
}
