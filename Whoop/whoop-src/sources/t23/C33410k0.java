package t23;

import bc3.AbstractC3006f0;
import c93.InterfaceC4351m;
import dc3.InterfaceC11936u;
import ec3.C13081r1;
import ec3.InterfaceC13062m;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import n43.C26285a;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: t23.k0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33410k0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f139492w;

    /* JADX INFO: renamed from: x */
    public int f139493x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f139494y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C33450s0 f139495z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C33410k0(C33450s0 c33450s0, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f139492w = i13;
        this.f139495z = c33450s0;
    }

    /* JADX INFO: renamed from: f */
    public static final void m105855f(C33450s0 c33450s0, InterfaceC11936u interfaceC11936u) {
        InterfaceC30057d interfaceC30057d;
        Object next;
        C13081r1 c13081r1;
        Iterator it = ((List) c33450s0.f139680v.f81695j.getValue()).iterator();
        while (true) {
            interfaceC30057d = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C33376d2 c33376d2 = (C33376d2) ((C33392g2) next).f139419K.f45200w.getValue();
            if (c33376d2 != null && c33376d2.f139334c) {
                break;
            }
        }
        C33392g2 c33392g2 = (C33392g2) next;
        AbstractC3006f0.m8732z(c33450s0.f139644d, null, null, new C26285a(c33450s0, interfaceC11936u, (c33392g2 == null || (c13081r1 = c33392g2.f139419K) == null) ? null : (C33376d2) c13081r1.f45200w.getValue(), interfaceC30057d, 23), 3);
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f139492w) {
            case 0:
                C33410k0 c33410k0 = new C33410k0(this.f139495z, interfaceC30057d, 0);
                c33410k0.f139494y = obj;
                return c33410k0;
            case 1:
                C33410k0 c33410k1 = new C33410k0(this.f139495z, interfaceC30057d, 1);
                c33410k1.f139494y = obj;
                return c33410k1;
            default:
                C33410k0 c33410k2 = new C33410k0(this.f139495z, interfaceC30057d, 2);
                c33410k2.f139494y = obj;
                return c33410k2;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f139492w) {
            case 0:
                return ((C33410k0) create((InterfaceC13062m) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                return ((C33410k0) create((InterfaceC13062m) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C33410k0) create((InterfaceC11936u) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0160  */
    /* JADX WARN: Code duplicated, block: B:69:0x016d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0177  */
    /* JADX WARN: Code duplicated, block: B:73:0x017c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0185  */
    /* JADX WARN: Code duplicated, block: B:78:0x018b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0192  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0120 -> B:34:0x00af). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x01cb -> B:59:0x013d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t23.C33410k0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
