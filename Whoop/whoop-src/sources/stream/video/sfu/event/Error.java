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
import stream.video.sfu.models.WebsocketReconnectStrategy;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B'\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m65681d2 = {"Lstream/video/sfu/event/Error;", "Lcom/squareup/wire/l;", "", "Lstream/video/sfu/models/Error;", "error", "Lstream/video/sfu/models/WebsocketReconnectStrategy;", "reconnect_strategy", "Lne3/l;", "unknownFields", "<init>", "(Lstream/video/sfu/models/Error;Lstream/video/sfu/models/WebsocketReconnectStrategy;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lstream/video/sfu/models/Error;Lstream/video/sfu/models/WebsocketReconnectStrategy;Lne3/l;)Lstream/video/sfu/event/Error;", "Lstream/video/sfu/models/Error;", "getError", "()Lstream/video/sfu/models/Error;", "Lstream/video/sfu/models/WebsocketReconnectStrategy;", "getReconnect_strategy", "()Lstream/video/sfu/models/WebsocketReconnectStrategy;", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class Error extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.Error#ADAPTER", label = EnumC5595z.f22132F, tag = 4)
    private final stream.video.sfu.models.Error error;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.WebsocketReconnectStrategy#ADAPTER", jsonName = "reconnectStrategy", label = EnumC5595z.f22132F, tag = 5)
    private final WebsocketReconnectStrategy reconnect_strategy;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(Error.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.event.Error$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public Error decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                Object objDecode = WebsocketReconnectStrategy.WEBSOCKET_RECONNECT_STRATEGY_UNSPECIFIED;
                long jM16807d = reader.m16807d();
                Object objDecode2 = null;
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new Error((stream.video.sfu.models.Error) objDecode2, (WebsocketReconnectStrategy) objDecode, reader.m16808e(jM16807d));
                    }
                    if (iM16810g == 4) {
                        objDecode2 = stream.video.sfu.models.Error.ADAPTER.decode(reader);
                    } else if (iM16810g != 5) {
                        reader.m16813j(iM16810g);
                    } else {
                        try {
                            objDecode = WebsocketReconnectStrategy.ADAPTER.decode(reader);
                        } catch (ProtoAdapter$EnumConstantNotFoundException e5) {
                            reader.m16804a(iM16810g, EnumC5573d.VARINT, Long.valueOf(e5.f22081w));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(Error value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (value.getError() != null) {
                    iMo79253d += stream.video.sfu.models.Error.ADAPTER.encodedSizeWithTag(4, value.getError());
                }
                return value.getReconnect_strategy() != WebsocketReconnectStrategy.WEBSOCKET_RECONNECT_STRATEGY_UNSPECIFIED ? WebsocketReconnectStrategy.ADAPTER.encodedSizeWithTag(5, value.getReconnect_strategy()) + iMo79253d : iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public Error redact(Error value) {
                AbstractC22676k.m65750j(value, "value");
                stream.video.sfu.models.Error error = value.getError();
                return Error.copy$default(value, error != null ? (stream.video.sfu.models.Error) stream.video.sfu.models.Error.ADAPTER.redact(error) : null, null, C26624l.f105881E, 2, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, Error value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (value.getError() != null) {
                    stream.video.sfu.models.Error.ADAPTER.encodeWithTag(writer, 4, value.getError());
                }
                if (value.getReconnect_strategy() != WebsocketReconnectStrategy.WEBSOCKET_RECONNECT_STRATEGY_UNSPECIFIED) {
                    WebsocketReconnectStrategy.ADAPTER.encodeWithTag(writer, 5, value.getReconnect_strategy());
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, Error value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (value.getReconnect_strategy() != WebsocketReconnectStrategy.WEBSOCKET_RECONNECT_STRATEGY_UNSPECIFIED) {
                    WebsocketReconnectStrategy.ADAPTER.encodeWithTag(writer, 5, value.getReconnect_strategy());
                }
                if (value.getError() != null) {
                    stream.video.sfu.models.Error.ADAPTER.encodeWithTag(writer, 4, value.getError());
                }
            }
        };
    }

    public Error() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Error copy$default(Error error, stream.video.sfu.models.Error error2, WebsocketReconnectStrategy websocketReconnectStrategy, C26624l c26624l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            error2 = error.error;
        }
        if ((i13 & 2) != 0) {
            websocketReconnectStrategy = error.reconnect_strategy;
        }
        if ((i13 & 4) != 0) {
            c26624l = error.unknownFields();
        }
        return error.copy(error2, websocketReconnectStrategy, c26624l);
    }

    public final Error copy(stream.video.sfu.models.Error error, WebsocketReconnectStrategy reconnect_strategy, C26624l unknownFields) {
        AbstractC22676k.m65750j(reconnect_strategy, "reconnect_strategy");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new Error(error, reconnect_strategy, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Error)) {
            return false;
        }
        Error error = (Error) other;
        return AbstractC22676k.m65745e(unknownFields(), error.unknownFields()) && AbstractC22676k.m65745e(this.error, error.error) && this.reconnect_strategy == error.reconnect_strategy;
    }

    public final stream.video.sfu.models.Error getError() {
        return this.error;
    }

    public final WebsocketReconnectStrategy getReconnect_strategy() {
        return this.reconnect_strategy;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        stream.video.sfu.models.Error error = this.error;
        int iHashCode2 = this.reconnect_strategy.hashCode() + ((iHashCode + (error != null ? error.hashCode() : 0)) * 37);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134492newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        stream.video.sfu.models.Error error = this.error;
        if (error != null) {
            arrayList.add("error=" + error);
        }
        arrayList.add("reconnect_strategy=" + this.reconnect_strategy);
        return AbstractC25265s.m74110N0(arrayList, ", ", "Error{", "}", null, 56);
    }

    public /* synthetic */ Error(stream.video.sfu.models.Error error, WebsocketReconnectStrategy websocketReconnectStrategy, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : error, (i13 & 2) != 0 ? WebsocketReconnectStrategy.WEBSOCKET_RECONNECT_STRATEGY_UNSPECIFIED : websocketReconnectStrategy, (i13 & 4) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134492newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Error(stream.video.sfu.models.Error error, WebsocketReconnectStrategy reconnect_strategy, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(reconnect_strategy, "reconnect_strategy");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.error = error;
        this.reconnect_strategy = reconnect_strategy;
    }
}
