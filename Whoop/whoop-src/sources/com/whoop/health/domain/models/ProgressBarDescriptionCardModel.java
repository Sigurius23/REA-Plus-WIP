package com.whoop.health.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.PregnancyTilePlot;
import com.whoop.design.models.items.PregnancyTilePlot$$serializer;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import sh2.C32513d;
import te0.AbstractC33745d;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JH\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010#¨\u00069"}, m65681d2 = {"Lcom/whoop/health/domain/models/ProgressBarDescriptionCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "endIcon", "Lcom/whoop/health/domain/models/ProgressPlotDescription;", "body", "Lcom/whoop/design/models/items/PregnancyTilePlot;", "plot", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/health/domain/models/ProgressPlotDescription;Lcom/whoop/design/models/items/PregnancyTilePlot;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/health/domain/models/ProgressPlotDescription;Lcom/whoop/design/models/items/PregnancyTilePlot;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$health_release", "(Lcom/whoop/health/domain/models/ProgressBarDescriptionCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/health/domain/models/ProgressPlotDescription;", "component4", "()Lcom/whoop/design/models/items/PregnancyTilePlot;", "component5", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/health/domain/models/ProgressPlotDescription;Lcom/whoop/design/models/items/PregnancyTilePlot;Lcom/whoop/navigation/e;)Lcom/whoop/health/domain/models/ProgressBarDescriptionCardModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getEndIcon", "Lcom/whoop/health/domain/models/ProgressPlotDescription;", "getBody", "Lcom/whoop/design/models/items/PregnancyTilePlot;", "getPlot", "Lcom/whoop/navigation/e;", "getDestination", "Companion", "$serializer", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProgressBarDescriptionCardModel implements DesignSystemModel {
    private final ProgressPlotDescription body;
    private final C9598e destination;
    private final String endIcon;
    private final PregnancyTilePlot plot;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d | PregnancyTilePlot.$stable;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C32513d(12))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/health/domain/models/ProgressBarDescriptionCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/health/domain/models/ProgressBarDescriptionCardModel;", "serializer", "()Lwc3/c;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ProgressBarDescriptionCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ProgressBarDescriptionCardModel(int i13, String str, String str2, ProgressPlotDescription progressPlotDescription, PregnancyTilePlot pregnancyTilePlot, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, ProgressBarDescriptionCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.endIcon = str2;
        this.body = progressPlotDescription;
        this.plot = pregnancyTilePlot;
        this.destination = c9598e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ ProgressBarDescriptionCardModel copy$default(ProgressBarDescriptionCardModel progressBarDescriptionCardModel, String str, String str2, ProgressPlotDescription progressPlotDescription, PregnancyTilePlot pregnancyTilePlot, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = progressBarDescriptionCardModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = progressBarDescriptionCardModel.endIcon;
        }
        if ((i13 & 4) != 0) {
            progressPlotDescription = progressBarDescriptionCardModel.body;
        }
        if ((i13 & 8) != 0) {
            pregnancyTilePlot = progressBarDescriptionCardModel.plot;
        }
        if ((i13 & 16) != 0) {
            c9598e = progressBarDescriptionCardModel.destination;
        }
        C9598e c9598e2 = c9598e;
        ProgressPlotDescription progressPlotDescription2 = progressPlotDescription;
        return progressBarDescriptionCardModel.copy(str, str2, progressPlotDescription2, pregnancyTilePlot, c9598e2);
    }

    public static final /* synthetic */ void write$Self$health_release(ProgressBarDescriptionCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.endIcon);
        output.encodeSerializableElement(serialDesc, 2, ProgressPlotDescription$$serializer.INSTANCE, self.body);
        output.encodeNullableSerializableElement(serialDesc, 3, PregnancyTilePlot$$serializer.INSTANCE, self.plot);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.destination);
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
    public final ProgressPlotDescription getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PregnancyTilePlot getPlot() {
        return this.plot;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final ProgressBarDescriptionCardModel copy(String title, String endIcon, ProgressPlotDescription body, PregnancyTilePlot plot, C9598e destination) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        return new ProgressBarDescriptionCardModel(title, endIcon, body, plot, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressBarDescriptionCardModel)) {
            return false;
        }
        ProgressBarDescriptionCardModel progressBarDescriptionCardModel = (ProgressBarDescriptionCardModel) other;
        return AbstractC22676k.m65745e(this.title, progressBarDescriptionCardModel.title) && AbstractC22676k.m65745e(this.endIcon, progressBarDescriptionCardModel.endIcon) && AbstractC22676k.m65745e(this.body, progressBarDescriptionCardModel.body) && AbstractC22676k.m65745e(this.plot, progressBarDescriptionCardModel.plot) && AbstractC22676k.m65745e(this.destination, progressBarDescriptionCardModel.destination);
    }

    public final ProgressPlotDescription getBody() {
        return this.body;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getEndIcon() {
        return this.endIcon;
    }

    public final PregnancyTilePlot getPlot() {
        return this.plot;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.endIcon;
        int iHashCode2 = (this.body.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        PregnancyTilePlot pregnancyTilePlot = this.plot;
        int iHashCode3 = (iHashCode2 + (pregnancyTilePlot == null ? 0 : pregnancyTilePlot.hashCode())) * 31;
        C9598e c9598e = this.destination;
        return iHashCode3 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.endIcon;
        ProgressPlotDescription progressPlotDescription = this.body;
        PregnancyTilePlot pregnancyTilePlot = this.plot;
        C9598e c9598e = this.destination;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ProgressBarDescriptionCardModel(title=", str, ", endIcon=", str2, ", body=");
        sbM32001t.append(progressPlotDescription);
        sbM32001t.append(", plot=");
        sbM32001t.append(pregnancyTilePlot);
        sbM32001t.append(", destination=");
        return AbstractC33745d.m106656o(sbM32001t, c9598e, ")");
    }

    public ProgressBarDescriptionCardModel(String title, String str, ProgressPlotDescription body, PregnancyTilePlot pregnancyTilePlot, C9598e c9598e) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        this.title = title;
        this.endIcon = str;
        this.body = body;
        this.plot = pregnancyTilePlot;
        this.destination = c9598e;
    }
}
