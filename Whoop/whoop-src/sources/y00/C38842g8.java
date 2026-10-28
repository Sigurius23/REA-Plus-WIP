package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import p031b9.AbstractC2875y;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.g8 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38842g8 implements InterfaceC36562b, Parcelable {
    public static final Parcelable.Creator<C38842g8> CREATOR = new C38821e7(18);

    /* JADX INFO: renamed from: E */
    public final boolean f167188E;

    /* JADX INFO: renamed from: F */
    public final C38813e f167189F;

    /* JADX INFO: renamed from: G */
    public final C38843h f167190G;

    /* JADX INFO: renamed from: w */
    public final String f167191w;

    /* JADX INFO: renamed from: x */
    public final EnumC38832f8 f167192x;

    /* JADX INFO: renamed from: y */
    public final Date f167193y;

    /* JADX INFO: renamed from: z */
    public final boolean f167194z;

    public C38842g8(String id4, EnumC38832f8 type, Date created, boolean z4, boolean z13, C38813e c38813e, C38843h c38843h) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created, "created");
        this.f167191w = id4;
        this.f167192x = type;
        this.f167193y = created;
        this.f167194z = z4;
        this.f167188E = z13;
        this.f167189F = c38813e;
        this.f167190G = c38843h;
    }

    /* JADX INFO: renamed from: b */
    public final C38843h m124350b() {
        return this.f167190G;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38842g8)) {
            return false;
        }
        C38842g8 c38842g8 = (C38842g8) obj;
        return AbstractC22676k.m65745e(this.f167191w, c38842g8.f167191w) && this.f167192x == c38842g8.f167192x && AbstractC22676k.m65745e(this.f167193y, c38842g8.f167193y) && this.f167194z == c38842g8.f167194z && this.f167188E == c38842g8.f167188E && AbstractC22676k.m65745e(this.f167189F, c38842g8.f167189F) && AbstractC22676k.m65745e(this.f167190G, c38842g8.f167190G);
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC38963t7.m124373c(this.f167193y, (this.f167192x.hashCode() + (this.f167191w.hashCode() * 31)) * 31, 31), 31, this.f167194z), 31, this.f167188E);
        C38813e c38813e = this.f167189F;
        int iHashCode = (iM8289b + (c38813e == null ? 0 : c38813e.hashCode())) * 31;
        C38843h c38843h = this.f167190G;
        return iHashCode + (c38843h != null ? c38843h.hashCode() : 0);
    }

    public final String toString() {
        return "Token(id=" + this.f167191w + ", type=" + this.f167192x + ", created=" + this.f167193y + ", livemode=" + this.f167194z + ", used=" + this.f167188E + ", bankAccount=" + this.f167189F + ", card=" + this.f167190G + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167191w);
        dest.writeString(this.f167192x.name());
        dest.writeSerializable(this.f167193y);
        dest.writeInt(this.f167194z ? 1 : 0);
        dest.writeInt(this.f167188E ? 1 : 0);
        C38813e c38813e = this.f167189F;
        if (c38813e == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38813e.writeToParcel(dest, i13);
        }
        C38843h c38843h = this.f167190G;
        if (c38843h == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38843h.writeToParcel(dest, i13);
        }
    }

    public /* synthetic */ C38842g8(String str, EnumC38832f8 enumC38832f8, Date date, boolean z4, boolean z13, C38813e c38813e, C38843h c38843h, int i13) {
        this(str, enumC38832f8, date, z4, z13, (i13 & 32) != 0 ? null : c38813e, (i13 & 64) != 0 ? null : c38843h);
    }
}
