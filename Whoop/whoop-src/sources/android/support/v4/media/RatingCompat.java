package android.support.v4.media;

import a10.C0113a;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"BanParcelableUsage"})
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0113a(23);

    /* JADX INFO: renamed from: w */
    public final int f4152w;

    /* JADX INFO: renamed from: x */
    public final float f4153x;

    public RatingCompat(int i13, float f13) {
        this.f4152w = i13;
        this.f4153x = f13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f4152w;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Rating:style=");
        sb4.append(this.f4152w);
        sb4.append(" rating=");
        float f13 = this.f4153x;
        sb4.append(f13 < 0.0f ? "unrated" : String.valueOf(f13));
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f4152w);
        parcel.writeFloat(this.f4153x);
    }
}
