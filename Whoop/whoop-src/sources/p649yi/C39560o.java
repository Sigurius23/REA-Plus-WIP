package p649yi;

import p088dc.AbstractC11895b;
import p426qi.C30387i;
import p426qi.C30402w;
import p616xi.C38313a;
import p682zi.AbstractC40652b;
import si.C32532r;
import si.InterfaceC32517c;

/* JADX INFO: renamed from: yi.o */
/* JADX INFO: loaded from: classes.dex */
public final class C39560o implements InterfaceC39547b {

    /* JADX INFO: renamed from: a */
    public final String f170195a;

    /* JADX INFO: renamed from: b */
    public final int f170196b;

    /* JADX INFO: renamed from: c */
    public final C38313a f170197c;

    /* JADX INFO: renamed from: d */
    public final boolean f170198d;

    public C39560o(String str, int i13, C38313a c38313a, boolean z4) {
        this.f170195a = str;
        this.f170196b = i13;
        this.f170197c = c38313a;
        this.f170198d = z4;
    }

    @Override // p649yi.InterfaceC39547b
    /* JADX INFO: renamed from: a */
    public final InterfaceC32517c mo122786a(C30402w c30402w, C30387i c30387i, AbstractC40652b abstractC40652b) {
        return new C32532r(c30402w, abstractC40652b, this);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ShapePath{name=");
        sb4.append(this.f170195a);
        sb4.append(", index=");
        return AbstractC11895b.m31999r(sb4, this.f170196b, '}');
    }
}
