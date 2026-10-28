package com.stripe.android.p056ui.core.elements;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.uicore.elements.IdentifierSpec;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.stripe.android.ui.core.elements.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C5697v implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AbstractC22676k.m65750j(parcel, "parcel");
        return new PlaceholderSpec((IdentifierSpec) parcel.readParcelable(PlaceholderSpec.class.getClassLoader()), PlaceholderSpec.PlaceholderField.valueOf(parcel.readString()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new PlaceholderSpec[i13];
    }
}
