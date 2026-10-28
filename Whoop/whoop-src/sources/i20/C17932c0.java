package i20;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i20.c0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C17932c0 implements Parcelable {
    public static final Parcelable.Creator<C17932c0> CREATOR = new C17925a(12);

    /* JADX INFO: renamed from: w */
    public final String f69692w;

    /* JADX INFO: renamed from: x */
    public final String f69693x;

    /* JADX INFO: renamed from: y */
    public final String f69694y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC17929b0 f69695z;

    public C17932c0(String id4, String country, String googlePlacesApiKey, InterfaceC17929b0 appearanceContext) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(country, "country");
        AbstractC22676k.m65750j(googlePlacesApiKey, "googlePlacesApiKey");
        AbstractC22676k.m65750j(appearanceContext, "appearanceContext");
        this.f69692w = id4;
        this.f69693x = country;
        this.f69694y = googlePlacesApiKey;
        this.f69695z = appearanceContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17932c0)) {
            return false;
        }
        C17932c0 c17932c0 = (C17932c0) obj;
        return AbstractC22676k.m65745e(this.f69692w, c17932c0.f69692w) && AbstractC22676k.m65745e(this.f69693x, c17932c0.f69693x) && AbstractC22676k.m65745e(this.f69694y, c17932c0.f69694y) && AbstractC22676k.m65745e(this.f69695z, c17932c0.f69695z);
    }

    public final int hashCode() {
        return this.f69695z.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.f69692w.hashCode() * 31, 31, this.f69693x), 31, this.f69694y);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Args(id=", this.f69692w, ", country=", this.f69693x, ", googlePlacesApiKey=");
        sbM32001t.append(this.f69694y);
        sbM32001t.append(", appearanceContext=");
        sbM32001t.append(this.f69695z);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f69692w);
        dest.writeString(this.f69693x);
        dest.writeString(this.f69694y);
        dest.writeParcelable(this.f69695z, i13);
    }
}
