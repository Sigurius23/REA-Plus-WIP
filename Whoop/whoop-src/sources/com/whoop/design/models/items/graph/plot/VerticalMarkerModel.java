package com.whoop.design.models.items.graph.plot;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b,\u0010\u001b¨\u0006/"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/VerticalMarkerModel;", "", "", "xpercent", "", "markerType", "label", "subLabel", "<init>", "(FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/plot/VerticalMarkerModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()F", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/graph/plot/VerticalMarkerModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getXpercent", "Ljava/lang/String;", "getMarkerType", "getLabel", "getSubLabel", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class VerticalMarkerModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String label;
    private final String markerType;
    private final String subLabel;
    private final float xpercent;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/VerticalMarkerModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/plot/VerticalMarkerModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return VerticalMarkerModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public VerticalMarkerModel(float f13, String markerType, String label, String subLabel) {
        AbstractC22676k.m65750j(markerType, "markerType");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(subLabel, "subLabel");
        this.xpercent = f13;
        this.markerType = markerType;
        this.label = label;
        this.subLabel = subLabel;
    }

    public static /* synthetic */ VerticalMarkerModel copy$default(VerticalMarkerModel verticalMarkerModel, float f13, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = verticalMarkerModel.xpercent;
        }
        if ((i13 & 2) != 0) {
            str = verticalMarkerModel.markerType;
        }
        if ((i13 & 4) != 0) {
            str2 = verticalMarkerModel.label;
        }
        if ((i13 & 8) != 0) {
            str3 = verticalMarkerModel.subLabel;
        }
        return verticalMarkerModel.copy(f13, str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$design_models_release(VerticalMarkerModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeFloatElement(serialDesc, 0, self.xpercent);
        output.encodeStringElement(serialDesc, 1, self.markerType);
        output.encodeStringElement(serialDesc, 2, self.label);
        output.encodeStringElement(serialDesc, 3, self.subLabel);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getXpercent() {
        return this.xpercent;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMarkerType() {
        return this.markerType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubLabel() {
        return this.subLabel;
    }

    public final VerticalMarkerModel copy(float xpercent, String markerType, String label, String subLabel) {
        AbstractC22676k.m65750j(markerType, "markerType");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(subLabel, "subLabel");
        return new VerticalMarkerModel(xpercent, markerType, label, subLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerticalMarkerModel)) {
            return false;
        }
        VerticalMarkerModel verticalMarkerModel = (VerticalMarkerModel) other;
        return Float.compare(this.xpercent, verticalMarkerModel.xpercent) == 0 && AbstractC22676k.m65745e(this.markerType, verticalMarkerModel.markerType) && AbstractC22676k.m65745e(this.label, verticalMarkerModel.label) && AbstractC22676k.m65745e(this.subLabel, verticalMarkerModel.subLabel);
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getMarkerType() {
        return this.markerType;
    }

    public final String getSubLabel() {
        return this.subLabel;
    }

    public final float getXpercent() {
        return this.xpercent;
    }

    public int hashCode() {
        return this.subLabel.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(Float.hashCode(this.xpercent) * 31, 31, this.markerType), 31, this.label);
    }

    public String toString() {
        float f13 = this.xpercent;
        String str = this.markerType;
        String str2 = this.label;
        String str3 = this.subLabel;
        StringBuilder sb4 = new StringBuilder("VerticalMarkerModel(xpercent=");
        sb4.append(f13);
        sb4.append(", markerType=");
        sb4.append(str);
        sb4.append(", label=");
        return AbstractC11266d.m30464r(sb4, str2, ", subLabel=", str3, ")");
    }

    public /* synthetic */ VerticalMarkerModel(int i13, float f13, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, VerticalMarkerModel$$serializer.INSTANCE.getDescriptor());
        }
        this.xpercent = f13;
        this.markerType = str;
        this.label = str2;
        this.subLabel = str3;
    }
}
