package h20;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.q2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16720q2 extends AbstractC16726r2 {
    public static final Parcelable.Creator<C16720q2> CREATOR = new C16654f2(7);

    /* JADX INFO: renamed from: w */
    public final String f64259w;

    /* JADX INFO: renamed from: x */
    public final EnumC16738t2 f64260x;

    public C16720q2(String str, EnumC16738t2 setupFutureUse) {
        AbstractC22676k.m65750j(setupFutureUse, "setupFutureUse");
        this.f64259w = str;
        this.f64260x = setupFutureUse;
    }

    @Override // h20.AbstractC16726r2
    /* JADX INFO: renamed from: b */
    public final EnumC16738t2 mo47258b() {
        return this.f64260x;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16720q2)) {
            return false;
        }
        C16720q2 c16720q2 = (C16720q2) obj;
        return AbstractC22676k.m65745e(this.f64259w, c16720q2.f64259w) && this.f64260x == c16720q2.f64260x;
    }

    public final int hashCode() {
        String str = this.f64259w;
        return this.f64260x.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Setup(currency=" + this.f64259w + ", setupFutureUse=" + this.f64260x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f64259w);
        dest.writeString(this.f64260x.name());
    }
}
