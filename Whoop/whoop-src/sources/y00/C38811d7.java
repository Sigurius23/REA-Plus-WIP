package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.d7 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38811d7 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38811d7> CREATOR = new C38943r5(26);

    /* JADX INFO: renamed from: E */
    public final String f167033E;

    /* JADX INFO: renamed from: F */
    public final boolean f167034F;

    /* JADX INFO: renamed from: G */
    public final C38801c7 f167035G;

    /* JADX INFO: renamed from: H */
    public final String f167036H;

    /* JADX INFO: renamed from: I */
    public final String f167037I;

    /* JADX INFO: renamed from: w */
    public final String f167038w;

    /* JADX INFO: renamed from: x */
    public final C38781a7 f167039x;

    /* JADX INFO: renamed from: y */
    public final Long f167040y;

    /* JADX INFO: renamed from: z */
    public final String f167041z;

    public C38811d7(String str, C38781a7 c38781a7, Long l7, String str2, String str3, boolean z4, C38801c7 c38801c7, String str4, String str5) {
        this.f167038w = str;
        this.f167039x = c38781a7;
        this.f167040y = l7;
        this.f167041z = str2;
        this.f167033E = str3;
        this.f167034F = z4;
        this.f167035G = c38801c7;
        this.f167036H = str4;
        this.f167037I = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38811d7)) {
            return false;
        }
        C38811d7 c38811d7 = (C38811d7) obj;
        return AbstractC22676k.m65745e(this.f167038w, c38811d7.f167038w) && AbstractC22676k.m65745e(this.f167039x, c38811d7.f167039x) && AbstractC22676k.m65745e(this.f167040y, c38811d7.f167040y) && AbstractC22676k.m65745e(this.f167041z, c38811d7.f167041z) && AbstractC22676k.m65745e(this.f167033E, c38811d7.f167033E) && this.f167034F == c38811d7.f167034F && AbstractC22676k.m65745e(this.f167035G, c38811d7.f167035G) && AbstractC22676k.m65745e(this.f167036H, c38811d7.f167036H) && AbstractC22676k.m65745e(this.f167037I, c38811d7.f167037I);
    }

    public final int hashCode() {
        String str = this.f167038w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C38781a7 c38781a7 = this.f167039x;
        int iHashCode2 = (iHashCode + (c38781a7 == null ? 0 : c38781a7.hashCode())) * 31;
        Long l7 = this.f167040y;
        int iHashCode3 = (iHashCode2 + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str2 = this.f167041z;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f167033E;
        int iM8289b = AbstractC2875y.m8289b((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f167034F);
        C38801c7 c38801c7 = this.f167035G;
        int iHashCode5 = (iM8289b + (c38801c7 == null ? 0 : c38801c7.hashCode())) * 31;
        String str4 = this.f167036H;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f167037I;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Stripe3ds2AuthResult(id=");
        sb4.append(this.f167038w);
        sb4.append(", ares=");
        sb4.append(this.f167039x);
        sb4.append(", created=");
        sb4.append(this.f167040y);
        sb4.append(", source=");
        sb4.append(this.f167041z);
        sb4.append(", state=");
        AbstractC38963t7.m124390t(sb4, this.f167033E, ", liveMode=", this.f167034F, ", error=");
        sb4.append(this.f167035G);
        sb4.append(", fallbackRedirectUrl=");
        sb4.append(this.f167036H);
        sb4.append(", creq=");
        return AbstractC25012a.m73376i(this.f167037I, ")", sb4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167038w);
        C38781a7 c38781a7 = this.f167039x;
        if (c38781a7 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38781a7.writeToParcel(dest, i13);
        }
        Long l7 = this.f167040y;
        if (l7 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l7.longValue());
        }
        dest.writeString(this.f167041z);
        dest.writeString(this.f167033E);
        dest.writeInt(this.f167034F ? 1 : 0);
        C38801c7 c38801c7 = this.f167035G;
        if (c38801c7 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38801c7.writeToParcel(dest, i13);
        }
        dest.writeString(this.f167036H);
        dest.writeString(this.f167037I);
    }
}
