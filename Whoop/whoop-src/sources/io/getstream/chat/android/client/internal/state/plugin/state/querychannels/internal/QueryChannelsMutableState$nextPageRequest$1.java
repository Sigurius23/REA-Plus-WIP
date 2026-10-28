package io.getstream.chat.android.client.internal.state.plugin.state.querychannels.internal;

import io.getstream.chat.android.client.api.models.QueryChannelsRequest;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.plugin.state.querychannels.internal.QueryChannelsMutableState$nextPageRequest$1", m100430f = "QueryChannelsMutableState.kt", m100431l = {}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m65681d2 = {"<anonymous>", "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;", "currentRequest", "currentOffset", ""}, m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QueryChannelsMutableState$nextPageRequest$1 extends AbstractC32275i implements Function3 {
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    int label;

    public QueryChannelsMutableState$nextPageRequest$1(InterfaceC30057d<? super QueryChannelsMutableState$nextPageRequest$1> interfaceC30057d) {
        super(3, interfaceC30057d);
    }

    public final Object invoke(QueryChannelsRequest queryChannelsRequest, int i13, InterfaceC30057d<? super QueryChannelsRequest> interfaceC30057d) {
        QueryChannelsMutableState$nextPageRequest$1 queryChannelsMutableState$nextPageRequest$1 = new QueryChannelsMutableState$nextPageRequest$1(3, interfaceC30057d);
        queryChannelsMutableState$nextPageRequest$1.L$0 = queryChannelsRequest;
        queryChannelsMutableState$nextPageRequest$1.I$0 = i13;
        return queryChannelsMutableState$nextPageRequest$1.invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        QueryChannelsRequest queryChannelsRequest = (QueryChannelsRequest) this.L$0;
        int i13 = this.I$0;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        if (queryChannelsRequest != null) {
            return QueryChannelsRequest.copy$default(queryChannelsRequest, null, i13, 0, null, null, null, null, null, null, 509, null);
        }
        return null;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((QueryChannelsRequest) obj, ((Number) obj2).intValue(), (InterfaceC30057d<? super QueryChannelsRequest>) obj3);
    }
}
