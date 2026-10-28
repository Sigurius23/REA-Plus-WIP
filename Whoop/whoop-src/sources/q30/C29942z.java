package q30;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29831p;
import r30.EnumC30905j;

/* JADX INFO: renamed from: q30.z */
/* JADX INFO: loaded from: classes6.dex */
public final class C29942z extends AbstractC29894a0 {
    public static final Parcelable.Creator<C29942z> CREATOR = new C29831p(28);

    /* JADX INFO: renamed from: w */
    public final String f122273w;

    /* JADX INFO: renamed from: x */
    public final EnumC30905j f122274x;

    /* JADX INFO: renamed from: y */
    public final C29920n0 f122275y;

    public C29942z(String str, EnumC30905j enumC30905j, C29920n0 intentData) {
        AbstractC22676k.m65750j(intentData, "intentData");
        this.f122273w = str;
        this.f122274x = enumC30905j;
        this.f122275y = intentData;
    }

    @Override // q30.AbstractC29894a0
    /* JADX INFO: renamed from: b */
    public final EnumC30905j mo91512b() {
        return this.f122274x;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29942z)) {
            return false;
        }
        C29942z c29942z = (C29942z) obj;
        return AbstractC22676k.m65745e(this.f122273w, c29942z.f122273w) && this.f122274x == c29942z.f122274x && AbstractC22676k.m65745e(this.f122275y, c29942z.f122275y);
    }

    @Override // q30.AbstractC29894a0
    /* JADX INFO: renamed from: f */
    public final C29920n0 mo91513f() {
        return this.f122275y;
    }

    public final int hashCode() {
        String str = this.f122273w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        EnumC30905j enumC30905j = this.f122274x;
        return this.f122275y.hashCode() + ((iHashCode + (enumC30905j != null ? enumC30905j.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Timeout(uiTypeCode=" + this.f122273w + ", initialUiType=" + this.f122274x + ", intentData=" + this.f122275y + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f122273w);
        EnumC30905j enumC30905j = this.f122274x;
        if (enumC30905j == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC30905j.name());
        }
        this.f122275y.writeToParcel(dest, i13);
    }
}
