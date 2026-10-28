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
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import s30.AbstractC32103e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B+\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m65681d2 = {"Lstream/video/sfu/models/SubscribeOption;", "Lcom/squareup/wire/l;", "", "Lstream/video/sfu/models/TrackType;", "track_type", "", "Lstream/video/sfu/models/Codec;", "codecs", "Lne3/l;", "unknownFields", "<init>", "(Lstream/video/sfu/models/TrackType;Ljava/util/List;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lstream/video/sfu/models/TrackType;Ljava/util/List;Lne3/l;)Lstream/video/sfu/models/SubscribeOption;", "Lstream/video/sfu/models/TrackType;", "getTrack_type", "()Lstream/video/sfu/models/TrackType;", "Ljava/util/List;", "getCodecs", "()Ljava/util/List;", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class SubscribeOption extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.Codec#ADAPTER", label = EnumC5595z.f22136y, tag = 2)
    private final List<Codec> codecs;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.TrackType#ADAPTER", jsonName = "trackType", label = EnumC5595z.f22132F, tag = 1)
    private final TrackType track_type;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(SubscribeOption.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.models.SubscribeOption$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public SubscribeOption decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                Object objDecode = TrackType.TRACK_TYPE_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                long jM16807d = reader.m16807d();
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new SubscribeOption((TrackType) objDecode, arrayList, reader.m16808e(jM16807d));
                    }
                    if (iM16810g == 1) {
                        try {
                            objDecode = TrackType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter$EnumConstantNotFoundException e5) {
                            reader.m16804a(iM16810g, EnumC5573d.VARINT, Long.valueOf(e5.f22081w));
                        }
                    } else if (iM16810g != 2) {
                        reader.m16813j(iM16810g);
                    } else {
                        arrayList.add(Codec.ADAPTER.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(SubscribeOption value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (value.getTrack_type() != TrackType.TRACK_TYPE_UNSPECIFIED) {
                    iMo79253d += TrackType.ADAPTER.encodedSizeWithTag(1, value.getTrack_type());
                }
                return Codec.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getCodecs()) + iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public SubscribeOption redact(SubscribeOption value) {
                AbstractC22676k.m65750j(value, "value");
                return SubscribeOption.copy$default(value, null, AbstractC32103e.m99879a(value.getCodecs(), Codec.ADAPTER), C26624l.f105881E, 1, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, SubscribeOption value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (value.getTrack_type() != TrackType.TRACK_TYPE_UNSPECIFIED) {
                    TrackType.ADAPTER.encodeWithTag(writer, 1, value.getTrack_type());
                }
                Codec.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.getCodecs());
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, SubscribeOption value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                Codec.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.getCodecs());
                if (value.getTrack_type() != TrackType.TRACK_TYPE_UNSPECIFIED) {
                    TrackType.ADAPTER.encodeWithTag(writer, 1, value.getTrack_type());
                }
            }
        };
    }

    public SubscribeOption() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubscribeOption copy$default(SubscribeOption subscribeOption, TrackType trackType, List list, C26624l c26624l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            trackType = subscribeOption.track_type;
        }
        if ((i13 & 2) != 0) {
            list = subscribeOption.codecs;
        }
        if ((i13 & 4) != 0) {
            c26624l = subscribeOption.unknownFields();
        }
        return subscribeOption.copy(trackType, list, c26624l);
    }

    public final SubscribeOption copy(TrackType track_type, List<Codec> codecs, C26624l unknownFields) {
        AbstractC22676k.m65750j(track_type, "track_type");
        AbstractC22676k.m65750j(codecs, "codecs");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new SubscribeOption(track_type, codecs, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SubscribeOption)) {
            return false;
        }
        SubscribeOption subscribeOption = (SubscribeOption) other;
        return AbstractC22676k.m65745e(unknownFields(), subscribeOption.unknownFields()) && this.track_type == subscribeOption.track_type && AbstractC22676k.m65745e(this.codecs, subscribeOption.codecs);
    }

    public final List<Codec> getCodecs() {
        return this.codecs;
    }

    public final TrackType getTrack_type() {
        return this.track_type;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = this.codecs.hashCode() + ((this.track_type.hashCode() + (unknownFields().hashCode() * 37)) * 37);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134545newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("track_type=" + this.track_type);
        if (!this.codecs.isEmpty()) {
            AbstractC26725a.m79513q("codecs=", this.codecs, arrayList);
        }
        return AbstractC25265s.m74110N0(arrayList, ", ", "SubscribeOption{", "}", null, 56);
    }

    public /* synthetic */ SubscribeOption(TrackType trackType, List list, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? TrackType.TRACK_TYPE_UNSPECIFIED : trackType, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134545newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribeOption(TrackType track_type, List<Codec> codecs, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(track_type, "track_type");
        AbstractC22676k.m65750j(codecs, "codecs");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.track_type = track_type;
        this.codecs = AbstractC32103e.m99886h("codecs", codecs);
    }
}
