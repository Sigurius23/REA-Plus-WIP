package p450r5;

import android.bluetooth.le.ScanResult;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.SystemClock;
import android.view.Surface;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.health.platform.client.proto.C1533u;
import androidx.work.impl.WorkDatabase;
import b30.C2570m;
import com.stripe.hcaptcha.HCaptchaException;
import ge3.AbstractC15751g;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p012ab.C0680g0;
import p031b9.C2818b0;
import p031b9.C2830f0;
import p031b9.C2832g;
import p031b9.C2852m1;
import p031b9.C2865t;
import p031b9.C2867u;
import p031b9.SurfaceHolderCallbackC2821c0;
import p036bq.RunnableC3543b;
import p047c9.C4310a;
import p047c9.C4317h;
import p073cq.C11040i;
import p085d9.C11787e;
import p249jc.C21596v;
import p299l9.C23488c0;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p320m5.C25059c;
import p320m5.InterfaceC25063g;
import p412q3.C29875i;
import p420qc.C30194d;
import p454r9.C31078c;
import p465rm.AbstractC31558o1;
import p465rm.C31528e1;
import p465rm.C31552m1;
import p465rm.C31569t;
import p465rm.C31571u;
import p465rm.C31574v0;
import p465rm.C31577x;
import p465rm.SurfaceHolderCallbackC31565r;
import p480s5.C32198a;
import p484s9.C32284i;
import p513u4.AbstractC34514b;
import p516u8.C34629y0;
import p547v8.AbstractC35785b;
import p588wm.C37370l;
import p588wm.InterfaceC37374p;
import p589wn.C37394b;
import p607x8.AbstractC38056k;
import p607x8.AbstractC38065t;
import p607x8.C38058m;
import p619xl.C38445a;
import p692zt.C41109m;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import q80.C30034f;
import q83.AbstractC30060g;
import sm.C32709b;
import sm.C32711d;
import sn.C32742k0;
import sn.C32763v;
import td3.AbstractC33721a;
import td3.AbstractC33722b;
import td3.C33723c;
import td3.C33724d;
import td3.C33726f;
import td3.C33733m;
import u40.EnumC34528d;
import y40.C39207d;

/* JADX INFO: renamed from: r5.b */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC30928b implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f127624w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f127625x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f127626y;

    public /* synthetic */ RunnableC30928b(int i13, Object obj, Object obj2) {
        this.f127624w = i13;
        this.f127625x = obj;
        this.f127626y = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0061  */
    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    /* JADX WARN: Code duplicated, block: B:31:0x0088  */
    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0091  */
    /* JADX WARN: Code duplicated, block: B:35:0x0093  */
    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    /* JADX WARN: Code duplicated, block: B:38:0x009b  */
    /* JADX WARN: Code duplicated, block: B:39:0x009d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        long j7;
        boolean z4;
        int i13 = 13;
        long j13 = -9223372036854775807L;
        int i14 = 7;
        int i15 = 5;
        boolean z13 = false;
        int i16 = 1;
        switch (this.f127624w) {
            case 0:
                C30931e this$0 = (C30931e) this.f127625x;
                C22669g0 exception = (C22669g0) this.f127626y;
                AbstractC22676k.m65750j(this$0, "this$0");
                AbstractC22676k.m65750j(exception, "$exception");
                this$0.m95139e().mo38428a(exception.f89336w);
                return;
            case 1:
                C30931e this$1 = (C30931e) this.f127625x;
                GetCredentialUnknownException e5 = (GetCredentialUnknownException) this.f127626y;
                AbstractC22676k.m65750j(this$1, "this$0");
                AbstractC22676k.m65750j(e5, "$e");
                this$1.m95139e().mo38428a(e5);
                return;
            case 2:
                ((C31078c) ((C29875i) this.f127625x).f122096x).f128131g.getClass();
                return;
            case 3:
                C38445a c38445a = (C38445a) this.f127625x;
                C34629y0 c34629y0 = (C34629y0) this.f127626y;
                SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c0 = (SurfaceHolderCallbackC2821c0) c38445a.f164637y;
                int i17 = AbstractC38065t.f163031a;
                C2830f0 c2830f0 = surfaceHolderCallbackC2821c0.f11043w;
                c2830f0.f11107G0 = c34629y0;
                c2830f0.f11118N.m121835e(25, new C2818b0(c34629y0));
                return;
            case 4:
                C38445a c38445a2 = (C38445a) this.f127625x;
                C2832g c2832g = (C2832g) this.f127626y;
                synchronized (c2832g) {
                }
                SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c1 = (SurfaceHolderCallbackC2821c0) c38445a2.f164637y;
                int i18 = AbstractC38065t.f163031a;
                C4317h c4317h = surfaceHolderCallbackC2821c1.f11043w.f11124T;
                C4310a c4310aM13598h = c4317h.m13598h((C23488c0) c4317h.f17523z.f1165F);
                c4317h.m13602l(c4310aM13598h, 1020, new C0680g0(c4310aM13598h, c2832g, i13));
                return;
            case 5:
                C21596v c21596v = (C21596v) this.f127625x;
                String string = ((UUID) this.f127626y).toString();
                AbstractC22676k.m65749i(string, "toString(...)");
                AbstractC30060g.m92123m(c21596v, string);
                return;
            case 6:
                WorkDatabase workDatabase = (WorkDatabase) this.f127625x;
                C21596v c21596v2 = (C21596v) this.f127626y;
                Iterator it = ((List) AbstractC15751g.m44432L(workDatabase.mo5521h().f123665a, true, false, new C30034f(i13))).iterator();
                while (it.hasNext()) {
                    AbstractC30060g.m92123m(c21596v2, (String) it.next());
                }
                c21596v2.f82806b.f71449d.getClass();
                workDatabase.mo5516c().m92418b(new C30194d("last_cancel_all_time_ms", Long.valueOf(System.currentTimeMillis())));
                return;
            case 7:
                C31571u c31571u = (C31571u) this.f127625x;
                C31577x c31577x = (C31577x) this.f127626y;
                int i19 = c31571u.f130418i0 - c31577x.f130470c;
                c31571u.f130418i0 = i19;
                if (c31577x.f130471d) {
                    c31571u.f130419j0 = c31577x.f130472e;
                    c31571u.f130420k0 = true;
                }
                if (c31577x.f130473f) {
                    c31571u.f130421l0 = c31577x.f130474g;
                }
                if (i19 == 0) {
                    AbstractC31558o1 abstractC31558o1 = c31577x.f130469b.f130441a;
                    if (!c31571u.f130392K0.f130441a.m97175p() && abstractC31558o1.m97175p()) {
                        c31571u.f130394L0 = -1;
                        c31571u.f130396M0 = 0L;
                    }
                    if (!abstractC31558o1.m97175p()) {
                        List listAsList = Arrays.asList(((C31528e1) abstractC31558o1).f130133H);
                        AbstractC24543a.m71573i(listAsList.size() == c31571u.f130399P.size());
                        for (int i24 = 0; i24 < listAsList.size(); i24++) {
                            ((C31569t) c31571u.f130399P.get(i24)).f130369b = (AbstractC31558o1) listAsList.get(i24);
                        }
                    }
                    if (c31571u.f130420k0) {
                        if (c31577x.f130469b.f130442b.equals(c31571u.f130392K0.f130442b) && c31577x.f130469b.f130444d == c31571u.f130392K0.f130459s) {
                            i16 = 0;
                        }
                        if (i16 != 0) {
                            if (abstractC31558o1.m97175p() || c31577x.f130469b.f130442b.m102753a()) {
                                j13 = c31577x.f130469b.f130444d;
                            } else {
                                C31574v0 c31574v0 = c31577x.f130469b;
                                C32763v c32763v = c31574v0.f130442b;
                                long j14 = c31574v0.f130444d;
                                Object obj = c32763v.f136238a;
                                C31552m1 c31552m1 = c31571u.f130398O;
                                abstractC31558o1.mo97132g(obj, c31552m1);
                                j13 = j14 + c31552m1.f130281E;
                            }
                        }
                        j7 = j13;
                        z4 = i16;
                    } else {
                        j7 = -9223372036854775807L;
                        z4 = 0;
                    }
                    c31571u.f130420k0 = false;
                    c31571u.m97231z0(c31577x.f130469b, 1, c31571u.f130421l0, false, z4, c31571u.f130419j0, j7, -1);
                    return;
                }
                return;
            case 8:
                C32198a this$2 = (C32198a) this.f127625x;
                CreateCredentialException e13 = (CreateCredentialException) this.f127626y;
                AbstractC22676k.m65750j(this$2, "this$0");
                AbstractC22676k.m65750j(e13, "$e");
                InterfaceC25063g interfaceC25063g = this$2.f133335e;
                if (interfaceC25063g != null) {
                    interfaceC25063g.mo38428a(e13);
                    return;
                } else {
                    AbstractC22676k.m65757q("callback");
                    throw null;
                }
            case 9:
                C32198a c32198a = (C32198a) this.f127625x;
                C25059c c25059c = (C25059c) this.f127626y;
                InterfaceC25063g interfaceC25063g2 = c32198a.f133335e;
                if (interfaceC25063g2 != null) {
                    interfaceC25063g2.onResult(c25059c);
                    return;
                } else {
                    AbstractC22676k.m65757q("callback");
                    throw null;
                }
            case 10:
                C32284i c32284i = (C32284i) this.f127625x;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f127626y;
                SurfaceTexture surfaceTexture2 = c32284i.f133610G;
                Surface surface = c32284i.f133611H;
                Surface surface2 = new Surface(surfaceTexture);
                c32284i.f133610G = surfaceTexture;
                c32284i.f133611H = surface2;
                Iterator it3 = c32284i.f133615w.iterator();
                while (it3.hasNext()) {
                    ((SurfaceHolderCallbackC2821c0) it3.next()).f11043w.m8084E0(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 11:
                C32742k0 c32742k0 = (C32742k0) this.f127625x;
                InterfaceC37374p interfaceC37374p = (InterfaceC37374p) this.f127626y;
                c32742k0.f136142X = c32742k0.f136135Q == null ? interfaceC37374p : new C37370l(-9223372036854775807L);
                c32742k0.f136143Y = interfaceC37374p.mo3114f();
                if (c32742k0.f136149e0 == -1 && interfaceC37374p.mo3114f() == -9223372036854775807L) {
                    z13 = true;
                }
                c32742k0.f136144Z = z13;
                c32742k0.f136145a0 = z13 ? 7 : 1;
                c32742k0.f136125G.m102727q(c32742k0.f136143Y, interfaceC37374p.mo3113e(), c32742k0.f136144Z);
                if (c32742k0.f136139U) {
                    return;
                }
                c32742k0.m102724z();
                return;
            case 12:
                ((AbstractC33721a) ((RunnableC3543b) this.f127625x).f14263x).f141045h.mo18125c(4, (C33733m) this.f127626y);
                return;
            case 13:
                C33723c c33723c = (C33723c) this.f127625x;
                List list = (List) this.f127626y;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j15 = c33723c.f141052a;
                C33724d c33724d = c33723c.f141053b;
                if (j15 > (jElapsedRealtime - c33724d.f141044g.f141101E) + 5) {
                    return;
                }
                c33723c.f141052a = jElapsedRealtime;
                C33726f c33726f = (C33726f) AbstractC33722b.m106606a();
                ArrayList arrayList = new ArrayList();
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList.add(c33726f.m106610e((ScanResult) it4.next()));
                }
                c33724d.m106604b(arrayList);
                return;
            case 14:
                C29875i c29875i = (C29875i) this.f127625x;
                synchronized (((C2832g) this.f127626y)) {
                }
                SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r = (SurfaceHolderCallbackC31565r) c29875i.f122096x;
                int i25 = AbstractC24567y.f95875a;
                C32711d c32711d = surfaceHolderCallbackC31565r.f130359w.f130402S;
                c32711d.m102668z(c32711d.m102665v((C32763v) c32711d.f135994z.f1165F), MessageListItemViewType.MEDIA_ATTACHMENT, new C32709b(18));
                return;
            case 15:
                ((AbstractC34514b) this.f127625x).mo50021k((Typeface) this.f127626y);
                return;
            case 16:
                Context context = (Context) this.f127625x;
                C2852m1 c2852m1 = (C2852m1) this.f127626y;
                AbstractC35785b.f152188a = (AudioManager) context.getSystemService("audio");
                c2852m1.m8248c();
                return;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C37394b c37394b = (C37394b) this.f127625x;
                Uri uri = (Uri) this.f127626y;
                c37394b.f159983I = false;
                c37394b.m119748b(uri);
                return;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C2570m c2570m = (C2570m) this.f127625x;
                Object obj2 = this.f127626y;
                Object obj3 = c2570m.f9984E;
                c2570m.f9984E = obj2;
                if (obj3.equals(obj2)) {
                    return;
                }
                C2830f0 c2830f1 = ((C2867u) c2570m.f9989z).f11403w;
                ((Integer) obj3).getClass();
                Integer num = (Integer) obj2;
                int iIntValue = num.intValue();
                c2830f1.m8091L0();
                c2830f1.m8121v0(1, 10, num);
                c2830f1.m8121v0(2, 10, num);
                c2830f1.f11118N.m121835e(21, new C2865t(iIntValue, i16));
                return;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C38058m c38058m = (C38058m) this.f127625x;
                Context context2 = (Context) this.f127626y;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context2.registerReceiver(new C11787e(c38058m, i15), intentFilter);
                return;
            case 20:
                C11787e c11787e = (C11787e) this.f127625x;
                Context context3 = (Context) this.f127626y;
                C38058m c38058m2 = (C38058m) c11787e.f38222b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context3.getSystemService("connectivity");
                if (connectivityManager == null) {
                    i14 = 0;
                } else {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            i14 = 1;
                        } else {
                            int type = activeNetworkInfo.getType();
                            if (type == 0) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i14 = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                                        i14 = 4;
                                        break;
                                    case 13:
                                        i14 = 5;
                                        break;
                                    case 16:
                                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                    default:
                                        i14 = 6;
                                        break;
                                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                                        i14 = 2;
                                        break;
                                    case 20:
                                        if (AbstractC38065t.f163031a >= 29) {
                                            i14 = 9;
                                        } else {
                                            i14 = 0;
                                        }
                                        break;
                                }
                            } else if (type == 1) {
                                i14 = 2;
                            } else if (type == 4 || type == 5) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i14 = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                                        i14 = 4;
                                        break;
                                    case 13:
                                        i14 = 5;
                                        break;
                                    case 16:
                                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                    default:
                                        i14 = 6;
                                        break;
                                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                                        i14 = 2;
                                        break;
                                    case 20:
                                        if (AbstractC38065t.f163031a >= 29) {
                                            i14 = 9;
                                        } else {
                                            i14 = 0;
                                        }
                                        break;
                                }
                            } else if (type == 6) {
                                i14 = 5;
                            } else if (type != 9) {
                                i14 = 8;
                            }
                        }
                    } catch (SecurityException unused) {
                    }
                }
                if (AbstractC38065t.f163031a < 31 || i14 != 5) {
                    c38058m2.m121840c(i14);
                    return;
                } else {
                    AbstractC38056k.m121837a(context3, c38058m2);
                    return;
                }
            case 21:
                ((C39207d) this.f127625x).f168499x.mo109105e(new HCaptchaException((EnumC34528d) this.f127626y));
                return;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((C39207d) this.f127625x).f168499x.onSuccess((String) this.f127626y);
                return;
            default:
                C41109m c41109m = (C41109m) this.f127625x;
                C11040i c11040i = (C11040i) this.f127626y;
                try {
                    c11040i.m29687b(c41109m.m133444b());
                    return;
                } catch (Exception e14) {
                    c11040i.m29686a(e14);
                    return;
                }
        }
    }
}
