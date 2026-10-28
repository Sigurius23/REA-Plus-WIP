package com.whoop.trends.data.model;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u0018R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b-\u0010(\u001a\u0004\b,\u0010\u001b¨\u00060"}, m65681d2 = {"Lcom/whoop/trends/data/model/SegmentalAnalysisTrendReadingModel;", "", "", "startX", "endX", "", "style", "<init>", "(DDLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IDDLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$trends_release", "(Lcom/whoop/trends/data/model/SegmentalAnalysisTrendReadingModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()D", "component2", "component3", "()Ljava/lang/String;", "copy", "(DDLjava/lang/String;)Lcom/whoop/trends/data/model/SegmentalAnalysisTrendReadingModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getStartX", "getStartX$annotations", "()V", "getEndX", "getEndX$annotations", "Ljava/lang/String;", "getStyle", "getStyle$annotations", "Companion", "$serializer", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SegmentalAnalysisTrendReadingModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("end_x")
    private final double endX;

    @SerializedName("start_x")
    private final double startX;

    @SerializedName("style")
    private final String style;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/trends/data/model/SegmentalAnalysisTrendReadingModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/trends/data/model/SegmentalAnalysisTrendReadingModel;", "serializer", "()Lwc3/c;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SegmentalAnalysisTrendReadingModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SegmentalAnalysisTrendReadingModel(double d3, double d14, String style) {
        AbstractC22676k.m65750j(style, "style");
        this.startX = d3;
        this.endX = d14;
        this.style = style;
    }

    public static /* synthetic */ SegmentalAnalysisTrendReadingModel copy$default(SegmentalAnalysisTrendReadingModel segmentalAnalysisTrendReadingModel, double d3, double d14, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            d3 = segmentalAnalysisTrendReadingModel.startX;
        }
        double d15 = d3;
        if ((i13 & 2) != 0) {
            d14 = segmentalAnalysisTrendReadingModel.endX;
        }
        double d16 = d14;
        if ((i13 & 4) != 0) {
            str = segmentalAnalysisTrendReadingModel.style;
        }
        return segmentalAnalysisTrendReadingModel.copy(d15, d16, str);
    }

    @InterfaceC37143h("end_x")
    public static /* synthetic */ void getEndX$annotations() {
    }

    @InterfaceC37143h("start_x")
    public static /* synthetic */ void getStartX$annotations() {
    }

    @InterfaceC37143h("style")
    public static /* synthetic */ void getStyle$annotations() {
    }

    public static final /* synthetic */ void write$Self$trends_release(SegmentalAnalysisTrendReadingModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeDoubleElement(serialDesc, 0, self.startX);
        output.encodeDoubleElement(serialDesc, 1, self.endX);
        output.encodeStringElement(serialDesc, 2, self.style);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getStartX() {
        return this.startX;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getEndX() {
        return this.endX;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    public final SegmentalAnalysisTrendReadingModel copy(double startX, double endX, String style) {
        AbstractC22676k.m65750j(style, "style");
        return new SegmentalAnalysisTrendReadingModel(startX, endX, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SegmentalAnalysisTrendReadingModel)) {
            return false;
        }
        SegmentalAnalysisTrendReadingModel segmentalAnalysisTrendReadingModel = (SegmentalAnalysisTrendReadingModel) other;
        return Double.compare(this.startX, segmentalAnalysisTrendReadingModel.startX) == 0 && Double.compare(this.endX, segmentalAnalysisTrendReadingModel.endX) == 0 && AbstractC22676k.m65745e(this.style, segmentalAnalysisTrendReadingModel.style);
    }

    public final double getEndX() {
        return this.endX;
    }

    public final double getStartX() {
        return this.startX;
    }

    public final String getStyle() {
        return this.style;
    }

    public int hashCode() {
        return this.style.hashCode() + AbstractC17176i.m48499a(Double.hashCode(this.startX) * 31, 31, this.endX);
    }

    public String toString() {
        double d3 = this.startX;
        double d14 = this.endX;
        String str = this.style;
        StringBuilder sbM8306s = AbstractC2875y.m8306s("SegmentalAnalysisTrendReadingModel(startX=", d3, ", endX=");
        sbM8306s.append(d14);
        sbM8306s.append(", style=");
        sbM8306s.append(str);
        sbM8306s.append(")");
        return sbM8306s.toString();
    }

    public /* synthetic */ SegmentalAnalysisTrendReadingModel(int i13, double d3, double d14, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, SegmentalAnalysisTrendReadingModel$$serializer.INSTANCE.getDescriptor());
        }
        this.startX = d3;
        this.endX = d14;
        this.style = str;
    }
}
