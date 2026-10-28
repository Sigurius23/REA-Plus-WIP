package com.whoop.design.models.items.form;

import com.whoop.design.models.items.SearchFieldModel;
import com.whoop.design.models.items.SearchFieldModel$$serializer;
import com.whoop.design.models.items.SelectableCellListModel;
import com.whoop.design.models.items.SelectableCellListModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0019¨\u0006,"}, m65681d2 = {"Lcom/whoop/design/models/items/form/FormSheetSelectableOptionsContent;", "Lcom/whoop/design/models/items/form/FormSheetContent;", "Lcom/whoop/design/models/items/SearchFieldModel;", "searchField", "Lcom/whoop/design/models/items/SelectableCellListModel;", "items", "<init>", "(Lcom/whoop/design/models/items/SearchFieldModel;Lcom/whoop/design/models/items/SelectableCellListModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/SearchFieldModel;Lcom/whoop/design/models/items/SelectableCellListModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/form/FormSheetSelectableOptionsContent;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/SearchFieldModel;", "component2", "()Lcom/whoop/design/models/items/SelectableCellListModel;", "copy", "(Lcom/whoop/design/models/items/SearchFieldModel;Lcom/whoop/design/models/items/SelectableCellListModel;)Lcom/whoop/design/models/items/form/FormSheetSelectableOptionsContent;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/SearchFieldModel;", "getSearchField", "Lcom/whoop/design/models/items/SelectableCellListModel;", "getItems", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FormSheetSelectableOptionsContent implements FormSheetContent {
    private final SelectableCellListModel items;
    private final SearchFieldModel searchField;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/form/FormSheetSelectableOptionsContent$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/form/FormSheetSelectableOptionsContent;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FormSheetSelectableOptionsContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ FormSheetSelectableOptionsContent(int i13, SearchFieldModel searchFieldModel, SelectableCellListModel selectableCellListModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i13 & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2, FormSheetSelectableOptionsContent$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.searchField = null;
        } else {
            this.searchField = searchFieldModel;
        }
        this.items = selectableCellListModel;
    }

    public static /* synthetic */ FormSheetSelectableOptionsContent copy$default(FormSheetSelectableOptionsContent formSheetSelectableOptionsContent, SearchFieldModel searchFieldModel, SelectableCellListModel selectableCellListModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            searchFieldModel = formSheetSelectableOptionsContent.searchField;
        }
        if ((i13 & 2) != 0) {
            selectableCellListModel = formSheetSelectableOptionsContent.items;
        }
        return formSheetSelectableOptionsContent.copy(searchFieldModel, selectableCellListModel);
    }

    public static final /* synthetic */ void write$Self$design_models_release(FormSheetSelectableOptionsContent self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.searchField != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, SearchFieldModel$$serializer.INSTANCE, self.searchField);
        }
        output.encodeSerializableElement(serialDesc, 1, SelectableCellListModel$$serializer.INSTANCE, self.items);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SearchFieldModel getSearchField() {
        return this.searchField;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SelectableCellListModel getItems() {
        return this.items;
    }

    public final FormSheetSelectableOptionsContent copy(SearchFieldModel searchField, SelectableCellListModel items) {
        AbstractC22676k.m65750j(items, "items");
        return new FormSheetSelectableOptionsContent(searchField, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormSheetSelectableOptionsContent)) {
            return false;
        }
        FormSheetSelectableOptionsContent formSheetSelectableOptionsContent = (FormSheetSelectableOptionsContent) other;
        return AbstractC22676k.m65745e(this.searchField, formSheetSelectableOptionsContent.searchField) && AbstractC22676k.m65745e(this.items, formSheetSelectableOptionsContent.items);
    }

    public final SelectableCellListModel getItems() {
        return this.items;
    }

    public final SearchFieldModel getSearchField() {
        return this.searchField;
    }

    public int hashCode() {
        SearchFieldModel searchFieldModel = this.searchField;
        return this.items.hashCode() + ((searchFieldModel == null ? 0 : searchFieldModel.hashCode()) * 31);
    }

    public String toString() {
        return "FormSheetSelectableOptionsContent(searchField=" + this.searchField + ", items=" + this.items + ")";
    }

    public FormSheetSelectableOptionsContent(SearchFieldModel searchFieldModel, SelectableCellListModel items) {
        AbstractC22676k.m65750j(items, "items");
        this.searchField = searchFieldModel;
        this.items = items;
    }

    public /* synthetic */ FormSheetSelectableOptionsContent(SearchFieldModel searchFieldModel, SelectableCellListModel selectableCellListModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : searchFieldModel, selectableCellListModel);
    }
}
