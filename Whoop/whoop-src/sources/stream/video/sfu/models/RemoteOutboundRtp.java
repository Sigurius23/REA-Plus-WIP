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
import hc3.AbstractC17176i;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B1\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b!\u0010 ¨\u0006#"}, m65681d2 = {"Lstream/video/sfu/models/RemoteOutboundRtp;", "Lcom/squareup/wire/l;", "", "Lstream/video/sfu/models/RtpBase;", "base", "", "jitter_seconds", "round_trip_time_s", "Lne3/l;", "unknownFields", "<init>", "(Lstream/video/sfu/models/RtpBase;DDLne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lstream/video/sfu/models/RtpBase;DDLne3/l;)Lstream/video/sfu/models/RemoteOutboundRtp;", "Lstream/video/sfu/models/RtpBase;", "getBase", "()Lstream/video/sfu/models/RtpBase;", "D", "getJitter_seconds", "()D", "getRound_trip_time_s", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class RemoteOutboundRtp extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.RtpBase#ADAPTER", label = EnumC5595z.f22132F, tag = 1)
    private final RtpBase base;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "jitterSeconds", label = EnumC5595z.f22132F, tag = 2)
    private final double jitter_seconds;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "roundTripTimeS", label = EnumC5595z.f22132F, tag = 3)
    private final double round_trip_time_s;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(RemoteOutboundRtp.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.models.RemoteOutboundRtp$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public RemoteOutboundRtp decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                long jM16807d = reader.m16807d();
                Object objDecode = null;
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new RemoteOutboundRtp((RtpBase) objDecode, dDoubleValue, dDoubleValue2, reader.m16808e(jM16807d));
                    }
                    if (iM16810g == 1) {
                        objDecode = RtpBase.ADAPTER.decode(reader);
                    } else if (iM16810g == 2) {
                        dDoubleValue = ((Number) AbstractC5586q.DOUBLE.decode(reader)).doubleValue();
                    } else if (iM16810g != 3) {
                        reader.m16813j(iM16810g);
                    } else {
                        dDoubleValue2 = ((Number) AbstractC5586q.DOUBLE.decode(reader)).doubleValue();
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(RemoteOutboundRtp value) {
                Double dValueOf = Double.valueOf(0.0d);
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (value.getBase() != null) {
                    iMo79253d += RtpBase.ADAPTER.encodedSizeWithTag(1, value.getBase());
                }
                if (!Double.valueOf(value.getJitter_seconds()).equals(dValueOf)) {
                    iMo79253d += AbstractC5586q.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getJitter_seconds()));
                }
                return !Double.valueOf(value.getRound_trip_time_s()).equals(dValueOf) ? AbstractC5586q.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getRound_trip_time_s())) + iMo79253d : iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public RemoteOutboundRtp redact(RemoteOutboundRtp value) {
                AbstractC22676k.m65750j(value, "value");
                RtpBase base = value.getBase();
                return RemoteOutboundRtp.copy$default(value, base != null ? (RtpBase) RtpBase.ADAPTER.redact(base) : null, 0.0d, 0.0d, C26624l.f105881E, 6, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, RemoteOutboundRtp value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (value.getBase() != null) {
                    RtpBase.ADAPTER.encodeWithTag(writer, 1, value.getBase());
                }
                if (!Double.valueOf(value.getJitter_seconds()).equals(dValueOf)) {
                    AbstractC5586q.DOUBLE.encodeWithTag(writer, 2, Double.valueOf(value.getJitter_seconds()));
                }
                if (!Double.valueOf(value.getRound_trip_time_s()).equals(dValueOf)) {
                    AbstractC5586q.DOUBLE.encodeWithTag(writer, 3, Double.valueOf(value.getRound_trip_time_s()));
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, RemoteOutboundRtp value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                Double dValueOf = Double.valueOf(value.getRound_trip_time_s());
                Double dValueOf2 = Double.valueOf(0.0d);
                if (!dValueOf.equals(dValueOf2)) {
                    AbstractC5586q.DOUBLE.encodeWithTag(writer, 3, Double.valueOf(value.getRound_trip_time_s()));
                }
                if (!Double.valueOf(value.getJitter_seconds()).equals(dValueOf2)) {
                    AbstractC5586q.DOUBLE.encodeWithTag(writer, 2, Double.valueOf(value.getJitter_seconds()));
                }
                if (value.getBase() != null) {
                    RtpBase.ADAPTER.encodeWithTag(writer, 1, value.getBase());
                }
            }
        };
    }

    public RemoteOutboundRtp() {
        this(null, 0.0d, 0.0d, null, 15, null);
    }

    public static /* synthetic */ RemoteOutboundRtp copy$default(RemoteOutboundRtp remoteOutboundRtp, RtpBase rtpBase, double d3, double d14, C26624l c26624l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            rtpBase = remoteOutboundRtp.base;
        }
        if ((i13 & 2) != 0) {
            d3 = remoteOutboundRtp.jitter_seconds;
        }
        if ((i13 & 4) != 0) {
            d14 = remoteOutboundRtp.round_trip_time_s;
        }
        if ((i13 & 8) != 0) {
            c26624l = remoteOutboundRtp.unknownFields();
        }
        C26624l c26624l2 = c26624l;
        return remoteOutboundRtp.copy(rtpBase, d3, d14, c26624l2);
    }

    public final RemoteOutboundRtp copy(RtpBase base, double jitter_seconds, double round_trip_time_s, C26624l unknownFields) {
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new RemoteOutboundRtp(base, jitter_seconds, round_trip_time_s, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RemoteOutboundRtp)) {
            return false;
        }
        RemoteOutboundRtp remoteOutboundRtp = (RemoteOutboundRtp) other;
        return AbstractC22676k.m65745e(unknownFields(), remoteOutboundRtp.unknownFields()) && AbstractC22676k.m65745e(this.base, remoteOutboundRtp.base) && this.jitter_seconds == remoteOutboundRtp.jitter_seconds && this.round_trip_time_s == remoteOutboundRtp.round_trip_time_s;
    }

    public final RtpBase getBase() {
        return this.base;
    }

    public final double getJitter_seconds() {
        return this.jitter_seconds;
    }

    public final double getRound_trip_time_s() {
        return this.round_trip_time_s;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        RtpBase rtpBase = this.base;
        int iHashCode2 = Double.hashCode(this.round_trip_time_s) + AbstractC17176i.m48499a((iHashCode + (rtpBase != null ? rtpBase.hashCode() : 0)) * 37, 37, this.jitter_seconds);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134541newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        RtpBase rtpBase = this.base;
        if (rtpBase != null) {
            arrayList.add("base=" + rtpBase);
        }
        arrayList.add("jitter_seconds=" + this.jitter_seconds);
        arrayList.add("round_trip_time_s=" + this.round_trip_time_s);
        return AbstractC25265s.m74110N0(arrayList, ", ", "RemoteOutboundRtp{", "}", null, 56);
    }

    public /* synthetic */ RemoteOutboundRtp(RtpBase rtpBase, double d3, double d14, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : rtpBase, (i13 & 2) != 0 ? 0.0d : d3, (i13 & 4) != 0 ? 0.0d : d14, (i13 & 8) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134541newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteOutboundRtp(RtpBase rtpBase, double d3, double d14, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.base = rtpBase;
        this.jitter_seconds = d3;
        this.round_trip_time_s = d14;
    }
}
