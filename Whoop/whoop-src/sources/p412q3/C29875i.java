package p412q3;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import androidx.cardview.widget.CardView;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.C5057p;
import g73.C15556d;
import gm.C15982j;
import in.C18718f;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25265s;
import mo.C25728i;
import ng3.C26701n;
import no.C26869b;
import p031b9.C2832g;
import p073cq.C11040i;
import p073cq.InterfaceC11035d;
import p073cq.InterfaceC11038g;
import p093dl.C12154s;
import p094dn.C12185e;
import p294l3.C23254g;
import p294l3.C23283u0;
import p309lo.AbstractC24567y;
import p450r5.RunnableC30928b;
import p465rm.AbstractC31523d;
import p465rm.SurfaceHolderCallbackC31565r;
import p479s4.AbstractC32122c;
import p503tp.C34046q;
import p559vr.C36299i;
import p586wk.InterfaceC37327e;
import p618xk.InterfaceC38413d;
import p618xk.InterfaceC38414e;
import p621xn.C38472i;
import p623xr.C38615k;
import p623xr.C38624t;
import p623xr.InterfaceC38616l;
import p684zk.C40778d;
import p684zk.C40779d0;
import p684zk.C40786k;
import p684zk.RunnableC40784i;
import p690zr.AbstractC41023g0;
import p690zr.C41060w0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q11.C29793c;
import q30.C29938w0;
import sr.C32900h;
import tm.AbstractC33927e;
import tm.C33928f;
import tm.C33941s;
import tm.C33942t;
import tm.C33944v;
import tm.InterfaceC33930h;

/* JADX INFO: renamed from: q3.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C29875i implements InterfaceC38616l, InterfaceC11038g, InterfaceC11035d, InterfaceC38413d {

    /* JADX INFO: renamed from: w */
    public Object f122095w;

    /* JADX INFO: renamed from: x */
    public Object f122096x;

    public /* synthetic */ C29875i(Object obj) {
        this.f122096x = obj;
    }

    @Override // p623xr.InterfaceC38617m
    /* JADX INFO: renamed from: a */
    public Object mo45127a() {
        return new C32900h(((C15982j) this.f122095w).f60491w, (C38624t) ((C38615k) this.f122096x).mo45127a(), new C26701n(28));
    }

    /* JADX INFO: renamed from: b */
    public C29891y m91496b(List list) {
        InterfaceC29874h interfaceC29874h = null;
        try {
            int size = list.size();
            int i13 = 0;
            InterfaceC29874h interfaceC29874h2 = null;
            while (i13 < size) {
                try {
                    InterfaceC29874h interfaceC29874h3 = (InterfaceC29874h) list.get(i13);
                    try {
                        interfaceC29874h3.mo30730a((C12185e) this.f122096x);
                        i13++;
                        interfaceC29874h2 = interfaceC29874h3;
                    } catch (Exception e5) {
                        e = e5;
                        interfaceC29874h = interfaceC29874h3;
                        StringBuilder sb4 = new StringBuilder();
                        StringBuilder sb5 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                        sb5.append(((C5057p) ((C12185e) this.f122096x).f40622F).m15860c());
                        sb5.append(", composition=");
                        sb5.append(((C12185e) this.f122096x).m33788g());
                        sb5.append(", selection=");
                        C12185e c12185e = (C12185e) this.f122096x;
                        sb5.append((Object) C23283u0.m67362h(AbstractC21478l0.m60431f(c12185e.f40624x, c12185e.f40625y)));
                        sb5.append("):");
                        sb4.append(sb5.toString());
                        sb4.append('\n');
                        AbstractC25265s.m74109M0(list, sb4, "\n", null, null, new C29793c(1, interfaceC29874h, this), 60);
                        String string = sb4.toString();
                        AbstractC22676k.m65749i(string, "toString(...)");
                        throw new RuntimeException(string, e);
                    }
                } catch (Exception e13) {
                    e = e13;
                    interfaceC29874h = interfaceC29874h2;
                }
            }
            C12185e c12185e2 = (C12185e) this.f122096x;
            c12185e2.getClass();
            C23254g c23254g = new C23254g(((C5057p) c12185e2.f40622F).toString());
            C12185e c12185e3 = (C12185e) this.f122096x;
            long jM60431f = AbstractC21478l0.m60431f(c12185e3.f40624x, c12185e3.f40625y);
            C23283u0 c23283u0 = C23283u0.m67361g(((C29891y) this.f122095w).f122126b) ? null : new C23283u0(jM60431f);
            C29891y c29891y = new C29891y(c23254g, c23283u0 != null ? c23283u0.f92253a : AbstractC21478l0.m60431f(C23283u0.m67359e(jM60431f), C23283u0.m67360f(jM60431f)), ((C12185e) this.f122096x).m33788g());
            this.f122095w = c29891y;
            return c29891y;
        } catch (Exception e14) {
            e = e14;
        }
    }

    @Override // p618xk.InterfaceC38413d
    /* JADX INFO: renamed from: c */
    public void mo33617c(Exception exc) {
        C40779d0 c40779d0 = (C40779d0) this.f122096x;
        C12154s c12154s = (C12154s) this.f122095w;
        C12154s c12154s2 = c40779d0.f175832F;
        if (c12154s2 == null || c12154s2 != c12154s) {
            return;
        }
        RunnableC40784i runnableC40784i = c40779d0.f175835x;
        C40778d c40778d = c40779d0.f175833G;
        InterfaceC38414e interfaceC38414e = c12154s.f40409c;
        runnableC40784i.mo132264a(c40778d, exc, interfaceC38414e, interfaceC38414e.mo33599d());
    }

    @Override // p073cq.InterfaceC11038g
    /* JADX INFO: renamed from: d */
    public void mo29685d() {
        ((FusedLocationProviderClient) this.f122095w).removeLocationUpdates((C34046q) this.f122096x);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x005b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0083  */
    /* JADX INFO: renamed from: e */
    public AbstractC31523d[] m91497e(Handler handler, SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r, SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r2, SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r3, SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r4) {
        ArrayList arrayList = new ArrayList();
        Context context = (Context) this.f122095w;
        C15556d c15556d = (C15556d) this.f122096x;
        arrayList.add(new C25728i(context, c15556d, handler, surfaceHolderCallbackC31565r));
        C29938w0 c29938w0 = new C29938w0(15, (byte) 0);
        C33928f c33928f = C33928f.f142169c;
        c29938w0.f122260x = c33928f;
        c29938w0.f122262z = C33942t.f142297a;
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        int i13 = AbstractC24567y.f95875a;
        if (i13 >= 17) {
            String str = AbstractC24567y.f95877c;
            if (("Amazon".equals(str) || "Xiaomi".equals(str)) && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
                c33928f = C33928f.f142170d;
            } else if (i13 < 29 && (AbstractC24567y.m71694y(context) || (i13 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
                c33928f = new C33928f(AbstractC33927e.m107344a(), 8);
            } else if (intentRegisterReceiver != null && intentRegisterReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
                c33928f = new C33928f(intentRegisterReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), intentRegisterReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
            }
        } else if (i13 < 29) {
            if (intentRegisterReceiver != null) {
                c33928f = new C33928f(intentRegisterReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), intentRegisterReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
            }
        } else if (intentRegisterReceiver != null) {
            c33928f = new C33928f(intentRegisterReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), intentRegisterReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        }
        c33928f.getClass();
        c29938w0.f122260x = c33928f;
        if (((C29938w0) c29938w0.f122261y) == null) {
            c29938w0.f122261y = new C29938w0(new InterfaceC33930h[0]);
        }
        arrayList.add(new C33944v((Context) this.f122095w, c15556d, handler, surfaceHolderCallbackC31565r2, new C33941s(c29938w0)));
        arrayList.add(new C38472i(surfaceHolderCallbackC31565r3, handler.getLooper()));
        arrayList.add(new C18718f(surfaceHolderCallbackC31565r4, handler.getLooper()));
        arrayList.add(new C26869b());
        return (AbstractC31523d[]) arrayList.toArray(new AbstractC31523d[0]);
    }

    @Override // p618xk.InterfaceC38413d
    /* JADX INFO: renamed from: f */
    public void mo33618f(Object obj) {
        C40779d0 c40779d0 = (C40779d0) this.f122096x;
        C12154s c12154s = (C12154s) this.f122095w;
        C12154s c12154s2 = c40779d0.f175832F;
        if (c12154s2 == null || c12154s2 != c12154s) {
            return;
        }
        C40786k c40786k = c40779d0.f175834w.f175853p;
        if (obj != null && c40786k.m132286a(c12154s.f40409c.mo33599d())) {
            c40779d0.f175831E = obj;
            c40779d0.f175835x.m132281m();
        } else {
            RunnableC40784i runnableC40784i = c40779d0.f175835x;
            InterfaceC37327e interfaceC37327e = c12154s.f40407a;
            InterfaceC38414e interfaceC38414e = c12154s.f40409c;
            runnableC40784i.mo132265c(interfaceC37327e, obj, interfaceC38414e, interfaceC38414e.mo33599d(), c40779d0.f175833G);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m91498g(C2832g c2832g) {
        synchronized (c2832g) {
        }
        Handler handler = (Handler) this.f122095w;
        if (handler != null) {
            handler.post(new RunnableC30928b(14, this, c2832g));
        }
    }

    /* JADX INFO: renamed from: h */
    public void m91499h(Context context, Uri uri) {
        Intent intent = (Intent) this.f122095w;
        intent.setData(uri);
        AbstractC32122c.startActivity(context, intent, (Bundle) this.f122096x);
    }

    /* JADX INFO: renamed from: i */
    public void m91500i(int i13, int i14, int i15, int i16) {
        CardView cardView = (CardView) this.f122096x;
        cardView.f4459z.set(i13, i14, i15, i16);
        Rect rect = cardView.f4458y;
        super/*android.view.View*/.setPadding(i13 + rect.left, i14 + rect.top, i15 + rect.right, i16 + rect.bottom);
    }

    @Override // p073cq.InterfaceC11035d
    /* JADX INFO: renamed from: q */
    public void mo944q(Task task) {
        C36299i c36299i = (C36299i) this.f122095w;
        C11040i c11040i = (C11040i) this.f122096x;
        synchronized (c36299i.f155547f) {
            c36299i.f155546e.remove(c11040i);
        }
    }

    public /* synthetic */ C29875i(Object obj, Object obj2) {
        this.f122095w = obj;
        this.f122096x = obj2;
    }

    public /* synthetic */ C29875i(Object obj, Object obj2, boolean z4) {
        this.f122096x = obj;
        this.f122095w = obj2;
    }

    public C29875i(C41060w0 c41060w0, int[] iArr) {
        this.f122095w = AbstractC41023g0.m133252m(c41060w0);
        this.f122096x = iArr;
    }
}
