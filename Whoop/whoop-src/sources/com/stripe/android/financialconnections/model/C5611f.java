package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.stripe.android.financialconnections.model.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C5611f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AbstractC22676k.m65750j(parcel, "parcel");
        return new BalanceRefresh(parcel.readInt() == 0 ? null : BalanceRefresh.BalanceRefreshStatus.valueOf(parcel.readString()), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new BalanceRefresh[i13];
    }
}
