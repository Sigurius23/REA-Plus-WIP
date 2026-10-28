package io.getstream.chat.android.client;

import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.ChatClient", m100430f = "ChatClient.kt", m100431l = {838, 839}, m100432m = "setUserWithoutConnectingIfNeeded$stream_chat_android_client_release")
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChatClient$setUserWithoutConnectingIfNeeded$1 extends AbstractC32269c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatClient$setUserWithoutConnectingIfNeeded$1(ChatClient chatClient, InterfaceC30057d<? super ChatClient$setUserWithoutConnectingIfNeeded$1> interfaceC30057d) {
        super(interfaceC30057d);
        this.this$0 = chatClient;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m54536xe26c02ca(this);
    }
}
