package gp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.C5001x11efcb6;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: gp.y */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC16062y implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");

    public static final Parcelable.Creator<EnumC16062y> CREATOR = new C16040k0(7);

    /* JADX INFO: renamed from: w */
    public final String f60744w;

    EnumC16062y(String str) {
        this.f60744w = str;
    }

    /* JADX INFO: renamed from: b */
    public static EnumC16062y m45357b(String str) throws C5001x11efcb6 {
        for (EnumC16062y enumC16062y : values()) {
            if (str.equals(enumC16062y.f60744w)) {
                return enumC16062y;
            }
        }
        throw new C5001x11efcb6(AbstractC11895b.m31996o("Resident key requirement ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f60744w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f60744w);
    }
}
