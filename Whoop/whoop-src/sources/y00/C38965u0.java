package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.u0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38965u0 extends AbstractC38956t0 {
    public static final Parcelable.Creator<C38965u0> CREATOR = new C38873k(27);

    /* JADX INFO: renamed from: w */
    public final C38899m6 f167719w;

    public C38965u0(C38899m6 source) {
        AbstractC22676k.m65750j(source, "source");
        this.f167719w = source;
    }

    @Override // y00.AbstractC38956t0
    /* JADX INFO: renamed from: b */
    public final EnumC38852h8 mo124369b() {
        C39007y6 c39007y6 = this.f167719w.f167453J;
        if (c39007y6 instanceof C39007y6) {
            return c39007y6.f167895K;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38965u0) && AbstractC22676k.m65745e(this.f167719w, ((C38965u0) obj).f167719w);
    }

    public final int hashCode() {
        return this.f167719w.hashCode();
    }

    public final String toString() {
        return "CustomerSource(source=" + this.f167719w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f167719w.writeToParcel(dest, i13);
    }
}
