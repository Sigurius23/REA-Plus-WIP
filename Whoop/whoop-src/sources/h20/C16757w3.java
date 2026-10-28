package h20;

import a30.AbstractC0326t0;
import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: h20.w3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16757w3 implements Parcelable {
    public static final Parcelable.Creator<C16757w3> CREATOR = new C16654f2(24);

    /* JADX INFO: renamed from: E */
    public final boolean f64381E;

    /* JADX INFO: renamed from: w */
    public final AbstractC0326t0 f64382w;

    /* JADX INFO: renamed from: x */
    public final C16761x1 f64383x;

    /* JADX INFO: renamed from: y */
    public final String f64384y;

    /* JADX INFO: renamed from: z */
    public final Integer f64385z;

    public C16757w3(AbstractC0326t0 initializationMode, C16761x1 config, String paymentElementCallbackIdentifier, Integer num, boolean z4) {
        AbstractC22676k.m65750j(initializationMode, "initializationMode");
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
        this.f64382w = initializationMode;
        this.f64383x = config;
        this.f64384y = paymentElementCallbackIdentifier;
        this.f64385z = num;
        this.f64381E = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16757w3)) {
            return false;
        }
        C16757w3 c16757w3 = (C16757w3) obj;
        return AbstractC22676k.m65745e(this.f64382w, c16757w3.f64382w) && AbstractC22676k.m65745e(this.f64383x, c16757w3.f64383x) && AbstractC22676k.m65745e(this.f64384y, c16757w3.f64384y) && AbstractC22676k.m65745e(this.f64385z, c16757w3.f64385z) && this.f64381E == c16757w3.f64381E;
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.f64383x.hashCode() + (this.f64382w.hashCode() * 31)) * 31, 31, this.f64384y);
        Integer num = this.f64385z;
        return Boolean.hashCode(this.f64381E) + ((iM30450d + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Args(initializationMode=");
        sb4.append(this.f64382w);
        sb4.append(", config=");
        sb4.append(this.f64383x);
        sb4.append(", paymentElementCallbackIdentifier=");
        AbstractC30007c.m91853w(this.f64385z, this.f64384y, ", statusBarColor=", ", initializedViaCompose=", sb4);
        return AbstractC18489d0.m53372m(sb4, this.f64381E, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f64382w, i13);
        dest.writeParcelable(this.f64383x, i13);
        dest.writeString(this.f64384y);
        Integer num = this.f64385z;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        dest.writeInt(this.f64381E ? 1 : 0);
    }
}
