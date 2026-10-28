package io.getstream.chat.android.client.socket;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.InterfaceC13037f2;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: io.getstream.chat.android.client.socket.ChatSocket$awaitConnection$$inlined$awaitState$stream_chat_android_client_release$1 */
/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.socket.ChatSocket$awaitState$2", m100430f = "ChatSocket.kt", m100431l = {299}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lbc3/c0;", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;", "<anonymous>", "(Lbc3/c0;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;", "io/getstream/chat/android/client/socket/ChatSocket$awaitState$2"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class C19429xc620f2cd extends AbstractC32275i implements InterfaceC4351m {
    int label;
    final /* synthetic */ ChatSocket this$0;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.socket.ChatSocket$awaitConnection$$inlined$awaitState$stream_chat_android_client_release$1$1, reason: invalid class name */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.socket.ChatSocket$awaitState$2$1", m100430f = "ChatSocket.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¨\u0006\u0004"}, m65681d2 = {"<anonymous>", "", "it", "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;", "io/getstream/chat/android/client/socket/ChatSocket$awaitState$2$1"}, m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class AnonymousClass1 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(InterfaceC30057d interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, interfaceC30057d);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(ChatSocketStateService.State state, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((AnonymousClass1) create(state, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ChatSocketStateService.State state = (ChatSocketStateService.State) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return Boolean.valueOf(state instanceof ChatSocketStateService.State.Connected);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19429xc620f2cd(ChatSocket chatSocket, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = chatSocket;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new C19429xc620f2cd(this.this$0, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super ChatSocketStateService.State> interfaceC30057d) {
        return ((C19429xc620f2cd) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
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
        InterfaceC13037f2 currentStateFlow = this.this$0.chatSocketStateService.getCurrentStateFlow();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, null);
        this.label = 1;
        Object objM36616z = AbstractC13091v.m36616z(currentStateFlow, anonymousClass1, this);
        return objM36616z == enumC31071a ? enumC31071a : objM36616z;
    }
}
