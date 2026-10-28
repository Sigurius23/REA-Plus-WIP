package com.whoop.domain.bootstrap.dto;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0017J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\u0017¨\u0006-"}, m65681d2 = {"Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;", "", "", "maxHeartRate", "minHeartRate", "restingHeartRate", "recoveryCount", "<init>", "(IIII)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "component3", "component4", "copy", "(IIII)Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMaxHeartRate", "getMinHeartRate", "getRestingHeartRate", "getRecoveryCount", "Companion", "$serializer", "a", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UserBioDataBootstrapDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("max_heart_rate")
    private final int maxHeartRate;

    @SerializedName("min_heart_rate")
    private final int minHeartRate;

    @SerializedName("recovery_count")
    private final int recoveryCount;

    @SerializedName("resting_heart_rate")
    private final int restingHeartRate;

    /* JADX INFO: renamed from: com.whoop.domain.bootstrap.dto.UserBioDataBootstrapDto$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/domain/bootstrap/dto/UserBioDataBootstrapDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return UserBioDataBootstrapDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public UserBioDataBootstrapDto() {
        this(0, 0, 0, 0, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ UserBioDataBootstrapDto copy$default(UserBioDataBootstrapDto userBioDataBootstrapDto, int i13, int i14, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i13 = userBioDataBootstrapDto.maxHeartRate;
        }
        if ((i17 & 2) != 0) {
            i14 = userBioDataBootstrapDto.minHeartRate;
        }
        if ((i17 & 4) != 0) {
            i15 = userBioDataBootstrapDto.restingHeartRate;
        }
        if ((i17 & 8) != 0) {
            i16 = userBioDataBootstrapDto.recoveryCount;
        }
        return userBioDataBootstrapDto.copy(i13, i14, i15, i16);
    }

    public static final /* synthetic */ void write$Self$core_release(UserBioDataBootstrapDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.maxHeartRate != 0) {
            output.encodeIntElement(serialDesc, 0, self.maxHeartRate);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.minHeartRate != 0) {
            output.encodeIntElement(serialDesc, 1, self.minHeartRate);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.restingHeartRate != 0) {
            output.encodeIntElement(serialDesc, 2, self.restingHeartRate);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.recoveryCount == 0) {
            return;
        }
        output.encodeIntElement(serialDesc, 3, self.recoveryCount);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMinHeartRate() {
        return this.minHeartRate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRestingHeartRate() {
        return this.restingHeartRate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getRecoveryCount() {
        return this.recoveryCount;
    }

    public final UserBioDataBootstrapDto copy(int maxHeartRate, int minHeartRate, int restingHeartRate, int recoveryCount) {
        return new UserBioDataBootstrapDto(maxHeartRate, minHeartRate, restingHeartRate, recoveryCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserBioDataBootstrapDto)) {
            return false;
        }
        UserBioDataBootstrapDto userBioDataBootstrapDto = (UserBioDataBootstrapDto) other;
        return this.maxHeartRate == userBioDataBootstrapDto.maxHeartRate && this.minHeartRate == userBioDataBootstrapDto.minHeartRate && this.restingHeartRate == userBioDataBootstrapDto.restingHeartRate && this.recoveryCount == userBioDataBootstrapDto.recoveryCount;
    }

    public final int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public final int getMinHeartRate() {
        return this.minHeartRate;
    }

    public final int getRecoveryCount() {
        return this.recoveryCount;
    }

    public final int getRestingHeartRate() {
        return this.restingHeartRate;
    }

    public int hashCode() {
        return Integer.hashCode(this.recoveryCount) + AbstractC11266d.m30448b(this.restingHeartRate, AbstractC11266d.m30448b(this.minHeartRate, Integer.hashCode(this.maxHeartRate) * 31, 31), 31);
    }

    public String toString() {
        int i13 = this.maxHeartRate;
        int i14 = this.minHeartRate;
        return AbstractC26725a.m79505i(AbstractC11266d.m30465s(i13, i14, "UserBioDataBootstrapDto(maxHeartRate=", ", minHeartRate=", ", restingHeartRate="), this.restingHeartRate, ", recoveryCount=", this.recoveryCount, ")");
    }

    public UserBioDataBootstrapDto(int i13, int i14, int i15, int i16) {
        this.maxHeartRate = i13;
        this.minHeartRate = i14;
        this.restingHeartRate = i15;
        this.recoveryCount = i16;
    }

    public /* synthetic */ UserBioDataBootstrapDto(int i13, int i14, int i15, int i16, int i17, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.maxHeartRate = 0;
        } else {
            this.maxHeartRate = i14;
        }
        if ((i13 & 2) == 0) {
            this.minHeartRate = 0;
        } else {
            this.minHeartRate = i15;
        }
        if ((i13 & 4) == 0) {
            this.restingHeartRate = 0;
        } else {
            this.restingHeartRate = i16;
        }
        if ((i13 & 8) == 0) {
            this.recoveryCount = 0;
        } else {
            this.recoveryCount = i17;
        }
    }

    public /* synthetic */ UserBioDataBootstrapDto(int i13, int i14, int i15, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this((i17 & 1) != 0 ? 0 : i13, (i17 & 2) != 0 ? 0 : i14, (i17 & 4) != 0 ? 0 : i15, (i17 & 8) != 0 ? 0 : i16);
    }
}
