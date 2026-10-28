package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.fido.common.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C4998a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return Transport.m15622b(parcel.readString());
        } catch (Transport.UnsupportedTransportException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i13) {
        return new Transport[i13];
    }
}
