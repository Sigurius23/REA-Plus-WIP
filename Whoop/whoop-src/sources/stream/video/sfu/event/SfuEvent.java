package stream.video.sfu.event;

import androidx.health.platform.client.proto.C1533u;
import androidx.profileinstaller.ProfileVerifier;
import com.squareup.wire.AbstractC5579j;
import com.squareup.wire.AbstractC5581l;
import com.squareup.wire.AbstractC5586q;
import com.squareup.wire.C5587r;
import com.squareup.wire.C5588s;
import com.squareup.wire.C5591v;
import com.squareup.wire.EnumC5573d;
import com.squareup.wire.EnumC5593x;
import com.squareup.wire.InterfaceC5570a0;
import j93.InterfaceC21461d;
import java.io.IOException;
import java.util.ArrayList;
import l83.InterfaceC23457c;
import m83.AbstractC25265s;
import ne3.C26624l;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bK\u0018\u0000 \u0089\u00012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0089\u0001B¥\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010/\u0012\b\b\u0002\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0002H\u0017¢\u0006\u0004\b5\u00106J\u001a\u0010:\u001a\u0002092\b\u00108\u001a\u0004\u0018\u000107H\u0096\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\b@\u0010AJ«\u0002\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\b\b\u0002\u00102\u001a\u000201¢\u0006\u0004\bB\u0010CR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010D\u001a\u0004\bE\u0010FR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010G\u001a\u0004\bH\u0010IR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010J\u001a\u0004\bK\u0010LR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010M\u001a\u0004\bN\u0010OR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010P\u001a\u0004\bQ\u0010RR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010S\u001a\u0004\bT\u0010UR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010V\u001a\u0004\bW\u0010XR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010Y\u001a\u0004\bZ\u0010[R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\\\u001a\u0004\b]\u0010^R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010_\u001a\u0004\b`\u0010aR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010b\u001a\u0004\bc\u0010dR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010e\u001a\u0004\bf\u0010gR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010h\u001a\u0004\bi\u0010jR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010k\u001a\u0004\bl\u0010mR\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010n\u001a\u0004\bo\u0010pR\u001c\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010q\u001a\u0004\br\u0010sR\u001c\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010t\u001a\u0004\bu\u0010vR\u001c\u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010w\u001a\u0004\bx\u0010yR\u001c\u0010(\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010z\u001a\u0004\b{\u0010|R\u001c\u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010}\u001a\u0004\b~\u0010\u007fR\u001f\u0010,\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b,\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001f\u0010.\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b.\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001f\u00100\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b0\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001¨\u0006\u008a\u0001"}, m65681d2 = {"Lstream/video/sfu/event/SfuEvent;", "Lcom/squareup/wire/l;", "", "Lstream/video/sfu/event/SubscriberOffer;", "subscriber_offer", "Lstream/video/sfu/event/PublisherAnswer;", "publisher_answer", "Lstream/video/sfu/event/ConnectionQualityChanged;", "connection_quality_changed", "Lstream/video/sfu/event/AudioLevelChanged;", "audio_level_changed", "Lstream/video/sfu/models/ICETrickle;", "ice_trickle", "Lstream/video/sfu/event/ChangePublishQuality;", "change_publish_quality", "Lstream/video/sfu/event/ParticipantJoined;", "participant_joined", "Lstream/video/sfu/event/ParticipantLeft;", "participant_left", "Lstream/video/sfu/event/DominantSpeakerChanged;", "dominant_speaker_changed", "Lstream/video/sfu/event/JoinResponse;", "join_response", "Lstream/video/sfu/event/HealthCheckResponse;", "health_check_response", "Lstream/video/sfu/event/TrackPublished;", "track_published", "Lstream/video/sfu/event/TrackUnpublished;", "track_unpublished", "Lstream/video/sfu/event/Error;", "error", "Lstream/video/sfu/event/CallGrantsUpdated;", "call_grants_updated", "Lstream/video/sfu/event/GoAway;", "go_away", "Lstream/video/sfu/event/ICERestart;", "ice_restart", "Lstream/video/sfu/event/PinsChanged;", "pins_updated", "Lstream/video/sfu/event/CallEnded;", "call_ended", "Lstream/video/sfu/event/ParticipantUpdated;", "participant_updated", "Lstream/video/sfu/event/ParticipantMigrationComplete;", "participant_migration_complete", "Lstream/video/sfu/event/ChangePublishOptions;", "change_publish_options", "Lstream/video/sfu/event/InboundStateNotification;", "inbound_state_notification", "Lne3/l;", "unknownFields", "<init>", "(Lstream/video/sfu/event/SubscriberOffer;Lstream/video/sfu/event/PublisherAnswer;Lstream/video/sfu/event/ConnectionQualityChanged;Lstream/video/sfu/event/AudioLevelChanged;Lstream/video/sfu/models/ICETrickle;Lstream/video/sfu/event/ChangePublishQuality;Lstream/video/sfu/event/ParticipantJoined;Lstream/video/sfu/event/ParticipantLeft;Lstream/video/sfu/event/DominantSpeakerChanged;Lstream/video/sfu/event/JoinResponse;Lstream/video/sfu/event/HealthCheckResponse;Lstream/video/sfu/event/TrackPublished;Lstream/video/sfu/event/TrackUnpublished;Lstream/video/sfu/event/Error;Lstream/video/sfu/event/CallGrantsUpdated;Lstream/video/sfu/event/GoAway;Lstream/video/sfu/event/ICERestart;Lstream/video/sfu/event/PinsChanged;Lstream/video/sfu/event/CallEnded;Lstream/video/sfu/event/ParticipantUpdated;Lstream/video/sfu/event/ParticipantMigrationComplete;Lstream/video/sfu/event/ChangePublishOptions;Lstream/video/sfu/event/InboundStateNotification;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lstream/video/sfu/event/SubscriberOffer;Lstream/video/sfu/event/PublisherAnswer;Lstream/video/sfu/event/ConnectionQualityChanged;Lstream/video/sfu/event/AudioLevelChanged;Lstream/video/sfu/models/ICETrickle;Lstream/video/sfu/event/ChangePublishQuality;Lstream/video/sfu/event/ParticipantJoined;Lstream/video/sfu/event/ParticipantLeft;Lstream/video/sfu/event/DominantSpeakerChanged;Lstream/video/sfu/event/JoinResponse;Lstream/video/sfu/event/HealthCheckResponse;Lstream/video/sfu/event/TrackPublished;Lstream/video/sfu/event/TrackUnpublished;Lstream/video/sfu/event/Error;Lstream/video/sfu/event/CallGrantsUpdated;Lstream/video/sfu/event/GoAway;Lstream/video/sfu/event/ICERestart;Lstream/video/sfu/event/PinsChanged;Lstream/video/sfu/event/CallEnded;Lstream/video/sfu/event/ParticipantUpdated;Lstream/video/sfu/event/ParticipantMigrationComplete;Lstream/video/sfu/event/ChangePublishOptions;Lstream/video/sfu/event/InboundStateNotification;Lne3/l;)Lstream/video/sfu/event/SfuEvent;", "Lstream/video/sfu/event/SubscriberOffer;", "getSubscriber_offer", "()Lstream/video/sfu/event/SubscriberOffer;", "Lstream/video/sfu/event/PublisherAnswer;", "getPublisher_answer", "()Lstream/video/sfu/event/PublisherAnswer;", "Lstream/video/sfu/event/ConnectionQualityChanged;", "getConnection_quality_changed", "()Lstream/video/sfu/event/ConnectionQualityChanged;", "Lstream/video/sfu/event/AudioLevelChanged;", "getAudio_level_changed", "()Lstream/video/sfu/event/AudioLevelChanged;", "Lstream/video/sfu/models/ICETrickle;", "getIce_trickle", "()Lstream/video/sfu/models/ICETrickle;", "Lstream/video/sfu/event/ChangePublishQuality;", "getChange_publish_quality", "()Lstream/video/sfu/event/ChangePublishQuality;", "Lstream/video/sfu/event/ParticipantJoined;", "getParticipant_joined", "()Lstream/video/sfu/event/ParticipantJoined;", "Lstream/video/sfu/event/ParticipantLeft;", "getParticipant_left", "()Lstream/video/sfu/event/ParticipantLeft;", "Lstream/video/sfu/event/DominantSpeakerChanged;", "getDominant_speaker_changed", "()Lstream/video/sfu/event/DominantSpeakerChanged;", "Lstream/video/sfu/event/JoinResponse;", "getJoin_response", "()Lstream/video/sfu/event/JoinResponse;", "Lstream/video/sfu/event/HealthCheckResponse;", "getHealth_check_response", "()Lstream/video/sfu/event/HealthCheckResponse;", "Lstream/video/sfu/event/TrackPublished;", "getTrack_published", "()Lstream/video/sfu/event/TrackPublished;", "Lstream/video/sfu/event/TrackUnpublished;", "getTrack_unpublished", "()Lstream/video/sfu/event/TrackUnpublished;", "Lstream/video/sfu/event/Error;", "getError", "()Lstream/video/sfu/event/Error;", "Lstream/video/sfu/event/CallGrantsUpdated;", "getCall_grants_updated", "()Lstream/video/sfu/event/CallGrantsUpdated;", "Lstream/video/sfu/event/GoAway;", "getGo_away", "()Lstream/video/sfu/event/GoAway;", "Lstream/video/sfu/event/ICERestart;", "getIce_restart", "()Lstream/video/sfu/event/ICERestart;", "Lstream/video/sfu/event/PinsChanged;", "getPins_updated", "()Lstream/video/sfu/event/PinsChanged;", "Lstream/video/sfu/event/CallEnded;", "getCall_ended", "()Lstream/video/sfu/event/CallEnded;", "Lstream/video/sfu/event/ParticipantUpdated;", "getParticipant_updated", "()Lstream/video/sfu/event/ParticipantUpdated;", "Lstream/video/sfu/event/ParticipantMigrationComplete;", "getParticipant_migration_complete", "()Lstream/video/sfu/event/ParticipantMigrationComplete;", "Lstream/video/sfu/event/ChangePublishOptions;", "getChange_publish_options", "()Lstream/video/sfu/event/ChangePublishOptions;", "Lstream/video/sfu/event/InboundStateNotification;", "getInbound_state_notification", "()Lstream/video/sfu/event/InboundStateNotification;", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class SfuEvent extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "stream.video.sfu.event.AudioLevelChanged#ADAPTER", jsonName = "audioLevelChanged", oneofName = "event_payload", tag = 4)
    private final AudioLevelChanged audio_level_changed;

    @InterfaceC5570a0(adapter = "stream.video.sfu.event.CallEnded#ADAPTER", jsonName = "callEnded", oneofName = "event_payload", tag = C1533u.RECORDING_METHOD_FIELD_NUMBER)
    private final CallEnded call_ended;

    @InterfaceC5570a0(adapter = "stream.video.sfu.event.CallGrantsUpdated#ADAPTER", jsonName = "callGrantsUpdated", oneofName = "event_payload", tag = C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER)
    private final CallGrantsUpdated call_grants_updated;

    @InterfaceC5570a0(adapter = "stream.video.sfu.event.ChangePublishOptions#ADAPTER", jsonName = "changePublishOptions", oneofName = "event_payload", tag = 27)
    private final ChangePublishOptions change_publish_options;

    @InterfaceC5570a0(adapter = "stream.video.sfu.event.ChangePublishQuality#ADAPTER", jsonName = "changePublishQuality", oneofName = "event_payload", tag = 6)
    private final ChangePublishQuality change_publish_quality;

    @InterfaceC5570a0(adapter = "stream.video.sfu.event.ConnectionQualityChanged#ADAPTER", jsonName = "connectionQualityChanged", oneofName = "event_payload", tag = 3)
    private final ConnectionQualityChanged connection_quality_changed;

    @InterfaceC5570a0(adapter = "stream.video.sfu.event.DominantSpeakerChanged#ADAPTER", jsonName = "dominantSpeakerChanged", oneofName = "event_payload", tag = 12)
    private final DominantSpeakerChanged dominant_speaker_changed;

    @InterfaceC5570a0(adapter = "stream.video.sfu.event.Error#ADAPTER", oneofName = "event_payload", tag = C1533u.AVG_FIELD_NUMBER)
    private final Error error;

    @InterfaceC5570a0(adapter = "stream.video.sfu.event.GoAway#ADAPTER", jsonName = "goAway", oneofName = "event_payload", tag = 20)
    private final GoAway go_away;

    @InterfaceC5570a0(adapter = "stream.video.sfu.event.HealthCheckResponse#ADAPTER", jsonName = "healthCheckResponse", oneofName = "event_payload", tag = 14)
    private final HealthCheckResponse health_check_response;

    @InterfaceC5570a0(adapter = "stream.video.sfu.event.ICERestart#ADAPTER", jsonName = "iceRestart", oneofName = "event_payload", tag = 21)
    private final ICERestart ice_restart;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.ICETrickle#ADAPTER", jsonName = "iceTrickle", oneofName = "event_payload", tag = 5)
    private final stream.video.sfu.models.ICETrickle ice_trickle;

    @InterfaceC5570a0(adapter = "stream.video.sfu.event.InboundStateNotification#ADAPTER", jsonName = "inboundStateNotification", oneofName = "event_payload", tag = 28)
    private final InboundStateNotification inbound_state_notification;

    @InterfaceC5570a0(adapter = "stream.video.sfu.event.JoinResponse#ADAPTER", jsonName = "joinResponse", oneofName = "event_payload", tag = 13)
    private final JoinResponse join_response;

    @InterfaceC5570a0(adapter = "stream.video.sfu.event.ParticipantJoined#ADAPTER", jsonName = "participantJoined", oneofName = "event_payload", tag = 10)
    private final ParticipantJoined participant_joined;

    @InterfaceC5570a0(adapter = "stream.video.sfu.event.ParticipantLeft#ADAPTER", jsonName = "participantLeft", oneofName = "event_payload", tag = 11)
    private final ParticipantLeft participant_left;

    @InterfaceC5570a0(adapter = "stream.video.sfu.event.ParticipantMigrationComplete#ADAPTER", jsonName = "participantMigrationComplete", oneofName = "event_payload", tag = 25)
    private final ParticipantMigrationComplete participant_migration_complete;

    @InterfaceC5570a0(adapter = "stream.video.sfu.event.ParticipantUpdated#ADAPTER", jsonName = "participantUpdated", oneofName = "event_payload", tag = 24)
    private final ParticipantUpdated participant_updated;

    @InterfaceC5570a0(adapter = "stream.video.sfu.event.PinsChanged#ADAPTER", jsonName = "pinsUpdated", oneofName = "event_payload", tag = C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER)
    private final PinsChanged pins_updated;

    @InterfaceC5570a0(adapter = "stream.video.sfu.event.PublisherAnswer#ADAPTER", jsonName = "publisherAnswer", oneofName = "event_payload", tag = 2)
    private final PublisherAnswer publisher_answer;

    @InterfaceC5570a0(adapter = "stream.video.sfu.event.SubscriberOffer#ADAPTER", jsonName = "subscriberOffer", oneofName = "event_payload", tag = 1)
    private final SubscriberOffer subscriber_offer;

    @InterfaceC5570a0(adapter = "stream.video.sfu.event.TrackPublished#ADAPTER", jsonName = "trackPublished", oneofName = "event_payload", tag = 16)
    private final TrackPublished track_published;

    @InterfaceC5570a0(adapter = "stream.video.sfu.event.TrackUnpublished#ADAPTER", jsonName = "trackUnpublished", oneofName = "event_payload", tag = C1533u.MAX_FIELD_NUMBER)
    private final TrackUnpublished track_unpublished;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(SfuEvent.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.event.SfuEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public SfuEvent decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                long jM16807d = reader.m16807d();
                Object objDecode = null;
                Object objDecode2 = null;
                Object objDecode3 = null;
                Object objDecode4 = null;
                Object objDecode5 = null;
                Object objDecode6 = null;
                Object objDecode7 = null;
                Object objDecode8 = null;
                Object objDecode9 = null;
                Object objDecode10 = null;
                Object objDecode11 = null;
                Object objDecode12 = null;
                Object objDecode13 = null;
                Object objDecode14 = null;
                Object objDecode15 = null;
                Object objDecode16 = null;
                Object objDecode17 = null;
                Object objDecode18 = null;
                Object objDecode19 = null;
                Object objDecode20 = null;
                Object objDecode21 = null;
                Object objDecode22 = null;
                Object objDecode23 = null;
                while (true) {
                    int iM16810g = reader.m16810g();
                    Object obj = objDecode;
                    if (iM16810g == -1) {
                        return new SfuEvent((SubscriberOffer) objDecode23, (PublisherAnswer) obj, (ConnectionQualityChanged) objDecode2, (AudioLevelChanged) objDecode3, (stream.video.sfu.models.ICETrickle) objDecode4, (ChangePublishQuality) objDecode5, (ParticipantJoined) objDecode6, (ParticipantLeft) objDecode7, (DominantSpeakerChanged) objDecode8, (JoinResponse) objDecode9, (HealthCheckResponse) objDecode10, (TrackPublished) objDecode11, (TrackUnpublished) objDecode12, (Error) objDecode13, (CallGrantsUpdated) objDecode14, (GoAway) objDecode15, (ICERestart) objDecode16, (PinsChanged) objDecode17, (CallEnded) objDecode18, (ParticipantUpdated) objDecode19, (ParticipantMigrationComplete) objDecode20, (ChangePublishOptions) objDecode21, (InboundStateNotification) objDecode22, reader.m16808e(jM16807d));
                    }
                    switch (iM16810g) {
                        case 1:
                            objDecode23 = SubscriberOffer.ADAPTER.decode(reader);
                            break;
                        case 2:
                            objDecode = PublisherAnswer.ADAPTER.decode(reader);
                            continue;
                        case 3:
                            objDecode2 = ConnectionQualityChanged.ADAPTER.decode(reader);
                            break;
                        case 4:
                            objDecode3 = AudioLevelChanged.ADAPTER.decode(reader);
                            break;
                        case 5:
                            objDecode4 = stream.video.sfu.models.ICETrickle.ADAPTER.decode(reader);
                            break;
                        case 6:
                            objDecode5 = ChangePublishQuality.ADAPTER.decode(reader);
                            break;
                        case 7:
                        case 8:
                        case 9:
                        case 15:
                        case 26:
                        default:
                            reader.m16813j(iM16810g);
                            break;
                        case 10:
                            objDecode6 = ParticipantJoined.ADAPTER.decode(reader);
                            break;
                        case 11:
                            objDecode7 = ParticipantLeft.ADAPTER.decode(reader);
                            break;
                        case 12:
                            objDecode8 = DominantSpeakerChanged.ADAPTER.decode(reader);
                            break;
                        case 13:
                            objDecode9 = JoinResponse.ADAPTER.decode(reader);
                            break;
                        case 14:
                            objDecode10 = HealthCheckResponse.ADAPTER.decode(reader);
                            break;
                        case 16:
                            objDecode11 = TrackPublished.ADAPTER.decode(reader);
                            break;
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            objDecode12 = TrackUnpublished.ADAPTER.decode(reader);
                            break;
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            objDecode13 = Error.ADAPTER.decode(reader);
                            break;
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                            objDecode14 = CallGrantsUpdated.ADAPTER.decode(reader);
                            break;
                        case 20:
                            objDecode15 = GoAway.ADAPTER.decode(reader);
                            break;
                        case 21:
                            objDecode16 = ICERestart.ADAPTER.decode(reader);
                            break;
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            objDecode17 = PinsChanged.ADAPTER.decode(reader);
                            break;
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            objDecode18 = CallEnded.ADAPTER.decode(reader);
                            break;
                        case 24:
                            objDecode19 = ParticipantUpdated.ADAPTER.decode(reader);
                            break;
                        case 25:
                            objDecode20 = ParticipantMigrationComplete.ADAPTER.decode(reader);
                            break;
                        case 27:
                            objDecode21 = ChangePublishOptions.ADAPTER.decode(reader);
                            break;
                        case 28:
                            objDecode22 = InboundStateNotification.ADAPTER.decode(reader);
                            break;
                    }
                    objDecode = obj;
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(SfuEvent value) {
                AbstractC22676k.m65750j(value, "value");
                return InboundStateNotification.ADAPTER.encodedSizeWithTag(28, value.getInbound_state_notification()) + ChangePublishOptions.ADAPTER.encodedSizeWithTag(27, value.getChange_publish_options()) + ParticipantMigrationComplete.ADAPTER.encodedSizeWithTag(25, value.getParticipant_migration_complete()) + ParticipantUpdated.ADAPTER.encodedSizeWithTag(24, value.getParticipant_updated()) + CallEnded.ADAPTER.encodedSizeWithTag(23, value.getCall_ended()) + PinsChanged.ADAPTER.encodedSizeWithTag(22, value.getPins_updated()) + ICERestart.ADAPTER.encodedSizeWithTag(21, value.getIce_restart()) + GoAway.ADAPTER.encodedSizeWithTag(20, value.getGo_away()) + CallGrantsUpdated.ADAPTER.encodedSizeWithTag(19, value.getCall_grants_updated()) + Error.ADAPTER.encodedSizeWithTag(18, value.getError()) + TrackUnpublished.ADAPTER.encodedSizeWithTag(17, value.getTrack_unpublished()) + TrackPublished.ADAPTER.encodedSizeWithTag(16, value.getTrack_published()) + HealthCheckResponse.ADAPTER.encodedSizeWithTag(14, value.getHealth_check_response()) + JoinResponse.ADAPTER.encodedSizeWithTag(13, value.getJoin_response()) + DominantSpeakerChanged.ADAPTER.encodedSizeWithTag(12, value.getDominant_speaker_changed()) + ParticipantLeft.ADAPTER.encodedSizeWithTag(11, value.getParticipant_left()) + ParticipantJoined.ADAPTER.encodedSizeWithTag(10, value.getParticipant_joined()) + ChangePublishQuality.ADAPTER.encodedSizeWithTag(6, value.getChange_publish_quality()) + stream.video.sfu.models.ICETrickle.ADAPTER.encodedSizeWithTag(5, value.getIce_trickle()) + AudioLevelChanged.ADAPTER.encodedSizeWithTag(4, value.getAudio_level_changed()) + ConnectionQualityChanged.ADAPTER.encodedSizeWithTag(3, value.getConnection_quality_changed()) + PublisherAnswer.ADAPTER.encodedSizeWithTag(2, value.getPublisher_answer()) + SubscriberOffer.ADAPTER.encodedSizeWithTag(1, value.getSubscriber_offer()) + value.unknownFields().mo79253d();
            }

            @Override // com.squareup.wire.AbstractC5586q
            public SfuEvent redact(SfuEvent value) {
                ChangePublishOptions changePublishOptions;
                ParticipantUpdated participantUpdated;
                InboundStateNotification inboundStateNotification;
                AbstractC22676k.m65750j(value, "value");
                SubscriberOffer subscriber_offer = value.getSubscriber_offer();
                SubscriberOffer subscriberOffer = subscriber_offer != null ? (SubscriberOffer) SubscriberOffer.ADAPTER.redact(subscriber_offer) : null;
                PublisherAnswer publisher_answer = value.getPublisher_answer();
                PublisherAnswer publisherAnswer = publisher_answer != null ? (PublisherAnswer) PublisherAnswer.ADAPTER.redact(publisher_answer) : null;
                ConnectionQualityChanged connection_quality_changed = value.getConnection_quality_changed();
                ConnectionQualityChanged connectionQualityChanged = connection_quality_changed != null ? (ConnectionQualityChanged) ConnectionQualityChanged.ADAPTER.redact(connection_quality_changed) : null;
                AudioLevelChanged audio_level_changed = value.getAudio_level_changed();
                AudioLevelChanged audioLevelChanged = audio_level_changed != null ? (AudioLevelChanged) AudioLevelChanged.ADAPTER.redact(audio_level_changed) : null;
                stream.video.sfu.models.ICETrickle ice_trickle = value.getIce_trickle();
                stream.video.sfu.models.ICETrickle iCETrickle = ice_trickle != null ? (stream.video.sfu.models.ICETrickle) stream.video.sfu.models.ICETrickle.ADAPTER.redact(ice_trickle) : null;
                ChangePublishQuality change_publish_quality = value.getChange_publish_quality();
                ChangePublishQuality changePublishQuality = change_publish_quality != null ? (ChangePublishQuality) ChangePublishQuality.ADAPTER.redact(change_publish_quality) : null;
                ParticipantJoined participant_joined = value.getParticipant_joined();
                ParticipantJoined participantJoined = participant_joined != null ? (ParticipantJoined) ParticipantJoined.ADAPTER.redact(participant_joined) : null;
                ParticipantLeft participant_left = value.getParticipant_left();
                ParticipantLeft participantLeft = participant_left != null ? (ParticipantLeft) ParticipantLeft.ADAPTER.redact(participant_left) : null;
                DominantSpeakerChanged dominant_speaker_changed = value.getDominant_speaker_changed();
                DominantSpeakerChanged dominantSpeakerChanged = dominant_speaker_changed != null ? (DominantSpeakerChanged) DominantSpeakerChanged.ADAPTER.redact(dominant_speaker_changed) : null;
                JoinResponse join_response = value.getJoin_response();
                JoinResponse joinResponse = join_response != null ? (JoinResponse) JoinResponse.ADAPTER.redact(join_response) : null;
                HealthCheckResponse health_check_response = value.getHealth_check_response();
                HealthCheckResponse healthCheckResponse = health_check_response != null ? (HealthCheckResponse) HealthCheckResponse.ADAPTER.redact(health_check_response) : null;
                TrackPublished track_published = value.getTrack_published();
                TrackPublished trackPublished = track_published != null ? (TrackPublished) TrackPublished.ADAPTER.redact(track_published) : null;
                TrackUnpublished track_unpublished = value.getTrack_unpublished();
                TrackUnpublished trackUnpublished = track_unpublished != null ? (TrackUnpublished) TrackUnpublished.ADAPTER.redact(track_unpublished) : null;
                Error error = value.getError();
                Error error2 = error != null ? (Error) Error.ADAPTER.redact(error) : null;
                CallGrantsUpdated call_grants_updated = value.getCall_grants_updated();
                SubscriberOffer subscriberOffer2 = subscriberOffer;
                CallGrantsUpdated callGrantsUpdated = call_grants_updated != null ? (CallGrantsUpdated) CallGrantsUpdated.ADAPTER.redact(call_grants_updated) : null;
                GoAway go_away = value.getGo_away();
                CallGrantsUpdated callGrantsUpdated2 = callGrantsUpdated;
                GoAway goAway = go_away != null ? (GoAway) GoAway.ADAPTER.redact(go_away) : null;
                ICERestart ice_restart = value.getIce_restart();
                GoAway goAway2 = goAway;
                ICERestart iCERestart = ice_restart != null ? (ICERestart) ICERestart.ADAPTER.redact(ice_restart) : null;
                PinsChanged pins_updated = value.getPins_updated();
                ICERestart iCERestart2 = iCERestart;
                PinsChanged pinsChanged = pins_updated != null ? (PinsChanged) PinsChanged.ADAPTER.redact(pins_updated) : null;
                CallEnded call_ended = value.getCall_ended();
                PinsChanged pinsChanged2 = pinsChanged;
                CallEnded callEnded = call_ended != null ? (CallEnded) CallEnded.ADAPTER.redact(call_ended) : null;
                ParticipantUpdated participant_updated = value.getParticipant_updated();
                CallEnded callEnded2 = callEnded;
                ParticipantUpdated participantUpdated2 = participant_updated != null ? (ParticipantUpdated) ParticipantUpdated.ADAPTER.redact(participant_updated) : null;
                ParticipantMigrationComplete participant_migration_complete = value.getParticipant_migration_complete();
                ParticipantUpdated participantUpdated3 = participantUpdated2;
                ParticipantMigrationComplete participantMigrationComplete = participant_migration_complete != null ? (ParticipantMigrationComplete) ParticipantMigrationComplete.ADAPTER.redact(participant_migration_complete) : null;
                ChangePublishOptions change_publish_options = value.getChange_publish_options();
                ParticipantMigrationComplete participantMigrationComplete2 = participantMigrationComplete;
                ChangePublishOptions changePublishOptions2 = change_publish_options != null ? (ChangePublishOptions) ChangePublishOptions.ADAPTER.redact(change_publish_options) : null;
                InboundStateNotification inbound_state_notification = value.getInbound_state_notification();
                if (inbound_state_notification != null) {
                    inboundStateNotification = (InboundStateNotification) InboundStateNotification.ADAPTER.redact(inbound_state_notification);
                    participantUpdated = participantUpdated3;
                    changePublishOptions = changePublishOptions2;
                } else {
                    changePublishOptions = changePublishOptions2;
                    participantUpdated = participantUpdated3;
                    inboundStateNotification = null;
                }
                return value.copy(subscriberOffer2, publisherAnswer, connectionQualityChanged, audioLevelChanged, iCETrickle, changePublishQuality, participantJoined, participantLeft, dominantSpeakerChanged, joinResponse, healthCheckResponse, trackPublished, trackUnpublished, error2, callGrantsUpdated2, goAway2, iCERestart2, pinsChanged2, callEnded2, participantUpdated, participantMigrationComplete2, changePublishOptions, inboundStateNotification, C26624l.f105881E);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, SfuEvent value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                SubscriberOffer.ADAPTER.encodeWithTag(writer, 1, value.getSubscriber_offer());
                PublisherAnswer.ADAPTER.encodeWithTag(writer, 2, value.getPublisher_answer());
                ConnectionQualityChanged.ADAPTER.encodeWithTag(writer, 3, value.getConnection_quality_changed());
                AudioLevelChanged.ADAPTER.encodeWithTag(writer, 4, value.getAudio_level_changed());
                stream.video.sfu.models.ICETrickle.ADAPTER.encodeWithTag(writer, 5, value.getIce_trickle());
                ChangePublishQuality.ADAPTER.encodeWithTag(writer, 6, value.getChange_publish_quality());
                ParticipantJoined.ADAPTER.encodeWithTag(writer, 10, value.getParticipant_joined());
                ParticipantLeft.ADAPTER.encodeWithTag(writer, 11, value.getParticipant_left());
                DominantSpeakerChanged.ADAPTER.encodeWithTag(writer, 12, value.getDominant_speaker_changed());
                JoinResponse.ADAPTER.encodeWithTag(writer, 13, value.getJoin_response());
                HealthCheckResponse.ADAPTER.encodeWithTag(writer, 14, value.getHealth_check_response());
                TrackPublished.ADAPTER.encodeWithTag(writer, 16, value.getTrack_published());
                TrackUnpublished.ADAPTER.encodeWithTag(writer, 17, value.getTrack_unpublished());
                Error.ADAPTER.encodeWithTag(writer, 18, value.getError());
                CallGrantsUpdated.ADAPTER.encodeWithTag(writer, 19, value.getCall_grants_updated());
                GoAway.ADAPTER.encodeWithTag(writer, 20, value.getGo_away());
                ICERestart.ADAPTER.encodeWithTag(writer, 21, value.getIce_restart());
                PinsChanged.ADAPTER.encodeWithTag(writer, 22, value.getPins_updated());
                CallEnded.ADAPTER.encodeWithTag(writer, 23, value.getCall_ended());
                ParticipantUpdated.ADAPTER.encodeWithTag(writer, 24, value.getParticipant_updated());
                ParticipantMigrationComplete.ADAPTER.encodeWithTag(writer, 25, value.getParticipant_migration_complete());
                ChangePublishOptions.ADAPTER.encodeWithTag(writer, 27, value.getChange_publish_options());
                InboundStateNotification.ADAPTER.encodeWithTag(writer, 28, value.getInbound_state_notification());
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, SfuEvent value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                InboundStateNotification.ADAPTER.encodeWithTag(writer, 28, value.getInbound_state_notification());
                ChangePublishOptions.ADAPTER.encodeWithTag(writer, 27, value.getChange_publish_options());
                ParticipantMigrationComplete.ADAPTER.encodeWithTag(writer, 25, value.getParticipant_migration_complete());
                ParticipantUpdated.ADAPTER.encodeWithTag(writer, 24, value.getParticipant_updated());
                CallEnded.ADAPTER.encodeWithTag(writer, 23, value.getCall_ended());
                PinsChanged.ADAPTER.encodeWithTag(writer, 22, value.getPins_updated());
                ICERestart.ADAPTER.encodeWithTag(writer, 21, value.getIce_restart());
                GoAway.ADAPTER.encodeWithTag(writer, 20, value.getGo_away());
                CallGrantsUpdated.ADAPTER.encodeWithTag(writer, 19, value.getCall_grants_updated());
                Error.ADAPTER.encodeWithTag(writer, 18, value.getError());
                TrackUnpublished.ADAPTER.encodeWithTag(writer, 17, value.getTrack_unpublished());
                TrackPublished.ADAPTER.encodeWithTag(writer, 16, value.getTrack_published());
                HealthCheckResponse.ADAPTER.encodeWithTag(writer, 14, value.getHealth_check_response());
                JoinResponse.ADAPTER.encodeWithTag(writer, 13, value.getJoin_response());
                DominantSpeakerChanged.ADAPTER.encodeWithTag(writer, 12, value.getDominant_speaker_changed());
                ParticipantLeft.ADAPTER.encodeWithTag(writer, 11, value.getParticipant_left());
                ParticipantJoined.ADAPTER.encodeWithTag(writer, 10, value.getParticipant_joined());
                ChangePublishQuality.ADAPTER.encodeWithTag(writer, 6, value.getChange_publish_quality());
                stream.video.sfu.models.ICETrickle.ADAPTER.encodeWithTag(writer, 5, value.getIce_trickle());
                AudioLevelChanged.ADAPTER.encodeWithTag(writer, 4, value.getAudio_level_changed());
                ConnectionQualityChanged.ADAPTER.encodeWithTag(writer, 3, value.getConnection_quality_changed());
                PublisherAnswer.ADAPTER.encodeWithTag(writer, 2, value.getPublisher_answer());
                SubscriberOffer.ADAPTER.encodeWithTag(writer, 1, value.getSubscriber_offer());
            }
        };
    }

    public SfuEvent() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215, null);
    }

    public final SfuEvent copy(SubscriberOffer subscriber_offer, PublisherAnswer publisher_answer, ConnectionQualityChanged connection_quality_changed, AudioLevelChanged audio_level_changed, stream.video.sfu.models.ICETrickle ice_trickle, ChangePublishQuality change_publish_quality, ParticipantJoined participant_joined, ParticipantLeft participant_left, DominantSpeakerChanged dominant_speaker_changed, JoinResponse join_response, HealthCheckResponse health_check_response, TrackPublished track_published, TrackUnpublished track_unpublished, Error error, CallGrantsUpdated call_grants_updated, GoAway go_away, ICERestart ice_restart, PinsChanged pins_updated, CallEnded call_ended, ParticipantUpdated participant_updated, ParticipantMigrationComplete participant_migration_complete, ChangePublishOptions change_publish_options, InboundStateNotification inbound_state_notification, C26624l unknownFields) {
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new SfuEvent(subscriber_offer, publisher_answer, connection_quality_changed, audio_level_changed, ice_trickle, change_publish_quality, participant_joined, participant_left, dominant_speaker_changed, join_response, health_check_response, track_published, track_unpublished, error, call_grants_updated, go_away, ice_restart, pins_updated, call_ended, participant_updated, participant_migration_complete, change_publish_options, inbound_state_notification, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SfuEvent)) {
            return false;
        }
        SfuEvent sfuEvent = (SfuEvent) other;
        return AbstractC22676k.m65745e(unknownFields(), sfuEvent.unknownFields()) && AbstractC22676k.m65745e(this.subscriber_offer, sfuEvent.subscriber_offer) && AbstractC22676k.m65745e(this.publisher_answer, sfuEvent.publisher_answer) && AbstractC22676k.m65745e(this.connection_quality_changed, sfuEvent.connection_quality_changed) && AbstractC22676k.m65745e(this.audio_level_changed, sfuEvent.audio_level_changed) && AbstractC22676k.m65745e(this.ice_trickle, sfuEvent.ice_trickle) && AbstractC22676k.m65745e(this.change_publish_quality, sfuEvent.change_publish_quality) && AbstractC22676k.m65745e(this.participant_joined, sfuEvent.participant_joined) && AbstractC22676k.m65745e(this.participant_left, sfuEvent.participant_left) && AbstractC22676k.m65745e(this.dominant_speaker_changed, sfuEvent.dominant_speaker_changed) && AbstractC22676k.m65745e(this.join_response, sfuEvent.join_response) && AbstractC22676k.m65745e(this.health_check_response, sfuEvent.health_check_response) && AbstractC22676k.m65745e(this.track_published, sfuEvent.track_published) && AbstractC22676k.m65745e(this.track_unpublished, sfuEvent.track_unpublished) && AbstractC22676k.m65745e(this.error, sfuEvent.error) && AbstractC22676k.m65745e(this.call_grants_updated, sfuEvent.call_grants_updated) && AbstractC22676k.m65745e(this.go_away, sfuEvent.go_away) && AbstractC22676k.m65745e(this.ice_restart, sfuEvent.ice_restart) && AbstractC22676k.m65745e(this.pins_updated, sfuEvent.pins_updated) && AbstractC22676k.m65745e(this.call_ended, sfuEvent.call_ended) && AbstractC22676k.m65745e(this.participant_updated, sfuEvent.participant_updated) && AbstractC22676k.m65745e(this.participant_migration_complete, sfuEvent.participant_migration_complete) && AbstractC22676k.m65745e(this.change_publish_options, sfuEvent.change_publish_options) && AbstractC22676k.m65745e(this.inbound_state_notification, sfuEvent.inbound_state_notification);
    }

    public final AudioLevelChanged getAudio_level_changed() {
        return this.audio_level_changed;
    }

    public final CallEnded getCall_ended() {
        return this.call_ended;
    }

    public final CallGrantsUpdated getCall_grants_updated() {
        return this.call_grants_updated;
    }

    public final ChangePublishOptions getChange_publish_options() {
        return this.change_publish_options;
    }

    public final ChangePublishQuality getChange_publish_quality() {
        return this.change_publish_quality;
    }

    public final ConnectionQualityChanged getConnection_quality_changed() {
        return this.connection_quality_changed;
    }

    public final DominantSpeakerChanged getDominant_speaker_changed() {
        return this.dominant_speaker_changed;
    }

    public final Error getError() {
        return this.error;
    }

    public final GoAway getGo_away() {
        return this.go_away;
    }

    public final HealthCheckResponse getHealth_check_response() {
        return this.health_check_response;
    }

    public final ICERestart getIce_restart() {
        return this.ice_restart;
    }

    public final stream.video.sfu.models.ICETrickle getIce_trickle() {
        return this.ice_trickle;
    }

    public final InboundStateNotification getInbound_state_notification() {
        return this.inbound_state_notification;
    }

    public final JoinResponse getJoin_response() {
        return this.join_response;
    }

    public final ParticipantJoined getParticipant_joined() {
        return this.participant_joined;
    }

    public final ParticipantLeft getParticipant_left() {
        return this.participant_left;
    }

    public final ParticipantMigrationComplete getParticipant_migration_complete() {
        return this.participant_migration_complete;
    }

    public final ParticipantUpdated getParticipant_updated() {
        return this.participant_updated;
    }

    public final PinsChanged getPins_updated() {
        return this.pins_updated;
    }

    public final PublisherAnswer getPublisher_answer() {
        return this.publisher_answer;
    }

    public final SubscriberOffer getSubscriber_offer() {
        return this.subscriber_offer;
    }

    public final TrackPublished getTrack_published() {
        return this.track_published;
    }

    public final TrackUnpublished getTrack_unpublished() {
        return this.track_unpublished;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        SubscriberOffer subscriberOffer = this.subscriber_offer;
        int iHashCode2 = (iHashCode + (subscriberOffer != null ? subscriberOffer.hashCode() : 0)) * 37;
        PublisherAnswer publisherAnswer = this.publisher_answer;
        int iHashCode3 = (iHashCode2 + (publisherAnswer != null ? publisherAnswer.hashCode() : 0)) * 37;
        ConnectionQualityChanged connectionQualityChanged = this.connection_quality_changed;
        int iHashCode4 = (iHashCode3 + (connectionQualityChanged != null ? connectionQualityChanged.hashCode() : 0)) * 37;
        AudioLevelChanged audioLevelChanged = this.audio_level_changed;
        int iHashCode5 = (iHashCode4 + (audioLevelChanged != null ? audioLevelChanged.hashCode() : 0)) * 37;
        stream.video.sfu.models.ICETrickle iCETrickle = this.ice_trickle;
        int iHashCode6 = (iHashCode5 + (iCETrickle != null ? iCETrickle.hashCode() : 0)) * 37;
        ChangePublishQuality changePublishQuality = this.change_publish_quality;
        int iHashCode7 = (iHashCode6 + (changePublishQuality != null ? changePublishQuality.hashCode() : 0)) * 37;
        ParticipantJoined participantJoined = this.participant_joined;
        int iHashCode8 = (iHashCode7 + (participantJoined != null ? participantJoined.hashCode() : 0)) * 37;
        ParticipantLeft participantLeft = this.participant_left;
        int iHashCode9 = (iHashCode8 + (participantLeft != null ? participantLeft.hashCode() : 0)) * 37;
        DominantSpeakerChanged dominantSpeakerChanged = this.dominant_speaker_changed;
        int iHashCode10 = (iHashCode9 + (dominantSpeakerChanged != null ? dominantSpeakerChanged.hashCode() : 0)) * 37;
        JoinResponse joinResponse = this.join_response;
        int iHashCode11 = (iHashCode10 + (joinResponse != null ? joinResponse.hashCode() : 0)) * 37;
        HealthCheckResponse healthCheckResponse = this.health_check_response;
        int iHashCode12 = (iHashCode11 + (healthCheckResponse != null ? healthCheckResponse.hashCode() : 0)) * 37;
        TrackPublished trackPublished = this.track_published;
        int iHashCode13 = (iHashCode12 + (trackPublished != null ? trackPublished.hashCode() : 0)) * 37;
        TrackUnpublished trackUnpublished = this.track_unpublished;
        int iHashCode14 = (iHashCode13 + (trackUnpublished != null ? trackUnpublished.hashCode() : 0)) * 37;
        Error error = this.error;
        int iHashCode15 = (iHashCode14 + (error != null ? error.hashCode() : 0)) * 37;
        CallGrantsUpdated callGrantsUpdated = this.call_grants_updated;
        int iHashCode16 = (iHashCode15 + (callGrantsUpdated != null ? callGrantsUpdated.hashCode() : 0)) * 37;
        GoAway goAway = this.go_away;
        int iHashCode17 = (iHashCode16 + (goAway != null ? goAway.hashCode() : 0)) * 37;
        ICERestart iCERestart = this.ice_restart;
        int iHashCode18 = (iHashCode17 + (iCERestart != null ? iCERestart.hashCode() : 0)) * 37;
        PinsChanged pinsChanged = this.pins_updated;
        int iHashCode19 = (iHashCode18 + (pinsChanged != null ? pinsChanged.hashCode() : 0)) * 37;
        CallEnded callEnded = this.call_ended;
        int iHashCode20 = (iHashCode19 + (callEnded != null ? callEnded.hashCode() : 0)) * 37;
        ParticipantUpdated participantUpdated = this.participant_updated;
        int iHashCode21 = (iHashCode20 + (participantUpdated != null ? participantUpdated.hashCode() : 0)) * 37;
        ParticipantMigrationComplete participantMigrationComplete = this.participant_migration_complete;
        int iHashCode22 = (iHashCode21 + (participantMigrationComplete != null ? participantMigrationComplete.hashCode() : 0)) * 37;
        ChangePublishOptions changePublishOptions = this.change_publish_options;
        int iHashCode23 = (iHashCode22 + (changePublishOptions != null ? changePublishOptions.hashCode() : 0)) * 37;
        InboundStateNotification inboundStateNotification = this.inbound_state_notification;
        int iHashCode24 = iHashCode23 + (inboundStateNotification != null ? inboundStateNotification.hashCode() : 0);
        this.hashCode = iHashCode24;
        return iHashCode24;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134511newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        SubscriberOffer subscriberOffer = this.subscriber_offer;
        if (subscriberOffer != null) {
            arrayList.add("subscriber_offer=" + subscriberOffer);
        }
        PublisherAnswer publisherAnswer = this.publisher_answer;
        if (publisherAnswer != null) {
            arrayList.add("publisher_answer=" + publisherAnswer);
        }
        ConnectionQualityChanged connectionQualityChanged = this.connection_quality_changed;
        if (connectionQualityChanged != null) {
            arrayList.add("connection_quality_changed=" + connectionQualityChanged);
        }
        AudioLevelChanged audioLevelChanged = this.audio_level_changed;
        if (audioLevelChanged != null) {
            arrayList.add("audio_level_changed=" + audioLevelChanged);
        }
        stream.video.sfu.models.ICETrickle iCETrickle = this.ice_trickle;
        if (iCETrickle != null) {
            arrayList.add("ice_trickle=" + iCETrickle);
        }
        ChangePublishQuality changePublishQuality = this.change_publish_quality;
        if (changePublishQuality != null) {
            arrayList.add("change_publish_quality=" + changePublishQuality);
        }
        ParticipantJoined participantJoined = this.participant_joined;
        if (participantJoined != null) {
            arrayList.add("participant_joined=" + participantJoined);
        }
        ParticipantLeft participantLeft = this.participant_left;
        if (participantLeft != null) {
            arrayList.add("participant_left=" + participantLeft);
        }
        DominantSpeakerChanged dominantSpeakerChanged = this.dominant_speaker_changed;
        if (dominantSpeakerChanged != null) {
            arrayList.add("dominant_speaker_changed=" + dominantSpeakerChanged);
        }
        JoinResponse joinResponse = this.join_response;
        if (joinResponse != null) {
            arrayList.add("join_response=" + joinResponse);
        }
        HealthCheckResponse healthCheckResponse = this.health_check_response;
        if (healthCheckResponse != null) {
            arrayList.add("health_check_response=" + healthCheckResponse);
        }
        TrackPublished trackPublished = this.track_published;
        if (trackPublished != null) {
            arrayList.add("track_published=" + trackPublished);
        }
        TrackUnpublished trackUnpublished = this.track_unpublished;
        if (trackUnpublished != null) {
            arrayList.add("track_unpublished=" + trackUnpublished);
        }
        Error error = this.error;
        if (error != null) {
            arrayList.add("error=" + error);
        }
        CallGrantsUpdated callGrantsUpdated = this.call_grants_updated;
        if (callGrantsUpdated != null) {
            arrayList.add("call_grants_updated=" + callGrantsUpdated);
        }
        GoAway goAway = this.go_away;
        if (goAway != null) {
            arrayList.add("go_away=" + goAway);
        }
        ICERestart iCERestart = this.ice_restart;
        if (iCERestart != null) {
            arrayList.add("ice_restart=" + iCERestart);
        }
        PinsChanged pinsChanged = this.pins_updated;
        if (pinsChanged != null) {
            arrayList.add("pins_updated=" + pinsChanged);
        }
        CallEnded callEnded = this.call_ended;
        if (callEnded != null) {
            arrayList.add("call_ended=" + callEnded);
        }
        ParticipantUpdated participantUpdated = this.participant_updated;
        if (participantUpdated != null) {
            arrayList.add("participant_updated=" + participantUpdated);
        }
        ParticipantMigrationComplete participantMigrationComplete = this.participant_migration_complete;
        if (participantMigrationComplete != null) {
            arrayList.add("participant_migration_complete=" + participantMigrationComplete);
        }
        ChangePublishOptions changePublishOptions = this.change_publish_options;
        if (changePublishOptions != null) {
            arrayList.add("change_publish_options=" + changePublishOptions);
        }
        InboundStateNotification inboundStateNotification = this.inbound_state_notification;
        if (inboundStateNotification != null) {
            arrayList.add("inbound_state_notification=" + inboundStateNotification);
        }
        return AbstractC25265s.m74110N0(arrayList, ", ", "SfuEvent{", "}", null, 56);
    }

    public /* synthetic */ SfuEvent(SubscriberOffer subscriberOffer, PublisherAnswer publisherAnswer, ConnectionQualityChanged connectionQualityChanged, AudioLevelChanged audioLevelChanged, stream.video.sfu.models.ICETrickle iCETrickle, ChangePublishQuality changePublishQuality, ParticipantJoined participantJoined, ParticipantLeft participantLeft, DominantSpeakerChanged dominantSpeakerChanged, JoinResponse joinResponse, HealthCheckResponse healthCheckResponse, TrackPublished trackPublished, TrackUnpublished trackUnpublished, Error error, CallGrantsUpdated callGrantsUpdated, GoAway goAway, ICERestart iCERestart, PinsChanged pinsChanged, CallEnded callEnded, ParticipantUpdated participantUpdated, ParticipantMigrationComplete participantMigrationComplete, ChangePublishOptions changePublishOptions, InboundStateNotification inboundStateNotification, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : subscriberOffer, (i13 & 2) != 0 ? null : publisherAnswer, (i13 & 4) != 0 ? null : connectionQualityChanged, (i13 & 8) != 0 ? null : audioLevelChanged, (i13 & 16) != 0 ? null : iCETrickle, (i13 & 32) != 0 ? null : changePublishQuality, (i13 & 64) != 0 ? null : participantJoined, (i13 & 128) != 0 ? null : participantLeft, (i13 & 256) != 0 ? null : dominantSpeakerChanged, (i13 & 512) != 0 ? null : joinResponse, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : healthCheckResponse, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : trackPublished, (i13 & 4096) != 0 ? null : trackUnpublished, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : error, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : callGrantsUpdated, (i13 & 32768) != 0 ? null : goAway, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? null : iCERestart, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? null : pinsChanged, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? null : callEnded, (i13 & 524288) != 0 ? null : participantUpdated, (i13 & 1048576) != 0 ? null : participantMigrationComplete, (i13 & 2097152) != 0 ? null : changePublishOptions, (i13 & 4194304) != 0 ? null : inboundStateNotification, (i13 & 8388608) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134511newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SfuEvent(SubscriberOffer subscriberOffer, PublisherAnswer publisherAnswer, ConnectionQualityChanged connectionQualityChanged, AudioLevelChanged audioLevelChanged, stream.video.sfu.models.ICETrickle iCETrickle, ChangePublishQuality changePublishQuality, ParticipantJoined participantJoined, ParticipantLeft participantLeft, DominantSpeakerChanged dominantSpeakerChanged, JoinResponse joinResponse, HealthCheckResponse healthCheckResponse, TrackPublished trackPublished, TrackUnpublished trackUnpublished, Error error, CallGrantsUpdated callGrantsUpdated, GoAway goAway, ICERestart iCERestart, PinsChanged pinsChanged, CallEnded callEnded, ParticipantUpdated participantUpdated, ParticipantMigrationComplete participantMigrationComplete, ChangePublishOptions changePublishOptions, InboundStateNotification inboundStateNotification, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.subscriber_offer = subscriberOffer;
        this.publisher_answer = publisherAnswer;
        this.connection_quality_changed = connectionQualityChanged;
        this.audio_level_changed = audioLevelChanged;
        this.ice_trickle = iCETrickle;
        this.change_publish_quality = changePublishQuality;
        this.participant_joined = participantJoined;
        this.participant_left = participantLeft;
        this.dominant_speaker_changed = dominantSpeakerChanged;
        this.join_response = joinResponse;
        this.health_check_response = healthCheckResponse;
        this.track_published = trackPublished;
        this.track_unpublished = trackUnpublished;
        this.error = error;
        this.call_grants_updated = callGrantsUpdated;
        this.go_away = goAway;
        this.ice_restart = iCERestart;
        this.pins_updated = pinsChanged;
        this.call_ended = callEnded;
        this.participant_updated = participantUpdated;
        this.participant_migration_complete = participantMigrationComplete;
        this.change_publish_options = changePublishOptions;
        this.inbound_state_notification = inboundStateNotification;
        Object[] objArr = {iCETrickle, changePublishQuality, participantJoined, participantLeft, dominantSpeakerChanged, joinResponse, healthCheckResponse, trackPublished, trackUnpublished, error, callGrantsUpdated, goAway, iCERestart, pinsChanged, callEnded, participantUpdated, participantMigrationComplete, changePublishOptions, inboundStateNotification};
        int i13 = subscriberOffer != null ? 1 : 0;
        i13 = publisherAnswer != null ? i13 + 1 : i13;
        i13 = connectionQualityChanged != null ? i13 + 1 : i13;
        i13 = audioLevelChanged != null ? i13 + 1 : i13;
        for (int i14 = 0; i14 < 19; i14++) {
            if (objArr[i14] != null) {
                i13++;
            }
        }
        if (i13 > 1) {
            throw new IllegalArgumentException("At most one of subscriber_offer, publisher_answer, connection_quality_changed, audio_level_changed, ice_trickle, change_publish_quality, participant_joined, participant_left, dominant_speaker_changed, join_response, health_check_response, track_published, track_unpublished, error, call_grants_updated, go_away, ice_restart, pins_updated, call_ended, participant_updated, participant_migration_complete, change_publish_options, inbound_state_notification may be non-null");
        }
    }
}
