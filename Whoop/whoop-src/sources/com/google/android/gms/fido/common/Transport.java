package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import mp.C25770g1;
import p088dc.AbstractC11895b;

/* JADX INFO: loaded from: classes6.dex */
public enum Transport implements ReflectedParcelable {
    /* JADX INFO: Fake field, exist only in values array */
    BLUETOOTH_CLASSIC("bt"),
    /* JADX INFO: Fake field, exist only in values array */
    BLUETOOTH_LOW_ENERGY("ble"),
    /* JADX INFO: Fake field, exist only in values array */
    NFC("nfc"),
    /* JADX INFO: Fake field, exist only in values array */
    USB("usb"),
    /* JADX INFO: Fake field, exist only in values array */
    INTERNAL("internal"),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID("cable"),
    /* JADX INFO: Fake field, exist only in values array */
    HYBRID_V2("hybrid");

    public static final Parcelable.Creator<Transport> CREATOR = new C4998a();

    /* JADX INFO: renamed from: w */
    public final String f20554w;

    public static class UnsupportedTransportException extends Exception {
    }

    Transport(String str) {
        this.f20554w = str;
    }

    /* JADX INFO: renamed from: b */
    public static Transport m15622b(String str) throws UnsupportedTransportException {
        if (str.equals("hybrid")) {
            C25770g1.f101484a.m40835f();
            throw null;
        }
        for (Transport transport : values()) {
            if (str.equals(transport.f20554w)) {
                return transport;
            }
        }
        throw new UnsupportedTransportException(AbstractC11895b.m31996o("Transport ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f20554w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f20554w);
    }
}
