package w20;

import android.os.Parcel;
import android.os.Parcelable;
import h20.C16665h1;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.EnumC38853i;

/* JADX INFO: renamed from: w20.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C36721k implements Parcelable {
    public static final Parcelable.Creator<C36721k> CREATOR = new C36720j(0);

    /* JADX INFO: renamed from: w */
    public final String f157206w;

    /* JADX INFO: renamed from: x */
    public final EnumC38853i f157207x;

    /* JADX INFO: renamed from: y */
    public final C16665h1 f157208y;

    /* JADX INFO: renamed from: z */
    public final boolean f157209z;

    public C36721k(String lastFour, EnumC38853i cardBrand, C16665h1 appearance, boolean z4) {
        AbstractC22676k.m65750j(lastFour, "lastFour");
        AbstractC22676k.m65750j(cardBrand, "cardBrand");
        AbstractC22676k.m65750j(appearance, "appearance");
        this.f157206w = lastFour;
        this.f157207x = cardBrand;
        this.f157208y = appearance;
        this.f157209z = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36721k)) {
            return false;
        }
        C36721k c36721k = (C36721k) obj;
        return AbstractC22676k.m65745e(this.f157206w, c36721k.f157206w) && this.f157207x == c36721k.f157207x && AbstractC22676k.m65745e(this.f157208y, c36721k.f157208y) && this.f157209z == c36721k.f157209z;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f157209z) + ((this.f157208y.hashCode() + ((this.f157207x.hashCode() + (this.f157206w.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Args(lastFour=" + this.f157206w + ", cardBrand=" + this.f157207x + ", appearance=" + this.f157208y + ", isTestMode=" + this.f157209z + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f157206w);
        dest.writeString(this.f157207x.name());
        this.f157208y.writeToParcel(dest, i13);
        dest.writeInt(this.f157209z ? 1 : 0);
    }
}
