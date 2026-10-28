package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.stripe.android.financialconnections.model.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C5634x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AbstractC22676k.m65750j(parcel, "parcel");
        return new FinancialConnectionsSession(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : FinancialConnectionsAccountList.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FinancialConnectionsAccountList.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (PaymentAccount) parcel.readParcelable(FinancialConnectionsSession.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ManualEntry.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FinancialConnectionsSession.Status.valueOf(parcel.readString()), parcel.readInt() != 0 ? FinancialConnectionsSession.StatusDetails.CREATOR.createFromParcel(parcel) : null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new FinancialConnectionsSession[i13];
    }
}
