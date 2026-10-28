package gp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.C4999x5ced43e0;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: gp.c */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC16023c implements Parcelable {
    NONE("none"),
    /* JADX INFO: Fake field, exist only in values array */
    INDIRECT("indirect"),
    /* JADX INFO: Fake field, exist only in values array */
    DIRECT("direct");

    public static final Parcelable.Creator<EnumC16023c> CREATOR = new C16040k0(11);

    /* JADX INFO: renamed from: w */
    public final String f60623w;

    EnumC16023c(String str) {
        this.f60623w = str;
    }

    /* JADX INFO: renamed from: b */
    public static EnumC16023c m45340b(String str) throws C4999x5ced43e0 {
        for (EnumC16023c enumC16023c : values()) {
            if (str.equals(enumC16023c.f60623w)) {
                return enumC16023c;
            }
        }
        throw new C4999x5ced43e0(AbstractC11895b.m31996o("Attestation conveyance preference ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f60623w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f60623w);
    }
}
