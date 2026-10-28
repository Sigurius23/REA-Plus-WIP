package nf;

import gf.InterfaceC15761b;
import p091dg.C12002a;
import p551vf.C35937b;
import p613xf.InterfaceC38255a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: nf.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C26657k {

    /* JADX INFO: renamed from: a */
    public final C35937b f105949a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC38255a f105950b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC15761b f105951c;

    public C26657k(C35937b httpRequest, InterfaceC38255a identity, C12002a signingAttributes) {
        AbstractC22676k.m65750j(httpRequest, "httpRequest");
        AbstractC22676k.m65750j(identity, "identity");
        AbstractC22676k.m65750j(signingAttributes, "signingAttributes");
        this.f105949a = httpRequest;
        this.f105950b = identity;
        this.f105951c = signingAttributes;
    }

    /* JADX INFO: renamed from: a */
    public final C35937b m79295a() {
        return this.f105949a;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC38255a m79296b() {
        return this.f105950b;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC15761b m79297c() {
        return this.f105951c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26657k)) {
            return false;
        }
        C26657k c26657k = (C26657k) obj;
        return AbstractC22676k.m65745e(this.f105949a, c26657k.f105949a) && AbstractC22676k.m65745e(this.f105950b, c26657k.f105950b) && AbstractC22676k.m65745e(this.f105951c, c26657k.f105951c);
    }

    public final int hashCode() {
        return this.f105951c.hashCode() + ((this.f105950b.hashCode() + (this.f105949a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SignHttpRequest(httpRequest=" + this.f105949a + ", identity=" + this.f105950b + ", signingAttributes=" + this.f105951c + ')';
    }
}
