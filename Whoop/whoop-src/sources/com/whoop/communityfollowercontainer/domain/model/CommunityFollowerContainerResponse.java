package com.whoop.communityfollowercontainer.domain.model;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.AnalyticEventModel$$serializer;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.DesignSystemModelKt;
import com.whoop.design.models.items.CommunityFollowerModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import cq2.C11062a;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\bHÆ\u0003¢\u0006\u0004\b \u0010!JD\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010!R\u0017\u00107\u001a\b\u0012\u0004\u0012\u0002050\b8F¢\u0006\u0006\u001a\u0004\b6\u0010!R\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020\u00060\b8F¢\u0006\u0006\u001a\u0004\b8\u0010!¨\u0006<"}, m65681d2 = {"Lcom/whoop/communityfollowercontainer/domain/model/CommunityFollowerContainerResponse;", "", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "Lcom/whoop/communityfollowercontainer/domain/model/CommunityFilterBottomSheetModel;", "filterBottomSheet", "Lcom/whoop/design/models/DesignSystemModel;", "header", "", "items", "<init>", "(Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/communityfollowercontainer/domain/model/CommunityFilterBottomSheetModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/communityfollowercontainer/domain/model/CommunityFilterBottomSheetModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$community_follower_container_arch_mini_release", "(Lcom/whoop/communityfollowercontainer/domain/model/CommunityFollowerContainerResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/analytics/AnalyticEventModel;", "component2", "()Lcom/whoop/communityfollowercontainer/domain/model/CommunityFilterBottomSheetModel;", "component3", "()Lcom/whoop/design/models/DesignSystemModel;", "component4", "()Ljava/util/List;", "copy", "(Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/communityfollowercontainer/domain/model/CommunityFilterBottomSheetModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;)Lcom/whoop/communityfollowercontainer/domain/model/CommunityFollowerContainerResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/analytics/AnalyticEventModel;", "getAnalyticEvent", "Lcom/whoop/communityfollowercontainer/domain/model/CommunityFilterBottomSheetModel;", "getFilterBottomSheet", "Lcom/whoop/design/models/DesignSystemModel;", "getHeader", "Ljava/util/List;", "getItems", "Lcom/whoop/design/models/items/CommunityFollowerModel;", "getFollowerItems", "followerItems", "getContentItems", "contentItems", "Companion", "$serializer", "community-follower-container-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CommunityFollowerContainerResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final AnalyticEventModel analyticEvent;
    private final CommunityFilterBottomSheetModel filterBottomSheet;
    private final DesignSystemModel header;
    private final List<DesignSystemModel> items;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/communityfollowercontainer/domain/model/CommunityFollowerContainerResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/communityfollowercontainer/domain/model/CommunityFollowerContainerResponse;", "serializer", "()Lwc3/c;", "community-follower-container-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CommunityFollowerContainerResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C11062a(27)), AbstractC30060g.m92087G(enumC23463i, new C11062a(28))};
    }

    public CommunityFollowerContainerResponse() {
        this((AnalyticEventModel) null, (CommunityFilterBottomSheetModel) null, (DesignSystemModel) null, (List) null, 15, (DefaultConstructorMarker) null);
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
    public static /* synthetic */ CommunityFollowerContainerResponse copy$default(CommunityFollowerContainerResponse communityFollowerContainerResponse, AnalyticEventModel analyticEventModel, CommunityFilterBottomSheetModel communityFilterBottomSheetModel, DesignSystemModel designSystemModel, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            analyticEventModel = communityFollowerContainerResponse.analyticEvent;
        }
        if ((i13 & 2) != 0) {
            communityFilterBottomSheetModel = communityFollowerContainerResponse.filterBottomSheet;
        }
        if ((i13 & 4) != 0) {
            designSystemModel = communityFollowerContainerResponse.header;
        }
        if ((i13 & 8) != 0) {
            list = communityFollowerContainerResponse.items;
        }
        return communityFollowerContainerResponse.copy(analyticEventModel, communityFilterBottomSheetModel, designSystemModel, list);
    }

    public static final /* synthetic */ void write$Self$community_follower_container_arch_mini_release(CommunityFollowerContainerResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.analyticEvent != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, AnalyticEventModel$$serializer.INSTANCE, self.analyticEvent);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.filterBottomSheet != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, CommunityFilterBottomSheetModel$$serializer.INSTANCE, self.filterBottomSheet);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.header != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.header);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && AbstractC22676k.m65745e(self.items, C25271y.f99162w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.items);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CommunityFilterBottomSheetModel getFilterBottomSheet() {
        return this.filterBottomSheet;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DesignSystemModel getHeader() {
        return this.header;
    }

    public final List<DesignSystemModel> component4() {
        return this.items;
    }

    public final CommunityFollowerContainerResponse copy(AnalyticEventModel analyticEvent, CommunityFilterBottomSheetModel filterBottomSheet, DesignSystemModel header, List<? extends DesignSystemModel> items) {
        AbstractC22676k.m65750j(items, "items");
        return new CommunityFollowerContainerResponse(analyticEvent, filterBottomSheet, header, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommunityFollowerContainerResponse)) {
            return false;
        }
        CommunityFollowerContainerResponse communityFollowerContainerResponse = (CommunityFollowerContainerResponse) other;
        return AbstractC22676k.m65745e(this.analyticEvent, communityFollowerContainerResponse.analyticEvent) && AbstractC22676k.m65745e(this.filterBottomSheet, communityFollowerContainerResponse.filterBottomSheet) && AbstractC22676k.m65745e(this.header, communityFollowerContainerResponse.header) && AbstractC22676k.m65745e(this.items, communityFollowerContainerResponse.items);
    }

    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    public final List<DesignSystemModel> getContentItems() {
        List<DesignSystemModel> list = this.items;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (DesignSystemModelKt.unwrap((DesignSystemModel) obj) instanceof CommunityFollowerModel) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final CommunityFilterBottomSheetModel getFilterBottomSheet() {
        return this.filterBottomSheet;
    }

    public final List<CommunityFollowerModel> getFollowerItems() {
        List<DesignSystemModel> list = this.items;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            DesignSystemModel designSystemModelUnwrap = DesignSystemModelKt.unwrap((DesignSystemModel) it.next());
            CommunityFollowerModel communityFollowerModel = designSystemModelUnwrap instanceof CommunityFollowerModel ? (CommunityFollowerModel) designSystemModelUnwrap : null;
            if (communityFollowerModel != null) {
                arrayList.add(communityFollowerModel);
            }
        }
        return arrayList;
    }

    public final DesignSystemModel getHeader() {
        return this.header;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public int hashCode() {
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        int iHashCode = (analyticEventModel == null ? 0 : analyticEventModel.hashCode()) * 31;
        CommunityFilterBottomSheetModel communityFilterBottomSheetModel = this.filterBottomSheet;
        int iHashCode2 = (iHashCode + (communityFilterBottomSheetModel == null ? 0 : communityFilterBottomSheetModel.hashCode())) * 31;
        DesignSystemModel designSystemModel = this.header;
        return this.items.hashCode() + ((iHashCode2 + (designSystemModel != null ? designSystemModel.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "CommunityFollowerContainerResponse(analyticEvent=" + this.analyticEvent + ", filterBottomSheet=" + this.filterBottomSheet + ", header=" + this.header + ", items=" + this.items + ")";
    }

    public /* synthetic */ CommunityFollowerContainerResponse(int i13, AnalyticEventModel analyticEventModel, CommunityFilterBottomSheetModel communityFilterBottomSheetModel, DesignSystemModel designSystemModel, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.analyticEvent = null;
        } else {
            this.analyticEvent = analyticEventModel;
        }
        if ((i13 & 2) == 0) {
            this.filterBottomSheet = null;
        } else {
            this.filterBottomSheet = communityFilterBottomSheetModel;
        }
        if ((i13 & 4) == 0) {
            this.header = null;
        } else {
            this.header = designSystemModel;
        }
        if ((i13 & 8) == 0) {
            this.items = C25271y.f99162w;
        } else {
            this.items = list;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommunityFollowerContainerResponse(AnalyticEventModel analyticEventModel, CommunityFilterBottomSheetModel communityFilterBottomSheetModel, DesignSystemModel designSystemModel, List<? extends DesignSystemModel> items) {
        AbstractC22676k.m65750j(items, "items");
        this.analyticEvent = analyticEventModel;
        this.filterBottomSheet = communityFilterBottomSheetModel;
        this.header = designSystemModel;
        this.items = items;
    }

    public /* synthetic */ CommunityFollowerContainerResponse(AnalyticEventModel analyticEventModel, CommunityFilterBottomSheetModel communityFilterBottomSheetModel, DesignSystemModel designSystemModel, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : analyticEventModel, (i13 & 2) != 0 ? null : communityFilterBottomSheetModel, (i13 & 4) != 0 ? null : designSystemModel, (i13 & 8) != 0 ? C25271y.f99162w : list);
    }
}
