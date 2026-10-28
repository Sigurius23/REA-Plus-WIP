package an0;

import c13.AbstractC3855a;
import com.whoop.design.models.calendar.archmini.CalendarDayModel;
import com.whoop.design.models.calendar.archmini.CalendarHeaderModel;
import com.whoop.design.models.items.graph.GraphLegendModel;
import com.whoop.navigation.CachePolicyModel;
import com.whoop.navigation.models.ApiRequest;
import h91.C17027b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import m83.C25271y;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: an0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u001a\b\u0002\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0015\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0004\b\u0018\u0010\u0019J¾\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u001a\b\u0002\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00152\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0015HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b1\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b4\u00109\u001a\u0004\b)\u0010:R\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b,\u0010=R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b.\u0010>\u001a\u0004\b0\u0010?R)\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00158\u0006¢\u0006\f\n\u0004\b+\u0010@\u001a\u0004\b2\u0010AR#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u00158\u0006¢\u0006\f\n\u0004\b7\u0010@\u001a\u0004\b;\u0010A¨\u0006B"}, m65681d2 = {"Lan0/a;", "", "", "isLoading", "isError", "", "pageIndex", "loadingMonthIndex", "failedMonthIndex", "Lcom/whoop/design/models/calendar/archmini/CalendarHeaderModel;", "header", "Lcom/whoop/navigation/models/ApiRequest;", "request", "Lcom/whoop/navigation/CachePolicyModel;", "cachePolicy", "Lh91/b;", "Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;", "calendar", "", "Lcom/whoop/design/models/items/graph/GraphLegendModel;", "calendarKey", "", "calendarKeysByMonth", "headersByMonth", "<init>", "(ZZILjava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/design/models/calendar/archmini/CalendarHeaderModel;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Lh91/b;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V", "a", "(ZZILjava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/design/models/calendar/archmini/CalendarHeaderModel;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Lh91/b;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Lan0/a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "n", "()Z", "b", "m", "c", "I", "k", "d", "Ljava/lang/Integer;", "j", "()Ljava/lang/Integer;", "e", "g", "f", "Lcom/whoop/design/models/calendar/archmini/CalendarHeaderModel;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/models/calendar/archmini/CalendarHeaderModel;", "Lcom/whoop/navigation/models/ApiRequest;", "l", "()Lcom/whoop/navigation/models/ApiRequest;", "Lcom/whoop/navigation/CachePolicyModel;", "()Lcom/whoop/navigation/CachePolicyModel;", "i", "Lh91/b;", "()Lh91/b;", "Ljava/util/List;", "()Ljava/util/List;", "Ljava/util/Map;", "()Ljava/util/Map;", "calendar-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C1056a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int pageIndex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Integer loadingMonthIndex;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Integer failedMonthIndex;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final CalendarHeaderModel header;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final ApiRequest request;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final CachePolicyModel cachePolicy;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C17027b<CalendarDayModel> calendar;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final List<GraphLegendModel> calendarKey;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Map<Integer, List<GraphLegendModel>> calendarKeysByMonth;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final Map<Integer, CalendarHeaderModel> headersByMonth;

    /* JADX WARN: Multi-variable type inference failed */
    public C1056a(boolean z4, boolean z13, int i13, Integer num, Integer num2, CalendarHeaderModel calendarHeaderModel, ApiRequest apiRequest, CachePolicyModel cachePolicyModel, C17027b<CalendarDayModel> c17027b, List<GraphLegendModel> calendarKey, Map<Integer, ? extends List<GraphLegendModel>> calendarKeysByMonth, Map<Integer, CalendarHeaderModel> headersByMonth) {
        AbstractC22676k.m65750j(calendarKey, "calendarKey");
        AbstractC22676k.m65750j(calendarKeysByMonth, "calendarKeysByMonth");
        AbstractC22676k.m65750j(headersByMonth, "headersByMonth");
        this.isLoading = z4;
        this.isError = z13;
        this.pageIndex = i13;
        this.loadingMonthIndex = num;
        this.failedMonthIndex = num2;
        this.header = calendarHeaderModel;
        this.request = apiRequest;
        this.cachePolicy = cachePolicyModel;
        this.calendar = c17027b;
        this.calendarKey = calendarKey;
        this.calendarKeysByMonth = calendarKeysByMonth;
        this.headersByMonth = headersByMonth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C1056a m3117b(C1056a c1056a, boolean z4, boolean z13, int i13, Integer num, Integer num2, CalendarHeaderModel calendarHeaderModel, ApiRequest apiRequest, CachePolicyModel cachePolicyModel, C17027b c17027b, List list, Map map, Map map2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z4 = c1056a.isLoading;
        }
        if ((i14 & 2) != 0) {
            z13 = c1056a.isError;
        }
        if ((i14 & 4) != 0) {
            i13 = c1056a.pageIndex;
        }
        if ((i14 & 8) != 0) {
            num = c1056a.loadingMonthIndex;
        }
        if ((i14 & 16) != 0) {
            num2 = c1056a.failedMonthIndex;
        }
        if ((i14 & 32) != 0) {
            calendarHeaderModel = c1056a.header;
        }
        if ((i14 & 64) != 0) {
            apiRequest = c1056a.request;
        }
        if ((i14 & 128) != 0) {
            cachePolicyModel = c1056a.cachePolicy;
        }
        if ((i14 & 256) != 0) {
            c17027b = c1056a.calendar;
        }
        if ((i14 & 512) != 0) {
            list = c1056a.calendarKey;
        }
        if ((i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            map = c1056a.calendarKeysByMonth;
        }
        if ((i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            map2 = c1056a.headersByMonth;
        }
        Map map3 = map;
        Map map4 = map2;
        C17027b c17027b2 = c17027b;
        List list2 = list;
        ApiRequest apiRequest2 = apiRequest;
        CachePolicyModel cachePolicyModel2 = cachePolicyModel;
        Integer num3 = num2;
        CalendarHeaderModel calendarHeaderModel2 = calendarHeaderModel;
        return c1056a.m3118a(z4, z13, i13, num, num3, calendarHeaderModel2, apiRequest2, cachePolicyModel2, c17027b2, list2, map3, map4);
    }

    /* JADX INFO: renamed from: a */
    public final C1056a m3118a(boolean isLoading, boolean isError, int pageIndex, Integer loadingMonthIndex, Integer failedMonthIndex, CalendarHeaderModel header, ApiRequest request, CachePolicyModel cachePolicy, C17027b<CalendarDayModel> calendar, List<GraphLegendModel> calendarKey, Map<Integer, ? extends List<GraphLegendModel>> calendarKeysByMonth, Map<Integer, CalendarHeaderModel> headersByMonth) {
        AbstractC22676k.m65750j(calendarKey, "calendarKey");
        AbstractC22676k.m65750j(calendarKeysByMonth, "calendarKeysByMonth");
        AbstractC22676k.m65750j(headersByMonth, "headersByMonth");
        return new C1056a(isLoading, isError, pageIndex, loadingMonthIndex, failedMonthIndex, header, request, cachePolicy, calendar, calendarKey, calendarKeysByMonth, headersByMonth);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final CachePolicyModel getCachePolicy() {
        return this.cachePolicy;
    }

    /* JADX INFO: renamed from: d */
    public final C17027b<CalendarDayModel> m3120d() {
        return this.calendar;
    }

    /* JADX INFO: renamed from: e */
    public final List<GraphLegendModel> m3121e() {
        return this.calendarKey;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C1056a)) {
            return false;
        }
        C1056a c1056a = (C1056a) other;
        return this.isLoading == c1056a.isLoading && this.isError == c1056a.isError && this.pageIndex == c1056a.pageIndex && AbstractC22676k.m65745e(this.loadingMonthIndex, c1056a.loadingMonthIndex) && AbstractC22676k.m65745e(this.failedMonthIndex, c1056a.failedMonthIndex) && AbstractC22676k.m65745e(this.header, c1056a.header) && AbstractC22676k.m65745e(this.request, c1056a.request) && AbstractC22676k.m65745e(this.cachePolicy, c1056a.cachePolicy) && AbstractC22676k.m65745e(this.calendar, c1056a.calendar) && AbstractC22676k.m65745e(this.calendarKey, c1056a.calendarKey) && AbstractC22676k.m65745e(this.calendarKeysByMonth, c1056a.calendarKeysByMonth) && AbstractC22676k.m65745e(this.headersByMonth, c1056a.headersByMonth);
    }

    /* JADX INFO: renamed from: f */
    public final Map<Integer, List<GraphLegendModel>> m3122f() {
        return this.calendarKeysByMonth;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getFailedMonthIndex() {
        return this.failedMonthIndex;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final CalendarHeaderModel getHeader() {
        return this.header;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.pageIndex, AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isError), 31);
        Integer num = this.loadingMonthIndex;
        int iHashCode = (iM30448b + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.failedMonthIndex;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        CalendarHeaderModel calendarHeaderModel = this.header;
        int iHashCode3 = (iHashCode2 + (calendarHeaderModel == null ? 0 : calendarHeaderModel.hashCode())) * 31;
        ApiRequest apiRequest = this.request;
        int iHashCode4 = (iHashCode3 + (apiRequest == null ? 0 : apiRequest.hashCode())) * 31;
        CachePolicyModel cachePolicyModel = this.cachePolicy;
        int iHashCode5 = (iHashCode4 + (cachePolicyModel == null ? 0 : cachePolicyModel.hashCode())) * 31;
        C17027b<CalendarDayModel> c17027b = this.calendar;
        return this.headersByMonth.hashCode() + AbstractC3855a.m11821e(this.calendarKeysByMonth, AbstractC11895b.m31983b((iHashCode5 + (c17027b != null ? c17027b.hashCode() : 0)) * 31, 31, this.calendarKey), 31);
    }

    /* JADX INFO: renamed from: i */
    public final Map<Integer, CalendarHeaderModel> m3125i() {
        return this.headersByMonth;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Integer getLoadingMonthIndex() {
        return this.loadingMonthIndex;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getPageIndex() {
        return this.pageIndex;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final ApiRequest getRequest() {
        return this.request;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isError;
        int i13 = this.pageIndex;
        Integer num = this.loadingMonthIndex;
        Integer num2 = this.failedMonthIndex;
        CalendarHeaderModel calendarHeaderModel = this.header;
        ApiRequest apiRequest = this.request;
        CachePolicyModel cachePolicyModel = this.cachePolicy;
        C17027b<CalendarDayModel> c17027b = this.calendar;
        List<GraphLegendModel> list = this.calendarKey;
        Map<Integer, List<GraphLegendModel>> map = this.calendarKeysByMonth;
        Map<Integer, CalendarHeaderModel> map2 = this.headersByMonth;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("ArchMiniCalendarDomainState(isLoading=", ", isError=", ", pageIndex=", z4, z13);
        sbM32002u.append(i13);
        sbM32002u.append(", loadingMonthIndex=");
        sbM32002u.append(num);
        sbM32002u.append(", failedMonthIndex=");
        sbM32002u.append(num2);
        sbM32002u.append(", header=");
        sbM32002u.append(calendarHeaderModel);
        sbM32002u.append(", request=");
        sbM32002u.append(apiRequest);
        sbM32002u.append(", cachePolicy=");
        sbM32002u.append(cachePolicyModel);
        sbM32002u.append(", calendar=");
        sbM32002u.append(c17027b);
        sbM32002u.append(", calendarKey=");
        sbM32002u.append(list);
        sbM32002u.append(", calendarKeysByMonth=");
        return AbstractC30802r.m94765n(sbM32002u, map, ", headersByMonth=", map2, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1056a(boolean z4, boolean z13, int i13, Integer num, Integer num2, CalendarHeaderModel calendarHeaderModel, ApiRequest apiRequest, CachePolicyModel cachePolicyModel, C17027b c17027b, List list, Map map, Map map2, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        z4 = (i14 & 1) != 0 ? true : z4;
        z13 = (i14 & 2) != 0 ? false : z13;
        i13 = (i14 & 4) != 0 ? 0 : i13;
        num = (i14 & 8) != 0 ? null : num;
        num2 = (i14 & 16) != 0 ? null : num2;
        calendarHeaderModel = (i14 & 32) != 0 ? null : calendarHeaderModel;
        apiRequest = (i14 & 64) != 0 ? null : apiRequest;
        cachePolicyModel = (i14 & 128) != 0 ? null : cachePolicyModel;
        c17027b = (i14 & 256) != 0 ? null : c17027b;
        list = (i14 & 512) != 0 ? C25271y.f99162w : list;
        int i15 = i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        C25272z c25272z = C25272z.f99163w;
        this(z4, z13, i13, num, num2, calendarHeaderModel, apiRequest, cachePolicyModel, c17027b, list, i15 != 0 ? c25272z : map, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c25272z : map2);
    }
}
