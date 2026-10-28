package io.getstream.chat.android.client.plugin;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.C19383k;
import io.getstream.chat.android.models.Location;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23454a0;
import l83.InterfaceC23462h;
import live.hms.video.utils.HMSConstantsKt;
import n23.AbstractC26202e;
import n23.AbstractC26205h;
import n23.C26198a;
import n23.C26203f;
import n23.C26204g;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006JG\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Lio/getstream/chat/android/client/plugin/ThrottlingPlugin;", "Lio/getstream/chat/android/client/plugin/Plugin;", "Lkotlin/Function0;", "", "now", "<init>", "(Lc93/a;)V", "", "", "lastUpdateProvider", "key", "throttleMs", "Ln23/a;", "failureGenerator", "Ln23/h;", "Ll83/a0;", "checkThrottling", "(Ljava/util/Map;Ljava/lang/String;JLc93/a;)Ln23/h;", "Lio/getstream/chat/android/models/Location;", "location", "onUpdateLiveLocationPrecondition", "(Lio/getstream/chat/android/models/Location;Lq83/d;)Ljava/lang/Object;", "onUserDisconnected", "()V", "Lc93/a;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "liveLocationMap", "Ljava/util/Map;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ThrottlingPlugin implements Plugin {
    private final Map<String, Long> liveLocationMap;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final InterfaceC4339a now;

    /* JADX WARN: Multi-variable type inference failed */
    public ThrottlingPlugin() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final AbstractC26205h checkThrottling(Map<String, Long> lastUpdateProvider, String key, long throttleMs, InterfaceC4339a failureGenerator) {
        long jLongValue = ((Number) this.now.invoke()).longValue();
        Long l7 = lastUpdateProvider.get(key);
        long jLongValue2 = jLongValue - (l7 != null ? l7.longValue() : 0L);
        if (jLongValue2 != jLongValue && jLongValue2 < throttleMs) {
            return new C26203f((AbstractC26202e) failureGenerator.invoke());
        }
        C26204g c26204g = new C26204g(C23454a0.f92919a);
        lastUpdateProvider.put(key, Long.valueOf(jLongValue));
        return c26204g;
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private static final C26198a onUpdateLiveLocationPrecondition$lambda$2(ThrottlingPlugin throttlingPlugin, Location location) {
        C2345k logger = throttlingPlugin.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.WARN;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11895b.m31996o("[onUpdateLiveLocationPrecondition] live location update is ignored (", location.getMessageId(), ")"), null);
        }
        return new C26198a("Live location update throttled");
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.LiveLocationListener
    public final Object onUpdateLiveLocationPrecondition(Location location, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        Map<String, Long> map = this.liveLocationMap;
        String messageId = location.getMessageId();
        long jLongValue = ((Number) this.now.invoke()).longValue();
        Long l7 = map.get(messageId);
        long jLongValue2 = jLongValue - (l7 != null ? l7.longValue() : 0L);
        if (jLongValue2 != jLongValue && jLongValue2 < HMSConstantsKt.TIMEOUT_FOR_LOW_SPEED_INDICATOR_MILLIS) {
            return new C26203f(onUpdateLiveLocationPrecondition$lambda$2(this, location));
        }
        C26204g c26204g = new C26204g(C23454a0.f92919a);
        map.put(messageId, Long.valueOf(jLongValue));
        return c26204g;
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin
    public final void onUserDisconnected() {
        this.liveLocationMap.clear();
    }

    public ThrottlingPlugin(InterfaceC4339a now) {
        AbstractC22676k.m65750j(now, "now");
        this.now = now;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:ThrottlingPlugin");
        this.liveLocationMap = new LinkedHashMap();
    }

    public /* synthetic */ ThrottlingPlugin(InterfaceC4339a interfaceC4339a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C19383k(17) : interfaceC4339a);
    }
}
