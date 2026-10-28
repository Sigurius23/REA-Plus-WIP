package com.whoop.home.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eB_\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001eJ`\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b*\u0010#J\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b3\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b4\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010#R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010%R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b9\u0010\u001eR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b:\u0010\u001e¨\u0006="}, m65681d2 = {"Lcom/whoop/home/domain/models/JournalMetaData;", "", "", "journalCompleted", "hasRecovery", "hasCycle", "journalEnabled", "", "displayCycleState", "Lcom/whoop/home/domain/models/CycleDays;", "previousCycleDuring", "shouldAutoPop", "hasEnoughRecoveries", "<init>", "(ZZZZLjava/lang/String;Lcom/whoop/home/domain/models/CycleDays;ZZ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZZZZLjava/lang/String;Lcom/whoop/home/domain/models/CycleDays;ZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$home_release", "(Lcom/whoop/home/domain/models/JournalMetaData;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Z", "component2", "component3", "component4", "component5", "()Ljava/lang/String;", "component6", "()Lcom/whoop/home/domain/models/CycleDays;", "component7", "component8", "copy", "(ZZZZLjava/lang/String;Lcom/whoop/home/domain/models/CycleDays;ZZ)Lcom/whoop/home/domain/models/JournalMetaData;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getJournalCompleted", "getHasRecovery", "getHasCycle", "getJournalEnabled", "Ljava/lang/String;", "getDisplayCycleState", "Lcom/whoop/home/domain/models/CycleDays;", "getPreviousCycleDuring", "getShouldAutoPop", "getHasEnoughRecoveries", "Companion", "$serializer", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class JournalMetaData {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("display_cycle_state")
    private final String displayCycleState;

    @SerializedName("has_cycle")
    private final boolean hasCycle;

    @SerializedName("has_enough_recoveries")
    private final boolean hasEnoughRecoveries;

    @SerializedName("has_recovery")
    private final boolean hasRecovery;

    @SerializedName("journal_completed")
    private final boolean journalCompleted;

    @SerializedName("journal_enabled")
    private final boolean journalEnabled;

    @SerializedName("previous_cycle_during")
    private final CycleDays previousCycleDuring;

    @SerializedName("should_auto_pop")
    private final boolean shouldAutoPop;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/home/domain/models/JournalMetaData$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/home/domain/models/JournalMetaData;", "serializer", "()Lwc3/c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return JournalMetaData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ JournalMetaData(int i13, boolean z4, boolean z13, boolean z14, boolean z15, String str, CycleDays cycleDays, boolean z16, boolean z17, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, JournalMetaData$$serializer.INSTANCE.getDescriptor());
        }
        this.journalCompleted = z4;
        this.hasRecovery = z13;
        this.hasCycle = z14;
        this.journalEnabled = z15;
        this.displayCycleState = str;
        this.previousCycleDuring = cycleDays;
        this.shouldAutoPop = z16;
        this.hasEnoughRecoveries = z17;
    }

    public static /* synthetic */ JournalMetaData copy$default(JournalMetaData journalMetaData, boolean z4, boolean z13, boolean z14, boolean z15, String str, CycleDays cycleDays, boolean z16, boolean z17, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = journalMetaData.journalCompleted;
        }
        if ((i13 & 2) != 0) {
            z13 = journalMetaData.hasRecovery;
        }
        if ((i13 & 4) != 0) {
            z14 = journalMetaData.hasCycle;
        }
        if ((i13 & 8) != 0) {
            z15 = journalMetaData.journalEnabled;
        }
        if ((i13 & 16) != 0) {
            str = journalMetaData.displayCycleState;
        }
        if ((i13 & 32) != 0) {
            cycleDays = journalMetaData.previousCycleDuring;
        }
        if ((i13 & 64) != 0) {
            z16 = journalMetaData.shouldAutoPop;
        }
        if ((i13 & 128) != 0) {
            z17 = journalMetaData.hasEnoughRecoveries;
        }
        boolean z18 = z16;
        boolean z19 = z17;
        String str2 = str;
        CycleDays cycleDays2 = cycleDays;
        return journalMetaData.copy(z4, z13, z14, z15, str2, cycleDays2, z18, z19);
    }

    public static final /* synthetic */ void write$Self$home_release(JournalMetaData self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.journalCompleted);
        output.encodeBooleanElement(serialDesc, 1, self.hasRecovery);
        output.encodeBooleanElement(serialDesc, 2, self.hasCycle);
        output.encodeBooleanElement(serialDesc, 3, self.journalEnabled);
        output.encodeStringElement(serialDesc, 4, self.displayCycleState);
        output.encodeSerializableElement(serialDesc, 5, CycleDays$$serializer.INSTANCE, self.previousCycleDuring);
        output.encodeBooleanElement(serialDesc, 6, self.shouldAutoPop);
        output.encodeBooleanElement(serialDesc, 7, self.hasEnoughRecoveries);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getJournalCompleted() {
        return this.journalCompleted;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasRecovery() {
        return this.hasRecovery;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHasCycle() {
        return this.hasCycle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getJournalEnabled() {
        return this.journalEnabled;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDisplayCycleState() {
        return this.displayCycleState;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CycleDays getPreviousCycleDuring() {
        return this.previousCycleDuring;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getShouldAutoPop() {
        return this.shouldAutoPop;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getHasEnoughRecoveries() {
        return this.hasEnoughRecoveries;
    }

    public final JournalMetaData copy(boolean journalCompleted, boolean hasRecovery, boolean hasCycle, boolean journalEnabled, String displayCycleState, CycleDays previousCycleDuring, boolean shouldAutoPop, boolean hasEnoughRecoveries) {
        AbstractC22676k.m65750j(displayCycleState, "displayCycleState");
        AbstractC22676k.m65750j(previousCycleDuring, "previousCycleDuring");
        return new JournalMetaData(journalCompleted, hasRecovery, hasCycle, journalEnabled, displayCycleState, previousCycleDuring, shouldAutoPop, hasEnoughRecoveries);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JournalMetaData)) {
            return false;
        }
        JournalMetaData journalMetaData = (JournalMetaData) other;
        return this.journalCompleted == journalMetaData.journalCompleted && this.hasRecovery == journalMetaData.hasRecovery && this.hasCycle == journalMetaData.hasCycle && this.journalEnabled == journalMetaData.journalEnabled && AbstractC22676k.m65745e(this.displayCycleState, journalMetaData.displayCycleState) && AbstractC22676k.m65745e(this.previousCycleDuring, journalMetaData.previousCycleDuring) && this.shouldAutoPop == journalMetaData.shouldAutoPop && this.hasEnoughRecoveries == journalMetaData.hasEnoughRecoveries;
    }

    public final String getDisplayCycleState() {
        return this.displayCycleState;
    }

    public final boolean getHasCycle() {
        return this.hasCycle;
    }

    public final boolean getHasEnoughRecoveries() {
        return this.hasEnoughRecoveries;
    }

    public final boolean getHasRecovery() {
        return this.hasRecovery;
    }

    public final boolean getJournalCompleted() {
        return this.journalCompleted;
    }

    public final boolean getJournalEnabled() {
        return this.journalEnabled;
    }

    public final CycleDays getPreviousCycleDuring() {
        return this.previousCycleDuring;
    }

    public final boolean getShouldAutoPop() {
        return this.shouldAutoPop;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasEnoughRecoveries) + AbstractC2875y.m8289b((this.previousCycleDuring.hashCode() + AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.journalCompleted) * 31, 31, this.hasRecovery), 31, this.hasCycle), 31, this.journalEnabled), 31, this.displayCycleState)) * 31, 31, this.shouldAutoPop);
    }

    public String toString() {
        boolean z4 = this.journalCompleted;
        boolean z13 = this.hasRecovery;
        boolean z14 = this.hasCycle;
        boolean z15 = this.journalEnabled;
        String str = this.displayCycleState;
        CycleDays cycleDays = this.previousCycleDuring;
        boolean z16 = this.shouldAutoPop;
        boolean z17 = this.hasEnoughRecoveries;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("JournalMetaData(journalCompleted=", ", hasRecovery=", ", hasCycle=", z4, z13);
        AbstractC38963t7.m124392v(sbM32002u, z14, ", journalEnabled=", z15, ", displayCycleState=");
        sbM32002u.append(str);
        sbM32002u.append(", previousCycleDuring=");
        sbM32002u.append(cycleDays);
        sbM32002u.append(", shouldAutoPop=");
        return AbstractC36095b.m114682j(sbM32002u, z16, ", hasEnoughRecoveries=", z17, ")");
    }

    public JournalMetaData(boolean z4, boolean z13, boolean z14, boolean z15, String displayCycleState, CycleDays previousCycleDuring, boolean z16, boolean z17) {
        AbstractC22676k.m65750j(displayCycleState, "displayCycleState");
        AbstractC22676k.m65750j(previousCycleDuring, "previousCycleDuring");
        this.journalCompleted = z4;
        this.hasRecovery = z13;
        this.hasCycle = z14;
        this.journalEnabled = z15;
        this.displayCycleState = displayCycleState;
        this.previousCycleDuring = previousCycleDuring;
        this.shouldAutoPop = z16;
        this.hasEnoughRecoveries = z17;
    }
}
