package com.whoop.communitymoments.domain.models;

import c13.AbstractC3855a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.LegendStyle;
import com.whoop.design.models.items.ScoreGaugeModel;
import com.whoop.design.models.items.ScoreGaugeModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import ur0.C35180a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000267B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"JL\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b2\u0010\u001cR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010\"¨\u00068"}, m65681d2 = {"Lcom/whoop/communitymoments/domain/models/MomentCompactScoreGaugeModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "Lcom/whoop/design/models/items/ScoreGaugeModel;", "scoreGauge", "title", "subtitle", "", "Lcom/whoop/design/models/LegendStyle;", "barStyles", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/items/ScoreGaugeModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/items/ScoreGaugeModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$community_moments_release", "(Lcom/whoop/communitymoments/domain/models/MomentCompactScoreGaugeModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/items/ScoreGaugeModel;", "component3", "component4", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/items/ScoreGaugeModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/communitymoments/domain/models/MomentCompactScoreGaugeModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/whoop/design/models/items/ScoreGaugeModel;", "getScoreGauge", "getTitle", "getSubtitle", "Ljava/util/List;", "getBarStyles", "Companion", "$serializer", "a", "community-moments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MomentCompactScoreGaugeModel implements DesignSystemModel {
    private final List<LegendStyle> barStyles;
    private final String id;
    private final ScoreGaugeModel scoreGauge;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C35180a(9))};

    /* JADX INFO: renamed from: com.whoop.communitymoments.domain.models.MomentCompactScoreGaugeModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/communitymoments/domain/models/MomentCompactScoreGaugeModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/communitymoments/domain/models/MomentCompactScoreGaugeModel;", "serializer", "()Lwc3/c;", "community-moments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MomentCompactScoreGaugeModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MomentCompactScoreGaugeModel(int i13, String str, ScoreGaugeModel scoreGaugeModel, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, MomentCompactScoreGaugeModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.scoreGauge = scoreGaugeModel;
        this.title = str2;
        this.subtitle = str3;
        this.barStyles = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(LegendStyle.INSTANCE.serializer());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MomentCompactScoreGaugeModel copy$default(MomentCompactScoreGaugeModel momentCompactScoreGaugeModel, String str, ScoreGaugeModel scoreGaugeModel, String str2, String str3, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = momentCompactScoreGaugeModel.id;
        }
        if ((i13 & 2) != 0) {
            scoreGaugeModel = momentCompactScoreGaugeModel.scoreGauge;
        }
        if ((i13 & 4) != 0) {
            str2 = momentCompactScoreGaugeModel.title;
        }
        if ((i13 & 8) != 0) {
            str3 = momentCompactScoreGaugeModel.subtitle;
        }
        if ((i13 & 16) != 0) {
            list = momentCompactScoreGaugeModel.barStyles;
        }
        List list2 = list;
        String str4 = str2;
        return momentCompactScoreGaugeModel.copy(str, scoreGaugeModel, str4, str3, list2);
    }

    public static final /* synthetic */ void write$Self$community_moments_release(MomentCompactScoreGaugeModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeSerializableElement(serialDesc, 1, ScoreGaugeModel$$serializer.INSTANCE, self.scoreGauge);
        output.encodeStringElement(serialDesc, 2, self.title);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.barStyles);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ScoreGaugeModel getScoreGauge() {
        return this.scoreGauge;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<LegendStyle> component5() {
        return this.barStyles;
    }

    public final MomentCompactScoreGaugeModel copy(String id4, ScoreGaugeModel scoreGauge, String title, String subtitle, List<? extends LegendStyle> barStyles) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(scoreGauge, "scoreGauge");
        AbstractC22676k.m65750j(title, "title");
        return new MomentCompactScoreGaugeModel(id4, scoreGauge, title, subtitle, barStyles);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MomentCompactScoreGaugeModel)) {
            return false;
        }
        MomentCompactScoreGaugeModel momentCompactScoreGaugeModel = (MomentCompactScoreGaugeModel) other;
        return AbstractC22676k.m65745e(this.id, momentCompactScoreGaugeModel.id) && AbstractC22676k.m65745e(this.scoreGauge, momentCompactScoreGaugeModel.scoreGauge) && AbstractC22676k.m65745e(this.title, momentCompactScoreGaugeModel.title) && AbstractC22676k.m65745e(this.subtitle, momentCompactScoreGaugeModel.subtitle) && AbstractC22676k.m65745e(this.barStyles, momentCompactScoreGaugeModel.barStyles);
    }

    public final List<LegendStyle> getBarStyles() {
        return this.barStyles;
    }

    public final String getId() {
        return this.id;
    }

    public final ScoreGaugeModel getScoreGauge() {
        return this.scoreGauge;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.scoreGauge.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.title);
        String str = this.subtitle;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        List<LegendStyle> list = this.barStyles;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        ScoreGaugeModel scoreGaugeModel = this.scoreGauge;
        String str2 = this.title;
        String str3 = this.subtitle;
        List<LegendStyle> list = this.barStyles;
        StringBuilder sb4 = new StringBuilder("MomentCompactScoreGaugeModel(id=");
        sb4.append(str);
        sb4.append(", scoreGauge=");
        sb4.append(scoreGaugeModel);
        sb4.append(", title=");
        AbstractC11266d.m30444B(sb4, str2, ", subtitle=", str3, ", barStyles=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MomentCompactScoreGaugeModel(String id4, ScoreGaugeModel scoreGauge, String title, String str, List<? extends LegendStyle> list) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(scoreGauge, "scoreGauge");
        AbstractC22676k.m65750j(title, "title");
        this.id = id4;
        this.scoreGauge = scoreGauge;
        this.title = title;
        this.subtitle = str;
        this.barStyles = list;
    }
}
