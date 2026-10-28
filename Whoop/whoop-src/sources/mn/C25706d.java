package mn;

import android.os.Parcel;
import android.os.Parcelable;
import ih0.AbstractC18489d0;
import in.InterfaceC18714b;
import java.util.Arrays;
import p088dc.AbstractC11895b;
import p465rm.C31548l0;

/* JADX INFO: renamed from: mn.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C25706d implements InterfaceC18714b {
    public static final Parcelable.Creator<C25706d> CREATOR = new C25704b(1);

    /* JADX INFO: renamed from: w */
    public final byte[] f101219w;

    /* JADX INFO: renamed from: x */
    public final String f101220x;

    /* JADX INFO: renamed from: y */
    public final String f101221y;

    public C25706d(byte[] bArr, String str, String str2) {
        this.f101219w = bArr;
        this.f101220x = str;
        this.f101221y = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C25706d.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f101219w, ((C25706d) obj).f101219w);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f101219w);
    }

    public final String toString() {
        return AbstractC18489d0.m53371l(AbstractC11895b.m32001t("ICY: title=\"", this.f101220x, "\", url=\"", this.f101221y, "\", rawMetadata.length=\""), this.f101219w.length, "\"");
    }

    @Override // in.InterfaceC18714b
    /* JADX INFO: renamed from: w */
    public final void mo54416w(C31548l0 c31548l0) {
        String str = this.f101220x;
        if (str != null) {
            c31548l0.f130219a = str;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeByteArray(this.f101219w);
        parcel.writeString(this.f101220x);
        parcel.writeString(this.f101221y);
    }

    public C25706d(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        bArrCreateByteArray.getClass();
        this.f101219w = bArrCreateByteArray;
        this.f101220x = parcel.readString();
        this.f101221y = parcel.readString();
    }
}
