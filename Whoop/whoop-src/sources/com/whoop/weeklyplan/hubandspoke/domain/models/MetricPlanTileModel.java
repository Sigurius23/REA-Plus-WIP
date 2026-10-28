package com.whoop.weeklyplan.hubandspoke.domain.models;

import com.whoop.design.models.DesignSystemModel;
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
import p555vl.AbstractC36095b;
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
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010Bo\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b)\u0010!Jp\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b,\u0010!J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u001fJ\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010!R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b7\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b8\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b9\u0010!R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b>\u0010!¨\u0006A"}, m65681d2 = {"Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "goalTypeId", "", "leftIcon", "title", "informationButton", "description", "", "Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricTrendStyle;", "barStyles", "Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;", "metricValue", "rightButtonIcon", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "()Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;", "component8", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;Ljava/lang/String;)Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getGoalTypeId", "Ljava/lang/String;", "getLeftIcon", "getTitle", "getInformationButton", "getDescription", "Ljava/util/List;", "getBarStyles", "Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;", "getMetricValue", "getRightButtonIcon", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MetricPlanTileModel implements DesignSystemModel {
    private final List<MetricTrendStyle> barStyles;
    private final String description;
    private final int goalTypeId;
    private final String informationButton;
    private final String leftIcon;
    private final MetricValue metricValue;
    private final String rightButtonIcon;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C24676h(28)), null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MetricPlanTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MetricPlanTileModel(int i13, int i14, String str, String str2, String str3, String str4, List list, MetricValue metricValue, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, MetricPlanTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.goalTypeId = i14;
        this.leftIcon = str;
        this.title = str2;
        this.informationButton = str3;
        this.description = str4;
        this.barStyles = list;
        this.metricValue = metricValue;
        this.rightButtonIcon = str5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(MetricTrendStyle.INSTANCE.serializer());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MetricPlanTileModel copy$default(MetricPlanTileModel metricPlanTileModel, int i13, String str, String str2, String str3, String str4, List list, MetricValue metricValue, String str5, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = metricPlanTileModel.goalTypeId;
        }
        if ((i14 & 2) != 0) {
            str = metricPlanTileModel.leftIcon;
        }
        if ((i14 & 4) != 0) {
            str2 = metricPlanTileModel.title;
        }
        if ((i14 & 8) != 0) {
            str3 = metricPlanTileModel.informationButton;
        }
        if ((i14 & 16) != 0) {
            str4 = metricPlanTileModel.description;
        }
        if ((i14 & 32) != 0) {
            list = metricPlanTileModel.barStyles;
        }
        if ((i14 & 64) != 0) {
            metricValue = metricPlanTileModel.metricValue;
        }
        if ((i14 & 128) != 0) {
            str5 = metricPlanTileModel.rightButtonIcon;
        }
        MetricValue metricValue2 = metricValue;
        String str6 = str5;
        String str7 = str4;
        List list2 = list;
        return metricPlanTileModel.copy(i13, str, str2, str3, str7, list2, metricValue2, str6);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(MetricPlanTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeIntElement(serialDesc, 0, self.goalTypeId);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.leftIcon);
        output.encodeStringElement(serialDesc, 2, self.title);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.informationButton);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.description);
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.barStyles);
        output.encodeSerializableElement(serialDesc, 6, MetricValue$$serializer.INSTANCE, self.metricValue);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.rightButtonIcon);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getGoalTypeId() {
        return this.goalTypeId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLeftIcon() {
        return this.leftIcon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getInformationButton() {
        return this.informationButton;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<MetricTrendStyle> component6() {
        return this.barStyles;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final MetricValue getMetricValue() {
        return this.metricValue;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRightButtonIcon() {
        return this.rightButtonIcon;
    }

    public final MetricPlanTileModel copy(int goalTypeId, String leftIcon, String title, String informationButton, String description, List<? extends MetricTrendStyle> barStyles, MetricValue metricValue, String rightButtonIcon) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(metricValue, "metricValue");
        return new MetricPlanTileModel(goalTypeId, leftIcon, title, informationButton, description, barStyles, metricValue, rightButtonIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetricPlanTileModel)) {
            return false;
        }
        MetricPlanTileModel metricPlanTileModel = (MetricPlanTileModel) other;
        return this.goalTypeId == metricPlanTileModel.goalTypeId && AbstractC22676k.m65745e(this.leftIcon, metricPlanTileModel.leftIcon) && AbstractC22676k.m65745e(this.title, metricPlanTileModel.title) && AbstractC22676k.m65745e(this.informationButton, metricPlanTileModel.informationButton) && AbstractC22676k.m65745e(this.description, metricPlanTileModel.description) && AbstractC22676k.m65745e(this.barStyles, metricPlanTileModel.barStyles) && AbstractC22676k.m65745e(this.metricValue, metricPlanTileModel.metricValue) && AbstractC22676k.m65745e(this.rightButtonIcon, metricPlanTileModel.rightButtonIcon);
    }

    public final List<MetricTrendStyle> getBarStyles() {
        return this.barStyles;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getGoalTypeId() {
        return this.goalTypeId;
    }

    public final String getInformationButton() {
        return this.informationButton;
    }

    public final String getLeftIcon() {
        return this.leftIcon;
    }

    public final MetricValue getMetricValue() {
        return this.metricValue;
    }

    public final String getRightButtonIcon() {
        return this.rightButtonIcon;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.goalTypeId) * 31;
        String str = this.leftIcon;
        int iM30450d = AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.title);
        String str2 = this.informationButton;
        int iHashCode2 = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<MetricTrendStyle> list = this.barStyles;
        int iHashCode4 = (this.metricValue.hashCode() + ((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        String str4 = this.rightButtonIcon;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        int i13 = this.goalTypeId;
        String str = this.leftIcon;
        String str2 = this.title;
        String str3 = this.informationButton;
        String str4 = this.description;
        List<MetricTrendStyle> list = this.barStyles;
        MetricValue metricValue = this.metricValue;
        String str5 = this.rightButtonIcon;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "MetricPlanTileModel(goalTypeId=", ", leftIcon=", str, ", title=");
        AbstractC11266d.m30444B(sbM53373n, str2, ", informationButton=", str3, ", description=");
        AbstractC36095b.m114694v(str4, ", barStyles=", ", metricValue=", sbM53373n, list);
        sbM53373n.append(metricValue);
        sbM53373n.append(", rightButtonIcon=");
        sbM53373n.append(str5);
        sbM53373n.append(")");
        return sbM53373n.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MetricPlanTileModel(int i13, String str, String title, String str2, String str3, List<? extends MetricTrendStyle> list, MetricValue metricValue, String str4) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(metricValue, "metricValue");
        this.goalTypeId = i13;
        this.leftIcon = str;
        this.title = title;
        this.informationButton = str2;
        this.description = str3;
        this.barStyles = list;
        this.metricValue = metricValue;
        this.rightButtonIcon = str4;
    }
}
