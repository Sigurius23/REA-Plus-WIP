package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import l83.C23465k;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: y00.p5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38925p5 extends AbstractC38970u5 {
    public static final Parcelable.Creator<C38925p5> CREATOR = new C38858i4(28);

    /* JADX INFO: renamed from: x */
    public final EnumC38828f4 f167553x;

    /* JADX INFO: renamed from: y */
    public final EnumC38910o f167554y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38925p5(EnumC38828f4 paymentMethodType, EnumC38910o setupFutureUsage) {
        super(paymentMethodType);
        AbstractC22676k.m65750j(paymentMethodType, "paymentMethodType");
        AbstractC22676k.m65750j(setupFutureUsage, "setupFutureUsage");
        this.f167553x = paymentMethodType;
        this.f167554y = setupFutureUsage;
    }

    @Override // y00.AbstractC38970u5
    /* JADX INFO: renamed from: b */
    public final List mo124356b() {
        return AbstractC37056f.m118958J(new C23465k("setup_future_usage", this.f167554y.f167492w));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38925p5)) {
            return false;
        }
        C38925p5 c38925p5 = (C38925p5) obj;
        return this.f167553x == c38925p5.f167553x && this.f167554y == c38925p5.f167554y;
    }

    public final int hashCode() {
        return this.f167554y.hashCode() + (this.f167553x.hashCode() * 31);
    }

    public final String toString() {
        return "SetupFutureUsage(paymentMethodType=" + this.f167553x + ", setupFutureUsage=" + this.f167554y + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f167553x.writeToParcel(dest, i13);
        dest.writeString(this.f167554y.name());
    }
}
