package g63;

import c93.InterfaceC4351m;
import io.ktor.utils.p228io.C20028u;
import io.ktor.utils.p228io.InterfaceC20024q;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: g63.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C15537a extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public byte[] f58250E;

    /* JADX INFO: renamed from: F */
    public long f58251F;

    /* JADX INFO: renamed from: G */
    public long f58252G;

    /* JADX INFO: renamed from: H */
    public int f58253H;

    /* JADX INFO: renamed from: I */
    public int f58254I;

    /* JADX INFO: renamed from: J */
    public /* synthetic */ Object f58255J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Long f58256K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ InterfaceC20024q f58257L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ Function3 f58258M;

    /* JADX INFO: renamed from: w */
    public Object f58259w;

    /* JADX INFO: renamed from: x */
    public InterfaceC20024q f58260x;

    /* JADX INFO: renamed from: y */
    public Function3 f58261y;

    /* JADX INFO: renamed from: z */
    public Object f58262z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15537a(Long l7, InterfaceC20024q interfaceC20024q, Function3 function3, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f58256K = l7;
        this.f58257L = interfaceC20024q;
        this.f58258M = function3;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C15537a c15537a = new C15537a(this.f58256K, this.f58257L, this.f58258M, interfaceC30057d);
        c15537a.f58255J = obj;
        return c15537a;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C15537a) create((C20028u) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d9 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:9:0x001b, B:40:0x00d1, B:42:0x00d9, B:46:0x00fa, B:56:0x0160, B:60:0x016f), top: B:67:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:49:0x011f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0154  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0154 -> B:55:0x015d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g63.C15537a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
