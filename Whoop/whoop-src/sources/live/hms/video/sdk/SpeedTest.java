package live.hms.video.sdk;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import l83.C23465k;
import live.hms.video.factories.OkHttpFactory;
import live.hms.video.signal.init.NetworkHealth;
import live.hms.video.signal.init.RangeLimits;
import live.hms.video.utils.HMSConstantsKt;
import ne3.C26616h;
import ne3.InterfaceC26620j;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import ud3.AbstractC34799a1;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34850x0;
import va3.AbstractC35854l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u000b\u0010\tJ+\u0010\u0011\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Llive/hms/video/sdk/SpeedTest;", "", "<init>", "()V", "Llive/hms/video/signal/init/NetworkHealth;", "networkHealth", "Ll83/k;", "", "getTimeToDownload", "(Llive/hms/video/signal/init/NetworkHealth;Lq83/d;)Ljava/lang/Object;", "", "getDownloadSpeedInKilobytesPerSecond", "kilobytesPerSecond", "Ljava/util/SortedMap;", "", "Llive/hms/video/signal/init/RangeLimits;", "scoreMap", "getSpeedTestScore", "(Ljava/lang/Double;Ljava/util/SortedMap;)I", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class SpeedTest {

    /* JADX INFO: renamed from: live.hms.video.sdk.SpeedTest$getDownloadSpeedInKilobytesPerSecond$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SpeedTest", m100430f = "SpeedTest.kt", m100431l = {87}, m100432m = "getDownloadSpeedInKilobytesPerSecond")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C242561 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C242561(InterfaceC30057d<? super C242561> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SpeedTest.this.getDownloadSpeedInKilobytesPerSecond(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cc A[ADDED_TO_REGION] */
    public final Object getTimeToDownload(NetworkHealth networkHealth, InterfaceC30057d<? super C23465k> interfaceC30057d) throws Throwable {
        Long l7;
        Long l12;
        Long l13;
        InterfaceC26620j interfaceC26620jMo1940d1;
        C34830n0 c34830n0 = new C34830n0();
        c34830n0.m109905f(networkHealth.getUrl());
        Long l14 = null;
        c34830n0.m109904e("GET", null);
        long jMo9164h1 = 0;
        try {
            C34850x0 c34850x0M131549e = OkHttpFactory.INSTANCE.getClient().m109898b(new C34832o0(c34830n0)).m131549e();
            try {
                if (!c34850x0M131549e.f146788Q) {
                    throw new IOException("Unexpected code");
                }
                AbstractC34799a1 abstractC34799a1 = c34850x0M131549e.f146778G;
                if (abstractC34799a1 == null || (interfaceC26620jMo1940d1 = abstractC34799a1.mo1940d1()) == null) {
                    l7 = null;
                    l12 = null;
                } else {
                    C26616h c26616h = new C26616h();
                    l12 = new Long(System.currentTimeMillis());
                    while (!interfaceC26620jMo1940d1.mo79222o()) {
                        try {
                            jMo9164h1 += interfaceC26620jMo1940d1.mo9164h1(c26616h, HMSConstantsKt.SPEEDTEST_DOWNLOAD_CHUNK_SIZE);
                            if (System.currentTimeMillis() - l12.longValue() > networkHealth.getTimeout()) {
                                break;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                try {
                                    AbstractC35854l.m113829i(c34850x0M131549e, th);
                                    throw th4;
                                } catch (IOException unused) {
                                    l7 = null;
                                    l13 = new Long(System.currentTimeMillis());
                                    if (l12 != null) {
                                        l14 = new Long(l13.longValue() - l12.longValue());
                                    }
                                    return new C23465k(l14, new Long(jMo9164h1));
                                } catch (Throwable th5) {
                                    th = th5;
                                    l7 = null;
                                    l14 = l12;
                                    if (l14 != null) {
                                        new Long(l7.longValue() - l14.longValue());
                                    }
                                    throw th;
                                }
                            }
                        }
                    }
                    l7 = new Long(System.currentTimeMillis());
                }
                try {
                    try {
                        c34850x0M131549e.close();
                        if (l12 != null && l7 != null) {
                            l14 = new Long(l7.longValue() - l12.longValue());
                        }
                    } catch (IOException unused2) {
                        l13 = new Long(System.currentTimeMillis());
                        if (l12 != null) {
                            l14 = new Long(l13.longValue() - l12.longValue());
                        }
                    }
                    return new C23465k(l14, new Long(jMo9164h1));
                } catch (Throwable th6) {
                    th = th6;
                    l14 = l12;
                    if (l14 != null && l7 != null) {
                        new Long(l7.longValue() - l14.longValue());
                    }
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                l12 = null;
            }
        } catch (IOException unused3) {
            l7 = null;
            l12 = null;
        } catch (Throwable th8) {
            th = th8;
            l7 = null;
            if (l14 != null) {
                new Long(l7.longValue() - l14.longValue());
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getDownloadSpeedInKilobytesPerSecond(NetworkHealth networkHealth, InterfaceC30057d<? super Double> interfaceC30057d) {
        C242561 c242561;
        if (interfaceC30057d instanceof C242561) {
            c242561 = (C242561) interfaceC30057d;
            int i13 = c242561.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c242561.label = i13 - Integer.MIN_VALUE;
            } else {
                c242561 = new C242561(interfaceC30057d);
            }
        } else {
            c242561 = new C242561(interfaceC30057d);
        }
        Object timeToDownload = c242561.result;
        Object obj = EnumC31071a.f128113w;
        int i14 = c242561.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(timeToDownload);
            c242561.label = 1;
            timeToDownload = getTimeToDownload(networkHealth, c242561);
            if (timeToDownload == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(timeToDownload);
        }
        C23465k c23465k = (C23465k) timeToDownload;
        Long l7 = (Long) c23465k.f92937w;
        long jLongValue = ((Number) c23465k.f92938x).longValue();
        if (l7 != null) {
            return new Double((jLongValue / 1024.0d) / ((l7.longValue() == 0 ? 1L : l7.longValue()) / 1000.0d));
        }
        return null;
    }

    public final int getSpeedTestScore(Double kilobytesPerSecond, SortedMap<Integer, RangeLimits> scoreMap) {
        Object next;
        Integer num;
        AbstractC22676k.m65750j(scoreMap, "scoreMap");
        if (kilobytesPerSecond == null) {
            return -1;
        }
        Set<Map.Entry<Integer, RangeLimits>> setEntrySet = scoreMap.entrySet();
        AbstractC22676k.m65749i(setEntrySet, "<get-entries>(...)");
        Iterator<T> it = setEntrySet.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Map.Entry entry = (Map.Entry) next;
            AbstractC22676k.m65747g(entry);
            RangeLimits rangeLimits = (RangeLimits) entry.getValue();
            if (kilobytesPerSecond.doubleValue() >= rangeLimits.getLow() && (kilobytesPerSecond.doubleValue() < rangeLimits.getHigh() || rangeLimits.getHigh() == 0)) {
                break;
            }
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 == null || (num = (Integer) entry2.getKey()) == null) {
            return 0;
        }
        return num.intValue();
    }
}
