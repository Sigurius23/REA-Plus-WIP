package p649yi;

import p426qi.C30387i;
import p426qi.C30402w;
import p616xi.C38313a;
import p616xi.InterfaceC38318f;
import p682zi.AbstractC40652b;
import si.C32520f;
import si.InterfaceC32517c;

/* JADX INFO: renamed from: yi.a */
/* JADX INFO: loaded from: classes.dex */
public final class C39546a implements InterfaceC39547b {

    /* JADX INFO: renamed from: a */
    public final String f170127a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC38318f f170128b;

    /* JADX INFO: renamed from: c */
    public final C38313a f170129c;

    /* JADX INFO: renamed from: d */
    public final boolean f170130d;

    /* JADX INFO: renamed from: e */
    public final boolean f170131e;

    public C39546a(String str, InterfaceC38318f interfaceC38318f, C38313a c38313a, boolean z4, boolean z13) {
        this.f170127a = str;
        this.f170128b = interfaceC38318f;
        this.f170129c = c38313a;
        this.f170130d = z4;
        this.f170131e = z13;
    }

    @Override // p649yi.InterfaceC39547b
    /* JADX INFO: renamed from: a */
    public final InterfaceC32517c mo122786a(C30402w c30402w, C30387i c30387i, AbstractC40652b abstractC40652b) {
        return new C32520f(c30402w, abstractC40652b, this);
    }
}
