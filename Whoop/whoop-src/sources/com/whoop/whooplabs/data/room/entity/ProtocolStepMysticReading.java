package com.whoop.whooplabs.data.room.entity;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import org.joda.time.Instant;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J@\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000bJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b(\u0010\u0015¨\u0006)"}, m65681d2 = {"Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;", "Landroid/os/Parcelable;", "Lorg/joda/time/Instant;", "timestamp", "", "systolic", "diastolic", "heartRate", "<init>", "(Lorg/joda/time/Instant;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lorg/joda/time/Instant;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "copy", "(Lorg/joda/time/Instant;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lorg/joda/time/Instant;", "getTimestamp", "Ljava/lang/Integer;", "getSystolic", "getDiastolic", "getHeartRate", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class ProtocolStepMysticReading implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ProtocolStepMysticReading> CREATOR = new Creator();
    private final Integer diastolic;
    private final Integer heartRate;
    private final Integer systolic;
    private final Instant timestamp;

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<ProtocolStepMysticReading> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProtocolStepMysticReading createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new ProtocolStepMysticReading((Instant) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProtocolStepMysticReading[] newArray(int i13) {
            return new ProtocolStepMysticReading[i13];
        }
    }

    public ProtocolStepMysticReading() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ ProtocolStepMysticReading copy$default(ProtocolStepMysticReading protocolStepMysticReading, Instant instant, Integer num, Integer num2, Integer num3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            instant = protocolStepMysticReading.timestamp;
        }
        if ((i13 & 2) != 0) {
            num = protocolStepMysticReading.systolic;
        }
        if ((i13 & 4) != 0) {
            num2 = protocolStepMysticReading.diastolic;
        }
        if ((i13 & 8) != 0) {
            num3 = protocolStepMysticReading.heartRate;
        }
        return protocolStepMysticReading.copy(instant, num, num2, num3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Instant getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getSystolic() {
        return this.systolic;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getDiastolic() {
        return this.diastolic;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getHeartRate() {
        return this.heartRate;
    }

    public final ProtocolStepMysticReading copy(Instant timestamp, Integer systolic, Integer diastolic, Integer heartRate) {
        return new ProtocolStepMysticReading(timestamp, systolic, diastolic, heartRate);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProtocolStepMysticReading)) {
            return false;
        }
        ProtocolStepMysticReading protocolStepMysticReading = (ProtocolStepMysticReading) other;
        return AbstractC22676k.m65745e(this.timestamp, protocolStepMysticReading.timestamp) && AbstractC22676k.m65745e(this.systolic, protocolStepMysticReading.systolic) && AbstractC22676k.m65745e(this.diastolic, protocolStepMysticReading.diastolic) && AbstractC22676k.m65745e(this.heartRate, protocolStepMysticReading.heartRate);
    }

    public final Integer getDiastolic() {
        return this.diastolic;
    }

    public final Integer getHeartRate() {
        return this.heartRate;
    }

    public final Integer getSystolic() {
        return this.systolic;
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        Instant instant = this.timestamp;
        int iHashCode = (instant == null ? 0 : instant.hashCode()) * 31;
        Integer num = this.systolic;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.diastolic;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.heartRate;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        return "ProtocolStepMysticReading(timestamp=" + this.timestamp + ", systolic=" + this.systolic + ", diastolic=" + this.diastolic + ", heartRate=" + this.heartRate + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeSerializable(this.timestamp);
        Integer num = this.systolic;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        Integer num2 = this.diastolic;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num2);
        }
        Integer num3 = this.heartRate;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num3);
        }
    }

    public ProtocolStepMysticReading(Instant instant, Integer num, Integer num2, Integer num3) {
        this.timestamp = instant;
        this.systolic = num;
        this.diastolic = num2;
        this.heartRate = num3;
    }

    public /* synthetic */ ProtocolStepMysticReading(Instant instant, Integer num, Integer num2, Integer num3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : instant, (i13 & 2) != 0 ? null : num, (i13 & 4) != 0 ? null : num2, (i13 & 8) != 0 ? null : num3);
    }
}
