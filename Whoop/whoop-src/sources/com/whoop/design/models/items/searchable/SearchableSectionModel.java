package com.whoop.design.models.items.searchable;

import c13.AbstractC3855a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC30802r;
import p025b1.C2217h;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tBE\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ:\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b+\u0010\u001b¨\u0006."}, m65681d2 = {"Lcom/whoop/design/models/items/searchable/SearchableSectionModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "", "headerItems", "Lcom/whoop/design/models/items/searchable/SearchableRowModel;", "rows", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/searchable/SearchableSectionModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/whoop/design/models/items/searchable/SearchableSectionModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getHeaderItems", "getRows", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SearchableSectionModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<DesignSystemModel> headerItems;
    private final String id;
    private final List<SearchableRowModel> rows;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/searchable/SearchableSectionModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/searchable/SearchableSectionModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SearchableSectionModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C2217h(24)), AbstractC30060g.m92087G(enumC23463i, new C2217h(25))};
    }

    public /* synthetic */ SearchableSectionModel(int i13, String str, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, SearchableSectionModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.headerItems = list;
        this.rows = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(SearchableRowModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchableSectionModel copy$default(SearchableSectionModel searchableSectionModel, String str, List list, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = searchableSectionModel.id;
        }
        if ((i13 & 2) != 0) {
            list = searchableSectionModel.headerItems;
        }
        if ((i13 & 4) != 0) {
            list2 = searchableSectionModel.rows;
        }
        return searchableSectionModel.copy(str, list, list2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(SearchableSectionModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.headerItems);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.rows);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<DesignSystemModel> component2() {
        return this.headerItems;
    }

    public final List<SearchableRowModel> component3() {
        return this.rows;
    }

    public final SearchableSectionModel copy(String id4, List<? extends DesignSystemModel> headerItems, List<SearchableRowModel> rows) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(headerItems, "headerItems");
        AbstractC22676k.m65750j(rows, "rows");
        return new SearchableSectionModel(id4, headerItems, rows);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchableSectionModel)) {
            return false;
        }
        SearchableSectionModel searchableSectionModel = (SearchableSectionModel) other;
        return AbstractC22676k.m65745e(this.id, searchableSectionModel.id) && AbstractC22676k.m65745e(this.headerItems, searchableSectionModel.headerItems) && AbstractC22676k.m65745e(this.rows, searchableSectionModel.rows);
    }

    public final List<DesignSystemModel> getHeaderItems() {
        return this.headerItems;
    }

    public final String getId() {
        return this.id;
    }

    public final List<SearchableRowModel> getRows() {
        return this.rows;
    }

    public int hashCode() {
        return this.rows.hashCode() + AbstractC11895b.m31983b(this.id.hashCode() * 31, 31, this.headerItems);
    }

    public String toString() {
        String str = this.id;
        List<DesignSystemModel> list = this.headerItems;
        return AbstractC3855a.m11829m(AbstractC30802r.m94766o("SearchableSectionModel(id=", str, ", headerItems=", ", rows=", list), this.rows, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchableSectionModel(String id4, List<? extends DesignSystemModel> headerItems, List<SearchableRowModel> rows) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(headerItems, "headerItems");
        AbstractC22676k.m65750j(rows, "rows");
        this.id = id4;
        this.headerItems = headerItems;
        this.rows = rows;
    }
}
