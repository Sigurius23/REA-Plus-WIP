package wb3;

import c93.InterfaceC4339a;
import j93.InterfaceC21456a0;
import j93.InterfaceC21461d;
import j93.InterfaceC21463e;
import java.util.List;

/* JADX INFO: renamed from: wb3.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C37059i extends AbstractC37051a {

    /* JADX INFO: renamed from: x */
    public final AbstractC37051a f158556x;

    /* JADX INFO: renamed from: y */
    public final AbstractC37051a f158557y;

    /* JADX INFO: renamed from: z */
    public final boolean f158558z;

    public C37059i(AbstractC37051a abstractC37051a, AbstractC37051a abstractC37051a2, boolean z4, InterfaceC4339a interfaceC4339a) {
        super(interfaceC4339a);
        this.f158556x = abstractC37051a;
        this.f158557y = abstractC37051a2;
        this.f158558z = z4;
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: a */
    public final InterfaceC21456a0 mo118940a() {
        return null;
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: b */
    public final InterfaceC21461d mo118941b() {
        return this.f158556x.mo118941b();
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: c */
    public final boolean mo118942c() {
        return false;
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: d */
    public final boolean mo118943d() {
        return false;
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: e */
    public final boolean mo118944e() {
        return this.f158558z;
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: f */
    public final boolean mo118945f() {
        return false;
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: g */
    public final AbstractC37051a mo118946g() {
        return this.f158556x;
    }

    @Override // j93.InterfaceC21457b
    public final List getAnnotations() {
        return this.f158556x.getAnnotations();
    }

    @Override // j93.InterfaceC21456a0
    public final List getArguments() {
        return this.f158556x.getArguments();
    }

    @Override // j93.InterfaceC21456a0
    public final InterfaceC21463e getClassifier() {
        return this.f158556x.getClassifier();
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: h */
    public final AbstractC37051a mo118947h(boolean z4) {
        AbstractC37051a abstractC37051aMo118947h = this.f158556x.mo118947h(z4);
        AbstractC37051a abstractC37051aMo118947h2 = this.f158557y.mo118947h(z4);
        return abstractC37051aMo118947h.equals(abstractC37051aMo118947h2) ? abstractC37051aMo118947h : new C37059i(abstractC37051aMo118947h, abstractC37051aMo118947h2, this.f158558z, null);
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: i */
    public final AbstractC37051a mo118948i(boolean z4) {
        AbstractC37051a abstractC37051aMo118948i = this.f158556x.mo118948i(z4);
        AbstractC37051a abstractC37051aMo118948i2 = this.f158557y.mo118948i(z4);
        return abstractC37051aMo118948i.equals(abstractC37051aMo118948i2) ? abstractC37051aMo118948i : new C37059i(abstractC37051aMo118948i, abstractC37051aMo118948i2, this.f158558z, null);
    }

    @Override // j93.InterfaceC21456a0
    public final boolean isMarkedNullable() {
        return this.f158556x.isMarkedNullable();
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: j */
    public final AbstractC37051a mo118949j() {
        return this.f158557y;
    }
}
