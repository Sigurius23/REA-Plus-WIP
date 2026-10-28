package io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal;

import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsDatabaseLogic", m100430f = "QueryChannelsDatabaseLogic.kt", m100431l = {64, 66}, m100432m = "fetchChannelsFromCache$stream_chat_android_client_release")
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QueryChannelsDatabaseLogic$fetchChannelsFromCache$1 extends AbstractC32269c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ QueryChannelsDatabaseLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryChannelsDatabaseLogic$fetchChannelsFromCache$1(QueryChannelsDatabaseLogic queryChannelsDatabaseLogic, InterfaceC30057d<? super QueryChannelsDatabaseLogic$fetchChannelsFromCache$1> interfaceC30057d) {
        super(interfaceC30057d);
        this.this$0 = queryChannelsDatabaseLogic;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchChannelsFromCache$stream_chat_android_client_release(null, null, this);
    }
}
