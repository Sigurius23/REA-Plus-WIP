package e10;

import android.os.Parcel;
import android.os.Parcelable;
import h20.C16744u2;
import p031b9.AbstractC2875y;
import p096dq.C12280x;
import p555vl.AbstractC36095b;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import x30.AbstractC37926s0;
import y00.AbstractC38869j5;
import y00.AbstractC38970u5;
import y00.C38809d5;
import y00.C38819e5;
import y00.C38829f5;
import y00.C38839g5;
import y00.C38849h5;
import y00.C38859i5;

/* JADX INFO: renamed from: e10.t0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12572t0 implements InterfaceC12576v0 {
    public static final Parcelable.Creator<C12572t0> CREATOR = new C12280x(21);

    /* JADX INFO: renamed from: E */
    public final boolean f42933E;

    /* JADX INFO: renamed from: F */
    public final boolean f42934F;

    /* JADX INFO: renamed from: w */
    public final C38809d5 f42935w;

    /* JADX INFO: renamed from: x */
    public final AbstractC38970u5 f42936x;

    /* JADX INFO: renamed from: y */
    public final AbstractC38869j5 f42937y;

    /* JADX INFO: renamed from: z */
    public final boolean f42938z;

    public /* synthetic */ C12572t0(C38809d5 c38809d5, AbstractC38970u5 abstractC38970u5, AbstractC38869j5 abstractC38869j5, boolean z4) {
        this(c38809d5, abstractC38970u5, abstractC38869j5, z4, false, false);
    }

    /* JADX INFO: renamed from: b */
    public static C12572t0 m35252b(C12572t0 c12572t0, C38809d5 c38809d5, AbstractC38970u5 abstractC38970u5, int i13) {
        if ((i13 & 2) != 0) {
            abstractC38970u5 = c12572t0.f42936x;
        }
        AbstractC38970u5 abstractC38970u6 = abstractC38970u5;
        AbstractC38869j5 abstractC38869j5 = c12572t0.f42937y;
        boolean z4 = c12572t0.f42938z;
        boolean z13 = (i13 & 16) != 0 ? c12572t0.f42933E : true;
        boolean z14 = (i13 & 32) != 0 ? c12572t0.f42934F : true;
        c12572t0.getClass();
        return new C12572t0(c38809d5, abstractC38970u6, abstractC38869j5, z4, z13, z14);
    }

    @Override // e10.InterfaceC12576v0
    /* JADX INFO: renamed from: V */
    public final boolean mo35253V() {
        AbstractC38869j5 abstractC38869j5 = this.f42937y;
        if (abstractC38869j5 instanceof C38829f5) {
            return AbstractC22676k.m65745e(((C38829f5) abstractC38869j5).f167136x, Boolean.TRUE);
        }
        if (abstractC38869j5 instanceof C38859i5) {
            return AbstractC22676k.m65745e(((C38859i5) abstractC38869j5).f167279x, Boolean.TRUE);
        }
        if (abstractC38869j5 instanceof C38839g5) {
            return AbstractC22676k.m65745e(((C38839g5) abstractC38869j5).f167165x, Boolean.TRUE);
        }
        if (abstractC38869j5 instanceof C38849h5) {
            return AbstractC22676k.m65745e(((C38849h5) abstractC38869j5).f167226x, Boolean.TRUE);
        }
        if ((abstractC38869j5 instanceof C38819e5) || abstractC38869j5 == null) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // e10.InterfaceC12576v0
    /* JADX INFO: renamed from: Z */
    public final InterfaceC12576v0 mo35254Z(C16744u2 intentConfiguration) {
        AbstractC22676k.m65750j(intentConfiguration, "intentConfiguration");
        C38809d5 c38809d5M121460L = AbstractC37926s0.m121460L(this.f42935w, intentConfiguration);
        return m35252b(this, c38809d5M121460L, AbstractC37926s0.m121459K(this.f42936x, c38809d5M121460L.f167026w, intentConfiguration), 60);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12572t0)) {
            return false;
        }
        C12572t0 c12572t0 = (C12572t0) obj;
        return AbstractC22676k.m65745e(this.f42935w, c12572t0.f42935w) && AbstractC22676k.m65745e(this.f42936x, c12572t0.f42936x) && AbstractC22676k.m65745e(this.f42937y, c12572t0.f42937y) && this.f42938z == c12572t0.f42938z && this.f42933E == c12572t0.f42933E && this.f42934F == c12572t0.f42934F;
    }

    public final int hashCode() {
        int iHashCode = this.f42935w.hashCode() * 31;
        AbstractC38970u5 abstractC38970u5 = this.f42936x;
        int iHashCode2 = (iHashCode + (abstractC38970u5 == null ? 0 : abstractC38970u5.hashCode())) * 31;
        AbstractC38869j5 abstractC38869j5 = this.f42937y;
        return Boolean.hashCode(this.f42934F) + AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode2 + (abstractC38869j5 != null ? abstractC38869j5.hashCode() : 0)) * 31, 31, this.f42938z), 31, this.f42933E);
    }

    @Override // e10.InterfaceC12576v0
    /* JADX INFO: renamed from: n */
    public final AbstractC38970u5 mo35255n() {
        return this.f42936x;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("New(createParams=");
        sb4.append(this.f42935w);
        sb4.append(", optionsParams=");
        sb4.append(this.f42936x);
        sb4.append(", extraParams=");
        sb4.append(this.f42937y);
        sb4.append(", shouldSave=");
        sb4.append(this.f42938z);
        sb4.append(", passiveChallengeComplete=");
        return AbstractC36095b.m114682j(sb4, this.f42933E, ", attestationComplete=", this.f42934F, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f42935w, i13);
        dest.writeParcelable(this.f42936x, i13);
        dest.writeParcelable(this.f42937y, i13);
        dest.writeInt(this.f42938z ? 1 : 0);
        dest.writeInt(this.f42933E ? 1 : 0);
        dest.writeInt(this.f42934F ? 1 : 0);
    }

    public C12572t0(C38809d5 createParams, AbstractC38970u5 abstractC38970u5, AbstractC38869j5 abstractC38869j5, boolean z4, boolean z13, boolean z14) {
        AbstractC22676k.m65750j(createParams, "createParams");
        this.f42935w = createParams;
        this.f42936x = abstractC38970u5;
        this.f42937y = abstractC38869j5;
        this.f42938z = z4;
        this.f42933E = z13;
        this.f42934F = z14;
    }
}
