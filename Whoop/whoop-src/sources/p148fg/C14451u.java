package p148fg;

import aws.smithy.kotlin.runtime.retries.delay.RetryCapacityExceededException;
import io.sentry.hints.C20363j;
import l83.C23454a0;
import mc3.AbstractC25438d;
import mc3.C25437c;
import mc3.InterfaceC25435a;
import p437qt.C30582e;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationUnit;
import p715kotlin.time.TimeMark;
import p715kotlin.time.TimeSource;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: fg.u */
/* JADX INFO: loaded from: classes.dex */
public final class C14451u implements InterfaceC14444n {

    /* JADX INFO: renamed from: f */
    public static final C20363j f52742f = new C20363j(19);

    /* JADX INFO: renamed from: a */
    public final C30582e f52743a;

    /* JADX INFO: renamed from: b */
    public final TimeSource.Monotonic f52744b;

    /* JADX INFO: renamed from: c */
    public int f52745c;

    /* JADX INFO: renamed from: d */
    public TimeMark f52746d;

    /* JADX INFO: renamed from: e */
    public final C25437c f52747e;

    public C14451u(C30582e c30582e) {
        TimeSource.Monotonic timeSource = TimeSource.Monotonic.INSTANCE;
        AbstractC22676k.m65750j(timeSource, "timeSource");
        this.f52743a = c30582e;
        this.f52744b = timeSource;
        this.f52745c = 500;
        this.f52746d = timeSource.markNow();
        this.f52747e = AbstractC25438d.m74669a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m41170a(C14451u c14451u, int i13, AbstractC32269c abstractC32269c) {
        C14450t c14450t;
        C25437c c25437c;
        if (abstractC32269c instanceof C14450t) {
            c14450t = (C14450t) abstractC32269c;
            int i14 = c14450t.f52737E;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c14450t.f52737E = i14 - Integer.MIN_VALUE;
            } else {
                c14450t = new C14450t(c14451u, abstractC32269c);
            }
        } else {
            c14450t = new C14450t(c14451u, abstractC32269c);
        }
        Object obj = c14450t.f52740y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c14450t.f52737E;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            C25437c c25437c2 = c14451u.f52747e;
            c14450t.f52739x = c25437c2;
            c14450t.f52738w = i13;
            c14450t.f52737E = 1;
            if (c25437c2.mo68211b(c14450t) == enumC31071a) {
                return enumC31071a;
            }
            c25437c = c25437c2;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = c14450t.f52738w;
            c25437c = c14450t.f52739x;
            AbstractC34132o.m107864I(obj);
        }
        try {
            c14451u.m41173d();
            c14451u.f52743a.getClass();
            c14451u.f52745c = Math.min(500, c14451u.f52745c + i13);
            c14451u.f52746d = c14451u.f52744b.markNow();
            return C23454a0.f92919a;
        } finally {
            c25437c.mo68214i(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m41171b(AbstractC32269c abstractC32269c) {
        C14448r c14448r;
        if (abstractC32269c instanceof C14448r) {
            c14448r = (C14448r) abstractC32269c;
            int i13 = c14448r.f52731y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c14448r.f52731y = i13 - Integer.MIN_VALUE;
            } else {
                c14448r = new C14448r(this, abstractC32269c);
            }
        } else {
            c14448r = new C14448r(this, abstractC32269c);
        }
        Object obj = c14448r.f52729w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c14448r.f52731y;
        C30582e c30582e = this.f52743a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c30582e.getClass();
            c14448r.f52731y = 1;
            if (m41172c(0, c14448r) == obj2) {
                return obj2;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        c30582e.getClass();
        return new C14447q(this, 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m41172c(int i13, AbstractC32269c abstractC32269c) throws Throwable {
        C14449s c14449s;
        InterfaceC25435a interfaceC25435a;
        Throwable th3;
        InterfaceC25435a interfaceC25435a2;
        if (abstractC32269c instanceof C14449s) {
            c14449s = (C14449s) abstractC32269c;
            int i14 = c14449s.f52732E;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c14449s.f52732E = i14 - Integer.MIN_VALUE;
            } else {
                c14449s = new C14449s(this, abstractC32269c);
            }
        } else {
            c14449s = new C14449s(this, abstractC32269c);
        }
        Object obj = c14449s.f52735y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c14449s.f52732E;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj);
                interfaceC25435a = this.f52747e;
                c14449s.f52734x = interfaceC25435a;
                c14449s.f52733w = i13;
                c14449s.f52732E = 1;
                if (interfaceC25435a.mo68211b(c14449s) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i15 != 1) {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC25435a2 = c14449s.f52734x;
                    try {
                        AbstractC34132o.m107864I(obj);
                        this.f52745c = 0;
                        this.f52746d = this.f52744b.markNow();
                        C23454a0 c23454a0 = C23454a0.f92919a;
                        interfaceC25435a2.mo68214i(null);
                        return c23454a0;
                    } catch (Throwable th4) {
                        th3 = th4;
                        interfaceC25435a2.mo68214i(null);
                        throw th3;
                    }
                }
                i13 = c14449s.f52733w;
                InterfaceC25435a interfaceC25435a3 = c14449s.f52734x;
                AbstractC34132o.m107864I(obj);
                interfaceC25435a = interfaceC25435a3;
            }
            m41173d();
            int i16 = this.f52745c;
            if (i13 > i16) {
                this.f52743a.getClass();
                throw new RetryCapacityExceededException("Insufficient capacity to attempt retry");
            }
            this.f52745c = i16 - i13;
            interfaceC25435a2 = interfaceC25435a;
            this.f52746d = this.f52744b.markNow();
            C23454a0 c23454a1 = C23454a0.f92919a;
            interfaceC25435a2.mo68214i(null);
            return c23454a1;
        } catch (Throwable th5) {
            InterfaceC25435a interfaceC25435a4 = interfaceC25435a;
            th3 = th5;
            interfaceC25435a2 = interfaceC25435a4;
            interfaceC25435a2.mo68214i(null);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m41173d() {
        double dM134298toDoubleimpl = Duration.m134298toDoubleimpl(this.f52746d.mo134250elapsedNowUwyO8pc(), DurationUnit.SECONDS);
        this.f52743a.getClass();
        this.f52745c = Math.min(500, this.f52745c + ((int) Math.floor(((double) 0) * dM134298toDoubleimpl)));
    }
}
