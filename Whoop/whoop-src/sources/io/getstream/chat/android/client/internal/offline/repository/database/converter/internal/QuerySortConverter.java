package io.getstream.chat.android.client.internal.offline.repository.database.converter.internal;

import com.squareup.moshi.JsonAdapter;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.querysort.QuerySortByField;
import io.getstream.chat.android.models.querysort.QuerySorter;
import io.getstream.chat.android.models.querysort.SortDirection;
import j93.C21462d0;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p441qx.C30722l0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.AbstractC34924m;
import x43.AbstractC37978j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0007J(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00070\u0006H\u0002J\u0018\u0010\u0010\u001a\u0004\u0018\u00010\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007R,\u0010\u0004\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00070\u00060\u0005X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0003¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/QuerySortConverter;", "", "<init>", "()V", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "", "", "", "getAdapter$annotations", "stringToObject", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/Channel;", "data", "parseQuerySort", "listOfSortSpec", "objectToString", "querySort", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QuerySortConverter {
    private final JsonAdapter<List<Map<String, Object>>> adapter;

    public QuerySortConverter() {
        C30722l0 moshi = ConverterMoshiInstanceKt.getMoshi();
        C21462d0 c21462d0 = C21462d0.f82423c;
        this.adapter = AbstractC34924m.m110152m(moshi, AbstractC22671h0.m65692e(List.class, AbstractC37978j.m121626I(AbstractC22671h0.m65690c(AbstractC37978j.m121626I(AbstractC22671h0.m65691d(String.class)), AbstractC37978j.m121626I(AbstractC22671h0.m65691d(Object.class))))));
    }

    private static /* synthetic */ void getAdapter$annotations() {
    }

    private final QuerySorter<Channel> parseQuerySort(List<? extends Map<String, ? extends Object>> listOfSortSpec) {
        QuerySortByField querySortByField = new QuerySortByField();
        Iterator<T> it = listOfSortSpec.iterator();
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
            int iIntValue = number.intValue();
            if (iIntValue == SortDirection.ASC.getValue()) {
                querySortByField = querySortByField.asc(str);
            } else {
                if (iIntValue != SortDirection.DESC.getValue()) {
                    throw new IllegalStateException(("Cannot parse sortSpec to query sort\n" + map).toString());
                }
                querySortByField = querySortByField.desc(str);
            }
        }
        return querySortByField;
    }

    public final String objectToString(QuerySorter<Channel> querySort) {
        AbstractC22676k.m65750j(querySort, "querySort");
        return this.adapter.toJson(querySort.toDto());
    }

    public final QuerySorter<Channel> stringToObject(String data) throws IOException {
        QuerySorter<Channel> querySort;
        if (data == null || data.length() == 0) {
            return new QuerySortByField();
        }
        List<Map<String, Object>> listFromJson = this.adapter.fromJson(data);
        return (listFromJson == null || (querySort = parseQuerySort(listFromJson)) == null) ? new QuerySortByField() : querySort;
    }
}
