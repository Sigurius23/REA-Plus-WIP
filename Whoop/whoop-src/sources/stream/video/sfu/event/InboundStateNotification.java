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
import java.util.List;
import l83.InterfaceC23457c;
import m83.AbstractC25265s;
import m83.C25271y;
import ne3.C26624l;
import nh3.AbstractC26725a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import s30.AbstractC32103e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB!\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Lstream/video/sfu/event/InboundStateNotification;", "Lcom/squareup/wire/l;", "", "", "Lstream/video/sfu/event/InboundVideoState;", "inbound_video_states", "Lne3/l;", "unknownFields", "<init>", "(Ljava/util/List;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Lne3/l;)Lstream/video/sfu/event/InboundStateNotification;", "Ljava/util/List;", "getInbound_video_states", "()Ljava/util/List;", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class InboundStateNotification extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "stream.video.sfu.event.InboundVideoState#ADAPTER", jsonName = "inboundVideoStates", label = EnumC5595z.f22136y, tag = 1)
    private final List<InboundVideoState> inbound_video_states;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(InboundStateNotification.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.event.InboundStateNotification$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public InboundStateNotification decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jM16807d = reader.m16807d();
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new InboundStateNotification(arrayList, reader.m16808e(jM16807d));
                    }
                    if (iM16810g == 1) {
                        arrayList.add(InboundVideoState.ADAPTER.decode(reader));
                    } else {
                        reader.m16813j(iM16810g);
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(InboundStateNotification value) {
                AbstractC22676k.m65750j(value, "value");
                return InboundVideoState.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getInbound_video_states()) + value.unknownFields().mo79253d();
            }

            @Override // com.squareup.wire.AbstractC5586q
            public InboundStateNotification redact(InboundStateNotification value) {
                AbstractC22676k.m65750j(value, "value");
                return value.copy(AbstractC32103e.m99879a(value.getInbound_video_states(), InboundVideoState.ADAPTER), C26624l.f105881E);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, InboundStateNotification value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                InboundVideoState.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.getInbound_video_states());
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, InboundStateNotification value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                InboundVideoState.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.getInbound_video_states());
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InboundStateNotification() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InboundStateNotification copy$default(InboundStateNotification inboundStateNotification, List list, C26624l c26624l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = inboundStateNotification.inbound_video_states;
        }
        if ((i13 & 2) != 0) {
            c26624l = inboundStateNotification.unknownFields();
        }
        return inboundStateNotification.copy(list, c26624l);
    }

    public final InboundStateNotification copy(List<InboundVideoState> inbound_video_states, C26624l unknownFields) {
        AbstractC22676k.m65750j(inbound_video_states, "inbound_video_states");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new InboundStateNotification(inbound_video_states, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InboundStateNotification)) {
            return false;
        }
        InboundStateNotification inboundStateNotification = (InboundStateNotification) other;
        return AbstractC22676k.m65745e(unknownFields(), inboundStateNotification.unknownFields()) && AbstractC22676k.m65745e(this.inbound_video_states, inboundStateNotification.inbound_video_states);
    }

    public final List<InboundVideoState> getInbound_video_states() {
        return this.inbound_video_states;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = this.inbound_video_states.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134498newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.inbound_video_states.isEmpty()) {
            AbstractC26725a.m79513q("inbound_video_states=", this.inbound_video_states, arrayList);
        }
        return AbstractC25265s.m74110N0(arrayList, ", ", "InboundStateNotification{", "}", null, 56);
    }

    public /* synthetic */ InboundStateNotification(List list, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list, (i13 & 2) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134498newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboundStateNotification(List<InboundVideoState> inbound_video_states, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(inbound_video_states, "inbound_video_states");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.inbound_video_states = AbstractC32103e.m99886h("inbound_video_states", inbound_video_states);
    }
}
