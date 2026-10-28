package androidx.room;

import bc3.AbstractC3006f0;
import bc3.EnumC2998d0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import dc3.InterfaceC11936u;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fc3.C14374e;
import fc3.C14378i;
import fc3.C14379j;
import fc3.C14380k;
import fc3.C14392w;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import l83.C23454a0;
import mc3.C25443i;
import p003a1.C0109h;
import p005a3.AbstractC0201g;
import p132f0.C13778d0;
import p238j0.C21078d;
import p238j0.C21079e;
import p238j0.C21080f;
import p238j0.C21081g;
import p238j0.C21085k;
import p238j0.C21086l;
import p238j0.C21087m;
import p238j0.InterfaceC21082h;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.C22665e0;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: androidx.room.b2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1769b2 implements InterfaceC13062m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f6968E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f6969w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f6970x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f6971y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f6972z;

    public /* synthetic */ C1769b2(Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        this.f6969w = i13;
        this.f6970x = obj;
        this.f6971y = obj2;
        this.f6972z = obj3;
        this.f6968E = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m5362b(InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d) {
        C14374e c14374e;
        C1769b2 c1769b2;
        if (interfaceC30057d instanceof C14374e) {
            c14374e = (C14374e) interfaceC30057d;
            int i13 = c14374e.f52483E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c14374e.f52483E = i13 - Integer.MIN_VALUE;
            } else {
                c14374e = new C14374e(this, interfaceC30057d);
            }
        } else {
            c14374e = new C14374e(this, interfaceC30057d);
        }
        Object obj = c14374e.f52486y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c14374e.f52483E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) this.f6970x;
            if (interfaceC3027k1 != null && !interfaceC3027k1.isActive()) {
                throw interfaceC3027k1.getCancellationException();
            }
            C25443i c25443i = (C25443i) this.f6971y;
            c14374e.f52484w = this;
            c14374e.f52485x = interfaceC13058l;
            c14374e.f52483E = 1;
            if (c25443i.m74671a(c14374e) == enumC31071a) {
                return enumC31071a;
            }
            c1769b2 = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC13058l = c14374e.f52485x;
            c1769b2 = c14374e.f52484w;
            AbstractC34132o.m107864I(obj);
        }
        AbstractC3006f0.m8732z((InterfaceC11936u) c1769b2.f6972z, null, null, new C0109h(interfaceC13058l, (C14392w) c1769b2.f6968E, (C25443i) c1769b2.f6971y, null, 25), 3);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (r1.emit(r15, r3) == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        if (r1.emit(r15, r3) == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009a, code lost:
    
        return r4;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m5363c(int[] r14, q83.InterfaceC30057d r15) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f6972z
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.lang.Object r1 = r13.f6971y
            ec3.m r1 = (ec3.InterfaceC13062m) r1
            java.lang.Object r2 = r13.f6970x
            kotlin.jvm.internal.g0 r2 = (p715kotlin.jvm.internal.C22669g0) r2
            boolean r3 = r15 instanceof androidx.room.C1765a2
            if (r3 == 0) goto L1f
            r3 = r15
            androidx.room.a2 r3 = (androidx.room.C1765a2) r3
            int r4 = r3.f6957z
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1f
            int r4 = r4 - r5
            r3.f6957z = r4
            goto L24
        L1f:
            androidx.room.a2 r3 = new androidx.room.a2
            r3.<init>(r13, r15)
        L24:
            java.lang.Object r15 = r3.f6955x
            r83.a r4 = r83.EnumC31071a.f128113w
            int r5 = r3.f6957z
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L41
            if (r5 == r7) goto L3b
            if (r5 != r6) goto L33
            goto L3b
        L33:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3b:
            int[] r14 = r3.f6954w
            p505ts.AbstractC34132o.m107864I(r15)
            goto L9b
        L41:
            p505ts.AbstractC34132o.m107864I(r15)
            java.lang.Object r15 = r2.f89336w
            if (r15 != 0) goto L57
            java.util.Set r15 = m83.AbstractC25260n.m74059b1(r0)
            r3.f6954w = r14
            r3.f6957z = r7
            java.lang.Object r15 = r1.emit(r15, r3)
            if (r15 != r4) goto L9b
            goto L9a
        L57:
            java.lang.Object r15 = r13.f6968E
            int[] r15 = (int[]) r15
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r7 = r0.length
            r8 = 0
            r9 = r8
        L63:
            if (r8 >= r7) goto L86
            r10 = r0[r8]
            int r11 = r9 + 1
            java.lang.Object r12 = r2.f89336w
            if (r12 == 0) goto L7e
            int[] r12 = (int[]) r12
            r9 = r15[r9]
            r12 = r12[r9]
            r9 = r14[r9]
            if (r12 == r9) goto L7a
            r5.add(r10)
        L7a:
            int r8 = r8 + 1
            r9 = r11
            goto L63
        L7e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "Required value was null."
            r14.<init>(r15)
            throw r14
        L86:
            boolean r15 = r5.isEmpty()
            if (r15 != 0) goto L9b
            java.util.Set r15 = m83.AbstractC25265s.m74103I1(r5)
            r3.f6954w = r14
            r3.f6957z = r6
            java.lang.Object r15 = r1.emit(r15, r3)
            if (r15 != r4) goto L9b
        L9a:
            return r4
        L9b:
            r2.f89336w = r14
            l83.a0 r14 = l83.C23454a0.f92919a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C1769b2.m5363c(int[], q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        C14379j c14379j;
        C1769b2 c1769b2;
        switch (this.f6969w) {
            case 0:
                return m5363c((int[]) obj, interfaceC30057d);
            case 1:
                InterfaceC21082h interfaceC21082h = (InterfaceC21082h) obj;
                C22665e0 c22665e0 = (C22665e0) this.f6972z;
                C22665e0 c22665e1 = (C22665e0) this.f6971y;
                C22665e0 c22665e2 = (C22665e0) this.f6970x;
                boolean z4 = true;
                if (interfaceC21082h instanceof C21086l) {
                    c22665e2.f89334w++;
                } else if ((interfaceC21082h instanceof C21087m) || (interfaceC21082h instanceof C21085k)) {
                    c22665e2.f89334w--;
                } else if (interfaceC21082h instanceof C21080f) {
                    c22665e1.f89334w++;
                } else if (interfaceC21082h instanceof C21081g) {
                    c22665e1.f89334w--;
                } else if (interfaceC21082h instanceof C21078d) {
                    c22665e0.f89334w++;
                } else if (interfaceC21082h instanceof C21079e) {
                    c22665e0.f89334w--;
                }
                int i13 = c22665e2.f89334w;
                boolean z13 = false;
                boolean z14 = i13 > 0;
                boolean z15 = c22665e1.f89334w > 0;
                boolean z16 = c22665e0.f89334w > 0;
                C13778d0 c13778d0 = (C13778d0) this.f6968E;
                if (c13778d0.f49159P != z14) {
                    c13778d0.f49159P = z14;
                    z13 = true;
                }
                if (c13778d0.f49160Q != z15) {
                    c13778d0.f49160Q = z15;
                    z13 = true;
                }
                if (c13778d0.f49161R != z16) {
                    c13778d0.f49161R = z16;
                } else {
                    z4 = z13;
                }
                if (z4) {
                    AbstractC0201g.m508h(c13778d0);
                }
                return C23454a0.f92919a;
            case 2:
                return m5362b((InterfaceC13058l) obj, interfaceC30057d);
            default:
                if (interfaceC30057d instanceof C14379j) {
                    c14379j = (C14379j) interfaceC30057d;
                    int i14 = c14379j.f52497F;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c14379j.f52497F = i14 - Integer.MIN_VALUE;
                    } else {
                        c14379j = new C14379j(this, interfaceC30057d);
                    }
                } else {
                    c14379j = new C14379j(this, interfaceC30057d);
                }
                Object obj2 = c14379j.f52501z;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i15 = c14379j.f52497F;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) ((C22669g0) this.f6970x).f89336w;
                    if (interfaceC3027k1 != null) {
                        interfaceC3027k1.cancel((CancellationException) new ChildCancelledException());
                        c14379j.f52498w = this;
                        c14379j.f52499x = obj;
                        c14379j.f52500y = interfaceC3027k1;
                        c14379j.f52497F = 1;
                        if (interfaceC3027k1.join(c14379j) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                    c1769b2 = this;
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = c14379j.f52499x;
                    c1769b2 = c14379j.f52498w;
                    AbstractC34132o.m107864I(obj2);
                }
                ((C22669g0) c1769b2.f6970x).f89336w = AbstractC3006f0.m8732z((InterfaceC2994c0) c1769b2.f6972z, null, EnumC2998d0.f12007z, new C14378i((C14380k) c1769b2.f6968E, (InterfaceC13062m) c1769b2.f6971y, obj, null), 1);
                return C23454a0.f92919a;
        }
    }

    public C1769b2(C22669g0 c22669g0, InterfaceC2994c0 interfaceC2994c0, C14380k c14380k, InterfaceC13062m interfaceC13062m) {
        this.f6969w = 3;
        this.f6970x = c22669g0;
        this.f6972z = interfaceC2994c0;
        this.f6968E = c14380k;
        this.f6971y = interfaceC13062m;
    }
}
