package p579wc;

import androidx.room.C1832u;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25262p;
import p474s.C31983m2;
import p484s9.AbstractC32281f;
import p505ts.AbstractC34132o;
import p580wd.C37160m;
import p647yf.AbstractC39497j;
import pf.InterfaceC29123a;
import q83.AbstractC30060g;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import ve.C35920e;
import ve.InterfaceC35918c;
import vg.InterfaceC35967n;

/* JADX INFO: renamed from: wc.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C37105m0 implements InterfaceC35918c {

    /* JADX INFO: renamed from: E */
    public final Object f158730E;

    /* JADX INFO: renamed from: w */
    public final String f158731w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC35967n f158732x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC29123a f158733y;

    /* JADX INFO: renamed from: z */
    public final LinkedHashSet f158734z = new LinkedHashSet();

    public C37105m0(String str, InterfaceC29123a interfaceC29123a, InterfaceC35967n interfaceC35967n) {
        this.f158731w = str;
        this.f158732x = interfaceC35967n;
        this.f158733y = interfaceC29123a;
        this.f158730E = AbstractC25247g0.m73990Y(new C23465k("Environment", new C37101l(new C1832u(1, interfaceC35967n, InterfaceC35967n.class, "getenv", "getenv(Ljava/lang/String;)Ljava/lang/String;", 0, 25))), new C23465k("Ec2InstanceMetadata", new C37116s(AbstractC30060g.m92088H(new C25262p(this, 23)), interfaceC35967n)), new C23465k("EcsContainer", new C37092i(interfaceC35967n, interfaceC29123a)));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0148  */
    /* JADX WARN: Code duplicated, block: B:43:0x0160  */
    /* JADX WARN: Code duplicated, block: B:47:0x0186  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:53:0x01af A[LOOP:0: B:51:0x01a9->B:53:0x01af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, wc.m0] */
    /* JADX WARN: Type inference failed for: r2v14, types: [kotlin.jvm.internal.g0, wd.l] */
    /* JADX WARN: Type inference failed for: r2v15, types: [kotlin.jvm.internal.g0, wd.l] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x01d7 -> B:58:0x01d9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p613xf.InterfaceC38257c
    /* JADX INFO: renamed from: b */
    public final java.lang.Object mo79294b(gf.InterfaceC15761b r18, s83.AbstractC32269c r19) {
        /*
            Method dump skipped, instruction units count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p579wc.C37105m0.mo79294b(gf.b, s83.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Iterator it = this.f158730E.entrySet().iterator();
        while (it.hasNext()) {
            AbstractC39497j.m126157b(((Map.Entry) it.next()).getValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0135, code lost:
    
        if (r2 == r5) goto L47;
     */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m119028h(p470rv.AbstractC31834n r17, p474s.C31983m2 r18, s83.AbstractC32269c r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p579wc.C37105m0.m119028h(rv.n, s.m2, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m119029i(C37160m c37160m, C35920e c35920e, C31983m2 c31983m2, AbstractC32269c abstractC32269c) throws Throwable {
        C37102l0 c37102l0;
        String str;
        C37070a1 c37070a1;
        if (abstractC32269c instanceof C37102l0) {
            c37102l0 = (C37102l0) abstractC32269c;
            int i13 = c37102l0.f158717F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c37102l0.f158717F = i13 - Integer.MIN_VALUE;
            } else {
                c37102l0 = new C37102l0(this, abstractC32269c);
            }
        } else {
            c37102l0 = new C37102l0(this, abstractC32269c);
        }
        Object obj = c37102l0.f158721z;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c37102l0.f158717F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C37070a1 c37070a2 = new C37070a1(c35920e);
            String strM119083b = c37160m.m119083b();
            c37102l0.f158718w = c37160m;
            c37102l0.f158719x = c37070a2;
            c37102l0.f158720y = strM119083b;
            c37102l0.f158717F = 1;
            Object objM99483g = c31983m2.m99483g(c37102l0);
            if (objM99483g == obj2) {
                return obj2;
            }
            str = strM119083b;
            c37070a1 = c37070a2;
            obj = objM99483g;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = c37102l0.f158720y;
            C37070a1 c37070a3 = c37102l0.f158719x;
            C37160m c37160m2 = c37102l0.f158718w;
            AbstractC34132o.m107864I(obj);
            str = str2;
            c37070a1 = c37070a3;
            c37160m = c37160m2;
        }
        return new C37079d1(c37070a1, str, (String) obj, c37160m.m119084c(), c37160m.m119082a(), this.f158733y);
    }

    public final String toString() {
        return AbstractC32281f.m100455w(this);
    }
}
