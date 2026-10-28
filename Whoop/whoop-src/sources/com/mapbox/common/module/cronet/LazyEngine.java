package com.mapbox.common.module.cronet;

import android.content.Context;
import com.google.android.gms.net.CronetProviderInstaller;
import com.google.android.gms.tasks.Task;
import com.mapbox.common.FeatureTelemetryCounter;
import com.mapbox.common.MapboxCommonLogger;
import com.mapbox.common.MapboxSDKCommon;
import com.mapbox.common.location.C5432a;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import l83.C23454a0;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import p047c9.C4316g;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R(\u0010\u0015\u001a\u0004\u0018\u00010\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\n8F@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\f¨\u0006\u0019"}, m65681d2 = {"Lcom/mapbox/common/module/cronet/LazyEngine;", "", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Ll83/a0;", "initializeProvider", "()V", "tryInstallFromGooglePlay", "Lorg/chromium/net/CronetEngine;", "configureEngine", "()Lorg/chromium/net/CronetEngine;", "Ljava/util/concurrent/Executor;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lorg/chromium/net/CronetProvider;", "cronetProvider", "Lorg/chromium/net/CronetProvider;", "<set-?>", "engine", "Lorg/chromium/net/CronetEngine;", "getEngine", "Companion", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class LazyEngine {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Context context;
    private CronetProvider cronetProvider;
    private volatile CronetEngine engine;
    private final Executor executor;

    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lcom/mapbox/common/module/cronet/LazyEngine$Companion;", "", "<init>", "()V", "Ll83/a0;", "onCronetNotAvailable", "Lorg/chromium/net/CronetProvider;", "provider", "onCronetAvailable", "(Lorg/chromium/net/CronetProvider;)V", "Landroid/content/Context;", "context", "Lcom/google/android/gms/tasks/Task;", "Ljava/lang/Void;", "installCronetFromPlayServices", "(Landroid/content/Context;)Lcom/google/android/gms/tasks/Task;", "", "canInstallFromGooglePlay", "()Z", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean canInstallFromGooglePlay() {
            return LazyEngineKt.canInstallFromGooglePlay.getAndSet(false);
        }

        public final Task<Void> installCronetFromPlayServices(Context context) {
            AbstractC22676k.m65750j(context, "context");
            Task<Void> taskInstallProvider = CronetProviderInstaller.installProvider(context);
            AbstractC22676k.m65749i(taskInstallProvider, "installProvider(context)");
            return taskInstallProvider;
        }

        public final void onCronetAvailable(CronetProvider provider) {
            String str;
            AbstractC22676k.m65750j(provider, "provider");
            String name = provider.getName();
            if (AbstractC22676k.m65745e(name, CronetProvider.PROVIDER_NAME_APP_PACKAGED)) {
                str = "Embedded";
            } else {
                str = (LazyEngineKt.isPlayServicesCronetProviderInstallerAvailable && AbstractC22676k.m65745e(name, "Google-Play-Services-Cronet-Provider")) ? "PlayServices" : "UnknownSource";
            }
            FeatureTelemetryCounter.create("common/network/http3/Cronet" + str + "Available").increment();
        }

        public final void onCronetNotAvailable() {
            FeatureTelemetryCounter.create("common/network/http3/CronetNotAvailable").increment();
            MapboxCommonLogger.INSTANCE.logW$common_release("HTTP", "HTTP/3 will not be available: Cannot find a valid Cronet provider. In order to\nenable HTTP/3 in the Mapbox SDKs, it's necessary that the application depends on\na valid Cronet provider. Valid providers include the Google Play Services\nprovider (from \"com.google.android.gms:play-services-cronet\"), in which case\nCronet will be used from Play Services, or you may choose to embed Cronet with\nyour application by depending on \"org.chromium.net:cronet-embedded\".");
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.mapbox.common.module.cronet.LazyEngine$tryInstallFromGooglePlay$1 */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ljava/lang/Void;", "kotlin.jvm.PlatformType", "it", "Ll83/a0;", "invoke", "(Ljava/lang/Void;)V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C54461 extends AbstractC22680m implements Function1 {
        public C54461() {
            super(1);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Void) obj);
            return C23454a0.f92919a;
        }

        public final void invoke(Void r10) {
            LazyEngine lazyEngine = LazyEngine.this;
            lazyEngine.cronetProvider = LazyEngineKt.findCronetProvider(lazyEngine.context);
        }
    }

    public LazyEngine(Executor executor) {
        AbstractC22676k.m65750j(executor, "executor");
        this.executor = executor;
        this.context = MapboxSDKCommon.INSTANCE.getContext();
        initializeProvider();
    }

    private final CronetEngine configureEngine() {
        try {
            CronetProvider cronetProvider = this.cronetProvider;
            AbstractC22676k.m65747g(cronetProvider);
            CronetEngine cronetEngineBuild = cronetProvider.createBuilder().enableBrotli(true).enableQuic(true).enableHttp2(true).addQuicHint("api.mapbox.com", 443, 443).addQuicHint("events.mapbox.com", 443, 443).addQuicHint("config.mapbox.com", 443, 443).enableHttpCache(0, 0L).build();
            cronetEngineBuild.addRequestFinishedListener(new CronetRequestFinishedListener(this.executor));
            Companion companion = INSTANCE;
            CronetProvider cronetProvider2 = this.cronetProvider;
            AbstractC22676k.m65747g(cronetProvider2);
            companion.onCronetAvailable(cronetProvider2);
            return cronetEngineBuild;
        } catch (Throwable unused) {
            CopyOnWriteArraySet<String> disabledProviders = LazyEngineKt.getDisabledProviders();
            CronetProvider cronetProvider3 = this.cronetProvider;
            AbstractC22676k.m65747g(cronetProvider3);
            disabledProviders.add(cronetProvider3.getName());
            initializeProvider();
            if (this.cronetProvider != null) {
                return configureEngine();
            }
            return null;
        }
    }

    private final void initializeProvider() {
        CronetProvider cronetProviderFindCronetProvider = LazyEngineKt.findCronetProvider(this.context);
        this.cronetProvider = cronetProviderFindCronetProvider;
        if (cronetProviderFindCronetProvider == null) {
            tryInstallFromGooglePlay();
        }
    }

    private final void tryInstallFromGooglePlay() {
        Companion companion = INSTANCE;
        if (companion.canInstallFromGooglePlay()) {
            companion.installCronetFromPlayServices(this.context).addOnSuccessListener(new C5432a(new C54461(), 4)).addOnFailureListener(new C4316g(15));
        } else {
            companion.onCronetNotAvailable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryInstallFromGooglePlay$lambda$1(Function1 tmp0, Object obj) {
        AbstractC22676k.m65750j(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryInstallFromGooglePlay$lambda$2(Exception it) {
        AbstractC22676k.m65750j(it, "it");
        INSTANCE.onCronetNotAvailable();
    }

    public final CronetEngine getEngine() {
        if (this.cronetProvider == null) {
            return null;
        }
        if (this.engine == null) {
            synchronized (this) {
                if (this.engine == null) {
                    this.engine = configureEngine();
                }
            }
        }
        return this.engine;
    }
}
