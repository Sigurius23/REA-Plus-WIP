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
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'BE\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJK\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b#\u0010\"R\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b$\u0010\"R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0017¨\u0006("}, m65681d2 = {"Lstream/video/sfu/models/OutboundRtp;", "Lcom/squareup/wire/l;", "", "Lstream/video/sfu/models/RtpBase;", "base", "", "fps", "avg_encode_time_seconds", "bitrate_bps", "", "min_dimension_px", "Lne3/l;", "unknownFields", "<init>", "(Lstream/video/sfu/models/RtpBase;DDDILne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lstream/video/sfu/models/RtpBase;DDDILne3/l;)Lstream/video/sfu/models/OutboundRtp;", "Lstream/video/sfu/models/RtpBase;", "getBase", "()Lstream/video/sfu/models/RtpBase;", "D", "getFps", "()D", "getAvg_encode_time_seconds", "getBitrate_bps", "I", "getMin_dimension_px", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class OutboundRtp extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "avgEncodeTimeSeconds", label = EnumC5595z.f22132F, tag = 11)
    private final double avg_encode_time_seconds;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.RtpBase#ADAPTER", label = EnumC5595z.f22132F, tag = 1)
    private final RtpBase base;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "bitrateBps", label = EnumC5595z.f22132F, tag = 12)
    private final double bitrate_bps;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = EnumC5595z.f22132F, tag = 10)
    private final double fps;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "minDimensionPx", label = EnumC5595z.f22132F, tag = 13)
    private final int min_dimension_px;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(OutboundRtp.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.models.OutboundRtp$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public OutboundRtp decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                long jM16807d = reader.m16807d();
                Object objDecode = null;
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                int iIntValue = 0;
                double dDoubleValue3 = 0.0d;
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new OutboundRtp((RtpBase) objDecode, dDoubleValue3, dDoubleValue, dDoubleValue2, iIntValue, reader.m16808e(jM16807d));
                    }
                    if (iM16810g != 1) {
                        switch (iM16810g) {
                            case 10:
                                dDoubleValue3 = ((Number) AbstractC5586q.DOUBLE.decode(reader)).doubleValue();
                                break;
                            case 11:
                                dDoubleValue = ((Number) AbstractC5586q.DOUBLE.decode(reader)).doubleValue();
                                break;
                            case 12:
                                dDoubleValue2 = ((Number) AbstractC5586q.DOUBLE.decode(reader)).doubleValue();
                                break;
                            case 13:
                                iIntValue = ((Number) AbstractC5586q.UINT32.decode(reader)).intValue();
                                break;
                            default:
                                reader.m16813j(iM16810g);
                                break;
                        }
                    } else {
                        objDecode = RtpBase.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(OutboundRtp value) {
                Double dValueOf = Double.valueOf(0.0d);
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (value.getBase() != null) {
                    iMo79253d += RtpBase.ADAPTER.encodedSizeWithTag(1, value.getBase());
                }
                if (!Double.valueOf(value.getFps()).equals(dValueOf)) {
                    iMo79253d += AbstractC5586q.DOUBLE.encodedSizeWithTag(10, Double.valueOf(value.getFps()));
                }
                if (!Double.valueOf(value.getAvg_encode_time_seconds()).equals(dValueOf)) {
                    iMo79253d += AbstractC5586q.DOUBLE.encodedSizeWithTag(11, Double.valueOf(value.getAvg_encode_time_seconds()));
                }
                if (!Double.valueOf(value.getBitrate_bps()).equals(dValueOf)) {
                    iMo79253d += AbstractC5586q.DOUBLE.encodedSizeWithTag(12, Double.valueOf(value.getBitrate_bps()));
                }
                return value.getMin_dimension_px() != 0 ? AbstractC5586q.UINT32.encodedSizeWithTag(13, Integer.valueOf(value.getMin_dimension_px())) + iMo79253d : iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public OutboundRtp redact(OutboundRtp value) {
                AbstractC22676k.m65750j(value, "value");
                RtpBase base = value.getBase();
                return OutboundRtp.copy$default(value, base != null ? (RtpBase) RtpBase.ADAPTER.redact(base) : null, 0.0d, 0.0d, 0.0d, 0, C26624l.f105881E, 30, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, OutboundRtp value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (value.getBase() != null) {
                    RtpBase.ADAPTER.encodeWithTag(writer, 1, value.getBase());
                }
                if (!Double.valueOf(value.getFps()).equals(dValueOf)) {
                    AbstractC5586q.DOUBLE.encodeWithTag(writer, 10, Double.valueOf(value.getFps()));
                }
                if (!Double.valueOf(value.getAvg_encode_time_seconds()).equals(dValueOf)) {
                    AbstractC5586q.DOUBLE.encodeWithTag(writer, 11, Double.valueOf(value.getAvg_encode_time_seconds()));
                }
                if (!Double.valueOf(value.getBitrate_bps()).equals(dValueOf)) {
                    AbstractC5586q.DOUBLE.encodeWithTag(writer, 12, Double.valueOf(value.getBitrate_bps()));
                }
                if (value.getMin_dimension_px() != 0) {
                    AbstractC5586q.UINT32.encodeWithTag(writer, 13, Integer.valueOf(value.getMin_dimension_px()));
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, OutboundRtp value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (value.getMin_dimension_px() != 0) {
                    AbstractC5586q.UINT32.encodeWithTag(writer, 13, Integer.valueOf(value.getMin_dimension_px()));
                }
                if (!Double.valueOf(value.getBitrate_bps()).equals(dValueOf)) {
                    AbstractC5586q.DOUBLE.encodeWithTag(writer, 12, Double.valueOf(value.getBitrate_bps()));
                }
                if (!Double.valueOf(value.getAvg_encode_time_seconds()).equals(dValueOf)) {
                    AbstractC5586q.DOUBLE.encodeWithTag(writer, 11, Double.valueOf(value.getAvg_encode_time_seconds()));
                }
                if (!Double.valueOf(value.getFps()).equals(dValueOf)) {
                    AbstractC5586q.DOUBLE.encodeWithTag(writer, 10, Double.valueOf(value.getFps()));
                }
                if (value.getBase() != null) {
                    RtpBase.ADAPTER.encodeWithTag(writer, 1, value.getBase());
                }
            }
        };
    }

    public OutboundRtp() {
        this(null, 0.0d, 0.0d, 0.0d, 0, null, 63, null);
    }

    public static /* synthetic */ OutboundRtp copy$default(OutboundRtp outboundRtp, RtpBase rtpBase, double d3, double d14, double d15, int i13, C26624l c26624l, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            rtpBase = outboundRtp.base;
        }
        if ((i14 & 2) != 0) {
            d3 = outboundRtp.fps;
        }
        if ((i14 & 4) != 0) {
            d14 = outboundRtp.avg_encode_time_seconds;
        }
        if ((i14 & 8) != 0) {
            d15 = outboundRtp.bitrate_bps;
        }
        if ((i14 & 16) != 0) {
            i13 = outboundRtp.min_dimension_px;
        }
        if ((i14 & 32) != 0) {
            c26624l = outboundRtp.unknownFields();
        }
        double d16 = d15;
        double d17 = d14;
        return outboundRtp.copy(rtpBase, d3, d17, d16, i13, c26624l);
    }

    public final OutboundRtp copy(RtpBase base, double fps, double avg_encode_time_seconds, double bitrate_bps, int min_dimension_px, C26624l unknownFields) {
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new OutboundRtp(base, fps, avg_encode_time_seconds, bitrate_bps, min_dimension_px, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OutboundRtp)) {
            return false;
        }
        OutboundRtp outboundRtp = (OutboundRtp) other;
        return AbstractC22676k.m65745e(unknownFields(), outboundRtp.unknownFields()) && AbstractC22676k.m65745e(this.base, outboundRtp.base) && this.fps == outboundRtp.fps && this.avg_encode_time_seconds == outboundRtp.avg_encode_time_seconds && this.bitrate_bps == outboundRtp.bitrate_bps && this.min_dimension_px == outboundRtp.min_dimension_px;
    }

    public final double getAvg_encode_time_seconds() {
        return this.avg_encode_time_seconds;
    }

    public final RtpBase getBase() {
        return this.base;
    }

    public final double getBitrate_bps() {
        return this.bitrate_bps;
    }

    public final double getFps() {
        return this.fps;
    }

    public final int getMin_dimension_px() {
        return this.min_dimension_px;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        RtpBase rtpBase = this.base;
        int iHashCode2 = Integer.hashCode(this.min_dimension_px) + AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a((iHashCode + (rtpBase != null ? rtpBase.hashCode() : 0)) * 37, 37, this.fps), 37, this.avg_encode_time_seconds), 37, this.bitrate_bps);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134533newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        RtpBase rtpBase = this.base;
        if (rtpBase != null) {
            arrayList.add("base=" + rtpBase);
        }
        arrayList.add("fps=" + this.fps);
        arrayList.add("avg_encode_time_seconds=" + this.avg_encode_time_seconds);
        arrayList.add("bitrate_bps=" + this.bitrate_bps);
        AbstractC38963t7.m124389s(this.min_dimension_px, "min_dimension_px=", arrayList);
        return AbstractC25265s.m74110N0(arrayList, ", ", "OutboundRtp{", "}", null, 56);
    }

    public /* synthetic */ OutboundRtp(RtpBase rtpBase, double d3, double d14, double d15, int i13, C26624l c26624l, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : rtpBase, (i14 & 2) != 0 ? 0.0d : d3, (i14 & 4) != 0 ? 0.0d : d14, (i14 & 8) != 0 ? 0.0d : d15, (i14 & 16) != 0 ? 0 : i13, (i14 & 32) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134533newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutboundRtp(RtpBase rtpBase, double d3, double d14, double d15, int i13, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.base = rtpBase;
        this.fps = d3;
        this.avg_encode_time_seconds = d14;
        this.bitrate_bps = d15;
        this.min_dimension_px = i13;
    }
}
