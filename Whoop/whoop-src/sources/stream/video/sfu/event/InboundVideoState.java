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
import q63.AbstractC30007c;
import stream.video.sfu.models.TrackType;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B9\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J?\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001d\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, m65681d2 = {"Lstream/video/sfu/event/InboundVideoState;", "Lcom/squareup/wire/l;", "", "", "user_id", "session_id", "Lstream/video/sfu/models/TrackType;", "track_type", "", "paused", "Lne3/l;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/TrackType;ZLne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/TrackType;ZLne3/l;)Lstream/video/sfu/event/InboundVideoState;", "Ljava/lang/String;", "getUser_id", "getSession_id", "Lstream/video/sfu/models/TrackType;", "getTrack_type", "()Lstream/video/sfu/models/TrackType;", "Z", "getPaused", "()Z", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class InboundVideoState extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = EnumC5595z.f22132F, tag = 4)
    private final boolean paused;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sessionId", label = EnumC5595z.f22132F, tag = 2)
    private final String session_id;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.TrackType#ADAPTER", jsonName = "trackType", label = EnumC5595z.f22132F, tag = 3)
    private final TrackType track_type;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userId", label = EnumC5595z.f22132F, tag = 1)
    private final String user_id;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(InboundVideoState.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.event.InboundVideoState$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public InboundVideoState decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                TrackType trackType = TrackType.TRACK_TYPE_UNSPECIFIED;
                long jM16807d = reader.m16807d();
                Object objDecode = "";
                boolean zBooleanValue = false;
                Object objDecode2 = trackType;
                Object objDecode3 = objDecode;
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new InboundVideoState((String) objDecode3, (String) objDecode, (TrackType) objDecode2, zBooleanValue, reader.m16808e(jM16807d));
                    }
                    if (iM16810g == 1) {
                        objDecode3 = AbstractC5586q.STRING.decode(reader);
                    } else if (iM16810g == 2) {
                        objDecode = AbstractC5586q.STRING.decode(reader);
                    } else if (iM16810g == 3) {
                        try {
                            objDecode2 = TrackType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter$EnumConstantNotFoundException e5) {
                            reader.m16804a(iM16810g, EnumC5573d.VARINT, Long.valueOf(e5.f22081w));
                        }
                    } else if (iM16810g != 4) {
                        reader.m16813j(iM16810g);
                    } else {
                        zBooleanValue = ((Boolean) AbstractC5586q.BOOL.decode(reader)).booleanValue();
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(InboundVideoState value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (!AbstractC22676k.m65745e(value.getUser_id(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(1, value.getUser_id());
                }
                if (!AbstractC22676k.m65745e(value.getSession_id(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(2, value.getSession_id());
                }
                if (value.getTrack_type() != TrackType.TRACK_TYPE_UNSPECIFIED) {
                    iMo79253d += TrackType.ADAPTER.encodedSizeWithTag(3, value.getTrack_type());
                }
                return value.getPaused() ? AbstractC5586q.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getPaused())) + iMo79253d : iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public InboundVideoState redact(InboundVideoState value) {
                AbstractC22676k.m65750j(value, "value");
                return InboundVideoState.copy$default(value, null, null, null, false, C26624l.f105881E, 15, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, InboundVideoState value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (!AbstractC22676k.m65745e(value.getUser_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 1, value.getUser_id());
                }
                if (!AbstractC22676k.m65745e(value.getSession_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getSession_id());
                }
                if (value.getTrack_type() != TrackType.TRACK_TYPE_UNSPECIFIED) {
                    TrackType.ADAPTER.encodeWithTag(writer, 3, value.getTrack_type());
                }
                if (value.getPaused()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 4, Boolean.valueOf(value.getPaused()));
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, InboundVideoState value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (value.getPaused()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 4, Boolean.valueOf(value.getPaused()));
                }
                if (value.getTrack_type() != TrackType.TRACK_TYPE_UNSPECIFIED) {
                    TrackType.ADAPTER.encodeWithTag(writer, 3, value.getTrack_type());
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

    public InboundVideoState() {
        this(null, null, null, false, null, 31, null);
    }

    public static /* synthetic */ InboundVideoState copy$default(InboundVideoState inboundVideoState, String str, String str2, TrackType trackType, boolean z4, C26624l c26624l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = inboundVideoState.user_id;
        }
        if ((i13 & 2) != 0) {
            str2 = inboundVideoState.session_id;
        }
        if ((i13 & 4) != 0) {
            trackType = inboundVideoState.track_type;
        }
        if ((i13 & 8) != 0) {
            z4 = inboundVideoState.paused;
        }
        if ((i13 & 16) != 0) {
            c26624l = inboundVideoState.unknownFields();
        }
        C26624l c26624l2 = c26624l;
        TrackType trackType2 = trackType;
        return inboundVideoState.copy(str, str2, trackType2, z4, c26624l2);
    }

    public final InboundVideoState copy(String user_id, String session_id, TrackType track_type, boolean paused, C26624l unknownFields) {
        AbstractC22676k.m65750j(user_id, "user_id");
        AbstractC22676k.m65750j(session_id, "session_id");
        AbstractC22676k.m65750j(track_type, "track_type");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new InboundVideoState(user_id, session_id, track_type, paused, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InboundVideoState)) {
            return false;
        }
        InboundVideoState inboundVideoState = (InboundVideoState) other;
        return AbstractC22676k.m65745e(unknownFields(), inboundVideoState.unknownFields()) && AbstractC22676k.m65745e(this.user_id, inboundVideoState.user_id) && AbstractC22676k.m65745e(this.session_id, inboundVideoState.session_id) && this.track_type == inboundVideoState.track_type && this.paused == inboundVideoState.paused;
    }

    public final boolean getPaused() {
        return this.paused;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final TrackType getTrack_type() {
        return this.track_type;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = Boolean.hashCode(this.paused) + ((this.track_type.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(unknownFields().hashCode() * 37, 37, this.user_id), 37, this.session_id)) * 37);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134499newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC21702c.m61149t(arrayList, this.user_id, "user_id=");
        AbstractC21702c.m61149t(arrayList, this.session_id, "session_id=");
        arrayList.add("track_type=" + this.track_type);
        AbstractC30007c.m91854x("paused=", this.paused, arrayList);
        return AbstractC25265s.m74110N0(arrayList, ", ", "InboundVideoState{", "}", null, 56);
    }

    public /* synthetic */ InboundVideoState(String str, String str2, TrackType trackType, boolean z4, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? TrackType.TRACK_TYPE_UNSPECIFIED : trackType, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134499newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboundVideoState(String user_id, String session_id, TrackType track_type, boolean z4, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(user_id, "user_id");
        AbstractC22676k.m65750j(session_id, "session_id");
        AbstractC22676k.m65750j(track_type, "track_type");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.user_id = user_id;
        this.session_id = session_id;
        this.track_type = track_type;
        this.paused = z4;
    }
}
