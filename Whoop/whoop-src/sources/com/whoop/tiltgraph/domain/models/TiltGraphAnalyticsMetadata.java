package com.whoop.tiltgraph.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.service.network.model.UserSessionDto;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J&\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0016R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0016¨\u0006)"}, m65681d2 = {"Lcom/whoop/tiltgraph/domain/models/TiltGraphAnalyticsMetadata;", "", "", "daysSince", "hoursInGraph", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$tilt_graph_release", "(Lcom/whoop/tiltgraph/domain/models/TiltGraphAnalyticsMetadata;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/tiltgraph/domain/models/TiltGraphAnalyticsMetadata;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDaysSince", "getDaysSince$annotations", "()V", "getHoursInGraph", "getHoursInGraph$annotations", "Companion", "$serializer", "tilt-graph_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TiltGraphAnalyticsMetadata {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("days_since")
    private final String daysSince;

    @SerializedName("hours_in_graph")
    private final String hoursInGraph;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/tiltgraph/domain/models/TiltGraphAnalyticsMetadata$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/tiltgraph/domain/models/TiltGraphAnalyticsMetadata;", "serializer", "()Lwc3/c;", "tilt-graph_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TiltGraphAnalyticsMetadata$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TiltGraphAnalyticsMetadata() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ TiltGraphAnalyticsMetadata copy$default(TiltGraphAnalyticsMetadata tiltGraphAnalyticsMetadata, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = tiltGraphAnalyticsMetadata.daysSince;
        }
        if ((i13 & 2) != 0) {
            str2 = tiltGraphAnalyticsMetadata.hoursInGraph;
        }
        return tiltGraphAnalyticsMetadata.copy(str, str2);
    }

    @InterfaceC37143h("days_since")
    public static /* synthetic */ void getDaysSince$annotations() {
    }

    @InterfaceC37143h("hours_in_graph")
    public static /* synthetic */ void getHoursInGraph$annotations() {
    }

    public static final /* synthetic */ void write$Self$tilt_graph_release(TiltGraphAnalyticsMetadata self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.daysSince, UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE)) {
            output.encodeStringElement(serialDesc, 0, self.daysSince);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.hoursInGraph == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.hoursInGraph);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDaysSince() {
        return this.daysSince;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHoursInGraph() {
        return this.hoursInGraph;
    }

    public final TiltGraphAnalyticsMetadata copy(String daysSince, String hoursInGraph) {
        AbstractC22676k.m65750j(daysSince, "daysSince");
        return new TiltGraphAnalyticsMetadata(daysSince, hoursInGraph);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TiltGraphAnalyticsMetadata)) {
            return false;
        }
        TiltGraphAnalyticsMetadata tiltGraphAnalyticsMetadata = (TiltGraphAnalyticsMetadata) other;
        return AbstractC22676k.m65745e(this.daysSince, tiltGraphAnalyticsMetadata.daysSince) && AbstractC22676k.m65745e(this.hoursInGraph, tiltGraphAnalyticsMetadata.hoursInGraph);
    }

    public final String getDaysSince() {
        return this.daysSince;
    }

    public final String getHoursInGraph() {
        return this.hoursInGraph;
    }

    public int hashCode() {
        int iHashCode = this.daysSince.hashCode() * 31;
        String str = this.hoursInGraph;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return AbstractC2875y.m8300m("TiltGraphAnalyticsMetadata(daysSince=", this.daysSince, ", hoursInGraph=", this.hoursInGraph, ")");
    }

    public /* synthetic */ TiltGraphAnalyticsMetadata(int i13, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.daysSince = (i13 & 1) == 0 ? UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE : str;
        if ((i13 & 2) == 0) {
            this.hoursInGraph = null;
        } else {
            this.hoursInGraph = str2;
        }
    }

    public TiltGraphAnalyticsMetadata(String daysSince, String str) {
        AbstractC22676k.m65750j(daysSince, "daysSince");
        this.daysSince = daysSince;
        this.hoursInGraph = str;
    }

    public /* synthetic */ TiltGraphAnalyticsMetadata(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE : str, (i13 & 2) != 0 ? null : str2);
    }
}
