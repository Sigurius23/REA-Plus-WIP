package gp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.zzbc;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: gp.c0 */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC16024c0 implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_REQUIRED("required"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_PREFERRED("preferred"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_DISCOURAGED("discouraged");

    public static final Parcelable.Creator<EnumC16024c0> CREATOR = new C16040k0(13);

    /* JADX INFO: renamed from: w */
    public final String f60625w;

    EnumC16024c0(String str) {
        this.f60625w = str;
    }

    /* JADX INFO: renamed from: b */
    public static EnumC16024c0 m45341b(String str) throws zzbc {
        for (EnumC16024c0 enumC16024c0 : values()) {
            if (str.equals(enumC16024c0.f60625w)) {
                return enumC16024c0;
            }
        }
        throw new zzbc(AbstractC11895b.m31996o("User verification requirement ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f60625w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f60625w);
    }
}
