package p684zk;

import al.C0958e;
import al.C0959f;
import al.C0960g;
import al.InterfaceC0962i;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import p586wk.C37330h;
import p586wk.InterfaceC37327e;
import p586wk.InterfaceC37334l;
import tl.AbstractC33913l;
import tl.C33909h;

/* JADX INFO: renamed from: zk.b0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C40775b0 implements InterfaceC37327e {

    /* JADX INFO: renamed from: j */
    public static final C33909h f175811j = new C33909h(50);

    /* JADX INFO: renamed from: b */
    public final C0960g f175812b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC37327e f175813c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC37327e f175814d;

    /* JADX INFO: renamed from: e */
    public final int f175815e;

    /* JADX INFO: renamed from: f */
    public final int f175816f;

    /* JADX INFO: renamed from: g */
    public final Class f175817g;

    /* JADX INFO: renamed from: h */
    public final C37330h f175818h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC37334l f175819i;

    public C40775b0(C0960g c0960g, InterfaceC37327e interfaceC37327e, InterfaceC37327e interfaceC37327e2, int i13, int i14, InterfaceC37334l interfaceC37334l, Class cls, C37330h c37330h) {
        this.f175812b = c0960g;
        this.f175813c = interfaceC37327e;
        this.f175814d = interfaceC37327e2;
        this.f175815e = i13;
        this.f175816f = i14;
        this.f175819i = interfaceC37334l;
        this.f175817g = cls;
        this.f175818h = c37330h;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p586wk.InterfaceC37327e
    /* JADX INFO: renamed from: a */
    public final void mo33605a(MessageDigest messageDigest) {
        Object objM2446e;
        C0960g c0960g = this.f175812b;
        synchronized (c0960g) {
            C0959f c0959f = c0960g.f3547b;
            InterfaceC0962i interfaceC0962iM2441H0 = (InterfaceC0962i) ((ArrayDeque) c0959f.f3536x).poll();
            if (interfaceC0962iM2441H0 == null) {
                interfaceC0962iM2441H0 = c0959f.m2441H0();
            }
            C0958e c0958e = (C0958e) interfaceC0962iM2441H0;
            c0958e.m2440b(8, byte[].class);
            objM2446e = c0960g.m2446e(c0958e, byte[].class);
        }
        byte[] bArr = (byte[]) objM2446e;
        ByteBuffer.wrap(bArr).putInt(this.f175815e).putInt(this.f175816f).array();
        this.f175814d.mo33605a(messageDigest);
        this.f175813c.mo33605a(messageDigest);
        messageDigest.update(bArr);
        InterfaceC37334l interfaceC37334l = this.f175819i;
        if (interfaceC37334l != null) {
            interfaceC37334l.mo33605a(messageDigest);
        }
        this.f175818h.mo33605a(messageDigest);
        C33909h c33909h = f175811j;
        Class cls = this.f175817g;
        byte[] bytes = (byte[]) c33909h.m107260a(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(InterfaceC37327e.f159589a);
            c33909h.m107261d(cls, bytes);
        }
        messageDigest.update(bytes);
        this.f175812b.m2448g(bArr);
    }

    @Override // p586wk.InterfaceC37327e
    public final boolean equals(Object obj) {
        if (obj instanceof C40775b0) {
            C40775b0 c40775b0 = (C40775b0) obj;
            if (this.f175816f == c40775b0.f175816f && this.f175815e == c40775b0.f175815e && AbstractC33913l.m107266a(this.f175819i, c40775b0.f175819i) && this.f175817g.equals(c40775b0.f175817g) && this.f175813c.equals(c40775b0.f175813c) && this.f175814d.equals(c40775b0.f175814d) && this.f175818h.equals(c40775b0.f175818h)) {
                return true;
            }
        }
        return false;
    }

    @Override // p586wk.InterfaceC37327e
    public final int hashCode() {
        int iHashCode = ((((this.f175814d.hashCode() + (this.f175813c.hashCode() * 31)) * 31) + this.f175815e) * 31) + this.f175816f;
        InterfaceC37334l interfaceC37334l = this.f175819i;
        if (interfaceC37334l != null) {
            iHashCode = (iHashCode * 31) + interfaceC37334l.hashCode();
        }
        return this.f175818h.f159595b.hashCode() + ((this.f175817g.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f175813c + ", signature=" + this.f175814d + ", width=" + this.f175815e + ", height=" + this.f175816f + ", decodedResourceClass=" + this.f175817g + ", transformation='" + this.f175819i + "', options=" + this.f175818h + '}';
    }
}
