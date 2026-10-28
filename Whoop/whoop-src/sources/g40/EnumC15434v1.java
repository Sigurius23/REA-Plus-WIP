package g40;

import android.os.Parcel;
import android.os.Parcelable;
import ge3.AbstractC15751g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: g40.v1 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC15434v1 implements InterfaceC15439w1 {
    public static final Parcelable.Creator<EnumC15434v1> CREATOR;

    /* JADX INFO: renamed from: w */
    public static final EnumC15434v1 f58016w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC15434v1[] f58017x;

    static {
        EnumC15434v1 enumC15434v1 = new EnumC15434v1("Extras", 0);
        f58016w = enumC15434v1;
        EnumC15434v1[] enumC15434v1Arr = {enumC15434v1};
        f58017x = enumC15434v1Arr;
        AbstractC15751g.m44468u(enumC15434v1Arr);
        CREATOR = new C15365i(5);
    }

    public static EnumC15434v1 valueOf(String str) {
        return (EnumC15434v1) Enum.valueOf(EnumC15434v1.class, str);
    }

    public static EnumC15434v1[] values() {
        return (EnumC15434v1[]) f58017x.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(name());
    }
}
