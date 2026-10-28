package ya3;

import bd3.C3119e0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import jb3.C21561u;
import lb3.AbstractC23811y;
import m83.AbstractC25265s;
import m83.C25271y;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22704g;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import r93.AbstractC31150q;
import r93.EnumC31106a0;
import r93.InterfaceC31108b;
import r93.InterfaceC31109b0;
import r93.InterfaceC31111c;
import r93.InterfaceC31117e;
import r93.InterfaceC31124g0;
import r93.InterfaceC31126h;
import r93.InterfaceC31135k;
import r93.InterfaceC31163w0;
import ub3.AbstractC34756j;
import ub3.C34754h;
import va3.C35850h;
import z93.EnumC40212c;

/* JADX INFO: renamed from: ya3.r */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC39375r {

    /* JADX INFO: renamed from: a */
    public static final C3119e0 f169428a = new C3119e0("StdlibClassFinder");

    /* JADX INFO: renamed from: a */
    public static Collection m125580a(InterfaceC31117e interfaceC31117e) {
        if (interfaceC31117e.mo60498k() != EnumC31106a0.f128311y) {
            return C25271y.f99162w;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        InterfaceC31135k interfaceC31135kMo60581g = interfaceC31117e.mo60581g();
        if (interfaceC31135kMo60581g instanceof InterfaceC31124g0) {
            m125581b(interfaceC31117e, linkedHashSet, ((InterfaceC31124g0) interfaceC31135kMo60581g).mo52852u(), false);
        }
        InterfaceC22712o interfaceC22712oMo60487H = interfaceC31117e.mo60487H();
        AbstractC22676k.m65749i(interfaceC22712oMo60487H, "getUnsubstitutedInnerClassesScope(...)");
        m125581b(interfaceC31117e, linkedHashSet, interfaceC22712oMo60487H, true);
        return AbstractC25265s.m74152u1(linkedHashSet, new C39358a());
    }

    /* JADX INFO: renamed from: b */
    public static final void m125581b(InterfaceC31117e interfaceC31117e, LinkedHashSet linkedHashSet, InterfaceC22712o interfaceC22712o, boolean z4) {
        for (InterfaceC31135k interfaceC31135k : AbstractC12350b.m34599t(interfaceC22712o, C22704g.f89365o, 2)) {
            if (interfaceC31135k instanceof InterfaceC31117e) {
                InterfaceC31117e interfaceC31117eM60589J0 = (InterfaceC31117e) interfaceC31135k;
                if (interfaceC31117eM60589J0.mo60493U()) {
                    C35850h name = interfaceC31117eM60589J0.getName();
                    AbstractC22676k.m65749i(name, "getName(...)");
                    InterfaceC31126h contributedClassifier = interfaceC22712o.getContributedClassifier(name, EnumC40212c.f173640z);
                    interfaceC31117eM60589J0 = contributedClassifier instanceof InterfaceC31117e ? (InterfaceC31117e) contributedClassifier : contributedClassifier instanceof InterfaceC31163w0 ? ((C21561u) ((InterfaceC31163w0) contributedClassifier)).m60589J0() : null;
                }
                if (interfaceC31117eM60589J0 != null) {
                    int i13 = AbstractC39363f.f169413a;
                    Iterator it = interfaceC31117eM60589J0.mo60496e().getSupertypes().iterator();
                    while (it.hasNext()) {
                        if (AbstractC39363f.m125532n((AbstractC23811y) it.next(), interfaceC31117e.mo78660a())) {
                            linkedHashSet.add(interfaceC31117eM60589J0);
                            break;
                        }
                    }
                    if (z4) {
                        InterfaceC22712o interfaceC22712oMo60487H = interfaceC31117eM60589J0.mo60487H();
                        AbstractC22676k.m65749i(interfaceC22712oMo60487H, "getUnsubstitutedInnerClassesScope(...)");
                        m125581b(interfaceC31117e, linkedHashSet, interfaceC22712oMo60487H, z4);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC31111c m125582c(LinkedList linkedList) {
        Integer numM95874b;
        linkedList.isEmpty();
        Iterator it = linkedList.iterator();
        InterfaceC31111c interfaceC31111c = null;
        while (it.hasNext()) {
            InterfaceC31111c interfaceC31111c2 = (InterfaceC31111c) it.next();
            if (interfaceC31111c == null || ((numM95874b = AbstractC31150q.m95874b(interfaceC31111c.getVisibility(), interfaceC31111c2.getVisibility())) != null && numM95874b.intValue() < 0)) {
                interfaceC31111c = interfaceC31111c2;
            }
        }
        AbstractC22676k.m65747g(interfaceC31111c);
        return interfaceC31111c;
    }

    /* JADX INFO: renamed from: d */
    public static final C39359b m125583d(InterfaceC31109b0 interfaceC31109b0) {
        AbstractC22676k.m65750j(interfaceC31109b0, "<this>");
        C39359b c39359b = (C39359b) interfaceC31109b0.mo78665r(f169428a);
        return c39359b == null ? C39359b.f169409a : c39359b;
    }

    /* JADX INFO: renamed from: e */
    public static final Collection m125584e(Collection collection, Function1 function1) {
        AbstractC22676k.m65750j(collection, "<this>");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        int i13 = C34754h.f146410y;
        C34754h c34754hM109753c = AbstractC34756j.m109753c();
        while (!linkedList.isEmpty()) {
            Object objM74096F0 = AbstractC25265s.m74096F0(linkedList);
            int i14 = C34754h.f146410y;
            C34754h c34754hM109753c2 = AbstractC34756j.m109753c();
            ArrayList arrayListM125555g = C39371n.m125555g(objM74096F0, linkedList, function1, new C39372o(c34754hM109753c2, 0));
            if (arrayListM125555g.size() == 1 && c34754hM109753c2.isEmpty()) {
                Object objM74140o1 = AbstractC25265s.m74140o1(arrayListM125555g);
                AbstractC22676k.m65749i(objM74140o1, "single(...)");
                c34754hM109753c.add(objM74140o1);
            } else {
                Object objM125563s = C39371n.m125563s(arrayListM125555g, function1);
                InterfaceC31108b interfaceC31108b = (InterfaceC31108b) function1.invoke(objM125563s);
                for (Object obj : arrayListM125555g) {
                    AbstractC22676k.m65747g(obj);
                    if (!C39371n.m125558k(interfaceC31108b, (InterfaceC31108b) function1.invoke(obj))) {
                        c34754hM109753c2.add(obj);
                    }
                }
                if (!c34754hM109753c2.isEmpty()) {
                    c34754hM109753c.addAll(c34754hM109753c2);
                }
                c34754hM109753c.add(objM125563s);
            }
        }
        return c34754hM109753c;
    }
}
