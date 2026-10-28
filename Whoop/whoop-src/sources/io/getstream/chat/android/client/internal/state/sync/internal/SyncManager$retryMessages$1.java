package io.getstream.chat.android.client.internal.state.sync.internal;

import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.sync.internal.SyncManager", m100430f = "SyncManager.kt", m100431l = {544, 545}, m100432m = "retryMessages$stream_chat_android_client_release")
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SyncManager$retryMessages$1 extends AbstractC32269c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SyncManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncManager$retryMessages$1(SyncManager syncManager, InterfaceC30057d<? super SyncManager$retryMessages$1> interfaceC30057d) {
        super(interfaceC30057d);
        this.this$0 = syncManager;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.retryMessages$stream_chat_android_client_release(this);
    }
}
