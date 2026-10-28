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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB'\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m65681d2 = {"Lstream/video/sfu/event/ParticipantLeft;", "Lcom/squareup/wire/l;", "", "", "call_cid", "Lstream/video/sfu/models/Participant;", "participant", "Lne3/l;", "unknownFields", "<init>", "(Ljava/lang/String;Lstream/video/sfu/models/Participant;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lstream/video/sfu/models/Participant;Lne3/l;)Lstream/video/sfu/event/ParticipantLeft;", "Ljava/lang/String;", "getCall_cid", "Lstream/video/sfu/models/Participant;", "getParticipant", "()Lstream/video/sfu/models/Participant;", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class ParticipantLeft extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "callCid", label = EnumC5595z.f22132F, tag = 1)
    private final String call_cid;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.Participant#ADAPTER", label = EnumC5595z.f22132F, tag = 2)
    private final Participant participant;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(ParticipantLeft.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.event.ParticipantLeft$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public ParticipantLeft decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                long jM16807d = reader.m16807d();
                Object objDecode = "";
                Object objDecode2 = null;
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new ParticipantLeft((String) objDecode, (Participant) objDecode2, reader.m16808e(jM16807d));
                    }
                    if (iM16810g == 1) {
                        objDecode = AbstractC5586q.STRING.decode(reader);
                    } else if (iM16810g != 2) {
                        reader.m16813j(iM16810g);
                    } else {
                        objDecode2 = Participant.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(ParticipantLeft value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (!AbstractC22676k.m65745e(value.getCall_cid(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(1, value.getCall_cid());
                }
                return value.getParticipant() != null ? Participant.ADAPTER.encodedSizeWithTag(2, value.getParticipant()) + iMo79253d : iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public ParticipantLeft redact(ParticipantLeft value) {
                AbstractC22676k.m65750j(value, "value");
                Participant participant = value.getParticipant();
                return ParticipantLeft.copy$default(value, null, participant != null ? (Participant) Participant.ADAPTER.redact(participant) : null, C26624l.f105881E, 1, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, ParticipantLeft value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (!AbstractC22676k.m65745e(value.getCall_cid(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 1, value.getCall_cid());
                }
                if (value.getParticipant() != null) {
                    Participant.ADAPTER.encodeWithTag(writer, 2, value.getParticipant());
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, ParticipantLeft value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (value.getParticipant() != null) {
                    Participant.ADAPTER.encodeWithTag(writer, 2, value.getParticipant());
                }
                if (AbstractC22676k.m65745e(value.getCall_cid(), "")) {
                    return;
                }
                AbstractC5586q.STRING.encodeWithTag(writer, 1, value.getCall_cid());
            }
        };
    }

    public ParticipantLeft() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ParticipantLeft copy$default(ParticipantLeft participantLeft, String str, Participant participant, C26624l c26624l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = participantLeft.call_cid;
        }
        if ((i13 & 2) != 0) {
            participant = participantLeft.participant;
        }
        if ((i13 & 4) != 0) {
            c26624l = participantLeft.unknownFields();
        }
        return participantLeft.copy(str, participant, c26624l);
    }

    public final ParticipantLeft copy(String call_cid, Participant participant, C26624l unknownFields) {
        AbstractC22676k.m65750j(call_cid, "call_cid");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new ParticipantLeft(call_cid, participant, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ParticipantLeft)) {
            return false;
        }
        ParticipantLeft participantLeft = (ParticipantLeft) other;
        return AbstractC22676k.m65745e(unknownFields(), participantLeft.unknownFields()) && AbstractC22676k.m65745e(this.call_cid, participantLeft.call_cid) && AbstractC22676k.m65745e(this.participant, participantLeft.participant);
    }

    public final String getCall_cid() {
        return this.call_cid;
    }

    public final Participant getParticipant() {
        return this.participant;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iM30450d = AbstractC11266d.m30450d(unknownFields().hashCode() * 37, 37, this.call_cid);
        Participant participant = this.participant;
        int iHashCode = iM30450d + (participant != null ? participant.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134505newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC21702c.m61149t(arrayList, this.call_cid, "call_cid=");
        Participant participant = this.participant;
        if (participant != null) {
            arrayList.add("participant=" + participant);
        }
        return AbstractC25265s.m74110N0(arrayList, ", ", "ParticipantLeft{", "}", null, 56);
    }

    public /* synthetic */ ParticipantLeft(String str, Participant participant, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? null : participant, (i13 & 4) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134505newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParticipantLeft(String call_cid, Participant participant, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(call_cid, "call_cid");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.call_cid = call_cid;
        this.participant = participant;
    }
}
