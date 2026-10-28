package io.getstream.chat.android.client.api2.model.response;

import c13.AbstractC3855a;
import java.util.List;
import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005\u0018\u00010\u0007HÆ\u0003JG\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR%\u0010\u0006\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/response/ParsedPredefinedFilterResponse;", "", "name", "", "filter", "", "sort", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getFilter", "()Ljava/util/Map;", "getSort", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ParsedPredefinedFilterResponse {
    private final Map<String, Object> filter;
    private final String name;
    private final List<Map<String, Object>> sort;

    /* JADX WARN: Multi-variable type inference failed */
    public ParsedPredefinedFilterResponse(String name, Map<String, ? extends Object> filter, List<? extends Map<String, ? extends Object>> list) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(filter, "filter");
        this.name = name;
        this.filter = filter;
        this.sort = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ParsedPredefinedFilterResponse copy$default(ParsedPredefinedFilterResponse parsedPredefinedFilterResponse, String str, Map map, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = parsedPredefinedFilterResponse.name;
        }
        if ((i13 & 2) != 0) {
            map = parsedPredefinedFilterResponse.filter;
        }
        if ((i13 & 4) != 0) {
            list = parsedPredefinedFilterResponse.sort;
        }
        return parsedPredefinedFilterResponse.copy(str, map, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final Map<String, Object> component2() {
        return this.filter;
    }

    public final List<Map<String, Object>> component3() {
        return this.sort;
    }

    public final ParsedPredefinedFilterResponse copy(String name, Map<String, ? extends Object> filter, List<? extends Map<String, ? extends Object>> sort) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(filter, "filter");
        return new ParsedPredefinedFilterResponse(name, filter, sort);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParsedPredefinedFilterResponse)) {
            return false;
        }
        ParsedPredefinedFilterResponse parsedPredefinedFilterResponse = (ParsedPredefinedFilterResponse) other;
        return AbstractC22676k.m65745e(this.name, parsedPredefinedFilterResponse.name) && AbstractC22676k.m65745e(this.filter, parsedPredefinedFilterResponse.filter) && AbstractC22676k.m65745e(this.sort, parsedPredefinedFilterResponse.sort);
    }

    public final Map<String, Object> getFilter() {
        return this.filter;
    }

    public final String getName() {
        return this.name;
    }

    public final List<Map<String, Object>> getSort() {
        return this.sort;
    }

    public int hashCode() {
        int iM11821e = AbstractC3855a.m11821e(this.filter, this.name.hashCode() * 31, 31);
        List<Map<String, Object>> list = this.sort;
        return iM11821e + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        String str = this.name;
        Map<String, Object> map = this.filter;
        return AbstractC3855a.m11829m(AbstractC36095b.m114686n("ParsedPredefinedFilterResponse(name=", str, ", filter=", ", sort=", map), this.sort, ")");
    }

    public /* synthetic */ ParsedPredefinedFilterResponse(String str, Map map, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i13 & 4) != 0 ? null : list);
    }
}
