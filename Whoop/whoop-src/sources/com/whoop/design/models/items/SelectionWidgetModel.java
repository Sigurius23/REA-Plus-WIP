package com.whoop.design.models.items;

import androidx.core.app.NotificationCompat;
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
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36963j;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b!\u0010\"JH\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001bJ\u0010\u0010&\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010 R\u0017\u0010\t\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\"¨\u00068"}, m65681d2 = {"Lcom/whoop/design/models/items/SelectionWidgetModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "title", "Lcom/whoop/design/models/items/ItemVisibilityStateEnum;", NotificationCompat.CATEGORY_STATUS, "", "items", "button", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ItemVisibilityStateEnum;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ItemVisibilityStateEnum;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/SelectionWidgetModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/items/ItemVisibilityStateEnum;", "component4", "()Ljava/util/List;", "component5", "()Lcom/whoop/design/models/DesignSystemModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ItemVisibilityStateEnum;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/items/SelectionWidgetModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getTitle", "Lcom/whoop/design/models/items/ItemVisibilityStateEnum;", "getStatus", "Ljava/util/List;", "getItems", "Lcom/whoop/design/models/DesignSystemModel;", "getButton", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SelectionWidgetModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final DesignSystemModel button;
    private final String id;
    private final List<DesignSystemModel> items;
    private final ItemVisibilityStateEnum status;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/SelectionWidgetModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/SelectionWidgetModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SelectionWidgetModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C36963j(10)), AbstractC30060g.m92087G(enumC23463i, new C36963j(11)), AbstractC30060g.m92087G(enumC23463i, new C36963j(12))};
    }

    public /* synthetic */ SelectionWidgetModel(int i13, String str, String str2, ItemVisibilityStateEnum itemVisibilityStateEnum, List list, DesignSystemModel designSystemModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (16 != (i13 & 16)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 16, SelectionWidgetModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i13 & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i13 & 4) == 0) {
            this.status = ItemVisibilityStateEnum.ENABLED;
        } else {
            this.status = itemVisibilityStateEnum;
        }
        if ((i13 & 8) == 0) {
            this.items = C25271y.f99162w;
        } else {
            this.items = list;
        }
        this.button = designSystemModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.ItemVisibilityStateEnum", ItemVisibilityStateEnum.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelectionWidgetModel copy$default(SelectionWidgetModel selectionWidgetModel, String str, String str2, ItemVisibilityStateEnum itemVisibilityStateEnum, List list, DesignSystemModel designSystemModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = selectionWidgetModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = selectionWidgetModel.title;
        }
        if ((i13 & 4) != 0) {
            itemVisibilityStateEnum = selectionWidgetModel.status;
        }
        if ((i13 & 8) != 0) {
            list = selectionWidgetModel.items;
        }
        if ((i13 & 16) != 0) {
            designSystemModel = selectionWidgetModel.button;
        }
        DesignSystemModel designSystemModel2 = designSystemModel;
        ItemVisibilityStateEnum itemVisibilityStateEnum2 = itemVisibilityStateEnum;
        return selectionWidgetModel.copy(str, str2, itemVisibilityStateEnum2, list, designSystemModel2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(SelectionWidgetModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.id, "")) {
            output.encodeStringElement(serialDesc, 0, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.title, "")) {
            output.encodeStringElement(serialDesc, 1, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.status != ItemVisibilityStateEnum.ENABLED) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.status);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.items, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.items);
        }
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.button);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ItemVisibilityStateEnum getStatus() {
        return this.status;
    }

    public final List<DesignSystemModel> component4() {
        return this.items;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DesignSystemModel getButton() {
        return this.button;
    }

    public final SelectionWidgetModel copy(String id4, String title, ItemVisibilityStateEnum status, List<? extends DesignSystemModel> items, DesignSystemModel button) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(button, "button");
        return new SelectionWidgetModel(id4, title, status, items, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionWidgetModel)) {
            return false;
        }
        SelectionWidgetModel selectionWidgetModel = (SelectionWidgetModel) other;
        return AbstractC22676k.m65745e(this.id, selectionWidgetModel.id) && AbstractC22676k.m65745e(this.title, selectionWidgetModel.title) && this.status == selectionWidgetModel.status && AbstractC22676k.m65745e(this.items, selectionWidgetModel.items) && AbstractC22676k.m65745e(this.button, selectionWidgetModel.button);
    }

    public final DesignSystemModel getButton() {
        return this.button;
    }

    public final String getId() {
        return this.id;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final ItemVisibilityStateEnum getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.button.hashCode() + AbstractC11895b.m31983b((this.status.hashCode() + AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.title)) * 31, 31, this.items);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        ItemVisibilityStateEnum itemVisibilityStateEnum = this.status;
        List<DesignSystemModel> list = this.items;
        DesignSystemModel designSystemModel = this.button;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SelectionWidgetModel(id=", str, ", title=", str2, ", status=");
        sbM32001t.append(itemVisibilityStateEnum);
        sbM32001t.append(", items=");
        sbM32001t.append(list);
        sbM32001t.append(", button=");
        sbM32001t.append(designSystemModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelectionWidgetModel(String id4, String title, ItemVisibilityStateEnum status, List<? extends DesignSystemModel> items, DesignSystemModel button) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(button, "button");
        this.id = id4;
        this.title = title;
        this.status = status;
        this.items = items;
        this.button = button;
    }

    public /* synthetic */ SelectionWidgetModel(String str, String str2, ItemVisibilityStateEnum itemVisibilityStateEnum, List list, DesignSystemModel designSystemModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? ItemVisibilityStateEnum.ENABLED : itemVisibilityStateEnum, (i13 & 8) != 0 ? C25271y.f99162w : list, designSystemModel);
    }
}
