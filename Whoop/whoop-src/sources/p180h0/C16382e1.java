package p180h0;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: h0.e1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16382e1 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f62983E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ AbstractC16387f1 f62984F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f62985w = 1;

    /* JADX INFO: renamed from: x */
    public C22669g0 f62986x;

    /* JADX INFO: renamed from: y */
    public C22669g0 f62987y;

    /* JADX INFO: renamed from: z */
    public int f62988z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16382e1(AbstractC16387f1 abstractC16387f1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f62984F = abstractC16387f1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f62985w) {
            case 0:
                C16382e1 c16382e1 = new C16382e1(this.f62987y, this.f62984F, interfaceC30057d);
                c16382e1.f62983E = obj;
                return c16382e1;
            default:
                C16382e1 c16382e2 = new C16382e1(this.f62984F, interfaceC30057d);
                c16382e2.f62983E = obj;
                return c16382e2;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f62985w) {
            case 0:
                return ((C16382e1) create((Function1) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C16382e1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005b A[PHI: r5
      0x005b: PHI (r5v11 bc3.c0) = (r5v4 bc3.c0), (r5v7 bc3.c0), (r5v7 bc3.c0), (r5v7 bc3.c0), (r5v9 bc3.c0), (r5v12 bc3.c0) binds: [B:20:0x0053, B:47:0x00ca, B:49:0x00d7, B:43:0x00c3, B:32:0x0087, B:13:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:28:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    /* JADX WARN: Code duplicated, block: B:36:0x009b  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b6 A[Catch: CancellationException -> 0x00c6, TryCatch #2 {CancellationException -> 0x00c6, blocks: (B:40:0x00b0, B:42:0x00b6, B:46:0x00c8, B:48:0x00cc), top: B:89:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c8 A[Catch: CancellationException -> 0x00c6, TryCatch #2 {CancellationException -> 0x00c6, blocks: (B:40:0x00b0, B:42:0x00b6, B:46:0x00c8, B:48:0x00cc), top: B:89:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00cc A[Catch: CancellationException -> 0x00c6, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00c6, blocks: (B:40:0x00b0, B:42:0x00b6, B:46:0x00c8, B:48:0x00cc), top: B:89:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:65:0x0116  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0087 -> B:21:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00c3 -> B:21:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00ca -> B:21:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00d7 -> B:21:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00e5 -> B:13:0x002c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x013b -> B:79:0x013c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0140 -> B:81:0x0141). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:36:0x009b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p180h0.C16382e1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16382e1(C22669g0 c22669g0, AbstractC16387f1 abstractC16387f1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f62987y = c22669g0;
        this.f62984F = abstractC16387f1;
    }
}
