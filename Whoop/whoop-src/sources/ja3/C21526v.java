package ja3;

import androidx.lifecycle.C1591h2;
import ce3.C4515p;
import ia3.C18295a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kb3.C22339h;
import kb3.C22342k;
import kb3.InterfaceC22345n;
import m83.C25235a0;
import m83.C25271y;
import p692zt.C41113q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22704g;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22709l;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import r93.InterfaceC31135k;
import va3.AbstractC35852j;
import va3.C35850h;
import x93.C38122n;
import x93.C38132x;
import z93.InterfaceC40210a;

/* JADX INFO: renamed from: ja3.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C21526v extends AbstractC21508e0 {

    /* JADX INFO: renamed from: n */
    public final C38132x f82561n;

    /* JADX INFO: renamed from: o */
    public final C21521q f82562o;

    /* JADX INFO: renamed from: p */
    public final C22339h f82563p;

    /* JADX INFO: renamed from: q */
    public final C1591h2 f82564q;

    public C21526v(C41113q c41113q, C38132x c38132x, C21521q c21521q) {
        super(c41113q, null);
        this.f82561n = c38132x;
        this.f82562o = c21521q;
        InterfaceC22345n interfaceC22345n = ((C18295a) c41113q.f177224x).f71223a;
        C4515p c4515p = new C4515p(c41113q, this, false, 4);
        C22342k c22342k = (C22342k) interfaceC22345n;
        c22342k.getClass();
        this.f82563p = new C22339h(c22342k, c4515p);
        this.f82564q = ((C22342k) interfaceC22345n).m64224c(new C21516l(1, this, c41113q));
    }

    @Override // ja3.AbstractC21500a0
    /* JADX INFO: renamed from: a */
    public final Set mo60467a(C22704g kindFilter, Function1 function1) {
        AbstractC22676k.m65750j(kindFilter, "kindFilter");
        if (!kindFilter.m65789a(C22704g.f89355e)) {
            return C25235a0.f99113w;
        }
        Set set = (Set) this.f82563p.invoke();
        if (set == null) {
            this.f82561n.getClass();
            return new LinkedHashSet();
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(C35850h.m113814e((String) it.next()));
        }
        return hashSet;
    }

    @Override // ja3.AbstractC21500a0
    /* JADX INFO: renamed from: b */
    public final Set mo60468b(C22704g kindFilter, C22709l c22709l) {
        AbstractC22676k.m65750j(kindFilter, "kindFilter");
        return C25235a0.f99113w;
    }

    @Override // ja3.AbstractC21500a0
    /* JADX INFO: renamed from: d */
    public final InterfaceC21503c mo60470d() {
        return C21501b.f82476a;
    }

    @Override // ja3.AbstractC21500a0
    /* JADX INFO: renamed from: f */
    public final void mo60471f(LinkedHashSet linkedHashSet, C35850h name) {
        AbstractC22676k.m65750j(name, "name");
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final InterfaceC31126h getContributedClassifier(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        return m60520o(name, null);
    }

    @Override // ja3.AbstractC21500a0, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final Collection getContributedDescriptors(C22704g kindFilter, Function1 function1) {
        AbstractC22676k.m65750j(kindFilter, "kindFilter");
        if (!kindFilter.m65789a(C22704g.f89362l | C22704g.f89355e)) {
            return C25271y.f99162w;
        }
        Iterable iterable = (Iterable) this.f82467d.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            InterfaceC31135k interfaceC31135k = (InterfaceC31135k) obj;
            if (interfaceC31135k instanceof InterfaceC31117e) {
                C35850h name = ((InterfaceC31117e) interfaceC31135k).getName();
                AbstractC22676k.m65749i(name, "getName(...)");
                if (((Boolean) function1.invoke(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // ja3.AbstractC21500a0, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Collection getContributedVariables(C35850h name, InterfaceC40210a interfaceC40210a) {
        AbstractC22676k.m65750j(name, "name");
        return C25271y.f99162w;
    }

    @Override // ja3.AbstractC21500a0
    /* JADX INFO: renamed from: h */
    public final Set mo60473h(C22704g kindFilter) {
        AbstractC22676k.m65750j(kindFilter, "kindFilter");
        return C25235a0.f99113w;
    }

    @Override // ja3.AbstractC21500a0
    /* JADX INFO: renamed from: j */
    public final InterfaceC31135k mo60475j() {
        return this.f82562o;
    }

    /* JADX INFO: renamed from: o */
    public final InterfaceC31117e m60520o(C35850h name, C38122n c38122n) {
        C35850h c35850h = AbstractC35852j.f152624a;
        AbstractC22676k.m65750j(name, "name");
        String strM113817b = name.m113817b();
        AbstractC22676k.m65749i(strM113817b, "asString(...)");
        if (strM113817b.length() <= 0 || name.f152621x) {
            return null;
        }
        Set set = (Set) this.f82563p.invoke();
        if (c38122n == null && set != null && !set.contains(name.m113817b())) {
            return null;
        }
        return (InterfaceC31117e) this.f82564q.invoke(new C21522r(name, c38122n));
    }
}
