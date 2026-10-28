package com.whoop.design.models.items.whooprow;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.AxisSizeType;
import com.whoop.design.models.items.CrossAxisAlignment;
import com.whoop.design.models.items.MainAxisAlignment;
import com.whoop.design.models.items.Spacing;
import com.whoop.design.models.items.SpacingInsets;
import com.whoop.design.models.items.SpacingInsets$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import eb1.C13005a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002KJBk\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013Bq\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b&\u0010'Jt\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001aJ\u0010\u0010+\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101J'\u0010:\u001a\u0002072\u0006\u00102\u001a\u00020\u00002\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0001¢\u0006\u0004\b8\u00109R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010=\u001a\u0004\b>\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010?\u001a\u0004\b@\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\bB\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010C\u001a\u0004\bD\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bE\u0010 R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010F\u001a\u0004\bG\u0010%R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010H\u001a\u0004\bI\u0010'¨\u0006L"}, m65681d2 = {"Lcom/whoop/design/models/items/whooprow/WhoopRowModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "", "Lcom/whoop/design/models/items/whooprow/WhoopRowItemModel;", "items", "Lcom/whoop/design/models/items/Spacing;", "spacing", "Lcom/whoop/design/models/items/AxisSizeType;", "mainAxisSize", "Lcom/whoop/design/models/items/MainAxisAlignment;", "mainAxisAlignment", "crossAxisSize", "Lcom/whoop/design/models/items/CrossAxisAlignment;", "crossAxisAlignment", "Lcom/whoop/design/models/items/SpacingInsets;", "padding", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/Spacing;Lcom/whoop/design/models/items/AxisSizeType;Lcom/whoop/design/models/items/MainAxisAlignment;Lcom/whoop/design/models/items/AxisSizeType;Lcom/whoop/design/models/items/CrossAxisAlignment;Lcom/whoop/design/models/items/SpacingInsets;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/Spacing;Lcom/whoop/design/models/items/AxisSizeType;Lcom/whoop/design/models/items/MainAxisAlignment;Lcom/whoop/design/models/items/AxisSizeType;Lcom/whoop/design/models/items/CrossAxisAlignment;Lcom/whoop/design/models/items/SpacingInsets;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/design/models/items/Spacing;", "component4", "()Lcom/whoop/design/models/items/AxisSizeType;", "component5", "()Lcom/whoop/design/models/items/MainAxisAlignment;", "component6", "component7", "()Lcom/whoop/design/models/items/CrossAxisAlignment;", "component8", "()Lcom/whoop/design/models/items/SpacingInsets;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/Spacing;Lcom/whoop/design/models/items/AxisSizeType;Lcom/whoop/design/models/items/MainAxisAlignment;Lcom/whoop/design/models/items/AxisSizeType;Lcom/whoop/design/models/items/CrossAxisAlignment;Lcom/whoop/design/models/items/SpacingInsets;)Lcom/whoop/design/models/items/whooprow/WhoopRowModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/whooprow/WhoopRowModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getItems", "Lcom/whoop/design/models/items/Spacing;", "getSpacing", "Lcom/whoop/design/models/items/AxisSizeType;", "getMainAxisSize", "Lcom/whoop/design/models/items/MainAxisAlignment;", "getMainAxisAlignment", "getCrossAxisSize", "Lcom/whoop/design/models/items/CrossAxisAlignment;", "getCrossAxisAlignment", "Lcom/whoop/design/models/items/SpacingInsets;", "getPadding", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WhoopRowModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final CrossAxisAlignment crossAxisAlignment;
    private final AxisSizeType crossAxisSize;
    private final String id;
    private final List<WhoopRowItemModel> items;
    private final MainAxisAlignment mainAxisAlignment;
    private final AxisSizeType mainAxisSize;
    private final SpacingInsets padding;
    private final Spacing spacing;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/whooprow/WhoopRowModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/whooprow/WhoopRowModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WhoopRowModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C13005a(1)), AbstractC30060g.m92087G(enumC23463i, new C13005a(2)), AbstractC30060g.m92087G(enumC23463i, new C13005a(3)), AbstractC30060g.m92087G(enumC23463i, new C13005a(4)), AbstractC30060g.m92087G(enumC23463i, new C13005a(5)), AbstractC30060g.m92087G(enumC23463i, new C13005a(6)), null};
    }

    public WhoopRowModel() {
        this((String) null, (List) null, (Spacing) null, (AxisSizeType) null, (MainAxisAlignment) null, (AxisSizeType) null, (CrossAxisAlignment) null, (SpacingInsets) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(WhoopRowItemModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return Spacing.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return AxisSizeType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        return MainAxisAlignment.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$3() {
        return AxisSizeType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$4() {
        return CrossAxisAlignment.INSTANCE.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WhoopRowModel copy$default(WhoopRowModel whoopRowModel, String str, List list, Spacing spacing, AxisSizeType axisSizeType, MainAxisAlignment mainAxisAlignment, AxisSizeType axisSizeType2, CrossAxisAlignment crossAxisAlignment, SpacingInsets spacingInsets, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = whoopRowModel.id;
        }
        if ((i13 & 2) != 0) {
            list = whoopRowModel.items;
        }
        if ((i13 & 4) != 0) {
            spacing = whoopRowModel.spacing;
        }
        if ((i13 & 8) != 0) {
            axisSizeType = whoopRowModel.mainAxisSize;
        }
        if ((i13 & 16) != 0) {
            mainAxisAlignment = whoopRowModel.mainAxisAlignment;
        }
        if ((i13 & 32) != 0) {
            axisSizeType2 = whoopRowModel.crossAxisSize;
        }
        if ((i13 & 64) != 0) {
            crossAxisAlignment = whoopRowModel.crossAxisAlignment;
        }
        if ((i13 & 128) != 0) {
            spacingInsets = whoopRowModel.padding;
        }
        CrossAxisAlignment crossAxisAlignment2 = crossAxisAlignment;
        SpacingInsets spacingInsets2 = spacingInsets;
        MainAxisAlignment mainAxisAlignment2 = mainAxisAlignment;
        AxisSizeType axisSizeType3 = axisSizeType2;
        return whoopRowModel.copy(str, list, spacing, axisSizeType, mainAxisAlignment2, axisSizeType3, crossAxisAlignment2, spacingInsets2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(WhoopRowModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.id != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.items, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.items);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.spacing != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.spacing);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.mainAxisSize != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.mainAxisSize);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.mainAxisAlignment != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.mainAxisAlignment);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.crossAxisSize != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.crossAxisSize);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.crossAxisAlignment != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.crossAxisAlignment);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.padding == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, SpacingInsets$$serializer.INSTANCE, self.padding);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<WhoopRowItemModel> component2() {
        return this.items;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Spacing getSpacing() {
        return this.spacing;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AxisSizeType getMainAxisSize() {
        return this.mainAxisSize;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final MainAxisAlignment getMainAxisAlignment() {
        return this.mainAxisAlignment;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AxisSizeType getCrossAxisSize() {
        return this.crossAxisSize;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final SpacingInsets getPadding() {
        return this.padding;
    }

    public final WhoopRowModel copy(String id4, List<WhoopRowItemModel> items, Spacing spacing, AxisSizeType mainAxisSize, MainAxisAlignment mainAxisAlignment, AxisSizeType crossAxisSize, CrossAxisAlignment crossAxisAlignment, SpacingInsets padding) {
        AbstractC22676k.m65750j(items, "items");
        return new WhoopRowModel(id4, items, spacing, mainAxisSize, mainAxisAlignment, crossAxisSize, crossAxisAlignment, padding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhoopRowModel)) {
            return false;
        }
        WhoopRowModel whoopRowModel = (WhoopRowModel) other;
        return AbstractC22676k.m65745e(this.id, whoopRowModel.id) && AbstractC22676k.m65745e(this.items, whoopRowModel.items) && this.spacing == whoopRowModel.spacing && this.mainAxisSize == whoopRowModel.mainAxisSize && this.mainAxisAlignment == whoopRowModel.mainAxisAlignment && this.crossAxisSize == whoopRowModel.crossAxisSize && this.crossAxisAlignment == whoopRowModel.crossAxisAlignment && AbstractC22676k.m65745e(this.padding, whoopRowModel.padding);
    }

    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final AxisSizeType getCrossAxisSize() {
        return this.crossAxisSize;
    }

    public final String getId() {
        return this.id;
    }

    public final List<WhoopRowItemModel> getItems() {
        return this.items;
    }

    public final MainAxisAlignment getMainAxisAlignment() {
        return this.mainAxisAlignment;
    }

    public final AxisSizeType getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final SpacingInsets getPadding() {
        return this.padding;
    }

    public final Spacing getSpacing() {
        return this.spacing;
    }

    public int hashCode() {
        String str = this.id;
        int iM31983b = AbstractC11895b.m31983b((str == null ? 0 : str.hashCode()) * 31, 31, this.items);
        Spacing spacing = this.spacing;
        int iHashCode = (iM31983b + (spacing == null ? 0 : spacing.hashCode())) * 31;
        AxisSizeType axisSizeType = this.mainAxisSize;
        int iHashCode2 = (iHashCode + (axisSizeType == null ? 0 : axisSizeType.hashCode())) * 31;
        MainAxisAlignment mainAxisAlignment = this.mainAxisAlignment;
        int iHashCode3 = (iHashCode2 + (mainAxisAlignment == null ? 0 : mainAxisAlignment.hashCode())) * 31;
        AxisSizeType axisSizeType2 = this.crossAxisSize;
        int iHashCode4 = (iHashCode3 + (axisSizeType2 == null ? 0 : axisSizeType2.hashCode())) * 31;
        CrossAxisAlignment crossAxisAlignment = this.crossAxisAlignment;
        int iHashCode5 = (iHashCode4 + (crossAxisAlignment == null ? 0 : crossAxisAlignment.hashCode())) * 31;
        SpacingInsets spacingInsets = this.padding;
        return iHashCode5 + (spacingInsets != null ? spacingInsets.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        List<WhoopRowItemModel> list = this.items;
        Spacing spacing = this.spacing;
        AxisSizeType axisSizeType = this.mainAxisSize;
        MainAxisAlignment mainAxisAlignment = this.mainAxisAlignment;
        AxisSizeType axisSizeType2 = this.crossAxisSize;
        CrossAxisAlignment crossAxisAlignment = this.crossAxisAlignment;
        SpacingInsets spacingInsets = this.padding;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("WhoopRowModel(id=", str, ", items=", ", spacing=", list);
        sbM94766o.append(spacing);
        sbM94766o.append(", mainAxisSize=");
        sbM94766o.append(axisSizeType);
        sbM94766o.append(", mainAxisAlignment=");
        sbM94766o.append(mainAxisAlignment);
        sbM94766o.append(", crossAxisSize=");
        sbM94766o.append(axisSizeType2);
        sbM94766o.append(", crossAxisAlignment=");
        sbM94766o.append(crossAxisAlignment);
        sbM94766o.append(", padding=");
        sbM94766o.append(spacingInsets);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public /* synthetic */ WhoopRowModel(int i13, String str, List list, Spacing spacing, AxisSizeType axisSizeType, MainAxisAlignment mainAxisAlignment, AxisSizeType axisSizeType2, CrossAxisAlignment crossAxisAlignment, SpacingInsets spacingInsets, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i13 & 2) == 0) {
            this.items = C25271y.f99162w;
        } else {
            this.items = list;
        }
        if ((i13 & 4) == 0) {
            this.spacing = null;
        } else {
            this.spacing = spacing;
        }
        if ((i13 & 8) == 0) {
            this.mainAxisSize = null;
        } else {
            this.mainAxisSize = axisSizeType;
        }
        if ((i13 & 16) == 0) {
            this.mainAxisAlignment = null;
        } else {
            this.mainAxisAlignment = mainAxisAlignment;
        }
        if ((i13 & 32) == 0) {
            this.crossAxisSize = null;
        } else {
            this.crossAxisSize = axisSizeType2;
        }
        if ((i13 & 64) == 0) {
            this.crossAxisAlignment = null;
        } else {
            this.crossAxisAlignment = crossAxisAlignment;
        }
        if ((i13 & 128) == 0) {
            this.padding = null;
        } else {
            this.padding = spacingInsets;
        }
    }

    public WhoopRowModel(String str, List<WhoopRowItemModel> items, Spacing spacing, AxisSizeType axisSizeType, MainAxisAlignment mainAxisAlignment, AxisSizeType axisSizeType2, CrossAxisAlignment crossAxisAlignment, SpacingInsets spacingInsets) {
        AbstractC22676k.m65750j(items, "items");
        this.id = str;
        this.items = items;
        this.spacing = spacing;
        this.mainAxisSize = axisSizeType;
        this.mainAxisAlignment = mainAxisAlignment;
        this.crossAxisSize = axisSizeType2;
        this.crossAxisAlignment = crossAxisAlignment;
        this.padding = spacingInsets;
    }

    public /* synthetic */ WhoopRowModel(String str, List list, Spacing spacing, AxisSizeType axisSizeType, MainAxisAlignment mainAxisAlignment, AxisSizeType axisSizeType2, CrossAxisAlignment crossAxisAlignment, SpacingInsets spacingInsets, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? null : spacing, (i13 & 8) != 0 ? null : axisSizeType, (i13 & 16) != 0 ? null : mainAxisAlignment, (i13 & 32) != 0 ? null : axisSizeType2, (i13 & 64) != 0 ? null : crossAxisAlignment, (i13 & 128) != 0 ? null : spacingInsets);
    }
}
