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
import com.squareup.wire.ProtoAdapter$EnumConstantNotFoundException;
import j93.InterfaceC21461d;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
import p507tx.C34234e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import s30.AbstractC32103e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b#\u0018\u0000 G2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001GB½\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0018\u00010\u0016\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u000f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0003H\u0016¢\u0006\u0004\b(\u0010)JÃ\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0018\u00010\u00162\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010)R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b.\u0010)R\"\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b2\u0010)R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b4\u00105R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00106\u001a\u0004\b\u0010\u00107R\u001a\u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\b\u0011\u00107R\u001a\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010,\u001a\u0004\b;\u0010)R\u001a\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010,\u001a\u0004\b<\u0010)R\u001a\u0010\u001a\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010=\u001a\u0004\b>\u0010?R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010@\u001a\u0004\bA\u0010BR&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010C\u001a\u0004\bD\u0010ER \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010@\u001a\u0004\bF\u0010B¨\u0006H"}, m65681d2 = {"Lstream/video/sfu/models/Participant;", "Lcom/squareup/wire/l;", "", "", "user_id", "session_id", "", "Lstream/video/sfu/models/TrackType;", "published_tracks", "Ljava/time/Instant;", "Lcom/squareup/wire/Instant;", "joined_at", "track_lookup_prefix", "Lstream/video/sfu/models/ConnectionQuality;", "connection_quality", "", "is_speaking", "is_dominant_speaker", "", "audio_level", "name", "image", "", "custom", "roles", "Lstream/video/sfu/models/ParticipantSource;", "source", "Lne3/l;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/time/Instant;Ljava/lang/String;Lstream/video/sfu/models/ConnectionQuality;ZZFLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lstream/video/sfu/models/ParticipantSource;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/time/Instant;Ljava/lang/String;Lstream/video/sfu/models/ConnectionQuality;ZZFLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lstream/video/sfu/models/ParticipantSource;Lne3/l;)Lstream/video/sfu/models/Participant;", "Ljava/lang/String;", "getUser_id", "getSession_id", "Ljava/time/Instant;", "getJoined_at", "()Ljava/time/Instant;", "getTrack_lookup_prefix", "Lstream/video/sfu/models/ConnectionQuality;", "getConnection_quality", "()Lstream/video/sfu/models/ConnectionQuality;", "Z", "()Z", "F", "getAudio_level", "()F", "getName", "getImage", "Lstream/video/sfu/models/ParticipantSource;", "getSource", "()Lstream/video/sfu/models/ParticipantSource;", "Ljava/util/List;", "getPublished_tracks", "()Ljava/util/List;", "Ljava/util/Map;", "getCustom", "()Ljava/util/Map;", "getRoles", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class Participant extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "audioLevel", label = EnumC5595z.f22132F, tag = 9)
    private final float audio_level;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.ConnectionQuality#ADAPTER", jsonName = "connectionQuality", label = EnumC5595z.f22132F, tag = 6)
    private final ConnectionQuality connection_quality;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", label = EnumC5595z.f22132F, tag = 12)
    private final Map<String, ?> custom;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = EnumC5595z.f22132F, tag = 11)
    private final String image;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isDominantSpeaker", label = EnumC5595z.f22132F, tag = 8)
    private final boolean is_dominant_speaker;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isSpeaking", label = EnumC5595z.f22132F, tag = 7)
    private final boolean is_speaking;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "joinedAt", label = EnumC5595z.f22132F, tag = 4)
    private final Instant joined_at;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = EnumC5595z.f22132F, tag = 10)
    private final String name;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.TrackType#ADAPTER", jsonName = "publishedTracks", label = EnumC5595z.f22136y, tag = 3)
    private final List<TrackType> published_tracks;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = EnumC5595z.f22136y, tag = 13)
    private final List<String> roles;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sessionId", label = EnumC5595z.f22132F, tag = 2)
    private final String session_id;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.ParticipantSource#ADAPTER", label = EnumC5595z.f22132F, tag = 14)
    private final ParticipantSource source;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "trackLookupPrefix", label = EnumC5595z.f22132F, tag = 5)
    private final String track_lookup_prefix;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userId", label = EnumC5595z.f22132F, tag = 1)
    private final String user_id;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(Participant.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.models.Participant$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public Participant decode(C5587r reader) throws IOException {
                Object obj;
                Object obj2;
                AbstractC22676k.m65750j(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ConnectionQuality connectionQuality = ConnectionQuality.CONNECTION_QUALITY_UNSPECIFIED;
                ArrayList arrayList2 = new ArrayList();
                ParticipantSource participantSource = ParticipantSource.PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED;
                long jM16807d = reader.m16807d();
                Object objDecode = connectionQuality;
                Object objDecode2 = "";
                Object objDecode3 = objDecode2;
                Object objDecode4 = null;
                Object objDecode5 = null;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                float fFloatValue = 0.0f;
                Object objDecode6 = participantSource;
                Object objDecode7 = objDecode3;
                Object objDecode8 = objDecode7;
                Object objDecode9 = objDecode8;
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new Participant((String) objDecode7, (String) objDecode8, arrayList, (Instant) objDecode4, (String) objDecode9, (ConnectionQuality) objDecode, zBooleanValue, zBooleanValue2, fFloatValue, (String) objDecode2, (String) objDecode3, (Map) objDecode5, arrayList2, (ParticipantSource) objDecode6, reader.m16808e(jM16807d));
                    }
                    Object obj3 = objDecode6;
                    EnumC5573d enumC5573d2 = EnumC5573d.VARINT;
                    switch (iM16810g) {
                        case 1:
                            objDecode7 = AbstractC5586q.STRING.decode(reader);
                            objDecode6 = obj3;
                            break;
                        case 2:
                            objDecode8 = AbstractC5586q.STRING.decode(reader);
                            objDecode6 = obj3;
                            break;
                        case 3:
                            obj = objDecode7;
                            obj2 = objDecode8;
                            try {
                                TrackType.ADAPTER.tryDecode(reader, arrayList);
                            } catch (ProtoAdapter$EnumConstantNotFoundException e5) {
                                reader.m16804a(iM16810g, enumC5573d2, Long.valueOf(e5.f22081w));
                            }
                            objDecode6 = obj3;
                            objDecode7 = obj;
                            objDecode8 = obj2;
                            break;
                        case 4:
                            objDecode4 = AbstractC5586q.INSTANT.decode(reader);
                            objDecode6 = obj3;
                            break;
                        case 5:
                            objDecode9 = AbstractC5586q.STRING.decode(reader);
                            objDecode6 = obj3;
                            break;
                        case 6:
                            obj = objDecode7;
                            obj2 = objDecode8;
                            try {
                                objDecode = ConnectionQuality.ADAPTER.decode(reader);
                            } catch (ProtoAdapter$EnumConstantNotFoundException e13) {
                                reader.m16804a(iM16810g, enumC5573d2, Long.valueOf(e13.f22081w));
                            }
                            objDecode6 = obj3;
                            objDecode7 = obj;
                            objDecode8 = obj2;
                            break;
                        case 7:
                            zBooleanValue = ((Boolean) AbstractC5586q.BOOL.decode(reader)).booleanValue();
                            objDecode6 = obj3;
                            break;
                        case 8:
                            zBooleanValue2 = ((Boolean) AbstractC5586q.BOOL.decode(reader)).booleanValue();
                            objDecode6 = obj3;
                            break;
                        case 9:
                            fFloatValue = ((Number) AbstractC5586q.FLOAT.decode(reader)).floatValue();
                            objDecode6 = obj3;
                            break;
                        case 10:
                            objDecode2 = AbstractC5586q.STRING.decode(reader);
                            objDecode6 = obj3;
                            break;
                        case 11:
                            objDecode3 = AbstractC5586q.STRING.decode(reader);
                            objDecode6 = obj3;
                            break;
                        case 12:
                            objDecode5 = AbstractC5586q.STRUCT_MAP.decode(reader);
                            objDecode6 = obj3;
                            break;
                        case 13:
                            obj = objDecode7;
                            obj2 = objDecode8;
                            arrayList2.add(AbstractC5586q.STRING.decode(reader));
                            objDecode6 = obj3;
                            objDecode7 = obj;
                            objDecode8 = obj2;
                            break;
                        case 14:
                            try {
                                objDecode6 = ParticipantSource.ADAPTER.decode(reader);
                            } catch (ProtoAdapter$EnumConstantNotFoundException e14) {
                                obj = objDecode7;
                                obj2 = objDecode8;
                                reader.m16804a(iM16810g, enumC5573d2, Long.valueOf(e14.f22081w));
                                objDecode6 = obj3;
                                objDecode7 = obj;
                                objDecode8 = obj2;
                            }
                            break;
                        default:
                            reader.m16813j(iM16810g);
                            obj = objDecode7;
                            obj2 = objDecode8;
                            objDecode6 = obj3;
                            objDecode7 = obj;
                            objDecode8 = obj2;
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(Participant value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (!AbstractC22676k.m65745e(value.getUser_id(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(1, value.getUser_id());
                }
                if (!AbstractC22676k.m65745e(value.getSession_id(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(2, value.getSession_id());
                }
                int iEncodedSizeWithTag = TrackType.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getPublished_tracks()) + iMo79253d;
                if (value.getJoined_at() != null) {
                    iEncodedSizeWithTag += AbstractC5586q.INSTANT.encodedSizeWithTag(4, value.getJoined_at());
                }
                if (!AbstractC22676k.m65745e(value.getTrack_lookup_prefix(), "")) {
                    iEncodedSizeWithTag += AbstractC5586q.STRING.encodedSizeWithTag(5, value.getTrack_lookup_prefix());
                }
                if (value.getConnection_quality() != ConnectionQuality.CONNECTION_QUALITY_UNSPECIFIED) {
                    iEncodedSizeWithTag += ConnectionQuality.ADAPTER.encodedSizeWithTag(6, value.getConnection_quality());
                }
                if (value.getIs_speaking()) {
                    iEncodedSizeWithTag += AbstractC5586q.BOOL.encodedSizeWithTag(7, Boolean.valueOf(value.getIs_speaking()));
                }
                if (value.getIs_dominant_speaker()) {
                    iEncodedSizeWithTag += AbstractC5586q.BOOL.encodedSizeWithTag(8, Boolean.valueOf(value.getIs_dominant_speaker()));
                }
                if (!Float.valueOf(value.getAudio_level()).equals(Float.valueOf(0.0f))) {
                    iEncodedSizeWithTag += AbstractC5586q.FLOAT.encodedSizeWithTag(9, Float.valueOf(value.getAudio_level()));
                }
                if (!AbstractC22676k.m65745e(value.getName(), "")) {
                    iEncodedSizeWithTag += AbstractC5586q.STRING.encodedSizeWithTag(10, value.getName());
                }
                if (!AbstractC22676k.m65745e(value.getImage(), "")) {
                    iEncodedSizeWithTag += AbstractC5586q.STRING.encodedSizeWithTag(11, value.getImage());
                }
                if (value.getCustom() != null) {
                    iEncodedSizeWithTag += AbstractC5586q.STRUCT_MAP.encodedSizeWithTag(12, value.getCustom());
                }
                int iEncodedSizeWithTag2 = AbstractC5586q.STRING.asRepeated().encodedSizeWithTag(13, value.getRoles()) + iEncodedSizeWithTag;
                return value.getSource() != ParticipantSource.PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED ? ParticipantSource.ADAPTER.encodedSizeWithTag(14, value.getSource()) + iEncodedSizeWithTag2 : iEncodedSizeWithTag2;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public Participant redact(Participant value) {
                AbstractC22676k.m65750j(value, "value");
                Instant joined_at = value.getJoined_at();
                Instant instant = joined_at != null ? (Instant) AbstractC5586q.INSTANT.redact(joined_at) : null;
                Map<String, ?> custom = value.getCustom();
                return value.copy((14327 & 1) != 0 ? value.user_id : null, (14327 & 2) != 0 ? value.session_id : null, (14327 & 4) != 0 ? value.published_tracks : null, (14327 & 8) != 0 ? value.joined_at : instant, (14327 & 16) != 0 ? value.track_lookup_prefix : null, (14327 & 32) != 0 ? value.connection_quality : null, (14327 & 64) != 0 ? value.is_speaking : false, (14327 & 128) != 0 ? value.is_dominant_speaker : false, (14327 & 256) != 0 ? value.audio_level : 0.0f, (14327 & 512) != 0 ? value.name : null, (14327 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? value.image : null, (14327 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? value.custom : custom != null ? (Map) AbstractC5586q.STRUCT_MAP.redact(custom) : null, (14327 & 4096) != 0 ? value.roles : null, (14327 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? value.source : null, (14327 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? value.unknownFields() : C26624l.f105881E);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, Participant value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (!AbstractC22676k.m65745e(value.getUser_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 1, value.getUser_id());
                }
                if (!AbstractC22676k.m65745e(value.getSession_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 2, value.getSession_id());
                }
                TrackType.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.getPublished_tracks());
                if (value.getJoined_at() != null) {
                    AbstractC5586q.INSTANT.encodeWithTag(writer, 4, value.getJoined_at());
                }
                if (!AbstractC22676k.m65745e(value.getTrack_lookup_prefix(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 5, value.getTrack_lookup_prefix());
                }
                if (value.getConnection_quality() != ConnectionQuality.CONNECTION_QUALITY_UNSPECIFIED) {
                    ConnectionQuality.ADAPTER.encodeWithTag(writer, 6, value.getConnection_quality());
                }
                if (value.getIs_speaking()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 7, Boolean.valueOf(value.getIs_speaking()));
                }
                if (value.getIs_dominant_speaker()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 8, Boolean.valueOf(value.getIs_dominant_speaker()));
                }
                if (!Float.valueOf(value.getAudio_level()).equals(Float.valueOf(0.0f))) {
                    AbstractC5586q.FLOAT.encodeWithTag(writer, 9, Float.valueOf(value.getAudio_level()));
                }
                if (!AbstractC22676k.m65745e(value.getName(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 10, value.getName());
                }
                if (!AbstractC22676k.m65745e(value.getImage(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 11, value.getImage());
                }
                if (value.getCustom() != null) {
                    AbstractC5586q.STRUCT_MAP.encodeWithTag(writer, 12, value.getCustom());
                }
                AbstractC5586q.STRING.asRepeated().encodeWithTag(writer, 13, value.getRoles());
                if (value.getSource() != ParticipantSource.PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED) {
                    ParticipantSource.ADAPTER.encodeWithTag(writer, 14, value.getSource());
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, Participant value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (value.getSource() != ParticipantSource.PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED) {
                    ParticipantSource.ADAPTER.encodeWithTag(writer, 14, value.getSource());
                }
                AbstractC5586q abstractC5586q = AbstractC5586q.STRING;
                abstractC5586q.asRepeated().encodeWithTag(writer, 13, value.getRoles());
                if (value.getCustom() != null) {
                    AbstractC5586q.STRUCT_MAP.encodeWithTag(writer, 12, value.getCustom());
                }
                if (!AbstractC22676k.m65745e(value.getImage(), "")) {
                    abstractC5586q.encodeWithTag(writer, 11, value.getImage());
                }
                if (!AbstractC22676k.m65745e(value.getName(), "")) {
                    abstractC5586q.encodeWithTag(writer, 10, value.getName());
                }
                if (!Float.valueOf(value.getAudio_level()).equals(Float.valueOf(0.0f))) {
                    AbstractC5586q.FLOAT.encodeWithTag(writer, 9, Float.valueOf(value.getAudio_level()));
                }
                if (value.getIs_dominant_speaker()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 8, Boolean.valueOf(value.getIs_dominant_speaker()));
                }
                if (value.getIs_speaking()) {
                    AbstractC5586q.BOOL.encodeWithTag(writer, 7, Boolean.valueOf(value.getIs_speaking()));
                }
                if (value.getConnection_quality() != ConnectionQuality.CONNECTION_QUALITY_UNSPECIFIED) {
                    ConnectionQuality.ADAPTER.encodeWithTag(writer, 6, value.getConnection_quality());
                }
                if (!AbstractC22676k.m65745e(value.getTrack_lookup_prefix(), "")) {
                    abstractC5586q.encodeWithTag(writer, 5, value.getTrack_lookup_prefix());
                }
                if (value.getJoined_at() != null) {
                    AbstractC5586q.INSTANT.encodeWithTag(writer, 4, value.getJoined_at());
                }
                TrackType.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.getPublished_tracks());
                if (!AbstractC22676k.m65745e(value.getSession_id(), "")) {
                    abstractC5586q.encodeWithTag(writer, 2, value.getSession_id());
                }
                if (AbstractC22676k.m65745e(value.getUser_id(), "")) {
                    return;
                }
                abstractC5586q.encodeWithTag(writer, 1, value.getUser_id());
            }
        };
    }

    public Participant() {
        this(null, null, null, null, null, null, false, false, 0.0f, null, null, null, null, null, null, 32767, null);
    }

    public final Participant copy(String user_id, String session_id, List<? extends TrackType> published_tracks, Instant joined_at, String track_lookup_prefix, ConnectionQuality connection_quality, boolean is_speaking, boolean is_dominant_speaker, float audio_level, String name, String image, Map<String, ?> custom, List<String> roles, ParticipantSource source, C26624l unknownFields) {
        AbstractC22676k.m65750j(user_id, "user_id");
        AbstractC22676k.m65750j(session_id, "session_id");
        AbstractC22676k.m65750j(published_tracks, "published_tracks");
        AbstractC22676k.m65750j(track_lookup_prefix, "track_lookup_prefix");
        AbstractC22676k.m65750j(connection_quality, "connection_quality");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(roles, "roles");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new Participant(user_id, session_id, published_tracks, joined_at, track_lookup_prefix, connection_quality, is_speaking, is_dominant_speaker, audio_level, name, image, custom, roles, source, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Participant)) {
            return false;
        }
        Participant participant = (Participant) other;
        return AbstractC22676k.m65745e(unknownFields(), participant.unknownFields()) && AbstractC22676k.m65745e(this.user_id, participant.user_id) && AbstractC22676k.m65745e(this.session_id, participant.session_id) && AbstractC22676k.m65745e(this.published_tracks, participant.published_tracks) && AbstractC22676k.m65745e(this.joined_at, participant.joined_at) && AbstractC22676k.m65745e(this.track_lookup_prefix, participant.track_lookup_prefix) && this.connection_quality == participant.connection_quality && this.is_speaking == participant.is_speaking && this.is_dominant_speaker == participant.is_dominant_speaker && this.audio_level == participant.audio_level && AbstractC22676k.m65745e(this.name, participant.name) && AbstractC22676k.m65745e(this.image, participant.image) && AbstractC22676k.m65745e(this.custom, participant.custom) && AbstractC22676k.m65745e(this.roles, participant.roles) && this.source == participant.source;
    }

    public final float getAudio_level() {
        return this.audio_level;
    }

    public final ConnectionQuality getConnection_quality() {
        return this.connection_quality;
    }

    public final Map<String, ?> getCustom() {
        return this.custom;
    }

    public final String getImage() {
        return this.image;
    }

    public final Instant getJoined_at() {
        return this.joined_at;
    }

    public final String getName() {
        return this.name;
    }

    public final List<TrackType> getPublished_tracks() {
        return this.published_tracks;
    }

    public final List<String> getRoles() {
        return this.roles;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final ParticipantSource getSource() {
        return this.source;
    }

    public final String getTrack_lookup_prefix() {
        return this.track_lookup_prefix;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(unknownFields().hashCode() * 37, 37, this.user_id), 37, this.session_id), 37, this.published_tracks);
        Instant instant = this.joined_at;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30447a(this.audio_level, AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.connection_quality.hashCode() + AbstractC11266d.m30450d((iM31983b + (instant != null ? instant.hashCode() : 0)) * 37, 37, this.track_lookup_prefix)) * 37, 37, this.is_speaking), 37, this.is_dominant_speaker), 37), 37, this.name), 37, this.image);
        Map<String, ?> map = this.custom;
        int iHashCode = this.source.hashCode() + AbstractC11895b.m31983b((iM30450d + (map != null ? map.hashCode() : 0)) * 37, 37, this.roles);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: is_dominant_speaker, reason: from getter */
    public final boolean getIs_dominant_speaker() {
        return this.is_dominant_speaker;
    }

    /* JADX INFO: renamed from: is_speaking, reason: from getter */
    public final boolean getIs_speaking() {
        return this.is_speaking;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134534newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC21702c.m61149t(arrayList, this.user_id, "user_id=");
        AbstractC21702c.m61149t(arrayList, this.session_id, "session_id=");
        if (!this.published_tracks.isEmpty()) {
            AbstractC26725a.m79513q("published_tracks=", this.published_tracks, arrayList);
        }
        Instant instant = this.joined_at;
        if (instant != null) {
            arrayList.add("joined_at=" + instant);
        }
        AbstractC21702c.m61149t(arrayList, this.track_lookup_prefix, "track_lookup_prefix=");
        arrayList.add("connection_quality=" + this.connection_quality);
        AbstractC30007c.m91854x("is_speaking=", this.is_speaking, arrayList);
        AbstractC30007c.m91854x("is_dominant_speaker=", this.is_dominant_speaker, arrayList);
        arrayList.add("audio_level=" + this.audio_level);
        AbstractC21702c.m61149t(arrayList, this.name, "name=");
        AbstractC21702c.m61149t(arrayList, this.image, "image=");
        Map<String, ?> map = this.custom;
        if (map != null) {
            arrayList.add("custom=" + map);
        }
        if (!this.roles.isEmpty()) {
            List<String> values = this.roles;
            AbstractC22676k.m65750j(values, "values");
            arrayList.add("roles=" + AbstractC25265s.m74110N0(values, null, "[", "]", C34234e.f143614w, 25));
        }
        arrayList.add("source=" + this.source);
        return AbstractC25265s.m74110N0(arrayList, ", ", "Participant{", "}", null, 56);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Participant(String str, String str2, List list, Instant instant, String str3, ConnectionQuality connectionQuality, boolean z4, boolean z13, float f13, String str4, String str5, Map map, List list2, ParticipantSource participantSource, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        String str6 = (i13 & 1) != 0 ? "" : str;
        String str7 = (i13 & 2) != 0 ? "" : str2;
        int i14 = i13 & 4;
        List list3 = C25271y.f99162w;
        this(str6, str7, i14 != 0 ? list3 : list, (i13 & 8) != 0 ? null : instant, (i13 & 16) != 0 ? "" : str3, (i13 & 32) != 0 ? ConnectionQuality.CONNECTION_QUALITY_UNSPECIFIED : connectionQuality, (i13 & 64) != 0 ? false : z4, (i13 & 128) == 0 ? z13 : false, (i13 & 256) != 0 ? 0.0f : f13, (i13 & 512) != 0 ? "" : str4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 ? str5 : "", (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0 ? map : null, (i13 & 4096) == 0 ? list2 : list3, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? ParticipantSource.PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED : participantSource, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134534newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Participant(String user_id, String session_id, List<? extends TrackType> published_tracks, Instant instant, String track_lookup_prefix, ConnectionQuality connection_quality, boolean z4, boolean z13, float f13, String name, String image, Map<String, ?> map, List<String> roles, ParticipantSource source, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(user_id, "user_id");
        AbstractC22676k.m65750j(session_id, "session_id");
        AbstractC22676k.m65750j(published_tracks, "published_tracks");
        AbstractC22676k.m65750j(track_lookup_prefix, "track_lookup_prefix");
        AbstractC22676k.m65750j(connection_quality, "connection_quality");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(roles, "roles");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.user_id = user_id;
        this.session_id = session_id;
        this.joined_at = instant;
        this.track_lookup_prefix = track_lookup_prefix;
        this.connection_quality = connection_quality;
        this.is_speaking = z4;
        this.is_dominant_speaker = z13;
        this.audio_level = f13;
        this.name = name;
        this.image = image;
        this.source = source;
        this.published_tracks = AbstractC32103e.m99886h("published_tracks", published_tracks);
        this.custom = (Map) AbstractC32103e.m99887i(map);
        this.roles = AbstractC32103e.m99886h("roles", roles);
    }
}
