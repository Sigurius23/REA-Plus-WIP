package com.whoop.smart.alarm.data.network.model;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\tJ'\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0014¨\u0006$"}, m65681d2 = {"Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto;", "", "", "defaultWakeWindowMinutes", "<init>", "(I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$smart_alarm_release", "(Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "copy", "(I)Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getDefaultWakeWindowMinutes", "Companion", "$serializer", "a", "smart-alarm_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DefaultWakeWindowDto {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("default_wake_window_minutes")
    private final int defaultWakeWindowMinutes;

    /* JADX INFO: renamed from: com.whoop.smart.alarm.data.network.model.DefaultWakeWindowDto$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto;", "serializer", "()Lwc3/c;", "smart-alarm_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DefaultWakeWindowDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public DefaultWakeWindowDto(int i13) {
        this.defaultWakeWindowMinutes = i13;
    }

    public static /* synthetic */ DefaultWakeWindowDto copy$default(DefaultWakeWindowDto defaultWakeWindowDto, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = defaultWakeWindowDto.defaultWakeWindowMinutes;
        }
        return defaultWakeWindowDto.copy(i13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDefaultWakeWindowMinutes() {
        return this.defaultWakeWindowMinutes;
    }

    public final DefaultWakeWindowDto copy(int defaultWakeWindowMinutes) {
        return new DefaultWakeWindowDto(defaultWakeWindowMinutes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DefaultWakeWindowDto) && this.defaultWakeWindowMinutes == ((DefaultWakeWindowDto) other).defaultWakeWindowMinutes;
    }

    public final int getDefaultWakeWindowMinutes() {
        return this.defaultWakeWindowMinutes;
    }

    public int hashCode() {
        return Integer.hashCode(this.defaultWakeWindowMinutes);
    }

    public String toString() {
        return AbstractC2875y.m8296i(this.defaultWakeWindowMinutes, "DefaultWakeWindowDto(defaultWakeWindowMinutes=", ")");
    }

    public /* synthetic */ DefaultWakeWindowDto(int i13, int i14, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, DefaultWakeWindowDto$$serializer.INSTANCE.getDescriptor());
        }
        this.defaultWakeWindowMinutes = i14;
    }
}
