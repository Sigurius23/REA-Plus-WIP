package h20;

import android.os.Parcel;
import android.os.Parcelable;
import ge3.AbstractC15751g;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import t83.C33617b;
import y00.EnumC38863j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h20.u1 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC16743u1 implements Parcelable {
    public static final Parcelable.Creator<EnumC16743u1> CREATOR;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC16743u1[] f64304w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ C33617b f64305x;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC16743u1 EF5;

    static {
        EnumC16743u1[] enumC16743u1Arr = {new EnumC16743u1("Debit", 0), new EnumC16743u1("Credit", 1), new EnumC16743u1("Prepaid", 2), new EnumC16743u1("Unknown", 3)};
        f64304w = enumC16743u1Arr;
        f64305x = AbstractC15751g.m44468u(enumC16743u1Arr);
        CREATOR = new C16699n(23);
    }

    public static EnumC16743u1 valueOf(String str) {
        return (EnumC16743u1) Enum.valueOf(EnumC16743u1.class, str);
    }

    public static EnumC16743u1[] values() {
        return (EnumC16743u1[]) f64304w.clone();
    }

    /* JADX INFO: renamed from: b */
    public final EnumC38863j m47263b() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return EnumC38863j.Debit;
        }
        if (iOrdinal == 1) {
            return EnumC38863j.Credit;
        }
        if (iOrdinal == 2) {
            return EnumC38863j.Prepaid;
        }
        if (iOrdinal == 3) {
            return EnumC38863j.Unknown;
        }
        throw new NoWhenBranchMatchedException();
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
