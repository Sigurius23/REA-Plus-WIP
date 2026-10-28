package com.whoop.impacts.details.domain.requests;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import jp1.C21864p;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBS\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&JN\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001eJ\u0010\u0010*\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010 R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010$R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00108\u0012\u0004\b:\u0010;\u001a\u0004\b9\u0010&¨\u0006>"}, m65681d2 = {"Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;", "", "", "analyticsId", "Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;", "header", "", "Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSection;", "sections", "Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;", "footer", "Lcom/whoop/impacts/details/domain/requests/MetaData;", "metadata", "<init>", "(Ljava/lang/String;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;Ljava/util/List;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;Lcom/whoop/impacts/details/domain/requests/MetaData;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;Ljava/util/List;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;Lcom/whoop/impacts/details/domain/requests/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$behavior_impact_release", "(Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;", "component3", "()Ljava/util/List;", "component4", "()Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;", "component5", "()Lcom/whoop/impacts/details/domain/requests/MetaData;", "copy", "(Ljava/lang/String;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;Ljava/util/List;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;Lcom/whoop/impacts/details/domain/requests/MetaData;)Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAnalyticsId", "Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;", "getHeader", "Ljava/util/List;", "getSections", "Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsFooter;", "getFooter", "Lcom/whoop/impacts/details/domain/requests/MetaData;", "getMetadata", "getMetadata$annotations", "()V", "Companion", "$serializer", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BehaviorDetailsResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final String analyticsId;
    private final BehaviorDetailsFooter footer;
    private final BehaviorDetailsHeader header;
    private final MetaData metadata;
    private final List<BehaviorDetailsSection> sections;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;", "serializer", "()Lwc3/c;", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BehaviorDetailsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C21864p(8)), null, AbstractC30060g.m92087G(enumC23463i, new C21864p(9))};
    }

    public /* synthetic */ BehaviorDetailsResponse(int i13, String str, BehaviorDetailsHeader behaviorDetailsHeader, List list, BehaviorDetailsFooter behaviorDetailsFooter, MetaData metaData, SerializationConstructorMarker serializationConstructorMarker) {
        if (6 != (i13 & 6)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 6, BehaviorDetailsResponse$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.analyticsId = null;
        } else {
            this.analyticsId = str;
        }
        this.header = behaviorDetailsHeader;
        this.sections = list;
        if ((i13 & 8) == 0) {
            this.footer = null;
        } else {
            this.footer = behaviorDetailsFooter;
        }
        if ((i13 & 16) == 0) {
            this.metadata = null;
        } else {
            this.metadata = metaData;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(BehaviorDetailsSection$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(MetaData.class), AbstractC38195a.m122336d(MetaData$$serializer.INSTANCE), new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BehaviorDetailsResponse copy$default(BehaviorDetailsResponse behaviorDetailsResponse, String str, BehaviorDetailsHeader behaviorDetailsHeader, List list, BehaviorDetailsFooter behaviorDetailsFooter, MetaData metaData, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = behaviorDetailsResponse.analyticsId;
        }
        if ((i13 & 2) != 0) {
            behaviorDetailsHeader = behaviorDetailsResponse.header;
        }
        if ((i13 & 4) != 0) {
            list = behaviorDetailsResponse.sections;
        }
        if ((i13 & 8) != 0) {
            behaviorDetailsFooter = behaviorDetailsResponse.footer;
        }
        if ((i13 & 16) != 0) {
            metaData = behaviorDetailsResponse.metadata;
        }
        MetaData metaData2 = metaData;
        List list2 = list;
        return behaviorDetailsResponse.copy(str, behaviorDetailsHeader, list2, behaviorDetailsFooter, metaData2);
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static final /* synthetic */ void write$Self$behavior_impact_release(BehaviorDetailsResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.analyticsId != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.analyticsId);
        }
        output.encodeSerializableElement(serialDesc, 1, BehaviorDetailsHeader$$serializer.INSTANCE, self.header);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.sections);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.footer != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, BehaviorDetailsFooter$$serializer.INSTANCE, self.footer);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.metadata == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.metadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAnalyticsId() {
        return this.analyticsId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BehaviorDetailsHeader getHeader() {
        return this.header;
    }

    public final List<BehaviorDetailsSection> component3() {
        return this.sections;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BehaviorDetailsFooter getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final BehaviorDetailsResponse copy(String analyticsId, BehaviorDetailsHeader header, List<BehaviorDetailsSection> sections, BehaviorDetailsFooter footer, MetaData metadata) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(sections, "sections");
        return new BehaviorDetailsResponse(analyticsId, header, sections, footer, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BehaviorDetailsResponse)) {
            return false;
        }
        BehaviorDetailsResponse behaviorDetailsResponse = (BehaviorDetailsResponse) other;
        return AbstractC22676k.m65745e(this.analyticsId, behaviorDetailsResponse.analyticsId) && AbstractC22676k.m65745e(this.header, behaviorDetailsResponse.header) && AbstractC22676k.m65745e(this.sections, behaviorDetailsResponse.sections) && AbstractC22676k.m65745e(this.footer, behaviorDetailsResponse.footer) && AbstractC22676k.m65745e(this.metadata, behaviorDetailsResponse.metadata);
    }

    public final String getAnalyticsId() {
        return this.analyticsId;
    }

    public final BehaviorDetailsFooter getFooter() {
        return this.footer;
    }

    public final BehaviorDetailsHeader getHeader() {
        return this.header;
    }

    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final List<BehaviorDetailsSection> getSections() {
        return this.sections;
    }

    public int hashCode() {
        String str = this.analyticsId;
        int iM31983b = AbstractC11895b.m31983b((this.header.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.sections);
        BehaviorDetailsFooter behaviorDetailsFooter = this.footer;
        int iHashCode = (iM31983b + (behaviorDetailsFooter == null ? 0 : behaviorDetailsFooter.hashCode())) * 31;
        MetaData metaData = this.metadata;
        return iHashCode + (metaData != null ? metaData.hashCode() : 0);
    }

    public String toString() {
        return "BehaviorDetailsResponse(analyticsId=" + this.analyticsId + ", header=" + this.header + ", sections=" + this.sections + ", footer=" + this.footer + ", metadata=" + this.metadata + ")";
    }

    public BehaviorDetailsResponse(String str, BehaviorDetailsHeader header, List<BehaviorDetailsSection> sections, BehaviorDetailsFooter behaviorDetailsFooter, MetaData metaData) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(sections, "sections");
        this.analyticsId = str;
        this.header = header;
        this.sections = sections;
        this.footer = behaviorDetailsFooter;
        this.metadata = metaData;
    }

    public /* synthetic */ BehaviorDetailsResponse(String str, BehaviorDetailsHeader behaviorDetailsHeader, List list, BehaviorDetailsFooter behaviorDetailsFooter, MetaData metaData, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, behaviorDetailsHeader, list, (i13 & 8) != 0 ? null : behaviorDetailsFooter, (i13 & 16) != 0 ? null : metaData);
    }
}
