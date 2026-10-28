package com.whoop.trends.data.model;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
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
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBG\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJB\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b/\u0010,\u001a\u0004\b.\u0010\u001cR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00100\u0012\u0004\b2\u0010,\u001a\u0004\b1\u0010\u001eR \u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00100\u0012\u0004\b4\u0010,\u001a\u0004\b3\u0010\u001eR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010)\u0012\u0004\b6\u0010,\u001a\u0004\b5\u0010\u001a¨\u00069"}, m65681d2 = {"Lcom/whoop/trends/data/model/SegmentsModel;", "", "", "style", "", "widthPercent", "", "lowerBound", "upperBound", "displayValue", "<init>", "(Ljava/lang/String;DIILjava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;DIILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$trends_release", "(Lcom/whoop/trends/data/model/SegmentsModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()D", "component3", "()I", "component4", "component5", "copy", "(Ljava/lang/String;DIILjava/lang/String;)Lcom/whoop/trends/data/model/SegmentsModel;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStyle", "getStyle$annotations", "()V", "D", "getWidthPercent", "getWidthPercent$annotations", "I", "getLowerBound", "getLowerBound$annotations", "getUpperBound", "getUpperBound$annotations", "getDisplayValue", "getDisplayValue$annotations", "Companion", "$serializer", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SegmentsModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("display_value")
    private final String displayValue;

    @SerializedName("lower_bound")
    private final int lowerBound;

    @SerializedName("style")
    private final String style;

    @SerializedName("upper_bound")
    private final int upperBound;

    @SerializedName("width_percent")
    private final double widthPercent;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/trends/data/model/SegmentsModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/trends/data/model/SegmentsModel;", "serializer", "()Lwc3/c;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SegmentsModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SegmentsModel(int i13, String str, double d3, int i14, int i15, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, SegmentsModel$$serializer.INSTANCE.getDescriptor());
        }
        this.style = str;
        this.widthPercent = d3;
        this.lowerBound = i14;
        this.upperBound = i15;
        this.displayValue = str2;
    }

    public static /* synthetic */ SegmentsModel copy$default(SegmentsModel segmentsModel, String str, double d3, int i13, int i14, String str2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = segmentsModel.style;
        }
        if ((i15 & 2) != 0) {
            d3 = segmentsModel.widthPercent;
        }
        if ((i15 & 4) != 0) {
            i13 = segmentsModel.lowerBound;
        }
        if ((i15 & 8) != 0) {
            i14 = segmentsModel.upperBound;
        }
        if ((i15 & 16) != 0) {
            str2 = segmentsModel.displayValue;
        }
        String str3 = str2;
        int i16 = i13;
        return segmentsModel.copy(str, d3, i16, i14, str3);
    }

    @InterfaceC37143h("display_value")
    public static /* synthetic */ void getDisplayValue$annotations() {
    }

    @InterfaceC37143h("lower_bound")
    public static /* synthetic */ void getLowerBound$annotations() {
    }

    @InterfaceC37143h("style")
    public static /* synthetic */ void getStyle$annotations() {
    }

    @InterfaceC37143h("upper_bound")
    public static /* synthetic */ void getUpperBound$annotations() {
    }

    @InterfaceC37143h("width_percent")
    public static /* synthetic */ void getWidthPercent$annotations() {
    }

    public static final /* synthetic */ void write$Self$trends_release(SegmentsModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.style);
        output.encodeDoubleElement(serialDesc, 1, self.widthPercent);
        output.encodeIntElement(serialDesc, 2, self.lowerBound);
        output.encodeIntElement(serialDesc, 3, self.upperBound);
        output.encodeStringElement(serialDesc, 4, self.displayValue);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getWidthPercent() {
        return this.widthPercent;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLowerBound() {
        return this.lowerBound;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getUpperBound() {
        return this.upperBound;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDisplayValue() {
        return this.displayValue;
    }

    public final SegmentsModel copy(String style, double widthPercent, int lowerBound, int upperBound, String displayValue) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(displayValue, "displayValue");
        return new SegmentsModel(style, widthPercent, lowerBound, upperBound, displayValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SegmentsModel)) {
            return false;
        }
        SegmentsModel segmentsModel = (SegmentsModel) other;
        return AbstractC22676k.m65745e(this.style, segmentsModel.style) && Double.compare(this.widthPercent, segmentsModel.widthPercent) == 0 && this.lowerBound == segmentsModel.lowerBound && this.upperBound == segmentsModel.upperBound && AbstractC22676k.m65745e(this.displayValue, segmentsModel.displayValue);
    }

    public final String getDisplayValue() {
        return this.displayValue;
    }

    public final int getLowerBound() {
        return this.lowerBound;
    }

    public final String getStyle() {
        return this.style;
    }

    public final int getUpperBound() {
        return this.upperBound;
    }

    public final double getWidthPercent() {
        return this.widthPercent;
    }

    public int hashCode() {
        return this.displayValue.hashCode() + AbstractC11266d.m30448b(this.upperBound, AbstractC11266d.m30448b(this.lowerBound, AbstractC17176i.m48499a(this.style.hashCode() * 31, 31, this.widthPercent), 31), 31);
    }

    public String toString() {
        String str = this.style;
        double d3 = this.widthPercent;
        int i13 = this.lowerBound;
        int i14 = this.upperBound;
        String str2 = this.displayValue;
        StringBuilder sb4 = new StringBuilder("SegmentsModel(style=");
        sb4.append(str);
        sb4.append(", widthPercent=");
        sb4.append(d3);
        sb4.append(", lowerBound=");
        sb4.append(i13);
        sb4.append(", upperBound=");
        sb4.append(i14);
        return AbstractC2875y.m8304q(sb4, ", displayValue=", str2, ")");
    }

    public SegmentsModel(String style, double d3, int i13, int i14, String displayValue) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(displayValue, "displayValue");
        this.style = style;
        this.widthPercent = d3;
        this.lowerBound = i13;
        this.upperBound = i14;
        this.displayValue = displayValue;
    }
}
