package x20;

import android.os.SystemClock;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1601k1;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import com.stripe.android.model.StripeIntent$Status;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import f30.C14042e;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s40.C32139c0;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: x20.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C37855w extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w */
    public final C37851s f162051w;

    /* JADX INFO: renamed from: x */
    public final C14042e f162052x;

    /* JADX INFO: renamed from: y */
    public final C13045h2 f162053y;

    /* JADX INFO: renamed from: z */
    public final C13045h2 f162054z;

    public C37855w(C37851s c37851s, C14042e c14042e, C37838f c37838f, C1601k1 c1601k1) {
        long rawValue = c37851s.f162035b;
        this.f162051w = c37851s;
        this.f162052x = c14042e;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new C37848p(c37851s.f162035b, c37851s.f162037d, EnumC37847o.f162019w, c37851s.f162039f != null));
        this.f162053y = c13045h2M36593c;
        this.f162054z = c13045h2M36593c;
        Long l7 = (Long) c1601k1.m5001b("KEY_CURRENT_POLLING_START_TIME");
        if (l7 == null) {
            c1601k1.m5004e(Long.valueOf(SystemClock.elapsedRealtime()), "KEY_CURRENT_POLLING_START_TIME");
        }
        rawValue = l7 != null ? ((Duration) AbstractC30060g.m92091M(Duration.m134260boximpl(DurationKt.toDuration((Duration.m134273getInWholeMillisecondsimpl(rawValue) + l7.longValue()) - SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS)), Duration.m134260boximpl(Duration.INSTANCE.m134357getZEROUwyO8pc()))).getRawValue() : rawValue;
        InterfaceC30057d interfaceC30057d = null;
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C37849q(this, rawValue, (InterfaceC30057d) null), 3);
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C37850r(this, interfaceC30057d, 0), 3);
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C37849q(rawValue, this, (InterfaceC30057d) null), 3);
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C32139c0(this, interfaceC30057d, 25), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if (r8.m121380l(r0) == r1) goto L24;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m121378g(x20.C37855w r8, s83.AbstractC32269c r9) {
        /*
            boolean r0 = r9 instanceof x20.C37852t
            if (r0 == 0) goto L13
            r0 = r9
            x20.t r0 = (x20.C37852t) r0
            int r1 = r0.f162043z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f162043z = r1
            goto L18
        L13:
            x20.t r0 = new x20.t
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f162041x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f162043z
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            p505ts.AbstractC34132o.m107864I(r9)
            goto L66
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            x20.w r8 = r0.f162040w
            p505ts.AbstractC34132o.m107864I(r9)
            goto L5b
        L39:
            p505ts.AbstractC34132o.m107864I(r9)
            f30.e r9 = r8.f162052x
            bc3.c2 r2 = r9.f50111e
            if (r2 == 0) goto L45
            r2.cancel(r3)
        L45:
            r9.f50111e = r3
            kotlin.time.Duration$Companion r9 = p715kotlin.time.Duration.INSTANCE
            r9 = 3
            kotlin.time.DurationUnit r2 = p715kotlin.time.DurationUnit.SECONDS
            long r6 = p715kotlin.time.DurationKt.toDuration(r9, r2)
            r0.f162040w = r8
            r0.f162043z = r5
            java.lang.Object r9 = bc3.AbstractC3034m0.m8783c(r6, r0)
            if (r9 != r1) goto L5b
            goto L65
        L5b:
            r0.f162040w = r3
            r0.f162043z = r4
            java.lang.Object r8 = r8.m121380l(r0)
            if (r8 != r1) goto L66
        L65:
            return r1
        L66:
            l83.a0 r8 = l83.C23454a0.f92919a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x20.C37855w.m121378g(x20.w, s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: j */
    public final void m121379j() {
        C13045h2 c13045h2;
        Object value;
        do {
            c13045h2 = this.f162053y;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, C37848p.m121377a((C37848p) value, 0L, EnumC37847o.f162022z, false, 3)));
        C14042e c14042e = this.f162052x;
        C2996c2 c2996c2 = c14042e.f50111e;
        if (c2996c2 != null) {
            c2996c2.cancel((CancellationException) null);
        }
        c14042e.f50111e = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m121380l(AbstractC32269c abstractC32269c) {
        C37854v c37854v;
        C37855w c37855w;
        Object value;
        Object value2;
        if (abstractC32269c instanceof C37854v) {
            c37854v = (C37854v) abstractC32269c;
            int i13 = c37854v.f162050z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c37854v.f162050z = i13 - Integer.MIN_VALUE;
            } else {
                c37854v = new C37854v(this, abstractC32269c);
            }
        } else {
            c37854v = new C37854v(this, abstractC32269c);
        }
        Object objM39956a = c37854v.f162048x;
        Object obj = EnumC31071a.f128113w;
        int i14 = c37854v.f162050z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM39956a);
            c37854v.f162047w = this;
            c37854v.f162050z = 1;
            objM39956a = this.f162052x.m39956a(c37854v);
            if (objM39956a == obj) {
                return obj;
            }
            c37855w = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c37855w = c37854v.f162047w;
            AbstractC34132o.m107864I(objM39956a);
        }
        if (((StripeIntent$Status) objM39956a) == StripeIntent$Status.Succeeded) {
            C13045h2 c13045h2 = c37855w.f162053y;
            do {
                value2 = c13045h2.getValue();
            } while (!c13045h2.m36569i(value2, C37848p.m121377a((C37848p) value2, 0L, EnumC37847o.f162020x, false, 11)));
        } else {
            C13045h2 c13045h3 = c37855w.f162053y;
            do {
                value = c13045h3.getValue();
            } while (!c13045h3.m36569i(value, C37848p.m121377a((C37848p) value, 0L, EnumC37847o.f162021y, false, 11)));
        }
        return C23454a0.f92919a;
    }
}
