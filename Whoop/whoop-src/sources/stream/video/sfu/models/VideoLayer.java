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
import jh3.AbstractC21702c;
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
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(BE\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJK\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b$\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, m65681d2 = {"Lstream/video/sfu/models/VideoLayer;", "Lcom/squareup/wire/l;", "", "", "rid", "Lstream/video/sfu/models/VideoDimension;", "video_dimension", "", "bitrate", "fps", "Lstream/video/sfu/models/VideoQuality;", "quality", "Lne3/l;", "unknownFields", "<init>", "(Ljava/lang/String;Lstream/video/sfu/models/VideoDimension;IILstream/video/sfu/models/VideoQuality;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lstream/video/sfu/models/VideoDimension;IILstream/video/sfu/models/VideoQuality;Lne3/l;)Lstream/video/sfu/models/VideoLayer;", "Ljava/lang/String;", "getRid", "Lstream/video/sfu/models/VideoDimension;", "getVideo_dimension", "()Lstream/video/sfu/models/VideoDimension;", "I", "getBitrate", "getFps", "Lstream/video/sfu/models/VideoQuality;", "getQuality", "()Lstream/video/sfu/models/VideoQuality;", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class VideoLayer extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = EnumC5595z.f22132F, tag = 4)
    private final int bitrate;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = EnumC5595z.f22132F, tag = 5)
    private final int fps;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.VideoQuality#ADAPTER", label = EnumC5595z.f22132F, tag = 6)
    private final VideoQuality quality;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = EnumC5595z.f22132F, tag = 1)
    private final String rid;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.VideoDimension#ADAPTER", jsonName = "videoDimension", label = EnumC5595z.f22132F, tag = 2)
    private final VideoDimension video_dimension;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(VideoLayer.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.models.VideoLayer$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public VideoLayer decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                Object objDecode = VideoQuality.VIDEO_QUALITY_LOW_UNSPECIFIED;
                long jM16807d = reader.m16807d();
                int iIntValue = 0;
                int iIntValue2 = 0;
                Object objDecode2 = null;
                Object objDecode3 = "";
                while (true) {
                    Object obj = objDecode;
                    while (true) {
                        int iM16810g = reader.m16810g();
                        if (iM16810g == -1) {
                            return new VideoLayer((String) objDecode3, (VideoDimension) objDecode2, iIntValue, iIntValue2, (VideoQuality) obj, reader.m16808e(jM16807d));
                        }
                        if (iM16810g == 1) {
                            objDecode3 = AbstractC5586q.STRING.decode(reader);
                        } else if (iM16810g == 2) {
                            objDecode2 = VideoDimension.ADAPTER.decode(reader);
                        } else if (iM16810g == 4) {
                            iIntValue = ((Number) AbstractC5586q.UINT32.decode(reader)).intValue();
                        } else if (iM16810g == 5) {
                            iIntValue2 = ((Number) AbstractC5586q.UINT32.decode(reader)).intValue();
                        } else if (iM16810g != 6) {
                            reader.m16813j(iM16810g);
                        } else {
                            try {
                                objDecode = VideoQuality.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter$EnumConstantNotFoundException e5) {
                                reader.m16804a(iM16810g, EnumC5573d.VARINT, Long.valueOf(e5.f22081w));
                            }
                        }
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(VideoLayer value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (!AbstractC22676k.m65745e(value.getRid(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(1, value.getRid());
                }
                if (value.getVideo_dimension() != null) {
                    iMo79253d += VideoDimension.ADAPTER.encodedSizeWithTag(2, value.getVideo_dimension());
                }
                if (value.getBitrate() != 0) {
                    iMo79253d += AbstractC5586q.UINT32.encodedSizeWithTag(4, Integer.valueOf(value.getBitrate()));
                }
                if (value.getFps() != 0) {
                    iMo79253d += AbstractC5586q.UINT32.encodedSizeWithTag(5, Integer.valueOf(value.getFps()));
                }
                return value.getQuality() != VideoQuality.VIDEO_QUALITY_LOW_UNSPECIFIED ? VideoQuality.ADAPTER.encodedSizeWithTag(6, value.getQuality()) + iMo79253d : iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public VideoLayer redact(VideoLayer value) {
                AbstractC22676k.m65750j(value, "value");
                VideoDimension video_dimension = value.getVideo_dimension();
                return VideoLayer.copy$default(value, null, video_dimension != null ? (VideoDimension) VideoDimension.ADAPTER.redact(video_dimension) : null, 0, 0, null, C26624l.f105881E, 29, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, VideoLayer value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (!AbstractC22676k.m65745e(value.getRid(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 1, value.getRid());
                }
                if (value.getVideo_dimension() != null) {
                    VideoDimension.ADAPTER.encodeWithTag(writer, 2, value.getVideo_dimension());
                }
                if (value.getBitrate() != 0) {
                    AbstractC5586q.UINT32.encodeWithTag(writer, 4, Integer.valueOf(value.getBitrate()));
                }
                if (value.getFps() != 0) {
                    AbstractC5586q.UINT32.encodeWithTag(writer, 5, Integer.valueOf(value.getFps()));
                }
                if (value.getQuality() != VideoQuality.VIDEO_QUALITY_LOW_UNSPECIFIED) {
                    VideoQuality.ADAPTER.encodeWithTag(writer, 6, value.getQuality());
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, VideoLayer value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (value.getQuality() != VideoQuality.VIDEO_QUALITY_LOW_UNSPECIFIED) {
                    VideoQuality.ADAPTER.encodeWithTag(writer, 6, value.getQuality());
                }
                if (value.getFps() != 0) {
                    AbstractC5586q.UINT32.encodeWithTag(writer, 5, Integer.valueOf(value.getFps()));
                }
                if (value.getBitrate() != 0) {
                    AbstractC5586q.UINT32.encodeWithTag(writer, 4, Integer.valueOf(value.getBitrate()));
                }
                if (value.getVideo_dimension() != null) {
                    VideoDimension.ADAPTER.encodeWithTag(writer, 2, value.getVideo_dimension());
                }
                if (AbstractC22676k.m65745e(value.getRid(), "")) {
                    return;
                }
                AbstractC5586q.STRING.encodeWithTag(writer, 1, value.getRid());
            }
        };
    }

    public VideoLayer() {
        this(null, null, 0, 0, null, null, 63, null);
    }

    public static /* synthetic */ VideoLayer copy$default(VideoLayer videoLayer, String str, VideoDimension videoDimension, int i13, int i14, VideoQuality videoQuality, C26624l c26624l, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = videoLayer.rid;
        }
        if ((i15 & 2) != 0) {
            videoDimension = videoLayer.video_dimension;
        }
        if ((i15 & 4) != 0) {
            i13 = videoLayer.bitrate;
        }
        if ((i15 & 8) != 0) {
            i14 = videoLayer.fps;
        }
        if ((i15 & 16) != 0) {
            videoQuality = videoLayer.quality;
        }
        if ((i15 & 32) != 0) {
            c26624l = videoLayer.unknownFields();
        }
        VideoQuality videoQuality2 = videoQuality;
        C26624l c26624l2 = c26624l;
        return videoLayer.copy(str, videoDimension, i13, i14, videoQuality2, c26624l2);
    }

    public final VideoLayer copy(String rid, VideoDimension video_dimension, int bitrate, int fps, VideoQuality quality, C26624l unknownFields) {
        AbstractC22676k.m65750j(rid, "rid");
        AbstractC22676k.m65750j(quality, "quality");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new VideoLayer(rid, video_dimension, bitrate, fps, quality, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof VideoLayer)) {
            return false;
        }
        VideoLayer videoLayer = (VideoLayer) other;
        return AbstractC22676k.m65745e(unknownFields(), videoLayer.unknownFields()) && AbstractC22676k.m65745e(this.rid, videoLayer.rid) && AbstractC22676k.m65745e(this.video_dimension, videoLayer.video_dimension) && this.bitrate == videoLayer.bitrate && this.fps == videoLayer.fps && this.quality == videoLayer.quality;
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final int getFps() {
        return this.fps;
    }

    public final VideoQuality getQuality() {
        return this.quality;
    }

    public final String getRid() {
        return this.rid;
    }

    public final VideoDimension getVideo_dimension() {
        return this.video_dimension;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iM30450d = AbstractC11266d.m30450d(unknownFields().hashCode() * 37, 37, this.rid);
        VideoDimension videoDimension = this.video_dimension;
        int iHashCode = this.quality.hashCode() + AbstractC11266d.m30448b(this.fps, AbstractC11266d.m30448b(this.bitrate, (iM30450d + (videoDimension != null ? videoDimension.hashCode() : 0)) * 37, 37), 37);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134548newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC21702c.m61149t(arrayList, this.rid, "rid=");
        VideoDimension videoDimension = this.video_dimension;
        if (videoDimension != null) {
            arrayList.add("video_dimension=" + videoDimension);
        }
        AbstractC38963t7.m124389s(this.bitrate, "bitrate=", arrayList);
        AbstractC38963t7.m124389s(this.fps, "fps=", arrayList);
        arrayList.add("quality=" + this.quality);
        return AbstractC25265s.m74110N0(arrayList, ", ", "VideoLayer{", "}", null, 56);
    }

    public /* synthetic */ VideoLayer(String str, VideoDimension videoDimension, int i13, int i14, VideoQuality videoQuality, C26624l c26624l, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? "" : str, (i15 & 2) != 0 ? null : videoDimension, (i15 & 4) != 0 ? 0 : i13, (i15 & 8) != 0 ? 0 : i14, (i15 & 16) != 0 ? VideoQuality.VIDEO_QUALITY_LOW_UNSPECIFIED : videoQuality, (i15 & 32) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134548newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoLayer(String rid, VideoDimension videoDimension, int i13, int i14, VideoQuality quality, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(rid, "rid");
        AbstractC22676k.m65750j(quality, "quality");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.rid = rid;
        this.video_dimension = videoDimension;
        this.bitrate = i13;
        this.fps = i14;
        this.quality = quality;
    }
}
