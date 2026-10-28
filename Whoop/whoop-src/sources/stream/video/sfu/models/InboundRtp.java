package stream.video.sfu.models;

import androidx.health.platform.client.proto.C1533u;
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
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0018\u0018\u0000 62\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00016B\u0081\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0087\u0001\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b-\u0010,R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b.\u0010)R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u0010\u001eR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b1\u0010)R\u001a\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b2\u0010)R\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b3\u0010)R\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b4\u0010)R\u001a\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b5\u0010\u001e¨\u00067"}, m65681d2 = {"Lstream/video/sfu/models/InboundRtp;", "Lcom/squareup/wire/l;", "", "Lstream/video/sfu/models/RtpBase;", "base", "", "jitter_seconds", "", "packets_received", "packets_lost", "packet_loss_percent", "", "concealment_events", "concealment_percent", "fps", "freeze_duration_seconds", "avg_decode_time_seconds", "min_dimension_px", "Lne3/l;", "unknownFields", "<init>", "(Lstream/video/sfu/models/RtpBase;DJJDIDDDDILne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lstream/video/sfu/models/RtpBase;DJJDIDDDDILne3/l;)Lstream/video/sfu/models/InboundRtp;", "Lstream/video/sfu/models/RtpBase;", "getBase", "()Lstream/video/sfu/models/RtpBase;", "D", "getJitter_seconds", "()D", "J", "getPackets_received", "()J", "getPackets_lost", "getPacket_loss_percent", "I", "getConcealment_events", "getConcealment_percent", "getFps", "getFreeze_duration_seconds", "getAvg_decode_time_seconds", "getMin_dimension_px", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class InboundRtp extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "avgDecodeTimeSeconds", label = EnumC5595z.f22132F, tag = C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER)
    private final double avg_decode_time_seconds;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.RtpBase#ADAPTER", label = EnumC5595z.f22132F, tag = 1)
    private final RtpBase base;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "concealmentEvents", label = EnumC5595z.f22132F, tag = 10)
    private final int concealment_events;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "concealmentPercent", label = EnumC5595z.f22132F, tag = 11)
    private final double concealment_percent;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = EnumC5595z.f22132F, tag = 20)
    private final double fps;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "freezeDurationSeconds", label = EnumC5595z.f22132F, tag = 21)
    private final double freeze_duration_seconds;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "jitterSeconds", label = EnumC5595z.f22132F, tag = 2)
    private final double jitter_seconds;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "minDimensionPx", label = EnumC5595z.f22132F, tag = C1533u.RECORDING_METHOD_FIELD_NUMBER)
    private final int min_dimension_px;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "packetLossPercent", label = EnumC5595z.f22132F, tag = 5)
    private final double packet_loss_percent;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "packetsLost", label = EnumC5595z.f22132F, tag = 4)
    private final long packets_lost;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "packetsReceived", label = EnumC5595z.f22132F, tag = 3)
    private final long packets_received;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(InboundRtp.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.models.InboundRtp$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public InboundRtp decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                long jM16807d = reader.m16807d();
                Object objDecode = null;
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                double dDoubleValue3 = 0.0d;
                double dDoubleValue4 = 0.0d;
                double dDoubleValue5 = 0.0d;
                long jLongValue = 0;
                int iIntValue = 0;
                int iIntValue2 = 0;
                double dDoubleValue6 = 0.0d;
                long jLongValue2 = 0;
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new InboundRtp((RtpBase) objDecode, dDoubleValue6, jLongValue2, jLongValue, dDoubleValue, iIntValue, dDoubleValue2, dDoubleValue3, dDoubleValue4, dDoubleValue5, iIntValue2, reader.m16808e(jM16807d));
                    }
                    if (iM16810g == 1) {
                        objDecode = RtpBase.ADAPTER.decode(reader);
                    } else if (iM16810g == 2) {
                        dDoubleValue6 = ((Number) AbstractC5586q.DOUBLE.decode(reader)).doubleValue();
                    } else if (iM16810g == 3) {
                        jLongValue2 = ((Number) AbstractC5586q.UINT64.decode(reader)).longValue();
                    } else if (iM16810g == 4) {
                        jLongValue = ((Number) AbstractC5586q.UINT64.decode(reader)).longValue();
                    } else if (iM16810g == 5) {
                        dDoubleValue = ((Number) AbstractC5586q.DOUBLE.decode(reader)).doubleValue();
                    } else if (iM16810g == 10) {
                        iIntValue = ((Number) AbstractC5586q.UINT32.decode(reader)).intValue();
                    } else if (iM16810g != 11) {
                        switch (iM16810g) {
                            case 20:
                                dDoubleValue3 = ((Number) AbstractC5586q.DOUBLE.decode(reader)).doubleValue();
                                break;
                            case 21:
                                dDoubleValue4 = ((Number) AbstractC5586q.DOUBLE.decode(reader)).doubleValue();
                                break;
                            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                dDoubleValue5 = ((Number) AbstractC5586q.DOUBLE.decode(reader)).doubleValue();
                                break;
                            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                iIntValue2 = ((Number) AbstractC5586q.UINT32.decode(reader)).intValue();
                                break;
                            default:
                                reader.m16813j(iM16810g);
                                break;
                        }
                    } else {
                        dDoubleValue2 = ((Number) AbstractC5586q.DOUBLE.decode(reader)).doubleValue();
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(InboundRtp value) {
                Double dValueOf = Double.valueOf(0.0d);
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (value.getBase() != null) {
                    iMo79253d += RtpBase.ADAPTER.encodedSizeWithTag(1, value.getBase());
                }
                if (!Double.valueOf(value.getJitter_seconds()).equals(dValueOf)) {
                    iMo79253d += AbstractC5586q.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getJitter_seconds()));
                }
                if (value.getPackets_received() != 0) {
                    iMo79253d += AbstractC5586q.UINT64.encodedSizeWithTag(3, Long.valueOf(value.getPackets_received()));
                }
                if (value.getPackets_lost() != 0) {
                    iMo79253d += AbstractC5586q.UINT64.encodedSizeWithTag(4, Long.valueOf(value.getPackets_lost()));
                }
                if (!Double.valueOf(value.getPacket_loss_percent()).equals(dValueOf)) {
                    iMo79253d += AbstractC5586q.DOUBLE.encodedSizeWithTag(5, Double.valueOf(value.getPacket_loss_percent()));
                }
                if (value.getConcealment_events() != 0) {
                    iMo79253d += AbstractC5586q.UINT32.encodedSizeWithTag(10, Integer.valueOf(value.getConcealment_events()));
                }
                if (!Double.valueOf(value.getConcealment_percent()).equals(dValueOf)) {
                    iMo79253d += AbstractC5586q.DOUBLE.encodedSizeWithTag(11, Double.valueOf(value.getConcealment_percent()));
                }
                if (!Double.valueOf(value.getFps()).equals(dValueOf)) {
                    iMo79253d += AbstractC5586q.DOUBLE.encodedSizeWithTag(20, Double.valueOf(value.getFps()));
                }
                if (!Double.valueOf(value.getFreeze_duration_seconds()).equals(dValueOf)) {
                    iMo79253d += AbstractC5586q.DOUBLE.encodedSizeWithTag(21, Double.valueOf(value.getFreeze_duration_seconds()));
                }
                if (!Double.valueOf(value.getAvg_decode_time_seconds()).equals(dValueOf)) {
                    iMo79253d += AbstractC5586q.DOUBLE.encodedSizeWithTag(22, Double.valueOf(value.getAvg_decode_time_seconds()));
                }
                return value.getMin_dimension_px() != 0 ? AbstractC5586q.UINT32.encodedSizeWithTag(23, Integer.valueOf(value.getMin_dimension_px())) + iMo79253d : iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public InboundRtp redact(InboundRtp value) {
                AbstractC22676k.m65750j(value, "value");
                RtpBase base = value.getBase();
                return value.copy((2046 & 1) != 0 ? value.base : base != null ? (RtpBase) RtpBase.ADAPTER.redact(base) : null, (2046 & 2) != 0 ? value.jitter_seconds : 0.0d, (2046 & 4) != 0 ? value.packets_received : 0L, (2046 & 8) != 0 ? value.packets_lost : 0L, (2046 & 16) != 0 ? value.packet_loss_percent : 0.0d, (2046 & 32) != 0 ? value.concealment_events : 0, (2046 & 64) != 0 ? value.concealment_percent : 0.0d, (2046 & 128) != 0 ? value.fps : 0.0d, (2046 & 256) != 0 ? value.freeze_duration_seconds : 0.0d, (2046 & 512) != 0 ? value.avg_decode_time_seconds : 0.0d, (2046 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? value.min_dimension_px : 0, (2046 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? value.unknownFields() : C26624l.f105881E);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, InboundRtp value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (value.getBase() != null) {
                    RtpBase.ADAPTER.encodeWithTag(writer, 1, value.getBase());
                }
                if (!Double.valueOf(value.getJitter_seconds()).equals(dValueOf)) {
                    AbstractC5586q.DOUBLE.encodeWithTag(writer, 2, Double.valueOf(value.getJitter_seconds()));
                }
                if (value.getPackets_received() != 0) {
                    AbstractC5586q.UINT64.encodeWithTag(writer, 3, Long.valueOf(value.getPackets_received()));
                }
                if (value.getPackets_lost() != 0) {
                    AbstractC5586q.UINT64.encodeWithTag(writer, 4, Long.valueOf(value.getPackets_lost()));
                }
                if (!Double.valueOf(value.getPacket_loss_percent()).equals(dValueOf)) {
                    AbstractC5586q.DOUBLE.encodeWithTag(writer, 5, Double.valueOf(value.getPacket_loss_percent()));
                }
                if (value.getConcealment_events() != 0) {
                    AbstractC5586q.UINT32.encodeWithTag(writer, 10, Integer.valueOf(value.getConcealment_events()));
                }
                if (!Double.valueOf(value.getConcealment_percent()).equals(dValueOf)) {
                    AbstractC5586q.DOUBLE.encodeWithTag(writer, 11, Double.valueOf(value.getConcealment_percent()));
                }
                if (!Double.valueOf(value.getFps()).equals(dValueOf)) {
                    AbstractC5586q.DOUBLE.encodeWithTag(writer, 20, Double.valueOf(value.getFps()));
                }
                if (!Double.valueOf(value.getFreeze_duration_seconds()).equals(dValueOf)) {
                    AbstractC5586q.DOUBLE.encodeWithTag(writer, 21, Double.valueOf(value.getFreeze_duration_seconds()));
                }
                if (!Double.valueOf(value.getAvg_decode_time_seconds()).equals(dValueOf)) {
                    AbstractC5586q.DOUBLE.encodeWithTag(writer, 22, Double.valueOf(value.getAvg_decode_time_seconds()));
                }
                if (value.getMin_dimension_px() != 0) {
                    AbstractC5586q.UINT32.encodeWithTag(writer, 23, Integer.valueOf(value.getMin_dimension_px()));
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, InboundRtp value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (value.getMin_dimension_px() != 0) {
                    AbstractC5586q.UINT32.encodeWithTag(writer, 23, Integer.valueOf(value.getMin_dimension_px()));
                }
                if (!Double.valueOf(value.getAvg_decode_time_seconds()).equals(dValueOf)) {
                    AbstractC5586q.DOUBLE.encodeWithTag(writer, 22, Double.valueOf(value.getAvg_decode_time_seconds()));
                }
                if (!Double.valueOf(value.getFreeze_duration_seconds()).equals(dValueOf)) {
                    AbstractC5586q.DOUBLE.encodeWithTag(writer, 21, Double.valueOf(value.getFreeze_duration_seconds()));
                }
                if (!Double.valueOf(value.getFps()).equals(dValueOf)) {
                    AbstractC5586q.DOUBLE.encodeWithTag(writer, 20, Double.valueOf(value.getFps()));
                }
                if (!Double.valueOf(value.getConcealment_percent()).equals(dValueOf)) {
                    AbstractC5586q.DOUBLE.encodeWithTag(writer, 11, Double.valueOf(value.getConcealment_percent()));
                }
                if (value.getConcealment_events() != 0) {
                    AbstractC5586q.UINT32.encodeWithTag(writer, 10, Integer.valueOf(value.getConcealment_events()));
                }
                if (!Double.valueOf(value.getPacket_loss_percent()).equals(dValueOf)) {
                    AbstractC5586q.DOUBLE.encodeWithTag(writer, 5, Double.valueOf(value.getPacket_loss_percent()));
                }
                if (value.getPackets_lost() != 0) {
                    AbstractC5586q.UINT64.encodeWithTag(writer, 4, Long.valueOf(value.getPackets_lost()));
                }
                if (value.getPackets_received() != 0) {
                    AbstractC5586q.UINT64.encodeWithTag(writer, 3, Long.valueOf(value.getPackets_received()));
                }
                if (!Double.valueOf(value.getJitter_seconds()).equals(dValueOf)) {
                    AbstractC5586q.DOUBLE.encodeWithTag(writer, 2, Double.valueOf(value.getJitter_seconds()));
                }
                if (value.getBase() != null) {
                    RtpBase.ADAPTER.encodeWithTag(writer, 1, value.getBase());
                }
            }
        };
    }

    public InboundRtp() {
        this(null, 0.0d, 0L, 0L, 0.0d, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0, null, 4095, null);
    }

    public final InboundRtp copy(RtpBase base, double jitter_seconds, long packets_received, long packets_lost, double packet_loss_percent, int concealment_events, double concealment_percent, double fps, double freeze_duration_seconds, double avg_decode_time_seconds, int min_dimension_px, C26624l unknownFields) {
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new InboundRtp(base, jitter_seconds, packets_received, packets_lost, packet_loss_percent, concealment_events, concealment_percent, fps, freeze_duration_seconds, avg_decode_time_seconds, min_dimension_px, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InboundRtp)) {
            return false;
        }
        InboundRtp inboundRtp = (InboundRtp) other;
        return AbstractC22676k.m65745e(unknownFields(), inboundRtp.unknownFields()) && AbstractC22676k.m65745e(this.base, inboundRtp.base) && this.jitter_seconds == inboundRtp.jitter_seconds && this.packets_received == inboundRtp.packets_received && this.packets_lost == inboundRtp.packets_lost && this.packet_loss_percent == inboundRtp.packet_loss_percent && this.concealment_events == inboundRtp.concealment_events && this.concealment_percent == inboundRtp.concealment_percent && this.fps == inboundRtp.fps && this.freeze_duration_seconds == inboundRtp.freeze_duration_seconds && this.avg_decode_time_seconds == inboundRtp.avg_decode_time_seconds && this.min_dimension_px == inboundRtp.min_dimension_px;
    }

    public final double getAvg_decode_time_seconds() {
        return this.avg_decode_time_seconds;
    }

    public final RtpBase getBase() {
        return this.base;
    }

    public final int getConcealment_events() {
        return this.concealment_events;
    }

    public final double getConcealment_percent() {
        return this.concealment_percent;
    }

    public final double getFps() {
        return this.fps;
    }

    public final double getFreeze_duration_seconds() {
        return this.freeze_duration_seconds;
    }

    public final double getJitter_seconds() {
        return this.jitter_seconds;
    }

    public final int getMin_dimension_px() {
        return this.min_dimension_px;
    }

    public final double getPacket_loss_percent() {
        return this.packet_loss_percent;
    }

    public final long getPackets_lost() {
        return this.packets_lost;
    }

    public final long getPackets_received() {
        return this.packets_received;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        RtpBase rtpBase = this.base;
        int iHashCode2 = Integer.hashCode(this.min_dimension_px) + AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC11266d.m30448b(this.concealment_events, AbstractC17176i.m48499a(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC17176i.m48499a((iHashCode + (rtpBase != null ? rtpBase.hashCode() : 0)) * 37, 37, this.jitter_seconds), this.packets_received, 37), this.packets_lost, 37), 37, this.packet_loss_percent), 37), 37, this.concealment_percent), 37, this.fps), 37, this.freeze_duration_seconds), 37, this.avg_decode_time_seconds);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134530newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        RtpBase rtpBase = this.base;
        if (rtpBase != null) {
            arrayList.add("base=" + rtpBase);
        }
        arrayList.add("jitter_seconds=" + this.jitter_seconds);
        arrayList.add("packets_received=" + this.packets_received);
        arrayList.add("packets_lost=" + this.packets_lost);
        arrayList.add("packet_loss_percent=" + this.packet_loss_percent);
        AbstractC38963t7.m124389s(this.concealment_events, "concealment_events=", arrayList);
        arrayList.add("concealment_percent=" + this.concealment_percent);
        arrayList.add("fps=" + this.fps);
        arrayList.add("freeze_duration_seconds=" + this.freeze_duration_seconds);
        arrayList.add("avg_decode_time_seconds=" + this.avg_decode_time_seconds);
        AbstractC38963t7.m124389s(this.min_dimension_px, "min_dimension_px=", arrayList);
        return AbstractC25265s.m74110N0(arrayList, ", ", "InboundRtp{", "}", null, 56);
    }

    public /* synthetic */ InboundRtp(RtpBase rtpBase, double d3, long j7, long j13, double d14, int i13, double d15, double d16, double d17, double d18, int i14, C26624l c26624l, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? null : rtpBase, (i15 & 2) != 0 ? 0.0d : d3, (i15 & 4) != 0 ? 0L : j7, (i15 & 8) == 0 ? j13 : 0L, (i15 & 16) != 0 ? 0.0d : d14, (i15 & 32) != 0 ? 0 : i13, (i15 & 64) != 0 ? 0.0d : d15, (i15 & 128) != 0 ? 0.0d : d16, (i15 & 256) != 0 ? 0.0d : d17, (i15 & 512) != 0 ? 0.0d : d18, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? 0 : i14, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134530newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboundRtp(RtpBase rtpBase, double d3, long j7, long j13, double d14, int i13, double d15, double d16, double d17, double d18, int i14, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.base = rtpBase;
        this.jitter_seconds = d3;
        this.packets_received = j7;
        this.packets_lost = j13;
        this.packet_loss_percent = d14;
        this.concealment_events = i13;
        this.concealment_percent = d15;
        this.fps = d16;
        this.freeze_duration_seconds = d17;
        this.avg_decode_time_seconds = d18;
        this.min_dimension_px = i14;
    }
}
