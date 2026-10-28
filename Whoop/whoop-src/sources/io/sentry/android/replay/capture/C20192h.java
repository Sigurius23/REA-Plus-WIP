package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.core.app.NotificationCompat;
import e93.AbstractC12889b;
import i93.C18285k;
import i93.C18287m;
import io.sentry.C20315e;
import io.sentry.C20513q6;
import io.sentry.C20535s;
import io.sentry.C20542s6;
import io.sentry.C20578u6;
import io.sentry.C20626x3;
import io.sentry.EnumC20393j4;
import io.sentry.EnumC20436n5;
import io.sentry.EnumC20521r6;
import io.sentry.InterfaceC20308d1;
import io.sentry.android.replay.C20202e;
import io.sentry.android.replay.C20212k;
import io.sentry.android.replay.C20213l;
import io.sentry.android.replay.C20214m;
import io.sentry.android.replay.video.C20242a;
import io.sentry.android.replay.video.C20243b;
import io.sentry.android.replay.video.C20245d;
import io.sentry.protocol.C20499t;
import io.sentry.protocol.C20501v;
import io.sentry.rrweb.AbstractC20523b;
import io.sentry.rrweb.C20522a;
import io.sentry.rrweb.C20531j;
import io.sentry.rrweb.C20532k;
import io.sentry.rrweb.C20534m;
import io.sentry.rrweb.EnumC20524c;
import io.sentry.util.C20579a;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import m83.AbstractC25265s;
import m83.C25271y;
import p026b2.C2320z;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import p715kotlin.jvm.internal.C22669g0;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C20192h {
    /* JADX WARN: Code duplicated, block: B:102:0x0207 A[Catch: all -> 0x01ff, TryCatch #10 {all -> 0x01ff, blocks: (B:95:0x01f7, B:97:0x01fb, B:100:0x0203, B:102:0x0207, B:105:0x0210, B:106:0x021d), top: B:223:0x01f7 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x020f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0210 A[Catch: all -> 0x01ff, TryCatch #10 {all -> 0x01ff, blocks: (B:95:0x01f7, B:97:0x01fb, B:100:0x0203, B:102:0x0207, B:105:0x0210, B:106:0x021d), top: B:223:0x01f7 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0232  */
    /* JADX WARN: Code duplicated, block: B:112:0x023a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0245  */
    /* JADX WARN: Code duplicated, block: B:116:0x0253  */
    /* JADX WARN: Code duplicated, block: B:120:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:122:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:136:0x031f  */
    /* JADX WARN: Code duplicated, block: B:139:0x0330 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:140:0x0332  */
    /* JADX WARN: Code duplicated, block: B:146:0x0357  */
    /* JADX WARN: Code duplicated, block: B:147:0x035b  */
    /* JADX WARN: Code duplicated, block: B:149:0x035e  */
    /* JADX WARN: Code duplicated, block: B:150:0x0361  */
    /* JADX WARN: Code duplicated, block: B:153:0x036a  */
    /* JADX WARN: Code duplicated, block: B:155:0x0372  */
    /* JADX WARN: Code duplicated, block: B:157:0x0378  */
    /* JADX WARN: Code duplicated, block: B:160:0x037d  */
    /* JADX WARN: Code duplicated, block: B:163:0x0395  */
    /* JADX WARN: Code duplicated, block: B:169:0x03be  */
    /* JADX WARN: Code duplicated, block: B:173:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:175:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:178:0x044c  */
    /* JADX WARN: Code duplicated, block: B:179:0x044f  */
    /* JADX WARN: Code duplicated, block: B:182:0x0471  */
    /* JADX WARN: Code duplicated, block: B:184:0x0499  */
    /* JADX WARN: Code duplicated, block: B:230:0x0390 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0390 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x03ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x03b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x01de A[EDGE_INSN: B:238:0x01de->B:92:0x01de BREAK  A[LOOP:2: B:44:0x013d->B:90:0x01d5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d5 A[LOOP:2: B:44:0x013d->B:90:0x01d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:97:0x01fb A[Catch: all -> 0x01ff, TryCatch #10 {all -> 0x01ff, blocks: (B:95:0x01f7, B:97:0x01fb, B:100:0x0203, B:102:0x0207, B:105:0x0210, B:106:0x021d), top: B:223:0x01f7 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, l83.h] */
    /* JADX INFO: renamed from: a */
    public static AbstractC20195k m56118a(InterfaceC20308d1 interfaceC20308d1, C20513q6 options, long j7, Date currentSegmentTimestamp, C20501v replayId, int i13, int i14, int i15, EnumC20521r6 replayType, C20212k c20212k, int i16, int i17, String str, List list, Deque deque) {
        C18287m c18287m;
        int i18;
        C20535s c20535sM56711a;
        C20245d c20245d;
        C20245d c20245d2;
        C20315e c20315e;
        C20202e c20202e;
        C20243b c20243b;
        long j13;
        Object obj;
        List list2;
        C20535s c20535sM56711a2;
        List<C20315e> list3;
        ArrayList arrayList;
        LinkedList linkedList;
        C20315e c20315e2;
        long time;
        C2320z c2320z;
        Iterator it;
        HashMap map;
        C20499t sdkVersion;
        C20578u6 sessionReplay;
        String str2;
        AbstractC20523b abstractC20523b;
        boolean z4;
        AbstractC20523b abstractC20523bMo56122a;
        C20522a c20522a;
        Object obj2;
        C20522a c20522a2;
        ConcurrentHashMap concurrentHashMap;
        Object obj3;
        C20522a c20522a3;
        C22669g0 c22669g0;
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(currentSegmentTimestamp, "currentSegmentTimestamp");
        AbstractC22676k.m65750j(replayId, "replayId");
        AbstractC22676k.m65750j(replayType, "replayType");
        if (c20212k != null) {
            C20513q6 c20513q6 = c20212k.f75930w;
            long jMin = Math.min(j7, 300000L);
            long time2 = currentSegmentTimestamp.getTime();
            File file = new File(c20212k.m56137i(), AbstractC31061c.m95635k(i13, ".mp4"));
            C20579a c20579a = c20212k.f75924F;
            C20579a c20579a2 = c20212k.f75933z;
            ArrayList arrayList2 = c20212k.f75927I;
            long jConvert = 0;
            if (file.exists() && file.length() > 0) {
                file.delete();
            }
            C20535s c20535sM56711a3 = c20579a.m56711a();
            try {
                List arrayList3 = arrayList2.isEmpty() ? new ArrayList() : AbstractC25265s.m74097F1(arrayList2);
                AbstractC21598x.m60698r(c20535sM56711a3, null);
                if (arrayList3.isEmpty()) {
                    c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "No captured frames, skipping generating a video segment", new Object[0]);
                } else {
                    C20535s c20535sM56711a4 = c20579a2.m56711a();
                    try {
                        C20245d c20245d3 = new C20245d(c20513q6, new C20242a(file, i15, i14, i16, i17));
                        MediaCodec mediaCodec = (MediaCodec) c20245d3.f76049e;
                        mediaCodec.configure((MediaFormat) c20245d3.f76048d.getValue(), (Surface) null, (MediaCrypto) null, 1);
                        c20245d3.f76052h = mediaCodec.createInputSurface();
                        mediaCodec.start();
                        c20245d3.m56161b(false);
                        AbstractC21598x.m60698r(c20535sM56711a4, null);
                        c20212k.f75925G = c20245d3;
                        long j14 = ((long) 1000) / ((long) i16);
                        Object objM74100H0 = AbstractC25265s.m74100H0(arrayList3);
                        long j15 = time2 + jMin;
                        if (j15 <= Long.MIN_VALUE) {
                            C18287m c18287m2 = C18287m.f71148z;
                            c18287m = C18287m.f71148z;
                        } else {
                            c18287m = new C18287m(time2, j15 - 1);
                        }
                        AbstractC22676k.m65750j(c18287m, "<this>");
                        AbstractC12889b.m36275h(j14 > 0, Long.valueOf(j14));
                        long j16 = c18287m.f71141w;
                        long j17 = c18287m.f71142x;
                        long j18 = c18287m.f71143y > 0 ? j14 : -j14;
                        long j19 = new C18285k(j16, j17, j18).f71142x;
                        if ((j18 > 0 && j16 <= j19) || (j18 < 0 && j19 <= j16)) {
                            i18 = 0;
                            while (true) {
                                Iterator it3 = arrayList3.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        C20213l c20213l = (C20213l) it3.next();
                                        long j24 = j16 + j14;
                                        j13 = j19;
                                        long j25 = c20213l.f75935b;
                                        if (j16 <= j25 && j25 <= j24) {
                                            obj = c20213l;
                                            break;
                                        }
                                        if (j25 <= j24) {
                                            j19 = j13;
                                        }
                                    } else {
                                        j13 = j19;
                                    }
                                    obj = objM74100H0;
                                    break;
                                }
                                C20213l c20213l2 = (C20213l) obj;
                                if (c20213l2 != null) {
                                    try {
                                        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(c20213l2.f75934a.getAbsolutePath());
                                        C20535s c20535sM56711a5 = c20579a2.m56711a();
                                        try {
                                            C20245d c20245d4 = c20212k.f75925G;
                                            if (c20245d4 != null) {
                                                AbstractC22676k.m65747g(bitmapDecodeFile);
                                                c20245d4.m56162c(bitmapDecodeFile);
                                            }
                                            AbstractC21598x.m60698r(c20535sM56711a5, null);
                                            bitmapDecodeFile.recycle();
                                            i18++;
                                        } catch (Throwable th3) {
                                            try {
                                                throw th3;
                                            } catch (Throwable th4) {
                                                AbstractC21598x.m60698r(c20535sM56711a5, th3);
                                                throw th4;
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        c20513q6.getLogger().mo16060j(EnumC20436n5.WARNING, "Unable to decode bitmap and encode it into a video, skipping frame", th5);
                                        if (obj != null) {
                                            c20212k.m56136h(((C20213l) obj).f75934a);
                                            c20535sM56711a2 = c20579a.m56711a();
                                            AbstractC22681m0.m65770a(arrayList2);
                                            arrayList2.remove(obj);
                                            AbstractC21598x.m60698r(c20535sM56711a2, null);
                                            list2 = arrayList3;
                                            list2.remove(obj);
                                            objM74100H0 = null;
                                        }
                                        if (j16 != j13) {
                                            break;
                                            if (i18 == 0) {
                                                c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Generated a video with no frames, not capturing a replay segment", new Object[0]);
                                                c20212k.m56136h(file);
                                                c20315e = null;
                                                c20202e = null;
                                            } else {
                                                c20535sM56711a = c20579a2.m56711a();
                                                try {
                                                    c20245d = c20212k.f75925G;
                                                    if (c20245d != null) {
                                                        c20245d.m56166i();
                                                    }
                                                    c20245d2 = c20212k.f75925G;
                                                    if (c20245d2 != null) {
                                                        c20243b = (C20243b) c20245d2.f76051g;
                                                        if (c20243b.f76042e == 0) {
                                                            jConvert = TimeUnit.MILLISECONDS.convert(c20243b.f76043f + c20243b.f76038a, TimeUnit.MICROSECONDS);
                                                        }
                                                    }
                                                    long j26 = jConvert;
                                                    c20315e = null;
                                                    c20212k.f75925G = null;
                                                    AbstractC21598x.m60698r(c20535sM56711a, null);
                                                    c20212k.m56139m(j15);
                                                    c20202e = new C20202e(file, i18, j26);
                                                } catch (Throwable th6) {
                                                    try {
                                                        throw th6;
                                                    } catch (Throwable th7) {
                                                        AbstractC21598x.m60698r(c20535sM56711a, th6);
                                                        throw th7;
                                                    }
                                                }
                                            }
                                            if (c20202e != null) {
                                                File file2 = c20202e.f75879a;
                                                int i19 = c20202e.f75880b;
                                                long j27 = c20202e.f75881c;
                                                if (list == null) {
                                                    c22669g0 = new C22669g0();
                                                    c22669g0.f89336w = C25271y.f99162w;
                                                    if (interfaceC20308d1 != null) {
                                                        interfaceC20308d1.mo56439s(new C20214m(c22669g0, 1));
                                                    }
                                                    list3 = (List) c22669g0.f89336w;
                                                } else {
                                                    list3 = list;
                                                }
                                                Date dateM60660P = AbstractC21598x.m60660P(currentSegmentTimestamp.getTime() + j27);
                                                AbstractC22676k.m65749i(dateM60660P, "getDateTime(...)");
                                                C20542s6 c20542s6 = new C20542s6();
                                                c20542s6.f76883w = replayId;
                                                c20542s6.f76989S = replayId;
                                                c20542s6.f76990T = i13;
                                                c20542s6.f76991U = dateM60660P;
                                                c20542s6.f76992V = currentSegmentTimestamp;
                                                c20542s6.f76988R = replayType;
                                                c20542s6.f76986P = file2;
                                                arrayList = new ArrayList();
                                                C20531j c20531j = new C20531j();
                                                c20531j.f76901x = currentSegmentTimestamp.getTime();
                                                c20531j.f76923z = i14;
                                                c20531j.f76920E = i15;
                                                arrayList.add(c20531j);
                                                C20534m c20534m = new C20534m();
                                                c20534m.f76901x = currentSegmentTimestamp.getTime();
                                                c20534m.f76950z = i13;
                                                c20534m.f76936F = j27;
                                                c20534m.f76941K = i19;
                                                c20534m.f76935E = file2.length();
                                                c20534m.f76943M = i16;
                                                c20534m.f76939I = i14;
                                                c20534m.f76940J = i15;
                                                c20534m.f76944N = 0;
                                                c20534m.f76945O = 0;
                                                arrayList.add(c20534m);
                                                linkedList = new LinkedList();
                                                c20315e2 = c20315e;
                                                for (C20315e c20315e3 : list3) {
                                                    if (c20315e2 == null) {
                                                        z4 = false;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    if (c20315e3.m56469b().getTime() < currentSegmentTimestamp.getTime()) {
                                                        arrayList.add(abstractC20523bMo56122a);
                                                        if (abstractC20523bMo56122a instanceof C20522a) {
                                                            c20522a3 = (C20522a) abstractC20523bMo56122a;
                                                        } else {
                                                            c20522a = c20315e;
                                                        }
                                                        if (c20522a != 0) {
                                                            c20522a = c20522a3;
                                                            obj2 = c20522a.f76891F;
                                                        } else {
                                                            c20522a = c20522a3;
                                                            obj2 = c20315e;
                                                        }
                                                        if (AbstractC22676k.m65745e(obj2, NotificationCompat.CATEGORY_NAVIGATION)) {
                                                            c20522a2 = (C20522a) abstractC20523bMo56122a;
                                                            concurrentHashMap = c20522a2.f76894I;
                                                            if (concurrentHashMap != null) {
                                                                obj3 = c20315e;
                                                            } else {
                                                                obj3 = c20315e;
                                                            }
                                                            if (obj3 instanceof String) {
                                                                ConcurrentHashMap concurrentHashMap2 = c20522a2.f76894I;
                                                                AbstractC22676k.m65747g(concurrentHashMap2);
                                                                Object obj4 = concurrentHashMap2.get("to");
                                                                AbstractC22676k.m65748h(obj4, "null cannot be cast to non-null type kotlin.String");
                                                                linkedList.add((String) obj4);
                                                            }
                                                        }
                                                    } else {
                                                        arrayList.add(abstractC20523bMo56122a);
                                                        if (abstractC20523bMo56122a instanceof C20522a) {
                                                            c20522a3 = (C20522a) abstractC20523bMo56122a;
                                                        } else {
                                                            c20522a = c20315e;
                                                        }
                                                        if (c20522a != 0) {
                                                            c20522a = c20522a3;
                                                            obj2 = c20522a.f76891F;
                                                        } else {
                                                            c20522a = c20522a3;
                                                            obj2 = c20315e;
                                                        }
                                                        if (AbstractC22676k.m65745e(obj2, NotificationCompat.CATEGORY_NAVIGATION)) {
                                                            c20522a2 = (C20522a) abstractC20523bMo56122a;
                                                            concurrentHashMap = c20522a2.f76894I;
                                                            if (concurrentHashMap != null) {
                                                                obj3 = c20315e;
                                                            } else {
                                                                obj3 = c20315e;
                                                            }
                                                            if (obj3 instanceof String) {
                                                                ConcurrentHashMap concurrentHashMap3 = c20522a2.f76894I;
                                                                AbstractC22676k.m65747g(concurrentHashMap3);
                                                                Object obj5 = concurrentHashMap3.get("to");
                                                                AbstractC22676k.m65748h(obj5, "null cannot be cast to non-null type kotlin.String");
                                                                linkedList.add((String) obj5);
                                                            }
                                                        }
                                                    }
                                                    c20315e2 = c20315e3;
                                                }
                                                if (str != null) {
                                                    linkedList.addFirst(str);
                                                }
                                                time = dateM60660P.getTime();
                                                c2320z = new C2320z(15, currentSegmentTimestamp, arrayList);
                                                it = deque.iterator();
                                                AbstractC22676k.m65749i(it, "iterator(...)");
                                                while (it.hasNext()) {
                                                    abstractC20523b = (AbstractC20523b) it.next();
                                                    if (abstractC20523b.f76901x < time) {
                                                        c2320z.invoke(abstractC20523b);
                                                        it.remove();
                                                    }
                                                }
                                                if (i13 == 0) {
                                                    C20532k c20532k = new C20532k(EnumC20524c.Custom);
                                                    map = new HashMap();
                                                    c20532k.f76925z = map;
                                                    c20532k.f76924y = "options";
                                                    sdkVersion = options.getSdkVersion();
                                                    if (sdkVersion != null) {
                                                        map.put("nativeSdkName", sdkVersion.f76791w);
                                                        map.put("nativeSdkVersion", sdkVersion.f76792x);
                                                    }
                                                    sessionReplay = options.getSessionReplay();
                                                    Double d3 = sessionReplay.f77064f;
                                                    CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) sessionReplay.f70498b;
                                                    map.put("errorSampleRate", d3);
                                                    map.put("sessionSampleRate", sessionReplay.f77063e);
                                                    map.put("maskAllImages", Boolean.valueOf(copyOnWriteArraySet.contains("android.widget.ImageView")));
                                                    map.put("maskAllText", Boolean.valueOf(copyOnWriteArraySet.contains("android.widget.TextView")));
                                                    map.put("quality", sessionReplay.f77065g.serializedName());
                                                    map.put("maskedViewClasses", copyOnWriteArraySet);
                                                    map.put("unmaskedViewClasses", (CopyOnWriteArraySet) sessionReplay.f70499c);
                                                    if (sessionReplay.f77073o == EnumC20393j4.PIXEL_COPY) {
                                                        str2 = "pixelCopy";
                                                    } else {
                                                        str2 = "canvas";
                                                    }
                                                    map.put("screenshotStrategy", str2);
                                                    map.put("networkDetailHasUrls", Boolean.valueOf(!sessionReplay.f77075q.isEmpty()));
                                                    if (!sessionReplay.f77075q.isEmpty()) {
                                                        map.put("networkDetailAllowUrls", sessionReplay.f77075q);
                                                        map.put("networkRequestHeaders", sessionReplay.f77078t);
                                                        map.put("networkResponseHeaders", sessionReplay.f77079u);
                                                        map.put("networkCaptureBodies", Boolean.valueOf(sessionReplay.f77077s));
                                                        if (!sessionReplay.f77076r.isEmpty()) {
                                                            map.put("networkDetailDenyUrls", sessionReplay.f77076r);
                                                        }
                                                    }
                                                    arrayList.add(c20532k);
                                                }
                                                C20626x3 c20626x3 = new C20626x3();
                                                c20626x3.f77171w = Integer.valueOf(i13);
                                                c20626x3.f77172x = AbstractC25265s.m74152u1(arrayList, new C20191g());
                                                c20542s6.f76993W = linkedList;
                                                return new C20193i(c20542s6, c20626x3);
                                            }
                                            return C20194j.f75863a;
                                        }
                                        j16 += j18;
                                        arrayList3 = list2;
                                        j19 = j13;
                                    }
                                    list2 = arrayList3;
                                    objM74100H0 = obj;
                                } else if (obj != null) {
                                    c20212k.m56136h(((C20213l) obj).f75934a);
                                    c20535sM56711a2 = c20579a.m56711a();
                                    try {
                                        AbstractC22681m0.m65770a(arrayList2);
                                        arrayList2.remove(obj);
                                        AbstractC21598x.m60698r(c20535sM56711a2, null);
                                        list2 = arrayList3;
                                        list2.remove(obj);
                                        objM74100H0 = null;
                                    } catch (Throwable th8) {
                                        try {
                                            throw th8;
                                        } catch (Throwable th9) {
                                            AbstractC21598x.m60698r(c20535sM56711a2, th8);
                                            throw th9;
                                        }
                                    }
                                } else {
                                    list2 = arrayList3;
                                    objM74100H0 = obj;
                                }
                                if (j16 != j13) {
                                    break;
                                }
                                j16 += j18;
                                arrayList3 = list2;
                                j19 = j13;
                            }
                        } else {
                            i18 = 0;
                        }
                        if (i18 == 0) {
                            c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Generated a video with no frames, not capturing a replay segment", new Object[0]);
                            c20212k.m56136h(file);
                        } else {
                            c20535sM56711a = c20579a2.m56711a();
                            c20245d = c20212k.f75925G;
                            if (c20245d != null) {
                                c20245d.m56166i();
                            }
                            c20245d2 = c20212k.f75925G;
                            if (c20245d2 != null) {
                                c20243b = (C20243b) c20245d2.f76051g;
                                if (c20243b.f76042e == 0) {
                                    jConvert = TimeUnit.MILLISECONDS.convert(c20243b.f76043f + c20243b.f76038a, TimeUnit.MICROSECONDS);
                                }
                            }
                            long j28 = jConvert;
                            c20315e = null;
                            c20212k.f75925G = null;
                            AbstractC21598x.m60698r(c20535sM56711a, null);
                            c20212k.m56139m(j15);
                            c20202e = new C20202e(file, i18, j28);
                        }
                        if (c20202e != null) {
                            File file3 = c20202e.f75879a;
                            int i110 = c20202e.f75880b;
                            long j29 = c20202e.f75881c;
                            if (list == null) {
                                c22669g0 = new C22669g0();
                                c22669g0.f89336w = C25271y.f99162w;
                                if (interfaceC20308d1 != null) {
                                    interfaceC20308d1.mo56439s(new C20214m(c22669g0, 1));
                                }
                                list3 = (List) c22669g0.f89336w;
                            } else {
                                list3 = list;
                            }
                            Date dateM60660P2 = AbstractC21598x.m60660P(currentSegmentTimestamp.getTime() + j29);
                            AbstractC22676k.m65749i(dateM60660P2, "getDateTime(...)");
                            C20542s6 c20542s7 = new C20542s6();
                            c20542s7.f76883w = replayId;
                            c20542s7.f76989S = replayId;
                            c20542s7.f76990T = i13;
                            c20542s7.f76991U = dateM60660P2;
                            c20542s7.f76992V = currentSegmentTimestamp;
                            c20542s7.f76988R = replayType;
                            c20542s7.f76986P = file3;
                            arrayList = new ArrayList();
                            C20531j c20531j2 = new C20531j();
                            c20531j2.f76901x = currentSegmentTimestamp.getTime();
                            c20531j2.f76923z = i14;
                            c20531j2.f76920E = i15;
                            arrayList.add(c20531j2);
                            C20534m c20534m2 = new C20534m();
                            c20534m2.f76901x = currentSegmentTimestamp.getTime();
                            c20534m2.f76950z = i13;
                            c20534m2.f76936F = j29;
                            c20534m2.f76941K = i110;
                            c20534m2.f76935E = file3.length();
                            c20534m2.f76943M = i16;
                            c20534m2.f76939I = i14;
                            c20534m2.f76940J = i15;
                            c20534m2.f76944N = 0;
                            c20534m2.f76945O = 0;
                            arrayList.add(c20534m2);
                            linkedList = new LinkedList();
                            c20315e2 = c20315e;
                            while (r1.hasNext()) {
                                if (c20315e2 == null && AbstractC22676k.m65745e(c20315e2.f76288G, "network.event")) {
                                    ConcurrentHashMap concurrentHashMap4 = c20315e2.f76287F;
                                    AbstractC22676k.m65749i(concurrentHashMap4, "getData(...)");
                                    Object obj6 = concurrentHashMap4.get("action");
                                    if (obj6 == null) {
                                        obj6 = c20315e;
                                    }
                                    if (AbstractC22676k.m65745e(obj6, "NETWORK_AVAILABLE") && AbstractC22676k.m65745e(c20315e3.f76288G, "network.event") && c20315e3.f76287F.containsKey("network_type") && c20315e3.m56469b().getTime() + 5000 >= currentSegmentTimestamp.getTime()) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                } else {
                                    z4 = false;
                                }
                                if ((c20315e3.m56469b().getTime() < currentSegmentTimestamp.getTime() || z4) && c20315e3.m56469b().getTime() < dateM60660P2.getTime() && (abstractC20523bMo56122a = options.getReplayController().getF75797N().mo56122a(c20315e3)) != null) {
                                    arrayList.add(abstractC20523bMo56122a);
                                    if (abstractC20523bMo56122a instanceof C20522a) {
                                        c20522a3 = (C20522a) abstractC20523bMo56122a;
                                    } else {
                                        c20522a = c20315e;
                                    }
                                    if (c20522a != 0) {
                                        c20522a = c20522a3;
                                        obj2 = c20522a.f76891F;
                                    } else {
                                        c20522a = c20522a3;
                                        obj2 = c20315e;
                                    }
                                    if (AbstractC22676k.m65745e(obj2, NotificationCompat.CATEGORY_NAVIGATION)) {
                                        c20522a2 = (C20522a) abstractC20523bMo56122a;
                                        concurrentHashMap = c20522a2.f76894I;
                                        if (concurrentHashMap != null || (obj3 = concurrentHashMap.get("to")) == null) {
                                            obj3 = c20315e;
                                        }
                                        if (obj3 instanceof String) {
                                            ConcurrentHashMap concurrentHashMap5 = c20522a2.f76894I;
                                            AbstractC22676k.m65747g(concurrentHashMap5);
                                            Object obj7 = concurrentHashMap5.get("to");
                                            AbstractC22676k.m65748h(obj7, "null cannot be cast to non-null type kotlin.String");
                                            linkedList.add((String) obj7);
                                        }
                                    }
                                }
                                c20315e2 = c20315e3;
                            }
                            if (str != null && !AbstractC22676k.m65745e(AbstractC25265s.m74100H0(linkedList), str)) {
                                linkedList.addFirst(str);
                            }
                            time = dateM60660P2.getTime();
                            c2320z = new C2320z(15, currentSegmentTimestamp, arrayList);
                            it = deque.iterator();
                            AbstractC22676k.m65749i(it, "iterator(...)");
                            while (it.hasNext()) {
                                abstractC20523b = (AbstractC20523b) it.next();
                                if (abstractC20523b.f76901x < time) {
                                    c2320z.invoke(abstractC20523b);
                                    it.remove();
                                }
                            }
                            if (i13 == 0) {
                                C20532k c20532k2 = new C20532k(EnumC20524c.Custom);
                                map = new HashMap();
                                c20532k2.f76925z = map;
                                c20532k2.f76924y = "options";
                                sdkVersion = options.getSdkVersion();
                                if (sdkVersion != null) {
                                    map.put("nativeSdkName", sdkVersion.f76791w);
                                    map.put("nativeSdkVersion", sdkVersion.f76792x);
                                }
                                sessionReplay = options.getSessionReplay();
                                Double d14 = sessionReplay.f77064f;
                                CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) sessionReplay.f70498b;
                                map.put("errorSampleRate", d14);
                                map.put("sessionSampleRate", sessionReplay.f77063e);
                                map.put("maskAllImages", Boolean.valueOf(copyOnWriteArraySet2.contains("android.widget.ImageView")));
                                map.put("maskAllText", Boolean.valueOf(copyOnWriteArraySet2.contains("android.widget.TextView")));
                                map.put("quality", sessionReplay.f77065g.serializedName());
                                map.put("maskedViewClasses", copyOnWriteArraySet2);
                                map.put("unmaskedViewClasses", (CopyOnWriteArraySet) sessionReplay.f70499c);
                                if (sessionReplay.f77073o == EnumC20393j4.PIXEL_COPY) {
                                    str2 = "pixelCopy";
                                } else {
                                    str2 = "canvas";
                                }
                                map.put("screenshotStrategy", str2);
                                map.put("networkDetailHasUrls", Boolean.valueOf(!sessionReplay.f77075q.isEmpty()));
                                if (!sessionReplay.f77075q.isEmpty()) {
                                    map.put("networkDetailAllowUrls", sessionReplay.f77075q);
                                    map.put("networkRequestHeaders", sessionReplay.f77078t);
                                    map.put("networkResponseHeaders", sessionReplay.f77079u);
                                    map.put("networkCaptureBodies", Boolean.valueOf(sessionReplay.f77077s));
                                    if (!sessionReplay.f77076r.isEmpty()) {
                                        map.put("networkDetailDenyUrls", sessionReplay.f77076r);
                                    }
                                }
                                arrayList.add(c20532k2);
                            }
                            C20626x3 c20626x4 = new C20626x3();
                            c20626x4.f77171w = Integer.valueOf(i13);
                            c20626x4.f77172x = AbstractC25265s.m74152u1(arrayList, new C20191g());
                            c20542s7.f76993W = linkedList;
                            return new C20193i(c20542s7, c20626x4);
                        }
                    } catch (Throwable th10) {
                        try {
                            throw th10;
                        } catch (Throwable th11) {
                            AbstractC21598x.m60698r(c20535sM56711a4, th10);
                            throw th11;
                        }
                    }
                }
                c20315e = null;
                c20202e = null;
                if (c20202e != null) {
                    File file4 = c20202e.f75879a;
                    int i111 = c20202e.f75880b;
                    long j210 = c20202e.f75881c;
                    if (list == null) {
                        c22669g0 = new C22669g0();
                        c22669g0.f89336w = C25271y.f99162w;
                        if (interfaceC20308d1 != null) {
                            interfaceC20308d1.mo56439s(new C20214m(c22669g0, 1));
                        }
                        list3 = (List) c22669g0.f89336w;
                    } else {
                        list3 = list;
                    }
                    Date dateM60660P3 = AbstractC21598x.m60660P(currentSegmentTimestamp.getTime() + j210);
                    AbstractC22676k.m65749i(dateM60660P3, "getDateTime(...)");
                    C20542s6 c20542s8 = new C20542s6();
                    c20542s8.f76883w = replayId;
                    c20542s8.f76989S = replayId;
                    c20542s8.f76990T = i13;
                    c20542s8.f76991U = dateM60660P3;
                    c20542s8.f76992V = currentSegmentTimestamp;
                    c20542s8.f76988R = replayType;
                    c20542s8.f76986P = file4;
                    arrayList = new ArrayList();
                    C20531j c20531j3 = new C20531j();
                    c20531j3.f76901x = currentSegmentTimestamp.getTime();
                    c20531j3.f76923z = i14;
                    c20531j3.f76920E = i15;
                    arrayList.add(c20531j3);
                    C20534m c20534m3 = new C20534m();
                    c20534m3.f76901x = currentSegmentTimestamp.getTime();
                    c20534m3.f76950z = i13;
                    c20534m3.f76936F = j210;
                    c20534m3.f76941K = i111;
                    c20534m3.f76935E = file4.length();
                    c20534m3.f76943M = i16;
                    c20534m3.f76939I = i14;
                    c20534m3.f76940J = i15;
                    c20534m3.f76944N = 0;
                    c20534m3.f76945O = 0;
                    arrayList.add(c20534m3);
                    linkedList = new LinkedList();
                    c20315e2 = c20315e;
                    while (r1.hasNext()) {
                        if (c20315e2 == null) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        if (c20315e3.m56469b().getTime() < currentSegmentTimestamp.getTime()) {
                            arrayList.add(abstractC20523bMo56122a);
                            if (abstractC20523bMo56122a instanceof C20522a) {
                                c20522a3 = (C20522a) abstractC20523bMo56122a;
                            } else {
                                c20522a = c20315e;
                            }
                            if (c20522a != 0) {
                                c20522a = c20522a3;
                                obj2 = c20522a.f76891F;
                            } else {
                                c20522a = c20522a3;
                                obj2 = c20315e;
                            }
                            if (AbstractC22676k.m65745e(obj2, NotificationCompat.CATEGORY_NAVIGATION)) {
                                c20522a2 = (C20522a) abstractC20523bMo56122a;
                                concurrentHashMap = c20522a2.f76894I;
                                if (concurrentHashMap != null) {
                                    obj3 = c20315e;
                                } else {
                                    obj3 = c20315e;
                                }
                                if (obj3 instanceof String) {
                                    ConcurrentHashMap concurrentHashMap6 = c20522a2.f76894I;
                                    AbstractC22676k.m65747g(concurrentHashMap6);
                                    Object obj8 = concurrentHashMap6.get("to");
                                    AbstractC22676k.m65748h(obj8, "null cannot be cast to non-null type kotlin.String");
                                    linkedList.add((String) obj8);
                                }
                            }
                        } else {
                            arrayList.add(abstractC20523bMo56122a);
                            if (abstractC20523bMo56122a instanceof C20522a) {
                                c20522a3 = (C20522a) abstractC20523bMo56122a;
                            } else {
                                c20522a = c20315e;
                            }
                            if (c20522a != 0) {
                                c20522a = c20522a3;
                                obj2 = c20522a.f76891F;
                            } else {
                                c20522a = c20522a3;
                                obj2 = c20315e;
                            }
                            if (AbstractC22676k.m65745e(obj2, NotificationCompat.CATEGORY_NAVIGATION)) {
                                c20522a2 = (C20522a) abstractC20523bMo56122a;
                                concurrentHashMap = c20522a2.f76894I;
                                if (concurrentHashMap != null) {
                                    obj3 = c20315e;
                                } else {
                                    obj3 = c20315e;
                                }
                                if (obj3 instanceof String) {
                                    ConcurrentHashMap concurrentHashMap7 = c20522a2.f76894I;
                                    AbstractC22676k.m65747g(concurrentHashMap7);
                                    Object obj9 = concurrentHashMap7.get("to");
                                    AbstractC22676k.m65748h(obj9, "null cannot be cast to non-null type kotlin.String");
                                    linkedList.add((String) obj9);
                                }
                            }
                        }
                        c20315e2 = c20315e3;
                    }
                    if (str != null) {
                        linkedList.addFirst(str);
                    }
                    time = dateM60660P3.getTime();
                    c2320z = new C2320z(15, currentSegmentTimestamp, arrayList);
                    it = deque.iterator();
                    AbstractC22676k.m65749i(it, "iterator(...)");
                    while (it.hasNext()) {
                        abstractC20523b = (AbstractC20523b) it.next();
                        if (abstractC20523b.f76901x < time) {
                            c2320z.invoke(abstractC20523b);
                            it.remove();
                        }
                    }
                    if (i13 == 0) {
                        C20532k c20532k3 = new C20532k(EnumC20524c.Custom);
                        map = new HashMap();
                        c20532k3.f76925z = map;
                        c20532k3.f76924y = "options";
                        sdkVersion = options.getSdkVersion();
                        if (sdkVersion != null) {
                            map.put("nativeSdkName", sdkVersion.f76791w);
                            map.put("nativeSdkVersion", sdkVersion.f76792x);
                        }
                        sessionReplay = options.getSessionReplay();
                        Double d15 = sessionReplay.f77064f;
                        CopyOnWriteArraySet copyOnWriteArraySet3 = (CopyOnWriteArraySet) sessionReplay.f70498b;
                        map.put("errorSampleRate", d15);
                        map.put("sessionSampleRate", sessionReplay.f77063e);
                        map.put("maskAllImages", Boolean.valueOf(copyOnWriteArraySet3.contains("android.widget.ImageView")));
                        map.put("maskAllText", Boolean.valueOf(copyOnWriteArraySet3.contains("android.widget.TextView")));
                        map.put("quality", sessionReplay.f77065g.serializedName());
                        map.put("maskedViewClasses", copyOnWriteArraySet3);
                        map.put("unmaskedViewClasses", (CopyOnWriteArraySet) sessionReplay.f70499c);
                        if (sessionReplay.f77073o == EnumC20393j4.PIXEL_COPY) {
                            str2 = "pixelCopy";
                        } else {
                            str2 = "canvas";
                        }
                        map.put("screenshotStrategy", str2);
                        map.put("networkDetailHasUrls", Boolean.valueOf(!sessionReplay.f77075q.isEmpty()));
                        if (!sessionReplay.f77075q.isEmpty()) {
                            map.put("networkDetailAllowUrls", sessionReplay.f77075q);
                            map.put("networkRequestHeaders", sessionReplay.f77078t);
                            map.put("networkResponseHeaders", sessionReplay.f77079u);
                            map.put("networkCaptureBodies", Boolean.valueOf(sessionReplay.f77077s));
                            if (!sessionReplay.f77076r.isEmpty()) {
                                map.put("networkDetailDenyUrls", sessionReplay.f77076r);
                            }
                        }
                        arrayList.add(c20532k3);
                    }
                    C20626x3 c20626x5 = new C20626x3();
                    c20626x5.f77171w = Integer.valueOf(i13);
                    c20626x5.f77172x = AbstractC25265s.m74152u1(arrayList, new C20191g());
                    c20542s8.f76993W = linkedList;
                    return new C20193i(c20542s8, c20626x5);
                }
            } catch (Throwable th12) {
                try {
                    throw th12;
                } catch (Throwable th13) {
                    AbstractC21598x.m60698r(c20535sM56711a3, th12);
                    throw th13;
                }
            }
        }
        return C20194j.f75863a;
    }
}
