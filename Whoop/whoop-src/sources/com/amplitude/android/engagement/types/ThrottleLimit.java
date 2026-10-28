package com.amplitude.android.engagement.types;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.BooleanSerializer;
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
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0017\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006-"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/ThrottleLimit;", "", "", "max", "", "period", "", "enabled", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/ThrottleLimit;Lzc3/c;Lyc3/g;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/amplitude/android/engagement/types/ThrottleLimit;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getMax", "Ljava/lang/String;", "getPeriod", "Ljava/lang/Boolean;", "getEnabled", "Companion", "$serializer", "com/amplitude/android/engagement/types/z1", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ThrottleLimit {
    public static final int $stable = 0;
    public static final C4954z1 Companion = new C4954z1();
    private final Boolean enabled;
    private final Integer max;
    private final String period;

    public ThrottleLimit() {
        this((Integer) null, (String) null, (Boolean) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ThrottleLimit copy$default(ThrottleLimit throttleLimit, Integer num, String str, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = throttleLimit.max;
        }
        if ((i13 & 2) != 0) {
            str = throttleLimit.period;
        }
        if ((i13 & 4) != 0) {
            bool = throttleLimit.enabled;
        }
        return throttleLimit.copy(num, str, bool);
    }

    public static final /* synthetic */ void write$Self(ThrottleLimit self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.max != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.max);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.period != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.period);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.enabled == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, BooleanSerializer.INSTANCE, self.enabled);
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
    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final ThrottleLimit copy(Integer max, String period, Boolean enabled) {
        return new ThrottleLimit(max, period, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThrottleLimit)) {
            return false;
        }
        ThrottleLimit throttleLimit = (ThrottleLimit) other;
        return AbstractC22676k.m65745e(this.max, throttleLimit.max) && AbstractC22676k.m65745e(this.period, throttleLimit.period) && AbstractC22676k.m65745e(this.enabled, throttleLimit.enabled);
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final Integer getMax() {
        return this.max;
    }

    public final String getPeriod() {
        return this.period;
    }

    public int hashCode() {
        Integer num = this.max;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.period;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.enabled;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "ThrottleLimit(max=" + this.max + ", period=" + this.period + ", enabled=" + this.enabled + ')';
    }

    @InterfaceC23457c
    public /* synthetic */ ThrottleLimit(int i13, Integer num, String str, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.enabled = null;
        } else {
            this.enabled = bool;
        }
    }

    public ThrottleLimit(Integer num, String str, Boolean bool) {
        this.max = num;
        this.period = str;
        this.enabled = bool;
    }

    public /* synthetic */ ThrottleLimit(Integer num, String str, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : bool);
    }
}
