package lr;

import a00.C0072g;
import aa3.C0627i1;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.health.platform.client.proto.C1533u;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.stripe.hcaptcha.HCaptchaException;
import com.whoop.advancedlabs.feature.marketingconsent.view.MarketingConsentFragment;
import com.whoop.community.presentation.login.JoinTeamActivity;
import com.whoop.p069ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity;
import com.whoop.realtime.presentation.RealTimeRecordActivity;
import com.whoop.realtime.presentation.views.RealTimeStrainRangeView;
import dj.AbstractC12064i;
import e73.C12803b;
import io.sentry.android.replay.video.C20245d;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.zip.ZipInputStream;
import mm.C25680d;
import no.C26880m;
import om.InterfaceC28023b;
import p005a3.C0237p;
import p014aj.C0928c;
import p014aj.C0929d;
import p031b9.SurfaceHolderCallbackC2821c0;
import p085d9.C11799p;
import p309lo.AbstractC24543a;
import p309lo.C24552j;
import p309lo.InterfaceC24551i;
import p314m.AbstractC24858q;
import p320m5.InterfaceC25063g;
import p344nm.C26827i;
import p383ov.C28393o;
import p398p9.C28981e;
import p398p9.C28982f;
import p398p9.C28992p;
import p412q3.C29863b0;
import p412q3.EnumC29861a0;
import p446r1.C30849c;
import p450r5.C30931e;
import p460rg.AbstractC31375j;
import p465rm.C31525d1;
import p465rm.C31543j1;
import p465rm.C31581z;
import p465rm.SurfaceHolderCallbackC31565r;
import p480s5.C32198a;
import p484s9.C32284i;
import p573w5.C36833d;
import p607x8.AbstractC38065t;
import p607x8.C38057l;
import p627xv.C38665f;
import p694zv.C41162c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import sm.C32710c;
import sm.C32711d;
import t92.AbstractC33664b;
import u40.EnumC34528d;
import vn.C36180k;
import x40.InterfaceC37951a;

/* JADX INFO: renamed from: lr.e */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class RunnableC24693e implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f96601w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f96602x;

    public /* synthetic */ RunnableC24693e(Object obj, int i13) {
        this.f96601w = i13;
        this.f96602x = obj;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c0 A[Catch: all -> 0x0086, TryCatch #1 {, blocks: (B:24:0x007b, B:26:0x007f, B:33:0x008b, B:37:0x0092, B:43:0x009d, B:45:0x00a1, B:47:0x00a7, B:49:0x00b1, B:51:0x00bb, B:53:0x00cc, B:52:0x00c0, B:54:0x00ce, B:56:0x00e1, B:58:0x00e9), top: B:208:0x007b }] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, l83.h] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, l83.h] */
    @Override // java.lang.Runnable
    public final void run() {
        View viewFindFocus;
        String strM96500p;
        TelephonyManager telephonyManager;
        int i13 = 2;
        Boolean bool = null;
        switch (this.f96601w) {
            case 0:
                C12803b c12803b = (C12803b) this.f96602x;
                c12803b.f43824b = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) c12803b.f43825c;
                C36833d c36833d = sideSheetBehavior.f21027i;
                if (c36833d != null && c36833d.m118076f()) {
                    c12803b.m35866i(c12803b.f43826d);
                    return;
                } else {
                    if (sideSheetBehavior.f21026h == 2) {
                        sideSheetBehavior.m15776J(c12803b.f43826d);
                        return;
                    }
                    return;
                }
            case 1:
                AbstractC24858q.m72884r((Context) this.f96602x);
                return;
            case 2:
                C0072g c0072g = (C0072g) this.f96602x;
                ((C26827i) ((InterfaceC28023b) c0072g.f221E)).m80062s(new C25680d(c0072g, i13));
                return;
            case 3:
                C26880m c26880m = (C26880m) this.f96602x;
                Surface surface = c26880m.f107284H;
                if (surface != null) {
                    Iterator it = c26880m.f107288w.iterator();
                    while (it.hasNext()) {
                        ((SurfaceHolderCallbackC31565r) it.next()).f130359w.m97228w0(null);
                    }
                }
                SurfaceTexture surfaceTexture = c26880m.f107283G;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                c26880m.f107283G = null;
                c26880m.f107284H = null;
                return;
            case 4:
                RealTimeRecordActivity.C9845b.m23847t((RealTimeRecordActivity.C9845b) this.f96602x);
                return;
            case 5:
                ((JoinTeamActivity) this.f96602x).startPostponedEnterTransition();
                return;
            case 6:
                C28393o c28393o = (C28393o) this.f96602x;
                c28393o.f114556s0.removeCallbacksAndMessages(null);
                c28393o.f114553p0.clear();
                c28393o.m86083o(c28393o.f114551n0);
                c28393o.m86083o(c28393o.f114552o0);
                return;
            case 7:
                InterfaceC25063g callback = (InterfaceC25063g) this.f96602x;
                AbstractC22676k.m65750j(callback, "$callback");
                callback.onResult(null);
                return;
            case 8:
                C29863b0 c29863b0 = (C29863b0) this.f96602x;
                C0237p c0237p = c29863b0.f122050b;
                c29863b0.f122062n = null;
                C30849c c30849c = c29863b0.f122061m;
                View view = c29863b0.f122049a;
                if (!view.isFocused() && (viewFindFocus = view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    c30849c.m94890g();
                    return;
                }
                Object[] objArr = c30849c.f127227w;
                int i14 = c30849c.f127229y;
                Boolean boolValueOf = null;
                for (int i15 = 0; i15 < i14; i15++) {
                    EnumC29861a0 enumC29861a0 = (EnumC29861a0) objArr[i15];
                    int iOrdinal = enumC29861a0.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            bool = Boolean.FALSE;
                        } else {
                            if (iOrdinal != 2 && iOrdinal != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (!AbstractC22676k.m65745e(bool, Boolean.FALSE)) {
                                boolValueOf = Boolean.valueOf(enumC29861a0 == EnumC29861a0.f122043y);
                            }
                        }
                    } else {
                        bool = Boolean.TRUE;
                    }
                    boolValueOf = bool;
                }
                c30849c.m94890g();
                if (AbstractC22676k.m65745e(bool, Boolean.TRUE)) {
                    ((InputMethodManager) c0237p.f813y.getValue()).restartInput((View) c0237p.f812x);
                }
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        ((C0928c) ((C0929d) c0237p.f814z).f3422w).mo2312V();
                    } else {
                        ((C0928c) ((C0929d) c0237p.f814z).f3422w).mo2302L();
                    }
                }
                if (AbstractC22676k.m65745e(bool, Boolean.FALSE)) {
                    ((InputMethodManager) c0237p.f813y.getValue()).restartInput((View) c0237p.f812x);
                    return;
                }
                return;
            case 9:
                CountDownLatch completionLatch = (CountDownLatch) this.f96602x;
                AbstractC22676k.m65750j(completionLatch, "$completionLatch");
                completionLatch.countDown();
                return;
            case 10:
                AbstractC12064i.m33264b((InputStream) this.f96602x);
                return;
            case 11:
                AbstractC12064i.m33264b((ZipInputStream) this.f96602x);
                return;
            case 12:
                BleConnectStrapActivity.m27084a1((BleConnectStrapActivity) this.f96602x);
                return;
            case 13:
                ((C30931e) this.f96602x).m95139e().mo38428a(new GetCredentialUnknownException("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                return;
            case 14:
                RealTimeStrainRangeView.m24171b((RealTimeStrainRangeView) this.f96602x);
                return;
            case 15:
                C31525d1 c31525d1 = (C31525d1) this.f96602x;
                try {
                    synchronized (c31525d1) {
                    }
                    try {
                        c31525d1.f130116a.mo75855a(c31525d1.f130119d, c31525d1.f130120e);
                        return;
                    } finally {
                        c31525d1.m97124b(true);
                    }
                } catch (ExoPlaybackException e5) {
                    AbstractC24543a.m71578n("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e5);
                    throw new RuntimeException(e5);
                }
            case 16:
                ((C31543j1) this.f96602x).m97147d();
                return;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                InterfaceC25063g interfaceC25063g = ((C32198a) this.f96602x).f133335e;
                if (interfaceC25063g != null) {
                    interfaceC25063g.mo38428a(new CreateCredentialUnknownException("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                    return;
                } else {
                    AbstractC22676k.m65757q("callback");
                    throw null;
                }
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C32284i c32284i = (C32284i) this.f96602x;
                Surface surface2 = c32284i.f133611H;
                if (surface2 != null) {
                    Iterator it3 = c32284i.f133615w.iterator();
                    while (it3.hasNext()) {
                        ((SurfaceHolderCallbackC2821c0) it3.next()).f11043w.m8084E0(null);
                    }
                }
                SurfaceTexture surfaceTexture2 = c32284i.f133610G;
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface2 != null) {
                    surface2.release();
                }
                c32284i.f133610G = null;
                c32284i.f133611H = null;
                return;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                MarketingConsentFragment.m17461G((MarketingConsentFragment) this.f96602x);
                return;
            case 20:
                C32711d c32711d = (C32711d) this.f96602x;
                c32711d.m102668z(c32711d.m102663t(), 1028, new C32710c(15));
                C11799p c11799p = c32711d.f135987F;
                CopyOnWriteArraySet<C24552j> copyOnWriteArraySet = (CopyOnWriteArraySet) c11799p.f38304e;
                for (C24552j c24552j : copyOnWriteArraySet) {
                    InterfaceC24551i interfaceC24551i = (InterfaceC24551i) c11799p.f38303d;
                    c24552j.f95823d = true;
                    if (c24552j.f95822c) {
                        interfaceC24551i.mo71596a(c24552j.f95820a, c24552j.f95821b.m71593b());
                    }
                }
                copyOnWriteArraySet.clear();
                c11799p.f38300a = true;
                return;
            case 21:
                ((CarouselLayoutManager) this.f96602x).requestLayout();
                return;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                AbstractC33664b.m106323E1((AbstractC33664b) this.f96602x);
                return;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((C36180k) this.f96602x).m115126r();
                return;
            case 24:
                Iterator it4 = ((ArrayList) ((C20245d) this.f96602x).f76048d).iterator();
                while (it4.hasNext()) {
                    ((InterfaceC37951a) it4.next()).mo109105e(new HCaptchaException(EnumC34528d.TOKEN_TIMEOUT));
                }
                return;
            case 25:
                C38057l c38057l = (C38057l) this.f96602x;
                C28981e c28981e = (C28981e) c38057l.f163005a.get();
                if (c28981e != null) {
                    int iM121839b = c38057l.f163007c.m121839b();
                    C28982f c28982f = c28981e.f117222a;
                    synchronized (c28982f) {
                        int i16 = c28982f.f117243n;
                        if (i16 == 0 || c28982f.f117234e) {
                            if (i16 != iM121839b || c28982f.f117244o == null) {
                                c28982f.f117243n = iM121839b;
                                if (iM121839b != 1 && iM121839b != 0 && iM121839b != 8) {
                                    if (c28982f.f117244o == null) {
                                        Context context = c28982f.f117230a;
                                        int i17 = AbstractC38065t.f163031a;
                                        if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
                                            strM96500p = AbstractC31375j.m96500p(Locale.getDefault().getCountry());
                                        } else {
                                            String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                            if (TextUtils.isEmpty(networkCountryIso)) {
                                                strM96500p = AbstractC31375j.m96500p(Locale.getDefault().getCountry());
                                            } else {
                                                strM96500p = AbstractC31375j.m96500p(networkCountryIso);
                                            }
                                        }
                                        c28982f.f117244o = strM96500p;
                                    }
                                    c28982f.f117241l = c28982f.m88003a(iM121839b);
                                    c28982f.f117233d.getClass();
                                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                                    c28982f.m88004b(c28982f.f117236g > 0 ? (int) (jElapsedRealtime - c28982f.f117237h) : 0, c28982f.f117238i, c28982f.f117241l);
                                    c28982f.f117237h = jElapsedRealtime;
                                    c28982f.f117238i = 0L;
                                    c28982f.f117240k = 0L;
                                    c28982f.f117239j = 0L;
                                    C28992p c28992p = c28982f.f117235f;
                                    c28992p.f117271a.clear();
                                    c28992p.f117273c = -1;
                                    c28992p.f117274d = 0;
                                    c28992p.f117275e = 0;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
            case 26:
                ((C38665f) this.f96602x).requestLayout();
                return;
            case 27:
                C0627i1 c0627i1 = (C0627i1) this.f96602x;
                synchronized (((ArrayDeque) c0627i1.f2197d)) {
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) c0627i1.f2195b).edit();
                    String str = (String) c0627i1.f2198e;
                    StringBuilder sb4 = new StringBuilder();
                    Iterator it5 = ((ArrayDeque) c0627i1.f2197d).iterator();
                    while (it5.hasNext()) {
                        sb4.append((String) it5.next());
                        sb4.append((String) c0627i1.f2196c);
                    }
                    editorEdit.putString(str, sb4.toString()).commit();
                    break;
                }
                return;
            default:
                C41162c previousStatus = (C41162c) this.f96602x;
                AbstractC22676k.m65750j(previousStatus, "$previousStatus");
                throw null;
        }
    }

    public /* synthetic */ RunnableC24693e(C31581z c31581z, C31525d1 c31525d1) {
        this.f96601w = 15;
        this.f96602x = c31525d1;
    }
}
