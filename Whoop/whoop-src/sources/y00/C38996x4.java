package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.x4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38996x4 implements InterfaceC38822e8, Parcelable {
    public static final Parcelable.Creator<C38996x4> CREATOR = new C38858i4(12);

    /* JADX INFO: renamed from: w */
    public String f167845w;

    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        String lowerCase = this.f167845w.toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        return AbstractC25247g0.m73989X(new C23465k("bank", lowerCase));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38996x4) && AbstractC22676k.m65745e(this.f167845w, ((C38996x4) obj).f167845w);
    }

    public final int hashCode() {
        return this.f167845w.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Netbanking(bank=", this.f167845w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167845w);
    }
}
