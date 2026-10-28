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
import java.util.List;
import jh3.AbstractC21702c;
import l83.InterfaceC23457c;
import m83.AbstractC25265s;
import m83.C25271y;
import ne3.C26624l;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import s30.AbstractC32103e;
import stream.video.sfu.models.TrackInfo;
import stream.video.sfu.models.WebsocketReconnectStrategy;
import stream.video.sfu.signal.TrackSubscriptionDetails;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.Bc\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJi\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010\u001cR\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010\u001eR\u001a\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b(\u0010\u001eR\u001a\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b)\u0010\u001eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b-\u0010,¨\u0006/"}, m65681d2 = {"Lstream/video/sfu/event/ReconnectDetails;", "Lcom/squareup/wire/l;", "", "Lstream/video/sfu/models/WebsocketReconnectStrategy;", "strategy", "", "Lstream/video/sfu/models/TrackInfo;", "announced_tracks", "Lstream/video/sfu/signal/TrackSubscriptionDetails;", "subscriptions", "", "reconnect_attempt", "", "from_sfu_id", "previous_session_id", "reason", "Lne3/l;", "unknownFields", "<init>", "(Lstream/video/sfu/models/WebsocketReconnectStrategy;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lstream/video/sfu/models/WebsocketReconnectStrategy;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne3/l;)Lstream/video/sfu/event/ReconnectDetails;", "Lstream/video/sfu/models/WebsocketReconnectStrategy;", "getStrategy", "()Lstream/video/sfu/models/WebsocketReconnectStrategy;", "I", "getReconnect_attempt", "Ljava/lang/String;", "getFrom_sfu_id", "getPrevious_session_id", "getReason", "Ljava/util/List;", "getAnnounced_tracks", "()Ljava/util/List;", "getSubscriptions", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class ReconnectDetails extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.TrackInfo#ADAPTER", jsonName = "announcedTracks", label = EnumC5595z.f22136y, tag = 3)
    private final List<TrackInfo> announced_tracks;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fromSfuId", label = EnumC5595z.f22132F, tag = 6)
    private final String from_sfu_id;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "previousSessionId", label = EnumC5595z.f22132F, tag = 7)
    private final String previous_session_id;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = EnumC5595z.f22132F, tag = 8)
    private final String reason;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "reconnectAttempt", label = EnumC5595z.f22132F, tag = 5)
    private final int reconnect_attempt;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.WebsocketReconnectStrategy#ADAPTER", label = EnumC5595z.f22132F, tag = 1)
    private final WebsocketReconnectStrategy strategy;

    @InterfaceC5570a0(adapter = "stream.video.sfu.signal.TrackSubscriptionDetails#ADAPTER", label = EnumC5595z.f22136y, tag = 4)
    private final List<TrackSubscriptionDetails> subscriptions;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(ReconnectDetails.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.event.ReconnectDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public ReconnectDetails decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                Object objDecode = WebsocketReconnectStrategy.WEBSOCKET_RECONNECT_STRATEGY_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jM16807d = reader.m16807d();
                Object objDecode2 = "";
                Object objDecode3 = objDecode2;
                Object objDecode4 = objDecode3;
                int iIntValue = 0;
                while (true) {
                    Object obj = objDecode;
                    while (true) {
                        int iM16810g = reader.m16810g();
                        if (iM16810g == -1) {
                            return new ReconnectDetails((WebsocketReconnectStrategy) obj, arrayList, arrayList2, iIntValue, (String) objDecode2, (String) objDecode3, (String) objDecode4, reader.m16808e(jM16807d));
                        }
                        switch (iM16810g) {
                            case 1:
                                try {
                                    objDecode = WebsocketReconnectStrategy.ADAPTER.decode(reader);
                                } catch (ProtoAdapter$EnumConstantNotFoundException e5) {
                                    reader.m16804a(iM16810g, EnumC5573d.VARINT, Long.valueOf(e5.f22081w));
                                }
                                break;
                            case 2:
                            default:
                                reader.m16813j(iM16810g);
                                break;
                            case 3:
                                arrayList.add(TrackInfo.ADAPTER.decode(reader));
                                break;
                            case 4:
                                arrayList2.add(TrackSubscriptionDetails.ADAPTER.decode(reader));
                                break;
                            case 5:
                                iIntValue = ((Number) AbstractC5586q.UINT32.decode(reader)).intValue();
                                break;
                            case 6:
                                objDecode2 = AbstractC5586q.STRING.decode(reader);
                                break;
                            case 7:
                                objDecode3 = AbstractC5586q.STRING.decode(reader);
                                break;
                            case 8:
                                objDecode4 = AbstractC5586q.STRING.decode(reader);
                                break;
                        }
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(ReconnectDetails value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (value.getStrategy() != WebsocketReconnectStrategy.WEBSOCKET_RECONNECT_STRATEGY_UNSPECIFIED) {
                    iMo79253d += WebsocketReconnectStrategy.ADAPTER.encodedSizeWithTag(1, value.getStrategy());
                }
                int iEncodedSizeWithTag = TrackSubscriptionDetails.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getSubscriptions()) + TrackInfo.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getAnnounced_tracks()) + iMo79253d;
                if (value.getReconnect_attempt() != 0) {
                    iEncodedSizeWithTag += AbstractC5586q.UINT32.encodedSizeWithTag(5, Integer.valueOf(value.getReconnect_attempt()));
                }
                if (!AbstractC22676k.m65745e(value.getFrom_sfu_id(), "")) {
                    iEncodedSizeWithTag += AbstractC5586q.STRING.encodedSizeWithTag(6, value.getFrom_sfu_id());
                }
                if (!AbstractC22676k.m65745e(value.getPrevious_session_id(), "")) {
                    iEncodedSizeWithTag += AbstractC5586q.STRING.encodedSizeWithTag(7, value.getPrevious_session_id());
                }
                return !AbstractC22676k.m65745e(value.getReason(), "") ? AbstractC5586q.STRING.encodedSizeWithTag(8, value.getReason()) + iEncodedSizeWithTag : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public ReconnectDetails redact(ReconnectDetails value) {
                AbstractC22676k.m65750j(value, "value");
                return ReconnectDetails.copy$default(value, null, AbstractC32103e.m99879a(value.getAnnounced_tracks(), TrackInfo.ADAPTER), AbstractC32103e.m99879a(value.getSubscriptions(), TrackSubscriptionDetails.ADAPTER), 0, null, null, null, C26624l.f105881E, 121, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, ReconnectDetails value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (value.getStrategy() != WebsocketReconnectStrategy.WEBSOCKET_RECONNECT_STRATEGY_UNSPECIFIED) {
                    WebsocketReconnectStrategy.ADAPTER.encodeWithTag(writer, 1, value.getStrategy());
                }
                TrackInfo.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.getAnnounced_tracks());
                TrackSubscriptionDetails.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.getSubscriptions());
                if (value.getReconnect_attempt() != 0) {
                    AbstractC5586q.UINT32.encodeWithTag(writer, 5, Integer.valueOf(value.getReconnect_attempt()));
                }
                if (!AbstractC22676k.m65745e(value.getFrom_sfu_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 6, value.getFrom_sfu_id());
                }
                if (!AbstractC22676k.m65745e(value.getPrevious_session_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 7, value.getPrevious_session_id());
                }
                if (!AbstractC22676k.m65745e(value.getReason(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 8, value.getReason());
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, ReconnectDetails value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (!AbstractC22676k.m65745e(value.getReason(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 8, value.getReason());
                }
                if (!AbstractC22676k.m65745e(value.getPrevious_session_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 7, value.getPrevious_session_id());
                }
                if (!AbstractC22676k.m65745e(value.getFrom_sfu_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 6, value.getFrom_sfu_id());
                }
                if (value.getReconnect_attempt() != 0) {
                    AbstractC5586q.UINT32.encodeWithTag(writer, 5, Integer.valueOf(value.getReconnect_attempt()));
                }
                TrackSubscriptionDetails.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.getSubscriptions());
                TrackInfo.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.getAnnounced_tracks());
                if (value.getStrategy() != WebsocketReconnectStrategy.WEBSOCKET_RECONNECT_STRATEGY_UNSPECIFIED) {
                    WebsocketReconnectStrategy.ADAPTER.encodeWithTag(writer, 1, value.getStrategy());
                }
            }
        };
    }

    public ReconnectDetails() {
        this(null, null, null, 0, null, null, null, null, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReconnectDetails copy$default(ReconnectDetails reconnectDetails, WebsocketReconnectStrategy websocketReconnectStrategy, List list, List list2, int i13, String str, String str2, String str3, C26624l c26624l, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            websocketReconnectStrategy = reconnectDetails.strategy;
        }
        if ((i14 & 2) != 0) {
            list = reconnectDetails.announced_tracks;
        }
        if ((i14 & 4) != 0) {
            list2 = reconnectDetails.subscriptions;
        }
        if ((i14 & 8) != 0) {
            i13 = reconnectDetails.reconnect_attempt;
        }
        if ((i14 & 16) != 0) {
            str = reconnectDetails.from_sfu_id;
        }
        if ((i14 & 32) != 0) {
            str2 = reconnectDetails.previous_session_id;
        }
        if ((i14 & 64) != 0) {
            str3 = reconnectDetails.reason;
        }
        if ((i14 & 128) != 0) {
            c26624l = reconnectDetails.unknownFields();
        }
        String str4 = str3;
        C26624l c26624l2 = c26624l;
        String str5 = str;
        String str6 = str2;
        return reconnectDetails.copy(websocketReconnectStrategy, list, list2, i13, str5, str6, str4, c26624l2);
    }

    public final ReconnectDetails copy(WebsocketReconnectStrategy strategy, List<TrackInfo> announced_tracks, List<TrackSubscriptionDetails> subscriptions, int reconnect_attempt, String from_sfu_id, String previous_session_id, String reason, C26624l unknownFields) {
        AbstractC22676k.m65750j(strategy, "strategy");
        AbstractC22676k.m65750j(announced_tracks, "announced_tracks");
        AbstractC22676k.m65750j(subscriptions, "subscriptions");
        AbstractC22676k.m65750j(from_sfu_id, "from_sfu_id");
        AbstractC22676k.m65750j(previous_session_id, "previous_session_id");
        AbstractC22676k.m65750j(reason, "reason");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new ReconnectDetails(strategy, announced_tracks, subscriptions, reconnect_attempt, from_sfu_id, previous_session_id, reason, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ReconnectDetails)) {
            return false;
        }
        ReconnectDetails reconnectDetails = (ReconnectDetails) other;
        return AbstractC22676k.m65745e(unknownFields(), reconnectDetails.unknownFields()) && this.strategy == reconnectDetails.strategy && AbstractC22676k.m65745e(this.announced_tracks, reconnectDetails.announced_tracks) && AbstractC22676k.m65745e(this.subscriptions, reconnectDetails.subscriptions) && this.reconnect_attempt == reconnectDetails.reconnect_attempt && AbstractC22676k.m65745e(this.from_sfu_id, reconnectDetails.from_sfu_id) && AbstractC22676k.m65745e(this.previous_session_id, reconnectDetails.previous_session_id) && AbstractC22676k.m65745e(this.reason, reconnectDetails.reason);
    }

    public final List<TrackInfo> getAnnounced_tracks() {
        return this.announced_tracks;
    }

    public final String getFrom_sfu_id() {
        return this.from_sfu_id;
    }

    public final String getPrevious_session_id() {
        return this.previous_session_id;
    }

    public final String getReason() {
        return this.reason;
    }

    public final int getReconnect_attempt() {
        return this.reconnect_attempt;
    }

    public final WebsocketReconnectStrategy getStrategy() {
        return this.strategy;
    }

    public final List<TrackSubscriptionDetails> getSubscriptions() {
        return this.subscriptions;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = this.reason.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.reconnect_attempt, AbstractC11895b.m31983b(AbstractC11895b.m31983b((this.strategy.hashCode() + (unknownFields().hashCode() * 37)) * 37, 37, this.announced_tracks), 37, this.subscriptions), 37), 37, this.from_sfu_id), 37, this.previous_session_id);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134510newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("strategy=" + this.strategy);
        if (!this.announced_tracks.isEmpty()) {
            AbstractC26725a.m79513q("announced_tracks=", this.announced_tracks, arrayList);
        }
        if (!this.subscriptions.isEmpty()) {
            AbstractC26725a.m79513q("subscriptions=", this.subscriptions, arrayList);
        }
        AbstractC38963t7.m124389s(this.reconnect_attempt, "reconnect_attempt=", arrayList);
        AbstractC21702c.m61149t(arrayList, this.from_sfu_id, "from_sfu_id=");
        AbstractC21702c.m61149t(arrayList, this.previous_session_id, "previous_session_id=");
        AbstractC21702c.m61149t(arrayList, this.reason, "reason=");
        return AbstractC25265s.m74110N0(arrayList, ", ", "ReconnectDetails{", "}", null, 56);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ReconnectDetails(WebsocketReconnectStrategy websocketReconnectStrategy, List list, List list2, int i13, String str, String str2, String str3, C26624l c26624l, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        websocketReconnectStrategy = (i14 & 1) != 0 ? WebsocketReconnectStrategy.WEBSOCKET_RECONNECT_STRATEGY_UNSPECIFIED : websocketReconnectStrategy;
        int i15 = i14 & 2;
        C25271y c25271y = C25271y.f99162w;
        this(websocketReconnectStrategy, i15 != 0 ? c25271y : list, (i14 & 4) != 0 ? c25271y : list2, (i14 & 8) != 0 ? 0 : i13, (i14 & 16) != 0 ? "" : str, (i14 & 32) != 0 ? "" : str2, (i14 & 64) != 0 ? "" : str3, (i14 & 128) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134510newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReconnectDetails(WebsocketReconnectStrategy strategy, List<TrackInfo> announced_tracks, List<TrackSubscriptionDetails> subscriptions, int i13, String from_sfu_id, String previous_session_id, String reason, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(strategy, "strategy");
        AbstractC22676k.m65750j(announced_tracks, "announced_tracks");
        AbstractC22676k.m65750j(subscriptions, "subscriptions");
        AbstractC22676k.m65750j(from_sfu_id, "from_sfu_id");
        AbstractC22676k.m65750j(previous_session_id, "previous_session_id");
        AbstractC22676k.m65750j(reason, "reason");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.strategy = strategy;
        this.reconnect_attempt = i13;
        this.from_sfu_id = from_sfu_id;
        this.previous_session_id = previous_session_id;
        this.reason = reason;
        this.announced_tracks = AbstractC32103e.m99886h("announced_tracks", announced_tracks);
        this.subscriptions = AbstractC32103e.m99886h("subscriptions", subscriptions);
    }
}
