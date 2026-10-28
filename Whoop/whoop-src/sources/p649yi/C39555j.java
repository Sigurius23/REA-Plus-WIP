package p649yi;

import p426qi.C30387i;
import p426qi.C30402w;
import p616xi.C38314b;
import p616xi.C38317e;
import p682zi.AbstractC40652b;
import si.C32530p;
import si.InterfaceC32517c;

/* JADX INFO: renamed from: yi.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C39555j implements InterfaceC39547b {

    /* JADX INFO: renamed from: a */
    public final String f170177a;

    /* JADX INFO: renamed from: b */
    public final C38314b f170178b;

    /* JADX INFO: renamed from: c */
    public final C38314b f170179c;

    /* JADX INFO: renamed from: d */
    public final C38317e f170180d;

    /* JADX INFO: renamed from: e */
    public final boolean f170181e;

    public C39555j(String str, C38314b c38314b, C38314b c38314b2, C38317e c38317e, boolean z4) {
        this.f170177a = str;
        this.f170178b = c38314b;
        this.f170179c = c38314b2;
        this.f170180d = c38317e;
        this.f170181e = z4;
    }

    @Override // p649yi.InterfaceC39547b
    /* JADX INFO: renamed from: a */
    public final InterfaceC32517c mo122786a(C30402w c30402w, C30387i c30387i, AbstractC40652b abstractC40652b) {
        return new C32530p(c30402w, abstractC40652b, this);
    }
}
