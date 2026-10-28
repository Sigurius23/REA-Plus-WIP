package com.whoop.design.models.items.whooprow;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.AxisSize;
import com.whoop.design.models.items.AxisSize$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import eb1.C13005a;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006+"}, m65681d2 = {"Lcom/whoop/design/models/items/whooprow/WhoopRowItemModel;", "", "Lcom/whoop/design/models/DesignSystemModel;", "item", "Lcom/whoop/design/models/items/AxisSize;", "width", "<init>", "(Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/AxisSize;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/AxisSize;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/whooprow/WhoopRowItemModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/DesignSystemModel;", "component2", "()Lcom/whoop/design/models/items/AxisSize;", "copy", "(Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/items/AxisSize;)Lcom/whoop/design/models/items/whooprow/WhoopRowItemModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/DesignSystemModel;", "getItem", "Lcom/whoop/design/models/items/AxisSize;", "getWidth", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WhoopRowItemModel {
    private final DesignSystemModel item;
    private final AxisSize width;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C13005a(0)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/whooprow/WhoopRowItemModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/whooprow/WhoopRowItemModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WhoopRowItemModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WhoopRowItemModel() {
        this((DesignSystemModel) null, (AxisSize) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    public static /* synthetic */ WhoopRowItemModel copy$default(WhoopRowItemModel whoopRowItemModel, DesignSystemModel designSystemModel, AxisSize axisSize, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            designSystemModel = whoopRowItemModel.item;
        }
        if ((i13 & 2) != 0) {
            axisSize = whoopRowItemModel.width;
        }
        return whoopRowItemModel.copy(designSystemModel, axisSize);
    }

    public static final /* synthetic */ void write$Self$design_models_release(WhoopRowItemModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.item != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.item);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.width == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, AxisSize$$serializer.INSTANCE, self.width);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DesignSystemModel getItem() {
        return this.item;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AxisSize getWidth() {
        return this.width;
    }

    public final WhoopRowItemModel copy(DesignSystemModel item, AxisSize width) {
        return new WhoopRowItemModel(item, width);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhoopRowItemModel)) {
            return false;
        }
        WhoopRowItemModel whoopRowItemModel = (WhoopRowItemModel) other;
        return AbstractC22676k.m65745e(this.item, whoopRowItemModel.item) && AbstractC22676k.m65745e(this.width, whoopRowItemModel.width);
    }

    public final DesignSystemModel getItem() {
        return this.item;
    }

    public final AxisSize getWidth() {
        return this.width;
    }

    public int hashCode() {
        DesignSystemModel designSystemModel = this.item;
        int iHashCode = (designSystemModel == null ? 0 : designSystemModel.hashCode()) * 31;
        AxisSize axisSize = this.width;
        return iHashCode + (axisSize != null ? axisSize.hashCode() : 0);
    }

    public String toString() {
        return "WhoopRowItemModel(item=" + this.item + ", width=" + this.width + ")";
    }

    public /* synthetic */ WhoopRowItemModel(int i13, DesignSystemModel designSystemModel, AxisSize axisSize, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.item = null;
        } else {
            this.item = designSystemModel;
        }
        if ((i13 & 2) == 0) {
            this.width = null;
        } else {
            this.width = axisSize;
        }
    }

    public WhoopRowItemModel(DesignSystemModel designSystemModel, AxisSize axisSize) {
        this.item = designSystemModel;
        this.width = axisSize;
    }

    public /* synthetic */ WhoopRowItemModel(DesignSystemModel designSystemModel, AxisSize axisSize, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : designSystemModel, (i13 & 2) != 0 ? null : axisSize);
    }
}
