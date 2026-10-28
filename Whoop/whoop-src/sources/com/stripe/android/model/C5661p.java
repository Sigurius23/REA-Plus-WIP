package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.stripe.android.model.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C5661p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AbstractC22676k.m65750j(parcel, "parcel");
        return new ConsumerSession.VerificationSession(EnumC5667v.CREATOR.createFromParcel(parcel), EnumC5664s.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new ConsumerSession.VerificationSession[i13];
    }
}
