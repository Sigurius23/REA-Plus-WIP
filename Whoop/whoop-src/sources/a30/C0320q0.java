package a30;

import a10.C0113a;
import android.os.Parcel;
import android.os.Parcelable;
import d10.C11465b;
import h20.AbstractC16726r2;
import h20.C16714p2;
import h20.C16744u2;
import p715kotlin.jvm.internal.AbstractC22676k;
import v00.AbstractC35455a0;
import v00.C35495w;

/* JADX INFO: renamed from: a30.q0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C0320q0 extends AbstractC0326t0 {
    public static final Parcelable.Creator<C0320q0> CREATOR = new C0113a(15);

    /* JADX INFO: renamed from: w */
    public final C16744u2 f1106w;

    public C0320q0(C16744u2 intentConfiguration) {
        AbstractC22676k.m65750j(intentConfiguration, "intentConfiguration");
        this.f1106w = intentConfiguration;
    }

    @Override // a30.AbstractC0326t0
    /* JADX INFO: renamed from: b */
    public final AbstractC35455a0 mo828b(C11465b c11465b) {
        if ((c11465b != null ? c11465b.f36803a : null) != null) {
            return new C35495w(this.f1106w);
        }
        throw new IllegalStateException("No callback for deferred intent.");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0320q0) && AbstractC22676k.m65745e(this.f1106w, ((C0320q0) obj).f1106w);
    }

    @Override // a30.AbstractC0326t0
    /* JADX INFO: renamed from: f */
    public final void mo829f() {
        AbstractC16726r2 abstractC16726r2 = this.f1106w.f64308w;
        C16714p2 c16714p2 = abstractC16726r2 instanceof C16714p2 ? (C16714p2) abstractC16726r2 : null;
        if (c16714p2 != null && c16714p2.f64247w <= 0) {
            throw new IllegalArgumentException("Payment IntentConfiguration requires a positive amount.");
        }
    }

    public final int hashCode() {
        return this.f1106w.hashCode();
    }

    public final String toString() {
        return "DeferredIntent(intentConfiguration=" + this.f1106w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f1106w.writeToParcel(dest, i13);
    }
}
