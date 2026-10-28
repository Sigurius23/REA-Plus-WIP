package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36959f;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ:\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b0\u0010\u001e¨\u00063"}, m65681d2 = {"Lcom/whoop/design/models/items/ItemsCardFooterModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/items/ItemsCardFooterAlignment;", "alignment", "Lcom/whoop/navigation/e;", "ctaDestination", "", "ctaIcon", "ctaTitle", "<init>", "(Lcom/whoop/design/models/items/ItemsCardFooterAlignment;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/ItemsCardFooterAlignment;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ItemsCardFooterModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/ItemsCardFooterAlignment;", "component2", "()Lcom/whoop/navigation/e;", "component3", "()Ljava/lang/String;", "component4", "copy", "(Lcom/whoop/design/models/items/ItemsCardFooterAlignment;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/ItemsCardFooterModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/ItemsCardFooterAlignment;", "getAlignment", "Lcom/whoop/navigation/e;", "getCtaDestination", "Ljava/lang/String;", "getCtaIcon", "getCtaTitle", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ItemsCardFooterModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final ItemsCardFooterAlignment alignment;
    private final C9598e ctaDestination;
    private final String ctaIcon;
    private final String ctaTitle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ItemsCardFooterModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ItemsCardFooterModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ItemsCardFooterModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C36959f(24)), AbstractC30060g.m92087G(enumC23463i, new C36959f(25)), null, null};
    }

    public ItemsCardFooterModel() {
        this((ItemsCardFooterAlignment) null, (C9598e) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.ItemsCardFooterAlignment", ItemsCardFooterAlignment.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ ItemsCardFooterModel copy$default(ItemsCardFooterModel itemsCardFooterModel, ItemsCardFooterAlignment itemsCardFooterAlignment, C9598e c9598e, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            itemsCardFooterAlignment = itemsCardFooterModel.alignment;
        }
        if ((i13 & 2) != 0) {
            c9598e = itemsCardFooterModel.ctaDestination;
        }
        if ((i13 & 4) != 0) {
            str = itemsCardFooterModel.ctaIcon;
        }
        if ((i13 & 8) != 0) {
            str2 = itemsCardFooterModel.ctaTitle;
        }
        return itemsCardFooterModel.copy(itemsCardFooterAlignment, c9598e, str, str2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ItemsCardFooterModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.alignment != ItemsCardFooterAlignment.END) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.alignment);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.ctaDestination != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.ctaDestination);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.ctaIcon, "ARROW_FORWARD")) {
            output.encodeStringElement(serialDesc, 2, self.ctaIcon);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && AbstractC22676k.m65745e(self.ctaTitle, "")) {
            return;
        }
        output.encodeStringElement(serialDesc, 3, self.ctaTitle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ItemsCardFooterAlignment getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C9598e getCtaDestination() {
        return this.ctaDestination;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCtaIcon() {
        return this.ctaIcon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCtaTitle() {
        return this.ctaTitle;
    }

    public final ItemsCardFooterModel copy(ItemsCardFooterAlignment alignment, C9598e ctaDestination, String ctaIcon, String ctaTitle) {
        AbstractC22676k.m65750j(alignment, "alignment");
        AbstractC22676k.m65750j(ctaIcon, "ctaIcon");
        AbstractC22676k.m65750j(ctaTitle, "ctaTitle");
        return new ItemsCardFooterModel(alignment, ctaDestination, ctaIcon, ctaTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemsCardFooterModel)) {
            return false;
        }
        ItemsCardFooterModel itemsCardFooterModel = (ItemsCardFooterModel) other;
        return this.alignment == itemsCardFooterModel.alignment && AbstractC22676k.m65745e(this.ctaDestination, itemsCardFooterModel.ctaDestination) && AbstractC22676k.m65745e(this.ctaIcon, itemsCardFooterModel.ctaIcon) && AbstractC22676k.m65745e(this.ctaTitle, itemsCardFooterModel.ctaTitle);
    }

    public final ItemsCardFooterAlignment getAlignment() {
        return this.alignment;
    }

    public final C9598e getCtaDestination() {
        return this.ctaDestination;
    }

    public final String getCtaIcon() {
        return this.ctaIcon;
    }

    public final String getCtaTitle() {
        return this.ctaTitle;
    }

    public int hashCode() {
        int iHashCode = this.alignment.hashCode() * 31;
        C9598e c9598e = this.ctaDestination;
        return this.ctaTitle.hashCode() + AbstractC11266d.m30450d((iHashCode + (c9598e == null ? 0 : c9598e.hashCode())) * 31, 31, this.ctaIcon);
    }

    public String toString() {
        ItemsCardFooterAlignment itemsCardFooterAlignment = this.alignment;
        C9598e c9598e = this.ctaDestination;
        String str = this.ctaIcon;
        String str2 = this.ctaTitle;
        StringBuilder sb4 = new StringBuilder("ItemsCardFooterModel(alignment=");
        sb4.append(itemsCardFooterAlignment);
        sb4.append(", ctaDestination=");
        sb4.append(c9598e);
        sb4.append(", ctaIcon=");
        return AbstractC11266d.m30464r(sb4, str, ", ctaTitle=", str2, ")");
    }

    public /* synthetic */ ItemsCardFooterModel(int i13, ItemsCardFooterAlignment itemsCardFooterAlignment, C9598e c9598e, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.alignment = (i13 & 1) == 0 ? ItemsCardFooterAlignment.END : itemsCardFooterAlignment;
        if ((i13 & 2) == 0) {
            this.ctaDestination = null;
        } else {
            this.ctaDestination = c9598e;
        }
        if ((i13 & 4) == 0) {
            this.ctaIcon = "ARROW_FORWARD";
        } else {
            this.ctaIcon = str;
        }
        if ((i13 & 8) == 0) {
            this.ctaTitle = "";
        } else {
            this.ctaTitle = str2;
        }
    }

    public ItemsCardFooterModel(ItemsCardFooterAlignment alignment, C9598e c9598e, String ctaIcon, String ctaTitle) {
        AbstractC22676k.m65750j(alignment, "alignment");
        AbstractC22676k.m65750j(ctaIcon, "ctaIcon");
        AbstractC22676k.m65750j(ctaTitle, "ctaTitle");
        this.alignment = alignment;
        this.ctaDestination = c9598e;
        this.ctaIcon = ctaIcon;
        this.ctaTitle = ctaTitle;
    }

    public /* synthetic */ ItemsCardFooterModel(ItemsCardFooterAlignment itemsCardFooterAlignment, C9598e c9598e, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? ItemsCardFooterAlignment.END : itemsCardFooterAlignment, (i13 & 2) != 0 ? null : c9598e, (i13 & 4) != 0 ? "ARROW_FORWARD" : str, (i13 & 8) != 0 ? "" : str2);
    }
}
