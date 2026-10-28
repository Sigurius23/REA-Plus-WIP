package o93;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.C35845c;
import va3.C35847e;

/* JADX INFO: renamed from: o93.d */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC27732d {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashSet f111783a;

    static {
        Set<EnumC27738j> set = EnumC27738j.f111796E;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(set, 10));
        for (EnumC27738j primitiveType : set) {
            AbstractC22676k.m65750j(primitiveType, "primitiveType");
            arrayList.add(AbstractC27742n.f111886k.m113788a(primitiveType.f111806w));
        }
        ArrayList<C35847e> arrayListM74128f1 = AbstractC25265s.m74128f1(AbstractC27741m.f111859j.m113798i(), AbstractC25265s.m74128f1(AbstractC27741m.f111857h.m113798i(), AbstractC25265s.m74128f1(AbstractC27741m.f111853f.m113798i(), arrayList)));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C35847e topLevelFqName : arrayListM74128f1) {
            AbstractC22676k.m65750j(topLevelFqName, "topLevelFqName");
            linkedHashSet.add(new C35845c(topLevelFqName.m113789b(), topLevelFqName.f152613a.m113796g()));
        }
        f111783a = linkedHashSet;
    }
}
