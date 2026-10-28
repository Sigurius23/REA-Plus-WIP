package io.getstream.chat.android.client.api.models;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.querysort.QuerySorter;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/client/api/models/PredefinedFilter;", "", "filter", "Lio/getstream/chat/android/models/FilterObject;", "sort", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/Channel;", "<init>", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)V", "getFilter", "()Lio/getstream/chat/android/models/FilterObject;", "getSort", "()Lio/getstream/chat/android/models/querysort/QuerySorter;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class PredefinedFilter {
    private final FilterObject filter;
    private final QuerySorter<Channel> sort;

    public PredefinedFilter(FilterObject filter, QuerySorter<Channel> sort) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        this.filter = filter;
        this.sort = sort;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PredefinedFilter copy$default(PredefinedFilter predefinedFilter, FilterObject filterObject, QuerySorter querySorter, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            filterObject = predefinedFilter.filter;
        }
        if ((i13 & 2) != 0) {
            querySorter = predefinedFilter.sort;
        }
        return predefinedFilter.copy(filterObject, querySorter);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FilterObject getFilter() {
        return this.filter;
    }

    public final QuerySorter<Channel> component2() {
        return this.sort;
    }

    public final PredefinedFilter copy(FilterObject filter, QuerySorter<Channel> sort) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        return new PredefinedFilter(filter, sort);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PredefinedFilter)) {
            return false;
        }
        PredefinedFilter predefinedFilter = (PredefinedFilter) other;
        return AbstractC22676k.m65745e(this.filter, predefinedFilter.filter) && AbstractC22676k.m65745e(this.sort, predefinedFilter.sort);
    }

    public final FilterObject getFilter() {
        return this.filter;
    }

    public final QuerySorter<Channel> getSort() {
        return this.sort;
    }

    public final int hashCode() {
        return this.sort.hashCode() + (this.filter.hashCode() * 31);
    }

    public final String toString() {
        return "PredefinedFilter(filter=" + this.filter + ", sort=" + this.sort + ")";
    }
}
