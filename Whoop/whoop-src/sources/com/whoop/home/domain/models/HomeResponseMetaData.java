package com.whoop.home.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.coacheverywherecommon.models.AiContextMetadataBottomRow;
import com.whoop.coacheverywherecommon.models.AiContextMetadataBottomRow$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import we1.C37224h;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0002MLBK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012Bg\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b-\u0010.Jb\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b7\u00108R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00109\u0012\u0004\b;\u0010<\u001a\u0004\b:\u0010\"R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010=\u0012\u0004\b?\u0010<\u001a\u0004\b>\u0010$R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010@\u0012\u0004\bB\u0010<\u001a\u0004\bA\u0010&R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010C\u0012\u0004\bE\u0010<\u001a\u0004\bD\u0010(R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010F\u001a\u0004\bG\u0010*R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010H\u001a\u0004\bI\u0010,R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010J\u001a\u0004\bK\u0010.¨\u0006N"}, m65681d2 = {"Lcom/whoop/home/domain/models/HomeResponseMetaData;", "", "Lcom/whoop/home/domain/models/CycleMetaData;", "cycleMetaData", "Lcom/whoop/home/domain/models/JournalMetaData;", "journalMetaData", "Lcom/whoop/home/domain/models/UserMetaData;", "userMetaData", "Lcom/whoop/home/domain/models/WhoopLiveMetaData;", "whoopLiveMetaData", "", "", "experimentIds", "Lcom/whoop/home/domain/models/AutopopMetadata;", "autopopMetadata", "Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;", "aiContextMetadata", "<init>", "(Lcom/whoop/home/domain/models/CycleMetaData;Lcom/whoop/home/domain/models/JournalMetaData;Lcom/whoop/home/domain/models/UserMetaData;Lcom/whoop/home/domain/models/WhoopLiveMetaData;Ljava/util/List;Lcom/whoop/home/domain/models/AutopopMetadata;Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/home/domain/models/CycleMetaData;Lcom/whoop/home/domain/models/JournalMetaData;Lcom/whoop/home/domain/models/UserMetaData;Lcom/whoop/home/domain/models/WhoopLiveMetaData;Ljava/util/List;Lcom/whoop/home/domain/models/AutopopMetadata;Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$home_release", "(Lcom/whoop/home/domain/models/HomeResponseMetaData;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/home/domain/models/CycleMetaData;", "component2", "()Lcom/whoop/home/domain/models/JournalMetaData;", "component3", "()Lcom/whoop/home/domain/models/UserMetaData;", "component4", "()Lcom/whoop/home/domain/models/WhoopLiveMetaData;", "component5", "()Ljava/util/List;", "component6", "()Lcom/whoop/home/domain/models/AutopopMetadata;", "component7", "()Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;", "copy", "(Lcom/whoop/home/domain/models/CycleMetaData;Lcom/whoop/home/domain/models/JournalMetaData;Lcom/whoop/home/domain/models/UserMetaData;Lcom/whoop/home/domain/models/WhoopLiveMetaData;Ljava/util/List;Lcom/whoop/home/domain/models/AutopopMetadata;Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;)Lcom/whoop/home/domain/models/HomeResponseMetaData;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/home/domain/models/CycleMetaData;", "getCycleMetaData", "getCycleMetaData$annotations", "()V", "Lcom/whoop/home/domain/models/JournalMetaData;", "getJournalMetaData", "getJournalMetaData$annotations", "Lcom/whoop/home/domain/models/UserMetaData;", "getUserMetaData", "getUserMetaData$annotations", "Lcom/whoop/home/domain/models/WhoopLiveMetaData;", "getWhoopLiveMetaData", "getWhoopLiveMetaData$annotations", "Ljava/util/List;", "getExperimentIds", "Lcom/whoop/home/domain/models/AutopopMetadata;", "getAutopopMetadata", "Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;", "getAiContextMetadata", "Companion", "$serializer", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HomeResponseMetaData {

    @SerializedName("ai_context_metadata")
    private final AiContextMetadataBottomRow aiContextMetadata;

    @SerializedName("autopop_metadata")
    private final AutopopMetadata autopopMetadata;

    @SerializedName("cycle_metadata")
    private final CycleMetaData cycleMetaData;

    @SerializedName("experiment_ids")
    private final List<String> experimentIds;

    @SerializedName("journal_metadata")
    private final JournalMetaData journalMetaData;

    @SerializedName("user_metadata")
    private final UserMetaData userMetaData;

    @SerializedName("whoop_live_metadata")
    private final WhoopLiveMetaData whoopLiveMetaData;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C37224h(18)), null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/home/domain/models/HomeResponseMetaData$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/home/domain/models/HomeResponseMetaData;", "serializer", "()Lwc3/c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HomeResponseMetaData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HomeResponseMetaData(int i13, CycleMetaData cycleMetaData, JournalMetaData journalMetaData, UserMetaData userMetaData, WhoopLiveMetaData whoopLiveMetaData, List list, AutopopMetadata autopopMetadata, AiContextMetadataBottomRow aiContextMetadataBottomRow, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, HomeResponseMetaData$$serializer.INSTANCE.getDescriptor());
        }
        this.cycleMetaData = cycleMetaData;
        this.journalMetaData = journalMetaData;
        this.userMetaData = userMetaData;
        this.whoopLiveMetaData = whoopLiveMetaData;
        this.experimentIds = list;
        this.autopopMetadata = autopopMetadata;
        this.aiContextMetadata = aiContextMetadataBottomRow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeResponseMetaData copy$default(HomeResponseMetaData homeResponseMetaData, CycleMetaData cycleMetaData, JournalMetaData journalMetaData, UserMetaData userMetaData, WhoopLiveMetaData whoopLiveMetaData, List list, AutopopMetadata autopopMetadata, AiContextMetadataBottomRow aiContextMetadataBottomRow, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            cycleMetaData = homeResponseMetaData.cycleMetaData;
        }
        if ((i13 & 2) != 0) {
            journalMetaData = homeResponseMetaData.journalMetaData;
        }
        if ((i13 & 4) != 0) {
            userMetaData = homeResponseMetaData.userMetaData;
        }
        if ((i13 & 8) != 0) {
            whoopLiveMetaData = homeResponseMetaData.whoopLiveMetaData;
        }
        if ((i13 & 16) != 0) {
            list = homeResponseMetaData.experimentIds;
        }
        if ((i13 & 32) != 0) {
            autopopMetadata = homeResponseMetaData.autopopMetadata;
        }
        if ((i13 & 64) != 0) {
            aiContextMetadataBottomRow = homeResponseMetaData.aiContextMetadata;
        }
        AutopopMetadata autopopMetadata2 = autopopMetadata;
        AiContextMetadataBottomRow aiContextMetadataBottomRow2 = aiContextMetadataBottomRow;
        List list2 = list;
        UserMetaData userMetaData2 = userMetaData;
        return homeResponseMetaData.copy(cycleMetaData, journalMetaData, userMetaData2, whoopLiveMetaData, list2, autopopMetadata2, aiContextMetadataBottomRow2);
    }

    @InterfaceC37143h("cycle_metadata")
    public static /* synthetic */ void getCycleMetaData$annotations() {
    }

    @InterfaceC37143h("journal_metadata")
    public static /* synthetic */ void getJournalMetaData$annotations() {
    }

    @InterfaceC37143h("user_metadata")
    public static /* synthetic */ void getUserMetaData$annotations() {
    }

    @InterfaceC37143h("whoop_live_metadata")
    public static /* synthetic */ void getWhoopLiveMetaData$annotations() {
    }

    public static final /* synthetic */ void write$Self$home_release(HomeResponseMetaData self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, CycleMetaData$$serializer.INSTANCE, self.cycleMetaData);
        output.encodeSerializableElement(serialDesc, 1, JournalMetaData$$serializer.INSTANCE, self.journalMetaData);
        output.encodeSerializableElement(serialDesc, 2, UserMetaData$$serializer.INSTANCE, self.userMetaData);
        output.encodeSerializableElement(serialDesc, 3, WhoopLiveMetaData$$serializer.INSTANCE, self.whoopLiveMetaData);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.experimentIds);
        output.encodeNullableSerializableElement(serialDesc, 5, AutopopMetadata$$serializer.INSTANCE, self.autopopMetadata);
        output.encodeNullableSerializableElement(serialDesc, 6, AiContextMetadataBottomRow$$serializer.INSTANCE, self.aiContextMetadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CycleMetaData getCycleMetaData() {
        return this.cycleMetaData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JournalMetaData getJournalMetaData() {
        return this.journalMetaData;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UserMetaData getUserMetaData() {
        return this.userMetaData;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final WhoopLiveMetaData getWhoopLiveMetaData() {
        return this.whoopLiveMetaData;
    }

    public final List<String> component5() {
        return this.experimentIds;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AutopopMetadata getAutopopMetadata() {
        return this.autopopMetadata;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final AiContextMetadataBottomRow getAiContextMetadata() {
        return this.aiContextMetadata;
    }

    public final HomeResponseMetaData copy(CycleMetaData cycleMetaData, JournalMetaData journalMetaData, UserMetaData userMetaData, WhoopLiveMetaData whoopLiveMetaData, List<String> experimentIds, AutopopMetadata autopopMetadata, AiContextMetadataBottomRow aiContextMetadata) {
        AbstractC22676k.m65750j(cycleMetaData, "cycleMetaData");
        AbstractC22676k.m65750j(journalMetaData, "journalMetaData");
        AbstractC22676k.m65750j(userMetaData, "userMetaData");
        AbstractC22676k.m65750j(whoopLiveMetaData, "whoopLiveMetaData");
        return new HomeResponseMetaData(cycleMetaData, journalMetaData, userMetaData, whoopLiveMetaData, experimentIds, autopopMetadata, aiContextMetadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeResponseMetaData)) {
            return false;
        }
        HomeResponseMetaData homeResponseMetaData = (HomeResponseMetaData) other;
        return AbstractC22676k.m65745e(this.cycleMetaData, homeResponseMetaData.cycleMetaData) && AbstractC22676k.m65745e(this.journalMetaData, homeResponseMetaData.journalMetaData) && AbstractC22676k.m65745e(this.userMetaData, homeResponseMetaData.userMetaData) && AbstractC22676k.m65745e(this.whoopLiveMetaData, homeResponseMetaData.whoopLiveMetaData) && AbstractC22676k.m65745e(this.experimentIds, homeResponseMetaData.experimentIds) && AbstractC22676k.m65745e(this.autopopMetadata, homeResponseMetaData.autopopMetadata) && AbstractC22676k.m65745e(this.aiContextMetadata, homeResponseMetaData.aiContextMetadata);
    }

    public final AiContextMetadataBottomRow getAiContextMetadata() {
        return this.aiContextMetadata;
    }

    public final AutopopMetadata getAutopopMetadata() {
        return this.autopopMetadata;
    }

    public final CycleMetaData getCycleMetaData() {
        return this.cycleMetaData;
    }

    public final List<String> getExperimentIds() {
        return this.experimentIds;
    }

    public final JournalMetaData getJournalMetaData() {
        return this.journalMetaData;
    }

    public final UserMetaData getUserMetaData() {
        return this.userMetaData;
    }

    public final WhoopLiveMetaData getWhoopLiveMetaData() {
        return this.whoopLiveMetaData;
    }

    public int hashCode() {
        int iHashCode = (this.whoopLiveMetaData.hashCode() + ((this.userMetaData.hashCode() + ((this.journalMetaData.hashCode() + (this.cycleMetaData.hashCode() * 31)) * 31)) * 31)) * 31;
        List<String> list = this.experimentIds;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        AutopopMetadata autopopMetadata = this.autopopMetadata;
        int iHashCode3 = (iHashCode2 + (autopopMetadata == null ? 0 : autopopMetadata.hashCode())) * 31;
        AiContextMetadataBottomRow aiContextMetadataBottomRow = this.aiContextMetadata;
        return iHashCode3 + (aiContextMetadataBottomRow != null ? aiContextMetadataBottomRow.hashCode() : 0);
    }

    public String toString() {
        return "HomeResponseMetaData(cycleMetaData=" + this.cycleMetaData + ", journalMetaData=" + this.journalMetaData + ", userMetaData=" + this.userMetaData + ", whoopLiveMetaData=" + this.whoopLiveMetaData + ", experimentIds=" + this.experimentIds + ", autopopMetadata=" + this.autopopMetadata + ", aiContextMetadata=" + this.aiContextMetadata + ")";
    }

    public HomeResponseMetaData(CycleMetaData cycleMetaData, JournalMetaData journalMetaData, UserMetaData userMetaData, WhoopLiveMetaData whoopLiveMetaData, List<String> list, AutopopMetadata autopopMetadata, AiContextMetadataBottomRow aiContextMetadataBottomRow) {
        AbstractC22676k.m65750j(cycleMetaData, "cycleMetaData");
        AbstractC22676k.m65750j(journalMetaData, "journalMetaData");
        AbstractC22676k.m65750j(userMetaData, "userMetaData");
        AbstractC22676k.m65750j(whoopLiveMetaData, "whoopLiveMetaData");
        this.cycleMetaData = cycleMetaData;
        this.journalMetaData = journalMetaData;
        this.userMetaData = userMetaData;
        this.whoopLiveMetaData = whoopLiveMetaData;
        this.experimentIds = list;
        this.autopopMetadata = autopopMetadata;
        this.aiContextMetadata = aiContextMetadataBottomRow;
    }
}
