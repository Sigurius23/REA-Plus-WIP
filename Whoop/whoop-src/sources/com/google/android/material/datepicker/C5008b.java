package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import p023ay.C2125b;

/* JADX INFO: renamed from: com.google.android.material.datepicker.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C5008b implements Parcelable {
    public static final Parcelable.Creator<C5008b> CREATOR = new C2125b(11);

    /* JADX INFO: renamed from: E */
    public final int f20892E;

    /* JADX INFO: renamed from: F */
    public final int f20893F;

    /* JADX INFO: renamed from: G */
    public final int f20894G;

    /* JADX INFO: renamed from: w */
    public final C5023q f20895w;

    /* JADX INFO: renamed from: x */
    public final C5023q f20896x;

    /* JADX INFO: renamed from: y */
    public final C5010d f20897y;

    /* JADX INFO: renamed from: z */
    public final C5023q f20898z;

    public C5008b(C5023q c5023q, C5023q c5023q2, C5010d c5010d, C5023q c5023q3, int i13) {
        Objects.requireNonNull(c5023q, "start cannot be null");
        Objects.requireNonNull(c5023q2, "end cannot be null");
        Objects.requireNonNull(c5010d, "validator cannot be null");
        this.f20895w = c5023q;
        this.f20896x = c5023q2;
        this.f20898z = c5023q3;
        this.f20892E = i13;
        this.f20897y = c5010d;
        if (c5023q3 != null && c5023q.f20963w.compareTo(c5023q3.f20963w) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c5023q3 != null && c5023q3.f20963w.compareTo(c5023q2.f20963w) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i13 < 0 || i13 > AbstractC5031y.m15762c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f20894G = c5023q.m15756i(c5023q2) + 1;
        this.f20893F = (c5023q2.f20965y - c5023q.f20965y) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5008b)) {
            return false;
        }
        C5008b c5008b = (C5008b) obj;
        return this.f20895w.equals(c5008b.f20895w) && this.f20896x.equals(c5008b.f20896x) && Objects.equals(this.f20898z, c5008b.f20898z) && this.f20892E == c5008b.f20892E && this.f20897y.equals(c5008b.f20897y);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20895w, this.f20896x, this.f20898z, Integer.valueOf(this.f20892E), this.f20897y});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeParcelable(this.f20895w, 0);
        parcel.writeParcelable(this.f20896x, 0);
        parcel.writeParcelable(this.f20898z, 0);
        parcel.writeParcelable(this.f20897y, 0);
        parcel.writeInt(this.f20892E);
    }
}
