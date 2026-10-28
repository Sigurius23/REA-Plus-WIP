package com.whoop.advancedlabs.domain.models;

import androidx.core.app.FrameMetricsAggregator;
import com.whoop.design.models.AppointmentButtonModel;
import com.whoop.design.models.AppointmentButtonModel$$serializer;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.InfoCalloutTileModel$$serializer;
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
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import tb0.C33690a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BABW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B{\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010 J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010 J\u0012\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b)\u0010*Jr\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010 J\u0010\u0010.\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b7\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b8\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b9\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b:\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b<\u0010&R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b=\u0010 R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b>\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\b@\u0010*¨\u0006C"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "siteCode", "titleDisplay", "subtitleDisplay", "distanceDisplay", "distanceIcon", "", "Lcom/whoop/design/models/AppointmentButtonModel;", "appointmentButtons", "collapsedTextDisplay", "expandedTextDisplay", "Lcom/whoop/design/models/InfoCalloutTileModel;", "infoCallout", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "component8", "component9", "()Lcom/whoop/design/models/InfoCalloutTileModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;)Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSiteCode", "getTitleDisplay", "getSubtitleDisplay", "getDistanceDisplay", "getDistanceIcon", "Ljava/util/List;", "getAppointmentButtons", "getCollapsedTextDisplay", "getExpandedTextDisplay", "Lcom/whoop/design/models/InfoCalloutTileModel;", "getInfoCallout", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SchedulingTileModel implements DesignSystemModel {
    private final List<AppointmentButtonModel> appointmentButtons;
    private final String collapsedTextDisplay;
    private final String distanceDisplay;
    private final String distanceIcon;
    private final String expandedTextDisplay;
    private final InfoCalloutTileModel infoCallout;
    private final String siteCode;
    private final String subtitleDisplay;
    private final String titleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C33690a(28)), null, null, null};

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SchedulingTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SchedulingTileModel(int i13, String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, InfoCalloutTileModel infoCalloutTileModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, SchedulingTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.siteCode = str;
        this.titleDisplay = str2;
        this.subtitleDisplay = str3;
        this.distanceDisplay = str4;
        this.distanceIcon = str5;
        this.appointmentButtons = list;
        this.collapsedTextDisplay = str6;
        this.expandedTextDisplay = str7;
        this.infoCallout = infoCalloutTileModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(AppointmentButtonModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SchedulingTileModel copy$default(SchedulingTileModel schedulingTileModel, String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, InfoCalloutTileModel infoCalloutTileModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = schedulingTileModel.siteCode;
        }
        if ((i13 & 2) != 0) {
            str2 = schedulingTileModel.titleDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = schedulingTileModel.subtitleDisplay;
        }
        if ((i13 & 8) != 0) {
            str4 = schedulingTileModel.distanceDisplay;
        }
        if ((i13 & 16) != 0) {
            str5 = schedulingTileModel.distanceIcon;
        }
        if ((i13 & 32) != 0) {
            list = schedulingTileModel.appointmentButtons;
        }
        if ((i13 & 64) != 0) {
            str6 = schedulingTileModel.collapsedTextDisplay;
        }
        if ((i13 & 128) != 0) {
            str7 = schedulingTileModel.expandedTextDisplay;
        }
        if ((i13 & 256) != 0) {
            infoCalloutTileModel = schedulingTileModel.infoCallout;
        }
        String str8 = str7;
        InfoCalloutTileModel infoCalloutTileModel2 = infoCalloutTileModel;
        List list2 = list;
        String str9 = str6;
        String str10 = str5;
        String str11 = str3;
        return schedulingTileModel.copy(str, str2, str11, str4, str10, list2, str9, str8, infoCalloutTileModel2);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(SchedulingTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.siteCode);
        output.encodeStringElement(serialDesc, 1, self.titleDisplay);
        output.encodeStringElement(serialDesc, 2, self.subtitleDisplay);
        output.encodeStringElement(serialDesc, 3, self.distanceDisplay);
        output.encodeStringElement(serialDesc, 4, self.distanceIcon);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.appointmentButtons);
        output.encodeStringElement(serialDesc, 6, self.collapsedTextDisplay);
        output.encodeStringElement(serialDesc, 7, self.expandedTextDisplay);
        output.encodeNullableSerializableElement(serialDesc, 8, InfoCalloutTileModel$$serializer.INSTANCE, self.infoCallout);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSiteCode() {
        return this.siteCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDistanceDisplay() {
        return this.distanceDisplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDistanceIcon() {
        return this.distanceIcon;
    }

    public final List<AppointmentButtonModel> component6() {
        return this.appointmentButtons;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCollapsedTextDisplay() {
        return this.collapsedTextDisplay;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getExpandedTextDisplay() {
        return this.expandedTextDisplay;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final InfoCalloutTileModel getInfoCallout() {
        return this.infoCallout;
    }

    public final SchedulingTileModel copy(String siteCode, String titleDisplay, String subtitleDisplay, String distanceDisplay, String distanceIcon, List<AppointmentButtonModel> appointmentButtons, String collapsedTextDisplay, String expandedTextDisplay, InfoCalloutTileModel infoCallout) {
        AbstractC22676k.m65750j(siteCode, "siteCode");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(subtitleDisplay, "subtitleDisplay");
        AbstractC22676k.m65750j(distanceDisplay, "distanceDisplay");
        AbstractC22676k.m65750j(distanceIcon, "distanceIcon");
        AbstractC22676k.m65750j(appointmentButtons, "appointmentButtons");
        AbstractC22676k.m65750j(collapsedTextDisplay, "collapsedTextDisplay");
        AbstractC22676k.m65750j(expandedTextDisplay, "expandedTextDisplay");
        return new SchedulingTileModel(siteCode, titleDisplay, subtitleDisplay, distanceDisplay, distanceIcon, appointmentButtons, collapsedTextDisplay, expandedTextDisplay, infoCallout);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SchedulingTileModel)) {
            return false;
        }
        SchedulingTileModel schedulingTileModel = (SchedulingTileModel) other;
        return AbstractC22676k.m65745e(this.siteCode, schedulingTileModel.siteCode) && AbstractC22676k.m65745e(this.titleDisplay, schedulingTileModel.titleDisplay) && AbstractC22676k.m65745e(this.subtitleDisplay, schedulingTileModel.subtitleDisplay) && AbstractC22676k.m65745e(this.distanceDisplay, schedulingTileModel.distanceDisplay) && AbstractC22676k.m65745e(this.distanceIcon, schedulingTileModel.distanceIcon) && AbstractC22676k.m65745e(this.appointmentButtons, schedulingTileModel.appointmentButtons) && AbstractC22676k.m65745e(this.collapsedTextDisplay, schedulingTileModel.collapsedTextDisplay) && AbstractC22676k.m65745e(this.expandedTextDisplay, schedulingTileModel.expandedTextDisplay) && AbstractC22676k.m65745e(this.infoCallout, schedulingTileModel.infoCallout);
    }

    public final List<AppointmentButtonModel> getAppointmentButtons() {
        return this.appointmentButtons;
    }

    public final String getCollapsedTextDisplay() {
        return this.collapsedTextDisplay;
    }

    public final String getDistanceDisplay() {
        return this.distanceDisplay;
    }

    public final String getDistanceIcon() {
        return this.distanceIcon;
    }

    public final String getExpandedTextDisplay() {
        return this.expandedTextDisplay;
    }

    public final InfoCalloutTileModel getInfoCallout() {
        return this.infoCallout;
    }

    public final String getSiteCode() {
        return this.siteCode;
    }

    public final String getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.siteCode.hashCode() * 31, 31, this.titleDisplay), 31, this.subtitleDisplay), 31, this.distanceDisplay), 31, this.distanceIcon), 31, this.appointmentButtons), 31, this.collapsedTextDisplay), 31, this.expandedTextDisplay);
        InfoCalloutTileModel infoCalloutTileModel = this.infoCallout;
        return iM30450d + (infoCalloutTileModel == null ? 0 : infoCalloutTileModel.hashCode());
    }

    public String toString() {
        String str = this.siteCode;
        String str2 = this.titleDisplay;
        String str3 = this.subtitleDisplay;
        String str4 = this.distanceDisplay;
        String str5 = this.distanceIcon;
        List<AppointmentButtonModel> list = this.appointmentButtons;
        String str6 = this.collapsedTextDisplay;
        String str7 = this.expandedTextDisplay;
        InfoCalloutTileModel infoCalloutTileModel = this.infoCallout;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SchedulingTileModel(siteCode=", str, ", titleDisplay=", str2, ", subtitleDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", distanceDisplay=", str4, ", distanceIcon=");
        AbstractC36095b.m114694v(str5, ", appointmentButtons=", ", collapsedTextDisplay=", sbM32001t, list);
        AbstractC11266d.m30444B(sbM32001t, str6, ", expandedTextDisplay=", str7, ", infoCallout=");
        sbM32001t.append(infoCalloutTileModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public SchedulingTileModel(String siteCode, String titleDisplay, String subtitleDisplay, String distanceDisplay, String distanceIcon, List<AppointmentButtonModel> appointmentButtons, String collapsedTextDisplay, String expandedTextDisplay, InfoCalloutTileModel infoCalloutTileModel) {
        AbstractC22676k.m65750j(siteCode, "siteCode");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(subtitleDisplay, "subtitleDisplay");
        AbstractC22676k.m65750j(distanceDisplay, "distanceDisplay");
        AbstractC22676k.m65750j(distanceIcon, "distanceIcon");
        AbstractC22676k.m65750j(appointmentButtons, "appointmentButtons");
        AbstractC22676k.m65750j(collapsedTextDisplay, "collapsedTextDisplay");
        AbstractC22676k.m65750j(expandedTextDisplay, "expandedTextDisplay");
        this.siteCode = siteCode;
        this.titleDisplay = titleDisplay;
        this.subtitleDisplay = subtitleDisplay;
        this.distanceDisplay = distanceDisplay;
        this.distanceIcon = distanceIcon;
        this.appointmentButtons = appointmentButtons;
        this.collapsedTextDisplay = collapsedTextDisplay;
        this.expandedTextDisplay = expandedTextDisplay;
        this.infoCallout = infoCalloutTileModel;
    }
}
