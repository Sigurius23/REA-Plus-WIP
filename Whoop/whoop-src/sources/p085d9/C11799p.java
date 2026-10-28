package p085d9;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.profileinstaller.RunnableC1650a;
import ar0.C1926a;
import gm.C15990r;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import l83.C23454a0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p027b3.AbstractC2351b;
import p309lo.C24549g;
import p309lo.C24562t;
import p309lo.C24563u;
import p309lo.C24564v;
import p309lo.InterfaceC24550h;
import p309lo.InterfaceC24551i;
import p326mf.C25484d;
import p326mf.InterfaceC25488h;
import p441qx.C30706d0;
import p478s3.AbstractC32098d;
import p505ts.AbstractC34132o;
import p508ty.C34249c;
import p550vd.AbstractC35903f;
import p558vp.AbstractC36259c;
import p581we.AbstractC37200p;
import p581we.C37176a0;
import p581we.C37187g;
import p581we.C37189h;
import p581we.C37199o;
import p581we.C37206v;
import p581we.EnumC37179c;
import p581we.EnumC37183e;
import p612xe.C38226b;
import p612xe.C38228d;
import p612xe.C38229e;
import p647yf.C39498k;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import se.AbstractC32417h;
import tg.AbstractC33774f;
import ug.EnumC34931t;
import va3.AbstractC35846d;
import wd3.C37168b;
import xa0.C38136a;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: d9.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C11799p {

    /* JADX INFO: renamed from: a */
    public boolean f38300a;

    /* JADX INFO: renamed from: b */
    public final Object f38301b;

    /* JADX INFO: renamed from: c */
    public final Object f38302c;

    /* JADX INFO: renamed from: d */
    public Object f38303d;

    /* JADX INFO: renamed from: e */
    public Object f38304e;

    /* JADX INFO: renamed from: f */
    public final Object f38305f;

    /* JADX INFO: renamed from: g */
    public Object f38306g;

    public C11799p(C34249c c34249c, C37199o signer, C37187g c37187g, byte[] previousSignature, C25484d c25484d) {
        AbstractC22676k.m65750j(signer, "signer");
        AbstractC22676k.m65750j(previousSignature, "previousSignature");
        this.f38301b = c34249c;
        this.f38302c = signer;
        this.f38303d = c37187g;
        this.f38304e = previousSignature;
        this.f38305f = c25484d;
        this.f38306g = new C39498k();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if (r13 == r3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
    
        if (r13 == r3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0094, code lost:
    
        if (r13 == r3) goto L42;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m31617a(s83.AbstractC32269c r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f38301b
            ty.c r0 = (p508ty.C34249c) r0
            java.lang.Object r1 = r12.f38306g
            yf.k r1 = (p647yf.C39498k) r1
            boolean r2 = r13 instanceof p612xe.C38225a
            if (r2 == 0) goto L1b
            r2 = r13
            xe.a r2 = (p612xe.C38225a) r2
            int r3 = r2.f163856y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f163856y = r3
            goto L20
        L1b:
            xe.a r2 = new xe.a
            r2.<init>(r12, r13)
        L20:
            java.lang.Object r13 = r2.f163854w
            r83.a r3 = r83.EnumC31071a.f128113w
            int r4 = r2.f163856y
            r5 = 0
            r7 = 3
            r8 = 2
            r9 = 1
            if (r4 == 0) goto L47
            if (r4 == r9) goto L43
            if (r4 == r8) goto L3f
            if (r4 != r7) goto L37
            p505ts.AbstractC34132o.m107864I(r13)
            goto L97
        L37:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L3f:
            p505ts.AbstractC34132o.m107864I(r13)
            goto L84
        L43:
            p505ts.AbstractC34132o.m107864I(r13)
            goto L78
        L47:
            p505ts.AbstractC34132o.m107864I(r13)
            ne3.h r13 = r1.f169914w
            long r10 = r13.f105866x
            int r13 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r13 <= 0) goto L55
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            return r13
        L55:
            boolean r13 = r0.m108302s()
            r4 = 0
            if (r13 == 0) goto L61
            boolean r13 = r12.f38300a
            if (r13 == 0) goto L61
            goto La5
        L61:
            java.lang.Object r13 = r12.f38303d
            we.g r13 = (p581we.C37187g) r13
            we.b0 r13 = r13.f159012k
            we.a0 r10 = p581we.C37176a0.f158969b
            boolean r13 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r13, r10)
            if (r13 == 0) goto L7b
            r2.f163856y = r9
            java.lang.Object r13 = r12.m31622f(r4, r2)
            if (r13 != r3) goto L78
            goto L96
        L78:
            yf.k r13 = (p647yf.C39498k) r13
            goto L86
        L7b:
            r2.f163856y = r8
            java.lang.Object r13 = r12.m31620d(r4, r2)
            if (r13 != r3) goto L84
            goto L96
        L84:
            yf.k r13 = (p647yf.C39498k) r13
        L86:
            if (r13 != 0) goto L9b
            boolean r13 = r0.m108302s()
            if (r13 == 0) goto L9d
            r2.f163856y = r7
            java.lang.Object r13 = r12.m31619c(r2)
            if (r13 != r3) goto L97
        L96:
            return r3
        L97:
            yf.k r13 = (p647yf.C39498k) r13
            r12.f38300a = r9
        L9b:
            r4 = r13
            goto La5
        L9d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "Expected underlying reader to be closed"
            r13.<init>(r0)
            throw r13
        La5:
            if (r4 == 0) goto Lac
            java.lang.String r13 = "\r\n"
            r4.mo126148z(r8, r13)
        Lac:
            if (r4 == 0) goto Lb7
            long r2 = r1.mo126144C(r4)
            java.lang.Long r13 = new java.lang.Long
            r13.<init>(r2)
        Lb7:
            ne3.h r13 = r1.f169914w
            long r0 = r13.f105866x
            int r13 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r13 <= 0) goto Lc0
            goto Lc1
        Lc0:
            r9 = 0
        Lc1:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r9)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p085d9.C11799p.m31617a(s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public void m31618b() {
        C24564v c24564v = (C24564v) this.f38302c;
        ArrayDeque arrayDeque = (ArrayDeque) this.f38305f;
        ArrayDeque arrayDeque2 = (ArrayDeque) this.f38306g;
        if (arrayDeque2.isEmpty()) {
            return;
        }
        if (!c24564v.f95865a.hasMessages(0)) {
            c24564v.getClass();
            C24563u c24563uM71648b = C24564v.m71648b();
            Message messageObtainMessage = c24564v.f95865a.obtainMessage(0);
            c24563uM71648b.f95863a = messageObtainMessage;
            Handler handler = c24564v.f95865a;
            messageObtainMessage.getClass();
            handler.sendMessageAtFrontOfQueue(messageObtainMessage);
            c24563uM71648b.m71646a();
        }
        boolean zIsEmpty = arrayDeque.isEmpty();
        arrayDeque.addAll(arrayDeque2);
        arrayDeque2.clear();
        if (zIsEmpty) {
            while (!arrayDeque.isEmpty()) {
                ((Runnable) arrayDeque.peekFirst()).run();
                arrayDeque.removeFirst();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: c */
    public Object m31619c(AbstractC32269c abstractC32269c) throws IOException {
        C38226b c38226b;
        C39498k c39498k;
        C11799p c11799p;
        C39498k c39498k2;
        C25484d c25484d = (C25484d) this.f38305f;
        if (abstractC32269c instanceof C38226b) {
            c38226b = (C38226b) abstractC32269c;
            int i13 = c38226b.f163857E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c38226b.f163857E = i13 - Integer.MIN_VALUE;
            } else {
                c38226b = new C38226b(this, abstractC32269c);
            }
        } else {
            c38226b = new C38226b(this, abstractC32269c);
        }
        Object objM31620d = c38226b.f163860y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c38226b.f163857E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM31620d);
            if (AbstractC22676k.m65745e(((C37187g) this.f38303d).f159012k, C37176a0.f158969b)) {
                C39498k c39498k3 = new C39498k();
                c38226b.f163857E = 1;
                objM31620d = m31622f(c39498k3, c38226b);
                if (objM31620d != enumC31071a) {
                }
            } else {
                C39498k c39498k4 = new C39498k();
                c38226b.f163857E = 2;
                objM31620d = m31620d(c39498k4, c38226b);
                if (objM31620d != enumC31071a) {
                }
            }
            return enumC31071a;
        }
        if (i14 == 1 || i14 == 2) {
            AbstractC34132o.m107864I(objM31620d);
        } else {
            if (i14 == 3) {
                c11799p = c38226b.f163859x;
                c39498k = c38226b.f163858w;
                AbstractC34132o.m107864I(objM31620d);
                c38226b.f163858w = c39498k;
                c38226b.f163859x = null;
                c38226b.f163857E = 4;
                objM31620d = c11799p.m31621e((InterfaceC25488h) objM31620d, c38226b);
                if (objM31620d != enumC31071a) {
                    c39498k2 = c39498k;
                }
                return enumC31071a;
            }
            if (i14 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c39498k2 = c38226b.f163858w;
            AbstractC34132o.m107864I(objM31620d);
        }
        c39498k2.mo126144C((C39498k) objM31620d);
        return c39498k2;
        C39498k c39498k5 = (C39498k) objM31620d;
        if (c39498k5 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (c25484d.f59467c.isEmpty()) {
            return c39498k5;
        }
        c38226b.f163858w = c39498k5;
        c38226b.f163859x = this;
        c38226b.f163857E = 3;
        Object objM115704o0 = AbstractC36259c.m115704o0(c25484d, c38226b);
        if (objM115704o0 != enumC31071a) {
            c39498k = c39498k5;
            objM31620d = objM115704o0;
            c11799p = this;
            c38226b.f163858w = c39498k;
            c38226b.f163859x = null;
            c38226b.f163857E = 4;
            objM31620d = c11799p.m31621e((InterfaceC25488h) objM31620d, c38226b);
            if (objM31620d != enumC31071a) {
                c39498k2 = c39498k;
                c39498k2.mo126144C((C39498k) objM31620d);
                return c39498k2;
            }
        }
        return enumC31071a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:27:0x0093  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:32:0x010f A[LOOP:0: B:30:0x010c->B:32:0x010f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0133  */
    /* JADX WARN: Code duplicated, block: B:38:0x0178  */
    /* JADX WARN: Code duplicated, block: B:41:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:43:0x01c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r1 == r3) goto L37;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m31620d(p647yf.C39498k r23, s83.AbstractC32269c r24) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p085d9.C11799p.m31620d(yf.k, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: e */
    public Object m31621e(InterfaceC25488h interfaceC25488h, AbstractC32269c abstractC32269c) throws IOException {
        C38228d c38228d;
        InterfaceC25488h trailers;
        C37187g c37187g = (C37187g) this.f38303d;
        if (abstractC32269c instanceof C38228d) {
            c38228d = (C38228d) abstractC32269c;
            int i13 = c38228d.f163869z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c38228d.f163869z = i13 - Integer.MIN_VALUE;
            } else {
                c38228d = new C38228d(this, abstractC32269c);
            }
        } else {
            c38228d = new C38228d(this, abstractC32269c);
        }
        Object c37189h = c38228d.f163867x;
        Object obj = EnumC31071a.f128113w;
        int i14 = c38228d.f163869z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(c37189h);
            C37199o c37199o = (C37199o) this.f38302c;
            byte[] prevSignature = (byte[]) this.f38304e;
            C37187g c37187gM119184x = c37187g.m119184x();
            c37187gM119184x.f159008g = EnumC37179c.f158977z;
            c37187gM119184x.f159012k = C37206v.f159056a;
            C37187g c37187g2 = new C37187g(c37187gM119184x);
            c38228d.f163866w = interfaceC25488h;
            c38228d.f163869z = 1;
            c37199o.getClass();
            InterfaceC30063j context = c38228d.getContext();
            String qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37199o.class).getQualifiedName();
            if (qualifiedName == null) {
                throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object");
            }
            C15990r c15990rM113984B = AbstractC35903f.m113984B(context, qualifiedName);
            AbstractC2351b abstractC2351bM119243a = AbstractC37200p.m119243a(c37187g2.f159007f);
            List<Map.Entry> listM74152u1 = AbstractC25265s.m74152u1(interfaceC25488h.mo44479b(), new C30706d0(7));
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM74152u1, 10));
            for (Map.Entry entry : listM74152u1) {
                StringBuilder sb4 = new StringBuilder();
                String lowerCase = ((String) entry.getKey()).toLowerCase(Locale.ROOT);
                AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
                sb4.append(lowerCase);
                sb4.append(":");
                sb4.append(AbstractC25265s.m74110N0((Iterable) entry.getValue(), ",", null, null, new C37168b(5), 30));
                sb4.append("\n");
                arrayList.add(AbstractC39421y.m125919D(sb4.toString()));
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                next = AbstractC25260n.m74030F0((byte[]) next, (byte[]) it.next());
            }
            byte[] trailingHeaders = (byte[]) next;
            abstractC2351bM119243a.getClass();
            AbstractC22676k.m65750j(trailingHeaders, "trailingHeaders");
            AbstractC22676k.m65750j(prevSignature, "prevSignature");
            String str = ((EnumC37183e) abstractC2351bM119243a.f9291b).f158986w.concat("-TRAILER") + '\n' + c37187g2.f159005d.m110113b(EnumC34931t.f147049x) + '\n' + AbstractC32098d.m99842h(c37187g2) + '\n' + AbstractC39421y.m125916A(prevSignature) + '\n' + AbstractC33774f.m106780a(AbstractC32417h.m101180K(trailingHeaders, abstractC2351bM119243a.mo7266t()));
            c15990rM113984B.mo394s(null, new C1926a(str, 14));
            String strMo119147d = abstractC2351bM119243a.mo119147d(str, abstractC2351bM119243a.mo119146a(c37187g2));
            c15990rM113984B.mo396u(null, new C1926a(strMo119147d, 15));
            c37189h = new C37189h(C23454a0.f92919a, AbstractC39421y.m125919D(strMo119147d));
            if (c37189h == obj) {
                return obj;
            }
            trailers = interfaceC25488h;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            trailers = c38228d.f163866w;
            AbstractC34132o.m107864I(c37189h);
        }
        byte[] bArr = ((C37189h) c37189h).f159019b;
        this.f38304e = bArr;
        C39498k c39498k = new C39498k();
        AbstractC22676k.m65750j(trailers, "trailers");
        for (Map.Entry entry2 : AbstractC25265s.m74152u1(trailers.mo44479b(), new C30706d0(9))) {
            String str2 = (String) entry2.getKey();
            c39498k.mo126148z(str2.length(), str2);
            c39498k.mo126148z(1, ":");
            String strM74110N0 = AbstractC25265s.m74110N0((Iterable) entry2.getValue(), ",", null, null, new C38136a(15), 30);
            c39498k.mo126148z(strM74110N0.length(), strM74110N0);
            c39498k.mo126148z(2, "\r\n");
        }
        if (!AbstractC22676k.m65745e(c37187g.f159012k, C37176a0.f158969b)) {
            String str3 = "x-amz-trailer-signature:" + AbstractC39421y.m125916A(bArr) + "\r\n";
            c39498k.mo126148z(str3.length(), str3);
        }
        return c39498k;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public Object m31622f(C39498k c39498k, AbstractC32269c abstractC32269c) throws IOException {
        C38229e c38229e;
        if (abstractC32269c instanceof C38229e) {
            c38229e = (C38229e) abstractC32269c;
            int i13 = c38229e.f163872y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c38229e.f163872y = i13 - Integer.MIN_VALUE;
            } else {
                c38229e = new C38229e(this, abstractC32269c);
            }
        } else {
            c38229e = new C38229e(this, abstractC32269c);
        }
        Object objM31624h = c38229e.f163870w;
        Object obj = EnumC31071a.f128113w;
        int i14 = c38229e.f163872y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM31624h);
            if (c39498k == null) {
                C34249c c34249c = (C34249c) this.f38301b;
                c38229e.f163872y = 1;
                objM31624h = m31624h(c34249c, c38229e);
                if (objM31624h == obj) {
                    return obj;
                }
            }
            C39498k c39498k2 = new C39498k();
            long j7 = c39498k.f169914w.f105866x;
            AbstractC35846d.m113779c(16);
            String string = Long.toString(j7, 16);
            AbstractC22676k.m65749i(string, "toString(...)");
            c39498k2.mo126148z(string.length(), string);
            c39498k2.mo126148z(2, "\r\n");
            c39498k2.mo126144C(c39498k);
            return c39498k2;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(objM31624h);
        c39498k = (C39498k) objM31624h;
        if (c39498k == null) {
            return null;
        }
        C39498k c39498k3 = new C39498k();
        long j13 = c39498k.f169914w.f105866x;
        AbstractC35846d.m113779c(16);
        String string2 = Long.toString(j13, 16);
        AbstractC22676k.m65749i(string2, "toString(...)");
        c39498k3.mo126148z(string2.length(), string2);
        c39498k3.mo126148z(2, "\r\n");
        c39498k3.mo126144C(c39498k);
        return c39498k3;
    }

    /* JADX INFO: renamed from: g */
    public void m31623g(int i13, InterfaceC24550h interfaceC24550h) {
        ((ArrayDeque) this.f38306g).add(new RunnableC1650a(new CopyOnWriteArraySet((CopyOnWriteArraySet) this.f38304e), i13, interfaceC24550h, 3));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    /* JADX WARN: Code duplicated, block: B:23:0x006f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0070 -> B:12:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: h */
    public java.lang.Object m31624h(p508ty.C34249c r14, s83.AbstractC32269c r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof p612xe.C38230f
            if (r0 == 0) goto L13
            r0 = r15
            xe.f r0 = (p612xe.C38230f) r0
            int r1 = r0.f163874F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f163874F = r1
            goto L18
        L13:
            xe.f r0 = new xe.f
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f163878z
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f163874F
            r3 = 0
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 != r5) goto L33
            long r6 = r0.f163877y
            yf.k r14 = r0.f163876x
            ty.c r2 = r0.f163875w
            p505ts.AbstractC34132o.m107864I(r15)
            r12 = r0
            r0 = r14
            r14 = r2
        L31:
            r2 = r12
            goto L74
        L33:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3b:
            p505ts.AbstractC34132o.m107864I(r15)
            yf.k r15 = new yf.k
            r15.<init>()
            r6 = 65536(0x10000, double:3.2379E-319)
        L46:
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 <= 0) goto L85
            r0.f163875w = r14
            r0.f163876x = r15
            r0.f163877y = r6
            r0.f163874F = r5
            int r2 = r14.f143659w
            switch(r2) {
                case 18: goto L65;
                default: goto L57;
            }
        L57:
            java.lang.Object r2 = r14.f143660x
            yf.m r2 = (p647yf.InterfaceC39500m) r2
            long r8 = r2.mo119145c0(r15, r6)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r8)
            goto L6d
        L65:
            java.lang.Object r2 = r14.f143660x
            yf.o r2 = (p647yf.InterfaceC39502o) r2
            java.lang.Object r2 = r2.mo106283b(r15, r6, r0)
        L6d:
            if (r2 != r1) goto L70
            return r1
        L70:
            r12 = r0
            r0 = r15
            r15 = r2
            goto L31
        L74:
            java.lang.Number r15 = (java.lang.Number) r15
            long r8 = r15.longValue()
            r10 = -1
            int r15 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r15 == 0) goto L84
            long r6 = r6 - r8
            r15 = r0
            r0 = r2
            goto L46
        L84:
            r15 = r0
        L85:
            ne3.h r14 = r15.f169914w
            long r0 = r14.f105866x
            int r14 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r14 != 0) goto L8f
            r14 = 0
            return r14
        L8f:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p085d9.C11799p.m31624h(ty.c, s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: i */
    public void m31625i(int i13, InterfaceC24550h interfaceC24550h) {
        m31623g(i13, interfaceC24550h);
        m31618b();
    }

    public C11799p(Looper looper, C24562t c24562t, InterfaceC24551i interfaceC24551i) {
        this(new CopyOnWriteArraySet(), looper, c24562t, interfaceC24551i);
    }

    public C11799p(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, C24562t c24562t, InterfaceC24551i interfaceC24551i) {
        this.f38301b = c24562t;
        this.f38304e = copyOnWriteArraySet;
        this.f38303d = interfaceC24551i;
        this.f38305f = new ArrayDeque();
        this.f38306g = new ArrayDeque();
        this.f38302c = c24562t.m71645a(looper, new C24549g(this, 0));
    }

    public C11799p(Context context) {
        this.f38301b = context;
        this.f38302c = C11781b.f38191c;
        this.f38304e = C11808y.f38398a;
        this.f38305f = InterfaceC11798o.f38299a;
    }
}
