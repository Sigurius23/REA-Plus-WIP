package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import un1.C35100f;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B!\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010&\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b(\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001a¨\u0006-"}, m65681d2 = {"Lcom/whoop/design/models/items/SplitContainerCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "startItem", "endItem", "", "showDivider", "<init>", "(Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/SplitContainerCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/DesignSystemModel;", "component2", "component3", "()Z", "copy", "(Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Z)Lcom/whoop/design/models/items/SplitContainerCardModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/DesignSystemModel;", "getStartItem", "getEndItem", "Z", "getShowDivider", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SplitContainerCardModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final DesignSystemModel endItem;
    private final boolean showDivider;
    private final DesignSystemModel startItem;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/SplitContainerCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/SplitContainerCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SplitContainerCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C35100f(28)), AbstractC30060g.m92087G(enumC23463i, new C35100f(29)), null};
    }

    public /* synthetic */ SplitContainerCardModel(int i13, DesignSystemModel designSystemModel, DesignSystemModel designSystemModel2, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, SplitContainerCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.startItem = designSystemModel;
        this.endItem = designSystemModel2;
        if ((i13 & 4) == 0) {
            this.showDivider = false;
        } else {
            this.showDivider = z4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]);
    }

    public static /* synthetic */ SplitContainerCardModel copy$default(SplitContainerCardModel splitContainerCardModel, DesignSystemModel designSystemModel, DesignSystemModel designSystemModel2, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            designSystemModel = splitContainerCardModel.startItem;
        }
        if ((i13 & 2) != 0) {
            designSystemModel2 = splitContainerCardModel.endItem;
        }
        if ((i13 & 4) != 0) {
            z4 = splitContainerCardModel.showDivider;
        }
        return splitContainerCardModel.copy(designSystemModel, designSystemModel2, z4);
    }

    public static final /* synthetic */ void write$Self$design_models_release(SplitContainerCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.startItem);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.endItem);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.showDivider) {
            output.encodeBooleanElement(serialDesc, 2, self.showDivider);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DesignSystemModel getStartItem() {
        return this.startItem;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DesignSystemModel getEndItem() {
        return this.endItem;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowDivider() {
        return this.showDivider;
    }

    public final SplitContainerCardModel copy(DesignSystemModel startItem, DesignSystemModel endItem, boolean showDivider) {
        AbstractC22676k.m65750j(startItem, "startItem");
        AbstractC22676k.m65750j(endItem, "endItem");
        return new SplitContainerCardModel(startItem, endItem, showDivider);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitContainerCardModel)) {
            return false;
        }
        SplitContainerCardModel splitContainerCardModel = (SplitContainerCardModel) other;
        return AbstractC22676k.m65745e(this.startItem, splitContainerCardModel.startItem) && AbstractC22676k.m65745e(this.endItem, splitContainerCardModel.endItem) && this.showDivider == splitContainerCardModel.showDivider;
    }

    public final DesignSystemModel getEndItem() {
        return this.endItem;
    }

    public final boolean getShowDivider() {
        return this.showDivider;
    }

    public final DesignSystemModel getStartItem() {
        return this.startItem;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showDivider) + ((this.endItem.hashCode() + (this.startItem.hashCode() * 31)) * 31);
    }

    public String toString() {
        DesignSystemModel designSystemModel = this.startItem;
        DesignSystemModel designSystemModel2 = this.endItem;
        boolean z4 = this.showDivider;
        StringBuilder sb4 = new StringBuilder("SplitContainerCardModel(startItem=");
        sb4.append(designSystemModel);
        sb4.append(", endItem=");
        sb4.append(designSystemModel2);
        sb4.append(", showDivider=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    public SplitContainerCardModel(DesignSystemModel startItem, DesignSystemModel endItem, boolean z4) {
        AbstractC22676k.m65750j(startItem, "startItem");
        AbstractC22676k.m65750j(endItem, "endItem");
        this.startItem = startItem;
        this.endItem = endItem;
        this.showDivider = z4;
    }

    public /* synthetic */ SplitContainerCardModel(DesignSystemModel designSystemModel, DesignSystemModel designSystemModel2, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(designSystemModel, designSystemModel2, (i13 & 4) != 0 ? false : z4);
    }
}
