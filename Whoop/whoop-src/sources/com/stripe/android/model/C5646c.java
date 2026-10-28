package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.stripe.android.model.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C5646c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AbstractC22676k.m65750j(parcel, "parcel");
        return new ConsentUi.ConsentPane(parcel.readString(), ConsentUi.ConsentPane.ScopesSection.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new ConsentUi.ConsentPane[i13];
    }
}
