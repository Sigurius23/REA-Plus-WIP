package io.getstream.chat.android.client.plugin.listeners;

import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.DraftMessage;
import io.getstream.chat.android.models.DraftsSort;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.querysort.QuerySorter;
import l83.C23454a0;
import n23.AbstractC26205h;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J6\u0010\n\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H¦@¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\f\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H¦@¢\u0006\u0004\b\f\u0010\u000bJF\u0010\u0016\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H¦@¢\u0006\u0004\b\u0016\u0010\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;", "", "Ln23/h;", "Lio/getstream/chat/android/models/DraftMessage;", "result", "", "channelType", "channelId", "message", "Ll83/a0;", "onCreateDraftMessageResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;", "onDeleteDraftMessagesResult", "Lio/getstream/chat/android/models/QueryDraftsResult;", "Lio/getstream/chat/android/models/FilterObject;", "filter", "", MapboxMap.QFE_LIMIT, "next", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/DraftsSort;", "sort", "onQueryDraftMessagesResult", "(Ln23/h;Lio/getstream/chat/android/models/FilterObject;ILjava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;Lq83/d;)Ljava/lang/Object;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface DraftMessageListener {
    Object onCreateDraftMessageResult(AbstractC26205h abstractC26205h, String str, String str2, DraftMessage draftMessage, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object onDeleteDraftMessagesResult(AbstractC26205h abstractC26205h, String str, String str2, DraftMessage draftMessage, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object onQueryDraftMessagesResult(AbstractC26205h abstractC26205h, FilterObject filterObject, int i13, String str, QuerySorter<DraftsSort> querySorter, InterfaceC30057d<? super C23454a0> interfaceC30057d);
}
