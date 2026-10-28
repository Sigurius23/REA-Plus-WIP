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
import l83.InterfaceC23457c;
import m83.AbstractC25265s;
import ne3.C26624l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import stream.video.sfu.models.Codec;
import stream.video.sfu.models.TrackType;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B1\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006$"}, m65681d2 = {"Lstream/video/sfu/event/AudioSender;", "Lcom/squareup/wire/l;", "", "Lstream/video/sfu/models/Codec;", "codec", "Lstream/video/sfu/models/TrackType;", "track_type", "", "publish_option_id", "Lne3/l;", "unknownFields", "<init>", "(Lstream/video/sfu/models/Codec;Lstream/video/sfu/models/TrackType;ILne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lstream/video/sfu/models/Codec;Lstream/video/sfu/models/TrackType;ILne3/l;)Lstream/video/sfu/event/AudioSender;", "Lstream/video/sfu/models/Codec;", "getCodec", "()Lstream/video/sfu/models/Codec;", "Lstream/video/sfu/models/TrackType;", "getTrack_type", "()Lstream/video/sfu/models/TrackType;", "I", "getPublish_option_id", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class AudioSender extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.Codec#ADAPTER", label = EnumC5595z.f22132F, tag = 2)
    private final Codec codec;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "publishOptionId", label = EnumC5595z.f22132F, tag = 4)
    private final int publish_option_id;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.TrackType#ADAPTER", jsonName = "trackType", label = EnumC5595z.f22132F, tag = 3)
    private final TrackType track_type;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(AudioSender.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.event.AudioSender$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public AudioSender decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                Object objDecode = TrackType.TRACK_TYPE_UNSPECIFIED;
                long jM16807d = reader.m16807d();
                Object objDecode2 = null;
                int iIntValue = 0;
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new AudioSender((Codec) objDecode2, (TrackType) objDecode, iIntValue, reader.m16808e(jM16807d));
                    }
                    if (iM16810g == 2) {
                        objDecode2 = Codec.ADAPTER.decode(reader);
                    } else if (iM16810g == 3) {
                        try {
                            objDecode = TrackType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter$EnumConstantNotFoundException e5) {
                            reader.m16804a(iM16810g, EnumC5573d.VARINT, Long.valueOf(e5.f22081w));
                        }
                    } else if (iM16810g != 4) {
                        reader.m16813j(iM16810g);
                    } else {
                        iIntValue = ((Number) AbstractC5586q.INT32.decode(reader)).intValue();
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(AudioSender value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (value.getCodec() != null) {
                    iMo79253d += Codec.ADAPTER.encodedSizeWithTag(2, value.getCodec());
                }
                if (value.getTrack_type() != TrackType.TRACK_TYPE_UNSPECIFIED) {
                    iMo79253d += TrackType.ADAPTER.encodedSizeWithTag(3, value.getTrack_type());
                }
                return value.getPublish_option_id() != 0 ? AbstractC5586q.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getPublish_option_id())) + iMo79253d : iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public AudioSender redact(AudioSender value) {
                AbstractC22676k.m65750j(value, "value");
                Codec codec = value.getCodec();
                return AudioSender.copy$default(value, codec != null ? (Codec) Codec.ADAPTER.redact(codec) : null, null, 0, C26624l.f105881E, 6, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, AudioSender value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (value.getCodec() != null) {
                    Codec.ADAPTER.encodeWithTag(writer, 2, value.getCodec());
                }
                if (value.getTrack_type() != TrackType.TRACK_TYPE_UNSPECIFIED) {
                    TrackType.ADAPTER.encodeWithTag(writer, 3, value.getTrack_type());
                }
                if (value.getPublish_option_id() != 0) {
                    AbstractC5586q.INT32.encodeWithTag(writer, 4, Integer.valueOf(value.getPublish_option_id()));
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, AudioSender value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (value.getPublish_option_id() != 0) {
                    AbstractC5586q.INT32.encodeWithTag(writer, 4, Integer.valueOf(value.getPublish_option_id()));
                }
                if (value.getTrack_type() != TrackType.TRACK_TYPE_UNSPECIFIED) {
                    TrackType.ADAPTER.encodeWithTag(writer, 3, value.getTrack_type());
                }
                if (value.getCodec() != null) {
                    Codec.ADAPTER.encodeWithTag(writer, 2, value.getCodec());
                }
            }
        };
    }

    public AudioSender() {
        this(null, null, 0, null, 15, null);
    }

    public static /* synthetic */ AudioSender copy$default(AudioSender audioSender, Codec codec, TrackType trackType, int i13, C26624l c26624l, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            codec = audioSender.codec;
        }
        if ((i14 & 2) != 0) {
            trackType = audioSender.track_type;
        }
        if ((i14 & 4) != 0) {
            i13 = audioSender.publish_option_id;
        }
        if ((i14 & 8) != 0) {
            c26624l = audioSender.unknownFields();
        }
        return audioSender.copy(codec, trackType, i13, c26624l);
    }

    public final AudioSender copy(Codec codec, TrackType track_type, int publish_option_id, C26624l unknownFields) {
        AbstractC22676k.m65750j(track_type, "track_type");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new AudioSender(codec, track_type, publish_option_id, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AudioSender)) {
            return false;
        }
        AudioSender audioSender = (AudioSender) other;
        return AbstractC22676k.m65745e(unknownFields(), audioSender.unknownFields()) && AbstractC22676k.m65745e(this.codec, audioSender.codec) && this.track_type == audioSender.track_type && this.publish_option_id == audioSender.publish_option_id;
    }

    public final Codec getCodec() {
        return this.codec;
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
        int iHashCode2 = Integer.hashCode(this.publish_option_id) + ((this.track_type.hashCode() + ((iHashCode + (codec != null ? codec.hashCode() : 0)) * 37)) * 37);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134483newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        Codec codec = this.codec;
        if (codec != null) {
            arrayList.add("codec=" + codec);
        }
        arrayList.add("track_type=" + this.track_type);
        AbstractC38963t7.m124389s(this.publish_option_id, "publish_option_id=", arrayList);
        return AbstractC25265s.m74110N0(arrayList, ", ", "AudioSender{", "}", null, 56);
    }

    public /* synthetic */ AudioSender(Codec codec, TrackType trackType, int i13, C26624l c26624l, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : codec, (i14 & 2) != 0 ? TrackType.TRACK_TYPE_UNSPECIFIED : trackType, (i14 & 4) != 0 ? 0 : i13, (i14 & 8) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134483newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioSender(Codec codec, TrackType track_type, int i13, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(track_type, "track_type");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.codec = codec;
        this.track_type = track_type;
        this.publish_option_id = i13;
    }
}
