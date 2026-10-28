package gp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.TokenBinding$UnsupportedTokenBindingStatusException;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: gp.z */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC16063z implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    PRESENT("present"),
    /* JADX INFO: Fake field, exist only in values array */
    SUPPORTED("supported"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_SUPPORTED("not-supported");

    public static final Parcelable.Creator<EnumC16063z> CREATOR = new C16040k0(9);

    /* JADX INFO: renamed from: w */
    public final String f60746w;

    EnumC16063z(String str) {
        this.f60746w = str;
    }

    /* JADX INFO: renamed from: b */
    public static EnumC16063z m45358b(String str) throws TokenBinding$UnsupportedTokenBindingStatusException {
        for (EnumC16063z enumC16063z : values()) {
            if (str.equals(enumC16063z.f60746w)) {
                return enumC16063z;
            }
        }
        throw new TokenBinding$UnsupportedTokenBindingStatusException(AbstractC11895b.m31996o("TokenBindingStatus ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f60746w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f60746w);
    }
}
