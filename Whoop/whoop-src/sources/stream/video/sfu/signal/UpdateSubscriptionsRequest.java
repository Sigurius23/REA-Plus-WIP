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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB+\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u0017R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m65681d2 = {"Lstream/video/sfu/signal/UpdateSubscriptionsRequest;", "Lcom/squareup/wire/l;", "", "", "session_id", "", "Lstream/video/sfu/signal/TrackSubscriptionDetails;", "tracks", "Lne3/l;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/util/List;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/util/List;Lne3/l;)Lstream/video/sfu/signal/UpdateSubscriptionsRequest;", "Ljava/lang/String;", "getSession_id", "Ljava/util/List;", "getTracks", "()Ljava/util/List;", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class UpdateSubscriptionsRequest extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sessionId", label = EnumC5595z.f22132F, tag = 2)
    private final String session_id;

    @InterfaceC5570a0(adapter = "stream.video.sfu.signal.TrackSubscriptionDetails#ADAPTER", label = EnumC5595z.f22136y, tag = 3)
    private final List<TrackSubscriptionDetails> tracks;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(UpdateSubscriptionsRequest.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.signal.UpdateSubscriptionsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public UpdateSubscriptionsRequest decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jM16807d = reader.m16807d();
                Object objDecode = "";
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new UpdateSubscriptionsRequest((String) objDecode, arrayList, reader.m16808e(jM16807d));
                    }
                    if (iM16810g == 2) {
                        objDecode = AbstractC5586q.STRING.decode(reader);
                    } else if (iM16810g != 3) {
                        reader.m16813j(iM16810g);
                    } else {
                        arrayList.add(TrackSubscriptionDetails.ADAPTER.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(UpdateSubscriptionsRequest value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (!AbstractC22676k.m65745e(value.getSession_id(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(2, value.getSession_id());
                }
                return TrackSubscriptionDetails.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getTracks()) + iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public UpdateSubscriptionsRequest redact(UpdateSubscriptionsRequest value) {
                AbstractC22676k.m65750j(value, "value");
                return UpdateSubscriptionsRequest.copy$default(value, null, AbstractC32103e.m99879a(value.getTracks(), TrackSubscriptionDetails.ADAPTER), C26624l.f105881E, 1, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, UpdateSubscriptionsRequest value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (!AbstractC22676k.m65745e(value.getSession_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getSession_id());
                }
                TrackSubscriptionDetails.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.getTracks());
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, UpdateSubscriptionsRequest value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                TrackSubscriptionDetails.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.getTracks());
                if (AbstractC22676k.m65745e(value.getSession_id(), "")) {
                    return;
                }
                AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getSession_id());
            }
        };
    }

    public UpdateSubscriptionsRequest() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateSubscriptionsRequest copy$default(UpdateSubscriptionsRequest updateSubscriptionsRequest, String str, List list, C26624l c26624l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = updateSubscriptionsRequest.session_id;
        }
        if ((i13 & 2) != 0) {
            list = updateSubscriptionsRequest.tracks;
        }
        if ((i13 & 4) != 0) {
            c26624l = updateSubscriptionsRequest.unknownFields();
        }
        return updateSubscriptionsRequest.copy(str, list, c26624l);
    }

    public final UpdateSubscriptionsRequest copy(String session_id, List<TrackSubscriptionDetails> tracks, C26624l unknownFields) {
        AbstractC22676k.m65750j(session_id, "session_id");
        AbstractC22676k.m65750j(tracks, "tracks");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new UpdateSubscriptionsRequest(session_id, tracks, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UpdateSubscriptionsRequest)) {
            return false;
        }
        UpdateSubscriptionsRequest updateSubscriptionsRequest = (UpdateSubscriptionsRequest) other;
        return AbstractC22676k.m65745e(unknownFields(), updateSubscriptionsRequest.unknownFields()) && AbstractC22676k.m65745e(this.session_id, updateSubscriptionsRequest.session_id) && AbstractC22676k.m65745e(this.tracks, updateSubscriptionsRequest.tracks);
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final List<TrackSubscriptionDetails> getTracks() {
        return this.tracks;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = this.tracks.hashCode() + AbstractC11266d.m30450d(unknownFields().hashCode() * 37, 37, this.session_id);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134571newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC21702c.m61149t(arrayList, this.session_id, "session_id=");
        if (!this.tracks.isEmpty()) {
            AbstractC26725a.m79513q("tracks=", this.tracks, arrayList);
        }
        return AbstractC25265s.m74110N0(arrayList, ", ", "UpdateSubscriptionsRequest{", "}", null, 56);
    }

    public /* synthetic */ UpdateSubscriptionsRequest(String str, List list, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134571newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateSubscriptionsRequest(String session_id, List<TrackSubscriptionDetails> tracks, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(session_id, "session_id");
        AbstractC22676k.m65750j(tracks, "tracks");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.session_id = session_id;
        this.tracks = AbstractC32103e.m99886h("tracks", tracks);
    }
}
