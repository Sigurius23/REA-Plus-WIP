package stream.video.sfu.models;

import com.squareup.wire.AbstractC5579j;
import com.squareup.wire.AbstractC5581l;
import com.squareup.wire.AbstractC5586q;
import com.squareup.wire.C5587r;
import com.squareup.wire.C5588s;
import com.squareup.wire.C5591v;
import com.squareup.wire.EnumC5573d;
import com.squareup.wire.EnumC5593x;
import com.squareup.wire.EnumC5595z;
import com.squareup.wire.InterfaceC5570a0;
import com.squareup.wire.ProtoAdapter$EnumConstantNotFoundException;
import j93.InterfaceC21461d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import l83.InterfaceC23457c;
import m83.AbstractC25265s;
import m83.C25271y;
import ne3.C26624l;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import s30.AbstractC32103e;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001e\u0018\u0000 ?2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001?B\u0089\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u008f\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010!R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b/\u0010!R\u001a\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b0\u0010!R\u001a\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b1\u0010!R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u00104R\u001a\u0010\u000e\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b5\u0010!R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00109\u001a\u0004\b:\u0010;R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010<\u001a\u0004\b=\u0010>¨\u0006@"}, m65681d2 = {"Lstream/video/sfu/models/PublishOption;", "Lcom/squareup/wire/l;", "", "Lstream/video/sfu/models/TrackType;", "track_type", "Lstream/video/sfu/models/Codec;", "codec", "", "bitrate", "fps", "max_spatial_layers", "max_temporal_layers", "Lstream/video/sfu/models/VideoDimension;", "video_dimension", "id", "", "use_single_layer", "", "Lstream/video/sfu/models/AudioBitrate;", "audio_bitrate_profiles", "Lstream/video/sfu/models/DegradationPreference;", "degradation_preference", "Lne3/l;", "unknownFields", "<init>", "(Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/Codec;IIIILstream/video/sfu/models/VideoDimension;IZLjava/util/List;Lstream/video/sfu/models/DegradationPreference;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/Codec;IIIILstream/video/sfu/models/VideoDimension;IZLjava/util/List;Lstream/video/sfu/models/DegradationPreference;Lne3/l;)Lstream/video/sfu/models/PublishOption;", "Lstream/video/sfu/models/TrackType;", "getTrack_type", "()Lstream/video/sfu/models/TrackType;", "Lstream/video/sfu/models/Codec;", "getCodec", "()Lstream/video/sfu/models/Codec;", "I", "getBitrate", "getFps", "getMax_spatial_layers", "getMax_temporal_layers", "Lstream/video/sfu/models/VideoDimension;", "getVideo_dimension", "()Lstream/video/sfu/models/VideoDimension;", "getId", "Z", "getUse_single_layer", "()Z", "Lstream/video/sfu/models/DegradationPreference;", "getDegradation_preference", "()Lstream/video/sfu/models/DegradationPreference;", "Ljava/util/List;", "getAudio_bitrate_profiles", "()Ljava/util/List;", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class PublishOption extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.AudioBitrate#ADAPTER", jsonName = "audioBitrateProfiles", label = EnumC5595z.f22136y, tag = 10)
    private final List<AudioBitrate> audio_bitrate_profiles;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = EnumC5595z.f22132F, tag = 3)
    private final int bitrate;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.Codec#ADAPTER", label = EnumC5595z.f22132F, tag = 2)
    private final Codec codec;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.DegradationPreference#ADAPTER", jsonName = "degradationPreference", label = EnumC5595z.f22132F, tag = 11)
    private final DegradationPreference degradation_preference;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = EnumC5595z.f22132F, tag = 4)
    private final int fps;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = EnumC5595z.f22132F, tag = 8)
    private final int id;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "maxSpatialLayers", label = EnumC5595z.f22132F, tag = 5)
    private final int max_spatial_layers;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "maxTemporalLayers", label = EnumC5595z.f22132F, tag = 6)
    private final int max_temporal_layers;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.TrackType#ADAPTER", jsonName = "trackType", label = EnumC5595z.f22132F, tag = 1)
    private final TrackType track_type;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "useSingleLayer", label = EnumC5595z.f22132F, tag = 9)
    private final boolean use_single_layer;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.VideoDimension#ADAPTER", jsonName = "videoDimension", label = EnumC5595z.f22132F, tag = 7)
    private final VideoDimension video_dimension;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(PublishOption.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.models.PublishOption$Companion$ADAPTER$1
            /* JADX WARN: Failed to find 'out' block for switch in B:6:0x002b. Please report as an issue. */
            @Override // com.squareup.wire.AbstractC5586q
            public PublishOption decode(C5587r reader) {
                Object obj;
                Object obj2;
                AbstractC22676k.m65750j(reader, "reader");
                TrackType trackType = TrackType.TRACK_TYPE_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                DegradationPreference degradationPreference = DegradationPreference.DEGRADATION_PREFERENCE_UNSPECIFIED;
                long jM16807d = reader.m16807d();
                Object objDecode = null;
                int iIntValue = 0;
                int iIntValue2 = 0;
                int iIntValue3 = 0;
                int iIntValue4 = 0;
                int iIntValue5 = 0;
                boolean zBooleanValue = false;
                Object objDecode2 = degradationPreference;
                Object objDecode3 = null;
                Object objDecode4 = trackType;
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new PublishOption((TrackType) objDecode4, (Codec) objDecode3, iIntValue, iIntValue2, iIntValue3, iIntValue4, (VideoDimension) objDecode, iIntValue5, zBooleanValue, arrayList, (DegradationPreference) objDecode2, reader.m16808e(jM16807d));
                    }
                    Object obj3 = objDecode4;
                    EnumC5573d enumC5573d2 = EnumC5573d.VARINT;
                    switch (iM16810g) {
                        case 1:
                            obj = objDecode2;
                            obj2 = objDecode3;
                            try {
                                objDecode4 = TrackType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter$EnumConstantNotFoundException e5) {
                                reader.m16804a(iM16810g, enumC5573d2, Long.valueOf(e5.f22081w));
                                objDecode4 = obj3;
                            }
                            objDecode3 = obj2;
                            objDecode2 = obj;
                            break;
                        case 2:
                            objDecode3 = Codec.ADAPTER.decode(reader);
                            objDecode4 = obj3;
                            break;
                        case 3:
                            iIntValue = ((Number) AbstractC5586q.INT32.decode(reader)).intValue();
                            objDecode4 = obj3;
                            break;
                        case 4:
                            iIntValue2 = ((Number) AbstractC5586q.INT32.decode(reader)).intValue();
                            objDecode4 = obj3;
                            break;
                        case 5:
                            iIntValue3 = ((Number) AbstractC5586q.INT32.decode(reader)).intValue();
                            objDecode4 = obj3;
                            break;
                        case 6:
                            iIntValue4 = ((Number) AbstractC5586q.INT32.decode(reader)).intValue();
                            objDecode4 = obj3;
                            break;
                        case 7:
                            objDecode = VideoDimension.ADAPTER.decode(reader);
                            objDecode4 = obj3;
                            break;
                        case 8:
                            iIntValue5 = ((Number) AbstractC5586q.INT32.decode(reader)).intValue();
                            objDecode4 = obj3;
                            break;
                        case 9:
                            zBooleanValue = ((Boolean) AbstractC5586q.BOOL.decode(reader)).booleanValue();
                            objDecode4 = obj3;
                            break;
                        case 10:
                            obj = objDecode2;
                            obj2 = objDecode3;
                            arrayList.add(AudioBitrate.ADAPTER.decode(reader));
                            objDecode4 = obj3;
                            objDecode3 = obj2;
                            objDecode2 = obj;
                            break;
                        case 11:
                            try {
                                objDecode2 = DegradationPreference.ADAPTER.decode(reader);
                                objDecode4 = obj3;
                            } catch (ProtoAdapter$EnumConstantNotFoundException e13) {
                                obj = objDecode2;
                                obj2 = objDecode3;
                                reader.m16804a(iM16810g, enumC5573d2, Long.valueOf(e13.f22081w));
                                objDecode4 = obj3;
                                objDecode3 = obj2;
                                objDecode2 = obj;
                            }
                            break;
                        default:
                            reader.m16813j(iM16810g);
                            obj = objDecode2;
                            obj2 = objDecode3;
                            objDecode4 = obj3;
                            objDecode3 = obj2;
                            objDecode2 = obj;
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(PublishOption value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (value.getTrack_type() != TrackType.TRACK_TYPE_UNSPECIFIED) {
                    iMo79253d += TrackType.ADAPTER.encodedSizeWithTag(1, value.getTrack_type());
                }
                if (value.getCodec() != null) {
                    iMo79253d += Codec.ADAPTER.encodedSizeWithTag(2, value.getCodec());
                }
                if (value.getBitrate() != 0) {
                    iMo79253d += AbstractC5586q.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getBitrate()));
                }
                if (value.getFps() != 0) {
                    iMo79253d += AbstractC5586q.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getFps()));
                }
                if (value.getMax_spatial_layers() != 0) {
                    iMo79253d += AbstractC5586q.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getMax_spatial_layers()));
                }
                if (value.getMax_temporal_layers() != 0) {
                    iMo79253d += AbstractC5586q.INT32.encodedSizeWithTag(6, Integer.valueOf(value.getMax_temporal_layers()));
                }
                if (value.getVideo_dimension() != null) {
                    iMo79253d += VideoDimension.ADAPTER.encodedSizeWithTag(7, value.getVideo_dimension());
                }
                if (value.getId() != 0) {
                    iMo79253d += AbstractC5586q.INT32.encodedSizeWithTag(8, Integer.valueOf(value.getId()));
                }
                if (value.getUse_single_layer()) {
                    iMo79253d += AbstractC5586q.BOOL.encodedSizeWithTag(9, Boolean.valueOf(value.getUse_single_layer()));
                }
                int iEncodedSizeWithTag = AudioBitrate.ADAPTER.asRepeated().encodedSizeWithTag(10, value.getAudio_bitrate_profiles()) + iMo79253d;
                return value.getDegradation_preference() != DegradationPreference.DEGRADATION_PREFERENCE_UNSPECIFIED ? DegradationPreference.ADAPTER.encodedSizeWithTag(11, value.getDegradation_preference()) + iEncodedSizeWithTag : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public PublishOption redact(PublishOption value) {
                AbstractC22676k.m65750j(value, "value");
                Codec codec = value.getCodec();
                Codec codec2 = codec != null ? (Codec) Codec.ADAPTER.redact(codec) : null;
                VideoDimension video_dimension = value.getVideo_dimension();
                return PublishOption.copy$default(value, null, codec2, 0, 0, 0, 0, video_dimension != null ? (VideoDimension) VideoDimension.ADAPTER.redact(video_dimension) : null, 0, false, AbstractC32103e.m99879a(value.getAudio_bitrate_profiles(), AudioBitrate.ADAPTER), null, C26624l.f105881E, 1469, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, PublishOption value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (value.getTrack_type() != TrackType.TRACK_TYPE_UNSPECIFIED) {
                    TrackType.ADAPTER.encodeWithTag(writer, 1, value.getTrack_type());
                }
                if (value.getCodec() != null) {
                    Codec.ADAPTER.encodeWithTag(writer, 2, value.getCodec());
                }
                if (value.getBitrate() != 0) {
                    AbstractC5586q.INT32.encodeWithTag(writer, 3, Integer.valueOf(value.getBitrate()));
                }
                if (value.getFps() != 0) {
                    AbstractC5586q.INT32.encodeWithTag(writer, 4, Integer.valueOf(value.getFps()));
                }
                if (value.getMax_spatial_layers() != 0) {
                    AbstractC5586q.INT32.encodeWithTag(writer, 5, Integer.valueOf(value.getMax_spatial_layers()));
                }
                if (value.getMax_temporal_layers() != 0) {
                    AbstractC5586q.INT32.encodeWithTag(writer, 6, Integer.valueOf(value.getMax_temporal_layers()));
                }
                if (value.getVideo_dimension() != null) {
                    VideoDimension.ADAPTER.encodeWithTag(writer, 7, value.getVideo_dimension());
                }
                if (value.getId() != 0) {
                    AbstractC5586q.INT32.encodeWithTag(writer, 8, Integer.valueOf(value.getId()));
                }
                if (value.getUse_single_layer()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 9, Boolean.valueOf(value.getUse_single_layer()));
                }
                AudioBitrate.ADAPTER.asRepeated().encodeWithTag(writer, 10, value.getAudio_bitrate_profiles());
                if (value.getDegradation_preference() != DegradationPreference.DEGRADATION_PREFERENCE_UNSPECIFIED) {
                    DegradationPreference.ADAPTER.encodeWithTag(writer, 11, value.getDegradation_preference());
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, PublishOption value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (value.getDegradation_preference() != DegradationPreference.DEGRADATION_PREFERENCE_UNSPECIFIED) {
                    DegradationPreference.ADAPTER.encodeWithTag(writer, 11, value.getDegradation_preference());
                }
                AudioBitrate.ADAPTER.asRepeated().encodeWithTag(writer, 10, value.getAudio_bitrate_profiles());
                if (value.getUse_single_layer()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 9, Boolean.valueOf(value.getUse_single_layer()));
                }
                if (value.getId() != 0) {
                    AbstractC5586q.INT32.encodeWithTag(writer, 8, Integer.valueOf(value.getId()));
                }
                if (value.getVideo_dimension() != null) {
                    VideoDimension.ADAPTER.encodeWithTag(writer, 7, value.getVideo_dimension());
                }
                if (value.getMax_temporal_layers() != 0) {
                    AbstractC5586q.INT32.encodeWithTag(writer, 6, Integer.valueOf(value.getMax_temporal_layers()));
                }
                if (value.getMax_spatial_layers() != 0) {
                    AbstractC5586q.INT32.encodeWithTag(writer, 5, Integer.valueOf(value.getMax_spatial_layers()));
                }
                if (value.getFps() != 0) {
                    AbstractC5586q.INT32.encodeWithTag(writer, 4, Integer.valueOf(value.getFps()));
                }
                if (value.getBitrate() != 0) {
                    AbstractC5586q.INT32.encodeWithTag(writer, 3, Integer.valueOf(value.getBitrate()));
                }
                if (value.getCodec() != null) {
                    Codec.ADAPTER.encodeWithTag(writer, 2, value.getCodec());
                }
                if (value.getTrack_type() != TrackType.TRACK_TYPE_UNSPECIFIED) {
                    TrackType.ADAPTER.encodeWithTag(writer, 1, value.getTrack_type());
                }
            }
        };
    }

    public PublishOption() {
        this(null, null, 0, 0, 0, 0, null, 0, false, null, null, null, 4095, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PublishOption copy$default(PublishOption publishOption, TrackType trackType, Codec codec, int i13, int i14, int i15, int i16, VideoDimension videoDimension, int i17, boolean z4, List list, DegradationPreference degradationPreference, C26624l c26624l, int i18, Object obj) {
        if ((i18 & 1) != 0) {
            trackType = publishOption.track_type;
        }
        if ((i18 & 2) != 0) {
            codec = publishOption.codec;
        }
        if ((i18 & 4) != 0) {
            i13 = publishOption.bitrate;
        }
        if ((i18 & 8) != 0) {
            i14 = publishOption.fps;
        }
        if ((i18 & 16) != 0) {
            i15 = publishOption.max_spatial_layers;
        }
        if ((i18 & 32) != 0) {
            i16 = publishOption.max_temporal_layers;
        }
        if ((i18 & 64) != 0) {
            videoDimension = publishOption.video_dimension;
        }
        if ((i18 & 128) != 0) {
            i17 = publishOption.id;
        }
        if ((i18 & 256) != 0) {
            z4 = publishOption.use_single_layer;
        }
        if ((i18 & 512) != 0) {
            list = publishOption.audio_bitrate_profiles;
        }
        if ((i18 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            degradationPreference = publishOption.degradation_preference;
        }
        if ((i18 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            c26624l = publishOption.unknownFields();
        }
        DegradationPreference degradationPreference2 = degradationPreference;
        C26624l c26624l2 = c26624l;
        boolean z13 = z4;
        List list2 = list;
        VideoDimension videoDimension2 = videoDimension;
        int i19 = i17;
        int i24 = i15;
        int i25 = i16;
        return publishOption.copy(trackType, codec, i13, i14, i24, i25, videoDimension2, i19, z13, list2, degradationPreference2, c26624l2);
    }

    public final PublishOption copy(TrackType track_type, Codec codec, int bitrate, int fps, int max_spatial_layers, int max_temporal_layers, VideoDimension video_dimension, int id4, boolean use_single_layer, List<AudioBitrate> audio_bitrate_profiles, DegradationPreference degradation_preference, C26624l unknownFields) {
        AbstractC22676k.m65750j(track_type, "track_type");
        AbstractC22676k.m65750j(audio_bitrate_profiles, "audio_bitrate_profiles");
        AbstractC22676k.m65750j(degradation_preference, "degradation_preference");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new PublishOption(track_type, codec, bitrate, fps, max_spatial_layers, max_temporal_layers, video_dimension, id4, use_single_layer, audio_bitrate_profiles, degradation_preference, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PublishOption)) {
            return false;
        }
        PublishOption publishOption = (PublishOption) other;
        return AbstractC22676k.m65745e(unknownFields(), publishOption.unknownFields()) && this.track_type == publishOption.track_type && AbstractC22676k.m65745e(this.codec, publishOption.codec) && this.bitrate == publishOption.bitrate && this.fps == publishOption.fps && this.max_spatial_layers == publishOption.max_spatial_layers && this.max_temporal_layers == publishOption.max_temporal_layers && AbstractC22676k.m65745e(this.video_dimension, publishOption.video_dimension) && this.id == publishOption.id && this.use_single_layer == publishOption.use_single_layer && AbstractC22676k.m65745e(this.audio_bitrate_profiles, publishOption.audio_bitrate_profiles) && this.degradation_preference == publishOption.degradation_preference;
    }

    public final List<AudioBitrate> getAudio_bitrate_profiles() {
        return this.audio_bitrate_profiles;
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final Codec getCodec() {
        return this.codec;
    }

    public final DegradationPreference getDegradation_preference() {
        return this.degradation_preference;
    }

    public final int getFps() {
        return this.fps;
    }

    public final int getId() {
        return this.id;
    }

    public final int getMax_spatial_layers() {
        return this.max_spatial_layers;
    }

    public final int getMax_temporal_layers() {
        return this.max_temporal_layers;
    }

    public final TrackType getTrack_type() {
        return this.track_type;
    }

    public final boolean getUse_single_layer() {
        return this.use_single_layer;
    }

    public final VideoDimension getVideo_dimension() {
        return this.video_dimension;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = (this.track_type.hashCode() + (unknownFields().hashCode() * 37)) * 37;
        Codec codec = this.codec;
        int iM30448b = AbstractC11266d.m30448b(this.max_temporal_layers, AbstractC11266d.m30448b(this.max_spatial_layers, AbstractC11266d.m30448b(this.fps, AbstractC11266d.m30448b(this.bitrate, (iHashCode + (codec != null ? codec.hashCode() : 0)) * 37, 37), 37), 37), 37);
        VideoDimension videoDimension = this.video_dimension;
        int iHashCode2 = this.degradation_preference.hashCode() + AbstractC11895b.m31983b(AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.id, (iM30448b + (videoDimension != null ? videoDimension.hashCode() : 0)) * 37, 37), 37, this.use_single_layer), 37, this.audio_bitrate_profiles);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134538newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("track_type=" + this.track_type);
        Codec codec = this.codec;
        if (codec != null) {
            arrayList.add("codec=" + codec);
        }
        AbstractC38963t7.m124389s(this.bitrate, "bitrate=", arrayList);
        AbstractC38963t7.m124389s(this.fps, "fps=", arrayList);
        AbstractC38963t7.m124389s(this.max_spatial_layers, "max_spatial_layers=", arrayList);
        AbstractC38963t7.m124389s(this.max_temporal_layers, "max_temporal_layers=", arrayList);
        VideoDimension videoDimension = this.video_dimension;
        if (videoDimension != null) {
            arrayList.add("video_dimension=" + videoDimension);
        }
        AbstractC38963t7.m124389s(this.id, "id=", arrayList);
        AbstractC30007c.m91854x("use_single_layer=", this.use_single_layer, arrayList);
        if (!this.audio_bitrate_profiles.isEmpty()) {
            AbstractC26725a.m79513q("audio_bitrate_profiles=", this.audio_bitrate_profiles, arrayList);
        }
        arrayList.add("degradation_preference=" + this.degradation_preference);
        return AbstractC25265s.m74110N0(arrayList, ", ", "PublishOption{", "}", null, 56);
    }

    public /* synthetic */ PublishOption(TrackType trackType, Codec codec, int i13, int i14, int i15, int i16, VideoDimension videoDimension, int i17, boolean z4, List list, DegradationPreference degradationPreference, C26624l c26624l, int i18, DefaultConstructorMarker defaultConstructorMarker) {
        this((i18 & 1) != 0 ? TrackType.TRACK_TYPE_UNSPECIFIED : trackType, (i18 & 2) != 0 ? null : codec, (i18 & 4) != 0 ? 0 : i13, (i18 & 8) != 0 ? 0 : i14, (i18 & 16) != 0 ? 0 : i15, (i18 & 32) != 0 ? 0 : i16, (i18 & 64) == 0 ? videoDimension : null, (i18 & 128) != 0 ? 0 : i17, (i18 & 256) == 0 ? z4 : false, (i18 & 512) != 0 ? C25271y.f99162w : list, (i18 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? DegradationPreference.DEGRADATION_PREFERENCE_UNSPECIFIED : degradationPreference, (i18 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134538newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublishOption(TrackType track_type, Codec codec, int i13, int i14, int i15, int i16, VideoDimension videoDimension, int i17, boolean z4, List<AudioBitrate> audio_bitrate_profiles, DegradationPreference degradation_preference, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(track_type, "track_type");
        AbstractC22676k.m65750j(audio_bitrate_profiles, "audio_bitrate_profiles");
        AbstractC22676k.m65750j(degradation_preference, "degradation_preference");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.track_type = track_type;
        this.codec = codec;
        this.bitrate = i13;
        this.fps = i14;
        this.max_spatial_layers = i15;
        this.max_temporal_layers = i16;
        this.video_dimension = videoDimension;
        this.id = i17;
        this.use_single_layer = z4;
        this.degradation_preference = degradation_preference;
        this.audio_bitrate_profiles = AbstractC32103e.m99886h("audio_bitrate_profiles", audio_bitrate_profiles);
    }
}
