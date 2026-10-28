package lb;

import c93.InterfaceC4339a;
import hg3.AbstractC17269i;
import java.util.concurrent.locks.ReentrantLock;
import m83.AbstractC25265s;
import m83.C25258m;
import mc3.AbstractC25444j;
import mc3.C25442h;
import mc3.C25443i;
import n83.C26460c;
import p500tb.InterfaceC33687a;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: lb.s */
/* JADX INFO: loaded from: classes5.dex */
public final class C23576s {

    /* JADX INFO: renamed from: a */
    public final int f93498a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4339a f93499b;

    /* JADX INFO: renamed from: c */
    public final ReentrantLock f93500c = new ReentrantLock();

    /* JADX INFO: renamed from: d */
    public int f93501d;

    /* JADX INFO: renamed from: e */
    public boolean f93502e;

    /* JADX INFO: renamed from: f */
    public final C23565h[] f93503f;

    /* JADX INFO: renamed from: g */
    public final C25443i f93504g;

    /* JADX INFO: renamed from: h */
    public final C25258m f93505h;

    public C23576s(int i13, InterfaceC4339a interfaceC4339a) {
        this.f93498a = i13;
        this.f93499b = interfaceC4339a;
        this.f93503f = new C23565h[i13];
        this.f93504g = AbstractC25444j.m74674a(i13);
        this.f93505h = new C25258m(i13);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    public final Object m68218a(AbstractC32269c abstractC32269c) {
        C23574q c23574q;
        C25258m c25258m = this.f93505h;
        if (abstractC32269c instanceof C23574q) {
            c23574q = (C23574q) abstractC32269c;
            int i13 = c23574q.f93491y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c23574q.f93491y = i13 - Integer.MIN_VALUE;
            } else {
                c23574q = new C23574q(this, abstractC32269c);
            }
        } else {
            c23574q = new C23574q(this, abstractC32269c);
        }
        Object obj = c23574q.f93489w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c23574q.f93491y;
        C25443i c25443i = this.f93504g;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c23574q.f93491y = 1;
            if (c25443i.m74671a(c23574q) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        try {
            ReentrantLock reentrantLock = this.f93500c;
            reentrantLock.lock();
            try {
                if (this.f93502e) {
                    AbstractC17269i.m48901l0(21, "Connection pool is closed");
                    throw null;
                }
                if (c25258m.isEmpty() && this.f93501d < this.f93498a) {
                    C23565h c23565h = new C23565h((InterfaceC33687a) this.f93499b.invoke());
                    C23565h[] c23565hArr = this.f93503f;
                    int i15 = this.f93501d;
                    this.f93501d = i15 + 1;
                    c23565hArr[i15] = c23565h;
                    c25258m.addLast(c23565h);
                }
                C23565h c23565h2 = (C23565h) c25258m.removeLast();
                reentrantLock.unlock();
                return c23565h2;
            } catch (Throwable th3) {
                reentrantLock.unlock();
                throw th3;
            }
        } catch (Throwable th4) {
            c25443i.m74673d();
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x006b A[Catch: all -> 0x006f, TryCatch #2 {all -> 0x006f, blocks: (B:28:0x0067, B:30:0x006b, B:34:0x0073, B:38:0x007a), top: B:47:0x0067 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0071  */
    /* JADX WARN: Code duplicated, block: B:34:0x0073 A[Catch: all -> 0x006f, TryCatch #2 {all -> 0x006f, blocks: (B:28:0x0067, B:30:0x006b, B:34:0x0073, B:38:0x007a), top: B:47:0x0067 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0077 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x007a A[Catch: all -> 0x006f, TRY_LEAVE, TryCatch #2 {all -> 0x006f, blocks: (B:28:0x0067, B:30:0x006b, B:34:0x0073, B:38:0x007a), top: B:47:0x0067 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0056 -> B:24:0x0058). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: b */
    public final java.lang.Object m68219b(long r8, io.getstream.chat.android.client.C19072b r10, s83.AbstractC32269c r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof lb.C23575r
            if (r0 == 0) goto L13
            r0 = r11
            lb.r r0 = (lb.C23575r) r0
            int r1 = r0.f93493F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f93493F = r1
            goto L18
        L13:
            lb.r r0 = new lb.r
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.f93497z
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f93493F
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            long r8 = r0.f93494w
            kotlin.jvm.internal.g0 r10 = r0.f93496y
            c93.a r2 = r0.f93495x
            p505ts.AbstractC34132o.m107864I(r11)     // Catch: java.lang.Throwable -> L2e
            goto L58
        L2e:
            r11 = move-exception
            goto L62
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            p505ts.AbstractC34132o.m107864I(r11)
        L3b:
            kotlin.jvm.internal.g0 r11 = new kotlin.jvm.internal.g0
            r11.<init>()
            g20.p r2 = new g20.p     // Catch: java.lang.Throwable -> L5d
            r5 = 23
            r2.<init>(r11, r7, r4, r5)     // Catch: java.lang.Throwable -> L5d
            r0.f93495x = r10     // Catch: java.lang.Throwable -> L5d
            r0.f93496y = r11     // Catch: java.lang.Throwable -> L5d
            r0.f93494w = r8     // Catch: java.lang.Throwable -> L5d
            r0.f93493F = r3     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r2 = bc3.AbstractC3028k2.m8749c(r8, r2, r0)     // Catch: java.lang.Throwable -> L5d
            if (r2 != r1) goto L56
            return r1
        L56:
            r2 = r10
            r10 = r11
        L58:
            r11 = r10
            r10 = r2
            r2 = r0
            r0 = r4
            goto L67
        L5d:
            r2 = move-exception
            r6 = r2
            r2 = r10
            r10 = r11
            r11 = r6
        L62:
            r6 = r11
            r11 = r10
            r10 = r2
            r2 = r0
            r0 = r6
        L67:
            boolean r5 = r0 instanceof kotlinx.coroutines.TimeoutCancellationException     // Catch: java.lang.Throwable -> L6f
            if (r5 == 0) goto L71
            r10.invoke()     // Catch: java.lang.Throwable -> L6f
            goto L78
        L6f:
            r8 = move-exception
            goto L7b
        L71:
            if (r0 != 0) goto L7a
            java.lang.Object r11 = r11.f89336w     // Catch: java.lang.Throwable -> L6f
            if (r11 == 0) goto L78
            return r11
        L78:
            r0 = r2
            goto L3b
        L7a:
            throw r0     // Catch: java.lang.Throwable -> L6f
        L7b:
            java.lang.Object r9 = r11.f89336w
            lb.h r9 = (lb.C23565h) r9
            if (r9 == 0) goto L84
            r7.m68222e(r9)
        L84:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.C23576s.m68219b(long, io.getstream.chat.android.client.b, s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: c */
    public final void m68220c() {
        ReentrantLock reentrantLock = this.f93500c;
        reentrantLock.lock();
        try {
            this.f93502e = true;
            for (C23565h c23565h : this.f93503f) {
                if (c23565h != null) {
                    c23565h.close();
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m68221d(StringBuilder sb4) {
        C25258m c25258m = this.f93505h;
        ReentrantLock reentrantLock = this.f93500c;
        reentrantLock.lock();
        try {
            C26460c c26460cM119000x = AbstractC37056f.m119000x();
            int i13 = c25258m.f99142y;
            for (int i14 = 0; i14 < i13; i14++) {
                c26460cM119000x.add(c25258m.get(i14));
            }
            C26460c c26460cM118988k = AbstractC37056f.m118988k(c26460cM119000x);
            sb4.append('\t' + toString() + " (");
            sb4.append("capacity=" + this.f93498a + ", ");
            StringBuilder sb5 = new StringBuilder();
            sb5.append("permits=");
            C25443i c25443i = this.f93504g;
            c25443i.getClass();
            sb5.append(Math.max(C25442h.f99632G.get(c25443i), 0));
            sb5.append(", ");
            sb4.append(sb5.toString());
            sb4.append("queue=(size=" + c26460cM118988k.mo74007a() + ")[" + AbstractC25265s.m74110N0(c26460cM118988k, null, null, null, null, 63) + ']');
            sb4.append(")");
            sb4.append('\n');
            C23565h[] c23565hArr = this.f93503f;
            int length = c23565hArr.length;
            int i15 = 0;
            for (int i16 = 0; i16 < length; i16++) {
                C23565h c23565h = c23565hArr[i16];
                i15++;
                StringBuilder sb6 = new StringBuilder();
                sb6.append("\t\t[");
                sb6.append(i15);
                sb6.append("] - ");
                sb6.append(c23565h != null ? c23565h.f93458w.toString() : null);
                sb4.append(sb6.toString());
                sb4.append('\n');
                if (c23565h != null) {
                    c23565h.m68215k(sb4);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m68222e(C23565h connection) {
        AbstractC22676k.m65750j(connection, "connection");
        ReentrantLock reentrantLock = this.f93500c;
        reentrantLock.lock();
        try {
            this.f93505h.addLast(connection);
            reentrantLock.unlock();
            this.f93504g.m74673d();
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }
}
