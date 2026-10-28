package p180h0;

import c93.InterfaceC4351m;
import cz0.C11242c;
import cz0.C11243d;
import cz0.C11244e;
import eg.C13161j;
import gw1.C16268a;
import java.util.Collection;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import p181h2.C16617b;
import p505ts.AbstractC34132o;
import p512u2.AbstractC34454d0;
import p512u2.C34460g0;
import p512u2.C34472r;
import p512u2.InterfaceC34449b;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32274h;

/* JADX INFO: renamed from: h0.t0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16456t0 extends AbstractC32274h implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C11243d f63231E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C16268a f63232F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C11244e f63233G;

    /* JADX INFO: renamed from: x */
    public int f63234x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f63235y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C11242c f63236z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16456t0(C11242c c11242c, C11243d c11243d, C16268a c16268a, C11244e c11244e, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f63236z = c11242c;
        this.f63231E = c11243d;
        this.f63232F = c16268a;
        this.f63233G = c11244e;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C16456t0 c16456t0 = new C16456t0(this.f63236z, this.f63231E, this.f63232F, this.f63233G, interfaceC30057d);
        c16456t0.f63235y = obj;
        return c16456t0;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C16456t0) create((InterfaceC34449b) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0058 A[Catch: CancellationException -> 0x0017, TryCatch #0 {CancellationException -> 0x0017, blocks: (B:8:0x0013, B:33:0x007b, B:35:0x0083, B:37:0x0095, B:39:0x00a1, B:40:0x00a4, B:41:0x00a7, B:42:0x00ad, B:15:0x0026, B:27:0x0054, B:29:0x0058, B:18:0x002e, B:24:0x0045, B:21:0x003a), top: B:47:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0083 A[Catch: CancellationException -> 0x0017, TryCatch #0 {CancellationException -> 0x0017, blocks: (B:8:0x0013, B:33:0x007b, B:35:0x0083, B:37:0x0095, B:39:0x00a1, B:40:0x00a4, B:41:0x00a7, B:42:0x00ad, B:15:0x0026, B:27:0x0054, B:29:0x0058, B:18:0x002e, B:24:0x0045, B:21:0x003a), top: B:47:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0095 A[Catch: CancellationException -> 0x0017, TryCatch #0 {CancellationException -> 0x0017, blocks: (B:8:0x0013, B:33:0x007b, B:35:0x0083, B:37:0x0095, B:39:0x00a1, B:40:0x00a4, B:41:0x00a7, B:42:0x00ad, B:15:0x0026, B:27:0x0054, B:29:0x0058, B:18:0x002e, B:24:0x0045, B:21:0x003a), top: B:47:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a1 A[Catch: CancellationException -> 0x0017, TryCatch #0 {CancellationException -> 0x0017, blocks: (B:8:0x0013, B:33:0x007b, B:35:0x0083, B:37:0x0095, B:39:0x00a1, B:40:0x00a4, B:41:0x00a7, B:42:0x00ad, B:15:0x0026, B:27:0x0054, B:29:0x0058, B:18:0x002e, B:24:0x0045, B:21:0x003a), top: B:47:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ad A[Catch: CancellationException -> 0x0017, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0017, blocks: (B:8:0x0013, B:33:0x007b, B:35:0x0083, B:37:0x0095, B:39:0x00a1, B:40:0x00a4, B:41:0x00a7, B:42:0x00ad, B:15:0x0026, B:27:0x0054, B:29:0x0058, B:18:0x002e, B:24:0x0045, B:21:0x003a), top: B:47:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.lang.Object, java.util.List] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        InterfaceC34449b interfaceC34449b;
        C34472r c34472r;
        InterfaceC34449b interfaceC34449b2;
        ?? r10;
        int size;
        int i13;
        C34472r c34472r2;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = this.f63234x;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                interfaceC34449b = (InterfaceC34449b) this.f63235y;
                this.f63235y = interfaceC34449b;
                this.f63234x = 1;
                obj = AbstractC16434o3.m46603c(interfaceC34449b, this, 2);
                if (obj == enumC31071a) {
                }
                return enumC31071a;
            }
            if (i14 == 1) {
                interfaceC34449b = (InterfaceC34449b) this.f63235y;
                AbstractC34132o.m107864I(obj);
            } else {
                if (i14 == 2) {
                    interfaceC34449b = (InterfaceC34449b) this.f63235y;
                    AbstractC34132o.m107864I(obj);
                    c34472r = (C34472r) obj;
                    if (c34472r != null) {
                        this.f63236z.invoke(new C16617b(c34472r.f144817c));
                        long j7 = c34472r.f144815a;
                        C13161j c13161j = new C13161j(this.f63233G, 26);
                        this.f63235y = interfaceC34449b;
                        this.f63234x = 3;
                        obj = AbstractC16486z0.m46661j(interfaceC34449b, j7, c13161j, this);
                        if (obj != enumC31071a) {
                            interfaceC34449b2 = interfaceC34449b;
                        }
                        return enumC31071a;
                    }
                    return C23454a0.f92919a;
                }
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC34449b2 = (InterfaceC34449b) this.f63235y;
                AbstractC34132o.m107864I(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                r10 = ((C34460g0) interfaceC34449b2).f144774F.f144784T.f144800a;
                size = ((Collection) r10).size();
                for (i13 = 0; i13 < size; i13++) {
                    c34472r2 = (C34472r) r10.get(i13);
                    if (AbstractC34454d0.m108913d(c34472r2)) {
                        c34472r2.m108946a();
                    }
                }
                this.f63231E.invoke();
            } else {
                float f13 = AbstractC16486z0.f63358a;
            }
            return C23454a0.f92919a;
            long j13 = ((C34472r) obj).f144815a;
            this.f63235y = interfaceC34449b;
            this.f63234x = 2;
            obj = AbstractC16486z0.m46655d(interfaceC34449b, j13, this);
            if (obj != enumC31071a) {
                c34472r = (C34472r) obj;
                if (c34472r != null) {
                    this.f63236z.invoke(new C16617b(c34472r.f144817c));
                    long j14 = c34472r.f144815a;
                    C13161j c13161j2 = new C13161j(this.f63233G, 26);
                    this.f63235y = interfaceC34449b;
                    this.f63234x = 3;
                    obj = AbstractC16486z0.m46661j(interfaceC34449b, j14, c13161j2, this);
                    if (obj != enumC31071a) {
                        interfaceC34449b2 = interfaceC34449b;
                        if (((Boolean) obj).booleanValue()) {
                            r10 = ((C34460g0) interfaceC34449b2).f144774F.f144784T.f144800a;
                            size = ((Collection) r10).size();
                            while (i13 < size) {
                                c34472r2 = (C34472r) r10.get(i13);
                                if (AbstractC34454d0.m108913d(c34472r2)) {
                                    c34472r2.m108946a();
                                }
                            }
                            this.f63231E.invoke();
                        } else {
                            float f14 = AbstractC16486z0.f63358a;
                        }
                    }
                }
                return C23454a0.f92919a;
            }
            return enumC31071a;
        } catch (CancellationException e5) {
            float f15 = AbstractC16486z0.f63358a;
            throw e5;
        }
    }
}
