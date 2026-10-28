package p133f1;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p078d1.C11456i;
import p180h0.C16489z3;
import p510u0.InterfaceC34310d1;
import p512u2.EnumC34466l;
import p512u2.InterfaceC34449b;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import s83.AbstractC32274h;
import xb3.C38175j;

/* JADX INFO: renamed from: f1.v0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13985v0 extends AbstractC32274h implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public Object f49886E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f49887F;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f49888x;

    /* JADX INFO: renamed from: y */
    public int f49889y;

    /* JADX INFO: renamed from: z */
    public Object f49890z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13985v0(Object obj, Object obj2, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f49888x = i13;
        this.f49886E = obj;
        this.f49887F = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [c93.m, s83.h] */
    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f49888x) {
            case 0:
                C13985v0 c13985v0 = new C13985v0((C13988w0) this.f49886E, (C13931d0) this.f49887F, interfaceC30057d, 0);
                c13985v0.f49890z = obj;
                return c13985v0;
            case 1:
                C13985v0 c13985v1 = new C13985v0((InterfaceC30063j) this.f49886E, (InterfaceC4351m) this.f49887F, interfaceC30057d);
                c13985v1.f49890z = obj;
                return c13985v1;
            case 2:
                C13985v0 c13985v2 = new C13985v0((C11456i) this.f49887F, interfaceC30057d, 2);
                c13985v2.f49886E = obj;
                return c13985v2;
            case 3:
                C13985v0 c13985v3 = new C13985v0((EnumC34466l) this.f49886E, (C22669g0) this.f49887F, interfaceC30057d, 3);
                c13985v3.f49890z = obj;
                return c13985v3;
            case 4:
                C13985v0 c13985v4 = new C13985v0((C16489z3) this.f49886E, (InterfaceC2994c0) this.f49887F, interfaceC30057d, 4);
                c13985v4.f49890z = obj;
                return c13985v4;
            default:
                C13985v0 c13985v5 = new C13985v0((InterfaceC34310d1) this.f49887F, interfaceC30057d, 5);
                c13985v5.f49890z = obj;
                return c13985v5;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f49888x) {
            case 0:
                return ((C13985v0) create((InterfaceC34449b) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                return ((C13985v0) create((InterfaceC34449b) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 2:
                return ((C13985v0) create((C38175j) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 3:
                return ((C13985v0) create((InterfaceC34449b) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 4:
                return ((C13985v0) create((InterfaceC34449b) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C13985v0) create((InterfaceC34449b) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0226 A[PHI: r6
      0x0226: PHI (r6v4 ??) = (r6v32 ??), (r6v33 ??), (r6v5 ??), (r6v34 ??) binds: [B:136:0x0258, B:131:0x0245, B:124:0x0225, B:116:0x020f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:127:0x022c A[Catch: CancellationException -> 0x0213, TRY_ENTER, TryCatch #1 {CancellationException -> 0x0213, blocks: (B:127:0x022c, B:130:0x023a, B:116:0x020f, B:121:0x021a), top: B:163:0x01f3 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0239  */
    /* JADX WARN: Code duplicated, block: B:130:0x023a A[Catch: CancellationException -> 0x0213, PHI: r6
      0x023a: PHI (r6v3 ??) = (r6v35 ??), (r6v36 ??) binds: [B:128:0x0237, B:121:0x021a] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0213, blocks: (B:127:0x022c, B:130:0x023a, B:116:0x020f, B:121:0x021a), top: B:163:0x01f3 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [c93.m, s83.h] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, u2.b] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, u2.b] */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x01e5 -> B:104:0x01e6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:131:0x0245 -> B:125:0x0226). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:136:0x0258 -> B:125:0x0226). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0062 -> B:19:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0175 -> B:83:0x0179). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p133f1.C13985v0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13985v0(Object obj, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f49888x = i13;
        this.f49887F = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C13985v0(InterfaceC30063j interfaceC30063j, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f49888x = 1;
        this.f49886E = interfaceC30063j;
        this.f49887F = (AbstractC32274h) interfaceC4351m;
    }
}
