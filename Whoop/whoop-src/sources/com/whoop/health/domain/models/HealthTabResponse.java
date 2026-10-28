package com.whoop.health.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import sh2.C32513d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBI\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"JD\u0010#\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b%\u0010 J\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\"¨\u00065"}, m65681d2 = {"Lcom/whoop/health/domain/models/HealthTabResponse;", "", "", "Lcom/whoop/health/domain/models/HealthTabSectionModel;", "sections", "Lcom/whoop/health/domain/models/AnalyticsData;", "analytics", "", "scrollBackgroundStyle", "", "showLiveHr", "<init>", "(Ljava/util/List;Lcom/whoop/health/domain/models/AnalyticsData;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/whoop/health/domain/models/AnalyticsData;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$health_release", "(Lcom/whoop/health/domain/models/HealthTabResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lcom/whoop/health/domain/models/AnalyticsData;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/lang/Boolean;", "copy", "(Ljava/util/List;Lcom/whoop/health/domain/models/AnalyticsData;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/whoop/health/domain/models/HealthTabResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSections", "Lcom/whoop/health/domain/models/AnalyticsData;", "getAnalytics", "Ljava/lang/String;", "getScrollBackgroundStyle", "Ljava/lang/Boolean;", "getShowLiveHr", "Companion", "$serializer", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HealthTabResponse {
    private final AnalyticsData analytics;
    private final String scrollBackgroundStyle;
    private final List<HealthTabSectionModel> sections;
    private final Boolean showLiveHr;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C32513d(5)), null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/health/domain/models/HealthTabResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/health/domain/models/HealthTabResponse;", "serializer", "()Lwc3/c;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HealthTabResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HealthTabResponse(int i13, List list, AnalyticsData analyticsData, String str, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, HealthTabResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.sections = list;
        if ((i13 & 2) == 0) {
            this.analytics = null;
        } else {
            this.analytics = analyticsData;
        }
        if ((i13 & 4) == 0) {
            this.scrollBackgroundStyle = null;
        } else {
            this.scrollBackgroundStyle = str;
        }
        if ((i13 & 8) == 0) {
            this.showLiveHr = null;
        } else {
            this.showLiveHr = bool;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(HealthTabSectionModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HealthTabResponse copy$default(HealthTabResponse healthTabResponse, List list, AnalyticsData analyticsData, String str, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = healthTabResponse.sections;
        }
        if ((i13 & 2) != 0) {
            analyticsData = healthTabResponse.analytics;
        }
        if ((i13 & 4) != 0) {
            str = healthTabResponse.scrollBackgroundStyle;
        }
        if ((i13 & 8) != 0) {
            bool = healthTabResponse.showLiveHr;
        }
        return healthTabResponse.copy(list, analyticsData, str, bool);
    }

    public static final /* synthetic */ void write$Self$health_release(HealthTabResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.sections);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.analytics != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, AnalyticsData$$serializer.INSTANCE, self.analytics);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.scrollBackgroundStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.scrollBackgroundStyle);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.showLiveHr == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, BooleanSerializer.INSTANCE, self.showLiveHr);
    }

    public final List<HealthTabSectionModel> component1() {
        return this.sections;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AnalyticsData getAnalytics() {
        return this.analytics;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getScrollBackgroundStyle() {
        return this.scrollBackgroundStyle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getShowLiveHr() {
        return this.showLiveHr;
    }

    public final HealthTabResponse copy(List<HealthTabSectionModel> sections, AnalyticsData analytics, String scrollBackgroundStyle, Boolean showLiveHr) {
        AbstractC22676k.m65750j(sections, "sections");
        return new HealthTabResponse(sections, analytics, scrollBackgroundStyle, showLiveHr);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthTabResponse)) {
            return false;
        }
        HealthTabResponse healthTabResponse = (HealthTabResponse) other;
        return AbstractC22676k.m65745e(this.sections, healthTabResponse.sections) && AbstractC22676k.m65745e(this.analytics, healthTabResponse.analytics) && AbstractC22676k.m65745e(this.scrollBackgroundStyle, healthTabResponse.scrollBackgroundStyle) && AbstractC22676k.m65745e(this.showLiveHr, healthTabResponse.showLiveHr);
    }

    public final AnalyticsData getAnalytics() {
        return this.analytics;
    }

    public final String getScrollBackgroundStyle() {
        return this.scrollBackgroundStyle;
    }

    public final List<HealthTabSectionModel> getSections() {
        return this.sections;
    }

    public final Boolean getShowLiveHr() {
        return this.showLiveHr;
    }

    public int hashCode() {
        int iHashCode = this.sections.hashCode() * 31;
        AnalyticsData analyticsData = this.analytics;
        int iHashCode2 = (iHashCode + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31;
        String str = this.scrollBackgroundStyle;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.showLiveHr;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "HealthTabResponse(sections=" + this.sections + ", analytics=" + this.analytics + ", scrollBackgroundStyle=" + this.scrollBackgroundStyle + ", showLiveHr=" + this.showLiveHr + ")";
    }

    public HealthTabResponse(List<HealthTabSectionModel> sections, AnalyticsData analyticsData, String str, Boolean bool) {
        AbstractC22676k.m65750j(sections, "sections");
        this.sections = sections;
        this.analytics = analyticsData;
        this.scrollBackgroundStyle = str;
        this.showLiveHr = bool;
    }

    public /* synthetic */ HealthTabResponse(List list, AnalyticsData analyticsData, String str, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i13 & 2) != 0 ? null : analyticsData, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : bool);
    }
}
