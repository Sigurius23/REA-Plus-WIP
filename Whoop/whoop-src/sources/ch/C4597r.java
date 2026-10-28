package ch;

import androidx.compose.p018ui.Modifier;
import coil.compose.AsyncImagePainter;
import p000.AbstractC11266d;
import p026b2.C2314t;
import p026b2.InterfaceC2302h;
import p291l0.InterfaceC23001u;
import p635y2.InterfaceC39105k;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ch.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C4597r implements InterfaceC23001u {

    /* JADX INFO: renamed from: a */
    public final InterfaceC23001u f18486a;

    /* JADX INFO: renamed from: b */
    public final AsyncImagePainter f18487b;

    /* JADX INFO: renamed from: c */
    public final String f18488c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2302h f18489d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC39105k f18490e;

    public C4597r(InterfaceC23001u interfaceC23001u, AsyncImagePainter asyncImagePainter, String str, InterfaceC2302h interfaceC2302h, InterfaceC39105k interfaceC39105k) {
        this.f18486a = interfaceC23001u;
        this.f18487b = asyncImagePainter;
        this.f18488c = str;
        this.f18489d = interfaceC2302h;
        this.f18490e = interfaceC39105k;
    }

    @Override // p291l0.InterfaceC23001u
    /* JADX INFO: renamed from: a */
    public final Modifier mo3400a(Modifier modifier, InterfaceC2302h interfaceC2302h) {
        return this.f18486a.mo3400a(modifier, interfaceC2302h);
    }

    @Override // p291l0.InterfaceC23001u
    /* JADX INFO: renamed from: b */
    public final Modifier mo3401b(Modifier modifier) {
        return this.f18486a.mo3401b(C2314t.f9131w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4597r)) {
            return false;
        }
        C4597r c4597r = (C4597r) obj;
        return AbstractC22676k.m65745e(this.f18486a, c4597r.f18486a) && this.f18487b.equals(c4597r.f18487b) && AbstractC22676k.m65745e(this.f18488c, c4597r.f18488c) && AbstractC22676k.m65745e(this.f18489d, c4597r.f18489d) && AbstractC22676k.m65745e(this.f18490e, c4597r.f18490e) && Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        int iHashCode = (this.f18487b.hashCode() + (this.f18486a.hashCode() * 31)) * 31;
        String str = this.f18488c;
        return Boolean.hashCode(true) + AbstractC11266d.m30447a(1.0f, (this.f18490e.hashCode() + ((this.f18489d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 961);
    }

    public final String toString() {
        return "RealSubcomposeAsyncImageScope(parentScope=" + this.f18486a + ", painter=" + this.f18487b + ", contentDescription=" + this.f18488c + ", alignment=" + this.f18489d + ", contentScale=" + this.f18490e + ", alpha=1.0, colorFilter=null, clipToBounds=true)";
    }
}
