package xb3;

import androidx.room.C1815o0;
import c93.InterfaceC4339a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import m83.C25235a0;
import m83.C25262p;
import m83.C25264r;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import v63.AbstractC35745c;
import va3.AbstractC35854l;
import vb1.C35868a;
import wb3.AbstractC37056f;
import x83.C38091h;
import xa0.C38136a;

/* JADX INFO: renamed from: xb3.k */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC38176k extends AbstractC35745c {
    /* JADX INFO: renamed from: A */
    public static C38184s m122272A(InterfaceC38174i interfaceC38174i, Function1 transform) {
        AbstractC22676k.m65750j(interfaceC38174i, "<this>");
        AbstractC22676k.m65750j(transform, "transform");
        return new C38184s(interfaceC38174i, transform);
    }

    /* JADX INFO: renamed from: B */
    public static C38171f m122273B(InterfaceC38174i interfaceC38174i, Function1 function1) {
        return new C38171f(new C38184s(interfaceC38174i, function1), false, new C35868a(16));
    }

    /* JADX INFO: renamed from: C */
    public static C38180o m122274C(InterfaceC38174i interfaceC38174i, Comparator comparator) {
        AbstractC22676k.m65750j(comparator, "comparator");
        return new C38180o(interfaceC38174i, comparator, 0);
    }

    /* JADX INFO: renamed from: D */
    public static InterfaceC38174i m122275D(InterfaceC38174i interfaceC38174i, int i13) {
        AbstractC22676k.m65750j(interfaceC38174i, "<this>");
        if (i13 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8296i(i13, "Requested element count ", " is less than zero.").toString());
        }
        if (i13 == 0) {
            return C38169d.f163464a;
        }
        return interfaceC38174i instanceof InterfaceC38168c ? ((InterfaceC38168c) interfaceC38174i).mo122266b(i13) : new C38182q(interfaceC38174i, i13);
    }

    /* JADX INFO: renamed from: E */
    public static List m122276E(InterfaceC38174i interfaceC38174i) {
        AbstractC22676k.m65750j(interfaceC38174i, "<this>");
        Iterator it = interfaceC38174i.iterator();
        if (!it.hasNext()) {
            return C25271y.f99162w;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC37056f.m118958J(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: F */
    public static Set m122277F(InterfaceC38174i interfaceC38174i) {
        AbstractC22676k.m65750j(interfaceC38174i, "<this>");
        Iterator it = interfaceC38174i.iterator();
        if (!it.hasNext()) {
            return C25235a0.f99113w;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC12350b.m34570S(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: n */
    public static InterfaceC38174i m122278n(Iterator it) {
        AbstractC22676k.m65750j(it, "<this>");
        return new C38166a(new C25264r(it, 3));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0024 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x0026 A[RETURN] */
    /* JADX INFO: renamed from: o */
    public static boolean m122279o(InterfaceC38174i interfaceC38174i, String str) {
        int i13 = 0;
        for (Object obj : interfaceC38174i) {
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            if (AbstractC22676k.m65745e(str, obj)) {
                if (i13 >= 0) {
                    return true;
                }
                return false;
            }
            i13++;
        }
        i13 = -1;
        if (i13 >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public static int m122280p(InterfaceC38174i interfaceC38174i) {
        Iterator it = interfaceC38174i.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            it.next();
            i13++;
            if (i13 < 0) {
                AbstractC37056f.m118976c0();
                throw null;
            }
        }
        return i13;
    }

    /* JADX INFO: renamed from: q */
    public static InterfaceC38174i m122281q(InterfaceC38174i interfaceC38174i, int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8296i(i13, "Requested element count ", " is less than zero.").toString());
        }
        if (i13 == 0) {
            return interfaceC38174i;
        }
        return interfaceC38174i instanceof InterfaceC38168c ? ((InterfaceC38168c) interfaceC38174i).mo122265a(i13) : new C38167b(interfaceC38174i, i13);
    }

    /* JADX INFO: renamed from: r */
    public static C38171f m122282r(InterfaceC38174i interfaceC38174i, Function1 predicate) {
        AbstractC22676k.m65750j(predicate, "predicate");
        return new C38171f(interfaceC38174i, true, predicate);
    }

    /* JADX INFO: renamed from: s */
    public static Object m122283s(InterfaceC38174i interfaceC38174i) {
        Iterator it = interfaceC38174i.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static C38172g m122284t(InterfaceC38174i interfaceC38174i, Function1 transform) {
        AbstractC22676k.m65750j(transform, "transform");
        return new C38172g(interfaceC38174i, transform, C38179n.f163485w);
    }

    /* JADX INFO: renamed from: u */
    public static C38172g m122285u(InterfaceC38174i interfaceC38174i, Function1 transform) {
        AbstractC22676k.m65750j(transform, "transform");
        return new C38172g(interfaceC38174i, transform, C38178m.f163484w);
    }

    /* JADX INFO: renamed from: v */
    public static final C38172g m122286v(InterfaceC38174i interfaceC38174i, Function1 function1) {
        if (!(interfaceC38174i instanceof C38184s)) {
            return new C38172g(interfaceC38174i, new C38136a(4), function1);
        }
        C38184s c38184s = (C38184s) interfaceC38174i;
        return new C38172g(c38184s.f163498a, c38184s.f163499b, function1);
    }

    /* JADX INFO: renamed from: w */
    public static InterfaceC38174i m122287w(InterfaceC4339a interfaceC4339a) {
        return new C38166a(new C38091h(interfaceC4339a, new C1815o0(interfaceC4339a, 4)));
    }

    /* JADX INFO: renamed from: x */
    public static InterfaceC38174i m122288x(Object obj, Function1 nextFunction) {
        AbstractC22676k.m65750j(nextFunction, "nextFunction");
        return obj == null ? C38169d.f163464a : new C38091h(new C25262p(obj, 18), nextFunction);
    }

    /* JADX INFO: renamed from: y */
    public static String m122289y(InterfaceC38174i interfaceC38174i, String str, String str2, Function1 function1, int i13) {
        if ((i13 & 1) != 0) {
            str = ", ";
        }
        if ((i13 & 2) != 0) {
            str2 = "";
        }
        if ((i13 & 32) != 0) {
            function1 = null;
        }
        AbstractC22676k.m65750j(interfaceC38174i, "<this>");
        StringBuilder sb4 = new StringBuilder();
        sb4.append((CharSequence) str2);
        int i14 = 0;
        for (Object obj : interfaceC38174i) {
            i14++;
            if (i14 > 1) {
                sb4.append((CharSequence) str);
            }
            AbstractC35854l.m113828h(sb4, obj, function1);
        }
        sb4.append((CharSequence) "");
        return sb4.toString();
    }

    /* JADX INFO: renamed from: z */
    public static Object m122290z(InterfaceC38174i interfaceC38174i) {
        Iterator it = interfaceC38174i.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }
}
