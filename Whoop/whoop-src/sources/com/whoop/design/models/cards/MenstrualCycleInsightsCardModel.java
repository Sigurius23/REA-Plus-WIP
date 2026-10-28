package com.whoop.design.models.cards;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.CardButtonModel$$serializer;
import com.whoop.design.models.items.DailyTickMarkPlotModel;
import com.whoop.design.models.items.DailyTickMarkPlotModel$$serializer;
import com.whoop.design.models.items.ImpactModel;
import com.whoop.design.models.items.ImpactModel$$serializer;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import t42.C33538a;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0002MLBQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012Bk\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&Jh\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0019J\u0010\u0010*\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100J'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b<\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010=\u001a\u0004\b>\u0010\u001cR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010?\u0012\u0004\bA\u0010B\u001a\u0004\b@\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bD\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bF\u0010\"R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010G\u0012\u0004\bI\u0010B\u001a\u0004\bH\u0010$R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010J\u001a\u0004\bK\u0010&¨\u0006N"}, m65681d2 = {"Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "endIcon", "Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardBodyModel;", "body", "Lcom/whoop/design/models/items/DailyTickMarkPlotModel;", "graph", "Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardFooterModel;", "footer", "Lcom/whoop/design/models/items/CardButtonModel;", "logButton", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/design/models/items/ImpactModel;", "trend", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardBodyModel;Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardFooterModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ImpactModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardBodyModel;Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardFooterModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ImpactModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardBodyModel;", "component4", "()Lcom/whoop/design/models/items/DailyTickMarkPlotModel;", "component5", "()Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardFooterModel;", "component6", "()Lcom/whoop/design/models/items/CardButtonModel;", "component7", "()Lcom/whoop/navigation/e;", "component8", "()Lcom/whoop/design/models/items/ImpactModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardBodyModel;Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardFooterModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ImpactModel;)Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getEndIcon", "Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardBodyModel;", "getBody", "Lcom/whoop/design/models/items/DailyTickMarkPlotModel;", "getGraph", "getGraph$annotations", "()V", "Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardFooterModel;", "getFooter", "Lcom/whoop/design/models/items/CardButtonModel;", "getLogButton", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "Lcom/whoop/design/models/items/ImpactModel;", "getTrend", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MenstrualCycleInsightsCardModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final MenstrualCycleInsightsCardBodyModel body;
    private final C9598e destination;
    private final String endIcon;
    private final MenstrualCycleInsightsCardFooterModel footer;
    private final DailyTickMarkPlotModel graph;
    private final CardButtonModel logButton;
    private final String title;
    private final ImpactModel trend;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/cards/MenstrualCycleInsightsCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MenstrualCycleInsightsCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C33538a(22)), null, null, AbstractC30060g.m92087G(enumC23463i, new C33538a(23)), null};
    }

    public /* synthetic */ MenstrualCycleInsightsCardModel(int i13, String str, String str2, MenstrualCycleInsightsCardBodyModel menstrualCycleInsightsCardBodyModel, DailyTickMarkPlotModel dailyTickMarkPlotModel, MenstrualCycleInsightsCardFooterModel menstrualCycleInsightsCardFooterModel, CardButtonModel cardButtonModel, C9598e c9598e, ImpactModel impactModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, MenstrualCycleInsightsCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.endIcon = str2;
        this.body = menstrualCycleInsightsCardBodyModel;
        this.graph = dailyTickMarkPlotModel;
        this.footer = menstrualCycleInsightsCardFooterModel;
        this.logButton = cardButtonModel;
        this.destination = c9598e;
        if ((i13 & 128) == 0) {
            this.trend = null;
        } else {
            this.trend = impactModel;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(DailyTickMarkPlotModel.class), DailyTickMarkPlotModel$$serializer.INSTANCE, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ MenstrualCycleInsightsCardModel copy$default(MenstrualCycleInsightsCardModel menstrualCycleInsightsCardModel, String str, String str2, MenstrualCycleInsightsCardBodyModel menstrualCycleInsightsCardBodyModel, DailyTickMarkPlotModel dailyTickMarkPlotModel, MenstrualCycleInsightsCardFooterModel menstrualCycleInsightsCardFooterModel, CardButtonModel cardButtonModel, C9598e c9598e, ImpactModel impactModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = menstrualCycleInsightsCardModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = menstrualCycleInsightsCardModel.endIcon;
        }
        if ((i13 & 4) != 0) {
            menstrualCycleInsightsCardBodyModel = menstrualCycleInsightsCardModel.body;
        }
        if ((i13 & 8) != 0) {
            dailyTickMarkPlotModel = menstrualCycleInsightsCardModel.graph;
        }
        if ((i13 & 16) != 0) {
            menstrualCycleInsightsCardFooterModel = menstrualCycleInsightsCardModel.footer;
        }
        if ((i13 & 32) != 0) {
            cardButtonModel = menstrualCycleInsightsCardModel.logButton;
        }
        if ((i13 & 64) != 0) {
            c9598e = menstrualCycleInsightsCardModel.destination;
        }
        if ((i13 & 128) != 0) {
            impactModel = menstrualCycleInsightsCardModel.trend;
        }
        C9598e c9598e2 = c9598e;
        ImpactModel impactModel2 = impactModel;
        MenstrualCycleInsightsCardFooterModel menstrualCycleInsightsCardFooterModel2 = menstrualCycleInsightsCardFooterModel;
        CardButtonModel cardButtonModel2 = cardButtonModel;
        return menstrualCycleInsightsCardModel.copy(str, str2, menstrualCycleInsightsCardBodyModel, dailyTickMarkPlotModel, menstrualCycleInsightsCardFooterModel2, cardButtonModel2, c9598e2, impactModel2);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    public static /* synthetic */ void getGraph$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(MenstrualCycleInsightsCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.endIcon);
        output.encodeSerializableElement(serialDesc, 2, MenstrualCycleInsightsCardBodyModel$$serializer.INSTANCE, self.body);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.graph);
        output.encodeNullableSerializableElement(serialDesc, 4, MenstrualCycleInsightsCardFooterModel$$serializer.INSTANCE, self.footer);
        output.encodeNullableSerializableElement(serialDesc, 5, CardButtonModel$$serializer.INSTANCE, self.logButton);
        output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.destination);
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.trend == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, ImpactModel$$serializer.INSTANCE, self.trend);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEndIcon() {
        return this.endIcon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MenstrualCycleInsightsCardBodyModel getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DailyTickMarkPlotModel getGraph() {
        return this.graph;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final MenstrualCycleInsightsCardFooterModel getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CardButtonModel getLogButton() {
        return this.logButton;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ImpactModel getTrend() {
        return this.trend;
    }

    public final MenstrualCycleInsightsCardModel copy(String title, String endIcon, MenstrualCycleInsightsCardBodyModel body, DailyTickMarkPlotModel graph, MenstrualCycleInsightsCardFooterModel footer, CardButtonModel logButton, C9598e destination, ImpactModel trend) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(endIcon, "endIcon");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(graph, "graph");
        return new MenstrualCycleInsightsCardModel(title, endIcon, body, graph, footer, logButton, destination, trend);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenstrualCycleInsightsCardModel)) {
            return false;
        }
        MenstrualCycleInsightsCardModel menstrualCycleInsightsCardModel = (MenstrualCycleInsightsCardModel) other;
        return AbstractC22676k.m65745e(this.title, menstrualCycleInsightsCardModel.title) && AbstractC22676k.m65745e(this.endIcon, menstrualCycleInsightsCardModel.endIcon) && AbstractC22676k.m65745e(this.body, menstrualCycleInsightsCardModel.body) && AbstractC22676k.m65745e(this.graph, menstrualCycleInsightsCardModel.graph) && AbstractC22676k.m65745e(this.footer, menstrualCycleInsightsCardModel.footer) && AbstractC22676k.m65745e(this.logButton, menstrualCycleInsightsCardModel.logButton) && AbstractC22676k.m65745e(this.destination, menstrualCycleInsightsCardModel.destination) && AbstractC22676k.m65745e(this.trend, menstrualCycleInsightsCardModel.trend);
    }

    public final MenstrualCycleInsightsCardBodyModel getBody() {
        return this.body;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getEndIcon() {
        return this.endIcon;
    }

    public final MenstrualCycleInsightsCardFooterModel getFooter() {
        return this.footer;
    }

    public final DailyTickMarkPlotModel getGraph() {
        return this.graph;
    }

    public final CardButtonModel getLogButton() {
        return this.logButton;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ImpactModel getTrend() {
        return this.trend;
    }

    public int hashCode() {
        int iHashCode = (this.graph.hashCode() + ((this.body.hashCode() + AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.endIcon)) * 31)) * 31;
        MenstrualCycleInsightsCardFooterModel menstrualCycleInsightsCardFooterModel = this.footer;
        int iHashCode2 = (iHashCode + (menstrualCycleInsightsCardFooterModel == null ? 0 : menstrualCycleInsightsCardFooterModel.hashCode())) * 31;
        CardButtonModel cardButtonModel = this.logButton;
        int iHashCode3 = (iHashCode2 + (cardButtonModel == null ? 0 : cardButtonModel.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode4 = (iHashCode3 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        ImpactModel impactModel = this.trend;
        return iHashCode4 + (impactModel != null ? impactModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.endIcon;
        MenstrualCycleInsightsCardBodyModel menstrualCycleInsightsCardBodyModel = this.body;
        DailyTickMarkPlotModel dailyTickMarkPlotModel = this.graph;
        MenstrualCycleInsightsCardFooterModel menstrualCycleInsightsCardFooterModel = this.footer;
        CardButtonModel cardButtonModel = this.logButton;
        C9598e c9598e = this.destination;
        ImpactModel impactModel = this.trend;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MenstrualCycleInsightsCardModel(title=", str, ", endIcon=", str2, ", body=");
        sbM32001t.append(menstrualCycleInsightsCardBodyModel);
        sbM32001t.append(", graph=");
        sbM32001t.append(dailyTickMarkPlotModel);
        sbM32001t.append(", footer=");
        sbM32001t.append(menstrualCycleInsightsCardFooterModel);
        sbM32001t.append(", logButton=");
        sbM32001t.append(cardButtonModel);
        sbM32001t.append(", destination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", trend=");
        sbM32001t.append(impactModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public MenstrualCycleInsightsCardModel(String title, String endIcon, MenstrualCycleInsightsCardBodyModel body, DailyTickMarkPlotModel graph, MenstrualCycleInsightsCardFooterModel menstrualCycleInsightsCardFooterModel, CardButtonModel cardButtonModel, C9598e c9598e, ImpactModel impactModel) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(endIcon, "endIcon");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(graph, "graph");
        this.title = title;
        this.endIcon = endIcon;
        this.body = body;
        this.graph = graph;
        this.footer = menstrualCycleInsightsCardFooterModel;
        this.logButton = cardButtonModel;
        this.destination = c9598e;
        this.trend = impactModel;
    }

    public /* synthetic */ MenstrualCycleInsightsCardModel(String str, String str2, MenstrualCycleInsightsCardBodyModel menstrualCycleInsightsCardBodyModel, DailyTickMarkPlotModel dailyTickMarkPlotModel, MenstrualCycleInsightsCardFooterModel menstrualCycleInsightsCardFooterModel, CardButtonModel cardButtonModel, C9598e c9598e, ImpactModel impactModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, menstrualCycleInsightsCardBodyModel, dailyTickMarkPlotModel, menstrualCycleInsightsCardFooterModel, cardButtonModel, c9598e, (i13 & 128) != 0 ? null : impactModel);
    }
}
