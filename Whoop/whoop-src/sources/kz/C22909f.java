package kz;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import p266jz.C22060h;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38842g8;

/* JADX INFO: renamed from: kz.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C22909f extends AbstractC22911h {
    public static final Parcelable.Creator<C22909f> CREATOR = new C22060h(11);

    /* JADX INFO: renamed from: w */
    public final C22919p f90457w;

    /* JADX INFO: renamed from: x */
    public final FinancialConnectionsSession f90458x;

    /* JADX INFO: renamed from: y */
    public final C38842g8 f90459y;

    public C22909f(C22919p c22919p, FinancialConnectionsSession financialConnectionsSession, C38842g8 c38842g8) {
        this.f90457w = c22919p;
        this.f90458x = financialConnectionsSession;
        this.f90459y = c38842g8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22909f)) {
            return false;
        }
        C22909f c22909f = (C22909f) obj;
        return AbstractC22676k.m65745e(this.f90457w, c22909f.f90457w) && AbstractC22676k.m65745e(this.f90458x, c22909f.f90458x) && AbstractC22676k.m65745e(this.f90459y, c22909f.f90459y);
    }

    public final int hashCode() {
        C22919p c22919p = this.f90457w;
        int iHashCode = (c22919p == null ? 0 : c22919p.hashCode()) * 31;
        FinancialConnectionsSession financialConnectionsSession = this.f90458x;
        int iHashCode2 = (iHashCode + (financialConnectionsSession == null ? 0 : financialConnectionsSession.hashCode())) * 31;
        C38842g8 c38842g8 = this.f90459y;
        return iHashCode2 + (c38842g8 != null ? c38842g8.hashCode() : 0);
    }

    public final String toString() {
        return "Completed(instantDebits=" + this.f90457w + ", financialConnectionsSession=" + this.f90458x + ", token=" + this.f90459y + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        C22919p c22919p = this.f90457w;
        if (c22919p == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c22919p.writeToParcel(dest, i13);
        }
        FinancialConnectionsSession financialConnectionsSession = this.f90458x;
        if (financialConnectionsSession == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            financialConnectionsSession.writeToParcel(dest, i13);
        }
        dest.writeParcelable(this.f90459y, i13);
    }

    public /* synthetic */ C22909f(FinancialConnectionsSession financialConnectionsSession, C38842g8 c38842g8, int i13) {
        this((C22919p) null, financialConnectionsSession, (i13 & 4) != 0 ? null : c38842g8);
    }
}
