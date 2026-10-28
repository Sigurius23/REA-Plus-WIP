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
import jh3.AbstractC21702c;
import l83.InterfaceC23457c;
import m83.AbstractC25265s;
import ne3.C26624l;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import stream.video.sfu.models.ConnectionQuality;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B/\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001c\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m65681d2 = {"Lstream/video/sfu/event/ConnectionQualityInfo;", "Lcom/squareup/wire/l;", "", "", "user_id", "session_id", "Lstream/video/sfu/models/ConnectionQuality;", "connection_quality", "Lne3/l;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/ConnectionQuality;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/ConnectionQuality;Lne3/l;)Lstream/video/sfu/event/ConnectionQualityInfo;", "Ljava/lang/String;", "getUser_id", "getSession_id", "Lstream/video/sfu/models/ConnectionQuality;", "getConnection_quality", "()Lstream/video/sfu/models/ConnectionQuality;", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class ConnectionQualityInfo extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.ConnectionQuality#ADAPTER", jsonName = "connectionQuality", label = EnumC5595z.f22132F, tag = 3)
    private final ConnectionQuality connection_quality;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sessionId", label = EnumC5595z.f22132F, tag = 2)
    private final String session_id;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userId", label = EnumC5595z.f22132F, tag = 1)
    private final String user_id;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(ConnectionQualityInfo.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.event.ConnectionQualityInfo$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public ConnectionQualityInfo decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                Object objDecode = ConnectionQuality.CONNECTION_QUALITY_UNSPECIFIED;
                long jM16807d = reader.m16807d();
                Object objDecode2 = "";
                Object objDecode3 = "";
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new ConnectionQualityInfo((String) objDecode2, (String) objDecode3, (ConnectionQuality) objDecode, reader.m16808e(jM16807d));
                    }
                    if (iM16810g == 1) {
                        objDecode2 = AbstractC5586q.STRING.decode(reader);
                    } else if (iM16810g == 2) {
                        objDecode3 = AbstractC5586q.STRING.decode(reader);
                    } else if (iM16810g != 3) {
                        reader.m16813j(iM16810g);
                    } else {
                        try {
                            objDecode = ConnectionQuality.ADAPTER.decode(reader);
                        } catch (ProtoAdapter$EnumConstantNotFoundException e5) {
                            reader.m16804a(iM16810g, EnumC5573d.VARINT, Long.valueOf(e5.f22081w));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(ConnectionQualityInfo value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (!AbstractC22676k.m65745e(value.getUser_id(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(1, value.getUser_id());
                }
                if (!AbstractC22676k.m65745e(value.getSession_id(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(2, value.getSession_id());
                }
                return value.getConnection_quality() != ConnectionQuality.CONNECTION_QUALITY_UNSPECIFIED ? ConnectionQuality.ADAPTER.encodedSizeWithTag(3, value.getConnection_quality()) + iMo79253d : iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public ConnectionQualityInfo redact(ConnectionQualityInfo value) {
                AbstractC22676k.m65750j(value, "value");
                return ConnectionQualityInfo.copy$default(value, null, null, null, C26624l.f105881E, 7, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, ConnectionQualityInfo value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (!AbstractC22676k.m65745e(value.getUser_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 1, value.getUser_id());
                }
                if (!AbstractC22676k.m65745e(value.getSession_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getSession_id());
                }
                if (value.getConnection_quality() != ConnectionQuality.CONNECTION_QUALITY_UNSPECIFIED) {
                    ConnectionQuality.ADAPTER.encodeWithTag(writer, 3, value.getConnection_quality());
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, ConnectionQualityInfo value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (value.getConnection_quality() != ConnectionQuality.CONNECTION_QUALITY_UNSPECIFIED) {
                    ConnectionQuality.ADAPTER.encodeWithTag(writer, 3, value.getConnection_quality());
                }
                if (!AbstractC22676k.m65745e(value.getSession_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getSession_id());
                }
                if (AbstractC22676k.m65745e(value.getUser_id(), "")) {
                    return;
                }
                AbstractC5586q.STRING.encodeWithTag(writer, 1, value.getUser_id());
            }
        };
    }

    public ConnectionQualityInfo() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ ConnectionQualityInfo copy$default(ConnectionQualityInfo connectionQualityInfo, String str, String str2, ConnectionQuality connectionQuality, C26624l c26624l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = connectionQualityInfo.user_id;
        }
        if ((i13 & 2) != 0) {
            str2 = connectionQualityInfo.session_id;
        }
        if ((i13 & 4) != 0) {
            connectionQuality = connectionQualityInfo.connection_quality;
        }
        if ((i13 & 8) != 0) {
            c26624l = connectionQualityInfo.unknownFields();
        }
        return connectionQualityInfo.copy(str, str2, connectionQuality, c26624l);
    }

    public final ConnectionQualityInfo copy(String user_id, String session_id, ConnectionQuality connection_quality, C26624l unknownFields) {
        AbstractC22676k.m65750j(user_id, "user_id");
        AbstractC22676k.m65750j(session_id, "session_id");
        AbstractC22676k.m65750j(connection_quality, "connection_quality");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new ConnectionQualityInfo(user_id, session_id, connection_quality, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ConnectionQualityInfo)) {
            return false;
        }
        ConnectionQualityInfo connectionQualityInfo = (ConnectionQualityInfo) other;
        return AbstractC22676k.m65745e(unknownFields(), connectionQualityInfo.unknownFields()) && AbstractC22676k.m65745e(this.user_id, connectionQualityInfo.user_id) && AbstractC22676k.m65745e(this.session_id, connectionQualityInfo.session_id) && this.connection_quality == connectionQualityInfo.connection_quality;
    }

    public final ConnectionQuality getConnection_quality() {
        return this.connection_quality;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = this.connection_quality.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(unknownFields().hashCode() * 37, 37, this.user_id), 37, this.session_id);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134490newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC21702c.m61149t(arrayList, this.user_id, "user_id=");
        AbstractC21702c.m61149t(arrayList, this.session_id, "session_id=");
        arrayList.add("connection_quality=" + this.connection_quality);
        return AbstractC25265s.m74110N0(arrayList, ", ", "ConnectionQualityInfo{", "}", null, 56);
    }

    public /* synthetic */ ConnectionQualityInfo(String str, String str2, ConnectionQuality connectionQuality, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? ConnectionQuality.CONNECTION_QUALITY_UNSPECIFIED : connectionQuality, (i13 & 8) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134490newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionQualityInfo(String user_id, String session_id, ConnectionQuality connection_quality, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(user_id, "user_id");
        AbstractC22676k.m65750j(session_id, "session_id");
        AbstractC22676k.m65750j(connection_quality, "connection_quality");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.user_id = user_id;
        this.session_id = session_id;
        this.connection_quality = connection_quality;
    }
}
