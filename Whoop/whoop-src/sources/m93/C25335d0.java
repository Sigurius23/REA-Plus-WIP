package m93;

import hg3.AbstractC17269i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import l83.C23465k;
import lb3.AbstractC23763c0;
import lb3.AbstractC23811y;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import p715kotlin.reflect.jvm.internal.UtilKt;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import r93.InterfaceC31139l0;
import r93.InterfaceC31162w;
import se.AbstractC32410a;
import wb3.AbstractC37056f;
import x93.AbstractC38109c;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: m93.d0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C25335d0 implements InterfaceC25339g {

    /* JADX INFO: renamed from: a */
    public final Method f99357a;

    /* JADX INFO: renamed from: b */
    public final Method f99358b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f99359c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f99360d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f99361e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.ArrayList] */
    public C25335d0(InterfaceC31162w descriptor, KDeclarationContainerImpl container, String constructorDesc, List list) {
        ?? M118958J;
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(container, "container");
        AbstractC22676k.m65750j(constructorDesc, "constructorDesc");
        Method methodFindMethodBySignature = container.findMethodBySignature("constructor-impl", constructorDesc);
        AbstractC22676k.m65747g(methodFindMethodBySignature);
        this.f99357a = methodFindMethodBySignature;
        Method methodFindMethodBySignature2 = container.findMethodBySignature("box-impl", AbstractC39414r.m125900s0(constructorDesc, "V") + AbstractC38109c.m122090b(container.getJClass()));
        AbstractC22676k.m65747g(methodFindMethodBySignature2);
        this.f99358b = methodFindMethodBySignature2;
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            List listM118958J = null;
            if (!it.hasNext()) {
                break;
            }
            AbstractC23811y type = ((InterfaceC31139l0) it.next()).getType();
            AbstractC22676k.m65749i(type, "getType(...)");
            AbstractC23763c0 abstractC23763c0M101050t = AbstractC32410a.m101050t(type);
            ArrayList arrayListM48872S = AbstractC17269i.m48872S(abstractC23763c0M101050t);
            if (arrayListM48872S == null) {
                Class clsM48907o0 = AbstractC17269i.m48907o0(abstractC23763c0M101050t);
                if (clsM48907o0 != null) {
                    listM118958J = AbstractC37056f.m118958J(AbstractC17269i.m48871R(clsM48907o0, descriptor));
                }
            } else {
                listM118958J = arrayListM48872S;
            }
            arrayList.add(listM118958J);
        }
        this.f99359c = arrayList;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        int i13 = 0;
        for (Object obj : list2) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            InterfaceC31126h interfaceC31126hMo1784d = ((InterfaceC31139l0) obj).getType().mo69844i0().mo1784d();
            AbstractC22676k.m65748h(interfaceC31126hMo1784d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            InterfaceC31117e interfaceC31117e = (InterfaceC31117e) interfaceC31126hMo1784d;
            List list3 = (List) this.f99359c.get(i13);
            if (list3 != null) {
                List list4 = list3;
                M118958J = new ArrayList(AbstractC25267u.m74163i0(list4, 10));
                Iterator it3 = list4.iterator();
                while (it3.hasNext()) {
                    M118958J.add(((Method) it3.next()).getReturnType());
                }
            } else {
                Class<?> javaClass = UtilKt.toJavaClass(interfaceC31117e);
                AbstractC22676k.m65747g(javaClass);
                M118958J = AbstractC37056f.m118958J(javaClass);
            }
            arrayList2.add(M118958J);
            i13 = i14;
        }
        this.f99360d = arrayList2;
        this.f99361e = AbstractC25267u.m74164j0(arrayList2);
    }

    @Override // m93.InterfaceC25339g
    /* JADX INFO: renamed from: a */
    public final List mo74408a() {
        return this.f99361e;
    }

    @Override // m93.InterfaceC25339g
    /* JADX INFO: renamed from: b */
    public final /* bridge */ boolean mo74409b() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    @Override // m93.InterfaceC25339g
    public final Object call(Object[] args) throws IllegalAccessException, InvocationTargetException {
        ?? M118958J;
        AbstractC22676k.m65750j(args, "args");
        ArrayList other = this.f99359c;
        AbstractC22676k.m65750j(other, "other");
        int length = args.length;
        ArrayList<C23465k> arrayList = new ArrayList(Math.min(AbstractC25267u.m74163i0(other, 10), length));
        int i13 = 0;
        for (Object obj : other) {
            if (i13 >= length) {
                break;
            }
            arrayList.add(new C23465k(args[i13], obj));
            i13++;
        }
        ArrayList arrayList2 = new ArrayList();
        for (C23465k c23465k : arrayList) {
            Object obj2 = c23465k.f92937w;
            List list = (List) c23465k.f92938x;
            if (list != null) {
                List list2 = list;
                M118958J = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    M118958J.add(((Method) it.next()).invoke(obj2, null));
                }
            } else {
                M118958J = AbstractC37056f.m118958J(obj2);
            }
            AbstractC25265s.m74141p0(arrayList2, (Iterable) M118958J);
        }
        Object[] array = arrayList2.toArray(new Object[0]);
        this.f99357a.invoke(null, Arrays.copyOf(array, array.length));
        return this.f99358b.invoke(null, Arrays.copyOf(array, array.length));
    }

    @Override // m93.InterfaceC25339g
    public final /* bridge */ /* synthetic */ Member getMember() {
        return null;
    }

    @Override // m93.InterfaceC25339g
    public final Type getReturnType() {
        Class<?> returnType = this.f99358b.getReturnType();
        AbstractC22676k.m65749i(returnType, "getReturnType(...)");
        return returnType;
    }
}
