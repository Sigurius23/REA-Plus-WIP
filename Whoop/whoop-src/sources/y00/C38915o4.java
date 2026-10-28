package y00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.profileinstaller.ProfileVerifier;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.o4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38915o4 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38915o4> CREATOR = new C38967u2(22);

    /* JADX INFO: renamed from: E */
    public final EnumC38828f4 f167511E;

    /* JADX INFO: renamed from: F */
    public final C38977v3 f167512F;

    /* JADX INFO: renamed from: G */
    public final String f167513G;

    /* JADX INFO: renamed from: H */
    public final C39013z3 f167514H;

    /* JADX INFO: renamed from: I */
    public final C38778a4 f167515I;

    /* JADX INFO: renamed from: J */
    public final C38788b4 f167516J;

    /* JADX INFO: renamed from: K */
    public final C38798c4 f167517K;

    /* JADX INFO: renamed from: L */
    public final C38818e4 f167518L;

    /* JADX INFO: renamed from: M */
    public final C38950s3 f167519M;

    /* JADX INFO: renamed from: N */
    public final C38959t3 f167520N;

    /* JADX INFO: renamed from: O */
    public final C38897m4 f167521O;

    /* JADX INFO: renamed from: P */
    public final C38808d4 f167522P;

    /* JADX INFO: renamed from: Q */
    public final C38888l4 f167523Q;

    /* JADX INFO: renamed from: R */
    public final InterfaceC38949s2 f167524R;

    /* JADX INFO: renamed from: S */
    public final boolean f167525S;

    /* JADX INFO: renamed from: T */
    public final EnumC38941r3 f167526T;

    /* JADX INFO: renamed from: w */
    public final String f167527w;

    /* JADX INFO: renamed from: x */
    public final Long f167528x;

    /* JADX INFO: renamed from: y */
    public final boolean f167529y;

    /* JADX INFO: renamed from: z */
    public final String f167530z;

    public /* synthetic */ C38915o4(String str, Long l7, boolean z4, String str2, EnumC38828f4 enumC38828f4, C38977v3 c38977v3, String str3, C39013z3 c39013z3, C38778a4 c38778a4, C38788b4 c38788b4, C38798c4 c38798c4, C38818e4 c38818e4, C38950s3 c38950s3, C38959t3 c38959t3, C38808d4 c38808d4, C38888l4 c38888l4, EnumC38941r3 enumC38941r3, int i13) {
        this(str, l7, z4, str2, enumC38828f4, (i13 & 32) != 0 ? null : c38977v3, (i13 & 64) != 0 ? null : str3, (i13 & 128) != 0 ? null : c39013z3, (i13 & 256) != 0 ? null : c38778a4, (i13 & 512) != 0 ? null : c38788b4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : c38798c4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : c38818e4, (i13 & 4096) != 0 ? null : c38950s3, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : c38959t3, null, (32768 & i13) != 0 ? null : c38808d4, (65536 & i13) != 0 ? null : c38888l4, null, false, (i13 & 524288) != 0 ? null : enumC38941r3);
    }

    /* JADX INFO: renamed from: b */
    public static C38915o4 m124363b(C38915o4 c38915o4, C38977v3 c38977v3, InterfaceC38949s2 interfaceC38949s2, boolean z4, int i13) {
        String id4 = c38915o4.f167527w;
        Long l7 = c38915o4.f167528x;
        boolean z13 = c38915o4.f167529y;
        String str = c38915o4.f167530z;
        EnumC38828f4 enumC38828f4 = c38915o4.f167511E;
        C38977v3 c38977v4 = (i13 & 32) != 0 ? c38915o4.f167512F : c38977v3;
        String str2 = c38915o4.f167513G;
        C39013z3 c39013z3 = c38915o4.f167514H;
        C38778a4 c38778a4 = c38915o4.f167515I;
        C38788b4 c38788b4 = c38915o4.f167516J;
        C38798c4 c38798c4 = c38915o4.f167517K;
        C38818e4 c38818e4 = c38915o4.f167518L;
        C38950s3 c38950s3 = c38915o4.f167519M;
        C38959t3 c38959t3 = c38915o4.f167520N;
        C38897m4 c38897m4 = c38915o4.f167521O;
        C38808d4 c38808d4 = c38915o4.f167522P;
        C38888l4 c38888l4 = c38915o4.f167523Q;
        InterfaceC38949s2 interfaceC38949s3 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? c38915o4.f167524R : interfaceC38949s2;
        boolean z14 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? c38915o4.f167525S : z4;
        EnumC38941r3 enumC38941r3 = c38915o4.f167526T;
        c38915o4.getClass();
        AbstractC22676k.m65750j(id4, "id");
        return new C38915o4(id4, l7, z13, str, enumC38828f4, c38977v4, str2, c39013z3, c38778a4, c38788b4, c38798c4, c38818e4, c38950s3, c38959t3, c38897m4, c38808d4, c38888l4, interfaceC38949s3, z14, enumC38941r3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38915o4)) {
            return false;
        }
        C38915o4 c38915o4 = (C38915o4) obj;
        return AbstractC22676k.m65745e(this.f167527w, c38915o4.f167527w) && AbstractC22676k.m65745e(this.f167528x, c38915o4.f167528x) && this.f167529y == c38915o4.f167529y && AbstractC22676k.m65745e(this.f167530z, c38915o4.f167530z) && this.f167511E == c38915o4.f167511E && AbstractC22676k.m65745e(this.f167512F, c38915o4.f167512F) && AbstractC22676k.m65745e(this.f167513G, c38915o4.f167513G) && AbstractC22676k.m65745e(this.f167514H, c38915o4.f167514H) && AbstractC22676k.m65745e(this.f167515I, c38915o4.f167515I) && AbstractC22676k.m65745e(this.f167516J, c38915o4.f167516J) && AbstractC22676k.m65745e(this.f167517K, c38915o4.f167517K) && AbstractC22676k.m65745e(this.f167518L, c38915o4.f167518L) && AbstractC22676k.m65745e(this.f167519M, c38915o4.f167519M) && AbstractC22676k.m65745e(this.f167520N, c38915o4.f167520N) && AbstractC22676k.m65745e(this.f167521O, c38915o4.f167521O) && AbstractC22676k.m65745e(this.f167522P, c38915o4.f167522P) && AbstractC22676k.m65745e(this.f167523Q, c38915o4.f167523Q) && AbstractC22676k.m65745e(this.f167524R, c38915o4.f167524R) && this.f167525S == c38915o4.f167525S && this.f167526T == c38915o4.f167526T;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m124364f() {
        return this.f167524R != null;
    }

    public final int hashCode() {
        int iHashCode = this.f167527w.hashCode() * 31;
        Long l7 = this.f167528x;
        int iM8289b = AbstractC2875y.m8289b((iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31, 31, this.f167529y);
        String str = this.f167530z;
        int iHashCode2 = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
        EnumC38828f4 enumC38828f4 = this.f167511E;
        int iHashCode3 = (iHashCode2 + (enumC38828f4 == null ? 0 : enumC38828f4.hashCode())) * 31;
        C38977v3 c38977v3 = this.f167512F;
        int iHashCode4 = (iHashCode3 + (c38977v3 == null ? 0 : c38977v3.hashCode())) * 31;
        String str2 = this.f167513G;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C39013z3 c39013z3 = this.f167514H;
        int iHashCode6 = (iHashCode5 + (c39013z3 == null ? 0 : c39013z3.hashCode())) * 31;
        C38778a4 c38778a4 = this.f167515I;
        int iHashCode7 = (iHashCode6 + (c38778a4 == null ? 0 : Boolean.hashCode(c38778a4.f166915w))) * 31;
        C38788b4 c38788b4 = this.f167516J;
        int iHashCode8 = (iHashCode7 + (c38788b4 == null ? 0 : c38788b4.hashCode())) * 31;
        C38798c4 c38798c4 = this.f167517K;
        int iHashCode9 = (iHashCode8 + (c38798c4 == null ? 0 : c38798c4.hashCode())) * 31;
        C38818e4 c38818e4 = this.f167518L;
        int iHashCode10 = (iHashCode9 + (c38818e4 == null ? 0 : c38818e4.hashCode())) * 31;
        C38950s3 c38950s3 = this.f167519M;
        int iHashCode11 = (iHashCode10 + (c38950s3 == null ? 0 : c38950s3.hashCode())) * 31;
        C38959t3 c38959t3 = this.f167520N;
        int iHashCode12 = (iHashCode11 + (c38959t3 == null ? 0 : c38959t3.hashCode())) * 31;
        C38897m4 c38897m4 = this.f167521O;
        int iHashCode13 = (iHashCode12 + (c38897m4 == null ? 0 : c38897m4.hashCode())) * 31;
        C38808d4 c38808d4 = this.f167522P;
        int iHashCode14 = (iHashCode13 + (c38808d4 == null ? 0 : c38808d4.hashCode())) * 31;
        C38888l4 c38888l4 = this.f167523Q;
        int iHashCode15 = (iHashCode14 + (c38888l4 == null ? 0 : c38888l4.hashCode())) * 31;
        InterfaceC38949s2 interfaceC38949s2 = this.f167524R;
        int iM8289b2 = AbstractC2875y.m8289b((iHashCode15 + (interfaceC38949s2 == null ? 0 : interfaceC38949s2.hashCode())) * 31, 31, this.f167525S);
        EnumC38941r3 enumC38941r3 = this.f167526T;
        return iM8289b2 + (enumC38941r3 != null ? enumC38941r3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("PaymentMethod(id=");
        sb4.append(this.f167527w);
        sb4.append(", created=");
        sb4.append(this.f167528x);
        sb4.append(", liveMode=");
        AbstractC38963t7.m124391u(sb4, this.f167529y, ", code=", this.f167530z, ", type=");
        sb4.append(this.f167511E);
        sb4.append(", billingDetails=");
        sb4.append(this.f167512F);
        sb4.append(", customerId=");
        sb4.append(this.f167513G);
        sb4.append(", card=");
        sb4.append(this.f167514H);
        sb4.append(", cardPresent=");
        sb4.append(this.f167515I);
        sb4.append(", fpx=");
        sb4.append(this.f167516J);
        sb4.append(", ideal=");
        sb4.append(this.f167517K);
        sb4.append(", sepaDebit=");
        sb4.append(this.f167518L);
        sb4.append(", auBecsDebit=");
        sb4.append(this.f167519M);
        sb4.append(", bacsDebit=");
        sb4.append(this.f167520N);
        sb4.append(", upi=");
        sb4.append(this.f167521O);
        sb4.append(", netbanking=");
        sb4.append(this.f167522P);
        sb4.append(", usBankAccount=");
        sb4.append(this.f167523Q);
        sb4.append(", linkPaymentDetails=");
        sb4.append(this.f167524R);
        sb4.append(", isLinkPassthroughMode=");
        sb4.append(this.f167525S);
        sb4.append(", allowRedisplay=");
        sb4.append(this.f167526T);
        sb4.append(")");
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167527w);
        Long l7 = this.f167528x;
        if (l7 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l7.longValue());
        }
        dest.writeInt(this.f167529y ? 1 : 0);
        dest.writeString(this.f167530z);
        EnumC38828f4 enumC38828f4 = this.f167511E;
        if (enumC38828f4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            enumC38828f4.writeToParcel(dest, i13);
        }
        C38977v3 c38977v3 = this.f167512F;
        if (c38977v3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38977v3.writeToParcel(dest, i13);
        }
        dest.writeString(this.f167513G);
        C39013z3 c39013z3 = this.f167514H;
        if (c39013z3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c39013z3.writeToParcel(dest, i13);
        }
        C38778a4 c38778a4 = this.f167515I;
        if (c38778a4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38778a4.writeToParcel(dest, i13);
        }
        C38788b4 c38788b4 = this.f167516J;
        if (c38788b4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38788b4.writeToParcel(dest, i13);
        }
        C38798c4 c38798c4 = this.f167517K;
        if (c38798c4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38798c4.writeToParcel(dest, i13);
        }
        C38818e4 c38818e4 = this.f167518L;
        if (c38818e4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38818e4.writeToParcel(dest, i13);
        }
        C38950s3 c38950s3 = this.f167519M;
        if (c38950s3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38950s3.writeToParcel(dest, i13);
        }
        C38959t3 c38959t3 = this.f167520N;
        if (c38959t3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38959t3.writeToParcel(dest, i13);
        }
        C38897m4 c38897m4 = this.f167521O;
        if (c38897m4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38897m4.writeToParcel(dest, i13);
        }
        C38808d4 c38808d4 = this.f167522P;
        if (c38808d4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38808d4.writeToParcel(dest, i13);
        }
        C38888l4 c38888l4 = this.f167523Q;
        if (c38888l4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38888l4.writeToParcel(dest, i13);
        }
        dest.writeParcelable(this.f167524R, i13);
        dest.writeInt(this.f167525S ? 1 : 0);
        EnumC38941r3 enumC38941r3 = this.f167526T;
        if (enumC38941r3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            enumC38941r3.writeToParcel(dest, i13);
        }
    }

    public C38915o4(String id4, Long l7, boolean z4, String str, EnumC38828f4 enumC38828f4, C38977v3 c38977v3, String str2, C39013z3 c39013z3, C38778a4 c38778a4, C38788b4 c38788b4, C38798c4 c38798c4, C38818e4 c38818e4, C38950s3 c38950s3, C38959t3 c38959t3, C38897m4 c38897m4, C38808d4 c38808d4, C38888l4 c38888l4, InterfaceC38949s2 interfaceC38949s2, boolean z13, EnumC38941r3 enumC38941r3) {
        AbstractC22676k.m65750j(id4, "id");
        this.f167527w = id4;
        this.f167528x = l7;
        this.f167529y = z4;
        this.f167530z = str;
        this.f167511E = enumC38828f4;
        this.f167512F = c38977v3;
        this.f167513G = str2;
        this.f167514H = c39013z3;
        this.f167515I = c38778a4;
        this.f167516J = c38788b4;
        this.f167517K = c38798c4;
        this.f167518L = c38818e4;
        this.f167519M = c38950s3;
        this.f167520N = c38959t3;
        this.f167521O = c38897m4;
        this.f167522P = c38808d4;
        this.f167523Q = c38888l4;
        this.f167524R = interfaceC38949s2;
        this.f167525S = z13;
        this.f167526T = enumC38941r3;
    }
}
