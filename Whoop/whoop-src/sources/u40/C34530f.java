package u40;

import android.os.Parcel;
import android.os.Parcelable;
import c93.InterfaceC4339a;
import java.io.Serializable;
import p000.AbstractC30802r;
import p486sp.C32854e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: u40.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C34530f implements Parcelable {
    public static final Parcelable.Creator<C34530f> CREATOR = new C32854e(19);

    /* JADX INFO: renamed from: w */
    public final InterfaceC4339a f145149w;

    /* JADX INFO: renamed from: x */
    public final Function1 f145150x;

    /* JADX INFO: renamed from: y */
    public final Function1 f145151y;

    public C34530f(InterfaceC4339a onOpen, Function1 onSuccess, Function1 onFailure) {
        AbstractC22676k.m65750j(onOpen, "onOpen");
        AbstractC22676k.m65750j(onSuccess, "onSuccess");
        AbstractC22676k.m65750j(onFailure, "onFailure");
        this.f145149w = onOpen;
        this.f145150x = onSuccess;
        this.f145151y = onFailure;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34530f)) {
            return false;
        }
        C34530f c34530f = (C34530f) obj;
        return AbstractC22676k.m65745e(this.f145149w, c34530f.f145149w) && AbstractC22676k.m65745e(this.f145150x, c34530f.f145150x) && AbstractC22676k.m65745e(this.f145151y, c34530f.f145151y);
    }

    public final int hashCode() {
        return this.f145151y.hashCode() + AbstractC30802r.m94756e(this.f145150x, this.f145149w.hashCode() * 31, 31);
    }

    public final String toString() {
        return "HCaptchaStateListener(onOpen=" + this.f145149w + ", onSuccess=" + this.f145150x + ", onFailure=" + this.f145151y + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeSerializable((Serializable) this.f145149w);
        dest.writeSerializable((Serializable) this.f145150x);
        dest.writeSerializable((Serializable) this.f145151y);
    }
}
