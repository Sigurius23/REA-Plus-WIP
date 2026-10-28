package h20;

import android.os.Parcel;
import android.os.Parcelable;
import ge3.AbstractC15751g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h20.r1 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC16725r1 implements Parcelable {
    public static final Parcelable.Creator<EnumC16725r1> CREATOR;

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC16725r1[] f64269E;

    /* JADX INFO: renamed from: w */
    public static final EnumC16725r1 f64270w;

    /* JADX INFO: renamed from: x */
    public static final EnumC16725r1 f64271x;

    /* JADX INFO: renamed from: y */
    public static final EnumC16725r1 f64272y;

    /* JADX INFO: renamed from: z */
    public static final EnumC16725r1 f64273z;

    static {
        EnumC16725r1 enumC16725r1 = new EnumC16725r1("Visa", 0);
        f64270w = enumC16725r1;
        EnumC16725r1 enumC16725r2 = new EnumC16725r1("Mastercard", 1);
        f64271x = enumC16725r2;
        EnumC16725r1 enumC16725r3 = new EnumC16725r1("Amex", 2);
        f64272y = enumC16725r3;
        EnumC16725r1 enumC16725r4 = new EnumC16725r1("Discover", 3);
        f64273z = enumC16725r4;
        EnumC16725r1[] enumC16725r1Arr = {enumC16725r1, enumC16725r2, enumC16725r3, enumC16725r4};
        f64269E = enumC16725r1Arr;
        AbstractC15751g.m44468u(enumC16725r1Arr);
        CREATOR = new C16699n(21);
    }

    public static EnumC16725r1 valueOf(String str) {
        return (EnumC16725r1) Enum.valueOf(EnumC16725r1.class, str);
    }

    public static EnumC16725r1[] values() {
        return (EnumC16725r1[]) f64269E.clone();
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
