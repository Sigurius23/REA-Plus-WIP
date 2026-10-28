package live.hms.video.connection.subscribe.queuemanagement;

import bc3.C3058t;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3055s;
import c93.InterfaceC4351m;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import l83.C23454a0;
import live.hms.video.error.ErrorFactory;
import live.hms.video.error.HMSException;
import live.hms.video.media.streams.models.PreferStateResponse;
import live.hms.video.media.streams.models.PreferStateResponseError;
import live.hms.video.utils.GsonUtils;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "live.hms.video.connection.subscribe.queuemanagement.DataChannelRequestManager$call$3", m100430f = "DataChannelRequestManager.kt", m100431l = {67}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\n¨\u0006\u0003"}, m65681d2 = {"T", "Lbc3/c0;", "kotlin.jvm.PlatformType", "live/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager$call$3", "<anonymous>"}, m65682k = 3, m65683mv = {2, 0, 0})
public final class DataChannelRequestManager$preferAudio$$inlined$call$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ InterfaceC3055s $deferredResponse;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataChannelRequestManager$preferAudio$$inlined$call$1(InterfaceC3055s interfaceC3055s, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.$deferredResponse = interfaceC3055s;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new DataChannelRequestManager$preferAudio$$inlined$call$1(this.$deferredResponse, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super PreferStateResponse> interfaceC30057d) {
        return ((DataChannelRequestManager$preferAudio$$inlined$call$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
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
            return GsonUtils.INSTANCE.getGson().fromJson((JsonElement) jsonObject, PreferStateResponse.class);
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
