package q30;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29831p;
import r30.C30902g;
import r30.EnumC30905j;

/* JADX INFO: renamed from: q30.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C29937w extends AbstractC29894a0 {
    public static final Parcelable.Creator<C29937w> CREATOR = new C29831p(25);

    /* JADX INFO: renamed from: w */
    public final C30902g f122256w;

    /* JADX INFO: renamed from: x */
    public final EnumC30905j f122257x;

    /* JADX INFO: renamed from: y */
    public final C29920n0 f122258y;

    public C29937w(C30902g data, EnumC30905j enumC30905j, C29920n0 intentData) {
        AbstractC22676k.m65750j(data, "data");
        AbstractC22676k.m65750j(intentData, "intentData");
        this.f122256w = data;
        this.f122257x = enumC30905j;
        this.f122258y = intentData;
    }

    @Override // q30.AbstractC29894a0
    /* JADX INFO: renamed from: b */
    public final EnumC30905j mo91512b() {
        return this.f122257x;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29937w)) {
            return false;
        }
        C29937w c29937w = (C29937w) obj;
        return AbstractC22676k.m65745e(this.f122256w, c29937w.f122256w) && this.f122257x == c29937w.f122257x && AbstractC22676k.m65745e(this.f122258y, c29937w.f122258y);
    }

    @Override // q30.AbstractC29894a0
    /* JADX INFO: renamed from: f */
    public final C29920n0 mo91513f() {
        return this.f122258y;
    }

    public final int hashCode() {
        int iHashCode = this.f122256w.hashCode() * 31;
        EnumC30905j enumC30905j = this.f122257x;
        return this.f122258y.hashCode() + ((iHashCode + (enumC30905j == null ? 0 : enumC30905j.hashCode())) * 31);
    }

    public final String toString() {
        return "ProtocolError(data=" + this.f122256w + ", initialUiType=" + this.f122257x + ", intentData=" + this.f122258y + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f122256w.writeToParcel(dest, i13);
        EnumC30905j enumC30905j = this.f122257x;
        if (enumC30905j == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC30905j.name());
        }
        this.f122258y.writeToParcel(dest, i13);
    }
}
