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
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u0016¨\u0006\u001f"}, m65681d2 = {"Lstream/video/sfu/models/StreamQuality;", "Lcom/squareup/wire/l;", "", "Lstream/video/sfu/models/VideoQuality;", "video_quality", "", "user_id", "Lne3/l;", "unknownFields", "<init>", "(Lstream/video/sfu/models/VideoQuality;Ljava/lang/String;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lstream/video/sfu/models/VideoQuality;Ljava/lang/String;Lne3/l;)Lstream/video/sfu/models/StreamQuality;", "Lstream/video/sfu/models/VideoQuality;", "getVideo_quality", "()Lstream/video/sfu/models/VideoQuality;", "Ljava/lang/String;", "getUser_id", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class StreamQuality extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userId", label = EnumC5595z.f22132F, tag = 2)
    private final String user_id;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.VideoQuality#ADAPTER", jsonName = "videoQuality", label = EnumC5595z.f22132F, tag = 1)
    private final VideoQuality video_quality;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(StreamQuality.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.models.StreamQuality$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public StreamQuality decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                Object objDecode = VideoQuality.VIDEO_QUALITY_LOW_UNSPECIFIED;
                long jM16807d = reader.m16807d();
                Object objDecode2 = "";
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new StreamQuality((VideoQuality) objDecode, (String) objDecode2, reader.m16808e(jM16807d));
                    }
                    if (iM16810g == 1) {
                        try {
                            objDecode = VideoQuality.ADAPTER.decode(reader);
                        } catch (ProtoAdapter$EnumConstantNotFoundException e5) {
                            reader.m16804a(iM16810g, EnumC5573d.VARINT, Long.valueOf(e5.f22081w));
                        }
                    } else if (iM16810g != 2) {
                        reader.m16813j(iM16810g);
                    } else {
                        objDecode2 = AbstractC5586q.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(StreamQuality value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (value.getVideo_quality() != VideoQuality.VIDEO_QUALITY_LOW_UNSPECIFIED) {
                    iMo79253d += VideoQuality.ADAPTER.encodedSizeWithTag(1, value.getVideo_quality());
                }
                return !AbstractC22676k.m65745e(value.getUser_id(), "") ? AbstractC5586q.STRING.encodedSizeWithTag(2, value.getUser_id()) + iMo79253d : iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public StreamQuality redact(StreamQuality value) {
                AbstractC22676k.m65750j(value, "value");
                return StreamQuality.copy$default(value, null, null, C26624l.f105881E, 3, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, StreamQuality value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (value.getVideo_quality() != VideoQuality.VIDEO_QUALITY_LOW_UNSPECIFIED) {
                    VideoQuality.ADAPTER.encodeWithTag(writer, 1, value.getVideo_quality());
                }
                if (!AbstractC22676k.m65745e(value.getUser_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getUser_id());
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, StreamQuality value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (!AbstractC22676k.m65745e(value.getUser_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getUser_id());
                }
                if (value.getVideo_quality() != VideoQuality.VIDEO_QUALITY_LOW_UNSPECIFIED) {
                    VideoQuality.ADAPTER.encodeWithTag(writer, 1, value.getVideo_quality());
                }
            }
        };
    }

    public StreamQuality() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ StreamQuality copy$default(StreamQuality streamQuality, VideoQuality videoQuality, String str, C26624l c26624l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            videoQuality = streamQuality.video_quality;
        }
        if ((i13 & 2) != 0) {
            str = streamQuality.user_id;
        }
        if ((i13 & 4) != 0) {
            c26624l = streamQuality.unknownFields();
        }
        return streamQuality.copy(videoQuality, str, c26624l);
    }

    public final StreamQuality copy(VideoQuality video_quality, String user_id, C26624l unknownFields) {
        AbstractC22676k.m65750j(video_quality, "video_quality");
        AbstractC22676k.m65750j(user_id, "user_id");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new StreamQuality(video_quality, user_id, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamQuality)) {
            return false;
        }
        StreamQuality streamQuality = (StreamQuality) other;
        return AbstractC22676k.m65745e(unknownFields(), streamQuality.unknownFields()) && this.video_quality == streamQuality.video_quality && AbstractC22676k.m65745e(this.user_id, streamQuality.user_id);
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public final VideoQuality getVideo_quality() {
        return this.video_quality;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = this.user_id.hashCode() + ((this.video_quality.hashCode() + (unknownFields().hashCode() * 37)) * 37);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134544newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("video_quality=" + this.video_quality);
        AbstractC21702c.m61149t(arrayList, this.user_id, "user_id=");
        return AbstractC25265s.m74110N0(arrayList, ", ", "StreamQuality{", "}", null, 56);
    }

    public /* synthetic */ StreamQuality(VideoQuality videoQuality, String str, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? VideoQuality.VIDEO_QUALITY_LOW_UNSPECIFIED : videoQuality, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134544newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamQuality(VideoQuality video_quality, String user_id, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(video_quality, "video_quality");
        AbstractC22676k.m65750j(user_id, "user_id");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.video_quality = video_quality;
        this.user_id = user_id;
    }
}
