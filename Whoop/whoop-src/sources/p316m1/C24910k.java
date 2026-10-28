package p316m1;

import androidx.compose.p018ui.input.pointer.PointerEventTimeoutCancellationException;
import b30.C2525g2;
import bc3.AbstractC3006f0;
import bc3.EnumC2998d0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13075p1;
import g20.C15270p;
import l83.C23454a0;
import p180h0.AbstractC16434o3;
import p292l1.C23203x4;
import p505ts.AbstractC34132o;
import p512u2.C34460g0;
import p512u2.C34472r;
import p512u2.EnumC34466l;
import p512u2.InterfaceC34449b;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32274h;

/* JADX INFO: renamed from: m1.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C24910k extends AbstractC32274h implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public int f97565E;

    /* JADX INFO: renamed from: F */
    public /* synthetic */ Object f97566F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC2994c0 f97567G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C23203x4 f97568H;

    /* JADX INFO: renamed from: x */
    public InterfaceC13075p1 f97569x;

    /* JADX INFO: renamed from: y */
    public EnumC34466l f97570y;

    /* JADX INFO: renamed from: z */
    public long f97571z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24910k(InterfaceC2994c0 interfaceC2994c0, C23203x4 c23203x4, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f97567G = interfaceC2994c0;
        this.f97568H = c23203x4;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C24910k c24910k = new C24910k(this.f97567G, this.f97568H, interfaceC30057d);
        c24910k.f97566F = obj;
        return c24910k;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C24910k) create((InterfaceC34449b) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d0 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #2 {all -> 0x0019, blocks: (B:8:0x0014, B:42:0x00cc, B:44:0x00d0), top: B:51:0x0014 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11, types: [ec3.p1] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r10;
        long j7;
        InterfaceC34449b interfaceC34449b;
        EnumC34466l enumC34466l;
        InterfaceC13075p1 interfaceC13075p1;
        InterfaceC13075p1 interfaceC13075p2;
        Object obj2;
        ?? r14;
        C34472r c34472r;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        ?? r15 = this.f97565E;
        InterfaceC30057d interfaceC30057d = null;
        try {
            if (r15 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC34449b interfaceC34449b2 = (InterfaceC34449b) this.f97566F;
                C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(Boolean.FALSE);
                C34460g0 c34460g0 = (C34460g0) interfaceC34449b2;
                long longPressTimeoutMillis = c34460g0.m108930f().getLongPressTimeoutMillis();
                EnumC34466l enumC34466l2 = EnumC34466l.f144806w;
                this.f97566F = c34460g0;
                this.f97569x = c13045h2M36593c;
                this.f97570y = enumC34466l2;
                this.f97571z = longPressTimeoutMillis;
                this.f97565E = 1;
                Object objM46603c = AbstractC16434o3.m46603c(c34460g0, this, 1);
                if (objM46603c != enumC31071a) {
                    j7 = longPressTimeoutMillis;
                    interfaceC34449b = c34460g0;
                    obj = objM46603c;
                    interfaceC13075p1 = c13045h2M36593c;
                    enumC34466l = enumC34466l2;
                }
                return enumC31071a;
            }
            if (r15 != 1) {
                if (r15 != 2) {
                    if (r15 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r10 = (InterfaceC13075p1) this.f97566F;
                    try {
                        AbstractC34132o.m107864I(obj);
                        r10 = r10;
                        r14 = r15;
                        c34472r = (C34472r) obj;
                        if (c34472r != null) {
                            c34472r.m108946a();
                        }
                        Boolean bool = Boolean.FALSE;
                        C13045h2 c13045h2 = (C13045h2) r10;
                        c13045h2.getClass();
                        c13045h2.m36571k(null, bool);
                        r15 = r14;
                        return C23454a0.f92919a;
                    } catch (Throwable th3) {
                        th = th3;
                        Boolean bool2 = Boolean.FALSE;
                        C13045h2 c13045h3 = (C13045h2) r10;
                        c13045h3.getClass();
                        c13045h3.m36571k(null, bool2);
                        throw th;
                    }
                }
                EnumC34466l enumC34466l3 = this.f97570y;
                InterfaceC13075p1 interfaceC13075p3 = this.f97569x;
                interfaceC34449b = (InterfaceC34449b) this.f97566F;
                try {
                    AbstractC34132o.m107864I(obj);
                    obj2 = enumC34466l3;
                    interfaceC13075p2 = interfaceC13075p3;
                    Boolean bool3 = Boolean.FALSE;
                    C13045h2 c13045h4 = (C13045h2) interfaceC13075p2;
                    c13045h4.getClass();
                    c13045h4.m36571k(null, bool3);
                    r15 = obj2;
                } catch (PointerEventTimeoutCancellationException unused) {
                    enumC34466l = enumC34466l3;
                    interfaceC13075p1 = interfaceC13075p3;
                    AbstractC3006f0.m8732z(this.f97567G, null, EnumC2998d0.f12007z, new C15270p(interfaceC13075p1, this.f97568H, interfaceC30057d, 26), 1);
                    this.f97566F = interfaceC13075p1;
                    this.f97569x = null;
                    this.f97570y = null;
                    this.f97565E = 3;
                    obj = AbstractC16434o3.m46610j(interfaceC34449b, enumC34466l, this);
                    if (obj != enumC31071a) {
                        r10 = interfaceC13075p1;
                        r14 = interfaceC13075p1;
                        c34472r = (C34472r) obj;
                        if (c34472r != null) {
                            c34472r.m108946a();
                        }
                        Boolean bool4 = Boolean.FALSE;
                        C13045h2 c13045h5 = (C13045h2) r10;
                        c13045h5.getClass();
                        c13045h5.m36571k(null, bool4);
                        r15 = r14;
                    }
                    return enumC31071a;
                } catch (Throwable th4) {
                    th = th4;
                    r10 = interfaceC13075p3;
                    Boolean bool5 = Boolean.FALSE;
                    C13045h2 c13045h6 = (C13045h2) r10;
                    c13045h6.getClass();
                    c13045h6.m36571k(null, bool5);
                    throw th;
                }
                return C23454a0.f92919a;
            }
            long j13 = this.f97571z;
            EnumC34466l enumC34466l4 = this.f97570y;
            InterfaceC13075p1 interfaceC13075p4 = this.f97569x;
            InterfaceC34449b interfaceC34449b3 = (InterfaceC34449b) this.f97566F;
            AbstractC34132o.m107864I(obj);
            enumC34466l = enumC34466l4;
            interfaceC13075p1 = interfaceC13075p4;
            j7 = j13;
            interfaceC34449b = interfaceC34449b3;
            long j14 = j7;
            int i13 = ((C34472r) obj).f144823i;
            if (i13 == 1 || i13 == 3) {
                try {
                    C2525g2 c2525g2 = new C2525g2(enumC34466l, null, 3);
                    this.f97566F = interfaceC34449b;
                    this.f97569x = interfaceC13075p1;
                    this.f97570y = enumC34466l;
                    this.f97565E = 2;
                    if (((C34460g0) interfaceC34449b).m108931k(j14, c2525g2, this) != enumC31071a) {
                        interfaceC13075p2 = interfaceC13075p1;
                        obj2 = interfaceC13075p1;
                        Boolean bool6 = Boolean.FALSE;
                        C13045h2 c13045h7 = (C13045h2) interfaceC13075p2;
                        c13045h7.getClass();
                        c13045h7.m36571k(null, bool6);
                        r15 = obj2;
                    }
                } catch (PointerEventTimeoutCancellationException unused2) {
                    AbstractC3006f0.m8732z(this.f97567G, null, EnumC2998d0.f12007z, new C15270p(interfaceC13075p1, this.f97568H, interfaceC30057d, 26), 1);
                    this.f97566F = interfaceC13075p1;
                    this.f97569x = null;
                    this.f97570y = null;
                    this.f97565E = 3;
                    obj = AbstractC16434o3.m46610j(interfaceC34449b, enumC34466l, this);
                    if (obj != enumC31071a) {
                        r10 = interfaceC13075p1;
                        r14 = interfaceC13075p1;
                        c34472r = (C34472r) obj;
                        if (c34472r != null) {
                            c34472r.m108946a();
                        }
                        Boolean bool7 = Boolean.FALSE;
                        C13045h2 c13045h8 = (C13045h2) r10;
                        c13045h8.getClass();
                        c13045h8.m36571k(null, bool7);
                        r15 = r14;
                        return C23454a0.f92919a;
                    }
                }
                return enumC31071a;
            }
            return C23454a0.f92919a;
        } catch (Throwable th5) {
            th = th5;
            r10 = r15;
        }
    }
}
