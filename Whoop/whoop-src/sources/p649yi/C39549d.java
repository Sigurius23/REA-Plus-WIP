package p649yi;

import android.graphics.Path;
import p426qi.C30387i;
import p426qi.C30402w;
import p616xi.C38313a;
import p682zi.AbstractC40652b;
import si.C32522h;
import si.InterfaceC32517c;

/* JADX INFO: renamed from: yi.d */
/* JADX INFO: loaded from: classes.dex */
public final class C39549d implements InterfaceC39547b {

    /* JADX INFO: renamed from: a */
    public final int f170134a;

    /* JADX INFO: renamed from: b */
    public final Path.FillType f170135b;

    /* JADX INFO: renamed from: c */
    public final C38313a f170136c;

    /* JADX INFO: renamed from: d */
    public final C38313a f170137d;

    /* JADX INFO: renamed from: e */
    public final C38313a f170138e;

    /* JADX INFO: renamed from: f */
    public final C38313a f170139f;

    /* JADX INFO: renamed from: g */
    public final String f170140g;

    /* JADX INFO: renamed from: h */
    public final boolean f170141h;

    public C39549d(String str, int i13, Path.FillType fillType, C38313a c38313a, C38313a c38313a2, C38313a c38313a3, C38313a c38313a4, boolean z4) {
        this.f170134a = i13;
        this.f170135b = fillType;
        this.f170136c = c38313a;
        this.f170137d = c38313a2;
        this.f170138e = c38313a3;
        this.f170139f = c38313a4;
        this.f170140g = str;
        this.f170141h = z4;
    }

    @Override // p649yi.InterfaceC39547b
    /* JADX INFO: renamed from: a */
    public final InterfaceC32517c mo122786a(C30402w c30402w, C30387i c30387i, AbstractC40652b abstractC40652b) {
        return new C32522h(c30402w, c30387i, abstractC40652b, this);
    }
}
