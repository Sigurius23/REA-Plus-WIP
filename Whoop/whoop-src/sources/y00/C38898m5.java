package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import l83.C23465k;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: y00.m5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38898m5 extends AbstractC38970u5 {
    public static final Parcelable.Creator<C38898m5> CREATOR = new C38858i4(25);

    /* JADX INFO: renamed from: x */
    public final String f167446x;

    /* JADX INFO: renamed from: y */
    public final EnumC38910o f167447y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38898m5(String confirmationNumber, EnumC38910o enumC38910o) {
        super(EnumC38828f4.f167122o0);
        AbstractC22676k.m65750j(confirmationNumber, "confirmationNumber");
        this.f167446x = confirmationNumber;
        this.f167447y = enumC38910o;
    }

    @Override // y00.AbstractC38970u5
    /* JADX INFO: renamed from: b */
    public final List mo124356b() {
        C23465k c23465k = new C23465k("confirmation_number", this.f167446x);
        EnumC38910o enumC38910o = this.f167447y;
        return AbstractC37056f.m118959K(c23465k, new C23465k("setup_future_usage", enumC38910o != null ? enumC38910o.f167492w : null));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38898m5)) {
            return false;
        }
        C38898m5 c38898m5 = (C38898m5) obj;
        return AbstractC22676k.m65745e(this.f167446x, c38898m5.f167446x) && this.f167447y == c38898m5.f167447y;
    }

    public final int hashCode() {
        int iHashCode = this.f167446x.hashCode() * 31;
        EnumC38910o enumC38910o = this.f167447y;
        return iHashCode + (enumC38910o == null ? 0 : enumC38910o.hashCode());
    }

    public final String toString() {
        return "Konbini(confirmationNumber=" + this.f167446x + ", setupFutureUsage=" + this.f167447y + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167446x);
        EnumC38910o enumC38910o = this.f167447y;
        if (enumC38910o == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC38910o.name());
        }
    }
}
