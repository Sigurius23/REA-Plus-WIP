package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p023ay.C2125b;

/* JADX INFO: renamed from: com.google.android.material.datepicker.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C5010d implements Parcelable {
    public static final Parcelable.Creator<C5010d> CREATOR = new C2125b(12);

    /* JADX INFO: renamed from: w */
    public final long f20901w;

    public C5010d(long j7) {
        this.f20901w = j7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5010d) && this.f20901w == ((C5010d) obj).f20901w;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f20901w)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeLong(this.f20901w);
    }
}
