package p163g1;

import p490t0.AbstractC33244a;
import p490t0.C33252i;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g1.l5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15071l5 {

    /* JADX INFO: renamed from: a */
    public final AbstractC33244a f56427a;

    /* JADX INFO: renamed from: b */
    public final C33252i f56428b;

    /* JADX INFO: renamed from: c */
    public final C33252i f56429c;

    public C15071l5(AbstractC33244a abstractC33244a, C33252i c33252i, C33252i c33252i2) {
        this.f56427a = abstractC33244a;
        this.f56428b = c33252i;
        this.f56429c = c33252i2;
    }

    /* JADX INFO: renamed from: a */
    public static C15071l5 m43152a(C15071l5 c15071l5, C33252i c33252i, C33252i c33252i2, int i13) {
        AbstractC33244a abstractC33244a = c33252i;
        if ((i13 & 1) != 0) {
            abstractC33244a = c15071l5.f56427a;
        }
        C33252i c33252i3 = c15071l5.f56429c;
        c15071l5.getClass();
        return new C15071l5(abstractC33244a, c33252i2, c33252i3);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC33244a m43153b() {
        return this.f56428b;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC33244a m43154c() {
        return this.f56427a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15071l5)) {
            return false;
        }
        C15071l5 c15071l5 = (C15071l5) obj;
        return AbstractC22676k.m65745e(this.f56427a, c15071l5.f56427a) && this.f56428b.equals(c15071l5.f56428b) && this.f56429c.equals(c15071l5.f56429c);
    }

    public final int hashCode() {
        return this.f56429c.hashCode() + ((this.f56428b.hashCode() + (this.f56427a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(small=" + this.f56427a + ", medium=" + this.f56428b + ", large=" + this.f56429c + ')';
    }
}
