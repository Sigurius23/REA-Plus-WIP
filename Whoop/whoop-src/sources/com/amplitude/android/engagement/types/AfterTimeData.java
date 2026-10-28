package com.amplitude.android.engagement.types;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0017J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0017¨\u0006'"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/AfterTimeData;", "", "", "unit", "", "value", "<init>", "(Ljava/lang/String;I)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/AfterTimeData;Lzc3/c;Lyc3/g;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/amplitude/android/engagement/types/AfterTimeData;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUnit", "I", "getValue", "Companion", "$serializer", "com/amplitude/android/engagement/types/b", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AfterTimeData {
    public static final int $stable = 0;
    public static final C4868b Companion = new C4868b();
    private final String unit;
    private final int value;

    @InterfaceC23457c
    public /* synthetic */ AfterTimeData(int i13, String str, int i14, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, AfterTimeData$$serializer.INSTANCE.getDescriptor());
        }
        this.unit = str;
        this.value = i14;
    }

    public static /* synthetic */ AfterTimeData copy$default(AfterTimeData afterTimeData, String str, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = afterTimeData.unit;
        }
        if ((i14 & 2) != 0) {
            i13 = afterTimeData.value;
        }
        return afterTimeData.copy(str, i13);
    }

    public static final /* synthetic */ void write$Self(AfterTimeData self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.unit);
        output.encodeIntElement(serialDesc, 1, self.value);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public final AfterTimeData copy(String unit, int value) {
        AbstractC22676k.m65750j(unit, "unit");
        return new AfterTimeData(unit, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AfterTimeData)) {
            return false;
        }
        AfterTimeData afterTimeData = (AfterTimeData) other;
        return AbstractC22676k.m65745e(this.unit, afterTimeData.unit) && this.value == afterTimeData.value;
    }

    public final String getUnit() {
        return this.unit;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return Integer.hashCode(this.value) + (this.unit.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("AfterTimeData(unit=");
        sb4.append(this.unit);
        sb4.append(", value=");
        return AbstractC11895b.m31999r(sb4, this.value, ')');
    }

    public AfterTimeData(String unit, int i13) {
        AbstractC22676k.m65750j(unit, "unit");
        this.unit = unit;
        this.value = i13;
    }
}
