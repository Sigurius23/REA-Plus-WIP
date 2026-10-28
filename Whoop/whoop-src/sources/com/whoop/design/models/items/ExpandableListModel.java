package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36957d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 JD\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010 ¨\u00064"}, m65681d2 = {"Lcom/whoop/design/models/items/ExpandableListModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "header", "", "Lcom/whoop/design/models/items/ExpandableRowItemModel;", "items", "Lcom/whoop/design/models/items/SecondaryButtonModel;", "cta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ExpandableListModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Lcom/whoop/design/models/items/SecondaryButtonModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;)Lcom/whoop/design/models/items/ExpandableListModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getHeader", "Ljava/util/List;", "getItems", "Lcom/whoop/design/models/items/SecondaryButtonModel;", "getCta", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ExpandableListModel implements DesignSystemModel {
    private final SecondaryButtonModel cta;
    private final String header;
    private final String id;
    private final List<ExpandableRowItemModel> items;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36957d(4)), null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ExpandableListModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ExpandableListModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ExpandableListModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ExpandableListModel() {
        this((String) null, (String) null, (List) null, (SecondaryButtonModel) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ExpandableRowItemModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExpandableListModel copy$default(ExpandableListModel expandableListModel, String str, String str2, List list, SecondaryButtonModel secondaryButtonModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = expandableListModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = expandableListModel.header;
        }
        if ((i13 & 4) != 0) {
            list = expandableListModel.items;
        }
        if ((i13 & 8) != 0) {
            secondaryButtonModel = expandableListModel.cta;
        }
        return expandableListModel.copy(str, str2, list, secondaryButtonModel);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ExpandableListModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.id != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.header != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.header);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.items, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.items);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.cta == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, SecondaryButtonModel$$serializer.INSTANCE, self.cta);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    public final List<ExpandableRowItemModel> component3() {
        return this.items;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SecondaryButtonModel getCta() {
        return this.cta;
    }

    public final ExpandableListModel copy(String id4, String header, List<ExpandableRowItemModel> items, SecondaryButtonModel cta) {
        AbstractC22676k.m65750j(items, "items");
        return new ExpandableListModel(id4, header, items, cta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpandableListModel)) {
            return false;
        }
        ExpandableListModel expandableListModel = (ExpandableListModel) other;
        return AbstractC22676k.m65745e(this.id, expandableListModel.id) && AbstractC22676k.m65745e(this.header, expandableListModel.header) && AbstractC22676k.m65745e(this.items, expandableListModel.items) && AbstractC22676k.m65745e(this.cta, expandableListModel.cta);
    }

    public final SecondaryButtonModel getCta() {
        return this.cta;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getId() {
        return this.id;
    }

    public final List<ExpandableRowItemModel> getItems() {
        return this.items;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.header;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.items);
        SecondaryButtonModel secondaryButtonModel = this.cta;
        return iM31983b + (secondaryButtonModel != null ? secondaryButtonModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.header;
        List<ExpandableRowItemModel> list = this.items;
        SecondaryButtonModel secondaryButtonModel = this.cta;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ExpandableListModel(id=", str, ", header=", str2, ", items=");
        sbM32001t.append(list);
        sbM32001t.append(", cta=");
        sbM32001t.append(secondaryButtonModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ ExpandableListModel(int i13, String str, String str2, List list, SecondaryButtonModel secondaryButtonModel, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i13 & 2) == 0) {
            this.header = null;
        } else {
            this.header = str2;
        }
        if ((i13 & 4) == 0) {
            this.items = C25271y.f99162w;
        } else {
            this.items = list;
        }
        if ((i13 & 8) == 0) {
            this.cta = null;
        } else {
            this.cta = secondaryButtonModel;
        }
    }

    public ExpandableListModel(String str, String str2, List<ExpandableRowItemModel> items, SecondaryButtonModel secondaryButtonModel) {
        AbstractC22676k.m65750j(items, "items");
        this.id = str;
        this.header = str2;
        this.items = items;
        this.cta = secondaryButtonModel;
    }

    public /* synthetic */ ExpandableListModel(String str, String str2, List list, SecondaryButtonModel secondaryButtonModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? C25271y.f99162w : list, (i13 & 8) != 0 ? null : secondaryButtonModel);
    }
}
