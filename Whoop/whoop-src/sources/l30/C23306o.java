package l30;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p266jz.C22060h;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l30.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C23306o implements Parcelable {
    public static final Parcelable.Creator<C23306o> CREATOR = new C22060h(20);

    /* JADX INFO: renamed from: w */
    public final String f92352w;

    /* JADX INFO: renamed from: x */
    public final String f92353x;

    /* JADX INFO: renamed from: y */
    public final EnumC23305n f92354y;

    public C23306o(String id4, String message, EnumC23305n severity) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(severity, "severity");
        this.f92352w = id4;
        this.f92353x = message;
        this.f92354y = severity;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23306o)) {
            return false;
        }
        C23306o c23306o = (C23306o) obj;
        return AbstractC22676k.m65745e(this.f92352w, c23306o.f92352w) && AbstractC22676k.m65745e(this.f92353x, c23306o.f92353x) && this.f92354y == c23306o.f92354y;
    }

    public final int hashCode() {
        return this.f92354y.hashCode() + AbstractC11266d.m30450d(this.f92352w.hashCode() * 31, 31, this.f92353x);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Warning(id=", this.f92352w, ", message=", this.f92353x, ", severity=");
        sbM32001t.append(this.f92354y);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f92352w);
        dest.writeString(this.f92353x);
        dest.writeString(this.f92354y.name());
    }
}
