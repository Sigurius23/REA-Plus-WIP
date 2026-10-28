package p400pc;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import bc3.InterfaceC3027k1;
import hg3.AbstractC17269i;
import ih0.AbstractC18489d0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import mc.AbstractC25406c;
import mc.C25405b;
import mc.C25411h;
import mc.InterfaceC25409f;
import p006a4.AbstractC0354a;
import p218ic.C18370m;
import p218ic.C18389w;
import p249jc.C21577g;
import p249jc.C21586l;
import p249jc.C21596v;
import p249jc.InterfaceC21571d;
import p420qc.C30200j;
import p420qc.C30207q;
import p457rc.RunnableC31226i;
import sc.InterfaceC32351a;

/* JADX INFO: renamed from: pc.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C29063b implements InterfaceC25409f, InterfaceC21571d {

    /* JADX INFO: renamed from: J */
    public static final String f117588J = C18389w.m52887f("SystemFgDispatcher");

    /* JADX INFO: renamed from: E */
    public final LinkedHashMap f117589E;

    /* JADX INFO: renamed from: F */
    public final HashMap f117590F;

    /* JADX INFO: renamed from: G */
    public final HashMap f117591G;

    /* JADX INFO: renamed from: H */
    public final C25411h f117592H;

    /* JADX INFO: renamed from: I */
    public SystemForegroundService f117593I;

    /* JADX INFO: renamed from: w */
    public final C21596v f117594w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC32351a f117595x;

    /* JADX INFO: renamed from: y */
    public final Object f117596y = new Object();

    /* JADX INFO: renamed from: z */
    public C30200j f117597z;

    public C29063b(Context context) {
        C21596v c21596vM60637g = C21596v.m60637g(context);
        this.f117594w = c21596vM60637g;
        this.f117595x = c21596vM60637g.f82808d;
        this.f117597z = null;
        this.f117589E = new LinkedHashMap();
        this.f117591G = new HashMap();
        this.f117590F = new HashMap();
        this.f117592H = new C25411h(c21596vM60637g.f82814j);
        c21596vM60637g.f82810f.m60619a(this);
    }

    /* JADX INFO: renamed from: a */
    public static Intent m88340a(Context context, C30200j c30200j, C18370m c18370m) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", c30200j.f123603a);
        intent.putExtra("KEY_GENERATION", c30200j.f123604b);
        intent.putExtra("KEY_NOTIFICATION_ID", c18370m.f71509a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c18370m.f71510b);
        intent.putExtra("KEY_NOTIFICATION", c18370m.f71511c);
        return intent;
    }

    /* JADX INFO: renamed from: c */
    public static Intent m88341c(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    @Override // p249jc.InterfaceC21571d
    /* JADX INFO: renamed from: b */
    public final void mo5525b(C30200j c30200j, boolean z4) {
        Map.Entry entry;
        synchronized (this.f117596y) {
            try {
                InterfaceC3027k1 interfaceC3027k1 = ((C30207q) this.f117590F.remove(c30200j)) != null ? (InterfaceC3027k1) this.f117591G.remove(c30200j) : null;
                if (interfaceC3027k1 != null) {
                    interfaceC3027k1.cancel((CancellationException) null);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        C18370m c18370m = (C18370m) this.f117589E.remove(c30200j);
        if (c30200j.equals(this.f117597z)) {
            if (this.f117589E.size() > 0) {
                Iterator it = this.f117589E.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f117597z = (C30200j) entry.getKey();
                if (this.f117593I != null) {
                    C18370m c18370m2 = (C18370m) entry.getValue();
                    SystemForegroundService systemForegroundService = this.f117593I;
                    int i13 = c18370m2.f71509a;
                    int i14 = c18370m2.f71510b;
                    Notification notification = c18370m2.f71511c;
                    systemForegroundService.getClass();
                    int i15 = Build.VERSION.SDK_INT;
                    if (i15 >= 31) {
                        AbstractC0354a.m957D(systemForegroundService, i13, notification, i14);
                    } else if (i15 >= 29) {
                        AbstractC0354a.m956C(systemForegroundService, i13, notification, i14);
                    } else {
                        systemForegroundService.startForeground(i13, notification);
                    }
                    this.f117593I.f7362z.cancel(c18370m2.f71509a);
                }
            } else {
                this.f117597z = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.f117593I;
        if (c18370m == null || systemForegroundService2 == null) {
            return;
        }
        C18389w.m52886d().m52888a(f117588J, "Removing Notification (id: " + c18370m.f71509a + ", workSpecId: " + c30200j + ", notificationType: " + c18370m.f71510b);
        systemForegroundService2.f7362z.cancel(c18370m.f71509a);
    }

    @Override // mc.InterfaceC25409f
    /* JADX INFO: renamed from: d */
    public final void mo64225d(C30207q c30207q, AbstractC25406c abstractC25406c) {
        if (abstractC25406c instanceof C25405b) {
            String str = c30207q.f123634a;
            C18389w.m52886d().m52888a(f117588J, "Constraints unmet for WorkSpec " + str);
            C30200j c30200jM48869P = AbstractC17269i.m48869P(c30207q);
            int i13 = ((C25405b) abstractC25406c).f99502a;
            C21596v c21596v = this.f117594w;
            c21596v.f82808d.m100716a(new RunnableC31226i(c21596v.f82810f, new C21586l(c30200jM48869P), true, i13));
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m88342e(Intent intent) {
        if (this.f117593I == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int i13 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        C30200j c30200j = new C30200j(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        C18389w c18389wM52886d = C18389w.m52886d();
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(intExtra, "Notifying with (id:", ", workSpecId: ", stringExtra, ", notificationType :");
        sbM53373n.append(intExtra2);
        sbM53373n.append(")");
        c18389wM52886d.m52888a(f117588J, sbM53373n.toString());
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        C18370m c18370m = new C18370m(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f117589E;
        linkedHashMap.put(c30200j, c18370m);
        C18370m c18370m2 = (C18370m) linkedHashMap.get(this.f117597z);
        if (c18370m2 == null) {
            this.f117597z = c30200j;
        } else {
            this.f117593I.f7362z.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i13 |= ((C18370m) ((Map.Entry) it.next()).getValue()).f71510b;
                }
                c18370m = new C18370m(c18370m2.f71509a, c18370m2.f71511c, i13);
            } else {
                c18370m = c18370m2;
            }
        }
        SystemForegroundService systemForegroundService = this.f117593I;
        int i14 = c18370m.f71509a;
        int i15 = c18370m.f71510b;
        Notification notification2 = c18370m.f71511c;
        systemForegroundService.getClass();
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 31) {
            AbstractC0354a.m957D(systemForegroundService, i14, notification2, i15);
        } else if (i16 >= 29) {
            AbstractC0354a.m956C(systemForegroundService, i14, notification2, i15);
        } else {
            systemForegroundService.startForeground(i14, notification2);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m88343f() {
        this.f117593I = null;
        synchronized (this.f117596y) {
            try {
                Iterator it = this.f117591G.values().iterator();
                while (it.hasNext()) {
                    ((InterfaceC3027k1) it.next()).cancel((CancellationException) null);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        C21577g c21577g = this.f117594w.f82810f;
        synchronized (c21577g.f82749k) {
            c21577g.f82748j.remove(this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m88344g(int i13, int i14) {
        C18389w.m52886d().m52891e(f117588J, "Foreground service timed out, FGS type: " + i14);
        for (Map.Entry entry : this.f117589E.entrySet()) {
            if (((C18370m) entry.getValue()).f71510b == i14) {
                C30200j c30200j = (C30200j) entry.getKey();
                C21596v c21596v = this.f117594w;
                c21596v.f82808d.m100716a(new RunnableC31226i(c21596v.f82810f, new C21586l(c30200j), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.f117593I;
        if (systemForegroundService != null) {
            systemForegroundService.f7360x = true;
            C18389w.m52886d().m52888a(SystemForegroundService.f7359E, "Shutting down.");
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf(i13);
        }
    }
}
