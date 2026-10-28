package com.whoop.weeklyplan.hubandspoke.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.HorizontalStatModel;
import com.whoop.design.models.items.HorizontalStatModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
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
import p717lq2.C24676h;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010Bo\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b)\u0010!Jl\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b,\u0010!J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u001fJ\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010!R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b7\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b8\u0010!R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010'R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b=\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b>\u0010!¨\u0006A"}, m65681d2 = {"Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "goalTypeId", "", "title", "leftIcon", "rightIcon", "", "Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricTrendStyle;", "barStyles", "Lcom/whoop/design/models/items/HorizontalStatModel;", "horizontalStatAvg", "horizontalStatGoal", "recommendationText", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/HorizontalStatModel;Lcom/whoop/design/models/items/HorizontalStatModel;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/HorizontalStatModel;Lcom/whoop/design/models/items/HorizontalStatModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "()Lcom/whoop/design/models/items/HorizontalStatModel;", "component7", "component8", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/HorizontalStatModel;Lcom/whoop/design/models/items/HorizontalStatModel;Ljava/lang/String;)Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getGoalTypeId", "Ljava/lang/String;", "getTitle", "getLeftIcon", "getRightIcon", "Ljava/util/List;", "getBarStyles", "Lcom/whoop/design/models/items/HorizontalStatModel;", "getHorizontalStatAvg", "getHorizontalStatGoal", "getRecommendationText", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MetricCardModel implements DesignSystemModel {
    private final List<MetricTrendStyle> barStyles;
    private final int goalTypeId;
    private final HorizontalStatModel horizontalStatAvg;
    private final HorizontalStatModel horizontalStatGoal;
    private final String leftIcon;
    private final String recommendationText;
    private final String rightIcon;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C24676h(27)), null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MetricCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MetricCardModel(int i13, int i14, String str, String str2, String str3, List list, HorizontalStatModel horizontalStatModel, HorizontalStatModel horizontalStatModel2, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, MetricCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.goalTypeId = i14;
        this.title = str;
        this.leftIcon = str2;
        this.rightIcon = str3;
        this.barStyles = list;
        this.horizontalStatAvg = horizontalStatModel;
        this.horizontalStatGoal = horizontalStatModel2;
        this.recommendationText = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(MetricTrendStyle.INSTANCE.serializer());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MetricCardModel copy$default(MetricCardModel metricCardModel, int i13, String str, String str2, String str3, List list, HorizontalStatModel horizontalStatModel, HorizontalStatModel horizontalStatModel2, String str4, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = metricCardModel.goalTypeId;
        }
        if ((i14 & 2) != 0) {
            str = metricCardModel.title;
        }
        if ((i14 & 4) != 0) {
            str2 = metricCardModel.leftIcon;
        }
        if ((i14 & 8) != 0) {
            str3 = metricCardModel.rightIcon;
        }
        if ((i14 & 16) != 0) {
            list = metricCardModel.barStyles;
        }
        if ((i14 & 32) != 0) {
            horizontalStatModel = metricCardModel.horizontalStatAvg;
        }
        if ((i14 & 64) != 0) {
            horizontalStatModel2 = metricCardModel.horizontalStatGoal;
        }
        if ((i14 & 128) != 0) {
            str4 = metricCardModel.recommendationText;
        }
        HorizontalStatModel horizontalStatModel3 = horizontalStatModel2;
        String str5 = str4;
        List list2 = list;
        HorizontalStatModel horizontalStatModel4 = horizontalStatModel;
        return metricCardModel.copy(i13, str, str2, str3, list2, horizontalStatModel4, horizontalStatModel3, str5);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(MetricCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeIntElement(serialDesc, 0, self.goalTypeId);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.leftIcon);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.rightIcon);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.barStyles);
        HorizontalStatModel$$serializer horizontalStatModel$$serializer = HorizontalStatModel$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 5, horizontalStatModel$$serializer, self.horizontalStatAvg);
        output.encodeSerializableElement(serialDesc, 6, horizontalStatModel$$serializer, self.horizontalStatGoal);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.recommendationText);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getGoalTypeId() {
        return this.goalTypeId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLeftIcon() {
        return this.leftIcon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRightIcon() {
        return this.rightIcon;
    }

    public final List<MetricTrendStyle> component5() {
        return this.barStyles;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final HorizontalStatModel getHorizontalStatAvg() {
        return this.horizontalStatAvg;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final HorizontalStatModel getHorizontalStatGoal() {
        return this.horizontalStatGoal;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRecommendationText() {
        return this.recommendationText;
    }

    public final MetricCardModel copy(int goalTypeId, String title, String leftIcon, String rightIcon, List<? extends MetricTrendStyle> barStyles, HorizontalStatModel horizontalStatAvg, HorizontalStatModel horizontalStatGoal, String recommendationText) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(leftIcon, "leftIcon");
        AbstractC22676k.m65750j(horizontalStatAvg, "horizontalStatAvg");
        AbstractC22676k.m65750j(horizontalStatGoal, "horizontalStatGoal");
        return new MetricCardModel(goalTypeId, title, leftIcon, rightIcon, barStyles, horizontalStatAvg, horizontalStatGoal, recommendationText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetricCardModel)) {
            return false;
        }
        MetricCardModel metricCardModel = (MetricCardModel) other;
        return this.goalTypeId == metricCardModel.goalTypeId && AbstractC22676k.m65745e(this.title, metricCardModel.title) && AbstractC22676k.m65745e(this.leftIcon, metricCardModel.leftIcon) && AbstractC22676k.m65745e(this.rightIcon, metricCardModel.rightIcon) && AbstractC22676k.m65745e(this.barStyles, metricCardModel.barStyles) && AbstractC22676k.m65745e(this.horizontalStatAvg, metricCardModel.horizontalStatAvg) && AbstractC22676k.m65745e(this.horizontalStatGoal, metricCardModel.horizontalStatGoal) && AbstractC22676k.m65745e(this.recommendationText, metricCardModel.recommendationText);
    }

    public final List<MetricTrendStyle> getBarStyles() {
        return this.barStyles;
    }

    public final int getGoalTypeId() {
        return this.goalTypeId;
    }

    public final HorizontalStatModel getHorizontalStatAvg() {
        return this.horizontalStatAvg;
    }

    public final HorizontalStatModel getHorizontalStatGoal() {
        return this.horizontalStatGoal;
    }

    public final String getLeftIcon() {
        return this.leftIcon;
    }

    public final String getRecommendationText() {
        return this.recommendationText;
    }

    public final String getRightIcon() {
        return this.rightIcon;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(Integer.hashCode(this.goalTypeId) * 31, 31, this.title), 31, this.leftIcon);
        String str = this.rightIcon;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        List<MetricTrendStyle> list = this.barStyles;
        int iHashCode2 = (this.horizontalStatGoal.hashCode() + ((this.horizontalStatAvg.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.recommendationText;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i13 = this.goalTypeId;
        String str = this.title;
        String str2 = this.leftIcon;
        String str3 = this.rightIcon;
        List<MetricTrendStyle> list = this.barStyles;
        HorizontalStatModel horizontalStatModel = this.horizontalStatAvg;
        HorizontalStatModel horizontalStatModel2 = this.horizontalStatGoal;
        String str4 = this.recommendationText;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "MetricCardModel(goalTypeId=", ", title=", str, ", leftIcon=");
        AbstractC11266d.m30444B(sbM53373n, str2, ", rightIcon=", str3, ", barStyles=");
        sbM53373n.append(list);
        sbM53373n.append(", horizontalStatAvg=");
        sbM53373n.append(horizontalStatModel);
        sbM53373n.append(", horizontalStatGoal=");
        sbM53373n.append(horizontalStatModel2);
        sbM53373n.append(", recommendationText=");
        sbM53373n.append(str4);
        sbM53373n.append(")");
        return sbM53373n.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MetricCardModel(int i13, String title, String leftIcon, String str, List<? extends MetricTrendStyle> list, HorizontalStatModel horizontalStatAvg, HorizontalStatModel horizontalStatGoal, String str2) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(leftIcon, "leftIcon");
        AbstractC22676k.m65750j(horizontalStatAvg, "horizontalStatAvg");
        AbstractC22676k.m65750j(horizontalStatGoal, "horizontalStatGoal");
        this.goalTypeId = i13;
        this.title = title;
        this.leftIcon = leftIcon;
        this.rightIcon = str;
        this.barStyles = list;
        this.horizontalStatAvg = horizontalStatAvg;
        this.horizontalStatGoal = horizontalStatGoal;
        this.recommendationText = str2;
    }
}
