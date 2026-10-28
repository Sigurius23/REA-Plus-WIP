package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
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
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36955b;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287BE\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JN\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b4\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010#¨\u00069"}, m65681d2 = {"Lcom/whoop/design/models/items/ColumnModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "", "items", "Lcom/whoop/design/models/items/Spacing;", "spacing", "horizontalAlignment", "Lcom/whoop/design/models/items/ColumnItemEntrance;", "itemEntrance", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/Spacing;Ljava/lang/String;Lcom/whoop/design/models/items/ColumnItemEntrance;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/Spacing;Ljava/lang/String;Lcom/whoop/design/models/items/ColumnItemEntrance;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ColumnModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/design/models/items/Spacing;", "component4", "component5", "()Lcom/whoop/design/models/items/ColumnItemEntrance;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/Spacing;Ljava/lang/String;Lcom/whoop/design/models/items/ColumnItemEntrance;)Lcom/whoop/design/models/items/ColumnModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getItems", "Lcom/whoop/design/models/items/Spacing;", "getSpacing", "getHorizontalAlignment", "Lcom/whoop/design/models/items/ColumnItemEntrance;", "getItemEntrance", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ColumnModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final String horizontalAlignment;
    private final String id;
    private final ColumnItemEntrance itemEntrance;
    private final List<DesignSystemModel> items;
    private final Spacing spacing;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ColumnModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ColumnModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ColumnModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C36955b(2)), AbstractC30060g.m92087G(enumC23463i, new C36955b(3)), null, null};
    }

    public ColumnModel() {
        this((String) null, (List) null, (Spacing) null, (String) null, (ColumnItemEntrance) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return Spacing.INSTANCE.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ColumnModel copy$default(ColumnModel columnModel, String str, List list, Spacing spacing, String str2, ColumnItemEntrance columnItemEntrance, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = columnModel.id;
        }
        if ((i13 & 2) != 0) {
            list = columnModel.items;
        }
        if ((i13 & 4) != 0) {
            spacing = columnModel.spacing;
        }
        if ((i13 & 8) != 0) {
            str2 = columnModel.horizontalAlignment;
        }
        if ((i13 & 16) != 0) {
            columnItemEntrance = columnModel.itemEntrance;
        }
        ColumnItemEntrance columnItemEntrance2 = columnItemEntrance;
        Spacing spacing2 = spacing;
        return columnModel.copy(str, list, spacing2, str2, columnItemEntrance2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ColumnModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.id != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.items, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.items);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.spacing != Spacing.NONE) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.spacing);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.horizontalAlignment != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.horizontalAlignment);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.itemEntrance == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, ColumnItemEntrance$$serializer.INSTANCE, self.itemEntrance);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<DesignSystemModel> component2() {
        return this.items;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Spacing getSpacing() {
        return this.spacing;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ColumnItemEntrance getItemEntrance() {
        return this.itemEntrance;
    }

    public final ColumnModel copy(String id4, List<? extends DesignSystemModel> items, Spacing spacing, String horizontalAlignment, ColumnItemEntrance itemEntrance) {
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(spacing, "spacing");
        return new ColumnModel(id4, items, spacing, horizontalAlignment, itemEntrance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColumnModel)) {
            return false;
        }
        ColumnModel columnModel = (ColumnModel) other;
        return AbstractC22676k.m65745e(this.id, columnModel.id) && AbstractC22676k.m65745e(this.items, columnModel.items) && this.spacing == columnModel.spacing && AbstractC22676k.m65745e(this.horizontalAlignment, columnModel.horizontalAlignment) && AbstractC22676k.m65745e(this.itemEntrance, columnModel.itemEntrance);
    }

    public final String getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    public final String getId() {
        return this.id;
    }

    public final ColumnItemEntrance getItemEntrance() {
        return this.itemEntrance;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final Spacing getSpacing() {
        return this.spacing;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (this.spacing.hashCode() + AbstractC11895b.m31983b((str == null ? 0 : str.hashCode()) * 31, 31, this.items)) * 31;
        String str2 = this.horizontalAlignment;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ColumnItemEntrance columnItemEntrance = this.itemEntrance;
        return iHashCode2 + (columnItemEntrance != null ? columnItemEntrance.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        List<DesignSystemModel> list = this.items;
        Spacing spacing = this.spacing;
        String str2 = this.horizontalAlignment;
        ColumnItemEntrance columnItemEntrance = this.itemEntrance;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("ColumnModel(id=", str, ", items=", ", spacing=", list);
        sbM94766o.append(spacing);
        sbM94766o.append(", horizontalAlignment=");
        sbM94766o.append(str2);
        sbM94766o.append(", itemEntrance=");
        sbM94766o.append(columnItemEntrance);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public /* synthetic */ ColumnModel(int i13, String str, List list, Spacing spacing, String str2, ColumnItemEntrance columnItemEntrance, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.spacing = Spacing.NONE;
        } else {
            this.spacing = spacing;
        }
        if ((i13 & 8) == 0) {
            this.horizontalAlignment = null;
        } else {
            this.horizontalAlignment = str2;
        }
        if ((i13 & 16) == 0) {
            this.itemEntrance = null;
        } else {
            this.itemEntrance = columnItemEntrance;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ColumnModel(String str, List<? extends DesignSystemModel> items, Spacing spacing, String str2, ColumnItemEntrance columnItemEntrance) {
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(spacing, "spacing");
        this.id = str;
        this.items = items;
        this.spacing = spacing;
        this.horizontalAlignment = str2;
        this.itemEntrance = columnItemEntrance;
    }

    public /* synthetic */ ColumnModel(String str, List list, Spacing spacing, String str2, ColumnItemEntrance columnItemEntrance, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? Spacing.NONE : spacing, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : columnItemEntrance);
    }
}
