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
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import s30.AbstractC32103e;
import stream.video.sfu.models.TrackInfo;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B5\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001d\u0010\u0018R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m65681d2 = {"Lstream/video/sfu/signal/SetPublisherRequest;", "Lcom/squareup/wire/l;", "", "", "sdp", "session_id", "", "Lstream/video/sfu/models/TrackInfo;", "tracks", "Lne3/l;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lne3/l;)Lstream/video/sfu/signal/SetPublisherRequest;", "Ljava/lang/String;", "getSdp", "getSession_id", "Ljava/util/List;", "getTracks", "()Ljava/util/List;", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class SetPublisherRequest extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = EnumC5595z.f22132F, tag = 1)
    private final String sdp;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sessionId", label = EnumC5595z.f22132F, tag = 2)
    private final String session_id;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.TrackInfo#ADAPTER", label = EnumC5595z.f22136y, tag = 3)
    private final List<TrackInfo> tracks;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(SetPublisherRequest.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.signal.SetPublisherRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public SetPublisherRequest decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jM16807d = reader.m16807d();
                Object objDecode = "";
                Object objDecode2 = "";
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new SetPublisherRequest((String) objDecode, (String) objDecode2, arrayList, reader.m16808e(jM16807d));
                    }
                    if (iM16810g == 1) {
                        objDecode = AbstractC5586q.STRING.decode(reader);
                    } else if (iM16810g == 2) {
                        objDecode2 = AbstractC5586q.STRING.decode(reader);
                    } else if (iM16810g != 3) {
                        reader.m16813j(iM16810g);
                    } else {
                        arrayList.add(TrackInfo.ADAPTER.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(SetPublisherRequest value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (!AbstractC22676k.m65745e(value.getSdp(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(1, value.getSdp());
                }
                if (!AbstractC22676k.m65745e(value.getSession_id(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(2, value.getSession_id());
                }
                return TrackInfo.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getTracks()) + iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public SetPublisherRequest redact(SetPublisherRequest value) {
                AbstractC22676k.m65750j(value, "value");
                return SetPublisherRequest.copy$default(value, null, null, AbstractC32103e.m99879a(value.getTracks(), TrackInfo.ADAPTER), C26624l.f105881E, 3, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, SetPublisherRequest value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (!AbstractC22676k.m65745e(value.getSdp(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 1, value.getSdp());
                }
                if (!AbstractC22676k.m65745e(value.getSession_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getSession_id());
                }
                TrackInfo.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.getTracks());
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, SetPublisherRequest value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                TrackInfo.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.getTracks());
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

    public SetPublisherRequest() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SetPublisherRequest copy$default(SetPublisherRequest setPublisherRequest, String str, String str2, List list, C26624l c26624l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = setPublisherRequest.sdp;
        }
        if ((i13 & 2) != 0) {
            str2 = setPublisherRequest.session_id;
        }
        if ((i13 & 4) != 0) {
            list = setPublisherRequest.tracks;
        }
        if ((i13 & 8) != 0) {
            c26624l = setPublisherRequest.unknownFields();
        }
        return setPublisherRequest.copy(str, str2, list, c26624l);
    }

    public final SetPublisherRequest copy(String sdp, String session_id, List<TrackInfo> tracks, C26624l unknownFields) {
        AbstractC22676k.m65750j(sdp, "sdp");
        AbstractC22676k.m65750j(session_id, "session_id");
        AbstractC22676k.m65750j(tracks, "tracks");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new SetPublisherRequest(sdp, session_id, tracks, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SetPublisherRequest)) {
            return false;
        }
        SetPublisherRequest setPublisherRequest = (SetPublisherRequest) other;
        return AbstractC22676k.m65745e(unknownFields(), setPublisherRequest.unknownFields()) && AbstractC22676k.m65745e(this.sdp, setPublisherRequest.sdp) && AbstractC22676k.m65745e(this.session_id, setPublisherRequest.session_id) && AbstractC22676k.m65745e(this.tracks, setPublisherRequest.tracks);
    }

    public final String getSdp() {
        return this.sdp;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final List<TrackInfo> getTracks() {
        return this.tracks;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = this.tracks.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(unknownFields().hashCode() * 37, 37, this.sdp), 37, this.session_id);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134560newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC21702c.m61149t(arrayList, this.sdp, "sdp=");
        AbstractC21702c.m61149t(arrayList, this.session_id, "session_id=");
        if (!this.tracks.isEmpty()) {
            AbstractC26725a.m79513q("tracks=", this.tracks, arrayList);
        }
        return AbstractC25265s.m74110N0(arrayList, ", ", "SetPublisherRequest{", "}", null, 56);
    }

    public /* synthetic */ SetPublisherRequest(String str, String str2, List list, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? C25271y.f99162w : list, (i13 & 8) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134560newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetPublisherRequest(String sdp, String session_id, List<TrackInfo> tracks, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(sdp, "sdp");
        AbstractC22676k.m65750j(session_id, "session_id");
        AbstractC22676k.m65750j(tracks, "tracks");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.sdp = sdp;
        this.session_id = session_id;
        this.tracks = AbstractC32103e.m99886h("tracks", tracks);
    }
}
