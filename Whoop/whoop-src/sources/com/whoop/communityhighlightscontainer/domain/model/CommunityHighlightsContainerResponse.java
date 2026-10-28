package com.whoop.communityhighlightscontainer.domain.model;

import c13.AbstractC3855a;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.AnalyticEventModel$$serializer;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.DesignSystemModelKt;
import com.whoop.design.models.items.DesignItemGridModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import qo1.C30527b;
import qr0.AbstractC30555a;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J8\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010!R\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b1\u0010!¨\u00066"}, m65681d2 = {"Lcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;", "", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "", "title", "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "<init>", "(Lcom/whoop/analytics/AnalyticEventModel;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/analytics/AnalyticEventModel;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$community_highlights_container_arch_mini_release", "(Lcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "next", "appendPage", "(Lcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;)Lcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;", "component1", "()Lcom/whoop/analytics/AnalyticEventModel;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "copy", "(Lcom/whoop/analytics/AnalyticEventModel;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/analytics/AnalyticEventModel;", "getAnalyticEvent", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getItems", "getGridCards", "gridCards", "Companion", "$serializer", "a", "community-highlights-container-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CommunityHighlightsContainerResponse {
    private final AnalyticEventModel analyticEvent;
    private final List<DesignSystemModel> items;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C30527b(18))};

    /* JADX INFO: renamed from: com.whoop.communityhighlightscontainer.domain.model.CommunityHighlightsContainerResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;", "serializer", "()Lwc3/c;", "community-highlights-container-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CommunityHighlightsContainerResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CommunityHighlightsContainerResponse(int i13, AnalyticEventModel analyticEventModel, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, CommunityHighlightsContainerResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.analyticEvent = analyticEventModel;
        if ((i13 & 2) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i13 & 4) == 0) {
            this.items = C25271y.f99162w;
        } else {
            this.items = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommunityHighlightsContainerResponse copy$default(CommunityHighlightsContainerResponse communityHighlightsContainerResponse, AnalyticEventModel analyticEventModel, String str, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            analyticEventModel = communityHighlightsContainerResponse.analyticEvent;
        }
        if ((i13 & 2) != 0) {
            str = communityHighlightsContainerResponse.title;
        }
        if ((i13 & 4) != 0) {
            list = communityHighlightsContainerResponse.items;
        }
        return communityHighlightsContainerResponse.copy(analyticEventModel, str, list);
    }

    public static final /* synthetic */ void write$Self$community_highlights_container_arch_mini_release(CommunityHighlightsContainerResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, AnalyticEventModel$$serializer.INSTANCE, self.analyticEvent);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.title);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && AbstractC22676k.m65745e(self.items, C25271y.f99162w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.items);
    }

    public final CommunityHighlightsContainerResponse appendPage(CommunityHighlightsContainerResponse next) {
        AbstractC22676k.m65750j(next, "next");
        ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(getGridCards(), next.getGridCards());
        List<DesignSystemModel> list = next.items;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (DesignSystemModel designSystemModelM93710d : list) {
            if (AbstractC30555a.m93709c(designSystemModelM93710d)) {
                designSystemModelM93710d = AbstractC30555a.m93710d(designSystemModelM93710d, arrayListM74129g1);
            }
            arrayList.add(designSystemModelM93710d);
        }
        return copy$default(this, null, null, arrayList, 3, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<DesignSystemModel> component3() {
        return this.items;
    }

    public final CommunityHighlightsContainerResponse copy(AnalyticEventModel analyticEvent, String title, List<? extends DesignSystemModel> items) {
        AbstractC22676k.m65750j(items, "items");
        return new CommunityHighlightsContainerResponse(analyticEvent, title, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommunityHighlightsContainerResponse)) {
            return false;
        }
        CommunityHighlightsContainerResponse communityHighlightsContainerResponse = (CommunityHighlightsContainerResponse) other;
        return AbstractC22676k.m65745e(this.analyticEvent, communityHighlightsContainerResponse.analyticEvent) && AbstractC22676k.m65745e(this.title, communityHighlightsContainerResponse.title) && AbstractC22676k.m65745e(this.items, communityHighlightsContainerResponse.items);
    }

    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    public final List<DesignSystemModel> getGridCards() {
        List<DesignSystemModel> list = this.items;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            DesignSystemModel designSystemModelUnwrap = DesignSystemModelKt.unwrap((DesignSystemModel) it.next());
            DesignItemGridModel designItemGridModel = designSystemModelUnwrap instanceof DesignItemGridModel ? (DesignItemGridModel) designSystemModelUnwrap : null;
            if (designItemGridModel != null) {
                arrayList.add(designItemGridModel);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC25265s.m74141p0(arrayList2, ((DesignItemGridModel) it3.next()).getItems());
        }
        return arrayList2;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        int iHashCode = (analyticEventModel == null ? 0 : analyticEventModel.hashCode()) * 31;
        String str = this.title;
        return this.items.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        String str = this.title;
        List<DesignSystemModel> list = this.items;
        StringBuilder sb4 = new StringBuilder("CommunityHighlightsContainerResponse(analyticEvent=");
        sb4.append(analyticEventModel);
        sb4.append(", title=");
        sb4.append(str);
        sb4.append(", items=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommunityHighlightsContainerResponse(AnalyticEventModel analyticEventModel, String str, List<? extends DesignSystemModel> items) {
        AbstractC22676k.m65750j(items, "items");
        this.analyticEvent = analyticEventModel;
        this.title = str;
        this.items = items;
    }

    public /* synthetic */ CommunityHighlightsContainerResponse(AnalyticEventModel analyticEventModel, String str, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(analyticEventModel, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? C25271y.f99162w : list);
    }
}
