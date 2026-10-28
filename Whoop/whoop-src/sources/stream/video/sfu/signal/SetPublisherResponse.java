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
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import stream.video.sfu.models.Error;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B;\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001d\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, m65681d2 = {"Lstream/video/sfu/signal/SetPublisherResponse;", "Lcom/squareup/wire/l;", "", "", "sdp", "session_id", "", "ice_restart", "Lstream/video/sfu/models/Error;", "error", "Lne3/l;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLstream/video/sfu/models/Error;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLstream/video/sfu/models/Error;Lne3/l;)Lstream/video/sfu/signal/SetPublisherResponse;", "Ljava/lang/String;", "getSdp", "getSession_id", "Z", "getIce_restart", "()Z", "Lstream/video/sfu/models/Error;", "getError", "()Lstream/video/sfu/models/Error;", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class SetPublisherResponse extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.Error#ADAPTER", label = EnumC5595z.f22132F, tag = 4)
    private final Error error;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "iceRestart", label = EnumC5595z.f22132F, tag = 3)
    private final boolean ice_restart;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = EnumC5595z.f22132F, tag = 1)
    private final String sdp;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sessionId", label = EnumC5595z.f22132F, tag = 2)
    private final String session_id;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(SetPublisherResponse.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.signal.SetPublisherResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public SetPublisherResponse decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                long jM16807d = reader.m16807d();
                Object objDecode = "";
                Object objDecode2 = null;
                boolean zBooleanValue = false;
                Object objDecode3 = "";
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new SetPublisherResponse((String) objDecode, (String) objDecode3, zBooleanValue, (Error) objDecode2, reader.m16808e(jM16807d));
                    }
                    if (iM16810g == 1) {
                        objDecode = AbstractC5586q.STRING.decode(reader);
                    } else if (iM16810g == 2) {
                        objDecode3 = AbstractC5586q.STRING.decode(reader);
                    } else if (iM16810g == 3) {
                        zBooleanValue = ((Boolean) AbstractC5586q.BOOL.decode(reader)).booleanValue();
                    } else if (iM16810g != 4) {
                        reader.m16813j(iM16810g);
                    } else {
                        objDecode2 = Error.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(SetPublisherResponse value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (!AbstractC22676k.m65745e(value.getSdp(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(1, value.getSdp());
                }
                if (!AbstractC22676k.m65745e(value.getSession_id(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(2, value.getSession_id());
                }
                if (value.getIce_restart()) {
                    iMo79253d += AbstractC5586q.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getIce_restart()));
                }
                return value.getError() != null ? Error.ADAPTER.encodedSizeWithTag(4, value.getError()) + iMo79253d : iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public SetPublisherResponse redact(SetPublisherResponse value) {
                AbstractC22676k.m65750j(value, "value");
                Error error = value.getError();
                return SetPublisherResponse.copy$default(value, null, null, false, error != null ? (Error) Error.ADAPTER.redact(error) : null, C26624l.f105881E, 7, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, SetPublisherResponse value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (!AbstractC22676k.m65745e(value.getSdp(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 1, value.getSdp());
                }
                if (!AbstractC22676k.m65745e(value.getSession_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getSession_id());
                }
                if (value.getIce_restart()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 3, Boolean.valueOf(value.getIce_restart()));
                }
                if (value.getError() != null) {
                    Error.ADAPTER.encodeWithTag(writer, 4, value.getError());
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, SetPublisherResponse value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (value.getError() != null) {
                    Error.ADAPTER.encodeWithTag(writer, 4, value.getError());
                }
                if (value.getIce_restart()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 3, Boolean.valueOf(value.getIce_restart()));
                }
                if (!AbstractC22676k.m65745e(value.getSession_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getSession_id());
                }
                if (AbstractC22676k.m65745e(value.getSdp(), "")) {
                    return;
                }
                AbstractC5586q.STRING.encodeWithTag(writer, 1, value.getSdp());
            }
        };
    }

    public SetPublisherResponse() {
        this(null, null, false, null, null, 31, null);
    }

    public static /* synthetic */ SetPublisherResponse copy$default(SetPublisherResponse setPublisherResponse, String str, String str2, boolean z4, Error error, C26624l c26624l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = setPublisherResponse.sdp;
        }
        if ((i13 & 2) != 0) {
            str2 = setPublisherResponse.session_id;
        }
        if ((i13 & 4) != 0) {
            z4 = setPublisherResponse.ice_restart;
        }
        if ((i13 & 8) != 0) {
            error = setPublisherResponse.error;
        }
        if ((i13 & 16) != 0) {
            c26624l = setPublisherResponse.unknownFields();
        }
        C26624l c26624l2 = c26624l;
        boolean z13 = z4;
        return setPublisherResponse.copy(str, str2, z13, error, c26624l2);
    }

    public final SetPublisherResponse copy(String sdp, String session_id, boolean ice_restart, Error error, C26624l unknownFields) {
        AbstractC22676k.m65750j(sdp, "sdp");
        AbstractC22676k.m65750j(session_id, "session_id");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new SetPublisherResponse(sdp, session_id, ice_restart, error, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SetPublisherResponse)) {
            return false;
        }
        SetPublisherResponse setPublisherResponse = (SetPublisherResponse) other;
        return AbstractC22676k.m65745e(unknownFields(), setPublisherResponse.unknownFields()) && AbstractC22676k.m65745e(this.sdp, setPublisherResponse.sdp) && AbstractC22676k.m65745e(this.session_id, setPublisherResponse.session_id) && this.ice_restart == setPublisherResponse.ice_restart && AbstractC22676k.m65745e(this.error, setPublisherResponse.error);
    }

    public final Error getError() {
        return this.error;
    }

    public final boolean getIce_restart() {
        return this.ice_restart;
    }

    public final String getSdp() {
        return this.sdp;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(unknownFields().hashCode() * 37, 37, this.sdp), 37, this.session_id), 37, this.ice_restart);
        Error error = this.error;
        int iHashCode = iM8289b + (error != null ? error.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134561newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC21702c.m61149t(arrayList, this.sdp, "sdp=");
        AbstractC21702c.m61149t(arrayList, this.session_id, "session_id=");
        AbstractC30007c.m91854x("ice_restart=", this.ice_restart, arrayList);
        Error error = this.error;
        if (error != null) {
            arrayList.add("error=" + error);
        }
        return AbstractC25265s.m74110N0(arrayList, ", ", "SetPublisherResponse{", "}", null, 56);
    }

    public /* synthetic */ SetPublisherResponse(String str, String str2, boolean z4, Error error, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? null : error, (i13 & 16) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134561newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetPublisherResponse(String sdp, String session_id, boolean z4, Error error, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(sdp, "sdp");
        AbstractC22676k.m65750j(session_id, "session_id");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.sdp = sdp;
        this.session_id = session_id;
        this.ice_restart = z4;
        this.error = error;
    }
}
