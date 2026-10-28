package p395p6;

import p000.AbstractC11266d;
import p545v6.C35712a;
import p545v6.C35713b;

/* JADX INFO: renamed from: p6.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C28906p {

    /* JADX INFO: renamed from: a */
    public final EnumC28881g1 f116997a;

    /* JADX INFO: renamed from: b */
    public final int f116998b;

    /* JADX INFO: renamed from: c */
    public final int f116999c;

    public C28906p(EnumC28881g1 enumC28881g1, int i13, int i14) {
        this.f116997a = enumC28881g1;
        this.f116998b = i13;
        this.f116999c = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28906p)) {
            return false;
        }
        C28906p c28906p = (C28906p) obj;
        return this.f116997a == c28906p.f116997a && this.f116998b == c28906p.f116998b && this.f116999c == c28906p.f116999c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f116999c) + AbstractC11266d.m30448b(this.f116998b, this.f116997a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "BoxChildSelector(type=" + this.f116997a + ", horizontalAlignment=" + ((Object) C35712a.m113184b(this.f116998b)) + ", verticalAlignment=" + ((Object) C35713b.m113186b(this.f116999c)) + ')';
    }
}
