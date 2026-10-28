package com.whoop.design.models.items;

import androidx.core.app.FrameMetricsAggregator;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
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
import te0.AbstractC33745d;
import w91.C36963j;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CBBc\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBu\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 Jl\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0016J\u0010\u0010$\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*J'\u00103\u001a\u0002002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0001¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b7\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b8\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b9\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b:\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b;\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010\u001eR\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010>\u0012\u0004\b@\u0010A\u001a\u0004\b?\u0010 ¨\u0006D"}, m65681d2 = {"Lcom/whoop/design/models/items/SleepPlannerCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "bedtimeValue", "bedtimeLabel", "timeInBedValue", "timeInBedLabel", "waketimeValue", "waketimeLabel", "Lcom/whoop/design/models/items/CoachingTileModel;", "alarmStatus", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CoachingTileModel;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CoachingTileModel;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Lcom/whoop/design/models/items/CoachingTileModel;", "component9", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CoachingTileModel;Lcom/whoop/navigation/e;)Lcom/whoop/design/models/items/SleepPlannerCardModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/SleepPlannerCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getBedtimeValue", "getBedtimeLabel", "getTimeInBedValue", "getTimeInBedLabel", "getWaketimeValue", "getWaketimeLabel", "Lcom/whoop/design/models/items/CoachingTileModel;", "getAlarmStatus", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "()V", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SleepPlannerCardModel implements DesignSystemModel {
    private final CoachingTileModel alarmStatus;
    private final String bedtimeLabel;
    private final String bedtimeValue;
    private final C9598e destination;
    private final String timeInBedLabel;
    private final String timeInBedValue;
    private final String title;
    private final String waketimeLabel;
    private final String waketimeValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36963j(17))};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/SleepPlannerCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/SleepPlannerCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SleepPlannerCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SleepPlannerCardModel() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (CoachingTileModel) null, (C9598e) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ SleepPlannerCardModel copy$default(SleepPlannerCardModel sleepPlannerCardModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, CoachingTileModel coachingTileModel, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sleepPlannerCardModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = sleepPlannerCardModel.bedtimeValue;
        }
        if ((i13 & 4) != 0) {
            str3 = sleepPlannerCardModel.bedtimeLabel;
        }
        if ((i13 & 8) != 0) {
            str4 = sleepPlannerCardModel.timeInBedValue;
        }
        if ((i13 & 16) != 0) {
            str5 = sleepPlannerCardModel.timeInBedLabel;
        }
        if ((i13 & 32) != 0) {
            str6 = sleepPlannerCardModel.waketimeValue;
        }
        if ((i13 & 64) != 0) {
            str7 = sleepPlannerCardModel.waketimeLabel;
        }
        if ((i13 & 128) != 0) {
            coachingTileModel = sleepPlannerCardModel.alarmStatus;
        }
        if ((i13 & 256) != 0) {
            c9598e = sleepPlannerCardModel.destination;
        }
        CoachingTileModel coachingTileModel2 = coachingTileModel;
        C9598e c9598e2 = c9598e;
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return sleepPlannerCardModel.copy(str, str2, str11, str4, str10, str8, str9, coachingTileModel2, c9598e2);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00b6  */
    public static final /* synthetic */ void write$Self$design_models_release(SleepPlannerCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.title, "")) {
            output.encodeStringElement(serialDesc, 0, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.bedtimeValue, "")) {
            output.encodeStringElement(serialDesc, 1, self.bedtimeValue);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.bedtimeLabel, "")) {
            output.encodeStringElement(serialDesc, 2, self.bedtimeLabel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.timeInBedValue, "")) {
            output.encodeStringElement(serialDesc, 3, self.timeInBedValue);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.timeInBedLabel, "")) {
            output.encodeStringElement(serialDesc, 4, self.timeInBedLabel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !AbstractC22676k.m65745e(self.waketimeValue, "")) {
            output.encodeStringElement(serialDesc, 5, self.waketimeValue);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !AbstractC22676k.m65745e(self.waketimeLabel, "")) {
            output.encodeStringElement(serialDesc, 6, self.waketimeLabel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7)) {
            output.encodeSerializableElement(serialDesc, 7, CoachingTileModel$$serializer.INSTANCE, self.alarmStatus);
        } else {
            if (!AbstractC22676k.m65745e(self.alarmStatus, new CoachingTileModel((String) null, (String) null, (String) null, (String) null, (String) null, (C9598e) null, (AlarmStatus) null, 127, (DefaultConstructorMarker) null))) {
                output.encodeSerializableElement(serialDesc, 7, CoachingTileModel$$serializer.INSTANCE, self.alarmStatus);
            }
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.destination == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBedtimeValue() {
        return this.bedtimeValue;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBedtimeLabel() {
        return this.bedtimeLabel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTimeInBedValue() {
        return this.timeInBedValue;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTimeInBedLabel() {
        return this.timeInBedLabel;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getWaketimeValue() {
        return this.waketimeValue;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getWaketimeLabel() {
        return this.waketimeLabel;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final CoachingTileModel getAlarmStatus() {
        return this.alarmStatus;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final SleepPlannerCardModel copy(String title, String bedtimeValue, String bedtimeLabel, String timeInBedValue, String timeInBedLabel, String waketimeValue, String waketimeLabel, CoachingTileModel alarmStatus, C9598e destination) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(bedtimeValue, "bedtimeValue");
        AbstractC22676k.m65750j(bedtimeLabel, "bedtimeLabel");
        AbstractC22676k.m65750j(timeInBedValue, "timeInBedValue");
        AbstractC22676k.m65750j(timeInBedLabel, "timeInBedLabel");
        AbstractC22676k.m65750j(waketimeValue, "waketimeValue");
        AbstractC22676k.m65750j(waketimeLabel, "waketimeLabel");
        AbstractC22676k.m65750j(alarmStatus, "alarmStatus");
        return new SleepPlannerCardModel(title, bedtimeValue, bedtimeLabel, timeInBedValue, timeInBedLabel, waketimeValue, waketimeLabel, alarmStatus, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepPlannerCardModel)) {
            return false;
        }
        SleepPlannerCardModel sleepPlannerCardModel = (SleepPlannerCardModel) other;
        return AbstractC22676k.m65745e(this.title, sleepPlannerCardModel.title) && AbstractC22676k.m65745e(this.bedtimeValue, sleepPlannerCardModel.bedtimeValue) && AbstractC22676k.m65745e(this.bedtimeLabel, sleepPlannerCardModel.bedtimeLabel) && AbstractC22676k.m65745e(this.timeInBedValue, sleepPlannerCardModel.timeInBedValue) && AbstractC22676k.m65745e(this.timeInBedLabel, sleepPlannerCardModel.timeInBedLabel) && AbstractC22676k.m65745e(this.waketimeValue, sleepPlannerCardModel.waketimeValue) && AbstractC22676k.m65745e(this.waketimeLabel, sleepPlannerCardModel.waketimeLabel) && AbstractC22676k.m65745e(this.alarmStatus, sleepPlannerCardModel.alarmStatus) && AbstractC22676k.m65745e(this.destination, sleepPlannerCardModel.destination);
    }

    public final CoachingTileModel getAlarmStatus() {
        return this.alarmStatus;
    }

    public final String getBedtimeLabel() {
        return this.bedtimeLabel;
    }

    public final String getBedtimeValue() {
        return this.bedtimeValue;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getTimeInBedLabel() {
        return this.timeInBedLabel;
    }

    public final String getTimeInBedValue() {
        return this.timeInBedValue;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getWaketimeLabel() {
        return this.waketimeLabel;
    }

    public final String getWaketimeValue() {
        return this.waketimeValue;
    }

    public int hashCode() {
        int iHashCode = (this.alarmStatus.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.bedtimeValue), 31, this.bedtimeLabel), 31, this.timeInBedValue), 31, this.timeInBedLabel), 31, this.waketimeValue), 31, this.waketimeLabel)) * 31;
        C9598e c9598e = this.destination;
        return iHashCode + (c9598e == null ? 0 : c9598e.hashCode());
    }

    public String toString() {
        String str = this.title;
        String str2 = this.bedtimeValue;
        String str3 = this.bedtimeLabel;
        String str4 = this.timeInBedValue;
        String str5 = this.timeInBedLabel;
        String str6 = this.waketimeValue;
        String str7 = this.waketimeLabel;
        CoachingTileModel coachingTileModel = this.alarmStatus;
        C9598e c9598e = this.destination;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SleepPlannerCardModel(title=", str, ", bedtimeValue=", str2, ", bedtimeLabel=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", timeInBedValue=", str4, ", timeInBedLabel=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", waketimeValue=", str6, ", waketimeLabel=");
        sbM32001t.append(str7);
        sbM32001t.append(", alarmStatus=");
        sbM32001t.append(coachingTileModel);
        sbM32001t.append(", destination=");
        return AbstractC33745d.m106656o(sbM32001t, c9598e, ")");
    }

    public /* synthetic */ SleepPlannerCardModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, CoachingTileModel coachingTileModel, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i13 & 2) == 0) {
            this.bedtimeValue = "";
        } else {
            this.bedtimeValue = str2;
        }
        if ((i13 & 4) == 0) {
            this.bedtimeLabel = "";
        } else {
            this.bedtimeLabel = str3;
        }
        if ((i13 & 8) == 0) {
            this.timeInBedValue = "";
        } else {
            this.timeInBedValue = str4;
        }
        if ((i13 & 16) == 0) {
            this.timeInBedLabel = "";
        } else {
            this.timeInBedLabel = str5;
        }
        if ((i13 & 32) == 0) {
            this.waketimeValue = "";
        } else {
            this.waketimeValue = str6;
        }
        if ((i13 & 64) == 0) {
            this.waketimeLabel = "";
        } else {
            this.waketimeLabel = str7;
        }
        if ((i13 & 128) == 0) {
            this.alarmStatus = new CoachingTileModel((String) null, (String) null, (String) null, (String) null, (String) null, (C9598e) null, (AlarmStatus) null, 127, (DefaultConstructorMarker) null);
        } else {
            this.alarmStatus = coachingTileModel;
        }
        this.destination = (i13 & 256) == 0 ? null : c9598e;
    }

    public SleepPlannerCardModel(String title, String bedtimeValue, String bedtimeLabel, String timeInBedValue, String timeInBedLabel, String waketimeValue, String waketimeLabel, CoachingTileModel alarmStatus, C9598e c9598e) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(bedtimeValue, "bedtimeValue");
        AbstractC22676k.m65750j(bedtimeLabel, "bedtimeLabel");
        AbstractC22676k.m65750j(timeInBedValue, "timeInBedValue");
        AbstractC22676k.m65750j(timeInBedLabel, "timeInBedLabel");
        AbstractC22676k.m65750j(waketimeValue, "waketimeValue");
        AbstractC22676k.m65750j(waketimeLabel, "waketimeLabel");
        AbstractC22676k.m65750j(alarmStatus, "alarmStatus");
        this.title = title;
        this.bedtimeValue = bedtimeValue;
        this.bedtimeLabel = bedtimeLabel;
        this.timeInBedValue = timeInBedValue;
        this.timeInBedLabel = timeInBedLabel;
        this.waketimeValue = waketimeValue;
        this.waketimeLabel = waketimeLabel;
        this.alarmStatus = alarmStatus;
        this.destination = c9598e;
    }

    public /* synthetic */ SleepPlannerCardModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, CoachingTileModel coachingTileModel, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "" : str4, (i13 & 16) != 0 ? "" : str5, (i13 & 32) != 0 ? "" : str6, (i13 & 64) == 0 ? str7 : "", (i13 & 128) != 0 ? new CoachingTileModel((String) null, (String) null, (String) null, (String) null, (String) null, (C9598e) null, (AlarmStatus) null, 127, (DefaultConstructorMarker) null) : coachingTileModel, (i13 & 256) != 0 ? null : c9598e);
    }
}
