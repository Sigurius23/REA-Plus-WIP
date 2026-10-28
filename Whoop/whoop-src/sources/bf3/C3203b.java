package bf3;

import af3.AbstractC0844t;
import af3.C0831g;
import cf3.AbstractC4545a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kr.C22786e;
import p012ab.C0684i0;
import pg3.C29205p;
import xe3.C38244g;
import xe3.C38248k;
import ye3.C39481a;
import ye3.C39482b;
import ye3.C39483c;
import ye3.C39484d;
import ye3.C39485e;
import ye3.C39486f;

/* JADX INFO: renamed from: bf3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C3203b {

    /* JADX INFO: renamed from: a */
    public final ArrayList f12554a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f12555b;

    /* JADX INFO: renamed from: c */
    public final C22786e f12556c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f12557d;

    /* JADX INFO: renamed from: e */
    public final int f12558e;

    public C3203b(C0684i0 c0684i0) {
        ArrayList arrayList = (ArrayList) c0684i0.f2446y;
        LinkedHashSet linkedHashSet = (LinkedHashSet) c0684i0.f2443F;
        LinkedHashSet linkedHashSet2 = C38244g.f163963r;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList2.add(C38244g.f163964s.get((Class) it.next()));
        }
        this.f12554a = arrayList2;
        this.f12556c = new C22786e(16);
        this.f12557d = (ArrayList) c0684i0.f2442E;
        ArrayList arrayList3 = (ArrayList) c0684i0.f2447z;
        this.f12555b = arrayList3;
        this.f12558e = c0684i0.f2445x;
        new LinkedHashMap();
        HashMap map = new HashMap();
        C38248k.m122583b(Arrays.asList(new C39481a('*'), new C39481a('_')), map);
        C38248k.m122583b(arrayList3, map);
        HashMap map2 = new HashMap();
        map2.put('\\', Collections.singletonList(new C39483c()));
        map2.put('`', Collections.singletonList(new C39484d()));
        map2.put('&', Collections.singletonList(new C39485e()));
        map2.put('<', Arrays.asList(new C39482b(), new C39486f()));
        Set setKeySet = map.keySet();
        Set setKeySet2 = map2.keySet();
        BitSet bitSet = new BitSet();
        Iterator it3 = setKeySet.iterator();
        while (it3.hasNext()) {
            bitSet.set(((Character) it3.next()).charValue());
        }
        Iterator it4 = setKeySet2.iterator();
        while (it4.hasNext()) {
            bitSet.set(((Character) it4.next()).charValue());
        }
        bitSet.set(91);
        bitSet.set(93);
        bitSet.set(33);
        bitSet.set(10);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0844t m9251a(String str) {
        if (str == null) {
            throw new NullPointerException("input must not be null");
        }
        C38244g c38244g = new C38244g(this.f12554a, this.f12556c, this.f12555b, this.f12558e);
        int i13 = 0;
        while (true) {
            int length = str.length();
            int i14 = i13;
            while (true) {
                if (i14 >= length) {
                    i14 = -1;
                    break;
                }
                char cCharAt = str.charAt(i14);
                if (cCharAt == '\n' || cCharAt == '\r') {
                    break;
                }
                i14++;
            }
            if (i14 == -1) {
                break;
            }
            c38244g.m122579i(str.substring(i13, i14));
            i13 = i14 + 1;
            if (i13 < str.length() && str.charAt(i14) == '\r' && str.charAt(i13) == '\n') {
                i13 = i14 + 2;
            }
        }
        if (str.length() > 0 && (i13 == 0 || i13 < str.length())) {
            c38244g.m122579i(str.substring(i13));
        }
        c38244g.m122576f(c38244g.f163980p.size());
        C29205p c29205p = new C29205p(c38244g.f163976l, c38244g.f163979o, false, 13);
        c38244g.f163975k.getClass();
        C38248k c38248k = new C38248k(c29205p);
        Iterator it = c38244g.f163981q.iterator();
        while (it.hasNext()) {
            ((AbstractC4545a) it.next()).mo14228h(c38248k);
        }
        AbstractC0844t abstractC0844tMo9252a = (C0831g) c38244g.f163978n.f163960b;
        Iterator it3 = this.f12557d.iterator();
        while (it3.hasNext()) {
            abstractC0844tMo9252a = ((InterfaceC3204c) it3.next()).mo9252a(abstractC0844tMo9252a);
        }
        return abstractC0844tMo9252a;
    }
}
