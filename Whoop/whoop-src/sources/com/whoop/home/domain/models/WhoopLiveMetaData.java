package com.whoop.home.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nB;\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ8\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b/\u0010\u001b¨\u00062"}, m65681d2 = {"Lcom/whoop/home/domain/models/WhoopLiveMetaData;", "", "", "dayStrain", "", "recoveryScore", "", "msOfSleep", "calories", "<init>", "(DIJI)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IDIJILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$home_release", "(Lcom/whoop/home/domain/models/WhoopLiveMetaData;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()D", "component2", "()I", "component3", "()J", "component4", "copy", "(DIJI)Lcom/whoop/home/domain/models/WhoopLiveMetaData;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getDayStrain", "I", "getRecoveryScore", "J", "getMsOfSleep", "getCalories", "Companion", "$serializer", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WhoopLiveMetaData {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("calories")
    private final int calories;

    @SerializedName("day_strain")
    private final double dayStrain;

    @SerializedName("ms_of_sleep")
    private final long msOfSleep;

    @SerializedName("recovery_score")
    private final int recoveryScore;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/home/domain/models/WhoopLiveMetaData$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/home/domain/models/WhoopLiveMetaData;", "serializer", "()Lwc3/c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WhoopLiveMetaData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public WhoopLiveMetaData(double d3, int i13, long j7, int i14) {
        this.dayStrain = d3;
        this.recoveryScore = i13;
        this.msOfSleep = j7;
        this.calories = i14;
    }

    public static /* synthetic */ WhoopLiveMetaData copy$default(WhoopLiveMetaData whoopLiveMetaData, double d3, int i13, long j7, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            d3 = whoopLiveMetaData.dayStrain;
        }
        double d14 = d3;
        if ((i15 & 2) != 0) {
            i13 = whoopLiveMetaData.recoveryScore;
        }
        int i16 = i13;
        if ((i15 & 4) != 0) {
            j7 = whoopLiveMetaData.msOfSleep;
        }
        long j13 = j7;
        if ((i15 & 8) != 0) {
            i14 = whoopLiveMetaData.calories;
        }
        return whoopLiveMetaData.copy(d14, i16, j13, i14);
    }

    public static final /* synthetic */ void write$Self$home_release(WhoopLiveMetaData self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeDoubleElement(serialDesc, 0, self.dayStrain);
        output.encodeIntElement(serialDesc, 1, self.recoveryScore);
        output.encodeLongElement(serialDesc, 2, self.msOfSleep);
        output.encodeIntElement(serialDesc, 3, self.calories);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getDayStrain() {
        return this.dayStrain;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRecoveryScore() {
        return this.recoveryScore;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getMsOfSleep() {
        return this.msOfSleep;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCalories() {
        return this.calories;
    }

    public final WhoopLiveMetaData copy(double dayStrain, int recoveryScore, long msOfSleep, int calories) {
        return new WhoopLiveMetaData(dayStrain, recoveryScore, msOfSleep, calories);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhoopLiveMetaData)) {
            return false;
        }
        WhoopLiveMetaData whoopLiveMetaData = (WhoopLiveMetaData) other;
        return Double.compare(this.dayStrain, whoopLiveMetaData.dayStrain) == 0 && this.recoveryScore == whoopLiveMetaData.recoveryScore && this.msOfSleep == whoopLiveMetaData.msOfSleep && this.calories == whoopLiveMetaData.calories;
    }

    public final int getCalories() {
        return this.calories;
    }

    public final double getDayStrain() {
        return this.dayStrain;
    }

    public final long getMsOfSleep() {
        return this.msOfSleep;
    }

    public final int getRecoveryScore() {
        return this.recoveryScore;
    }

    public int hashCode() {
        return Integer.hashCode(this.calories) + AbstractC11266d.m30451e(AbstractC11266d.m30448b(this.recoveryScore, Double.hashCode(this.dayStrain) * 31, 31), this.msOfSleep, 31);
    }

    public String toString() {
        double d3 = this.dayStrain;
        int i13 = this.recoveryScore;
        long j7 = this.msOfSleep;
        int i14 = this.calories;
        StringBuilder sb4 = new StringBuilder("WhoopLiveMetaData(dayStrain=");
        sb4.append(d3);
        sb4.append(", recoveryScore=");
        sb4.append(i13);
        AbstractC2875y.m8285A(sb4, ", msOfSleep=", j7, ", calories=");
        return AbstractC18489d0.m53371l(sb4, i14, ")");
    }

    public /* synthetic */ WhoopLiveMetaData(int i13, double d3, int i14, long j7, int i15, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, WhoopLiveMetaData$$serializer.INSTANCE.getDescriptor());
        }
        this.dayStrain = d3;
        this.recoveryScore = i14;
        this.msOfSleep = j7;
        this.calories = i15;
    }
}
