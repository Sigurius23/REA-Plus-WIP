package io.getstream.chat.android.client.internal.state.plugin;

import io.getstream.chat.android.client.api.models.QueryChannelsRequest;
import io.getstream.chat.android.client.query.QueryChannelsSpec;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u001a(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b*\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u000b"}, m65681d2 = {"identifier", "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;", "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;", "getIdentifier", "(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;", "Lio/getstream/chat/android/client/query/QueryChannelsSpec;", "(Lio/getstream/chat/android/client/query/QueryChannelsSpec;)Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;", "normalizedIdentifierValues", "", "", "", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QueryChannelsIdentifierKt {
    public static final QueryChannelsIdentifier getIdentifier(QueryChannelsRequest queryChannelsRequest) {
        AbstractC22676k.m65750j(queryChannelsRequest, "<this>");
        String predefinedFilter = queryChannelsRequest.getPredefinedFilter();
        return predefinedFilter == null ? new QueryChannelsIdentifier.Standard(queryChannelsRequest.getFilter(), queryChannelsRequest.getQuerySort()) : new QueryChannelsIdentifier.Predefined(predefinedFilter, normalizedIdentifierValues(queryChannelsRequest.getFilterValues()), normalizedIdentifierValues(queryChannelsRequest.getSortValues()));
    }

    private static final Map<String, Object> normalizedIdentifierValues(Map<String, ? extends Object> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        return map;
    }

    public static final QueryChannelsIdentifier getIdentifier(QueryChannelsSpec queryChannelsSpec) {
        AbstractC22676k.m65750j(queryChannelsSpec, "<this>");
        String predefinedFilterName = queryChannelsSpec.getPredefinedFilterName();
        if (predefinedFilterName == null) {
            return new QueryChannelsIdentifier.Standard(queryChannelsSpec.getFilter(), queryChannelsSpec.getQuerySort());
        }
        return new QueryChannelsIdentifier.Predefined(predefinedFilterName, normalizedIdentifierValues(queryChannelsSpec.getPredefinedFilterValues()), normalizedIdentifierValues(queryChannelsSpec.getPredefinedSortValues()));
    }
}
