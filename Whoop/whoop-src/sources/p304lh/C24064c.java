package p304lh;

import ae3.AbstractC0797e;
import android.graphics.Bitmap;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import p425qh.AbstractC30358d;
import p425qh.AbstractC30363i;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34807d0;
import ud3.C34810e0;
import ud3.C34817h;
import ud3.C34830n0;
import ud3.C34832o0;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: lh.c */
/* JADX INFO: loaded from: classes.dex */
public final class C24064c {

    /* JADX INFO: renamed from: a */
    public final C34832o0 f95093a;

    /* JADX INFO: renamed from: b */
    public final C24063b f95094b;

    /* JADX INFO: renamed from: c */
    public final Date f95095c;

    /* JADX INFO: renamed from: d */
    public final String f95096d;

    /* JADX INFO: renamed from: e */
    public final Date f95097e;

    /* JADX INFO: renamed from: f */
    public final String f95098f;

    /* JADX INFO: renamed from: g */
    public final Date f95099g;

    /* JADX INFO: renamed from: h */
    public final long f95100h;

    /* JADX INFO: renamed from: i */
    public final long f95101i;

    /* JADX INFO: renamed from: j */
    public final String f95102j;

    /* JADX INFO: renamed from: k */
    public final int f95103k;

    public C24064c(C34832o0 c34832o0, C24063b c24063b) {
        int i13;
        this.f95093a = c34832o0;
        this.f95094b = c24063b;
        this.f95103k = -1;
        if (c24063b != null) {
            this.f95100h = c24063b.f95089c;
            this.f95101i = c24063b.f95090d;
            C34807d0 c34807d0 = c24063b.f95092f;
            int size = c34807d0.size();
            for (int i14 = 0; i14 < size; i14++) {
                String strM109864c = c34807d0.m109864c(i14);
                if (strM109864c.equalsIgnoreCase("Date")) {
                    String strM109863a = c34807d0.m109863a("Date");
                    this.f95095c = strM109863a != null ? AbstractC0797e.m1919a(strM109863a) : null;
                    this.f95096d = c34807d0.m109867g(i14);
                } else if (strM109864c.equalsIgnoreCase("Expires")) {
                    String strM109863a2 = c34807d0.m109863a("Expires");
                    this.f95099g = strM109863a2 != null ? AbstractC0797e.m1919a(strM109863a2) : null;
                } else if (strM109864c.equalsIgnoreCase("Last-Modified")) {
                    String strM109863a3 = c34807d0.m109863a("Last-Modified");
                    this.f95097e = strM109863a3 != null ? AbstractC0797e.m1919a(strM109863a3) : null;
                    this.f95098f = c34807d0.m109867g(i14);
                } else if (strM109864c.equalsIgnoreCase("ETag")) {
                    this.f95102j = c34807d0.m109867g(i14);
                } else if (strM109864c.equalsIgnoreCase("Age")) {
                    String strM109867g = c34807d0.m109867g(i14);
                    Bitmap.Config[] configArr = AbstractC30358d.f124548a;
                    Long lM125933R = AbstractC39421y.m125933R(strM109867g);
                    if (lM125933R != null) {
                        long jLongValue = lM125933R.longValue();
                        i13 = jLongValue > 2147483647L ? Integer.MAX_VALUE : jLongValue < 0 ? 0 : (int) jLongValue;
                    } else {
                        i13 = -1;
                    }
                    this.f95103k = i13;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, l83.h] */
    /* JADX INFO: renamed from: a */
    public final C24065d m70978a() {
        long time;
        int i13;
        C34832o0 c34832o0 = this.f95093a;
        C34807d0 c34807d0 = c34832o0.f146714c;
        C34810e0 c34810e0 = c34832o0.f146712a;
        C24063b c24063b = this.f95094b;
        if (c24063b == null) {
            return new C24065d(c34832o0, null);
        }
        ?? r10 = c24063b.f95087a;
        if (c34810e0.m109877f() && !c24063b.f95091e) {
            return new C24065d(c34832o0, null);
        }
        C34817h c34817h = (C34817h) r10.getValue();
        if (c34832o0.m109906a().f146577b || ((C34817h) r10.getValue()).f146577b || AbstractC22676k.m65745e(c24063b.f95092f.m109863a("Vary"), "*")) {
            return new C24065d(c34832o0, null);
        }
        C34817h c34817hM109906a = c34832o0.m109906a();
        if (!c34817hM109906a.f146576a) {
            String str = "If-Modified-Since";
            if (c34807d0.m109863a("If-Modified-Since") == null && c34807d0.m109863a("If-None-Match") == null) {
                long time2 = this.f95101i;
                Date date = this.f95095c;
                long jMax = date != null ? Math.max(0L, time2 - date.getTime()) : 0L;
                long millis = 0;
                int i14 = this.f95103k;
                if (i14 != -1) {
                    jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i14));
                }
                long time3 = this.f95100h;
                long jLongValue = jMax + (time2 - time3) + (((Number) AbstractC30363i.f124564a.invoke()).longValue() - time2);
                int i15 = ((C34817h) r10.getValue()).f146578c;
                Date date2 = this.f95097e;
                if (i15 != -1) {
                    time = TimeUnit.SECONDS.toMillis(i15);
                } else {
                    Date date3 = this.f95099g;
                    if (date3 != null) {
                        if (date != 0) {
                            time2 = date.getTime();
                        }
                        time = date3.getTime() - time2;
                        if (time <= 0) {
                            time = 0;
                        }
                    } else if (date2 == null || c34810e0.m109880i() != null) {
                        time = 0;
                    } else {
                        if (date != 0) {
                            time3 = date.getTime();
                        }
                        long time4 = time3 - date2.getTime();
                        if (time4 > 0) {
                            time = time4 / ((long) 10);
                        } else {
                            time = 0;
                        }
                    }
                }
                int i16 = c34817hM109906a.f146578c;
                if (i16 != -1) {
                    time = Math.min(time, TimeUnit.SECONDS.toMillis(i16));
                }
                int i17 = c34817hM109906a.f146584i;
                long millis2 = i17 != -1 ? TimeUnit.SECONDS.toMillis(i17) : 0L;
                if (!c34817h.f146582g && (i13 = c34817hM109906a.f146583h) != -1) {
                    millis = TimeUnit.SECONDS.toMillis(i13);
                }
                if (!c34817h.f146576a && jLongValue + millis2 < time + millis) {
                    return new C24065d(null, c24063b);
                }
                String str2 = this.f95102j;
                if (str2 != null) {
                    str = "If-None-Match";
                } else if (date2 != null) {
                    str2 = this.f95098f;
                    AbstractC22676k.m65747g(str2);
                } else {
                    if (date == null) {
                        return new C24065d(c34832o0, null);
                    }
                    str2 = this.f95096d;
                    AbstractC22676k.m65747g(str2);
                }
                C34830n0 c34830n0M109907b = c34832o0.m109907b();
                c34830n0M109907b.m109900a(str, str2);
                return new C24065d(new C34832o0(c34830n0M109907b), c24063b);
            }
        }
        return new C24065d(c34832o0, null);
    }
}
