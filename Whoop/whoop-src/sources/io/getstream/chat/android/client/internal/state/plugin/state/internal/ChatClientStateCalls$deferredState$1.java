package io.getstream.chat.android.client.internal.state.plugin.state.internal;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.InterfaceC13037f2;
import io.getstream.chat.android.client.api.state.ChatClientExtensions;
import io.getstream.chat.android.client.api.state.StateRegistry;
import io.getstream.chat.android.models.User;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.plugin.state.internal.ChatClientStateCalls$deferredState$1", m100430f = "ChatClientStateCalls.kt", m100431l = {58}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lio/getstream/chat/android/client/api/state/StateRegistry;", "<anonymous>", "(Lbc3/c0;)Lio/getstream/chat/android/client/api/state/StateRegistry;"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class ChatClientStateCalls$deferredState$1 extends AbstractC32275i implements InterfaceC4351m {
    int label;
    final /* synthetic */ ChatClientStateCalls this$0;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.state.internal.ChatClientStateCalls$deferredState$1$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.plugin.state.internal.ChatClientStateCalls$deferredState$1$1", m100430f = "ChatClientStateCalls.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m65681d2 = {"<anonymous>", "", "it", "Lio/getstream/chat/android/models/User;"}, m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193451 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ Object L$0;
        int label;

        public C193451(InterfaceC30057d<? super C193451> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C193451 c193451 = new C193451(2, interfaceC30057d);
            c193451.L$0 = obj;
            return c193451;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(User user, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((C193451) create(user, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            User user = (User) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return Boolean.valueOf(user != null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatClientStateCalls$deferredState$1(ChatClientStateCalls chatClientStateCalls, InterfaceC30057d<? super ChatClientStateCalls$deferredState$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = chatClientStateCalls;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new ChatClientStateCalls$deferredState$1(this.this$0, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super StateRegistry> interfaceC30057d) {
        return ((ChatClientStateCalls$deferredState$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC13037f2 user = this.this$0.chatClient.getClientState().getUser();
            C193451 c193451 = new C193451(2, null);
            this.label = 1;
            if (AbstractC13091v.m36616z(user, c193451, this) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return ChatClientExtensions.getState(this.this$0.chatClient);
    }
}
