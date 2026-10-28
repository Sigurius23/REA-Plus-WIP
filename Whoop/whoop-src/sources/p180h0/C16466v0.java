package p180h0;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import gw1.C16268a;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p512u2.InterfaceC34449b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import s83.AbstractC32274h;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: h0.v0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16466v0 extends AbstractC32274h implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f63262E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Function1 f63263F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f63264G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC23459e f63265H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f63266I;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f63267x;

    /* JADX INFO: renamed from: y */
    public Object f63268y;

    /* JADX INFO: renamed from: z */
    public int f63269z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C16466v0(InterfaceC2994c0 interfaceC2994c0, Function3 function3, Function1 function1, C16398h2 c16398h2, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f63267x = 2;
        this.f63264G = interfaceC2994c0;
        this.f63265H = (AbstractC32275i) function3;
        this.f63263F = function1;
        this.f63266I = c16398h2;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function3, s83.i] */
    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f63267x) {
            case 0:
                C16466v0 c16466v0 = new C16466v0(this.f63263F, (InterfaceC4351m) this.f63264G, (InterfaceC4339a) this.f63265H, (InterfaceC4339a) this.f63266I, interfaceC30057d, 0);
                c16466v0.f63262E = obj;
                return c16466v0;
            case 1:
                C16466v0 c16466v1 = new C16466v0(this.f63263F, (InterfaceC4351m) this.f63264G, (InterfaceC4339a) this.f63265H, (C16268a) this.f63266I, interfaceC30057d, 1);
                c16466v1.f63262E = obj;
                return c16466v1;
            default:
                C16466v0 c16466v2 = new C16466v0((InterfaceC2994c0) this.f63264G, (AbstractC32275i) this.f63265H, this.f63263F, (C16398h2) this.f63266I, interfaceC30057d);
                c16466v2.f63262E = obj;
                return c16466v2;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC34449b interfaceC34449b = (InterfaceC34449b) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f63267x) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C16466v0) create(interfaceC34449b, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0097  */
    /* JADX WARN: Code duplicated, block: B:46:0x011c  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0141, code lost:
    
        if (r0 == r14) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ed, code lost:
    
        if (r0 == r15) goto L75;
     */
    /* JADX WARN: Type inference failed for: r4v0, types: [h0.u0] */
    /* JADX WARN: Type inference failed for: r4v3, types: [h0.u0] */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlin.jvm.functions.Function3, s83.i] */
    @Override // s83.AbstractC32267a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p180h0.C16466v0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16466v0(Function1 function1, InterfaceC4351m interfaceC4351m, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f63267x = i13;
        this.f63263F = function1;
        this.f63264G = interfaceC4351m;
        this.f63265H = interfaceC4339a;
        this.f63266I = interfaceC4339a2;
    }
}
