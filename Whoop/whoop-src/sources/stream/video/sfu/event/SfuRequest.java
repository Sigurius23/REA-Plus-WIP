package stream.video.sfu.event;

import com.squareup.wire.AbstractC5579j;
import com.squareup.wire.AbstractC5581l;
import com.squareup.wire.AbstractC5586q;
import com.squareup.wire.C5587r;
import com.squareup.wire.C5588s;
import com.squareup.wire.C5591v;
import com.squareup.wire.EnumC5573d;
import com.squareup.wire.EnumC5593x;
import com.squareup.wire.InterfaceC5570a0;
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
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B5\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J;\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lstream/video/sfu/event/SfuRequest;", "Lcom/squareup/wire/l;", "", "Lstream/video/sfu/event/JoinRequest;", "join_request", "Lstream/video/sfu/event/HealthCheckRequest;", "health_check_request", "Lstream/video/sfu/event/LeaveCallRequest;", "leave_call_request", "Lne3/l;", "unknownFields", "<init>", "(Lstream/video/sfu/event/JoinRequest;Lstream/video/sfu/event/HealthCheckRequest;Lstream/video/sfu/event/LeaveCallRequest;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lstream/video/sfu/event/JoinRequest;Lstream/video/sfu/event/HealthCheckRequest;Lstream/video/sfu/event/LeaveCallRequest;Lne3/l;)Lstream/video/sfu/event/SfuRequest;", "Lstream/video/sfu/event/JoinRequest;", "getJoin_request", "()Lstream/video/sfu/event/JoinRequest;", "Lstream/video/sfu/event/HealthCheckRequest;", "getHealth_check_request", "()Lstream/video/sfu/event/HealthCheckRequest;", "Lstream/video/sfu/event/LeaveCallRequest;", "getLeave_call_request", "()Lstream/video/sfu/event/LeaveCallRequest;", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class SfuRequest extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "stream.video.sfu.event.HealthCheckRequest#ADAPTER", jsonName = "healthCheckRequest", oneofName = "request_payload", tag = 2)
    private final HealthCheckRequest health_check_request;

    @InterfaceC5570a0(adapter = "stream.video.sfu.event.JoinRequest#ADAPTER", jsonName = "joinRequest", oneofName = "request_payload", tag = 1)
    private final JoinRequest join_request;

    @InterfaceC5570a0(adapter = "stream.video.sfu.event.LeaveCallRequest#ADAPTER", jsonName = "leaveCallRequest", oneofName = "request_payload", tag = 3)
    private final LeaveCallRequest leave_call_request;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(SfuRequest.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.event.SfuRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public SfuRequest decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                long jM16807d = reader.m16807d();
                Object objDecode = null;
                Object objDecode2 = null;
                Object objDecode3 = null;
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new SfuRequest((JoinRequest) objDecode, (HealthCheckRequest) objDecode2, (LeaveCallRequest) objDecode3, reader.m16808e(jM16807d));
                    }
                    if (iM16810g == 1) {
                        objDecode = JoinRequest.ADAPTER.decode(reader);
                    } else if (iM16810g == 2) {
                        objDecode2 = HealthCheckRequest.ADAPTER.decode(reader);
                    } else if (iM16810g != 3) {
                        reader.m16813j(iM16810g);
                    } else {
                        objDecode3 = LeaveCallRequest.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(SfuRequest value) {
                AbstractC22676k.m65750j(value, "value");
                return LeaveCallRequest.ADAPTER.encodedSizeWithTag(3, value.getLeave_call_request()) + HealthCheckRequest.ADAPTER.encodedSizeWithTag(2, value.getHealth_check_request()) + JoinRequest.ADAPTER.encodedSizeWithTag(1, value.getJoin_request()) + value.unknownFields().mo79253d();
            }

            @Override // com.squareup.wire.AbstractC5586q
            public SfuRequest redact(SfuRequest value) {
                AbstractC22676k.m65750j(value, "value");
                JoinRequest join_request = value.getJoin_request();
                JoinRequest joinRequest = join_request != null ? (JoinRequest) JoinRequest.ADAPTER.redact(join_request) : null;
                HealthCheckRequest health_check_request = value.getHealth_check_request();
                HealthCheckRequest healthCheckRequest = health_check_request != null ? (HealthCheckRequest) HealthCheckRequest.ADAPTER.redact(health_check_request) : null;
                LeaveCallRequest leave_call_request = value.getLeave_call_request();
                return value.copy(joinRequest, healthCheckRequest, leave_call_request != null ? (LeaveCallRequest) LeaveCallRequest.ADAPTER.redact(leave_call_request) : null, C26624l.f105881E);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, SfuRequest value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                JoinRequest.ADAPTER.encodeWithTag(writer, 1, value.getJoin_request());
                HealthCheckRequest.ADAPTER.encodeWithTag(writer, 2, value.getHealth_check_request());
                LeaveCallRequest.ADAPTER.encodeWithTag(writer, 3, value.getLeave_call_request());
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, SfuRequest value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                LeaveCallRequest.ADAPTER.encodeWithTag(writer, 3, value.getLeave_call_request());
                HealthCheckRequest.ADAPTER.encodeWithTag(writer, 2, value.getHealth_check_request());
                JoinRequest.ADAPTER.encodeWithTag(writer, 1, value.getJoin_request());
            }
        };
    }

    public SfuRequest() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ SfuRequest copy$default(SfuRequest sfuRequest, JoinRequest joinRequest, HealthCheckRequest healthCheckRequest, LeaveCallRequest leaveCallRequest, C26624l c26624l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            joinRequest = sfuRequest.join_request;
        }
        if ((i13 & 2) != 0) {
            healthCheckRequest = sfuRequest.health_check_request;
        }
        if ((i13 & 4) != 0) {
            leaveCallRequest = sfuRequest.leave_call_request;
        }
        if ((i13 & 8) != 0) {
            c26624l = sfuRequest.unknownFields();
        }
        return sfuRequest.copy(joinRequest, healthCheckRequest, leaveCallRequest, c26624l);
    }

    public final SfuRequest copy(JoinRequest join_request, HealthCheckRequest health_check_request, LeaveCallRequest leave_call_request, C26624l unknownFields) {
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new SfuRequest(join_request, health_check_request, leave_call_request, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SfuRequest)) {
            return false;
        }
        SfuRequest sfuRequest = (SfuRequest) other;
        return AbstractC22676k.m65745e(unknownFields(), sfuRequest.unknownFields()) && AbstractC22676k.m65745e(this.join_request, sfuRequest.join_request) && AbstractC22676k.m65745e(this.health_check_request, sfuRequest.health_check_request) && AbstractC22676k.m65745e(this.leave_call_request, sfuRequest.leave_call_request);
    }

    public final HealthCheckRequest getHealth_check_request() {
        return this.health_check_request;
    }

    public final JoinRequest getJoin_request() {
        return this.join_request;
    }

    public final LeaveCallRequest getLeave_call_request() {
        return this.leave_call_request;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        JoinRequest joinRequest = this.join_request;
        int iHashCode2 = (iHashCode + (joinRequest != null ? joinRequest.hashCode() : 0)) * 37;
        HealthCheckRequest healthCheckRequest = this.health_check_request;
        int iHashCode3 = (iHashCode2 + (healthCheckRequest != null ? healthCheckRequest.hashCode() : 0)) * 37;
        LeaveCallRequest leaveCallRequest = this.leave_call_request;
        int iHashCode4 = iHashCode3 + (leaveCallRequest != null ? leaveCallRequest.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134512newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        JoinRequest joinRequest = this.join_request;
        if (joinRequest != null) {
            arrayList.add("join_request=" + joinRequest);
        }
        HealthCheckRequest healthCheckRequest = this.health_check_request;
        if (healthCheckRequest != null) {
            arrayList.add("health_check_request=" + healthCheckRequest);
        }
        LeaveCallRequest leaveCallRequest = this.leave_call_request;
        if (leaveCallRequest != null) {
            arrayList.add("leave_call_request=" + leaveCallRequest);
        }
        return AbstractC25265s.m74110N0(arrayList, ", ", "SfuRequest{", "}", null, 56);
    }

    public /* synthetic */ SfuRequest(JoinRequest joinRequest, HealthCheckRequest healthCheckRequest, LeaveCallRequest leaveCallRequest, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : joinRequest, (i13 & 2) != 0 ? null : healthCheckRequest, (i13 & 4) != 0 ? null : leaveCallRequest, (i13 & 8) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134512newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SfuRequest(JoinRequest joinRequest, HealthCheckRequest healthCheckRequest, LeaveCallRequest leaveCallRequest, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.join_request = joinRequest;
        this.health_check_request = healthCheckRequest;
        this.leave_call_request = leaveCallRequest;
        if ((joinRequest != null ? 1 : 0) + (healthCheckRequest != null ? 1 : 0) + (leaveCallRequest != null ? 1 : 0) > 1) {
            throw new IllegalArgumentException("At most one of join_request, health_check_request, leave_call_request may be non-null");
        }
    }
}
