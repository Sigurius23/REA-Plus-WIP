package com.amplitude.android.engagement.types;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0017¨\u0006+"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/SnoozeAction;", "Lcom/amplitude/android/engagement/types/Action;", "Lcom/amplitude/android/engagement/types/SnoozeInterval;", "interval", "", "value", "<init>", "(Lcom/amplitude/android/engagement/types/SnoozeInterval;Ljava/lang/Integer;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/amplitude/android/engagement/types/SnoozeInterval;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/SnoozeAction;Lzc3/c;Lyc3/g;)V", "component1", "()Lcom/amplitude/android/engagement/types/SnoozeInterval;", "component2", "()Ljava/lang/Integer;", "copy", "(Lcom/amplitude/android/engagement/types/SnoozeInterval;Ljava/lang/Integer;)Lcom/amplitude/android/engagement/types/SnoozeAction;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/amplitude/android/engagement/types/SnoozeInterval;", "getInterval", "Ljava/lang/Integer;", "getValue", "Companion", "$serializer", "com/amplitude/android/engagement/types/f1", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37143h("snooze")
@InterfaceC37144i
public final /* data */ class SnoozeAction extends Action {
    public static final int $stable = 0;
    private final SnoozeInterval interval;
    private final Integer value;
    public static final C4886f1 Companion = new C4886f1();
    private static final InterfaceC37138c[] $childSerializers = {SnoozeInterval.Companion.serializer(), null};

    /* JADX WARN: Multi-variable type inference failed */
    public SnoozeAction() {
        this((SnoozeInterval) null, (Integer) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ SnoozeAction copy$default(SnoozeAction snoozeAction, SnoozeInterval snoozeInterval, Integer num, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            snoozeInterval = snoozeAction.interval;
        }
        if ((i13 & 2) != 0) {
            num = snoozeAction.value;
        }
        return snoozeAction.copy(snoozeInterval, num);
    }

    public static final /* synthetic */ void write$Self(SnoozeAction self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        Action.write$Self(self, output, serialDesc);
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.interval != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, interfaceC37138cArr[0], self.interval);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.value == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.value);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SnoozeInterval getInterval() {
        return this.interval;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getValue() {
        return this.value;
    }

    public final SnoozeAction copy(SnoozeInterval interval, Integer value) {
        return new SnoozeAction(interval, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SnoozeAction)) {
            return false;
        }
        SnoozeAction snoozeAction = (SnoozeAction) other;
        return this.interval == snoozeAction.interval && AbstractC22676k.m65745e(this.value, snoozeAction.value);
    }

    public final SnoozeInterval getInterval() {
        return this.interval;
    }

    public final Integer getValue() {
        return this.value;
    }

    public int hashCode() {
        SnoozeInterval snoozeInterval = this.interval;
        int iHashCode = (snoozeInterval == null ? 0 : snoozeInterval.hashCode()) * 31;
        Integer num = this.value;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "SnoozeAction(interval=" + this.interval + ", value=" + this.value + ')';
    }

    @InterfaceC23457c
    public /* synthetic */ SnoozeAction(int i13, SnoozeInterval snoozeInterval, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        super(i13, serializationConstructorMarker);
        if ((i13 & 1) == 0) {
            this.interval = null;
        } else {
            this.interval = snoozeInterval;
        }
        if ((i13 & 2) == 0) {
            this.value = null;
        } else {
            this.value = num;
        }
    }

    public SnoozeAction(SnoozeInterval snoozeInterval, Integer num) {
        super(null);
        this.interval = snoozeInterval;
        this.value = num;
    }

    public /* synthetic */ SnoozeAction(SnoozeInterval snoozeInterval, Integer num, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : snoozeInterval, (i13 & 2) != 0 ? null : num);
    }
}
