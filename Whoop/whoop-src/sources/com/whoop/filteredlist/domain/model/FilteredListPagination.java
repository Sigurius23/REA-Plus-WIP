package com.whoop.filteredlist.domain.model;

import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.ApiRequest$$serializer;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006,"}, m65681d2 = {"Lcom/whoop/filteredlist/domain/model/FilteredListPagination;", "", "Lcom/whoop/navigation/models/ApiRequest;", "nextPageRequest", "Lcom/whoop/filteredlist/domain/model/PaginationStates;", "states", "<init>", "(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/filteredlist/domain/model/PaginationStates;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/navigation/models/ApiRequest;Lcom/whoop/filteredlist/domain/model/PaginationStates;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$filtered_list_arch_mini_release", "(Lcom/whoop/filteredlist/domain/model/FilteredListPagination;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/navigation/models/ApiRequest;", "component2", "()Lcom/whoop/filteredlist/domain/model/PaginationStates;", "copy", "(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/filteredlist/domain/model/PaginationStates;)Lcom/whoop/filteredlist/domain/model/FilteredListPagination;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/navigation/models/ApiRequest;", "getNextPageRequest", "Lcom/whoop/filteredlist/domain/model/PaginationStates;", "getStates", "Companion", "$serializer", "a", "filtered-list-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FilteredListPagination {
    private final ApiRequest nextPageRequest;
    private final PaginationStates states;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = ApiRequest.$stable;

    /* JADX INFO: renamed from: com.whoop.filteredlist.domain.model.FilteredListPagination$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/filteredlist/domain/model/FilteredListPagination$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/filteredlist/domain/model/FilteredListPagination;", "serializer", "()Lwc3/c;", "filtered-list-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FilteredListPagination$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ FilteredListPagination(int i13, ApiRequest apiRequest, PaginationStates paginationStates, SerializationConstructorMarker serializationConstructorMarker) {
        int i14 = 1;
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, FilteredListPagination$$serializer.INSTANCE.getDescriptor());
        }
        this.nextPageRequest = apiRequest;
        if ((i13 & 2) == 0) {
            this.states = new PaginationStates((PaginationErrorState) null, i14, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        } else {
            this.states = paginationStates;
        }
    }

    public static /* synthetic */ FilteredListPagination copy$default(FilteredListPagination filteredListPagination, ApiRequest apiRequest, PaginationStates paginationStates, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            apiRequest = filteredListPagination.nextPageRequest;
        }
        if ((i13 & 2) != 0) {
            paginationStates = filteredListPagination.states;
        }
        return filteredListPagination.copy(apiRequest, paginationStates);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void write$Self$filtered_list_arch_mini_release(FilteredListPagination self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, ApiRequest$$serializer.INSTANCE, self.nextPageRequest);
        int i13 = 1;
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && AbstractC22676k.m65745e(self.states, new PaginationStates((PaginationErrorState) null, i13, (DefaultConstructorMarker) (0 == true ? 1 : 0)))) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 1, PaginationStates$$serializer.INSTANCE, self.states);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ApiRequest getNextPageRequest() {
        return this.nextPageRequest;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PaginationStates getStates() {
        return this.states;
    }

    public final FilteredListPagination copy(ApiRequest nextPageRequest, PaginationStates states) {
        AbstractC22676k.m65750j(nextPageRequest, "nextPageRequest");
        AbstractC22676k.m65750j(states, "states");
        return new FilteredListPagination(nextPageRequest, states);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilteredListPagination)) {
            return false;
        }
        FilteredListPagination filteredListPagination = (FilteredListPagination) other;
        return AbstractC22676k.m65745e(this.nextPageRequest, filteredListPagination.nextPageRequest) && AbstractC22676k.m65745e(this.states, filteredListPagination.states);
    }

    public final ApiRequest getNextPageRequest() {
        return this.nextPageRequest;
    }

    public final PaginationStates getStates() {
        return this.states;
    }

    public int hashCode() {
        return this.states.hashCode() + (this.nextPageRequest.hashCode() * 31);
    }

    public String toString() {
        return "FilteredListPagination(nextPageRequest=" + this.nextPageRequest + ", states=" + this.states + ")";
    }

    public FilteredListPagination(ApiRequest nextPageRequest, PaginationStates states) {
        AbstractC22676k.m65750j(nextPageRequest, "nextPageRequest");
        AbstractC22676k.m65750j(states, "states");
        this.nextPageRequest = nextPageRequest;
        this.states = states;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ FilteredListPagination(ApiRequest apiRequest, PaginationStates paginationStates, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 2) != 0) {
            paginationStates = new PaginationStates((PaginationErrorState) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }
        this(apiRequest, paginationStates);
    }
}
