package p270k2;

import p181h2.C16620e;
import p208i2.InterfaceC17915v;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: k2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C22127a {

    /* JADX INFO: renamed from: a */
    public InterfaceC39171c f85847a;

    /* JADX INFO: renamed from: b */
    public EnumC39181m f85848b;

    /* JADX INFO: renamed from: c */
    public InterfaceC17915v f85849c;

    /* JADX INFO: renamed from: d */
    public long f85850d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22127a)) {
            return false;
        }
        C22127a c22127a = (C22127a) obj;
        return AbstractC22676k.m65745e(this.f85847a, c22127a.f85847a) && this.f85848b == c22127a.f85848b && AbstractC22676k.m65745e(this.f85849c, c22127a.f85849c) && C16620e.m47210b(this.f85850d, c22127a.f85850d);
    }

    public final int hashCode() {
        return Long.hashCode(this.f85850d) + ((this.f85849c.hashCode() + ((this.f85848b.hashCode() + (this.f85847a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f85847a + ", layoutDirection=" + this.f85848b + ", canvas=" + this.f85849c + ", size=" + ((Object) C16620e.m47216h(this.f85850d)) + ')';
    }
}
