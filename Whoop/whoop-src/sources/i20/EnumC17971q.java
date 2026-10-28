package i20;

import android.os.Parcel;
import android.os.Parcelable;
import ge3.AbstractC15751g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: i20.q */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC17971q implements Parcelable {
    public static final Parcelable.Creator<EnumC17971q> CREATOR;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ EnumC17971q[] f69794w;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC17971q EF5;

    static {
        EnumC17971q[] enumC17971qArr = {new EnumC17971q("HIDDEN", 0), new EnumC17971q("OPTIONAL", 1), new EnumC17971q("REQUIRED", 2)};
        f69794w = enumC17971qArr;
        AbstractC15751g.m44468u(enumC17971qArr);
        CREATOR = new C17925a(6);
    }

    public static EnumC17971q valueOf(String str) {
        return (EnumC17971q) Enum.valueOf(EnumC17971q.class, str);
    }

    public static EnumC17971q[] values() {
        return (EnumC17971q[]) f69794w.clone();
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
