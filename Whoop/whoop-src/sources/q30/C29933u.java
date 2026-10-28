package q30;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29831p;
import r30.EnumC30905j;

/* JADX INFO: renamed from: q30.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C29933u extends AbstractC29894a0 {
    public static final Parcelable.Creator<C29933u> CREATOR = new C29831p(23);

    /* JADX INFO: renamed from: w */
    public final String f122244w;

    /* JADX INFO: renamed from: x */
    public final EnumC30905j f122245x;

    /* JADX INFO: renamed from: y */
    public final C29920n0 f122246y;

    public C29933u(String str, EnumC30905j enumC30905j, C29920n0 intentData) {
        AbstractC22676k.m65750j(intentData, "intentData");
        this.f122244w = str;
        this.f122245x = enumC30905j;
        this.f122246y = intentData;
    }

    @Override // q30.AbstractC29894a0
    /* JADX INFO: renamed from: b */
    public final EnumC30905j mo91512b() {
        return this.f122245x;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29933u)) {
            return false;
        }
        C29933u c29933u = (C29933u) obj;
        return AbstractC22676k.m65745e(this.f122244w, c29933u.f122244w) && this.f122245x == c29933u.f122245x && AbstractC22676k.m65745e(this.f122246y, c29933u.f122246y);
    }

    @Override // q30.AbstractC29894a0
    /* JADX INFO: renamed from: f */
    public final C29920n0 mo91513f() {
        return this.f122246y;
    }

    public final int hashCode() {
        String str = this.f122244w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        EnumC30905j enumC30905j = this.f122245x;
        return this.f122246y.hashCode() + ((iHashCode + (enumC30905j != null ? enumC30905j.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Canceled(uiTypeCode=" + this.f122244w + ", initialUiType=" + this.f122245x + ", intentData=" + this.f122246y + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f122244w);
        EnumC30905j enumC30905j = this.f122245x;
        if (enumC30905j == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC30905j.name());
        }
        this.f122246y.writeToParcel(dest, i13);
    }
}
