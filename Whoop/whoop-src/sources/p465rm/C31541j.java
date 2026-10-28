package p465rm;

import android.content.Context;
import android.os.Looper;
import p031b9.C2823d;
import p031b9.C2838i;
import p309lo.AbstractC24567y;
import p309lo.C24562t;
import p658yr.InterfaceC39722i;
import tm.C33926d;

/* JADX INFO: renamed from: rm.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C31541j {

    /* JADX INFO: renamed from: a */
    public final Context f130178a;

    /* JADX INFO: renamed from: b */
    public final C24562t f130179b;

    /* JADX INFO: renamed from: c */
    public final C2823d f130180c;

    /* JADX INFO: renamed from: d */
    public final C2823d f130181d;

    /* JADX INFO: renamed from: e */
    public InterfaceC39722i f130182e;

    /* JADX INFO: renamed from: f */
    public final C2823d f130183f;

    /* JADX INFO: renamed from: g */
    public final Looper f130184g;

    /* JADX INFO: renamed from: h */
    public final C33926d f130185h;

    /* JADX INFO: renamed from: i */
    public final int f130186i;

    /* JADX INFO: renamed from: j */
    public final boolean f130187j;

    /* JADX INFO: renamed from: k */
    public final C31537h1 f130188k;

    /* JADX INFO: renamed from: l */
    public final long f130189l;

    /* JADX INFO: renamed from: m */
    public final long f130190m;

    /* JADX INFO: renamed from: n */
    public final C2838i f130191n;

    /* JADX INFO: renamed from: o */
    public final long f130192o;

    /* JADX INFO: renamed from: p */
    public final long f130193p;

    /* JADX INFO: renamed from: q */
    public boolean f130194q;

    public C31541j(Context context) {
        C2823d c2823d = new C2823d(context, 5);
        C2823d c2823d2 = new C2823d(context, 6);
        C2823d c2823d3 = new C2823d(context, 7);
        C2823d c2823d4 = new C2823d(context, 8);
        this.f130178a = context;
        this.f130180c = c2823d;
        this.f130181d = c2823d2;
        this.f130182e = c2823d3;
        this.f130183f = c2823d4;
        int i13 = AbstractC24567y.f95875a;
        Looper looperMyLooper = Looper.myLooper();
        this.f130184g = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.f130185h = C33926d.f142162G;
        this.f130186i = 1;
        this.f130187j = true;
        this.f130188k = C31537h1.f130167c;
        this.f130189l = 5000L;
        this.f130190m = 15000L;
        this.f130191n = new C2838i(AbstractC24567y.m71695z(20L), AbstractC24567y.m71695z(500L), 1);
        this.f130179b = C24562t.f95862a;
        this.f130192o = 500L;
        this.f130193p = 2000L;
    }
}
