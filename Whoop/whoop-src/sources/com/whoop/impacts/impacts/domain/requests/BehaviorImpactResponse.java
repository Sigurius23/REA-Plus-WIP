package com.whoop.impacts.impacts.domain.requests;

import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p734sl0.C32581a1;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBQ\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&JL\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u00072\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010\u001eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010$R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010;\u0012\u0004\b=\u00104\u001a\u0004\b<\u0010&¨\u0006@"}, m65681d2 = {"Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;", "", "Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;", "behaviorImpactTitleTile", "", "Lcom/whoop/design/models/DesignSystemModel;", "tiles", "", "journalEnabled", "", "cycleId", "Lcom/whoop/impacts/impacts/domain/requests/MetaData;", "metadata", "<init>", "(Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;Ljava/util/List;ZLjava/lang/Long;Lcom/whoop/impacts/impacts/domain/requests/MetaData;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;Ljava/util/List;ZLjava/lang/Long;Lcom/whoop/impacts/impacts/domain/requests/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$behavior_impact_release", "(Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;", "component2", "()Ljava/util/List;", "component3", "()Z", "component4", "()Ljava/lang/Long;", "component5", "()Lcom/whoop/impacts/impacts/domain/requests/MetaData;", "copy", "(Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;Ljava/util/List;ZLjava/lang/Long;Lcom/whoop/impacts/impacts/domain/requests/MetaData;)Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;", "getBehaviorImpactTitleTile", "getBehaviorImpactTitleTile$annotations", "()V", "Ljava/util/List;", "getTiles", "Z", "getJournalEnabled", "Ljava/lang/Long;", "getCycleId", "Lcom/whoop/impacts/impacts/domain/requests/MetaData;", "getMetadata", "getMetadata$annotations", "Companion", "$serializer", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BehaviorImpactResponse {

    @SerializedName("header")
    private final BehaviorImpactHeader behaviorImpactTitleTile;

    @SerializedName("cycle_id")
    private final Long cycleId;

    @SerializedName("journal_enabled")
    private final boolean journalEnabled;

    @SerializedName("metadata")
    private final MetaData metadata;

    @SerializedName("tiles")
    private final List<DesignSystemModel> tiles;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C32581a1(21)), null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;", "serializer", "()Lwc3/c;", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BehaviorImpactResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BehaviorImpactResponse(int i13, BehaviorImpactHeader behaviorImpactHeader, List list, boolean z4, Long l7, MetaData metaData, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, BehaviorImpactResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.behaviorImpactTitleTile = behaviorImpactHeader;
        this.tiles = list;
        this.journalEnabled = z4;
        this.cycleId = l7;
        if ((i13 & 16) == 0) {
            this.metadata = null;
        } else {
            this.metadata = metaData;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BehaviorImpactResponse copy$default(BehaviorImpactResponse behaviorImpactResponse, BehaviorImpactHeader behaviorImpactHeader, List list, boolean z4, Long l7, MetaData metaData, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            behaviorImpactHeader = behaviorImpactResponse.behaviorImpactTitleTile;
        }
        if ((i13 & 2) != 0) {
            list = behaviorImpactResponse.tiles;
        }
        if ((i13 & 4) != 0) {
            z4 = behaviorImpactResponse.journalEnabled;
        }
        if ((i13 & 8) != 0) {
            l7 = behaviorImpactResponse.cycleId;
        }
        if ((i13 & 16) != 0) {
            metaData = behaviorImpactResponse.metadata;
        }
        MetaData metaData2 = metaData;
        boolean z13 = z4;
        return behaviorImpactResponse.copy(behaviorImpactHeader, list, z13, l7, metaData2);
    }

    @InterfaceC37143h("header")
    public static /* synthetic */ void getBehaviorImpactTitleTile$annotations() {
    }

    @InterfaceC37143h("metadata")
    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static final /* synthetic */ void write$Self$behavior_impact_release(BehaviorImpactResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, BehaviorImpactHeader$$serializer.INSTANCE, self.behaviorImpactTitleTile);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.tiles);
        output.encodeBooleanElement(serialDesc, 2, self.journalEnabled);
        output.encodeNullableSerializableElement(serialDesc, 3, LongSerializer.INSTANCE, self.cycleId);
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.metadata == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, MetaData$$serializer.INSTANCE, self.metadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BehaviorImpactHeader getBehaviorImpactTitleTile() {
        return this.behaviorImpactTitleTile;
    }

    public final List<DesignSystemModel> component2() {
        return this.tiles;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getJournalEnabled() {
        return this.journalEnabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getCycleId() {
        return this.cycleId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final BehaviorImpactResponse copy(BehaviorImpactHeader behaviorImpactTitleTile, List<? extends DesignSystemModel> tiles, boolean journalEnabled, Long cycleId, MetaData metadata) {
        AbstractC22676k.m65750j(behaviorImpactTitleTile, "behaviorImpactTitleTile");
        AbstractC22676k.m65750j(tiles, "tiles");
        return new BehaviorImpactResponse(behaviorImpactTitleTile, tiles, journalEnabled, cycleId, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BehaviorImpactResponse)) {
            return false;
        }
        BehaviorImpactResponse behaviorImpactResponse = (BehaviorImpactResponse) other;
        return AbstractC22676k.m65745e(this.behaviorImpactTitleTile, behaviorImpactResponse.behaviorImpactTitleTile) && AbstractC22676k.m65745e(this.tiles, behaviorImpactResponse.tiles) && this.journalEnabled == behaviorImpactResponse.journalEnabled && AbstractC22676k.m65745e(this.cycleId, behaviorImpactResponse.cycleId) && AbstractC22676k.m65745e(this.metadata, behaviorImpactResponse.metadata);
    }

    public final BehaviorImpactHeader getBehaviorImpactTitleTile() {
        return this.behaviorImpactTitleTile;
    }

    public final Long getCycleId() {
        return this.cycleId;
    }

    public final boolean getJournalEnabled() {
        return this.journalEnabled;
    }

    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final List<DesignSystemModel> getTiles() {
        return this.tiles;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11895b.m31983b(this.behaviorImpactTitleTile.hashCode() * 31, 31, this.tiles), 31, this.journalEnabled);
        Long l7 = this.cycleId;
        int iHashCode = (iM8289b + (l7 == null ? 0 : l7.hashCode())) * 31;
        MetaData metaData = this.metadata;
        return iHashCode + (metaData != null ? metaData.hashCode() : 0);
    }

    public String toString() {
        return "BehaviorImpactResponse(behaviorImpactTitleTile=" + this.behaviorImpactTitleTile + ", tiles=" + this.tiles + ", journalEnabled=" + this.journalEnabled + ", cycleId=" + this.cycleId + ", metadata=" + this.metadata + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BehaviorImpactResponse(BehaviorImpactHeader behaviorImpactTitleTile, List<? extends DesignSystemModel> tiles, boolean z4, Long l7, MetaData metaData) {
        AbstractC22676k.m65750j(behaviorImpactTitleTile, "behaviorImpactTitleTile");
        AbstractC22676k.m65750j(tiles, "tiles");
        this.behaviorImpactTitleTile = behaviorImpactTitleTile;
        this.tiles = tiles;
        this.journalEnabled = z4;
        this.cycleId = l7;
        this.metadata = metaData;
    }

    public /* synthetic */ BehaviorImpactResponse(BehaviorImpactHeader behaviorImpactHeader, List list, boolean z4, Long l7, MetaData metaData, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(behaviorImpactHeader, list, z4, l7, (i13 & 16) != 0 ? null : metaData);
    }
}
