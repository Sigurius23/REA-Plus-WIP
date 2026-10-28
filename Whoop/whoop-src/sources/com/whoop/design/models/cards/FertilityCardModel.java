package com.whoop.design.models.cards;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.ImpactModel;
import com.whoop.design.models.items.ImpactModel$$serializer;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
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
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import t42.C33538a;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB]\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'JZ\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010'¨\u0006?"}, m65681d2 = {"Lcom/whoop/design/models/cards/FertilityCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "cardTitle", "icon", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/design/models/cards/FertilityCardBodyModel;", "body", "", "items", "Lcom/whoop/design/models/items/ImpactModel;", "trend", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/cards/FertilityCardBodyModel;Ljava/util/List;Lcom/whoop/design/models/items/ImpactModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/cards/FertilityCardBodyModel;Ljava/util/List;Lcom/whoop/design/models/items/ImpactModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/cards/FertilityCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/navigation/e;", "component4", "()Lcom/whoop/design/models/cards/FertilityCardBodyModel;", "component5", "()Ljava/util/List;", "component6", "()Lcom/whoop/design/models/items/ImpactModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/cards/FertilityCardBodyModel;Ljava/util/List;Lcom/whoop/design/models/items/ImpactModel;)Lcom/whoop/design/models/cards/FertilityCardModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCardTitle", "getIcon", "Lcom/whoop/navigation/e;", "getDestination", "Lcom/whoop/design/models/cards/FertilityCardBodyModel;", "getBody", "Ljava/util/List;", "getItems", "Lcom/whoop/design/models/items/ImpactModel;", "getTrend", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FertilityCardModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final FertilityCardBodyModel body;
    private final String cardTitle;
    private final C9598e destination;
    private final String icon;
    private final List<DesignSystemModel> items;
    private final ImpactModel trend;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/cards/FertilityCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/cards/FertilityCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FertilityCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C33538a(10)), null, AbstractC30060g.m92087G(enumC23463i, new C33538a(11)), null};
    }

    public /* synthetic */ FertilityCardModel(int i13, String str, String str2, C9598e c9598e, FertilityCardBodyModel fertilityCardBodyModel, List list, ImpactModel impactModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, FertilityCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.cardTitle = str;
        this.icon = str2;
        this.destination = c9598e;
        this.body = fertilityCardBodyModel;
        this.items = list;
        this.trend = impactModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FertilityCardModel copy$default(FertilityCardModel fertilityCardModel, String str, String str2, C9598e c9598e, FertilityCardBodyModel fertilityCardBodyModel, List list, ImpactModel impactModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = fertilityCardModel.cardTitle;
        }
        if ((i13 & 2) != 0) {
            str2 = fertilityCardModel.icon;
        }
        if ((i13 & 4) != 0) {
            c9598e = fertilityCardModel.destination;
        }
        if ((i13 & 8) != 0) {
            fertilityCardBodyModel = fertilityCardModel.body;
        }
        if ((i13 & 16) != 0) {
            list = fertilityCardModel.items;
        }
        if ((i13 & 32) != 0) {
            impactModel = fertilityCardModel.trend;
        }
        List list2 = list;
        ImpactModel impactModel2 = impactModel;
        return fertilityCardModel.copy(str, str2, c9598e, fertilityCardBodyModel, list2, impactModel2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(FertilityCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.cardTitle);
        output.encodeStringElement(serialDesc, 1, self.icon);
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.destination);
        output.encodeNullableSerializableElement(serialDesc, 3, FertilityCardBodyModel$$serializer.INSTANCE, self.body);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.items);
        output.encodeNullableSerializableElement(serialDesc, 5, ImpactModel$$serializer.INSTANCE, self.trend);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCardTitle() {
        return this.cardTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FertilityCardBodyModel getBody() {
        return this.body;
    }

    public final List<DesignSystemModel> component5() {
        return this.items;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ImpactModel getTrend() {
        return this.trend;
    }

    public final FertilityCardModel copy(String cardTitle, String icon, C9598e destination, FertilityCardBodyModel body, List<? extends DesignSystemModel> items, ImpactModel trend) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(items, "items");
        return new FertilityCardModel(cardTitle, icon, destination, body, items, trend);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FertilityCardModel)) {
            return false;
        }
        FertilityCardModel fertilityCardModel = (FertilityCardModel) other;
        return AbstractC22676k.m65745e(this.cardTitle, fertilityCardModel.cardTitle) && AbstractC22676k.m65745e(this.icon, fertilityCardModel.icon) && AbstractC22676k.m65745e(this.destination, fertilityCardModel.destination) && AbstractC22676k.m65745e(this.body, fertilityCardModel.body) && AbstractC22676k.m65745e(this.items, fertilityCardModel.items) && AbstractC22676k.m65745e(this.trend, fertilityCardModel.trend);
    }

    public final FertilityCardBodyModel getBody() {
        return this.body;
    }

    public final String getCardTitle() {
        return this.cardTitle;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final ImpactModel getTrend() {
        return this.trend;
    }

    public int hashCode() {
        String str = this.cardTitle;
        int iM30450d = AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.icon);
        C9598e c9598e = this.destination;
        int iHashCode = (iM30450d + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        FertilityCardBodyModel fertilityCardBodyModel = this.body;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (fertilityCardBodyModel == null ? 0 : fertilityCardBodyModel.hashCode())) * 31, 31, this.items);
        ImpactModel impactModel = this.trend;
        return iM31983b + (impactModel != null ? impactModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.cardTitle;
        String str2 = this.icon;
        C9598e c9598e = this.destination;
        FertilityCardBodyModel fertilityCardBodyModel = this.body;
        List<DesignSystemModel> list = this.items;
        ImpactModel impactModel = this.trend;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("FertilityCardModel(cardTitle=", str, ", icon=", str2, ", destination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", body=");
        sbM32001t.append(fertilityCardBodyModel);
        sbM32001t.append(", items=");
        sbM32001t.append(list);
        sbM32001t.append(", trend=");
        sbM32001t.append(impactModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FertilityCardModel(String str, String icon, C9598e c9598e, FertilityCardBodyModel fertilityCardBodyModel, List<? extends DesignSystemModel> items, ImpactModel impactModel) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(items, "items");
        this.cardTitle = str;
        this.icon = icon;
        this.destination = c9598e;
        this.body = fertilityCardBodyModel;
        this.items = items;
        this.trend = impactModel;
    }
}
