package va3;

import ab3.C0714f;
import bg.C3215j;
import com.whoop.service.network.model.UserSessionDto;
import db3.EnumC11891c;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kb3.C22333b;
import kb3.C22342k;
import l83.C23465k;
import lb3.AbstractC23804u0;
import lb3.AbstractC23812y0;
import lb3.C23803u;
import lb3.C23806v0;
import lb3.C23813z;
import lb3.EnumC23776g1;
import m83.AbstractC25260n;
import m83.AbstractC25267u;
import o93.AbstractC27741m;
import o93.EnumC27738j;
import oa3.InterfaceC27771n;
import oa3.InterfaceC27772o;
import oa3.InterfaceC27773p;
import p000.AbstractC11266d;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import q93.C30080d;
import r93.InterfaceC31124g0;
import r93.InterfaceC31165x0;
import u93.AbstractC34677g0;
import w93.AbstractC36970c;
import w93.C36968a;
import wd3.AbstractC37172f;
import x93.AbstractC38109c;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import z93.C40211b;
import z93.InterfaceC40210a;
import za3.C40246a;
import za3.C40249d;

/* JADX INFO: renamed from: va3.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC35844b {
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, l83.h] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, l83.h] */
    /* JADX INFO: renamed from: a */
    public static C0714f m113760a(Class cls) {
        int i13 = 0;
        while (cls.isArray()) {
            i13++;
            cls = cls.getComponentType();
            AbstractC22676k.m65749i(cls, "getComponentType(...)");
        }
        if (!cls.isPrimitive()) {
            C35845c c35845cM122089a = AbstractC38109c.m122089a(cls);
            String str = C30080d.f122759a;
            C35847e fqName = c35845cM122089a.m113773a();
            AbstractC22676k.m65750j(fqName, "fqName");
            C35845c c35845c = (C35845c) C30080d.f122766h.get(fqName.f152613a);
            if (c35845c != null) {
                c35845cM122089a = c35845c;
            }
            return new C0714f(c35845cM122089a, i13);
        }
        if (cls.equals(Void.TYPE)) {
            C35847e c35847eM113798i = AbstractC27741m.f111849d.m113798i();
            return new C0714f(new C35845c(c35847eM113798i.m113789b(), c35847eM113798i.f152613a.m113796g()), i13);
        }
        EnumC27738j enumC27738jM31932d = EnumC11891c.m31930b(cls.getName()).m31932d();
        AbstractC22676k.m65749i(enumC27738jM31932d, "getPrimitiveType(...)");
        if (i13 > 0) {
            C35847e topLevelFqName = (C35847e) enumC27738jM31932d.f111809z.getValue();
            AbstractC22676k.m65750j(topLevelFqName, "topLevelFqName");
            return new C0714f(new C35845c(topLevelFqName.m113789b(), topLevelFqName.f152613a.m113796g()), i13 - 1);
        }
        C35847e topLevelFqName2 = (C35847e) enumC27738jM31932d.f111808y.getValue();
        AbstractC22676k.m65750j(topLevelFqName2, "topLevelFqName");
        return new C0714f(new C35845c(topLevelFqName2.m113789b(), topLevelFqName2.f152613a.m113796g()), i13);
    }

    /* JADX INFO: renamed from: b */
    public static final void m113761b(C22677k0 c22677k0, String name, String value) {
        AbstractC22676k.m65750j(c22677k0, "<this>");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(value, "value");
        ArrayList arrayList = c22677k0.f89339a;
        arrayList.add(name);
        arrayList.add(AbstractC39414r.m125869O0(value).toString());
    }

    /* JADX INFO: renamed from: c */
    public static final AbstractC23804u0 m113762c(AbstractC23804u0 abstractC23804u0, InterfaceC31165x0 interfaceC31165x0) {
        if (interfaceC31165x0 == null || abstractC23804u0.mo69867a() == EnumC23776g1.INVARIANT) {
            return abstractC23804u0;
        }
        if (interfaceC31165x0.getVariance() != abstractC23804u0.mo69867a()) {
            return new C23806v0(new C40246a(abstractC23804u0));
        }
        if (!abstractC23804u0.mo69869c()) {
            return new C23806v0(abstractC23804u0.mo69868b());
        }
        C22333b NO_LOCKS = C22342k.f87183e;
        AbstractC22676k.m65749i(NO_LOCKS, "NO_LOCKS");
        return new C23806v0(new C23813z(NO_LOCKS, new C3215j(abstractC23804u0, 21)));
    }

    /* JADX INFO: renamed from: d */
    public static C35845c m113763d(String string, boolean z4) {
        String strM125926K;
        AbstractC22676k.m65750j(string, "string");
        int iM125887f0 = AbstractC39414r.m125887f0(string, '`', 0, false, 6);
        if (iM125887f0 == -1) {
            iM125887f0 = string.length();
        }
        int iM125893l0 = AbstractC39414r.m125893l0(string, "/", iM125887f0, 4);
        String str = "";
        if (iM125893l0 == -1) {
            strM125926K = AbstractC39421y.m125926K(string, "`", "", false);
        } else {
            String strSubstring = string.substring(0, iM125893l0);
            AbstractC22676k.m65749i(strSubstring, "substring(...)");
            String strM125927L = AbstractC39421y.m125927L(strSubstring, '/', '.');
            String strSubstring2 = string.substring(iM125893l0 + 1);
            AbstractC22676k.m65749i(strSubstring2, "substring(...)");
            strM125926K = AbstractC39421y.m125926K(strSubstring2, "`", "", false);
            str = strM125927L;
        }
        return new C35845c(new C35847e(str), new C35847e(strM125926K), z4);
    }

    /* JADX INFO: renamed from: e */
    public static final void m113764e(String name) {
        AbstractC22676k.m65750j(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = name.length();
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = name.charAt(i13);
            if ('!' > cCharAt || cCharAt >= 127) {
                StringBuilder sb4 = new StringBuilder("Unexpected char 0x");
                AbstractC35846d.m113779c(16);
                String string = Integer.toString(cCharAt, 16);
                AbstractC22676k.m65749i(string, "toString(...)");
                if (string.length() < 2) {
                    string = UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE.concat(string);
                }
                AbstractC11266d.m30470x(i13, string, " at ", " in header name: ", sb4);
                sb4.append(name);
                throw new IllegalArgumentException(sb4.toString().toString());
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m113765f(String value, String name) {
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(name, "name");
        int length = value.length();
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = value.charAt(i13);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb4 = new StringBuilder("Unexpected char 0x");
                AbstractC35846d.m113779c(16);
                String string = Integer.toString(cCharAt, 16);
                AbstractC22676k.m65749i(string, "toString(...)");
                if (string.length() < 2) {
                    string = UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE.concat(string);
                }
                AbstractC11266d.m30470x(i13, string, " at ", " in ", sb4);
                sb4.append(name);
                sb4.append(" value");
                sb4.append(AbstractC37172f.m119128m(name) ? "" : ": ".concat(value));
                throw new IllegalArgumentException(sb4.toString().toString());
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m113766g(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public static void m113767h(InterfaceC27773p interfaceC27773p, Annotation annotation) {
        Class clsM60663S = AbstractC21598x.m60663S(AbstractC21598x.m60655K(annotation));
        InterfaceC27771n interfaceC27771nMo45165i = interfaceC27773p.mo45165i(AbstractC38109c.m122089a(clsM60663S), new C36968a(annotation));
        if (interfaceC27771nMo45165i != null) {
            m113768i(interfaceC27771nMo45165i, annotation, clsM60663S);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m113768i(InterfaceC27771n interfaceC27771n, Annotation annotation, Class cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        AbstractC22676k.m65749i(declaredMethods, "getDeclaredMethods(...)");
        for (Method method : declaredMethods) {
            try {
                Object objInvoke = method.invoke(annotation, null);
                AbstractC22676k.m65747g(objInvoke);
                C35850h c35850hM113814e = C35850h.m113814e(method.getName());
                Class<?> enclosingClass = objInvoke.getClass();
                if (enclosingClass.equals(Class.class)) {
                    interfaceC27771n.mo197n(c35850hM113814e, m113760a((Class) objInvoke));
                } else if (AbstractC36970c.f158229a.contains(enclosingClass)) {
                    interfaceC27771n.mo198p(c35850hM113814e, objInvoke);
                } else {
                    List list = AbstractC38109c.f163211a;
                    if (Enum.class.isAssignableFrom(enclosingClass)) {
                        if (!enclosingClass.isEnum()) {
                            enclosingClass = enclosingClass.getEnclosingClass();
                        }
                        AbstractC22676k.m65747g(enclosingClass);
                        interfaceC27771n.mo199q(c35850hM113814e, AbstractC38109c.m122089a(enclosingClass), C35850h.m113814e(((Enum) objInvoke).name()));
                    } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
                        Class<?>[] interfaces = enclosingClass.getInterfaces();
                        AbstractC22676k.m65749i(interfaces, "getInterfaces(...)");
                        Class cls2 = (Class) AbstractC25260n.m74037M0(interfaces);
                        AbstractC22676k.m65747g(cls2);
                        InterfaceC27771n interfaceC27771nMo201s = interfaceC27771n.mo201s(AbstractC38109c.m122089a(cls2), c35850hM113814e);
                        if (interfaceC27771nMo201s != null) {
                            m113768i(interfaceC27771nMo201s, (Annotation) objInvoke, cls2);
                        }
                    } else {
                        if (!enclosingClass.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                        }
                        InterfaceC27772o interfaceC27772oMo196m = interfaceC27771n.mo196m(c35850hM113814e);
                        if (interfaceC27772oMo196m != null) {
                            Class<?> componentType = enclosingClass.getComponentType();
                            if (componentType.isEnum()) {
                                C35845c c35845cM122089a = AbstractC38109c.m122089a(componentType);
                                for (Object obj : (Object[]) objInvoke) {
                                    AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
                                    interfaceC27772oMo196m.mo171G(c35845cM122089a, C35850h.m113814e(((Enum) obj).name()));
                                }
                            } else if (componentType.equals(Class.class)) {
                                for (Object obj2 : (Object[]) objInvoke) {
                                    AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                    interfaceC27772oMo196m.mo181X(m113760a((Class) obj2));
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                for (Object obj3 : (Object[]) objInvoke) {
                                    InterfaceC27771n interfaceC27771nMo192i0 = interfaceC27772oMo196m.mo192i0(AbstractC38109c.m122089a(componentType));
                                    if (interfaceC27771nMo192i0 != null) {
                                        AbstractC22676k.m65748h(obj3, "null cannot be cast to non-null type kotlin.Annotation");
                                        m113768i(interfaceC27771nMo192i0, (Annotation) obj3, componentType);
                                    }
                                }
                            } else {
                                for (Object obj4 : (Object[]) objInvoke) {
                                    interfaceC27772oMo196m.mo182Y(obj4);
                                }
                            }
                            interfaceC27772oMo196m.mo195l();
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        interfaceC27771n.mo195l();
    }

    /* JADX INFO: renamed from: j */
    public static final void m113769j(C40211b c40211b, InterfaceC40210a from, InterfaceC31124g0 scopeOwner, C35850h name) {
        AbstractC22676k.m65750j(c40211b, "<this>");
        AbstractC22676k.m65750j(from, "from");
        AbstractC22676k.m65750j(scopeOwner, "scopeOwner");
        AbstractC22676k.m65750j(name, "name");
        String packageFqName = ((AbstractC34677g0) scopeOwner).f146067F.f152613a.f152616a;
        AbstractC22676k.m65749i(name.m113817b(), "asString(...)");
        AbstractC22676k.m65750j(packageFqName, "packageFqName");
    }

    /* JADX INFO: renamed from: k */
    public static C35845c m113770k(C35847e topLevelFqName) {
        AbstractC22676k.m65750j(topLevelFqName, "topLevelFqName");
        return new C35845c(topLevelFqName.m113789b(), topLevelFqName.f152613a.m113796g());
    }

    /* JADX INFO: renamed from: l */
    public static AbstractC23812y0 m113771l(AbstractC23812y0 abstractC23812y0) {
        if (!(abstractC23812y0 instanceof C23803u)) {
            return new C40249d(abstractC23812y0);
        }
        C23803u c23803u = (C23803u) abstractC23812y0;
        InterfaceC31165x0[] interfaceC31165x0Arr = c23803u.f94195b;
        ArrayList<C23465k> arrayListM74063d1 = AbstractC25260n.m74063d1(c23803u.f94196c, interfaceC31165x0Arr);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayListM74063d1, 10));
        for (C23465k c23465k : arrayListM74063d1) {
            arrayList.add(m113762c((AbstractC23804u0) c23465k.f92937w, (InterfaceC31165x0) c23465k.f92938x));
        }
        return new C23803u(interfaceC31165x0Arr, (AbstractC23804u0[]) arrayList.toArray(new AbstractC23804u0[0]), true);
    }
}
