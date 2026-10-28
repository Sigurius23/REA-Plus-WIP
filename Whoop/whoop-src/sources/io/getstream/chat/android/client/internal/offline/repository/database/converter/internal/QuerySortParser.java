package io.getstream.chat.android.client.internal.offline.repository.database.converter.internal;

import io.getstream.chat.android.models.querysort.ComparableFieldProvider;
import io.getstream.chat.android.models.querysort.QuerySortByField;
import io.getstream.chat.android.models.querysort.QuerySorter;
import io.getstream.chat.android.models.querysort.SortDirection;
import io.getstream.chat.android.models.querysort.internal.SortSpecification;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\n0\tH\u0000¢\u0006\u0002\b\fJ \u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\tJ.\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/QuerySortParser;", "T", "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;", "", "<init>", "()V", "fromRawInfo", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "specs", "", "", "", "fromRawInfo$stream_chat_android_client_release", "fromSpecifications", "Lio/getstream/chat/android/models/querysort/internal/SortSpecification;", "createQuerySort", "Lio/getstream/chat/android/models/querysort/QuerySortByField;", "querySort", "fieldName", "direction", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QuerySortParser<T extends ComparableFieldProvider> {
    private final QuerySortByField<T> createQuerySort(QuerySortByField<T> querySort, String fieldName, int direction) {
        if (direction == SortDirection.ASC.getValue()) {
            return querySort.asc(fieldName);
        }
        if (direction == SortDirection.DESC.getValue()) {
            return querySort.desc(fieldName);
        }
        return null;
    }

    public final QuerySorter<T> fromRawInfo$stream_chat_android_client_release(List<? extends Map<String, ? extends Object>> specs) {
        AbstractC22676k.m65750j(specs, "specs");
        QuerySortByField<T> querySortByField = new QuerySortByField<>();
        Iterator<T> it = specs.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            Object obj = map.get("field");
            String str = obj instanceof String ? (String) obj : null;
            if (str == null) {
                throw new IllegalStateException(("Cannot parse sortSpec to query sort\n" + map).toString());
            }
            Object obj2 = map.get("direction");
            Number number = obj2 instanceof Number ? (Number) obj2 : null;
            if (number == null) {
                throw new IllegalStateException(("Cannot parse sortSpec to query sort\n" + map).toString());
            }
            querySortByField = createQuerySort(querySortByField, str, number.intValue());
            if (querySortByField == null) {
                throw new IllegalStateException(("Cannot parse sortSpec to query sort: " + map).toString());
            }
        }
        return querySortByField;
    }

    public final QuerySorter<T> fromSpecifications(List<SortSpecification<T>> specs) {
        AbstractC22676k.m65750j(specs, "specs");
        QuerySortByField<T> querySortByField = new QuerySortByField<>();
        Iterator<T> it = specs.iterator();
        while (it.hasNext()) {
            SortSpecification sortSpecification = (SortSpecification) it.next();
            querySortByField = createQuerySort(querySortByField, sortSpecification.getSortAttribute().getName(), sortSpecification.getSortDirection().getValue());
            if (querySortByField == null) {
                throw new IllegalStateException(("Cannot parse sortSpec to query sort: " + sortSpecification).toString());
            }
        }
        return querySortByField;
    }
}
