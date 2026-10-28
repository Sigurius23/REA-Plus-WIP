package io.getstream.chat.android.client.socket;

import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.socket.ChatSocket$healthMonitor$2", m100430f = "ChatSocket.kt", m100431l = {73}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class ChatSocket$healthMonitor$2 extends AbstractC32275i implements Function1 {
    int label;
    final /* synthetic */ ChatSocket this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSocket$healthMonitor$2(ChatSocket chatSocket, InterfaceC30057d<? super ChatSocket$healthMonitor$2> interfaceC30057d) {
        super(1, interfaceC30057d);
        this.this$0 = chatSocket;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
        return new ChatSocket$healthMonitor$2(this.this$0, interfaceC30057d);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            ChatSocketStateService chatSocketStateService = this.this$0.chatSocketStateService;
            this.label = 1;
            if (chatSocketStateService.onWebSocketEventLost(this) == enumC31071a) {
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

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((ChatSocket$healthMonitor$2) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }
}
