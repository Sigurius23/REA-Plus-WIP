package io.getstream.chat.android.client.internal.state.plugin;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.util.Map;
import p127ev.AbstractC13673n;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;", "", "Standard", "Predefined", "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Predefined;", "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Standard;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface QueryChannelsIdentifier {

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003JC\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Predefined;", "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;", "name", "", "filterValues", "", "", "sortValues", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "getName", "()Ljava/lang/String;", "getFilterValues", "()Ljava/util/Map;", "getSortValues", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Predefined implements QueryChannelsIdentifier {
        private final Map<String, Object> filterValues;
        private final String name;
        private final Map<String, Object> sortValues;

        public Predefined(String name, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
            AbstractC22676k.m65750j(name, "name");
            this.name = name;
            this.filterValues = map;
            this.sortValues = map2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Predefined copy$default(Predefined predefined, String str, Map map, Map map2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = predefined.name;
            }
            if ((i13 & 2) != 0) {
                map = predefined.filterValues;
            }
            if ((i13 & 4) != 0) {
                map2 = predefined.sortValues;
            }
            return predefined.copy(str, map, map2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final Map<String, Object> component2() {
            return this.filterValues;
        }

        public final Map<String, Object> component3() {
            return this.sortValues;
        }

        public final Predefined copy(String name, Map<String, ? extends Object> filterValues, Map<String, ? extends Object> sortValues) {
            AbstractC22676k.m65750j(name, "name");
            return new Predefined(name, filterValues, sortValues);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Predefined)) {
                return false;
            }
            Predefined predefined = (Predefined) other;
            return AbstractC22676k.m65745e(this.name, predefined.name) && AbstractC22676k.m65745e(this.filterValues, predefined.filterValues) && AbstractC22676k.m65745e(this.sortValues, predefined.sortValues);
        }

        public final Map<String, Object> getFilterValues() {
            return this.filterValues;
        }

        public final String getName() {
            return this.name;
        }

        public final Map<String, Object> getSortValues() {
            return this.sortValues;
        }

        public final int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            Map<String, Object> map = this.filterValues;
            int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, Object> map2 = this.sortValues;
            return iHashCode2 + (map2 != null ? map2.hashCode() : 0);
        }

        public final String toString() {
            String str = this.name;
            Map<String, Object> map = this.filterValues;
            return AbstractC13673n.m38565l(AbstractC36095b.m114686n("Predefined(name=", str, ", filterValues=", ", sortValues=", map), this.sortValues, ")");
        }
    }

    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Standard;", "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;", "filter", "Lio/getstream/chat/android/models/FilterObject;", "sort", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/Channel;", "<init>", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)V", "getFilter", "()Lio/getstream/chat/android/models/FilterObject;", "getSort", "()Lio/getstream/chat/android/models/querysort/QuerySorter;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Standard implements QueryChannelsIdentifier {
        private final FilterObject filter;
        private final QuerySorter<Channel> sort;

        public Standard(FilterObject filter, QuerySorter<Channel> sort) {
            AbstractC22676k.m65750j(filter, "filter");
            AbstractC22676k.m65750j(sort, "sort");
            this.filter = filter;
            this.sort = sort;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Standard copy$default(Standard standard, FilterObject filterObject, QuerySorter querySorter, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                filterObject = standard.filter;
            }
            if ((i13 & 2) != 0) {
                querySorter = standard.sort;
            }
            return standard.copy(filterObject, querySorter);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final FilterObject getFilter() {
            return this.filter;
        }

        public final QuerySorter<Channel> component2() {
            return this.sort;
        }

        public final Standard copy(FilterObject filter, QuerySorter<Channel> sort) {
            AbstractC22676k.m65750j(filter, "filter");
            AbstractC22676k.m65750j(sort, "sort");
            return new Standard(filter, sort);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Standard)) {
                return false;
            }
            Standard standard = (Standard) other;
            return AbstractC22676k.m65745e(this.filter, standard.filter) && AbstractC22676k.m65745e(this.sort, standard.sort);
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
            return "Standard(filter=" + this.filter + ", sort=" + this.sort + ")";
        }
    }
}
