package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p023ay.C2125b;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends AbstractC36219a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C2125b(10);

    /* JADX INFO: renamed from: w */
    public final int f20486w;

    /* JADX INFO: renamed from: x */
    public final String f20487x;

    public Scope(int i13, String str) {
        AbstractC35135w.m111093e(str, "scopeUri must not be null or empty");
        this.f20486w = i13;
        this.f20487x = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f20487x.equals(((Scope) obj).f20487x);
    }

    public final int hashCode() {
        return this.f20487x.hashCode();
    }

    public final String toString() {
        return this.f20487x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(this.f20486w);
        AbstractC36221c.m115332m(parcel, 2, this.f20487x);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
