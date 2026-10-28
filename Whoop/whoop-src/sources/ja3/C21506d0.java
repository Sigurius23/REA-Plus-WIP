package ja3;

import bi.AbstractC3269g;
import db3.C11889a;
import ia3.C18295a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import mb3.C25395l;
import o93.AbstractC27742n;
import p000.C31931s;
import p048ce.AbstractC4482w;
import p692zt.C41113q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22704g;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22709l;
import q63.AbstractC30007c;
import r93.InterfaceC31126h;
import r93.InterfaceC31135k;
import r93.InterfaceC31145n0;
import s93.AbstractC32306h;
import ub3.AbstractC34756j;
import va3.C35850h;
import wb3.AbstractC37056f;
import x93.C38122n;
import ya3.AbstractC39373p;
import z93.EnumC40212c;
import z93.InterfaceC40210a;

/* JADX INFO: renamed from: ja3.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21506d0 extends AbstractC21508e0 {

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ int f82486p = 0;

    /* JADX INFO: renamed from: n */
    public final C38122n f82487n;

    /* JADX INFO: renamed from: o */
    public final C21513i f82488o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21506d0(C41113q c41113q, C38122n jClass, C21513i c21513i) {
        super(c41113q, null);
        AbstractC22676k.m65750j(jClass, "jClass");
        this.f82487n = jClass;
        this.f82488o = c21513i;
    }

    /* JADX INFO: renamed from: o */
    public static InterfaceC31145n0 m60480o(InterfaceC31145n0 interfaceC31145n0) {
        if (AbstractC30007c.m91831a(interfaceC31145n0.getKind())) {
            return interfaceC31145n0;
        }
        Collection collectionMo78673h = interfaceC31145n0.mo78673h();
        AbstractC22676k.m65749i(collectionMo78673h, "getOverriddenDescriptors(...)");
        Collection<InterfaceC31145n0> collection = collectionMo78673h;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(collection, 10));
        for (InterfaceC31145n0 interfaceC31145n1 : collection) {
            AbstractC22676k.m65747g(interfaceC31145n1);
            arrayList.add(m60480o(interfaceC31145n1));
        }
        return (InterfaceC31145n0) AbstractC25265s.m74142p1(AbstractC25265s.m74159y0(arrayList));
    }

    @Override // ja3.AbstractC21500a0
    /* JADX INFO: renamed from: a */
    public final Set mo60467a(C22704g kindFilter, Function1 function1) {
        AbstractC22676k.m65750j(kindFilter, "kindFilter");
        return C25235a0.f99113w;
    }

    @Override // ja3.AbstractC21500a0
    /* JADX INFO: renamed from: b */
    public final Set mo60468b(C22704g kindFilter, C22709l c22709l) {
        AbstractC22676k.m65750j(kindFilter, "kindFilter");
        Set setM74101H1 = AbstractC25265s.m74101H1(((InterfaceC21503c) this.f82468e.invoke()).mo60459a());
        C21513i c21513i = this.f82488o;
        C21506d0 c21506d0M13979O = AbstractC4482w.m13979O(c21513i);
        Set functionNames = c21506d0M13979O != null ? c21506d0M13979O.getFunctionNames() : null;
        if (functionNames == null) {
            functionNames = C25235a0.f99113w;
        }
        setM74101H1.addAll(functionNames);
        if (this.f82487n.f163232a.isEnum()) {
            setM74101H1.addAll(AbstractC37056f.m118959K(AbstractC27742n.f111878c, AbstractC27742n.f111876a));
        }
        C41113q c41113q = this.f82465b;
        setM74101H1.addAll(((C11889a) ((C18295a) c41113q.f177224x).f71246x).m31922g(c21513i, c41113q));
        return setM74101H1;
    }

    @Override // ja3.AbstractC21500a0
    /* JADX INFO: renamed from: c */
    public final void mo60469c(ArrayList arrayList, C35850h name) {
        AbstractC22676k.m65750j(name, "name");
        C41113q c41113q = this.f82465b;
        ((C11889a) ((C18295a) c41113q.f177224x).f71246x).m31919d(this.f82488o, name, arrayList, c41113q);
    }

    @Override // ja3.AbstractC21500a0
    /* JADX INFO: renamed from: d */
    public final InterfaceC21503c mo60470d() {
        return new C21499a(this.f82487n, C21517m.f82534z);
    }

    @Override // ja3.AbstractC21500a0
    /* JADX INFO: renamed from: f */
    public final void mo60471f(LinkedHashSet linkedHashSet, C35850h name) {
        AbstractC22676k.m65750j(name, "name");
        C21513i c21513i = this.f82488o;
        C21506d0 c21506d0M13979O = AbstractC4482w.m13979O(c21513i);
        Collection collectionM74103I1 = c21506d0M13979O == null ? C25235a0.f99113w : AbstractC25265s.m74103I1(c21506d0M13979O.getContributedFunctions(name, EnumC40212c.f173632E));
        C18295a c18295a = (C18295a) this.f82465b.f177224x;
        linkedHashSet.addAll(AbstractC3269g.m9491V(name, collectionM74103I1, linkedHashSet, this.f82488o, c18295a.f71228f, ((C25395l) c18295a.f71243u).f99491d));
        if (this.f82487n.f163232a.isEnum()) {
            if (name.equals(AbstractC27742n.f111878c)) {
                linkedHashSet.add(AbstractC39373p.m125574h(c21513i));
            } else if (name.equals(AbstractC27742n.f111876a)) {
                linkedHashSet.add(AbstractC39373p.m125575i(c21513i));
            }
        }
    }

    @Override // ja3.AbstractC21508e0, ja3.AbstractC21500a0
    /* JADX INFO: renamed from: g */
    public final void mo60472g(ArrayList arrayList, C35850h name) {
        AbstractC22676k.m65750j(name, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C31931s c31931s = new C31931s(name, 9);
        C21513i c21513i = this.f82488o;
        AbstractC32306h.m100561i(AbstractC37056f.m118958J(c21513i), C21502b0.f82477w, new C21504c0(c21513i, linkedHashSet, c31931s));
        boolean zIsEmpty = arrayList.isEmpty();
        C41113q c41113q = this.f82465b;
        if (zIsEmpty) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                InterfaceC31145n0 interfaceC31145n0M60480o = m60480o((InterfaceC31145n0) obj);
                Object arrayList2 = linkedHashMap.get(interfaceC31145n0M60480o);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(interfaceC31145n0M60480o, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) ((Map.Entry) it.next()).getValue();
                C18295a c18295a = (C18295a) c41113q.f177224x;
                AbstractC25265s.m74141p0(arrayList3, AbstractC3269g.m9491V(name, collection, arrayList, this.f82488o, c18295a.f71228f, ((C25395l) c18295a.f71243u).f99491d));
            }
            arrayList.addAll(arrayList3);
        } else {
            C18295a c18295a2 = (C18295a) c41113q.f177224x;
            arrayList.addAll(AbstractC3269g.m9491V(name, linkedHashSet, arrayList, this.f82488o, c18295a2.f71228f, ((C25395l) c18295a2.f71243u).f99491d));
        }
        if (this.f82487n.f163232a.isEnum() && name.equals(AbstractC27742n.f111877b)) {
            AbstractC34756j.m109751a(arrayList, AbstractC39373p.m125573g(c21513i));
        }
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final InterfaceC31126h getContributedClassifier(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        return null;
    }

    @Override // ja3.AbstractC21500a0
    /* JADX INFO: renamed from: h */
    public final Set mo60473h(C22704g kindFilter) {
        AbstractC22676k.m65750j(kindFilter, "kindFilter");
        Set setM74101H1 = AbstractC25265s.m74101H1(((InterfaceC21503c) this.f82468e.invoke()).mo60461c());
        C21517m c21517m = C21517m.f82530E;
        C21513i c21513i = this.f82488o;
        AbstractC32306h.m100561i(AbstractC37056f.m118958J(c21513i), C21502b0.f82477w, new C21504c0(c21513i, setM74101H1, c21517m));
        if (this.f82487n.f163232a.isEnum()) {
            setM74101H1.add(AbstractC27742n.f111877b);
        }
        return setM74101H1;
    }

    @Override // ja3.AbstractC21500a0
    /* JADX INFO: renamed from: j */
    public final InterfaceC31135k mo60475j() {
        return this.f82488o;
    }
}
