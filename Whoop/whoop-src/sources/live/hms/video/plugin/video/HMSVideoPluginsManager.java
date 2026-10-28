package live.hms.video.plugin.video;

import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import hms.webrtc.VideoFrame;
import hms.webrtc.VideoProcessor;
import hms.webrtc.VideoSink;
import hms.webrtc.VideoSource;
import i93.C18284j;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l01.C23045q;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import live.hms.video.error.ErrorFactory;
import live.hms.video.error.HMSAction;
import live.hms.video.error.HMSException;
import live.hms.video.events.AnalyticsEventsService;
import live.hms.video.sdk.HMSActionResultListener;
import live.hms.video.sdk.HMSPluginResultListener;
import live.hms.video.sdk.ProcessTimeVariables;
import live.hms.video.utils.HMSLogger;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0081\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005*\u0001K\b\u0000\u0018\u0000 N2\u00020\u0001:\u0001NB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u0012J\u0017\u0010\u001f\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001f\u0010\u0016J\u0015\u0010 \u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b \u0010!J\u0013\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\"¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\b¢\u0006\u0004\b)\u0010\nJ\u0015\u0010+\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u000f¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u0002¢\u0006\u0004\b.\u0010/R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u0010/R\u0016\u00104\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001c\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00170\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\"\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b0=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001c\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000b0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010<R\"\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020A0=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010?R\"\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020%0=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010?R\"\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010?R\u0016\u0010F\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u00105R\"\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010?R\"\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010?R\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006O"}, m65681d2 = {"Llive/hms/video/plugin/video/HMSVideoPluginsManager;", "", "Lhms/webrtc/VideoSource;", "source", "Llive/hms/video/events/AnalyticsEventsService;", "eventsService", "<init>", "(Lhms/webrtc/VideoSource;Llive/hms/video/events/AnalyticsEventsService;)V", "Ll83/a0;", "setVideoProcessor", "()V", "Llive/hms/video/plugin/video/HMSVideoPlugin;", "plugin", "Llive/hms/video/sdk/HMSActionResultListener;", "resultListener", "", "pluginFrameRate", "addPluginInternal", "(Llive/hms/video/plugin/video/HMSVideoPlugin;Llive/hms/video/sdk/HMSActionResultListener;I)V", "Lhms/webrtc/VideoFrame;", "frame", "processFramesThroughPlugins", "(Lhms/webrtc/VideoFrame;)V", "", "name", "removePluginEntry", "(Ljava/lang/String;)V", "", "checkIfSkipRequired", "(Ljava/lang/String;)Z", "addPlugin", "pluginsProcessing", "removePlugin", "(Llive/hms/video/plugin/video/HMSVideoPlugin;)V", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getPlugins", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "", "timeTakenWithML", "checkIfPluginFpsChangeNeeded", "(Ljava/lang/String;J)V", "clean", "inputFps", "setInputFps", "(I)V", "localCameraVideoSource", "updateCameraSource", "(Lhms/webrtc/VideoSource;)V", "Lhms/webrtc/VideoSource;", "getSource", "()Lhms/webrtc/VideoSource;", "setSource", "setProcessor", "Z", "Lhms/webrtc/VideoSink;", "localSink", "Lhms/webrtc/VideoSink;", "inputFrameRate", "I", "plugins", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/ConcurrentHashMap;", "pluginsMap", "Ljava/util/concurrent/ConcurrentHashMap;", "pluginsObjectList", "", "pluginsAvgProcessingTime", "pluginsProcessingTimeExceedsSafeLimitCount", "pluginsFrameRateList", "Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;", "analytics", "Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;", "pluginAddInProgress", "pluginNumFramesToSkip", "pluginNumFramesSkipped", "live/hms/video/plugin/video/HMSVideoPluginsManager$pluginResultListener$1", "pluginResultListener", "Llive/hms/video/plugin/video/HMSVideoPluginsManager$pluginResultListener$1;", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSVideoPluginsManager {
    public static final int MAX_CONSEQUENT_TIME_VALUE = 30;
    public static final String TAG = "HMSVideoPluginsManager";
    private HMSVideoPluginAnalytics analytics;
    private int inputFrameRate;
    private VideoSink localSink;
    private boolean pluginAddInProgress;
    private ConcurrentHashMap<String, Integer> pluginNumFramesSkipped;
    private ConcurrentHashMap<String, Integer> pluginNumFramesToSkip;
    private final HMSVideoPluginsManager$pluginResultListener$1 pluginResultListener;
    private CopyOnWriteArrayList<String> plugins;
    private ConcurrentHashMap<String, Double> pluginsAvgProcessingTime;
    private ConcurrentHashMap<String, Integer> pluginsFrameRateList;
    private ConcurrentHashMap<String, HMSVideoPlugin> pluginsMap;
    private CopyOnWriteArrayList<HMSVideoPlugin> pluginsObjectList;
    private ConcurrentHashMap<String, Long> pluginsProcessingTimeExceedsSafeLimitCount;
    private boolean setProcessor;
    private VideoSource source;

    /* JADX INFO: renamed from: live.hms.video.plugin.video.HMSVideoPluginsManager$addPluginInternal$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.plugin.video.HMSVideoPluginsManager$addPluginInternal$1", m100430f = "HMSVideoPluginsManager.kt", m100431l = {138}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241861 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $name;
        final /* synthetic */ HMSVideoPlugin $plugin;
        final /* synthetic */ HMSActionResultListener $resultListener;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241861(HMSVideoPlugin hMSVideoPlugin, HMSActionResultListener hMSActionResultListener, String str, InterfaceC30057d<? super C241861> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$plugin = hMSVideoPlugin;
            this.$resultListener = hMSActionResultListener;
            this.$name = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HMSVideoPluginsManager.this.new C241861(this.$plugin, this.$resultListener, this.$name, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C241861) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM107888l;
            HMSVideoPlugin hMSVideoPlugin;
            HMSVideoPluginsManager hMSVideoPluginsManager;
            String str;
            HMSActionResultListener hMSActionResultListener;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            C23454a0 c23454a0 = C23454a0.f92919a;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    hMSVideoPlugin = this.$plugin;
                    hMSVideoPluginsManager = HMSVideoPluginsManager.this;
                    str = this.$name;
                    HMSActionResultListener hMSActionResultListener2 = this.$resultListener;
                    this.L$0 = hMSVideoPlugin;
                    this.L$1 = hMSVideoPluginsManager;
                    this.L$2 = str;
                    this.L$3 = hMSActionResultListener2;
                    this.label = 1;
                    if (hMSVideoPlugin.init(this) == enumC31071a) {
                        return enumC31071a;
                    }
                    hMSActionResultListener = hMSActionResultListener2;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hMSActionResultListener = (HMSActionResultListener) this.L$3;
                    str = (String) this.L$2;
                    hMSVideoPluginsManager = (HMSVideoPluginsManager) this.L$1;
                    hMSVideoPlugin = (HMSVideoPlugin) this.L$0;
                    AbstractC34132o.m107864I(obj);
                }
                hMSVideoPluginsManager.plugins.add(str);
                hMSVideoPluginsManager.pluginsObjectList.add(hMSVideoPlugin);
                hMSVideoPluginsManager.pluginsMap.put(str, hMSVideoPlugin);
                if (!hMSVideoPluginsManager.setProcessor) {
                    HMSLogger.m71136d(HMSVideoPluginsManager.TAG, "setting video processor");
                    hMSVideoPluginsManager.setVideoProcessor();
                    HMSLogger.m71136d(HMSVideoPluginsManager.TAG, "source set on processor " + hMSVideoPluginsManager.getSource());
                    hMSVideoPluginsManager.setProcessor = true;
                }
                hMSActionResultListener.onSuccess();
                hMSVideoPluginsManager.analytics.addPluginSuccess(str);
                objM107888l = c23454a0;
            } catch (Throwable th3) {
                objM107888l = AbstractC34132o.m107888l(th3);
            }
            if (objM107888l instanceof C23467m) {
                HMSVideoPluginsManager.this.removePlugin(this.$plugin);
                this.$resultListener.onError(ErrorFactory.GenericErrors.Unknown$default(ErrorFactory.GenericErrors.INSTANCE, ErrorFactory.Action.PLUGIN, "Plugin error " + C23468n.m68037a(objM107888l), null, null, 12, null));
            }
            return c23454a0;
        }
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [live.hms.video.plugin.video.HMSVideoPluginsManager$pluginResultListener$1] */
    public HMSVideoPluginsManager(VideoSource source, AnalyticsEventsService eventsService) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(eventsService, "eventsService");
        this.source = source;
        this.plugins = new CopyOnWriteArrayList<>();
        this.pluginsMap = new ConcurrentHashMap<>();
        this.pluginsObjectList = new CopyOnWriteArrayList<>();
        this.pluginsAvgProcessingTime = new ConcurrentHashMap<>();
        this.pluginsProcessingTimeExceedsSafeLimitCount = new ConcurrentHashMap<>();
        this.pluginsFrameRateList = new ConcurrentHashMap<>();
        this.analytics = new HMSVideoPluginAnalytics(eventsService);
        this.pluginNumFramesToSkip = new ConcurrentHashMap<>();
        this.pluginNumFramesSkipped = new ConcurrentHashMap<>();
        this.pluginResultListener = new HMSPluginResultListener() { // from class: live.hms.video.plugin.video.HMSVideoPluginsManager$pluginResultListener$1
            @Override // live.hms.video.sdk.HMSPluginResultListener
            public void onOutputResult(VideoFrame output) {
                VideoFrame.Buffer buffer;
                VideoSink videoSink;
                if (output != null && (videoSink = this.this$0.localSink) != null) {
                    videoSink.onFrame(output);
                }
                if (output == null || (buffer = output.getBuffer()) == null) {
                    return;
                }
                buffer.release();
            }

            @Override // live.hms.video.sdk.HMSPluginResultListener
            public void onTimeTaken(ProcessTimeVariables timeObject) {
                AbstractC22676k.m65750j(timeObject, "timeObject");
                if (this.this$0.plugins.size() > 0) {
                    HMSVideoPluginAnalytics hMSVideoPluginAnalytics = this.this$0.analytics;
                    Object obj = this.this$0.plugins.get(0);
                    AbstractC22676k.m65749i(obj, "get(...)");
                    hMSVideoPluginAnalytics.processTime((String) obj, timeObject.getTimeTakenWithML(), timeObject.getTimeTakenWithoutML());
                }
            }
        };
    }

    private final void addPluginInternal(HMSVideoPlugin plugin, HMSActionResultListener resultListener, int pluginFrameRate) throws HMSException {
        HMSVideoPluginsManager hMSVideoPluginsManager;
        HMSVideoPlugin hMSVideoPlugin;
        String name = plugin.getName();
        if (name.length() == 0) {
            HMSLogger.INSTANCE.m71141w(TAG, "no name provided by the plugin");
            return;
        }
        if (this.pluginsMap.containsKey(name)) {
            HMSLogger.INSTANCE.m71141w(TAG, "plugin - " + plugin.getName() + " already added.");
            return;
        }
        int iCeil = 0;
        if (pluginFrameRate > 0) {
            HMSLogger.INSTANCE.m71139i(TAG, "adding plugin " + plugin.getName() + " with framerate " + pluginFrameRate);
            this.pluginsFrameRateList.put(name, Integer.valueOf(pluginFrameRate));
            int i13 = this.inputFrameRate;
            iCeil = pluginFrameRate < i13 ? (int) Math.ceil((((double) i13) / ((double) pluginFrameRate)) - ((double) 1)) : 0;
            this.analytics.added(name, this.inputFrameRate, Integer.valueOf(pluginFrameRate));
        } else {
            this.pluginsFrameRateList.put(name, 0);
            HMSLogger.INSTANCE.m71139i(TAG, "adding plugin " + plugin.getName());
            this.analytics.added(name, this.inputFrameRate, null);
        }
        HMSLogger hMSLogger = HMSLogger.INSTANCE;
        hMSLogger.m71139i(TAG, "numFrames to skip processing " + iCeil);
        this.pluginNumFramesToSkip.put(name, Integer.valueOf(iCeil));
        this.pluginNumFramesSkipped.put(name, Integer.valueOf(iCeil));
        this.pluginsAvgProcessingTime.put(name, Double.valueOf(0.0d));
        this.pluginsProcessingTimeExceedsSafeLimitCount.put(name, 0L);
        if (!plugin.isSupported()) {
            HMSException hMSExceptionPlatformNotSupported = ErrorFactory.MediaPluginErrors.INSTANCE.PlatformNotSupported(HMSAction.VIDEO_PLUGINS, "platform not supported");
            this.analytics.failure(name, hMSExceptionPlatformNotSupported);
            hMSLogger.m71139i(TAG, "Platform/Resolution is not supported for plugin - " + plugin.getName());
            throw hMSExceptionPlatformNotSupported;
        }
        try {
            C22365e c22365e = AbstractC3050q0.f12077a;
            hMSVideoPluginsManager = this;
            hMSVideoPlugin = plugin;
            try {
                AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(ExecutorC22364d.f87316w), null, null, hMSVideoPluginsManager.new C241861(hMSVideoPlugin, resultListener, name, null), 3);
            } catch (HMSException e5) {
                e = e5;
                HMSException hMSException = e;
                HMSLogger.INSTANCE.m71138e(TAG, "failed to add plugin", hMSException);
                hMSVideoPluginsManager.analytics.failure(name, hMSException);
                removePlugin(hMSVideoPlugin);
                throw hMSException;
            }
        } catch (HMSException e13) {
            e = e13;
            hMSVideoPluginsManager = this;
            hMSVideoPlugin = plugin;
        }
    }

    private final boolean checkIfSkipRequired(String name) {
        Integer num = this.pluginNumFramesSkipped.get(name);
        AbstractC22676k.m65747g(num);
        int iIntValue = num.intValue();
        Integer num2 = this.pluginNumFramesToSkip.get(name);
        AbstractC22676k.m65747g(num2);
        if (iIntValue >= num2.intValue()) {
            this.pluginNumFramesSkipped.put(name, 0);
            return false;
        }
        ConcurrentHashMap<String, Integer> concurrentHashMap = this.pluginNumFramesSkipped;
        Integer num3 = concurrentHashMap.get(name);
        AbstractC22676k.m65747g(num3);
        concurrentHashMap.put(name, Integer.valueOf(num3.intValue() + 1));
        return true;
    }

    private final void processFramesThroughPlugins(VideoFrame frame) throws HMSException {
        Iterator<String> it = this.plugins.iterator();
        AbstractC22676k.m65749i(it, "iterator(...)");
        while (it.hasNext()) {
            String next = it.next();
            HMSVideoPlugin hMSVideoPlugin = this.pluginsMap.get(next);
            if (hMSVideoPlugin != null) {
                try {
                    if (hMSVideoPlugin.getPluginType() == HMSVideoPluginType.TRANSFORM) {
                        AbstractC22676k.m65747g(frame);
                        hMSVideoPlugin.processVideoFrame(frame, this.pluginResultListener, Boolean.FALSE);
                    } else if (hMSVideoPlugin.getPluginType() == HMSVideoPluginType.ANALYZE) {
                        C23045q c23045q = new C23045q(19, hMSVideoPlugin, frame);
                        HMSVideoPluginAnalytics hMSVideoPluginAnalytics = this.analytics;
                        AbstractC22676k.m65747g(next);
                        hMSVideoPluginAnalytics.processWithTime(next, c23045q);
                        VideoSink videoSink = this.localSink;
                        if (videoSink != null) {
                            videoSink.onFrame(frame);
                        }
                    }
                } catch (HMSException e5) {
                    HMSLogger.INSTANCE.m71138e(TAG, "error in processing plugin " + next, e5);
                    ErrorFactory.MediaPluginErrors.INSTANCE.ProcessingFailed(HMSAction.VIDEO_PLUGINS, "Failed during processing of plugin" + e5.getMessage());
                    HMSLogger.m71137e(HMSVideoPluginAnalytics.TAG, e5.toString());
                    HMSVideoPluginAnalytics hMSVideoPluginAnalytics2 = this.analytics;
                    AbstractC22676k.m65747g(next);
                    hMSVideoPluginAnalytics2.failure(next, e5);
                    removePlugin(hMSVideoPlugin);
                    throw e5;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 processFramesThroughPlugins$lambda$0(HMSVideoPlugin plugin, VideoFrame videoFrame) {
        AbstractC22676k.m65750j(plugin, "$plugin");
        AbstractC22676k.m65747g(videoFrame);
        plugin.processVideoFrame(videoFrame, null, Boolean.FALSE);
        return C23454a0.f92919a;
    }

    private final void removePluginEntry(String name) {
        this.plugins.remove(name);
        this.pluginsMap.remove(name);
        this.pluginNumFramesToSkip.remove(name);
        this.pluginNumFramesSkipped.remove(name);
        this.pluginsAvgProcessingTime.remove(name);
        this.pluginsProcessingTimeExceedsSafeLimitCount.remove(name);
        this.pluginsFrameRateList.remove(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVideoProcessor() {
        this.source.setVideoProcessor(new VideoProcessor() { // from class: live.hms.video.plugin.video.HMSVideoPluginsManager.setVideoProcessor.1
            @Override // hms.webrtc.CapturerObserver
            public void onCapturerStarted(boolean p13) {
            }

            @Override // hms.webrtc.CapturerObserver
            public void onCapturerStopped() {
            }

            @Override // hms.webrtc.CapturerObserver
            public void onFrameCaptured(VideoFrame frame) throws HMSException {
                if (HMSVideoPluginsManager.this.plugins.size() > 0) {
                    HMSVideoPluginsManager.this.pluginsProcessing(frame);
                    return;
                }
                VideoSink videoSink = HMSVideoPluginsManager.this.localSink;
                if (videoSink != null) {
                    videoSink.onFrame(frame);
                }
            }

            @Override // hms.webrtc.VideoProcessor
            public void setSink(VideoSink sink) {
                HMSVideoPluginsManager.this.localSink = sink;
                HMSLogger.m71136d(HMSVideoPluginsManager.TAG, "set local sink");
            }
        });
    }

    public final void addPlugin(HMSVideoPlugin plugin, HMSActionResultListener resultListener, int pluginFrameRate) {
        AbstractC22676k.m65750j(plugin, "plugin");
        AbstractC22676k.m65750j(resultListener, "resultListener");
        if (this.pluginAddInProgress) {
            String name = plugin.getName();
            if (name.length() == 0) {
                HMSLogger.INSTANCE.m71141w(TAG, "no name provided by the plugin");
                return;
            } else {
                this.analytics.failure(name, ErrorFactory.MediaPluginErrors.INSTANCE.AddAlreadyInProgress(HMSAction.VIDEO_PLUGINS, "Add Plugin is already in Progress"));
                HMSLogger.INSTANCE.m71141w(TAG, "can't add another plugin when previous add is in progress");
            }
        }
        this.pluginAddInProgress = true;
        try {
            try {
                addPluginInternal(plugin, resultListener, pluginFrameRate);
                this.pluginAddInProgress = false;
            } catch (HMSException e5) {
                throw e5;
            }
        } catch (Throwable th3) {
            this.pluginAddInProgress = false;
            throw th3;
        }
    }

    public final void checkIfPluginFpsChangeNeeded(String name, long timeTakenWithML) {
        AbstractC22676k.m65750j(name, "name");
        if (timeTakenWithML > 0) {
            if (AbstractC22676k.m65741a(this.pluginsAvgProcessingTime.get(name), 0.0d)) {
                this.pluginsAvgProcessingTime.put(name, Double.valueOf(timeTakenWithML));
                return;
            }
            if (this.pluginsFrameRateList.containsKey(name)) {
                C18284j c18284j = new C18284j(11, 15, 1);
                Integer num = this.pluginsFrameRateList.get(name);
                if (num == null || !c18284j.m52655e(num.intValue())) {
                    return;
                }
                Double d3 = this.pluginsAvgProcessingTime.get(name);
                AbstractC22676k.m65747g(d3);
                double dDoubleValue = (d3.doubleValue() + timeTakenWithML) / 2.0d;
                this.pluginsAvgProcessingTime.put(name, Double.valueOf(dDoubleValue));
                if (dDoubleValue <= 100.0d || !this.pluginsProcessingTimeExceedsSafeLimitCount.containsKey(name)) {
                    this.pluginsProcessingTimeExceedsSafeLimitCount.put(name, 0L);
                    return;
                }
                ConcurrentHashMap<String, Long> concurrentHashMap = this.pluginsProcessingTimeExceedsSafeLimitCount;
                Long l7 = concurrentHashMap.get(name);
                AbstractC22676k.m65747g(l7);
                concurrentHashMap.put(name, Long.valueOf(l7.longValue() + 1));
                Long l12 = this.pluginsProcessingTimeExceedsSafeLimitCount.get(name);
                AbstractC22676k.m65747g(l12);
                if (l12.longValue() > 30) {
                    HMSLogger.INSTANCE.m71139i(TAG, "Reducing the plugin Frame Rate to 10");
                    this.pluginsFrameRateList.put(name, 10);
                    double d14 = this.inputFrameRate;
                    Integer num2 = this.pluginsFrameRateList.get(name);
                    AbstractC22676k.m65747g(num2);
                    int iCeil = (int) Math.ceil((d14 / num2.doubleValue()) - ((double) 1));
                    this.pluginNumFramesToSkip.put(name, Integer.valueOf(iCeil));
                    this.pluginNumFramesSkipped.put(name, Integer.valueOf(iCeil));
                }
            }
        }
    }

    public final void clean() {
        for (Map.Entry<String, HMSVideoPlugin> entry : this.pluginsMap.entrySet()) {
            String key = entry.getKey();
            removePlugin(entry.getValue());
            this.analytics.clean(key);
        }
        this.pluginsMap.clear();
        this.pluginNumFramesSkipped.clear();
        this.pluginNumFramesToSkip.clear();
        this.plugins.clear();
        this.pluginsObjectList.clear();
        this.pluginsAvgProcessingTime.clear();
        this.pluginsProcessingTimeExceedsSafeLimitCount.clear();
        this.pluginsFrameRateList.clear();
        this.setProcessor = false;
        this.source.setVideoProcessor(null);
    }

    public final CopyOnWriteArrayList<HMSVideoPlugin> getPlugins() {
        return this.pluginsObjectList;
    }

    public final VideoSource getSource() {
        return this.source;
    }

    public final void pluginsProcessing(VideoFrame frame) throws HMSException {
        try {
            processFramesThroughPlugins(frame);
        } catch (HMSException e5) {
            HMSLogger.INSTANCE.m71138e(TAG, "error in plugins loop", e5);
            throw e5;
        }
    }

    public final void removePlugin(HMSVideoPlugin plugin) {
        AbstractC22676k.m65750j(plugin, "plugin");
        try {
            String name = plugin.getName();
            if (!this.pluginsMap.containsKey(name)) {
                HMSLogger.INSTANCE.m71141w(TAG, "plugin - " + name + " not found to remove.");
                return;
            }
            HMSLogger hMSLogger = HMSLogger.INSTANCE;
            hMSLogger.m71139i(TAG, "removing plugin " + name);
            this.pluginsObjectList.remove(plugin);
            removePluginEntry(name);
            if (this.plugins.size() == 0) {
                hMSLogger.m71139i(TAG, "No plugins left, stopping processing");
            }
            plugin.stop();
            this.analytics.removed(name);
        } catch (Throwable th3) {
            AbstractC34132o.m107888l(th3);
        }
    }

    public final void setInputFps(int inputFps) {
        this.inputFrameRate = inputFps;
    }

    public final void setSource(VideoSource videoSource) {
        AbstractC22676k.m65750j(videoSource, "<set-?>");
        this.source = videoSource;
    }

    public final void updateCameraSource(VideoSource localCameraVideoSource) {
        AbstractC22676k.m65750j(localCameraVideoSource, "localCameraVideoSource");
        this.source = localCameraVideoSource;
        setVideoProcessor();
    }
}
