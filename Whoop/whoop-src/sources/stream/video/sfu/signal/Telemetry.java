package stream.video.sfu.signal;

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
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m65681d2 = {"Lstream/video/sfu/signal/Telemetry;", "Lcom/squareup/wire/l;", "", "", "connection_time_seconds", "Lstream/video/sfu/signal/Reconnection;", "reconnection", "Lne3/l;", "unknownFields", "<init>", "(Ljava/lang/Float;Lstream/video/sfu/signal/Reconnection;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/Float;Lstream/video/sfu/signal/Reconnection;Lne3/l;)Lstream/video/sfu/signal/Telemetry;", "Ljava/lang/Float;", "getConnection_time_seconds", "()Ljava/lang/Float;", "Lstream/video/sfu/signal/Reconnection;", "getReconnection", "()Lstream/video/sfu/signal/Reconnection;", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class Telemetry extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "connectionTimeSeconds", oneofName = "data", tag = 1)
    private final Float connection_time_seconds;

    @InterfaceC5570a0(adapter = "stream.video.sfu.signal.Reconnection#ADAPTER", oneofName = "data", tag = 2)
    private final Reconnection reconnection;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(Telemetry.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.signal.Telemetry$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public Telemetry decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                long jM16807d = reader.m16807d();
                Object objDecode = null;
                Object objDecode2 = null;
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new Telemetry((Float) objDecode, (Reconnection) objDecode2, reader.m16808e(jM16807d));
                    }
                    if (iM16810g == 1) {
                        objDecode = AbstractC5586q.FLOAT.decode(reader);
                    } else if (iM16810g != 2) {
                        reader.m16813j(iM16810g);
                    } else {
                        objDecode2 = Reconnection.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(Telemetry value) {
                AbstractC22676k.m65750j(value, "value");
                return Reconnection.ADAPTER.encodedSizeWithTag(2, value.getReconnection()) + AbstractC5586q.FLOAT.encodedSizeWithTag(1, value.getConnection_time_seconds()) + value.unknownFields().mo79253d();
            }

            @Override // com.squareup.wire.AbstractC5586q
            public Telemetry redact(Telemetry value) {
                AbstractC22676k.m65750j(value, "value");
                Reconnection reconnection = value.getReconnection();
                return Telemetry.copy$default(value, null, reconnection != null ? (Reconnection) Reconnection.ADAPTER.redact(reconnection) : null, C26624l.f105881E, 1, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, Telemetry value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                AbstractC5586q.FLOAT.encodeWithTag(writer, 1, value.getConnection_time_seconds());
                Reconnection.ADAPTER.encodeWithTag(writer, 2, value.getReconnection());
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, Telemetry value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                Reconnection.ADAPTER.encodeWithTag(writer, 2, value.getReconnection());
                AbstractC5586q.FLOAT.encodeWithTag(writer, 1, value.getConnection_time_seconds());
            }
        };
    }

    public Telemetry() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Telemetry copy$default(Telemetry telemetry, Float f13, Reconnection reconnection, C26624l c26624l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = telemetry.connection_time_seconds;
        }
        if ((i13 & 2) != 0) {
            reconnection = telemetry.reconnection;
        }
        if ((i13 & 4) != 0) {
            c26624l = telemetry.unknownFields();
        }
        return telemetry.copy(f13, reconnection, c26624l);
    }

    public final Telemetry copy(Float connection_time_seconds, Reconnection reconnection, C26624l unknownFields) {
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new Telemetry(connection_time_seconds, reconnection, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Telemetry)) {
            return false;
        }
        Telemetry telemetry = (Telemetry) other;
        return AbstractC22676k.m65745e(unknownFields(), telemetry.unknownFields()) && AbstractC22676k.m65744d(this.connection_time_seconds, telemetry.connection_time_seconds) && AbstractC22676k.m65745e(this.reconnection, telemetry.reconnection);
    }

    public final Float getConnection_time_seconds() {
        return this.connection_time_seconds;
    }

    public final Reconnection getReconnection() {
        return this.reconnection;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Float f13 = this.connection_time_seconds;
        int iHashCode2 = (iHashCode + (f13 != null ? f13.hashCode() : 0)) * 37;
        Reconnection reconnection = this.reconnection;
        int iHashCode3 = iHashCode2 + (reconnection != null ? reconnection.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134566newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        Float f13 = this.connection_time_seconds;
        if (f13 != null) {
            arrayList.add("connection_time_seconds=" + f13);
        }
        Reconnection reconnection = this.reconnection;
        if (reconnection != null) {
            arrayList.add("reconnection=" + reconnection);
        }
        return AbstractC25265s.m74110N0(arrayList, ", ", "Telemetry{", "}", null, 56);
    }

    public /* synthetic */ Telemetry(Float f13, Reconnection reconnection, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : f13, (i13 & 2) != 0 ? null : reconnection, (i13 & 4) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134566newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Telemetry(Float f13, Reconnection reconnection, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.connection_time_seconds = f13;
        this.reconnection = reconnection;
        if ((f13 != null ? 1 : 0) + (reconnection != null ? 1 : 0) > 1) {
            throw new IllegalArgumentException("At most one of connection_time_seconds, reconnection may be non-null");
        }
    }
}
