package com.whoop.core.details.network.model;

import cj0.C4744f;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DCBo\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\u0085\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0018J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0018J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0018J\u0086\u0001\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0018J\u0010\u0010'\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,J'\u00105\u001a\u0002022\u0006\u0010-\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0001¢\u0006\u0004\b3\u00104R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b;\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b<\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b=\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b>\u0010\u0018R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b?\u0010\u0018R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b@\u0010\u0018R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\bA\u0010\u0018R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\bB\u0010\u0018¨\u0006E"}, m65681d2 = {"Lcom/whoop/core/details/network/model/CardModel;", "", "", "exerciseId", "Lcom/whoop/core/details/network/model/BottomStatsModel;", "bottomStats", "", "Lcom/whoop/core/details/network/model/StatRowModel;", "statRows", "titleDisplay", "totalsLabel", "volumeTitleDisplay", "weightLabel", "intensityLabel", "imageUrl", "endIcon", "<init>", "(Ljava/lang/String;Lcom/whoop/core/details/network/model/BottomStatsModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/core/details/network/model/BottomStatsModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/core/details/network/model/BottomStatsModel;", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Lcom/whoop/core/details/network/model/BottomStatsModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/core/details/network/model/CardModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_details_release", "(Lcom/whoop/core/details/network/model/CardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getExerciseId", "Lcom/whoop/core/details/network/model/BottomStatsModel;", "getBottomStats", "Ljava/util/List;", "getStatRows", "getTitleDisplay", "getTotalsLabel", "getVolumeTitleDisplay", "getWeightLabel", "getIntensityLabel", "getImageUrl", "getEndIcon", "Companion", "$serializer", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CardModel {
    private final BottomStatsModel bottomStats;
    private final String endIcon;
    private final String exerciseId;
    private final String imageUrl;
    private final String intensityLabel;
    private final List<StatRowModel> statRows;
    private final String titleDisplay;
    private final String totalsLabel;
    private final String volumeTitleDisplay;
    private final String weightLabel;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C4744f(26)), null, null, null, null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/core/details/network/model/CardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/core/details/network/model/CardModel;", "serializer", "()Lwc3/c;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CardModel(int i13, String str, BottomStatsModel bottomStatsModel, List list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if (319 != (i13 & 319)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 319, CardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.exerciseId = str;
        this.bottomStats = bottomStatsModel;
        this.statRows = list;
        this.titleDisplay = str2;
        this.totalsLabel = str3;
        this.volumeTitleDisplay = str4;
        if ((i13 & 64) == 0) {
            this.weightLabel = null;
        } else {
            this.weightLabel = str5;
        }
        if ((i13 & 128) == 0) {
            this.intensityLabel = null;
        } else {
            this.intensityLabel = str6;
        }
        this.imageUrl = str7;
        if ((i13 & 512) == 0) {
            this.endIcon = null;
        } else {
            this.endIcon = str8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StatRowModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardModel copy$default(CardModel cardModel, String str, BottomStatsModel bottomStatsModel, List list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = cardModel.exerciseId;
        }
        if ((i13 & 2) != 0) {
            bottomStatsModel = cardModel.bottomStats;
        }
        if ((i13 & 4) != 0) {
            list = cardModel.statRows;
        }
        if ((i13 & 8) != 0) {
            str2 = cardModel.titleDisplay;
        }
        if ((i13 & 16) != 0) {
            str3 = cardModel.totalsLabel;
        }
        if ((i13 & 32) != 0) {
            str4 = cardModel.volumeTitleDisplay;
        }
        if ((i13 & 64) != 0) {
            str5 = cardModel.weightLabel;
        }
        if ((i13 & 128) != 0) {
            str6 = cardModel.intensityLabel;
        }
        if ((i13 & 256) != 0) {
            str7 = cardModel.imageUrl;
        }
        if ((i13 & 512) != 0) {
            str8 = cardModel.endIcon;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        String str13 = str3;
        String str14 = str4;
        return cardModel.copy(str, bottomStatsModel, list, str2, str13, str14, str11, str12, str9, str10);
    }

    public static final /* synthetic */ void write$Self$core_details_release(CardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.exerciseId);
        output.encodeSerializableElement(serialDesc, 1, BottomStatsModel$$serializer.INSTANCE, self.bottomStats);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.statRows);
        output.encodeStringElement(serialDesc, 3, self.titleDisplay);
        output.encodeStringElement(serialDesc, 4, self.totalsLabel);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.volumeTitleDisplay);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.weightLabel != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.weightLabel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.intensityLabel != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.intensityLabel);
        }
        output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.imageUrl);
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && self.endIcon == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 9, stringSerializer, self.endIcon);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExerciseId() {
        return this.exerciseId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getEndIcon() {
        return this.endIcon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BottomStatsModel getBottomStats() {
        return this.bottomStats;
    }

    public final List<StatRowModel> component3() {
        return this.statRows;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTotalsLabel() {
        return this.totalsLabel;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getVolumeTitleDisplay() {
        return this.volumeTitleDisplay;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getWeightLabel() {
        return this.weightLabel;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getIntensityLabel() {
        return this.intensityLabel;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final CardModel copy(String exerciseId, BottomStatsModel bottomStats, List<StatRowModel> statRows, String titleDisplay, String totalsLabel, String volumeTitleDisplay, String weightLabel, String intensityLabel, String imageUrl, String endIcon) {
        AbstractC22676k.m65750j(bottomStats, "bottomStats");
        AbstractC22676k.m65750j(statRows, "statRows");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(totalsLabel, "totalsLabel");
        return new CardModel(exerciseId, bottomStats, statRows, titleDisplay, totalsLabel, volumeTitleDisplay, weightLabel, intensityLabel, imageUrl, endIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardModel)) {
            return false;
        }
        CardModel cardModel = (CardModel) other;
        return AbstractC22676k.m65745e(this.exerciseId, cardModel.exerciseId) && AbstractC22676k.m65745e(this.bottomStats, cardModel.bottomStats) && AbstractC22676k.m65745e(this.statRows, cardModel.statRows) && AbstractC22676k.m65745e(this.titleDisplay, cardModel.titleDisplay) && AbstractC22676k.m65745e(this.totalsLabel, cardModel.totalsLabel) && AbstractC22676k.m65745e(this.volumeTitleDisplay, cardModel.volumeTitleDisplay) && AbstractC22676k.m65745e(this.weightLabel, cardModel.weightLabel) && AbstractC22676k.m65745e(this.intensityLabel, cardModel.intensityLabel) && AbstractC22676k.m65745e(this.imageUrl, cardModel.imageUrl) && AbstractC22676k.m65745e(this.endIcon, cardModel.endIcon);
    }

    public final BottomStatsModel getBottomStats() {
        return this.bottomStats;
    }

    public final String getEndIcon() {
        return this.endIcon;
    }

    public final String getExerciseId() {
        return this.exerciseId;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getIntensityLabel() {
        return this.intensityLabel;
    }

    public final List<StatRowModel> getStatRows() {
        return this.statRows;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public final String getTotalsLabel() {
        return this.totalsLabel;
    }

    public final String getVolumeTitleDisplay() {
        return this.volumeTitleDisplay;
    }

    public final String getWeightLabel() {
        return this.weightLabel;
    }

    public int hashCode() {
        String str = this.exerciseId;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11895b.m31983b((this.bottomStats.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.statRows), 31, this.titleDisplay), 31, this.totalsLabel);
        String str2 = this.volumeTitleDisplay;
        int iHashCode = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.weightLabel;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.intensityLabel;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.imageUrl;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.endIcon;
        return iHashCode4 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        String str = this.exerciseId;
        BottomStatsModel bottomStatsModel = this.bottomStats;
        List<StatRowModel> list = this.statRows;
        String str2 = this.titleDisplay;
        String str3 = this.totalsLabel;
        String str4 = this.volumeTitleDisplay;
        String str5 = this.weightLabel;
        String str6 = this.intensityLabel;
        String str7 = this.imageUrl;
        String str8 = this.endIcon;
        StringBuilder sb4 = new StringBuilder("CardModel(exerciseId=");
        sb4.append(str);
        sb4.append(", bottomStats=");
        sb4.append(bottomStatsModel);
        sb4.append(", statRows=");
        AbstractC17176i.m48511m(", titleDisplay=", str2, ", totalsLabel=", sb4, list);
        AbstractC11266d.m30444B(sb4, str3, ", volumeTitleDisplay=", str4, ", weightLabel=");
        AbstractC11266d.m30444B(sb4, str5, ", intensityLabel=", str6, ", imageUrl=");
        return AbstractC11266d.m30464r(sb4, str7, ", endIcon=", str8, ")");
    }

    public CardModel(String str, BottomStatsModel bottomStats, List<StatRowModel> statRows, String titleDisplay, String totalsLabel, String str2, String str3, String str4, String str5, String str6) {
        AbstractC22676k.m65750j(bottomStats, "bottomStats");
        AbstractC22676k.m65750j(statRows, "statRows");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(totalsLabel, "totalsLabel");
        this.exerciseId = str;
        this.bottomStats = bottomStats;
        this.statRows = statRows;
        this.titleDisplay = titleDisplay;
        this.totalsLabel = totalsLabel;
        this.volumeTitleDisplay = str2;
        this.weightLabel = str3;
        this.intensityLabel = str4;
        this.imageUrl = str5;
        this.endIcon = str6;
    }

    public /* synthetic */ CardModel(String str, BottomStatsModel bottomStatsModel, List list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bottomStatsModel, list, str2, str3, str4, (i13 & 64) != 0 ? null : str5, (i13 & 128) != 0 ? null : str6, str7, (i13 & 512) != 0 ? null : str8);
    }
}
