package rb3;

import d93.InterfaceC11820a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lb3.C23784k0;
import m83.AbstractC25267u;
import p319m4.AbstractC25012a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: rb3.d */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC31196d implements Iterable, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public AbstractC31193a f128521w;

    /* JADX INFO: renamed from: a */
    public static String m96147a(AbstractC31193a abstractC31193a, int i13, String str) {
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Race condition happened, the size of ArrayMap is " + i13 + " but it isn't an `" + str + '`');
        sb4.append('\n');
        StringBuilder sb5 = new StringBuilder("Type: ");
        sb5.append(abstractC31193a.getClass());
        sb4.append(sb5.toString());
        sb4.append('\n');
        StringBuilder sb6 = new StringBuilder();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C23784k0.f94165x.f159040w;
        sb6.append("[\n");
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(abstractC31193a, 10));
        int i14 = 0;
        for (Object obj : abstractC31193a) {
            int i15 = i14 + 1;
            Object obj2 = null;
            if (i14 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            for (Object obj3 : concurrentHashMap.entrySet()) {
                if (((Number) ((Map.Entry) obj3).getValue()).intValue() == i14) {
                    obj2 = obj3;
                    break;
                }
            }
            sb6.append("  " + ((Map.Entry) obj2) + '[' + i14 + "]: " + obj);
            sb6.append('\n');
            arrayList.add(sb6);
            i14 = i15;
        }
        sb4.append("Content: " + AbstractC25012a.m73377j(sb6, "]", '\n'));
        sb4.append('\n');
        return sb4.toString();
    }

    public final boolean isEmpty() {
        return this.f128521w.mo96145a() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f128521w.iterator();
    }
}
