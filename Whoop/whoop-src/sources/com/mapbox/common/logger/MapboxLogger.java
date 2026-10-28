package com.mapbox.common.logger;

import android.util.Log;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.concurrent.atomic.AtomicReference;
import l83.C23454a0;
import p438qu.InterfaceC30621a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import ru.C31815a;
import ru.C31816b;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0003J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0016\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0018J\u001d\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u001aJ+\u0010\u0016\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00192\u0006\u0010\b\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0016\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001aJ+\u0010\u001c\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00192\u0006\u0010\b\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u0017J\u001d\u0010\u001d\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u001aJ+\u0010\u001d\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00192\u0006\u0010\b\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u0017J\u001d\u0010\u001e\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u0018J\u001d\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u001aJ+\u0010\u001e\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00192\u0006\u0010\b\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010\u0017J\u001d\u0010\u001f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010\u0018J\u001d\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010\u001aJ+\u0010\u001f\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00192\u0006\u0010\b\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001f\u0010\u001bR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010!R(\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b\"\u0010#\u0012\u0004\b(\u0010\u0003\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010*¨\u0006+"}, m65681d2 = {"Lcom/mapbox/common/logger/MapboxLogger;", "Lqu/a;", "<init>", "()V", "", "requiredLogLevel", "", "tag", NotificationCompat.CATEGORY_MESSAGE, "", "tr", "Lkotlin/Function0;", "Ll83/a0;", "logBlock", "log", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V", "Lcom/mapbox/common/logger/LoggerObserver;", "observer", "setObserver", "(Lcom/mapbox/common/logger/LoggerObserver;)V", "removeObserver", "Lru/a;", "v", "(Lru/a;)V", "(Lru/a;Ljava/lang/Throwable;)V", "Lru/b;", "(Lru/b;Lru/a;)V", "(Lru/b;Lru/a;Ljava/lang/Throwable;)V", "d", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "e", "DEFAULT_TAG", "Ljava/lang/String;", "logLevel", "I", "getLogLevel", "()I", "setLogLevel", "(I)V", "getLogLevel$annotations", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "liblogger_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class MapboxLogger implements InterfaceC30621a {
    private static final String DEFAULT_TAG = "MapboxLogger";
    public static final MapboxLogger INSTANCE = new MapboxLogger();
    private static volatile int logLevel = 2;
    private static final AtomicReference<LoggerObserver> observer = new AtomicReference<>();

    /* JADX INFO: renamed from: com.mapbox.common.logger.MapboxLogger$d$1 */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C54371 extends AbstractC22680m implements InterfaceC4339a {
        final /* synthetic */ C31815a $msg;
        final /* synthetic */ C31816b $tag;
        final /* synthetic */ Throwable $tr;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54371(C31816b c31816b, C31815a c31815a, Throwable th3) {
            super(0);
            this.$tag = c31816b;
            this.$msg = c31815a;
            this.$tr = th3;
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134071invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134071invoke() {
            String str;
            C31816b c31816b = this.$tag;
            if (c31816b == null || (str = c31816b.f131825a) == null) {
                str = MapboxLogger.DEFAULT_TAG;
            }
            Log.d(str, this.$msg.f131824a, this.$tr);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.common.logger.MapboxLogger$e$1 */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C54381 extends AbstractC22680m implements InterfaceC4339a {
        final /* synthetic */ C31815a $msg;
        final /* synthetic */ C31816b $tag;
        final /* synthetic */ Throwable $tr;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54381(C31816b c31816b, C31815a c31815a, Throwable th3) {
            super(0);
            this.$tag = c31816b;
            this.$msg = c31815a;
            this.$tr = th3;
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134072invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134072invoke() {
            String str;
            C31816b c31816b = this.$tag;
            if (c31816b == null || (str = c31816b.f131825a) == null) {
                str = MapboxLogger.DEFAULT_TAG;
            }
            Log.e(str, this.$msg.f131824a, this.$tr);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.common.logger.MapboxLogger$i$1 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C54391 extends AbstractC22680m implements InterfaceC4339a {
        final /* synthetic */ C31815a $msg;
        final /* synthetic */ C31816b $tag;
        final /* synthetic */ Throwable $tr;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54391(C31816b c31816b, C31815a c31815a, Throwable th3) {
            super(0);
            this.$tag = c31816b;
            this.$msg = c31815a;
            this.$tr = th3;
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134073invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134073invoke() {
            String str;
            C31816b c31816b = this.$tag;
            if (c31816b == null || (str = c31816b.f131825a) == null) {
                str = MapboxLogger.DEFAULT_TAG;
            }
            Log.i(str, this.$msg.f131824a, this.$tr);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.common.logger.MapboxLogger$v$1 */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C54401 extends AbstractC22680m implements InterfaceC4339a {
        final /* synthetic */ C31815a $msg;
        final /* synthetic */ C31816b $tag;
        final /* synthetic */ Throwable $tr;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54401(C31816b c31816b, C31815a c31815a, Throwable th3) {
            super(0);
            this.$tag = c31816b;
            this.$msg = c31815a;
            this.$tr = th3;
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134074invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134074invoke() {
            String str;
            C31816b c31816b = this.$tag;
            if (c31816b == null || (str = c31816b.f131825a) == null) {
                str = MapboxLogger.DEFAULT_TAG;
            }
            Log.v(str, this.$msg.f131824a, this.$tr);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.common.logger.MapboxLogger$w$1 */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C54411 extends AbstractC22680m implements InterfaceC4339a {
        final /* synthetic */ C31815a $msg;
        final /* synthetic */ C31816b $tag;
        final /* synthetic */ Throwable $tr;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54411(C31816b c31816b, C31815a c31815a, Throwable th3) {
            super(0);
            this.$tag = c31816b;
            this.$msg = c31815a;
            this.$tr = th3;
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134075invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134075invoke() {
            String str;
            C31816b c31816b = this.$tag;
            if (c31816b == null || (str = c31816b.f131825a) == null) {
                str = MapboxLogger.DEFAULT_TAG;
            }
            Log.w(str, this.$msg.f131824a, this.$tr);
        }
    }

    private MapboxLogger() {
    }

    public static /* synthetic */ void getLogLevel$annotations() {
    }

    private final void log(int requiredLogLevel, String tag, String msg, Throwable tr3, InterfaceC4339a logBlock) {
        if (logLevel <= requiredLogLevel) {
            logBlock.invoke();
            LoggerObserver loggerObserver = observer.get();
            if (loggerObserver != null) {
                loggerObserver.log(requiredLogLevel, new LogEntry(tag, msg, tr3));
            }
        }
    }

    @Override // p438qu.InterfaceC30621a
    /* JADX INFO: renamed from: d */
    public void mo16596d(C31816b tag, C31815a msg, Throwable tr3) {
        AbstractC22676k.m65750j(msg, "msg");
        log(3, tag != null ? tag.f131825a : null, msg.f131824a, tr3, new C54371(tag, msg, tr3));
    }

    @Override // p438qu.InterfaceC30621a
    /* JADX INFO: renamed from: e */
    public void mo16600e(C31816b tag, C31815a msg, Throwable tr3) {
        AbstractC22676k.m65750j(msg, "msg");
        log(6, tag != null ? tag.f131825a : null, msg.f131824a, tr3, new C54381(tag, msg, tr3));
    }

    public final int getLogLevel() {
        return logLevel;
    }

    @Override // p438qu.InterfaceC30621a
    /* JADX INFO: renamed from: i */
    public void mo16604i(C31816b tag, C31815a msg, Throwable tr3) {
        AbstractC22676k.m65750j(msg, "msg");
        log(4, tag != null ? tag.f131825a : null, msg.f131824a, tr3, new C54391(tag, msg, tr3));
    }

    public final void removeObserver() {
        observer.set(null);
    }

    public final void setLogLevel(int i13) {
        logLevel = i13;
    }

    public final void setObserver(LoggerObserver observer2) {
        AbstractC22676k.m65750j(observer2, "observer");
        observer.set(observer2);
    }

    /* JADX INFO: renamed from: v */
    public void m16608v(C31816b tag, C31815a msg, Throwable tr3) {
        AbstractC22676k.m65750j(msg, "msg");
        log(2, tag != null ? tag.f131825a : null, msg.f131824a, tr3, new C54401(tag, msg, tr3));
    }

    @Override // p438qu.InterfaceC30621a
    /* JADX INFO: renamed from: w */
    public void mo16612w(C31816b tag, C31815a msg, Throwable tr3) {
        AbstractC22676k.m65750j(msg, "msg");
        log(5, tag != null ? tag.f131825a : null, msg.f131824a, tr3, new C54411(tag, msg, tr3));
    }

    /* JADX INFO: renamed from: d */
    public final void m16593d(C31815a msg) {
        AbstractC22676k.m65750j(msg, "msg");
        mo16596d(null, msg, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m16597e(C31815a msg) {
        AbstractC22676k.m65750j(msg, "msg");
        mo16600e(null, msg, null);
    }

    /* JADX INFO: renamed from: i */
    public final void m16601i(C31815a msg) {
        AbstractC22676k.m65750j(msg, "msg");
        mo16604i(null, msg, null);
    }

    /* JADX INFO: renamed from: v */
    public final void m16605v(C31815a msg) {
        AbstractC22676k.m65750j(msg, "msg");
        m16608v(null, msg, null);
    }

    /* JADX INFO: renamed from: w */
    public final void m16609w(C31815a msg) {
        AbstractC22676k.m65750j(msg, "msg");
        mo16612w(null, msg, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m16594d(C31815a msg, Throwable tr3) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tr3, "tr");
        mo16596d(null, msg, tr3);
    }

    /* JADX INFO: renamed from: e */
    public final void m16598e(C31815a msg, Throwable tr3) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tr3, "tr");
        mo16600e(null, msg, tr3);
    }

    /* JADX INFO: renamed from: i */
    public final void m16602i(C31815a msg, Throwable tr3) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tr3, "tr");
        mo16604i(null, msg, tr3);
    }

    /* JADX INFO: renamed from: v */
    public final void m16606v(C31815a msg, Throwable tr3) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tr3, "tr");
        m16608v(null, msg, tr3);
    }

    /* JADX INFO: renamed from: w */
    public final void m16610w(C31815a msg, Throwable tr3) {
        AbstractC22676k.m65750j(msg, "msg");
        AbstractC22676k.m65750j(tr3, "tr");
        mo16612w(null, msg, tr3);
    }

    /* JADX INFO: renamed from: d */
    public final void m16595d(C31816b tag, C31815a msg) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(msg, "msg");
        mo16596d(tag, msg, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m16599e(C31816b tag, C31815a msg) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(msg, "msg");
        mo16600e(tag, msg, null);
    }

    /* JADX INFO: renamed from: i */
    public final void m16603i(C31816b tag, C31815a msg) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(msg, "msg");
        mo16604i(tag, msg, null);
    }

    /* JADX INFO: renamed from: v */
    public final void m16607v(C31816b tag, C31815a msg) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(msg, "msg");
        m16608v(tag, msg, null);
    }

    /* JADX INFO: renamed from: w */
    public final void m16611w(C31816b tag, C31815a msg) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(msg, "msg");
        mo16612w(tag, msg, null);
    }
}
