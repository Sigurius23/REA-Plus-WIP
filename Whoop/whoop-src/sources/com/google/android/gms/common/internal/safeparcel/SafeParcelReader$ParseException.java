package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcel;
import p000.AbstractC11266d;

/* JADX INFO: loaded from: classes6.dex */
public class SafeParcelReader$ParseException extends RuntimeException {
    public SafeParcelReader$ParseException(String str, Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        int iDataSize = parcel.dataSize();
        int length = String.valueOf(str).length();
        StringBuilder sb4 = new StringBuilder(length + 13 + String.valueOf(iDataPosition).length() + 6 + String.valueOf(iDataSize).length());
        AbstractC11266d.m30470x(iDataPosition, str, " Parcel: pos=", " size=", sb4);
        sb4.append(iDataSize);
        super(sb4.toString());
    }
}
