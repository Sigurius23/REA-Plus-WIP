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
import io.getstream.chat.android.client.api2.model.requests.CreatePollRequest;
import j93.InterfaceC21461d;
import java.io.IOException;
import java.util.ArrayList;
import l83.InterfaceC23457c;
import m83.AbstractC25265s;
import ne3.C26624l;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001a\u0010\u0012¨\u0006\u001c"}, m65681d2 = {"Lstream/video/sfu/models/ParticipantCount;", "Lcom/squareup/wire/l;", "", "", "total", CreatePollRequest.VOTING_VISIBILITY_ANONYMOUS, "Lne3/l;", "unknownFields", "<init>", "(IILne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(IILne3/l;)Lstream/video/sfu/models/ParticipantCount;", "I", "getTotal", "getAnonymous", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class ParticipantCount extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = EnumC5595z.f22132F, tag = 2)
    private final int anonymous;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = EnumC5595z.f22132F, tag = 1)
    private final int total;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(ParticipantCount.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.models.ParticipantCount$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public ParticipantCount decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                long jM16807d = reader.m16807d();
                int iIntValue = 0;
                int iIntValue2 = 0;
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new ParticipantCount(iIntValue, iIntValue2, reader.m16808e(jM16807d));
                    }
                    if (iM16810g == 1) {
                        iIntValue = ((Number) AbstractC5586q.UINT32.decode(reader)).intValue();
                    } else if (iM16810g != 2) {
                        reader.m16813j(iM16810g);
                    } else {
                        iIntValue2 = ((Number) AbstractC5586q.UINT32.decode(reader)).intValue();
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(ParticipantCount value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (value.getTotal() != 0) {
                    iMo79253d += AbstractC5586q.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.getTotal()));
                }
                return value.getAnonymous() != 0 ? AbstractC5586q.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.getAnonymous())) + iMo79253d : iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public ParticipantCount redact(ParticipantCount value) {
                AbstractC22676k.m65750j(value, "value");
                return ParticipantCount.copy$default(value, 0, 0, C26624l.f105881E, 3, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, ParticipantCount value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (value.getTotal() != 0) {
                    AbstractC5586q.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.getTotal()));
                }
                if (value.getAnonymous() != 0) {
                    AbstractC5586q.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.getAnonymous()));
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, ParticipantCount value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (value.getAnonymous() != 0) {
                    AbstractC5586q.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.getAnonymous()));
                }
                if (value.getTotal() != 0) {
                    AbstractC5586q.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.getTotal()));
                }
            }
        };
    }

    public ParticipantCount() {
        this(0, 0, null, 7, null);
    }

    public static /* synthetic */ ParticipantCount copy$default(ParticipantCount participantCount, int i13, int i14, C26624l c26624l, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = participantCount.total;
        }
        if ((i15 & 2) != 0) {
            i14 = participantCount.anonymous;
        }
        if ((i15 & 4) != 0) {
            c26624l = participantCount.unknownFields();
        }
        return participantCount.copy(i13, i14, c26624l);
    }

    public final ParticipantCount copy(int total, int anonymous, C26624l unknownFields) {
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new ParticipantCount(total, anonymous, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ParticipantCount)) {
            return false;
        }
        ParticipantCount participantCount = (ParticipantCount) other;
        return AbstractC22676k.m65745e(unknownFields(), participantCount.unknownFields()) && this.total == participantCount.total && this.anonymous == participantCount.anonymous;
    }

    public final int getAnonymous() {
        return this.anonymous;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = Integer.hashCode(this.anonymous) + AbstractC11266d.m30448b(this.total, unknownFields().hashCode() * 37, 37);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134535newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC38963t7.m124389s(this.total, "total=", arrayList);
        AbstractC38963t7.m124389s(this.anonymous, "anonymous=", arrayList);
        return AbstractC25265s.m74110N0(arrayList, ", ", "ParticipantCount{", "}", null, 56);
    }

    public /* synthetic */ ParticipantCount(int i13, int i14, C26624l c26624l, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 0 : i13, (i15 & 2) != 0 ? 0 : i14, (i15 & 4) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134535newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParticipantCount(int i13, int i14, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.total = i13;
        this.anonymous = i14;
    }
}
