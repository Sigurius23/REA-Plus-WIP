package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.x2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38994x2 implements InterfaceC38822e8, Parcelable {
    public static final Parcelable.Creator<C38994x2> CREATOR = new C38967u2(1);

    /* JADX INFO: renamed from: w */
    public final C38985w2 f167841w;

    public C38994x2(C38985w2 type) {
        AbstractC22676k.m65750j(type, "type");
        this.f167841w = type;
    }

    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        C38985w2 c38985w2 = this.f167841w;
        c38985w2.getClass();
        return AbstractC38963t7.m124385o("customer_acceptance", AbstractC25247g0.m73990Y(new C23465k("type", "online"), new C23465k("online", c38985w2.mo124325c0())));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38994x2) && AbstractC22676k.m65745e(this.f167841w, ((C38994x2) obj).f167841w);
    }

    public final int hashCode() {
        return this.f167841w.hashCode();
    }

    public final String toString() {
        return "MandateDataParams(type=" + this.f167841w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f167841w, i13);
    }
}
