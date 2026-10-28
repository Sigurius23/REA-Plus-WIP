package p649yi;

import java.util.Arrays;
import java.util.List;
import p426qi.C30387i;
import p426qi.C30402w;
import p682zi.AbstractC40652b;
import si.C32518d;
import si.InterfaceC32517c;

/* JADX INFO: renamed from: yi.n */
/* JADX INFO: loaded from: classes.dex */
public final class C39559n implements InterfaceC39547b {

    /* JADX INFO: renamed from: a */
    public final String f170192a;

    /* JADX INFO: renamed from: b */
    public final List f170193b;

    /* JADX INFO: renamed from: c */
    public final boolean f170194c;

    public C39559n(String str, List list, boolean z4) {
        this.f170192a = str;
        this.f170193b = list;
        this.f170194c = z4;
    }

    @Override // p649yi.InterfaceC39547b
    /* JADX INFO: renamed from: a */
    public final InterfaceC32517c mo122786a(C30402w c30402w, C30387i c30387i, AbstractC40652b abstractC40652b) {
        return new C32518d(c30402w, abstractC40652b, this, c30387i);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f170192a + "' Shapes: " + Arrays.toString(this.f170193b.toArray()) + '}';
    }
}
