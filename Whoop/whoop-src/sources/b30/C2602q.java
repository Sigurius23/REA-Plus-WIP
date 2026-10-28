package b30;

import com.whoop.android.R;
import g40.InterfaceC15357g3;
import m83.C25271y;
import p479s4.AbstractC32128i;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.EnumC38853i;

/* JADX INFO: renamed from: b30.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C2602q implements InterfaceC15357g3 {

    /* JADX INFO: renamed from: a */
    public final EnumC38853i f10126a;

    /* JADX INFO: renamed from: b */
    public final boolean f10127b;

    public C2602q(EnumC38853i brand, boolean z4) {
        AbstractC22676k.m65750j(brand, "brand");
        this.f10126a = brand;
        this.f10127b = z4;
    }

    @Override // g40.InterfaceC15357g3
    /* JADX INFO: renamed from: a */
    public final boolean mo7513a() {
        return this.f10127b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2602q)) {
            return false;
        }
        C2602q c2602q = (C2602q) obj;
        return this.f10126a == c2602q.f10126a && this.f10127b == c2602q.f10127b;
    }

    @Override // g40.InterfaceC15357g3
    public final Integer getIcon() {
        return Integer.valueOf(this.f10126a.f167262y);
    }

    @Override // g40.InterfaceC15357g3
    public final InterfaceC41211c getLabel() {
        boolean z4 = this.f10127b;
        EnumC38853i enumC38853i = this.f10126a;
        return z4 ? AbstractC32128i.m100055i(enumC38853i.f167261x) : AbstractC32128i.m100064s(R.string.stripe_card_brand_not_accepted_with_brand, new Object[]{enumC38853i.f167261x}, C25271y.f99162w);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10127b) + (this.f10126a.hashCode() * 31);
    }

    public final String toString() {
        return "CardBrandChoice(brand=" + this.f10126a + ", enabled=" + this.f10127b + ")";
    }
}
