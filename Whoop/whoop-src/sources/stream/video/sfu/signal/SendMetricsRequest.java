package stream.video.sfu.signal;

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
import j93.InterfaceC21461d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import jh3.AbstractC21702c;
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
import stream.video.sfu.models.InboundRtp;
import stream.video.sfu.models.OutboundRtp;
import stream.video.sfu.models.RemoteInboundRtp;
import stream.video.sfu.models.RemoteOutboundRtp;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*Be\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJk\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b#\u0010\u001eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b'\u0010&R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b(\u0010&R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b)\u0010&¨\u0006+"}, m65681d2 = {"Lstream/video/sfu/signal/SendMetricsRequest;", "Lcom/squareup/wire/l;", "", "", "session_id", "unified_session_id", "", "Lstream/video/sfu/models/InboundRtp;", "inbounds", "Lstream/video/sfu/models/OutboundRtp;", "outbounds", "Lstream/video/sfu/models/RemoteInboundRtp;", "remote_inbounds", "Lstream/video/sfu/models/RemoteOutboundRtp;", "remote_outbounds", "Lne3/l;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lne3/l;)Lstream/video/sfu/signal/SendMetricsRequest;", "Ljava/lang/String;", "getSession_id", "getUnified_session_id", "Ljava/util/List;", "getInbounds", "()Ljava/util/List;", "getOutbounds", "getRemote_inbounds", "getRemote_outbounds", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class SendMetricsRequest extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.InboundRtp#ADAPTER", label = EnumC5595z.f22136y, tag = 3)
    private final List<InboundRtp> inbounds;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.OutboundRtp#ADAPTER", label = EnumC5595z.f22136y, tag = 4)
    private final List<OutboundRtp> outbounds;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.RemoteInboundRtp#ADAPTER", jsonName = "remoteInbounds", label = EnumC5595z.f22136y, tag = 5)
    private final List<RemoteInboundRtp> remote_inbounds;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.RemoteOutboundRtp#ADAPTER", jsonName = "remoteOutbounds", label = EnumC5595z.f22136y, tag = 6)
    private final List<RemoteOutboundRtp> remote_outbounds;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sessionId", label = EnumC5595z.f22132F, tag = 1)
    private final String session_id;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "unifiedSessionId", label = EnumC5595z.f22132F, tag = 2)
    private final String unified_session_id;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(SendMetricsRequest.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.signal.SendMetricsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public SendMetricsRequest decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                long jM16807d = reader.m16807d();
                Object objDecode = "";
                Object objDecode2 = "";
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new SendMetricsRequest((String) objDecode, (String) objDecode2, arrayList, arrayList2, arrayList3, arrayList4, reader.m16808e(jM16807d));
                    }
                    switch (iM16810g) {
                        case 1:
                            objDecode = AbstractC5586q.STRING.decode(reader);
                            break;
                        case 2:
                            objDecode2 = AbstractC5586q.STRING.decode(reader);
                            break;
                        case 3:
                            arrayList.add(InboundRtp.ADAPTER.decode(reader));
                            break;
                        case 4:
                            arrayList2.add(OutboundRtp.ADAPTER.decode(reader));
                            break;
                        case 5:
                            arrayList3.add(RemoteInboundRtp.ADAPTER.decode(reader));
                            break;
                        case 6:
                            arrayList4.add(RemoteOutboundRtp.ADAPTER.decode(reader));
                            break;
                        default:
                            reader.m16813j(iM16810g);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(SendMetricsRequest value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (!AbstractC22676k.m65745e(value.getSession_id(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(1, value.getSession_id());
                }
                if (!AbstractC22676k.m65745e(value.getUnified_session_id(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(2, value.getUnified_session_id());
                }
                return RemoteOutboundRtp.ADAPTER.asRepeated().encodedSizeWithTag(6, value.getRemote_outbounds()) + RemoteInboundRtp.ADAPTER.asRepeated().encodedSizeWithTag(5, value.getRemote_inbounds()) + OutboundRtp.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getOutbounds()) + InboundRtp.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getInbounds()) + iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public SendMetricsRequest redact(SendMetricsRequest value) {
                AbstractC22676k.m65750j(value, "value");
                return SendMetricsRequest.copy$default(value, null, null, AbstractC32103e.m99879a(value.getInbounds(), InboundRtp.ADAPTER), AbstractC32103e.m99879a(value.getOutbounds(), OutboundRtp.ADAPTER), AbstractC32103e.m99879a(value.getRemote_inbounds(), RemoteInboundRtp.ADAPTER), AbstractC32103e.m99879a(value.getRemote_outbounds(), RemoteOutboundRtp.ADAPTER), C26624l.f105881E, 3, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, SendMetricsRequest value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (!AbstractC22676k.m65745e(value.getSession_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 1, value.getSession_id());
                }
                if (!AbstractC22676k.m65745e(value.getUnified_session_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getUnified_session_id());
                }
                InboundRtp.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.getInbounds());
                OutboundRtp.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.getOutbounds());
                RemoteInboundRtp.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.getRemote_inbounds());
                RemoteOutboundRtp.ADAPTER.asRepeated().encodeWithTag(writer, 6, value.getRemote_outbounds());
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, SendMetricsRequest value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                RemoteOutboundRtp.ADAPTER.asRepeated().encodeWithTag(writer, 6, value.getRemote_outbounds());
                RemoteInboundRtp.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.getRemote_inbounds());
                OutboundRtp.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.getOutbounds());
                InboundRtp.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.getInbounds());
                if (!AbstractC22676k.m65745e(value.getUnified_session_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getUnified_session_id());
                }
                if (AbstractC22676k.m65745e(value.getSession_id(), "")) {
                    return;
                }
                AbstractC5586q.STRING.encodeWithTag(writer, 1, value.getSession_id());
            }
        };
    }

    public SendMetricsRequest() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SendMetricsRequest copy$default(SendMetricsRequest sendMetricsRequest, String str, String str2, List list, List list2, List list3, List list4, C26624l c26624l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sendMetricsRequest.session_id;
        }
        if ((i13 & 2) != 0) {
            str2 = sendMetricsRequest.unified_session_id;
        }
        if ((i13 & 4) != 0) {
            list = sendMetricsRequest.inbounds;
        }
        if ((i13 & 8) != 0) {
            list2 = sendMetricsRequest.outbounds;
        }
        if ((i13 & 16) != 0) {
            list3 = sendMetricsRequest.remote_inbounds;
        }
        if ((i13 & 32) != 0) {
            list4 = sendMetricsRequest.remote_outbounds;
        }
        if ((i13 & 64) != 0) {
            c26624l = sendMetricsRequest.unknownFields();
        }
        List list5 = list4;
        C26624l c26624l2 = c26624l;
        List list6 = list3;
        List list7 = list;
        return sendMetricsRequest.copy(str, str2, list7, list2, list6, list5, c26624l2);
    }

    public final SendMetricsRequest copy(String session_id, String unified_session_id, List<InboundRtp> inbounds, List<OutboundRtp> outbounds, List<RemoteInboundRtp> remote_inbounds, List<RemoteOutboundRtp> remote_outbounds, C26624l unknownFields) {
        AbstractC22676k.m65750j(session_id, "session_id");
        AbstractC22676k.m65750j(unified_session_id, "unified_session_id");
        AbstractC22676k.m65750j(inbounds, "inbounds");
        AbstractC22676k.m65750j(outbounds, "outbounds");
        AbstractC22676k.m65750j(remote_inbounds, "remote_inbounds");
        AbstractC22676k.m65750j(remote_outbounds, "remote_outbounds");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new SendMetricsRequest(session_id, unified_session_id, inbounds, outbounds, remote_inbounds, remote_outbounds, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SendMetricsRequest)) {
            return false;
        }
        SendMetricsRequest sendMetricsRequest = (SendMetricsRequest) other;
        return AbstractC22676k.m65745e(unknownFields(), sendMetricsRequest.unknownFields()) && AbstractC22676k.m65745e(this.session_id, sendMetricsRequest.session_id) && AbstractC22676k.m65745e(this.unified_session_id, sendMetricsRequest.unified_session_id) && AbstractC22676k.m65745e(this.inbounds, sendMetricsRequest.inbounds) && AbstractC22676k.m65745e(this.outbounds, sendMetricsRequest.outbounds) && AbstractC22676k.m65745e(this.remote_inbounds, sendMetricsRequest.remote_inbounds) && AbstractC22676k.m65745e(this.remote_outbounds, sendMetricsRequest.remote_outbounds);
    }

    public final List<InboundRtp> getInbounds() {
        return this.inbounds;
    }

    public final List<OutboundRtp> getOutbounds() {
        return this.outbounds;
    }

    public final List<RemoteInboundRtp> getRemote_inbounds() {
        return this.remote_inbounds;
    }

    public final List<RemoteOutboundRtp> getRemote_outbounds() {
        return this.remote_outbounds;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final String getUnified_session_id() {
        return this.unified_session_id;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = this.remote_outbounds.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(unknownFields().hashCode() * 37, 37, this.session_id), 37, this.unified_session_id), 37, this.inbounds), 37, this.outbounds), 37, this.remote_inbounds);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134556newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC21702c.m61149t(arrayList, this.session_id, "session_id=");
        AbstractC21702c.m61149t(arrayList, this.unified_session_id, "unified_session_id=");
        if (!this.inbounds.isEmpty()) {
            AbstractC26725a.m79513q("inbounds=", this.inbounds, arrayList);
        }
        if (!this.outbounds.isEmpty()) {
            AbstractC26725a.m79513q("outbounds=", this.outbounds, arrayList);
        }
        if (!this.remote_inbounds.isEmpty()) {
            AbstractC26725a.m79513q("remote_inbounds=", this.remote_inbounds, arrayList);
        }
        if (!this.remote_outbounds.isEmpty()) {
            AbstractC26725a.m79513q("remote_outbounds=", this.remote_outbounds, arrayList);
        }
        return AbstractC25265s.m74110N0(arrayList, ", ", "SendMetricsRequest{", "}", null, 56);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SendMetricsRequest(String str, String str2, List list, List list2, List list3, List list4, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i13 & 1) != 0 ? "" : str;
        str2 = (i13 & 2) != 0 ? "" : str2;
        int i14 = i13 & 4;
        C25271y c25271y = C25271y.f99162w;
        this(str, str2, i14 != 0 ? c25271y : list, (i13 & 8) != 0 ? c25271y : list2, (i13 & 16) != 0 ? c25271y : list3, (i13 & 32) != 0 ? c25271y : list4, (i13 & 64) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134556newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendMetricsRequest(String session_id, String unified_session_id, List<InboundRtp> inbounds, List<OutboundRtp> outbounds, List<RemoteInboundRtp> remote_inbounds, List<RemoteOutboundRtp> remote_outbounds, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(session_id, "session_id");
        AbstractC22676k.m65750j(unified_session_id, "unified_session_id");
        AbstractC22676k.m65750j(inbounds, "inbounds");
        AbstractC22676k.m65750j(outbounds, "outbounds");
        AbstractC22676k.m65750j(remote_inbounds, "remote_inbounds");
        AbstractC22676k.m65750j(remote_outbounds, "remote_outbounds");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.session_id = session_id;
        this.unified_session_id = unified_session_id;
        this.inbounds = AbstractC32103e.m99886h("inbounds", inbounds);
        this.outbounds = AbstractC32103e.m99886h("outbounds", outbounds);
        this.remote_inbounds = AbstractC32103e.m99886h("remote_inbounds", remote_inbounds);
        this.remote_outbounds = AbstractC32103e.m99886h("remote_outbounds", remote_outbounds);
    }
}
