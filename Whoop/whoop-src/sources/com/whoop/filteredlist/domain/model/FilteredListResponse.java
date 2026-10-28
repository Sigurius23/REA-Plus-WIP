package com.whoop.filteredlist.domain.model;

import bf2.C3201a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
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
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001d¨\u00062"}, m65681d2 = {"Lcom/whoop/filteredlist/domain/model/FilteredListResponse;", "", "Lcom/whoop/design/models/DesignSystemModel;", "filters", "", "items", "Lcom/whoop/filteredlist/domain/model/FilteredListPagination;", "pagination", "<init>", "(Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/filteredlist/domain/model/FilteredListPagination;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/filteredlist/domain/model/FilteredListPagination;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$filtered_list_arch_mini_release", "(Lcom/whoop/filteredlist/domain/model/FilteredListResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/DesignSystemModel;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/filteredlist/domain/model/FilteredListPagination;", "copy", "(Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/filteredlist/domain/model/FilteredListPagination;)Lcom/whoop/filteredlist/domain/model/FilteredListResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/DesignSystemModel;", "getFilters", "Ljava/util/List;", "getItems", "Lcom/whoop/filteredlist/domain/model/FilteredListPagination;", "getPagination", "Companion", "$serializer", "a", "filtered-list-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FilteredListResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final DesignSystemModel filters;
    private final List<DesignSystemModel> items;
    private final FilteredListPagination pagination;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.filteredlist.domain.model.FilteredListResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/filteredlist/domain/model/FilteredListResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/filteredlist/domain/model/FilteredListResponse;", "serializer", "()Lwc3/c;", "filtered-list-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FilteredListResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C3201a(3)), AbstractC30060g.m92087G(enumC23463i, new C3201a(4)), null};
    }

    public FilteredListResponse() {
        this((DesignSystemModel) null, (List) null, (FilteredListPagination) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FilteredListResponse copy$default(FilteredListResponse filteredListResponse, DesignSystemModel designSystemModel, List list, FilteredListPagination filteredListPagination, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            designSystemModel = filteredListResponse.filters;
        }
        if ((i13 & 2) != 0) {
            list = filteredListResponse.items;
        }
        if ((i13 & 4) != 0) {
            filteredListPagination = filteredListResponse.pagination;
        }
        return filteredListResponse.copy(designSystemModel, list, filteredListPagination);
    }

    public static final /* synthetic */ void write$Self$filtered_list_arch_mini_release(FilteredListResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.filters != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.filters);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.items, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.items);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.pagination == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, FilteredListPagination$$serializer.INSTANCE, self.pagination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DesignSystemModel getFilters() {
        return this.filters;
    }

    public final List<DesignSystemModel> component2() {
        return this.items;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final FilteredListPagination getPagination() {
        return this.pagination;
    }

    public final FilteredListResponse copy(DesignSystemModel filters, List<? extends DesignSystemModel> items, FilteredListPagination pagination) {
        AbstractC22676k.m65750j(items, "items");
        return new FilteredListResponse(filters, items, pagination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilteredListResponse)) {
            return false;
        }
        FilteredListResponse filteredListResponse = (FilteredListResponse) other;
        return AbstractC22676k.m65745e(this.filters, filteredListResponse.filters) && AbstractC22676k.m65745e(this.items, filteredListResponse.items) && AbstractC22676k.m65745e(this.pagination, filteredListResponse.pagination);
    }

    public final DesignSystemModel getFilters() {
        return this.filters;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final FilteredListPagination getPagination() {
        return this.pagination;
    }

    public int hashCode() {
        DesignSystemModel designSystemModel = this.filters;
        int iM31983b = AbstractC11895b.m31983b((designSystemModel == null ? 0 : designSystemModel.hashCode()) * 31, 31, this.items);
        FilteredListPagination filteredListPagination = this.pagination;
        return iM31983b + (filteredListPagination != null ? filteredListPagination.hashCode() : 0);
    }

    public String toString() {
        return "FilteredListResponse(filters=" + this.filters + ", items=" + this.items + ", pagination=" + this.pagination + ")";
    }

    public /* synthetic */ FilteredListResponse(int i13, DesignSystemModel designSystemModel, List list, FilteredListPagination filteredListPagination, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.filters = null;
        } else {
            this.filters = designSystemModel;
        }
        if ((i13 & 2) == 0) {
            this.items = C25271y.f99162w;
        } else {
            this.items = list;
        }
        if ((i13 & 4) == 0) {
            this.pagination = null;
        } else {
            this.pagination = filteredListPagination;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FilteredListResponse(DesignSystemModel designSystemModel, List<? extends DesignSystemModel> items, FilteredListPagination filteredListPagination) {
        AbstractC22676k.m65750j(items, "items");
        this.filters = designSystemModel;
        this.items = items;
        this.pagination = filteredListPagination;
    }

    public /* synthetic */ FilteredListResponse(DesignSystemModel designSystemModel, List list, FilteredListPagination filteredListPagination, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : designSystemModel, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? null : filteredListPagination);
    }
}
