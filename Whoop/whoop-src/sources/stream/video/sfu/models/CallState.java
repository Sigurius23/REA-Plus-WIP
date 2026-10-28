package stream.video.sfu.models;

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
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import l83.InterfaceC23457c;
import m83.AbstractC25265s;
import m83.C25271y;
import ne3.C26624l;
import nh3.AbstractC26725a;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import s30.AbstractC32103e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*BO\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJU\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b)\u0010(¨\u0006+"}, m65681d2 = {"Lstream/video/sfu/models/CallState;", "Lcom/squareup/wire/l;", "", "", "Lstream/video/sfu/models/Participant;", "participants", "Ljava/time/Instant;", "Lcom/squareup/wire/Instant;", "started_at", "Lstream/video/sfu/models/ParticipantCount;", "participant_count", "Lstream/video/sfu/models/Pin;", "pins", "Lne3/l;", "unknownFields", "<init>", "(Ljava/util/List;Ljava/time/Instant;Lstream/video/sfu/models/ParticipantCount;Ljava/util/List;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/time/Instant;Lstream/video/sfu/models/ParticipantCount;Ljava/util/List;Lne3/l;)Lstream/video/sfu/models/CallState;", "Ljava/time/Instant;", "getStarted_at", "()Ljava/time/Instant;", "Lstream/video/sfu/models/ParticipantCount;", "getParticipant_count", "()Lstream/video/sfu/models/ParticipantCount;", "Ljava/util/List;", "getParticipants", "()Ljava/util/List;", "getPins", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class CallState extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.ParticipantCount#ADAPTER", jsonName = "participantCount", label = EnumC5595z.f22132F, tag = 3)
    private final ParticipantCount participant_count;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.Participant#ADAPTER", label = EnumC5595z.f22136y, tag = 1)
    private final List<Participant> participants;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.Pin#ADAPTER", label = EnumC5595z.f22136y, tag = 4)
    private final List<Pin> pins;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "startedAt", label = EnumC5595z.f22132F, tag = 2)
    private final Instant started_at;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(CallState.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.models.CallState$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public CallState decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jM16807d = reader.m16807d();
                Object objDecode = null;
                Object objDecode2 = null;
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new CallState(arrayList, (Instant) objDecode, (ParticipantCount) objDecode2, arrayList2, reader.m16808e(jM16807d));
                    }
                    if (iM16810g == 1) {
                        arrayList.add(Participant.ADAPTER.decode(reader));
                    } else if (iM16810g == 2) {
                        objDecode = AbstractC5586q.INSTANT.decode(reader);
                    } else if (iM16810g == 3) {
                        objDecode2 = ParticipantCount.ADAPTER.decode(reader);
                    } else if (iM16810g != 4) {
                        reader.m16813j(iM16810g);
                    } else {
                        arrayList2.add(Pin.ADAPTER.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(CallState value) {
                AbstractC22676k.m65750j(value, "value");
                int iEncodedSizeWithTag = Participant.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getParticipants()) + value.unknownFields().mo79253d();
                if (value.getStarted_at() != null) {
                    iEncodedSizeWithTag += AbstractC5586q.INSTANT.encodedSizeWithTag(2, value.getStarted_at());
                }
                if (value.getParticipant_count() != null) {
                    iEncodedSizeWithTag += ParticipantCount.ADAPTER.encodedSizeWithTag(3, value.getParticipant_count());
                }
                return Pin.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getPins()) + iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public CallState redact(CallState value) {
                AbstractC22676k.m65750j(value, "value");
                ArrayList arrayListM99879a = AbstractC32103e.m99879a(value.getParticipants(), Participant.ADAPTER);
                Instant started_at = value.getStarted_at();
                Instant instant = started_at != null ? (Instant) AbstractC5586q.INSTANT.redact(started_at) : null;
                ParticipantCount participant_count = value.getParticipant_count();
                return value.copy(arrayListM99879a, instant, participant_count != null ? (ParticipantCount) ParticipantCount.ADAPTER.redact(participant_count) : null, AbstractC32103e.m99879a(value.getPins(), Pin.ADAPTER), C26624l.f105881E);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, CallState value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                Participant.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.getParticipants());
                if (value.getStarted_at() != null) {
                    AbstractC5586q.INSTANT.encodeWithTag(writer, 2, value.getStarted_at());
                }
                if (value.getParticipant_count() != null) {
                    ParticipantCount.ADAPTER.encodeWithTag(writer, 3, value.getParticipant_count());
                }
                Pin.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.getPins());
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, CallState value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                Pin.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.getPins());
                if (value.getParticipant_count() != null) {
                    ParticipantCount.ADAPTER.encodeWithTag(writer, 3, value.getParticipant_count());
                }
                if (value.getStarted_at() != null) {
                    AbstractC5586q.INSTANT.encodeWithTag(writer, 2, value.getStarted_at());
                }
                Participant.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.getParticipants());
            }
        };
    }

    public CallState() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CallState copy$default(CallState callState, List list, Instant instant, ParticipantCount participantCount, List list2, C26624l c26624l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = callState.participants;
        }
        if ((i13 & 2) != 0) {
            instant = callState.started_at;
        }
        if ((i13 & 4) != 0) {
            participantCount = callState.participant_count;
        }
        if ((i13 & 8) != 0) {
            list2 = callState.pins;
        }
        if ((i13 & 16) != 0) {
            c26624l = callState.unknownFields();
        }
        C26624l c26624l2 = c26624l;
        ParticipantCount participantCount2 = participantCount;
        return callState.copy(list, instant, participantCount2, list2, c26624l2);
    }

    public final CallState copy(List<Participant> participants, Instant started_at, ParticipantCount participant_count, List<Pin> pins, C26624l unknownFields) {
        AbstractC22676k.m65750j(participants, "participants");
        AbstractC22676k.m65750j(pins, "pins");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new CallState(participants, started_at, participant_count, pins, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CallState)) {
            return false;
        }
        CallState callState = (CallState) other;
        return AbstractC22676k.m65745e(unknownFields(), callState.unknownFields()) && AbstractC22676k.m65745e(this.participants, callState.participants) && AbstractC22676k.m65745e(this.started_at, callState.started_at) && AbstractC22676k.m65745e(this.participant_count, callState.participant_count) && AbstractC22676k.m65745e(this.pins, callState.pins);
    }

    public final ParticipantCount getParticipant_count() {
        return this.participant_count;
    }

    public final List<Participant> getParticipants() {
        return this.participants;
    }

    public final List<Pin> getPins() {
        return this.pins;
    }

    public final Instant getStarted_at() {
        return this.started_at;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iM31983b = AbstractC11895b.m31983b(unknownFields().hashCode() * 37, 37, this.participants);
        Instant instant = this.started_at;
        int iHashCode = (iM31983b + (instant != null ? instant.hashCode() : 0)) * 37;
        ParticipantCount participantCount = this.participant_count;
        int iHashCode2 = this.pins.hashCode() + ((iHashCode + (participantCount != null ? participantCount.hashCode() : 0)) * 37);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134524newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.participants.isEmpty()) {
            AbstractC26725a.m79513q("participants=", this.participants, arrayList);
        }
        Instant instant = this.started_at;
        if (instant != null) {
            arrayList.add("started_at=" + instant);
        }
        ParticipantCount participantCount = this.participant_count;
        if (participantCount != null) {
            arrayList.add("participant_count=" + participantCount);
        }
        if (!this.pins.isEmpty()) {
            AbstractC26725a.m79513q("pins=", this.pins, arrayList);
        }
        return AbstractC25265s.m74110N0(arrayList, ", ", "CallState{", "}", null, 56);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CallState(List list, Instant instant, ParticipantCount participantCount, List list2, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 1;
        C25271y c25271y = C25271y.f99162w;
        this(i14 != 0 ? c25271y : list, (i13 & 2) != 0 ? null : instant, (i13 & 4) != 0 ? null : participantCount, (i13 & 8) != 0 ? c25271y : list2, (i13 & 16) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134524newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallState(List<Participant> participants, Instant instant, ParticipantCount participantCount, List<Pin> pins, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(participants, "participants");
        AbstractC22676k.m65750j(pins, "pins");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.started_at = instant;
        this.participant_count = participantCount;
        this.participants = AbstractC32103e.m99886h("participants", participants);
        this.pins = AbstractC32103e.m99886h("pins", pins);
    }
}
