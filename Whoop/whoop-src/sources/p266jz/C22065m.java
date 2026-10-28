package p266jz;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jz.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C22065m extends AbstractC22067o {
    public static final Parcelable.Creator<C22065m> CREATOR = new C22060h(3);

    /* JADX INFO: renamed from: w */
    public final FinancialConnectionsSession f85577w;

    public C22065m(FinancialConnectionsSession financialConnectionsSession) {
        AbstractC22676k.m65750j(financialConnectionsSession, "financialConnectionsSession");
        this.f85577w = financialConnectionsSession;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C22065m) && AbstractC22676k.m65745e(this.f85577w, ((C22065m) obj).f85577w);
    }

    public final int hashCode() {
        return this.f85577w.hashCode();
    }

    public final String toString() {
        return "Completed(financialConnectionsSession=" + this.f85577w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f85577w.writeToParcel(dest, i13);
    }
}
