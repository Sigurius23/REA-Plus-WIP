package p454r9;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import d30.C11530f0;
import java.util.concurrent.CopyOnWriteArraySet;
import p309lo.C24565w;
import p320m5.ExecutorC25061e;
import p516u8.C34608o;
import p607x8.C38061p;
import p607x8.C38063r;
import p690zr.C41060w0;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: r9.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C31084i {

    /* JADX INFO: renamed from: o */
    public static final ExecutorC25061e f128190o = new ExecutorC25061e(1);

    /* JADX INFO: renamed from: a */
    public final Context f128191a;

    /* JADX INFO: renamed from: b */
    public final C24565w f128192b = new C24565w(1);

    /* JADX INFO: renamed from: c */
    public final C31083h f128193c;

    /* JADX INFO: renamed from: d */
    public final SparseArray f128194d;

    /* JADX INFO: renamed from: e */
    public final C41060w0 f128195e;

    /* JADX INFO: renamed from: f */
    public final C31078c f128196f;

    /* JADX INFO: renamed from: g */
    public final C38061p f128197g;

    /* JADX INFO: renamed from: h */
    public final CopyOnWriteArraySet f128198h;

    /* JADX INFO: renamed from: i */
    public C38063r f128199i;

    /* JADX INFO: renamed from: j */
    public Pair f128200j;

    /* JADX INFO: renamed from: k */
    public int f128201k;

    /* JADX INFO: renamed from: l */
    public long f128202l;

    /* JADX INFO: renamed from: m */
    public long f128203m;

    /* JADX INFO: renamed from: n */
    public int f128204n;

    public C31084i(C11530f0 c11530f0) {
        this.f128191a = (Context) c11530f0.f37150c;
        C31083h c31083h = (C31083h) c11530f0.f37153f;
        AbstractC35849g.m113808j(c31083h);
        this.f128193c = c31083h;
        this.f128194d = new SparseArray();
        this.f128195e = (C41060w0) c11530f0.f37154g;
        C38061p c38061p = (C38061p) c11530f0.f37149b;
        this.f128197g = c38061p;
        this.f128196f = new C31078c((C31089n) c11530f0.f37151d, c38061p);
        this.f128198h = new CopyOnWriteArraySet();
        new C34608o().m109403a();
        this.f128202l = -9223372036854775807L;
        this.f128204n = -1;
        this.f128201k = 0;
    }
}
