package com.whoop.trends.data.model;

import com.google.gson.annotations.SerializedName;
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
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u0019R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b.\u0010*\u001a\u0004\b-\u0010\u0019R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010/\u0012\u0004\b1\u0010*\u001a\u0004\b0\u0010\u001d¨\u00064"}, m65681d2 = {"Lcom/whoop/trends/data/model/ConfigurableBarDTOV3;", "", "", "topLabel", "bottomLabelDisplay", "barColor", "", "percentage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$trends_release", "(Lcom/whoop/trends/data/model/ConfigurableBarDTOV3;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()D", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)Lcom/whoop/trends/data/model/ConfigurableBarDTOV3;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTopLabel", "getTopLabel$annotations", "()V", "getBottomLabelDisplay", "getBottomLabelDisplay$annotations", "getBarColor", "getBarColor$annotations", "D", "getPercentage", "getPercentage$annotations", "Companion", "$serializer", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ConfigurableBarDTOV3 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("color")
    private final String barColor;

    @SerializedName("bottom_label_display_text")
    private final String bottomLabelDisplay;

    @SerializedName("percent_of_total")
    private final double percentage;

    @SerializedName("top_label_display")
    private final String topLabel;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/trends/data/model/ConfigurableBarDTOV3$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/trends/data/model/ConfigurableBarDTOV3;", "serializer", "()Lwc3/c;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ConfigurableBarDTOV3$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ConfigurableBarDTOV3(int i13, String str, String str2, String str3, double d3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, ConfigurableBarDTOV3$$serializer.INSTANCE.getDescriptor());
        }
        this.topLabel = str;
        this.bottomLabelDisplay = str2;
        this.barColor = str3;
        this.percentage = d3;
    }

    public static /* synthetic */ ConfigurableBarDTOV3 copy$default(ConfigurableBarDTOV3 configurableBarDTOV3, String str, String str2, String str3, double d3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = configurableBarDTOV3.topLabel;
        }
        if ((i13 & 2) != 0) {
            str2 = configurableBarDTOV3.bottomLabelDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = configurableBarDTOV3.barColor;
        }
        if ((i13 & 8) != 0) {
            d3 = configurableBarDTOV3.percentage;
        }
        String str4 = str3;
        return configurableBarDTOV3.copy(str, str2, str4, d3);
    }

    @InterfaceC37143h("color")
    public static /* synthetic */ void getBarColor$annotations() {
    }

    @InterfaceC37143h("bottom_label_display_text")
    public static /* synthetic */ void getBottomLabelDisplay$annotations() {
    }

    @InterfaceC37143h("percent_of_total")
    public static /* synthetic */ void getPercentage$annotations() {
    }

    @InterfaceC37143h("top_label_display")
    public static /* synthetic */ void getTopLabel$annotations() {
    }

    public static final /* synthetic */ void write$Self$trends_release(ConfigurableBarDTOV3 self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.topLabel);
        output.encodeStringElement(serialDesc, 1, self.bottomLabelDisplay);
        output.encodeStringElement(serialDesc, 2, self.barColor);
        output.encodeDoubleElement(serialDesc, 3, self.percentage);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTopLabel() {
        return this.topLabel;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBottomLabelDisplay() {
        return this.bottomLabelDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBarColor() {
        return this.barColor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getPercentage() {
        return this.percentage;
    }

    public final ConfigurableBarDTOV3 copy(String topLabel, String bottomLabelDisplay, String barColor, double percentage) {
        AbstractC22676k.m65750j(bottomLabelDisplay, "bottomLabelDisplay");
        AbstractC22676k.m65750j(barColor, "barColor");
        return new ConfigurableBarDTOV3(topLabel, bottomLabelDisplay, barColor, percentage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigurableBarDTOV3)) {
            return false;
        }
        ConfigurableBarDTOV3 configurableBarDTOV3 = (ConfigurableBarDTOV3) other;
        return AbstractC22676k.m65745e(this.topLabel, configurableBarDTOV3.topLabel) && AbstractC22676k.m65745e(this.bottomLabelDisplay, configurableBarDTOV3.bottomLabelDisplay) && AbstractC22676k.m65745e(this.barColor, configurableBarDTOV3.barColor) && Double.compare(this.percentage, configurableBarDTOV3.percentage) == 0;
    }

    public final String getBarColor() {
        return this.barColor;
    }

    public final String getBottomLabelDisplay() {
        return this.bottomLabelDisplay;
    }

    public final double getPercentage() {
        return this.percentage;
    }

    public final String getTopLabel() {
        return this.topLabel;
    }

    public int hashCode() {
        String str = this.topLabel;
        return Double.hashCode(this.percentage) + AbstractC11266d.m30450d(AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.bottomLabelDisplay), 31, this.barColor);
    }

    public String toString() {
        String str = this.topLabel;
        String str2 = this.bottomLabelDisplay;
        String str3 = this.barColor;
        double d3 = this.percentage;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ConfigurableBarDTOV3(topLabel=", str, ", bottomLabelDisplay=", str2, ", barColor=");
        sbM32001t.append(str3);
        sbM32001t.append(", percentage=");
        sbM32001t.append(d3);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ConfigurableBarDTOV3(String str, String bottomLabelDisplay, String barColor, double d3) {
        AbstractC22676k.m65750j(bottomLabelDisplay, "bottomLabelDisplay");
        AbstractC22676k.m65750j(barColor, "barColor");
        this.topLabel = str;
        this.bottomLabelDisplay = bottomLabelDisplay;
        this.barColor = barColor;
        this.percentage = d3;
    }
}
