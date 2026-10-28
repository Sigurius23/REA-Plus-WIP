package pn;

import in.InterfaceC18714b;

/* JADX INFO: renamed from: pn.c */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC29369c implements InterfaceC18714b {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        return simpleName.length() != 0 ? "SCTE-35 splice command: type=".concat(simpleName) : new String("SCTE-35 splice command: type=");
    }
}
