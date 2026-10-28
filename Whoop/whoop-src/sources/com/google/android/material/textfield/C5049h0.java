package com.google.android.material.textfield;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.C1312k0;
import p544v5.AbstractC35701b;

/* JADX INFO: renamed from: com.google.android.material.textfield.h0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5049h0 extends AbstractC35701b {
    public static final Parcelable.Creator<C5049h0> CREATOR = new C1312k0(1);

    /* JADX INFO: renamed from: y */
    public CharSequence f21214y;

    /* JADX INFO: renamed from: z */
    public boolean f21215z;

    public C5049h0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f21214y = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f21215z = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f21214y) + "}";
    }

    @Override // p544v5.AbstractC35701b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        super.writeToParcel(parcel, i13);
        TextUtils.writeToParcel(this.f21214y, parcel, i13);
        parcel.writeInt(this.f21215z ? 1 : 0);
    }
}
