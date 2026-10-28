package sc3;

import p715kotlin.jvm.internal.AbstractC22676k;
import qc3.C30256l0;
import rc3.C31236a;

/* JADX INFO: renamed from: sc3.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C32399m extends AbstractC32387a {

    /* JADX INFO: renamed from: a */
    public final C32404r f134140a;

    /* JADX INFO: renamed from: b */
    public final String f134141b;

    /* JADX INFO: renamed from: c */
    public final Object f134142c;

    public C32399m(C32404r c32404r, C31236a c31236a, int i13) {
        String name = c32404r.f134149b;
        c31236a = (i13 & 4) != 0 ? null : c31236a;
        AbstractC22676k.m65750j(name, "name");
        this.f134140a = c32404r;
        this.f134141b = name;
        this.f134142c = c31236a;
    }

    @Override // sc3.AbstractC32387a
    /* JADX INFO: renamed from: a */
    public final C32404r mo100962a() {
        return this.f134140a;
    }

    @Override // sc3.AbstractC32387a
    /* JADX INFO: renamed from: b */
    public final Object mo100963b() {
        return this.f134142c;
    }

    @Override // sc3.AbstractC32387a
    /* JADX INFO: renamed from: c */
    public final String mo100964c() {
        return this.f134141b;
    }

    @Override // sc3.AbstractC32387a
    /* JADX INFO: renamed from: d */
    public final C30256l0 mo100965d() {
        return null;
    }
}
