package com.whoop.hormonalinsights.menstrualcycleinsights.domain.models;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.AnalyticEventModel$$serializer;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import qo1.C30526a;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ<\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001f¨\u00062"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;", "", "", "buttonTitle", "buttonIcon", "Lcom/whoop/navigation/e;", "buttonDestination", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/analytics/AnalyticEventModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/analytics/AnalyticEventModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/navigation/e;", "component4", "()Lcom/whoop/analytics/AnalyticEventModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/analytics/AnalyticEventModel;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getButtonTitle", "getButtonIcon", "Lcom/whoop/navigation/e;", "getButtonDestination", "Lcom/whoop/analytics/AnalyticEventModel;", "getAnalyticEvent", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CyclePatternButtonModel {
    private final AnalyticEventModel analyticEvent;
    private final C9598e buttonDestination;
    private final String buttonIcon;
    private final String buttonTitle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C30526a(10)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternButtonModel;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CyclePatternButtonModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CyclePatternButtonModel(int i13, String str, String str2, C9598e c9598e, AnalyticEventModel analyticEventModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, CyclePatternButtonModel$$serializer.INSTANCE.getDescriptor());
        }
        this.buttonTitle = str;
        this.buttonIcon = str2;
        this.buttonDestination = c9598e;
        this.analyticEvent = analyticEventModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ CyclePatternButtonModel copy$default(CyclePatternButtonModel cyclePatternButtonModel, String str, String str2, C9598e c9598e, AnalyticEventModel analyticEventModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = cyclePatternButtonModel.buttonTitle;
        }
        if ((i13 & 2) != 0) {
            str2 = cyclePatternButtonModel.buttonIcon;
        }
        if ((i13 & 4) != 0) {
            c9598e = cyclePatternButtonModel.buttonDestination;
        }
        if ((i13 & 8) != 0) {
            analyticEventModel = cyclePatternButtonModel.analyticEvent;
        }
        return cyclePatternButtonModel.copy(str, str2, c9598e, analyticEventModel);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(CyclePatternButtonModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.buttonTitle);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.buttonIcon);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.buttonDestination);
        output.encodeNullableSerializableElement(serialDesc, 3, AnalyticEventModel$$serializer.INSTANCE, self.analyticEvent);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getButtonIcon() {
        return this.buttonIcon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final C9598e getButtonDestination() {
        return this.buttonDestination;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    public final CyclePatternButtonModel copy(String buttonTitle, String buttonIcon, C9598e buttonDestination, AnalyticEventModel analyticEvent) {
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        AbstractC22676k.m65750j(buttonDestination, "buttonDestination");
        return new CyclePatternButtonModel(buttonTitle, buttonIcon, buttonDestination, analyticEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CyclePatternButtonModel)) {
            return false;
        }
        CyclePatternButtonModel cyclePatternButtonModel = (CyclePatternButtonModel) other;
        return AbstractC22676k.m65745e(this.buttonTitle, cyclePatternButtonModel.buttonTitle) && AbstractC22676k.m65745e(this.buttonIcon, cyclePatternButtonModel.buttonIcon) && AbstractC22676k.m65745e(this.buttonDestination, cyclePatternButtonModel.buttonDestination) && AbstractC22676k.m65745e(this.analyticEvent, cyclePatternButtonModel.analyticEvent);
    }

    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    public final C9598e getButtonDestination() {
        return this.buttonDestination;
    }

    public final String getButtonIcon() {
        return this.buttonIcon;
    }

    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public int hashCode() {
        int iHashCode = this.buttonTitle.hashCode() * 31;
        String str = this.buttonIcon;
        int iM114673a = AbstractC36095b.m114673a(this.buttonDestination, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        return iM114673a + (analyticEventModel != null ? analyticEventModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.buttonTitle;
        String str2 = this.buttonIcon;
        C9598e c9598e = this.buttonDestination;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CyclePatternButtonModel(buttonTitle=", str, ", buttonIcon=", str2, ", buttonDestination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", analyticEvent=");
        sbM32001t.append(analyticEventModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public CyclePatternButtonModel(String buttonTitle, String str, C9598e buttonDestination, AnalyticEventModel analyticEventModel) {
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        AbstractC22676k.m65750j(buttonDestination, "buttonDestination");
        this.buttonTitle = buttonTitle;
        this.buttonIcon = str;
        this.buttonDestination = buttonDestination;
        this.analyticEvent = analyticEventModel;
    }
}
