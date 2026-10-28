package x93;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import m83.AbstractC25260n;
import m83.C25271y;
import ma3.InterfaceC25373b;
import ma3.InterfaceC25374c;
import ma3.InterfaceC25377f;
import p000.AbstractC11266d;
import p000.C31931s;
import p482s7.AbstractC32237a;
import p557vo.AbstractC36220b;
import p692zt.C41113q;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.C35847e;
import va3.C35850h;
import xb3.AbstractC38176k;
import xb3.C38171f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: x93.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C38122n extends AbstractC38126r implements InterfaceC25373b, InterfaceC25374c, InterfaceC25377f {

    /* JADX INFO: renamed from: a */
    public final Class f163232a;

    public C38122n(Class klass) {
        AbstractC22676k.m65750j(klass, "klass");
        this.f163232a = klass;
    }

    @Override // ma3.InterfaceC25373b
    /* JADX INFO: renamed from: a */
    public final C38111d mo74422a(C35847e fqName) {
        Annotation[] declaredAnnotations;
        AbstractC22676k.m65750j(fqName, "fqName");
        Class cls = this.f163232a;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return AbstractC32237a.m100291e(declaredAnnotations, fqName);
    }

    /* JADX INFO: renamed from: b */
    public final Collection m122101b() {
        Field[] declaredFields = this.f163232a.getDeclaredFields();
        AbstractC22676k.m65749i(declaredFields, "getDeclaredFields(...)");
        return AbstractC38176k.m122276E(AbstractC38176k.m122272A(new C38171f(AbstractC25260n.m74050X(declaredFields), false, C38119k.f163229w), C38120l.f163230w));
    }

    /* JADX INFO: renamed from: c */
    public final C35847e m122102c() {
        return AbstractC38109c.m122089a(this.f163232a).m113773a();
    }

    /* JADX INFO: renamed from: d */
    public final Collection m122103d() {
        Method[] declaredMethods = this.f163232a.getDeclaredMethods();
        AbstractC22676k.m65749i(declaredMethods, "getDeclaredMethods(...)");
        return AbstractC38176k.m122276E(AbstractC38176k.m122272A(AbstractC38176k.m122282r(AbstractC25260n.m74050X(declaredMethods), new C31931s(this, 28)), C38121m.f163231w));
    }

    /* JADX INFO: renamed from: e */
    public final C35850h m122104e() {
        Class cls = this.f163232a;
        if (!cls.isAnonymousClass()) {
            return C35850h.m113814e(cls.getSimpleName());
        }
        String name = cls.getName();
        return C35850h.m113814e(AbstractC39414r.m125861G0(name, ".", name));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C38122n) {
            return AbstractC22676k.m65745e(this.f163232a, ((C38122n) obj).f163232a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final ArrayList m122105f() {
        Class clazz = this.f163232a;
        AbstractC22676k.m65750j(clazz, "clazz");
        C41113q c41113q = AbstractC36220b.f155064a;
        if (c41113q == null) {
            try {
                c41113q = new C41113q(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
            } catch (NoSuchMethodException unused) {
                c41113q = new C41113q((Method) null, (Method) null, (Method) null, (Method) null);
            }
            AbstractC36220b.f155064a = c41113q;
        }
        Method method = (Method) c41113q.f177222E;
        Object[] objArr = method != null ? (Object[]) method.invoke(clazz, null) : null;
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new C38134z(obj));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m122106g() throws IllegalAccessException, InvocationTargetException {
        Class clazz = this.f163232a;
        AbstractC22676k.m65750j(clazz, "clazz");
        C41113q c41113q = AbstractC36220b.f155064a;
        Boolean bool = null;
        if (c41113q == null) {
            try {
                c41113q = new C41113q(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
            } catch (NoSuchMethodException unused) {
                c41113q = new C41113q((Method) null, (Method) null, (Method) null, (Method) null);
            }
            AbstractC36220b.f155064a = c41113q;
        }
        Method method = (Method) c41113q.f177226z;
        if (method != null) {
            Object objInvoke = method.invoke(clazz, null);
            AbstractC22676k.m65748h(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // ma3.InterfaceC25373b
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        Class cls = this.f163232a;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) ? C25271y.f99162w : AbstractC32237a.m100292f(declaredAnnotations);
    }

    @Override // ma3.InterfaceC25377f
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f163232a.getTypeParameters();
        AbstractC22676k.m65749i(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new C38108b0(typeVariable));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.f163232a.hashCode();
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        AbstractC11266d.m30443A(C38122n.class, sb4, ": ");
        sb4.append(this.f163232a);
        return sb4.toString();
    }
}
