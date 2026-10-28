package com.whoop.design.models.items.graph.plot.trend;

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
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bBQ\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJP\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b1\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b2\u0010\u001f¨\u00065"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;", "", "", "topLabel", "bottomLabel", "style", "", "positionX", "positionY", "widthPercent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDD)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()D", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDD)Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTopLabel", "getBottomLabel", "getStyle", "D", "getPositionX", "getPositionY", "getWidthPercent", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TrendSegmentModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String bottomLabel;
    private final double positionX;
    private final double positionY;
    private final String style;
    private final String topLabel;
    private final double widthPercent;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TrendSegmentModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TrendSegmentModel(int i13, String str, String str2, String str3, double d3, double d14, double d15, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, TrendSegmentModel$$serializer.INSTANCE.getDescriptor());
        }
        this.topLabel = str;
        this.bottomLabel = str2;
        this.style = str3;
        this.positionX = d3;
        this.positionY = d14;
        this.widthPercent = d15;
    }

    public static /* synthetic */ TrendSegmentModel copy$default(TrendSegmentModel trendSegmentModel, String str, String str2, String str3, double d3, double d14, double d15, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = trendSegmentModel.topLabel;
        }
        if ((i13 & 2) != 0) {
            str2 = trendSegmentModel.bottomLabel;
        }
        if ((i13 & 4) != 0) {
            str3 = trendSegmentModel.style;
        }
        if ((i13 & 8) != 0) {
            d3 = trendSegmentModel.positionX;
        }
        if ((i13 & 16) != 0) {
            d14 = trendSegmentModel.positionY;
        }
        if ((i13 & 32) != 0) {
            d15 = trendSegmentModel.widthPercent;
        }
        double d16 = d15;
        double d17 = d14;
        String str4 = str3;
        return trendSegmentModel.copy(str, str2, str4, d3, d17, d16);
    }

    public static final /* synthetic */ void write$Self$design_models_release(TrendSegmentModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.topLabel);
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.bottomLabel);
        output.encodeStringElement(serialDesc, 2, self.style);
        output.encodeDoubleElement(serialDesc, 3, self.positionX);
        output.encodeDoubleElement(serialDesc, 4, self.positionY);
        output.encodeDoubleElement(serialDesc, 5, self.widthPercent);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTopLabel() {
        return this.topLabel;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBottomLabel() {
        return this.bottomLabel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getPositionX() {
        return this.positionX;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getPositionY() {
        return this.positionY;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getWidthPercent() {
        return this.widthPercent;
    }

    public final TrendSegmentModel copy(String topLabel, String bottomLabel, String style, double positionX, double positionY, double widthPercent) {
        AbstractC22676k.m65750j(style, "style");
        return new TrendSegmentModel(topLabel, bottomLabel, style, positionX, positionY, widthPercent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrendSegmentModel)) {
            return false;
        }
        TrendSegmentModel trendSegmentModel = (TrendSegmentModel) other;
        return AbstractC22676k.m65745e(this.topLabel, trendSegmentModel.topLabel) && AbstractC22676k.m65745e(this.bottomLabel, trendSegmentModel.bottomLabel) && AbstractC22676k.m65745e(this.style, trendSegmentModel.style) && Double.compare(this.positionX, trendSegmentModel.positionX) == 0 && Double.compare(this.positionY, trendSegmentModel.positionY) == 0 && Double.compare(this.widthPercent, trendSegmentModel.widthPercent) == 0;
    }

    public final String getBottomLabel() {
        return this.bottomLabel;
    }

    public final double getPositionX() {
        return this.positionX;
    }

    public final double getPositionY() {
        return this.positionY;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getTopLabel() {
        return this.topLabel;
    }

    public final double getWidthPercent() {
        return this.widthPercent;
    }

    public int hashCode() {
        String str = this.topLabel;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bottomLabel;
        return Double.hashCode(this.widthPercent) + AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC11266d.m30450d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.style), 31, this.positionX), 31, this.positionY);
    }

    public String toString() {
        String str = this.topLabel;
        String str2 = this.bottomLabel;
        String str3 = this.style;
        double d3 = this.positionX;
        double d14 = this.positionY;
        double d15 = this.widthPercent;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("TrendSegmentModel(topLabel=", str, ", bottomLabel=", str2, ", style=");
        sbM32001t.append(str3);
        sbM32001t.append(", positionX=");
        sbM32001t.append(d3);
        AbstractC31061c.m95622B(sbM32001t, ", positionY=", d14, ", widthPercent=");
        return AbstractC30007c.m91836f(d15, ")", sbM32001t);
    }

    public TrendSegmentModel(String str, String str2, String style, double d3, double d14, double d15) {
        AbstractC22676k.m65750j(style, "style");
        this.topLabel = str;
        this.bottomLabel = str2;
        this.style = style;
        this.positionX = d3;
        this.positionY = d14;
        this.widthPercent = d15;
    }
}
