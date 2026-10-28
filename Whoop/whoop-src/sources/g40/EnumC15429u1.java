package g40;

import android.os.Parcel;
import android.os.Parcelable;
import ge3.AbstractC15751g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: g40.u1 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC15429u1 implements InterfaceC15439w1 {
    public static final Parcelable.Creator<EnumC15429u1> CREATOR;

    /* JADX INFO: renamed from: w */
    public static final EnumC15429u1 f57996w;

    /* JADX INFO: renamed from: x */
    public static final EnumC15429u1 f57997x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC15429u1[] f57998y;

    static {
        EnumC15429u1 enumC15429u1 = new EnumC15429u1("Params", 0);
        f57996w = enumC15429u1;
        EnumC15429u1 enumC15429u2 = new EnumC15429u1("Options", 1);
        f57997x = enumC15429u2;
        EnumC15429u1[] enumC15429u1Arr = {enumC15429u1, enumC15429u2};
        f57998y = enumC15429u1Arr;
        AbstractC15751g.m44468u(enumC15429u1Arr);
        CREATOR = new C15365i(4);
    }

    public static EnumC15429u1 valueOf(String str) {
        return (EnumC15429u1) Enum.valueOf(EnumC15429u1.class, str);
    }

    public static EnumC15429u1[] values() {
        return (EnumC15429u1[]) f57998y.clone();
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
