package com.whoop.health.domain.models;

import androidx.core.app.NotificationCompat;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJV\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u001a¨\u00062"}, m65681d2 = {"Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;", "", "", "title", "supertitle", "metricTitle", "icon", "statusText", NotificationCompat.CATEGORY_STATUS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$health_release", "(Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSupertitle", "getMetricTitle", "getIcon", "getStatusText", "getStatus", "Companion", "$serializer", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MenstrualCycleInsightsCardBodyModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String icon;
    private final String metricTitle;
    private final String status;
    private final String statusText;
    private final String supertitle;
    private final String title;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;", "serializer", "()Lwc3/c;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MenstrualCycleInsightsCardBodyModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MenstrualCycleInsightsCardBodyModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, MenstrualCycleInsightsCardBodyModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.supertitle = str2;
        this.metricTitle = str3;
        this.icon = str4;
        this.statusText = str5;
        this.status = str6;
    }

    public static /* synthetic */ MenstrualCycleInsightsCardBodyModel copy$default(MenstrualCycleInsightsCardBodyModel menstrualCycleInsightsCardBodyModel, String str, String str2, String str3, String str4, String str5, String str6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = menstrualCycleInsightsCardBodyModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = menstrualCycleInsightsCardBodyModel.supertitle;
        }
        if ((i13 & 4) != 0) {
            str3 = menstrualCycleInsightsCardBodyModel.metricTitle;
        }
        if ((i13 & 8) != 0) {
            str4 = menstrualCycleInsightsCardBodyModel.icon;
        }
        if ((i13 & 16) != 0) {
            str5 = menstrualCycleInsightsCardBodyModel.statusText;
        }
        if ((i13 & 32) != 0) {
            str6 = menstrualCycleInsightsCardBodyModel.status;
        }
        String str7 = str5;
        String str8 = str6;
        return menstrualCycleInsightsCardBodyModel.copy(str, str2, str3, str4, str7, str8);
    }

    public static final /* synthetic */ void write$Self$health_release(MenstrualCycleInsightsCardBodyModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.title);
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.supertitle);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.metricTitle);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.icon);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.statusText);
        output.encodeStringElement(serialDesc, 5, self.status);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSupertitle() {
        return this.supertitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMetricTitle() {
        return this.metricTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatusText() {
        return this.statusText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final MenstrualCycleInsightsCardBodyModel copy(String title, String supertitle, String metricTitle, String icon, String statusText, String status) {
        AbstractC22676k.m65750j(status, "status");
        return new MenstrualCycleInsightsCardBodyModel(title, supertitle, metricTitle, icon, statusText, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenstrualCycleInsightsCardBodyModel)) {
            return false;
        }
        MenstrualCycleInsightsCardBodyModel menstrualCycleInsightsCardBodyModel = (MenstrualCycleInsightsCardBodyModel) other;
        return AbstractC22676k.m65745e(this.title, menstrualCycleInsightsCardBodyModel.title) && AbstractC22676k.m65745e(this.supertitle, menstrualCycleInsightsCardBodyModel.supertitle) && AbstractC22676k.m65745e(this.metricTitle, menstrualCycleInsightsCardBodyModel.metricTitle) && AbstractC22676k.m65745e(this.icon, menstrualCycleInsightsCardBodyModel.icon) && AbstractC22676k.m65745e(this.statusText, menstrualCycleInsightsCardBodyModel.statusText) && AbstractC22676k.m65745e(this.status, menstrualCycleInsightsCardBodyModel.status);
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getMetricTitle() {
        return this.metricTitle;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getStatusText() {
        return this.statusText;
    }

    public final String getSupertitle() {
        return this.supertitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.supertitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.metricTitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.icon;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.statusText;
        return this.status.hashCode() + ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.supertitle;
        String str3 = this.metricTitle;
        String str4 = this.icon;
        String str5 = this.statusText;
        String str6 = this.status;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MenstrualCycleInsightsCardBodyModel(title=", str, ", supertitle=", str2, ", metricTitle=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", icon=", str4, ", statusText=");
        return AbstractC11266d.m30464r(sbM32001t, str5, ", status=", str6, ")");
    }

    public MenstrualCycleInsightsCardBodyModel(String str, String str2, String str3, String str4, String str5, String status) {
        AbstractC22676k.m65750j(status, "status");
        this.title = str;
        this.supertitle = str2;
        this.metricTitle = str3;
        this.icon = str4;
        this.statusText = str5;
        this.status = status;
    }
}
