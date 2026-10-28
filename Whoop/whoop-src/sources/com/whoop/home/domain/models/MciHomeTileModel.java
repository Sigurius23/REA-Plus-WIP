package com.whoop.home.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.CardButtonModel$$serializer;
import com.whoop.design.models.items.DailyTickMarkPlotModel;
import com.whoop.design.models.items.DailyTickMarkPlotModel$$serializer;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc2.C39434a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JD\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010#¨\u00069"}, m65681d2 = {"Lcom/whoop/home/domain/models/MciHomeTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "titleDisplay", "Lcom/whoop/navigation/e;", "destination", "destinationIcon", "Lcom/whoop/design/models/items/DailyTickMarkPlotModel;", "dailyTickMarkPlot", "Lcom/whoop/design/models/items/CardButtonModel;", "logButton", "<init>", "(Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Lcom/whoop/design/models/items/CardButtonModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Lcom/whoop/design/models/items/CardButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$home_release", "(Lcom/whoop/home/domain/models/MciHomeTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/navigation/e;", "component3", "component4", "()Lcom/whoop/design/models/items/DailyTickMarkPlotModel;", "component5", "()Lcom/whoop/design/models/items/CardButtonModel;", "copy", "(Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Lcom/whoop/design/models/items/CardButtonModel;)Lcom/whoop/home/domain/models/MciHomeTileModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitleDisplay", "Lcom/whoop/navigation/e;", "getDestination", "getDestinationIcon", "Lcom/whoop/design/models/items/DailyTickMarkPlotModel;", "getDailyTickMarkPlot", "Lcom/whoop/design/models/items/CardButtonModel;", "getLogButton", "Companion", "$serializer", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MciHomeTileModel implements DesignSystemModel {
    private final DailyTickMarkPlotModel dailyTickMarkPlot;
    private final C9598e destination;
    private final String destinationIcon;
    private final CardButtonModel logButton;
    private final String titleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = (CardButtonModel.$stable | DailyTickMarkPlotModel.$stable) | C9598e.f28134d;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C39434a(21)), null, null, null};

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/home/domain/models/MciHomeTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/home/domain/models/MciHomeTileModel;", "serializer", "()Lwc3/c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MciHomeTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MciHomeTileModel(int i13, String str, C9598e c9598e, String str2, DailyTickMarkPlotModel dailyTickMarkPlotModel, CardButtonModel cardButtonModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, MciHomeTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.titleDisplay = str;
        this.destination = c9598e;
        this.destinationIcon = str2;
        this.dailyTickMarkPlot = dailyTickMarkPlotModel;
        this.logButton = cardButtonModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ MciHomeTileModel copy$default(MciHomeTileModel mciHomeTileModel, String str, C9598e c9598e, String str2, DailyTickMarkPlotModel dailyTickMarkPlotModel, CardButtonModel cardButtonModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = mciHomeTileModel.titleDisplay;
        }
        if ((i13 & 2) != 0) {
            c9598e = mciHomeTileModel.destination;
        }
        if ((i13 & 4) != 0) {
            str2 = mciHomeTileModel.destinationIcon;
        }
        if ((i13 & 8) != 0) {
            dailyTickMarkPlotModel = mciHomeTileModel.dailyTickMarkPlot;
        }
        if ((i13 & 16) != 0) {
            cardButtonModel = mciHomeTileModel.logButton;
        }
        CardButtonModel cardButtonModel2 = cardButtonModel;
        String str3 = str2;
        return mciHomeTileModel.copy(str, c9598e, str3, dailyTickMarkPlotModel, cardButtonModel2);
    }

    public static final /* synthetic */ void write$Self$home_release(MciHomeTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.titleDisplay);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.destination);
        output.encodeStringElement(serialDesc, 2, self.destinationIcon);
        output.encodeSerializableElement(serialDesc, 3, DailyTickMarkPlotModel$$serializer.INSTANCE, self.dailyTickMarkPlot);
        output.encodeNullableSerializableElement(serialDesc, 4, CardButtonModel$$serializer.INSTANCE, self.logButton);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDestinationIcon() {
        return this.destinationIcon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DailyTickMarkPlotModel getDailyTickMarkPlot() {
        return this.dailyTickMarkPlot;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CardButtonModel getLogButton() {
        return this.logButton;
    }

    public final MciHomeTileModel copy(String titleDisplay, C9598e destination, String destinationIcon, DailyTickMarkPlotModel dailyTickMarkPlot, CardButtonModel logButton) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(destination, "destination");
        AbstractC22676k.m65750j(destinationIcon, "destinationIcon");
        AbstractC22676k.m65750j(dailyTickMarkPlot, "dailyTickMarkPlot");
        return new MciHomeTileModel(titleDisplay, destination, destinationIcon, dailyTickMarkPlot, logButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MciHomeTileModel)) {
            return false;
        }
        MciHomeTileModel mciHomeTileModel = (MciHomeTileModel) other;
        return AbstractC22676k.m65745e(this.titleDisplay, mciHomeTileModel.titleDisplay) && AbstractC22676k.m65745e(this.destination, mciHomeTileModel.destination) && AbstractC22676k.m65745e(this.destinationIcon, mciHomeTileModel.destinationIcon) && AbstractC22676k.m65745e(this.dailyTickMarkPlot, mciHomeTileModel.dailyTickMarkPlot) && AbstractC22676k.m65745e(this.logButton, mciHomeTileModel.logButton);
    }

    public final DailyTickMarkPlotModel getDailyTickMarkPlot() {
        return this.dailyTickMarkPlot;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getDestinationIcon() {
        return this.destinationIcon;
    }

    public final CardButtonModel getLogButton() {
        return this.logButton;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        int iHashCode = (this.dailyTickMarkPlot.hashCode() + AbstractC11266d.m30450d(AbstractC36095b.m114673a(this.destination, this.titleDisplay.hashCode() * 31, 31), 31, this.destinationIcon)) * 31;
        CardButtonModel cardButtonModel = this.logButton;
        return iHashCode + (cardButtonModel == null ? 0 : cardButtonModel.hashCode());
    }

    public String toString() {
        return "MciHomeTileModel(titleDisplay=" + this.titleDisplay + ", destination=" + this.destination + ", destinationIcon=" + this.destinationIcon + ", dailyTickMarkPlot=" + this.dailyTickMarkPlot + ", logButton=" + this.logButton + ")";
    }

    public MciHomeTileModel(String titleDisplay, C9598e destination, String destinationIcon, DailyTickMarkPlotModel dailyTickMarkPlot, CardButtonModel cardButtonModel) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(destination, "destination");
        AbstractC22676k.m65750j(destinationIcon, "destinationIcon");
        AbstractC22676k.m65750j(dailyTickMarkPlot, "dailyTickMarkPlot");
        this.titleDisplay = titleDisplay;
        this.destination = destination;
        this.destinationIcon = destinationIcon;
        this.dailyTickMarkPlot = dailyTickMarkPlot;
        this.logButton = cardButtonModel;
    }
}
