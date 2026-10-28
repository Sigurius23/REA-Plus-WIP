package com.whoop.service.network.model;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0017J\u001a\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u0019¨\u0006+"}, m65681d2 = {"Lcom/whoop/service/network/model/UserPreferences;", "", "", "userId", "", "autoDetectWorkout", "sleepCoachV2", "<init>", "(IZZ)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/service/network/model/UserPreferences;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "()Z", "component3", "copy", "(IZZ)Lcom/whoop/service/network/model/UserPreferences;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getUserId", "Z", "getAutoDetectWorkout", "getSleepCoachV2", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UserPreferences {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean autoDetectWorkout;
    private final boolean sleepCoachV2;
    private final int userId;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/service/network/model/UserPreferences$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/service/network/model/UserPreferences;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return UserPreferences$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public UserPreferences() {
        this(0, false, false, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ UserPreferences copy$default(UserPreferences userPreferences, int i13, boolean z4, boolean z13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = userPreferences.userId;
        }
        if ((i14 & 2) != 0) {
            z4 = userPreferences.autoDetectWorkout;
        }
        if ((i14 & 4) != 0) {
            z13 = userPreferences.sleepCoachV2;
        }
        return userPreferences.copy(i13, z4, z13);
    }

    public static final /* synthetic */ void write$Self$core_release(UserPreferences self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.userId != 0) {
            output.encodeIntElement(serialDesc, 0, self.userId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.autoDetectWorkout) {
            output.encodeBooleanElement(serialDesc, 1, self.autoDetectWorkout);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.sleepCoachV2) {
            output.encodeBooleanElement(serialDesc, 2, self.sleepCoachV2);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getAutoDetectWorkout() {
        return this.autoDetectWorkout;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getSleepCoachV2() {
        return this.sleepCoachV2;
    }

    public final UserPreferences copy(int userId, boolean autoDetectWorkout, boolean sleepCoachV2) {
        return new UserPreferences(userId, autoDetectWorkout, sleepCoachV2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserPreferences)) {
            return false;
        }
        UserPreferences userPreferences = (UserPreferences) other;
        return this.userId == userPreferences.userId && this.autoDetectWorkout == userPreferences.autoDetectWorkout && this.sleepCoachV2 == userPreferences.sleepCoachV2;
    }

    public final boolean getAutoDetectWorkout() {
        return this.autoDetectWorkout;
    }

    public final boolean getSleepCoachV2() {
        return this.sleepCoachV2;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.sleepCoachV2) + AbstractC2875y.m8289b(Integer.hashCode(this.userId) * 31, 31, this.autoDetectWorkout);
    }

    public String toString() {
        int i13 = this.userId;
        boolean z4 = this.autoDetectWorkout;
        boolean z13 = this.sleepCoachV2;
        StringBuilder sb4 = new StringBuilder("UserPreferences(userId=");
        sb4.append(i13);
        sb4.append(", autoDetectWorkout=");
        sb4.append(z4);
        sb4.append(", sleepCoachV2=");
        return AbstractC18489d0.m53372m(sb4, z13, ")");
    }

    public /* synthetic */ UserPreferences(int i13, int i14, boolean z4, boolean z13, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.userId = 0;
        } else {
            this.userId = i14;
        }
        if ((i13 & 2) == 0) {
            this.autoDetectWorkout = false;
        } else {
            this.autoDetectWorkout = z4;
        }
        if ((i13 & 4) == 0) {
            this.sleepCoachV2 = false;
        } else {
            this.sleepCoachV2 = z13;
        }
    }

    public UserPreferences(int i13, boolean z4, boolean z13) {
        this.userId = i13;
        this.autoDetectWorkout = z4;
        this.sleepCoachV2 = z13;
    }

    public /* synthetic */ UserPreferences(int i13, boolean z4, boolean z13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i13, (i14 & 2) != 0 ? false : z4, (i14 & 4) != 0 ? false : z13);
    }
}
