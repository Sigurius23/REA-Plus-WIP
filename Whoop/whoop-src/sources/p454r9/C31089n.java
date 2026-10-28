package p454r9;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.SystemClock;
import mo.C25724e;
import mo.C25725f;
import mo.C25733n;
import mo.C25735p;
import na.C26488a;
import p607x8.AbstractC38065t;
import p607x8.C38061p;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: r9.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C31089n {

    /* JADX INFO: renamed from: a */
    public final C31080e f128216a;

    /* JADX INFO: renamed from: b */
    public final C25735p f128217b;

    /* JADX INFO: renamed from: c */
    public final long f128218c;

    /* JADX INFO: renamed from: d */
    public boolean f128219d;

    /* JADX INFO: renamed from: g */
    public long f128222g;

    /* JADX INFO: renamed from: j */
    public boolean f128225j;

    /* JADX INFO: renamed from: m */
    public boolean f128228m;

    /* JADX INFO: renamed from: n */
    public boolean f128229n;

    /* JADX INFO: renamed from: e */
    public int f128220e = 0;

    /* JADX INFO: renamed from: f */
    public long f128221f = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f128223h = -9223372036854775807L;

    /* JADX INFO: renamed from: i */
    public long f128224i = -9223372036854775807L;

    /* JADX INFO: renamed from: k */
    public float f128226k = 1.0f;

    /* JADX INFO: renamed from: l */
    public C38061p f128227l = C38061p.f163023a;

    public C31089n(Context context, C31080e c31080e, long j7) {
        this.f128216a = c31080e;
        this.f128218c = j7;
        this.f128217b = new C25735p(context, 1);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0080  */
    /* JADX WARN: Code duplicated, block: B:56:0x0128  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public final int m95741a(long j7, long j13, long j14, long j15, boolean z4, boolean z13, C26488a c26488a) {
        long j16;
        long j17;
        boolean z14;
        int i13;
        long j18;
        int i14;
        int i15;
        long j19;
        long j24;
        c26488a.f105201a = -9223372036854775807L;
        c26488a.f105202b = -9223372036854775807L;
        if (this.f128221f == -9223372036854775807L) {
            this.f128221f = j13;
        }
        int i16 = 0;
        if (this.f128223h != j7) {
            C25735p c25735p = this.f128217b;
            j16 = -9223372036854775807L;
            long j25 = c25735p.f101419l;
            if (j25 != -1) {
                c25735p.f101421n = j25;
                c25735p.f101422o = c25735p.f101420m;
            }
            c25735p.f101418k++;
            C25725f c25725f = (C25725f) c25735p.f101423p;
            long j26 = j7 * 1000;
            ((C25724e) c25725f.f101353d).m75845b(j26);
            if (((C25724e) c25725f.f101353d).m75844a()) {
                c25725f.f101350a = false;
                j17 = 0;
            } else {
                j17 = 0;
                if (c25725f.f101351b != -9223372036854775807L) {
                    if (c25725f.f101350a) {
                        C25724e c25724e = (C25724e) c25725f.f101354e;
                        long j27 = c25724e.f101345e;
                        if (j27 == 0 ? false : c25724e.f101348h[(int) ((j27 - 1) % 15)]) {
                            ((C25724e) c25725f.f101354e).m75846c();
                            ((C25724e) c25725f.f101354e).m75845b(c25725f.f101351b);
                        }
                    } else {
                        ((C25724e) c25725f.f101354e).m75846c();
                        ((C25724e) c25725f.f101354e).m75845b(c25725f.f101351b);
                    }
                    c25725f.f101350a = true;
                    ((C25724e) c25725f.f101354e).m75845b(j26);
                }
            }
            if (c25725f.f101350a && ((C25724e) c25725f.f101354e).m75844a()) {
                C25724e c25724e2 = (C25724e) c25725f.f101353d;
                c25725f.f101353d = (C25724e) c25725f.f101354e;
                c25725f.f101354e = c25724e2;
                c25725f.f101350a = false;
            }
            c25725f.f101351b = j26;
            c25725f.f101352c = ((C25724e) c25725f.f101353d).m75844a() ? 0 : c25725f.f101352c + 1;
            c25735p.m75876c();
            this.f128223h = j7;
        } else {
            j16 = -9223372036854775807L;
            j17 = 0;
        }
        long jM121896J = (long) ((j7 - j13) / ((double) this.f128226k));
        if (this.f128219d) {
            this.f128227l.getClass();
            jM121896J -= AbstractC38065t.m121896J(SystemClock.elapsedRealtime()) - j14;
        }
        long j28 = jM121896J;
        c26488a.f105201a = j28;
        if (!z4 || z13) {
            if (this.f128228m) {
                if (this.f128224i == j16 || this.f128225j) {
                    int i17 = this.f128220e;
                    if (i17 != 0) {
                        if (i17 != 1) {
                            if (i17 != 2) {
                                if (i17 != 3) {
                                    throw new IllegalStateException();
                                }
                                this.f128227l.getClass();
                                long jM121896J2 = AbstractC38065t.m121896J(SystemClock.elapsedRealtime()) - this.f128222g;
                                if (!this.f128219d || j28 >= -30000 || jM121896J2 <= 100000) {
                                    z14 = false;
                                }
                            } else if (j13 < j15) {
                                z14 = false;
                            }
                        }
                        z14 = true;
                    } else {
                        z14 = this.f128219d;
                    }
                } else {
                    z14 = false;
                }
                if (z14) {
                    return 0;
                }
                if (!this.f128219d || j13 == this.f128221f) {
                    return 5;
                }
                this.f128227l.getClass();
                long jNanoTime = System.nanoTime();
                C25735p c25735p2 = this.f128217b;
                long j29 = (c26488a.f105201a * 1000) + jNanoTime;
                if (c25735p2.f101421n == r11 || !((C25724e) ((C25725f) c25735p2.f101423p).f101353d).m75844a()) {
                    i13 = 3;
                    j18 = -30000;
                    i14 = 2;
                    i15 = 1;
                } else {
                    C25725f c25725f2 = (C25725f) c25735p2.f101423p;
                    if (((C25724e) c25725f2.f101353d).m75844a()) {
                        C25724e c25724e3 = (C25724e) c25725f2.f101353d;
                        i13 = 3;
                        j18 = -30000;
                        long j34 = c25724e3.f101346f;
                        j24 = j34 == j17 ? j17 : c25724e3.f101347g / j34;
                    } else {
                        i13 = 3;
                        j18 = -30000;
                        j24 = j16;
                    }
                    i14 = 2;
                    i15 = 1;
                    long j35 = c25735p2.f101422o + ((long) (((c25735p2.f101418k - c25735p2.f101421n) * j24) / c25735p2.f101414g));
                    if (Math.abs(j29 - j35) <= 20000000) {
                        j29 = j35;
                    } else {
                        c25735p2.f101418k = j17;
                        c25735p2.f101421n = -1L;
                        c25735p2.f101419l = -1L;
                    }
                }
                c25735p2.f101419l = c25735p2.f101418k;
                c25735p2.f101420m = j29;
                ChoreographerFrameCallbackC31090o choreographerFrameCallbackC31090o = (ChoreographerFrameCallbackC31090o) c25735p2.f101425r;
                if (choreographerFrameCallbackC31090o != null && c25735p2.f101416i != j16) {
                    long j36 = choreographerFrameCallbackC31090o.f128231w;
                    if (j36 != j16) {
                        long j37 = c25735p2.f101416i;
                        long j38 = (((j29 - j36) / j37) * j37) + j36;
                        if (j29 <= j38) {
                            j19 = j38 - j37;
                        } else {
                            j19 = j38;
                            j38 = j37 + j38;
                        }
                        if (j38 - j29 >= j29 - j19) {
                            j38 = j19;
                        }
                        j29 = j38 - c25735p2.f101417j;
                    }
                }
                c26488a.f105202b = j29;
                long j39 = (j29 - jNanoTime) / 1000;
                c26488a.f105201a = j39;
                boolean z15 = (this.f128224i == j16 || this.f128225j) ? 0 : i15;
                if (this.f128216a.m95733G0(j39, j13, z13, z15)) {
                    return 4;
                }
                long j44 = c26488a.f105201a;
                if (j44 < j18 && !z13) {
                    i16 = i15;
                }
                if (i16 != 0) {
                    return z15 != 0 ? i13 : i14;
                }
                if (j44 > 50000) {
                    return 5;
                }
                return i15;
            }
            this.f128229n = true;
            if (this.f128216a.m95733G0(j28, j13, z13, true)) {
                return 4;
            }
            if (!this.f128219d || c26488a.f105201a >= 30000) {
                return 5;
            }
        }
        return 3;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m95742b(boolean z4) {
        if (z4 && (this.f128220e == 3 || (!this.f128228m && this.f128229n))) {
            this.f128224i = -9223372036854775807L;
            return true;
        }
        if (this.f128224i == -9223372036854775807L) {
            return false;
        }
        this.f128227l.getClass();
        if (SystemClock.elapsedRealtime() < this.f128224i) {
            return true;
        }
        this.f128224i = -9223372036854775807L;
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final void m95743c(boolean z4) {
        long jElapsedRealtime;
        this.f128225j = z4;
        long j7 = this.f128218c;
        if (j7 > 0) {
            this.f128227l.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime() + j7;
        } else {
            jElapsedRealtime = -9223372036854775807L;
        }
        this.f128224i = jElapsedRealtime;
    }

    /* JADX INFO: renamed from: d */
    public final void m95744d(int i13) {
        this.f128220e = Math.min(this.f128220e, i13);
    }

    /* JADX INFO: renamed from: e */
    public final void m95745e() {
        this.f128219d = true;
        this.f128227l.getClass();
        this.f128222g = AbstractC38065t.m121896J(SystemClock.elapsedRealtime());
        C25735p c25735p = this.f128217b;
        c25735p.f101409b = true;
        c25735p.f101418k = 0L;
        c25735p.f101421n = -1L;
        c25735p.f101419l = -1L;
        C25733n c25733n = (C25733n) c25735p.f101424q;
        if (c25733n != null) {
            DisplayManager displayManager = c25733n.f101401x;
            ChoreographerFrameCallbackC31090o choreographerFrameCallbackC31090o = (ChoreographerFrameCallbackC31090o) c25735p.f101425r;
            choreographerFrameCallbackC31090o.getClass();
            choreographerFrameCallbackC31090o.f128232x.sendEmptyMessage(2);
            displayManager.registerDisplayListener(c25733n, AbstractC38065t.m121920m(null));
            C25735p.m75874a((C25735p) c25733n.f101402y, displayManager.getDisplay(0));
        }
        c25735p.m75877d(false);
    }

    /* JADX INFO: renamed from: f */
    public final void m95746f() {
        this.f128219d = false;
        this.f128224i = -9223372036854775807L;
        C25735p c25735p = this.f128217b;
        c25735p.f101409b = false;
        C25733n c25733n = (C25733n) c25735p.f101424q;
        if (c25733n != null) {
            c25733n.f101401x.unregisterDisplayListener(c25733n);
            ChoreographerFrameCallbackC31090o choreographerFrameCallbackC31090o = (ChoreographerFrameCallbackC31090o) c25735p.f101425r;
            choreographerFrameCallbackC31090o.getClass();
            choreographerFrameCallbackC31090o.f128232x.sendEmptyMessage(3);
        }
        c25735p.m75875b();
    }

    /* JADX INFO: renamed from: g */
    public final void m95747g(float f13) {
        AbstractC35849g.m113802d(f13 > 0.0f);
        if (f13 == this.f128226k) {
            return;
        }
        this.f128226k = f13;
        C25735p c25735p = this.f128217b;
        c25735p.f101414g = f13;
        c25735p.f101418k = 0L;
        c25735p.f101421n = -1L;
        c25735p.f101419l = -1L;
        c25735p.m75877d(false);
    }
}
