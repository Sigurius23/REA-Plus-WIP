package io.getstream.chat.android.client.errorhandler;

import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.util.Iterator;
import java.util.List;
import o23.InterfaceC27474d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a}\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lo23/d;", "", "Lio/getstream/chat/android/models/Member;", "Lio/getstream/chat/android/client/errorhandler/QueryMembersErrorHandler;", "errorHandlers", "", "channelType", "channelId", "", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "Lio/getstream/chat/android/models/FilterObject;", "filter", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "sort", QueryChannelRequest.KEY_MEMBERS, "onQueryMembersError", "(Lo23/d;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)Lo23/d;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QueryMembersErrorHandlerKt {
    public static final InterfaceC27474d onQueryMembersError(InterfaceC27474d interfaceC27474d, List<? extends QueryMembersErrorHandler> errorHandlers, String channelType, String channelId, int i13, int i14, FilterObject filterObject, QuerySorter<Member> querySorter, List<Member> list) {
        AbstractC22676k.m65750j(interfaceC27474d, "<this>");
        AbstractC22676k.m65750j(errorHandlers, "errorHandlers");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        FilterObject filter = filterObject;
        AbstractC22676k.m65750j(filter, "filter");
        QuerySorter<Member> sort = querySorter;
        AbstractC22676k.m65750j(sort, "sort");
        List<Member> members = list;
        AbstractC22676k.m65750j(members, "members");
        Iterator<T> it = errorHandlers.iterator();
        InterfaceC27474d interfaceC27474dOnQueryMembersError = interfaceC27474d;
        while (it.hasNext()) {
            interfaceC27474dOnQueryMembersError = ((QueryMembersErrorHandler) it.next()).onQueryMembersError(interfaceC27474dOnQueryMembersError, channelType, channelId, i13, i14, filter, sort, members);
            filter = filterObject;
            sort = querySorter;
            members = list;
        }
        return interfaceC27474dOnQueryMembersError;
    }
}
