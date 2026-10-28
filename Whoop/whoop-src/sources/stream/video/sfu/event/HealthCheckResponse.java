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
import l83.InterfaceC23457c;
import m83.AbstractC25265s;
import ne3.C26624l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import stream.video.sfu.models.ParticipantCount;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u001d\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lstream/video/sfu/event/HealthCheckResponse;", "Lcom/squareup/wire/l;", "", "Lstream/video/sfu/models/ParticipantCount;", "participant_count", "Lne3/l;", "unknownFields", "<init>", "(Lstream/video/sfu/models/ParticipantCount;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lstream/video/sfu/models/ParticipantCount;Lne3/l;)Lstream/video/sfu/event/HealthCheckResponse;", "Lstream/video/sfu/models/ParticipantCount;", "getParticipant_count", "()Lstream/video/sfu/models/ParticipantCount;", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class HealthCheckResponse extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.ParticipantCount#ADAPTER", jsonName = "participantCount", label = EnumC5595z.f22132F, tag = 1)
    private final ParticipantCount participant_count;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(HealthCheckResponse.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.event.HealthCheckResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public HealthCheckResponse decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                long jM16807d = reader.m16807d();
                Object objDecode = null;
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new HealthCheckResponse((ParticipantCount) objDecode, reader.m16808e(jM16807d));
                    }
                    if (iM16810g == 1) {
                        objDecode = ParticipantCount.ADAPTER.decode(reader);
                    } else {
                        reader.m16813j(iM16810g);
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(HealthCheckResponse value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                return value.getParticipant_count() != null ? ParticipantCount.ADAPTER.encodedSizeWithTag(1, value.getParticipant_count()) + iMo79253d : iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public HealthCheckResponse redact(HealthCheckResponse value) {
                AbstractC22676k.m65750j(value, "value");
                ParticipantCount participant_count = value.getParticipant_count();
                return value.copy(participant_count != null ? (ParticipantCount) ParticipantCount.ADAPTER.redact(participant_count) : null, C26624l.f105881E);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, HealthCheckResponse value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (value.getParticipant_count() != null) {
                    ParticipantCount.ADAPTER.encodeWithTag(writer, 1, value.getParticipant_count());
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, HealthCheckResponse value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (value.getParticipant_count() != null) {
                    ParticipantCount.ADAPTER.encodeWithTag(writer, 1, value.getParticipant_count());
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HealthCheckResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ HealthCheckResponse copy$default(HealthCheckResponse healthCheckResponse, ParticipantCount participantCount, C26624l c26624l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            participantCount = healthCheckResponse.participant_count;
        }
        if ((i13 & 2) != 0) {
            c26624l = healthCheckResponse.unknownFields();
        }
        return healthCheckResponse.copy(participantCount, c26624l);
    }

    public final HealthCheckResponse copy(ParticipantCount participant_count, C26624l unknownFields) {
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new HealthCheckResponse(participant_count, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof HealthCheckResponse)) {
            return false;
        }
        HealthCheckResponse healthCheckResponse = (HealthCheckResponse) other;
        return AbstractC22676k.m65745e(unknownFields(), healthCheckResponse.unknownFields()) && AbstractC22676k.m65745e(this.participant_count, healthCheckResponse.participant_count);
    }

    public final ParticipantCount getParticipant_count() {
        return this.participant_count;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ParticipantCount participantCount = this.participant_count;
        int iHashCode2 = iHashCode + (participantCount != null ? participantCount.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134495newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        ParticipantCount participantCount = this.participant_count;
        if (participantCount != null) {
            arrayList.add("participant_count=" + participantCount);
        }
        return AbstractC25265s.m74110N0(arrayList, ", ", "HealthCheckResponse{", "}", null, 56);
    }

    public /* synthetic */ HealthCheckResponse(ParticipantCount participantCount, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : participantCount, (i13 & 2) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134495newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthCheckResponse(ParticipantCount participantCount, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.participant_count = participantCount;
    }
}
