package androidx.fragment.app;

import android.os.Bundle;
import ih0.AbstractC18489d0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: androidx.fragment.app.n1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1325n1 implements InterfaceC1313k1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5685a;

    /* JADX INFO: renamed from: b */
    public final String f5686b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC1329o1 f5687c;

    public /* synthetic */ C1325n1(AbstractC1329o1 abstractC1329o1, String str, int i13) {
        this.f5685a = i13;
        this.f5687c = abstractC1329o1;
        this.f5686b = str;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ba  */
    @Override // androidx.fragment.app.InterfaceC1313k1
    /* JADX INFO: renamed from: a */
    public final boolean mo4041a(ArrayList arrayList, ArrayList arrayList2) throws Throwable {
        int i13;
        Iterator it;
        int i14;
        switch (this.f5685a) {
            case 0:
                AbstractC1329o1 abstractC1329o1 = this.f5687c;
                C1279c c1279c = (C1279c) abstractC1329o1.f5726l.remove(this.f5686b);
                boolean z4 = false;
                if (c1279c != null) {
                    HashMap map = new HashMap();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        C1271a c1271a = (C1271a) it3.next();
                        if (c1271a.f5521w) {
                            Iterator it4 = c1271a.f5563c.iterator();
                            while (it4.hasNext()) {
                                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = ((C1278b2) it4.next()).f5548b;
                                if (abstractComponentCallbacksC1320m0 != null) {
                                    map.put(abstractComponentCallbacksC1320m0.mWho, abstractComponentCallbacksC1320m0);
                                }
                            }
                        }
                    }
                    ArrayList<String> arrayList3 = c1279c.f5556w;
                    HashMap map2 = new HashMap(arrayList3.size());
                    for (String str : arrayList3) {
                        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m1 = (AbstractComponentCallbacksC1320m0) map.get(str);
                        if (abstractComponentCallbacksC1320m1 != null) {
                            map2.put(abstractComponentCallbacksC1320m1.mWho, abstractComponentCallbacksC1320m1);
                        } else {
                            Bundle bundleM4062i = abstractC1329o1.f5717c.m4062i(null, str);
                            if (bundleM4062i != null) {
                                ClassLoader classLoader = abstractC1329o1.f5738x.f5827x.getClassLoader();
                                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4244b = ((C1360x1) bundleM4062i.getParcelable("state")).m4244b(abstractC1329o1.m4143J(), classLoader);
                                abstractComponentCallbacksC1320m0M4244b.mSavedFragmentState = bundleM4062i;
                                if (bundleM4062i.getBundle("savedInstanceState") == null) {
                                    abstractComponentCallbacksC1320m0M4244b.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
                                }
                                Bundle bundle = bundleM4062i.getBundle("arguments");
                                if (bundle != null) {
                                    bundle.setClassLoader(classLoader);
                                }
                                abstractComponentCallbacksC1320m0M4244b.setArguments(bundle);
                                map2.put(abstractComponentCallbacksC1320m0M4244b.mWho, abstractComponentCallbacksC1320m0M4244b);
                            }
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (C1275b c1275b : c1279c.f5557x) {
                        ArrayList arrayList5 = c1275b.f5540x;
                        C1271a c1271a2 = new C1271a(abstractC1329o1);
                        c1275b.m4063b(c1271a2);
                        for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                            String str2 = (String) arrayList5.get(i15);
                            if (str2 != null) {
                                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m2 = (AbstractComponentCallbacksC1320m0) map2.get(str2);
                                if (abstractComponentCallbacksC1320m2 == null) {
                                    throw new IllegalStateException(AbstractC11266d.m30464r(new StringBuilder("Restoring FragmentTransaction "), c1275b.f5530F, " failed due to missing saved state for Fragment (", str2, ")"));
                                }
                                ((C1278b2) c1271a2.f5563c.get(i15)).f5548b = abstractComponentCallbacksC1320m2;
                            }
                        }
                        arrayList4.add(c1271a2);
                    }
                    Iterator it5 = arrayList4.iterator();
                    while (it5.hasNext()) {
                        ((C1271a) it5.next()).mo4041a(arrayList, arrayList2);
                        z4 = true;
                    }
                }
                return z4;
            default:
                AbstractC1329o1 abstractC1329o2 = this.f5687c;
                String str3 = this.f5686b;
                int iM4138C = abstractC1329o2.m4138C(-1, str3, true);
                if (iM4138C < 0) {
                    return false;
                }
                int i16 = iM4138C;
                while (true) {
                    Throwable th3 = null;
                    if (i16 >= abstractC1329o2.f5718d.size()) {
                        HashSet hashSet = new HashSet();
                        int i17 = iM4138C;
                        while (i17 < abstractC1329o2.f5718d.size()) {
                            C1271a c1271a3 = (C1271a) abstractC1329o2.f5718d.get(i17);
                            HashSet hashSet2 = new HashSet();
                            HashSet hashSet3 = new HashSet();
                            Iterator it6 = c1271a3.f5563c.iterator();
                            while (it6.hasNext()) {
                                C1278b2 c1278b2 = (C1278b2) it6.next();
                                th3 = th3;
                                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m3 = c1278b2.f5548b;
                                if (abstractComponentCallbacksC1320m3 != null) {
                                    if (c1278b2.f5549c) {
                                        i13 = i17;
                                        int i18 = c1278b2.f5547a;
                                        it = it6;
                                        if (i18 == 1 || i18 == 2 || i18 == 8) {
                                        }
                                        i14 = c1278b2.f5547a;
                                        if (i14 != 1 || i14 == 2) {
                                            hashSet3.add(abstractComponentCallbacksC1320m3);
                                        }
                                        i17 = i13;
                                        it6 = it;
                                    } else {
                                        i13 = i17;
                                        it = it6;
                                    }
                                    hashSet.add(abstractComponentCallbacksC1320m3);
                                    hashSet2.add(abstractComponentCallbacksC1320m3);
                                    i14 = c1278b2.f5547a;
                                    if (i14 != 1) {
                                        hashSet3.add(abstractComponentCallbacksC1320m3);
                                    } else {
                                        hashSet3.add(abstractComponentCallbacksC1320m3);
                                    }
                                    i17 = i13;
                                    it6 = it;
                                }
                            }
                            int i19 = i17;
                            Throwable th4 = th3;
                            hashSet2.removeAll(hashSet3);
                            if (!hashSet2.isEmpty()) {
                                StringBuilder sbM53375p = AbstractC18489d0.m53375p("saveBackStack(\"", str3, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                                sbM53375p.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                                sbM53375p.append(" in ");
                                sbM53375p.append(c1271a3);
                                sbM53375p.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                                abstractC1329o2.m4179l0(new IllegalArgumentException(sbM53375p.toString()));
                                throw th4;
                            }
                            i17 = i19 + 1;
                            th3 = th4;
                        }
                        Throwable th5 = th3;
                        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
                        while (!arrayDeque.isEmpty()) {
                            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m4 = (AbstractComponentCallbacksC1320m0) arrayDeque.removeFirst();
                            if (abstractComponentCallbacksC1320m4.mRetainInstance) {
                                StringBuilder sbM53375p2 = AbstractC18489d0.m53375p("saveBackStack(\"", str3, "\") must not contain retained fragments. Found ");
                                sbM53375p2.append(hashSet.contains(abstractComponentCallbacksC1320m4) ? "direct reference to retained " : "retained child ");
                                sbM53375p2.append("fragment ");
                                sbM53375p2.append(abstractComponentCallbacksC1320m4);
                                abstractC1329o2.m4179l0(new IllegalArgumentException(sbM53375p2.toString()));
                                throw th5;
                            }
                            for (AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m5 : abstractComponentCallbacksC1320m4.mChildFragmentManager.f5717c.m4058e()) {
                                if (abstractComponentCallbacksC1320m5 != null) {
                                    arrayDeque.addLast(abstractComponentCallbacksC1320m5);
                                }
                            }
                        }
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it7 = hashSet.iterator();
                        while (it7.hasNext()) {
                            arrayList6.add(((AbstractComponentCallbacksC1320m0) it7.next()).mWho);
                        }
                        ArrayList arrayList7 = new ArrayList(abstractC1329o2.f5718d.size() - iM4138C);
                        for (int i24 = iM4138C; i24 < abstractC1329o2.f5718d.size(); i24++) {
                            arrayList7.add(th5);
                        }
                        C1279c c1279c2 = new C1279c(arrayList6, arrayList7);
                        for (int size = abstractC1329o2.f5718d.size() - 1; size >= iM4138C; size--) {
                            C1271a c1271a4 = (C1271a) abstractC1329o2.f5718d.remove(size);
                            C1271a c1271a5 = new C1271a(c1271a4);
                            c1271a5.m4045i();
                            arrayList7.set(size - iM4138C, new C1275b(c1271a5));
                            c1271a4.f5521w = true;
                            arrayList.add(c1271a4);
                            arrayList2.add(Boolean.TRUE);
                        }
                        abstractC1329o2.f5726l.put(str3, c1279c2);
                        return true;
                    }
                    C1271a c1271a6 = (C1271a) abstractC1329o2.f5718d.get(i16);
                    if (!c1271a6.f5578r) {
                        abstractC1329o2.m4179l0(new IllegalArgumentException("saveBackStack(\"" + str3 + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + c1271a6 + " that did not use setReorderingAllowed(true)."));
                        throw null;
                    }
                    i16++;
                }
                break;
        }
    }
}
