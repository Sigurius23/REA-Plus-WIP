package p649yi;

import dj.AbstractC12058c;
import java.util.HashSet;
import p426qi.C30387i;
import p426qi.C30402w;
import p426qi.EnumC30403x;
import p682zi.AbstractC40652b;
import si.C32526l;
import si.InterfaceC32517c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: yi.g */
/* JADX INFO: loaded from: classes.dex */
public final class C39552g implements InterfaceC39547b {

    /* JADX INFO: renamed from: a */
    public final int f170159a;

    /* JADX INFO: renamed from: b */
    public final boolean f170160b;

    public C39552g(String str, int i13, boolean z4) {
        this.f170159a = i13;
        this.f170160b = z4;
    }

    @Override // p649yi.InterfaceC39547b
    /* JADX INFO: renamed from: a */
    public final InterfaceC32517c mo122786a(C30402w c30402w, C30387i c30387i, AbstractC40652b abstractC40652b) {
        if (((HashSet) c30402w.f124738L.f2818x).contains(EnumC30403x.f124773w)) {
            return new C32526l(this);
        }
        AbstractC12058c.m33239b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        return "MergePaths{mode=" + AbstractC38963t7.m124370A(this.f170159a) + '}';
    }
}
