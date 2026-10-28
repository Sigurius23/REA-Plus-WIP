package com.whoop.design.models.items;

import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.DesignSystemModel;
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
import w91.C36956c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB]\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010(J^\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b+\u0010(J\u0010\u0010,\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00103\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b;\u0010!R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010(¨\u0006B"}, m65681d2 = {"Lcom/whoop/design/models/items/DataHighlightModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/items/ScoreGaugeRowModel;", "pillarGauges", "Lcom/whoop/design/models/items/DividerModel;", "streaksDivider", "Lcom/whoop/design/models/items/StreaksContainer;", "streaks", "notableStatsDivider", "", "Lcom/whoop/design/models/items/NotableStatsModel;", "notableStats", "", "footer", "<init>", "(Lcom/whoop/design/models/items/ScoreGaugeRowModel;Lcom/whoop/design/models/items/DividerModel;Lcom/whoop/design/models/items/StreaksContainer;Lcom/whoop/design/models/items/DividerModel;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/ScoreGaugeRowModel;Lcom/whoop/design/models/items/DividerModel;Lcom/whoop/design/models/items/StreaksContainer;Lcom/whoop/design/models/items/DividerModel;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/DataHighlightModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/ScoreGaugeRowModel;", "component2", "()Lcom/whoop/design/models/items/DividerModel;", "component3", "()Lcom/whoop/design/models/items/StreaksContainer;", "component4", "component5", "()Ljava/util/List;", "component6", "()Ljava/lang/String;", "copy", "(Lcom/whoop/design/models/items/ScoreGaugeRowModel;Lcom/whoop/design/models/items/DividerModel;Lcom/whoop/design/models/items/StreaksContainer;Lcom/whoop/design/models/items/DividerModel;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/design/models/items/DataHighlightModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/ScoreGaugeRowModel;", "getPillarGauges", "getPillarGauges$annotations", "()V", "Lcom/whoop/design/models/items/DividerModel;", "getStreaksDivider", "Lcom/whoop/design/models/items/StreaksContainer;", "getStreaks", "getNotableStatsDivider", "Ljava/util/List;", "getNotableStats", "Ljava/lang/String;", "getFooter", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DataHighlightModel implements DesignSystemModel {
    private final String footer;
    private final List<NotableStatsModel> notableStats;
    private final DividerModel notableStatsDivider;

    @SerializedName("sticky_score_gauges")
    private final ScoreGaugeRowModel pillarGauges;
    private final StreaksContainer streaks;
    private final DividerModel streaksDivider;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36956c(6)), null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/DataHighlightModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/DataHighlightModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DataHighlightModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DataHighlightModel(int i13, ScoreGaugeRowModel scoreGaugeRowModel, DividerModel dividerModel, StreaksContainer streaksContainer, DividerModel dividerModel2, List list, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, DataHighlightModel$$serializer.INSTANCE.getDescriptor());
        }
        this.pillarGauges = scoreGaugeRowModel;
        this.streaksDivider = dividerModel;
        this.streaks = streaksContainer;
        this.notableStatsDivider = dividerModel2;
        this.notableStats = list;
        this.footer = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(NotableStatsModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataHighlightModel copy$default(DataHighlightModel dataHighlightModel, ScoreGaugeRowModel scoreGaugeRowModel, DividerModel dividerModel, StreaksContainer streaksContainer, DividerModel dividerModel2, List list, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            scoreGaugeRowModel = dataHighlightModel.pillarGauges;
        }
        if ((i13 & 2) != 0) {
            dividerModel = dataHighlightModel.streaksDivider;
        }
        if ((i13 & 4) != 0) {
            streaksContainer = dataHighlightModel.streaks;
        }
        if ((i13 & 8) != 0) {
            dividerModel2 = dataHighlightModel.notableStatsDivider;
        }
        if ((i13 & 16) != 0) {
            list = dataHighlightModel.notableStats;
        }
        if ((i13 & 32) != 0) {
            str = dataHighlightModel.footer;
        }
        List list2 = list;
        String str2 = str;
        return dataHighlightModel.copy(scoreGaugeRowModel, dividerModel, streaksContainer, dividerModel2, list2, str2);
    }

    @InterfaceC37143h("sticky_score_gauges")
    public static /* synthetic */ void getPillarGauges$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(DataHighlightModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, ScoreGaugeRowModel$$serializer.INSTANCE, self.pillarGauges);
        DividerModel$$serializer dividerModel$$serializer = DividerModel$$serializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, dividerModel$$serializer, self.streaksDivider);
        output.encodeNullableSerializableElement(serialDesc, 2, StreaksContainer$$serializer.INSTANCE, self.streaks);
        output.encodeNullableSerializableElement(serialDesc, 3, dividerModel$$serializer, self.notableStatsDivider);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.notableStats);
        output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.footer);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ScoreGaugeRowModel getPillarGauges() {
        return this.pillarGauges;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DividerModel getStreaksDivider() {
        return this.streaksDivider;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final StreaksContainer getStreaks() {
        return this.streaks;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DividerModel getNotableStatsDivider() {
        return this.notableStatsDivider;
    }

    public final List<NotableStatsModel> component5() {
        return this.notableStats;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFooter() {
        return this.footer;
    }

    public final DataHighlightModel copy(ScoreGaugeRowModel pillarGauges, DividerModel streaksDivider, StreaksContainer streaks, DividerModel notableStatsDivider, List<NotableStatsModel> notableStats, String footer) {
        return new DataHighlightModel(pillarGauges, streaksDivider, streaks, notableStatsDivider, notableStats, footer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataHighlightModel)) {
            return false;
        }
        DataHighlightModel dataHighlightModel = (DataHighlightModel) other;
        return AbstractC22676k.m65745e(this.pillarGauges, dataHighlightModel.pillarGauges) && AbstractC22676k.m65745e(this.streaksDivider, dataHighlightModel.streaksDivider) && AbstractC22676k.m65745e(this.streaks, dataHighlightModel.streaks) && AbstractC22676k.m65745e(this.notableStatsDivider, dataHighlightModel.notableStatsDivider) && AbstractC22676k.m65745e(this.notableStats, dataHighlightModel.notableStats) && AbstractC22676k.m65745e(this.footer, dataHighlightModel.footer);
    }

    public final String getFooter() {
        return this.footer;
    }

    public final List<NotableStatsModel> getNotableStats() {
        return this.notableStats;
    }

    public final DividerModel getNotableStatsDivider() {
        return this.notableStatsDivider;
    }

    public final ScoreGaugeRowModel getPillarGauges() {
        return this.pillarGauges;
    }

    public final StreaksContainer getStreaks() {
        return this.streaks;
    }

    public final DividerModel getStreaksDivider() {
        return this.streaksDivider;
    }

    public int hashCode() {
        ScoreGaugeRowModel scoreGaugeRowModel = this.pillarGauges;
        int iHashCode = (scoreGaugeRowModel == null ? 0 : scoreGaugeRowModel.hashCode()) * 31;
        DividerModel dividerModel = this.streaksDivider;
        int iHashCode2 = (iHashCode + (dividerModel == null ? 0 : dividerModel.hashCode())) * 31;
        StreaksContainer streaksContainer = this.streaks;
        int iHashCode3 = (iHashCode2 + (streaksContainer == null ? 0 : streaksContainer.hashCode())) * 31;
        DividerModel dividerModel2 = this.notableStatsDivider;
        int iHashCode4 = (iHashCode3 + (dividerModel2 == null ? 0 : dividerModel2.hashCode())) * 31;
        List<NotableStatsModel> list = this.notableStats;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.footer;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        ScoreGaugeRowModel scoreGaugeRowModel = this.pillarGauges;
        DividerModel dividerModel = this.streaksDivider;
        StreaksContainer streaksContainer = this.streaks;
        DividerModel dividerModel2 = this.notableStatsDivider;
        List<NotableStatsModel> list = this.notableStats;
        String str = this.footer;
        StringBuilder sb4 = new StringBuilder("DataHighlightModel(pillarGauges=");
        sb4.append(scoreGaugeRowModel);
        sb4.append(", streaksDivider=");
        sb4.append(dividerModel);
        sb4.append(", streaks=");
        sb4.append(streaksContainer);
        sb4.append(", notableStatsDivider=");
        sb4.append(dividerModel2);
        sb4.append(", notableStats=");
        return AbstractC38963t7.m124377g(", footer=", str, ")", sb4, list);
    }

    public DataHighlightModel(ScoreGaugeRowModel scoreGaugeRowModel, DividerModel dividerModel, StreaksContainer streaksContainer, DividerModel dividerModel2, List<NotableStatsModel> list, String str) {
        this.pillarGauges = scoreGaugeRowModel;
        this.streaksDivider = dividerModel;
        this.streaks = streaksContainer;
        this.notableStatsDivider = dividerModel2;
        this.notableStats = list;
        this.footer = str;
    }
}
