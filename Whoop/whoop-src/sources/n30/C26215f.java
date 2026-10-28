package n30;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import m83.C25272z;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29926q0;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: n30.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C26215f implements InterfaceC26210a, Parcelable {
    public static final Parcelable.Creator<C26215f> CREATOR = new C26214e();

    /* JADX INFO: renamed from: w */
    public final C29926q0 f103934w;

    public C26215f(C29926q0 c29926q0) {
        this.f103934w = c29926q0;
    }

    @Override // n30.InterfaceC26210a
    /* JADX INFO: renamed from: b */
    public final Map mo77825b() {
        C29926q0 c29926q0 = this.f103934w;
        Map mapM95645u = c29926q0 != null ? AbstractC31061c.m95645u("sdk_transaction_id", c29926q0.f122226w) : null;
        return mapM95645u == null ? C25272z.f99163w : mapM95645u;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26215f) && AbstractC22676k.m65745e(this.f103934w, ((C26215f) obj).f103934w);
    }

    public final int hashCode() {
        C29926q0 c29926q0 = this.f103934w;
        if (c29926q0 == null) {
            return 0;
        }
        return c29926q0.f122226w.hashCode();
    }

    public final String toString() {
        return "Stripe3ds2ErrorReporterConfig(sdkTransactionId=" + this.f103934w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        C29926q0 c29926q0 = this.f103934w;
        if (c29926q0 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c29926q0.writeToParcel(dest, i13);
        }
    }
}
