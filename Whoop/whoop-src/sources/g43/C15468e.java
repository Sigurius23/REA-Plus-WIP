package g43;

import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.C1064c;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.C1082p;
import android.support.v4.media.session.C1085s;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import d33.C11602h1;
import e33.C12662v0;
import ec3.C13045h2;
import io.getstream.video.android.model.C19971b;
import io.getstream.video.android.model.StreamCallId;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import l83.C23454a0;
import l83.C23470p;
import p002a0.C0022g;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import t23.C33368c0;

/* JADX INFO: renamed from: g43.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C15468e {

    /* JADX INFO: renamed from: a */
    public final C23470p f58092a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f58093b;

    public C15468e() {
        this.f58092a = AbstractC1772c1.m5382S(this, "Throttler");
        this.f58093b = new ConcurrentHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static Object m43661c(C15468e c15468e, C1082p c1082p, C33368c0 c33368c0, C1064c c1064c, AbstractC32269c abstractC32269c) {
        C15466c c15466c;
        Object obj;
        if (abstractC32269c instanceof C15466c) {
            c15466c = (C15466c) abstractC32269c;
            int i13 = c15466c.f58087z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c15466c.f58087z = i13 - Integer.MIN_VALUE;
            } else {
                c15466c = new C15466c(c15468e, abstractC32269c);
            }
        } else {
            c15466c = new C15466c(c15468e, abstractC32269c);
        }
        Object obj2 = c15466c.f58085x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c15466c.f58087z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj2);
            C2345k c2345k = (C2345k) c15468e.f58092a.getValue();
            InterfaceC2339e interfaceC2339e = c2345k.f9275c;
            String str = c2345k.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345k.f9274b.log(enumC2341g, str, "[updateMetadata] Updating media metadata for session: " + c1082p, null);
            }
            c1064c.getClass();
            C0022g c0022g = MediaMetadataCompat.f4149y;
            if (c0022g.containsKey("android.media.metadata.DURATION") && ((Integer) c0022g.get("android.media.metadata.DURATION")).intValue() != 0) {
                throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
            }
            c1064c.f4154a.putLong("android.media.metadata.DURATION", -1L);
            C19971b c19971b = StreamCallId.Companion;
            String str2 = c33368c0.f139308v;
            c19971b.getClass();
            C19971b.m55786a(str2);
            c15466c.f58084w = c1082p;
            c15466c.f58087z = 1;
            obj = c1064c;
            if (c1064c == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1082p = c15466c.f58084w;
            AbstractC34132o.m107864I(obj2);
            obj = obj2;
        }
        C1064c c1064c2 = (C1064c) obj;
        c1064c2.getClass();
        c1082p.m3220b(new MediaMetadataCompat(c1064c2.f4154a));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX INFO: renamed from: d */
    public static Object m43662d(C15468e c15468e, C1082p c1082p, C33368c0 c33368c0, C1085s c1085s, AbstractC32269c abstractC32269c) {
        C15467d c15467d;
        int i13;
        C1082p c1082p2;
        C13045h2 c13045h2;
        C12662v0 c12662v0;
        C13045h2 c13045h3;
        Object obj;
        C1085s c1085s2 = c1085s;
        if (abstractC32269c instanceof C15467d) {
            c15467d = (C15467d) abstractC32269c;
            int i14 = c15467d.f58091z;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c15467d.f58091z = i14 - Integer.MIN_VALUE;
            } else {
                c15467d = new C15467d(c15468e, abstractC32269c);
            }
        } else {
            c15467d = new C15467d(c15468e, abstractC32269c);
        }
        Object obj2 = c15467d.f58089x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c15467d.f58091z;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj2);
            C2345k c2345k = (C2345k) c15468e.f58092a.getValue();
            InterfaceC2339e interfaceC2339e = c2345k.f9275c;
            String str = c2345k.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345k.f9274b.log(enumC2341g, str, "[updatePlaybackState] Updating media metadata for session: " + c1082p, null);
            }
            C11602h1 c11602h1 = (C11602h1) c33368c0.f139268C.getValue();
            Boolean bool = (c11602h1 == null || (c13045h2 = c11602h1.f37464z) == null || (c12662v0 = (C12662v0) c13045h2.getValue()) == null || (c13045h3 = c12662v0.f43291D) == null) ? null : (Boolean) c13045h3.getValue();
            if (AbstractC22676k.m65745e(bool, Boolean.TRUE)) {
                i13 = 3;
            } else {
                i13 = AbstractC22676k.m65745e(bool, Boolean.FALSE) ? 2 : 0;
            }
            Duration duration = (Duration) c33368c0.f139302p.f139622K.f45200w.getValue();
            Long l7 = duration != null ? new Long(Duration.m134273getInWholeMillisecondsimpl(duration.getRawValue())) : null;
            long jLongValue = l7 != null ? l7.longValue() : -1L;
            c1085s2.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c1085s2.f4209b = i13;
            c1085s2.f4210c = jLongValue;
            c1085s2.f4212e = jElapsedRealtime;
            c1085s2.f4211d = 1.0f;
            c15467d.f58088w = c1082p;
            c15467d.f58091z = 1;
            if (c1085s2 == enumC31071a) {
                return enumC31071a;
            }
            c1082p2 = c1082p;
            obj = c1085s2;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1082p2 = c15467d.f58088w;
            AbstractC34132o.m107864I(obj2);
            obj = obj2;
        }
        C1085s c1085s3 = (C1085s) obj;
        c1082p2.m3221c(new PlaybackStateCompat(c1085s3.f4209b, c1085s3.f4210c, 0L, c1085s3.f4211d, 0L, 0, null, c1085s3.f4212e, c1085s3.f4208a, c1085s3.f4213f, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: a */
    public void m43663a(StreamCallId streamCallId) {
        C2345k c2345k = (C2345k) this.f58092a.getValue();
        InterfaceC2339e interfaceC2339e = c2345k.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345k.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345k.f9274b.log(enumC2341g, str, "[clear] Clearing media session for call: " + streamCallId, null);
        }
        this.f58093b.remove(streamCallId.getCid());
    }

    /* JADX INFO: renamed from: b */
    public C1082p m43664b(Application application, StreamCallId callId, String str) {
        AbstractC22676k.m65750j(application, "application");
        AbstractC22676k.m65750j(callId, "callId");
        String cid = callId.getCid();
        ConcurrentHashMap concurrentHashMap = this.f58093b;
        C1082p c1082p = (C1082p) concurrentHashMap.get(cid);
        if (c1082p != null) {
            return c1082p;
        }
        C1082p c1082p2 = (C1082p) concurrentHashMap.get(callId.getCid());
        if (c1082p2 == null) {
            c1082p2 = new C1082p(application, str);
        }
        c1082p2.m3220b(new MediaMetadataCompat(new Bundle()));
        c1082p2.m3221c(new PlaybackStateCompat(0, 0L, 0L, 0.0f, 0L, 0, null, 0L, new ArrayList(), -1L, null));
        concurrentHashMap.put(callId.getCid(), c1082p2);
        return c1082p2;
    }

    public C15468e(C15474k c15474k, C15480q c15480q) {
        this.f58092a = AbstractC1772c1.m5382S(this, "Video:MediaSessionController");
        this.f58093b = new ConcurrentHashMap();
    }
}
