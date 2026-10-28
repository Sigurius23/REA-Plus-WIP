package wb3;

import c93.InterfaceC4339a;
import j93.InterfaceC21456a0;
import j93.InterfaceC21461d;
import j93.InterfaceC21463e;
import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wb3.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C37067q extends AbstractC37051a {

    /* JADX INFO: renamed from: E */
    public final List f158573E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC21456a0 f158574F;

    /* JADX INFO: renamed from: G */
    public final boolean f158575G;

    /* JADX INFO: renamed from: H */
    public final boolean f158576H;

    /* JADX INFO: renamed from: I */
    public final boolean f158577I;

    /* JADX INFO: renamed from: J */
    public final InterfaceC21461d f158578J;

    /* JADX INFO: renamed from: x */
    public final InterfaceC21463e f158579x;

    /* JADX INFO: renamed from: y */
    public final List f158580y;

    /* JADX INFO: renamed from: z */
    public final boolean f158581z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37067q(InterfaceC21463e classifier, List arguments, boolean z4, List annotations, InterfaceC21456a0 interfaceC21456a0, boolean z13, boolean z14, boolean z15, InterfaceC21461d interfaceC21461d, InterfaceC4339a interfaceC4339a) {
        super(interfaceC4339a);
        AbstractC22676k.m65750j(classifier, "classifier");
        AbstractC22676k.m65750j(arguments, "arguments");
        AbstractC22676k.m65750j(annotations, "annotations");
        this.f158579x = classifier;
        this.f158580y = arguments;
        this.f158581z = z4;
        this.f158573E = annotations;
        this.f158574F = interfaceC21456a0;
        this.f158575G = z13;
        this.f158576H = z14;
        this.f158577I = z15;
        this.f158578J = interfaceC21461d;
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: a */
    public final InterfaceC21456a0 mo118940a() {
        return this.f158574F;
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: b */
    public final InterfaceC21461d mo118941b() {
        return this.f158578J;
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: c */
    public final boolean mo118942c() {
        return this.f158575G;
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: d */
    public final boolean mo118943d() {
        return this.f158576H;
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: e */
    public final boolean mo118944e() {
        return false;
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: f */
    public final boolean mo118945f() {
        return this.f158577I;
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: g */
    public final AbstractC37051a mo118946g() {
        return null;
    }

    @Override // j93.InterfaceC21457b
    public final List getAnnotations() {
        return this.f158573E;
    }

    @Override // j93.InterfaceC21456a0
    public final List getArguments() {
        return this.f158580y;
    }

    @Override // j93.InterfaceC21456a0
    public final InterfaceC21463e getClassifier() {
        return this.f158579x;
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: h */
    public final AbstractC37051a mo118947h(boolean z4) {
        return new C37067q(this.f158579x, this.f158580y, this.f158581z && !z4, this.f158573E, this.f158574F, z4, this.f158576H, this.f158577I, this.f158578J, null);
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: i */
    public final AbstractC37051a mo118948i(boolean z4) {
        return new C37067q(this.f158579x, this.f158580y, z4, this.f158573E, this.f158574F, false, this.f158576H, this.f158577I, this.f158578J, null);
    }

    @Override // j93.InterfaceC21456a0
    public final boolean isMarkedNullable() {
        return this.f158581z;
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: j */
    public final AbstractC37051a mo118949j() {
        return null;
    }
}
