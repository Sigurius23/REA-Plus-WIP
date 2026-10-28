package stream.video.sfu.event;

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
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import s30.AbstractC32103e;
import stream.video.sfu.models.Codec;
import stream.video.sfu.models.DegradationPreference;
import stream.video.sfu.models.TrackType;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.BK\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJQ\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010\u001aR\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, m65681d2 = {"Lstream/video/sfu/event/VideoSender;", "Lcom/squareup/wire/l;", "", "Lstream/video/sfu/models/Codec;", "codec", "", "Lstream/video/sfu/event/VideoLayerSetting;", "layers", "Lstream/video/sfu/models/TrackType;", "track_type", "", "publish_option_id", "Lstream/video/sfu/models/DegradationPreference;", "degradation_preference", "Lne3/l;", "unknownFields", "<init>", "(Lstream/video/sfu/models/Codec;Ljava/util/List;Lstream/video/sfu/models/TrackType;ILstream/video/sfu/models/DegradationPreference;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lstream/video/sfu/models/Codec;Ljava/util/List;Lstream/video/sfu/models/TrackType;ILstream/video/sfu/models/DegradationPreference;Lne3/l;)Lstream/video/sfu/event/VideoSender;", "Lstream/video/sfu/models/Codec;", "getCodec", "()Lstream/video/sfu/models/Codec;", "Lstream/video/sfu/models/TrackType;", "getTrack_type", "()Lstream/video/sfu/models/TrackType;", "I", "getPublish_option_id", "Lstream/video/sfu/models/DegradationPreference;", "getDegradation_preference", "()Lstream/video/sfu/models/DegradationPreference;", "Ljava/util/List;", "getLayers", "()Ljava/util/List;", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class VideoSender extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.Codec#ADAPTER", label = EnumC5595z.f22132F, tag = 2)
    private final Codec codec;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.DegradationPreference#ADAPTER", jsonName = "degradationPreference", label = EnumC5595z.f22132F, tag = 6)
    private final DegradationPreference degradation_preference;

    @InterfaceC5570a0(adapter = "stream.video.sfu.event.VideoLayerSetting#ADAPTER", label = EnumC5595z.f22136y, tag = 3)
    private final List<VideoLayerSetting> layers;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "publishOptionId", label = EnumC5595z.f22132F, tag = 5)
    private final int publish_option_id;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.TrackType#ADAPTER", jsonName = "trackType", label = EnumC5595z.f22132F, tag = 4)
    private final TrackType track_type;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(VideoSender.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.event.VideoSender$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public VideoSender decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                ArrayList arrayList = new ArrayList();
                Object objDecode = TrackType.TRACK_TYPE_UNSPECIFIED;
                DegradationPreference degradationPreference = DegradationPreference.DEGRADATION_PREFERENCE_UNSPECIFIED;
                long jM16807d = reader.m16807d();
                int iIntValue = 0;
                Object objDecode2 = null;
                Object objDecode3 = degradationPreference;
                while (true) {
                    Object obj = objDecode;
                    while (true) {
                        int iM16810g = reader.m16810g();
                        if (iM16810g == -1) {
                            return new VideoSender((Codec) objDecode2, arrayList, (TrackType) obj, iIntValue, (DegradationPreference) objDecode3, reader.m16808e(jM16807d));
                        }
                        if (iM16810g == 2) {
                            objDecode2 = Codec.ADAPTER.decode(reader);
                        } else if (iM16810g != 3) {
                            EnumC5573d enumC5573d2 = EnumC5573d.VARINT;
                            if (iM16810g == 4) {
                                try {
                                    objDecode = TrackType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter$EnumConstantNotFoundException e5) {
                                    reader.m16804a(iM16810g, enumC5573d2, Long.valueOf(e5.f22081w));
                                }
                            } else if (iM16810g == 5) {
                                iIntValue = ((Number) AbstractC5586q.INT32.decode(reader)).intValue();
                            } else if (iM16810g != 6) {
                                reader.m16813j(iM16810g);
                            } else {
                                try {
                                    objDecode3 = DegradationPreference.ADAPTER.decode(reader);
                                } catch (ProtoAdapter$EnumConstantNotFoundException e13) {
                                    reader.m16804a(iM16810g, enumC5573d2, Long.valueOf(e13.f22081w));
                                }
                            }
                        } else {
                            arrayList.add(VideoLayerSetting.ADAPTER.decode(reader));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(VideoSender value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (value.getCodec() != null) {
                    iMo79253d += Codec.ADAPTER.encodedSizeWithTag(2, value.getCodec());
                }
                int iEncodedSizeWithTag = VideoLayerSetting.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getLayers()) + iMo79253d;
                if (value.getTrack_type() != TrackType.TRACK_TYPE_UNSPECIFIED) {
                    iEncodedSizeWithTag += TrackType.ADAPTER.encodedSizeWithTag(4, value.getTrack_type());
                }
                if (value.getPublish_option_id() != 0) {
                    iEncodedSizeWithTag += AbstractC5586q.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getPublish_option_id()));
                }
                return value.getDegradation_preference() != DegradationPreference.DEGRADATION_PREFERENCE_UNSPECIFIED ? DegradationPreference.ADAPTER.encodedSizeWithTag(6, value.getDegradation_preference()) + iEncodedSizeWithTag : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public VideoSender redact(VideoSender value) {
                AbstractC22676k.m65750j(value, "value");
                Codec codec = value.getCodec();
                return VideoSender.copy$default(value, codec != null ? (Codec) Codec.ADAPTER.redact(codec) : null, AbstractC32103e.m99879a(value.getLayers(), VideoLayerSetting.ADAPTER), null, 0, null, C26624l.f105881E, 28, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, VideoSender value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (value.getCodec() != null) {
                    Codec.ADAPTER.encodeWithTag(writer, 2, value.getCodec());
                }
                VideoLayerSetting.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.getLayers());
                if (value.getTrack_type() != TrackType.TRACK_TYPE_UNSPECIFIED) {
                    TrackType.ADAPTER.encodeWithTag(writer, 4, value.getTrack_type());
                }
                if (value.getPublish_option_id() != 0) {
                    AbstractC5586q.INT32.encodeWithTag(writer, 5, Integer.valueOf(value.getPublish_option_id()));
                }
                if (value.getDegradation_preference() != DegradationPreference.DEGRADATION_PREFERENCE_UNSPECIFIED) {
                    DegradationPreference.ADAPTER.encodeWithTag(writer, 6, value.getDegradation_preference());
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, VideoSender value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (value.getDegradation_preference() != DegradationPreference.DEGRADATION_PREFERENCE_UNSPECIFIED) {
                    DegradationPreference.ADAPTER.encodeWithTag(writer, 6, value.getDegradation_preference());
                }
                if (value.getPublish_option_id() != 0) {
                    AbstractC5586q.INT32.encodeWithTag(writer, 5, Integer.valueOf(value.getPublish_option_id()));
                }
                if (value.getTrack_type() != TrackType.TRACK_TYPE_UNSPECIFIED) {
                    TrackType.ADAPTER.encodeWithTag(writer, 4, value.getTrack_type());
                }
                VideoLayerSetting.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.getLayers());
                if (value.getCodec() != null) {
                    Codec.ADAPTER.encodeWithTag(writer, 2, value.getCodec());
                }
            }
        };
    }

    public VideoSender() {
        this(null, null, null, 0, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoSender copy$default(VideoSender videoSender, Codec codec, List list, TrackType trackType, int i13, DegradationPreference degradationPreference, C26624l c26624l, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            codec = videoSender.codec;
        }
        if ((i14 & 2) != 0) {
            list = videoSender.layers;
        }
        if ((i14 & 4) != 0) {
            trackType = videoSender.track_type;
        }
        if ((i14 & 8) != 0) {
            i13 = videoSender.publish_option_id;
        }
        if ((i14 & 16) != 0) {
            degradationPreference = videoSender.degradation_preference;
        }
        if ((i14 & 32) != 0) {
            c26624l = videoSender.unknownFields();
        }
        DegradationPreference degradationPreference2 = degradationPreference;
        C26624l c26624l2 = c26624l;
        return videoSender.copy(codec, list, trackType, i13, degradationPreference2, c26624l2);
    }

    public final VideoSender copy(Codec codec, List<VideoLayerSetting> layers, TrackType track_type, int publish_option_id, DegradationPreference degradation_preference, C26624l unknownFields) {
        AbstractC22676k.m65750j(layers, "layers");
        AbstractC22676k.m65750j(track_type, "track_type");
        AbstractC22676k.m65750j(degradation_preference, "degradation_preference");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new VideoSender(codec, layers, track_type, publish_option_id, degradation_preference, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof VideoSender)) {
            return false;
        }
        VideoSender videoSender = (VideoSender) other;
        return AbstractC22676k.m65745e(unknownFields(), videoSender.unknownFields()) && AbstractC22676k.m65745e(this.codec, videoSender.codec) && AbstractC22676k.m65745e(this.layers, videoSender.layers) && this.track_type == videoSender.track_type && this.publish_option_id == videoSender.publish_option_id && this.degradation_preference == videoSender.degradation_preference;
    }

    public final Codec getCodec() {
        return this.codec;
    }

    public final DegradationPreference getDegradation_preference() {
        return this.degradation_preference;
    }

    public final List<VideoLayerSetting> getLayers() {
        return this.layers;
    }

    public final int getPublish_option_id() {
        return this.publish_option_id;
    }

    public final TrackType getTrack_type() {
        return this.track_type;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Codec codec = this.codec;
        int iHashCode2 = this.degradation_preference.hashCode() + AbstractC11266d.m30448b(this.publish_option_id, (this.track_type.hashCode() + AbstractC11895b.m31983b((iHashCode + (codec != null ? codec.hashCode() : 0)) * 37, 37, this.layers)) * 37, 37);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134517newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        Codec codec = this.codec;
        if (codec != null) {
            arrayList.add("codec=" + codec);
        }
        if (!this.layers.isEmpty()) {
            AbstractC26725a.m79513q("layers=", this.layers, arrayList);
        }
        arrayList.add("track_type=" + this.track_type);
        AbstractC38963t7.m124389s(this.publish_option_id, "publish_option_id=", arrayList);
        arrayList.add("degradation_preference=" + this.degradation_preference);
        return AbstractC25265s.m74110N0(arrayList, ", ", "VideoSender{", "}", null, 56);
    }

    public /* synthetic */ VideoSender(Codec codec, List list, TrackType trackType, int i13, DegradationPreference degradationPreference, C26624l c26624l, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : codec, (i14 & 2) != 0 ? C25271y.f99162w : list, (i14 & 4) != 0 ? TrackType.TRACK_TYPE_UNSPECIFIED : trackType, (i14 & 8) != 0 ? 0 : i13, (i14 & 16) != 0 ? DegradationPreference.DEGRADATION_PREFERENCE_UNSPECIFIED : degradationPreference, (i14 & 32) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134517newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoSender(Codec codec, List<VideoLayerSetting> layers, TrackType track_type, int i13, DegradationPreference degradation_preference, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(layers, "layers");
        AbstractC22676k.m65750j(track_type, "track_type");
        AbstractC22676k.m65750j(degradation_preference, "degradation_preference");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.codec = codec;
        this.track_type = track_type;
        this.publish_option_id = i13;
        this.degradation_preference = degradation_preference;
        this.layers = AbstractC32103e.m99886h("layers", layers);
    }
}
