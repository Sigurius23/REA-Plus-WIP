package com.whoop.lastnightsleep.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.ArrowStatModel;
import com.whoop.design.models.items.ArrowStatModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import od2.C27864a;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eBi\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010#J^\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001eJ\u0010\u0010)\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010!R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b7\u0010#R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b8\u0010#¨\u0006;"}, m65681d2 = {"Lcom/whoop/lastnightsleep/domain/models/DetailsGraphingCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "cardTitle", "Lcom/whoop/lastnightsleep/domain/models/CardInfo;", "cardInfo", "", "Lcom/whoop/design/models/items/ArrowStatModel;", "arrowStat", "Lcom/whoop/lastnightsleep/domain/models/GraphLegendModel;", "graphLegends", "cardContent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/lastnightsleep/domain/models/CardInfo;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/lastnightsleep/domain/models/CardInfo;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$last_night_sleep_release", "(Lcom/whoop/lastnightsleep/domain/models/DetailsGraphingCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/lastnightsleep/domain/models/CardInfo;", "component4", "()Ljava/util/List;", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/lastnightsleep/domain/models/CardInfo;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/whoop/lastnightsleep/domain/models/DetailsGraphingCardModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getCardTitle", "Lcom/whoop/lastnightsleep/domain/models/CardInfo;", "getCardInfo", "Ljava/util/List;", "getArrowStat", "getGraphLegends", "getCardContent", "Companion", "$serializer", "last-night-sleep_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DetailsGraphingCardModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<ArrowStatModel> arrowStat;
    private final List<DesignSystemModel> cardContent;
    private final CardInfo cardInfo;
    private final String cardTitle;
    private final List<GraphLegendModel> graphLegends;
    private final String id;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/lastnightsleep/domain/models/DetailsGraphingCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/lastnightsleep/domain/models/DetailsGraphingCardModel;", "serializer", "()Lwc3/c;", "last-night-sleep_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DetailsGraphingCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C27864a(27)), AbstractC30060g.m92087G(enumC23463i, new C27864a(28)), AbstractC30060g.m92087G(enumC23463i, new C27864a(29))};
    }

    public /* synthetic */ DetailsGraphingCardModel(int i13, String str, String str2, CardInfo cardInfo, List list, List list2, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, DetailsGraphingCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.cardTitle = str2;
        this.cardInfo = cardInfo;
        this.arrowStat = list;
        this.graphLegends = list2;
        this.cardContent = list3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ArrowStatModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(GraphLegendModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DetailsGraphingCardModel copy$default(DetailsGraphingCardModel detailsGraphingCardModel, String str, String str2, CardInfo cardInfo, List list, List list2, List list3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = detailsGraphingCardModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = detailsGraphingCardModel.cardTitle;
        }
        if ((i13 & 4) != 0) {
            cardInfo = detailsGraphingCardModel.cardInfo;
        }
        if ((i13 & 8) != 0) {
            list = detailsGraphingCardModel.arrowStat;
        }
        if ((i13 & 16) != 0) {
            list2 = detailsGraphingCardModel.graphLegends;
        }
        if ((i13 & 32) != 0) {
            list3 = detailsGraphingCardModel.cardContent;
        }
        List list4 = list2;
        List list5 = list3;
        return detailsGraphingCardModel.copy(str, str2, cardInfo, list, list4, list5);
    }

    public static final /* synthetic */ void write$Self$last_night_sleep_release(DetailsGraphingCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.cardTitle);
        output.encodeSerializableElement(serialDesc, 2, CardInfo$$serializer.INSTANCE, self.cardInfo);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.arrowStat);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.graphLegends);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.cardContent);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCardTitle() {
        return this.cardTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CardInfo getCardInfo() {
        return this.cardInfo;
    }

    public final List<ArrowStatModel> component4() {
        return this.arrowStat;
    }

    public final List<GraphLegendModel> component5() {
        return this.graphLegends;
    }

    public final List<DesignSystemModel> component6() {
        return this.cardContent;
    }

    public final DetailsGraphingCardModel copy(String id4, String cardTitle, CardInfo cardInfo, List<ArrowStatModel> arrowStat, List<GraphLegendModel> graphLegends, List<? extends DesignSystemModel> cardContent) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(cardTitle, "cardTitle");
        AbstractC22676k.m65750j(cardInfo, "cardInfo");
        AbstractC22676k.m65750j(arrowStat, "arrowStat");
        AbstractC22676k.m65750j(graphLegends, "graphLegends");
        AbstractC22676k.m65750j(cardContent, "cardContent");
        return new DetailsGraphingCardModel(id4, cardTitle, cardInfo, arrowStat, graphLegends, cardContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailsGraphingCardModel)) {
            return false;
        }
        DetailsGraphingCardModel detailsGraphingCardModel = (DetailsGraphingCardModel) other;
        return AbstractC22676k.m65745e(this.id, detailsGraphingCardModel.id) && AbstractC22676k.m65745e(this.cardTitle, detailsGraphingCardModel.cardTitle) && AbstractC22676k.m65745e(this.cardInfo, detailsGraphingCardModel.cardInfo) && AbstractC22676k.m65745e(this.arrowStat, detailsGraphingCardModel.arrowStat) && AbstractC22676k.m65745e(this.graphLegends, detailsGraphingCardModel.graphLegends) && AbstractC22676k.m65745e(this.cardContent, detailsGraphingCardModel.cardContent);
    }

    public final List<ArrowStatModel> getArrowStat() {
        return this.arrowStat;
    }

    public final List<DesignSystemModel> getCardContent() {
        return this.cardContent;
    }

    public final CardInfo getCardInfo() {
        return this.cardInfo;
    }

    public final String getCardTitle() {
        return this.cardTitle;
    }

    public final List<GraphLegendModel> getGraphLegends() {
        return this.graphLegends;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.cardContent.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b((this.cardInfo.hashCode() + AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.cardTitle)) * 31, 31, this.arrowStat), 31, this.graphLegends);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.cardTitle;
        CardInfo cardInfo = this.cardInfo;
        List<ArrowStatModel> list = this.arrowStat;
        List<GraphLegendModel> list2 = this.graphLegends;
        List<DesignSystemModel> list3 = this.cardContent;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DetailsGraphingCardModel(id=", str, ", cardTitle=", str2, ", cardInfo=");
        sbM32001t.append(cardInfo);
        sbM32001t.append(", arrowStat=");
        sbM32001t.append(list);
        sbM32001t.append(", graphLegends=");
        return AbstractC30007c.m91843m(sbM32001t, list2, ", cardContent=", list3, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DetailsGraphingCardModel(String id4, String cardTitle, CardInfo cardInfo, List<ArrowStatModel> arrowStat, List<GraphLegendModel> graphLegends, List<? extends DesignSystemModel> cardContent) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(cardTitle, "cardTitle");
        AbstractC22676k.m65750j(cardInfo, "cardInfo");
        AbstractC22676k.m65750j(arrowStat, "arrowStat");
        AbstractC22676k.m65750j(graphLegends, "graphLegends");
        AbstractC22676k.m65750j(cardContent, "cardContent");
        this.id = id4;
        this.cardTitle = cardTitle;
        this.cardInfo = cardInfo;
        this.arrowStat = arrowStat;
        this.graphLegends = graphLegends;
        this.cardContent = cardContent;
    }
}
