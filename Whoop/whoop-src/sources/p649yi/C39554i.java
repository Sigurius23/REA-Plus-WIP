package p649yi;

import p426qi.C30387i;
import p426qi.C30402w;
import p616xi.C38313a;
import p616xi.C38314b;
import p616xi.InterfaceC38318f;
import p682zi.AbstractC40652b;
import si.C32529o;
import si.InterfaceC32517c;

/* JADX INFO: renamed from: yi.i */
/* JADX INFO: loaded from: classes.dex */
public final class C39554i implements InterfaceC39547b {

    /* JADX INFO: renamed from: a */
    public final String f170172a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC38318f f170173b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC38318f f170174c;

    /* JADX INFO: renamed from: d */
    public final C38314b f170175d;

    /* JADX INFO: renamed from: e */
    public final boolean f170176e;

    public C39554i(String str, InterfaceC38318f interfaceC38318f, C38313a c38313a, C38314b c38314b, boolean z4) {
        this.f170172a = str;
        this.f170173b = interfaceC38318f;
        this.f170174c = c38313a;
        this.f170175d = c38314b;
        this.f170176e = z4;
    }

    @Override // p649yi.InterfaceC39547b
    /* JADX INFO: renamed from: a */
    public final InterfaceC32517c mo122786a(C30402w c30402w, C30387i c30387i, AbstractC40652b abstractC40652b) {
        return new C32529o(c30402w, abstractC40652b, this);
    }

    public final String toString() {
        return "RectangleShape{position=" + this.f170173b + ", size=" + this.f170174c + '}';
    }
}
