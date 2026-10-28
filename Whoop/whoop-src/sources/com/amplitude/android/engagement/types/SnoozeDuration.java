package com.amplitude.android.engagement.types;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0017¨\u0006)"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/SnoozeDuration;", "", "Lcom/amplitude/android/engagement/types/SnoozeInterval;", "interval", "", "value", "<init>", "(Lcom/amplitude/android/engagement/types/SnoozeInterval;I)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/amplitude/android/engagement/types/SnoozeInterval;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/SnoozeDuration;Lzc3/c;Lyc3/g;)V", "component1", "()Lcom/amplitude/android/engagement/types/SnoozeInterval;", "component2", "()I", "copy", "(Lcom/amplitude/android/engagement/types/SnoozeInterval;I)Lcom/amplitude/android/engagement/types/SnoozeDuration;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/amplitude/android/engagement/types/SnoozeInterval;", "getInterval", "I", "getValue", "Companion", "$serializer", "com/amplitude/android/engagement/types/g1", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SnoozeDuration {
    public static final int $stable = 0;
    private final SnoozeInterval interval;
    private final int value;
    public static final C4890g1 Companion = new C4890g1();
    private static final InterfaceC37138c[] $childSerializers = {SnoozeInterval.Companion.serializer(), null};

    @InterfaceC23457c
    public /* synthetic */ SnoozeDuration(int i13, SnoozeInterval snoozeInterval, int i14, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, SnoozeDuration$$serializer.INSTANCE.getDescriptor());
        }
        this.interval = snoozeInterval;
        this.value = i14;
    }

    public static /* synthetic */ SnoozeDuration copy$default(SnoozeDuration snoozeDuration, SnoozeInterval snoozeInterval, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            snoozeInterval = snoozeDuration.interval;
        }
        if ((i14 & 2) != 0) {
            i13 = snoozeDuration.value;
        }
        return snoozeDuration.copy(snoozeInterval, i13);
    }

    public static final /* synthetic */ void write$Self(SnoozeDuration self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, $childSerializers[0], self.interval);
        output.encodeIntElement(serialDesc, 1, self.value);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SnoozeInterval getInterval() {
        return this.interval;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public final SnoozeDuration copy(SnoozeInterval interval, int value) {
        AbstractC22676k.m65750j(interval, "interval");
        return new SnoozeDuration(interval, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SnoozeDuration)) {
            return false;
        }
        SnoozeDuration snoozeDuration = (SnoozeDuration) other;
        return this.interval == snoozeDuration.interval && this.value == snoozeDuration.value;
    }

    public final SnoozeInterval getInterval() {
        return this.interval;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return Integer.hashCode(this.value) + (this.interval.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("SnoozeDuration(interval=");
        sb4.append(this.interval);
        sb4.append(", value=");
        return AbstractC11895b.m31999r(sb4, this.value, ')');
    }

    public SnoozeDuration(SnoozeInterval interval, int i13) {
        AbstractC22676k.m65750j(interval, "interval");
        this.interval = interval;
        this.value = i13;
    }
}
