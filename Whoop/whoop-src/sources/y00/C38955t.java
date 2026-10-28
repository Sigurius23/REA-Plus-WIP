package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C38955t implements InterfaceC36562b {
    public static final Parcelable.Creator<C38955t> CREATOR = new C38873k(7);

    /* JADX INFO: renamed from: E */
    public final EnumC38828f4 f167674E;

    /* JADX INFO: renamed from: F */
    public final String f167675F;

    /* JADX INFO: renamed from: w */
    public final EnumC38941r3 f167676w;

    /* JADX INFO: renamed from: x */
    public final C38977v3 f167677x;

    /* JADX INFO: renamed from: y */
    public final C39013z3 f167678y;

    /* JADX INFO: renamed from: z */
    public final String f167679z;

    public C38955t(EnumC38941r3 enumC38941r3, C38977v3 c38977v3, C39013z3 c39013z3, String str, EnumC38828f4 type, String allResponseFields) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(allResponseFields, "allResponseFields");
        this.f167676w = enumC38941r3;
        this.f167677x = c38977v3;
        this.f167678y = c39013z3;
        this.f167679z = str;
        this.f167674E = type;
        this.f167675F = allResponseFields;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38955t)) {
            return false;
        }
        C38955t c38955t = (C38955t) obj;
        return this.f167676w == c38955t.f167676w && AbstractC22676k.m65745e(this.f167677x, c38955t.f167677x) && AbstractC22676k.m65745e(this.f167678y, c38955t.f167678y) && AbstractC22676k.m65745e(this.f167679z, c38955t.f167679z) && this.f167674E == c38955t.f167674E && AbstractC22676k.m65745e(this.f167675F, c38955t.f167675F);
    }

    public final int hashCode() {
        EnumC38941r3 enumC38941r3 = this.f167676w;
        int iHashCode = (enumC38941r3 == null ? 0 : enumC38941r3.hashCode()) * 31;
        C38977v3 c38977v3 = this.f167677x;
        int iHashCode2 = (iHashCode + (c38977v3 == null ? 0 : c38977v3.hashCode())) * 31;
        C39013z3 c39013z3 = this.f167678y;
        int iHashCode3 = (iHashCode2 + (c39013z3 == null ? 0 : c39013z3.hashCode())) * 31;
        String str = this.f167679z;
        return this.f167675F.hashCode() + ((this.f167674E.hashCode() + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "PaymentMethodPreview(allowRedisplay=" + this.f167676w + ", billingDetails=" + this.f167677x + ", card=" + this.f167678y + ", customerId=" + this.f167679z + ", type=" + this.f167674E + ", allResponseFields=" + this.f167675F + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        EnumC38941r3 enumC38941r3 = this.f167676w;
        if (enumC38941r3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            enumC38941r3.writeToParcel(dest, i13);
        }
        C38977v3 c38977v3 = this.f167677x;
        if (c38977v3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38977v3.writeToParcel(dest, i13);
        }
        C39013z3 c39013z3 = this.f167678y;
        if (c39013z3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c39013z3.writeToParcel(dest, i13);
        }
        dest.writeString(this.f167679z);
        this.f167674E.writeToParcel(dest, i13);
        dest.writeString(this.f167675F);
    }
}
