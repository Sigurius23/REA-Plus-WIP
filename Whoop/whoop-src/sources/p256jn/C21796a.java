package p256jn;

import android.os.Parcel;
import android.os.Parcelable;
import gp.C16054r0;
import in.InterfaceC18714b;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: jn.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C21796a implements InterfaceC18714b {
    public static final Parcelable.Creator<C21796a> CREATOR = new C16054r0(21);

    /* JADX INFO: renamed from: w */
    public final int f83950w;

    /* JADX INFO: renamed from: x */
    public final String f83951x;

    public C21796a(int i13, String str) {
        this.f83950w = i13;
        this.f83951x = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str = this.f83951x;
        StringBuilder sb4 = new StringBuilder(AbstractC30007c.m91832b(33, str));
        sb4.append("Ait(controlCode=");
        sb4.append(this.f83950w);
        sb4.append(",url=");
        sb4.append(str);
        sb4.append(")");
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f83951x);
        parcel.writeInt(this.f83950w);
    }
}
