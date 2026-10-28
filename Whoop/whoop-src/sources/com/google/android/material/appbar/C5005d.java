package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;
import p544v5.AbstractC35701b;

/* JADX INFO: renamed from: com.google.android.material.appbar.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C5005d extends AbstractC35701b {
    public static final Parcelable.Creator<C5005d> CREATOR = new C5004c();

    /* JADX INFO: renamed from: E */
    public int f20752E;

    /* JADX INFO: renamed from: F */
    public float f20753F;

    /* JADX INFO: renamed from: G */
    public boolean f20754G;

    /* JADX INFO: renamed from: y */
    public boolean f20755y;

    /* JADX INFO: renamed from: z */
    public boolean f20756z;

    public C5005d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f20755y = parcel.readByte() != 0;
        this.f20756z = parcel.readByte() != 0;
        this.f20752E = parcel.readInt();
        this.f20753F = parcel.readFloat();
        this.f20754G = parcel.readByte() != 0;
    }

    @Override // p544v5.AbstractC35701b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        super.writeToParcel(parcel, i13);
        parcel.writeByte(this.f20755y ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f20756z ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f20752E);
        parcel.writeFloat(this.f20753F);
        parcel.writeByte(this.f20754G ? (byte) 1 : (byte) 0);
    }
}
