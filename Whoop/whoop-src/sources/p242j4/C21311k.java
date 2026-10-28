package p242j4;

import java.util.HashMap;
import p166g4.C15316a;
import p319m4.C25016e;

/* JADX INFO: renamed from: j4.k */
/* JADX INFO: loaded from: classes.dex */
public final class C21311k {

    /* JADX INFO: renamed from: a */
    public final C25016e f81480a;

    /* JADX INFO: renamed from: b */
    public int f81481b;

    /* JADX INFO: renamed from: c */
    public int f81482c;

    /* JADX INFO: renamed from: d */
    public float f81483d;

    /* JADX INFO: renamed from: e */
    public float f81484e;

    /* JADX INFO: renamed from: f */
    public float f81485f;

    /* JADX INFO: renamed from: g */
    public float f81486g;

    /* JADX INFO: renamed from: h */
    public float f81487h;

    /* JADX INFO: renamed from: i */
    public float f81488i;

    /* JADX INFO: renamed from: j */
    public float f81489j;

    /* JADX INFO: renamed from: k */
    public float f81490k;

    /* JADX INFO: renamed from: l */
    public float f81491l;

    /* JADX INFO: renamed from: m */
    public float f81492m;

    /* JADX INFO: renamed from: n */
    public float f81493n;

    /* JADX INFO: renamed from: o */
    public int f81494o;

    /* JADX INFO: renamed from: p */
    public final HashMap f81495p;

    public C21311k(C25016e c25016e) {
        this.f81480a = null;
        this.f81481b = 0;
        this.f81482c = 0;
        this.f81483d = Float.NaN;
        this.f81484e = Float.NaN;
        this.f81485f = Float.NaN;
        this.f81486g = Float.NaN;
        this.f81487h = Float.NaN;
        this.f81488i = Float.NaN;
        this.f81489j = Float.NaN;
        this.f81490k = Float.NaN;
        this.f81491l = Float.NaN;
        this.f81492m = Float.NaN;
        this.f81493n = Float.NaN;
        this.f81494o = 0;
        this.f81495p = new HashMap();
        this.f81480a = c25016e;
    }

    /* JADX INFO: renamed from: a */
    public final void m59834a(C21311k c21311k) {
        if (c21311k == null) {
            return;
        }
        this.f81483d = c21311k.f81483d;
        this.f81484e = c21311k.f81484e;
        this.f81485f = c21311k.f81485f;
        this.f81486g = c21311k.f81486g;
        this.f81487h = c21311k.f81487h;
        this.f81488i = c21311k.f81488i;
        this.f81489j = c21311k.f81489j;
        this.f81490k = c21311k.f81490k;
        this.f81491l = c21311k.f81491l;
        this.f81492m = c21311k.f81492m;
        this.f81493n = c21311k.f81493n;
        this.f81494o = c21311k.f81494o;
        HashMap map = this.f81495p;
        map.clear();
        for (C15316a c15316a : c21311k.f81495p.values()) {
            map.put(c15316a.m43525b(), c15316a.m43524a());
        }
    }

    public C21311k(C21311k c21311k) {
        this.f81480a = null;
        this.f81481b = 0;
        this.f81482c = 0;
        this.f81483d = Float.NaN;
        this.f81484e = Float.NaN;
        this.f81485f = Float.NaN;
        this.f81486g = Float.NaN;
        this.f81487h = Float.NaN;
        this.f81488i = Float.NaN;
        this.f81489j = Float.NaN;
        this.f81490k = Float.NaN;
        this.f81491l = Float.NaN;
        this.f81492m = Float.NaN;
        this.f81493n = Float.NaN;
        this.f81494o = 0;
        this.f81495p = new HashMap();
        this.f81480a = c21311k.f81480a;
        this.f81481b = c21311k.f81481b;
        this.f81482c = c21311k.f81482c;
        m59834a(c21311k);
    }
}
