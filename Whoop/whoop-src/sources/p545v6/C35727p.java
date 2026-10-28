package p545v6;

import p335n6.InterfaceC26397n;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v6.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C35727p implements InterfaceC26397n {

    /* JADX INFO: renamed from: a */
    public final C35726o f151974a;

    /* JADX INFO: renamed from: b */
    public final C35726o f151975b;

    /* JADX INFO: renamed from: c */
    public final C35726o f151976c;

    /* JADX INFO: renamed from: d */
    public final C35726o f151977d;

    /* JADX INFO: renamed from: e */
    public final C35726o f151978e;

    /* JADX INFO: renamed from: f */
    public final C35726o f151979f;

    public C35727p(C35726o c35726o, C35726o c35726o2, C35726o c35726o3, C35726o c35726o4, C35726o c35726o5, C35726o c35726o6) {
        this.f151974a = c35726o;
        this.f151975b = c35726o2;
        this.f151976c = c35726o3;
        this.f151977d = c35726o4;
        this.f151978e = c35726o5;
        this.f151979f = c35726o6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35727p)) {
            return false;
        }
        C35727p c35727p = (C35727p) obj;
        return AbstractC22676k.m65745e(this.f151974a, c35727p.f151974a) && AbstractC22676k.m65745e(this.f151975b, c35727p.f151975b) && AbstractC22676k.m65745e(this.f151976c, c35727p.f151976c) && AbstractC22676k.m65745e(this.f151977d, c35727p.f151977d) && AbstractC22676k.m65745e(this.f151978e, c35727p.f151978e) && AbstractC22676k.m65745e(this.f151979f, c35727p.f151979f);
    }

    public final int hashCode() {
        return this.f151979f.hashCode() + ((this.f151978e.hashCode() + ((this.f151977d.hashCode() + ((this.f151976c.hashCode() + ((this.f151975b.hashCode() + (this.f151974a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PaddingModifier(left=" + this.f151974a + ", start=" + this.f151975b + ", top=" + this.f151976c + ", right=" + this.f151977d + ", end=" + this.f151978e + ", bottom=" + this.f151979f + ')';
    }
}
