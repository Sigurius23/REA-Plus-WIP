package x30;

import b30.C2570m;
import b33.C2681b;
import b33.C2684e;
import b33.EnumC2686g;
import ec3.C13045h2;
import ec3.C13081r1;
import ec3.InterfaceC13062m;
import g53.AbstractC15508m;
import g53.C15498c;
import g53.C15499d;
import g53.C15501f;
import io.sentry.internal.debugmeta.C20378c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p088dc.AbstractC11895b;
import p695zx.C41180b;
import pg3.C29205p;
import q83.InterfaceC30057d;
import t23.C33366b4;
import t23.C33403i3;
import t23.InterfaceC33408j3;
import y00.C38783b;
import y23.AbstractC39168a;
import z23.C40031a;
import z23.C40033c;

/* JADX INFO: renamed from: x30.h0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37893h0 implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f162251w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f162252x;

    public /* synthetic */ C37893h0(Object obj, int i13) {
        this.f162251w = i13;
        this.f162252x = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f162251w) {
            case 0:
                C41180b c41180b = (C41180b) obj;
                C37917p0 c37917p0 = (C37917p0) this.f162252x;
                C38783b c38783b = (C38783b) AbstractC25265s.m74100H0(c41180b.f177689a);
                if (c38783b != null) {
                    int i13 = c38783b.f166933x;
                    C13045h2 c13045h2 = c37917p0.f162356k;
                    Integer num = new Integer(i13);
                    c13045h2.getClass();
                    c13045h2.m36571k(null, num);
                }
                List list = c41180b.f177690b;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C38783b) it.next()).f166934y.f166885x);
                }
                List listM74159y0 = AbstractC25265s.m74159y0(arrayList);
                C13045h2 c13045h3 = c37917p0.f162361p;
                c13045h3.getClass();
                c13045h3.m36571k(null, listM74159y0);
                break;
            default:
                AbstractC15508m abstractC15508m = (AbstractC15508m) obj;
                InterfaceC33408j3.f139483t.getClass();
                InterfaceC33408j3 interfaceC33408j3 = C33403i3.f139477b;
                if ((interfaceC33408j3 != null ? ((C33366b4) interfaceC33408j3).m105800r() : null) != null) {
                    if (abstractC15508m instanceof C15499d) {
                        if (AbstractC39168a.f168406a[((C15499d) abstractC15508m).f58170b.ordinal()] == 1) {
                            C29205p c29205p = (C29205p) ((C2570m) this.f162252x).f9989z;
                            String strM31995n = AbstractC11895b.m31995n("toString(...)");
                            C13045h2 c13045h4 = (C13045h2) c29205p.f118204x;
                            c13045h4.getClass();
                            c13045h4.m36571k(null, strM31995n);
                            C2570m c2570m = (C2570m) this.f162252x;
                            C13045h2 c13045h5 = (C13045h2) c2570m.f9985F;
                            C40033c c40033c = (C40033c) c2570m.f9988y;
                            String strM31995n2 = AbstractC11895b.m31995n("toString(...)");
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            ConcurrentHashMap concurrentHashMap = c40033c.f172742d;
                            String str = (String) ((C13081r1) c40033c.f172740b.f118205y).f45200w.getValue();
                            C2684e c2684e = C2684e.f10567w;
                            concurrentHashMap.put(strM31995n2, new C2681b(jCurrentTimeMillis, strM31995n2, str));
                            c40033c.f172739a.m927P(C40031a.m128361a(c40033c.f172741c, null, null, c2684e, EnumC2686g.INITIATED, strM31995n2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388579));
                            c13045h5.getClass();
                            c13045h5.m36571k(null, strM31995n2);
                        }
                    } else if (abstractC15508m instanceof C15498c) {
                        if (((CharSequence) ((C13045h2) ((C2570m) this.f162252x).f9985F).getValue()).length() > 0) {
                            C2570m c2570m2 = (C2570m) this.f162252x;
                            C40033c.m128364c((C40033c) c2570m2.f9988y, (String) ((C13045h2) c2570m2.f9985F).getValue(), true, new Integer(C20378c.f76419E));
                            C13045h2 c13045h6 = (C13045h2) ((C2570m) this.f162252x).f9985F;
                            c13045h6.getClass();
                            c13045h6.m36571k(null, "");
                        }
                    } else if ((abstractC15508m instanceof C15501f) && ((CharSequence) ((C13045h2) ((C2570m) this.f162252x).f9985F).getValue()).length() > 0) {
                        C2570m c2570m3 = (C2570m) this.f162252x;
                        C40033c.m128364c((C40033c) c2570m3.f9988y, (String) ((C13045h2) c2570m3.f9985F).getValue(), false, new Integer(C20378c.f76419E));
                        C13045h2 c13045h7 = (C13045h2) ((C2570m) this.f162252x).f9985F;
                        c13045h7.getClass();
                        c13045h7.m36571k(null, "");
                    }
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
