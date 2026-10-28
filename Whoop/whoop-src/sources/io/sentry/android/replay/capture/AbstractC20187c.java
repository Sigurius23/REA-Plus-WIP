package io.sentry.android.replay.capture;

import ai.C0902h;
import android.view.MotionEvent;
import io.sentry.C20513q6;
import io.sentry.EnumC20521r6;
import io.sentry.InterfaceC20308d1;
import io.sentry.android.replay.C20212k;
import io.sentry.android.replay.C20253w;
import io.sentry.protocol.C20501v;
import io.sentry.rrweb.C20528g;
import io.sentry.rrweb.C20529h;
import io.sentry.rrweb.C20530i;
import io.sentry.rrweb.EnumC20527f;
import io.sentry.transport.InterfaceC20556f;
import j93.InterfaceC21493z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import l83.C23470p;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p021av.C2088b;
import p088dc.AbstractC11895b;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22686q;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20187c implements InterfaceC20196l {

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ InterfaceC21493z[] f75830q;

    /* JADX INFO: renamed from: a */
    public final C20513q6 f75831a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC20308d1 f75832b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC20556f f75833c;

    /* JADX INFO: renamed from: d */
    public final ScheduledExecutorService f75834d;

    /* JADX INFO: renamed from: e */
    public final C23470p f75835e;

    /* JADX INFO: renamed from: f */
    public final C0902h f75836f;

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f75837g;

    /* JADX INFO: renamed from: h */
    public C20212k f75838h;

    /* JADX INFO: renamed from: i */
    public final C20186b f75839i;

    /* JADX INFO: renamed from: j */
    public final C20186b f75840j;

    /* JADX INFO: renamed from: k */
    public final AtomicLong f75841k;

    /* JADX INFO: renamed from: l */
    public final C20186b f75842l;

    /* JADX INFO: renamed from: m */
    public final C20186b f75843m;

    /* JADX INFO: renamed from: n */
    public final C20186b f75844n;

    /* JADX INFO: renamed from: o */
    public final C20186b f75845o;

    /* JADX INFO: renamed from: p */
    public final ConcurrentLinkedDeque f75846p;

    static {
        C22686q c22686q = new C22686q(AbstractC20187c.class, "recorderConfig", "getRecorderConfig$sentry_android_replay_release()Lio/sentry/android/replay/ScreenshotRecorderConfig;", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f75830q = new InterfaceC21493z[]{c22673i0.mutableProperty1(c22686q), AbstractC11895b.m31990i(AbstractC20187c.class, "segmentTimestamp", "getSegmentTimestamp()Ljava/util/Date;", 0, c22673i0), AbstractC11895b.m31990i(AbstractC20187c.class, "screenAtStart", "getScreenAtStart()Ljava/lang/String;", 0, c22673i0), AbstractC11895b.m31990i(AbstractC20187c.class, "currentReplayId", "getCurrentReplayId()Lio/sentry/protocol/SentryId;", 0, c22673i0), AbstractC11895b.m31990i(AbstractC20187c.class, "currentSegment", "getCurrentSegment()I", 0, c22673i0), AbstractC11895b.m31990i(AbstractC20187c.class, "replayType", "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;", 0, c22673i0)};
    }

    public AbstractC20187c(C20513q6 options, InterfaceC20308d1 interfaceC20308d1, InterfaceC20556f dateProvider, ScheduledExecutorService replayExecutor) {
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(dateProvider, "dateProvider");
        AbstractC22676k.m65750j(replayExecutor, "replayExecutor");
        this.f75831a = options;
        this.f75832b = interfaceC20308d1;
        this.f75833c = dateProvider;
        this.f75834d = replayExecutor;
        this.f75835e = AbstractC30060g.m92088H(new C2088b(this, 24));
        this.f75836f = new C0902h(dateProvider);
        this.f75837g = new AtomicBoolean(false);
        this.f75839i = new C20186b(this, this, 3);
        this.f75840j = new C20186b(this, this, 4);
        this.f75841k = new AtomicLong();
        this.f75842l = new C20186b(this, this, 5);
        this.f75843m = new C20186b(C20501v.f76802x, this, this);
        this.f75844n = new C20186b(this, this, 1);
        this.f75845o = new C20186b(this, this, 2);
        this.f75846p = new ConcurrentLinkedDeque();
    }

    /* JADX INFO: renamed from: f */
    public static AbstractC20195k m56104f(AbstractC20187c abstractC20187c, long j7, Date date, C20501v replayId, int i13, int i14, int i15, int i16, int i17) {
        C20186b c20186b = abstractC20187c.f75845o;
        InterfaceC21493z[] interfaceC21493zArr = f75830q;
        EnumC20521r6 replayType = (EnumC20521r6) c20186b.getValue(abstractC20187c, interfaceC21493zArr[5]);
        C20212k c20212k = abstractC20187c.f75838h;
        String str = (String) abstractC20187c.f75842l.getValue(abstractC20187c, interfaceC21493zArr[2]);
        ConcurrentLinkedDeque events = abstractC20187c.f75846p;
        AbstractC22676k.m65750j(replayId, "replayId");
        AbstractC22676k.m65750j(replayType, "replayType");
        AbstractC22676k.m65750j(events, "events");
        return C20192h.m56118a(abstractC20187c.f75832b, abstractC20187c.f75831a, j7, date, replayId, i13, i14, i15, replayType, c20212k, i16, i17, str, null, events);
    }

    @Override // io.sentry.android.replay.capture.InterfaceC20196l
    /* JADX INFO: renamed from: c */
    public void mo56105c(int i13, C20501v replayId, EnumC20521r6 enumC20521r6) {
        AbstractC22676k.m65750j(replayId, "replayId");
        this.f75838h = new C20212k(this.f75831a, replayId);
        InterfaceC21493z[] interfaceC21493zArr = f75830q;
        this.f75843m.setValue(this, interfaceC21493zArr[3], replayId);
        m56110k(i13);
        if (enumC20521r6 == null) {
            enumC20521r6 = this instanceof C20199o ? EnumC20521r6.SESSION : EnumC20521r6.BUFFER;
        }
        AbstractC22676k.m65750j(enumC20521r6, "<set-?>");
        this.f75845o.setValue(this, interfaceC21493zArr[5], enumC20521r6);
        m56112m(AbstractC21598x.m60659O());
        this.f75841k.set(this.f75833c.mo52216c());
    }

    /* JADX INFO: renamed from: g */
    public final C20501v m56106g() {
        return (C20501v) this.f75843m.getValue(this, f75830q[3]);
    }

    /* JADX INFO: renamed from: h */
    public final int m56107h() {
        return ((Number) this.f75844n.getValue(this, f75830q[4])).intValue();
    }

    /* JADX INFO: renamed from: i */
    public final C20253w m56108i() {
        return (C20253w) this.f75839i.getValue(this, f75830q[0]);
    }

    /* JADX INFO: renamed from: j */
    public final void m56109j() {
        m56112m(AbstractC21598x.m60659O());
    }

    /* JADX INFO: renamed from: k */
    public final void m56110k(int i13) {
        this.f75844n.setValue(this, f75830q[4], Integer.valueOf(i13));
    }

    /* JADX INFO: renamed from: l */
    public final void m56111l(C20253w c20253w) {
        this.f75839i.setValue(this, f75830q[0], c20253w);
    }

    /* JADX INFO: renamed from: m */
    public final void m56112m(Date date) {
        this.f75840j.setValue(this, f75830q[1], date);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    /* JADX WARN: Code duplicated, block: B:47:0x015e  */
    /* JADX WARN: Code duplicated, block: B:50:0x016e  */
    /* JADX WARN: Code duplicated, block: B:51:0x019c  */
    /* JADX WARN: Code duplicated, block: B:54:0x01ac  */
    @Override // io.sentry.android.replay.capture.InterfaceC20196l
    public void onTouchEvent(MotionEvent motionEvent) {
        int pointerId;
        int iFindPointerIndex;
        List listM118958J;
        int pointerId2;
        int iFindPointerIndex2;
        C20253w c20253wM56108i = m56108i();
        if (c20253wM56108i != null) {
            C0902h c0902h = this.f75836f;
            InterfaceC20556f interfaceC20556f = (InterfaceC20556f) c0902h.f3293E;
            LinkedHashMap linkedHashMap = (LinkedHashMap) c0902h.f3297z;
            float f13 = c20253wM56108i.f76072d;
            float f14 = c20253wM56108i.f76071c;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
                if (iFindPointerIndex != -1) {
                    listM118958J = null;
                } else {
                    linkedHashMap.put(Integer.valueOf(pointerId), new ArrayList(10));
                    C20528g c20528g = new C20528g();
                    c20528g.f76901x = interfaceC20556f.mo52216c();
                    c20528g.f76904F = motionEvent.getX(iFindPointerIndex) * f14;
                    c20528g.f76905G = motionEvent.getY(iFindPointerIndex) * f13;
                    c20528g.f76903E = 0;
                    c20528g.f76907I = pointerId;
                    c20528g.f76910z = EnumC20527f.TouchStart;
                    listM118958J = AbstractC37056f.m118958J(c20528g);
                }
            } else if (actionMasked == 1) {
                pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
                iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId2);
                if (iFindPointerIndex2 != -1) {
                    listM118958J = null;
                } else {
                    linkedHashMap.remove(Integer.valueOf(pointerId2));
                    C20528g c20528g2 = new C20528g();
                    c20528g2.f76901x = interfaceC20556f.mo52216c();
                    c20528g2.f76904F = motionEvent.getX(iFindPointerIndex2) * f14;
                    c20528g2.f76905G = motionEvent.getY(iFindPointerIndex2) * f13;
                    c20528g2.f76903E = 0;
                    c20528g2.f76907I = pointerId2;
                    c20528g2.f76910z = EnumC20527f.TouchEnd;
                    listM118958J = AbstractC37056f.m118958J(c20528g2);
                }
            } else if (actionMasked == 2) {
                long jMo52216c = interfaceC20556f.mo52216c();
                long j7 = c0902h.f3296y;
                if (j7 == 0 || j7 + ((long) 50) <= jMo52216c) {
                    c0902h.f3296y = jMo52216c;
                    Set<Integer> setKeySet = linkedHashMap.keySet();
                    AbstractC22676k.m65749i(setKeySet, "<get-keys>(...)");
                    for (Integer num : setKeySet) {
                        AbstractC22676k.m65747g(num);
                        int iFindPointerIndex3 = motionEvent.findPointerIndex(num.intValue());
                        if (iFindPointerIndex3 != -1) {
                            if (c0902h.f3295x == r10) {
                                c0902h.f3295x = jMo52216c;
                            }
                            Object obj = linkedHashMap.get(num);
                            AbstractC22676k.m65747g(obj);
                            C20529h c20529h = new C20529h();
                            c20529h.f76913x = motionEvent.getX(iFindPointerIndex3) * f14;
                            c20529h.f76914y = motionEvent.getY(iFindPointerIndex3) * f13;
                            c20529h.f76912w = 0;
                            c20529h.f76915z = jMo52216c - c0902h.f3295x;
                            ((Collection) obj).add(c20529h);
                        }
                    }
                    long j13 = jMo52216c - c0902h.f3295x;
                    if (j13 > 500) {
                        ArrayList arrayList = new ArrayList(linkedHashMap.size());
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            int iIntValue = ((Number) entry.getKey()).intValue();
                            ArrayList<C20529h> arrayList2 = (ArrayList) entry.getValue();
                            if (!arrayList2.isEmpty()) {
                                C20530i c20530i = new C20530i();
                                c20530i.f76901x = jMo52216c;
                                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
                                for (C20529h c20529h2 : arrayList2) {
                                    c20529h2.f76915z -= j13;
                                    arrayList3.add(c20529h2);
                                    jMo52216c = jMo52216c;
                                }
                                c20530i.f76916E = arrayList3;
                                c20530i.f76919z = iIntValue;
                                arrayList.add(c20530i);
                                Object obj2 = linkedHashMap.get(Integer.valueOf(iIntValue));
                                AbstractC22676k.m65747g(obj2);
                                ((ArrayList) obj2).clear();
                            }
                        }
                        c0902h.f3295x = 0L;
                        listM118958J = arrayList;
                    } else {
                        listM118958J = null;
                    }
                } else {
                    listM118958J = null;
                }
            } else if (actionMasked != 3) {
                if (actionMasked == 5) {
                    pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
                    if (iFindPointerIndex != -1) {
                        linkedHashMap.put(Integer.valueOf(pointerId), new ArrayList(10));
                        C20528g c20528g3 = new C20528g();
                        c20528g3.f76901x = interfaceC20556f.mo52216c();
                        c20528g3.f76904F = motionEvent.getX(iFindPointerIndex) * f14;
                        c20528g3.f76905G = motionEvent.getY(iFindPointerIndex) * f13;
                        c20528g3.f76903E = 0;
                        c20528g3.f76907I = pointerId;
                        c20528g3.f76910z = EnumC20527f.TouchStart;
                        listM118958J = AbstractC37056f.m118958J(c20528g3);
                    }
                } else if (actionMasked == 6) {
                    pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId2);
                    if (iFindPointerIndex2 != -1) {
                        linkedHashMap.remove(Integer.valueOf(pointerId2));
                        C20528g c20528g4 = new C20528g();
                        c20528g4.f76901x = interfaceC20556f.mo52216c();
                        c20528g4.f76904F = motionEvent.getX(iFindPointerIndex2) * f14;
                        c20528g4.f76905G = motionEvent.getY(iFindPointerIndex2) * f13;
                        c20528g4.f76903E = 0;
                        c20528g4.f76907I = pointerId2;
                        c20528g4.f76910z = EnumC20527f.TouchEnd;
                        listM118958J = AbstractC37056f.m118958J(c20528g4);
                    }
                }
                listM118958J = null;
            } else {
                linkedHashMap.clear();
                C20528g c20528g5 = new C20528g();
                c20528g5.f76901x = interfaceC20556f.mo52216c();
                c20528g5.f76904F = motionEvent.getX() * f14;
                c20528g5.f76905G = motionEvent.getY() * f13;
                c20528g5.f76903E = 0;
                c20528g5.f76907I = 0;
                c20528g5.f76910z = EnumC20527f.TouchCancel;
                listM118958J = AbstractC37056f.m118958J(c20528g5);
            }
            if (listM118958J != null) {
                AbstractC25265s.m74141p0(this.f75846p, listM118958J);
            }
        }
    }

    @Override // io.sentry.android.replay.capture.InterfaceC20196l
    public void stop() {
        C20212k c20212k = this.f75838h;
        if (c20212k != null) {
            c20212k.close();
        }
        this.f75841k.set(0L);
        m56112m(null);
        C20501v EMPTY_ID = C20501v.f76802x;
        AbstractC22676k.m65749i(EMPTY_ID, "EMPTY_ID");
        this.f75843m.setValue(this, f75830q[3], EMPTY_ID);
    }
}
