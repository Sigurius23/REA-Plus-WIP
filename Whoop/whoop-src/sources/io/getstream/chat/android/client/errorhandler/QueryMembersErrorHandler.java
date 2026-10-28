package io.getstream.chat.android.client.errorhandler;

import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.util.List;
import o23.C27487q;
import o23.InterfaceC27474d;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001Js\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00112\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/errorhandler/QueryMembersErrorHandler;", "", "Lo23/d;", "", "Lio/getstream/chat/android/models/Member;", "originalCall", "", "channelType", "channelId", "", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "Lio/getstream/chat/android/models/FilterObject;", "filter", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "sort", QueryChannelRequest.KEY_MEMBERS, "Lo23/q;", "onQueryMembersError", "(Lo23/d;Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)Lo23/q;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface QueryMembersErrorHandler {
    C27487q onQueryMembersError(InterfaceC27474d originalCall, String channelType, String channelId, int offset, int limit, FilterObject filter, QuerySorter<Member> sort, List<Member> members);
}
