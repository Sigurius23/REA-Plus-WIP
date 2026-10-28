package q30;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29831p;
import r30.EnumC30905j;

/* JADX INFO: renamed from: q30.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C29935v extends AbstractC29894a0 {
    public static final Parcelable.Creator<C29935v> CREATOR = new C29831p(24);

    /* JADX INFO: renamed from: w */
    public final String f122250w;

    /* JADX INFO: renamed from: x */
    public final EnumC30905j f122251x;

    /* JADX INFO: renamed from: y */
    public final C29920n0 f122252y;

    public C29935v(String uiTypeCode, EnumC30905j enumC30905j, C29920n0 intentData) {
        AbstractC22676k.m65750j(uiTypeCode, "uiTypeCode");
        AbstractC22676k.m65750j(intentData, "intentData");
        this.f122250w = uiTypeCode;
        this.f122251x = enumC30905j;
        this.f122252y = intentData;
    }

    @Override // q30.AbstractC29894a0
    /* JADX INFO: renamed from: b */
    public final EnumC30905j mo91512b() {
        return this.f122251x;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29935v)) {
            return false;
        }
        C29935v c29935v = (C29935v) obj;
        return AbstractC22676k.m65745e(this.f122250w, c29935v.f122250w) && this.f122251x == c29935v.f122251x && AbstractC22676k.m65745e(this.f122252y, c29935v.f122252y);
    }

    @Override // q30.AbstractC29894a0
    /* JADX INFO: renamed from: f */
    public final C29920n0 mo91513f() {
        return this.f122252y;
    }

    public final int hashCode() {
        int iHashCode = this.f122250w.hashCode() * 31;
        EnumC30905j enumC30905j = this.f122251x;
        return this.f122252y.hashCode() + ((iHashCode + (enumC30905j == null ? 0 : enumC30905j.hashCode())) * 31);
    }

    public final String toString() {
        return "Failed(uiTypeCode=" + this.f122250w + ", initialUiType=" + this.f122251x + ", intentData=" + this.f122252y + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f122250w);
        EnumC30905j enumC30905j = this.f122251x;
        if (enumC30905j == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC30905j.name());
        }
        this.f122252y.writeToParcel(dest, i13);
    }
}
