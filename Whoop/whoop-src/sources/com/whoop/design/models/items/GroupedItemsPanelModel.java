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
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import w91.C36958e;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB=\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ6\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001d¨\u00060"}, m65681d2 = {"Lcom/whoop/design/models/items/GroupedItemsPanelModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "", "items", "", "bottomContentInsetDp", "<init>", "(Ljava/lang/String;Ljava/util/List;F)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;FLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/GroupedItemsPanelModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()F", "copy", "(Ljava/lang/String;Ljava/util/List;F)Lcom/whoop/design/models/items/GroupedItemsPanelModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getItems", "F", "getBottomContentInsetDp", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GroupedItemsPanelModel implements DesignSystemModel {
    private final float bottomContentInsetDp;
    private final String id;
    private final List<DesignSystemModel> items;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36958e(12)), null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/GroupedItemsPanelModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/GroupedItemsPanelModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GroupedItemsPanelModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public GroupedItemsPanelModel() {
        this((String) null, (List) null, 0.0f, 7, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupedItemsPanelModel copy$default(GroupedItemsPanelModel groupedItemsPanelModel, String str, List list, float f13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = groupedItemsPanelModel.id;
        }
        if ((i13 & 2) != 0) {
            list = groupedItemsPanelModel.items;
        }
        if ((i13 & 4) != 0) {
            f13 = groupedItemsPanelModel.bottomContentInsetDp;
        }
        return groupedItemsPanelModel.copy(str, list, f13);
    }

    public static final /* synthetic */ void write$Self$design_models_release(GroupedItemsPanelModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.id != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.items, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.items);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && Float.compare(self.bottomContentInsetDp, 0.0f) == 0) {
            return;
        }
        output.encodeFloatElement(serialDesc, 2, self.bottomContentInsetDp);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<DesignSystemModel> component2() {
        return this.items;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getBottomContentInsetDp() {
        return this.bottomContentInsetDp;
    }

    public final GroupedItemsPanelModel copy(String id4, List<? extends DesignSystemModel> items, float bottomContentInsetDp) {
        AbstractC22676k.m65750j(items, "items");
        return new GroupedItemsPanelModel(id4, items, bottomContentInsetDp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupedItemsPanelModel)) {
            return false;
        }
        GroupedItemsPanelModel groupedItemsPanelModel = (GroupedItemsPanelModel) other;
        return AbstractC22676k.m65745e(this.id, groupedItemsPanelModel.id) && AbstractC22676k.m65745e(this.items, groupedItemsPanelModel.items) && Float.compare(this.bottomContentInsetDp, groupedItemsPanelModel.bottomContentInsetDp) == 0;
    }

    public final float getBottomContentInsetDp() {
        return this.bottomContentInsetDp;
    }

    public final String getId() {
        return this.id;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public int hashCode() {
        String str = this.id;
        return Float.hashCode(this.bottomContentInsetDp) + AbstractC11895b.m31983b((str == null ? 0 : str.hashCode()) * 31, 31, this.items);
    }

    public String toString() {
        return AbstractC30007c.m91837g(this.bottomContentInsetDp, ")", AbstractC30802r.m94766o("GroupedItemsPanelModel(id=", this.id, ", items=", ", bottomContentInsetDp=", this.items));
    }

    public /* synthetic */ GroupedItemsPanelModel(int i13, String str, List list, float f13, SerializationConstructorMarker serializationConstructorMarker) {
        this.id = (i13 & 1) == 0 ? null : str;
        if ((i13 & 2) == 0) {
            this.items = C25271y.f99162w;
        } else {
            this.items = list;
        }
        if ((i13 & 4) == 0) {
            this.bottomContentInsetDp = 0.0f;
        } else {
            this.bottomContentInsetDp = f13;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupedItemsPanelModel(String str, List<? extends DesignSystemModel> items, float f13) {
        AbstractC22676k.m65750j(items, "items");
        this.id = str;
        this.items = items;
        this.bottomContentInsetDp = f13;
    }

    public /* synthetic */ GroupedItemsPanelModel(String str, List list, float f13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? 0.0f : f13);
    }
}
