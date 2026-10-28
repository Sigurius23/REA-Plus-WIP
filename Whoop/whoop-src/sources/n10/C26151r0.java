package n10;

import b10.C2273z0;
import b10.InterfaceC2227c1;
import b20.C2326f;
import b20.EnumC2323c;
import com.stripe.android.core.exception.StripeException;
import e10.C12533a;
import e10.C12535b;
import e10.C12571t;
import e10.C12574u0;
import h20.C16744u2;
import l83.C23468n;
import p479s4.AbstractC32123d;
import p505ts.AbstractC34132o;
import p547v8.AbstractC35785b;
import p550vd.AbstractC35903f;
import p664yy.C39857f;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import y00.C38790b6;
import y00.C38915o4;
import y00.C38919p;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: n10.r0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C26151r0 implements InterfaceC26133i0 {

    /* JADX INFO: renamed from: a */
    public final C16744u2 f103605a;

    /* JADX INFO: renamed from: b */
    public final C2326f f103606b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2227c1 f103607c;

    /* JADX INFO: renamed from: d */
    public final C39857f f103608d;

    public C26151r0(C16744u2 intentConfiguration, C2326f errorReporter, InterfaceC2227c1 stripeRepository, C39857f requestOptions) {
        AbstractC22676k.m65750j(intentConfiguration, "intentConfiguration");
        AbstractC22676k.m65750j(null, "handler");
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        AbstractC22676k.m65750j(stripeRepository, "stripeRepository");
        AbstractC22676k.m65750j(requestOptions, "requestOptions");
        this.f103605a = intentConfiguration;
        this.f103606b = errorReporter;
        this.f103607c = stripeRepository;
        this.f103608d = requestOptions;
    }

    @Override // n10.InterfaceC26133i0
    /* JADX INFO: renamed from: a */
    public final Object mo77680a(InterfaceC38802c8 interfaceC38802c8, C12574u0 c12574u0, C38919p c38919p, InterfaceC30057d interfaceC30057d) {
        return m77690c(interfaceC38802c8, c12574u0.f42940w, c38919p, (AbstractC32269c) interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r9 == r1) goto L24;
     */
    @Override // n10.InterfaceC26133i0
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo77681b(y00.InterfaceC38802c8 r6, e10.C12572t0 r7, y00.C38919p r8, q83.InterfaceC30057d r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof n10.C26147p0
            if (r0 == 0) goto L13
            r0 = r9
            n10.p0 r0 = (n10.C26147p0) r0
            int r1 = r0.f103581F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f103581F = r1
            goto L1a
        L13:
            n10.p0 r0 = new n10.p0
            s83.c r9 = (s83.AbstractC32269c) r9
            r0.<init>(r5, r9)
        L1a:
            java.lang.Object r9 = r0.f103585z
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f103581F
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p505ts.AbstractC34132o.m107864I(r9)
            goto L7b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            y00.p r8 = r0.f103584y
            y00.c8 r6 = r0.f103583x
            n10.r0 r7 = r0.f103582w
            p505ts.AbstractC34132o.m107864I(r9)
            l83.n r9 = (l83.C23468n) r9
            java.lang.Object r9 = r9.f92940w
            goto L63
        L42:
            p505ts.AbstractC34132o.m107864I(r9)
            y00.d5 r7 = r7.f42935w
            h20.u2 r9 = r5.f103605a
            y00.d5 r7 = x30.AbstractC37926s0.m121460L(r7, r9)
            r0.f103582w = r5
            r0.f103583x = r6
            r0.f103584y = r8
            r0.f103581F = r4
            b10.c1 r9 = r5.f103607c
            b10.z0 r9 = (b10.C2273z0) r9
            yy.f r2 = r5.f103608d
            java.lang.Object r9 = r9.m7093p(r7, r2, r0)
            if (r9 != r1) goto L62
            goto L7a
        L62:
            r7 = r5
        L63:
            java.lang.Throwable r2 = l83.C23468n.m68037a(r9)
            if (r2 != 0) goto L7e
            y00.o4 r9 = (y00.C38915o4) r9
            r2 = 0
            r0.f103582w = r2
            r0.f103583x = r2
            r0.f103584y = r2
            r0.f103581F = r3
            java.lang.Object r9 = r7.m77690c(r6, r9, r8, r0)
            if (r9 != r1) goto L7b
        L7a:
            return r1
        L7b:
            e10.d r9 = (e10.InterfaceC12539d) r9
            return r9
        L7e:
            e10.b r6 = new e10.b
            zy.c r7 = x30.AbstractC37926s0.m121456H(r2)
            e10.t r8 = e10.C12571t.f42932a
            r6.<init>(r2, r7, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n10.C26151r0.mo77681b(y00.c8, e10.t0, y00.p, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m77690c(InterfaceC38802c8 interfaceC38802c8, C38915o4 c38915o4, C38919p c38919p, AbstractC32269c abstractC32269c) {
        C26149q0 c26149q0;
        C26151r0 c26151r0;
        Object objM7094q;
        Object objM107888l;
        if (abstractC32269c instanceof C26149q0) {
            c26149q0 = (C26149q0) abstractC32269c;
            int i13 = c26149q0.f103595F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c26149q0.f103595F = i13 - Integer.MIN_VALUE;
            } else {
                c26149q0 = new C26149q0(this, abstractC32269c);
            }
        } else {
            c26149q0 = new C26149q0(this, abstractC32269c);
        }
        Object obj = c26149q0.f103599z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c26149q0.f103595F;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                try {
                    InterfaceC2227c1 interfaceC2227c1 = this.f103607c;
                    String str = c38915o4.f167527w;
                    C39857f c39857f = this.f103608d;
                    c26149q0.f103596w = this;
                    c26149q0.f103597x = interfaceC38802c8;
                    c26149q0.f103598y = c38919p;
                    c26149q0.f103595F = 1;
                    try {
                        objM7094q = ((C2273z0) interfaceC2227c1).m7094q(str, c39857f, c26149q0);
                        if (objM7094q == enumC31071a) {
                            return enumC31071a;
                        }
                        c26151r0 = this;
                    } catch (Throwable th3) {
                        th = th3;
                        c26151r0 = this;
                        objM107888l = AbstractC34132o.m107888l(th);
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } else {
                if (i14 != 1) {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    InterfaceC38802c8 interfaceC38802c9 = (InterfaceC38802c8) c26149q0.f103596w;
                    AbstractC34132o.m107864I(obj);
                    return new C12533a(interfaceC38802c9, EnumC26121c0.None, false);
                }
                c38919p = c26149q0.f103598y;
                interfaceC38802c8 = c26149q0.f103597x;
                c26151r0 = (C26151r0) c26149q0.f103596w;
                try {
                    AbstractC34132o.m107864I(obj);
                    objM7094q = ((C23468n) obj).f92940w;
                } catch (Throwable th5) {
                    th = th5;
                    objM107888l = AbstractC34132o.m107888l(th);
                }
            }
            AbstractC34132o.m107864I(objM7094q);
            objM107888l = (C38790b6) objM7094q;
            Throwable thM68037a = C23468n.m68037a(objM107888l);
            if (thM68037a != null) {
                C2326f c2326f = c26151r0.f103606b;
                EnumC2323c enumC2323c = EnumC2323c.SAVED_PAYMENT_METHOD_RADAR_SESSION_FAILURE;
                int i15 = StripeException.f22154E;
                AbstractC35903f.m113990H(c2326f, enumC2323c, AbstractC32123d.m100024d(thM68037a), null, 4);
            }
            c26151r0.getClass();
            if (c38919p != null) {
                String str2 = c38919p.f167539w.f166962y;
            }
            c26149q0.f103596w = interfaceC38802c8;
            c26149q0.f103597x = null;
            c26149q0.f103598y = null;
            c26149q0.f103595F = 2;
            throw null;
        } catch (Exception e5) {
            return new C12535b(e5, AbstractC35785b.m113429x(e5), C12571t.f42932a);
        }
    }
}
