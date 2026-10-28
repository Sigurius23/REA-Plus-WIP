package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import nh3.AbstractC26725a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.stripe.android.model.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C5650e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        AbstractC22676k.m65750j(parcel, "parcel");
        String string = parcel.readString();
        int i13 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i13);
        int iM79498b = 0;
        while (iM79498b != i13) {
            iM79498b = AbstractC26725a.m79498b(ConsentUi.ConsentPane.ScopesSection.Scope.CREATOR, parcel, arrayList, iM79498b, 1);
        }
        return new ConsentUi.ConsentPane.ScopesSection(string, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        return new ConsentUi.ConsentPane.ScopesSection[i13];
    }
}
