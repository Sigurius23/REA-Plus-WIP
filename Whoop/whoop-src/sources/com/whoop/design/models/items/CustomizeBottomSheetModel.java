package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36955b;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ4\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001d¨\u00060"}, m65681d2 = {"Lcom/whoop/design/models/items/CustomizeBottomSheetModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "searchText", "", "selectedIds", "Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;", "bottomSheet", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/CustomizeBottomSheetModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;)Lcom/whoop/design/models/items/CustomizeBottomSheetModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSearchText", "Ljava/util/List;", "getSelectedIds", "Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;", "getBottomSheet", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CustomizeBottomSheetModel implements DesignSystemModel {
    private final CustomizeBottomSheetSelectorModel bottomSheet;
    private final String searchText;
    private final List<String> selectedIds;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36955b(26)), null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/CustomizeBottomSheetModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/CustomizeBottomSheetModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CustomizeBottomSheetModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CustomizeBottomSheetModel(int i13, String str, List list, CustomizeBottomSheetSelectorModel customizeBottomSheetSelectorModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, CustomizeBottomSheetModel$$serializer.INSTANCE.getDescriptor());
        }
        this.searchText = str;
        this.selectedIds = list;
        this.bottomSheet = customizeBottomSheetSelectorModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomizeBottomSheetModel copy$default(CustomizeBottomSheetModel customizeBottomSheetModel, String str, List list, CustomizeBottomSheetSelectorModel customizeBottomSheetSelectorModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = customizeBottomSheetModel.searchText;
        }
        if ((i13 & 2) != 0) {
            list = customizeBottomSheetModel.selectedIds;
        }
        if ((i13 & 4) != 0) {
            customizeBottomSheetSelectorModel = customizeBottomSheetModel.bottomSheet;
        }
        return customizeBottomSheetModel.copy(str, list, customizeBottomSheetSelectorModel);
    }

    public static final /* synthetic */ void write$Self$design_models_release(CustomizeBottomSheetModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.searchText);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.selectedIds);
        output.encodeSerializableElement(serialDesc, 2, CustomizeBottomSheetSelectorModel$$serializer.INSTANCE, self.bottomSheet);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSearchText() {
        return this.searchText;
    }

    public final List<String> component2() {
        return this.selectedIds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CustomizeBottomSheetSelectorModel getBottomSheet() {
        return this.bottomSheet;
    }

    public final CustomizeBottomSheetModel copy(String searchText, List<String> selectedIds, CustomizeBottomSheetSelectorModel bottomSheet) {
        AbstractC22676k.m65750j(searchText, "searchText");
        AbstractC22676k.m65750j(selectedIds, "selectedIds");
        AbstractC22676k.m65750j(bottomSheet, "bottomSheet");
        return new CustomizeBottomSheetModel(searchText, selectedIds, bottomSheet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomizeBottomSheetModel)) {
            return false;
        }
        CustomizeBottomSheetModel customizeBottomSheetModel = (CustomizeBottomSheetModel) other;
        return AbstractC22676k.m65745e(this.searchText, customizeBottomSheetModel.searchText) && AbstractC22676k.m65745e(this.selectedIds, customizeBottomSheetModel.selectedIds) && AbstractC22676k.m65745e(this.bottomSheet, customizeBottomSheetModel.bottomSheet);
    }

    public final CustomizeBottomSheetSelectorModel getBottomSheet() {
        return this.bottomSheet;
    }

    public final String getSearchText() {
        return this.searchText;
    }

    public final List<String> getSelectedIds() {
        return this.selectedIds;
    }

    public int hashCode() {
        return this.bottomSheet.hashCode() + AbstractC11895b.m31983b(this.searchText.hashCode() * 31, 31, this.selectedIds);
    }

    public String toString() {
        String str = this.searchText;
        List<String> list = this.selectedIds;
        CustomizeBottomSheetSelectorModel customizeBottomSheetSelectorModel = this.bottomSheet;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("CustomizeBottomSheetModel(searchText=", str, ", selectedIds=", ", bottomSheet=", list);
        sbM94766o.append(customizeBottomSheetSelectorModel);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public CustomizeBottomSheetModel(String searchText, List<String> selectedIds, CustomizeBottomSheetSelectorModel bottomSheet) {
        AbstractC22676k.m65750j(searchText, "searchText");
        AbstractC22676k.m65750j(selectedIds, "selectedIds");
        AbstractC22676k.m65750j(bottomSheet, "bottomSheet");
        this.searchText = searchText;
        this.selectedIds = selectedIds;
        this.bottomSheet = bottomSheet;
    }
}
