package m93;

import e93.AbstractC12889b;
import ge3.AbstractC15751g;
import gm.C15990r;
import hg3.AbstractC17269i;
import i93.C18283i;
import i93.C18284j;
import io.sentry.config.AbstractC20301a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import lb3.AbstractC23763c0;
import lb3.AbstractC23811y;
import m83.AbstractC25243e0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import n83.C26460c;
import o93.AbstractC27736h;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import p715kotlin.reflect.jvm.internal.UtilKt;
import r83.EnumC31071a;
import r93.InterfaceC31107a1;
import r93.InterfaceC31111c;
import r93.InterfaceC31117e;
import r93.InterfaceC31132j;
import r93.InterfaceC31135k;
import r93.InterfaceC31151q0;
import r93.InterfaceC31162w;
import se.AbstractC32410a;
import u93.AbstractC34670d;
import u93.AbstractC34711x0;
import u93.C34709w0;
import wb3.AbstractC37056f;
import ya3.AbstractC39365h;

/* JADX INFO: renamed from: m93.e0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C25337e0 implements InterfaceC25339g {

    /* JADX INFO: renamed from: a */
    public final boolean f99363a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC25339g f99364b;

    /* JADX INFO: renamed from: c */
    public final Member f99365c;

    /* JADX INFO: renamed from: d */
    public final C15990r f99366d;

    /* JADX INFO: renamed from: e */
    public final C18284j[] f99367e;

    /* JADX INFO: renamed from: f */
    public final boolean f99368f;

    /* JADX WARN: Code duplicated, block: B:135:0x029d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0084 A[LOOP:1: B:25:0x007e->B:27:0x0084, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x013f  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d8  */
    public C25337e0(InterfaceC25339g oldCaller, InterfaceC31111c descriptor, boolean z4) {
        Class clsM48907o0;
        Method declaredMethod;
        boolean z13;
        C15990r c15990r;
        List listM48872S;
        AbstractC23763c0 abstractC23763c0M125544h;
        ArrayList arrayList;
        Iterator it;
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(oldCaller, "oldCaller");
        this.f99363a = z4;
        boolean z14 = false;
        if (oldCaller instanceof C25353u) {
            InterfaceC31151q0 interfaceC31151q0Mo78667B = descriptor.mo78667B();
            interfaceC31151q0Mo78667B = interfaceC31151q0Mo78667B == null ? descriptor.mo78677y() : interfaceC31151q0Mo78667B;
            AbstractC23811y type = interfaceC31151q0Mo78667B != null ? ((AbstractC34670d) interfaceC31151q0Mo78667B).getType() : null;
            if (type != null && AbstractC39365h.m125543g(type)) {
                if (z4) {
                    List listMo78676v = descriptor.mo78676v();
                    AbstractC22676k.m65749i(listMo78676v, "getValueParameters(...)");
                    List list = listMo78676v;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it3 = list.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (((C34709w0) ((InterfaceC31107a1) it3.next())).m109625J0()) {
                                    ArrayList arrayListM48872S = AbstractC17269i.m48872S(AbstractC32410a.m101050t(type));
                                    AbstractC22676k.m65747g(arrayListM48872S);
                                    arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayListM48872S, 10));
                                    it = arrayListM48872S.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((Method) it.next()).invoke(((C25353u) oldCaller).f99378g, null));
                                    }
                                    oldCaller = new C25354v((Method) ((AbstractC25356x) oldCaller).f99382a, arrayList.toArray(new Object[0]));
                                }
                            }
                        }
                    }
                } else {
                    ArrayList arrayListM48872S2 = AbstractC17269i.m48872S(AbstractC32410a.m101050t(type));
                    AbstractC22676k.m65747g(arrayListM48872S2);
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayListM48872S2, 10));
                    it = arrayListM48872S2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Method) it.next()).invoke(((C25353u) oldCaller).f99378g, null));
                    }
                    oldCaller = new C25354v((Method) ((AbstractC25356x) oldCaller).f99382a, arrayList.toArray(new Object[0]));
                }
            }
        }
        this.f99364b = oldCaller;
        this.f99365c = oldCaller.getMember();
        AbstractC23811y returnType = descriptor.getReturnType();
        AbstractC22676k.m65747g(returnType);
        boolean z15 = descriptor instanceof InterfaceC31162w;
        if ((z15 && ((InterfaceC31162w) descriptor).isSuspend() && (abstractC23763c0M125544h = AbstractC39365h.m125544h(returnType)) != null && AbstractC27736h.m83805G(abstractC23763c0M125544h)) || (clsM48907o0 = AbstractC17269i.m48907o0(returnType)) == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = clsM48907o0.getDeclaredMethod("box-impl", AbstractC17269i.m48871R(clsM48907o0, descriptor).getReturnType());
                AbstractC22676k.m65747g(declaredMethod);
            } catch (NoSuchMethodException unused) {
                throw new KotlinReflectionInternalError("No box method found in inline class: " + clsM48907o0 + " (calling " + descriptor + ')');
            }
        }
        if (AbstractC39365h.m125537a(descriptor)) {
            c15990r = new C15990r(C18284j.f71140z, new List[0], declaredMethod);
        } else {
            int i13 = -1;
            if ((!(oldCaller instanceof C25353u) || ((C25353u) oldCaller).f99377f) && !(oldCaller instanceof C25354v)) {
                if (descriptor instanceof InterfaceC31132j) {
                    if (!(oldCaller instanceof InterfaceC25338f)) {
                        i13 = 0;
                    }
                } else if (descriptor.mo78677y() == null || (oldCaller instanceof InterfaceC25338f)) {
                    i13 = 0;
                } else {
                    InterfaceC31135k interfaceC31135kMo60581g = descriptor.mo60581g();
                    AbstractC22676k.m65749i(interfaceC31135kMo60581g, "getContainingDeclaration(...)");
                    if (AbstractC39365h.m125541e(interfaceC31135kMo60581g)) {
                        i13 = 0;
                    } else {
                        i13 = 1;
                    }
                }
            }
            int i14 = oldCaller instanceof C25354v ? -((C25354v) oldCaller).f99379f.length : i13;
            Member member = oldCaller.getMember();
            ArrayList arrayList2 = new ArrayList();
            InterfaceC31151q0 interfaceC31151q0Mo78667B2 = descriptor.mo78667B();
            AbstractC23811y type2 = interfaceC31151q0Mo78667B2 != null ? ((AbstractC34670d) interfaceC31151q0Mo78667B2).getType() : null;
            if (type2 != null) {
                arrayList2.add(type2);
            } else if (descriptor instanceof InterfaceC31132j) {
                InterfaceC31117e interfaceC31117eMo95870P = ((InterfaceC31132j) descriptor).mo95870P();
                AbstractC22676k.m65749i(interfaceC31117eMo95870P, "getConstructedClass(...)");
                if (interfaceC31117eMo95870P.isInner()) {
                    InterfaceC31135k interfaceC31135kMo60581g2 = interfaceC31117eMo95870P.mo60581g();
                    AbstractC22676k.m65748h(interfaceC31135kMo60581g2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    arrayList2.add(((InterfaceC31117e) interfaceC31135kMo60581g2).mo60594i());
                }
            } else {
                InterfaceC31135k interfaceC31135kMo60581g3 = descriptor.mo60581g();
                AbstractC22676k.m65749i(interfaceC31135kMo60581g3, "getContainingDeclaration(...)");
                if (interfaceC31135kMo60581g3 instanceof InterfaceC31117e) {
                    InterfaceC31117e interfaceC31117e = (InterfaceC31117e) interfaceC31135kMo60581g3;
                    if (AbstractC39365h.m125541e(interfaceC31117e)) {
                        if (member == null) {
                            z13 = false;
                        } else {
                            Class<?> declaringClass = member.getDeclaringClass();
                            if (declaringClass == null ? false : !AbstractC21598x.m60666V(declaringClass).isValue()) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                        }
                        if (z13) {
                            AbstractC23763c0 abstractC23763c0Mo60594i = interfaceC31117e.mo60594i();
                            AbstractC22676k.m65749i(abstractC23763c0Mo60594i, "getDefaultType(...)");
                            arrayList2.add(AbstractC20301a.m56318Q(abstractC23763c0Mo60594i));
                        } else {
                            arrayList2.add(interfaceC31117e.mo60594i());
                        }
                    }
                }
            }
            List listMo78676v2 = descriptor.mo78676v();
            AbstractC22676k.m65749i(listMo78676v2, "getValueParameters(...)");
            Iterator it4 = listMo78676v2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(((AbstractC34711x0) ((InterfaceC31107a1) it4.next())).getType());
            }
            Iterator it5 = arrayList2.iterator();
            int size = 0;
            while (it5.hasNext()) {
                ArrayList arrayListM48872S3 = AbstractC17269i.m48872S(AbstractC32410a.m101050t((AbstractC23811y) it5.next()));
                size += arrayListM48872S3 != null ? arrayListM48872S3.size() : 1;
            }
            int i15 = size + i14 + (this.f99363a ? ((size + 31) / 32) + 1 : 0) + ((z15 && ((InterfaceC31162w) descriptor).isSuspend()) ? 1 : 0);
            boolean z16 = this.f99363a;
            if (AbstractC15751g.m44473z(this) != i15) {
                throw new KotlinReflectionInternalError("Inconsistent number of parameters in the descriptor and Java reflection object: " + AbstractC15751g.m44473z(this) + " != " + i15 + "\nCalling: " + descriptor + "\nParameter types: " + this.f99364b.mo74408a() + ")\nDefault: " + z16);
            }
            C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(Math.max(i13, 0), arrayList2.size() + i13);
            List[] listArr = new List[i15];
            int i16 = 0;
            while (i16 < i15) {
                if (i16 <= c18284jM36278i0.f71134x && c18284jM36278i0.f71133w <= i16) {
                    AbstractC23763c0 abstractC23763c0M101050t = AbstractC32410a.m101050t((AbstractC23811y) arrayList2.get(i16 - i13));
                    listM48872S = AbstractC17269i.m48872S(abstractC23763c0M101050t);
                    if (listM48872S == null) {
                        Class clsM48907o1 = AbstractC17269i.m48907o0(abstractC23763c0M101050t);
                        if (clsM48907o1 != null) {
                            listM48872S = AbstractC37056f.m118958J(AbstractC17269i.m48871R(clsM48907o1, descriptor));
                        } else {
                            listM48872S = null;
                        }
                    }
                } else {
                    listM48872S = null;
                }
                listArr[i16] = listM48872S;
                i16++;
            }
            c15990r = new C15990r(c18284jM36278i0, listArr, declaredMethod);
        }
        this.f99366d = c15990r;
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        InterfaceC25339g interfaceC25339g = this.f99364b;
        int length = interfaceC25339g instanceof C25354v ? ((C25354v) interfaceC25339g).f99379f.length : interfaceC25339g instanceof C25353u ? 1 : 0;
        if (length > 0) {
            c26460cM119000x.add(AbstractC12889b.m36278i0(0, length));
        }
        List[] listArr2 = (List[]) c15990r.f60513y;
        int length2 = listArr2.length;
        int i17 = 0;
        while (i17 < length2) {
            List list2 = listArr2[i17];
            int size2 = (list2 != null ? list2.size() : 1) + length;
            c26460cM119000x.add(AbstractC12889b.m36278i0(length, size2));
            i17++;
            length = size2;
        }
        this.f99367e = (C18284j[]) AbstractC37056f.m118988k(c26460cM119000x).toArray(new C18284j[0]);
        Iterable iterable = (C18284j) this.f99366d.f60512x;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it6 = iterable.iterator();
            while (((C18283i) it6).f71138y) {
                List list3 = ((List[]) this.f99366d.f60513y)[((AbstractC25243e0) it6).nextInt()];
                if (list3 != null && list3.size() > 1) {
                    z14 = true;
                    break;
                }
            }
        }
        this.f99368f = z14;
    }

    @Override // m93.InterfaceC25339g
    /* JADX INFO: renamed from: a */
    public final List mo74408a() {
        return this.f99364b.mo74408a();
    }

    @Override // m93.InterfaceC25339g
    /* JADX INFO: renamed from: b */
    public final boolean mo74409b() {
        return this.f99364b instanceof C25351s;
    }

    /* JADX INFO: renamed from: c */
    public final C18284j m74411c(int i13) {
        C18284j[] c18284jArr = this.f99367e;
        if (i13 >= 0 && i13 < c18284jArr.length) {
            return c18284jArr[i13];
        }
        if (c18284jArr.length == 0) {
            return new C18284j(i13, i13, 1);
        }
        int length = ((C18284j) AbstractC25260n.m74029E0(c18284jArr)).f71134x + 1 + (i13 - c18284jArr.length);
        return new C18284j(length, length, 1);
    }

    @Override // m93.InterfaceC25339g
    public final Object call(Object[] args) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        Object objDefaultPrimitiveValue;
        Object objDefaultPrimitiveValue2;
        AbstractC22676k.m65750j(args, "args");
        C15990r c15990r = this.f99366d;
        C18284j c18284j = (C18284j) c15990r.f60512x;
        List[] listArr = (List[]) c15990r.f60513y;
        Method method = (Method) c15990r.f60514z;
        boolean zIsEmpty = c18284j.isEmpty();
        int i13 = c18284j.f71134x;
        int i14 = c18284j.f71133w;
        if (!zIsEmpty) {
            if (this.f99368f) {
                C26460c c26460c = new C26460c(args.length);
                for (int i15 = 0; i15 < i14; i15++) {
                    c26460c.add(args[i15]);
                }
                if (i14 <= i13) {
                    while (true) {
                        List<Method> list = listArr[i14];
                        Object obj = args[i14];
                        if (list != null) {
                            for (Method method2 : list) {
                                if (obj != null) {
                                    objDefaultPrimitiveValue2 = method2.invoke(obj, null);
                                } else {
                                    Class<?> returnType = method2.getReturnType();
                                    AbstractC22676k.m65749i(returnType, "getReturnType(...)");
                                    objDefaultPrimitiveValue2 = UtilKt.defaultPrimitiveValue(returnType);
                                }
                                c26460c.add(objDefaultPrimitiveValue2);
                            }
                        } else {
                            c26460c.add(obj);
                        }
                        if (i14 == i13) {
                            break;
                        }
                        i14++;
                    }
                }
                int i16 = i13 + 1;
                int length = args.length - 1;
                if (i16 <= length) {
                    while (true) {
                        c26460c.add(args[i16]);
                        if (i16 == length) {
                            break;
                        }
                        i16++;
                    }
                }
                args = AbstractC37056f.m118988k(c26460c).toArray(new Object[0]);
            } else {
                int length2 = args.length;
                Object[] objArr = new Object[length2];
                for (int i17 = 0; i17 < length2; i17++) {
                    if (i17 > i13 || i14 > i17) {
                        objDefaultPrimitiveValue = args[i17];
                    } else {
                        List list2 = listArr[i17];
                        Method method3 = list2 != null ? (Method) AbstractC25265s.m74142p1(list2) : null;
                        objDefaultPrimitiveValue = args[i17];
                        if (method3 != null) {
                            if (objDefaultPrimitiveValue != null) {
                                objDefaultPrimitiveValue = method3.invoke(objDefaultPrimitiveValue, null);
                            } else {
                                Class<?> returnType2 = method3.getReturnType();
                                AbstractC22676k.m65749i(returnType2, "getReturnType(...)");
                                objDefaultPrimitiveValue = UtilKt.defaultPrimitiveValue(returnType2);
                            }
                        }
                    }
                    objArr[i17] = objDefaultPrimitiveValue;
                }
                args = objArr;
            }
        }
        Object objCall = this.f99364b.call(args);
        return (objCall == EnumC31071a.f128113w || method == null || (objInvoke = method.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    @Override // m93.InterfaceC25339g
    public final Member getMember() {
        return this.f99365c;
    }

    @Override // m93.InterfaceC25339g
    public final Type getReturnType() {
        return this.f99364b.getReturnType();
    }
}
