package p715kotlin.reflect.jvm.internal;

import cb3.AbstractC4393e;
import db3.EnumC11891c;
import fa3.AbstractC14330w;
import ha3.C17059b;
import ha3.C17062e;
import ha3.C17063f;
import io.sentry.config.AbstractC20301a;
import j93.AbstractC21478l0;
import java.lang.reflect.Method;
import jb3.C21559s;
import jb3.InterfaceC21542b;
import jb3.InterfaceC21551k;
import o93.AbstractC27741m;
import o93.AbstractC27742n;
import o93.EnumC27738j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q93.C30077a;
import q93.C30080d;
import qa3.C30122c0;
import qa3.C30146k0;
import qa3.C30154o;
import r93.InterfaceC31111c;
import r93.InterfaceC31117e;
import r93.InterfaceC31132j;
import r93.InterfaceC31135k;
import r93.InterfaceC31145n0;
import r93.InterfaceC31147o0;
import r93.InterfaceC31149p0;
import r93.InterfaceC31155s0;
import r93.InterfaceC31162w;
import se.AbstractC32416g;
import ta3.AbstractC33686l;
import ta3.C33680f;
import u93.AbstractC34690n;
import u93.AbstractC34692o;
import u93.C34691n0;
import ua3.AbstractC34722b;
import ua3.C34725e;
import ua3.C34727g;
import va3.C35845c;
import va3.C35847e;
import va3.C35850h;
import w93.C36973f;
import wa3.C36998i;
import wa3.C37010o;
import wa3.InterfaceC37019v;
import x93.AbstractC38109c;
import x93.AbstractC38126r;
import x93.C38122n;
import x93.C38125q;
import x93.C38128t;
import x93.C38131w;
import ya3.AbstractC39363f;
import ya3.AbstractC39365h;
import ya3.AbstractC39373p;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001c\u001a\u00020\u001b2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0019¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010#\u001a\u0004\u0018\u00010 *\u0006\u0012\u0002\b\u00030\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;", "", "<init>", "()V", "Lr93/w;", "descriptor", "", "isKnownBuiltInFunction", "(Lr93/w;)Z", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "mapJvmFunctionSignature", "(Lr93/w;)Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "Lr93/c;", "", "mapName", "(Lr93/c;)Ljava/lang/String;", "possiblySubstitutedFunction", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "mapSignature", "(Lr93/w;)Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "Lr93/n0;", "possiblyOverriddenProperty", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "mapPropertySignature", "(Lr93/n0;)Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "Ljava/lang/Class;", "klass", "Lva3/c;", "mapJvmClassToKotlinClassId", "(Ljava/lang/Class;)Lva3/c;", "JAVA_LANG_VOID", "Lva3/c;", "Lo93/j;", "getPrimitiveType", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "primitiveType", "kotlin-reflection"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class RuntimeTypeMapper {
    public static final RuntimeTypeMapper INSTANCE = new RuntimeTypeMapper();
    private static final C35845c JAVA_LANG_VOID;

    static {
        C35847e c35847e = new C35847e("java.lang.Void");
        JAVA_LANG_VOID = new C35845c(c35847e.m113789b(), c35847e.f152613a.m113796g());
    }

    private RuntimeTypeMapper() {
    }

    private final EnumC27738j getPrimitiveType(Class<?> cls) {
        if (cls.isPrimitive()) {
            return EnumC11891c.m31930b(cls.getSimpleName()).m31932d();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isKnownBuiltInFunction(InterfaceC31162w descriptor) {
        if (descriptor == 0) {
            AbstractC39373p.m125569a(28);
            throw null;
        }
        AbstractC34690n abstractC34690n = (AbstractC34690n) descriptor;
        if ((abstractC34690n.getName().equals(AbstractC27742n.f111878c) && AbstractC39373p.m125579m(descriptor)) || (abstractC34690n.getName().equals(AbstractC27742n.f111876a) && AbstractC39373p.m125579m(descriptor))) {
            return true;
        }
        C35850h name = abstractC34690n.getName();
        C35850h c35850h = C30077a.f122754b;
        return AbstractC22676k.m65745e(name, C30077a.f122754b) && descriptor.mo78676v().isEmpty();
    }

    private final JvmFunctionSignature.KotlinFunction mapJvmFunctionSignature(InterfaceC31162w descriptor) {
        return new JvmFunctionSignature.KotlinFunction(new C34725e(mapName(descriptor), AbstractC20301a.m56347o(descriptor, 1)));
    }

    private final String mapName(InterfaceC31111c descriptor) {
        String strM101169z = AbstractC32416g.m101169z(descriptor);
        if (strM101169z != null) {
            return strM101169z;
        }
        if (descriptor instanceof InterfaceC31147o0) {
            String strM113817b = AbstractC4393e.m13813k(descriptor).getName().m113817b();
            AbstractC22676k.m65749i(strM113817b, "asString(...)");
            return AbstractC14330w.m40936a(strM113817b);
        }
        if (descriptor instanceof InterfaceC31149p0) {
            String strM113817b2 = AbstractC4393e.m13813k(descriptor).getName().m113817b();
            AbstractC22676k.m65749i(strM113817b2, "asString(...)");
            return AbstractC14330w.m40938c(strM113817b2);
        }
        String strM113817b3 = descriptor.getName().m113817b();
        AbstractC22676k.m65749i(strM113817b3, "asString(...)");
        return strM113817b3;
    }

    public final C35845c mapJvmClassToKotlinClassId(Class<?> klass) {
        AbstractC22676k.m65750j(klass, "klass");
        if (klass.isArray()) {
            Class<?> componentType = klass.getComponentType();
            AbstractC22676k.m65749i(componentType, "getComponentType(...)");
            EnumC27738j primitiveType = getPrimitiveType(componentType);
            if (primitiveType != null) {
                return new C35845c(AbstractC27742n.f111886k, primitiveType.f111807x);
            }
            C35847e c35847eM113798i = AbstractC27741m.f111855g.m113798i();
            return new C35845c(c35847eM113798i.m113789b(), c35847eM113798i.f152613a.m113796g());
        }
        if (klass.equals(Void.TYPE)) {
            return JAVA_LANG_VOID;
        }
        EnumC27738j primitiveType2 = getPrimitiveType(klass);
        if (primitiveType2 != null) {
            return new C35845c(AbstractC27742n.f111886k, primitiveType2.f111806w);
        }
        C35845c c35845cM122089a = AbstractC38109c.m122089a(klass);
        if (!c35845cM122089a.f152611c) {
            String str = C30080d.f122759a;
            C35847e fqName = c35845cM122089a.m113773a();
            AbstractC22676k.m65750j(fqName, "fqName");
            C35845c c35845c = (C35845c) C30080d.f122766h.get(fqName.f152613a);
            if (c35845c != null) {
                return c35845c;
            }
        }
        return c35845cM122089a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JvmPropertySignature mapPropertySignature(InterfaceC31145n0 possiblyOverriddenProperty) {
        AbstractC22676k.m65750j(possiblyOverriddenProperty, "possiblyOverriddenProperty");
        InterfaceC31145n0 interfaceC31145n0Mo78660a = ((InterfaceC31145n0) AbstractC39363f.m125536r(possiblyOverriddenProperty)).mo78660a();
        AbstractC22676k.m65749i(interfaceC31145n0Mo78660a, "getOriginal(...)");
        if (interfaceC31145n0Mo78660a instanceof C21559s) {
            C21559s c21559s = (C21559s) interfaceC31145n0Mo78660a;
            C30146k0 c30146k0 = c21559s.f82680b0;
            C37010o propertySignature = AbstractC33686l.f140738d;
            AbstractC22676k.m65749i(propertySignature, "propertySignature");
            C33680f c33680f = (C33680f) AbstractC21478l0.m60453x(c30146k0, propertySignature);
            if (c33680f != null) {
                return new JvmPropertySignature.KotlinProperty(interfaceC31145n0Mo78660a, c30146k0, c33680f, c21559s.f82681c0, c21559s.f82682d0);
            }
        } else if (interfaceC31145n0Mo78660a instanceof C17063f) {
            C17063f c17063f = (C17063f) interfaceC31145n0Mo78660a;
            InterfaceC31155s0 source = c17063f.getSource();
            C36973f c36973f = source instanceof C36973f ? (C36973f) source : null;
            AbstractC38126r abstractC38126r = c36973f != null ? c36973f.f158234w : null;
            if (abstractC38126r instanceof C38128t) {
                return new JvmPropertySignature.JavaField(((C38128t) abstractC38126r).m122115j());
            }
            if (!(abstractC38126r instanceof C38131w)) {
                throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java field " + interfaceC31145n0Mo78660a + " (source = " + abstractC38126r + ')');
            }
            Method methodM122126k = ((C38131w) abstractC38126r).m122126k();
            InterfaceC31149p0 interfaceC31149p0 = c17063f.f146129Y;
            InterfaceC31155s0 source2 = interfaceC31149p0 != null ? ((AbstractC34692o) interfaceC31149p0).getSource() : null;
            C36973f c36973f2 = source2 instanceof C36973f ? (C36973f) source2 : null;
            AbstractC38126r abstractC38126r2 = c36973f2 != null ? c36973f2.f158234w : null;
            C38131w c38131w = abstractC38126r2 instanceof C38131w ? (C38131w) abstractC38126r2 : null;
            return new JvmPropertySignature.JavaMethodProperty(methodM122126k, c38131w != null ? c38131w.m122126k() : null);
        }
        C34691n0 getter = interfaceC31145n0Mo78660a.getGetter();
        AbstractC22676k.m65747g(getter);
        JvmFunctionSignature.KotlinFunction kotlinFunctionMapJvmFunctionSignature = mapJvmFunctionSignature(getter);
        InterfaceC31149p0 setter = interfaceC31145n0Mo78660a.getSetter();
        return new JvmPropertySignature.MappedKotlinProperty(kotlinFunctionMapJvmFunctionSignature, setter != null ? mapJvmFunctionSignature(setter) : null);
    }

    public final JvmFunctionSignature mapSignature(InterfaceC31162w possiblySubstitutedFunction) {
        Method methodM122126k;
        AbstractC22676k.m65750j(possiblySubstitutedFunction, "possiblySubstitutedFunction");
        InterfaceC31162w interfaceC31162wMo78660a = ((InterfaceC31162w) AbstractC39363f.m125536r(possiblySubstitutedFunction)).mo78660a();
        AbstractC22676k.m65749i(interfaceC31162wMo78660a, "getOriginal(...)");
        if (!(interfaceC31162wMo78660a instanceof InterfaceC21542b)) {
            if (interfaceC31162wMo78660a instanceof C17062e) {
                InterfaceC31155s0 source = ((C17062e) interfaceC31162wMo78660a).getSource();
                C36973f c36973f = source instanceof C36973f ? (C36973f) source : null;
                AbstractC38126r abstractC38126r = c36973f != null ? c36973f.f158234w : null;
                C38131w c38131w = abstractC38126r instanceof C38131w ? (C38131w) abstractC38126r : null;
                if (c38131w != null && (methodM122126k = c38131w.m122126k()) != null) {
                    return new JvmFunctionSignature.JavaMethod(methodM122126k);
                }
                throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java method " + interfaceC31162wMo78660a);
            }
            if (!(interfaceC31162wMo78660a instanceof C17059b)) {
                if (isKnownBuiltInFunction(interfaceC31162wMo78660a)) {
                    return mapJvmFunctionSignature(interfaceC31162wMo78660a);
                }
                throw new KotlinReflectionInternalError("Unknown origin of " + interfaceC31162wMo78660a + " (" + interfaceC31162wMo78660a.getClass() + ')');
            }
            InterfaceC31155s0 source2 = ((C17059b) interfaceC31162wMo78660a).getSource();
            C36973f c36973f2 = source2 instanceof C36973f ? (C36973f) source2 : null;
            AbstractC38126r abstractC38126r2 = c36973f2 != null ? c36973f2.f158234w : null;
            if (abstractC38126r2 instanceof C38125q) {
                return new JvmFunctionSignature.JavaConstructor(((C38125q) abstractC38126r2).m122113j());
            }
            if (abstractC38126r2 instanceof C38122n) {
                Class cls = ((C38122n) abstractC38126r2).f163232a;
                if (cls.isAnnotation()) {
                    return new JvmFunctionSignature.FakeJavaAnnotationConstructor(cls);
                }
            }
            throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java constructor " + interfaceC31162wMo78660a + " (" + abstractC38126r2 + ')');
        }
        InterfaceC21551k interfaceC21551k = (InterfaceC21551k) interfaceC31162wMo78660a;
        InterfaceC37019v interfaceC37019vMo60564R = interfaceC21551k.mo60564R();
        if (interfaceC37019vMo60564R instanceof C30122c0) {
            C36998i c36998i = C34727g.f146269a;
            C34725e c34725eM109651c = C34727g.m109651c((C30122c0) interfaceC37019vMo60564R, interfaceC21551k.mo60568w(), interfaceC21551k.mo60567t());
            if (c34725eM109651c != null) {
                return new JvmFunctionSignature.KotlinFunction(c34725eM109651c);
            }
        }
        if (interfaceC37019vMo60564R instanceof C30154o) {
            C36998i c36998i2 = C34727g.f146269a;
            C34725e c34725eM109649a = C34727g.m109649a((C30154o) interfaceC37019vMo60564R, interfaceC21551k.mo60568w(), interfaceC21551k.mo60567t());
            if (c34725eM109649a != null) {
                String name = c34725eM109649a.f146263x;
                String str = c34725eM109649a.f146264y;
                InterfaceC31135k interfaceC31135kMo60581g = possiblySubstitutedFunction.mo60581g();
                AbstractC22676k.m65749i(interfaceC31135kMo60581g, "getContainingDeclaration(...)");
                if (AbstractC39365h.m125538b(interfaceC31135kMo60581g)) {
                    return new JvmFunctionSignature.KotlinFunction(c34725eM109649a);
                }
                InterfaceC31135k interfaceC31135kMo60581g2 = possiblySubstitutedFunction.mo60581g();
                AbstractC22676k.m65749i(interfaceC31135kMo60581g2, "getContainingDeclaration(...)");
                if (!AbstractC39365h.m125539c(interfaceC31135kMo60581g2)) {
                    return new JvmFunctionSignature.KotlinConstructor(c34725eM109649a);
                }
                InterfaceC31132j interfaceC31132j = (InterfaceC31132j) possiblySubstitutedFunction;
                if (interfaceC31132j.mo95869O()) {
                    if (!AbstractC22676k.m65745e(name, "constructor-impl") || !AbstractC39421y.m125920E(str, ")V", false)) {
                        throw new IllegalArgumentException(("Invalid signature: " + c34725eM109649a).toString());
                    }
                } else {
                    if (!AbstractC22676k.m65745e(name, "constructor-impl")) {
                        throw new IllegalArgumentException(("Invalid signature: " + c34725eM109649a).toString());
                    }
                    InterfaceC31117e interfaceC31117eMo95870P = interfaceC31132j.mo95870P();
                    AbstractC22676k.m65749i(interfaceC31117eMo95870P, "getConstructedClass(...)");
                    C35845c c35845cM13808f = AbstractC4393e.m13808f(interfaceC31117eMo95870P);
                    AbstractC22676k.m65747g(c35845cM13808f);
                    String strM109647b = AbstractC34722b.m109647b(c35845cM13808f.m113774b());
                    if (AbstractC39421y.m125920E(str, ")V", false)) {
                        String desc = AbstractC39414r.m125900s0(str, "V") + strM109647b;
                        AbstractC22676k.m65750j(name, "name");
                        AbstractC22676k.m65750j(desc, "desc");
                        c34725eM109649a = new C34725e(name, desc);
                    } else if (!AbstractC39421y.m125920E(str, strM109647b, false)) {
                        throw new IllegalArgumentException(("Invalid signature: " + c34725eM109649a).toString());
                    }
                }
                return new JvmFunctionSignature.KotlinFunction(c34725eM109649a);
            }
        }
        return mapJvmFunctionSignature(interfaceC31162wMo78660a);
    }
}
