package gp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException;
import p088dc.AbstractC11895b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gp.v */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC16059v implements Parcelable {

    /* JADX INFO: Fake field, exist only in values array */
    EnumC16059v EF5;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC16059v[] f60734w = {new EnumC16059v("PUBLIC_KEY", 0)};
    public static final Parcelable.Creator<EnumC16059v> CREATOR = new C16040k0(5);

    /* JADX INFO: renamed from: b */
    public static EnumC16059v m45356b(String str) throws PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException {
        for (EnumC16059v enumC16059v : values()) {
            enumC16059v.getClass();
            if (str.equals("public-key")) {
                return enumC16059v;
            }
        }
        throw new PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException(AbstractC11895b.m31996o("PublicKeyCredentialType ", str, " not supported"));
    }

    public static EnumC16059v valueOf(String str) {
        return (EnumC16059v) Enum.valueOf(EnumC16059v.class, str);
    }

    public static EnumC16059v[] values() {
        return (EnumC16059v[]) f60734w.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "public-key";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString("public-key");
    }
}
