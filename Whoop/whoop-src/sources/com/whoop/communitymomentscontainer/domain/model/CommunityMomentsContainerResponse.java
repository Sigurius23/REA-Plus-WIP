package com.whoop.communitymomentscontainer.domain.model;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.AnalyticEventModel$$serializer;
import com.whoop.communitymoments.domain.models.MomentStackModel;
import com.whoop.design.models.DesignModelWrapper;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.DesignSystemModelKt;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
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
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;
import zi1.C40674e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J8\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010!R\u0013\u00106\u001a\u0004\u0018\u0001038F¢\u0006\u0006\u001a\u0004\b4\u00105¨\u0006:"}, m65681d2 = {"Lcom/whoop/communitymomentscontainer/domain/model/CommunityMomentsContainerResponse;", "", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "Lcom/whoop/communitymomentscontainer/domain/model/MomentsPagination;", "pagination", "<init>", "(Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;Lcom/whoop/communitymomentscontainer/domain/model/MomentsPagination;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;Lcom/whoop/communitymomentscontainer/domain/model/MomentsPagination;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$community_moments_container_arch_mini_release", "(Lcom/whoop/communitymomentscontainer/domain/model/CommunityMomentsContainerResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "next", "appendPage", "(Lcom/whoop/communitymomentscontainer/domain/model/CommunityMomentsContainerResponse;)Lcom/whoop/communitymomentscontainer/domain/model/CommunityMomentsContainerResponse;", "component1", "()Lcom/whoop/analytics/AnalyticEventModel;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/communitymomentscontainer/domain/model/MomentsPagination;", "copy", "(Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;Lcom/whoop/communitymomentscontainer/domain/model/MomentsPagination;)Lcom/whoop/communitymomentscontainer/domain/model/CommunityMomentsContainerResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/analytics/AnalyticEventModel;", "getAnalyticEvent", "Ljava/util/List;", "getItems", "Lcom/whoop/communitymomentscontainer/domain/model/MomentsPagination;", "getPagination", "Lcom/whoop/communitymoments/domain/models/MomentStackModel;", "getStack", "()Lcom/whoop/communitymoments/domain/models/MomentStackModel;", "stack", "Companion", "$serializer", "a", "community-moments-container-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CommunityMomentsContainerResponse {
    private final AnalyticEventModel analyticEvent;
    private final List<DesignSystemModel> items;
    private final MomentsPagination pagination;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C40674e0(8)), null};

    /* JADX INFO: renamed from: com.whoop.communitymomentscontainer.domain.model.CommunityMomentsContainerResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/communitymomentscontainer/domain/model/CommunityMomentsContainerResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/communitymomentscontainer/domain/model/CommunityMomentsContainerResponse;", "serializer", "()Lwc3/c;", "community-moments-container-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CommunityMomentsContainerResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CommunityMomentsContainerResponse() {
        this((AnalyticEventModel) null, (List) null, (MomentsPagination) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommunityMomentsContainerResponse copy$default(CommunityMomentsContainerResponse communityMomentsContainerResponse, AnalyticEventModel analyticEventModel, List list, MomentsPagination momentsPagination, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            analyticEventModel = communityMomentsContainerResponse.analyticEvent;
        }
        if ((i13 & 2) != 0) {
            list = communityMomentsContainerResponse.items;
        }
        if ((i13 & 4) != 0) {
            momentsPagination = communityMomentsContainerResponse.pagination;
        }
        return communityMomentsContainerResponse.copy(analyticEventModel, list, momentsPagination);
    }

    public static final /* synthetic */ void write$Self$community_moments_container_arch_mini_release(CommunityMomentsContainerResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.analyticEvent != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, AnalyticEventModel$$serializer.INSTANCE, self.analyticEvent);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.items, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.items);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.pagination == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, MomentsPagination$$serializer.INSTANCE, self.pagination);
    }

    public final CommunityMomentsContainerResponse appendPage(CommunityMomentsContainerResponse next) {
        AbstractC22676k.m65750j(next, "next");
        MomentStackModel stack = getStack();
        if (stack == null) {
            return next;
        }
        MomentStackModel stack2 = next.getStack();
        if (stack2 == null) {
            return copy$default(this, null, null, next.pagination, 3, null);
        }
        DesignSystemModel designSystemModelCopy$default = MomentStackModel.copy$default(stack, null, null, AbstractC25265s.m74129g1(stack.getItems(), stack2.getItems()), 3, null);
        List<DesignSystemModel> list = this.items;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (DesignSystemModel designSystemModelCopy$default2 : list) {
            if (DesignSystemModelKt.unwrap(designSystemModelCopy$default2) == stack) {
                designSystemModelCopy$default2 = designSystemModelCopy$default2 instanceof DesignModelWrapper ? DesignModelWrapper.copy$default((DesignModelWrapper) designSystemModelCopy$default2, designSystemModelCopy$default, null, null, null, null, 30, null) : designSystemModelCopy$default;
            }
            arrayList.add(designSystemModelCopy$default2);
        }
        return copy$default(this, null, arrayList, next.pagination, 1, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    public final List<DesignSystemModel> component2() {
        return this.items;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MomentsPagination getPagination() {
        return this.pagination;
    }

    public final CommunityMomentsContainerResponse copy(AnalyticEventModel analyticEvent, List<? extends DesignSystemModel> items, MomentsPagination pagination) {
        AbstractC22676k.m65750j(items, "items");
        return new CommunityMomentsContainerResponse(analyticEvent, items, pagination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommunityMomentsContainerResponse)) {
            return false;
        }
        CommunityMomentsContainerResponse communityMomentsContainerResponse = (CommunityMomentsContainerResponse) other;
        return AbstractC22676k.m65745e(this.analyticEvent, communityMomentsContainerResponse.analyticEvent) && AbstractC22676k.m65745e(this.items, communityMomentsContainerResponse.items) && AbstractC22676k.m65745e(this.pagination, communityMomentsContainerResponse.pagination);
    }

    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final MomentsPagination getPagination() {
        return this.pagination;
    }

    public final MomentStackModel getStack() {
        MomentStackModel momentStackModel;
        Iterator<T> it = this.items.iterator();
        do {
            momentStackModel = null;
            if (!it.hasNext()) {
                break;
            }
            DesignSystemModel designSystemModelUnwrap = DesignSystemModelKt.unwrap((DesignSystemModel) it.next());
            if (designSystemModelUnwrap instanceof MomentStackModel) {
                momentStackModel = (MomentStackModel) designSystemModelUnwrap;
            }
        } while (momentStackModel == null);
        return momentStackModel;
    }

    public int hashCode() {
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        int iM31983b = AbstractC11895b.m31983b((analyticEventModel == null ? 0 : analyticEventModel.hashCode()) * 31, 31, this.items);
        MomentsPagination momentsPagination = this.pagination;
        return iM31983b + (momentsPagination != null ? momentsPagination.hashCode() : 0);
    }

    public String toString() {
        return "CommunityMomentsContainerResponse(analyticEvent=" + this.analyticEvent + ", items=" + this.items + ", pagination=" + this.pagination + ")";
    }

    public /* synthetic */ CommunityMomentsContainerResponse(int i13, AnalyticEventModel analyticEventModel, List list, MomentsPagination momentsPagination, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.analyticEvent = null;
        } else {
            this.analyticEvent = analyticEventModel;
        }
        if ((i13 & 2) == 0) {
            this.items = C25271y.f99162w;
        } else {
            this.items = list;
        }
        if ((i13 & 4) == 0) {
            this.pagination = null;
        } else {
            this.pagination = momentsPagination;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommunityMomentsContainerResponse(AnalyticEventModel analyticEventModel, List<? extends DesignSystemModel> items, MomentsPagination momentsPagination) {
        AbstractC22676k.m65750j(items, "items");
        this.analyticEvent = analyticEventModel;
        this.items = items;
        this.pagination = momentsPagination;
    }

    public /* synthetic */ CommunityMomentsContainerResponse(AnalyticEventModel analyticEventModel, List list, MomentsPagination momentsPagination, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : analyticEventModel, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? null : momentsPagination);
    }
}
