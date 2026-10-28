package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.stripe.android.financialconnections.model.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5612f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AbstractC22676k.m65750j(parcel, "parcel");
        return new FinancialConnectionsSession.StatusDetails(parcel.readInt() == 0 ? null : FinancialConnectionsSession.StatusDetails.Cancelled.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new FinancialConnectionsSession.StatusDetails[i13];
    }
}
