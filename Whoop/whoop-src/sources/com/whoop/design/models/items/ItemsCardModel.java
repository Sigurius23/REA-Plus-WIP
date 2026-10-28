package com.whoop.design.models.items;

import c13.AbstractC3855a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import un1.C35100f;
import v71.EnumC35760a;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fBY\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010\"JV\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010\"R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b8\u0010\"¨\u0006;"}, m65681d2 = {"Lcom/whoop/design/models/items/ItemsCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/items/ItemsCardHeaderModel;", "header", "Lcom/whoop/design/models/items/ItemsCardFooterModel;", "footer", "Lv71/a;", "backgroundStyle", "", "items", "footerItems", "<init>", "(Lcom/whoop/design/models/items/ItemsCardHeaderModel;Lcom/whoop/design/models/items/ItemsCardFooterModel;Lv71/a;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/ItemsCardHeaderModel;Lcom/whoop/design/models/items/ItemsCardFooterModel;Lv71/a;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ItemsCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/ItemsCardHeaderModel;", "component2", "()Lcom/whoop/design/models/items/ItemsCardFooterModel;", "component3", "()Lv71/a;", "component4", "()Ljava/util/List;", "component5", "copy", "(Lcom/whoop/design/models/items/ItemsCardHeaderModel;Lcom/whoop/design/models/items/ItemsCardFooterModel;Lv71/a;Ljava/util/List;Ljava/util/List;)Lcom/whoop/design/models/items/ItemsCardModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/ItemsCardHeaderModel;", "getHeader", "Lcom/whoop/design/models/items/ItemsCardFooterModel;", "getFooter", "Lv71/a;", "getBackgroundStyle", "Ljava/util/List;", "getItems", "getFooterItems", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ItemsCardModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final EnumC35760a backgroundStyle;
    private final ItemsCardFooterModel footer;
    private final List<DesignSystemModel> footerItems;
    private final ItemsCardHeaderModel header;
    private final List<DesignSystemModel> items;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ItemsCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ItemsCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ItemsCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C35100f(18)), AbstractC30060g.m92087G(enumC23463i, new C35100f(19)), AbstractC30060g.m92087G(enumC23463i, new C35100f(20))};
    }

    public /* synthetic */ ItemsCardModel(int i13, ItemsCardHeaderModel itemsCardHeaderModel, ItemsCardFooterModel itemsCardFooterModel, EnumC35760a enumC35760a, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, ItemsCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.header = itemsCardHeaderModel;
        this.footer = itemsCardFooterModel;
        this.backgroundStyle = enumC35760a;
        this.items = list;
        this.footerItems = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.organism.itemscard.ItemsCardBackgroundStyle", EnumC35760a.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ItemsCardModel copy$default(ItemsCardModel itemsCardModel, ItemsCardHeaderModel itemsCardHeaderModel, ItemsCardFooterModel itemsCardFooterModel, EnumC35760a enumC35760a, List list, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            itemsCardHeaderModel = itemsCardModel.header;
        }
        if ((i13 & 2) != 0) {
            itemsCardFooterModel = itemsCardModel.footer;
        }
        if ((i13 & 4) != 0) {
            enumC35760a = itemsCardModel.backgroundStyle;
        }
        if ((i13 & 8) != 0) {
            list = itemsCardModel.items;
        }
        if ((i13 & 16) != 0) {
            list2 = itemsCardModel.footerItems;
        }
        List list3 = list2;
        EnumC35760a enumC35760a2 = enumC35760a;
        return itemsCardModel.copy(itemsCardHeaderModel, itemsCardFooterModel, enumC35760a2, list, list3);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ItemsCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, ItemsCardHeaderModel$$serializer.INSTANCE, self.header);
        output.encodeNullableSerializableElement(serialDesc, 1, ItemsCardFooterModel$$serializer.INSTANCE, self.footer);
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.backgroundStyle);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.items);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.footerItems);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ItemsCardHeaderModel getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ItemsCardFooterModel getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EnumC35760a getBackgroundStyle() {
        return this.backgroundStyle;
    }

    public final List<DesignSystemModel> component4() {
        return this.items;
    }

    public final List<DesignSystemModel> component5() {
        return this.footerItems;
    }

    public final ItemsCardModel copy(ItemsCardHeaderModel header, ItemsCardFooterModel footer, EnumC35760a backgroundStyle, List<? extends DesignSystemModel> items, List<? extends DesignSystemModel> footerItems) {
        AbstractC22676k.m65750j(items, "items");
        return new ItemsCardModel(header, footer, backgroundStyle, items, footerItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemsCardModel)) {
            return false;
        }
        ItemsCardModel itemsCardModel = (ItemsCardModel) other;
        return AbstractC22676k.m65745e(this.header, itemsCardModel.header) && AbstractC22676k.m65745e(this.footer, itemsCardModel.footer) && this.backgroundStyle == itemsCardModel.backgroundStyle && AbstractC22676k.m65745e(this.items, itemsCardModel.items) && AbstractC22676k.m65745e(this.footerItems, itemsCardModel.footerItems);
    }

    public final EnumC35760a getBackgroundStyle() {
        return this.backgroundStyle;
    }

    public final ItemsCardFooterModel getFooter() {
        return this.footer;
    }

    public final List<DesignSystemModel> getFooterItems() {
        return this.footerItems;
    }

    public final ItemsCardHeaderModel getHeader() {
        return this.header;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public int hashCode() {
        ItemsCardHeaderModel itemsCardHeaderModel = this.header;
        int iHashCode = (itemsCardHeaderModel == null ? 0 : itemsCardHeaderModel.hashCode()) * 31;
        ItemsCardFooterModel itemsCardFooterModel = this.footer;
        int iHashCode2 = (iHashCode + (itemsCardFooterModel == null ? 0 : itemsCardFooterModel.hashCode())) * 31;
        EnumC35760a enumC35760a = this.backgroundStyle;
        int iM31983b = AbstractC11895b.m31983b((iHashCode2 + (enumC35760a == null ? 0 : enumC35760a.hashCode())) * 31, 31, this.items);
        List<DesignSystemModel> list = this.footerItems;
        return iM31983b + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        ItemsCardHeaderModel itemsCardHeaderModel = this.header;
        ItemsCardFooterModel itemsCardFooterModel = this.footer;
        EnumC35760a enumC35760a = this.backgroundStyle;
        List<DesignSystemModel> list = this.items;
        List<DesignSystemModel> list2 = this.footerItems;
        StringBuilder sb4 = new StringBuilder("ItemsCardModel(header=");
        sb4.append(itemsCardHeaderModel);
        sb4.append(", footer=");
        sb4.append(itemsCardFooterModel);
        sb4.append(", backgroundStyle=");
        sb4.append(enumC35760a);
        sb4.append(", items=");
        sb4.append(list);
        sb4.append(", footerItems=");
        return AbstractC3855a.m11829m(sb4, list2, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ItemsCardModel(ItemsCardHeaderModel itemsCardHeaderModel, ItemsCardFooterModel itemsCardFooterModel, EnumC35760a enumC35760a, List<? extends DesignSystemModel> items, List<? extends DesignSystemModel> list) {
        AbstractC22676k.m65750j(items, "items");
        this.header = itemsCardHeaderModel;
        this.footer = itemsCardFooterModel;
        this.backgroundStyle = enumC35760a;
        this.items = items;
        this.footerItems = list;
    }
}
