package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: y00.o3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38914o3 implements InterfaceC38932q3 {
    public static final Parcelable.Creator<C38914o3> CREATOR = new C38967u2(11);

    /* JADX INFO: renamed from: w */
    public final long f167510w;

    public C38914o3(long j7) {
        this.f167510w = j7;
    }

    @Override // y00.InterfaceC38932q3
    /* JADX INFO: renamed from: I */
    public final boolean mo124361I() {
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38914o3) && this.f167510w == ((C38914o3) obj).f167510w;
    }

    public final int hashCode() {
        return Long.hashCode(this.f167510w);
    }

    public final String toString() {
        return AbstractC31061c.m95636l(this.f167510w, "Poll(pollingDuration=", ")");
    }

    @Override // y00.InterfaceC38932q3
    /* JADX INFO: renamed from: u */
    public final long mo124362u() {
        return this.f167510w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeLong(this.f167510w);
    }
}
