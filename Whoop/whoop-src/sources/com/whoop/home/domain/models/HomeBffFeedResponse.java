package com.whoop.home.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
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
import we1.C37224h;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBS\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&JN\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\"R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010&¨\u0006>"}, m65681d2 = {"Lcom/whoop/home/domain/models/HomeBffFeedResponse;", "", "Lcom/whoop/home/domain/models/HomeResponseMetaData;", "metadata", "Lcom/whoop/home/domain/models/FabMenuModel;", "fabMenu", "Lcom/whoop/design/models/DesignSystemModel;", "header", "", "Lcom/whoop/home/domain/models/Pillars;", "pillars", "Lcom/whoop/home/domain/models/DayOneTransition;", "dayOneTransition", "<init>", "(Lcom/whoop/home/domain/models/HomeResponseMetaData;Lcom/whoop/home/domain/models/FabMenuModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/home/domain/models/DayOneTransition;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/home/domain/models/HomeResponseMetaData;Lcom/whoop/home/domain/models/FabMenuModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/home/domain/models/DayOneTransition;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$home_release", "(Lcom/whoop/home/domain/models/HomeBffFeedResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/home/domain/models/HomeResponseMetaData;", "component2", "()Lcom/whoop/home/domain/models/FabMenuModel;", "component3", "()Lcom/whoop/design/models/DesignSystemModel;", "component4", "()Ljava/util/List;", "component5", "()Lcom/whoop/home/domain/models/DayOneTransition;", "copy", "(Lcom/whoop/home/domain/models/HomeResponseMetaData;Lcom/whoop/home/domain/models/FabMenuModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lcom/whoop/home/domain/models/DayOneTransition;)Lcom/whoop/home/domain/models/HomeBffFeedResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/home/domain/models/HomeResponseMetaData;", "getMetadata", "Lcom/whoop/home/domain/models/FabMenuModel;", "getFabMenu", "Lcom/whoop/design/models/DesignSystemModel;", "getHeader", "Ljava/util/List;", "getPillars", "Lcom/whoop/home/domain/models/DayOneTransition;", "getDayOneTransition", "Companion", "$serializer", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HomeBffFeedResponse {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("day_one_transition")
    private final DayOneTransition dayOneTransition;

    @SerializedName("fab_menu")
    private final FabMenuModel fabMenu;

    @SerializedName("header")
    private final DesignSystemModel header;

    @SerializedName("metadata")
    private final HomeResponseMetaData metadata;

    @SerializedName("pillars")
    private final List<Pillars> pillars;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/home/domain/models/HomeBffFeedResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/home/domain/models/HomeBffFeedResponse;", "serializer", "()Lwc3/c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HomeBffFeedResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C37224h(16)), AbstractC30060g.m92087G(enumC23463i, new C37224h(17)), null};
    }

    public /* synthetic */ HomeBffFeedResponse(int i13, HomeResponseMetaData homeResponseMetaData, FabMenuModel fabMenuModel, DesignSystemModel designSystemModel, List list, DayOneTransition dayOneTransition, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, HomeBffFeedResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.metadata = homeResponseMetaData;
        this.fabMenu = fabMenuModel;
        this.header = designSystemModel;
        this.pillars = list;
        this.dayOneTransition = dayOneTransition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(Pillars$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeBffFeedResponse copy$default(HomeBffFeedResponse homeBffFeedResponse, HomeResponseMetaData homeResponseMetaData, FabMenuModel fabMenuModel, DesignSystemModel designSystemModel, List list, DayOneTransition dayOneTransition, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            homeResponseMetaData = homeBffFeedResponse.metadata;
        }
        if ((i13 & 2) != 0) {
            fabMenuModel = homeBffFeedResponse.fabMenu;
        }
        if ((i13 & 4) != 0) {
            designSystemModel = homeBffFeedResponse.header;
        }
        if ((i13 & 8) != 0) {
            list = homeBffFeedResponse.pillars;
        }
        if ((i13 & 16) != 0) {
            dayOneTransition = homeBffFeedResponse.dayOneTransition;
        }
        DayOneTransition dayOneTransition2 = dayOneTransition;
        DesignSystemModel designSystemModel2 = designSystemModel;
        return homeBffFeedResponse.copy(homeResponseMetaData, fabMenuModel, designSystemModel2, list, dayOneTransition2);
    }

    public static final /* synthetic */ void write$Self$home_release(HomeBffFeedResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, HomeResponseMetaData$$serializer.INSTANCE, self.metadata);
        output.encodeNullableSerializableElement(serialDesc, 1, FabMenuModel$$serializer.INSTANCE, self.fabMenu);
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.header);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.pillars);
        output.encodeNullableSerializableElement(serialDesc, 4, DayOneTransition$$serializer.INSTANCE, self.dayOneTransition);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HomeResponseMetaData getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FabMenuModel getFabMenu() {
        return this.fabMenu;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DesignSystemModel getHeader() {
        return this.header;
    }

    public final List<Pillars> component4() {
        return this.pillars;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DayOneTransition getDayOneTransition() {
        return this.dayOneTransition;
    }

    public final HomeBffFeedResponse copy(HomeResponseMetaData metadata, FabMenuModel fabMenu, DesignSystemModel header, List<Pillars> pillars, DayOneTransition dayOneTransition) {
        AbstractC22676k.m65750j(metadata, "metadata");
        AbstractC22676k.m65750j(pillars, "pillars");
        return new HomeBffFeedResponse(metadata, fabMenu, header, pillars, dayOneTransition);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeBffFeedResponse)) {
            return false;
        }
        HomeBffFeedResponse homeBffFeedResponse = (HomeBffFeedResponse) other;
        return AbstractC22676k.m65745e(this.metadata, homeBffFeedResponse.metadata) && AbstractC22676k.m65745e(this.fabMenu, homeBffFeedResponse.fabMenu) && AbstractC22676k.m65745e(this.header, homeBffFeedResponse.header) && AbstractC22676k.m65745e(this.pillars, homeBffFeedResponse.pillars) && AbstractC22676k.m65745e(this.dayOneTransition, homeBffFeedResponse.dayOneTransition);
    }

    public final DayOneTransition getDayOneTransition() {
        return this.dayOneTransition;
    }

    public final FabMenuModel getFabMenu() {
        return this.fabMenu;
    }

    public final DesignSystemModel getHeader() {
        return this.header;
    }

    public final HomeResponseMetaData getMetadata() {
        return this.metadata;
    }

    public final List<Pillars> getPillars() {
        return this.pillars;
    }

    public int hashCode() {
        int iHashCode = this.metadata.hashCode() * 31;
        FabMenuModel fabMenuModel = this.fabMenu;
        int iHashCode2 = (iHashCode + (fabMenuModel == null ? 0 : fabMenuModel.hashCode())) * 31;
        DesignSystemModel designSystemModel = this.header;
        int iM31983b = AbstractC11895b.m31983b((iHashCode2 + (designSystemModel == null ? 0 : designSystemModel.hashCode())) * 31, 31, this.pillars);
        DayOneTransition dayOneTransition = this.dayOneTransition;
        return iM31983b + (dayOneTransition != null ? dayOneTransition.hashCode() : 0);
    }

    public String toString() {
        return "HomeBffFeedResponse(metadata=" + this.metadata + ", fabMenu=" + this.fabMenu + ", header=" + this.header + ", pillars=" + this.pillars + ", dayOneTransition=" + this.dayOneTransition + ")";
    }

    public HomeBffFeedResponse(HomeResponseMetaData metadata, FabMenuModel fabMenuModel, DesignSystemModel designSystemModel, List<Pillars> pillars, DayOneTransition dayOneTransition) {
        AbstractC22676k.m65750j(metadata, "metadata");
        AbstractC22676k.m65750j(pillars, "pillars");
        this.metadata = metadata;
        this.fabMenu = fabMenuModel;
        this.header = designSystemModel;
        this.pillars = pillars;
        this.dayOneTransition = dayOneTransition;
    }
}
