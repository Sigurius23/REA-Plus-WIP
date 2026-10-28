package com.whoop.user.journey.model.yearinreview.chronologicalsection;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJL\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001bJ\u0010\u0010&\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b&\u0010\u001eJ\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b1\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010!R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b4\u0010\u001b¨\u00067"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "subtitle", "", "value", "valueSuffix", "", "fillPercentage", "progressStyle", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;DLjava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;DLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$user_journey_release", "(Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "()D", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;DLjava/lang/String;)Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "I", "getValue", "getValueSuffix", "D", "getFillPercentage", "getProgressStyle", "Companion", "$serializer", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GaugeValueModel implements DesignSystemModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final double fillPercentage;
    private final String progressStyle;
    private final String subtitle;
    private final String title;
    private final int value;
    private final String valueSuffix;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel;", "serializer", "()Lwc3/c;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GaugeValueModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ GaugeValueModel(int i13, String str, String str2, int i14, String str3, double d3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, GaugeValueModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.subtitle = str2;
        this.value = i14;
        this.valueSuffix = str3;
        this.fillPercentage = d3;
        this.progressStyle = str4;
    }

    public static /* synthetic */ GaugeValueModel copy$default(GaugeValueModel gaugeValueModel, String str, String str2, int i13, String str3, double d3, String str4, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = gaugeValueModel.title;
        }
        if ((i14 & 2) != 0) {
            str2 = gaugeValueModel.subtitle;
        }
        if ((i14 & 4) != 0) {
            i13 = gaugeValueModel.value;
        }
        if ((i14 & 8) != 0) {
            str3 = gaugeValueModel.valueSuffix;
        }
        if ((i14 & 16) != 0) {
            d3 = gaugeValueModel.fillPercentage;
        }
        if ((i14 & 32) != 0) {
            str4 = gaugeValueModel.progressStyle;
        }
        String str5 = str4;
        double d14 = d3;
        return gaugeValueModel.copy(str, str2, i13, str3, d14, str5);
    }

    public static final /* synthetic */ void write$Self$user_journey_release(GaugeValueModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.subtitle);
        output.encodeIntElement(serialDesc, 2, self.value);
        output.encodeStringElement(serialDesc, 3, self.valueSuffix);
        output.encodeDoubleElement(serialDesc, 4, self.fillPercentage);
        output.encodeStringElement(serialDesc, 5, self.progressStyle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getValueSuffix() {
        return this.valueSuffix;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getFillPercentage() {
        return this.fillPercentage;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getProgressStyle() {
        return this.progressStyle;
    }

    public final GaugeValueModel copy(String title, String subtitle, int value, String valueSuffix, double fillPercentage, String progressStyle) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(valueSuffix, "valueSuffix");
        AbstractC22676k.m65750j(progressStyle, "progressStyle");
        return new GaugeValueModel(title, subtitle, value, valueSuffix, fillPercentage, progressStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GaugeValueModel)) {
            return false;
        }
        GaugeValueModel gaugeValueModel = (GaugeValueModel) other;
        return AbstractC22676k.m65745e(this.title, gaugeValueModel.title) && AbstractC22676k.m65745e(this.subtitle, gaugeValueModel.subtitle) && this.value == gaugeValueModel.value && AbstractC22676k.m65745e(this.valueSuffix, gaugeValueModel.valueSuffix) && Double.compare(this.fillPercentage, gaugeValueModel.fillPercentage) == 0 && AbstractC22676k.m65745e(this.progressStyle, gaugeValueModel.progressStyle);
    }

    public final double getFillPercentage() {
        return this.fillPercentage;
    }

    public final String getProgressStyle() {
        return this.progressStyle;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getValue() {
        return this.value;
    }

    public final String getValueSuffix() {
        return this.valueSuffix;
    }

    public int hashCode() {
        return this.progressStyle.hashCode() + AbstractC17176i.m48499a(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.value, AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle), 31), 31, this.valueSuffix), 31, this.fillPercentage);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        int i13 = this.value;
        String str3 = this.valueSuffix;
        double d3 = this.fillPercentage;
        String str4 = this.progressStyle;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("GaugeValueModel(title=", str, ", subtitle=", str2, ", value=");
        AbstractC11895b.m31979B(i13, ", valueSuffix=", str3, ", fillPercentage=", sbM32001t);
        sbM32001t.append(d3);
        sbM32001t.append(", progressStyle=");
        sbM32001t.append(str4);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public GaugeValueModel(String title, String subtitle, int i13, String valueSuffix, double d3, String progressStyle) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(valueSuffix, "valueSuffix");
        AbstractC22676k.m65750j(progressStyle, "progressStyle");
        this.title = title;
        this.subtitle = subtitle;
        this.value = i13;
        this.valueSuffix = valueSuffix;
        this.fillPercentage = d3;
        this.progressStyle = progressStyle;
    }
}
