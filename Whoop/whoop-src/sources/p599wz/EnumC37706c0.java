package p599wz;

import android.os.Parcel;
import android.os.Parcelable;
import ge3.AbstractC15751g;
import p597wx.C37677f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: wz.c0 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC37706c0 implements Parcelable {
    public static final Parcelable.Creator<EnumC37706c0> CREATOR;

    /* JADX INFO: renamed from: w */
    public static final EnumC37706c0 f161566w;

    /* JADX INFO: renamed from: x */
    public static final EnumC37706c0 f161567x;

    /* JADX INFO: renamed from: y */
    public static final EnumC37706c0 f161568y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC37706c0[] f161569z;

    static {
        EnumC37706c0 enumC37706c0 = new EnumC37706c0("AUTOMATIC", 0);
        f161566w = enumC37706c0;
        EnumC37706c0 enumC37706c1 = new EnumC37706c0("ALWAYS_LIGHT", 1);
        f161567x = enumC37706c1;
        EnumC37706c0 enumC37706c2 = new EnumC37706c0("ALWAYS_DARK", 2);
        f161568y = enumC37706c2;
        EnumC37706c0[] enumC37706c0Arr = {enumC37706c0, enumC37706c1, enumC37706c2};
        f161569z = enumC37706c0Arr;
        AbstractC15751g.m44468u(enumC37706c0Arr);
        CREATOR = new C37677f(10);
    }

    public static EnumC37706c0 valueOf(String str) {
        return (EnumC37706c0) Enum.valueOf(EnumC37706c0.class, str);
    }

    public static EnumC37706c0[] values() {
        return (EnumC37706c0[]) f161569z.clone();
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
