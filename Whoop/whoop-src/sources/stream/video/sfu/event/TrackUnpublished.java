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
import stream.video.sfu.models.Participant;
import stream.video.sfu.models.TrackType;
import stream.video.sfu.models.TrackUnpublishReason;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*BE\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJK\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b \u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, m65681d2 = {"Lstream/video/sfu/event/TrackUnpublished;", "Lcom/squareup/wire/l;", "", "", "user_id", "session_id", "Lstream/video/sfu/models/TrackType;", "type", "Lstream/video/sfu/models/TrackUnpublishReason;", "cause", "Lstream/video/sfu/models/Participant;", "participant", "Lne3/l;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/TrackUnpublishReason;Lstream/video/sfu/models/Participant;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/TrackUnpublishReason;Lstream/video/sfu/models/Participant;Lne3/l;)Lstream/video/sfu/event/TrackUnpublished;", "Ljava/lang/String;", "getUser_id", "getSession_id", "Lstream/video/sfu/models/TrackType;", "getType", "()Lstream/video/sfu/models/TrackType;", "Lstream/video/sfu/models/TrackUnpublishReason;", "getCause", "()Lstream/video/sfu/models/TrackUnpublishReason;", "Lstream/video/sfu/models/Participant;", "getParticipant", "()Lstream/video/sfu/models/Participant;", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class TrackUnpublished extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.TrackUnpublishReason#ADAPTER", label = EnumC5595z.f22132F, tag = 4)
    private final TrackUnpublishReason cause;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.Participant#ADAPTER", label = EnumC5595z.f22132F, tag = 5)
    private final Participant participant;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sessionId", label = EnumC5595z.f22132F, tag = 2)
    private final String session_id;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.TrackType#ADAPTER", label = EnumC5595z.f22132F, tag = 3)
    private final TrackType type;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userId", label = EnumC5595z.f22132F, tag = 1)
    private final String user_id;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(TrackUnpublished.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.event.TrackUnpublished$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public TrackUnpublished decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                Object objDecode = TrackType.TRACK_TYPE_UNSPECIFIED;
                TrackUnpublishReason trackUnpublishReason = TrackUnpublishReason.TRACK_UNPUBLISH_REASON_UNSPECIFIED;
                long jM16807d = reader.m16807d();
                Object objDecode2 = "";
                Object objDecode3 = null;
                Object objDecode4 = trackUnpublishReason;
                Object objDecode5 = objDecode2;
                while (true) {
                    Object obj = objDecode;
                    while (true) {
                        int iM16810g = reader.m16810g();
                        if (iM16810g == -1) {
                            return new TrackUnpublished((String) objDecode5, (String) objDecode2, (TrackType) obj, (TrackUnpublishReason) objDecode4, (Participant) objDecode3, reader.m16808e(jM16807d));
                        }
                        if (iM16810g == 1) {
                            objDecode5 = AbstractC5586q.STRING.decode(reader);
                        } else if (iM16810g != 2) {
                            EnumC5573d enumC5573d2 = EnumC5573d.VARINT;
                            if (iM16810g == 3) {
                                try {
                                    objDecode = TrackType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter$EnumConstantNotFoundException e5) {
                                    reader.m16804a(iM16810g, enumC5573d2, Long.valueOf(e5.f22081w));
                                }
                            } else if (iM16810g == 4) {
                                try {
                                    objDecode4 = TrackUnpublishReason.ADAPTER.decode(reader);
                                } catch (ProtoAdapter$EnumConstantNotFoundException e13) {
                                    reader.m16804a(iM16810g, enumC5573d2, Long.valueOf(e13.f22081w));
                                }
                            } else if (iM16810g != 5) {
                                reader.m16813j(iM16810g);
                            } else {
                                objDecode3 = Participant.ADAPTER.decode(reader);
                            }
                        } else {
                            objDecode2 = AbstractC5586q.STRING.decode(reader);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(TrackUnpublished value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (!AbstractC22676k.m65745e(value.getUser_id(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(1, value.getUser_id());
                }
                if (!AbstractC22676k.m65745e(value.getSession_id(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(2, value.getSession_id());
                }
                if (value.getType() != TrackType.TRACK_TYPE_UNSPECIFIED) {
                    iMo79253d += TrackType.ADAPTER.encodedSizeWithTag(3, value.getType());
                }
                if (value.getCause() != TrackUnpublishReason.TRACK_UNPUBLISH_REASON_UNSPECIFIED) {
                    iMo79253d += TrackUnpublishReason.ADAPTER.encodedSizeWithTag(4, value.getCause());
                }
                return value.getParticipant() != null ? Participant.ADAPTER.encodedSizeWithTag(5, value.getParticipant()) + iMo79253d : iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public TrackUnpublished redact(TrackUnpublished value) {
                AbstractC22676k.m65750j(value, "value");
                Participant participant = value.getParticipant();
                return TrackUnpublished.copy$default(value, null, null, null, null, participant != null ? (Participant) Participant.ADAPTER.redact(participant) : null, C26624l.f105881E, 15, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, TrackUnpublished value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (!AbstractC22676k.m65745e(value.getUser_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 1, value.getUser_id());
                }
                if (!AbstractC22676k.m65745e(value.getSession_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getSession_id());
                }
                if (value.getType() != TrackType.TRACK_TYPE_UNSPECIFIED) {
                    TrackType.ADAPTER.encodeWithTag(writer, 3, value.getType());
                }
                if (value.getCause() != TrackUnpublishReason.TRACK_UNPUBLISH_REASON_UNSPECIFIED) {
                    TrackUnpublishReason.ADAPTER.encodeWithTag(writer, 4, value.getCause());
                }
                if (value.getParticipant() != null) {
                    Participant.ADAPTER.encodeWithTag(writer, 5, value.getParticipant());
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, TrackUnpublished value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (value.getParticipant() != null) {
                    Participant.ADAPTER.encodeWithTag(writer, 5, value.getParticipant());
                }
                if (value.getCause() != TrackUnpublishReason.TRACK_UNPUBLISH_REASON_UNSPECIFIED) {
                    TrackUnpublishReason.ADAPTER.encodeWithTag(writer, 4, value.getCause());
                }
                if (value.getType() != TrackType.TRACK_TYPE_UNSPECIFIED) {
                    TrackType.ADAPTER.encodeWithTag(writer, 3, value.getType());
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

    public TrackUnpublished() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ TrackUnpublished copy$default(TrackUnpublished trackUnpublished, String str, String str2, TrackType trackType, TrackUnpublishReason trackUnpublishReason, Participant participant, C26624l c26624l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = trackUnpublished.user_id;
        }
        if ((i13 & 2) != 0) {
            str2 = trackUnpublished.session_id;
        }
        if ((i13 & 4) != 0) {
            trackType = trackUnpublished.type;
        }
        if ((i13 & 8) != 0) {
            trackUnpublishReason = trackUnpublished.cause;
        }
        if ((i13 & 16) != 0) {
            participant = trackUnpublished.participant;
        }
        if ((i13 & 32) != 0) {
            c26624l = trackUnpublished.unknownFields();
        }
        Participant participant2 = participant;
        C26624l c26624l2 = c26624l;
        return trackUnpublished.copy(str, str2, trackType, trackUnpublishReason, participant2, c26624l2);
    }

    public final TrackUnpublished copy(String user_id, String session_id, TrackType type, TrackUnpublishReason cause, Participant participant, C26624l unknownFields) {
        AbstractC22676k.m65750j(user_id, "user_id");
        AbstractC22676k.m65750j(session_id, "session_id");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(cause, "cause");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new TrackUnpublished(user_id, session_id, type, cause, participant, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TrackUnpublished)) {
            return false;
        }
        TrackUnpublished trackUnpublished = (TrackUnpublished) other;
        return AbstractC22676k.m65745e(unknownFields(), trackUnpublished.unknownFields()) && AbstractC22676k.m65745e(this.user_id, trackUnpublished.user_id) && AbstractC22676k.m65745e(this.session_id, trackUnpublished.session_id) && this.type == trackUnpublished.type && this.cause == trackUnpublished.cause && AbstractC22676k.m65745e(this.participant, trackUnpublished.participant);
    }

    public final TrackUnpublishReason getCause() {
        return this.cause;
    }

    public final Participant getParticipant() {
        return this.participant;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final TrackType getType() {
        return this.type;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = (this.cause.hashCode() + ((this.type.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(unknownFields().hashCode() * 37, 37, this.user_id), 37, this.session_id)) * 37)) * 37;
        Participant participant = this.participant;
        int iHashCode2 = iHashCode + (participant != null ? participant.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134515newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC21702c.m61149t(arrayList, this.user_id, "user_id=");
        AbstractC21702c.m61149t(arrayList, this.session_id, "session_id=");
        arrayList.add("type=" + this.type);
        arrayList.add("cause=" + this.cause);
        Participant participant = this.participant;
        if (participant != null) {
            arrayList.add("participant=" + participant);
        }
        return AbstractC25265s.m74110N0(arrayList, ", ", "TrackUnpublished{", "}", null, 56);
    }

    public /* synthetic */ TrackUnpublished(String str, String str2, TrackType trackType, TrackUnpublishReason trackUnpublishReason, Participant participant, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? TrackType.TRACK_TYPE_UNSPECIFIED : trackType, (i13 & 8) != 0 ? TrackUnpublishReason.TRACK_UNPUBLISH_REASON_UNSPECIFIED : trackUnpublishReason, (i13 & 16) != 0 ? null : participant, (i13 & 32) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134515newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackUnpublished(String user_id, String session_id, TrackType type, TrackUnpublishReason cause, Participant participant, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(user_id, "user_id");
        AbstractC22676k.m65750j(session_id, "session_id");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(cause, "cause");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.user_id = user_id;
        this.session_id = session_id;
        this.type = type;
        this.cause = cause;
        this.participant = participant;
    }
}
