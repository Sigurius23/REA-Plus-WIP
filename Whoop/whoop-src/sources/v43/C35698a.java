package v43;

import c13.AbstractC3855a;
import jg3.C21682i;
import v33.C35634s;

/* JADX INFO: renamed from: v43.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C35698a {

    /* JADX INFO: renamed from: a */
    public final C35634s f151895a;

    /* JADX INFO: renamed from: b */
    public final C21682i f151896b;

    public C35698a(C35634s c35634s, C21682i c21682i) {
        EnumC35699b enumC35699b = EnumC35699b.f151897w;
        this.f151895a = c35634s;
        this.f151896b = c21682i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35698a)) {
            return false;
        }
        C35698a c35698a = (C35698a) obj;
        if (!this.f151895a.equals(c35698a.f151895a) || !this.f151896b.equals(c35698a.f151896b)) {
            return false;
        }
        EnumC35699b enumC35699b = EnumC35699b.f151897w;
        return true;
    }

    public final int hashCode() {
        return EnumC35699b.f151897w.hashCode() + AbstractC3855a.m11822f(this.f151896b, this.f151895a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "PinEntry(pinTarget=" + this.f151895a + ", at=" + this.f151896b + ", type=" + EnumC35699b.f151897w + ")";
    }
}
