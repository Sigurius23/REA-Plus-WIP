package p031b9;

import android.content.Context;
import android.os.Looper;
import androidx.core.app.NotificationManagerCompat;
import kr.C22786e;
import live.hms.video.utils.HMSConstantsKt;
import p516u8.C34586d;
import p607x8.AbstractC38065t;
import p607x8.C38061p;
import p658yr.InterfaceC39722i;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: b9.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C2857p {

    /* JADX INFO: renamed from: a */
    public final Context f11330a;

    /* JADX INFO: renamed from: b */
    public final C38061p f11331b;

    /* JADX INFO: renamed from: c */
    public final C2823d f11332c;

    /* JADX INFO: renamed from: d */
    public InterfaceC39722i f11333d;

    /* JADX INFO: renamed from: e */
    public final C2823d f11334e;

    /* JADX INFO: renamed from: f */
    public final C2823d f11335f;

    /* JADX INFO: renamed from: g */
    public final Looper f11336g;

    /* JADX INFO: renamed from: h */
    public final int f11337h;

    /* JADX INFO: renamed from: i */
    public C34586d f11338i;

    /* JADX INFO: renamed from: j */
    public boolean f11339j;

    /* JADX INFO: renamed from: k */
    public final int f11340k;

    /* JADX INFO: renamed from: l */
    public final boolean f11341l;

    /* JADX INFO: renamed from: m */
    public final C2846k1 f11342m;

    /* JADX INFO: renamed from: n */
    public final long f11343n;

    /* JADX INFO: renamed from: o */
    public final long f11344o;

    /* JADX INFO: renamed from: p */
    public final long f11345p;

    /* JADX INFO: renamed from: q */
    public final C2838i f11346q;

    /* JADX INFO: renamed from: r */
    public final long f11347r;

    /* JADX INFO: renamed from: s */
    public final long f11348s;

    /* JADX INFO: renamed from: t */
    public final boolean f11349t;

    /* JADX INFO: renamed from: u */
    public boolean f11350u;

    /* JADX INFO: renamed from: v */
    public final String f11351v;

    public C2857p(Context context) {
        C2823d c2823d = new C2823d(context, 1);
        C2823d c2823d2 = new C2823d(context, 2);
        C2823d c2823d3 = new C2823d(context, 3);
        C2823d c2823d4 = new C2823d(context, 4);
        context.getClass();
        this.f11330a = context;
        this.f11332c = c2823d;
        this.f11333d = c2823d2;
        this.f11334e = c2823d3;
        this.f11335f = c2823d4;
        int i13 = AbstractC38065t.f163031a;
        Looper looperMyLooper = Looper.myLooper();
        this.f11336g = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.f11338i = C34586d.f145642c;
        this.f11340k = 1;
        this.f11341l = true;
        this.f11342m = C2846k1.f11247c;
        this.f11343n = 5000L;
        this.f11344o = 15000L;
        this.f11345p = HMSConstantsKt.TIMEOUT_FOR_LOW_SPEED_INDICATOR_MILLIS;
        this.f11346q = new C2838i(AbstractC38065t.m121896J(20L), AbstractC38065t.m121896J(500L), 0);
        this.f11331b = C38061p.f163023a;
        this.f11347r = 500L;
        this.f11348s = 2000L;
        this.f11349t = true;
        this.f11351v = "";
        this.f11337h = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        new C22786e();
    }

    /* JADX INFO: renamed from: a */
    public final C2830f0 m8250a() {
        AbstractC35849g.m113807i(!this.f11350u);
        this.f11350u = true;
        return new C2830f0(this);
    }

    /* JADX INFO: renamed from: b */
    public final void m8251b(C34586d c34586d) {
        AbstractC35849g.m113807i(!this.f11350u);
        this.f11338i = c34586d;
        this.f11339j = true;
    }
}
