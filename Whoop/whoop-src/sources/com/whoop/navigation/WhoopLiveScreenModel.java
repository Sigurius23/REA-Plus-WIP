package com.whoop.navigation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002ABBg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Bk\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0012\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b(\u0010&J\u0012\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b)\u0010*Jp\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b-\u0010!J\u0010\u0010.\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u00020\r2\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b8\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b<\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b=\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b>\u0010&R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\b\u000e\u0010*¨\u0006C"}, m65681d2 = {"Lcom/whoop/navigation/WhoopLiveScreenModel;", "Lcom/whoop/navigation/CommonNavigationScreenModel;", "", "cycleId", "", "lowerBound", "upperBound", "", "dayStrain", "", "recoveryScore", "sleepMilliseconds", "calories", "", "isComplete", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/WhoopLiveScreenModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/Long;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/lang/Double;", "component5", "()Ljava/lang/Integer;", "component6", "component7", "component8", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/whoop/navigation/WhoopLiveScreenModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getCycleId", "Ljava/lang/String;", "getLowerBound", "getUpperBound", "Ljava/lang/Double;", "getDayStrain", "Ljava/lang/Integer;", "getRecoveryScore", "getSleepMilliseconds", "getCalories", "Ljava/lang/Boolean;", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WhoopLiveScreenModel implements CommonNavigationScreenModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Integer calories;
    private final Long cycleId;
    private final Double dayStrain;
    private final Boolean isComplete;
    private final String lowerBound;
    private final Integer recoveryScore;
    private final Long sleepMilliseconds;
    private final String upperBound;

    /* JADX INFO: renamed from: com.whoop.navigation.WhoopLiveScreenModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/WhoopLiveScreenModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/WhoopLiveScreenModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WhoopLiveScreenModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public WhoopLiveScreenModel() {
        this((Long) null, (String) null, (String) null, (Double) null, (Integer) null, (Long) null, (Integer) null, (Boolean) null, 255, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ WhoopLiveScreenModel copy$default(WhoopLiveScreenModel whoopLiveScreenModel, Long l7, String str, String str2, Double d3, Integer num, Long l12, Integer num2, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            l7 = whoopLiveScreenModel.cycleId;
        }
        if ((i13 & 2) != 0) {
            str = whoopLiveScreenModel.lowerBound;
        }
        if ((i13 & 4) != 0) {
            str2 = whoopLiveScreenModel.upperBound;
        }
        if ((i13 & 8) != 0) {
            d3 = whoopLiveScreenModel.dayStrain;
        }
        if ((i13 & 16) != 0) {
            num = whoopLiveScreenModel.recoveryScore;
        }
        if ((i13 & 32) != 0) {
            l12 = whoopLiveScreenModel.sleepMilliseconds;
        }
        if ((i13 & 64) != 0) {
            num2 = whoopLiveScreenModel.calories;
        }
        if ((i13 & 128) != 0) {
            bool = whoopLiveScreenModel.isComplete;
        }
        Integer num3 = num2;
        Boolean bool2 = bool;
        Integer num4 = num;
        Long l13 = l12;
        return whoopLiveScreenModel.copy(l7, str, str2, d3, num4, l13, num3, bool2);
    }

    public static final /* synthetic */ void write$Self$navigation_release(WhoopLiveScreenModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.cycleId != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, LongSerializer.INSTANCE, self.cycleId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.lowerBound != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.lowerBound);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.upperBound != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.upperBound);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.dayStrain != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, DoubleSerializer.INSTANCE, self.dayStrain);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.recoveryScore != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, IntSerializer.INSTANCE, self.recoveryScore);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.sleepMilliseconds != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, LongSerializer.INSTANCE, self.sleepMilliseconds);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.calories != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, IntSerializer.INSTANCE, self.calories);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.isComplete == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, BooleanSerializer.INSTANCE, self.isComplete);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getCycleId() {
        return this.cycleId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLowerBound() {
        return this.lowerBound;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUpperBound() {
        return this.upperBound;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getDayStrain() {
        return this.dayStrain;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getRecoveryScore() {
        return this.recoveryScore;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getSleepMilliseconds() {
        return this.sleepMilliseconds;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getCalories() {
        return this.calories;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getIsComplete() {
        return this.isComplete;
    }

    public final WhoopLiveScreenModel copy(Long cycleId, String lowerBound, String upperBound, Double dayStrain, Integer recoveryScore, Long sleepMilliseconds, Integer calories, Boolean isComplete) {
        return new WhoopLiveScreenModel(cycleId, lowerBound, upperBound, dayStrain, recoveryScore, sleepMilliseconds, calories, isComplete);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhoopLiveScreenModel)) {
            return false;
        }
        WhoopLiveScreenModel whoopLiveScreenModel = (WhoopLiveScreenModel) other;
        return AbstractC22676k.m65745e(this.cycleId, whoopLiveScreenModel.cycleId) && AbstractC22676k.m65745e(this.lowerBound, whoopLiveScreenModel.lowerBound) && AbstractC22676k.m65745e(this.upperBound, whoopLiveScreenModel.upperBound) && AbstractC22676k.m65745e(this.dayStrain, whoopLiveScreenModel.dayStrain) && AbstractC22676k.m65745e(this.recoveryScore, whoopLiveScreenModel.recoveryScore) && AbstractC22676k.m65745e(this.sleepMilliseconds, whoopLiveScreenModel.sleepMilliseconds) && AbstractC22676k.m65745e(this.calories, whoopLiveScreenModel.calories) && AbstractC22676k.m65745e(this.isComplete, whoopLiveScreenModel.isComplete);
    }

    public final Integer getCalories() {
        return this.calories;
    }

    public final Long getCycleId() {
        return this.cycleId;
    }

    public final Double getDayStrain() {
        return this.dayStrain;
    }

    public final String getLowerBound() {
        return this.lowerBound;
    }

    public final Integer getRecoveryScore() {
        return this.recoveryScore;
    }

    public final Long getSleepMilliseconds() {
        return this.sleepMilliseconds;
    }

    public final String getUpperBound() {
        return this.upperBound;
    }

    public int hashCode() {
        Long l7 = this.cycleId;
        int iHashCode = (l7 == null ? 0 : l7.hashCode()) * 31;
        String str = this.lowerBound;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.upperBound;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d3 = this.dayStrain;
        int iHashCode4 = (iHashCode3 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num = this.recoveryScore;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Long l12 = this.sleepMilliseconds;
        int iHashCode6 = (iHashCode5 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Integer num2 = this.calories;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.isComplete;
        return iHashCode7 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isComplete() {
        return this.isComplete;
    }

    public String toString() {
        return "WhoopLiveScreenModel(cycleId=" + this.cycleId + ", lowerBound=" + this.lowerBound + ", upperBound=" + this.upperBound + ", dayStrain=" + this.dayStrain + ", recoveryScore=" + this.recoveryScore + ", sleepMilliseconds=" + this.sleepMilliseconds + ", calories=" + this.calories + ", isComplete=" + this.isComplete + ")";
    }

    public /* synthetic */ WhoopLiveScreenModel(int i13, Long l7, String str, String str2, Double d3, Integer num, Long l12, Integer num2, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.cycleId = null;
        } else {
            this.cycleId = l7;
        }
        if ((i13 & 2) == 0) {
            this.lowerBound = null;
        } else {
            this.lowerBound = str;
        }
        if ((i13 & 4) == 0) {
            this.upperBound = null;
        } else {
            this.upperBound = str2;
        }
        if ((i13 & 8) == 0) {
            this.dayStrain = null;
        } else {
            this.dayStrain = d3;
        }
        if ((i13 & 16) == 0) {
            this.recoveryScore = null;
        } else {
            this.recoveryScore = num;
        }
        if ((i13 & 32) == 0) {
            this.sleepMilliseconds = null;
        } else {
            this.sleepMilliseconds = l12;
        }
        if ((i13 & 64) == 0) {
            this.calories = null;
        } else {
            this.calories = num2;
        }
        if ((i13 & 128) == 0) {
            this.isComplete = null;
        } else {
            this.isComplete = bool;
        }
    }

    public WhoopLiveScreenModel(Long l7, String str, String str2, Double d3, Integer num, Long l12, Integer num2, Boolean bool) {
        this.cycleId = l7;
        this.lowerBound = str;
        this.upperBound = str2;
        this.dayStrain = d3;
        this.recoveryScore = num;
        this.sleepMilliseconds = l12;
        this.calories = num2;
        this.isComplete = bool;
    }

    public /* synthetic */ WhoopLiveScreenModel(Long l7, String str, String str2, Double d3, Integer num, Long l12, Integer num2, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : l7, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : d3, (i13 & 16) != 0 ? null : num, (i13 & 32) != 0 ? null : l12, (i13 & 64) != 0 ? null : num2, (i13 & 128) != 0 ? null : bool);
    }
}
