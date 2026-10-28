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
import l83.InterfaceC23457c;
import m83.AbstractC25265s;
import ne3.C26624l;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0015\u0018\u0000 /2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/BQ\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJW\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b)\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010\u001a¨\u00060"}, m65681d2 = {"Lstream/video/sfu/models/PerformanceStats;", "Lcom/squareup/wire/l;", "", "Lstream/video/sfu/models/TrackType;", "track_type", "Lstream/video/sfu/models/Codec;", "codec", "", "avg_frame_time_ms", "avg_fps", "Lstream/video/sfu/models/VideoDimension;", "video_dimension", "", "target_bitrate", "Lne3/l;", "unknownFields", "<init>", "(Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/Codec;FFLstream/video/sfu/models/VideoDimension;ILne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/Codec;FFLstream/video/sfu/models/VideoDimension;ILne3/l;)Lstream/video/sfu/models/PerformanceStats;", "Lstream/video/sfu/models/TrackType;", "getTrack_type", "()Lstream/video/sfu/models/TrackType;", "Lstream/video/sfu/models/Codec;", "getCodec", "()Lstream/video/sfu/models/Codec;", "F", "getAvg_frame_time_ms", "()F", "getAvg_fps", "Lstream/video/sfu/models/VideoDimension;", "getVideo_dimension", "()Lstream/video/sfu/models/VideoDimension;", "I", "getTarget_bitrate", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class PerformanceStats extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "avgFps", label = EnumC5595z.f22132F, tag = 4)
    private final float avg_fps;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "avgFrameTimeMs", label = EnumC5595z.f22132F, tag = 3)
    private final float avg_frame_time_ms;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.Codec#ADAPTER", label = EnumC5595z.f22132F, tag = 2)
    private final Codec codec;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "targetBitrate", label = EnumC5595z.f22132F, tag = 6)
    private final int target_bitrate;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.TrackType#ADAPTER", jsonName = "trackType", label = EnumC5595z.f22132F, tag = 1)
    private final TrackType track_type;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.VideoDimension#ADAPTER", jsonName = "videoDimension", label = EnumC5595z.f22132F, tag = 5)
    private final VideoDimension video_dimension;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(PerformanceStats.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.models.PerformanceStats$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public PerformanceStats decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                Object objDecode = TrackType.TRACK_TYPE_UNSPECIFIED;
                long jM16807d = reader.m16807d();
                float fFloatValue = 0.0f;
                float fFloatValue2 = 0.0f;
                int iIntValue = 0;
                Object objDecode2 = null;
                Object objDecode3 = null;
                while (true) {
                    Object obj = objDecode;
                    while (true) {
                        int iM16810g = reader.m16810g();
                        if (iM16810g == -1) {
                            return new PerformanceStats((TrackType) obj, (Codec) objDecode2, fFloatValue, fFloatValue2, (VideoDimension) objDecode3, iIntValue, reader.m16808e(jM16807d));
                        }
                        switch (iM16810g) {
                            case 1:
                                try {
                                    objDecode = TrackType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter$EnumConstantNotFoundException e5) {
                                    reader.m16804a(iM16810g, EnumC5573d.VARINT, Long.valueOf(e5.f22081w));
                                }
                                break;
                            case 2:
                                objDecode2 = Codec.ADAPTER.decode(reader);
                                break;
                            case 3:
                                fFloatValue = ((Number) AbstractC5586q.FLOAT.decode(reader)).floatValue();
                                break;
                            case 4:
                                fFloatValue2 = ((Number) AbstractC5586q.FLOAT.decode(reader)).floatValue();
                                break;
                            case 5:
                                objDecode3 = VideoDimension.ADAPTER.decode(reader);
                                break;
                            case 6:
                                iIntValue = ((Number) AbstractC5586q.INT32.decode(reader)).intValue();
                                break;
                            default:
                                reader.m16813j(iM16810g);
                                break;
                        }
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(PerformanceStats value) {
                Float fValueOf = Float.valueOf(0.0f);
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (value.getTrack_type() != TrackType.TRACK_TYPE_UNSPECIFIED) {
                    iMo79253d += TrackType.ADAPTER.encodedSizeWithTag(1, value.getTrack_type());
                }
                if (value.getCodec() != null) {
                    iMo79253d += Codec.ADAPTER.encodedSizeWithTag(2, value.getCodec());
                }
                if (!Float.valueOf(value.getAvg_frame_time_ms()).equals(fValueOf)) {
                    iMo79253d += AbstractC5586q.FLOAT.encodedSizeWithTag(3, Float.valueOf(value.getAvg_frame_time_ms()));
                }
                if (!Float.valueOf(value.getAvg_fps()).equals(fValueOf)) {
                    iMo79253d += AbstractC5586q.FLOAT.encodedSizeWithTag(4, Float.valueOf(value.getAvg_fps()));
                }
                if (value.getVideo_dimension() != null) {
                    iMo79253d += VideoDimension.ADAPTER.encodedSizeWithTag(5, value.getVideo_dimension());
                }
                return value.getTarget_bitrate() != 0 ? AbstractC5586q.INT32.encodedSizeWithTag(6, Integer.valueOf(value.getTarget_bitrate())) + iMo79253d : iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public PerformanceStats redact(PerformanceStats value) {
                AbstractC22676k.m65750j(value, "value");
                Codec codec = value.getCodec();
                Codec codec2 = codec != null ? (Codec) Codec.ADAPTER.redact(codec) : null;
                VideoDimension video_dimension = value.getVideo_dimension();
                return PerformanceStats.copy$default(value, null, codec2, 0.0f, 0.0f, video_dimension != null ? (VideoDimension) VideoDimension.ADAPTER.redact(video_dimension) : null, 0, C26624l.f105881E, 45, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, PerformanceStats value) throws IOException {
                Float fValueOf = Float.valueOf(0.0f);
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (value.getTrack_type() != TrackType.TRACK_TYPE_UNSPECIFIED) {
                    TrackType.ADAPTER.encodeWithTag(writer, 1, value.getTrack_type());
                }
                if (value.getCodec() != null) {
                    Codec.ADAPTER.encodeWithTag(writer, 2, value.getCodec());
                }
                if (!Float.valueOf(value.getAvg_frame_time_ms()).equals(fValueOf)) {
                    AbstractC5586q.FLOAT.encodeWithTag(writer, 3, Float.valueOf(value.getAvg_frame_time_ms()));
                }
                if (!Float.valueOf(value.getAvg_fps()).equals(fValueOf)) {
                    AbstractC5586q.FLOAT.encodeWithTag(writer, 4, Float.valueOf(value.getAvg_fps()));
                }
                if (value.getVideo_dimension() != null) {
                    VideoDimension.ADAPTER.encodeWithTag(writer, 5, value.getVideo_dimension());
                }
                if (value.getTarget_bitrate() != 0) {
                    AbstractC5586q.INT32.encodeWithTag(writer, 6, Integer.valueOf(value.getTarget_bitrate()));
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, PerformanceStats value) throws IOException {
                Float fValueOf = Float.valueOf(0.0f);
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (value.getTarget_bitrate() != 0) {
                    AbstractC5586q.INT32.encodeWithTag(writer, 6, Integer.valueOf(value.getTarget_bitrate()));
                }
                if (value.getVideo_dimension() != null) {
                    VideoDimension.ADAPTER.encodeWithTag(writer, 5, value.getVideo_dimension());
                }
                if (!Float.valueOf(value.getAvg_fps()).equals(fValueOf)) {
                    AbstractC5586q.FLOAT.encodeWithTag(writer, 4, Float.valueOf(value.getAvg_fps()));
                }
                if (!Float.valueOf(value.getAvg_frame_time_ms()).equals(fValueOf)) {
                    AbstractC5586q.FLOAT.encodeWithTag(writer, 3, Float.valueOf(value.getAvg_frame_time_ms()));
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

    public PerformanceStats() {
        this(null, null, 0.0f, 0.0f, null, 0, null, 127, null);
    }

    public static /* synthetic */ PerformanceStats copy$default(PerformanceStats performanceStats, TrackType trackType, Codec codec, float f13, float f14, VideoDimension videoDimension, int i13, C26624l c26624l, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            trackType = performanceStats.track_type;
        }
        if ((i14 & 2) != 0) {
            codec = performanceStats.codec;
        }
        if ((i14 & 4) != 0) {
            f13 = performanceStats.avg_frame_time_ms;
        }
        if ((i14 & 8) != 0) {
            f14 = performanceStats.avg_fps;
        }
        if ((i14 & 16) != 0) {
            videoDimension = performanceStats.video_dimension;
        }
        if ((i14 & 32) != 0) {
            i13 = performanceStats.target_bitrate;
        }
        if ((i14 & 64) != 0) {
            c26624l = performanceStats.unknownFields();
        }
        int i15 = i13;
        C26624l c26624l2 = c26624l;
        VideoDimension videoDimension2 = videoDimension;
        float f15 = f13;
        return performanceStats.copy(trackType, codec, f15, f14, videoDimension2, i15, c26624l2);
    }

    public final PerformanceStats copy(TrackType track_type, Codec codec, float avg_frame_time_ms, float avg_fps, VideoDimension video_dimension, int target_bitrate, C26624l unknownFields) {
        AbstractC22676k.m65750j(track_type, "track_type");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new PerformanceStats(track_type, codec, avg_frame_time_ms, avg_fps, video_dimension, target_bitrate, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PerformanceStats)) {
            return false;
        }
        PerformanceStats performanceStats = (PerformanceStats) other;
        return AbstractC22676k.m65745e(unknownFields(), performanceStats.unknownFields()) && this.track_type == performanceStats.track_type && AbstractC22676k.m65745e(this.codec, performanceStats.codec) && this.avg_frame_time_ms == performanceStats.avg_frame_time_ms && this.avg_fps == performanceStats.avg_fps && AbstractC22676k.m65745e(this.video_dimension, performanceStats.video_dimension) && this.target_bitrate == performanceStats.target_bitrate;
    }

    public final float getAvg_fps() {
        return this.avg_fps;
    }

    public final float getAvg_frame_time_ms() {
        return this.avg_frame_time_ms;
    }

    public final Codec getCodec() {
        return this.codec;
    }

    public final int getTarget_bitrate() {
        return this.target_bitrate;
    }

    public final TrackType getTrack_type() {
        return this.track_type;
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
        int iM30447a = AbstractC11266d.m30447a(this.avg_fps, AbstractC11266d.m30447a(this.avg_frame_time_ms, (iHashCode + (codec != null ? codec.hashCode() : 0)) * 37, 37), 37);
        VideoDimension videoDimension = this.video_dimension;
        int iHashCode2 = Integer.hashCode(this.target_bitrate) + ((iM30447a + (videoDimension != null ? videoDimension.hashCode() : 0)) * 37);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134536newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("track_type=" + this.track_type);
        Codec codec = this.codec;
        if (codec != null) {
            arrayList.add("codec=" + codec);
        }
        arrayList.add("avg_frame_time_ms=" + this.avg_frame_time_ms);
        arrayList.add("avg_fps=" + this.avg_fps);
        VideoDimension videoDimension = this.video_dimension;
        if (videoDimension != null) {
            arrayList.add("video_dimension=" + videoDimension);
        }
        AbstractC38963t7.m124389s(this.target_bitrate, "target_bitrate=", arrayList);
        return AbstractC25265s.m74110N0(arrayList, ", ", "PerformanceStats{", "}", null, 56);
    }

    public /* synthetic */ PerformanceStats(TrackType trackType, Codec codec, float f13, float f14, VideoDimension videoDimension, int i13, C26624l c26624l, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? TrackType.TRACK_TYPE_UNSPECIFIED : trackType, (i14 & 2) != 0 ? null : codec, (i14 & 4) != 0 ? 0.0f : f13, (i14 & 8) != 0 ? 0.0f : f14, (i14 & 16) != 0 ? null : videoDimension, (i14 & 32) != 0 ? 0 : i13, (i14 & 64) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134536newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformanceStats(TrackType track_type, Codec codec, float f13, float f14, VideoDimension videoDimension, int i13, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(track_type, "track_type");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.track_type = track_type;
        this.codec = codec;
        this.avg_frame_time_ms = f13;
        this.avg_fps = f14;
        this.video_dimension = videoDimension;
        this.target_bitrate = i13;
    }
}
