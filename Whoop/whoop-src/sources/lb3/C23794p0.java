package lb3;

import java.util.ArrayDeque;
import mb3.C25388e;
import mb3.C25389f;
import mb3.InterfaceC25385b;
import ob3.InterfaceC27797g;
import ob3.InterfaceC27805o;
import p715kotlin.jvm.internal.AbstractC22676k;
import ub3.AbstractC34756j;
import ub3.C34754h;

/* JADX INFO: renamed from: lb3.p0 */
/* JADX INFO: loaded from: classes5.dex */
public class C23794p0 {

    /* JADX INFO: renamed from: a */
    public final boolean f94178a;

    /* JADX INFO: renamed from: b */
    public final boolean f94179b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC27805o f94180c;

    /* JADX INFO: renamed from: d */
    public final C25388e f94181d;

    /* JADX INFO: renamed from: e */
    public final C25389f f94182e;

    /* JADX INFO: renamed from: f */
    public int f94183f;

    /* JADX INFO: renamed from: g */
    public ArrayDeque f94184g;

    /* JADX INFO: renamed from: h */
    public C34754h f94185h;

    public C23794p0(boolean z4, boolean z13, InterfaceC25385b typeSystemContext, C25388e kotlinTypePreparator, C25389f kotlinTypeRefiner) {
        AbstractC22676k.m65750j(typeSystemContext, "typeSystemContext");
        AbstractC22676k.m65750j(kotlinTypePreparator, "kotlinTypePreparator");
        AbstractC22676k.m65750j(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f94178a = z4;
        this.f94179b = z13;
        this.f94180c = typeSystemContext;
        this.f94181d = kotlinTypePreparator;
        this.f94182e = kotlinTypeRefiner;
    }

    /* JADX INFO: renamed from: a */
    public final void m69903a() {
        ArrayDeque arrayDeque = this.f94184g;
        AbstractC22676k.m65747g(arrayDeque);
        arrayDeque.clear();
        C34754h c34754h = this.f94185h;
        AbstractC22676k.m65747g(c34754h);
        c34754h.clear();
    }

    /* JADX INFO: renamed from: b */
    public boolean m69904b(InterfaceC27797g subType, InterfaceC27797g interfaceC27797g) {
        AbstractC22676k.m65750j(subType, "subType");
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m69905c() {
        if (this.f94184g == null) {
            this.f94184g = new ArrayDeque(4);
        }
        if (this.f94185h == null) {
            int i13 = C34754h.f146410y;
            this.f94185h = AbstractC34756j.m109753c();
        }
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC23773f1 m69906d(InterfaceC27797g type) {
        AbstractC22676k.m65750j(type, "type");
        return this.f94181d.m74463a(type);
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC23811y m69907e(InterfaceC27797g type) {
        AbstractC22676k.m65750j(type, "type");
        this.f94182e.getClass();
        return (AbstractC23811y) type;
    }
}
