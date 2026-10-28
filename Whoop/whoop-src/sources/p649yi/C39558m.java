package p649yi;

import android.graphics.Path;
import p031b9.AbstractC2875y;
import p426qi.C30387i;
import p426qi.C30402w;
import p616xi.C38313a;
import p682zi.AbstractC40652b;
import si.C32521g;
import si.InterfaceC32517c;

/* JADX INFO: renamed from: yi.m */
/* JADX INFO: loaded from: classes.dex */
public final class C39558m implements InterfaceC39547b {

    /* JADX INFO: renamed from: a */
    public final boolean f170186a;

    /* JADX INFO: renamed from: b */
    public final Path.FillType f170187b;

    /* JADX INFO: renamed from: c */
    public final String f170188c;

    /* JADX INFO: renamed from: d */
    public final C38313a f170189d;

    /* JADX INFO: renamed from: e */
    public final C38313a f170190e;

    /* JADX INFO: renamed from: f */
    public final boolean f170191f;

    public C39558m(String str, boolean z4, Path.FillType fillType, C38313a c38313a, C38313a c38313a2, boolean z13) {
        this.f170188c = str;
        this.f170186a = z4;
        this.f170187b = fillType;
        this.f170189d = c38313a;
        this.f170190e = c38313a2;
        this.f170191f = z13;
    }

    @Override // p649yi.InterfaceC39547b
    /* JADX INFO: renamed from: a */
    public final InterfaceC32517c mo122786a(C30402w c30402w, C30387i c30387i, AbstractC40652b abstractC40652b) {
        return new C32521g(c30402w, abstractC40652b, this);
    }

    public final String toString() {
        return AbstractC2875y.m8305r(new StringBuilder("ShapeFill{color=, fillEnabled="), this.f170186a, '}');
    }
}
