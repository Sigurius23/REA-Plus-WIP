package p308ln;

import android.os.Parcel;
import android.os.Parcelable;
import in.InterfaceC18714b;
import p000.AbstractC11266d;
import p266jz.C22060h;
import p309lo.AbstractC24567y;
import p465rm.C31548l0;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: ln.b */
/* JADX INFO: loaded from: classes6.dex */
public class C24520b implements InterfaceC18714b {
    public static final Parcelable.Creator<C24520b> CREATOR = new C22060h(23);

    /* JADX INFO: renamed from: w */
    public final String f95680w;

    /* JADX INFO: renamed from: x */
    public final String f95681x;

    public C24520b(String str, String str2) {
        this.f95680w = str;
        this.f95681x = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C24520b c24520b = (C24520b) obj;
            if (this.f95680w.equals(c24520b.f95680w) && this.f95681x.equals(c24520b.f95681x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f95681x.hashCode() + AbstractC11266d.m30450d(527, 31, this.f95680w);
    }

    public final String toString() {
        String str = this.f95680w;
        int iM91832b = AbstractC30007c.m91832b(5, str);
        String str2 = this.f95681x;
        StringBuilder sb4 = new StringBuilder(AbstractC30007c.m91832b(iM91832b, str2));
        sb4.append("VC: ");
        sb4.append(str);
        sb4.append("=");
        sb4.append(str2);
        return sb4.toString();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // in.InterfaceC18714b
    /* JADX INFO: renamed from: w */
    public final void mo54416w(C31548l0 c31548l0) {
        String str = this.f95680w;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    b = 0;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    b = 1;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    b = 2;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    b = 3;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    b = 4;
                }
                break;
        }
        String str2 = this.f95681x;
        switch (b) {
            case 0:
                c31548l0.f130221c = str2;
                break;
            case 1:
                c31548l0.f130219a = str2;
                break;
            case 2:
                c31548l0.f130225g = str2;
                break;
            case 3:
                c31548l0.f130222d = str2;
                break;
            case 4:
                c31548l0.f130220b = str2;
                break;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f95680w);
        parcel.writeString(this.f95681x);
    }

    public C24520b(Parcel parcel) {
        String string = parcel.readString();
        int i13 = AbstractC24567y.f95875a;
        this.f95680w = string;
        this.f95681x = parcel.readString();
    }
}
