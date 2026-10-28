package io.getstream.chat.android.client.internal.state.plugin.listener.internal;

import io.getstream.chat.android.client.api.models.QueryThreadsRequest;
import io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry;
import io.getstream.chat.android.client.plugin.listeners.QueryThreadsListener;
import l83.C23454a0;
import n23.AbstractC26205h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\f\u0010\u000bJ&\u0010\u000f\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryThreadsListenerState;", "Lio/getstream/chat/android/client/plugin/listeners/QueryThreadsListener;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "logic", "<init>", "(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V", "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;", "request", "Ln23/h;", "Ll83/a0;", "onQueryThreadsPrecondition", "(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;", "onQueryThreadsRequest", "Lio/getstream/chat/android/models/QueryThreadsResult;", "result", "onQueryThreadsResult", "(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QueryThreadsListenerState implements QueryThreadsListener {
    private final LogicRegistry logic;

    public QueryThreadsListenerState(LogicRegistry logic) {
        AbstractC22676k.m65750j(logic, "logic");
        this.logic = logic;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.QueryThreadsListener
    public final Object onQueryThreadsPrecondition(QueryThreadsRequest queryThreadsRequest, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return this.logic.threads(queryThreadsRequest).onQueryThreadsPrecondition$stream_chat_android_client_release(queryThreadsRequest);
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.QueryThreadsListener
    public final Object onQueryThreadsRequest(QueryThreadsRequest queryThreadsRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objOnQueryThreadsRequest$stream_chat_android_client_release = this.logic.threads(queryThreadsRequest).onQueryThreadsRequest$stream_chat_android_client_release(queryThreadsRequest, interfaceC30057d);
        return objOnQueryThreadsRequest$stream_chat_android_client_release == EnumC31071a.f128113w ? objOnQueryThreadsRequest$stream_chat_android_client_release : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.QueryThreadsListener
    public final Object onQueryThreadsResult(AbstractC26205h abstractC26205h, QueryThreadsRequest queryThreadsRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objOnQueryThreadsResult$stream_chat_android_client_release = this.logic.threads(queryThreadsRequest).onQueryThreadsResult$stream_chat_android_client_release(abstractC26205h, queryThreadsRequest, interfaceC30057d);
        return objOnQueryThreadsResult$stream_chat_android_client_release == EnumC31071a.f128113w ? objOnQueryThreadsResult$stream_chat_android_client_release : C23454a0.f92919a;
    }
}
