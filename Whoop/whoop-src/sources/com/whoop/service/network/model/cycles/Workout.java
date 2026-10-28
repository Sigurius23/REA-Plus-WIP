package com.whoop.service.network.model.cycles;

import android.os.Parcel;
import android.os.Parcelable;
import or2.AbstractC28177l;
import p319m4.AbstractC25012a;
import uv0.AbstractC35283c;

/* JADX INFO: loaded from: classes10.dex */
public class Workout extends Activity implements Parcelable {
    public static final Parcelable.Creator<Workout> CREATOR = new Parcelable.Creator<Workout>() { // from class: com.whoop.service.network.model.cycles.Workout.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Workout createFromParcel(Parcel parcel) {
            return new Workout(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Workout[] newArray(int i13) {
            return new Workout[i13];
        }
    };
    private int averageHeartRate;
    private boolean gpsEnabled;
    private int kilocalories;
    private double kilojoules;
    private int maxHeartRate;
    private int sportId;

    public Workout() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAverageHeartRate() {
        return this.averageHeartRate;
    }

    @Override // com.whoop.service.network.model.cycles.Activity
    public int getDisplayNameResource() {
        return AbstractC35283c.f150186c;
    }

    public int getKilocalories() {
        if (this.kilocalories == 0) {
            this.kilocalories = AbstractC28177l.m85294d(this.kilojoules);
        }
        return this.kilocalories;
    }

    public double getKilojoules() {
        return this.kilojoules;
    }

    public int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    @Override // com.whoop.service.network.model.cycles.Activity
    public String getNameKey() {
        return "Workout";
    }

    public int getSportId() {
        return this.sportId;
    }

    public boolean isGpsEnabled() {
        return this.gpsEnabled;
    }

    @Override // com.whoop.service.network.model.cycles.Activity
    public String toString() {
        StringBuilder sb4 = new StringBuilder("Workout{sportId=");
        sb4.append(this.sportId);
        sb4.append(", kilojoules=");
        sb4.append(this.kilojoules);
        sb4.append(", kilocalories=");
        sb4.append(this.kilocalories);
        sb4.append(", maxHeartRate=");
        sb4.append(this.maxHeartRate);
        sb4.append(", averageHeartRate=");
        sb4.append(this.averageHeartRate);
        sb4.append(", super=");
        return AbstractC25012a.m73377j(sb4, super.toString(), '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.sportId);
        parcel.writeDouble(this.kilojoules);
        parcel.writeInt(this.kilocalories);
        parcel.writeInt(this.maxHeartRate);
        parcel.writeInt(this.averageHeartRate);
        parcel.writeByte(this.gpsEnabled ? (byte) 1 : (byte) 0);
        parcel.writeSerializable(getDuring());
    }

    public Workout(String str, double d3, Period period, String str2, boolean z4, Integer num, int i13, double d14, int i14, int i15, boolean z13) {
        super(0, str, d3, period, str2, z4, num);
        this.sportId = i13;
        this.kilojoules = d14;
        this.maxHeartRate = i14;
        this.averageHeartRate = i15;
        this.gpsEnabled = z13;
    }

    public Workout(String str, Period period, String str2, int i13, boolean z4) {
        super(0, str, period, str2);
        this.sportId = i13;
        this.gpsEnabled = z4;
    }

    public Workout(Parcel parcel) {
        this.sportId = parcel.readInt();
        this.kilojoules = parcel.readDouble();
        this.kilocalories = parcel.readInt();
        this.maxHeartRate = parcel.readInt();
        this.averageHeartRate = parcel.readInt();
        this.gpsEnabled = parcel.readByte() != 0;
        this.during = (Period) parcel.readSerializable();
    }
}
