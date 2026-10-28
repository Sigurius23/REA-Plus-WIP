package com.whoop.advancedlabs.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import tb0.C33690a;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B/\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBG\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ>\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010\u001eJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b,\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u001e¨\u00061"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/PanelUpsellDrawerModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "items", "", "collapseButtonTitle", "expandButtonTitle", "", "itemsShownCollapsed", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/PanelUpsellDrawerModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "()I", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;I)Lcom/whoop/advancedlabs/domain/models/PanelUpsellDrawerModel;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "Ljava/lang/String;", "getCollapseButtonTitle", "getExpandButtonTitle", "I", "getItemsShownCollapsed", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PanelUpsellDrawerModel implements DesignSystemModel {
    private final String collapseButtonTitle;
    private final String expandButtonTitle;
    private final List<DesignSystemModel> items;
    private final int itemsShownCollapsed;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C33690a(15)), null, null, null};

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/PanelUpsellDrawerModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/PanelUpsellDrawerModel;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PanelUpsellDrawerModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PanelUpsellDrawerModel(int i13, List list, String str, String str2, int i14, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, PanelUpsellDrawerModel$$serializer.INSTANCE.getDescriptor());
        }
        this.items = list;
        this.collapseButtonTitle = str;
        this.expandButtonTitle = str2;
        if ((i13 & 8) == 0) {
            this.itemsShownCollapsed = 2;
        } else {
            this.itemsShownCollapsed = i14;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PanelUpsellDrawerModel copy$default(PanelUpsellDrawerModel panelUpsellDrawerModel, List list, String str, String str2, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            list = panelUpsellDrawerModel.items;
        }
        if ((i14 & 2) != 0) {
            str = panelUpsellDrawerModel.collapseButtonTitle;
        }
        if ((i14 & 4) != 0) {
            str2 = panelUpsellDrawerModel.expandButtonTitle;
        }
        if ((i14 & 8) != 0) {
            i13 = panelUpsellDrawerModel.itemsShownCollapsed;
        }
        return panelUpsellDrawerModel.copy(list, str, str2, i13);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(PanelUpsellDrawerModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.items);
        output.encodeStringElement(serialDesc, 1, self.collapseButtonTitle);
        output.encodeStringElement(serialDesc, 2, self.expandButtonTitle);
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.itemsShownCollapsed == 2) {
            return;
        }
        output.encodeIntElement(serialDesc, 3, self.itemsShownCollapsed);
    }

    public final List<DesignSystemModel> component1() {
        return this.items;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCollapseButtonTitle() {
        return this.collapseButtonTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getExpandButtonTitle() {
        return this.expandButtonTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getItemsShownCollapsed() {
        return this.itemsShownCollapsed;
    }

    public final PanelUpsellDrawerModel copy(List<? extends DesignSystemModel> items, String collapseButtonTitle, String expandButtonTitle, int itemsShownCollapsed) {
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(collapseButtonTitle, "collapseButtonTitle");
        AbstractC22676k.m65750j(expandButtonTitle, "expandButtonTitle");
        return new PanelUpsellDrawerModel(items, collapseButtonTitle, expandButtonTitle, itemsShownCollapsed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PanelUpsellDrawerModel)) {
            return false;
        }
        PanelUpsellDrawerModel panelUpsellDrawerModel = (PanelUpsellDrawerModel) other;
        return AbstractC22676k.m65745e(this.items, panelUpsellDrawerModel.items) && AbstractC22676k.m65745e(this.collapseButtonTitle, panelUpsellDrawerModel.collapseButtonTitle) && AbstractC22676k.m65745e(this.expandButtonTitle, panelUpsellDrawerModel.expandButtonTitle) && this.itemsShownCollapsed == panelUpsellDrawerModel.itemsShownCollapsed;
    }

    public final String getCollapseButtonTitle() {
        return this.collapseButtonTitle;
    }

    public final String getExpandButtonTitle() {
        return this.expandButtonTitle;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final int getItemsShownCollapsed() {
        return this.itemsShownCollapsed;
    }

    public int hashCode() {
        return Integer.hashCode(this.itemsShownCollapsed) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.items.hashCode() * 31, 31, this.collapseButtonTitle), 31, this.expandButtonTitle);
    }

    public String toString() {
        List<DesignSystemModel> list = this.items;
        String str = this.collapseButtonTitle;
        String str2 = this.expandButtonTitle;
        int i13 = this.itemsShownCollapsed;
        StringBuilder sbM79507k = AbstractC26725a.m79507k("PanelUpsellDrawerModel(items=", ", collapseButtonTitle=", str, ", expandButtonTitle=", list);
        sbM79507k.append(str2);
        sbM79507k.append(", itemsShownCollapsed=");
        sbM79507k.append(i13);
        sbM79507k.append(")");
        return sbM79507k.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PanelUpsellDrawerModel(List<? extends DesignSystemModel> items, String collapseButtonTitle, String expandButtonTitle, int i13) {
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(collapseButtonTitle, "collapseButtonTitle");
        AbstractC22676k.m65750j(expandButtonTitle, "expandButtonTitle");
        this.items = items;
        this.collapseButtonTitle = collapseButtonTitle;
        this.expandButtonTitle = expandButtonTitle;
        this.itemsShownCollapsed = i13;
    }

    public /* synthetic */ PanelUpsellDrawerModel(List list, String str, String str2, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, str2, (i14 & 8) != 0 ? 2 : i13);
    }
}
