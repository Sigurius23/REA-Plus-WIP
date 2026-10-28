package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.s0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38947s0 extends AbstractC38956t0 {
    public static final Parcelable.Creator<C38947s0> CREATOR = new C38873k(26);

    /* JADX INFO: renamed from: w */
    public final C38843h f167643w;

    public C38947s0(C38843h card) {
        AbstractC22676k.m65750j(card, "card");
        this.f167643w = card;
    }

    @Override // y00.AbstractC38956t0
    /* JADX INFO: renamed from: b */
    public final EnumC38852h8 mo124369b() {
        return this.f167643w.f167211U;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38947s0) && AbstractC22676k.m65745e(this.f167643w, ((C38947s0) obj).f167643w);
    }

    public final int hashCode() {
        return this.f167643w.hashCode();
    }

    public final String toString() {
        return "CustomerCard(card=" + this.f167643w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f167643w, i13);
    }
}
