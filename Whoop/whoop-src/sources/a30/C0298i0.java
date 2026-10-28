package a30;

import a10.C0113a;
import android.os.Parcel;
import android.os.Parcelable;
import j00.EnumC21096d0;
import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a30.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C0298i0 implements InterfaceC0301j0 {
    public static final Parcelable.Creator<C0298i0> CREATOR = new C0113a(11);

    /* JADX INFO: renamed from: w */
    public final EnumC21096d0 f1037w;

    public C0298i0(EnumC21096d0 mode) {
        AbstractC22676k.m65750j(mode, "mode");
        this.f1037w = mode;
    }

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
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0298i0) && this.f1037w == ((C0298i0) obj).f1037w;
    }

    @Override // a30.InterfaceC0301j0
    /* JADX INFO: renamed from: g */
    public final EnumC21096d0 mo823g() {
        return this.f1037w;
    }

    public final int hashCode() {
        return this.f1037w.hashCode();
    }

    public final String toString() {
        return "Enabled(mode=" + this.f1037w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f1037w.name());
    }
}
