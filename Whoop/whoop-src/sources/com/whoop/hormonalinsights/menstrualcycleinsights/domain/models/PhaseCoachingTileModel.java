package com.whoop.hormonalinsights.menstrualcycleinsights.domain.models;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.AnalyticEventModel$$serializer;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
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
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import qo1.C30527b;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB]\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&JV\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001eJ\u0010\u0010*\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b4\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b:\u0010&¨\u0006="}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "titleDisplay", "subtitleDisplay", "imageUrl", "", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualPhaseStateSection;", "stats", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/analytics/AnalyticEventModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/analytics/AnalyticEventModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Lcom/whoop/navigation/e;", "component6", "()Lcom/whoop/analytics/AnalyticEventModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/e;Lcom/whoop/analytics/AnalyticEventModel;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingTileModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitleDisplay", "getSubtitleDisplay", "getImageUrl", "Ljava/util/List;", "getStats", "Lcom/whoop/navigation/e;", "getDestination", "Lcom/whoop/analytics/AnalyticEventModel;", "getAnalyticEvent", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PhaseCoachingTileModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final AnalyticEventModel analyticEvent;
    private final C9598e destination;
    private final String imageUrl;
    private final List<MenstrualPhaseStateSection> stats;
    private final String subtitleDisplay;
    private final String titleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingTileModel;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PhaseCoachingTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C30527b(1)), AbstractC30060g.m92087G(enumC23463i, new C30527b(2)), null};
    }

    public /* synthetic */ PhaseCoachingTileModel(int i13, String str, String str2, String str3, List list, C9598e c9598e, AnalyticEventModel analyticEventModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, PhaseCoachingTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.titleDisplay = str;
        this.subtitleDisplay = str2;
        this.imageUrl = str3;
        this.stats = list;
        this.destination = c9598e;
        this.analyticEvent = analyticEventModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(MenstrualPhaseStateSection$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhaseCoachingTileModel copy$default(PhaseCoachingTileModel phaseCoachingTileModel, String str, String str2, String str3, List list, C9598e c9598e, AnalyticEventModel analyticEventModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = phaseCoachingTileModel.titleDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = phaseCoachingTileModel.subtitleDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = phaseCoachingTileModel.imageUrl;
        }
        if ((i13 & 8) != 0) {
            list = phaseCoachingTileModel.stats;
        }
        if ((i13 & 16) != 0) {
            c9598e = phaseCoachingTileModel.destination;
        }
        if ((i13 & 32) != 0) {
            analyticEventModel = phaseCoachingTileModel.analyticEvent;
        }
        C9598e c9598e2 = c9598e;
        AnalyticEventModel analyticEventModel2 = analyticEventModel;
        return phaseCoachingTileModel.copy(str, str2, str3, list, c9598e2, analyticEventModel2);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(PhaseCoachingTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.titleDisplay);
        output.encodeStringElement(serialDesc, 1, self.subtitleDisplay);
        output.encodeStringElement(serialDesc, 2, self.imageUrl);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.stats);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.destination);
        output.encodeNullableSerializableElement(serialDesc, 5, AnalyticEventModel$$serializer.INSTANCE, self.analyticEvent);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final List<MenstrualPhaseStateSection> component4() {
        return this.stats;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    public final PhaseCoachingTileModel copy(String titleDisplay, String subtitleDisplay, String imageUrl, List<MenstrualPhaseStateSection> stats, C9598e destination, AnalyticEventModel analyticEvent) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(subtitleDisplay, "subtitleDisplay");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(stats, "stats");
        return new PhaseCoachingTileModel(titleDisplay, subtitleDisplay, imageUrl, stats, destination, analyticEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhaseCoachingTileModel)) {
            return false;
        }
        PhaseCoachingTileModel phaseCoachingTileModel = (PhaseCoachingTileModel) other;
        return AbstractC22676k.m65745e(this.titleDisplay, phaseCoachingTileModel.titleDisplay) && AbstractC22676k.m65745e(this.subtitleDisplay, phaseCoachingTileModel.subtitleDisplay) && AbstractC22676k.m65745e(this.imageUrl, phaseCoachingTileModel.imageUrl) && AbstractC22676k.m65745e(this.stats, phaseCoachingTileModel.stats) && AbstractC22676k.m65745e(this.destination, phaseCoachingTileModel.destination) && AbstractC22676k.m65745e(this.analyticEvent, phaseCoachingTileModel.analyticEvent);
    }

    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final List<MenstrualPhaseStateSection> getStats() {
        return this.stats;
    }

    public final String getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.titleDisplay.hashCode() * 31, 31, this.subtitleDisplay), 31, this.imageUrl), 31, this.stats);
        C9598e c9598e = this.destination;
        int iHashCode = (iM31983b + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        return iHashCode + (analyticEventModel != null ? analyticEventModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.titleDisplay;
        String str2 = this.subtitleDisplay;
        String str3 = this.imageUrl;
        List<MenstrualPhaseStateSection> list = this.stats;
        C9598e c9598e = this.destination;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PhaseCoachingTileModel(titleDisplay=", str, ", subtitleDisplay=", str2, ", imageUrl=");
        AbstractC36095b.m114694v(str3, ", stats=", ", destination=", sbM32001t, list);
        sbM32001t.append(c9598e);
        sbM32001t.append(", analyticEvent=");
        sbM32001t.append(analyticEventModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public PhaseCoachingTileModel(String titleDisplay, String subtitleDisplay, String imageUrl, List<MenstrualPhaseStateSection> stats, C9598e c9598e, AnalyticEventModel analyticEventModel) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(subtitleDisplay, "subtitleDisplay");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(stats, "stats");
        this.titleDisplay = titleDisplay;
        this.subtitleDisplay = subtitleDisplay;
        this.imageUrl = imageUrl;
        this.stats = stats;
        this.destination = c9598e;
        this.analyticEvent = analyticEventModel;
    }
}
