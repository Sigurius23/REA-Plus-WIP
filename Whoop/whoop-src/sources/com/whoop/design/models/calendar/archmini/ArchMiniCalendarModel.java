package com.whoop.design.models.calendar.archmini;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.CachePolicyModel;
import com.whoop.navigation.CachePolicyModel$$serializer;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.ApiRequest$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002GFBS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012Bg\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b.\u0010'Jh\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b1\u0010'J\u0010\u00102\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b2\u0010)J\u001a\u00105\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b<\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010=\u001a\u0004\b>\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\b@\u0010)R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bB\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bD\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\bE\u0010'¨\u0006H"}, m65681d2 = {"Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/navigation/models/ApiRequest;", "request", "Lcom/whoop/navigation/CachePolicyModel;", "cachePolicy", "Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;", "content", "", "selectedDate", "", "futureMonthsShown", "", "showsDefaultDateSelector", "", "pageHeightRatio", "heightConfiguration", "<init>", "(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;Ljava/lang/String;IZLjava/lang/Float;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;Ljava/lang/String;IZLjava/lang/Float;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/navigation/models/ApiRequest;", "component2", "()Lcom/whoop/navigation/CachePolicyModel;", "component3", "()Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;", "component4", "()Ljava/lang/String;", "component5", "()I", "component6", "()Z", "component7", "()Ljava/lang/Float;", "component8", "copy", "(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;Ljava/lang/String;IZLjava/lang/Float;Ljava/lang/String;)Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/navigation/models/ApiRequest;", "getRequest", "Lcom/whoop/navigation/CachePolicyModel;", "getCachePolicy", "Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;", "getContent", "Ljava/lang/String;", "getSelectedDate", "I", "getFutureMonthsShown", "Z", "getShowsDefaultDateSelector", "Ljava/lang/Float;", "getPageHeightRatio", "getHeightConfiguration", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ArchMiniCalendarModel implements DesignSystemModel {
    private final CachePolicyModel cachePolicy;
    private final CalendarContentModel content;
    private final int futureMonthsShown;
    private final String heightConfiguration;
    private final Float pageHeightRatio;
    private final ApiRequest request;
    private final String selectedDate;
    private final boolean showsDefaultDateSelector;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/calendar/archmini/ArchMiniCalendarModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ArchMiniCalendarModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ArchMiniCalendarModel(int i13, ApiRequest apiRequest, CachePolicyModel cachePolicyModel, CalendarContentModel calendarContentModel, String str, int i14, boolean z4, Float f13, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (207 != (i13 & 207)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 207, ArchMiniCalendarModel$$serializer.INSTANCE.getDescriptor());
        }
        this.request = apiRequest;
        this.cachePolicy = cachePolicyModel;
        this.content = calendarContentModel;
        this.selectedDate = str;
        if ((i13 & 16) == 0) {
            this.futureMonthsShown = 0;
        } else {
            this.futureMonthsShown = i14;
        }
        if ((i13 & 32) == 0) {
            this.showsDefaultDateSelector = true;
        } else {
            this.showsDefaultDateSelector = z4;
        }
        this.pageHeightRatio = f13;
        this.heightConfiguration = str2;
    }

    public static /* synthetic */ ArchMiniCalendarModel copy$default(ArchMiniCalendarModel archMiniCalendarModel, ApiRequest apiRequest, CachePolicyModel cachePolicyModel, CalendarContentModel calendarContentModel, String str, int i13, boolean z4, Float f13, String str2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            apiRequest = archMiniCalendarModel.request;
        }
        if ((i14 & 2) != 0) {
            cachePolicyModel = archMiniCalendarModel.cachePolicy;
        }
        if ((i14 & 4) != 0) {
            calendarContentModel = archMiniCalendarModel.content;
        }
        if ((i14 & 8) != 0) {
            str = archMiniCalendarModel.selectedDate;
        }
        if ((i14 & 16) != 0) {
            i13 = archMiniCalendarModel.futureMonthsShown;
        }
        if ((i14 & 32) != 0) {
            z4 = archMiniCalendarModel.showsDefaultDateSelector;
        }
        if ((i14 & 64) != 0) {
            f13 = archMiniCalendarModel.pageHeightRatio;
        }
        if ((i14 & 128) != 0) {
            str2 = archMiniCalendarModel.heightConfiguration;
        }
        Float f14 = f13;
        String str3 = str2;
        int i15 = i13;
        boolean z13 = z4;
        return archMiniCalendarModel.copy(apiRequest, cachePolicyModel, calendarContentModel, str, i15, z13, f14, str3);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ArchMiniCalendarModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, ApiRequest$$serializer.INSTANCE, self.request);
        output.encodeNullableSerializableElement(serialDesc, 1, CachePolicyModel$$serializer.INSTANCE, self.cachePolicy);
        output.encodeNullableSerializableElement(serialDesc, 2, CalendarContentModel$$serializer.INSTANCE, self.content);
        output.encodeStringElement(serialDesc, 3, self.selectedDate);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.futureMonthsShown != 0) {
            output.encodeIntElement(serialDesc, 4, self.futureMonthsShown);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !self.showsDefaultDateSelector) {
            output.encodeBooleanElement(serialDesc, 5, self.showsDefaultDateSelector);
        }
        output.encodeNullableSerializableElement(serialDesc, 6, FloatSerializer.INSTANCE, self.pageHeightRatio);
        output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.heightConfiguration);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ApiRequest getRequest() {
        return this.request;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CachePolicyModel getCachePolicy() {
        return this.cachePolicy;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CalendarContentModel getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSelectedDate() {
        return this.selectedDate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getFutureMonthsShown() {
        return this.futureMonthsShown;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getShowsDefaultDateSelector() {
        return this.showsDefaultDateSelector;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Float getPageHeightRatio() {
        return this.pageHeightRatio;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getHeightConfiguration() {
        return this.heightConfiguration;
    }

    public final ArchMiniCalendarModel copy(ApiRequest request, CachePolicyModel cachePolicy, CalendarContentModel content, String selectedDate, int futureMonthsShown, boolean showsDefaultDateSelector, Float pageHeightRatio, String heightConfiguration) {
        AbstractC22676k.m65750j(request, "request");
        AbstractC22676k.m65750j(selectedDate, "selectedDate");
        return new ArchMiniCalendarModel(request, cachePolicy, content, selectedDate, futureMonthsShown, showsDefaultDateSelector, pageHeightRatio, heightConfiguration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArchMiniCalendarModel)) {
            return false;
        }
        ArchMiniCalendarModel archMiniCalendarModel = (ArchMiniCalendarModel) other;
        return AbstractC22676k.m65745e(this.request, archMiniCalendarModel.request) && AbstractC22676k.m65745e(this.cachePolicy, archMiniCalendarModel.cachePolicy) && AbstractC22676k.m65745e(this.content, archMiniCalendarModel.content) && AbstractC22676k.m65745e(this.selectedDate, archMiniCalendarModel.selectedDate) && this.futureMonthsShown == archMiniCalendarModel.futureMonthsShown && this.showsDefaultDateSelector == archMiniCalendarModel.showsDefaultDateSelector && AbstractC22676k.m65745e(this.pageHeightRatio, archMiniCalendarModel.pageHeightRatio) && AbstractC22676k.m65745e(this.heightConfiguration, archMiniCalendarModel.heightConfiguration);
    }

    public final CachePolicyModel getCachePolicy() {
        return this.cachePolicy;
    }

    public final CalendarContentModel getContent() {
        return this.content;
    }

    public final int getFutureMonthsShown() {
        return this.futureMonthsShown;
    }

    public final String getHeightConfiguration() {
        return this.heightConfiguration;
    }

    public final Float getPageHeightRatio() {
        return this.pageHeightRatio;
    }

    public final ApiRequest getRequest() {
        return this.request;
    }

    public final String getSelectedDate() {
        return this.selectedDate;
    }

    public final boolean getShowsDefaultDateSelector() {
        return this.showsDefaultDateSelector;
    }

    public int hashCode() {
        int iHashCode = this.request.hashCode() * 31;
        CachePolicyModel cachePolicyModel = this.cachePolicy;
        int iHashCode2 = (iHashCode + (cachePolicyModel == null ? 0 : cachePolicyModel.hashCode())) * 31;
        CalendarContentModel calendarContentModel = this.content;
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.futureMonthsShown, AbstractC11266d.m30450d((iHashCode2 + (calendarContentModel == null ? 0 : calendarContentModel.hashCode())) * 31, 31, this.selectedDate), 31), 31, this.showsDefaultDateSelector);
        Float f13 = this.pageHeightRatio;
        int iHashCode3 = (iM8289b + (f13 == null ? 0 : f13.hashCode())) * 31;
        String str = this.heightConfiguration;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        ApiRequest apiRequest = this.request;
        CachePolicyModel cachePolicyModel = this.cachePolicy;
        CalendarContentModel calendarContentModel = this.content;
        String str = this.selectedDate;
        int i13 = this.futureMonthsShown;
        boolean z4 = this.showsDefaultDateSelector;
        Float f13 = this.pageHeightRatio;
        String str2 = this.heightConfiguration;
        StringBuilder sb4 = new StringBuilder("ArchMiniCalendarModel(request=");
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
        sb4.append(str2);
        sb4.append(")");
        return sb4.toString();
    }

    public ArchMiniCalendarModel(ApiRequest request, CachePolicyModel cachePolicyModel, CalendarContentModel calendarContentModel, String selectedDate, int i13, boolean z4, Float f13, String str) {
        AbstractC22676k.m65750j(request, "request");
        AbstractC22676k.m65750j(selectedDate, "selectedDate");
        this.request = request;
        this.cachePolicy = cachePolicyModel;
        this.content = calendarContentModel;
        this.selectedDate = selectedDate;
        this.futureMonthsShown = i13;
        this.showsDefaultDateSelector = z4;
        this.pageHeightRatio = f13;
        this.heightConfiguration = str;
    }

    public /* synthetic */ ArchMiniCalendarModel(ApiRequest apiRequest, CachePolicyModel cachePolicyModel, CalendarContentModel calendarContentModel, String str, int i13, boolean z4, Float f13, String str2, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(apiRequest, cachePolicyModel, calendarContentModel, str, (i14 & 16) != 0 ? 0 : i13, (i14 & 32) != 0 ? true : z4, f13, str2);
    }
}
