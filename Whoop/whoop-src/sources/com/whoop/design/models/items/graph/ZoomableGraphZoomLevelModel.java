package com.whoop.design.models.items.graph;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0017¨\u0006+"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;", "", "", "defaultZoomLevel", "minZoomLevel", "maxZoomLevel", "<init>", "(FFF)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IFFFLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()F", "component2", "component3", "copy", "(FFF)Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getDefaultZoomLevel", "getMinZoomLevel", "getMaxZoomLevel", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ZoomableGraphZoomLevelModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final float defaultZoomLevel;
    private final float maxZoomLevel;
    private final float minZoomLevel;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/ZoomableGraphZoomLevelModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ZoomableGraphZoomLevelModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ZoomableGraphZoomLevelModel() {
        this(0.0f, 0.0f, 0.0f, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ZoomableGraphZoomLevelModel copy$default(ZoomableGraphZoomLevelModel zoomableGraphZoomLevelModel, float f13, float f14, float f15, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = zoomableGraphZoomLevelModel.defaultZoomLevel;
        }
        if ((i13 & 2) != 0) {
            f14 = zoomableGraphZoomLevelModel.minZoomLevel;
        }
        if ((i13 & 4) != 0) {
            f15 = zoomableGraphZoomLevelModel.maxZoomLevel;
        }
        return zoomableGraphZoomLevelModel.copy(f13, f14, f15);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ZoomableGraphZoomLevelModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || Float.compare(self.defaultZoomLevel, 1.0f) != 0) {
            output.encodeFloatElement(serialDesc, 0, self.defaultZoomLevel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || Float.compare(self.minZoomLevel, 1.0f) != 0) {
            output.encodeFloatElement(serialDesc, 1, self.minZoomLevel);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && Float.compare(self.maxZoomLevel, 5.0f) == 0) {
            return;
        }
        output.encodeFloatElement(serialDesc, 2, self.maxZoomLevel);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getDefaultZoomLevel() {
        return this.defaultZoomLevel;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getMinZoomLevel() {
        return this.minZoomLevel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getMaxZoomLevel() {
        return this.maxZoomLevel;
    }

    public final ZoomableGraphZoomLevelModel copy(float defaultZoomLevel, float minZoomLevel, float maxZoomLevel) {
        return new ZoomableGraphZoomLevelModel(defaultZoomLevel, minZoomLevel, maxZoomLevel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ZoomableGraphZoomLevelModel)) {
            return false;
        }
        ZoomableGraphZoomLevelModel zoomableGraphZoomLevelModel = (ZoomableGraphZoomLevelModel) other;
        return Float.compare(this.defaultZoomLevel, zoomableGraphZoomLevelModel.defaultZoomLevel) == 0 && Float.compare(this.minZoomLevel, zoomableGraphZoomLevelModel.minZoomLevel) == 0 && Float.compare(this.maxZoomLevel, zoomableGraphZoomLevelModel.maxZoomLevel) == 0;
    }

    public final float getDefaultZoomLevel() {
        return this.defaultZoomLevel;
    }

    public final float getMaxZoomLevel() {
        return this.maxZoomLevel;
    }

    public final float getMinZoomLevel() {
        return this.minZoomLevel;
    }

    public int hashCode() {
        return Float.hashCode(this.maxZoomLevel) + AbstractC11266d.m30447a(this.minZoomLevel, Float.hashCode(this.defaultZoomLevel) * 31, 31);
    }

    public String toString() {
        return AbstractC30007c.m91837g(this.maxZoomLevel, ")", AbstractC2875y.m8307t("ZoomableGraphZoomLevelModel(defaultZoomLevel=", this.defaultZoomLevel, ", minZoomLevel=", this.minZoomLevel, ", maxZoomLevel="));
    }

    public ZoomableGraphZoomLevelModel(float f13, float f14, float f15) {
        this.defaultZoomLevel = f13;
        this.minZoomLevel = f14;
        this.maxZoomLevel = f15;
    }

    public /* synthetic */ ZoomableGraphZoomLevelModel(int i13, float f13, float f14, float f15, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.defaultZoomLevel = 1.0f;
        } else {
            this.defaultZoomLevel = f13;
        }
        if ((i13 & 2) == 0) {
            this.minZoomLevel = 1.0f;
        } else {
            this.minZoomLevel = f14;
        }
        if ((i13 & 4) == 0) {
            this.maxZoomLevel = 5.0f;
        } else {
            this.maxZoomLevel = f15;
        }
    }

    public /* synthetic */ ZoomableGraphZoomLevelModel(float f13, float f14, float f15, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 1.0f : f13, (i13 & 2) != 0 ? 1.0f : f14, (i13 & 4) != 0 ? 5.0f : f15);
    }
}
