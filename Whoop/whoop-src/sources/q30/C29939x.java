package q30;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29831p;
import r30.EnumC30905j;

/* JADX INFO: renamed from: q30.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C29939x extends AbstractC29894a0 {
    public static final Parcelable.Creator<C29939x> CREATOR = new C29831p(26);

    /* JADX INFO: renamed from: w */
    public final Throwable f122263w;

    /* JADX INFO: renamed from: x */
    public final EnumC30905j f122264x;

    /* JADX INFO: renamed from: y */
    public final C29920n0 f122265y;

    public C29939x(Throwable throwable, EnumC30905j enumC30905j, C29920n0 intentData) {
        AbstractC22676k.m65750j(throwable, "throwable");
        AbstractC22676k.m65750j(intentData, "intentData");
        this.f122263w = throwable;
        this.f122264x = enumC30905j;
        this.f122265y = intentData;
    }

    @Override // q30.AbstractC29894a0
    /* JADX INFO: renamed from: b */
    public final EnumC30905j mo91512b() {
        return this.f122264x;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29939x)) {
            return false;
        }
        C29939x c29939x = (C29939x) obj;
        return AbstractC22676k.m65745e(this.f122263w, c29939x.f122263w) && this.f122264x == c29939x.f122264x && AbstractC22676k.m65745e(this.f122265y, c29939x.f122265y);
    }

    @Override // q30.AbstractC29894a0
    /* JADX INFO: renamed from: f */
    public final C29920n0 mo91513f() {
        return this.f122265y;
    }

    public final int hashCode() {
        int iHashCode = this.f122263w.hashCode() * 31;
        EnumC30905j enumC30905j = this.f122264x;
        return this.f122265y.hashCode() + ((iHashCode + (enumC30905j == null ? 0 : enumC30905j.hashCode())) * 31);
    }

    public final String toString() {
        return "RuntimeError(throwable=" + this.f122263w + ", initialUiType=" + this.f122264x + ", intentData=" + this.f122265y + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeSerializable(this.f122263w);
        EnumC30905j enumC30905j = this.f122264x;
        if (enumC30905j == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC30905j.name());
        }
        this.f122265y.writeToParcel(dest, i13);
    }
}
