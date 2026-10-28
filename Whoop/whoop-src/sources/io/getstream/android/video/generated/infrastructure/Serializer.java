package io.getstream.android.video.generated.infrastructure;

import io.getstream.android.video.generated.models.AudioSettingsRequest;
import io.getstream.android.video.generated.models.AudioSettingsResponse;
import io.getstream.android.video.generated.models.CallRecordingFailedEvent;
import io.getstream.android.video.generated.models.CallRecordingReadyEvent;
import io.getstream.android.video.generated.models.CallRecordingStartedEvent;
import io.getstream.android.video.generated.models.CallRecordingStoppedEvent;
import io.getstream.android.video.generated.models.CreateDeviceRequest;
import io.getstream.android.video.generated.models.FrameRecordingSettingsRequest;
import io.getstream.android.video.generated.models.FrameRecordingSettingsResponse;
import io.getstream.android.video.generated.models.IndividualRecordingSettingsRequest;
import io.getstream.android.video.generated.models.IndividualRecordingSettingsResponse;
import io.getstream.android.video.generated.models.IngressAudioEncodingOptionsRequest;
import io.getstream.android.video.generated.models.IngressSourceRequest;
import io.getstream.android.video.generated.models.IngressVideoLayerRequest;
import io.getstream.android.video.generated.models.LayoutSettingsRequest;
import io.getstream.android.video.generated.models.NoiseCancellationSettings;
import io.getstream.android.video.generated.models.OwnCapability;
import io.getstream.android.video.generated.models.RTMPBroadcastRequest;
import io.getstream.android.video.generated.models.RTMPSettingsRequest;
import io.getstream.android.video.generated.models.RawRecordingSettingsRequest;
import io.getstream.android.video.generated.models.RawRecordingSettingsResponse;
import io.getstream.android.video.generated.models.RecordSettingsRequest;
import io.getstream.android.video.generated.models.StartClosedCaptionsRequest;
import io.getstream.android.video.generated.models.StartTranscriptionRequest;
import io.getstream.android.video.generated.models.TranscriptionSettingsRequest;
import io.getstream.android.video.generated.models.TranscriptionSettingsResponse;
import io.getstream.android.video.generated.models.VideoEventAdapter;
import io.getstream.android.video.generated.models.VideoSettingsRequest;
import io.getstream.android.video.generated.models.VideoSettingsResponse;
import l83.InterfaceC23462h;
import p441qx.C30716i0;
import p441qx.C30722l0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import sx.C33057c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR!\u0010\u0010\u001a\u00020\n8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/android/video/generated/infrastructure/Serializer;", "", "<init>", "()V", "Lqx/i0;", "moshiBuilder", "Lqx/i0;", "getMoshiBuilder", "()Lqx/i0;", "getMoshiBuilder$annotations", "Lqx/l0;", "moshi$delegate", "Ll83/h;", "getMoshi", "()Lqx/l0;", "getMoshi$annotations", "moshi", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class Serializer {
    public static final Serializer INSTANCE = new Serializer();

    /* JADX INFO: renamed from: moshi$delegate, reason: from kotlin metadata */
    private static final InterfaceC23462h moshi;
    private static final C30716i0 moshiBuilder;

    static {
        C30716i0 c30716i0 = new C30716i0();
        c30716i0.m94391a(new AudioSettingsRequest.DefaultDevice.DefaultDeviceAdapter());
        c30716i0.m94391a(new AudioSettingsResponse.DefaultDevice.DefaultDeviceAdapter());
        c30716i0.m94391a(new CallRecordingFailedEvent.RecordingType.RecordingTypeAdapter());
        c30716i0.m94391a(new CallRecordingReadyEvent.RecordingType.RecordingTypeAdapter());
        c30716i0.m94391a(new CallRecordingStartedEvent.RecordingType.RecordingTypeAdapter());
        c30716i0.m94391a(new CallRecordingStoppedEvent.RecordingType.RecordingTypeAdapter());
        c30716i0.m94391a(new CreateDeviceRequest.PushProvider.PushProviderAdapter());
        c30716i0.m94391a(new FrameRecordingSettingsRequest.Mode.ModeAdapter());
        c30716i0.m94391a(new FrameRecordingSettingsRequest.Quality.QualityAdapter());
        c30716i0.m94391a(new FrameRecordingSettingsResponse.Mode.ModeAdapter());
        c30716i0.m94391a(new IndividualRecordingSettingsRequest.Mode.ModeAdapter());
        c30716i0.m94391a(new IndividualRecordingSettingsResponse.Mode.ModeAdapter());
        c30716i0.m94391a(new IngressAudioEncodingOptionsRequest.Channels.ChannelsAdapter());
        c30716i0.m94391a(new IngressSourceRequest.Fps.FpsAdapter());
        c30716i0.m94391a(new IngressVideoLayerRequest.Codec.CodecAdapter());
        c30716i0.m94391a(new LayoutSettingsRequest.Name.NameAdapter());
        c30716i0.m94391a(new NoiseCancellationSettings.Mode.ModeAdapter());
        c30716i0.m94391a(new OwnCapability.OwnCapabilityAdapter());
        c30716i0.m94391a(new RTMPBroadcastRequest.Quality.QualityAdapter());
        c30716i0.m94391a(new RTMPSettingsRequest.Quality.QualityAdapter());
        c30716i0.m94391a(new RawRecordingSettingsRequest.Mode.ModeAdapter());
        c30716i0.m94391a(new RawRecordingSettingsResponse.Mode.ModeAdapter());
        c30716i0.m94391a(new RecordSettingsRequest.Mode.ModeAdapter());
        c30716i0.m94391a(new RecordSettingsRequest.Quality.QualityAdapter());
        c30716i0.m94391a(new StartClosedCaptionsRequest.Language.LanguageAdapter());
        c30716i0.m94391a(new StartTranscriptionRequest.Language.LanguageAdapter());
        c30716i0.m94391a(new TranscriptionSettingsRequest.ClosedCaptionMode.ClosedCaptionModeAdapter());
        c30716i0.m94391a(new TranscriptionSettingsRequest.Language.LanguageAdapter());
        c30716i0.m94391a(new TranscriptionSettingsRequest.Mode.ModeAdapter());
        c30716i0.m94391a(new TranscriptionSettingsResponse.ClosedCaptionMode.ClosedCaptionModeAdapter());
        c30716i0.m94391a(new TranscriptionSettingsResponse.Language.LanguageAdapter());
        c30716i0.m94391a(new TranscriptionSettingsResponse.Mode.ModeAdapter());
        c30716i0.m94391a(new VideoSettingsRequest.CameraFacing.CameraFacingAdapter());
        c30716i0.m94391a(new VideoSettingsResponse.CameraFacing.CameraFacingAdapter());
        c30716i0.m94391a(new VideoEventAdapter());
        c30716i0.m94391a(new BigDecimalAdapter());
        c30716i0.m94391a(new BigIntegerAdapter());
        c30716i0.m94391a(new ByteArrayAdapter());
        c30716i0.m94391a(new URIAdapter());
        c30716i0.m94391a(new UUIDAdapter());
        c30716i0.m94391a(new OffsetDateTimeAdapter());
        c30716i0.m94391a(new LocalDateAdapter());
        c30716i0.m94391a(new LocalDateTimeAdapter());
        c30716i0.f126485a.add(new C33057c());
        moshiBuilder = c30716i0;
        moshi = AbstractC30060g.m92088H(Serializer$moshi$2.INSTANCE);
    }

    private Serializer() {
    }

    public static final C30722l0 getMoshi() {
        Object value = moshi.getValue();
        AbstractC22676k.m65749i(value, "getValue(...)");
        return (C30722l0) value;
    }

    public static /* synthetic */ void getMoshi$annotations() {
    }

    public static final C30716i0 getMoshiBuilder() {
        return moshiBuilder;
    }

    public static /* synthetic */ void getMoshiBuilder$annotations() {
    }
}
