package p009a8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import td3.AbstractC33721a;
import td3.AbstractC33729i;
import td3.C33735o;

/* JADX INFO: renamed from: a8.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C0534d {

    /* JADX INFO: renamed from: a */
    public final HashSet f1848a;

    public C0534d(int i13) {
        switch (i13) {
            case 1:
                this.f1848a = new HashSet();
                break;
            case 2:
                this.f1848a = new HashSet();
                break;
            default:
                this.f1848a = new HashSet();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public AbstractC33721a m1302a(AbstractC33729i abstractC33729i) {
        HashSet<AbstractC33721a> hashSet = this.f1848a;
        for (AbstractC33721a abstractC33721a : hashSet) {
            AbstractC33729i abstractC33729i2 = abstractC33721a.f141045h;
            if (abstractC33729i2 == abstractC33729i) {
                return abstractC33721a;
            }
            if ((abstractC33729i2 instanceof C33735o) && ((AbstractC33729i) ((C33735o) abstractC33729i2).f141115a.get()) == abstractC33729i) {
                hashSet.remove(abstractC33721a);
                return abstractC33721a;
            }
        }
        LinkedList linkedList = new LinkedList();
        for (AbstractC33721a abstractC33721a2 : hashSet) {
            AbstractC33729i abstractC33729i3 = abstractC33721a2.f141045h;
            if ((abstractC33729i3 instanceof C33735o) && ((C33735o) abstractC33729i3).f141115a.get() == null) {
                linkedList.add(abstractC33721a2);
            }
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            hashSet.remove((AbstractC33721a) it.next());
        }
        return null;
    }
}
