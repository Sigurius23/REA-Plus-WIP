package wb3;

import j93.InterfaceC21456a0;
import j93.InterfaceC21461d;
import j93.InterfaceC21463e;
import java.util.List;
import m83.C25271y;
import ob3.InterfaceC27794d;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.KotlinReflectionInternalError;

/* JADX INFO: renamed from: wb3.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C37053c extends AbstractC37051a implements InterfaceC27794d {

    /* JADX INFO: renamed from: x */
    public final InterfaceC21456a0 f158539x;

    /* JADX INFO: renamed from: y */
    public final C37054d f158540y;

    /* JADX INFO: renamed from: z */
    public final boolean f158541z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37053c(InterfaceC21456a0 interfaceC21456a0, C37054d typeConstructor, boolean z4) {
        super(C37052b.f158538w);
        AbstractC22676k.m65750j(typeConstructor, "typeConstructor");
        this.f158539x = interfaceC21456a0;
        this.f158540y = typeConstructor;
        this.f158541z = z4;
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: a */
    public final InterfaceC21456a0 mo118940a() {
        return null;
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: b */
    public final InterfaceC21461d mo118941b() {
        return null;
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
        return false;
    }

    @Override // wb3.AbstractC37051a
    public final boolean equals(Object obj) {
        if (!(obj instanceof C37053c)) {
            return false;
        }
        C37053c c37053c = (C37053c) obj;
        return AbstractC22676k.m65745e(this.f158539x, c37053c.f158539x) && AbstractC22676k.m65745e(this.f158540y, c37053c.f158540y) && this.f158541z == c37053c.f158541z;
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: f */
    public final boolean mo118945f() {
        return false;
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: g */
    public final AbstractC37051a mo118946g() {
        return null;
    }

    @Override // j93.InterfaceC21457b
    public final List getAnnotations() {
        return C25271y.f99162w;
    }

    @Override // j93.InterfaceC21456a0
    public final List getArguments() {
        return C25271y.f99162w;
    }

    @Override // j93.InterfaceC21456a0
    public final InterfaceC21463e getClassifier() {
        return null;
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: h */
    public final AbstractC37051a mo118947h(boolean z4) {
        if (!z4) {
            return this;
        }
        throw new KotlinReflectionInternalError("Definitely not null captured type is not supported yet: " + this);
    }

    @Override // wb3.AbstractC37051a
    public final int hashCode() {
        InterfaceC21456a0 interfaceC21456a0 = this.f158539x;
        return Boolean.hashCode(this.f158541z) + ((this.f158540y.hashCode() + ((interfaceC21456a0 != null ? interfaceC21456a0.hashCode() : 0) * 31)) * 31);
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: i */
    public final AbstractC37051a mo118948i(boolean z4) {
        return z4 == this.f158541z ? this : new C37053c(this.f158539x, this.f158540y, z4);
    }

    @Override // j93.InterfaceC21456a0
    public final boolean isMarkedNullable() {
        return this.f158541z;
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: j */
    public final AbstractC37051a mo118949j() {
        return null;
    }

    @Override // wb3.AbstractC37051a
    public final String toString() {
        return this.f158540y.toString();
    }
}
