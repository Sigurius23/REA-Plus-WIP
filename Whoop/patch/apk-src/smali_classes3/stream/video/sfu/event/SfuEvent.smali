.class public final Lstream/video/sfu/event/SfuEvent;
.super Lcom/squareup/wire/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lstream/video/sfu/event/SfuEvent$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00bc\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008K\u0018\u0000 \u0089\u00012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0089\u0001B\u00a5\u0002\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\u0008\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\u0008\u0002\u0010(\u001a\u0004\u0018\u00010\'\u0012\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010/\u0012\u0008\u0008\u0002\u00102\u001a\u000201\u00a2\u0006\u0004\u00083\u00104J\u000f\u00105\u001a\u00020\u0002H\u0017\u00a2\u0006\u0004\u00085\u00106J\u001a\u0010:\u001a\u0002092\u0008\u00108\u001a\u0004\u0018\u000107H\u0096\u0002\u00a2\u0006\u0004\u0008:\u0010;J\u000f\u0010=\u001a\u00020<H\u0016\u00a2\u0006\u0004\u0008=\u0010>J\u000f\u0010@\u001a\u00020?H\u0016\u00a2\u0006\u0004\u0008@\u0010AJ\u00ab\u0002\u0010B\u001a\u00020\u00002\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\u0008\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\u0008\u0002\u0010(\u001a\u0004\u0018\u00010\'2\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010/2\u0008\u0008\u0002\u00102\u001a\u000201\u00a2\u0006\u0004\u0008B\u0010CR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010D\u001a\u0004\u0008E\u0010FR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010G\u001a\u0004\u0008H\u0010IR\u001c\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010J\u001a\u0004\u0008K\u0010LR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010M\u001a\u0004\u0008N\u0010OR\u001c\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010P\u001a\u0004\u0008Q\u0010RR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010S\u001a\u0004\u0008T\u0010UR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010V\u001a\u0004\u0008W\u0010XR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010Y\u001a\u0004\u0008Z\u0010[R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\\\u001a\u0004\u0008]\u0010^R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010_\u001a\u0004\u0008`\u0010aR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010b\u001a\u0004\u0008c\u0010dR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010e\u001a\u0004\u0008f\u0010gR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010h\u001a\u0004\u0008i\u0010jR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010k\u001a\u0004\u0008l\u0010mR\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008 \u0010n\u001a\u0004\u0008o\u0010pR\u001c\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\"\u0010q\u001a\u0004\u0008r\u0010sR\u001c\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008$\u0010t\u001a\u0004\u0008u\u0010vR\u001c\u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008&\u0010w\u001a\u0004\u0008x\u0010yR\u001c\u0010(\u001a\u0004\u0018\u00010\'8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008(\u0010z\u001a\u0004\u0008{\u0010|R\u001c\u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008*\u0010}\u001a\u0004\u0008~\u0010\u007fR\u001f\u0010,\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008,\u0010\u0080\u0001\u001a\u0006\u0008\u0081\u0001\u0010\u0082\u0001R\u001f\u0010.\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008.\u0010\u0083\u0001\u001a\u0006\u0008\u0084\u0001\u0010\u0085\u0001R\u001f\u00100\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u00080\u0010\u0086\u0001\u001a\u0006\u0008\u0087\u0001\u0010\u0088\u0001\u00a8\u0006\u008a\u0001"
    }
    d2 = {
        "Lstream/video/sfu/event/SfuEvent;",
        "Lcom/squareup/wire/l;",
        "",
        "Lstream/video/sfu/event/SubscriberOffer;",
        "subscriber_offer",
        "Lstream/video/sfu/event/PublisherAnswer;",
        "publisher_answer",
        "Lstream/video/sfu/event/ConnectionQualityChanged;",
        "connection_quality_changed",
        "Lstream/video/sfu/event/AudioLevelChanged;",
        "audio_level_changed",
        "Lstream/video/sfu/models/ICETrickle;",
        "ice_trickle",
        "Lstream/video/sfu/event/ChangePublishQuality;",
        "change_publish_quality",
        "Lstream/video/sfu/event/ParticipantJoined;",
        "participant_joined",
        "Lstream/video/sfu/event/ParticipantLeft;",
        "participant_left",
        "Lstream/video/sfu/event/DominantSpeakerChanged;",
        "dominant_speaker_changed",
        "Lstream/video/sfu/event/JoinResponse;",
        "join_response",
        "Lstream/video/sfu/event/HealthCheckResponse;",
        "health_check_response",
        "Lstream/video/sfu/event/TrackPublished;",
        "track_published",
        "Lstream/video/sfu/event/TrackUnpublished;",
        "track_unpublished",
        "Lstream/video/sfu/event/Error;",
        "error",
        "Lstream/video/sfu/event/CallGrantsUpdated;",
        "call_grants_updated",
        "Lstream/video/sfu/event/GoAway;",
        "go_away",
        "Lstream/video/sfu/event/ICERestart;",
        "ice_restart",
        "Lstream/video/sfu/event/PinsChanged;",
        "pins_updated",
        "Lstream/video/sfu/event/CallEnded;",
        "call_ended",
        "Lstream/video/sfu/event/ParticipantUpdated;",
        "participant_updated",
        "Lstream/video/sfu/event/ParticipantMigrationComplete;",
        "participant_migration_complete",
        "Lstream/video/sfu/event/ChangePublishOptions;",
        "change_publish_options",
        "Lstream/video/sfu/event/InboundStateNotification;",
        "inbound_state_notification",
        "Lne3/l;",
        "unknownFields",
        "<init>",
        "(Lstream/video/sfu/event/SubscriberOffer;Lstream/video/sfu/event/PublisherAnswer;Lstream/video/sfu/event/ConnectionQualityChanged;Lstream/video/sfu/event/AudioLevelChanged;Lstream/video/sfu/models/ICETrickle;Lstream/video/sfu/event/ChangePublishQuality;Lstream/video/sfu/event/ParticipantJoined;Lstream/video/sfu/event/ParticipantLeft;Lstream/video/sfu/event/DominantSpeakerChanged;Lstream/video/sfu/event/JoinResponse;Lstream/video/sfu/event/HealthCheckResponse;Lstream/video/sfu/event/TrackPublished;Lstream/video/sfu/event/TrackUnpublished;Lstream/video/sfu/event/Error;Lstream/video/sfu/event/CallGrantsUpdated;Lstream/video/sfu/event/GoAway;Lstream/video/sfu/event/ICERestart;Lstream/video/sfu/event/PinsChanged;Lstream/video/sfu/event/CallEnded;Lstream/video/sfu/event/ParticipantUpdated;Lstream/video/sfu/event/ParticipantMigrationComplete;Lstream/video/sfu/event/ChangePublishOptions;Lstream/video/sfu/event/InboundStateNotification;Lne3/l;)V",
        "newBuilder",
        "()Ljava/lang/Void;",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "",
        "hashCode",
        "()I",
        "",
        "toString",
        "()Ljava/lang/String;",
        "copy",
        "(Lstream/video/sfu/event/SubscriberOffer;Lstream/video/sfu/event/PublisherAnswer;Lstream/video/sfu/event/ConnectionQualityChanged;Lstream/video/sfu/event/AudioLevelChanged;Lstream/video/sfu/models/ICETrickle;Lstream/video/sfu/event/ChangePublishQuality;Lstream/video/sfu/event/ParticipantJoined;Lstream/video/sfu/event/ParticipantLeft;Lstream/video/sfu/event/DominantSpeakerChanged;Lstream/video/sfu/event/JoinResponse;Lstream/video/sfu/event/HealthCheckResponse;Lstream/video/sfu/event/TrackPublished;Lstream/video/sfu/event/TrackUnpublished;Lstream/video/sfu/event/Error;Lstream/video/sfu/event/CallGrantsUpdated;Lstream/video/sfu/event/GoAway;Lstream/video/sfu/event/ICERestart;Lstream/video/sfu/event/PinsChanged;Lstream/video/sfu/event/CallEnded;Lstream/video/sfu/event/ParticipantUpdated;Lstream/video/sfu/event/ParticipantMigrationComplete;Lstream/video/sfu/event/ChangePublishOptions;Lstream/video/sfu/event/InboundStateNotification;Lne3/l;)Lstream/video/sfu/event/SfuEvent;",
        "Lstream/video/sfu/event/SubscriberOffer;",
        "getSubscriber_offer",
        "()Lstream/video/sfu/event/SubscriberOffer;",
        "Lstream/video/sfu/event/PublisherAnswer;",
        "getPublisher_answer",
        "()Lstream/video/sfu/event/PublisherAnswer;",
        "Lstream/video/sfu/event/ConnectionQualityChanged;",
        "getConnection_quality_changed",
        "()Lstream/video/sfu/event/ConnectionQualityChanged;",
        "Lstream/video/sfu/event/AudioLevelChanged;",
        "getAudio_level_changed",
        "()Lstream/video/sfu/event/AudioLevelChanged;",
        "Lstream/video/sfu/models/ICETrickle;",
        "getIce_trickle",
        "()Lstream/video/sfu/models/ICETrickle;",
        "Lstream/video/sfu/event/ChangePublishQuality;",
        "getChange_publish_quality",
        "()Lstream/video/sfu/event/ChangePublishQuality;",
        "Lstream/video/sfu/event/ParticipantJoined;",
        "getParticipant_joined",
        "()Lstream/video/sfu/event/ParticipantJoined;",
        "Lstream/video/sfu/event/ParticipantLeft;",
        "getParticipant_left",
        "()Lstream/video/sfu/event/ParticipantLeft;",
        "Lstream/video/sfu/event/DominantSpeakerChanged;",
        "getDominant_speaker_changed",
        "()Lstream/video/sfu/event/DominantSpeakerChanged;",
        "Lstream/video/sfu/event/JoinResponse;",
        "getJoin_response",
        "()Lstream/video/sfu/event/JoinResponse;",
        "Lstream/video/sfu/event/HealthCheckResponse;",
        "getHealth_check_response",
        "()Lstream/video/sfu/event/HealthCheckResponse;",
        "Lstream/video/sfu/event/TrackPublished;",
        "getTrack_published",
        "()Lstream/video/sfu/event/TrackPublished;",
        "Lstream/video/sfu/event/TrackUnpublished;",
        "getTrack_unpublished",
        "()Lstream/video/sfu/event/TrackUnpublished;",
        "Lstream/video/sfu/event/Error;",
        "getError",
        "()Lstream/video/sfu/event/Error;",
        "Lstream/video/sfu/event/CallGrantsUpdated;",
        "getCall_grants_updated",
        "()Lstream/video/sfu/event/CallGrantsUpdated;",
        "Lstream/video/sfu/event/GoAway;",
        "getGo_away",
        "()Lstream/video/sfu/event/GoAway;",
        "Lstream/video/sfu/event/ICERestart;",
        "getIce_restart",
        "()Lstream/video/sfu/event/ICERestart;",
        "Lstream/video/sfu/event/PinsChanged;",
        "getPins_updated",
        "()Lstream/video/sfu/event/PinsChanged;",
        "Lstream/video/sfu/event/CallEnded;",
        "getCall_ended",
        "()Lstream/video/sfu/event/CallEnded;",
        "Lstream/video/sfu/event/ParticipantUpdated;",
        "getParticipant_updated",
        "()Lstream/video/sfu/event/ParticipantUpdated;",
        "Lstream/video/sfu/event/ParticipantMigrationComplete;",
        "getParticipant_migration_complete",
        "()Lstream/video/sfu/event/ParticipantMigrationComplete;",
        "Lstream/video/sfu/event/ChangePublishOptions;",
        "getChange_publish_options",
        "()Lstream/video/sfu/event/ChangePublishOptions;",
        "Lstream/video/sfu/event/InboundStateNotification;",
        "getInbound_state_notification",
        "()Lstream/video/sfu/event/InboundStateNotification;",
        "Companion",
        "stream-video-android-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final ADAPTER:Lcom/squareup/wire/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/wire/q;"
        }
    .end annotation
.end field

.field public static final Companion:Lstream/video/sfu/event/SfuEvent$Companion;

.field private static final serialVersionUID:J


# instance fields
.field private final audio_level_changed:Lstream/video/sfu/event/AudioLevelChanged;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.event.AudioLevelChanged#ADAPTER"
        jsonName = "audioLevelChanged"
        oneofName = "event_payload"
        tag = 0x4
    .end annotation
.end field

.field private final call_ended:Lstream/video/sfu/event/CallEnded;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.event.CallEnded#ADAPTER"
        jsonName = "callEnded"
        oneofName = "event_payload"
        tag = 0x17
    .end annotation
.end field

.field private final call_grants_updated:Lstream/video/sfu/event/CallGrantsUpdated;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.event.CallGrantsUpdated#ADAPTER"
        jsonName = "callGrantsUpdated"
        oneofName = "event_payload"
        tag = 0x13
    .end annotation
.end field

.field private final change_publish_options:Lstream/video/sfu/event/ChangePublishOptions;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.event.ChangePublishOptions#ADAPTER"
        jsonName = "changePublishOptions"
        oneofName = "event_payload"
        tag = 0x1b
    .end annotation
.end field

.field private final change_publish_quality:Lstream/video/sfu/event/ChangePublishQuality;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.event.ChangePublishQuality#ADAPTER"
        jsonName = "changePublishQuality"
        oneofName = "event_payload"
        tag = 0x6
    .end annotation
.end field

.field private final connection_quality_changed:Lstream/video/sfu/event/ConnectionQualityChanged;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.event.ConnectionQualityChanged#ADAPTER"
        jsonName = "connectionQualityChanged"
        oneofName = "event_payload"
        tag = 0x3
    .end annotation
.end field

.field private final dominant_speaker_changed:Lstream/video/sfu/event/DominantSpeakerChanged;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.event.DominantSpeakerChanged#ADAPTER"
        jsonName = "dominantSpeakerChanged"
        oneofName = "event_payload"
        tag = 0xc
    .end annotation
.end field

.field private final error:Lstream/video/sfu/event/Error;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.event.Error#ADAPTER"
        oneofName = "event_payload"
        tag = 0x12
    .end annotation
.end field

.field private final go_away:Lstream/video/sfu/event/GoAway;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.event.GoAway#ADAPTER"
        jsonName = "goAway"
        oneofName = "event_payload"
        tag = 0x14
    .end annotation
.end field

.field private final health_check_response:Lstream/video/sfu/event/HealthCheckResponse;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.event.HealthCheckResponse#ADAPTER"
        jsonName = "healthCheckResponse"
        oneofName = "event_payload"
        tag = 0xe
    .end annotation
.end field

.field private final ice_restart:Lstream/video/sfu/event/ICERestart;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.event.ICERestart#ADAPTER"
        jsonName = "iceRestart"
        oneofName = "event_payload"
        tag = 0x15
    .end annotation
.end field

.field private final ice_trickle:Lstream/video/sfu/models/ICETrickle;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.models.ICETrickle#ADAPTER"
        jsonName = "iceTrickle"
        oneofName = "event_payload"
        tag = 0x5
    .end annotation
.end field

.field private final inbound_state_notification:Lstream/video/sfu/event/InboundStateNotification;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.event.InboundStateNotification#ADAPTER"
        jsonName = "inboundStateNotification"
        oneofName = "event_payload"
        tag = 0x1c
    .end annotation
.end field

.field private final join_response:Lstream/video/sfu/event/JoinResponse;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.event.JoinResponse#ADAPTER"
        jsonName = "joinResponse"
        oneofName = "event_payload"
        tag = 0xd
    .end annotation
.end field

.field private final participant_joined:Lstream/video/sfu/event/ParticipantJoined;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.event.ParticipantJoined#ADAPTER"
        jsonName = "participantJoined"
        oneofName = "event_payload"
        tag = 0xa
    .end annotation
.end field

.field private final participant_left:Lstream/video/sfu/event/ParticipantLeft;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.event.ParticipantLeft#ADAPTER"
        jsonName = "participantLeft"
        oneofName = "event_payload"
        tag = 0xb
    .end annotation
.end field

.field private final participant_migration_complete:Lstream/video/sfu/event/ParticipantMigrationComplete;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.event.ParticipantMigrationComplete#ADAPTER"
        jsonName = "participantMigrationComplete"
        oneofName = "event_payload"
        tag = 0x19
    .end annotation
.end field

.field private final participant_updated:Lstream/video/sfu/event/ParticipantUpdated;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.event.ParticipantUpdated#ADAPTER"
        jsonName = "participantUpdated"
        oneofName = "event_payload"
        tag = 0x18
    .end annotation
.end field

.field private final pins_updated:Lstream/video/sfu/event/PinsChanged;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.event.PinsChanged#ADAPTER"
        jsonName = "pinsUpdated"
        oneofName = "event_payload"
        tag = 0x16
    .end annotation
.end field

.field private final publisher_answer:Lstream/video/sfu/event/PublisherAnswer;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.event.PublisherAnswer#ADAPTER"
        jsonName = "publisherAnswer"
        oneofName = "event_payload"
        tag = 0x2
    .end annotation
.end field

.field private final subscriber_offer:Lstream/video/sfu/event/SubscriberOffer;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.event.SubscriberOffer#ADAPTER"
        jsonName = "subscriberOffer"
        oneofName = "event_payload"
        tag = 0x1
    .end annotation
.end field

.field private final track_published:Lstream/video/sfu/event/TrackPublished;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.event.TrackPublished#ADAPTER"
        jsonName = "trackPublished"
        oneofName = "event_payload"
        tag = 0x10
    .end annotation
.end field

.field private final track_unpublished:Lstream/video/sfu/event/TrackUnpublished;
    .annotation runtime Lcom/squareup/wire/a0;
        adapter = "stream.video.sfu.event.TrackUnpublished#ADAPTER"
        jsonName = "trackUnpublished"
        oneofName = "event_payload"
        tag = 0x11
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lstream/video/sfu/event/SfuEvent$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lstream/video/sfu/event/SfuEvent$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lstream/video/sfu/event/SfuEvent;->Companion:Lstream/video/sfu/event/SfuEvent$Companion;

    const-class v0, Lstream/video/sfu/event/SfuEvent;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lstream/video/sfu/event/SfuEvent$Companion$ADAPTER$1;

    sget-object v2, Lcom/squareup/wire/d;->z:Lcom/squareup/wire/d;

    sget-object v3, Lcom/squareup/wire/x;->y:Lcom/squareup/wire/x;

    invoke-direct {v1, v2, v0, v3}, Lstream/video/sfu/event/SfuEvent$Companion$ADAPTER$1;-><init>(Lcom/squareup/wire/d;Lj93/d;Lcom/squareup/wire/x;)V

    sput-object v1, Lstream/video/sfu/event/SfuEvent;->ADAPTER:Lcom/squareup/wire/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 27

    .line 1
    const v25, 0xffffff

    const/16 v26, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v26}, Lstream/video/sfu/event/SfuEvent;-><init>(Lstream/video/sfu/event/SubscriberOffer;Lstream/video/sfu/event/PublisherAnswer;Lstream/video/sfu/event/ConnectionQualityChanged;Lstream/video/sfu/event/AudioLevelChanged;Lstream/video/sfu/models/ICETrickle;Lstream/video/sfu/event/ChangePublishQuality;Lstream/video/sfu/event/ParticipantJoined;Lstream/video/sfu/event/ParticipantLeft;Lstream/video/sfu/event/DominantSpeakerChanged;Lstream/video/sfu/event/JoinResponse;Lstream/video/sfu/event/HealthCheckResponse;Lstream/video/sfu/event/TrackPublished;Lstream/video/sfu/event/TrackUnpublished;Lstream/video/sfu/event/Error;Lstream/video/sfu/event/CallGrantsUpdated;Lstream/video/sfu/event/GoAway;Lstream/video/sfu/event/ICERestart;Lstream/video/sfu/event/PinsChanged;Lstream/video/sfu/event/CallEnded;Lstream/video/sfu/event/ParticipantUpdated;Lstream/video/sfu/event/ParticipantMigrationComplete;Lstream/video/sfu/event/ChangePublishOptions;Lstream/video/sfu/event/InboundStateNotification;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lstream/video/sfu/event/SubscriberOffer;Lstream/video/sfu/event/PublisherAnswer;Lstream/video/sfu/event/ConnectionQualityChanged;Lstream/video/sfu/event/AudioLevelChanged;Lstream/video/sfu/models/ICETrickle;Lstream/video/sfu/event/ChangePublishQuality;Lstream/video/sfu/event/ParticipantJoined;Lstream/video/sfu/event/ParticipantLeft;Lstream/video/sfu/event/DominantSpeakerChanged;Lstream/video/sfu/event/JoinResponse;Lstream/video/sfu/event/HealthCheckResponse;Lstream/video/sfu/event/TrackPublished;Lstream/video/sfu/event/TrackUnpublished;Lstream/video/sfu/event/Error;Lstream/video/sfu/event/CallGrantsUpdated;Lstream/video/sfu/event/GoAway;Lstream/video/sfu/event/ICERestart;Lstream/video/sfu/event/PinsChanged;Lstream/video/sfu/event/CallEnded;Lstream/video/sfu/event/ParticipantUpdated;Lstream/video/sfu/event/ParticipantMigrationComplete;Lstream/video/sfu/event/ChangePublishOptions;Lstream/video/sfu/event/InboundStateNotification;Lne3/l;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p24

    const-string v6, "unknownFields"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    sget-object v6, Lstream/video/sfu/event/SfuEvent;->ADAPTER:Lcom/squareup/wire/q;

    invoke-direct {v0, v6, v5}, Lcom/squareup/wire/l;-><init>(Lcom/squareup/wire/q;Lne3/l;)V

    .line 5
    iput-object v1, v0, Lstream/video/sfu/event/SfuEvent;->subscriber_offer:Lstream/video/sfu/event/SubscriberOffer;

    .line 6
    iput-object v2, v0, Lstream/video/sfu/event/SfuEvent;->publisher_answer:Lstream/video/sfu/event/PublisherAnswer;

    .line 7
    iput-object v3, v0, Lstream/video/sfu/event/SfuEvent;->connection_quality_changed:Lstream/video/sfu/event/ConnectionQualityChanged;

    .line 8
    iput-object v4, v0, Lstream/video/sfu/event/SfuEvent;->audio_level_changed:Lstream/video/sfu/event/AudioLevelChanged;

    move-object/from16 v5, p5

    .line 9
    iput-object v5, v0, Lstream/video/sfu/event/SfuEvent;->ice_trickle:Lstream/video/sfu/models/ICETrickle;

    move-object/from16 v6, p6

    .line 10
    iput-object v6, v0, Lstream/video/sfu/event/SfuEvent;->change_publish_quality:Lstream/video/sfu/event/ChangePublishQuality;

    move-object/from16 v7, p7

    .line 11
    iput-object v7, v0, Lstream/video/sfu/event/SfuEvent;->participant_joined:Lstream/video/sfu/event/ParticipantJoined;

    move-object/from16 v8, p8

    .line 12
    iput-object v8, v0, Lstream/video/sfu/event/SfuEvent;->participant_left:Lstream/video/sfu/event/ParticipantLeft;

    move-object/from16 v9, p9

    .line 13
    iput-object v9, v0, Lstream/video/sfu/event/SfuEvent;->dominant_speaker_changed:Lstream/video/sfu/event/DominantSpeakerChanged;

    move-object/from16 v10, p10

    .line 14
    iput-object v10, v0, Lstream/video/sfu/event/SfuEvent;->join_response:Lstream/video/sfu/event/JoinResponse;

    move-object/from16 v11, p11

    .line 15
    iput-object v11, v0, Lstream/video/sfu/event/SfuEvent;->health_check_response:Lstream/video/sfu/event/HealthCheckResponse;

    move-object/from16 v12, p12

    .line 16
    iput-object v12, v0, Lstream/video/sfu/event/SfuEvent;->track_published:Lstream/video/sfu/event/TrackPublished;

    move-object/from16 v13, p13

    .line 17
    iput-object v13, v0, Lstream/video/sfu/event/SfuEvent;->track_unpublished:Lstream/video/sfu/event/TrackUnpublished;

    move-object/from16 v14, p14

    .line 18
    iput-object v14, v0, Lstream/video/sfu/event/SfuEvent;->error:Lstream/video/sfu/event/Error;

    move-object/from16 v15, p15

    .line 19
    iput-object v15, v0, Lstream/video/sfu/event/SfuEvent;->call_grants_updated:Lstream/video/sfu/event/CallGrantsUpdated;

    move-object/from16 v1, p16

    .line 20
    iput-object v1, v0, Lstream/video/sfu/event/SfuEvent;->go_away:Lstream/video/sfu/event/GoAway;

    move-object/from16 v1, p17

    .line 21
    iput-object v1, v0, Lstream/video/sfu/event/SfuEvent;->ice_restart:Lstream/video/sfu/event/ICERestart;

    move-object/from16 v1, p18

    .line 22
    iput-object v1, v0, Lstream/video/sfu/event/SfuEvent;->pins_updated:Lstream/video/sfu/event/PinsChanged;

    move-object/from16 v1, p19

    .line 23
    iput-object v1, v0, Lstream/video/sfu/event/SfuEvent;->call_ended:Lstream/video/sfu/event/CallEnded;

    move-object/from16 v1, p20

    .line 24
    iput-object v1, v0, Lstream/video/sfu/event/SfuEvent;->participant_updated:Lstream/video/sfu/event/ParticipantUpdated;

    move-object/from16 v1, p21

    .line 25
    iput-object v1, v0, Lstream/video/sfu/event/SfuEvent;->participant_migration_complete:Lstream/video/sfu/event/ParticipantMigrationComplete;

    move-object/from16 v1, p22

    .line 26
    iput-object v1, v0, Lstream/video/sfu/event/SfuEvent;->change_publish_options:Lstream/video/sfu/event/ChangePublishOptions;

    move-object/from16 v1, p23

    .line 27
    iput-object v1, v0, Lstream/video/sfu/event/SfuEvent;->inbound_state_notification:Lstream/video/sfu/event/InboundStateNotification;

    .line 28
    filled-new-array/range {p5 .. p23}, [Ljava/lang/Object;

    move-result-object v1

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz p1, :cond_0

    move v7, v5

    goto :goto_0

    :cond_0
    move v7, v6

    :goto_0
    if-eqz v2, :cond_1

    add-int/lit8 v7, v7, 0x1

    :cond_1
    if-eqz v3, :cond_2

    add-int/lit8 v7, v7, 0x1

    :cond_2
    if-eqz v4, :cond_3

    add-int/lit8 v7, v7, 0x1

    :cond_3
    :goto_1
    const/16 v2, 0x13

    if-ge v6, v2, :cond_5

    .line 29
    aget-object v2, v1, v6

    if-eqz v2, :cond_4

    add-int/lit8 v7, v7, 0x1

    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_5
    if-gt v7, v5, :cond_6

    return-void

    .line 30
    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "At most one of subscriber_offer, publisher_answer, connection_quality_changed, audio_level_changed, ice_trickle, change_publish_quality, participant_joined, participant_left, dominant_speaker_changed, join_response, health_check_response, track_published, track_unpublished, error, call_grants_updated, go_away, ice_restart, pins_updated, call_ended, participant_updated, participant_migration_complete, change_publish_options, inbound_state_notification may be non-null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public synthetic constructor <init>(Lstream/video/sfu/event/SubscriberOffer;Lstream/video/sfu/event/PublisherAnswer;Lstream/video/sfu/event/ConnectionQualityChanged;Lstream/video/sfu/event/AudioLevelChanged;Lstream/video/sfu/models/ICETrickle;Lstream/video/sfu/event/ChangePublishQuality;Lstream/video/sfu/event/ParticipantJoined;Lstream/video/sfu/event/ParticipantLeft;Lstream/video/sfu/event/DominantSpeakerChanged;Lstream/video/sfu/event/JoinResponse;Lstream/video/sfu/event/HealthCheckResponse;Lstream/video/sfu/event/TrackPublished;Lstream/video/sfu/event/TrackUnpublished;Lstream/video/sfu/event/Error;Lstream/video/sfu/event/CallGrantsUpdated;Lstream/video/sfu/event/GoAway;Lstream/video/sfu/event/ICERestart;Lstream/video/sfu/event/PinsChanged;Lstream/video/sfu/event/CallEnded;Lstream/video/sfu/event/ParticipantUpdated;Lstream/video/sfu/event/ParticipantMigrationComplete;Lstream/video/sfu/event/ChangePublishOptions;Lstream/video/sfu/event/InboundStateNotification;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 25

    move/from16 v0, p25

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    const/4 v4, 0x0

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    const/4 v5, 0x0

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    const/4 v6, 0x0

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    const/4 v7, 0x0

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    const/4 v8, 0x0

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    const/4 v9, 0x0

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    const/4 v10, 0x0

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v0, 0x200

    if-eqz v11, :cond_9

    const/4 v11, 0x0

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v0, 0x400

    if-eqz v12, :cond_a

    const/4 v12, 0x0

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v0, 0x800

    if-eqz v13, :cond_b

    const/4 v13, 0x0

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v0, 0x1000

    if-eqz v14, :cond_c

    const/4 v14, 0x0

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v0, 0x2000

    if-eqz v15, :cond_d

    const/4 v15, 0x0

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    and-int/lit16 v2, v0, 0x4000

    if-eqz v2, :cond_e

    const/4 v2, 0x0

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_f

    const/16 v16, 0x0

    goto :goto_f

    :cond_f
    move-object/from16 v16, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v17, v0, v17

    if-eqz v17, :cond_10

    const/16 v17, 0x0

    goto :goto_10

    :cond_10
    move-object/from16 v17, p17

    :goto_10
    const/high16 v18, 0x20000

    and-int v18, v0, v18

    if-eqz v18, :cond_11

    const/16 v18, 0x0

    goto :goto_11

    :cond_11
    move-object/from16 v18, p18

    :goto_11
    const/high16 v19, 0x40000

    and-int v19, v0, v19

    if-eqz v19, :cond_12

    const/16 v19, 0x0

    goto :goto_12

    :cond_12
    move-object/from16 v19, p19

    :goto_12
    const/high16 v20, 0x80000

    and-int v20, v0, v20

    if-eqz v20, :cond_13

    const/16 v20, 0x0

    goto :goto_13

    :cond_13
    move-object/from16 v20, p20

    :goto_13
    const/high16 v21, 0x100000

    and-int v21, v0, v21

    if-eqz v21, :cond_14

    const/16 v21, 0x0

    goto :goto_14

    :cond_14
    move-object/from16 v21, p21

    :goto_14
    const/high16 v22, 0x200000

    and-int v22, v0, v22

    if-eqz v22, :cond_15

    const/16 v22, 0x0

    goto :goto_15

    :cond_15
    move-object/from16 v22, p22

    :goto_15
    const/high16 v23, 0x400000

    and-int v23, v0, v23

    if-eqz v23, :cond_16

    const/16 v23, 0x0

    goto :goto_16

    :cond_16
    move-object/from16 v23, p23

    :goto_16
    const/high16 v24, 0x800000

    and-int v0, v0, v24

    if-eqz v0, :cond_17

    .line 2
    sget-object v0, Lne3/l;->E:Lne3/l;

    move-object/from16 p25, v0

    :goto_17
    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p17, v16

    move-object/from16 p18, v17

    move-object/from16 p19, v18

    move-object/from16 p20, v19

    move-object/from16 p21, v20

    move-object/from16 p22, v21

    move-object/from16 p23, v22

    move-object/from16 p24, v23

    goto :goto_18

    :cond_17
    move-object/from16 p25, p24

    goto :goto_17

    .line 3
    :goto_18
    invoke-direct/range {p1 .. p25}, Lstream/video/sfu/event/SfuEvent;-><init>(Lstream/video/sfu/event/SubscriberOffer;Lstream/video/sfu/event/PublisherAnswer;Lstream/video/sfu/event/ConnectionQualityChanged;Lstream/video/sfu/event/AudioLevelChanged;Lstream/video/sfu/models/ICETrickle;Lstream/video/sfu/event/ChangePublishQuality;Lstream/video/sfu/event/ParticipantJoined;Lstream/video/sfu/event/ParticipantLeft;Lstream/video/sfu/event/DominantSpeakerChanged;Lstream/video/sfu/event/JoinResponse;Lstream/video/sfu/event/HealthCheckResponse;Lstream/video/sfu/event/TrackPublished;Lstream/video/sfu/event/TrackUnpublished;Lstream/video/sfu/event/Error;Lstream/video/sfu/event/CallGrantsUpdated;Lstream/video/sfu/event/GoAway;Lstream/video/sfu/event/ICERestart;Lstream/video/sfu/event/PinsChanged;Lstream/video/sfu/event/CallEnded;Lstream/video/sfu/event/ParticipantUpdated;Lstream/video/sfu/event/ParticipantMigrationComplete;Lstream/video/sfu/event/ChangePublishOptions;Lstream/video/sfu/event/InboundStateNotification;Lne3/l;)V

    return-void
.end method

.method public static synthetic copy$default(Lstream/video/sfu/event/SfuEvent;Lstream/video/sfu/event/SubscriberOffer;Lstream/video/sfu/event/PublisherAnswer;Lstream/video/sfu/event/ConnectionQualityChanged;Lstream/video/sfu/event/AudioLevelChanged;Lstream/video/sfu/models/ICETrickle;Lstream/video/sfu/event/ChangePublishQuality;Lstream/video/sfu/event/ParticipantJoined;Lstream/video/sfu/event/ParticipantLeft;Lstream/video/sfu/event/DominantSpeakerChanged;Lstream/video/sfu/event/JoinResponse;Lstream/video/sfu/event/HealthCheckResponse;Lstream/video/sfu/event/TrackPublished;Lstream/video/sfu/event/TrackUnpublished;Lstream/video/sfu/event/Error;Lstream/video/sfu/event/CallGrantsUpdated;Lstream/video/sfu/event/GoAway;Lstream/video/sfu/event/ICERestart;Lstream/video/sfu/event/PinsChanged;Lstream/video/sfu/event/CallEnded;Lstream/video/sfu/event/ParticipantUpdated;Lstream/video/sfu/event/ParticipantMigrationComplete;Lstream/video/sfu/event/ChangePublishOptions;Lstream/video/sfu/event/InboundStateNotification;Lne3/l;ILjava/lang/Object;)Lstream/video/sfu/event/SfuEvent;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p25

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lstream/video/sfu/event/SfuEvent;->subscriber_offer:Lstream/video/sfu/event/SubscriberOffer;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lstream/video/sfu/event/SfuEvent;->publisher_answer:Lstream/video/sfu/event/PublisherAnswer;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lstream/video/sfu/event/SfuEvent;->connection_quality_changed:Lstream/video/sfu/event/ConnectionQualityChanged;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lstream/video/sfu/event/SfuEvent;->audio_level_changed:Lstream/video/sfu/event/AudioLevelChanged;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lstream/video/sfu/event/SfuEvent;->ice_trickle:Lstream/video/sfu/models/ICETrickle;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lstream/video/sfu/event/SfuEvent;->change_publish_quality:Lstream/video/sfu/event/ChangePublishQuality;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lstream/video/sfu/event/SfuEvent;->participant_joined:Lstream/video/sfu/event/ParticipantJoined;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lstream/video/sfu/event/SfuEvent;->participant_left:Lstream/video/sfu/event/ParticipantLeft;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lstream/video/sfu/event/SfuEvent;->dominant_speaker_changed:Lstream/video/sfu/event/DominantSpeakerChanged;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lstream/video/sfu/event/SfuEvent;->join_response:Lstream/video/sfu/event/JoinResponse;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lstream/video/sfu/event/SfuEvent;->health_check_response:Lstream/video/sfu/event/HealthCheckResponse;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lstream/video/sfu/event/SfuEvent;->track_published:Lstream/video/sfu/event/TrackPublished;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lstream/video/sfu/event/SfuEvent;->track_unpublished:Lstream/video/sfu/event/TrackUnpublished;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lstream/video/sfu/event/SfuEvent;->error:Lstream/video/sfu/event/Error;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lstream/video/sfu/event/SfuEvent;->call_grants_updated:Lstream/video/sfu/event/CallGrantsUpdated;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lstream/video/sfu/event/SfuEvent;->go_away:Lstream/video/sfu/event/GoAway;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p25, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lstream/video/sfu/event/SfuEvent;->ice_restart:Lstream/video/sfu/event/ICERestart;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p25, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lstream/video/sfu/event/SfuEvent;->pins_updated:Lstream/video/sfu/event/PinsChanged;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p25, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lstream/video/sfu/event/SfuEvent;->call_ended:Lstream/video/sfu/event/CallEnded;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p25, v16

    move-object/from16 p5, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lstream/video/sfu/event/SfuEvent;->participant_updated:Lstream/video/sfu/event/ParticipantUpdated;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p25, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Lstream/video/sfu/event/SfuEvent;->participant_migration_complete:Lstream/video/sfu/event/ParticipantMigrationComplete;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p25, v16

    move-object/from16 p7, v1

    if-eqz v16, :cond_15

    iget-object v1, v0, Lstream/video/sfu/event/SfuEvent;->change_publish_options:Lstream/video/sfu/event/ChangePublishOptions;

    goto :goto_15

    :cond_15
    move-object/from16 v1, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p25, v16

    move-object/from16 p8, v1

    if-eqz v16, :cond_16

    iget-object v1, v0, Lstream/video/sfu/event/SfuEvent;->inbound_state_notification:Lstream/video/sfu/event/InboundStateNotification;

    goto :goto_16

    :cond_16
    move-object/from16 v1, p23

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, p25, v16

    if-eqz v16, :cond_17

    invoke-virtual {v0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v16

    move-object/from16 p25, v16

    :goto_17
    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p19, p4

    move-object/from16 p20, p5

    move-object/from16 p21, p6

    move-object/from16 p22, p7

    move-object/from16 p23, p8

    move-object/from16 p24, v1

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_18

    :cond_17
    move-object/from16 p25, p24

    goto :goto_17

    :goto_18
    invoke-virtual/range {p1 .. p25}, Lstream/video/sfu/event/SfuEvent;->copy(Lstream/video/sfu/event/SubscriberOffer;Lstream/video/sfu/event/PublisherAnswer;Lstream/video/sfu/event/ConnectionQualityChanged;Lstream/video/sfu/event/AudioLevelChanged;Lstream/video/sfu/models/ICETrickle;Lstream/video/sfu/event/ChangePublishQuality;Lstream/video/sfu/event/ParticipantJoined;Lstream/video/sfu/event/ParticipantLeft;Lstream/video/sfu/event/DominantSpeakerChanged;Lstream/video/sfu/event/JoinResponse;Lstream/video/sfu/event/HealthCheckResponse;Lstream/video/sfu/event/TrackPublished;Lstream/video/sfu/event/TrackUnpublished;Lstream/video/sfu/event/Error;Lstream/video/sfu/event/CallGrantsUpdated;Lstream/video/sfu/event/GoAway;Lstream/video/sfu/event/ICERestart;Lstream/video/sfu/event/PinsChanged;Lstream/video/sfu/event/CallEnded;Lstream/video/sfu/event/ParticipantUpdated;Lstream/video/sfu/event/ParticipantMigrationComplete;Lstream/video/sfu/event/ChangePublishOptions;Lstream/video/sfu/event/InboundStateNotification;Lne3/l;)Lstream/video/sfu/event/SfuEvent;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final copy(Lstream/video/sfu/event/SubscriberOffer;Lstream/video/sfu/event/PublisherAnswer;Lstream/video/sfu/event/ConnectionQualityChanged;Lstream/video/sfu/event/AudioLevelChanged;Lstream/video/sfu/models/ICETrickle;Lstream/video/sfu/event/ChangePublishQuality;Lstream/video/sfu/event/ParticipantJoined;Lstream/video/sfu/event/ParticipantLeft;Lstream/video/sfu/event/DominantSpeakerChanged;Lstream/video/sfu/event/JoinResponse;Lstream/video/sfu/event/HealthCheckResponse;Lstream/video/sfu/event/TrackPublished;Lstream/video/sfu/event/TrackUnpublished;Lstream/video/sfu/event/Error;Lstream/video/sfu/event/CallGrantsUpdated;Lstream/video/sfu/event/GoAway;Lstream/video/sfu/event/ICERestart;Lstream/video/sfu/event/PinsChanged;Lstream/video/sfu/event/CallEnded;Lstream/video/sfu/event/ParticipantUpdated;Lstream/video/sfu/event/ParticipantMigrationComplete;Lstream/video/sfu/event/ChangePublishOptions;Lstream/video/sfu/event/InboundStateNotification;Lne3/l;)Lstream/video/sfu/event/SfuEvent;
    .locals 26

    const-string v0, "unknownFields"

    move-object/from16 v1, p24

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lstream/video/sfu/event/SfuEvent;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    move-object/from16 v24, p23

    move-object/from16 v25, p24

    invoke-direct/range {v1 .. v25}, Lstream/video/sfu/event/SfuEvent;-><init>(Lstream/video/sfu/event/SubscriberOffer;Lstream/video/sfu/event/PublisherAnswer;Lstream/video/sfu/event/ConnectionQualityChanged;Lstream/video/sfu/event/AudioLevelChanged;Lstream/video/sfu/models/ICETrickle;Lstream/video/sfu/event/ChangePublishQuality;Lstream/video/sfu/event/ParticipantJoined;Lstream/video/sfu/event/ParticipantLeft;Lstream/video/sfu/event/DominantSpeakerChanged;Lstream/video/sfu/event/JoinResponse;Lstream/video/sfu/event/HealthCheckResponse;Lstream/video/sfu/event/TrackPublished;Lstream/video/sfu/event/TrackUnpublished;Lstream/video/sfu/event/Error;Lstream/video/sfu/event/CallGrantsUpdated;Lstream/video/sfu/event/GoAway;Lstream/video/sfu/event/ICERestart;Lstream/video/sfu/event/PinsChanged;Lstream/video/sfu/event/CallEnded;Lstream/video/sfu/event/ParticipantUpdated;Lstream/video/sfu/event/ParticipantMigrationComplete;Lstream/video/sfu/event/ChangePublishOptions;Lstream/video/sfu/event/InboundStateNotification;Lne3/l;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lstream/video/sfu/event/SfuEvent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v1

    check-cast p1, Lstream/video/sfu/event/SfuEvent;

    invoke-virtual {p1}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->subscriber_offer:Lstream/video/sfu/event/SubscriberOffer;

    iget-object v3, p1, Lstream/video/sfu/event/SfuEvent;->subscriber_offer:Lstream/video/sfu/event/SubscriberOffer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->publisher_answer:Lstream/video/sfu/event/PublisherAnswer;

    iget-object v3, p1, Lstream/video/sfu/event/SfuEvent;->publisher_answer:Lstream/video/sfu/event/PublisherAnswer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->connection_quality_changed:Lstream/video/sfu/event/ConnectionQualityChanged;

    iget-object v3, p1, Lstream/video/sfu/event/SfuEvent;->connection_quality_changed:Lstream/video/sfu/event/ConnectionQualityChanged;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->audio_level_changed:Lstream/video/sfu/event/AudioLevelChanged;

    iget-object v3, p1, Lstream/video/sfu/event/SfuEvent;->audio_level_changed:Lstream/video/sfu/event/AudioLevelChanged;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->ice_trickle:Lstream/video/sfu/models/ICETrickle;

    iget-object v3, p1, Lstream/video/sfu/event/SfuEvent;->ice_trickle:Lstream/video/sfu/models/ICETrickle;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->change_publish_quality:Lstream/video/sfu/event/ChangePublishQuality;

    iget-object v3, p1, Lstream/video/sfu/event/SfuEvent;->change_publish_quality:Lstream/video/sfu/event/ChangePublishQuality;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->participant_joined:Lstream/video/sfu/event/ParticipantJoined;

    iget-object v3, p1, Lstream/video/sfu/event/SfuEvent;->participant_joined:Lstream/video/sfu/event/ParticipantJoined;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->participant_left:Lstream/video/sfu/event/ParticipantLeft;

    iget-object v3, p1, Lstream/video/sfu/event/SfuEvent;->participant_left:Lstream/video/sfu/event/ParticipantLeft;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->dominant_speaker_changed:Lstream/video/sfu/event/DominantSpeakerChanged;

    iget-object v3, p1, Lstream/video/sfu/event/SfuEvent;->dominant_speaker_changed:Lstream/video/sfu/event/DominantSpeakerChanged;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->join_response:Lstream/video/sfu/event/JoinResponse;

    iget-object v3, p1, Lstream/video/sfu/event/SfuEvent;->join_response:Lstream/video/sfu/event/JoinResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->health_check_response:Lstream/video/sfu/event/HealthCheckResponse;

    iget-object v3, p1, Lstream/video/sfu/event/SfuEvent;->health_check_response:Lstream/video/sfu/event/HealthCheckResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->track_published:Lstream/video/sfu/event/TrackPublished;

    iget-object v3, p1, Lstream/video/sfu/event/SfuEvent;->track_published:Lstream/video/sfu/event/TrackPublished;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->track_unpublished:Lstream/video/sfu/event/TrackUnpublished;

    iget-object v3, p1, Lstream/video/sfu/event/SfuEvent;->track_unpublished:Lstream/video/sfu/event/TrackUnpublished;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->error:Lstream/video/sfu/event/Error;

    iget-object v3, p1, Lstream/video/sfu/event/SfuEvent;->error:Lstream/video/sfu/event/Error;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->call_grants_updated:Lstream/video/sfu/event/CallGrantsUpdated;

    iget-object v3, p1, Lstream/video/sfu/event/SfuEvent;->call_grants_updated:Lstream/video/sfu/event/CallGrantsUpdated;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->go_away:Lstream/video/sfu/event/GoAway;

    iget-object v3, p1, Lstream/video/sfu/event/SfuEvent;->go_away:Lstream/video/sfu/event/GoAway;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->ice_restart:Lstream/video/sfu/event/ICERestart;

    iget-object v3, p1, Lstream/video/sfu/event/SfuEvent;->ice_restart:Lstream/video/sfu/event/ICERestart;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->pins_updated:Lstream/video/sfu/event/PinsChanged;

    iget-object v3, p1, Lstream/video/sfu/event/SfuEvent;->pins_updated:Lstream/video/sfu/event/PinsChanged;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->call_ended:Lstream/video/sfu/event/CallEnded;

    iget-object v3, p1, Lstream/video/sfu/event/SfuEvent;->call_ended:Lstream/video/sfu/event/CallEnded;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->participant_updated:Lstream/video/sfu/event/ParticipantUpdated;

    iget-object v3, p1, Lstream/video/sfu/event/SfuEvent;->participant_updated:Lstream/video/sfu/event/ParticipantUpdated;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->participant_migration_complete:Lstream/video/sfu/event/ParticipantMigrationComplete;

    iget-object v3, p1, Lstream/video/sfu/event/SfuEvent;->participant_migration_complete:Lstream/video/sfu/event/ParticipantMigrationComplete;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->change_publish_options:Lstream/video/sfu/event/ChangePublishOptions;

    iget-object v3, p1, Lstream/video/sfu/event/SfuEvent;->change_publish_options:Lstream/video/sfu/event/ChangePublishOptions;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->inbound_state_notification:Lstream/video/sfu/event/InboundStateNotification;

    iget-object p1, p1, Lstream/video/sfu/event/SfuEvent;->inbound_state_notification:Lstream/video/sfu/event/InboundStateNotification;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_19

    return v2

    :cond_19
    return v0
.end method

.method public final getAudio_level_changed()Lstream/video/sfu/event/AudioLevelChanged;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/SfuEvent;->audio_level_changed:Lstream/video/sfu/event/AudioLevelChanged;

    return-object v0
.end method

.method public final getCall_ended()Lstream/video/sfu/event/CallEnded;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/SfuEvent;->call_ended:Lstream/video/sfu/event/CallEnded;

    return-object v0
.end method

.method public final getCall_grants_updated()Lstream/video/sfu/event/CallGrantsUpdated;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/SfuEvent;->call_grants_updated:Lstream/video/sfu/event/CallGrantsUpdated;

    return-object v0
.end method

.method public final getChange_publish_options()Lstream/video/sfu/event/ChangePublishOptions;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/SfuEvent;->change_publish_options:Lstream/video/sfu/event/ChangePublishOptions;

    return-object v0
.end method

.method public final getChange_publish_quality()Lstream/video/sfu/event/ChangePublishQuality;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/SfuEvent;->change_publish_quality:Lstream/video/sfu/event/ChangePublishQuality;

    return-object v0
.end method

.method public final getConnection_quality_changed()Lstream/video/sfu/event/ConnectionQualityChanged;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/SfuEvent;->connection_quality_changed:Lstream/video/sfu/event/ConnectionQualityChanged;

    return-object v0
.end method

.method public final getDominant_speaker_changed()Lstream/video/sfu/event/DominantSpeakerChanged;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/SfuEvent;->dominant_speaker_changed:Lstream/video/sfu/event/DominantSpeakerChanged;

    return-object v0
.end method

.method public final getError()Lstream/video/sfu/event/Error;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/SfuEvent;->error:Lstream/video/sfu/event/Error;

    return-object v0
.end method

.method public final getGo_away()Lstream/video/sfu/event/GoAway;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/SfuEvent;->go_away:Lstream/video/sfu/event/GoAway;

    return-object v0
.end method

.method public final getHealth_check_response()Lstream/video/sfu/event/HealthCheckResponse;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/SfuEvent;->health_check_response:Lstream/video/sfu/event/HealthCheckResponse;

    return-object v0
.end method

.method public final getIce_restart()Lstream/video/sfu/event/ICERestart;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/SfuEvent;->ice_restart:Lstream/video/sfu/event/ICERestart;

    return-object v0
.end method

.method public final getIce_trickle()Lstream/video/sfu/models/ICETrickle;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/SfuEvent;->ice_trickle:Lstream/video/sfu/models/ICETrickle;

    return-object v0
.end method

.method public final getInbound_state_notification()Lstream/video/sfu/event/InboundStateNotification;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/SfuEvent;->inbound_state_notification:Lstream/video/sfu/event/InboundStateNotification;

    return-object v0
.end method

.method public final getJoin_response()Lstream/video/sfu/event/JoinResponse;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/SfuEvent;->join_response:Lstream/video/sfu/event/JoinResponse;

    return-object v0
.end method

.method public final getParticipant_joined()Lstream/video/sfu/event/ParticipantJoined;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/SfuEvent;->participant_joined:Lstream/video/sfu/event/ParticipantJoined;

    return-object v0
.end method

.method public final getParticipant_left()Lstream/video/sfu/event/ParticipantLeft;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/SfuEvent;->participant_left:Lstream/video/sfu/event/ParticipantLeft;

    return-object v0
.end method

.method public final getParticipant_migration_complete()Lstream/video/sfu/event/ParticipantMigrationComplete;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/SfuEvent;->participant_migration_complete:Lstream/video/sfu/event/ParticipantMigrationComplete;

    return-object v0
.end method

.method public final getParticipant_updated()Lstream/video/sfu/event/ParticipantUpdated;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/SfuEvent;->participant_updated:Lstream/video/sfu/event/ParticipantUpdated;

    return-object v0
.end method

.method public final getPins_updated()Lstream/video/sfu/event/PinsChanged;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/SfuEvent;->pins_updated:Lstream/video/sfu/event/PinsChanged;

    return-object v0
.end method

.method public final getPublisher_answer()Lstream/video/sfu/event/PublisherAnswer;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/SfuEvent;->publisher_answer:Lstream/video/sfu/event/PublisherAnswer;

    return-object v0
.end method

.method public final getSubscriber_offer()Lstream/video/sfu/event/SubscriberOffer;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/SfuEvent;->subscriber_offer:Lstream/video/sfu/event/SubscriberOffer;

    return-object v0
.end method

.method public final getTrack_published()Lstream/video/sfu/event/TrackPublished;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/SfuEvent;->track_published:Lstream/video/sfu/event/TrackPublished;

    return-object v0
.end method

.method public final getTrack_unpublished()Lstream/video/sfu/event/TrackUnpublished;
    .locals 1

    iget-object v0, p0, Lstream/video/sfu/event/SfuEvent;->track_unpublished:Lstream/video/sfu/event/TrackUnpublished;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/squareup/wire/l;->hashCode:I

    if-nez v0, :cond_17

    invoke-virtual {p0}, Lcom/squareup/wire/l;->unknownFields()Lne3/l;

    move-result-object v0

    invoke-virtual {v0}, Lne3/l;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->subscriber_offer:Lstream/video/sfu/event/SubscriberOffer;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lstream/video/sfu/event/SubscriberOffer;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->publisher_answer:Lstream/video/sfu/event/PublisherAnswer;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lstream/video/sfu/event/PublisherAnswer;->hashCode()I

    move-result v1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->connection_quality_changed:Lstream/video/sfu/event/ConnectionQualityChanged;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lstream/video/sfu/event/ConnectionQualityChanged;->hashCode()I

    move-result v1

    goto :goto_2

    :cond_2
    move v1, v2

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->audio_level_changed:Lstream/video/sfu/event/AudioLevelChanged;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lstream/video/sfu/event/AudioLevelChanged;->hashCode()I

    move-result v1

    goto :goto_3

    :cond_3
    move v1, v2

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->ice_trickle:Lstream/video/sfu/models/ICETrickle;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lstream/video/sfu/models/ICETrickle;->hashCode()I

    move-result v1

    goto :goto_4

    :cond_4
    move v1, v2

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->change_publish_quality:Lstream/video/sfu/event/ChangePublishQuality;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lstream/video/sfu/event/ChangePublishQuality;->hashCode()I

    move-result v1

    goto :goto_5

    :cond_5
    move v1, v2

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->participant_joined:Lstream/video/sfu/event/ParticipantJoined;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lstream/video/sfu/event/ParticipantJoined;->hashCode()I

    move-result v1

    goto :goto_6

    :cond_6
    move v1, v2

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->participant_left:Lstream/video/sfu/event/ParticipantLeft;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lstream/video/sfu/event/ParticipantLeft;->hashCode()I

    move-result v1

    goto :goto_7

    :cond_7
    move v1, v2

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->dominant_speaker_changed:Lstream/video/sfu/event/DominantSpeakerChanged;

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lstream/video/sfu/event/DominantSpeakerChanged;->hashCode()I

    move-result v1

    goto :goto_8

    :cond_8
    move v1, v2

    :goto_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->join_response:Lstream/video/sfu/event/JoinResponse;

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Lstream/video/sfu/event/JoinResponse;->hashCode()I

    move-result v1

    goto :goto_9

    :cond_9
    move v1, v2

    :goto_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->health_check_response:Lstream/video/sfu/event/HealthCheckResponse;

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Lstream/video/sfu/event/HealthCheckResponse;->hashCode()I

    move-result v1

    goto :goto_a

    :cond_a
    move v1, v2

    :goto_a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->track_published:Lstream/video/sfu/event/TrackPublished;

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Lstream/video/sfu/event/TrackPublished;->hashCode()I

    move-result v1

    goto :goto_b

    :cond_b
    move v1, v2

    :goto_b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->track_unpublished:Lstream/video/sfu/event/TrackUnpublished;

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Lstream/video/sfu/event/TrackUnpublished;->hashCode()I

    move-result v1

    goto :goto_c

    :cond_c
    move v1, v2

    :goto_c
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->error:Lstream/video/sfu/event/Error;

    if-eqz v1, :cond_d

    invoke-virtual {v1}, Lstream/video/sfu/event/Error;->hashCode()I

    move-result v1

    goto :goto_d

    :cond_d
    move v1, v2

    :goto_d
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->call_grants_updated:Lstream/video/sfu/event/CallGrantsUpdated;

    if-eqz v1, :cond_e

    invoke-virtual {v1}, Lstream/video/sfu/event/CallGrantsUpdated;->hashCode()I

    move-result v1

    goto :goto_e

    :cond_e
    move v1, v2

    :goto_e
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->go_away:Lstream/video/sfu/event/GoAway;

    if-eqz v1, :cond_f

    invoke-virtual {v1}, Lstream/video/sfu/event/GoAway;->hashCode()I

    move-result v1

    goto :goto_f

    :cond_f
    move v1, v2

    :goto_f
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->ice_restart:Lstream/video/sfu/event/ICERestart;

    if-eqz v1, :cond_10

    invoke-virtual {v1}, Lstream/video/sfu/event/ICERestart;->hashCode()I

    move-result v1

    goto :goto_10

    :cond_10
    move v1, v2

    :goto_10
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->pins_updated:Lstream/video/sfu/event/PinsChanged;

    if-eqz v1, :cond_11

    invoke-virtual {v1}, Lstream/video/sfu/event/PinsChanged;->hashCode()I

    move-result v1

    goto :goto_11

    :cond_11
    move v1, v2

    :goto_11
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->call_ended:Lstream/video/sfu/event/CallEnded;

    if-eqz v1, :cond_12

    invoke-virtual {v1}, Lstream/video/sfu/event/CallEnded;->hashCode()I

    move-result v1

    goto :goto_12

    :cond_12
    move v1, v2

    :goto_12
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->participant_updated:Lstream/video/sfu/event/ParticipantUpdated;

    if-eqz v1, :cond_13

    invoke-virtual {v1}, Lstream/video/sfu/event/ParticipantUpdated;->hashCode()I

    move-result v1

    goto :goto_13

    :cond_13
    move v1, v2

    :goto_13
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->participant_migration_complete:Lstream/video/sfu/event/ParticipantMigrationComplete;

    if-eqz v1, :cond_14

    invoke-virtual {v1}, Lstream/video/sfu/event/ParticipantMigrationComplete;->hashCode()I

    move-result v1

    goto :goto_14

    :cond_14
    move v1, v2

    :goto_14
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->change_publish_options:Lstream/video/sfu/event/ChangePublishOptions;

    if-eqz v1, :cond_15

    invoke-virtual {v1}, Lstream/video/sfu/event/ChangePublishOptions;->hashCode()I

    move-result v1

    goto :goto_15

    :cond_15
    move v1, v2

    :goto_15
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->inbound_state_notification:Lstream/video/sfu/event/InboundStateNotification;

    if-eqz v1, :cond_16

    invoke-virtual {v1}, Lstream/video/sfu/event/InboundStateNotification;->hashCode()I

    move-result v2

    :cond_16
    add-int/2addr v0, v2

    iput v0, p0, Lcom/squareup/wire/l;->hashCode:I

    :cond_17
    return v0
.end method

.method public bridge synthetic newBuilder()Lcom/squareup/wire/j;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->newBuilder()Ljava/lang/Void;

    move-result-object v0

    check-cast v0, Lcom/squareup/wire/j;

    return-object v0
.end method

.method public synthetic newBuilder()Ljava/lang/Void;
    .locals 2
    .annotation runtime Ll83/c;
    .end annotation

    .line 2
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->subscriber_offer:Lstream/video/sfu/event/SubscriberOffer;

    if-eqz v1, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "subscriber_offer="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->publisher_answer:Lstream/video/sfu/event/PublisherAnswer;

    if-eqz v1, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "publisher_answer="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->connection_quality_changed:Lstream/video/sfu/event/ConnectionQualityChanged;

    if-eqz v1, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "connection_quality_changed="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->audio_level_changed:Lstream/video/sfu/event/AudioLevelChanged;

    if-eqz v1, :cond_3

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "audio_level_changed="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->ice_trickle:Lstream/video/sfu/models/ICETrickle;

    if-eqz v1, :cond_4

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ice_trickle="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->change_publish_quality:Lstream/video/sfu/event/ChangePublishQuality;

    if-eqz v1, :cond_5

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "change_publish_quality="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->participant_joined:Lstream/video/sfu/event/ParticipantJoined;

    if-eqz v1, :cond_6

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "participant_joined="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->participant_left:Lstream/video/sfu/event/ParticipantLeft;

    if-eqz v1, :cond_7

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "participant_left="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->dominant_speaker_changed:Lstream/video/sfu/event/DominantSpeakerChanged;

    if-eqz v1, :cond_8

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "dominant_speaker_changed="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->join_response:Lstream/video/sfu/event/JoinResponse;

    if-eqz v1, :cond_9

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "join_response="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_9
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->health_check_response:Lstream/video/sfu/event/HealthCheckResponse;

    if-eqz v1, :cond_a

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "health_check_response="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_a
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->track_published:Lstream/video/sfu/event/TrackPublished;

    if-eqz v1, :cond_b

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "track_published="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_b
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->track_unpublished:Lstream/video/sfu/event/TrackUnpublished;

    if-eqz v1, :cond_c

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "track_unpublished="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_c
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->error:Lstream/video/sfu/event/Error;

    if-eqz v1, :cond_d

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "error="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_d
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->call_grants_updated:Lstream/video/sfu/event/CallGrantsUpdated;

    if-eqz v1, :cond_e

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "call_grants_updated="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_e
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->go_away:Lstream/video/sfu/event/GoAway;

    if-eqz v1, :cond_f

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "go_away="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_f
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->ice_restart:Lstream/video/sfu/event/ICERestart;

    if-eqz v1, :cond_10

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ice_restart="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_10
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->pins_updated:Lstream/video/sfu/event/PinsChanged;

    if-eqz v1, :cond_11

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "pins_updated="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_11
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->call_ended:Lstream/video/sfu/event/CallEnded;

    if-eqz v1, :cond_12

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "call_ended="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_12
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->participant_updated:Lstream/video/sfu/event/ParticipantUpdated;

    if-eqz v1, :cond_13

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "participant_updated="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_13
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->participant_migration_complete:Lstream/video/sfu/event/ParticipantMigrationComplete;

    if-eqz v1, :cond_14

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "participant_migration_complete="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_14
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->change_publish_options:Lstream/video/sfu/event/ChangePublishOptions;

    if-eqz v1, :cond_15

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "change_publish_options="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_15
    iget-object v1, p0, Lstream/video/sfu/event/SfuEvent;->inbound_state_notification:Lstream/video/sfu/event/InboundStateNotification;

    if-eqz v1, :cond_16

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "inbound_state_notification="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_16
    const/4 v4, 0x0

    const/16 v5, 0x38

    const-string v1, ", "

    const-string v2, "SfuEvent{"

    const-string v3, "}"

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
