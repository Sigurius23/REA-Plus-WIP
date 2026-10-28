package p131f;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p126eq.C13433b;

/* JADX INFO: renamed from: f.d */
/* JADX INFO: loaded from: classes5.dex */
public class C13766d implements Parcelable {
    public static final Parcelable.Creator<C13766d> CREATOR = new C13433b(3);

    /* JADX INFO: renamed from: w */
    public InterfaceC13764b f49117w;

    /* JADX INFO: renamed from: b */
    public void mo3134b(int i13, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        synchronized (this) {
            try {
                if (this.f49117w == null) {
                    this.f49117w = new BinderC13765c(this);
                }
                parcel.writeStrongBinder(this.f49117w.asBinder());
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
