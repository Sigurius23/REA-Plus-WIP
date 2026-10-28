package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import nh3.AbstractC26725a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.stripe.android.model.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C5659n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AbstractC22676k.m65750j(parcel, "parcel");
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        String string6 = parcel.readString();
        int i13 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i13);
        int iM79498b = 0;
        while (iM79498b != i13) {
            iM79498b = AbstractC26725a.m79498b(ConsumerSession.VerificationSession.CREATOR, parcel, arrayList, iM79498b, 1);
        }
        return new ConsumerSession(string, string2, string3, string4, string5, string6, arrayList, parcel.readInt() == 0 ? null : MobileFallbackWebviewParams.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new ConsumerSession[i13];
    }
}
