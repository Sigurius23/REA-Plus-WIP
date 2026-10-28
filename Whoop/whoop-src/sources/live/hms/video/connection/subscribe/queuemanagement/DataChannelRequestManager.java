package live.hms.video.connection.subscribe.queuemanagement;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.AbstractC3028k2;
import bc3.C3058t;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3055s;
import c93.InterfaceC4351m;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import kotlinx.coroutines.TimeoutCancellationException;
import l83.C23454a0;
import live.hms.video.connection.HMSDataChannel;
import live.hms.video.error.ErrorFactory;
import live.hms.video.error.HMSException;
import live.hms.video.media.streams.models.HMSDataChannelRequestParams;
import live.hms.video.media.streams.models.PreferStateResponse;
import live.hms.video.media.streams.models.PreferStateResponseError;
import live.hms.video.utils.ExtensionUtilsKt;
import live.hms.video.utils.GsonUtils;
import live.hms.video.utils.HMSLogger;
import mc3.C25437c;
import mc3.InterfaceC25435a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u000e\u0010\rJ(\u0010\u0013\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u000f\u0018\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u0086H¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019R\u001f\u0010\u001c\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R<\u0010(\u001a*\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150&0%j\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150&`'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, m65681d2 = {"Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;", "", "<init>", "()V", "Llive/hms/video/connection/HMSDataChannel;", "api", "Ll83/a0;", "updateDataChannel", "(Llive/hms/video/connection/HMSDataChannel;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/media/streams/models/HMSDataChannelRequestParams;", "trackedDataMessage", "Llive/hms/video/media/streams/models/PreferStateResponse;", "preferVideo", "(Llive/hms/video/media/streams/models/HMSDataChannelRequestParams;Lq83/d;)Ljava/lang/Object;", "preferAudio", "T", "Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestMethod;", "requestId", "request", NotificationCompat.CATEGORY_CALL, "(Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestMethod;Llive/hms/video/media/streams/models/HMSDataChannelRequestParams;Lq83/d;)Ljava/lang/Object;", "Lcom/google/gson/JsonObject;", "message", "", "onResponse", "(Lcom/google/gson/JsonObject;Lq83/d;)Ljava/lang/Object;", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "dataChannel", "Llive/hms/video/connection/HMSDataChannel;", "Lmc3/a;", "waitForDataChannel", "Lmc3/a;", "Ljava/util/HashMap;", "Lbc3/s;", "Lkotlin/collections/HashMap;", "promiseMap", "Ljava/util/HashMap;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class DataChannelRequestManager {
    private HMSDataChannel dataChannel;
    private final String TAG = "DataChannelRequestManager";
    private final InterfaceC25435a waitForDataChannel = new C25437c(true);
    private final HashMap<String, InterfaceC3055s> promiseMap = new HashMap<>();

    /* JADX INFO: renamed from: live.hms.video.connection.subscribe.queuemanagement.DataChannelRequestManager$call$3 */
    @InterfaceC32271e(m100429c = "live.hms.video.connection.subscribe.queuemanagement.DataChannelRequestManager$call$3", m100430f = "DataChannelRequestManager.kt", m100431l = {67}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\n"}, m65681d2 = {"T", "Lbc3/c0;", "kotlin.jvm.PlatformType", "<anonymous>"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241233 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ InterfaceC3055s $deferredResponse;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241233(InterfaceC3055s interfaceC3055s, InterfaceC30057d<? super C241233> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$deferredResponse = interfaceC3055s;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            AbstractC22676k.m65756p();
            throw null;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super T> interfaceC30057d) {
            return ((C241233) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws HMSException {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC3055s interfaceC3055s = this.$deferredResponse;
                this.label = 1;
                obj = ((C3058t) interfaceC3055s).m8817m(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            JsonObject jsonObject = (JsonObject) obj;
            if (jsonObject.has("result")) {
                GsonUtils.INSTANCE.getGson();
                AbstractC22676k.m65756p();
                throw null;
            }
            if (!jsonObject.has("error")) {
                throw ErrorFactory.TracksErrors.PreferLayerFailedUnknownError$default(ErrorFactory.TracksErrors.INSTANCE, null, 1, null);
            }
            PreferStateResponseError preferStateResponseError = (PreferStateResponseError) GsonUtils.INSTANCE.getGson().fromJson((JsonElement) jsonObject, PreferStateResponseError.class);
            ErrorFactory.TracksErrors tracksErrors = ErrorFactory.TracksErrors.INSTANCE;
            AbstractC22676k.m65747g(preferStateResponseError);
            throw ErrorFactory.TracksErrors.PreferLayerFailed$default(tracksErrors, preferStateResponseError, null, 2, null);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.connection.subscribe.queuemanagement.DataChannelRequestManager$preferAudio$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.connection.subscribe.queuemanagement.DataChannelRequestManager", m100430f = "DataChannelRequestManager.kt", m100431l = {138, 141, 144}, m100432m = "preferAudio")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C241241 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C241241(InterfaceC30057d<? super C241241> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DataChannelRequestManager.this.preferAudio(null, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.connection.subscribe.queuemanagement.DataChannelRequestManager$preferVideo$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.connection.subscribe.queuemanagement.DataChannelRequestManager", m100430f = "DataChannelRequestManager.kt", m100431l = {138, 141, 144}, m100432m = "preferVideo")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C241251 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C241251(InterfaceC30057d<? super C241251> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DataChannelRequestManager.this.preferVideo(null, this);
        }
    }

    public final <T> Object call(DataChannelRequestMethod dataChannelRequestMethod, HMSDataChannelRequestParams hMSDataChannelRequestParams, InterfaceC30057d<? super T> interfaceC30057d) {
        C3058t c3058tM8707a = AbstractC3006f0.m8707a();
        RpcRequestWrapper rpcRequestWrapper = new RpcRequestWrapper(dataChannelRequestMethod.getMethod(), hMSDataChannelRequestParams, null, null, 12, null);
        String tag = getTAG();
        AbstractC22676k.m65749i(tag, "<get-TAG>(...)");
        HMSLogger.m71136d(tag, "Sending prefer-layer request " + hMSDataChannelRequestParams);
        this.promiseMap.put(rpcRequestWrapper.getId(), c3058tM8707a);
        InterfaceC25435a interfaceC25435a = this.waitForDataChannel;
        interfaceC25435a.mo68211b(interfaceC30057d);
        try {
            HMSDataChannel hMSDataChannel = this.dataChannel;
            if (hMSDataChannel != null) {
            }
            interfaceC25435a.mo68214i(null);
            try {
                try {
                    try {
                        AbstractC22676k.m65756p();
                        throw null;
                    } catch (Exception unused) {
                        throw ErrorFactory.TracksErrors.PreferLayerFailedUnknownError$default(ErrorFactory.TracksErrors.INSTANCE, null, 1, null);
                    }
                } catch (TimeoutCancellationException unused2) {
                    throw ErrorFactory.TracksErrors.PreferLayerTimeoutError$default(ErrorFactory.TracksErrors.INSTANCE, null, 1, null);
                }
            } catch (Throwable th3) {
                this.promiseMap.remove(rpcRequestWrapper.getId());
                throw th3;
            }
        } catch (Throwable th4) {
            interfaceC25435a.mo68214i(null);
            throw th4;
        }
    }

    public final String getTAG() {
        return this.TAG;
    }

    public final Object onResponse(JsonObject jsonObject, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        boolean z4;
        if (jsonObject.has("id")) {
            String asString = jsonObject.get("id").getAsString();
            InterfaceC3055s interfaceC3055s = this.promiseMap.get(asString);
            if (interfaceC3055s != null) {
                ((C3058t) interfaceC3055s).m8807L(jsonObject);
                this.promiseMap.remove(asString);
                z4 = true;
            } else {
                String TAG = this.TAG;
                AbstractC22676k.m65749i(TAG, "TAG");
                HMSLogger.m71137e(TAG, " No defferred found for message with id : " + asString);
                z4 = false;
            }
        } else {
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x010a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, mc3.a] */
    /* JADX WARN: Type inference failed for: r0v9, types: [live.hms.video.connection.HMSDataChannel] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [live.hms.video.connection.subscribe.queuemanagement.DataChannelRequestManager$preferAudio$1, q83.d] */
    /* JADX WARN: Type inference failed for: r2v3, types: [live.hms.video.connection.subscribe.queuemanagement.DataChannelRequestManager] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, r83.a] */
    /* JADX WARN: Type inference failed for: r3v1, types: [live.hms.video.connection.subscribe.queuemanagement.RpcRequestWrapper] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [mc3.a] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [mc3.a] */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final Object preferAudio(HMSDataChannelRequestParams hMSDataChannelRequestParams, InterfaceC30057d<? super PreferStateResponse> interfaceC30057d) throws Throwable {
        ?? c241241;
        RpcRequestWrapper rpcRequestWrapper;
        DataChannelRequestManager dataChannelRequestManager;
        InterfaceC3055s interfaceC3055s;
        ?? r10;
        RpcRequestWrapper rpcRequestWrapper2;
        InterfaceC3055s interfaceC3055s2;
        DataChannelRequestManager dataChannelRequestManager2;
        ?? r14;
        RpcRequestWrapper rpcRequestWrapper3;
        DataChannelRequestManager dataChannelRequestManager3;
        if (interfaceC30057d instanceof C241241) {
            C241241 c241242 = (C241241) interfaceC30057d;
            int i13 = c241242.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c241242.label = i13 - Integer.MIN_VALUE;
                c241241 = c241242;
            } else {
                c241241 = new C241241(interfaceC30057d);
            }
        } else {
            c241241 = new C241241(interfaceC30057d);
        }
        Object objSend = c241241.result;
        ?? r15 = EnumC31071a.f128113w;
        ?? r16 = c241241.label;
        try {
            try {
                if (r16 == 0) {
                    AbstractC34132o.m107864I(objSend);
                    DataChannelRequestMethod dataChannelRequestMethod = DataChannelRequestMethod.PREFER_AUDIO_TRACK_STATE;
                    C3058t c3058tM8707a = AbstractC3006f0.m8707a();
                    rpcRequestWrapper = new RpcRequestWrapper(dataChannelRequestMethod.getMethod(), hMSDataChannelRequestParams, null, null, 12, null);
                    String tag = getTAG();
                    AbstractC22676k.m65749i(tag, "<get-TAG>(...)");
                    HMSLogger.m71136d(tag, "Sending prefer-layer request " + hMSDataChannelRequestParams);
                    this.promiseMap.put(rpcRequestWrapper.getId(), c3058tM8707a);
                    ?? r17 = this.waitForDataChannel;
                    c241241.L$0 = this;
                    c241241.L$1 = c3058tM8707a;
                    c241241.L$2 = rpcRequestWrapper;
                    c241241.L$3 = r17;
                    c241241.label = 1;
                    if (r17.mo68211b(c241241) != r15) {
                        dataChannelRequestManager = this;
                        interfaceC3055s = c3058tM8707a;
                        r10 = r17;
                    }
                    return r15;
                }
                if (r16 != 1) {
                    if (r16 != 2) {
                        if (r16 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        rpcRequestWrapper3 = (RpcRequestWrapper) c241241.L$1;
                        dataChannelRequestManager3 = (DataChannelRequestManager) c241241.L$0;
                        try {
                            AbstractC34132o.m107864I(objSend);
                            dataChannelRequestManager3.promiseMap.remove(rpcRequestWrapper3.getId());
                            return objSend;
                        } catch (TimeoutCancellationException unused) {
                            throw ErrorFactory.TracksErrors.PreferLayerTimeoutError$default(ErrorFactory.TracksErrors.INSTANCE, null, 1, null);
                        } catch (Exception unused2) {
                            throw ErrorFactory.TracksErrors.PreferLayerFailedUnknownError$default(ErrorFactory.TracksErrors.INSTANCE, null, 1, null);
                        }
                    }
                    InterfaceC25435a interfaceC25435a = (InterfaceC25435a) c241241.L$3;
                    rpcRequestWrapper2 = (RpcRequestWrapper) c241241.L$2;
                    interfaceC3055s2 = (InterfaceC3055s) c241241.L$1;
                    dataChannelRequestManager2 = (DataChannelRequestManager) c241241.L$0;
                    AbstractC34132o.m107864I(objSend);
                    r16 = interfaceC25435a;
                    r14 = r16;
                    r14.mo68214i(null);
                    try {
                        DataChannelRequestManager$preferAudio$$inlined$call$1 dataChannelRequestManager$preferAudio$$inlined$call$1 = new DataChannelRequestManager$preferAudio$$inlined$call$1(interfaceC3055s2, null);
                        c241241.L$0 = dataChannelRequestManager2;
                        c241241.L$1 = rpcRequestWrapper2;
                        c241241.L$2 = null;
                        c241241.L$3 = null;
                        c241241.label = 3;
                        objSend = AbstractC3028k2.m8748b(60000L, dataChannelRequestManager$preferAudio$$inlined$call$1, c241241);
                        if (objSend != r15) {
                            rpcRequestWrapper3 = rpcRequestWrapper2;
                            dataChannelRequestManager3 = dataChannelRequestManager2;
                            dataChannelRequestManager3.promiseMap.remove(rpcRequestWrapper3.getId());
                            return objSend;
                        }
                        return r15;
                    } catch (TimeoutCancellationException unused3) {
                        throw ErrorFactory.TracksErrors.PreferLayerTimeoutError$default(ErrorFactory.TracksErrors.INSTANCE, null, 1, null);
                    } catch (Exception unused4) {
                        throw ErrorFactory.TracksErrors.PreferLayerFailedUnknownError$default(ErrorFactory.TracksErrors.INSTANCE, null, 1, null);
                    } catch (Throwable th3) {
                        th = th3;
                        r15 = rpcRequestWrapper2;
                        c241241 = dataChannelRequestManager2;
                        c241241.promiseMap.remove(r15.getId());
                        throw th;
                    }
                }
                InterfaceC25435a interfaceC25435a2 = (InterfaceC25435a) c241241.L$3;
                rpcRequestWrapper = (RpcRequestWrapper) c241241.L$2;
                interfaceC3055s = (InterfaceC3055s) c241241.L$1;
                dataChannelRequestManager = (DataChannelRequestManager) c241241.L$0;
                AbstractC34132o.m107864I(objSend);
                r10 = interfaceC25435a2;
                ?? r18 = dataChannelRequestManager.dataChannel;
                if (r18 != 0) {
                    String json = ExtensionUtilsKt.toJson(rpcRequestWrapper);
                    c241241.L$0 = dataChannelRequestManager;
                    c241241.L$1 = interfaceC3055s;
                    c241241.L$2 = rpcRequestWrapper;
                    c241241.L$3 = r10;
                    c241241.label = 2;
                    objSend = r18.send(json, c241241);
                    if (objSend != r15) {
                        rpcRequestWrapper2 = rpcRequestWrapper;
                        interfaceC3055s2 = interfaceC3055s;
                        dataChannelRequestManager2 = dataChannelRequestManager;
                        r16 = r10;
                        r14 = r16;
                        r14.mo68214i(null);
                        DataChannelRequestManager$preferAudio$$inlined$call$1 dataChannelRequestManager$preferAudio$$inlined$call$2 = new DataChannelRequestManager$preferAudio$$inlined$call$1(interfaceC3055s2, null);
                        c241241.L$0 = dataChannelRequestManager2;
                        c241241.L$1 = rpcRequestWrapper2;
                        c241241.L$2 = null;
                        c241241.L$3 = null;
                        c241241.label = 3;
                        objSend = AbstractC3028k2.m8748b(60000L, dataChannelRequestManager$preferAudio$$inlined$call$2, c241241);
                        if (objSend != r15) {
                            rpcRequestWrapper3 = rpcRequestWrapper2;
                            dataChannelRequestManager3 = dataChannelRequestManager2;
                            dataChannelRequestManager3.promiseMap.remove(rpcRequestWrapper3.getId());
                            return objSend;
                        }
                    }
                } else {
                    rpcRequestWrapper2 = rpcRequestWrapper;
                    interfaceC3055s2 = interfaceC3055s;
                    dataChannelRequestManager2 = dataChannelRequestManager;
                    r14 = r10;
                    r14.mo68214i(null);
                    DataChannelRequestManager$preferAudio$$inlined$call$1 dataChannelRequestManager$preferAudio$$inlined$call$3 = new DataChannelRequestManager$preferAudio$$inlined$call$1(interfaceC3055s2, null);
                    c241241.L$0 = dataChannelRequestManager2;
                    c241241.L$1 = rpcRequestWrapper2;
                    c241241.L$2 = null;
                    c241241.L$3 = null;
                    c241241.label = 3;
                    objSend = AbstractC3028k2.m8748b(60000L, dataChannelRequestManager$preferAudio$$inlined$call$3, c241241);
                    if (objSend != r15) {
                        rpcRequestWrapper3 = rpcRequestWrapper2;
                        dataChannelRequestManager3 = dataChannelRequestManager2;
                        dataChannelRequestManager3.promiseMap.remove(rpcRequestWrapper3.getId());
                        return objSend;
                    }
                }
                return r15;
            } catch (Throwable th4) {
                r16.mo68214i(null);
                throw th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x010a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, mc3.a] */
    /* JADX WARN: Type inference failed for: r0v9, types: [live.hms.video.connection.HMSDataChannel] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [live.hms.video.connection.subscribe.queuemanagement.DataChannelRequestManager$preferVideo$1, q83.d] */
    /* JADX WARN: Type inference failed for: r2v3, types: [live.hms.video.connection.subscribe.queuemanagement.DataChannelRequestManager] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, r83.a] */
    /* JADX WARN: Type inference failed for: r3v1, types: [live.hms.video.connection.subscribe.queuemanagement.RpcRequestWrapper] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [mc3.a] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [mc3.a] */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final Object preferVideo(HMSDataChannelRequestParams hMSDataChannelRequestParams, InterfaceC30057d<? super PreferStateResponse> interfaceC30057d) throws Throwable {
        ?? c241251;
        RpcRequestWrapper rpcRequestWrapper;
        DataChannelRequestManager dataChannelRequestManager;
        InterfaceC3055s interfaceC3055s;
        ?? r10;
        RpcRequestWrapper rpcRequestWrapper2;
        InterfaceC3055s interfaceC3055s2;
        DataChannelRequestManager dataChannelRequestManager2;
        ?? r14;
        RpcRequestWrapper rpcRequestWrapper3;
        DataChannelRequestManager dataChannelRequestManager3;
        if (interfaceC30057d instanceof C241251) {
            C241251 c241252 = (C241251) interfaceC30057d;
            int i13 = c241252.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c241252.label = i13 - Integer.MIN_VALUE;
                c241251 = c241252;
            } else {
                c241251 = new C241251(interfaceC30057d);
            }
        } else {
            c241251 = new C241251(interfaceC30057d);
        }
        Object objSend = c241251.result;
        ?? r15 = EnumC31071a.f128113w;
        ?? r16 = c241251.label;
        try {
            try {
                if (r16 == 0) {
                    AbstractC34132o.m107864I(objSend);
                    DataChannelRequestMethod dataChannelRequestMethod = DataChannelRequestMethod.PREFER_VIDEO_TRACK_STATE;
                    C3058t c3058tM8707a = AbstractC3006f0.m8707a();
                    rpcRequestWrapper = new RpcRequestWrapper(dataChannelRequestMethod.getMethod(), hMSDataChannelRequestParams, null, null, 12, null);
                    String tag = getTAG();
                    AbstractC22676k.m65749i(tag, "<get-TAG>(...)");
                    HMSLogger.m71136d(tag, "Sending prefer-layer request " + hMSDataChannelRequestParams);
                    this.promiseMap.put(rpcRequestWrapper.getId(), c3058tM8707a);
                    ?? r17 = this.waitForDataChannel;
                    c241251.L$0 = this;
                    c241251.L$1 = c3058tM8707a;
                    c241251.L$2 = rpcRequestWrapper;
                    c241251.L$3 = r17;
                    c241251.label = 1;
                    if (r17.mo68211b(c241251) != r15) {
                        dataChannelRequestManager = this;
                        interfaceC3055s = c3058tM8707a;
                        r10 = r17;
                    }
                    return r15;
                }
                if (r16 != 1) {
                    if (r16 != 2) {
                        if (r16 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        rpcRequestWrapper3 = (RpcRequestWrapper) c241251.L$1;
                        dataChannelRequestManager3 = (DataChannelRequestManager) c241251.L$0;
                        try {
                            AbstractC34132o.m107864I(objSend);
                            dataChannelRequestManager3.promiseMap.remove(rpcRequestWrapper3.getId());
                            return objSend;
                        } catch (TimeoutCancellationException unused) {
                            throw ErrorFactory.TracksErrors.PreferLayerTimeoutError$default(ErrorFactory.TracksErrors.INSTANCE, null, 1, null);
                        } catch (Exception unused2) {
                            throw ErrorFactory.TracksErrors.PreferLayerFailedUnknownError$default(ErrorFactory.TracksErrors.INSTANCE, null, 1, null);
                        }
                    }
                    InterfaceC25435a interfaceC25435a = (InterfaceC25435a) c241251.L$3;
                    rpcRequestWrapper2 = (RpcRequestWrapper) c241251.L$2;
                    interfaceC3055s2 = (InterfaceC3055s) c241251.L$1;
                    dataChannelRequestManager2 = (DataChannelRequestManager) c241251.L$0;
                    AbstractC34132o.m107864I(objSend);
                    r16 = interfaceC25435a;
                    r14 = r16;
                    r14.mo68214i(null);
                    try {
                        DataChannelRequestManager$preferVideo$$inlined$call$1 dataChannelRequestManager$preferVideo$$inlined$call$1 = new DataChannelRequestManager$preferVideo$$inlined$call$1(interfaceC3055s2, null);
                        c241251.L$0 = dataChannelRequestManager2;
                        c241251.L$1 = rpcRequestWrapper2;
                        c241251.L$2 = null;
                        c241251.L$3 = null;
                        c241251.label = 3;
                        objSend = AbstractC3028k2.m8748b(60000L, dataChannelRequestManager$preferVideo$$inlined$call$1, c241251);
                        if (objSend != r15) {
                            rpcRequestWrapper3 = rpcRequestWrapper2;
                            dataChannelRequestManager3 = dataChannelRequestManager2;
                            dataChannelRequestManager3.promiseMap.remove(rpcRequestWrapper3.getId());
                            return objSend;
                        }
                        return r15;
                    } catch (TimeoutCancellationException unused3) {
                        throw ErrorFactory.TracksErrors.PreferLayerTimeoutError$default(ErrorFactory.TracksErrors.INSTANCE, null, 1, null);
                    } catch (Exception unused4) {
                        throw ErrorFactory.TracksErrors.PreferLayerFailedUnknownError$default(ErrorFactory.TracksErrors.INSTANCE, null, 1, null);
                    } catch (Throwable th3) {
                        th = th3;
                        r15 = rpcRequestWrapper2;
                        c241251 = dataChannelRequestManager2;
                        c241251.promiseMap.remove(r15.getId());
                        throw th;
                    }
                }
                InterfaceC25435a interfaceC25435a2 = (InterfaceC25435a) c241251.L$3;
                rpcRequestWrapper = (RpcRequestWrapper) c241251.L$2;
                interfaceC3055s = (InterfaceC3055s) c241251.L$1;
                dataChannelRequestManager = (DataChannelRequestManager) c241251.L$0;
                AbstractC34132o.m107864I(objSend);
                r10 = interfaceC25435a2;
                ?? r18 = dataChannelRequestManager.dataChannel;
                if (r18 != 0) {
                    String json = ExtensionUtilsKt.toJson(rpcRequestWrapper);
                    c241251.L$0 = dataChannelRequestManager;
                    c241251.L$1 = interfaceC3055s;
                    c241251.L$2 = rpcRequestWrapper;
                    c241251.L$3 = r10;
                    c241251.label = 2;
                    objSend = r18.send(json, c241251);
                    if (objSend != r15) {
                        rpcRequestWrapper2 = rpcRequestWrapper;
                        interfaceC3055s2 = interfaceC3055s;
                        dataChannelRequestManager2 = dataChannelRequestManager;
                        r16 = r10;
                        r14 = r16;
                        r14.mo68214i(null);
                        DataChannelRequestManager$preferVideo$$inlined$call$1 dataChannelRequestManager$preferVideo$$inlined$call$2 = new DataChannelRequestManager$preferVideo$$inlined$call$1(interfaceC3055s2, null);
                        c241251.L$0 = dataChannelRequestManager2;
                        c241251.L$1 = rpcRequestWrapper2;
                        c241251.L$2 = null;
                        c241251.L$3 = null;
                        c241251.label = 3;
                        objSend = AbstractC3028k2.m8748b(60000L, dataChannelRequestManager$preferVideo$$inlined$call$2, c241251);
                        if (objSend != r15) {
                            rpcRequestWrapper3 = rpcRequestWrapper2;
                            dataChannelRequestManager3 = dataChannelRequestManager2;
                            dataChannelRequestManager3.promiseMap.remove(rpcRequestWrapper3.getId());
                            return objSend;
                        }
                    }
                } else {
                    rpcRequestWrapper2 = rpcRequestWrapper;
                    interfaceC3055s2 = interfaceC3055s;
                    dataChannelRequestManager2 = dataChannelRequestManager;
                    r14 = r10;
                    r14.mo68214i(null);
                    DataChannelRequestManager$preferVideo$$inlined$call$1 dataChannelRequestManager$preferVideo$$inlined$call$3 = new DataChannelRequestManager$preferVideo$$inlined$call$1(interfaceC3055s2, null);
                    c241251.L$0 = dataChannelRequestManager2;
                    c241251.L$1 = rpcRequestWrapper2;
                    c241251.L$2 = null;
                    c241251.L$3 = null;
                    c241251.label = 3;
                    objSend = AbstractC3028k2.m8748b(60000L, dataChannelRequestManager$preferVideo$$inlined$call$3, c241251);
                    if (objSend != r15) {
                        rpcRequestWrapper3 = rpcRequestWrapper2;
                        dataChannelRequestManager3 = dataChannelRequestManager2;
                        dataChannelRequestManager3.promiseMap.remove(rpcRequestWrapper3.getId());
                        return objSend;
                    }
                }
                return r15;
            } catch (Throwable th4) {
                r16.mo68214i(null);
                throw th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final Object updateDataChannel(HMSDataChannel hMSDataChannel, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        if (this.waitForDataChannel.mo68213h()) {
            this.waitForDataChannel.mo68214i(null);
        }
        this.dataChannel = hMSDataChannel;
        return C23454a0.f92919a;
    }
}
