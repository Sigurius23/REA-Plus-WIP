package p581we;

import androidx.room.C1832u;
import bd3.C3130k;
import cg.C4552g;
import cg.C4554i;
import cg.C4555j;
import cg.C4566u;
import cg.C4567v;
import cg.C4569x;
import com.mapbox.common.HttpHeaders;
import hg3.AbstractC17269i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p441qx.C30706d0;
import p715kotlin.jvm.internal.AbstractC22676k;
import tg.C33770b;
import tg.C33775g;
import tg.InterfaceC33773e;
import wd3.C37168b;
import yb3.AbstractC39414r;
import yb3.C39412p;

/* JADX INFO: renamed from: we.m */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC37197m {

    /* JADX INFO: renamed from: a */
    public static final Set f159033a = AbstractC25260n.m74059b1(new String[]{"expect", "sec-websocket-key", "sec-websocket-protocol", "sec-websocket-version", HttpHeaders.USER_AGENT, "x-amzn-trace-id", "connection", "keep-alive", "proxy-authenticate", "proxy-authorization", "te", "trailers", "transfer-encoding", "upgrade"});

    /* JADX INFO: renamed from: b */
    public static final C39412p f159034b = new C39412p(" +");

    /* JADX INFO: renamed from: a */
    public static final String m119192a(C4555j c4555j, C37187g c37187g) {
        AbstractC22676k.m65750j(c4555j, "<this>");
        C3130k c3130k = c4555j.f18357z;
        ArrayList arrayList = (ArrayList) c3130k.f12277c;
        C37168b c37168b = c37187g.f159009h ? new C37168b(2) : new C37168b(3);
        int i13 = C4569x.f18385c;
        ArrayList arrayList2 = new ArrayList();
        C4566u c4566u = C4566u.f18382w;
        C33775g c33775g = C33775g.f141359i;
        AbstractC17269i.m48914s(arrayList2, c4566u, new C1832u(1, c33775g, InterfaceC33773e.class, "encodableFromDecoded", "encodableFromDecoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", 0, 6));
        AbstractC17269i.m48914s(arrayList2, C4567v.f18383w, new C1832u(1, c33775g, InterfaceC33773e.class, "encodableFromEncoded", "encodableFromEncoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", 0, 7));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(c37168b.invoke(it.next()));
        }
        boolean z4 = c3130k.f12276b;
        if (c37187g.f159010i) {
            ListIterator listIterator = arrayList2.listIterator();
            while (listIterator.hasNext()) {
                String str = ((C33770b) listIterator.next()).f141348a;
                int iHashCode = str.hashCode();
                if (iHashCode != 0) {
                    if (iHashCode != 46) {
                        if (iHashCode == 1472 && str.equals("..")) {
                            listIterator.remove();
                            if (!listIterator.hasPrevious()) {
                                throw new IllegalStateException("Cannot normalize because \"..\" has no parent");
                            }
                            listIterator.previous();
                            listIterator.remove();
                        }
                    } else if (str.equals(".")) {
                        listIterator.remove();
                    }
                } else if (str.equals("")) {
                    listIterator.remove();
                }
            }
            z4 = arrayList2.isEmpty() ? true : z4;
        }
        return new C4569x(AbstractC25265s.m74093D1(arrayList2), z4).toString();
    }

    /* JADX INFO: renamed from: b */
    public static final String m119193b(C4555j c4555j) {
        AbstractC22676k.m65750j(c4555j, "<this>");
        int i13 = C4554i.f18348y;
        C4552g c4552g = new C4552g();
        Set<Map.Entry> setEntrySet = c4555j.f18351E.f18343w.entrySet();
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(setEntrySet, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Map.Entry entry : setEntrySet) {
            C33770b c33770b = (C33770b) entry.getKey();
            List list = (List) entry.getValue();
            C33775g newEncoding = C33775g.f141364n;
            c33770b.getClass();
            AbstractC22676k.m65750j(newEncoding, "newEncoding");
            C33770b c33770bM106778c = newEncoding.m106778c(c33770b.f141348a);
            List<C33770b> list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            for (C33770b c33770b2 : list2) {
                C33775g newEncoding2 = C33775g.f141364n;
                c33770b2.getClass();
                AbstractC22676k.m65750j(newEncoding2, "newEncoding");
                arrayList.add(newEncoding2.m106778c(c33770b2.f141348a));
            }
            linkedHashMap.put(c33770bM106778c, arrayList);
        }
        for (Map.Entry entry2 : AbstractC25265s.m74152u1(linkedHashMap.entrySet(), new C30706d0(5))) {
            c4552g.put(entry2.getKey(), (Object) AbstractC25265s.m74097F1(AbstractC25265s.m74152u1((List) entry2.getValue(), new C30706d0(6))));
        }
        return AbstractC39414r.m125898q0(c4552g.m14233b().toString(), "?");
    }
}
