package ja3;

import cb3.AbstractC4393e;
import dc3.C11934s;
import fa3.AbstractC14323p;
import fa3.C14322o;
import ge3.AbstractC15751g;
import ha3.InterfaceC17060c;
import hg3.AbstractC17269i;
import ia3.C18295a;
import ia3.C18297c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.List;
import kb3.C22340i;
import kb3.C22342k;
import kb3.InterfaceC22345n;
import l83.C23470p;
import lb3.InterfaceC23796q0;
import m83.AbstractC25260n;
import mb3.C25389f;
import mb3.C25395l;
import p557vo.AbstractC36220b;
import p692zt.C41113q;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22707j;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import r93.AbstractC31143m1;
import r93.AbstractC31150q;
import r93.AbstractC31152r;
import r93.AbstractC31167y0;
import r93.C31125g1;
import r93.C31134j1;
import r93.C31148p;
import r93.C31153r0;
import r93.C31161v0;
import r93.EnumC31106a0;
import r93.EnumC31120f;
import r93.InterfaceC31117e;
import r93.InterfaceC31135k;
import s93.InterfaceC32307i;
import se.AbstractC32417h;
import u93.AbstractC34684k;
import u93.C34682j;
import v93.C35835a;
import v93.C35836b;
import v93.C35837c;
import x93.C38122n;

/* JADX INFO: renamed from: ja3.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C21513i extends AbstractC34684k implements InterfaceC17060c {

    /* JADX INFO: renamed from: G */
    public final C41113q f82506G;

    /* JADX INFO: renamed from: H */
    public final C38122n f82507H;

    /* JADX INFO: renamed from: I */
    public final InterfaceC31117e f82508I;

    /* JADX INFO: renamed from: J */
    public final C41113q f82509J;

    /* JADX INFO: renamed from: K */
    public final C23470p f82510K;

    /* JADX INFO: renamed from: L */
    public final EnumC31120f f82511L;

    /* JADX INFO: renamed from: M */
    public final EnumC31106a0 f82512M;

    /* JADX INFO: renamed from: N */
    public final AbstractC31143m1 f82513N;

    /* JADX INFO: renamed from: O */
    public final boolean f82514O;

    /* JADX INFO: renamed from: P */
    public final C21512h f82515P;

    /* JADX INFO: renamed from: Q */
    public final C21519o f82516Q;

    /* JADX INFO: renamed from: R */
    public final C31153r0 f82517R;

    /* JADX INFO: renamed from: S */
    public final C22707j f82518S;

    /* JADX INFO: renamed from: T */
    public final C21506d0 f82519T;

    /* JADX INFO: renamed from: U */
    public final C18297c f82520U;

    /* JADX INFO: renamed from: V */
    public final C22340i f82521V;

    static {
        AbstractC25260n.m74059b1(new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C21513i(C41113q outerContext, InterfaceC31135k containingDeclaration, C38122n jClass, InterfaceC31117e interfaceC31117e) throws IllegalAccessException, InvocationTargetException {
        EnumC31120f enumC31120f;
        EnumC31106a0 enumC31106a0;
        AbstractC31143m1 abstractC31143m1;
        AbstractC22676k.m65750j(outerContext, "outerContext");
        AbstractC22676k.m65750j(containingDeclaration, "containingDeclaration");
        AbstractC22676k.m65750j(jClass, "jClass");
        C18295a c18295a = (C18295a) outerContext.f177224x;
        super(c18295a.f71223a, containingDeclaration, jClass.m122104e(), c18295a.f71232j.m118692c(jClass));
        this.f82506G = outerContext;
        this.f82507H = jClass;
        this.f82508I = interfaceC31117e;
        C41113q c41113qM44459l = AbstractC15751g.m44459l(outerContext, this, jClass, 4);
        this.f82509J = c41113qM44459l;
        C18295a c18295a2 = (C18295a) c41113qM44459l.f177224x;
        InterfaceC22345n storageManager = c18295a2.f71223a;
        c18295a2.f71229g.getClass();
        this.f82510K = AbstractC30060g.m92088H(new C21511g(this, 0));
        Class cls = jClass.f163232a;
        if (cls.isAnnotation()) {
            enumC31120f = EnumC31120f.f128325E;
        } else if (cls.isInterface()) {
            enumC31120f = EnumC31120f.f128329x;
        } else {
            enumC31120f = cls.isEnum() ? EnumC31120f.f128330y : EnumC31120f.f128328w;
        }
        this.f82511L = enumC31120f;
        if (cls.isAnnotation() || cls.isEnum()) {
            enumC31106a0 = EnumC31106a0.f128310x;
        } else {
            C31161v0 c31161v0 = EnumC31106a0.f128309w;
            Boolean boolM115311s = AbstractC36220b.m115311s(cls);
            boolean zBooleanValue = boolM115311s != null ? boolM115311s.booleanValue() : false;
            Boolean boolM115311s2 = AbstractC36220b.m115311s(cls);
            boolean z4 = (boolM115311s2 != null ? boolM115311s2.booleanValue() : false) || Modifier.isAbstract(cls.getModifiers()) || cls.isInterface();
            boolean zIsFinal = Modifier.isFinal(cls.getModifiers());
            c31161v0.getClass();
            if (zBooleanValue) {
                enumC31106a0 = EnumC31106a0.f128311y;
            } else if (z4) {
                enumC31106a0 = EnumC31106a0.f128307E;
            } else {
                enumC31106a0 = !zIsFinal ? EnumC31106a0.f128312z : EnumC31106a0.f128310x;
            }
        }
        this.f82512M = enumC31106a0;
        int modifiers = cls.getModifiers();
        if (Modifier.isPublic(modifiers)) {
            abstractC31143m1 = C31134j1.f128342c;
        } else if (Modifier.isPrivate(modifiers)) {
            abstractC31143m1 = C31125g1.f128336c;
        } else if (Modifier.isProtected(modifiers)) {
            abstractC31143m1 = Modifier.isStatic(modifiers) ? C35837c.f152570c : C35836b.f152569c;
        } else {
            abstractC31143m1 = C35835a.f152568c;
        }
        this.f82513N = abstractC31143m1;
        Class<?> declaringClass = cls.getDeclaringClass();
        this.f82514O = ((declaringClass != null ? new C38122n(declaringClass) : null) == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
        this.f82515P = new C21512h(this);
        C21519o c21519o = new C21519o(c41113qM44459l, this, jClass, interfaceC31117e != null, null);
        this.f82516Q = c21519o;
        C31161v0 c31161v1 = C31153r0.f128364d;
        ((C25395l) c18295a2.f71243u).getClass();
        C11934s c11934s = new C11934s(this, 7);
        c31161v1.getClass();
        AbstractC22676k.m65750j(storageManager, "storageManager");
        this.f82517R = new C31153r0(this, storageManager, c11934s);
        this.f82518S = new C22707j(c21519o);
        this.f82519T = new C21506d0(c41113qM44459l, jClass, this);
        this.f82520U = AbstractC17269i.m48897j0(c41113qM44459l, jClass);
        C21511g c21511g = new C21511g(this, 1);
        C22342k c22342k = (C22342k) storageManager;
        c22342k.getClass();
        this.f82521V = new C22340i(c22342k, c21511g);
    }

    @Override // u93.AbstractC34666b, r93.InterfaceC31117e
    /* JADX INFO: renamed from: H */
    public final InterfaceC22712o mo60487H() {
        return this.f82518S;
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: I */
    public final AbstractC31167y0 mo60488I() {
        return null;
    }

    @Override // u93.AbstractC34666b, r93.InterfaceC31117e
    /* JADX INFO: renamed from: K */
    public final InterfaceC22712o mo60489K() {
        return (C21519o) super.mo60489K();
    }

    @Override // r93.InterfaceC31168z
    /* JADX INFO: renamed from: L */
    public final boolean mo60490L() {
        return false;
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: N */
    public final boolean mo60491N() {
        return false;
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: Q */
    public final boolean mo60492Q() {
        return false;
    }

    @Override // r93.InterfaceC31168z
    /* JADX INFO: renamed from: U */
    public final boolean mo60493U() {
        return false;
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: V */
    public final InterfaceC22712o mo60494V() {
        return this.f82519T;
    }

    /* JADX INFO: renamed from: X */
    public final C21519o m60495X() {
        return (C21519o) super.mo60489K();
    }

    @Override // r93.InterfaceC31126h
    /* JADX INFO: renamed from: e */
    public final InterfaceC23796q0 mo60496e() {
        return this.f82515P;
    }

    @Override // s93.InterfaceC32299a
    public final InterfaceC32307i getAnnotations() {
        return this.f82520U;
    }

    @Override // r93.InterfaceC31117e
    public final Collection getConstructors() {
        return (List) this.f82516Q.f82542q.invoke();
    }

    @Override // r93.InterfaceC31117e
    public final EnumC31120f getKind() {
        return this.f82511L;
    }

    @Override // r93.InterfaceC31117e, r93.InterfaceC31168z, r93.InterfaceC31144n
    public final AbstractC31152r getVisibility() {
        C31148p c31148p = AbstractC31150q.f128349a;
        AbstractC31143m1 abstractC31143m1 = this.f82513N;
        if (AbstractC22676k.m65745e(abstractC31143m1, c31148p)) {
            Class<?> declaringClass = this.f82507H.f163232a.getDeclaringClass();
            if ((declaringClass != null ? new C38122n(declaringClass) : null) == null) {
                C14322o c14322o = AbstractC14323p.f52285a;
                AbstractC22676k.m65747g(c14322o);
                return c14322o;
            }
        }
        return AbstractC32417h.m101190U(abstractC31143m1);
    }

    @Override // r93.InterfaceC31117e
    public final boolean isInline() {
        return false;
    }

    @Override // r93.InterfaceC31129i
    public final boolean isInner() {
        return this.f82514O;
    }

    @Override // r93.InterfaceC31117e
    public final boolean isValue() {
        return false;
    }

    @Override // r93.InterfaceC31117e, r93.InterfaceC31129i
    /* JADX INFO: renamed from: j */
    public final List mo60497j() {
        return (List) this.f82521V.invoke();
    }

    @Override // r93.InterfaceC31117e, r93.InterfaceC31168z
    /* JADX INFO: renamed from: k */
    public final EnumC31106a0 mo60498k() {
        return this.f82512M;
    }

    @Override // u93.AbstractC34669c0
    /* JADX INFO: renamed from: l */
    public final InterfaceC22712o mo60499l(C25389f c25389f) {
        C31153r0 c31153r0 = this.f82517R;
        AbstractC4393e.m13812j(c31153r0.f128366a);
        return (C21519o) ((InterfaceC22712o) AbstractC29125c.m88494C(c31153r0.f128368c, C31153r0.f128365e[0]));
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: o0 */
    public final boolean mo60500o0() {
        return false;
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: s */
    public final C34682j mo60501s() {
        return null;
    }

    public final String toString() {
        return "Lazy Java class " + AbstractC4393e.m13810h(this);
    }
}
