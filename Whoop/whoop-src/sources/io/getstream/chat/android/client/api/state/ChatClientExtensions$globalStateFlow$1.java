package io.getstream.chat.android.client.api.state;

import b23.C2343i;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import c93.InterfaceC4351m;
import io.getstream.chat.android.models.InitializationState;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.api.state.ChatClientExtensions$globalStateFlow$1", m100430f = "ChatClientStateExtensions.kt", m100431l = {}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/models/InitializationState;", "it", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/models/InitializationState;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class ChatClientExtensions$globalStateFlow$1 extends AbstractC32275i implements InterfaceC4351m {
    /* synthetic */ Object L$0;
    int label;

    public ChatClientExtensions$globalStateFlow$1(InterfaceC30057d<? super ChatClientExtensions$globalStateFlow$1> interfaceC30057d) {
        super(2, interfaceC30057d);
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        ChatClientExtensions$globalStateFlow$1 chatClientExtensions$globalStateFlow$1 = new ChatClientExtensions$globalStateFlow$1(2, interfaceC30057d);
        chatClientExtensions$globalStateFlow$1.L$0 = obj;
        return chatClientExtensions$globalStateFlow$1;
    }

    public final Object invoke(InitializationState initializationState, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        ChatClientExtensions$globalStateFlow$1 chatClientExtensions$globalStateFlow$1 = (ChatClientExtensions$globalStateFlow$1) create(initializationState, interfaceC30057d);
        C23454a0 c23454a0 = C23454a0.f92919a;
        chatClientExtensions$globalStateFlow$1.invokeSuspend(c23454a0);
        return c23454a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        InitializationState initializationState = (InitializationState) this.L$0;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        if (initializationState == InitializationState.NOT_INITIALIZED) {
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e = C2343i.f9272d;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, "Chat:Client-StatePlugin")) {
                C2343i.f9271c.log(enumC2341g, "Chat:Client-StatePlugin", "ChatClient::connectUser() must be called to ensure the globalState is initialized", null);
            }
        }
        return C23454a0.f92919a;
    }

    @Override // c93.InterfaceC4351m
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InitializationState) obj, (InterfaceC30057d<? super C23454a0>) obj2);
        return C23454a0.f92919a;
    }
}
