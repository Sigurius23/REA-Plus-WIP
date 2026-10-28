package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.o1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38912o1 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38912o1> CREATOR = new C38992x0(12);

    /* JADX INFO: renamed from: E */
    public final String f167498E;

    /* JADX INFO: renamed from: F */
    public final C38903n1 f167499F;

    /* JADX INFO: renamed from: w */
    public final String f167500w;

    /* JADX INFO: renamed from: x */
    public final boolean f167501x;

    /* JADX INFO: renamed from: y */
    public final String f167502y;

    /* JADX INFO: renamed from: z */
    public final int f167503z;

    public C38912o1(String id4, boolean z4, String apiKey, int i13, String customerId, C38903n1 components) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(apiKey, "apiKey");
        AbstractC22676k.m65750j(customerId, "customerId");
        AbstractC22676k.m65750j(components, "components");
        this.f167500w = id4;
        this.f167501x = z4;
        this.f167502y = apiKey;
        this.f167503z = i13;
        this.f167498E = customerId;
        this.f167499F = components;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38912o1)) {
            return false;
        }
        C38912o1 c38912o1 = (C38912o1) obj;
        return AbstractC22676k.m65745e(this.f167500w, c38912o1.f167500w) && this.f167501x == c38912o1.f167501x && AbstractC22676k.m65745e(this.f167502y, c38912o1.f167502y) && this.f167503z == c38912o1.f167503z && AbstractC22676k.m65745e(this.f167498E, c38912o1.f167498E) && AbstractC22676k.m65745e(this.f167499F, c38912o1.f167499F);
    }

    public final int hashCode() {
        return this.f167499F.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.f167503z, AbstractC11266d.m30450d(AbstractC2875y.m8289b(this.f167500w.hashCode() * 31, 31, this.f167501x), 31, this.f167502y), 31), 31, this.f167498E);
    }

    public final String toString() {
        StringBuilder sbM73379l = AbstractC25012a.m73379l("Session(id=", this.f167500w, ", liveMode=", ", apiKey=", this.f167501x);
        AbstractC11266d.m30470x(this.f167503z, this.f167502y, ", apiKeyExpiry=", ", customerId=", sbM73379l);
        sbM73379l.append(this.f167498E);
        sbM73379l.append(", components=");
        sbM73379l.append(this.f167499F);
        sbM73379l.append(")");
        return sbM73379l.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167500w);
        dest.writeInt(this.f167501x ? 1 : 0);
        dest.writeString(this.f167502y);
        dest.writeInt(this.f167503z);
        dest.writeString(this.f167498E);
        this.f167499F.writeToParcel(dest, i13);
    }
}
