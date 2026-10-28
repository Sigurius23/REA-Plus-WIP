package com.whoop.archv2.model.template;

import cb1.C4387a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B%\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ.\u0010\u001b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001a¨\u0006-"}, m65681d2 = {"Lcom/whoop/archv2/model/template/PaginatedListResponse;", "", "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "Lcom/whoop/archv2/model/template/NextPagePagination;", "pagination", "<init>", "(Ljava/util/List;Lcom/whoop/archv2/model/template/NextPagePagination;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/whoop/archv2/model/template/NextPagePagination;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$arch_v2_release", "(Lcom/whoop/archv2/model/template/PaginatedListResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lcom/whoop/archv2/model/template/NextPagePagination;", "copy", "(Ljava/util/List;Lcom/whoop/archv2/model/template/NextPagePagination;)Lcom/whoop/archv2/model/template/PaginatedListResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "Lcom/whoop/archv2/model/template/NextPagePagination;", "getPagination", "Companion", "$serializer", "a", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PaginatedListResponse {
    private final List<DesignSystemModel> items;
    private final NextPagePagination pagination;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C4387a(29)), null};

    /* JADX INFO: renamed from: com.whoop.archv2.model.template.PaginatedListResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/archv2/model/template/PaginatedListResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/archv2/model/template/PaginatedListResponse;", "serializer", "()Lwc3/c;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PaginatedListResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaginatedListResponse() {
        this((List) null, (NextPagePagination) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaginatedListResponse copy$default(PaginatedListResponse paginatedListResponse, List list, NextPagePagination nextPagePagination, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = paginatedListResponse.items;
        }
        if ((i13 & 2) != 0) {
            nextPagePagination = paginatedListResponse.pagination;
        }
        return paginatedListResponse.copy(list, nextPagePagination);
    }

    public static final /* synthetic */ void write$Self$arch_v2_release(PaginatedListResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.items != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.items);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.pagination == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, NextPagePagination$$serializer.INSTANCE, self.pagination);
    }

    public final List<DesignSystemModel> component1() {
        return this.items;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NextPagePagination getPagination() {
        return this.pagination;
    }

    public final PaginatedListResponse copy(List<? extends DesignSystemModel> items, NextPagePagination pagination) {
        return new PaginatedListResponse(items, pagination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaginatedListResponse)) {
            return false;
        }
        PaginatedListResponse paginatedListResponse = (PaginatedListResponse) other;
        return AbstractC22676k.m65745e(this.items, paginatedListResponse.items) && AbstractC22676k.m65745e(this.pagination, paginatedListResponse.pagination);
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final NextPagePagination getPagination() {
        return this.pagination;
    }

    public int hashCode() {
        List<DesignSystemModel> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        NextPagePagination nextPagePagination = this.pagination;
        return iHashCode + (nextPagePagination != null ? nextPagePagination.hashCode() : 0);
    }

    public String toString() {
        return "PaginatedListResponse(items=" + this.items + ", pagination=" + this.pagination + ")";
    }

    public /* synthetic */ PaginatedListResponse(int i13, List list, NextPagePagination nextPagePagination, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.items = null;
        } else {
            this.items = list;
        }
        if ((i13 & 2) == 0) {
            this.pagination = null;
        } else {
            this.pagination = nextPagePagination;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaginatedListResponse(List<? extends DesignSystemModel> list, NextPagePagination nextPagePagination) {
        this.items = list;
        this.pagination = nextPagePagination;
    }

    public /* synthetic */ PaginatedListResponse(List list, NextPagePagination nextPagePagination, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : list, (i13 & 2) != 0 ? null : nextPagePagination);
    }
}
