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
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import s30.AbstractC32103e;
import stream.video.sfu.models.ClientCapability;
import stream.video.sfu.models.ClientDetails;
import stream.video.sfu.models.ParticipantSource;
import stream.video.sfu.models.PublishOption;
import stream.video.sfu.models.SubscribeOption;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b%\u0018\u0000 H2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001HB«\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010 H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010(J±\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010(R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b-\u0010(R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b.\u0010(R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b/\u0010(R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b0\u0010(R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u00103R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00104\u0012\u0004\b7\u00108\u001a\u0004\b5\u00106R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00109\u0012\u0004\b<\u00108\u001a\u0004\b:\u0010;R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010\u0019\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010@\u001a\u0004\bA\u0010BR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010C\u001a\u0004\bD\u0010ER \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010C\u001a\u0004\bF\u0010ER \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010C\u001a\u0004\bG\u0010E¨\u0006I"}, m65681d2 = {"Lstream/video/sfu/event/JoinRequest;", "Lcom/squareup/wire/l;", "", "", "token", "session_id", "unified_session_id", "subscriber_sdp", "publisher_sdp", "Lstream/video/sfu/models/ClientDetails;", "client_details", "Lstream/video/sfu/event/Migration;", "migration", "", "fast_reconnect", "Lstream/video/sfu/event/ReconnectDetails;", "reconnect_details", "", "Lstream/video/sfu/models/PublishOption;", "preferred_publish_options", "Lstream/video/sfu/models/SubscribeOption;", "preferred_subscribe_options", "Lstream/video/sfu/models/ClientCapability;", "capabilities", "Lstream/video/sfu/models/ParticipantSource;", "source", "Lne3/l;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/ClientDetails;Lstream/video/sfu/event/Migration;ZLstream/video/sfu/event/ReconnectDetails;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lstream/video/sfu/models/ParticipantSource;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/ClientDetails;Lstream/video/sfu/event/Migration;ZLstream/video/sfu/event/ReconnectDetails;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lstream/video/sfu/models/ParticipantSource;Lne3/l;)Lstream/video/sfu/event/JoinRequest;", "Ljava/lang/String;", "getToken", "getSession_id", "getUnified_session_id", "getSubscriber_sdp", "getPublisher_sdp", "Lstream/video/sfu/models/ClientDetails;", "getClient_details", "()Lstream/video/sfu/models/ClientDetails;", "Lstream/video/sfu/event/Migration;", "getMigration", "()Lstream/video/sfu/event/Migration;", "getMigration$annotations", "()V", "Z", "getFast_reconnect", "()Z", "getFast_reconnect$annotations", "Lstream/video/sfu/event/ReconnectDetails;", "getReconnect_details", "()Lstream/video/sfu/event/ReconnectDetails;", "Lstream/video/sfu/models/ParticipantSource;", "getSource", "()Lstream/video/sfu/models/ParticipantSource;", "Ljava/util/List;", "getPreferred_publish_options", "()Ljava/util/List;", "getPreferred_subscribe_options", "getCapabilities", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class JoinRequest extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.ClientCapability#ADAPTER", label = EnumC5595z.f22136y, schemaIndex = 11, tag = 11)
    private final List<ClientCapability> capabilities;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.ClientDetails#ADAPTER", jsonName = "clientDetails", label = EnumC5595z.f22132F, schemaIndex = 5, tag = 4)
    private final ClientDetails client_details;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "fastReconnect", label = EnumC5595z.f22132F, schemaIndex = 7, tag = 6)
    private final boolean fast_reconnect;

    @InterfaceC5570a0(adapter = "stream.video.sfu.event.Migration#ADAPTER", label = EnumC5595z.f22132F, schemaIndex = 6, tag = 5)
    private final Migration migration;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.PublishOption#ADAPTER", jsonName = "preferredPublishOptions", label = EnumC5595z.f22136y, schemaIndex = 9, tag = 9)
    private final List<PublishOption> preferred_publish_options;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.SubscribeOption#ADAPTER", jsonName = "preferredSubscribeOptions", label = EnumC5595z.f22136y, schemaIndex = 10, tag = 10)
    private final List<SubscribeOption> preferred_subscribe_options;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "publisherSdp", label = EnumC5595z.f22132F, schemaIndex = 4, tag = 8)
    private final String publisher_sdp;

    @InterfaceC5570a0(adapter = "stream.video.sfu.event.ReconnectDetails#ADAPTER", jsonName = "reconnectDetails", label = EnumC5595z.f22132F, schemaIndex = 8, tag = 7)
    private final ReconnectDetails reconnect_details;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sessionId", label = EnumC5595z.f22132F, schemaIndex = 1, tag = 2)
    private final String session_id;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.ParticipantSource#ADAPTER", label = EnumC5595z.f22132F, schemaIndex = 12, tag = 12)
    private final ParticipantSource source;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "subscriberSdp", label = EnumC5595z.f22132F, schemaIndex = 3, tag = 3)
    private final String subscriber_sdp;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = EnumC5595z.f22132F, schemaIndex = 0, tag = 1)
    private final String token;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "unifiedSessionId", label = EnumC5595z.f22132F, schemaIndex = 2, tag = 13)
    private final String unified_session_id;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(JoinRequest.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.event.JoinRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public JoinRequest decode(C5587r reader) throws IOException {
                Object obj;
                Object obj2;
                AbstractC22676k.m65750j(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ParticipantSource participantSource = ParticipantSource.PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED;
                long jM16807d = reader.m16807d();
                Object objDecode = participantSource;
                Object objDecode2 = "";
                Object objDecode3 = objDecode2;
                Object objDecode4 = objDecode3;
                Object objDecode5 = null;
                Object objDecode6 = null;
                Object objDecode7 = null;
                boolean zBooleanValue = false;
                Object objDecode8 = objDecode4;
                Object objDecode9 = objDecode8;
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new JoinRequest((String) objDecode8, (String) objDecode9, (String) objDecode2, (String) objDecode3, (String) objDecode4, (ClientDetails) objDecode5, (Migration) objDecode6, zBooleanValue, (ReconnectDetails) objDecode7, arrayList, arrayList2, arrayList3, (ParticipantSource) objDecode, reader.m16808e(jM16807d));
                    }
                    Object obj3 = objDecode8;
                    EnumC5573d enumC5573d2 = EnumC5573d.VARINT;
                    switch (iM16810g) {
                        case 1:
                            objDecode8 = AbstractC5586q.STRING.decode(reader);
                            break;
                        case 2:
                            objDecode9 = AbstractC5586q.STRING.decode(reader);
                            objDecode8 = obj3;
                            break;
                        case 3:
                            objDecode3 = AbstractC5586q.STRING.decode(reader);
                            objDecode8 = obj3;
                            break;
                        case 4:
                            objDecode5 = ClientDetails.ADAPTER.decode(reader);
                            objDecode8 = obj3;
                            break;
                        case 5:
                            objDecode6 = Migration.ADAPTER.decode(reader);
                            objDecode8 = obj3;
                            break;
                        case 6:
                            zBooleanValue = ((Boolean) AbstractC5586q.BOOL.decode(reader)).booleanValue();
                            objDecode8 = obj3;
                            break;
                        case 7:
                            objDecode7 = ReconnectDetails.ADAPTER.decode(reader);
                            objDecode8 = obj3;
                            break;
                        case 8:
                            objDecode4 = AbstractC5586q.STRING.decode(reader);
                            objDecode8 = obj3;
                            break;
                        case 9:
                            obj = objDecode9;
                            obj2 = objDecode2;
                            arrayList.add(PublishOption.ADAPTER.decode(reader));
                            objDecode8 = obj3;
                            objDecode9 = obj;
                            objDecode2 = obj2;
                            break;
                        case 10:
                            obj = objDecode9;
                            obj2 = objDecode2;
                            arrayList2.add(SubscribeOption.ADAPTER.decode(reader));
                            objDecode8 = obj3;
                            objDecode9 = obj;
                            objDecode2 = obj2;
                            break;
                        case 11:
                            obj = objDecode9;
                            obj2 = objDecode2;
                            try {
                                ClientCapability.ADAPTER.tryDecode(reader, arrayList3);
                            } catch (ProtoAdapter$EnumConstantNotFoundException e5) {
                                reader.m16804a(iM16810g, enumC5573d2, Long.valueOf(e5.f22081w));
                            }
                            objDecode8 = obj3;
                            objDecode9 = obj;
                            objDecode2 = obj2;
                            break;
                        case 12:
                            try {
                                objDecode = ParticipantSource.ADAPTER.decode(reader);
                                objDecode8 = obj3;
                            } catch (ProtoAdapter$EnumConstantNotFoundException e13) {
                                obj = objDecode9;
                                obj2 = objDecode2;
                                reader.m16804a(iM16810g, enumC5573d2, Long.valueOf(e13.f22081w));
                                objDecode8 = obj3;
                                objDecode9 = obj;
                                objDecode2 = obj2;
                            }
                            break;
                        case 13:
                            objDecode2 = AbstractC5586q.STRING.decode(reader);
                            objDecode8 = obj3;
                            break;
                        default:
                            reader.m16813j(iM16810g);
                            obj = objDecode9;
                            obj2 = objDecode2;
                            objDecode8 = obj3;
                            objDecode9 = obj;
                            objDecode2 = obj2;
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(JoinRequest value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (!AbstractC22676k.m65745e(value.getToken(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(1, value.getToken());
                }
                if (!AbstractC22676k.m65745e(value.getSession_id(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(2, value.getSession_id());
                }
                if (!AbstractC22676k.m65745e(value.getUnified_session_id(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(13, value.getUnified_session_id());
                }
                if (!AbstractC22676k.m65745e(value.getSubscriber_sdp(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(3, value.getSubscriber_sdp());
                }
                if (!AbstractC22676k.m65745e(value.getPublisher_sdp(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(8, value.getPublisher_sdp());
                }
                if (value.getClient_details() != null) {
                    iMo79253d += ClientDetails.ADAPTER.encodedSizeWithTag(4, value.getClient_details());
                }
                if (value.getMigration() != null) {
                    iMo79253d += Migration.ADAPTER.encodedSizeWithTag(5, value.getMigration());
                }
                if (value.getFast_reconnect()) {
                    iMo79253d += AbstractC5586q.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getFast_reconnect()));
                }
                if (value.getReconnect_details() != null) {
                    iMo79253d += ReconnectDetails.ADAPTER.encodedSizeWithTag(7, value.getReconnect_details());
                }
                int iEncodedSizeWithTag = ClientCapability.ADAPTER.asRepeated().encodedSizeWithTag(11, value.getCapabilities()) + SubscribeOption.ADAPTER.asRepeated().encodedSizeWithTag(10, value.getPreferred_subscribe_options()) + PublishOption.ADAPTER.asRepeated().encodedSizeWithTag(9, value.getPreferred_publish_options()) + iMo79253d;
                return value.getSource() != ParticipantSource.PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED ? ParticipantSource.ADAPTER.encodedSizeWithTag(12, value.getSource()) + iEncodedSizeWithTag : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public JoinRequest redact(JoinRequest value) {
                AbstractC22676k.m65750j(value, "value");
                ClientDetails client_details = value.getClient_details();
                ClientDetails clientDetails = client_details != null ? (ClientDetails) ClientDetails.ADAPTER.redact(client_details) : null;
                Migration migration = value.getMigration();
                Migration migration2 = migration != null ? (Migration) Migration.ADAPTER.redact(migration) : null;
                ReconnectDetails reconnect_details = value.getReconnect_details();
                return value.copy((6303 & 1) != 0 ? value.token : null, (6303 & 2) != 0 ? value.session_id : null, (6303 & 4) != 0 ? value.unified_session_id : null, (6303 & 8) != 0 ? value.subscriber_sdp : null, (6303 & 16) != 0 ? value.publisher_sdp : null, (6303 & 32) != 0 ? value.client_details : clientDetails, (6303 & 64) != 0 ? value.migration : migration2, (6303 & 128) != 0 ? value.fast_reconnect : false, (6303 & 256) != 0 ? value.reconnect_details : reconnect_details != null ? (ReconnectDetails) ReconnectDetails.ADAPTER.redact(reconnect_details) : null, (6303 & 512) != 0 ? value.preferred_publish_options : AbstractC32103e.m99879a(value.getPreferred_publish_options(), PublishOption.ADAPTER), (6303 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? value.preferred_subscribe_options : AbstractC32103e.m99879a(value.getPreferred_subscribe_options(), SubscribeOption.ADAPTER), (6303 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? value.capabilities : null, (6303 & 4096) != 0 ? value.source : null, (6303 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? value.unknownFields() : C26624l.f105881E);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, JoinRequest value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (!AbstractC22676k.m65745e(value.getToken(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 1, value.getToken());
                }
                if (!AbstractC22676k.m65745e(value.getSession_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getSession_id());
                }
                if (!AbstractC22676k.m65745e(value.getUnified_session_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 13, value.getUnified_session_id());
                }
                if (!AbstractC22676k.m65745e(value.getSubscriber_sdp(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 3, value.getSubscriber_sdp());
                }
                if (!AbstractC22676k.m65745e(value.getPublisher_sdp(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 8, value.getPublisher_sdp());
                }
                if (value.getClient_details() != null) {
                    ClientDetails.ADAPTER.encodeWithTag(writer, 4, value.getClient_details());
                }
                if (value.getMigration() != null) {
                    Migration.ADAPTER.encodeWithTag(writer, 5, value.getMigration());
                }
                if (value.getFast_reconnect()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 6, Boolean.valueOf(value.getFast_reconnect()));
                }
                if (value.getReconnect_details() != null) {
                    ReconnectDetails.ADAPTER.encodeWithTag(writer, 7, value.getReconnect_details());
                }
                PublishOption.ADAPTER.asRepeated().encodeWithTag(writer, 9, value.getPreferred_publish_options());
                SubscribeOption.ADAPTER.asRepeated().encodeWithTag(writer, 10, value.getPreferred_subscribe_options());
                ClientCapability.ADAPTER.asRepeated().encodeWithTag(writer, 11, value.getCapabilities());
                if (value.getSource() != ParticipantSource.PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED) {
                    ParticipantSource.ADAPTER.encodeWithTag(writer, 12, value.getSource());
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, JoinRequest value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (value.getSource() != ParticipantSource.PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED) {
                    ParticipantSource.ADAPTER.encodeWithTag(writer, 12, value.getSource());
                }
                ClientCapability.ADAPTER.asRepeated().encodeWithTag(writer, 11, value.getCapabilities());
                SubscribeOption.ADAPTER.asRepeated().encodeWithTag(writer, 10, value.getPreferred_subscribe_options());
                PublishOption.ADAPTER.asRepeated().encodeWithTag(writer, 9, value.getPreferred_publish_options());
                if (value.getReconnect_details() != null) {
                    ReconnectDetails.ADAPTER.encodeWithTag(writer, 7, value.getReconnect_details());
                }
                if (value.getFast_reconnect()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 6, Boolean.valueOf(value.getFast_reconnect()));
                }
                if (value.getMigration() != null) {
                    Migration.ADAPTER.encodeWithTag(writer, 5, value.getMigration());
                }
                if (value.getClient_details() != null) {
                    ClientDetails.ADAPTER.encodeWithTag(writer, 4, value.getClient_details());
                }
                if (!AbstractC22676k.m65745e(value.getPublisher_sdp(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 8, value.getPublisher_sdp());
                }
                if (!AbstractC22676k.m65745e(value.getSubscriber_sdp(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 3, value.getSubscriber_sdp());
                }
                if (!AbstractC22676k.m65745e(value.getUnified_session_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 13, value.getUnified_session_id());
                }
                if (!AbstractC22676k.m65745e(value.getSession_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getSession_id());
                }
                if (AbstractC22676k.m65745e(value.getToken(), "")) {
                    return;
                }
                AbstractC5586q.STRING.encodeWithTag(writer, 1, value.getToken());
            }
        };
    }

    public JoinRequest() {
        this(null, null, null, null, null, null, null, false, null, null, null, null, null, null, 16383, null);
    }

    @InterfaceC23457c
    public static /* synthetic */ void getFast_reconnect$annotations() {
    }

    @InterfaceC23457c
    public static /* synthetic */ void getMigration$annotations() {
    }

    public final JoinRequest copy(String token, String session_id, String unified_session_id, String subscriber_sdp, String publisher_sdp, ClientDetails client_details, Migration migration, boolean fast_reconnect, ReconnectDetails reconnect_details, List<PublishOption> preferred_publish_options, List<SubscribeOption> preferred_subscribe_options, List<? extends ClientCapability> capabilities, ParticipantSource source, C26624l unknownFields) {
        AbstractC22676k.m65750j(token, "token");
        AbstractC22676k.m65750j(session_id, "session_id");
        AbstractC22676k.m65750j(unified_session_id, "unified_session_id");
        AbstractC22676k.m65750j(subscriber_sdp, "subscriber_sdp");
        AbstractC22676k.m65750j(publisher_sdp, "publisher_sdp");
        AbstractC22676k.m65750j(preferred_publish_options, "preferred_publish_options");
        AbstractC22676k.m65750j(preferred_subscribe_options, "preferred_subscribe_options");
        AbstractC22676k.m65750j(capabilities, "capabilities");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new JoinRequest(token, session_id, unified_session_id, subscriber_sdp, publisher_sdp, client_details, migration, fast_reconnect, reconnect_details, preferred_publish_options, preferred_subscribe_options, capabilities, source, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof JoinRequest)) {
            return false;
        }
        JoinRequest joinRequest = (JoinRequest) other;
        return AbstractC22676k.m65745e(unknownFields(), joinRequest.unknownFields()) && AbstractC22676k.m65745e(this.token, joinRequest.token) && AbstractC22676k.m65745e(this.session_id, joinRequest.session_id) && AbstractC22676k.m65745e(this.unified_session_id, joinRequest.unified_session_id) && AbstractC22676k.m65745e(this.subscriber_sdp, joinRequest.subscriber_sdp) && AbstractC22676k.m65745e(this.publisher_sdp, joinRequest.publisher_sdp) && AbstractC22676k.m65745e(this.client_details, joinRequest.client_details) && AbstractC22676k.m65745e(this.migration, joinRequest.migration) && this.fast_reconnect == joinRequest.fast_reconnect && AbstractC22676k.m65745e(this.reconnect_details, joinRequest.reconnect_details) && AbstractC22676k.m65745e(this.preferred_publish_options, joinRequest.preferred_publish_options) && AbstractC22676k.m65745e(this.preferred_subscribe_options, joinRequest.preferred_subscribe_options) && AbstractC22676k.m65745e(this.capabilities, joinRequest.capabilities) && this.source == joinRequest.source;
    }

    public final List<ClientCapability> getCapabilities() {
        return this.capabilities;
    }

    public final ClientDetails getClient_details() {
        return this.client_details;
    }

    public final boolean getFast_reconnect() {
        return this.fast_reconnect;
    }

    public final Migration getMigration() {
        return this.migration;
    }

    public final List<PublishOption> getPreferred_publish_options() {
        return this.preferred_publish_options;
    }

    public final List<SubscribeOption> getPreferred_subscribe_options() {
        return this.preferred_subscribe_options;
    }

    public final String getPublisher_sdp() {
        return this.publisher_sdp;
    }

    public final ReconnectDetails getReconnect_details() {
        return this.reconnect_details;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final ParticipantSource getSource() {
        return this.source;
    }

    public final String getSubscriber_sdp() {
        return this.subscriber_sdp;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getUnified_session_id() {
        return this.unified_session_id;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(unknownFields().hashCode() * 37, 37, this.token), 37, this.session_id), 37, this.unified_session_id), 37, this.subscriber_sdp), 37, this.publisher_sdp);
        ClientDetails clientDetails = this.client_details;
        int iHashCode = (iM30450d + (clientDetails != null ? clientDetails.hashCode() : 0)) * 37;
        Migration migration = this.migration;
        int iM8289b = AbstractC2875y.m8289b((iHashCode + (migration != null ? migration.hashCode() : 0)) * 37, 37, this.fast_reconnect);
        ReconnectDetails reconnectDetails = this.reconnect_details;
        int iHashCode2 = this.source.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b((iM8289b + (reconnectDetails != null ? reconnectDetails.hashCode() : 0)) * 37, 37, this.preferred_publish_options), 37, this.preferred_subscribe_options), 37, this.capabilities);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134500newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC21702c.m61149t(arrayList, this.token, "token=");
        AbstractC21702c.m61149t(arrayList, this.session_id, "session_id=");
        AbstractC21702c.m61149t(arrayList, this.unified_session_id, "unified_session_id=");
        AbstractC21702c.m61149t(arrayList, this.subscriber_sdp, "subscriber_sdp=");
        AbstractC21702c.m61149t(arrayList, this.publisher_sdp, "publisher_sdp=");
        ClientDetails clientDetails = this.client_details;
        if (clientDetails != null) {
            arrayList.add("client_details=" + clientDetails);
        }
        Migration migration = this.migration;
        if (migration != null) {
            arrayList.add("migration=" + migration);
        }
        AbstractC30007c.m91854x("fast_reconnect=", this.fast_reconnect, arrayList);
        ReconnectDetails reconnectDetails = this.reconnect_details;
        if (reconnectDetails != null) {
            arrayList.add("reconnect_details=" + reconnectDetails);
        }
        if (!this.preferred_publish_options.isEmpty()) {
            AbstractC26725a.m79513q("preferred_publish_options=", this.preferred_publish_options, arrayList);
        }
        if (!this.preferred_subscribe_options.isEmpty()) {
            AbstractC26725a.m79513q("preferred_subscribe_options=", this.preferred_subscribe_options, arrayList);
        }
        if (!this.capabilities.isEmpty()) {
            AbstractC26725a.m79513q("capabilities=", this.capabilities, arrayList);
        }
        arrayList.add("source=" + this.source);
        return AbstractC25265s.m74110N0(arrayList, ", ", "JoinRequest{", "}", null, 56);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ JoinRequest(String str, String str2, String str3, String str4, String str5, ClientDetails clientDetails, Migration migration, boolean z4, ReconnectDetails reconnectDetails, List list, List list2, List list3, ParticipantSource participantSource, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i13 & 1) != 0 ? "" : str;
        String str6 = (i13 & 2) != 0 ? "" : str2;
        String str7 = (i13 & 4) != 0 ? "" : str3;
        String str8 = (i13 & 8) != 0 ? "" : str4;
        String str9 = (i13 & 16) == 0 ? str5 : "";
        ClientDetails clientDetails2 = (i13 & 32) != 0 ? null : clientDetails;
        Migration migration2 = (i13 & 64) != 0 ? null : migration;
        boolean z13 = (i13 & 128) != 0 ? false : z4;
        ReconnectDetails reconnectDetails2 = (i13 & 256) == 0 ? reconnectDetails : null;
        int i14 = i13 & 512;
        List list4 = C25271y.f99162w;
        this(str, str6, str7, str8, str9, clientDetails2, migration2, z13, reconnectDetails2, i14 != 0 ? list4 : list, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? list4 : list2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0 ? list3 : list4, (i13 & 4096) != 0 ? ParticipantSource.PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED : participantSource, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134500newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinRequest(String token, String session_id, String unified_session_id, String subscriber_sdp, String publisher_sdp, ClientDetails clientDetails, Migration migration, boolean z4, ReconnectDetails reconnectDetails, List<PublishOption> preferred_publish_options, List<SubscribeOption> preferred_subscribe_options, List<? extends ClientCapability> capabilities, ParticipantSource source, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(token, "token");
        AbstractC22676k.m65750j(session_id, "session_id");
        AbstractC22676k.m65750j(unified_session_id, "unified_session_id");
        AbstractC22676k.m65750j(subscriber_sdp, "subscriber_sdp");
        AbstractC22676k.m65750j(publisher_sdp, "publisher_sdp");
        AbstractC22676k.m65750j(preferred_publish_options, "preferred_publish_options");
        AbstractC22676k.m65750j(preferred_subscribe_options, "preferred_subscribe_options");
        AbstractC22676k.m65750j(capabilities, "capabilities");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.token = token;
        this.session_id = session_id;
        this.unified_session_id = unified_session_id;
        this.subscriber_sdp = subscriber_sdp;
        this.publisher_sdp = publisher_sdp;
        this.client_details = clientDetails;
        this.migration = migration;
        this.fast_reconnect = z4;
        this.reconnect_details = reconnectDetails;
        this.source = source;
        this.preferred_publish_options = AbstractC32103e.m99886h("preferred_publish_options", preferred_publish_options);
        this.preferred_subscribe_options = AbstractC32103e.m99886h("preferred_subscribe_options", preferred_subscribe_options);
        this.capabilities = AbstractC32103e.m99886h("capabilities", capabilities);
    }
}
