package p148fg;

import bc3.AbstractC3034m0;
import gg.EnumC15819f;
import kr.C22786e;
import l83.C23454a0;
import mc3.AbstractC25438d;
import mc3.C25437c;
import mc3.InterfaceC25435a;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import p715kotlin.time.TimeMark;
import p715kotlin.time.TimeSource;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: fg.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C14435e implements InterfaceC14443m {

    /* JADX INFO: renamed from: j */
    public static final C22786e f52691j = new C22786e(29);

    /* JADX INFO: renamed from: a */
    public final C14432b f52692a;

    /* JADX INFO: renamed from: b */
    public final TimeSource.Monotonic f52693b;

    /* JADX INFO: renamed from: c */
    public final C14436f f52694c;

    /* JADX INFO: renamed from: d */
    public final C14437g f52695d;

    /* JADX INFO: renamed from: e */
    public double f52696e;

    /* JADX INFO: renamed from: f */
    public TimeMark f52697f;

    /* JADX INFO: renamed from: g */
    public double f52698g;

    /* JADX INFO: renamed from: h */
    public double f52699h;

    /* JADX INFO: renamed from: i */
    public final C25437c f52700i;

    public C14435e(C14432b c14432b) {
        TimeSource.Monotonic timeSource = TimeSource.Monotonic.INSTANCE;
        C14436f c14436f = new C14436f(c14432b, timeSource);
        C14437g c14437g = new C14437g(c14432b, timeSource);
        AbstractC22676k.m65750j(timeSource, "timeSource");
        this.f52692a = c14432b;
        this.f52693b = timeSource;
        this.f52694c = c14436f;
        this.f52695d = c14437g;
        this.f52700i = AbstractC25438d.m74669a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m41162a(int i13, AbstractC32269c abstractC32269c) throws Throwable {
        C14433c c14433c;
        InterfaceC25435a interfaceC25435a;
        int i14;
        Throwable th3;
        InterfaceC25435a interfaceC25435a2;
        if (abstractC32269c instanceof C14433c) {
            c14433c = (C14433c) abstractC32269c;
            int i15 = c14433c.f52681F;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                c14433c.f52681F = i15 - Integer.MIN_VALUE;
            } else {
                c14433c = new C14433c(this, abstractC32269c);
            }
        } else {
            c14433c = new C14433c(this, abstractC32269c);
        }
        Object obj = c14433c.f52685z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i16 = c14433c.f52681F;
        try {
            if (i16 == 0) {
                AbstractC34132o.m107864I(obj);
                interfaceC25435a = this.f52700i;
                c14433c.f52684y = interfaceC25435a;
                c14433c.f52682w = i13;
                i14 = 0;
                c14433c.f52683x = 0;
                c14433c.f52681F = 1;
                if (interfaceC25435a.mo68211b(c14433c) != enumC31071a) {
                }
                return enumC31071a;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC25435a2 = c14433c.f52684y;
                try {
                    AbstractC34132o.m107864I(obj);
                    this.f52696e = 0.0d;
                    C23454a0 c23454a0 = C23454a0.f92919a;
                    interfaceC25435a2.mo68214i(null);
                    return c23454a0;
                } catch (Throwable th4) {
                    th3 = th4;
                    interfaceC25435a2.mo68214i(null);
                    throw th3;
                }
            }
            int i17 = c14433c.f52683x;
            int i18 = c14433c.f52682w;
            InterfaceC25435a interfaceC25435a3 = c14433c.f52684y;
            AbstractC34132o.m107864I(obj);
            i14 = i17;
            i13 = i18;
            interfaceC25435a = interfaceC25435a3;
            if (this.f52695d.f52710e) {
                m41163b();
                double d3 = i13;
                double d14 = this.f52696e;
                if (d3 > d14) {
                    Duration.Companion companion = Duration.INSTANCE;
                    long duration = DurationKt.toDuration((d3 - d14) / this.f52698g, DurationUnit.SECONDS);
                    c14433c.f52684y = interfaceC25435a;
                    c14433c.f52682w = i13;
                    c14433c.f52683x = i14;
                    c14433c.f52681F = 2;
                    if (AbstractC3034m0.m8783c(duration, c14433c) != enumC31071a) {
                        interfaceC25435a2 = interfaceC25435a;
                        this.f52696e = 0.0d;
                        C23454a0 c23454a1 = C23454a0.f92919a;
                        interfaceC25435a2.mo68214i(null);
                        return c23454a1;
                    }
                    return enumC31071a;
                }
                this.f52696e = d14 - d3;
            }
            interfaceC25435a2 = interfaceC25435a;
            C23454a0 c23454a2 = C23454a0.f92919a;
            interfaceC25435a2.mo68214i(null);
            return c23454a2;
        } catch (Throwable th5) {
            InterfaceC25435a interfaceC25435a4 = interfaceC25435a;
            th3 = th5;
            interfaceC25435a2 = interfaceC25435a4;
            interfaceC25435a2.mo68214i(null);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m41163b() {
        TimeMark timeMark = this.f52697f;
        if (timeMark != null) {
            this.f52696e = Math.min(this.f52699h, this.f52696e + (this.f52698g * Duration.m134298toDoubleimpl(timeMark.mo134250elapsedNowUwyO8pc(), DurationUnit.SECONDS)));
        }
        this.f52697f = this.f52693b.markNow();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m41164c(EnumC15819f enumC15819f, AbstractC32269c abstractC32269c) {
        C14434d c14434d;
        EnumC15819f enumC15819f2;
        C25437c c25437c;
        if (abstractC32269c instanceof C14434d) {
            c14434d = (C14434d) abstractC32269c;
            int i13 = c14434d.f52686E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c14434d.f52686E = i13 - Integer.MIN_VALUE;
            } else {
                c14434d = new C14434d(this, abstractC32269c);
            }
        } else {
            c14434d = new C14434d(this, abstractC32269c);
        }
        Object obj = c14434d.f52689y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c14434d.f52686E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c14434d.f52687w = enumC15819f;
            C25437c c25437c2 = this.f52700i;
            c14434d.f52688x = c25437c2;
            c14434d.f52686E = 1;
            if (c25437c2.mo68211b(c14434d) == enumC31071a) {
                return enumC31071a;
            }
            enumC15819f2 = enumC15819f;
            c25437c = c25437c2;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c25437c = c14434d.f52688x;
            EnumC15819f enumC15819f3 = c14434d.f52687w;
            AbstractC34132o.m107864I(obj);
            enumC15819f2 = enumC15819f3;
        }
        try {
            double dM41165a = this.f52694c.m41165a();
            double dMin = Math.min(this.f52695d.m41166a(enumC15819f2, dM41165a, this.f52698g), ((double) 2) * dM41165a);
            m41163b();
            C14432b c14432b = this.f52692a;
            this.f52698g = Math.max(dMin, c14432b.f52677c);
            double dMax = Math.max(dMin, c14432b.f52676b);
            this.f52699h = dMax;
            this.f52696e = Math.min(this.f52696e, dMax);
            return C23454a0.f92919a;
        } finally {
            c25437c.mo68214i(null);
        }
    }
}
