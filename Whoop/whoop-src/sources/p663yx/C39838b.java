package p663yx;

import android.os.Parcel;
import android.os.Parcelable;
import ih0.AbstractC18489d0;
import m30.C24991g;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: yx.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C39838b implements Parcelable {
    public static final C39837a CREATOR = new C39837a();

    /* JADX INFO: renamed from: E */
    public final String f172015E;

    /* JADX INFO: renamed from: F */
    public final boolean f172016F;

    /* JADX INFO: renamed from: G */
    public final C24991g f172017G;

    /* JADX INFO: renamed from: H */
    public final String f172018H;

    /* JADX INFO: renamed from: I */
    public final boolean f172019I;

    /* JADX INFO: renamed from: J */
    public final boolean f172020J;

    /* JADX INFO: renamed from: K */
    public final Integer f172021K;

    /* JADX INFO: renamed from: L */
    public final String f172022L;

    /* JADX INFO: renamed from: M */
    public final boolean f172023M;

    /* JADX INFO: renamed from: N */
    public final String f172024N;

    /* JADX INFO: renamed from: O */
    public final boolean f172025O;

    /* JADX INFO: renamed from: w */
    public final String f172026w;

    /* JADX INFO: renamed from: x */
    public final int f172027x;

    /* JADX INFO: renamed from: y */
    public final String f172028y;

    /* JADX INFO: renamed from: z */
    public final String f172029z;

    public C39838b(String objectId, int i13, String clientSecret, String url, String str, boolean z4, C24991g c24991g, String str2, boolean z13, boolean z14, Integer num, String publishableKey, boolean z15, String str3, boolean z16) {
        AbstractC22676k.m65750j(objectId, "objectId");
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        this.f172026w = objectId;
        this.f172027x = i13;
        this.f172028y = clientSecret;
        this.f172029z = url;
        this.f172015E = str;
        this.f172016F = z4;
        this.f172017G = c24991g;
        this.f172018H = str2;
        this.f172019I = z13;
        this.f172020J = z14;
        this.f172021K = num;
        this.f172022L = publishableKey;
        this.f172023M = z15;
        this.f172024N = str3;
        this.f172025O = z16;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39838b)) {
            return false;
        }
        C39838b c39838b = (C39838b) obj;
        return AbstractC22676k.m65745e(this.f172026w, c39838b.f172026w) && this.f172027x == c39838b.f172027x && AbstractC22676k.m65745e(this.f172028y, c39838b.f172028y) && AbstractC22676k.m65745e(this.f172029z, c39838b.f172029z) && AbstractC22676k.m65745e(this.f172015E, c39838b.f172015E) && this.f172016F == c39838b.f172016F && AbstractC22676k.m65745e(this.f172017G, c39838b.f172017G) && AbstractC22676k.m65745e(this.f172018H, c39838b.f172018H) && this.f172019I == c39838b.f172019I && this.f172020J == c39838b.f172020J && AbstractC22676k.m65745e(this.f172021K, c39838b.f172021K) && AbstractC22676k.m65745e(this.f172022L, c39838b.f172022L) && this.f172023M == c39838b.f172023M && AbstractC22676k.m65745e(this.f172024N, c39838b.f172024N) && this.f172025O == c39838b.f172025O;
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.f172027x, this.f172026w.hashCode() * 31, 31), 31, this.f172028y), 31, this.f172029z);
        String str = this.f172015E;
        int iM8289b = AbstractC2875y.m8289b((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f172016F);
        C24991g c24991g = this.f172017G;
        int iHashCode = (iM8289b + (c24991g == null ? 0 : c24991g.hashCode())) * 31;
        String str2 = this.f172018H;
        int iM8289b2 = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f172019I), 31, this.f172020J);
        Integer num = this.f172021K;
        int iM8289b3 = AbstractC2875y.m8289b(AbstractC11266d.m30450d((iM8289b2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f172022L), 31, this.f172023M);
        String str3 = this.f172024N;
        return Boolean.hashCode(this.f172025O) + ((iM8289b3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM30467u = AbstractC11266d.m30467u(this.f172027x, "Args(objectId=", this.f172026w, ", requestCode=", ", clientSecret=");
        AbstractC11266d.m30444B(sbM30467u, this.f172028y, ", url=", this.f172029z, ", returnUrl=");
        AbstractC38963t7.m124390t(sbM30467u, this.f172015E, ", enableLogging=", this.f172016F, ", toolbarCustomization=");
        sbM30467u.append(this.f172017G);
        sbM30467u.append(", stripeAccountId=");
        sbM30467u.append(this.f172018H);
        sbM30467u.append(", shouldCancelSource=");
        AbstractC38963t7.m124392v(sbM30467u, this.f172019I, ", shouldCancelIntentOnUserNavigation=", this.f172020J, ", statusBarColor=");
        AbstractC13673n.m38577x(this.f172021K, ", publishableKey=", this.f172022L, ", isInstantApp=", sbM30467u);
        AbstractC38963t7.m124391u(sbM30467u, this.f172023M, ", referrer=", this.f172024N, ", forceInAppWebView=");
        return AbstractC18489d0.m53372m(sbM30467u, this.f172025O, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        AbstractC22676k.m65750j(parcel, "parcel");
        parcel.writeString(this.f172026w);
        parcel.writeInt(this.f172027x);
        parcel.writeString(this.f172028y);
        parcel.writeString(this.f172029z);
        parcel.writeString(this.f172015E);
        parcel.writeByte(this.f172016F ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f172017G, i13);
        parcel.writeString(this.f172018H);
        parcel.writeByte(this.f172019I ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f172020J ? (byte) 1 : (byte) 0);
        parcel.writeValue(this.f172021K);
        parcel.writeString(this.f172022L);
        parcel.writeByte(this.f172023M ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f172024N);
        parcel.writeByte(this.f172025O ? (byte) 1 : (byte) 0);
    }

    public /* synthetic */ C39838b(String str, int i13, String str2, String str3, String str4, boolean z4, C24991g c24991g, String str5, boolean z13, boolean z14, Integer num, String str6, boolean z15, String str7, boolean z16, int i14) {
        this(str, i13, str2, str3, str4, z4, (i14 & 64) != 0 ? null : c24991g, str5, z13, (i14 & 512) != 0 ? true : z14, num, str6, z15, (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : str7, (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? false : z16);
    }
}
