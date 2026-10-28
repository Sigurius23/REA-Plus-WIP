package io.getstream.chat.android.client.plugin.listeners;

import io.getstream.chat.android.client.api.models.QueryThreadsRequest;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import l83.C23454a0;
import n23.AbstractC26205h;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\b\u0010\u0007J&\u0010\u000b\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/plugin/listeners/QueryThreadsListener;", "", "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;", "request", "Ln23/h;", "Ll83/a0;", "onQueryThreadsPrecondition", "(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;", "onQueryThreadsRequest", "Lio/getstream/chat/android/models/QueryThreadsResult;", "result", "onQueryThreadsResult", "(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface QueryThreadsListener {
    Object onQueryThreadsPrecondition(QueryThreadsRequest queryThreadsRequest, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d);

    Object onQueryThreadsRequest(QueryThreadsRequest queryThreadsRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object onQueryThreadsResult(AbstractC26205h abstractC26205h, QueryThreadsRequest queryThreadsRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d);
}
