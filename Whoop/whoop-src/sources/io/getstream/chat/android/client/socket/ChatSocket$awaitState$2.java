package io.getstream.chat.android.client.socket;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.socket.ChatSocket$awaitState$2", m100430f = "ChatSocket.kt", m100431l = {299}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;", "<anonymous>", "(Lbc3/c0;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class ChatSocket$awaitState$2 extends AbstractC32275i implements InterfaceC4351m {
    int label;
    final /* synthetic */ ChatSocket this$0;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.socket.ChatSocket$awaitState$2$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.socket.ChatSocket$awaitState$2$1", m100430f = "ChatSocket.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m65681d2 = {"<anonymous>", "", "it", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;"}, m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 176)
    public static final class C194301 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ Object L$0;
        int label;

        public C194301(InterfaceC30057d<? super C194301> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C194301 c194301 = new C194301(2, interfaceC30057d);
            c194301.L$0 = obj;
            return c194301;
        }

        public final Object invoke(ChatSocketStateService.State state, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            ((C194301) create(state, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            throw null;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC22676k.m65756p();
            throw null;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((ChatSocketStateService.State) obj, (InterfaceC30057d<? super Boolean>) obj2);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSocket$awaitState$2(ChatSocket chatSocket, InterfaceC30057d<? super ChatSocket$awaitState$2> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = chatSocket;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new ChatSocket$awaitState$2(this.this$0, interfaceC30057d);
    }

    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super ChatSocketStateService.State> interfaceC30057d) {
        ChatSocket$awaitState$2 chatSocket$awaitState$2 = (ChatSocket$awaitState$2) create(interfaceC2994c0, interfaceC30057d);
        C23454a0 c23454a0 = C23454a0.f92919a;
        chatSocket$awaitState$2.invokeSuspend(c23454a0);
        return c23454a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 != 0) {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        AbstractC34132o.m107864I(obj);
        this.this$0.chatSocketStateService.getCurrentStateFlow();
        AbstractC22676k.m65756p();
        throw null;
    }

    @Override // c93.InterfaceC4351m
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2994c0) obj, (InterfaceC30057d<? super ChatSocketStateService.State>) obj2);
        return C23454a0.f92919a;
    }
}
