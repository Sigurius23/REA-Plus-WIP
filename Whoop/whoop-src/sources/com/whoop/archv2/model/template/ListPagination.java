package com.whoop.archv2.model.template;

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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006,"}, m65681d2 = {"Lcom/whoop/archv2/model/template/ListPagination;", "", "Lcom/whoop/navigation/models/ApiRequest;", "nextPageRequest", "Lcom/whoop/archv2/model/template/PaginationStates;", "states", "<init>", "(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/model/template/PaginationStates;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/model/template/PaginationStates;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$arch_v2_release", "(Lcom/whoop/archv2/model/template/ListPagination;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/navigation/models/ApiRequest;", "component2", "()Lcom/whoop/archv2/model/template/PaginationStates;", "copy", "(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/model/template/PaginationStates;)Lcom/whoop/archv2/model/template/ListPagination;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/navigation/models/ApiRequest;", "getNextPageRequest", "Lcom/whoop/archv2/model/template/PaginationStates;", "getStates", "Companion", "$serializer", "a", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ListPagination {
    private final ApiRequest nextPageRequest;
    private final PaginationStates states;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = ApiRequest.$stable;

    /* JADX INFO: renamed from: com.whoop.archv2.model.template.ListPagination$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/archv2/model/template/ListPagination$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/archv2/model/template/ListPagination;", "serializer", "()Lwc3/c;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ListPagination$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ListPagination(int i13, ApiRequest apiRequest, PaginationStates paginationStates, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, ListPagination$$serializer.INSTANCE.getDescriptor());
        }
        this.nextPageRequest = apiRequest;
        this.states = paginationStates;
    }

    public static /* synthetic */ ListPagination copy$default(ListPagination listPagination, ApiRequest apiRequest, PaginationStates paginationStates, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            apiRequest = listPagination.nextPageRequest;
        }
        if ((i13 & 2) != 0) {
            paginationStates = listPagination.states;
        }
        return listPagination.copy(apiRequest, paginationStates);
    }

    public static final /* synthetic */ void write$Self$arch_v2_release(ListPagination self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, ApiRequest$$serializer.INSTANCE, self.nextPageRequest);
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

    public final ListPagination copy(ApiRequest nextPageRequest, PaginationStates states) {
        AbstractC22676k.m65750j(nextPageRequest, "nextPageRequest");
        AbstractC22676k.m65750j(states, "states");
        return new ListPagination(nextPageRequest, states);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListPagination)) {
            return false;
        }
        ListPagination listPagination = (ListPagination) other;
        return AbstractC22676k.m65745e(this.nextPageRequest, listPagination.nextPageRequest) && AbstractC22676k.m65745e(this.states, listPagination.states);
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
        return "ListPagination(nextPageRequest=" + this.nextPageRequest + ", states=" + this.states + ")";
    }

    public ListPagination(ApiRequest nextPageRequest, PaginationStates states) {
        AbstractC22676k.m65750j(nextPageRequest, "nextPageRequest");
        AbstractC22676k.m65750j(states, "states");
        this.nextPageRequest = nextPageRequest;
        this.states = states;
    }
}
