package com.whoop.journal.model;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb0.AbstractC39383f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u000bJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b&\u0010\u0013¨\u0006'"}, m65681d2 = {"Lcom/whoop/journal/model/CurrentCycle;", "Landroid/os/Parcelable;", "", "todayCycleStartTime", "todayCycleEndTime", "previousCycleStartTime", "previousCycleEndTime", "<init>", "(JJJJ)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()J", "component2", "component3", "component4", "copy", "(JJJJ)Lcom/whoop/journal/model/CurrentCycle;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTodayCycleStartTime", "getTodayCycleEndTime", "getPreviousCycleStartTime", "getPreviousCycleEndTime", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class CurrentCycle implements Parcelable {
    public static final Parcelable.Creator<CurrentCycle> CREATOR = new Creator();
    private final long previousCycleEndTime;
    private final long previousCycleStartTime;
    private final long todayCycleEndTime;
    private final long todayCycleStartTime;

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<CurrentCycle> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrentCycle createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new CurrentCycle(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrentCycle[] newArray(int i13) {
            return new CurrentCycle[i13];
        }
    }

    public CurrentCycle() {
        this(0L, 0L, 0L, 0L, 15, null);
    }

    public static /* synthetic */ CurrentCycle copy$default(CurrentCycle currentCycle, long j7, long j13, long j14, long j15, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = currentCycle.todayCycleStartTime;
        }
        long j16 = j7;
        if ((i13 & 2) != 0) {
            j13 = currentCycle.todayCycleEndTime;
        }
        long j17 = j13;
        if ((i13 & 4) != 0) {
            j14 = currentCycle.previousCycleStartTime;
        }
        return currentCycle.copy(j16, j17, j14, (i13 & 8) != 0 ? currentCycle.previousCycleEndTime : j15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTodayCycleStartTime() {
        return this.todayCycleStartTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTodayCycleEndTime() {
        return this.todayCycleEndTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getPreviousCycleStartTime() {
        return this.previousCycleStartTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getPreviousCycleEndTime() {
        return this.previousCycleEndTime;
    }

    public final CurrentCycle copy(long todayCycleStartTime, long todayCycleEndTime, long previousCycleStartTime, long previousCycleEndTime) {
        return new CurrentCycle(todayCycleStartTime, todayCycleEndTime, previousCycleStartTime, previousCycleEndTime);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentCycle)) {
            return false;
        }
        CurrentCycle currentCycle = (CurrentCycle) other;
        return this.todayCycleStartTime == currentCycle.todayCycleStartTime && this.todayCycleEndTime == currentCycle.todayCycleEndTime && this.previousCycleStartTime == currentCycle.previousCycleStartTime && this.previousCycleEndTime == currentCycle.previousCycleEndTime;
    }

    public final long getPreviousCycleEndTime() {
        return this.previousCycleEndTime;
    }

    public final long getPreviousCycleStartTime() {
        return this.previousCycleStartTime;
    }

    public final long getTodayCycleEndTime() {
        return this.todayCycleEndTime;
    }

    public final long getTodayCycleStartTime() {
        return this.todayCycleStartTime;
    }

    public int hashCode() {
        return Long.hashCode(this.previousCycleEndTime) + AbstractC11266d.m30451e(AbstractC11266d.m30451e(Long.hashCode(this.todayCycleStartTime) * 31, this.todayCycleEndTime, 31), this.previousCycleStartTime, 31);
    }

    public String toString() {
        long j7 = this.todayCycleStartTime;
        long j13 = this.todayCycleEndTime;
        long j14 = this.previousCycleStartTime;
        long j15 = this.previousCycleEndTime;
        StringBuilder sbM125596b = AbstractC39383f.m125596b(j7, "CurrentCycle(todayCycleStartTime=", ", todayCycleEndTime=");
        sbM125596b.append(j13);
        AbstractC2875y.m8285A(sbM125596b, ", previousCycleStartTime=", j14, ", previousCycleEndTime=");
        return AbstractC11266d.m30457k(j15, ")", sbM125596b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeLong(this.todayCycleStartTime);
        dest.writeLong(this.todayCycleEndTime);
        dest.writeLong(this.previousCycleStartTime);
        dest.writeLong(this.previousCycleEndTime);
    }

    public CurrentCycle(long j7, long j13, long j14, long j15) {
        this.todayCycleStartTime = j7;
        this.todayCycleEndTime = j13;
        this.previousCycleStartTime = j14;
        this.previousCycleEndTime = j15;
    }

    public /* synthetic */ CurrentCycle(long j7, long j13, long j14, long j15, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? -1L : j7, (i13 & 2) != 0 ? -1L : j13, (i13 & 4) != 0 ? -1L : j14, (i13 & 8) != 0 ? -1L : j15);
    }
}
