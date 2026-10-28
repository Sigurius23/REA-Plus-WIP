package p133f1;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import n53.C26377x1;
import p294l3.C23283u0;
import p412q3.InterfaceC29884r;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: f1.o1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13965o1 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public Object f49787E;

    /* JADX INFO: renamed from: F */
    public Object f49788F;

    /* JADX INFO: renamed from: G */
    public /* synthetic */ Object f49789G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f49790H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49791w = 0;

    /* JADX INFO: renamed from: x */
    public long f49792x;

    /* JADX INFO: renamed from: y */
    public int f49793y;

    /* JADX INFO: renamed from: z */
    public Object f49794z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13965o1(C13966p c13966p, String str, long j7, C23283u0 c23283u0, C13977s1 c13977s1, InterfaceC29884r interfaceC29884r, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f49794z = c13966p;
        this.f49787E = str;
        this.f49792x = j7;
        this.f49788F = c23283u0;
        this.f49789G = c13977s1;
        this.f49790H = interfaceC29884r;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f49791w) {
            case 0:
                return new C13965o1((C13966p) this.f49794z, (String) this.f49787E, this.f49792x, (C23283u0) this.f49788F, (C13977s1) this.f49789G, (InterfaceC29884r) this.f49790H, interfaceC30057d);
            default:
                C13965o1 c13965o1 = new C13965o1((C26377x1) this.f49790H, interfaceC30057d);
                c13965o1.f49789G = obj;
                return c13965o1;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f49791w) {
            case 0:
                break;
        }
        return ((C13965o1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x029a  */
    /* JADX WARN: Code duplicated, block: B:118:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:120:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:122:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:124:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:125:0x02e9 A[PHI: r1
      0x02e9: PHI (r1v5 n53.x1) = (r1v4 n53.x1), (r1v19 n53.x1) binds: [B:138:0x033e, B:124:0x02e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:133:0x0307 A[Catch: all -> 0x032e, TRY_LEAVE, TryCatch #13 {all -> 0x032e, blocks: (B:131:0x02f7, B:133:0x0307), top: B:201:0x02f7 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x0340  */
    /* JADX WARN: Code duplicated, block: B:141:0x0346  */
    /* JADX WARN: Code duplicated, block: B:142:0x034f  */
    /* JADX WARN: Code duplicated, block: B:189:0x016a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x02ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:49:0x0121  */
    /* JADX WARN: Code duplicated, block: B:56:0x013e  */
    /* JADX WARN: Code duplicated, block: B:67:0x017e A[Catch: all -> 0x0108, Exception -> 0x01cb, TRY_LEAVE, TryCatch #4 {Exception -> 0x01cb, blocks: (B:65:0x016a, B:67:0x017e), top: B:189:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f3 A[Catch: all -> 0x0258, Exception -> 0x025c, TRY_LEAVE, TryCatch #16 {Exception -> 0x025c, blocks: (B:78:0x01e3, B:80:0x01f3, B:85:0x0207), top: B:205:0x01e3 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0201 A[Catch: all -> 0x0108, Exception -> 0x01c3, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x0108, blocks: (B:65:0x016a, B:67:0x017e, B:69:0x018a, B:37:0x00e9, B:82:0x0201), top: B:189:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0206  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x013e -> B:203:0x0152). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p133f1.C13965o1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13965o1(C26377x1 c26377x1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f49790H = c26377x1;
    }
}
