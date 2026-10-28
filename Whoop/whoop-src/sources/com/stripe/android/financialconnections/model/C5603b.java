package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.stripe.android.financialconnections.model.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C5603b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AbstractC22676k.m65750j(parcel, "parcel");
        int i13 = parcel.readInt();
        int i14 = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
        for (int i15 = 0; i15 != i14; i15++) {
            linkedHashMap.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
        }
        return new Balance(i13, linkedHashMap, Balance.Type.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : CashBalance.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CreditBalance.CREATOR.createFromParcel(parcel) : null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new Balance[i13];
    }
}
