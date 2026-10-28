package j53;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import hc3.C17171d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import l83.C23470p;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import mc3.AbstractC25438d;
import mc3.C25437c;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import t23.C33368c0;
import t23.C33392g2;

/* JADX INFO: renamed from: j53.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C21355m {

    /* JADX INFO: renamed from: a */
    public final C33368c0 f81686a;

    /* JADX INFO: renamed from: b */
    public final C13045h2 f81687b;

    /* JADX INFO: renamed from: c */
    public final C13081r1 f81688c;

    /* JADX INFO: renamed from: e */
    public final C13045h2 f81690e;

    /* JADX INFO: renamed from: g */
    public Object f81692g;

    /* JADX INFO: renamed from: h */
    public final C25437c f81693h;

    /* JADX INFO: renamed from: i */
    public final C13045h2 f81694i;

    /* JADX INFO: renamed from: j */
    public final C13045h2 f81695j;

    /* JADX INFO: renamed from: d */
    public final C23470p f81689d = AbstractC1772c1.m5382S(this, "ParticipantSorting");

    /* JADX INFO: renamed from: f */
    public final C13045h2 f81691f = AbstractC13091v.m36593c(null);

    public C21355m(C17171d c17171d, C33368c0 c33368c0, C13045h2 c13045h2, C13081r1 c13081r1, InterfaceC21348f interfaceC21348f) {
        this.f81686a = c33368c0;
        this.f81687b = c13045h2;
        this.f81688c = c13081r1;
        this.f81690e = AbstractC13091v.m36593c(interfaceC21348f);
        InterfaceC30057d interfaceC30057d = null;
        C25271y c25271y = C25271y.f99162w;
        this.f81692g = c25271y;
        this.f81693h = AbstractC25438d.m74669a();
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(c25271y);
        this.f81694i = c13045h2M36593c;
        this.f81695j = c13045h2M36593c;
        AbstractC3006f0.m8732z(c17171d, null, null, new C21352j(this, interfaceC30057d, 0), 3);
        AbstractC3006f0.m8732z(c17171d, null, null, new C21352j(this, interfaceC30057d, 1), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: a */
    public static final Object m59951a(C21355m c21355m, C21353k c21353k, InterfaceC30057d interfaceC30057d) {
        C21354l c21354l;
        C25437c c25437c;
        if (interfaceC30057d instanceof C21354l) {
            c21354l = (C21354l) interfaceC30057d;
            int i13 = c21354l.f81681F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c21354l.f81681F = i13 - Integer.MIN_VALUE;
            } else {
                c21354l = new C21354l(c21355m, interfaceC30057d);
            }
        } else {
            c21354l = new C21354l(c21355m, interfaceC30057d);
        }
        Object obj = c21354l.f81685z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c21354l.f81681F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c25437c = c21355m.f81693h;
            c21354l.f81682w = c21355m;
            c21354l.f81683x = c21353k;
            c21354l.f81684y = c25437c;
            c21354l.f81681F = 1;
            if (c25437c.mo68211b(c21354l) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C25437c c25437c2 = c21354l.f81684y;
            c21353k = c21354l.f81683x;
            C21355m c21355m2 = c21354l.f81682w;
            AbstractC34132o.m107864I(obj);
            c25437c = c25437c2;
            c21355m = c21355m2;
        }
        try {
            Comparator comparatorM59950a = c21353k.f81679d;
            if (comparatorM59950a == null) {
                comparatorM59950a = AbstractC21349g.m59950a(c21353k.f81678c, c21353k.f81677b);
            }
            ?? r10 = c21355m.f81692g;
            C23470p c23470p = c21355m.f81689d;
            List listM74152u1 = AbstractC25265s.m74152u1(m59952b(r10, c21353k.f81676a), comparatorM59950a);
            List list = listM74152u1;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C33392g2) it.next()).f139422a);
            }
            if (arrayList.equals(c21355m.f81692g)) {
                C2345k c2345k = (C2345k) c23470p.getValue();
                InterfaceC2339e interfaceC2339e = c2345k.f9275c;
                String str = c2345k.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    c2345k.f9274b.log(enumC2341g, str, "Sort produced same order, skipping emission", null);
                }
            } else {
                c21355m.f81692g = arrayList;
                C13045h2 c13045h2 = c21355m.f81694i;
                c13045h2.getClass();
                c13045h2.m36571k(null, listM74152u1);
                C2345k c2345k2 = (C2345k) c23470p.getValue();
                InterfaceC2339e interfaceC2339e2 = c2345k2.f9275c;
                String str2 = c2345k2.f9273a;
                EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
                if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                    c2345k2.f9274b.log(enumC2341g2, str2, "Published sorted participants (size=" + listM74152u1.size() + ")", null);
                }
            }
            return C23454a0.f92919a;
        } finally {
            c25437c.mo68214i(null);
        }
    }

    /* JADX INFO: renamed from: b */
    public static List m59952b(List list, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C33392g2 c33392g2 = (C33392g2) map.get(str);
            if (c33392g2 != null) {
                linkedHashMap.put(str, c33392g2);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            C33392g2 c33392g3 = (C33392g2) entry.getValue();
            if (!linkedHashMap.containsKey(str2)) {
                linkedHashMap.put(str2, c33392g3);
            }
        }
        Collection collectionValues = linkedHashMap.values();
        AbstractC22676k.m65749i(collectionValues, "<get-values>(...)");
        return AbstractC25265s.m74093D1(collectionValues);
    }
}
