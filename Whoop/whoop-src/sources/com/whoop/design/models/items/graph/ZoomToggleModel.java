package com.whoop.design.models.items.graph;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0016¨\u0006("}, m65681d2 = {"Lcom/whoop/design/models/items/graph/ZoomToggleModel;", "", "", "zoomInLevel", "zoomOutLevel", "<init>", "(FF)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IFFLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/ZoomToggleModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()F", "component2", "copy", "(FF)Lcom/whoop/design/models/items/graph/ZoomToggleModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getZoomInLevel", "getZoomOutLevel", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ZoomToggleModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final float zoomInLevel;
    private final float zoomOutLevel;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/ZoomToggleModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/ZoomToggleModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ZoomToggleModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ZoomToggleModel() {
        float f13 = 0.0f;
        this(f13, f13, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ZoomToggleModel copy$default(ZoomToggleModel zoomToggleModel, float f13, float f14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = zoomToggleModel.zoomInLevel;
        }
        if ((i13 & 2) != 0) {
            f14 = zoomToggleModel.zoomOutLevel;
        }
        return zoomToggleModel.copy(f13, f14);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ZoomToggleModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || Float.compare(self.zoomInLevel, 2.0f) != 0) {
            output.encodeFloatElement(serialDesc, 0, self.zoomInLevel);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && Float.compare(self.zoomOutLevel, 1.0f) == 0) {
            return;
        }
        output.encodeFloatElement(serialDesc, 1, self.zoomOutLevel);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getZoomInLevel() {
        return this.zoomInLevel;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getZoomOutLevel() {
        return this.zoomOutLevel;
    }

    public final ZoomToggleModel copy(float zoomInLevel, float zoomOutLevel) {
        return new ZoomToggleModel(zoomInLevel, zoomOutLevel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ZoomToggleModel)) {
            return false;
        }
        ZoomToggleModel zoomToggleModel = (ZoomToggleModel) other;
        return Float.compare(this.zoomInLevel, zoomToggleModel.zoomInLevel) == 0 && Float.compare(this.zoomOutLevel, zoomToggleModel.zoomOutLevel) == 0;
    }

    public final float getZoomInLevel() {
        return this.zoomInLevel;
    }

    public final float getZoomOutLevel() {
        return this.zoomOutLevel;
    }

    public int hashCode() {
        return Float.hashCode(this.zoomOutLevel) + (Float.hashCode(this.zoomInLevel) * 31);
    }

    public String toString() {
        return AbstractC31061c.m95638n("ZoomToggleModel(zoomInLevel=", this.zoomInLevel, ", zoomOutLevel=", this.zoomOutLevel, ")");
    }

    public ZoomToggleModel(float f13, float f14) {
        this.zoomInLevel = f13;
        this.zoomOutLevel = f14;
    }

    public /* synthetic */ ZoomToggleModel(int i13, float f13, float f14, SerializationConstructorMarker serializationConstructorMarker) {
        this.zoomInLevel = (i13 & 1) == 0 ? 2.0f : f13;
        if ((i13 & 2) == 0) {
            this.zoomOutLevel = 1.0f;
        } else {
            this.zoomOutLevel = f14;
        }
    }

    public /* synthetic */ ZoomToggleModel(float f13, float f14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 2.0f : f13, (i13 & 2) != 0 ? 1.0f : f14);
    }
}
