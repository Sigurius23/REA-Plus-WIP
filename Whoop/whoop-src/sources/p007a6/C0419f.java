package p007a6;

import android.view.View;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import dc3.InterfaceC11927l;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import p027b3.C2435r3;
import p077d0.C11344e;
import p077d0.C11402t0;
import p077d0.EnumC11396r0;
import p282kk.C22533b;
import p390p1.C28688y1;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: a6.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0419f extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public Object f1441E;

    /* JADX INFO: renamed from: F */
    public Object f1442F;

    /* JADX INFO: renamed from: G */
    public Object f1443G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f1444H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1445w = 3;

    /* JADX INFO: renamed from: x */
    public int f1446x;

    /* JADX INFO: renamed from: y */
    public Object f1447y;

    /* JADX INFO: renamed from: z */
    public Object f1448z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0419f(C11402t0 c11402t0, Function1 function1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        EnumC11396r0 enumC11396r0 = EnumC11396r0.f36538w;
        this.f1443G = c11402t0;
        this.f1444H = (AbstractC32275i) function1;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function1, s83.i] */
    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        int i13 = this.f1445w;
        Object obj2 = this.f1444H;
        switch (i13) {
            case 0:
                C0419f c0419f = new C0419f((List) this.f1443G, (ArrayList) obj2, interfaceC30057d);
                c0419f.f1442F = obj;
                return c0419f;
            case 1:
                C0419f c0419f2 = new C0419f((C22669g0) this.f1448z, (C28688y1) this.f1441E, (InterfaceC1585g0) this.f1442F, (C2435r3) this.f1443G, (View) obj2, interfaceC30057d);
                c0419f2.f1447y = obj;
                return c0419f2;
            case 2:
                C0419f c0419f3 = new C0419f((InterfaceC11927l) this.f1441E, (C11344e) this.f1442F, (InterfaceC28601c1) this.f1443G, (InterfaceC28601c1) obj2, interfaceC30057d);
                c0419f3.f1447y = obj;
                return c0419f3;
            case 3:
                EnumC11396r0 enumC11396r0 = EnumC11396r0.f36538w;
                C0419f c0419f4 = new C0419f((C11402t0) this.f1443G, (Function1) obj2, interfaceC30057d);
                c0419f4.f1442F = obj;
                return c0419f4;
            default:
                return new C0419f((C22533b) obj2, interfaceC30057d);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1445w) {
            case 0:
                return ((C0419f) create(obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                return ((C0419f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 2:
                return ((C0419f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 3:
                return ((C0419f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C0419f) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:222:0x048c  */
    /* JADX WARN: Code duplicated, block: B:227:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:267:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52, types: [dc3.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [dc3.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r3v13, types: [int, mc3.a] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [bc3.k1] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v19, types: [bc3.k1] */
    /* JADX WARN: Type inference failed for: r4v27, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v32, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54 */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v57 */
    /* JADX WARN: Type inference failed for: r6v58 */
    /* JADX WARN: Type inference failed for: r6v59 */
    /* JADX WARN: Type inference failed for: r6v60 */
    /* JADX WARN: Type inference failed for: r6v61 */
    /* JADX WARN: Type inference failed for: r6v62 */
    /* JADX WARN: Type inference failed for: r6v63 */
    /* JADX WARN: Type inference failed for: r6v64 */
    /* JADX WARN: Type inference failed for: r6v65 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v63 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:170:0x036e -> B:172:0x0372). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:226:0x04aa -> B:220:0x0486). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:228:0x04d3 -> B:220:0x0486). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0103 -> B:56:0x016a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0154 -> B:55:0x0156). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x019f -> B:57:0x0177). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x01ec -> B:57:0x0177). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x01ff -> B:57:0x0177). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x020e -> B:57:0x0177). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x0210 -> B:57:0x0177). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 1252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p007a6.C0419f.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0419f(InterfaceC11927l interfaceC11927l, C11344e c11344e, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f1441E = interfaceC11927l;
        this.f1442F = c11344e;
        this.f1443G = interfaceC28601c1;
        this.f1444H = interfaceC28601c2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0419f(List list, ArrayList arrayList, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f1443G = list;
        this.f1444H = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0419f(C22533b c22533b, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f1444H = c22533b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0419f(C22669g0 c22669g0, C28688y1 c28688y1, InterfaceC1585g0 interfaceC1585g0, C2435r3 c2435r3, View view, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f1448z = c22669g0;
        this.f1441E = c28688y1;
        this.f1442F = interfaceC1585g0;
        this.f1443G = c2435r3;
        this.f1444H = view;
    }
}
