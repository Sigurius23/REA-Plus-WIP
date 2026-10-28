package com.whoop.service.network.model.achievements;

import com.google.gson.annotations.SerializedName;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/service/network/model/achievements/StreakValues;", "", "allTimeMax", "", "current", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAllTimeMax", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCurrent", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/whoop/service/network/model/achievements/StreakValues;", "equals", "", "other", "hashCode", "toString", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class StreakValues {

    @SerializedName("all_time_max")
    private final Integer allTimeMax;

    @SerializedName("current")
    private final Integer current;

    public StreakValues(Integer num, Integer num2) {
        this.allTimeMax = num;
        this.current = num2;
    }

    public static /* synthetic */ StreakValues copy$default(StreakValues streakValues, Integer num, Integer num2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = streakValues.allTimeMax;
        }
        if ((i13 & 2) != 0) {
            num2 = streakValues.current;
        }
        return streakValues.copy(num, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getAllTimeMax() {
        return this.allTimeMax;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getCurrent() {
        return this.current;
    }

    public final StreakValues copy(Integer allTimeMax, Integer current) {
        return new StreakValues(allTimeMax, current);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StreakValues)) {
            return false;
        }
        StreakValues streakValues = (StreakValues) other;
        return AbstractC22676k.m65745e(this.allTimeMax, streakValues.allTimeMax) && AbstractC22676k.m65745e(this.current, streakValues.current);
    }

    public final Integer getAllTimeMax() {
        return this.allTimeMax;
    }

    public final Integer getCurrent() {
        return this.current;
    }

    public int hashCode() {
        Integer num = this.allTimeMax;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.current;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "StreakValues(allTimeMax=" + this.allTimeMax + ", current=" + this.current + ")";
    }
}
