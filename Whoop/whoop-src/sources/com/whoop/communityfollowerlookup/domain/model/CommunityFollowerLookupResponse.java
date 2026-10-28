package com.whoop.communityfollowerlookup.domain.model;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.AnalyticEventModel$$serializer;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.DesignSystemModelKt;
import com.whoop.design.models.items.FollowerRequestModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hb1.C17089l;
import ih0.AbstractC18489d0;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
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
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fBG\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b \u0010!JB\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001bJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u0010!R\u0017\u00104\u001a\b\u0012\u0004\u0012\u0002020\b8F¢\u0006\u0006\u001a\u0004\b3\u0010!R\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b5\u0010!¨\u00069"}, m65681d2 = {"Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;", "", "", "totalRequest", "", "title", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "<init>", "(ILjava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$community_follower_lookup_arch_mini_release", "(Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Lcom/whoop/analytics/AnalyticEventModel;", "component4", "()Ljava/util/List;", "copy", "(ILjava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;)Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTotalRequest", "Ljava/lang/String;", "getTitle", "Lcom/whoop/analytics/AnalyticEventModel;", "getAnalyticEvent", "Ljava/util/List;", "getItems", "Lcom/whoop/design/models/items/FollowerRequestModel;", "getFollowerRequestItems", "followerRequestItems", "getContentItems", "contentItems", "Companion", "$serializer", "community-follower-lookup-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CommunityFollowerLookupResponse {
    private final AnalyticEventModel analyticEvent;
    private final List<DesignSystemModel> items;
    private final String title;
    private final int totalRequest;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C17089l(13))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;", "serializer", "()Lwc3/c;", "community-follower-lookup-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CommunityFollowerLookupResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CommunityFollowerLookupResponse() {
        this(0, (String) null, (AnalyticEventModel) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommunityFollowerLookupResponse copy$default(CommunityFollowerLookupResponse communityFollowerLookupResponse, int i13, String str, AnalyticEventModel analyticEventModel, List list, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = communityFollowerLookupResponse.totalRequest;
        }
        if ((i14 & 2) != 0) {
            str = communityFollowerLookupResponse.title;
        }
        if ((i14 & 4) != 0) {
            analyticEventModel = communityFollowerLookupResponse.analyticEvent;
        }
        if ((i14 & 8) != 0) {
            list = communityFollowerLookupResponse.items;
        }
        return communityFollowerLookupResponse.copy(i13, str, analyticEventModel, list);
    }

    public static final /* synthetic */ void write$Self$community_follower_lookup_arch_mini_release(CommunityFollowerLookupResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.totalRequest != 0) {
            output.encodeIntElement(serialDesc, 0, self.totalRequest);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.analyticEvent != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, AnalyticEventModel$$serializer.INSTANCE, self.analyticEvent);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && AbstractC22676k.m65745e(self.items, C25271y.f99162w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.items);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotalRequest() {
        return this.totalRequest;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    public final List<DesignSystemModel> component4() {
        return this.items;
    }

    public final CommunityFollowerLookupResponse copy(int totalRequest, String title, AnalyticEventModel analyticEvent, List<? extends DesignSystemModel> items) {
        AbstractC22676k.m65750j(items, "items");
        return new CommunityFollowerLookupResponse(totalRequest, title, analyticEvent, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommunityFollowerLookupResponse)) {
            return false;
        }
        CommunityFollowerLookupResponse communityFollowerLookupResponse = (CommunityFollowerLookupResponse) other;
        return this.totalRequest == communityFollowerLookupResponse.totalRequest && AbstractC22676k.m65745e(this.title, communityFollowerLookupResponse.title) && AbstractC22676k.m65745e(this.analyticEvent, communityFollowerLookupResponse.analyticEvent) && AbstractC22676k.m65745e(this.items, communityFollowerLookupResponse.items);
    }

    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    public final List<DesignSystemModel> getContentItems() {
        List<DesignSystemModel> list = this.items;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (DesignSystemModelKt.unwrap((DesignSystemModel) obj) instanceof FollowerRequestModel) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List<FollowerRequestModel> getFollowerRequestItems() {
        List<DesignSystemModel> list = this.items;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            DesignSystemModel designSystemModelUnwrap = DesignSystemModelKt.unwrap((DesignSystemModel) it.next());
            FollowerRequestModel followerRequestModel = designSystemModelUnwrap instanceof FollowerRequestModel ? (FollowerRequestModel) designSystemModelUnwrap : null;
            if (followerRequestModel != null) {
                arrayList.add(followerRequestModel);
            }
        }
        return arrayList;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getTotalRequest() {
        return this.totalRequest;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.totalRequest) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        return this.items.hashCode() + ((iHashCode2 + (analyticEventModel != null ? analyticEventModel.hashCode() : 0)) * 31);
    }

    public String toString() {
        int i13 = this.totalRequest;
        String str = this.title;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        List<DesignSystemModel> list = this.items;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "CommunityFollowerLookupResponse(totalRequest=", ", title=", str, ", analyticEvent=");
        sbM53373n.append(analyticEventModel);
        sbM53373n.append(", items=");
        sbM53373n.append(list);
        sbM53373n.append(")");
        return sbM53373n.toString();
    }

    public /* synthetic */ CommunityFollowerLookupResponse(int i13, int i14, String str, AnalyticEventModel analyticEventModel, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.totalRequest = (i13 & 1) == 0 ? 0 : i14;
        if ((i13 & 2) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i13 & 4) == 0) {
            this.analyticEvent = null;
        } else {
            this.analyticEvent = analyticEventModel;
        }
        if ((i13 & 8) == 0) {
            this.items = C25271y.f99162w;
        } else {
            this.items = list;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommunityFollowerLookupResponse(int i13, String str, AnalyticEventModel analyticEventModel, List<? extends DesignSystemModel> items) {
        AbstractC22676k.m65750j(items, "items");
        this.totalRequest = i13;
        this.title = str;
        this.analyticEvent = analyticEventModel;
        this.items = items;
    }

    public /* synthetic */ CommunityFollowerLookupResponse(int i13, String str, AnalyticEventModel analyticEventModel, List list, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i13, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : analyticEventModel, (i14 & 8) != 0 ? C25271y.f99162w : list);
    }
}
