package com.whoop.weeklyplan.customizeplan.domain.api;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J<\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010!¨\u00065"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRangeV2;", "", "Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRangeLimitsV2;", "range", "Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeV2;", "percentRange", "", "labelDisplay", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionRangeV2;", "progressionRange", "<init>", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRangeLimitsV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeV2;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionRangeV2;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRangeLimitsV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeV2;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionRangeV2;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRangeV2;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRangeLimitsV2;", "component2", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeV2;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionRangeV2;", "copy", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRangeLimitsV2;Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeV2;Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionRangeV2;)Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRangeV2;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRangeLimitsV2;", "getRange", "Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeV2;", "getPercentRange", "Ljava/lang/String;", "getLabelDisplay", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionRangeV2;", "getProgressionRange", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DisplayRangeV2 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String labelDisplay;
    private final RangeV2 percentRange;
    private final ProgressionRangeV2 progressionRange;
    private final DisplayRangeLimitsV2 range;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRangeV2$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRangeV2;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DisplayRangeV2$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DisplayRangeV2(int i13, DisplayRangeLimitsV2 displayRangeLimitsV2, RangeV2 rangeV2, String str, ProgressionRangeV2 progressionRangeV2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, DisplayRangeV2$$serializer.INSTANCE.getDescriptor());
        }
        this.range = displayRangeLimitsV2;
        this.percentRange = rangeV2;
        this.labelDisplay = str;
        this.progressionRange = progressionRangeV2;
    }

    public static /* synthetic */ DisplayRangeV2 copy$default(DisplayRangeV2 displayRangeV2, DisplayRangeLimitsV2 displayRangeLimitsV2, RangeV2 rangeV2, String str, ProgressionRangeV2 progressionRangeV2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            displayRangeLimitsV2 = displayRangeV2.range;
        }
        if ((i13 & 2) != 0) {
            rangeV2 = displayRangeV2.percentRange;
        }
        if ((i13 & 4) != 0) {
            str = displayRangeV2.labelDisplay;
        }
        if ((i13 & 8) != 0) {
            progressionRangeV2 = displayRangeV2.progressionRange;
        }
        return displayRangeV2.copy(displayRangeLimitsV2, rangeV2, str, progressionRangeV2);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(DisplayRangeV2 self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, DisplayRangeLimitsV2$$serializer.INSTANCE, self.range);
        output.encodeSerializableElement(serialDesc, 1, RangeV2$$serializer.INSTANCE, self.percentRange);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.labelDisplay);
        output.encodeNullableSerializableElement(serialDesc, 3, ProgressionRangeV2$$serializer.INSTANCE, self.progressionRange);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DisplayRangeLimitsV2 getRange() {
        return this.range;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RangeV2 getPercentRange() {
        return this.percentRange;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLabelDisplay() {
        return this.labelDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ProgressionRangeV2 getProgressionRange() {
        return this.progressionRange;
    }

    public final DisplayRangeV2 copy(DisplayRangeLimitsV2 range, RangeV2 percentRange, String labelDisplay, ProgressionRangeV2 progressionRange) {
        AbstractC22676k.m65750j(range, "range");
        AbstractC22676k.m65750j(percentRange, "percentRange");
        return new DisplayRangeV2(range, percentRange, labelDisplay, progressionRange);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayRangeV2)) {
            return false;
        }
        DisplayRangeV2 displayRangeV2 = (DisplayRangeV2) other;
        return AbstractC22676k.m65745e(this.range, displayRangeV2.range) && AbstractC22676k.m65745e(this.percentRange, displayRangeV2.percentRange) && AbstractC22676k.m65745e(this.labelDisplay, displayRangeV2.labelDisplay) && AbstractC22676k.m65745e(this.progressionRange, displayRangeV2.progressionRange);
    }

    public final String getLabelDisplay() {
        return this.labelDisplay;
    }

    public final RangeV2 getPercentRange() {
        return this.percentRange;
    }

    public final ProgressionRangeV2 getProgressionRange() {
        return this.progressionRange;
    }

    public final DisplayRangeLimitsV2 getRange() {
        return this.range;
    }

    public int hashCode() {
        int iHashCode = (this.percentRange.hashCode() + (this.range.hashCode() * 31)) * 31;
        String str = this.labelDisplay;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ProgressionRangeV2 progressionRangeV2 = this.progressionRange;
        return iHashCode2 + (progressionRangeV2 != null ? progressionRangeV2.hashCode() : 0);
    }

    public String toString() {
        return "DisplayRangeV2(range=" + this.range + ", percentRange=" + this.percentRange + ", labelDisplay=" + this.labelDisplay + ", progressionRange=" + this.progressionRange + ")";
    }

    public DisplayRangeV2(DisplayRangeLimitsV2 range, RangeV2 percentRange, String str, ProgressionRangeV2 progressionRangeV2) {
        AbstractC22676k.m65750j(range, "range");
        AbstractC22676k.m65750j(percentRange, "percentRange");
        this.range = range;
        this.percentRange = percentRange;
        this.labelDisplay = str;
        this.progressionRange = progressionRangeV2;
    }
}
