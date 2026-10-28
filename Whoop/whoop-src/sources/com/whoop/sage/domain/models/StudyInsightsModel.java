package com.whoop.sage.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.SecondaryButtonModel;
import com.whoop.design.models.items.SecondaryButtonModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import dx2.C12430a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b!\u0010\"JH\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010\"¨\u00067"}, m65681d2 = {"Lcom/whoop/sage/domain/models/StudyInsightsModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "imageUrl", "cardTitle", "cardSubtitle", "", "Lcom/whoop/sage/domain/models/StudyInsightsMetricModel;", "metricList", "Lcom/whoop/design/models/items/SecondaryButtonModel;", "secondaryButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sage_release", "(Lcom/whoop/sage/domain/models/StudyInsightsModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Lcom/whoop/design/models/items/SecondaryButtonModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;)Lcom/whoop/sage/domain/models/StudyInsightsModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImageUrl", "getCardTitle", "getCardSubtitle", "Ljava/util/List;", "getMetricList", "Lcom/whoop/design/models/items/SecondaryButtonModel;", "getSecondaryButton", "Companion", "$serializer", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StudyInsightsModel implements DesignSystemModel {
    private final String cardSubtitle;
    private final String cardTitle;
    private final String imageUrl;
    private final List<StudyInsightsMetricModel> metricList;
    private final SecondaryButtonModel secondaryButton;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C12430a(25)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sage/domain/models/StudyInsightsModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sage/domain/models/StudyInsightsModel;", "serializer", "()Lwc3/c;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StudyInsightsModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StudyInsightsModel(int i13, String str, String str2, String str3, List list, SecondaryButtonModel secondaryButtonModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, StudyInsightsModel$$serializer.INSTANCE.getDescriptor());
        }
        this.imageUrl = str;
        this.cardTitle = str2;
        this.cardSubtitle = str3;
        this.metricList = list;
        this.secondaryButton = secondaryButtonModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StudyInsightsMetricModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StudyInsightsModel copy$default(StudyInsightsModel studyInsightsModel, String str, String str2, String str3, List list, SecondaryButtonModel secondaryButtonModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = studyInsightsModel.imageUrl;
        }
        if ((i13 & 2) != 0) {
            str2 = studyInsightsModel.cardTitle;
        }
        if ((i13 & 4) != 0) {
            str3 = studyInsightsModel.cardSubtitle;
        }
        if ((i13 & 8) != 0) {
            list = studyInsightsModel.metricList;
        }
        if ((i13 & 16) != 0) {
            secondaryButtonModel = studyInsightsModel.secondaryButton;
        }
        SecondaryButtonModel secondaryButtonModel2 = secondaryButtonModel;
        String str4 = str3;
        return studyInsightsModel.copy(str, str2, str4, list, secondaryButtonModel2);
    }

    public static final /* synthetic */ void write$Self$sage_release(StudyInsightsModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.imageUrl);
        output.encodeStringElement(serialDesc, 1, self.cardTitle);
        output.encodeStringElement(serialDesc, 2, self.cardSubtitle);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.metricList);
        output.encodeSerializableElement(serialDesc, 4, SecondaryButtonModel$$serializer.INSTANCE, self.secondaryButton);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCardTitle() {
        return this.cardTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCardSubtitle() {
        return this.cardSubtitle;
    }

    public final List<StudyInsightsMetricModel> component4() {
        return this.metricList;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SecondaryButtonModel getSecondaryButton() {
        return this.secondaryButton;
    }

    public final StudyInsightsModel copy(String imageUrl, String cardTitle, String cardSubtitle, List<StudyInsightsMetricModel> metricList, SecondaryButtonModel secondaryButton) {
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(cardTitle, "cardTitle");
        AbstractC22676k.m65750j(cardSubtitle, "cardSubtitle");
        AbstractC22676k.m65750j(metricList, "metricList");
        AbstractC22676k.m65750j(secondaryButton, "secondaryButton");
        return new StudyInsightsModel(imageUrl, cardTitle, cardSubtitle, metricList, secondaryButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StudyInsightsModel)) {
            return false;
        }
        StudyInsightsModel studyInsightsModel = (StudyInsightsModel) other;
        return AbstractC22676k.m65745e(this.imageUrl, studyInsightsModel.imageUrl) && AbstractC22676k.m65745e(this.cardTitle, studyInsightsModel.cardTitle) && AbstractC22676k.m65745e(this.cardSubtitle, studyInsightsModel.cardSubtitle) && AbstractC22676k.m65745e(this.metricList, studyInsightsModel.metricList) && AbstractC22676k.m65745e(this.secondaryButton, studyInsightsModel.secondaryButton);
    }

    public final String getCardSubtitle() {
        return this.cardSubtitle;
    }

    public final String getCardTitle() {
        return this.cardTitle;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final List<StudyInsightsMetricModel> getMetricList() {
        return this.metricList;
    }

    public final SecondaryButtonModel getSecondaryButton() {
        return this.secondaryButton;
    }

    public int hashCode() {
        return this.secondaryButton.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.imageUrl.hashCode() * 31, 31, this.cardTitle), 31, this.cardSubtitle), 31, this.metricList);
    }

    public String toString() {
        String str = this.imageUrl;
        String str2 = this.cardTitle;
        String str3 = this.cardSubtitle;
        List<StudyInsightsMetricModel> list = this.metricList;
        SecondaryButtonModel secondaryButtonModel = this.secondaryButton;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("StudyInsightsModel(imageUrl=", str, ", cardTitle=", str2, ", cardSubtitle=");
        AbstractC36095b.m114694v(str3, ", metricList=", ", secondaryButton=", sbM32001t, list);
        sbM32001t.append(secondaryButtonModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public StudyInsightsModel(String imageUrl, String cardTitle, String cardSubtitle, List<StudyInsightsMetricModel> metricList, SecondaryButtonModel secondaryButton) {
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(cardTitle, "cardTitle");
        AbstractC22676k.m65750j(cardSubtitle, "cardSubtitle");
        AbstractC22676k.m65750j(metricList, "metricList");
        AbstractC22676k.m65750j(secondaryButton, "secondaryButton");
        this.imageUrl = imageUrl;
        this.cardTitle = cardTitle;
        this.cardSubtitle = cardSubtitle;
        this.metricList = metricList;
        this.secondaryButton = secondaryButton;
    }
}
