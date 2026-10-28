package io.sentry;

import androidx.core.app.NotificationCompat;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.sentry.util.C20579a;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p249jc.AbstractC21598x;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.b7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20265b7 implements InterfaceC20348h2 {

    /* JADX INFO: renamed from: E */
    public final String f76090E;

    /* JADX INFO: renamed from: F */
    public Boolean f76091F;

    /* JADX INFO: renamed from: G */
    public EnumC20048a7 f76092G;

    /* JADX INFO: renamed from: H */
    public Long f76093H;

    /* JADX INFO: renamed from: I */
    public Double f76094I;

    /* JADX INFO: renamed from: J */
    public final String f76095J;

    /* JADX INFO: renamed from: K */
    public String f76096K;

    /* JADX INFO: renamed from: L */
    public final String f76097L;

    /* JADX INFO: renamed from: M */
    public final String f76098M;

    /* JADX INFO: renamed from: N */
    public String f76099N;

    /* JADX INFO: renamed from: O */
    public final C20579a f76100O = new C20579a();

    /* JADX INFO: renamed from: P */
    public ConcurrentHashMap f76101P;

    /* JADX INFO: renamed from: w */
    public final Date f76102w;

    /* JADX INFO: renamed from: x */
    public Date f76103x;

    /* JADX INFO: renamed from: y */
    public final AtomicInteger f76104y;

    /* JADX INFO: renamed from: z */
    public final String f76105z;

    public C20265b7(EnumC20048a7 enumC20048a7, Date date, Date date2, int i13, String str, String str2, Boolean bool, Long l7, Double d3, String str3, String str4, String str5, String str6, String str7) {
        this.f76092G = enumC20048a7;
        this.f76102w = date;
        this.f76103x = date2;
        this.f76104y = new AtomicInteger(i13);
        this.f76105z = str;
        this.f76090E = str2;
        this.f76091F = bool;
        this.f76093H = l7;
        this.f76094I = d3;
        this.f76095J = str3;
        this.f76096K = str4;
        this.f76097L = str5;
        this.f76098M = str6;
        this.f76099N = str7;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C20265b7 clone() {
        return new C20265b7(this.f76092G, this.f76102w, this.f76103x, this.f76104y.get(), this.f76105z, this.f76090E, this.f76091F, this.f76093H, this.f76094I, this.f76095J, this.f76096K, this.f76097L, this.f76098M, this.f76099N);
    }

    /* JADX INFO: renamed from: b */
    public final void m56220b(Date date) {
        C20535s c20535sM56711a = this.f76100O.m56711a();
        try {
            this.f76091F = null;
            if (this.f76092G == EnumC20048a7.Ok) {
                this.f76092G = EnumC20048a7.Exited;
            }
            if (date != null) {
                this.f76103x = date;
            } else {
                this.f76103x = AbstractC21598x.m60659O();
            }
            Date date2 = this.f76103x;
            if (date2 != null) {
                this.f76094I = Double.valueOf(Math.abs(date2.getTime() - this.f76102w.getTime()) / 1000.0d);
                long time = this.f76103x.getTime();
                if (time < 0) {
                    time = Math.abs(time);
                }
                this.f76093H = Long.valueOf(time);
            }
            c20535sM56711a.close();
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: c */
    public final Date m56221c() {
        Date date = this.f76102w;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m56222d(EnumC20048a7 enumC20048a7, String str, boolean z4, String str2) {
        boolean z13;
        C20535s c20535sM56711a = this.f76100O.m56711a();
        boolean z14 = true;
        if (enumC20048a7 != null) {
            try {
                this.f76092G = enumC20048a7;
                z13 = true;
            } catch (Throwable th3) {
                try {
                    c20535sM56711a.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } else {
            z13 = false;
        }
        if (str != null) {
            this.f76096K = str;
            z13 = true;
        }
        if (z4) {
            this.f76104y.addAndGet(1);
            z13 = true;
        }
        if (str2 != null) {
            this.f76099N = str2;
        } else {
            z14 = z13;
        }
        if (z14) {
            this.f76091F = null;
            Date dateM60659O = AbstractC21598x.m60659O();
            this.f76103x = dateM60659O;
            if (dateM60659O != null) {
                long time = dateM60659O.getTime();
                if (time < 0) {
                    time = Math.abs(time);
                }
                this.f76093H = Long.valueOf(time);
            }
        }
        c20535sM56711a.close();
        return z14;
    }

    @Override // io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        C37199o c37199o = (C37199o) interfaceC20401k3;
        c37199o.m119227i();
        String str = this.f76090E;
        if (str != null) {
            c37199o.m119207K("sid");
            c37199o.m119222b0(str);
        }
        String str2 = this.f76105z;
        if (str2 != null) {
            c37199o.m119207K("did");
            c37199o.m119222b0(str2);
        }
        if (this.f76091F != null) {
            c37199o.m119207K("init");
            c37199o.m119220Z(this.f76091F);
        }
        c37199o.m119207K("started");
        c37199o.m119219Y(interfaceC20602v0, this.f76102w);
        c37199o.m119207K(NotificationCompat.CATEGORY_STATUS);
        c37199o.m119219Y(interfaceC20602v0, this.f76092G.name().toLowerCase(Locale.ROOT));
        if (this.f76093H != null) {
            c37199o.m119207K("seq");
            c37199o.m119221a0(this.f76093H);
        }
        c37199o.m119207K("errors");
        c37199o.m119218X(this.f76104y.intValue());
        if (this.f76094I != null) {
            c37199o.m119207K(AttachmentExtensionsKt.EXTRA_DURATION);
            c37199o.m119221a0(this.f76094I);
        }
        if (this.f76103x != null) {
            c37199o.m119207K("timestamp");
            c37199o.m119219Y(interfaceC20602v0, this.f76103x);
        }
        if (this.f76099N != null) {
            c37199o.m119207K("abnormal_mechanism");
            c37199o.m119219Y(interfaceC20602v0, this.f76099N);
        }
        c37199o.m119207K("attrs");
        c37199o.m119227i();
        c37199o.m119207K("release");
        c37199o.m119219Y(interfaceC20602v0, this.f76098M);
        String str3 = this.f76097L;
        if (str3 != null) {
            c37199o.m119207K("environment");
            c37199o.m119219Y(interfaceC20602v0, str3);
        }
        String str4 = this.f76095J;
        if (str4 != null) {
            c37199o.m119207K("ip_address");
            c37199o.m119219Y(interfaceC20602v0, str4);
        }
        if (this.f76096K != null) {
            c37199o.m119207K("user_agent");
            c37199o.m119219Y(interfaceC20602v0, this.f76096K);
        }
        c37199o.m119200C();
        ConcurrentHashMap concurrentHashMap = this.f76101P;
        if (concurrentHashMap != null) {
            for (String str5 : concurrentHashMap.keySet()) {
                AbstractC18489d0.m53355A(this.f76101P, str5, c37199o, str5, interfaceC20602v0);
            }
        }
        c37199o.m119200C();
    }
}
