package p522uf;

import p091dg.C12002a;
import p551vf.C35942g;
import p613xf.InterfaceC38255a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: uf.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C34896w {

    /* JADX INFO: renamed from: a */
    public final C12002a f146962a;

    /* JADX INFO: renamed from: b */
    public final C35942g f146963b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC38255a f146964c;

    public C34896w(C12002a context, C35942g c35942g, InterfaceC38255a interfaceC38255a) {
        AbstractC22676k.m65750j(context, "context");
        this.f146962a = context;
        this.f146963b = c35942g;
        this.f146964c = interfaceC38255a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34896w)) {
            return false;
        }
        C34896w c34896w = (C34896w) obj;
        return AbstractC22676k.m65745e(this.f146962a, c34896w.f146962a) && this.f146963b.equals(c34896w.f146963b) && this.f146964c.equals(c34896w.f146964c);
    }

    public final int hashCode() {
        return this.f146964c.hashCode() + ((this.f146963b.hashCode() + (this.f146962a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ResolveEndpointRequest(context=" + this.f146962a + ", httpRequest=" + this.f146963b + ", identity=" + this.f146964c + ')';
    }
}
