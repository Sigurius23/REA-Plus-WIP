package ga3;

import ab3.C0710b;
import ab3.C0717i;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import o93.AbstractC27741m;
import p715kotlin.jvm.internal.AbstractC22676k;
import s93.EnumC32313o;
import s93.EnumC32314p;
import va3.C35845c;
import va3.C35847e;
import va3.C35850h;
import x93.C38127s;

/* JADX INFO: renamed from: ga3.e */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15627e {

    /* JADX INFO: renamed from: a */
    public static final Object f58661a = AbstractC25247g0.m73990Y(new C23465k("PACKAGE", EnumSet.noneOf(EnumC32314p.class)), new C23465k("TYPE", EnumSet.of(EnumC32314p.CLASS, EnumC32314p.FILE)), new C23465k("ANNOTATION_TYPE", EnumSet.of(EnumC32314p.ANNOTATION_CLASS)), new C23465k("TYPE_PARAMETER", EnumSet.of(EnumC32314p.TYPE_PARAMETER)), new C23465k("FIELD", EnumSet.of(EnumC32314p.FIELD)), new C23465k("LOCAL_VARIABLE", EnumSet.of(EnumC32314p.LOCAL_VARIABLE)), new C23465k("PARAMETER", EnumSet.of(EnumC32314p.VALUE_PARAMETER)), new C23465k("CONSTRUCTOR", EnumSet.of(EnumC32314p.CONSTRUCTOR)), new C23465k("METHOD", EnumSet.of(EnumC32314p.FUNCTION, EnumC32314p.PROPERTY_GETTER, EnumC32314p.PROPERTY_SETTER)), new C23465k("TYPE_USE", EnumSet.of(EnumC32314p.TYPE)));

    /* JADX INFO: renamed from: b */
    public static final Object f58662b = AbstractC25247g0.m73990Y(new C23465k("RUNTIME", EnumC32313o.f133694w), new C23465k("CLASS", EnumC32313o.f133695x), new C23465k("SOURCE", EnumC32313o.f133696y));

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public static C0710b m43956a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C38127s) {
                arrayList.add(obj);
            }
        }
        ArrayList<EnumC32314p> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) f58661a.get(C35850h.m113814e(((C38127s) it.next()).f163237b.name()).m113817b());
            if (iterable == null) {
                iterable = C25235a0.f99113w;
            }
            AbstractC25265s.m74141p0(arrayList2, iterable);
        }
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
        for (EnumC32314p enumC32314p : arrayList2) {
            C35847e topLevelFqName = AbstractC27741m.f111870u;
            AbstractC22676k.m65750j(topLevelFqName, "topLevelFqName");
            arrayList3.add(new C0717i(new C35845c(topLevelFqName.m113789b(), topLevelFqName.f152613a.m113796g()), C35850h.m113814e(enumC32314p.name())));
        }
        return new C0710b(arrayList3, C15626d.f58660w);
    }
}
