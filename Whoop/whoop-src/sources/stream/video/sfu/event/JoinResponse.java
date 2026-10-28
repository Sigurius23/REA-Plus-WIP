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
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import s30.AbstractC32103e;
import stream.video.sfu.models.CallState;
import stream.video.sfu.models.PublishOption;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(BA\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJG\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0017R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, m65681d2 = {"Lstream/video/sfu/event/JoinResponse;", "Lcom/squareup/wire/l;", "", "Lstream/video/sfu/models/CallState;", "call_state", "", "reconnected", "", "fast_reconnect_deadline_seconds", "", "Lstream/video/sfu/models/PublishOption;", "publish_options", "Lne3/l;", "unknownFields", "<init>", "(Lstream/video/sfu/models/CallState;ZILjava/util/List;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lstream/video/sfu/models/CallState;ZILjava/util/List;Lne3/l;)Lstream/video/sfu/event/JoinResponse;", "Lstream/video/sfu/models/CallState;", "getCall_state", "()Lstream/video/sfu/models/CallState;", "Z", "getReconnected", "()Z", "I", "getFast_reconnect_deadline_seconds", "Ljava/util/List;", "getPublish_options", "()Ljava/util/List;", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class JoinResponse extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.CallState#ADAPTER", jsonName = "callState", label = EnumC5595z.f22132F, tag = 1)
    private final CallState call_state;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "fastReconnectDeadlineSeconds", label = EnumC5595z.f22132F, tag = 3)
    private final int fast_reconnect_deadline_seconds;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.PublishOption#ADAPTER", jsonName = "publishOptions", label = EnumC5595z.f22136y, tag = 4)
    private final List<PublishOption> publish_options;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = EnumC5595z.f22132F, tag = 2)
    private final boolean reconnected;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(JoinResponse.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.event.JoinResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public JoinResponse decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jM16807d = reader.m16807d();
                Object objDecode = null;
                boolean zBooleanValue = false;
                int iIntValue = 0;
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new JoinResponse((CallState) objDecode, zBooleanValue, iIntValue, arrayList, reader.m16808e(jM16807d));
                    }
                    if (iM16810g == 1) {
                        objDecode = CallState.ADAPTER.decode(reader);
                    } else if (iM16810g == 2) {
                        zBooleanValue = ((Boolean) AbstractC5586q.BOOL.decode(reader)).booleanValue();
                    } else if (iM16810g == 3) {
                        iIntValue = ((Number) AbstractC5586q.INT32.decode(reader)).intValue();
                    } else if (iM16810g != 4) {
                        reader.m16813j(iM16810g);
                    } else {
                        arrayList.add(PublishOption.ADAPTER.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(JoinResponse value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (value.getCall_state() != null) {
                    iMo79253d += CallState.ADAPTER.encodedSizeWithTag(1, value.getCall_state());
                }
                if (value.getReconnected()) {
                    iMo79253d += AbstractC5586q.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getReconnected()));
                }
                if (value.getFast_reconnect_deadline_seconds() != 0) {
                    iMo79253d += AbstractC5586q.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getFast_reconnect_deadline_seconds()));
                }
                return PublishOption.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getPublish_options()) + iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public JoinResponse redact(JoinResponse value) {
                AbstractC22676k.m65750j(value, "value");
                CallState call_state = value.getCall_state();
                return JoinResponse.copy$default(value, call_state != null ? (CallState) CallState.ADAPTER.redact(call_state) : null, false, 0, AbstractC32103e.m99879a(value.getPublish_options(), PublishOption.ADAPTER), C26624l.f105881E, 6, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, JoinResponse value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (value.getCall_state() != null) {
                    CallState.ADAPTER.encodeWithTag(writer, 1, value.getCall_state());
                }
                if (value.getReconnected()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 2, Boolean.valueOf(value.getReconnected()));
                }
                if (value.getFast_reconnect_deadline_seconds() != 0) {
                    AbstractC5586q.INT32.encodeWithTag(writer, 3, Integer.valueOf(value.getFast_reconnect_deadline_seconds()));
                }
                PublishOption.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.getPublish_options());
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, JoinResponse value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                PublishOption.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.getPublish_options());
                if (value.getFast_reconnect_deadline_seconds() != 0) {
                    AbstractC5586q.INT32.encodeWithTag(writer, 3, Integer.valueOf(value.getFast_reconnect_deadline_seconds()));
                }
                if (value.getReconnected()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 2, Boolean.valueOf(value.getReconnected()));
                }
                if (value.getCall_state() != null) {
                    CallState.ADAPTER.encodeWithTag(writer, 1, value.getCall_state());
                }
            }
        };
    }

    public JoinResponse() {
        this(null, false, 0, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JoinResponse copy$default(JoinResponse joinResponse, CallState callState, boolean z4, int i13, List list, C26624l c26624l, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            callState = joinResponse.call_state;
        }
        if ((i14 & 2) != 0) {
            z4 = joinResponse.reconnected;
        }
        if ((i14 & 4) != 0) {
            i13 = joinResponse.fast_reconnect_deadline_seconds;
        }
        if ((i14 & 8) != 0) {
            list = joinResponse.publish_options;
        }
        if ((i14 & 16) != 0) {
            c26624l = joinResponse.unknownFields();
        }
        C26624l c26624l2 = c26624l;
        int i15 = i13;
        return joinResponse.copy(callState, z4, i15, list, c26624l2);
    }

    public final JoinResponse copy(CallState call_state, boolean reconnected, int fast_reconnect_deadline_seconds, List<PublishOption> publish_options, C26624l unknownFields) {
        AbstractC22676k.m65750j(publish_options, "publish_options");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new JoinResponse(call_state, reconnected, fast_reconnect_deadline_seconds, publish_options, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof JoinResponse)) {
            return false;
        }
        JoinResponse joinResponse = (JoinResponse) other;
        return AbstractC22676k.m65745e(unknownFields(), joinResponse.unknownFields()) && AbstractC22676k.m65745e(this.call_state, joinResponse.call_state) && this.reconnected == joinResponse.reconnected && this.fast_reconnect_deadline_seconds == joinResponse.fast_reconnect_deadline_seconds && AbstractC22676k.m65745e(this.publish_options, joinResponse.publish_options);
    }

    public final CallState getCall_state() {
        return this.call_state;
    }

    public final int getFast_reconnect_deadline_seconds() {
        return this.fast_reconnect_deadline_seconds;
    }

    public final List<PublishOption> getPublish_options() {
        return this.publish_options;
    }

    public final boolean getReconnected() {
        return this.reconnected;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        CallState callState = this.call_state;
        int iHashCode2 = this.publish_options.hashCode() + AbstractC11266d.m30448b(this.fast_reconnect_deadline_seconds, AbstractC2875y.m8289b((iHashCode + (callState != null ? callState.hashCode() : 0)) * 37, 37, this.reconnected), 37);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134501newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        CallState callState = this.call_state;
        if (callState != null) {
            arrayList.add("call_state=" + callState);
        }
        AbstractC30007c.m91854x("reconnected=", this.reconnected, arrayList);
        AbstractC38963t7.m124389s(this.fast_reconnect_deadline_seconds, "fast_reconnect_deadline_seconds=", arrayList);
        if (!this.publish_options.isEmpty()) {
            AbstractC26725a.m79513q("publish_options=", this.publish_options, arrayList);
        }
        return AbstractC25265s.m74110N0(arrayList, ", ", "JoinResponse{", "}", null, 56);
    }

    public /* synthetic */ JoinResponse(CallState callState, boolean z4, int i13, List list, C26624l c26624l, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : callState, (i14 & 2) != 0 ? false : z4, (i14 & 4) != 0 ? 0 : i13, (i14 & 8) != 0 ? C25271y.f99162w : list, (i14 & 16) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134501newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinResponse(CallState callState, boolean z4, int i13, List<PublishOption> publish_options, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(publish_options, "publish_options");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.call_state = callState;
        this.reconnected = z4;
        this.fast_reconnect_deadline_seconds = i13;
        this.publish_options = AbstractC32103e.m99886h("publish_options", publish_options);
    }
}
