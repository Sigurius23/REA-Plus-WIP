package com.whoop.widget.p071ui.healthspan;

import androidx.core.app.FrameMetricsAggregator;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import d13.AbstractC11478a;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FGBk\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012Bs\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b'\u0010&J\u0010\u0010(\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b(\u0010&J\u0012\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b-\u0010.Jt\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b1\u0010&J\u0010\u00102\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u00020\r2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b;\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\b=\u0010&R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b>\u0010&R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b?\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\bA\u0010*R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010B\u001a\u0004\b\u000e\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010C\u001a\u0004\bD\u0010.¨\u0006H"}, m65681d2 = {"Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;", "", "", "amoebaSeed", "", "paceOfAgingScore", "yearsDifferenceScore", "", "ageValueDisplay", "subtitleDisplay", "subtitleStyle", "Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;", "lockedContentState", "", "isLocked", "", "batteryPercentage", "<init>", "(Ljava/lang/Long;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;ZLjava/lang/Integer;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;ZLjava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$widget_release", "(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/Long;", "component2", "()Ljava/lang/Float;", "component3", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "()Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;", "component8", "()Z", "component9", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/Long;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;ZLjava/lang/Integer;)Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getAmoebaSeed", "Ljava/lang/Float;", "getPaceOfAgingScore", "getYearsDifferenceScore", "Ljava/lang/String;", "getAgeValueDisplay", "getSubtitleDisplay", "getSubtitleStyle", "Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;", "getLockedContentState", "Z", "Ljava/lang/Integer;", "getBatteryPercentage", "Companion", "$serializer", "a", "widget_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HealthspanWidgetViewState {
    private final String ageValueDisplay;
    private final Long amoebaSeed;
    private final Integer batteryPercentage;
    private final boolean isLocked;
    private final HealthspanWidgetLockedContentViewState lockedContentState;
    private final Float paceOfAgingScore;
    private final String subtitleDisplay;
    private final String subtitleStyle;
    private final Float yearsDifferenceScore;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.widget.ui.healthspan.HealthspanWidgetViewState$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;", "serializer", "()Lwc3/c;", "widget_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HealthspanWidgetViewState$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public HealthspanWidgetViewState() {
        this((Long) null, (Float) null, (Float) null, (String) null, (String) null, (String) null, (HealthspanWidgetLockedContentViewState) null, false, (Integer) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ HealthspanWidgetViewState copy$default(HealthspanWidgetViewState healthspanWidgetViewState, Long l7, Float f13, Float f14, String str, String str2, String str3, HealthspanWidgetLockedContentViewState healthspanWidgetLockedContentViewState, boolean z4, Integer num, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            l7 = healthspanWidgetViewState.amoebaSeed;
        }
        if ((i13 & 2) != 0) {
            f13 = healthspanWidgetViewState.paceOfAgingScore;
        }
        if ((i13 & 4) != 0) {
            f14 = healthspanWidgetViewState.yearsDifferenceScore;
        }
        if ((i13 & 8) != 0) {
            str = healthspanWidgetViewState.ageValueDisplay;
        }
        if ((i13 & 16) != 0) {
            str2 = healthspanWidgetViewState.subtitleDisplay;
        }
        if ((i13 & 32) != 0) {
            str3 = healthspanWidgetViewState.subtitleStyle;
        }
        if ((i13 & 64) != 0) {
            healthspanWidgetLockedContentViewState = healthspanWidgetViewState.lockedContentState;
        }
        if ((i13 & 128) != 0) {
            z4 = healthspanWidgetViewState.isLocked;
        }
        if ((i13 & 256) != 0) {
            num = healthspanWidgetViewState.batteryPercentage;
        }
        boolean z13 = z4;
        Integer num2 = num;
        String str4 = str3;
        HealthspanWidgetLockedContentViewState healthspanWidgetLockedContentViewState2 = healthspanWidgetLockedContentViewState;
        String str5 = str2;
        Float f15 = f14;
        return healthspanWidgetViewState.copy(l7, f13, f15, str, str5, str4, healthspanWidgetLockedContentViewState2, z13, num2);
    }

    public static final /* synthetic */ void write$Self$widget_release(HealthspanWidgetViewState self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.amoebaSeed != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, LongSerializer.INSTANCE, self.amoebaSeed);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.paceOfAgingScore != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, FloatSerializer.INSTANCE, self.paceOfAgingScore);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.yearsDifferenceScore != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, FloatSerializer.INSTANCE, self.yearsDifferenceScore);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.ageValueDisplay, "")) {
            output.encodeStringElement(serialDesc, 3, self.ageValueDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.subtitleDisplay, "")) {
            output.encodeStringElement(serialDesc, 4, self.subtitleDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !AbstractC22676k.m65745e(self.subtitleStyle, "")) {
            output.encodeStringElement(serialDesc, 5, self.subtitleStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.lockedContentState != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, HealthspanWidgetLockedContentViewState$$serializer.INSTANCE, self.lockedContentState);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.isLocked) {
            output.encodeBooleanElement(serialDesc, 7, self.isLocked);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.batteryPercentage == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 8, IntSerializer.INSTANCE, self.batteryPercentage);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getAmoebaSeed() {
        return this.amoebaSeed;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Float getPaceOfAgingScore() {
        return this.paceOfAgingScore;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getYearsDifferenceScore() {
        return this.yearsDifferenceScore;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAgeValueDisplay() {
        return this.ageValueDisplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSubtitleStyle() {
        return this.subtitleStyle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final HealthspanWidgetLockedContentViewState getLockedContentState() {
        return this.lockedContentState;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsLocked() {
        return this.isLocked;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getBatteryPercentage() {
        return this.batteryPercentage;
    }

    public final HealthspanWidgetViewState copy(Long amoebaSeed, Float paceOfAgingScore, Float yearsDifferenceScore, String ageValueDisplay, String subtitleDisplay, String subtitleStyle, HealthspanWidgetLockedContentViewState lockedContentState, boolean isLocked, Integer batteryPercentage) {
        AbstractC22676k.m65750j(ageValueDisplay, "ageValueDisplay");
        AbstractC22676k.m65750j(subtitleDisplay, "subtitleDisplay");
        AbstractC22676k.m65750j(subtitleStyle, "subtitleStyle");
        return new HealthspanWidgetViewState(amoebaSeed, paceOfAgingScore, yearsDifferenceScore, ageValueDisplay, subtitleDisplay, subtitleStyle, lockedContentState, isLocked, batteryPercentage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthspanWidgetViewState)) {
            return false;
        }
        HealthspanWidgetViewState healthspanWidgetViewState = (HealthspanWidgetViewState) other;
        return AbstractC22676k.m65745e(this.amoebaSeed, healthspanWidgetViewState.amoebaSeed) && AbstractC22676k.m65745e(this.paceOfAgingScore, healthspanWidgetViewState.paceOfAgingScore) && AbstractC22676k.m65745e(this.yearsDifferenceScore, healthspanWidgetViewState.yearsDifferenceScore) && AbstractC22676k.m65745e(this.ageValueDisplay, healthspanWidgetViewState.ageValueDisplay) && AbstractC22676k.m65745e(this.subtitleDisplay, healthspanWidgetViewState.subtitleDisplay) && AbstractC22676k.m65745e(this.subtitleStyle, healthspanWidgetViewState.subtitleStyle) && AbstractC22676k.m65745e(this.lockedContentState, healthspanWidgetViewState.lockedContentState) && this.isLocked == healthspanWidgetViewState.isLocked && AbstractC22676k.m65745e(this.batteryPercentage, healthspanWidgetViewState.batteryPercentage);
    }

    public final String getAgeValueDisplay() {
        return this.ageValueDisplay;
    }

    public final Long getAmoebaSeed() {
        return this.amoebaSeed;
    }

    public final Integer getBatteryPercentage() {
        return this.batteryPercentage;
    }

    public final HealthspanWidgetLockedContentViewState getLockedContentState() {
        return this.lockedContentState;
    }

    public final Float getPaceOfAgingScore() {
        return this.paceOfAgingScore;
    }

    public final String getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    public final String getSubtitleStyle() {
        return this.subtitleStyle;
    }

    public final Float getYearsDifferenceScore() {
        return this.yearsDifferenceScore;
    }

    public int hashCode() {
        Long l7 = this.amoebaSeed;
        int iHashCode = (l7 == null ? 0 : l7.hashCode()) * 31;
        Float f13 = this.paceOfAgingScore;
        int iHashCode2 = (iHashCode + (f13 == null ? 0 : f13.hashCode())) * 31;
        Float f14 = this.yearsDifferenceScore;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode2 + (f14 == null ? 0 : f14.hashCode())) * 31, 31, this.ageValueDisplay), 31, this.subtitleDisplay), 31, this.subtitleStyle);
        HealthspanWidgetLockedContentViewState healthspanWidgetLockedContentViewState = this.lockedContentState;
        int iM8289b = AbstractC2875y.m8289b((iM30450d + (healthspanWidgetLockedContentViewState == null ? 0 : healthspanWidgetLockedContentViewState.hashCode())) * 31, 31, this.isLocked);
        Integer num = this.batteryPercentage;
        return iM8289b + (num != null ? num.hashCode() : 0);
    }

    public final boolean isLocked() {
        return this.isLocked;
    }

    public String toString() {
        Long l7 = this.amoebaSeed;
        Float f13 = this.paceOfAgingScore;
        Float f14 = this.yearsDifferenceScore;
        String str = this.ageValueDisplay;
        String str2 = this.subtitleDisplay;
        String str3 = this.subtitleStyle;
        HealthspanWidgetLockedContentViewState healthspanWidgetLockedContentViewState = this.lockedContentState;
        boolean z4 = this.isLocked;
        Integer num = this.batteryPercentage;
        StringBuilder sb4 = new StringBuilder("HealthspanWidgetViewState(amoebaSeed=");
        sb4.append(l7);
        sb4.append(", paceOfAgingScore=");
        sb4.append(f13);
        sb4.append(", yearsDifferenceScore=");
        sb4.append(f14);
        sb4.append(", ageValueDisplay=");
        sb4.append(str);
        sb4.append(", subtitleDisplay=");
        AbstractC11266d.m30444B(sb4, str2, ", subtitleStyle=", str3, ", lockedContentState=");
        sb4.append(healthspanWidgetLockedContentViewState);
        sb4.append(", isLocked=");
        sb4.append(z4);
        sb4.append(", batteryPercentage=");
        return AbstractC11478a.m30859k(sb4, num, ")");
    }

    public /* synthetic */ HealthspanWidgetViewState(int i13, Long l7, Float f13, Float f14, String str, String str2, String str3, HealthspanWidgetLockedContentViewState healthspanWidgetLockedContentViewState, boolean z4, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.amoebaSeed = null;
        } else {
            this.amoebaSeed = l7;
        }
        if ((i13 & 2) == 0) {
            this.paceOfAgingScore = null;
        } else {
            this.paceOfAgingScore = f13;
        }
        if ((i13 & 4) == 0) {
            this.yearsDifferenceScore = null;
        } else {
            this.yearsDifferenceScore = f14;
        }
        if ((i13 & 8) == 0) {
            this.ageValueDisplay = "";
        } else {
            this.ageValueDisplay = str;
        }
        if ((i13 & 16) == 0) {
            this.subtitleDisplay = "";
        } else {
            this.subtitleDisplay = str2;
        }
        if ((i13 & 32) == 0) {
            this.subtitleStyle = "";
        } else {
            this.subtitleStyle = str3;
        }
        if ((i13 & 64) == 0) {
            this.lockedContentState = null;
        } else {
            this.lockedContentState = healthspanWidgetLockedContentViewState;
        }
        if ((i13 & 128) == 0) {
            this.isLocked = false;
        } else {
            this.isLocked = z4;
        }
        if ((i13 & 256) == 0) {
            this.batteryPercentage = null;
        } else {
            this.batteryPercentage = num;
        }
    }

    public HealthspanWidgetViewState(Long l7, Float f13, Float f14, String ageValueDisplay, String subtitleDisplay, String subtitleStyle, HealthspanWidgetLockedContentViewState healthspanWidgetLockedContentViewState, boolean z4, Integer num) {
        AbstractC22676k.m65750j(ageValueDisplay, "ageValueDisplay");
        AbstractC22676k.m65750j(subtitleDisplay, "subtitleDisplay");
        AbstractC22676k.m65750j(subtitleStyle, "subtitleStyle");
        this.amoebaSeed = l7;
        this.paceOfAgingScore = f13;
        this.yearsDifferenceScore = f14;
        this.ageValueDisplay = ageValueDisplay;
        this.subtitleDisplay = subtitleDisplay;
        this.subtitleStyle = subtitleStyle;
        this.lockedContentState = healthspanWidgetLockedContentViewState;
        this.isLocked = z4;
        this.batteryPercentage = num;
    }

    public /* synthetic */ HealthspanWidgetViewState(Long l7, Float f13, Float f14, String str, String str2, String str3, HealthspanWidgetLockedContentViewState healthspanWidgetLockedContentViewState, boolean z4, Integer num, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : l7, (i13 & 2) != 0 ? null : f13, (i13 & 4) != 0 ? null : f14, (i13 & 8) != 0 ? "" : str, (i13 & 16) != 0 ? "" : str2, (i13 & 32) != 0 ? "" : str3, (i13 & 64) != 0 ? null : healthspanWidgetLockedContentViewState, (i13 & 128) != 0 ? false : z4, (i13 & 256) != 0 ? null : num);
    }
}
