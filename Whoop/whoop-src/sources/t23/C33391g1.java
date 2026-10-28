package t23;

import a30.C0332w0;
import android.content.Context;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import bi.C3278p;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import g43.C15468e;
import io.getstream.video.android.model.C19971b;
import io.getstream.video.android.model.StreamCallId;
import j43.C21319c;
import j43.C21323g;
import j43.C21325i;
import java.util.concurrent.ConcurrentHashMap;
import l83.C23470p;
import m83.AbstractC25260n;
import ng3.C26702o;
import p000.AbstractC11266d;
import p005a3.C0271z0;
import p031b9.AbstractC2875y;
import p479s4.AbstractC32122c;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb0.AbstractC39383f;
import z23.C40033c;

/* JADX INFO: renamed from: t23.g1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33391g1 {

    /* JADX INFO: renamed from: a */
    public final C33366b4 f139398a;

    /* JADX INFO: renamed from: c */
    public final C33366b4 f139400c;

    /* JADX INFO: renamed from: e */
    public final C13045h2 f139402e;

    /* JADX INFO: renamed from: f */
    public final C13045h2 f139403f;

    /* JADX INFO: renamed from: g */
    public final C13045h2 f139404g;

    /* JADX INFO: renamed from: h */
    public final C13045h2 f139405h;

    /* JADX INFO: renamed from: i */
    public final C3278p f139406i;

    /* JADX INFO: renamed from: j */
    public final C0332w0 f139407j;

    /* JADX INFO: renamed from: k */
    public final C40033c f139408k;

    /* JADX INFO: renamed from: b */
    public final C23470p f139399b = AbstractC1772c1.m5382S(this, "ClientState");

    /* JADX INFO: renamed from: d */
    public final C13045h2 f139401d = AbstractC13091v.m36593c(C33411k1.f139496a);

    public C33391g1(C33366b4 c33366b4) {
        this.f139398a = c33366b4;
        this.f139400c = c33366b4;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(null);
        this.f139402e = c13045h2M36593c;
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(null);
        this.f139403f = c13045h2M36593c2;
        c33366b4.f139236I.getClass();
        this.f139404g = c13045h2M36593c;
        this.f139405h = c13045h2M36593c2;
        this.f139406i = c33366b4.f139238K;
        this.f139407j = new C0332w0(c33366b4.f139259w, 8);
        this.f139408k = (C40033c) c33366b4.f139246S.f140441w;
    }

    /* JADX INFO: renamed from: a */
    public final C2345k m105845a() {
        return (C2345k) this.f139399b.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final void m105846b(C33368c0 c33368c0, String str) {
        String str2 = c33368c0.f139308v;
        String str3 = c33368c0.f139288b;
        C2345k c2345kM105845a = m105845a();
        InterfaceC2339e interfaceC2339e = c2345kM105845a.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str4 = c2345kM105845a.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str4)) {
            c2345kM105845a.f9274b.log(enumC2341g, str4, "[maybeStartForegroundService], trigger: ".concat(str), null);
        }
        boolean zEquals = str.equals("ongoing_call");
        C33366b4 streamVideo = this.f139400c;
        C0332w0 c0332w0 = this.f139407j;
        if (zEquals) {
            c0332w0.getClass();
            AbstractC22676k.m65750j(streamVideo, "streamVideo");
            C21319c c21319cM9548b = streamVideo.f139238K.m9548b(str3);
            if (c21319cM9548b.f81521a) {
                StreamCallId.Companion.getClass();
                StreamCallId streamCallIdM55786a = C19971b.m55786a(str2);
                Context context = streamVideo.f139259w;
                AbstractC32122c.startForegroundService(context, new C21323g(0).m59851a(context, new C21325i(streamCallIdM55786a, str, null, c21319cM9548b)));
                return;
            }
            return;
        }
        if (str.equals("outgoing_call")) {
            Context context2 = (Context) c0332w0.f1168x;
            AbstractC22676k.m65750j(streamVideo, "streamVideo");
            C21319c c21319cM9548b2 = streamVideo.f139238K.m9548b(str3);
            if (c21319cM9548b2.f81521a) {
                StreamCallId.Companion.getClass();
                AbstractC32122c.startForegroundService(context2, new C21323g(0).m59851a(context2, new C21325i(C19971b.m55786a(str2), str, null, c21319cM9548b2)));
                new C26702o(16);
                C26702o.m79409m(c21319cM9548b2, context2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x009c  */
    /* JADX INFO: renamed from: c */
    public final void m105847c(C33368c0 c33368c0) {
        String key;
        C33366b4 c33366b4 = this.f139400c;
        if (c33366b4.f139238K.m9548b(c33368c0.f139288b).f81521a) {
            Context context = c33366b4.f139259w;
            C2345k c2345kM105845a = m105845a();
            InterfaceC2339e interfaceC2339e = c2345kM105845a.f9275c;
            String str = c2345kM105845a.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345kM105845a.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("Building stop intent for call_id: ", c33368c0.f139308v), null);
            }
            C0332w0 c0332w0 = new C0332w0(context, 8);
            C2345k c2345kM862r = c0332w0.m862r();
            InterfaceC2339e interfaceC2339e2 = c2345kM862r.f9275c;
            String str2 = c2345kM862r.f9273a;
            if (interfaceC2339e2.isLoggable(enumC2341g, str2)) {
                c2345kM862r.f9274b.log(enumC2341g, str2, "[stopService]", null);
            }
            C15468e c15468e = (C15468e) c0332w0.f1166G;
            C0271z0 c0271z0 = new C0271z0(15, c0332w0, c33368c0);
            c15468e.getClass();
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            AbstractC22676k.m65749i(stackTrace, "getStackTrace(...)");
            StackTraceElement stackTraceElement = (StackTraceElement) AbstractC25260n.m74084y0(4, stackTrace);
            if (stackTraceElement != null) {
                key = stackTraceElement.getClassName() + "#" + stackTraceElement.getMethodName() + ":" + stackTraceElement.getLineNumber();
                if (key == null) {
                    key = AbstractC2875y.m8295h(c0271z0.hashCode(), "fallback_");
                }
            } else {
                key = AbstractC2875y.m8295h(c0271z0.hashCode(), "fallback_");
            }
            AbstractC22676k.m65750j(key, "key");
            long jCurrentTimeMillis = System.currentTimeMillis();
            ConcurrentHashMap concurrentHashMap = c15468e.f58093b;
            Long l7 = (Long) concurrentHashMap.get(key);
            if (l7 == null) {
                l7 = 0L;
            }
            long jLongValue = l7.longValue();
            long j7 = jCurrentTimeMillis - jLongValue;
            C2345k c2345k = (C2345k) c15468e.f58092a.getValue();
            InterfaceC2339e interfaceC2339e3 = c2345k.f9275c;
            String str3 = c2345k.f9273a;
            if (interfaceC2339e3.isLoggable(enumC2341g, str3)) {
                InterfaceC2344j interfaceC2344j = c2345k.f9274b;
                int iHashCode = c15468e.hashCode();
                StringBuilder sbM125596b = AbstractC39383f.m125596b(j7, "[throttleFirst], timeDiff: ", ", current: ");
                sbM125596b.append(jCurrentTimeMillis);
                AbstractC2875y.m8285A(sbM125596b, ", lastExecutionTime: ", jLongValue, ", key:");
                sbM125596b.append(key);
                sbM125596b.append(", hashcode: ");
                sbM125596b.append(iHashCode);
                interfaceC2344j.log(enumC2341g, str3, sbM125596b.toString(), null);
            }
            if (jLongValue == 0 || j7 >= 1000) {
                concurrentHashMap.put(key, Long.valueOf(jCurrentTimeMillis));
                c0271z0.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m105848d(C33368c0 c33368c0) {
        String str = c33368c0.f139289c;
        C2345k c2345kM105845a = m105845a();
        InterfaceC2339e interfaceC2339e = c2345kM105845a.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str2 = c2345kM105845a.f9273a;
        boolean zIsLoggable = interfaceC2339e.isLoggable(enumC2341g, str2);
        C13045h2 c13045h2 = this.f139404g;
        if (zIsLoggable) {
            InterfaceC2344j interfaceC2344j = c2345kM105845a.f9274b;
            C33368c0 c33368c1 = (C33368c0) c13045h2.getValue();
            interfaceC2344j.log(enumC2341g, str2, AbstractC11266d.m30462p("[removeRingingCall] call.id == ringingCall.value?.id: ", str.equals(c33368c1 != null ? c33368c1.f139289c : null)), null);
        }
        C33368c0 c33368c2 = (C33368c0) c13045h2.getValue();
        if (str.equals(c33368c2 != null ? c33368c2.f139289c : null)) {
            this.f139398a.f139255b0.m846I();
            C33368c0 c33368c3 = (C33368c0) c13045h2.getValue();
            if (c33368c3 != null) {
                m105847c(c33368c3);
            }
            this.f139402e.m36570j(null);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m105849e(C33368c0 c33368c0) {
        String str = c33368c0.f139289c;
        C33368c0 c33368c1 = (C33368c0) this.f139404g.getValue();
        if (str.equals(c33368c1 != null ? c33368c1.f139289c : null)) {
            this.f139398a.f139255b0.m846I();
            this.f139402e.m36570j(null);
        }
    }
}
