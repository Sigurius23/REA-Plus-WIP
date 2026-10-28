package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.n3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38905n3 implements InterfaceC38932q3 {

    /* JADX INFO: renamed from: w */
    public static final C38905n3 f167476w = new C38905n3();
    public static final Parcelable.Creator<C38905n3> CREATOR = new C38967u2(10);

    @Override // y00.InterfaceC38932q3
    /* JADX INFO: renamed from: I */
    public final boolean mo124361I() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // y00.InterfaceC38932q3
    /* JADX INFO: renamed from: u */
    public final long mo124362u() {
        return 15000L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
