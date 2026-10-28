package wb3;

import c93.InterfaceC4339a;
import cb3.AbstractC4393e;
import com.squareup.wire.AbstractC5583n;
import io.sentry.config.AbstractC20301a;
import j93.InterfaceC21456a0;
import j93.InterfaceC21461d;
import j93.InterfaceC21463e;
import j93.InterfaceC21493z;
import java.util.List;
import ka3.C22313e;
import ka3.C22316h;
import lb3.AbstractC23763c0;
import lb3.AbstractC23767d1;
import lb3.AbstractC23773f1;
import lb3.AbstractC23797r;
import lb3.AbstractC23804u0;
import lb3.AbstractC23811y;
import lb3.C23756a;
import lb3.C23765d;
import lb3.C23785l;
import m83.AbstractC25265s;
import o93.AbstractC27736h;
import o93.AbstractC27741m;
import p048ce.C4463d;
import p097ds.AbstractC12313p;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22693x;
import p715kotlin.reflect.jvm.internal.KClassImpl;
import p715kotlin.reflect.jvm.internal.KTypeAliasImpl;
import p715kotlin.reflect.jvm.internal.KTypeParameterImpl;
import p715kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import p715kotlin.reflect.jvm.internal.ReflectProperties;
import p715kotlin.reflect.jvm.internal.SystemPropertiesKt;
import p715kotlin.reflect.jvm.internal.UtilKt;
import q93.C30080d;
import r80.AbstractC31061c;
import r93.C31121f0;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import r93.InterfaceC31165x0;
import sb3.AbstractC32350a;
import va3.C35847e;
import va3.C35850h;
import x43.AbstractC37978j;
import x93.AbstractC38109c;
import ya3.AbstractC39363f;

/* JADX INFO: renamed from: wb3.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C37058h extends AbstractC37051a {

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ InterfaceC21493z[] f158551F;

    /* JADX INFO: renamed from: E */
    public final ReflectProperties.LazySoftVal f158552E;

    /* JADX INFO: renamed from: x */
    public final AbstractC23811y f158553x;

    /* JADX INFO: renamed from: y */
    public final boolean f158554y;

    /* JADX INFO: renamed from: z */
    public final ReflectProperties.LazySoftVal f158555z;

    static {
        C22693x c22693x = new C22693x(C37058h.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f158551F = new InterfaceC21493z[]{c22673i0.property1(c22693x), AbstractC31061c.m95632h(C37058h.class, "arguments", "getArguments()Ljava/util/List;", 0, c22673i0)};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37058h(AbstractC23811y type, InterfaceC4339a interfaceC4339a, boolean z4) {
        super(interfaceC4339a);
        AbstractC22676k.m65750j(type, "type");
        this.f158553x = type;
        this.f158554y = z4;
        this.f158555z = ReflectProperties.lazySoft(new C37057g(this, 0));
        this.f158552E = ReflectProperties.lazySoft(new C4463d(14, this, interfaceC4339a));
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: a */
    public final InterfaceC21456a0 mo118940a() {
        AbstractC23811y abstractC23811y = this.f158553x;
        AbstractC22676k.m65750j(abstractC23811y, "<this>");
        AbstractC23773f1 abstractC23773f1Mo69863p0 = abstractC23811y.mo69863p0();
        C23756a c23756a = abstractC23773f1Mo69863p0 instanceof C23756a ? (C23756a) abstractC23773f1Mo69863p0 : null;
        AbstractC23763c0 abstractC23763c0M69813z0 = c23756a != null ? c23756a.m69813z0() : null;
        if (abstractC23763c0M69813z0 != null) {
            return new C37058h(abstractC23763c0M69813z0, this.f158537w, true);
        }
        return null;
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: b */
    public final InterfaceC21461d mo118941b() {
        InterfaceC31126h interfaceC31126hMo1784d = this.f158553x.mo69844i0().mo1784d();
        InterfaceC31117e interfaceC31117e = interfaceC31126hMo1784d instanceof InterfaceC31117e ? (InterfaceC31117e) interfaceC31126hMo1784d : null;
        if (interfaceC31117e != null) {
            String str = C30080d.f122759a;
            if (C30080d.f122768j.containsKey(AbstractC39363f.m125524f(interfaceC31117e))) {
                if (SystemPropertiesKt.getUseK1Implementation()) {
                    InterfaceC21463e classifier = getClassifier();
                    AbstractC22676k.m65748h(classifier, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
                    return new C37062l((InterfaceC21461d) classifier, AbstractC4393e.m13809g(interfaceC31117e).f152613a.f152616a, new C22313e(interfaceC31117e, 1), new C22313e(interfaceC31117e, 2));
                }
                C35847e c35847eM13809g = AbstractC4393e.m13809g(interfaceC31117e);
                InterfaceC21463e classifier2 = getClassifier();
                AbstractC22676k.m65748h(classifier2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
                return AbstractC32350a.m100702i((InterfaceC21461d) classifier2, c35847eM13809g);
            }
        }
        return null;
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: c */
    public final boolean mo118942c() {
        AbstractC23811y abstractC23811y = this.f158553x;
        AbstractC22676k.m65750j(abstractC23811y, "<this>");
        return abstractC23811y.mo69863p0() instanceof C23785l;
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: d */
    public final boolean mo118943d() {
        AbstractC23811y abstractC23811y = this.f158553x;
        if (abstractC23811y != null) {
            C35850h c35850h = AbstractC27736h.f111789e;
            return AbstractC27736h.m83800B(abstractC23811y, AbstractC27741m.f111845b);
        }
        AbstractC27736h.m83809a(138);
        throw null;
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: e */
    public final boolean mo118944e() {
        return this.f158553x instanceof C22316h;
    }

    @Override // wb3.AbstractC37051a
    public final boolean equals(Object obj) {
        if (!SystemPropertiesKt.getUseK1Implementation()) {
            return super.equals(obj);
        }
        if (!(obj instanceof C37058h)) {
            return false;
        }
        C37058h c37058h = (C37058h) obj;
        return AbstractC22676k.m65745e(this.f158553x, c37058h.f158553x) && AbstractC22676k.m65745e(getClassifier(), c37058h.getClassifier()) && getArguments().equals(c37058h.getArguments());
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: f */
    public final boolean mo118945f() {
        return AbstractC5583n.m16758R(this.f158553x);
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: g */
    public final AbstractC37051a mo118946g() {
        AbstractC23773f1 abstractC23773f1Mo69863p0 = this.f158553x.mo69863p0();
        if (abstractC23773f1Mo69863p0 instanceof AbstractC23797r) {
            return new C37058h(((AbstractC23797r) abstractC23773f1Mo69863p0).f94187x, null);
        }
        return null;
    }

    @Override // j93.InterfaceC21457b
    public final List getAnnotations() {
        return UtilKt.computeAnnotations(this.f158553x);
    }

    @Override // j93.InterfaceC21456a0
    public final List getArguments() {
        T value = this.f158552E.getValue(this, f158551F[1]);
        AbstractC22676k.m65749i(value, "getValue(...)");
        return (List) value;
    }

    @Override // j93.InterfaceC21456a0
    public final InterfaceC21463e getClassifier() {
        return (InterfaceC21463e) this.f158555z.getValue(this, f158551F[0]);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000f A[PHI: r3
      0x000f: PHI (r3v8 lb3.y) = (r3v4 lb3.y), (r3v10 lb3.y) binds: [B:13:0x001e, B:5:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: h */
    public final AbstractC37051a mo118947h(boolean z4) {
        AbstractC23811y abstractC23811yM69839m;
        AbstractC23811y abstractC23811y = this.f158553x;
        if (z4) {
            abstractC23811yM69839m = C23765d.m69839m(abstractC23811y.mo69863p0(), true);
            if (abstractC23811yM69839m != null) {
                abstractC23811y = abstractC23811yM69839m;
            }
        } else {
            C23785l c23785l = abstractC23811y instanceof C23785l ? (C23785l) abstractC23811y : null;
            if (c23785l != null && (abstractC23811yM69839m = c23785l.f94167x) != null) {
                abstractC23811y = abstractC23811yM69839m;
            }
        }
        return new C37058h(abstractC23811y, this.f158537w);
    }

    @Override // wb3.AbstractC37051a
    public final int hashCode() {
        if (!SystemPropertiesKt.getUseK1Implementation()) {
            return super.hashCode();
        }
        int iHashCode = this.f158553x.hashCode() * 31;
        InterfaceC21463e classifier = getClassifier();
        return getArguments().hashCode() + ((iHashCode + (classifier != null ? classifier.hashCode() : 0)) * 31);
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: i */
    public final AbstractC37051a mo118948i(boolean z4) {
        AbstractC23811y abstractC23811y = this.f158553x;
        if (!AbstractC12313p.m34258J(abstractC23811y) && abstractC23811y.mo69814k0() == z4) {
            return this;
        }
        AbstractC23773f1 abstractC23773f1M69851g = AbstractC23767d1.m69851g(abstractC23811y, z4);
        AbstractC22676k.m65749i(abstractC23773f1M69851g, "makeNullableAsSpecified(...)");
        return new C37058h(abstractC23773f1M69851g, this.f158537w);
    }

    @Override // j93.InterfaceC21456a0
    public final boolean isMarkedNullable() {
        return this.f158553x.mo69814k0();
    }

    @Override // wb3.AbstractC37051a
    /* JADX INFO: renamed from: j */
    public final AbstractC37051a mo118949j() {
        AbstractC23773f1 abstractC23773f1Mo69863p0 = this.f158553x.mo69863p0();
        if (abstractC23773f1Mo69863p0 instanceof AbstractC23797r) {
            return new C37058h(((AbstractC23797r) abstractC23773f1Mo69863p0).f94188y, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC21463e m119003k(AbstractC23811y abstractC23811y) {
        AbstractC23811y abstractC23811yMo69868b;
        if (this.f158554y) {
            InterfaceC31126h interfaceC31126hMo1784d = abstractC23811y.mo69844i0().mo1784d();
            C31121f0 c31121f0 = interfaceC31126hMo1784d instanceof C31121f0 ? (C31121f0) interfaceC31126hMo1784d : null;
            if (c31121f0 != null) {
                return new KTypeAliasImpl(AbstractC4393e.m13809g(c31121f0));
            }
        }
        InterfaceC31126h interfaceC31126hMo1784d2 = abstractC23811y.mo69844i0().mo1784d();
        if (interfaceC31126hMo1784d2 instanceof InterfaceC31117e) {
            Class<?> javaClass = UtilKt.toJavaClass((InterfaceC31117e) interfaceC31126hMo1784d2);
            if (javaClass != null) {
                if (!AbstractC27736h.m83814z(abstractC23811y)) {
                    if (AbstractC23767d1.m69849e(abstractC23811y)) {
                        return new KClassImpl(javaClass);
                    }
                    Class<?> cls = (Class) AbstractC38109c.f163212b.get(javaClass);
                    if (cls != null) {
                        javaClass = cls;
                    }
                    return new KClassImpl(javaClass);
                }
                AbstractC23804u0 abstractC23804u0 = (AbstractC23804u0) AbstractC25265s.m74146r1(abstractC23811y.mo69842X());
                if (abstractC23804u0 == null || (abstractC23811yMo69868b = abstractC23804u0.mo69868b()) == null) {
                    return new KClassImpl(javaClass);
                }
                InterfaceC21463e interfaceC21463eM119003k = m119003k(AbstractC20301a.m56318Q(abstractC23811yMo69868b));
                if (interfaceC21463eM119003k != null) {
                    return new KClassImpl(UtilKt.createArrayType(AbstractC21598x.m60663S(AbstractC37978j.m121621D(interfaceC21463eM119003k))));
                }
                throw new KotlinReflectionInternalError("Cannot determine classifier for array element type: " + this);
            }
        } else if (interfaceC31126hMo1784d2 instanceof InterfaceC31165x0) {
            return new KTypeParameterImpl(null, (InterfaceC31165x0) interfaceC31126hMo1784d2);
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final AbstractC23811y m119004l() {
        return this.f158553x;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C37058h(AbstractC23811y type, InterfaceC4339a interfaceC4339a) {
        this(type, interfaceC4339a, false);
        AbstractC22676k.m65750j(type, "type");
    }
}
