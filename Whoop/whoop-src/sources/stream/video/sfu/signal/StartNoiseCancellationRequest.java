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
import jh3.AbstractC21702c;
import l83.InterfaceC23457c;
import m83.AbstractC25265s;
import ne3.C26624l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u001a"}, m65681d2 = {"Lstream/video/sfu/signal/StartNoiseCancellationRequest;", "Lcom/squareup/wire/l;", "", "", "session_id", "Lne3/l;", "unknownFields", "<init>", "(Ljava/lang/String;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lne3/l;)Lstream/video/sfu/signal/StartNoiseCancellationRequest;", "Ljava/lang/String;", "getSession_id", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class StartNoiseCancellationRequest extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sessionId", label = EnumC5595z.f22132F, tag = 1)
    private final String session_id;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(StartNoiseCancellationRequest.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.signal.StartNoiseCancellationRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public StartNoiseCancellationRequest decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                long jM16807d = reader.m16807d();
                Object objDecode = "";
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new StartNoiseCancellationRequest((String) objDecode, reader.m16808e(jM16807d));
                    }
                    if (iM16810g == 1) {
                        objDecode = AbstractC5586q.STRING.decode(reader);
                    } else {
                        reader.m16813j(iM16810g);
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(StartNoiseCancellationRequest value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                return !AbstractC22676k.m65745e(value.getSession_id(), "") ? AbstractC5586q.STRING.encodedSizeWithTag(1, value.getSession_id()) + iMo79253d : iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public StartNoiseCancellationRequest redact(StartNoiseCancellationRequest value) {
                AbstractC22676k.m65750j(value, "value");
                return StartNoiseCancellationRequest.copy$default(value, null, C26624l.f105881E, 1, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, StartNoiseCancellationRequest value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (!AbstractC22676k.m65745e(value.getSession_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 1, value.getSession_id());
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, StartNoiseCancellationRequest value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (AbstractC22676k.m65745e(value.getSession_id(), "")) {
                    return;
                }
                AbstractC5586q.STRING.encodeWithTag(writer, 1, value.getSession_id());
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StartNoiseCancellationRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ StartNoiseCancellationRequest copy$default(StartNoiseCancellationRequest startNoiseCancellationRequest, String str, C26624l c26624l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = startNoiseCancellationRequest.session_id;
        }
        if ((i13 & 2) != 0) {
            c26624l = startNoiseCancellationRequest.unknownFields();
        }
        return startNoiseCancellationRequest.copy(str, c26624l);
    }

    public final StartNoiseCancellationRequest copy(String session_id, C26624l unknownFields) {
        AbstractC22676k.m65750j(session_id, "session_id");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new StartNoiseCancellationRequest(session_id, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StartNoiseCancellationRequest)) {
            return false;
        }
        StartNoiseCancellationRequest startNoiseCancellationRequest = (StartNoiseCancellationRequest) other;
        return AbstractC22676k.m65745e(unknownFields(), startNoiseCancellationRequest.unknownFields()) && AbstractC22676k.m65745e(this.session_id, startNoiseCancellationRequest.session_id);
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = this.session_id.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134562newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC21702c.m61149t(arrayList, this.session_id, "session_id=");
        return AbstractC25265s.m74110N0(arrayList, ", ", "StartNoiseCancellationRequest{", "}", null, 56);
    }

    public /* synthetic */ StartNoiseCancellationRequest(String str, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134562newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartNoiseCancellationRequest(String session_id, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(session_id, "session_id");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.session_id = session_id;
    }
}
