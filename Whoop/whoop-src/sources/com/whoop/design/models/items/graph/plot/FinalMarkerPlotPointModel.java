package com.whoop.design.models.items.graph.plot;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ2\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u0006/"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotPointModel;", "", "", "positionY", "", "style", "Lcom/whoop/design/models/items/graph/plot/MarkerTheme;", "theme", "<init>", "(FLjava/lang/String;Lcom/whoop/design/models/items/graph/plot/MarkerTheme;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IFLjava/lang/String;Lcom/whoop/design/models/items/graph/plot/MarkerTheme;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotPointModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()F", "component2", "()Ljava/lang/String;", "component3", "()Lcom/whoop/design/models/items/graph/plot/MarkerTheme;", "copy", "(FLjava/lang/String;Lcom/whoop/design/models/items/graph/plot/MarkerTheme;)Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotPointModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getPositionY", "Ljava/lang/String;", "getStyle", "Lcom/whoop/design/models/items/graph/plot/MarkerTheme;", "getTheme", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FinalMarkerPlotPointModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final float positionY;
    private final String style;
    private final MarkerTheme theme;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotPointModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotPointModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FinalMarkerPlotPointModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FinalMarkerPlotPointModel(float f13, String str, MarkerTheme markerTheme) {
        this.positionY = f13;
        this.style = str;
        this.theme = markerTheme;
    }

    public static /* synthetic */ FinalMarkerPlotPointModel copy$default(FinalMarkerPlotPointModel finalMarkerPlotPointModel, float f13, String str, MarkerTheme markerTheme, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = finalMarkerPlotPointModel.positionY;
        }
        if ((i13 & 2) != 0) {
            str = finalMarkerPlotPointModel.style;
        }
        if ((i13 & 4) != 0) {
            markerTheme = finalMarkerPlotPointModel.theme;
        }
        return finalMarkerPlotPointModel.copy(f13, str, markerTheme);
    }

    public static final /* synthetic */ void write$Self$design_models_release(FinalMarkerPlotPointModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeFloatElement(serialDesc, 0, self.positionY);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.style);
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.theme == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, MarkerTheme$$serializer.INSTANCE, self.theme);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getPositionY() {
        return this.positionY;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MarkerTheme getTheme() {
        return this.theme;
    }

    public final FinalMarkerPlotPointModel copy(float positionY, String style, MarkerTheme theme) {
        return new FinalMarkerPlotPointModel(positionY, style, theme);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinalMarkerPlotPointModel)) {
            return false;
        }
        FinalMarkerPlotPointModel finalMarkerPlotPointModel = (FinalMarkerPlotPointModel) other;
        return Float.compare(this.positionY, finalMarkerPlotPointModel.positionY) == 0 && AbstractC22676k.m65745e(this.style, finalMarkerPlotPointModel.style) && AbstractC22676k.m65745e(this.theme, finalMarkerPlotPointModel.theme);
    }

    public final float getPositionY() {
        return this.positionY;
    }

    public final String getStyle() {
        return this.style;
    }

    public final MarkerTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int iHashCode = Float.hashCode(this.positionY) * 31;
        String str = this.style;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        MarkerTheme markerTheme = this.theme;
        return iHashCode2 + (markerTheme != null ? markerTheme.hashCode() : 0);
    }

    public String toString() {
        return "FinalMarkerPlotPointModel(positionY=" + this.positionY + ", style=" + this.style + ", theme=" + this.theme + ")";
    }

    public /* synthetic */ FinalMarkerPlotPointModel(int i13, float f13, String str, MarkerTheme markerTheme, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, FinalMarkerPlotPointModel$$serializer.INSTANCE.getDescriptor());
        }
        this.positionY = f13;
        this.style = str;
        if ((i13 & 4) == 0) {
            this.theme = null;
        } else {
            this.theme = markerTheme;
        }
    }

    public /* synthetic */ FinalMarkerPlotPointModel(float f13, String str, MarkerTheme markerTheme, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, str, (i13 & 4) != 0 ? null : markerTheme);
    }
}
