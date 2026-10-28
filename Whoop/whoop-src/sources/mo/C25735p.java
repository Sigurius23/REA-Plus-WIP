package mo;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import la.C23548b;
import p029b5.AbstractC2722a;
import p309lo.AbstractC24567y;
import p454r9.ChoreographerFrameCallbackC31090o;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: mo.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C25735p {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f101408a;

    /* JADX INFO: renamed from: b */
    public boolean f101409b;

    /* JADX INFO: renamed from: c */
    public Surface f101410c;

    /* JADX INFO: renamed from: d */
    public float f101411d;

    /* JADX INFO: renamed from: e */
    public float f101412e;

    /* JADX INFO: renamed from: f */
    public float f101413f;

    /* JADX INFO: renamed from: g */
    public float f101414g;

    /* JADX INFO: renamed from: h */
    public int f101415h;

    /* JADX INFO: renamed from: i */
    public long f101416i;

    /* JADX INFO: renamed from: j */
    public long f101417j;

    /* JADX INFO: renamed from: k */
    public long f101418k;

    /* JADX INFO: renamed from: l */
    public long f101419l;

    /* JADX INFO: renamed from: m */
    public long f101420m;

    /* JADX INFO: renamed from: n */
    public long f101421n;

    /* JADX INFO: renamed from: o */
    public long f101422o;

    /* JADX INFO: renamed from: p */
    public final Object f101423p;

    /* JADX INFO: renamed from: q */
    public final Object f101424q;

    /* JADX INFO: renamed from: r */
    public final Object f101425r;

    /* JADX WARN: Code duplicated, block: B:16:0x0057  */
    public C25735p(Context context, int i13) {
        DisplayManager displayManager;
        Object c25733n;
        DisplayManager displayManager2;
        this.f101408a = i13;
        switch (i13) {
            case 1:
                C25725f c25725f = new C25725f();
                c25725f.f101353d = new C25724e(1);
                c25725f.f101354e = new C25724e(1);
                c25725f.f101351b = -9223372036854775807L;
                this.f101423p = c25725f;
                C25733n c25733n2 = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new C25733n(this, displayManager);
                this.f101424q = c25733n2;
                this.f101425r = c25733n2 != null ? ChoreographerFrameCallbackC31090o.f128230E : null;
                this.f101416i = -9223372036854775807L;
                this.f101417j = -9223372036854775807L;
                this.f101411d = -1.0f;
                this.f101414g = 1.0f;
                this.f101415h = 0;
                break;
            default:
                C25725f c25725f2 = new C25725f();
                c25725f2.f101353d = new C25724e(0);
                c25725f2.f101354e = new C25724e(0);
                c25725f2.f101351b = -9223372036854775807L;
                this.f101423p = c25725f2;
                if (context != null) {
                    Context applicationContext = context.getApplicationContext();
                    c25733n = (AbstractC24567y.f95875a < 17 || (displayManager2 = (DisplayManager) applicationContext.getSystemService("display")) == null) ? null : new C25733n(displayManager2);
                    if (c25733n == null) {
                        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
                        if (windowManager != null) {
                            c25733n = new C23548b(windowManager, 8);
                        } else {
                            c25733n = null;
                        }
                    }
                } else {
                    c25733n = null;
                }
                this.f101424q = c25733n;
                this.f101425r = c25733n != null ? ChoreographerFrameCallbackC25734o.f101403E : null;
                this.f101416i = -9223372036854775807L;
                this.f101417j = -9223372036854775807L;
                this.f101411d = -1.0f;
                this.f101414g = 1.0f;
                this.f101415h = 0;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m75874a(C25735p c25735p, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            c25735p.f101416i = refreshRate;
            c25735p.f101417j = (refreshRate * 80) / 100;
        } else {
            AbstractC38046a.m121826u("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            c25735p.f101416i = -9223372036854775807L;
            c25735p.f101417j = -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m75875b() {
        Surface surface;
        Surface surface2;
        switch (this.f101408a) {
            case 0:
                if (AbstractC24567y.f95875a >= 30 && (surface = this.f101410c) != null && this.f101415h != Integer.MIN_VALUE && this.f101413f != 0.0f) {
                    this.f101413f = 0.0f;
                    AbstractC25731l.m75869a(surface, 0.0f);
                    break;
                }
                break;
            default:
                if (AbstractC38065t.f163031a >= 30 && (surface2 = this.f101410c) != null && this.f101415h != Integer.MIN_VALUE && this.f101413f != 0.0f) {
                    this.f101413f = 0.0f;
                    AbstractC2722a.m7687n(surface2, 0.0f);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0084  */
    /* JADX WARN: Code duplicated, block: B:78:0x0120  */
    /* JADX INFO: renamed from: c */
    public final void m75876c() {
        float f13;
        float f14;
        float f15;
        float f16;
        switch (this.f101408a) {
            case 0:
                C25725f c25725f = (C25725f) this.f101423p;
                if (AbstractC24567y.f95875a >= 30 && this.f101410c != null) {
                    if (!((C25724e) c25725f.f101353d).m75844a()) {
                        f13 = this.f101411d;
                    } else if (((C25724e) c25725f.f101353d).m75844a()) {
                        C25724e c25724e = (C25724e) c25725f.f101353d;
                        long j7 = c25724e.f101346f;
                        f13 = (float) (1.0E9d / (j7 != 0 ? c25724e.f101347g / j7 : 0L));
                    } else {
                        f13 = -1.0f;
                    }
                    float f17 = this.f101412e;
                    if (f13 != f17) {
                        if (f13 != -1.0f && f17 != -1.0f) {
                            if (((C25724e) c25725f.f101353d).m75844a()) {
                                if ((((C25724e) c25725f.f101353d).m75844a() ? ((C25724e) c25725f.f101353d).f101347g : -9223372036854775807L) >= 5000000000L) {
                                    f14 = 0.02f;
                                } else {
                                    f14 = 1.0f;
                                }
                            } else {
                                f14 = 1.0f;
                            }
                            if (Math.abs(f13 - this.f101412e) < f14) {
                            }
                        } else if (f13 == -1.0f && c25725f.f101352c < 30) {
                        }
                        this.f101412e = f13;
                        m75877d(false);
                        break;
                    }
                }
                break;
            default:
                C25725f c25725f2 = (C25725f) this.f101423p;
                if (AbstractC38065t.f163031a >= 30 && this.f101410c != null) {
                    if (!((C25724e) c25725f2.f101353d).m75844a()) {
                        f15 = this.f101411d;
                    } else if (((C25724e) c25725f2.f101353d).m75844a()) {
                        C25724e c25724e2 = (C25724e) c25725f2.f101353d;
                        long j13 = c25724e2.f101346f;
                        f15 = (float) (1.0E9d / (j13 != 0 ? c25724e2.f101347g / j13 : 0L));
                    } else {
                        f15 = -1.0f;
                    }
                    float f18 = this.f101412e;
                    if (f15 != f18) {
                        if (f15 != -1.0f && f18 != -1.0f) {
                            if (((C25724e) c25725f2.f101353d).m75844a()) {
                                if ((((C25724e) c25725f2.f101353d).m75844a() ? ((C25724e) c25725f2.f101353d).f101347g : -9223372036854775807L) >= 5000000000L) {
                                    f16 = 0.02f;
                                } else {
                                    f16 = 1.0f;
                                }
                            } else {
                                f16 = 1.0f;
                            }
                            if (Math.abs(f15 - this.f101412e) < f16) {
                            }
                        } else if (f15 == -1.0f && c25725f2.f101352c < 30) {
                        }
                        this.f101412e = f15;
                        m75877d(false);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    /* JADX WARN: Code duplicated, block: B:35:0x0057  */
    /* JADX INFO: renamed from: d */
    public final void m75877d(boolean z4) {
        Surface surface;
        float f13;
        Surface surface2;
        float f14;
        switch (this.f101408a) {
            case 0:
                if (AbstractC24567y.f95875a >= 30 && (surface = this.f101410c) != null && this.f101415h != Integer.MIN_VALUE) {
                    if (this.f101409b) {
                        float f15 = this.f101412e;
                        if (f15 != -1.0f) {
                            f13 = f15 * this.f101414g;
                        } else {
                            f13 = 0.0f;
                        }
                    } else {
                        f13 = 0.0f;
                    }
                    if (z4 || this.f101413f != f13) {
                        this.f101413f = f13;
                        AbstractC25731l.m75869a(surface, f13);
                    }
                    break;
                }
                break;
            default:
                if (AbstractC38065t.f163031a >= 30 && (surface2 = this.f101410c) != null && this.f101415h != Integer.MIN_VALUE) {
                    if (this.f101409b) {
                        float f16 = this.f101412e;
                        if (f16 != -1.0f) {
                            f14 = f16 * this.f101414g;
                        } else {
                            f14 = 0.0f;
                        }
                    } else {
                        f14 = 0.0f;
                    }
                    if (z4 || this.f101413f != f14) {
                        this.f101413f = f14;
                        AbstractC2722a.m7687n(surface2, f14);
                    }
                    break;
                }
                break;
        }
    }
}
