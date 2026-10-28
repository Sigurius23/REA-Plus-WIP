package com.whoop.design.models.items.expandablestatisticlist;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import dx2.C12430a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBQ\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%JJ\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010\u001fJ\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010!R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00107\u0012\u0004\b9\u00104\u001a\u0004\b8\u0010#R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010:\u0012\u0004\b<\u00104\u001a\u0004\b;\u0010%¨\u0006?"}, m65681d2 = {"Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "", "collapsedCount", "Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;", "header", "", "Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListItemModel;", "expandableListItems", "Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;", "toggleCardButton", "<init>", "(Ljava/lang/String;ILcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;Ljava/util/List;Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ILcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;Ljava/util/List;Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;", "component4", "()Ljava/util/List;", "component5", "()Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;", "copy", "(Ljava/lang/String;ILcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;Ljava/util/List;Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;)Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "I", "getCollapsedCount", "getCollapsedCount$annotations", "()V", "Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListHeaderModel;", "getHeader", "Ljava/util/List;", "getExpandableListItems", "getExpandableListItems$annotations", "Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListButtonModel;", "getToggleCardButton", "getToggleCardButton$annotations", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ExpandableStatisticListModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final int collapsedCount;
    private final List<ExpandableStatisticListItemModel> expandableListItems;
    private final ExpandableStatisticListHeaderModel header;
    private final String id;
    private final ExpandableStatisticListButtonModel toggleCardButton;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/expandablestatisticlist/ExpandableStatisticListModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ExpandableStatisticListModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C12430a(27)), AbstractC30060g.m92087G(enumC23463i, new C12430a(28))};
    }

    public /* synthetic */ ExpandableStatisticListModel(int i13, String str, int i14, ExpandableStatisticListHeaderModel expandableStatisticListHeaderModel, List list, ExpandableStatisticListButtonModel expandableStatisticListButtonModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, ExpandableStatisticListModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.collapsedCount = i14;
        this.header = expandableStatisticListHeaderModel;
        this.expandableListItems = list;
        if ((i13 & 16) == 0) {
            this.toggleCardButton = null;
        } else {
            this.toggleCardButton = expandableStatisticListButtonModel;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ExpandableStatisticListItemModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ExpandableStatisticListButtonModel.class), AbstractC38195a.m122336d(ExpandableStatisticListButtonModel$$serializer.INSTANCE), new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExpandableStatisticListModel copy$default(ExpandableStatisticListModel expandableStatisticListModel, String str, int i13, ExpandableStatisticListHeaderModel expandableStatisticListHeaderModel, List list, ExpandableStatisticListButtonModel expandableStatisticListButtonModel, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = expandableStatisticListModel.id;
        }
        if ((i14 & 2) != 0) {
            i13 = expandableStatisticListModel.collapsedCount;
        }
        if ((i14 & 4) != 0) {
            expandableStatisticListHeaderModel = expandableStatisticListModel.header;
        }
        if ((i14 & 8) != 0) {
            list = expandableStatisticListModel.expandableListItems;
        }
        if ((i14 & 16) != 0) {
            expandableStatisticListButtonModel = expandableStatisticListModel.toggleCardButton;
        }
        ExpandableStatisticListButtonModel expandableStatisticListButtonModel2 = expandableStatisticListButtonModel;
        ExpandableStatisticListHeaderModel expandableStatisticListHeaderModel2 = expandableStatisticListHeaderModel;
        return expandableStatisticListModel.copy(str, i13, expandableStatisticListHeaderModel2, list, expandableStatisticListButtonModel2);
    }

    @InterfaceC37143h("collapsed_count")
    public static /* synthetic */ void getCollapsedCount$annotations() {
    }

    @InterfaceC37143h("expandable_list_items")
    public static /* synthetic */ void getExpandableListItems$annotations() {
    }

    @InterfaceC37143h("toggle_card_button")
    public static /* synthetic */ void getToggleCardButton$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(ExpandableStatisticListModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeIntElement(serialDesc, 1, self.collapsedCount);
        output.encodeSerializableElement(serialDesc, 2, ExpandableStatisticListHeaderModel$$serializer.INSTANCE, self.header);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.expandableListItems);
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.toggleCardButton == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.toggleCardButton);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCollapsedCount() {
        return this.collapsedCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ExpandableStatisticListHeaderModel getHeader() {
        return this.header;
    }

    public final List<ExpandableStatisticListItemModel> component4() {
        return this.expandableListItems;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ExpandableStatisticListButtonModel getToggleCardButton() {
        return this.toggleCardButton;
    }

    public final ExpandableStatisticListModel copy(String id4, int collapsedCount, ExpandableStatisticListHeaderModel header, List<ExpandableStatisticListItemModel> expandableListItems, ExpandableStatisticListButtonModel toggleCardButton) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(expandableListItems, "expandableListItems");
        return new ExpandableStatisticListModel(id4, collapsedCount, header, expandableListItems, toggleCardButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpandableStatisticListModel)) {
            return false;
        }
        ExpandableStatisticListModel expandableStatisticListModel = (ExpandableStatisticListModel) other;
        return AbstractC22676k.m65745e(this.id, expandableStatisticListModel.id) && this.collapsedCount == expandableStatisticListModel.collapsedCount && AbstractC22676k.m65745e(this.header, expandableStatisticListModel.header) && AbstractC22676k.m65745e(this.expandableListItems, expandableStatisticListModel.expandableListItems) && AbstractC22676k.m65745e(this.toggleCardButton, expandableStatisticListModel.toggleCardButton);
    }

    public final int getCollapsedCount() {
        return this.collapsedCount;
    }

    public final List<ExpandableStatisticListItemModel> getExpandableListItems() {
        return this.expandableListItems;
    }

    public final ExpandableStatisticListHeaderModel getHeader() {
        return this.header;
    }

    public final String getId() {
        return this.id;
    }

    public final ExpandableStatisticListButtonModel getToggleCardButton() {
        return this.toggleCardButton;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b((this.header.hashCode() + AbstractC11266d.m30448b(this.collapsedCount, this.id.hashCode() * 31, 31)) * 31, 31, this.expandableListItems);
        ExpandableStatisticListButtonModel expandableStatisticListButtonModel = this.toggleCardButton;
        return iM31983b + (expandableStatisticListButtonModel == null ? 0 : expandableStatisticListButtonModel.hashCode());
    }

    public String toString() {
        String str = this.id;
        int i13 = this.collapsedCount;
        ExpandableStatisticListHeaderModel expandableStatisticListHeaderModel = this.header;
        List<ExpandableStatisticListItemModel> list = this.expandableListItems;
        ExpandableStatisticListButtonModel expandableStatisticListButtonModel = this.toggleCardButton;
        StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "ExpandableStatisticListModel(id=", str, ", collapsedCount=", ", header=");
        sbM30467u.append(expandableStatisticListHeaderModel);
        sbM30467u.append(", expandableListItems=");
        sbM30467u.append(list);
        sbM30467u.append(", toggleCardButton=");
        sbM30467u.append(expandableStatisticListButtonModel);
        sbM30467u.append(")");
        return sbM30467u.toString();
    }

    public ExpandableStatisticListModel(String id4, int i13, ExpandableStatisticListHeaderModel header, List<ExpandableStatisticListItemModel> expandableListItems, ExpandableStatisticListButtonModel expandableStatisticListButtonModel) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(expandableListItems, "expandableListItems");
        this.id = id4;
        this.collapsedCount = i13;
        this.header = header;
        this.expandableListItems = expandableListItems;
        this.toggleCardButton = expandableStatisticListButtonModel;
    }

    public /* synthetic */ ExpandableStatisticListModel(String str, int i13, ExpandableStatisticListHeaderModel expandableStatisticListHeaderModel, List list, ExpandableStatisticListButtonModel expandableStatisticListButtonModel, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, expandableStatisticListHeaderModel, list, (i14 & 16) != 0 ? null : expandableStatisticListButtonModel);
    }
}
