package nf3;

import hf3.C17239a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.koin.core.error.DefinitionOverrideException;
import p249jc.AbstractC21598x;
import p474s.C31983m2;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qf3.C30330b;
import rf3.AbstractC31363b;
import tf3.C33768a;
import wf3.C37247a;

/* JADX INFO: renamed from: nf3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C26669a {

    /* JADX INFO: renamed from: a */
    public final C37247a f106046a = new C37247a(this);

    /* JADX INFO: renamed from: b */
    public final C31983m2 f106047b;

    /* JADX INFO: renamed from: c */
    public AbstractC30060g f106048c;

    public C26669a() {
        C31983m2 c31983m2 = new C31983m2();
        c31983m2.f132768w = this;
        c31983m2.f132769x = new ConcurrentHashMap();
        c31983m2.f132770y = new HashSet();
        this.f106047b = c31983m2;
        new ConcurrentHashMap();
        this.f106048c = new C17239a(1);
    }

    /* JADX INFO: renamed from: a */
    public final void m79357a(List list, boolean z4) throws DefinitionOverrideException {
        C31983m2 c31983m2 = this.f106047b;
        c31983m2.getClass();
        List<C33768a> list2 = list;
        for (C33768a c33768a : list2) {
            for (Map.Entry entry : c33768a.f141344b.entrySet()) {
                String mapping = (String) entry.getKey();
                AbstractC31363b factory = (AbstractC31363b) entry.getValue();
                C26669a c26669a = (C26669a) c31983m2.f132768w;
                AbstractC22676k.m65750j(mapping, "mapping");
                AbstractC22676k.m65750j(factory, "factory");
                C30330b c30330b = factory.f129023a;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c31983m2.f132769x;
                if (concurrentHashMap.containsKey(mapping)) {
                    if (!z4) {
                        AbstractC21598x.m60680g0(factory, mapping);
                        throw null;
                    }
                    c26669a.f106048c.m92136C("Override Mapping '" + mapping + "' with " + c30330b);
                }
                if (c26669a.f106048c.m92137D(1)) {
                    c26669a.f106048c.m92139r("add mapping '" + mapping + "' for " + c30330b);
                }
                concurrentHashMap.put(mapping, factory);
            }
            ((HashSet) c31983m2.f132770y).addAll(c33768a.f141343a);
        }
        C37247a c37247a = this.f106046a;
        c37247a.getClass();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            c37247a.f159362b.addAll(((C33768a) it.next()).f141345c);
        }
    }
}
