package com.whoop.healthspan.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.ImpactModel;
import com.whoop.design.models.items.ImpactModel$$serializer;
import com.whoop.design.models.items.PieChartModel;
import com.whoop.design.models.items.PieChartModel$$serializer;
import com.whoop.design.models.items.SecondaryButtonModel;
import com.whoop.design.models.items.SecondaryButtonModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ga1.C15620a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eB]\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJV\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001eJ\u0010\u0010*\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010$R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b9\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b:\u0010\u001e¨\u0006="}, m65681d2 = {"Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "", "Lcom/whoop/design/models/items/ImpactModel;", "trends", "Lcom/whoop/design/models/items/SecondaryButtonModel;", "button", "Lcom/whoop/design/models/items/PieChartModel;", "pieChart", "count", "category", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/PieChartModel;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/PieChartModel;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$healthspan_release", "(Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/design/models/items/SecondaryButtonModel;", "component4", "()Lcom/whoop/design/models/items/PieChartModel;", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/PieChartModel;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getTrends", "Lcom/whoop/design/models/items/SecondaryButtonModel;", "getButton", "Lcom/whoop/design/models/items/PieChartModel;", "getPieChart", "getCount", "getCategory", "Companion", "$serializer", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LabsImpactCardModel implements DesignSystemModel {
    private final SecondaryButtonModel button;
    private final String category;
    private final String count;
    private final PieChartModel pieChart;
    private final String title;
    private final List<ImpactModel> trends;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C15620a(18)), null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/healthspan/domain/models/LabsImpactCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/healthspan/domain/models/LabsImpactCardModel;", "serializer", "()Lwc3/c;", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LabsImpactCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LabsImpactCardModel(int i13, String str, List list, SecondaryButtonModel secondaryButtonModel, PieChartModel pieChartModel, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, LabsImpactCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.trends = list;
        this.button = secondaryButtonModel;
        this.pieChart = pieChartModel;
        this.count = str2;
        this.category = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ImpactModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LabsImpactCardModel copy$default(LabsImpactCardModel labsImpactCardModel, String str, List list, SecondaryButtonModel secondaryButtonModel, PieChartModel pieChartModel, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = labsImpactCardModel.title;
        }
        if ((i13 & 2) != 0) {
            list = labsImpactCardModel.trends;
        }
        if ((i13 & 4) != 0) {
            secondaryButtonModel = labsImpactCardModel.button;
        }
        if ((i13 & 8) != 0) {
            pieChartModel = labsImpactCardModel.pieChart;
        }
        if ((i13 & 16) != 0) {
            str2 = labsImpactCardModel.count;
        }
        if ((i13 & 32) != 0) {
            str3 = labsImpactCardModel.category;
        }
        String str4 = str2;
        String str5 = str3;
        return labsImpactCardModel.copy(str, list, secondaryButtonModel, pieChartModel, str4, str5);
    }

    public static final /* synthetic */ void write$Self$healthspan_release(LabsImpactCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.trends);
        output.encodeSerializableElement(serialDesc, 2, SecondaryButtonModel$$serializer.INSTANCE, self.button);
        output.encodeNullableSerializableElement(serialDesc, 3, PieChartModel$$serializer.INSTANCE, self.pieChart);
        output.encodeStringElement(serialDesc, 4, self.count);
        output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.category);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<ImpactModel> component2() {
        return this.trends;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SecondaryButtonModel getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PieChartModel getPieChart() {
        return this.pieChart;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    public final LabsImpactCardModel copy(String title, List<ImpactModel> trends, SecondaryButtonModel button, PieChartModel pieChart, String count, String category) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(trends, "trends");
        AbstractC22676k.m65750j(button, "button");
        AbstractC22676k.m65750j(count, "count");
        return new LabsImpactCardModel(title, trends, button, pieChart, count, category);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabsImpactCardModel)) {
            return false;
        }
        LabsImpactCardModel labsImpactCardModel = (LabsImpactCardModel) other;
        return AbstractC22676k.m65745e(this.title, labsImpactCardModel.title) && AbstractC22676k.m65745e(this.trends, labsImpactCardModel.trends) && AbstractC22676k.m65745e(this.button, labsImpactCardModel.button) && AbstractC22676k.m65745e(this.pieChart, labsImpactCardModel.pieChart) && AbstractC22676k.m65745e(this.count, labsImpactCardModel.count) && AbstractC22676k.m65745e(this.category, labsImpactCardModel.category);
    }

    public final SecondaryButtonModel getButton() {
        return this.button;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getCount() {
        return this.count;
    }

    public final PieChartModel getPieChart() {
        return this.pieChart;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<ImpactModel> getTrends() {
        return this.trends;
    }

    public int hashCode() {
        int iHashCode = (this.button.hashCode() + AbstractC11895b.m31983b(this.title.hashCode() * 31, 31, this.trends)) * 31;
        PieChartModel pieChartModel = this.pieChart;
        int iM30450d = AbstractC11266d.m30450d((iHashCode + (pieChartModel == null ? 0 : pieChartModel.hashCode())) * 31, 31, this.count);
        String str = this.category;
        return iM30450d + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        List<ImpactModel> list = this.trends;
        SecondaryButtonModel secondaryButtonModel = this.button;
        PieChartModel pieChartModel = this.pieChart;
        String str2 = this.count;
        String str3 = this.category;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("LabsImpactCardModel(title=", str, ", trends=", ", button=", list);
        sbM94766o.append(secondaryButtonModel);
        sbM94766o.append(", pieChart=");
        sbM94766o.append(pieChartModel);
        sbM94766o.append(", count=");
        return AbstractC11266d.m30464r(sbM94766o, str2, ", category=", str3, ")");
    }

    public LabsImpactCardModel(String title, List<ImpactModel> trends, SecondaryButtonModel button, PieChartModel pieChartModel, String count, String str) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(trends, "trends");
        AbstractC22676k.m65750j(button, "button");
        AbstractC22676k.m65750j(count, "count");
        this.title = title;
        this.trends = trends;
        this.button = button;
        this.pieChart = pieChartModel;
        this.count = count;
        this.category = str;
    }
}
