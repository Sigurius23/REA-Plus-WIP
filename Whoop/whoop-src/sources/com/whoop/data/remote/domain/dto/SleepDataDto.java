package com.whoop.data.remote.domain.dto;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0016J\u001a\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0018¨\u0006("}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/SleepDataDto;", "", "", "recoveryScore", "", "calibrating", "<init>", "(IZ)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/SleepDataDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "()Z", "copy", "(IZ)Lcom/whoop/data/remote/domain/dto/SleepDataDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getRecoveryScore", "Z", "getCalibrating", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SleepDataDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("calibrating")
    private final boolean calibrating;

    @SerializedName("recovery_score")
    private final int recoveryScore;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/SleepDataDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/SleepDataDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SleepDataDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SleepDataDto(int i13, int i14, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, SleepDataDto$$serializer.INSTANCE.getDescriptor());
        }
        this.recoveryScore = i14;
        this.calibrating = z4;
    }

    public static /* synthetic */ SleepDataDto copy$default(SleepDataDto sleepDataDto, int i13, boolean z4, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = sleepDataDto.recoveryScore;
        }
        if ((i14 & 2) != 0) {
            z4 = sleepDataDto.calibrating;
        }
        return sleepDataDto.copy(i13, z4);
    }

    public static final /* synthetic */ void write$Self$core_release(SleepDataDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.recoveryScore);
        output.encodeBooleanElement(serialDesc, 1, self.calibrating);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRecoveryScore() {
        return this.recoveryScore;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getCalibrating() {
        return this.calibrating;
    }

    public final SleepDataDto copy(int recoveryScore, boolean calibrating) {
        return new SleepDataDto(recoveryScore, calibrating);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepDataDto)) {
            return false;
        }
        SleepDataDto sleepDataDto = (SleepDataDto) other;
        return this.recoveryScore == sleepDataDto.recoveryScore && this.calibrating == sleepDataDto.calibrating;
    }

    public final boolean getCalibrating() {
        return this.calibrating;
    }

    public final int getRecoveryScore() {
        return this.recoveryScore;
    }

    public int hashCode() {
        return Boolean.hashCode(this.calibrating) + (Integer.hashCode(this.recoveryScore) * 31);
    }

    public String toString() {
        return "SleepDataDto(recoveryScore=" + this.recoveryScore + ", calibrating=" + this.calibrating + ")";
    }

    public SleepDataDto(int i13, boolean z4) {
        this.recoveryScore = i13;
        this.calibrating = z4;
    }
}
