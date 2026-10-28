package com.whoop.trends.data.model;

import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002GFBM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eBi\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0015Jf\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0015J\u0010\u0010\"\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(J'\u00101\u001a\u00020.2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0001¢\u0006\u0004\b/\u00100R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00102\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00102\u0012\u0004\b7\u00105\u001a\u0004\b6\u0010\u0015R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00102\u0012\u0004\b9\u00105\u001a\u0004\b8\u0010\u0015R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010:\u0012\u0004\b<\u00105\u001a\u0004\b;\u0010\u0019R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00102\u0012\u0004\b>\u00105\u001a\u0004\b=\u0010\u0015R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00102\u0012\u0004\b@\u00105\u001a\u0004\b?\u0010\u0015R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010A\u0012\u0004\bC\u00105\u001a\u0004\bB\u0010\u001dR \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00102\u0012\u0004\bE\u00105\u001a\u0004\bD\u0010\u0015¨\u0006H"}, m65681d2 = {"Lcom/whoop/trends/data/model/MeasurementBox;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "icon", "iconUrl", "", "weight", "metricUnit", "subtitle", "Lcom/whoop/trends/data/model/ManualMeasurementSheet;", "weightDetailsScreen", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()D", "component5", "component6", "component7", "()Lcom/whoop/trends/data/model/ManualMeasurementSheet;", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Ljava/lang/String;)Lcom/whoop/trends/data/model/MeasurementBox;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$trends_release", "(Lcom/whoop/trends/data/model/MeasurementBox;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getIcon", "getIcon$annotations", "getIconUrl", "getIconUrl$annotations", "D", "getWeight", "getWeight$annotations", "getMetricUnit", "getMetricUnit$annotations", "getSubtitle", "getSubtitle$annotations", "Lcom/whoop/trends/data/model/ManualMeasurementSheet;", "getWeightDetailsScreen", "getWeightDetailsScreen$annotations", "getSource", "getSource$annotations", "Companion", "$serializer", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MeasurementBox implements DesignSystemModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("icon")
    private final String icon;

    @SerializedName("icon_url")
    private final String iconUrl;

    @SerializedName("id")
    private final String id;

    @SerializedName("metric_unit")
    private final String metricUnit;

    @SerializedName("source")
    private final String source;

    @SerializedName("subtitle")
    private final String subtitle;

    @SerializedName("weight")
    private final double weight;

    @SerializedName("weight_details_screen")
    private final ManualMeasurementSheet weightDetailsScreen;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/trends/data/model/MeasurementBox$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/trends/data/model/MeasurementBox;", "serializer", "()Lwc3/c;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MeasurementBox$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MeasurementBox(int i13, String str, String str2, String str3, double d3, String str4, String str5, ManualMeasurementSheet manualMeasurementSheet, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, MeasurementBox$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.icon = str2;
        this.iconUrl = str3;
        this.weight = d3;
        this.metricUnit = str4;
        this.subtitle = str5;
        this.weightDetailsScreen = manualMeasurementSheet;
        this.source = str6;
    }

    public static /* synthetic */ MeasurementBox copy$default(MeasurementBox measurementBox, String str, String str2, String str3, double d3, String str4, String str5, ManualMeasurementSheet manualMeasurementSheet, String str6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = measurementBox.id;
        }
        if ((i13 & 2) != 0) {
            str2 = measurementBox.icon;
        }
        if ((i13 & 4) != 0) {
            str3 = measurementBox.iconUrl;
        }
        if ((i13 & 8) != 0) {
            d3 = measurementBox.weight;
        }
        if ((i13 & 16) != 0) {
            str4 = measurementBox.metricUnit;
        }
        if ((i13 & 32) != 0) {
            str5 = measurementBox.subtitle;
        }
        if ((i13 & 64) != 0) {
            manualMeasurementSheet = measurementBox.weightDetailsScreen;
        }
        if ((i13 & 128) != 0) {
            str6 = measurementBox.source;
        }
        double d14 = d3;
        String str7 = str3;
        return measurementBox.copy(str, str2, str7, d14, str4, str5, manualMeasurementSheet, str6);
    }

    @InterfaceC37143h("icon")
    public static /* synthetic */ void getIcon$annotations() {
    }

    @InterfaceC37143h("icon_url")
    public static /* synthetic */ void getIconUrl$annotations() {
    }

    @InterfaceC37143h("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @InterfaceC37143h("metric_unit")
    public static /* synthetic */ void getMetricUnit$annotations() {
    }

    @InterfaceC37143h("source")
    public static /* synthetic */ void getSource$annotations() {
    }

    @InterfaceC37143h("subtitle")
    public static /* synthetic */ void getSubtitle$annotations() {
    }

    @InterfaceC37143h("weight")
    public static /* synthetic */ void getWeight$annotations() {
    }

    @InterfaceC37143h("weight_details_screen")
    public static /* synthetic */ void getWeightDetailsScreen$annotations() {
    }

    public static final /* synthetic */ void write$Self$trends_release(MeasurementBox self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.icon);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.iconUrl);
        output.encodeDoubleElement(serialDesc, 3, self.weight);
        output.encodeStringElement(serialDesc, 4, self.metricUnit);
        output.encodeStringElement(serialDesc, 5, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 6, ManualMeasurementSheet$$serializer.INSTANCE, self.weightDetailsScreen);
        output.encodeStringElement(serialDesc, 7, self.source);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMetricUnit() {
        return this.metricUnit;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ManualMeasurementSheet getWeightDetailsScreen() {
        return this.weightDetailsScreen;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final MeasurementBox copy(String id4, String icon, String iconUrl, double weight, String metricUnit, String subtitle, ManualMeasurementSheet weightDetailsScreen, String source) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(metricUnit, "metricUnit");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(source, "source");
        return new MeasurementBox(id4, icon, iconUrl, weight, metricUnit, subtitle, weightDetailsScreen, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MeasurementBox)) {
            return false;
        }
        MeasurementBox measurementBox = (MeasurementBox) other;
        return AbstractC22676k.m65745e(this.id, measurementBox.id) && AbstractC22676k.m65745e(this.icon, measurementBox.icon) && AbstractC22676k.m65745e(this.iconUrl, measurementBox.iconUrl) && Double.compare(this.weight, measurementBox.weight) == 0 && AbstractC22676k.m65745e(this.metricUnit, measurementBox.metricUnit) && AbstractC22676k.m65745e(this.subtitle, measurementBox.subtitle) && AbstractC22676k.m65745e(this.weightDetailsScreen, measurementBox.weightDetailsScreen) && AbstractC22676k.m65745e(this.source, measurementBox.source);
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMetricUnit() {
        return this.metricUnit;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final double getWeight() {
        return this.weight;
    }

    public final ManualMeasurementSheet getWeightDetailsScreen() {
        return this.weightDetailsScreen;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.icon;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconUrl;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC17176i.m48499a((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.weight), 31, this.metricUnit), 31, this.subtitle);
        ManualMeasurementSheet manualMeasurementSheet = this.weightDetailsScreen;
        return this.source.hashCode() + ((iM30450d + (manualMeasurementSheet != null ? manualMeasurementSheet.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.icon;
        String str3 = this.iconUrl;
        double d3 = this.weight;
        String str4 = this.metricUnit;
        String str5 = this.subtitle;
        ManualMeasurementSheet manualMeasurementSheet = this.weightDetailsScreen;
        String str6 = this.source;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MeasurementBox(id=", str, ", icon=", str2, ", iconUrl=");
        sbM32001t.append(str3);
        sbM32001t.append(", weight=");
        sbM32001t.append(d3);
        AbstractC11266d.m30444B(sbM32001t, ", metricUnit=", str4, ", subtitle=", str5);
        sbM32001t.append(", weightDetailsScreen=");
        sbM32001t.append(manualMeasurementSheet);
        sbM32001t.append(", source=");
        sbM32001t.append(str6);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public MeasurementBox(String id4, String str, String str2, double d3, String metricUnit, String subtitle, ManualMeasurementSheet manualMeasurementSheet, String source) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(metricUnit, "metricUnit");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(source, "source");
        this.id = id4;
        this.icon = str;
        this.iconUrl = str2;
        this.weight = d3;
        this.metricUnit = metricUnit;
        this.subtitle = subtitle;
        this.weightDetailsScreen = manualMeasurementSheet;
        this.source = source;
    }
}
