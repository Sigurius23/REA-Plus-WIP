package io.sentry;

import a30.C0332w0;
import android.app.Activity;
import android.os.SystemClock;
import android.util.Log;
import android.widget.TimePicker;
import androidx.core.app.FrameMetricsAggregator;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.RunnableC1645z0;
import com.amplitude.android.engagement.C4861a;
import com.google.crypto.tink.internal.C5099k0;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import io.sentry.android.core.C20049a;
import io.sentry.android.core.C20067d;
import io.sentry.android.core.C20068d0;
import io.sentry.android.core.C20071e0;
import io.sentry.android.core.C20079h;
import io.sentry.android.core.C20084i1;
import io.sentry.android.core.C20119j1;
import io.sentry.android.core.C20121k0;
import io.sentry.android.core.C20122k1;
import io.sentry.android.core.C20153s;
import io.sentry.android.core.RunnableC20151r0;
import io.sentry.android.core.internal.util.C20102c;
import io.sentry.android.core.performance.C20144g;
import io.sentry.android.ndk.C20177b;
import io.sentry.android.replay.C20180a0;
import io.sentry.android.replay.C20204f;
import io.sentry.android.replay.C20212k;
import io.sentry.android.replay.C20213l;
import io.sentry.android.replay.C20215n;
import io.sentry.android.replay.C20231t;
import io.sentry.android.replay.C20253w;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.capture.AbstractC20195k;
import io.sentry.android.replay.capture.C20192h;
import io.sentry.android.replay.capture.C20193i;
import io.sentry.android.replay.screenshot.C20228h;
import io.sentry.cache.C20283f;
import io.sentry.ndk.NativeScope;
import io.sentry.protocol.C20501v;
import io.sentry.util.C20584f;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import jo.C21816e;
import jo.C21830s;
import l41.AbstractC23332d;
import live.hms.video.audio.HMSAudioManagerLegacy;
import live.hms.video.audio.manager.HMSAudioManagerApi31;
import live.hms.video.diagnostics.HMSDiagnostics;
import live.hms.video.media.capturers.camera.CameraControl;
import live.hms.videoview.common.VideoTrackManager;
import live.hms.videoview.textureview.HMSTextureRenderer;
import live.hms.videoview.textureview.HMSTextureRenderer$init$1$1;
import m83.AbstractC25265s;
import m83.AbstractC25269w;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p002a0.C0006a1;
import p026b2.C2298d;
import p027b3.C2365d3;
import p097ds.RunnableC12316s;
import p197hj.C17324g;
import p197hj.C17334q;
import p197hj.C17338u;
import p213i7.C18194g;
import p249jc.AbstractC21598x;
import p254jj.C21736b;
import p269k1.C22114e;
import p281kj.C22509d;
import p281kj.C22510e;
import p284ko.C22610c;
import p328mj.C25600g;
import p690zr.AbstractC41023g0;
import p690zr.AbstractC41047q;
import p715kotlin.jvm.internal.AbstractC22676k;
import sm.C32710c;
import sm.C32711d;
import sn.C32763v;
import va3.AbstractC35854l;
import x83.AbstractC38093j;
import xb3.C38166a;
import yb3.AbstractC39397a;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: io.sentry.c7 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC20277c7 implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f76150w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f76151x;

    public /* synthetic */ RunnableC20277c7(C20049a c20049a, C18194g c18194g) {
        this.f76150w = 1;
        this.f76151x = c20049a;
    }

    /* JADX WARN: Code duplicated, block: B:186:0x03e0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, l83.h] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.Object, l83.h] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        File file;
        Throwable th3;
        Date dateM60660P;
        String str;
        EnumC20521r6 enumC20521r6ValueOf;
        File file2;
        C20204f c20204f;
        Iterable linkedList;
        Field field;
        C17334q c17334q;
        switch (this.f76150w) {
            case 0:
                ShutdownHookIntegration shutdownHookIntegration = (ShutdownHookIntegration) this.f76151x;
                shutdownHookIntegration.f75177w.removeShutdownHook(shutdownHookIntegration.f75178x);
                return;
            case 1:
                C20049a c20049a = (C20049a) this.f76151x;
                c20049a.f75307H = SystemClock.uptimeMillis();
                c20049a.f75308I.set(false);
                return;
            case 2:
                ((FrameMetricsAggregator) ((C20584f) ((C20067d) this.f76151x).f75376a).m56714a()).stop();
                return;
            case 3:
                ((C20079h) this.f76151x).m55954h(true);
                return;
            case 4:
                ((C20153s) this.f76151x).m56054a(null, true);
                return;
            case 5:
                C20068d0 c20068d0 = (C20068d0) this.f76151x;
                if (c20068d0 != null) {
                    ProcessLifecycleOwner.f6173I.f6175F.mo4988d(c20068d0);
                    return;
                }
                return;
            case 6:
                C20119j1 c20119j1 = ((C20122k1) this.f76151x).f75598g;
                while (true) {
                    C20084i1 c20084i1 = (C20084i1) c20119j1.f75587d;
                    if (c20084i1 == null) {
                        c20119j1.f75588e = null;
                        c20119j1.f75584a = 0;
                        c20119j1.f75585b = 0;
                        return;
                    } else {
                        c20119j1.f75587d = c20084i1.f75447c;
                        C20121k0 c20121k0 = (C20121k0) c20119j1.f75586c;
                        c20084i1.f75447c = (C20084i1) c20121k0.f75591a;
                        c20121k0.f75591a = c20084i1;
                    }
                }
                break;
            case 7:
                C20102c c20102c = (C20102c) this.f76151x;
                c20102c.m55989a0(true);
                C20535s c20535sM56711a = C20102c.f75512N.m56711a();
                try {
                    C20102c.f75513O.clear();
                    c20535sM56711a.close();
                    C20535s c20535sM56711a2 = C20102c.f75510L.m56711a();
                    try {
                        C20102c.f75511M = null;
                        c20535sM56711a2.close();
                        C20071e0.f75391E.m55944k(c20102c);
                        return;
                    } catch (Throwable th4) {
                        try {
                            c20535sM56711a2.close();
                            throw th4;
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                            throw th4;
                        }
                    }
                } catch (Throwable th6) {
                    try {
                        c20535sM56711a.close();
                        throw th6;
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                        throw th6;
                    }
                }
            case 8:
                C20144g.m56041a((C20144g) ((RunnableC12316s) this.f76151x).f41247y);
                return;
            case 9:
                ((C20177b) this.f76151x).f75785b.getClass();
                NativeScope.nativeClearAttachments();
                return;
            case 10:
                ReplayIntegration replayIntegration = (ReplayIntegration) this.f76151x;
                C20513q6 c20513q6 = replayIntegration.f75804z;
                if (c20513q6 == null) {
                    AbstractC22676k.m65757q("options");
                    throw null;
                }
                C20283f c20283fFindPersistingScopeObserver = c20513q6.findPersistingScopeObserver();
                if (c20283fFindPersistingScopeObserver != null) {
                    C20513q6 c20513q7 = replayIntegration.f75804z;
                    if (c20513q7 == null) {
                        AbstractC22676k.m65757q("options");
                        throw null;
                    }
                    String str2 = (String) c20283fFindPersistingScopeObserver.m56266d(c20513q7, "replay.json", String.class);
                    if (str2 != null) {
                        C20501v c20501v = new C20501v(str2);
                        if (c20501v.equals(C20501v.f76802x)) {
                            replayIntegration.m56094T("");
                            return;
                        }
                        C20513q6 c20513q8 = replayIntegration.f75804z;
                        if (c20513q8 == null) {
                            AbstractC22676k.m65757q("options");
                            throw null;
                        }
                        String cacheDirPath = c20513q8.getCacheDirPath();
                        if (cacheDirPath == null || cacheDirPath.length() == 0) {
                            c20513q8.getLogger().mo16066m(EnumC20436n5.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                            file = null;
                        } else {
                            String cacheDirPath2 = c20513q8.getCacheDirPath();
                            AbstractC22676k.m65747g(cacheDirPath2);
                            file = new File(cacheDirPath2, "replay_" + c20501v);
                            file.mkdirs();
                        }
                        File file3 = new File(file, ".ongoing_segment");
                        if (file3.exists()) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file3), AbstractC39397a.f169546a), DfuBaseService.ERROR_REMOTE_MASK);
                            try {
                                Iterator it = new C38166a(new C2365d3(bufferedReader, 2)).iterator();
                                while (it.hasNext()) {
                                    List listM125906y0 = AbstractC39414r.m125906y0((String) it.next(), new String[]{"="}, 2);
                                    linkedHashMap.put((String) listM125906y0.get(0), (String) listM125906y0.get(1));
                                }
                                th3 = null;
                                bufferedReader.close();
                                String str3 = (String) linkedHashMap.get("config.height");
                                Integer numM125932Q = str3 != null ? AbstractC39421y.m125932Q(str3) : null;
                                String str4 = (String) linkedHashMap.get("config.width");
                                Integer numM125932Q2 = str4 != null ? AbstractC39421y.m125932Q(str4) : null;
                                String str5 = (String) linkedHashMap.get("config.frame-rate");
                                Integer numM125932Q3 = str5 != null ? AbstractC39421y.m125932Q(str5) : null;
                                String str6 = (String) linkedHashMap.get("config.bit-rate");
                                Integer numM125932Q4 = str6 != null ? AbstractC39421y.m125932Q(str6) : null;
                                String str7 = (String) linkedHashMap.get("segment.id");
                                Integer numM125932Q5 = str7 != null ? AbstractC39421y.m125932Q(str7) : null;
                                try {
                                    String str8 = (String) linkedHashMap.get("segment.timestamp");
                                    if (str8 == null) {
                                        str8 = "";
                                    }
                                    dateM60660P = AbstractC21598x.m60661Q(str8);
                                } catch (Throwable unused) {
                                    dateM60660P = null;
                                }
                                str = "options";
                                try {
                                    String str9 = (String) linkedHashMap.get("replay.type");
                                    if (str9 == null) {
                                        str9 = "";
                                    }
                                    enumC20521r6ValueOf = EnumC20521r6.valueOf(str9);
                                } catch (Throwable unused2) {
                                    enumC20521r6ValueOf = null;
                                }
                                if (numM125932Q == null || numM125932Q2 == null || numM125932Q3 == null || numM125932Q4 == null || numM125932Q5 == null) {
                                    file2 = file;
                                } else {
                                    Integer num = numM125932Q;
                                    file2 = file;
                                    if (numM125932Q5.intValue() != -1 && dateM60660P != null && enumC20521r6ValueOf != null) {
                                        C20253w c20253w = new C20253w(numM125932Q2.intValue(), num.intValue(), 1.0f, 1.0f, numM125932Q3.intValue(), numM125932Q4.intValue());
                                        final C20212k c20212k = new C20212k(c20513q8, c20501v);
                                        ArrayList arrayList = c20212k.f75927I;
                                        File fileM56137i = c20212k.m56137i();
                                        if (fileM56137i != null) {
                                            fileM56137i.listFiles(new FilenameFilter() { // from class: io.sentry.android.replay.h
                                                @Override // java.io.FilenameFilter
                                                public final boolean accept(File file4, String str10) {
                                                    AbstractC22676k.m65747g(str10);
                                                    if (AbstractC39421y.m125920E(str10, ".jpg", false)) {
                                                        File file5 = new File(file4, str10);
                                                        Long lM125933R = AbstractC39421y.m125933R(AbstractC38093j.m122040n(file5));
                                                        if (lM125933R != null) {
                                                            c20212k.m56135b(file5, lM125933R.longValue(), null);
                                                        }
                                                    }
                                                    return false;
                                                }
                                            });
                                        }
                                        if (arrayList.isEmpty()) {
                                            c20513q8.getLogger().mo16066m(EnumC20436n5.DEBUG, "No frames found for replay: %s, deleting the replay", c20501v);
                                            AbstractC15751g.m44465r(file2);
                                        } else {
                                            if (arrayList.size() > 1) {
                                                AbstractC25269w.m74166l0(arrayList, new C2298d(15));
                                            }
                                            EnumC20521r6 enumC20521r6 = EnumC20521r6.SESSION;
                                            int iIntValue = enumC20521r6ValueOf == enumC20521r6 ? numM125932Q5.intValue() : 0;
                                            if (enumC20521r6ValueOf != enumC20521r6) {
                                                dateM60660P = AbstractC21598x.m60660P(((C20213l) AbstractC25265s.m74096F0(arrayList)).f75935b);
                                                AbstractC22676k.m65747g(dateM60660P);
                                            }
                                            Date date = dateM60660P;
                                            long time = (((C20213l) AbstractC25265s.m74112P0(arrayList)).f75935b - date.getTime()) + ((long) (1000 / numM125932Q3.intValue()));
                                            String str10 = (String) linkedHashMap.get("replay.recording");
                                            if (str10 != null) {
                                                C20626x3 c20626x3 = (C20626x3) c20513q8.getSerializer().mo56239e(new StringReader(str10), C20626x3.class);
                                                if ((c20626x3 != null ? c20626x3.f77172x : null) != null) {
                                                    List list = c20626x3.f77172x;
                                                    AbstractC22676k.m65747g(list);
                                                    linkedList = new LinkedList(list);
                                                } else {
                                                    linkedList = null;
                                                }
                                                if (linkedList == null) {
                                                    linkedList = C25271y.f99162w;
                                                }
                                            } else {
                                                linkedList = C25271y.f99162w;
                                            }
                                            c20204f = new C20204f(c20253w, c20212k, date, iIntValue, time, enumC20521r6ValueOf, (String) linkedHashMap.get("replay.screen-at-start"), AbstractC25265s.m74152u1(linkedList, new C2298d(16)));
                                        }
                                    }
                                    c20204f = null;
                                }
                                c20513q8.getLogger().mo16066m(EnumC20436n5.DEBUG, "Incorrect segment values found for replay: %s, deleting the replay", c20501v);
                                AbstractC15751g.m44465r(file2);
                                c20204f = null;
                                break;
                            } catch (Throwable th8) {
                                try {
                                    throw th8;
                                } catch (Throwable th9) {
                                    AbstractC35854l.m113829i(bufferedReader, th8);
                                    throw th9;
                                }
                            }
                        } else {
                            c20513q8.getLogger().mo16066m(EnumC20436n5.DEBUG, "No ongoing segment found for replay: %s", c20501v);
                            AbstractC15751g.m44465r(file);
                            str = "options";
                            c20204f = null;
                            th3 = null;
                        }
                        if (c20204f == null) {
                            replayIntegration.m56094T("");
                            return;
                        }
                        C20513q6 c20513q9 = replayIntegration.f75804z;
                        if (c20513q9 == null) {
                            AbstractC22676k.m65757q(str);
                            throw th3;
                        }
                        Object objM56266d = c20283fFindPersistingScopeObserver.m56266d(c20513q9, "breadcrumbs.json", List.class);
                        ?? r24 = objM56266d instanceof List ? (List) objM56266d : th3;
                        C20371i4 c20371i4 = replayIntegration.f75788E;
                        C20513q6 c20513q10 = replayIntegration.f75804z;
                        if (c20513q10 == null) {
                            AbstractC22676k.m65757q(str);
                            throw th3;
                        }
                        long j7 = c20204f.f75901e;
                        Date date2 = c20204f.f75899c;
                        int i13 = c20204f.f75900d;
                        C20253w c20253w2 = c20204f.f75897a;
                        AbstractC20195k abstractC20195kM56118a = C20192h.m56118a(c20371i4, c20513q10, j7, date2, c20501v, i13, c20253w2.f76070b, c20253w2.f76069a, c20204f.f75902f, c20204f.f75898b, c20253w2.f76073e, c20253w2.f76074f, c20204f.f75903g, r24, new LinkedList(c20204f.f75904h));
                        if (abstractC20195kM56118a instanceof C20193i) {
                            ((C20193i) abstractC20195kM56118a).m56120a(replayIntegration.f75788E, AbstractC17269i.m48858C(new C20215n()));
                        }
                        replayIntegration.m56094T(str2);
                        return;
                    }
                }
                replayIntegration.m56094T("");
                return;
            case 11:
                C20231t c20231t = (C20231t) this.f76151x;
                if (c20231t.f76006w.get()) {
                    return;
                }
                C0006a1 c0006a1 = new C0006a1(c20231t, 29);
                try {
                    Object value = C20180a0.f75810b.getValue();
                    if (value == null || (field = (Field) C20180a0.f75811c.getValue()) == null) {
                        return;
                    }
                    Object obj = field.get(value);
                    AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type java.util.ArrayList<android.view.View>{ kotlin.collections.TypeAliasesKt.ArrayList<android.view.View> }");
                    field.set(value, c0006a1.invoke((ArrayList) obj));
                    return;
                } catch (Throwable th10) {
                    Log.w("WindowManagerSpy", th10);
                    return;
                }
            case 12:
                C20228h c20228h = (C20228h) this.f76151x;
                if (!c20228h.f75986g.isRecycled()) {
                    synchronized (c20228h.f75986g) {
                        if (!c20228h.f75986g.isRecycled()) {
                            c20228h.f75986g.recycle();
                        }
                        break;
                    }
                }
                c20228h.f75989j.close();
                return;
            case 13:
                C0332w0 c0332w0 = (C0332w0) this.f76151x;
                ((C20351h5) c0332w0.f1164E).mo56216a(((C20513q6) c0332w0.f1168x).getShutdownTimeoutMillis());
                return;
            case 14:
                C5099k0 c5099k0 = (C5099k0) this.f76151x;
                ((C20351h5) c5099k0.f21436E).mo56216a(((C20513q6) c5099k0.f21439x).getShutdownTimeoutMillis());
                return;
            case 15:
                C25600g c25600g = (C25600g) ((C4861a) ((C21736b) this.f76151x).f83583b).f20267h.getValue();
                c25600g.getClass();
                Activity activityM49083a = C17338u.f67142w.m49083a();
                if (activityM49083a != null) {
                    activityM49083a.runOnUiThread(new RunnableC1645z0(c25600g, 17));
                    return;
                }
                return;
            case 16:
                C25600g c25600g2 = (C25600g) ((C4861a) ((C21736b) this.f76151x).f83583b).f20267h.getValue();
                c25600g2.getClass();
                Activity activityM49083a2 = C17338u.f67142w.m49083a();
                if (activityM49083a2 == null) {
                    return;
                }
                activityM49083a2.runOnUiThread(new RunnableC20151r0(19, c25600g2, activityM49083a2));
                return;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                ((C21816e) this.f76151x).m61748d(false);
                return;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                ((C21830s) this.f76151x).m61769n();
                return;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C22114e.setRippleState$lambda$2((C22114e) this.f76151x);
                return;
            case 20:
                VideoTrackManager.onFirstFrameRendered$lambda$3((VideoTrackManager) this.f76151x);
                return;
            case 21:
                C17324g c17324g = ((C22509d) this.f76151x).f88216a;
                if (c17324g != null) {
                    c17324g.invoke();
                    return;
                }
                return;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                C22510e c22510e = (C22510e) this.f76151x;
                int i14 = c22510e.f88223b;
                if (i14 >= 4 && i14 >= 4 && (c17334q = c22510e.f88222a) != null) {
                    c17334q.invoke(Integer.valueOf(i14));
                }
                c22510e.m65011a();
                return;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                C32711d c32711d = ((C22610c) this.f76151x).f88952b;
                C0332w0 c0332w1 = c32711d.f135994z;
                c32711d.m102668z(c32711d.m102665v(((AbstractC41023g0) c0332w1.f1169y).isEmpty() ? null : (C32763v) AbstractC41047q.m133279i((AbstractC41023g0) c0332w1.f1169y)), MessageListItemViewType.THREAD_SEPARATOR, new C32710c(17));
                return;
            case 24:
                AbstractC23332d.m67564k((TimePicker) this.f76151x);
                return;
            case 25:
                ((HMSAudioManagerLegacy) this.f76151x).lambda$deInitTelephony$1();
                return;
            case 26:
                HMSAudioManagerApi31.deInitTelephony$lambda$4$lambda$3((HMSAudioManagerApi31) this.f76151x);
                return;
            case 27:
                HMSDiagnostics.C241351.AnonymousClass1.onJoin$lambda$0((HMSDiagnostics) this.f76151x);
                return;
            case 28:
                CameraControl.setTapToFocusAt$lambda$10((CameraControl) this.f76151x);
                return;
            default:
                HMSTextureRenderer$init$1$1.onFirstFrameRendered$lambda$0((HMSTextureRenderer) this.f76151x);
                return;
        }
    }

    public /* synthetic */ RunnableC20277c7(C20071e0 c20071e0, C20068d0 c20068d0) {
        this.f76150w = 5;
        this.f76151x = c20068d0;
    }

    public /* synthetic */ RunnableC20277c7(Object obj, int i13) {
        this.f76150w = i13;
        this.f76151x = obj;
    }

    public /* synthetic */ RunnableC20277c7(C22610c c22610c, int i13, long j7, long j13) {
        this.f76150w = 23;
        this.f76151x = c22610c;
    }
}
