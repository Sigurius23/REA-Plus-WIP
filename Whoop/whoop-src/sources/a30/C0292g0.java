package a30;

import a10.C0113a;
import android.os.Parcel;
import android.os.Parcelable;
import j00.EnumC21096d0;
import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a30.g0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C0292g0 implements InterfaceC0301j0 {

    /* JADX INFO: renamed from: w */
    public static final C0292g0 f1025w = new C0292g0();
    public static final Parcelable.Creator<C0292g0> CREATOR = new C0113a(9);

    @Override // a30.InterfaceC0301j0
    /* JADX INFO: renamed from: P */
    public final List mo822P() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C0292g0);
    }

    @Override // a30.InterfaceC0301j0
    /* JADX INFO: renamed from: g */
    public final EnumC21096d0 mo823g() {
        return null;
    }

    public final int hashCode() {
        return 222586717;
    }

    public final String toString() {
        return "AlreadyRegistered";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
