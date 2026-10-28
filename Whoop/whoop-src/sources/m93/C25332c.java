package m93;

import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import j93.InterfaceC21461d;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32411b;
import x93.AbstractC38109c;

/* JADX INFO: renamed from: m93.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C25332c implements InterfaceC25339g {

    /* JADX INFO: renamed from: a */
    public final Class f99344a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f99345b;

    /* JADX INFO: renamed from: c */
    public final EnumC25328a f99346c;

    /* JADX INFO: renamed from: d */
    public final List f99347d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f99348e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f99349f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f99350g;

    public C25332c(Class jClass, ArrayList arrayList, EnumC25328a enumC25328a, EnumC25330b enumC25330b, List methods) {
        AbstractC22676k.m65750j(jClass, "jClass");
        AbstractC22676k.m65750j(methods, "methods");
        this.f99344a = jClass;
        this.f99345b = arrayList;
        this.f99346c = enumC25328a;
        this.f99347d = methods;
        List list = methods;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.f99348e = arrayList2;
        List list2 = this.f99347d;
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            Class<?> returnType = ((Method) it3.next()).getReturnType();
            AbstractC22676k.m65747g(returnType);
            List list3 = AbstractC38109c.f163211a;
            Class<?> cls = (Class) AbstractC38109c.f163213c.get(returnType);
            if (cls != null) {
                returnType = cls;
            }
            arrayList3.add(returnType);
        }
        this.f99349f = arrayList3;
        List list4 = this.f99347d;
        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(list4, 10));
        Iterator it4 = list4.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((Method) it4.next()).getDefaultValue());
        }
        this.f99350g = arrayList4;
        if (this.f99346c == EnumC25328a.f99336x && enumC25330b == EnumC25330b.f99338w && !AbstractC25265s.m74124b1(this.f99345b, "value").isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override // m93.InterfaceC25339g
    /* JADX INFO: renamed from: a */
    public final List mo74408a() {
        return this.f99348e;
    }

    @Override // m93.InterfaceC25339g
    /* JADX INFO: renamed from: b */
    public final /* bridge */ boolean mo74409b() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    @Override // m93.InterfaceC25339g
    public final Object call(Object[] args) {
        String qualifiedName;
        AbstractC22676k.m65750j(args, "args");
        if (AbstractC15751g.m44473z(this) != args.length) {
            StringBuilder sb4 = new StringBuilder("Callable expects ");
            sb4.append(AbstractC15751g.m44473z(this));
            sb4.append(" arguments, but ");
            throw new IllegalArgumentException(AbstractC18489d0.m53371l(sb4, args.length, " were provided."));
        }
        ArrayList arrayList = new ArrayList(args.length);
        int length = args.length;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            ArrayList arrayList2 = this.f99345b;
            if (i13 >= length) {
                return AbstractC32411b.m101112x(this.f99344a, AbstractC25247g0.m74000i0(AbstractC25265s.m74107K1(arrayList2, arrayList)), this.f99347d);
            }
            Object array = args[i13];
            int i15 = i14 + 1;
            ArrayList arrayList3 = this.f99349f;
            if (array == null && this.f99346c == EnumC25328a.f99335w) {
                array = this.f99350g.get(i14);
            } else {
                Class cls = (Class) arrayList3.get(i14);
                if (array instanceof Class) {
                    array = null;
                } else {
                    if (array instanceof InterfaceC21461d) {
                        array = AbstractC21598x.m60663S((InterfaceC21461d) array);
                    } else if (array instanceof Object[]) {
                        Object[] objArr = (Object[]) array;
                        if (objArr instanceof Class[]) {
                            array = null;
                        } else if (objArr instanceof InterfaceC21461d[]) {
                            InterfaceC21461d[] interfaceC21461dArr = (InterfaceC21461d[]) array;
                            ArrayList arrayList4 = new ArrayList(interfaceC21461dArr.length);
                            for (InterfaceC21461d interfaceC21461d : interfaceC21461dArr) {
                                arrayList4.add(AbstractC21598x.m60663S(interfaceC21461d));
                            }
                            array = arrayList4.toArray(new Class[0]);
                        } else {
                            array = objArr;
                        }
                    }
                    if (!cls.isInstance(array)) {
                        array = null;
                    }
                }
            }
            if (array == null) {
                String str = (String) arrayList2.get(i14);
                Class cls2 = (Class) arrayList3.get(i14);
                InterfaceC21461d orCreateKotlinClass = AbstractC22676k.m65745e(cls2, Class.class) ? AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21461d.class) : (cls2.isArray() && AbstractC22676k.m65745e(cls2.getComponentType(), Class.class)) ? AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21461d[].class) : AbstractC21598x.m60666V(cls2);
                if (AbstractC22676k.m65745e(orCreateKotlinClass.getQualifiedName(), AbstractC22671h0.f89337a.getOrCreateKotlinClass(Object[].class).getQualifiedName())) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(orCreateKotlinClass.getQualifiedName());
                    sb5.append('<');
                    Class<?> componentType = AbstractC21598x.m60663S(orCreateKotlinClass).getComponentType();
                    AbstractC22676k.m65749i(componentType, "getComponentType(...)");
                    sb5.append(AbstractC21598x.m60666V(componentType).getQualifiedName());
                    sb5.append('>');
                    qualifiedName = sb5.toString();
                } else {
                    qualifiedName = orCreateKotlinClass.getQualifiedName();
                }
                throw new IllegalArgumentException("Argument #" + i14 + ' ' + str + " is not of the required type " + qualifiedName);
            }
            arrayList.add(array);
            i13++;
            i14 = i15;
        }
    }

    @Override // m93.InterfaceC25339g
    public final /* bridge */ /* synthetic */ Member getMember() {
        return null;
    }

    @Override // m93.InterfaceC25339g
    public final Type getReturnType() {
        return this.f99344a;
    }

    public /* synthetic */ C25332c(Class cls, ArrayList arrayList, EnumC25328a enumC25328a) {
        EnumC25330b enumC25330b = EnumC25330b.f99339x;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        this(cls, arrayList, enumC25328a, enumC25330b, arrayList2);
    }
}
