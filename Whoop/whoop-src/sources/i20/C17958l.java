package i20;

import android.os.Parcel;
import android.os.Parcelable;
import h20.C16760x0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i20.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C17958l implements InterfaceC17961m {
    public static final Parcelable.Creator<C17958l> CREATOR = new C17925a(4);

    /* JADX INFO: renamed from: w */
    public final C16760x0 f69768w;

    public C17958l(C16760x0 c16760x0) {
        this.f69768w = c16760x0;
    }

    @Override // i20.InterfaceC17961m
    /* JADX INFO: renamed from: a */
    public final C16760x0 mo51573a() {
        return this.f69768w;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17958l) && AbstractC22676k.m65745e(this.f69768w, ((C17958l) obj).f69768w);
    }

    public final int hashCode() {
        C16760x0 c16760x0 = this.f69768w;
        if (c16760x0 == null) {
            return 0;
        }
        return c16760x0.hashCode();
    }

    public final String toString() {
        return "OnEnterManually(address=" + this.f69768w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        C16760x0 c16760x0 = this.f69768w;
        if (c16760x0 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c16760x0.writeToParcel(dest, i13);
        }
    }
}
