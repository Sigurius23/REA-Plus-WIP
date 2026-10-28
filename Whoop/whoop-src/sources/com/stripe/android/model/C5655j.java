package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.stripe.android.model.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C5655j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AbstractC22676k.m65750j(parcel, "parcel");
        return new ConsentUi(parcel.readInt() == 0 ? null : ConsentUi.ConsentPane.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ConsentUi.ConsentSection.CREATOR.createFromParcel(parcel) : null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new ConsentUi[i13];
    }
}
