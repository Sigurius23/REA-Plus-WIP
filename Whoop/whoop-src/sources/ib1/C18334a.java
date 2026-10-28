package ib1;

import com.whoop.design.models.calendar.archmini.CalendarContentModel;
import com.whoop.navigation.CachePolicyModel;
import com.whoop.navigation.models.ApiRequest;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: ib1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b \u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b#\u0010\u0017R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b(\u0010.\u001a\u0004\b)\u0010/R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00064"}, m65681d2 = {"Lib1/a;", "Lm91/u;", "Lcom/whoop/navigation/models/ApiRequest;", "request", "Lcom/whoop/navigation/CachePolicyModel;", "cachePolicy", "Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;", "content", "", "selectedDate", "", "futureMonthsShown", "", "showsDefaultDateSelector", "", "pageHeightRatio", "Lib1/b;", "heightConfiguration", "<init>", "(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;Ljava/lang/String;IZLjava/lang/Float;Lib1/b;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/models/ApiRequest;", "f", "()Lcom/whoop/navigation/models/ApiRequest;", "b", "Lcom/whoop/navigation/CachePolicyModel;", "()Lcom/whoop/navigation/CachePolicyModel;", "c", "Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;", "()Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;", "d", "Ljava/lang/String;", "g", "e", "I", "Z", "getShowsDefaultDateSelector", "()Z", "Ljava/lang/Float;", "()Ljava/lang/Float;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lib1/b;", "getHeightConfiguration", "()Lib1/b;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18334a implements InterfaceC25312u {

    /* JADX INFO: renamed from: i */
    public static final int f71360i = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ApiRequest request;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final CachePolicyModel cachePolicy;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final CalendarContentModel content;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String selectedDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int futureMonthsShown;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean showsDefaultDateSelector;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Float pageHeightRatio;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final EnumC18335b heightConfiguration;

    public C18334a(ApiRequest request, CachePolicyModel cachePolicyModel, CalendarContentModel calendarContentModel, String selectedDate, int i13, boolean z4, Float f13, EnumC18335b heightConfiguration) {
        AbstractC22676k.m65750j(request, "request");
        AbstractC22676k.m65750j(selectedDate, "selectedDate");
        AbstractC22676k.m65750j(heightConfiguration, "heightConfiguration");
        this.request = request;
        this.cachePolicy = cachePolicyModel;
        this.content = calendarContentModel;
        this.selectedDate = selectedDate;
        this.futureMonthsShown = i13;
        this.showsDefaultDateSelector = z4;
        this.pageHeightRatio = f13;
        this.heightConfiguration = heightConfiguration;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final CachePolicyModel getCachePolicy() {
        return this.cachePolicy;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CalendarContentModel getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getFutureMonthsShown() {
        return this.futureMonthsShown;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Float getPageHeightRatio() {
        return this.pageHeightRatio;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18334a)) {
            return false;
        }
        C18334a c18334a = (C18334a) other;
        return AbstractC22676k.m65745e(this.request, c18334a.request) && AbstractC22676k.m65745e(this.cachePolicy, c18334a.cachePolicy) && AbstractC22676k.m65745e(this.content, c18334a.content) && AbstractC22676k.m65745e(this.selectedDate, c18334a.selectedDate) && this.futureMonthsShown == c18334a.futureMonthsShown && this.showsDefaultDateSelector == c18334a.showsDefaultDateSelector && AbstractC22676k.m65745e(this.pageHeightRatio, c18334a.pageHeightRatio) && this.heightConfiguration == c18334a.heightConfiguration;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final ApiRequest getRequest() {
        return this.request;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSelectedDate() {
        return this.selectedDate;
    }

    public int hashCode() {
        int iHashCode = this.request.hashCode() * 31;
        CachePolicyModel cachePolicyModel = this.cachePolicy;
        int iHashCode2 = (iHashCode + (cachePolicyModel == null ? 0 : cachePolicyModel.hashCode())) * 31;
        CalendarContentModel calendarContentModel = this.content;
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.futureMonthsShown, AbstractC11266d.m30450d((iHashCode2 + (calendarContentModel == null ? 0 : calendarContentModel.hashCode())) * 31, 31, this.selectedDate), 31), 31, this.showsDefaultDateSelector);
        Float f13 = this.pageHeightRatio;
        return this.heightConfiguration.hashCode() + ((iM8289b + (f13 != null ? f13.hashCode() : 0)) * 31);
    }

    public String toString() {
        ApiRequest apiRequest = this.request;
        CachePolicyModel cachePolicyModel = this.cachePolicy;
        CalendarContentModel calendarContentModel = this.content;
        String str = this.selectedDate;
        int i13 = this.futureMonthsShown;
        boolean z4 = this.showsDefaultDateSelector;
        Float f13 = this.pageHeightRatio;
        EnumC18335b enumC18335b = this.heightConfiguration;
        StringBuilder sb4 = new StringBuilder("ArchMiniCalendarWrapperViewState(request=");
        sb4.append(apiRequest);
        sb4.append(", cachePolicy=");
        sb4.append(cachePolicyModel);
        sb4.append(", content=");
        sb4.append(calendarContentModel);
        sb4.append(", selectedDate=");
        sb4.append(str);
        sb4.append(", futureMonthsShown=");
        AbstractC13673n.m38573t(i13, ", showsDefaultDateSelector=", ", pageHeightRatio=", sb4, z4);
        sb4.append(f13);
        sb4.append(", heightConfiguration=");
        sb4.append(enumC18335b);
        sb4.append(")");
        return sb4.toString();
    }
}
