package bc3;

import c93.InterfaceC4351m;
import dc3.InterfaceC11927l;
import e10.C12554k0;
import l83.C23454a0;
import p012ab.C0682h0;
import p041c1.C3816a;
import p133f1.InterfaceC13948j;
import p292l1.C23203x4;
import p409q0.AbstractC29701y;
import p510u0.InterfaceC34310d1;
import p512u2.InterfaceC34449b;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32274h;
import xb3.C38175j;

/* JADX INFO: renamed from: bc3.r1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3054r1 extends AbstractC32274h implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public Object f12082E;

    /* JADX INFO: renamed from: F */
    public Object f12083F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f12084G;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f12085x;

    /* JADX INFO: renamed from: y */
    public int f12086y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f12087z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3054r1(InterfaceC2994c0 interfaceC2994c0, C23203x4 c23203x4, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f12085x = 4;
        this.f12083F = interfaceC2994c0;
        this.f12084G = c23203x4;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f12085x) {
            case 0:
                C3054r1 c3054r1 = new C3054r1((C3060t1) this.f12084G, interfaceC30057d, 0);
                c3054r1.f12087z = obj;
                return c3054r1;
            case 1:
                C3054r1 c3054r2 = new C3054r1((C3816a) this.f12084G, interfaceC30057d, 1);
                c3054r2.f12087z = obj;
                return c3054r2;
            case 2:
                C3054r1 c3054r3 = new C3054r1((InterfaceC13948j) this.f12082E, (C0682h0) this.f12083F, (InterfaceC34310d1) this.f12084G, interfaceC30057d, 2);
                c3054r3.f12087z = obj;
                return c3054r3;
            case 3:
                C3054r1 c3054r4 = new C3054r1((InterfaceC30063j) this.f12082E, (C12554k0) this.f12083F, (InterfaceC11927l) this.f12084G, interfaceC30057d, 3);
                c3054r4.f12087z = obj;
                return c3054r4;
            case 4:
                C3054r1 c3054r5 = new C3054r1((InterfaceC2994c0) this.f12083F, (C23203x4) this.f12084G, interfaceC30057d);
                c3054r5.f12087z = obj;
                return c3054r5;
            default:
                C3054r1 c3054r6 = new C3054r1((AbstractC29701y) this.f12084G, interfaceC30057d, 5);
                c3054r6.f12087z = obj;
                return c3054r6;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f12085x) {
            case 0:
                return ((C3054r1) create((C38175j) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                return ((C3054r1) create((InterfaceC34449b) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 2:
                return ((C3054r1) create((InterfaceC34449b) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 3:
                return ((C3054r1) create((InterfaceC34449b) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 4:
                ((C3054r1) create((InterfaceC34449b) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            default:
                return ((C3054r1) create((InterfaceC34449b) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:295:0x0548  */
    /* JADX WARN: Code duplicated, block: B:297:0x054c  */
    /* JADX WARN: Code duplicated, block: B:362:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v49, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v59, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:151:0x0307 -> B:153:0x030b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0078 -> B:20:0x007c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:255:0x049c -> B:257:0x04a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:296:0x054a -> B:280:0x04fa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ee -> B:39:0x00f1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x019d -> B:302:0x01a1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bc3.C3054r1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3054r1(Object obj, Object obj2, Object obj3, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f12085x = i13;
        this.f12082E = obj;
        this.f12083F = obj2;
        this.f12084G = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3054r1(Object obj, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f12085x = i13;
        this.f12084G = obj;
    }
}
