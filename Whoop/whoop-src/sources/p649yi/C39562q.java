package p649yi;

import p426qi.C30387i;
import p426qi.C30402w;
import p616xi.C38314b;
import p682zi.AbstractC40652b;
import si.C32534t;
import si.InterfaceC32517c;

/* JADX INFO: renamed from: yi.q */
/* JADX INFO: loaded from: classes.dex */
public final class C39562q implements InterfaceC39547b {

    /* JADX INFO: renamed from: a */
    public final int f170209a;

    /* JADX INFO: renamed from: b */
    public final C38314b f170210b;

    /* JADX INFO: renamed from: c */
    public final C38314b f170211c;

    /* JADX INFO: renamed from: d */
    public final C38314b f170212d;

    /* JADX INFO: renamed from: e */
    public final boolean f170213e;

    public C39562q(String str, int i13, C38314b c38314b, C38314b c38314b2, C38314b c38314b3, boolean z4) {
        this.f170209a = i13;
        this.f170210b = c38314b;
        this.f170211c = c38314b2;
        this.f170212d = c38314b3;
        this.f170213e = z4;
    }

    @Override // p649yi.InterfaceC39547b
    /* JADX INFO: renamed from: a */
    public final InterfaceC32517c mo122786a(C30402w c30402w, C30387i c30387i, AbstractC40652b abstractC40652b) {
        return new C32534t(abstractC40652b, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f170210b + ", end: " + this.f170211c + ", offset: " + this.f170212d + "}";
    }
}
