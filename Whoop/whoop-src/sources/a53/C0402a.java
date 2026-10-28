package a53;

import c93.InterfaceC4339a;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import io.getstream.android.video.generated.infrastructure.BigDecimalAdapter;
import io.getstream.android.video.generated.infrastructure.BigIntegerAdapter;
import io.getstream.android.video.generated.infrastructure.ByteArrayAdapter;
import io.getstream.android.video.generated.infrastructure.LocalDateAdapter;
import io.getstream.android.video.generated.infrastructure.LocalDateTimeAdapter;
import io.getstream.android.video.generated.infrastructure.OffsetDateTimeAdapter;
import io.getstream.android.video.generated.infrastructure.URIAdapter;
import io.getstream.android.video.generated.infrastructure.UUIDAdapter;
import io.getstream.android.video.generated.models.AudioSettingsRequest;
import io.getstream.android.video.generated.models.AudioSettingsResponse;
import io.getstream.android.video.generated.models.CreateDeviceRequest;
import io.getstream.android.video.generated.models.LayoutSettingsRequest;
import io.getstream.android.video.generated.models.NoiseCancellationSettings;
import io.getstream.android.video.generated.models.OwnCapability;
import io.getstream.android.video.generated.models.RTMPBroadcastRequest;
import io.getstream.android.video.generated.models.RTMPSettingsRequest;
import io.getstream.android.video.generated.models.RecordSettingsRequest;
import io.getstream.android.video.generated.models.TranscriptionSettingsRequest;
import io.getstream.android.video.generated.models.TranscriptionSettingsResponse;
import io.getstream.android.video.generated.models.VideoEvent;
import io.getstream.android.video.generated.models.VideoEventAdapter;
import io.getstream.android.video.generated.models.VideoSettingsRequest;
import io.getstream.android.video.generated.models.VideoSettingsResponse;
import io.getstream.video.android.core.socket.common.parser2.adapters.DateAdapter;
import java.util.Date;
import p441qx.AbstractC30704c0;
import p441qx.C30716i0;
import p441qx.C30722l0;
import p441qx.InterfaceC30729p;
import p441qx.InterfaceC30738t0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import sx.C33057c;

/* JADX INFO: renamed from: a53.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C0402a extends AbstractC22680m implements InterfaceC4339a {
    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        C30716i0 c30716i0 = new C30716i0();
        c30716i0.m94391a(new OffsetDateTimeAdapter());
        c30716i0.m94391a(new LocalDateTimeAdapter());
        c30716i0.m94391a(new LocalDateAdapter());
        c30716i0.m94391a(new UUIDAdapter());
        c30716i0.m94391a(new ByteArrayAdapter());
        c30716i0.m94391a(new URIAdapter());
        c30716i0.m94391a(new BigDecimalAdapter());
        c30716i0.m94391a(new BigIntegerAdapter());
        final DateAdapter dateAdapter = new DateAdapter();
        c30716i0.m94392b(Date.class, new JsonAdapter<Date>() { // from class: io.getstream.video.android.core.socket.common.parser2.MoshiVideoParser$moshi$2$invoke$$inlined$addAdapter$1
            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30729p
            public Date fromJson(JsonReader reader) {
                AbstractC22676k.m65750j(reader, "reader");
                reader.f22075E = true;
                return dateAdapter.fromJson(reader);
            }

            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30738t0
            public void toJson(AbstractC30704c0 writer, Date value) {
                AbstractC22676k.m65750j(writer, "writer");
                writer.f126433F = true;
                dateAdapter.toJson(writer, (Object) value);
            }
        });
        final VideoEventAdapter videoEventAdapter = new VideoEventAdapter();
        c30716i0.m94391a(new JsonAdapter<VideoEvent>() { // from class: io.getstream.video.android.core.socket.common.parser2.MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$1
            /* JADX WARN: Type inference failed for: r2v1, types: [io.getstream.android.video.generated.models.VideoEvent, java.lang.Object] */
            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30729p
            public VideoEvent fromJson(JsonReader reader) {
                AbstractC22676k.m65750j(reader, "reader");
                reader.f22075E = true;
                return videoEventAdapter.fromJson(reader);
            }

            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30738t0
            public void toJson(AbstractC30704c0 writer, VideoEvent value) {
                AbstractC22676k.m65750j(writer, "writer");
                writer.f126433F = true;
                videoEventAdapter.toJson(writer, (Object) value);
            }
        });
        final AudioSettingsRequest.DefaultDevice.DefaultDeviceAdapter defaultDeviceAdapter = new AudioSettingsRequest.DefaultDevice.DefaultDeviceAdapter();
        c30716i0.m94391a(new JsonAdapter<AudioSettingsRequest.DefaultDevice>() { // from class: io.getstream.video.android.core.socket.common.parser2.MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$2
            /* JADX WARN: Type inference failed for: r2v1, types: [io.getstream.android.video.generated.models.AudioSettingsRequest$DefaultDevice, java.lang.Object] */
            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30729p
            public AudioSettingsRequest.DefaultDevice fromJson(JsonReader reader) {
                AbstractC22676k.m65750j(reader, "reader");
                reader.f22075E = true;
                return defaultDeviceAdapter.fromJson(reader);
            }

            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30738t0
            public void toJson(AbstractC30704c0 writer, AudioSettingsRequest.DefaultDevice value) {
                AbstractC22676k.m65750j(writer, "writer");
                writer.f126433F = true;
                defaultDeviceAdapter.toJson(writer, (Object) value);
            }
        });
        final AudioSettingsResponse.DefaultDevice.DefaultDeviceAdapter defaultDeviceAdapter2 = new AudioSettingsResponse.DefaultDevice.DefaultDeviceAdapter();
        c30716i0.m94391a(new JsonAdapter<AudioSettingsResponse.DefaultDevice>() { // from class: io.getstream.video.android.core.socket.common.parser2.MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$3
            /* JADX WARN: Type inference failed for: r2v1, types: [io.getstream.android.video.generated.models.AudioSettingsResponse$DefaultDevice, java.lang.Object] */
            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30729p
            public AudioSettingsResponse.DefaultDevice fromJson(JsonReader reader) {
                AbstractC22676k.m65750j(reader, "reader");
                reader.f22075E = true;
                return defaultDeviceAdapter2.fromJson(reader);
            }

            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30738t0
            public void toJson(AbstractC30704c0 writer, AudioSettingsResponse.DefaultDevice value) {
                AbstractC22676k.m65750j(writer, "writer");
                writer.f126433F = true;
                defaultDeviceAdapter2.toJson(writer, (Object) value);
            }
        });
        final CreateDeviceRequest.PushProvider.PushProviderAdapter pushProviderAdapter = new CreateDeviceRequest.PushProvider.PushProviderAdapter();
        c30716i0.m94391a(new JsonAdapter<CreateDeviceRequest.PushProvider>() { // from class: io.getstream.video.android.core.socket.common.parser2.MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$4
            /* JADX WARN: Type inference failed for: r2v1, types: [io.getstream.android.video.generated.models.CreateDeviceRequest$PushProvider, java.lang.Object] */
            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30729p
            public CreateDeviceRequest.PushProvider fromJson(JsonReader reader) {
                AbstractC22676k.m65750j(reader, "reader");
                reader.f22075E = true;
                return pushProviderAdapter.fromJson(reader);
            }

            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30738t0
            public void toJson(AbstractC30704c0 writer, CreateDeviceRequest.PushProvider value) {
                AbstractC22676k.m65750j(writer, "writer");
                writer.f126433F = true;
                pushProviderAdapter.toJson(writer, (Object) value);
            }
        });
        final NoiseCancellationSettings.Mode.ModeAdapter modeAdapter = new NoiseCancellationSettings.Mode.ModeAdapter();
        c30716i0.m94391a(new JsonAdapter<NoiseCancellationSettings.Mode>() { // from class: io.getstream.video.android.core.socket.common.parser2.MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$5
            /* JADX WARN: Type inference failed for: r2v1, types: [io.getstream.android.video.generated.models.NoiseCancellationSettings$Mode, java.lang.Object] */
            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30729p
            public NoiseCancellationSettings.Mode fromJson(JsonReader reader) {
                AbstractC22676k.m65750j(reader, "reader");
                reader.f22075E = true;
                return modeAdapter.fromJson(reader);
            }

            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30738t0
            public void toJson(AbstractC30704c0 writer, NoiseCancellationSettings.Mode value) {
                AbstractC22676k.m65750j(writer, "writer");
                writer.f126433F = true;
                modeAdapter.toJson(writer, (Object) value);
            }
        });
        final OwnCapability.OwnCapabilityAdapter ownCapabilityAdapter = new OwnCapability.OwnCapabilityAdapter();
        c30716i0.m94391a(new JsonAdapter<OwnCapability>() { // from class: io.getstream.video.android.core.socket.common.parser2.MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$6
            /* JADX WARN: Type inference failed for: r2v1, types: [io.getstream.android.video.generated.models.OwnCapability, java.lang.Object] */
            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30729p
            public OwnCapability fromJson(JsonReader reader) {
                AbstractC22676k.m65750j(reader, "reader");
                reader.f22075E = true;
                return ownCapabilityAdapter.fromJson(reader);
            }

            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30738t0
            public void toJson(AbstractC30704c0 writer, OwnCapability value) {
                AbstractC22676k.m65750j(writer, "writer");
                writer.f126433F = true;
                ownCapabilityAdapter.toJson(writer, (Object) value);
            }
        });
        final RecordSettingsRequest.Mode.ModeAdapter modeAdapter2 = new RecordSettingsRequest.Mode.ModeAdapter();
        c30716i0.m94391a(new JsonAdapter<RecordSettingsRequest.Mode>() { // from class: io.getstream.video.android.core.socket.common.parser2.MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$7
            /* JADX WARN: Type inference failed for: r2v1, types: [io.getstream.android.video.generated.models.RecordSettingsRequest$Mode, java.lang.Object] */
            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30729p
            public RecordSettingsRequest.Mode fromJson(JsonReader reader) {
                AbstractC22676k.m65750j(reader, "reader");
                reader.f22075E = true;
                return modeAdapter2.fromJson(reader);
            }

            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30738t0
            public void toJson(AbstractC30704c0 writer, RecordSettingsRequest.Mode value) {
                AbstractC22676k.m65750j(writer, "writer");
                writer.f126433F = true;
                modeAdapter2.toJson(writer, (Object) value);
            }
        });
        final RecordSettingsRequest.Quality.QualityAdapter qualityAdapter = new RecordSettingsRequest.Quality.QualityAdapter();
        c30716i0.m94391a(new JsonAdapter<RecordSettingsRequest.Quality>() { // from class: io.getstream.video.android.core.socket.common.parser2.MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$8
            /* JADX WARN: Type inference failed for: r2v1, types: [io.getstream.android.video.generated.models.RecordSettingsRequest$Quality, java.lang.Object] */
            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30729p
            public RecordSettingsRequest.Quality fromJson(JsonReader reader) {
                AbstractC22676k.m65750j(reader, "reader");
                reader.f22075E = true;
                return qualityAdapter.fromJson(reader);
            }

            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30738t0
            public void toJson(AbstractC30704c0 writer, RecordSettingsRequest.Quality value) {
                AbstractC22676k.m65750j(writer, "writer");
                writer.f126433F = true;
                qualityAdapter.toJson(writer, (Object) value);
            }
        });
        final TranscriptionSettingsRequest.Mode.ModeAdapter modeAdapter3 = new TranscriptionSettingsRequest.Mode.ModeAdapter();
        c30716i0.m94391a(new JsonAdapter<TranscriptionSettingsRequest.Mode>() { // from class: io.getstream.video.android.core.socket.common.parser2.MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$9
            /* JADX WARN: Type inference failed for: r2v1, types: [io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Mode, java.lang.Object] */
            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30729p
            public TranscriptionSettingsRequest.Mode fromJson(JsonReader reader) {
                AbstractC22676k.m65750j(reader, "reader");
                reader.f22075E = true;
                return modeAdapter3.fromJson(reader);
            }

            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30738t0
            public void toJson(AbstractC30704c0 writer, TranscriptionSettingsRequest.Mode value) {
                AbstractC22676k.m65750j(writer, "writer");
                writer.f126433F = true;
                modeAdapter3.toJson(writer, (Object) value);
            }
        });
        final TranscriptionSettingsResponse.Mode.ModeAdapter modeAdapter4 = new TranscriptionSettingsResponse.Mode.ModeAdapter();
        c30716i0.m94391a(new JsonAdapter<TranscriptionSettingsResponse.Mode>() { // from class: io.getstream.video.android.core.socket.common.parser2.MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$10
            /* JADX WARN: Type inference failed for: r2v1, types: [io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Mode, java.lang.Object] */
            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30729p
            public TranscriptionSettingsResponse.Mode fromJson(JsonReader reader) {
                AbstractC22676k.m65750j(reader, "reader");
                reader.f22075E = true;
                return modeAdapter4.fromJson(reader);
            }

            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30738t0
            public void toJson(AbstractC30704c0 writer, TranscriptionSettingsResponse.Mode value) {
                AbstractC22676k.m65750j(writer, "writer");
                writer.f126433F = true;
                modeAdapter4.toJson(writer, (Object) value);
            }
        });
        final TranscriptionSettingsResponse.ClosedCaptionMode.ClosedCaptionModeAdapter closedCaptionModeAdapter = new TranscriptionSettingsResponse.ClosedCaptionMode.ClosedCaptionModeAdapter();
        c30716i0.m94391a(new JsonAdapter<TranscriptionSettingsResponse.ClosedCaptionMode>() { // from class: io.getstream.video.android.core.socket.common.parser2.MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$11
            /* JADX WARN: Type inference failed for: r2v1, types: [io.getstream.android.video.generated.models.TranscriptionSettingsResponse$ClosedCaptionMode, java.lang.Object] */
            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30729p
            public TranscriptionSettingsResponse.ClosedCaptionMode fromJson(JsonReader reader) {
                AbstractC22676k.m65750j(reader, "reader");
                reader.f22075E = true;
                return closedCaptionModeAdapter.fromJson(reader);
            }

            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30738t0
            public void toJson(AbstractC30704c0 writer, TranscriptionSettingsResponse.ClosedCaptionMode value) {
                AbstractC22676k.m65750j(writer, "writer");
                writer.f126433F = true;
                closedCaptionModeAdapter.toJson(writer, (Object) value);
            }
        });
        final VideoSettingsRequest.CameraFacing.CameraFacingAdapter cameraFacingAdapter = new VideoSettingsRequest.CameraFacing.CameraFacingAdapter();
        c30716i0.m94391a(new JsonAdapter<VideoSettingsRequest.CameraFacing>() { // from class: io.getstream.video.android.core.socket.common.parser2.MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$12
            /* JADX WARN: Type inference failed for: r2v1, types: [io.getstream.android.video.generated.models.VideoSettingsRequest$CameraFacing, java.lang.Object] */
            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30729p
            public VideoSettingsRequest.CameraFacing fromJson(JsonReader reader) {
                AbstractC22676k.m65750j(reader, "reader");
                reader.f22075E = true;
                return cameraFacingAdapter.fromJson(reader);
            }

            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30738t0
            public void toJson(AbstractC30704c0 writer, VideoSettingsRequest.CameraFacing value) {
                AbstractC22676k.m65750j(writer, "writer");
                writer.f126433F = true;
                cameraFacingAdapter.toJson(writer, (Object) value);
            }
        });
        final VideoSettingsResponse.CameraFacing.CameraFacingAdapter cameraFacingAdapter2 = new VideoSettingsResponse.CameraFacing.CameraFacingAdapter();
        c30716i0.m94391a(new JsonAdapter<VideoSettingsResponse.CameraFacing>() { // from class: io.getstream.video.android.core.socket.common.parser2.MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$13
            /* JADX WARN: Type inference failed for: r2v1, types: [io.getstream.android.video.generated.models.VideoSettingsResponse$CameraFacing, java.lang.Object] */
            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30729p
            public VideoSettingsResponse.CameraFacing fromJson(JsonReader reader) {
                AbstractC22676k.m65750j(reader, "reader");
                reader.f22075E = true;
                return cameraFacingAdapter2.fromJson(reader);
            }

            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30738t0
            public void toJson(AbstractC30704c0 writer, VideoSettingsResponse.CameraFacing value) {
                AbstractC22676k.m65750j(writer, "writer");
                writer.f126433F = true;
                cameraFacingAdapter2.toJson(writer, (Object) value);
            }
        });
        final LayoutSettingsRequest.Name.NameAdapter nameAdapter = new LayoutSettingsRequest.Name.NameAdapter();
        c30716i0.m94391a(new JsonAdapter<LayoutSettingsRequest.Name>() { // from class: io.getstream.video.android.core.socket.common.parser2.MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$14
            /* JADX WARN: Type inference failed for: r2v1, types: [io.getstream.android.video.generated.models.LayoutSettingsRequest$Name, java.lang.Object] */
            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30729p
            public LayoutSettingsRequest.Name fromJson(JsonReader reader) {
                AbstractC22676k.m65750j(reader, "reader");
                reader.f22075E = true;
                return nameAdapter.fromJson(reader);
            }

            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30738t0
            public void toJson(AbstractC30704c0 writer, LayoutSettingsRequest.Name value) {
                AbstractC22676k.m65750j(writer, "writer");
                writer.f126433F = true;
                nameAdapter.toJson(writer, (Object) value);
            }
        });
        final RTMPBroadcastRequest.Quality.QualityAdapter qualityAdapter2 = new RTMPBroadcastRequest.Quality.QualityAdapter();
        c30716i0.m94391a(new JsonAdapter<RTMPBroadcastRequest.Quality>() { // from class: io.getstream.video.android.core.socket.common.parser2.MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$15
            /* JADX WARN: Type inference failed for: r2v1, types: [io.getstream.android.video.generated.models.RTMPBroadcastRequest$Quality, java.lang.Object] */
            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30729p
            public RTMPBroadcastRequest.Quality fromJson(JsonReader reader) {
                AbstractC22676k.m65750j(reader, "reader");
                reader.f22075E = true;
                return qualityAdapter2.fromJson(reader);
            }

            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30738t0
            public void toJson(AbstractC30704c0 writer, RTMPBroadcastRequest.Quality value) {
                AbstractC22676k.m65750j(writer, "writer");
                writer.f126433F = true;
                qualityAdapter2.toJson(writer, (Object) value);
            }
        });
        final RTMPSettingsRequest.Quality.QualityAdapter qualityAdapter3 = new RTMPSettingsRequest.Quality.QualityAdapter();
        c30716i0.m94391a(new JsonAdapter<RTMPSettingsRequest.Quality>() { // from class: io.getstream.video.android.core.socket.common.parser2.MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$16
            /* JADX WARN: Type inference failed for: r2v1, types: [io.getstream.android.video.generated.models.RTMPSettingsRequest$Quality, java.lang.Object] */
            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30729p
            public RTMPSettingsRequest.Quality fromJson(JsonReader reader) {
                AbstractC22676k.m65750j(reader, "reader");
                reader.f22075E = true;
                return qualityAdapter3.fromJson(reader);
            }

            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30738t0
            public void toJson(AbstractC30704c0 writer, RTMPSettingsRequest.Quality value) {
                AbstractC22676k.m65750j(writer, "writer");
                writer.f126433F = true;
                qualityAdapter3.toJson(writer, (Object) value);
            }
        });
        final TranscriptionSettingsRequest.ClosedCaptionMode.ClosedCaptionModeAdapter closedCaptionModeAdapter2 = new TranscriptionSettingsRequest.ClosedCaptionMode.ClosedCaptionModeAdapter();
        c30716i0.m94391a(new JsonAdapter<TranscriptionSettingsRequest.ClosedCaptionMode>() { // from class: io.getstream.video.android.core.socket.common.parser2.MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$17
            /* JADX WARN: Type inference failed for: r2v1, types: [io.getstream.android.video.generated.models.TranscriptionSettingsRequest$ClosedCaptionMode, java.lang.Object] */
            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30729p
            public TranscriptionSettingsRequest.ClosedCaptionMode fromJson(JsonReader reader) {
                AbstractC22676k.m65750j(reader, "reader");
                reader.f22075E = true;
                return closedCaptionModeAdapter2.fromJson(reader);
            }

            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30738t0
            public void toJson(AbstractC30704c0 writer, TranscriptionSettingsRequest.ClosedCaptionMode value) {
                AbstractC22676k.m65750j(writer, "writer");
                writer.f126433F = true;
                closedCaptionModeAdapter2.toJson(writer, (Object) value);
            }
        });
        final TranscriptionSettingsRequest.Language.LanguageAdapter languageAdapter = new TranscriptionSettingsRequest.Language.LanguageAdapter();
        c30716i0.m94391a(new JsonAdapter<TranscriptionSettingsRequest.Language>() { // from class: io.getstream.video.android.core.socket.common.parser2.MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$18
            /* JADX WARN: Type inference failed for: r2v1, types: [io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language, java.lang.Object] */
            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30729p
            public TranscriptionSettingsRequest.Language fromJson(JsonReader reader) {
                AbstractC22676k.m65750j(reader, "reader");
                reader.f22075E = true;
                return languageAdapter.fromJson(reader);
            }

            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30738t0
            public void toJson(AbstractC30704c0 writer, TranscriptionSettingsRequest.Language value) {
                AbstractC22676k.m65750j(writer, "writer");
                writer.f126433F = true;
                languageAdapter.toJson(writer, (Object) value);
            }
        });
        final TranscriptionSettingsResponse.Language.LanguageAdapter languageAdapter2 = new TranscriptionSettingsResponse.Language.LanguageAdapter();
        c30716i0.m94391a(new JsonAdapter<TranscriptionSettingsResponse.Language>() { // from class: io.getstream.video.android.core.socket.common.parser2.MoshiVideoParser$moshi$2$invoke$$inlined$lenientAdapter$19
            /* JADX WARN: Type inference failed for: r2v1, types: [io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language, java.lang.Object] */
            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30729p
            public TranscriptionSettingsResponse.Language fromJson(JsonReader reader) {
                AbstractC22676k.m65750j(reader, "reader");
                reader.f22075E = true;
                return languageAdapter2.fromJson(reader);
            }

            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30738t0
            public void toJson(AbstractC30704c0 writer, TranscriptionSettingsResponse.Language value) {
                AbstractC22676k.m65750j(writer, "writer");
                writer.f126433F = true;
                languageAdapter2.toJson(writer, (Object) value);
            }
        });
        c30716i0.f126485a.add(new C33057c());
        return new C30722l0(c30716i0);
    }
}
