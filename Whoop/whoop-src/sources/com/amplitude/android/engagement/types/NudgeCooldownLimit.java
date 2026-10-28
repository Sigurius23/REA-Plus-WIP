package com.amplitude.android.engagement.types;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB9\b\u0017\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J4\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b'\u0010\u0016¨\u0006+"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/NudgeCooldownLimit;", "", "", "max", "", "period", "periodCount", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/NudgeCooldownLimit;Lzc3/c;Lyc3/g;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lcom/amplitude/android/engagement/types/NudgeCooldownLimit;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getMax", "Ljava/lang/String;", "getPeriod", "getPeriodCount", "Companion", "$serializer", "com/amplitude/android/engagement/types/t0", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class NudgeCooldownLimit {
    public static final int $stable = 0;
    public static final C4935t0 Companion = new C4935t0();
    private final Integer max;
    private final String period;
    private final Integer periodCount;

    public NudgeCooldownLimit() {
        this((Integer) null, (String) null, (Integer) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ NudgeCooldownLimit copy$default(NudgeCooldownLimit nudgeCooldownLimit, Integer num, String str, Integer num2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = nudgeCooldownLimit.max;
        }
        if ((i13 & 2) != 0) {
            str = nudgeCooldownLimit.period;
        }
        if ((i13 & 4) != 0) {
            num2 = nudgeCooldownLimit.periodCount;
        }
        return nudgeCooldownLimit.copy(num, str, num2);
    }

    public static final /* synthetic */ void write$Self(NudgeCooldownLimit self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.max != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.max);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.period != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.period);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.periodCount == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.periodCount);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getPeriodCount() {
        return this.periodCount;
    }

    public final NudgeCooldownLimit copy(Integer max, String period, Integer periodCount) {
        return new NudgeCooldownLimit(max, period, periodCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NudgeCooldownLimit)) {
            return false;
        }
        NudgeCooldownLimit nudgeCooldownLimit = (NudgeCooldownLimit) other;
        return AbstractC22676k.m65745e(this.max, nudgeCooldownLimit.max) && AbstractC22676k.m65745e(this.period, nudgeCooldownLimit.period) && AbstractC22676k.m65745e(this.periodCount, nudgeCooldownLimit.periodCount);
    }

    public final Integer getMax() {
        return this.max;
    }

    public final String getPeriod() {
        return this.period;
    }

    public final Integer getPeriodCount() {
        return this.periodCount;
    }

    public int hashCode() {
        Integer num = this.max;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.period;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.periodCount;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "NudgeCooldownLimit(max=" + this.max + ", period=" + this.period + ", periodCount=" + this.periodCount + ')';
    }

    @InterfaceC23457c
    public /* synthetic */ NudgeCooldownLimit(int i13, Integer num, String str, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.max = null;
        } else {
            this.max = num;
        }
        if ((i13 & 2) == 0) {
            this.period = null;
        } else {
            this.period = str;
        }
        if ((i13 & 4) == 0) {
            this.periodCount = null;
        } else {
            this.periodCount = num2;
        }
    }

    public NudgeCooldownLimit(Integer num, String str, Integer num2) {
        this.max = num;
        this.period = str;
        this.periodCount = num2;
    }

    public /* synthetic */ NudgeCooldownLimit(Integer num, String str, Integer num2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : num2);
    }
}
