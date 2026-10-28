package q30;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29831p;
import r30.EnumC30905j;

/* JADX INFO: renamed from: q30.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C29941y extends AbstractC29894a0 {
    public static final Parcelable.Creator<C29941y> CREATOR = new C29831p(27);

    /* JADX INFO: renamed from: w */
    public final String f122270w;

    /* JADX INFO: renamed from: x */
    public final EnumC30905j f122271x;

    /* JADX INFO: renamed from: y */
    public final C29920n0 f122272y;

    public C29941y(String uiTypeCode, EnumC30905j enumC30905j, C29920n0 intentData) {
        AbstractC22676k.m65750j(uiTypeCode, "uiTypeCode");
        AbstractC22676k.m65750j(intentData, "intentData");
        this.f122270w = uiTypeCode;
        this.f122271x = enumC30905j;
        this.f122272y = intentData;
    }

    @Override // q30.AbstractC29894a0
    /* JADX INFO: renamed from: b */
    public final EnumC30905j mo91512b() {
        return this.f122271x;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29941y)) {
            return false;
        }
        C29941y c29941y = (C29941y) obj;
        return AbstractC22676k.m65745e(this.f122270w, c29941y.f122270w) && this.f122271x == c29941y.f122271x && AbstractC22676k.m65745e(this.f122272y, c29941y.f122272y);
    }

    @Override // q30.AbstractC29894a0
    /* JADX INFO: renamed from: f */
    public final C29920n0 mo91513f() {
        return this.f122272y;
    }

    public final int hashCode() {
        int iHashCode = this.f122270w.hashCode() * 31;
        EnumC30905j enumC30905j = this.f122271x;
        return this.f122272y.hashCode() + ((iHashCode + (enumC30905j == null ? 0 : enumC30905j.hashCode())) * 31);
    }

    public final String toString() {
        return "Succeeded(uiTypeCode=" + this.f122270w + ", initialUiType=" + this.f122271x + ", intentData=" + this.f122272y + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f122270w);
        EnumC30905j enumC30905j = this.f122271x;
        if (enumC30905j == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC30905j.name());
        }
        this.f122272y.writeToParcel(dest, i13);
    }
}
