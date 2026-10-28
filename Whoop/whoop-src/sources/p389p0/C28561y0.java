package p389p0;

import android.os.Trace;
import bd3.C3131k0;
import c93.InterfaceC4351m;
import com.iterable.iterableapi.C5377u1;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.List;
import m83.C25271y;
import p002a0.C0057v0;
import p005a3.C0230n0;
import p005a3.C0237p;
import p006a4.AbstractC0354a;
import p031b9.C2817b;
import p268k0.AbstractC22086a;
import p314m.C24849k0;
import p446r1.C30848b;
import p635y2.C39109l0;
import p635y2.C39112m0;
import p635y2.C39115n0;
import p635y2.C39137u1;
import p635y2.InterfaceC39131s1;
import p636y3.C39169a;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.time.Duration;
import p715kotlin.time.TimeSource;

/* JADX INFO: renamed from: p0.y0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28561y0 implements InterfaceC28531j0, InterfaceC28563z0, InterfaceC28533k0 {

    /* JADX INFO: renamed from: a */
    public final int f115548a;

    /* JADX INFO: renamed from: b */
    public final C0237p f115549b;

    /* JADX INFO: renamed from: c */
    public final Function1 f115550c;

    /* JADX INFO: renamed from: d */
    public C39169a f115551d;

    /* JADX INFO: renamed from: e */
    public InterfaceC39131s1 f115552e;

    /* JADX INFO: renamed from: f */
    public boolean f115553f;

    /* JADX INFO: renamed from: g */
    public boolean f115554g;

    /* JADX INFO: renamed from: h */
    public boolean f115555h;

    /* JADX INFO: renamed from: i */
    public Object f115556i;

    /* JADX INFO: renamed from: j */
    public boolean f115557j;

    /* JADX INFO: renamed from: k */
    public C5377u1 f115558k;

    /* JADX INFO: renamed from: l */
    public boolean f115559l;

    /* JADX INFO: renamed from: m */
    public long f115560m;

    /* JADX INFO: renamed from: n */
    public long f115561n;

    /* JADX INFO: renamed from: o */
    public long f115562o = TimeSource.Monotonic.INSTANCE.m134379markNowz9LOYto();

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C2817b f115563p;

    public C28561y0(C2817b c2817b, int i13, C0237p c0237p, Function1 function1) {
        this.f115563p = c2817b;
        this.f115548a = i13;
        this.f115549b = c0237p;
        this.f115550c = function1;
    }

    @Override // p389p0.InterfaceC28531j0
    /* JADX INFO: renamed from: a */
    public final void mo86826a() {
        this.f115559l = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m86889b() {
        InterfaceC39131s1 interfaceC39131s1 = this.f115552e;
        if (interfaceC39131s1 != null) {
            interfaceC39131s1.dispose();
        }
        this.f115552e = null;
        this.f115558k = null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m86890c(C24849k0 c24849k0) {
        boolean zM86891d;
        if (!this.f115563p.f11023x) {
            return false;
        }
        if (this.f115559l) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zM86891d = m86891d(c24849k0);
                Trace.endSection();
            } catch (Throwable th3) {
                Trace.endSection();
                throw th3;
            }
        } else {
            zM86891d = m86891d(c24849k0);
        }
        AbstractC0354a.m959F(-1L, "compose:lazy:prefetch:execute:item");
        return zM86891d;
    }

    @Override // p389p0.InterfaceC28531j0
    public final void cancel() {
        if (this.f115554g) {
            return;
        }
        this.f115554g = true;
        m86889b();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0214 A[Catch: all -> 0x0203, TryCatch #2 {all -> 0x0203, blocks: (B:81:0x01c4, B:83:0x01cc, B:85:0x01d2, B:90:0x01de, B:92:0x01ea, B:94:0x0200, B:93:0x01ed, B:97:0x0205, B:98:0x020c, B:100:0x0214, B:102:0x021e, B:104:0x0222, B:107:0x0229, B:108:0x022b, B:112:0x023b, B:113:0x0241), top: B:171:0x01c4 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x021e A[Catch: all -> 0x0203, TryCatch #2 {all -> 0x0203, blocks: (B:81:0x01c4, B:83:0x01cc, B:85:0x01d2, B:90:0x01de, B:92:0x01ea, B:94:0x0200, B:93:0x01ed, B:97:0x0205, B:98:0x020c, B:100:0x0214, B:102:0x021e, B:104:0x0222, B:107:0x0229, B:108:0x022b, B:112:0x023b, B:113:0x0241), top: B:171:0x01c4 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0222 A[Catch: all -> 0x0203, TryCatch #2 {all -> 0x0203, blocks: (B:81:0x01c4, B:83:0x01cc, B:85:0x01d2, B:90:0x01de, B:92:0x01ea, B:94:0x0200, B:93:0x01ed, B:97:0x0205, B:98:0x020c, B:100:0x0214, B:102:0x021e, B:104:0x0222, B:107:0x0229, B:108:0x022b, B:112:0x023b, B:113:0x0241), top: B:171:0x01c4 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0226  */
    /* JADX WARN: Code duplicated, block: B:107:0x0229 A[Catch: all -> 0x0203, TryCatch #2 {all -> 0x0203, blocks: (B:81:0x01c4, B:83:0x01cc, B:85:0x01d2, B:90:0x01de, B:92:0x01ea, B:94:0x0200, B:93:0x01ed, B:97:0x0205, B:98:0x020c, B:100:0x0214, B:102:0x021e, B:104:0x0222, B:107:0x0229, B:108:0x022b, B:112:0x023b, B:113:0x0241), top: B:171:0x01c4 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x023b A[Catch: all -> 0x0203, LOOP:2: B:98:0x020c->B:112:0x023b, LOOP_END, TRY_ENTER, TryCatch #2 {all -> 0x0203, blocks: (B:81:0x01c4, B:83:0x01cc, B:85:0x01d2, B:90:0x01de, B:92:0x01ea, B:94:0x0200, B:93:0x01ed, B:97:0x0205, B:98:0x020c, B:100:0x0214, B:102:0x021e, B:104:0x0222, B:107:0x0229, B:108:0x022b, B:112:0x023b, B:113:0x0241), top: B:171:0x01c4 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x025d  */
    /* JADX WARN: Code duplicated, block: B:126:0x026b  */
    /* JADX WARN: Code duplicated, block: B:129:0x0274 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x0280  */
    /* JADX WARN: Code duplicated, block: B:136:0x029e  */
    /* JADX WARN: Code duplicated, block: B:143:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:163:0x0307 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:179:0x01da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0156  */
    /* JADX WARN: Code duplicated, block: B:57:0x015a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0160  */
    /* JADX WARN: Code duplicated, block: B:65:0x0176  */
    /* JADX WARN: Code duplicated, block: B:67:0x017a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0190  */
    /* JADX WARN: Code duplicated, block: B:72:0x0198  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ac A[Catch: all -> 0x01b9, TRY_LEAVE, TryCatch #3 {all -> 0x01b9, blocks: (B:74:0x01a2, B:76:0x01ac), top: B:173:0x01a2 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01cc A[Catch: all -> 0x0203, TryCatch #2 {all -> 0x0203, blocks: (B:81:0x01c4, B:83:0x01cc, B:85:0x01d2, B:90:0x01de, B:92:0x01ea, B:94:0x0200, B:93:0x01ed, B:97:0x0205, B:98:0x020c, B:100:0x0214, B:102:0x021e, B:104:0x0222, B:107:0x0229, B:108:0x022b, B:112:0x023b, B:113:0x0241), top: B:171:0x01c4 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01d2 A[Catch: all -> 0x0203, TRY_LEAVE, TryCatch #2 {all -> 0x0203, blocks: (B:81:0x01c4, B:83:0x01cc, B:85:0x01d2, B:90:0x01de, B:92:0x01ea, B:94:0x0200, B:93:0x01ed, B:97:0x0205, B:98:0x020c, B:100:0x0214, B:102:0x021e, B:104:0x0222, B:107:0x0229, B:108:0x022b, B:112:0x023b, B:113:0x0241), top: B:171:0x01c4 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01de A[Catch: all -> 0x0203, TRY_ENTER, TryCatch #2 {all -> 0x0203, blocks: (B:81:0x01c4, B:83:0x01cc, B:85:0x01d2, B:90:0x01de, B:92:0x01ea, B:94:0x0200, B:93:0x01ed, B:97:0x0205, B:98:0x020c, B:100:0x0214, B:102:0x021e, B:104:0x0222, B:107:0x0229, B:108:0x022b, B:112:0x023b, B:113:0x0241), top: B:171:0x01c4 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01ea A[Catch: all -> 0x0203, TryCatch #2 {all -> 0x0203, blocks: (B:81:0x01c4, B:83:0x01cc, B:85:0x01d2, B:90:0x01de, B:92:0x01ea, B:94:0x0200, B:93:0x01ed, B:97:0x0205, B:98:0x020c, B:100:0x0214, B:102:0x021e, B:104:0x0222, B:107:0x0229, B:108:0x022b, B:112:0x023b, B:113:0x0241), top: B:171:0x01c4 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01ed A[Catch: all -> 0x0203, TryCatch #2 {all -> 0x0203, blocks: (B:81:0x01c4, B:83:0x01cc, B:85:0x01d2, B:90:0x01de, B:92:0x01ea, B:94:0x0200, B:93:0x01ed, B:97:0x0205, B:98:0x020c, B:100:0x0214, B:102:0x021e, B:104:0x0222, B:107:0x0229, B:108:0x022b, B:112:0x023b, B:113:0x0241), top: B:171:0x01c4 }] */
    /* JADX INFO: renamed from: d */
    public final boolean m86891d(C24849k0 c24849k0) {
        C5377u1 c5377u1;
        C5377u1 c5377u2;
        C39169a c39169a;
        Function1 function1;
        C5377u1 c5377u3;
        int i13;
        boolean z4;
        List[] listArr;
        int i14;
        List list;
        int size;
        int i15;
        List list2;
        InterfaceC28563z0 interfaceC28563z0;
        C28561y0 c28561y0;
        C28535l0 c28535l0;
        Function1 function2;
        List list3;
        int i16 = this.f115548a;
        long j7 = i16;
        AbstractC0354a.m959F(j7, "compose:lazy:prefetch:execute:item");
        C2817b c2817b = this.f115563p;
        InterfaceC28509b0 interfaceC28509b0 = (InterfaceC28509b0) ((C28506a0) c2817b.f11024y).f115399b.invoke();
        if (!this.f115554g) {
            int itemCount = interfaceC28509b0.getItemCount();
            if (i16 >= 0 && i16 < itemCount) {
                Object objMo77532c = interfaceC28509b0.mo77532c(i16);
                Object obj = this.f115556i;
                if (obj != null && !objMo77532c.equals(obj)) {
                    m86889b();
                    return false;
                }
                Object objMo77530a = interfaceC28509b0.mo77530a(i16);
                C0237p c0237p = this.f115549b;
                C28508b c28508b = (C28508b) c0237p.f814z;
                if (c0237p.f813y != objMo77530a || c28508b == null) {
                    C0057v0 c0057v0 = (C0057v0) c0237p.f812x;
                    Object objM129g = c0057v0.m129g(objMo77530a);
                    Object obj2 = objM129g;
                    if (objM129g == null) {
                        C28508b c28508b2 = new C28508b();
                        c28508b2.f115404d = -1;
                        c0057v0.m135m(objMo77530a, c28508b2);
                        obj2 = c28508b2;
                    }
                    c28508b = (C28508b) obj2;
                    c0237p.f813y = objMo77530a;
                    c0237p.f814z = c28508b;
                }
                m86893f();
                long jM72855a = c24849k0.m72855a();
                this.f115560m = jM72855a;
                this.f115562o = TimeSource.Monotonic.INSTANCE.m134379markNowz9LOYto();
                this.f115561n = 0L;
                AbstractC0354a.m959F(jM72855a, "compose:lazy:prefetch:available_time_nanos");
                if (!m86893f()) {
                    if (m86896i(this.f115560m, c28508b.f115401a)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            if (this.f115552e != null) {
                                AbstractC22086a.m63158a("Request was already composed!");
                            }
                            InterfaceC4351m interfaceC4351mM86818a = ((C28506a0) c2817b.f11024y).m86818a(i16, objMo77532c, objMo77530a);
                            this.f115556i = objMo77532c;
                            C39115n0 c39115n0M124665a = ((C39137u1) c2817b.f11025z).m124665a();
                            C0230n0 c0230n0 = c39115n0M124665a.f168240w;
                            if (c0230n0.m605X()) {
                                c39115n0M124665a.m124643d();
                                if (!c39115n0M124665a.f168230G.m125c(objMo77532c)) {
                                    c39115n0M124665a.f168235L.m133k(objMo77532c);
                                    C0057v0 c0057v1 = c39115n0M124665a.f168233J;
                                    Object objM129g2 = c0057v1.m129g(objMo77532c);
                                    if (objM129g2 == null) {
                                        objM129g2 = c39115n0M124665a.m124647j(objMo77532c);
                                        if (objM129g2 != null) {
                                            int iM94892j = ((C30848b) c0230n0.m639r()).f127226w.m94892j(objM129g2);
                                            int i17 = ((C30848b) c0230n0.m639r()).f127226w.f127229y;
                                            c0230n0.f768P = true;
                                            c0230n0.m624i0(iM94892j, i17, 1);
                                            c0230n0.f768P = false;
                                            c39115n0M124665a.f168238O++;
                                        } else {
                                            int i18 = ((C30848b) c0230n0.m639r()).f127226w.f127229y;
                                            C0230n0 c0230n1 = new C0230n0(2);
                                            c0230n0.f768P = true;
                                            c0230n0.m597O(i18, c0230n1);
                                            c0230n0.f768P = false;
                                            c39115n0M124665a.f168238O++;
                                            objM129g2 = c0230n1;
                                        }
                                        c0057v1.m135m(objMo77532c, objM129g2);
                                    }
                                    c39115n0M124665a.m124646i((C0230n0) objM129g2, objMo77532c, false, interfaceC4351mM86818a);
                                }
                            }
                            this.f115552e = !c0230n0.m605X() ? new C39109l0() : new C39112m0(c39115n0M124665a, objMo77532c);
                            this.f115555h = true;
                            Trace.endSection();
                            m86897j();
                            c28508b.f115401a = C28508b.m86820a(this.f115561n, c28508b.f115401a);
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    }
                    if (m86893f()) {
                        if (this.f115557j) {
                            c5377u1 = this.f115558k;
                            if (c5377u1 != null) {
                                i13 = c28508b.f115404d;
                                z4 = this.f115559l;
                                listArr = (List[]) c5377u1.f21848e;
                                i14 = c5377u1.f21844a;
                                list = (List) c5377u1.f21847d;
                                if (i14 < list.size()) {
                                    if (((C28561y0) c5377u1.f21849f).f115554g) {
                                        AbstractC22086a.m63160c("Should not execute nested prefetch on canceled request");
                                    }
                                    Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                                    size = list.size();
                                    for (i15 = 0; i15 < size; i15++) {
                                        ((C28535l0) list.get(i15)).f115450d = i13;
                                    }
                                    Trace.endSection();
                                    Trace.beginSection("compose:lazy:prefetch:nested");
                                    while (c5377u1.f21844a < list.size()) {
                                        if (listArr[c5377u1.f21844a] == null) {
                                            if (c24849k0.m72855a() <= 0) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            int i19 = c5377u1.f21844a;
                                            c28535l0 = (C28535l0) list.get(i19);
                                            function2 = c28535l0.f115447a;
                                            if (function2 == null) {
                                                list3 = C25271y.f99162w;
                                            } else {
                                                C28529i0 c28529i0 = new C28529i0(c28535l0, c28535l0.f115450d);
                                                function2.invoke(c28529i0);
                                                ArrayList arrayList = c28529i0.f115440b;
                                                c28535l0.f115452f = arrayList.size();
                                                list3 = arrayList;
                                            }
                                            listArr[i19] = list3;
                                        }
                                        list2 = listArr[c5377u1.f21844a];
                                        AbstractC22676k.m65747g(list2);
                                        while (c5377u1.f21845b < list2.size()) {
                                            interfaceC28563z0 = (InterfaceC28563z0) list2.get(c5377u1.f21845b);
                                            if (z4) {
                                                if (interfaceC28563z0 instanceof C28561y0) {
                                                    c28561y0 = (C28561y0) interfaceC28563z0;
                                                } else {
                                                    c28561y0 = null;
                                                }
                                                if (c28561y0 != null) {
                                                    c28561y0.f115559l = true;
                                                }
                                            }
                                            c5377u1.f21846c = true;
                                            if (((C28561y0) interfaceC28563z0).m86890c(c24849k0)) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            c5377u1.f21845b++;
                                        }
                                        c5377u1.f21845b = 0;
                                        c5377u1.f21844a++;
                                    }
                                    Trace.endSection();
                                }
                            }
                            c5377u2 = this.f115558k;
                            if (c5377u2 != null) {
                                m86897j();
                                AbstractC0354a.m959F(j7, "compose:lazy:prefetch:execute:item");
                                c5377u3 = this.f115558k;
                                if (c5377u3 != null) {
                                    c5377u3.f21846c = false;
                                }
                            }
                            c39169a = this.f115551d;
                            if (!this.f115553f) {
                                if (m86896i(this.f115560m, c28508b.f115403c)) {
                                    Trace.beginSection("compose:lazy:prefetch:measure");
                                    m86894g(c39169a.f168407a);
                                    Trace.endSection();
                                    m86897j();
                                    c28508b.f115403c = C28508b.m86820a(this.f115561n, c28508b.f115403c);
                                    function1 = this.f115550c;
                                    if (function1 != null) {
                                        function1.invoke(this);
                                    }
                                }
                            }
                            C5377u1 c5377u4 = this.f115558k;
                            if (this.f115553f) {
                                return false;
                            }
                            return false;
                        }
                        if (this.f115560m > 0) {
                            Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                            this.f115558k = m86895h();
                            this.f115557j = true;
                            Trace.endSection();
                            c5377u1 = this.f115558k;
                            if (c5377u1 != null) {
                                i13 = c28508b.f115404d;
                                z4 = this.f115559l;
                                listArr = (List[]) c5377u1.f21848e;
                                i14 = c5377u1.f21844a;
                                list = (List) c5377u1.f21847d;
                                if (i14 < list.size()) {
                                    if (((C28561y0) c5377u1.f21849f).f115554g) {
                                        AbstractC22086a.m63160c("Should not execute nested prefetch on canceled request");
                                    }
                                    Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                                    size = list.size();
                                    while (i15 < size) {
                                        ((C28535l0) list.get(i15)).f115450d = i13;
                                    }
                                    Trace.endSection();
                                    Trace.beginSection("compose:lazy:prefetch:nested");
                                    while (c5377u1.f21844a < list.size()) {
                                        if (listArr[c5377u1.f21844a] == null) {
                                            if (c24849k0.m72855a() <= 0) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            int i110 = c5377u1.f21844a;
                                            c28535l0 = (C28535l0) list.get(i110);
                                            function2 = c28535l0.f115447a;
                                            if (function2 == null) {
                                                list3 = C25271y.f99162w;
                                            } else {
                                                C28529i0 c28529i1 = new C28529i0(c28535l0, c28535l0.f115450d);
                                                function2.invoke(c28529i1);
                                                ArrayList arrayList2 = c28529i1.f115440b;
                                                c28535l0.f115452f = arrayList2.size();
                                                list3 = arrayList2;
                                            }
                                            listArr[i110] = list3;
                                        }
                                        list2 = listArr[c5377u1.f21844a];
                                        AbstractC22676k.m65747g(list2);
                                        while (c5377u1.f21845b < list2.size()) {
                                            interfaceC28563z0 = (InterfaceC28563z0) list2.get(c5377u1.f21845b);
                                            if (z4) {
                                                if (interfaceC28563z0 instanceof C28561y0) {
                                                    c28561y0 = (C28561y0) interfaceC28563z0;
                                                } else {
                                                    c28561y0 = null;
                                                }
                                                if (c28561y0 != null) {
                                                    c28561y0.f115559l = true;
                                                }
                                            }
                                            c5377u1.f21846c = true;
                                            if (((C28561y0) interfaceC28563z0).m86890c(c24849k0)) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            c5377u1.f21845b++;
                                        }
                                        c5377u1.f21845b = 0;
                                        c5377u1.f21844a++;
                                    }
                                    Trace.endSection();
                                }
                            }
                            c5377u2 = this.f115558k;
                            if (c5377u2 != null) {
                                m86897j();
                                AbstractC0354a.m959F(j7, "compose:lazy:prefetch:execute:item");
                                c5377u3 = this.f115558k;
                                if (c5377u3 != null) {
                                    c5377u3.f21846c = false;
                                }
                            }
                            c39169a = this.f115551d;
                            if (!this.f115553f) {
                                if (m86896i(this.f115560m, c28508b.f115403c)) {
                                    Trace.beginSection("compose:lazy:prefetch:measure");
                                    m86894g(c39169a.f168407a);
                                    Trace.endSection();
                                    m86897j();
                                    c28508b.f115403c = C28508b.m86820a(this.f115561n, c28508b.f115403c);
                                    function1 = this.f115550c;
                                    if (function1 != null) {
                                        function1.invoke(this);
                                    }
                                }
                            }
                            C5377u1 c5377u5 = this.f115558k;
                            if (this.f115553f) {
                                return false;
                            }
                            return false;
                        }
                    }
                } else {
                    if (this.f115557j) {
                        c5377u1 = this.f115558k;
                        if (c5377u1 != null) {
                            i13 = c28508b.f115404d;
                            z4 = this.f115559l;
                            listArr = (List[]) c5377u1.f21848e;
                            i14 = c5377u1.f21844a;
                            list = (List) c5377u1.f21847d;
                            if (i14 < list.size()) {
                                if (((C28561y0) c5377u1.f21849f).f115554g) {
                                    AbstractC22086a.m63160c("Should not execute nested prefetch on canceled request");
                                }
                                Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                                try {
                                    size = list.size();
                                    while (i15 < size) {
                                        ((C28535l0) list.get(i15)).f115450d = i13;
                                    }
                                    Trace.endSection();
                                    Trace.beginSection("compose:lazy:prefetch:nested");
                                    while (c5377u1.f21844a < list.size()) {
                                        try {
                                            if (listArr[c5377u1.f21844a] == null) {
                                                if (c24849k0.m72855a() <= 0) {
                                                    Trace.endSection();
                                                    return true;
                                                }
                                                int i111 = c5377u1.f21844a;
                                                c28535l0 = (C28535l0) list.get(i111);
                                                function2 = c28535l0.f115447a;
                                                if (function2 == null) {
                                                    list3 = C25271y.f99162w;
                                                } else {
                                                    C28529i0 c28529i2 = new C28529i0(c28535l0, c28535l0.f115450d);
                                                    function2.invoke(c28529i2);
                                                    ArrayList arrayList3 = c28529i2.f115440b;
                                                    c28535l0.f115452f = arrayList3.size();
                                                    list3 = arrayList3;
                                                }
                                                listArr[i111] = list3;
                                            }
                                            list2 = listArr[c5377u1.f21844a];
                                            AbstractC22676k.m65747g(list2);
                                            while (c5377u1.f21845b < list2.size()) {
                                                interfaceC28563z0 = (InterfaceC28563z0) list2.get(c5377u1.f21845b);
                                                if (z4) {
                                                    if (interfaceC28563z0 instanceof C28561y0) {
                                                        c28561y0 = (C28561y0) interfaceC28563z0;
                                                    } else {
                                                        c28561y0 = null;
                                                    }
                                                    if (c28561y0 != null) {
                                                        c28561y0.f115559l = true;
                                                    }
                                                }
                                                c5377u1.f21846c = true;
                                                if (((C28561y0) interfaceC28563z0).m86890c(c24849k0)) {
                                                    Trace.endSection();
                                                    return true;
                                                }
                                                c5377u1.f21845b++;
                                            }
                                            c5377u1.f21845b = 0;
                                            c5377u1.f21844a++;
                                        } catch (Throwable th4) {
                                            Trace.endSection();
                                            throw th4;
                                        }
                                    }
                                    Trace.endSection();
                                } catch (Throwable th5) {
                                    Trace.endSection();
                                    throw th5;
                                }
                            }
                        }
                        c5377u2 = this.f115558k;
                        if (c5377u2 != null && c5377u2.f21846c) {
                            m86897j();
                            AbstractC0354a.m959F(j7, "compose:lazy:prefetch:execute:item");
                            c5377u3 = this.f115558k;
                            if (c5377u3 != null) {
                                c5377u3.f21846c = false;
                            }
                        }
                        c39169a = this.f115551d;
                        if (!this.f115553f && c39169a != null) {
                            if (m86896i(this.f115560m, c28508b.f115403c)) {
                                Trace.beginSection("compose:lazy:prefetch:measure");
                                try {
                                    m86894g(c39169a.f168407a);
                                    Trace.endSection();
                                    m86897j();
                                    c28508b.f115403c = C28508b.m86820a(this.f115561n, c28508b.f115403c);
                                    function1 = this.f115550c;
                                    if (function1 != null) {
                                        function1.invoke(this);
                                    }
                                } catch (Throwable th6) {
                                    Trace.endSection();
                                    throw th6;
                                }
                            }
                        }
                        C5377u1 c5377u6 = this.f115558k;
                        if (this.f115553f || !this.f115557j || c5377u6 == null) {
                            return false;
                        }
                        List list4 = (List) c5377u6.f21847d;
                        List list5 = list4;
                        int size2 = list5.size();
                        int iMin = Integer.MAX_VALUE;
                        for (int i24 = 0; i24 < size2; i24++) {
                            iMin = Math.min(iMin, ((C28535l0) list4.get(i24)).f115451e);
                        }
                        if (iMin == Integer.MAX_VALUE) {
                            iMin = 0;
                        }
                        int i25 = c28508b.f115404d;
                        c28508b.f115404d = i25 == -1 ? iMin : ((i25 * 3) + iMin) / 4;
                        int size3 = list5.size();
                        int iMin2 = Integer.MAX_VALUE;
                        for (int i26 = 0; i26 < size3; i26++) {
                            iMin2 = Math.min(iMin2, ((C28535l0) list4.get(i26)).f115452f);
                        }
                        if (iMin2 == Integer.MAX_VALUE) {
                            iMin2 = 0;
                        }
                        if (iMin2 >= iMin) {
                            return false;
                        }
                        c28508b.f115403c = 0L;
                        return false;
                    }
                    if (this.f115560m > 0) {
                        Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                        try {
                            this.f115558k = m86895h();
                            this.f115557j = true;
                            Trace.endSection();
                            c5377u1 = this.f115558k;
                            if (c5377u1 != null) {
                                i13 = c28508b.f115404d;
                                z4 = this.f115559l;
                                listArr = (List[]) c5377u1.f21848e;
                                i14 = c5377u1.f21844a;
                                list = (List) c5377u1.f21847d;
                                if (i14 < list.size()) {
                                    if (((C28561y0) c5377u1.f21849f).f115554g) {
                                        AbstractC22086a.m63160c("Should not execute nested prefetch on canceled request");
                                    }
                                    Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                                    size = list.size();
                                    while (i15 < size) {
                                        ((C28535l0) list.get(i15)).f115450d = i13;
                                    }
                                    Trace.endSection();
                                    Trace.beginSection("compose:lazy:prefetch:nested");
                                    while (c5377u1.f21844a < list.size()) {
                                        if (listArr[c5377u1.f21844a] == null) {
                                            if (c24849k0.m72855a() <= 0) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            int i112 = c5377u1.f21844a;
                                            c28535l0 = (C28535l0) list.get(i112);
                                            function2 = c28535l0.f115447a;
                                            if (function2 == null) {
                                                list3 = C25271y.f99162w;
                                            } else {
                                                C28529i0 c28529i3 = new C28529i0(c28535l0, c28535l0.f115450d);
                                                function2.invoke(c28529i3);
                                                ArrayList arrayList4 = c28529i3.f115440b;
                                                c28535l0.f115452f = arrayList4.size();
                                                list3 = arrayList4;
                                            }
                                            listArr[i112] = list3;
                                        }
                                        list2 = listArr[c5377u1.f21844a];
                                        AbstractC22676k.m65747g(list2);
                                        while (c5377u1.f21845b < list2.size()) {
                                            interfaceC28563z0 = (InterfaceC28563z0) list2.get(c5377u1.f21845b);
                                            if (z4) {
                                                if (interfaceC28563z0 instanceof C28561y0) {
                                                    c28561y0 = (C28561y0) interfaceC28563z0;
                                                } else {
                                                    c28561y0 = null;
                                                }
                                                if (c28561y0 != null) {
                                                    c28561y0.f115559l = true;
                                                }
                                            }
                                            c5377u1.f21846c = true;
                                            if (((C28561y0) interfaceC28563z0).m86890c(c24849k0)) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            c5377u1.f21845b++;
                                        }
                                        c5377u1.f21845b = 0;
                                        c5377u1.f21844a++;
                                    }
                                    Trace.endSection();
                                }
                            }
                            c5377u2 = this.f115558k;
                            if (c5377u2 != null) {
                                m86897j();
                                AbstractC0354a.m959F(j7, "compose:lazy:prefetch:execute:item");
                                c5377u3 = this.f115558k;
                                if (c5377u3 != null) {
                                    c5377u3.f21846c = false;
                                }
                            }
                            c39169a = this.f115551d;
                            if (!this.f115553f) {
                                if (m86896i(this.f115560m, c28508b.f115403c)) {
                                    Trace.beginSection("compose:lazy:prefetch:measure");
                                    m86894g(c39169a.f168407a);
                                    Trace.endSection();
                                    m86897j();
                                    c28508b.f115403c = C28508b.m86820a(this.f115561n, c28508b.f115403c);
                                    function1 = this.f115550c;
                                    if (function1 != null) {
                                        function1.invoke(this);
                                    }
                                }
                            }
                            C5377u1 c5377u7 = this.f115558k;
                            if (this.f115553f) {
                                return false;
                            }
                            return false;
                        } catch (Throwable th7) {
                            Trace.endSection();
                            throw th7;
                        }
                    }
                }
                return true;
            }
        }
        m86889b();
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final long m86892e(int i13) {
        InterfaceC39131s1 interfaceC39131s1 = this.f115552e;
        if (interfaceC39131s1 != null) {
            return interfaceC39131s1.mo124637a(i13);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m86893f() {
        return this.f115555h;
    }

    /* JADX INFO: renamed from: g */
    public final void m86894g(long j7) {
        if (this.f115554g) {
            AbstractC22086a.m63158a("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if (this.f115553f) {
            AbstractC22086a.m63158a("Request was already measured!");
        }
        this.f115553f = true;
        InterfaceC39131s1 interfaceC39131s1 = this.f115552e;
        if (interfaceC39131s1 == null) {
            AbstractC22086a.m63159b("performComposition() must be called before performMeasure()");
            throw new KotlinNothingValueException();
        }
        int iMo124638b = interfaceC39131s1.mo124638b();
        for (int i13 = 0; i13 < iMo124638b; i13++) {
            interfaceC39131s1.mo124640d(i13, j7);
        }
    }

    /* JADX INFO: renamed from: h */
    public final C5377u1 m86895h() {
        InterfaceC39131s1 interfaceC39131s1 = this.f115552e;
        if (interfaceC39131s1 == null) {
            AbstractC22086a.m63159b("Should precompose before resolving nested prefetch states");
            throw new KotlinNothingValueException();
        }
        C22669g0 c22669g0 = new C22669g0();
        interfaceC39131s1.mo124639c(new C3131k0(c22669g0, 7));
        List list = (List) c22669g0.f89336w;
        if (list != null) {
            return new C5377u1(this, list);
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m86896i(long j7, long j13) {
        if (this.f115559l) {
            j13 = 0;
        }
        return j7 > j13;
    }

    /* JADX INFO: renamed from: j */
    public final void m86897j() {
        long jM134379markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m134379markNowz9LOYto();
        long jM134275getInWholeNanosecondsimpl = Duration.m134275getInWholeNanosecondsimpl(TimeSource.Monotonic.ValueTimeMark.m134390minus6eNON_k(jM134379markNowz9LOYto, this.f115562o));
        this.f115561n = jM134275getInWholeNanosecondsimpl;
        long j7 = this.f115560m - jM134275getInWholeNanosecondsimpl;
        this.f115560m = j7;
        this.f115562o = jM134379markNowz9LOYto;
        AbstractC0354a.m959F(j7, "compose:lazy:prefetch:available_time_nanos");
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("HandleAndRequestImpl { index = ");
        sb4.append(this.f115548a);
        sb4.append(", constraints = ");
        sb4.append(this.f115551d);
        sb4.append(", isComposed = ");
        sb4.append(m86893f());
        sb4.append(", isMeasured = ");
        sb4.append(this.f115553f);
        sb4.append(", isCanceled = ");
        return AbstractC18489d0.m53372m(sb4, this.f115554g, " }");
    }
}
