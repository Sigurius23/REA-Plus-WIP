.class public final Ll33/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll83/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll33/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v1, "RTCEventMapper"

    invoke-static {v0, v1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v0

    sput-object v0, Ll33/a;->a:Ll83/p;

    return-void
.end method

.method public static a(Lstream/video/sfu/event/SfuEvent;)Lv33/w;
    .locals 9

    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getSubscriber_offer()Lstream/video/sfu/event/SubscriberOffer;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v0, Lv33/y;

    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getSubscriber_offer()Lstream/video/sfu/event/SubscriberOffer;

    move-result-object p0

    invoke-virtual {p0}, Lstream/video/sfu/event/SubscriberOffer;->getSdp()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lv33/y;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getConnection_quality_changed()Lstream/video/sfu/event/ConnectionQualityChanged;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getConnection_quality_changed()Lstream/video/sfu/event/ConnectionQualityChanged;

    move-result-object p0

    new-instance v0, Lv33/f;

    invoke-virtual {p0}, Lstream/video/sfu/event/ConnectionQualityChanged;->getConnection_quality_updates()Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lv33/f;-><init>(Ljava/util/List;)V

    return-object v0

    :cond_1
    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getAudio_level_changed()Lstream/video/sfu/event/AudioLevelChanged;

    move-result-object v0

    const/16 v1, 0xa

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getAudio_level_changed()Lstream/video/sfu/event/AudioLevelChanged;

    move-result-object p0

    invoke-virtual {p0}, Lstream/video/sfu/event/AudioLevelChanged;->getAudio_levels()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, Lm83/g0;->W(I)I

    move-result v0

    const/16 v1, 0x10

    if-ge v0, v1, :cond_2

    move v0, v1

    :cond_2
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lstream/video/sfu/event/AudioLevel;

    invoke-virtual {v0}, Lstream/video/sfu/event/AudioLevel;->getSession_id()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lo53/b;

    invoke-virtual {v0}, Lstream/video/sfu/event/AudioLevel;->getUser_id()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lstream/video/sfu/event/AudioLevel;->is_speaking()Z

    move-result v5

    invoke-virtual {v0}, Lstream/video/sfu/event/AudioLevel;->getLevel()F

    move-result v0

    invoke-direct {v3, v0, v4, v5}, Lo53/b;-><init>(FLjava/lang/String;Z)V

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    new-instance p0, Lv33/a;

    invoke-direct {p0, v1}, Lv33/a;-><init>(Ljava/util/LinkedHashMap;)V

    return-object p0

    :cond_4
    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getChange_publish_quality()Lstream/video/sfu/event/ChangePublishQuality;

    move-result-object v0

    if-eqz v0, :cond_5

    new-instance v0, Lv33/e;

    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getChange_publish_quality()Lstream/video/sfu/event/ChangePublishQuality;

    move-result-object p0

    invoke-direct {v0, p0}, Lv33/e;-><init>(Lstream/video/sfu/event/ChangePublishQuality;)V

    return-object v0

    :cond_5
    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getChange_publish_options()Lstream/video/sfu/event/ChangePublishOptions;

    move-result-object v0

    if-eqz v0, :cond_6

    new-instance v0, Lv33/d;

    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getChange_publish_options()Lstream/video/sfu/event/ChangePublishOptions;

    move-result-object p0

    invoke-direct {v0, p0}, Lv33/d;-><init>(Lstream/video/sfu/event/ChangePublishOptions;)V

    return-object v0

    :cond_6
    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getTrack_published()Lstream/video/sfu/event/TrackPublished;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getTrack_published()Lstream/video/sfu/event/TrackPublished;

    move-result-object p0

    new-instance v0, Lv33/z;

    invoke-virtual {p0}, Lstream/video/sfu/event/TrackPublished;->getUser_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lstream/video/sfu/event/TrackPublished;->getSession_id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lstream/video/sfu/event/TrackPublished;->getType()Lstream/video/sfu/models/TrackType;

    move-result-object v3

    invoke-virtual {p0}, Lstream/video/sfu/event/TrackPublished;->getParticipant()Lstream/video/sfu/models/Participant;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Lv33/z;-><init>(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/Participant;)V

    return-object v0

    :cond_7
    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getTrack_unpublished()Lstream/video/sfu/event/TrackUnpublished;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getTrack_unpublished()Lstream/video/sfu/event/TrackUnpublished;

    move-result-object p0

    new-instance v0, Lv33/a0;

    invoke-virtual {p0}, Lstream/video/sfu/event/TrackUnpublished;->getUser_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lstream/video/sfu/event/TrackUnpublished;->getSession_id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lstream/video/sfu/event/TrackUnpublished;->getType()Lstream/video/sfu/models/TrackType;

    move-result-object v3

    invoke-virtual {p0}, Lstream/video/sfu/event/TrackUnpublished;->getParticipant()Lstream/video/sfu/models/Participant;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Lv33/a0;-><init>(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lstream/video/sfu/models/Participant;)V

    return-object v0

    :cond_8
    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getParticipant_joined()Lstream/video/sfu/event/ParticipantJoined;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getParticipant_joined()Lstream/video/sfu/event/ParticipantJoined;

    move-result-object p0

    new-instance v0, Lv33/p;

    invoke-virtual {p0}, Lstream/video/sfu/event/ParticipantJoined;->getParticipant()Lstream/video/sfu/models/Participant;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lstream/video/sfu/event/ParticipantJoined;->getCall_cid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lstream/video/sfu/event/ParticipantJoined;->is_pinned()Z

    move-result p0

    invoke-direct {v0, v1, v2, p0}, Lv33/p;-><init>(Lstream/video/sfu/models/Participant;Ljava/lang/String;Z)V

    return-object v0

    :cond_9
    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getParticipant_left()Lstream/video/sfu/event/ParticipantLeft;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getParticipant_left()Lstream/video/sfu/event/ParticipantLeft;

    move-result-object p0

    new-instance v0, Lv33/q;

    invoke-virtual {p0}, Lstream/video/sfu/event/ParticipantLeft;->getParticipant()Lstream/video/sfu/models/Participant;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lstream/video/sfu/event/ParticipantLeft;->getCall_cid()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lv33/q;-><init>(Lstream/video/sfu/models/Participant;Ljava/lang/String;)V

    return-object v0

    :cond_a
    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getDominant_speaker_changed()Lstream/video/sfu/event/DominantSpeakerChanged;

    move-result-object v0

    if-eqz v0, :cond_b

    new-instance v0, Lv33/g;

    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getDominant_speaker_changed()Lstream/video/sfu/event/DominantSpeakerChanged;

    move-result-object v1

    invoke-virtual {v1}, Lstream/video/sfu/event/DominantSpeakerChanged;->getUser_id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getDominant_speaker_changed()Lstream/video/sfu/event/DominantSpeakerChanged;

    move-result-object p0

    invoke-virtual {p0}, Lstream/video/sfu/event/DominantSpeakerChanged;->getSession_id()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lv33/g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_b
    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getHealth_check_response()Lstream/video/sfu/event/HealthCheckResponse;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_e

    new-instance v0, Lv33/v;

    new-instance v1, Lv33/o;

    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getHealth_check_response()Lstream/video/sfu/event/HealthCheckResponse;

    move-result-object v3

    invoke-virtual {v3}, Lstream/video/sfu/event/HealthCheckResponse;->getParticipant_count()Lstream/video/sfu/models/ParticipantCount;

    move-result-object v3

    if-eqz v3, :cond_c

    invoke-virtual {v3}, Lstream/video/sfu/models/ParticipantCount;->getTotal()I

    move-result v3

    goto :goto_1

    :cond_c
    move v3, v2

    :goto_1
    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getHealth_check_response()Lstream/video/sfu/event/HealthCheckResponse;

    move-result-object p0

    invoke-virtual {p0}, Lstream/video/sfu/event/HealthCheckResponse;->getParticipant_count()Lstream/video/sfu/models/ParticipantCount;

    move-result-object p0

    if-eqz p0, :cond_d

    invoke-virtual {p0}, Lstream/video/sfu/models/ParticipantCount;->getAnonymous()I

    move-result v2

    :cond_d
    invoke-direct {v1, v3, v2}, Lv33/o;-><init>(II)V

    invoke-direct {v0, v1}, Lv33/v;-><init>(Lv33/o;)V

    return-object v0

    :cond_e
    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getJoin_response()Lstream/video/sfu/event/JoinResponse;

    move-result-object v0

    if-eqz v0, :cond_11

    new-instance v5, Lv33/o;

    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getJoin_response()Lstream/video/sfu/event/JoinResponse;

    move-result-object v0

    invoke-virtual {v0}, Lstream/video/sfu/event/JoinResponse;->getCall_state()Lstream/video/sfu/models/CallState;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Lstream/video/sfu/models/CallState;->getParticipant_count()Lstream/video/sfu/models/ParticipantCount;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Lstream/video/sfu/models/ParticipantCount;->getTotal()I

    move-result v0

    goto :goto_2

    :cond_f
    move v0, v2

    :goto_2
    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getJoin_response()Lstream/video/sfu/event/JoinResponse;

    move-result-object v1

    invoke-virtual {v1}, Lstream/video/sfu/event/JoinResponse;->getCall_state()Lstream/video/sfu/models/CallState;

    move-result-object v1

    if-eqz v1, :cond_10

    invoke-virtual {v1}, Lstream/video/sfu/models/CallState;->getParticipant_count()Lstream/video/sfu/models/ParticipantCount;

    move-result-object v1

    if-eqz v1, :cond_10

    invoke-virtual {v1}, Lstream/video/sfu/models/ParticipantCount;->getAnonymous()I

    move-result v2

    :cond_10
    invoke-direct {v5, v0, v2}, Lv33/o;-><init>(II)V

    new-instance v3, Lv33/n;

    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getJoin_response()Lstream/video/sfu/event/JoinResponse;

    move-result-object v0

    invoke-virtual {v0}, Lstream/video/sfu/event/JoinResponse;->getCall_state()Lstream/video/sfu/models/CallState;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getJoin_response()Lstream/video/sfu/event/JoinResponse;

    move-result-object v0

    invoke-virtual {v0}, Lstream/video/sfu/event/JoinResponse;->getFast_reconnect_deadline_seconds()I

    move-result v6

    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getJoin_response()Lstream/video/sfu/event/JoinResponse;

    move-result-object v0

    invoke-virtual {v0}, Lstream/video/sfu/event/JoinResponse;->getReconnected()Z

    move-result v7

    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getJoin_response()Lstream/video/sfu/event/JoinResponse;

    move-result-object p0

    invoke-virtual {p0}, Lstream/video/sfu/event/JoinResponse;->getPublish_options()Ljava/util/List;

    move-result-object v8

    invoke-direct/range {v3 .. v8}, Lv33/n;-><init>(Lstream/video/sfu/models/CallState;Lv33/o;IZLjava/util/List;)V

    return-object v3

    :cond_11
    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getIce_trickle()Lstream/video/sfu/models/ICETrickle;

    move-result-object v0

    if-eqz v0, :cond_12

    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getIce_trickle()Lstream/video/sfu/models/ICETrickle;

    move-result-object p0

    new-instance v0, Lv33/k;

    invoke-virtual {p0}, Lstream/video/sfu/models/ICETrickle;->getIce_candidate()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lstream/video/sfu/models/ICETrickle;->getPeer_type()Lstream/video/sfu/models/PeerType;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lv33/k;-><init>(Ljava/lang/String;Lstream/video/sfu/models/PeerType;)V

    return-object v0

    :cond_12
    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getIce_restart()Lstream/video/sfu/event/ICERestart;

    move-result-object v0

    if-eqz v0, :cond_13

    new-instance v0, Lv33/j;

    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getIce_restart()Lstream/video/sfu/event/ICERestart;

    move-result-object p0

    invoke-virtual {p0}, Lstream/video/sfu/event/ICERestart;->getPeer_type()Lstream/video/sfu/models/PeerType;

    move-result-object p0

    invoke-direct {v0, p0}, Lv33/j;-><init>(Lstream/video/sfu/models/PeerType;)V

    return-object v0

    :cond_13
    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getPublisher_answer()Lstream/video/sfu/event/PublisherAnswer;

    move-result-object v0

    if-eqz v0, :cond_14

    new-instance v0, Lv33/u;

    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getPublisher_answer()Lstream/video/sfu/event/PublisherAnswer;

    move-result-object p0

    invoke-virtual {p0}, Lstream/video/sfu/event/PublisherAnswer;->getSdp()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lv33/u;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_14
    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getError()Lstream/video/sfu/event/Error;

    move-result-object v0

    if-eqz v0, :cond_15

    new-instance v0, Lv33/h;

    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getError()Lstream/video/sfu/event/Error;

    move-result-object v1

    invoke-virtual {v1}, Lstream/video/sfu/event/Error;->getError()Lstream/video/sfu/models/Error;

    move-result-object v1

    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getError()Lstream/video/sfu/event/Error;

    move-result-object p0

    invoke-virtual {p0}, Lstream/video/sfu/event/Error;->getReconnect_strategy()Lstream/video/sfu/models/WebsocketReconnectStrategy;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lv33/h;-><init>(Lstream/video/sfu/models/Error;Lstream/video/sfu/models/WebsocketReconnectStrategy;)V

    return-object v0

    :cond_15
    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getCall_grants_updated()Lstream/video/sfu/event/CallGrantsUpdated;

    move-result-object v0

    if-eqz v0, :cond_16

    new-instance v0, Lv33/c;

    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getCall_grants_updated()Lstream/video/sfu/event/CallGrantsUpdated;

    move-result-object v1

    invoke-virtual {v1}, Lstream/video/sfu/event/CallGrantsUpdated;->getCurrent_grants()Lstream/video/sfu/models/CallGrants;

    move-result-object v1

    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getCall_grants_updated()Lstream/video/sfu/event/CallGrantsUpdated;

    move-result-object p0

    invoke-virtual {p0}, Lstream/video/sfu/event/CallGrantsUpdated;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lv33/c;-><init>(Lstream/video/sfu/models/CallGrants;Ljava/lang/String;)V

    return-object v0

    :cond_16
    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getGo_away()Lstream/video/sfu/event/GoAway;

    move-result-object v0

    if-eqz v0, :cond_17

    new-instance v0, Lv33/i;

    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getGo_away()Lstream/video/sfu/event/GoAway;

    move-result-object p0

    invoke-virtual {p0}, Lstream/video/sfu/event/GoAway;->getReason()Lstream/video/sfu/models/GoAwayReason;

    move-result-object p0

    invoke-direct {v0, p0}, Lv33/i;-><init>(Lstream/video/sfu/models/GoAwayReason;)V

    return-object v0

    :cond_17
    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getParticipant_migration_complete()Lstream/video/sfu/event/ParticipantMigrationComplete;

    move-result-object v0

    if-eqz v0, :cond_18

    sget-object p0, Lv33/r;->a:Lv33/r;

    return-object p0

    :cond_18
    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getPins_updated()Lstream/video/sfu/event/PinsChanged;

    move-result-object v0

    if-eqz v0, :cond_1a

    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getPins_updated()Lstream/video/sfu/event/PinsChanged;

    move-result-object p0

    invoke-virtual {p0}, Lstream/video/sfu/event/PinsChanged;->getPins()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_19

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lstream/video/sfu/models/Pin;

    new-instance v2, Lv33/s;

    invoke-virtual {v1}, Lstream/video/sfu/models/Pin;->getUser_id()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lstream/video/sfu/models/Pin;->getSession_id()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lv33/s;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_19
    new-instance p0, Lv33/t;

    invoke-direct {p0, v0}, Lv33/t;-><init>(Ljava/util/ArrayList;)V

    return-object p0

    :cond_1a
    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getCall_ended()Lstream/video/sfu/event/CallEnded;

    move-result-object v0

    if-eqz v0, :cond_1b

    new-instance v0, Lv33/b;

    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getCall_ended()Lstream/video/sfu/event/CallEnded;

    move-result-object p0

    invoke-virtual {p0}, Lstream/video/sfu/event/CallEnded;->getReason()Lstream/video/sfu/models/CallEndedReason;

    move-result-object p0

    invoke-virtual {p0}, Lstream/video/sfu/models/CallEndedReason;->getValue()I

    move-result p0

    invoke-direct {v0, p0}, Lv33/b;-><init>(I)V

    return-object v0

    :cond_1b
    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getInbound_state_notification()Lstream/video/sfu/event/InboundStateNotification;

    move-result-object v0

    const/4 v2, 0x0

    sget-object v3, Ll33/a;->a:Ll83/p;

    if-eqz v0, :cond_1e

    invoke-virtual {v3}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    iget-object v3, v0, Lb23/k;->c:Lb23/e;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->y:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1c

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getInbound_state_notification()Lstream/video/sfu/event/InboundStateNotification;

    move-result-object v3

    invoke-virtual {v3}, Lstream/video/sfu/event/InboundStateNotification;->getInbound_video_states()Ljava/util/List;

    move-result-object v3

    const-string v6, "[inbound_state_notification] #sfu; #track; inbound_video_states: "

    invoke-static {v6, v3}, Ldc/b;->q(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v5, v4, v3, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1c
    invoke-virtual {p0}, Lstream/video/sfu/event/SfuEvent;->getInbound_state_notification()Lstream/video/sfu/event/InboundStateNotification;

    move-result-object p0

    invoke-virtual {p0}, Lstream/video/sfu/event/InboundStateNotification;->getInbound_video_states()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1d

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lstream/video/sfu/event/InboundVideoState;

    new-instance v2, Lv33/m;

    invoke-virtual {v1}, Lstream/video/sfu/event/InboundVideoState;->getUser_id()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lstream/video/sfu/event/InboundVideoState;->getSession_id()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lstream/video/sfu/event/InboundVideoState;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v5

    invoke-virtual {v1}, Lstream/video/sfu/event/InboundVideoState;->getPaused()Z

    move-result v1

    invoke-direct {v2, v3, v4, v5, v1}, Lv33/m;-><init>(Ljava/lang/String;Ljava/lang/String;Lstream/video/sfu/models/TrackType;Z)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_1d
    new-instance p0, Lv33/l;

    invoke-direct {p0, v0}, Lv33/l;-><init>(Ljava/util/ArrayList;)V

    return-object p0

    :cond_1e
    invoke-virtual {v3}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1f

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "Unknown event: "

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v4, v3, v1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1f
    new-instance v0, Lv33/b0;

    invoke-direct {v0, p0}, Lv33/b0;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
