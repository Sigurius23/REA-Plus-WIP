package p322m7;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import m83.AbstractC25265s;
import p026b2.C2298d;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: m7.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C25169r {

    /* JADX INFO: renamed from: a */
    public final ArrayList f98756a;

    public C25169r(ArrayList arrayList) {
        this.f98756a = arrayList;
        List listM74152u1 = AbstractC25265s.m74152u1(arrayList, new C2298d(19));
        int iM118951C = AbstractC37056f.m118951C(listM74152u1);
        int i13 = 0;
        while (i13 < iM118951C) {
            Instant instant = ((C25167q) listM74152u1.get(i13)).f98743a;
            i13++;
            if (!instant.isBefore(((C25167q) listM74152u1.get(i13)).f98743a)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m73699a(Instant instant, Instant instant2) {
        ArrayList arrayList = this.f98756a;
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            Instant instant3 = ((C25167q) next).f98743a;
            do {
                Object next2 = it.next();
                Instant instant4 = ((C25167q) next2).f98743a;
                if (instant3.compareTo(instant4) > 0) {
                    next = next2;
                    instant3 = instant4;
                }
            } while (it.hasNext());
        }
        Instant instant5 = ((C25167q) next).f98743a;
        Iterator it3 = arrayList.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next3 = it3.next();
        if (it3.hasNext()) {
            Instant instant6 = ((C25167q) next3).f98743a;
            do {
                Object next4 = it3.next();
                Instant instant7 = ((C25167q) next4).f98743a;
                if (instant6.compareTo(instant7) < 0) {
                    next3 = next4;
                    instant6 = instant7;
                }
            } while (it3.hasNext());
        }
        return !instant5.isBefore(instant) && ((C25167q) next3).f98743a.isBefore(instant2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25169r)) {
            return false;
        }
        return this.f98756a.equals(((C25169r) obj).f98756a);
    }

    public final int hashCode() {
        return this.f98756a.hashCode();
    }
}
