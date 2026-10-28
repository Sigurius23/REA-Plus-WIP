.class public final Le33/n;
.super Le33/u;
.source "SourceFile"


# instance fields
.field public final A:I

.field public final B:Lio/getstream/video/android/core/api/SignalServerService;

.field public final C:Ljava/lang/String;

.field public final D:Lc93/a;

.field public final E:Lc93/a;

.field public final F:Lio/sentry/internal/debugmeta/c;

.field public final G:Ll53/m;

.field public final H:Lio/sentry/internal/debugmeta/c;

.field public final I:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

.field public final J:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

.field public K:Z

.field public final L:Ln53/x1;

.field public final M:Lgm/r;

.field public final w:Lt23/x1;

.field public final x:Le33/j0;

.field public final y:Ljava/util/List;

.field public final z:Lbc3/c0;


# direct methods
.method public constructor <init>(Lt23/x1;Le33/j0;Ljava/util/List;Lbc3/c0;Lorg/webrtc/MediaConstraints;Landroidx/room/v0;Lio/getstream/video/android/core/api/SignalServerService;Ljava/lang/String;Lc93/a;Lc93/a;Ll53/m;)V
    .locals 18

    move-object/from16 v12, p3

    move-object/from16 v13, p4

    move-object/from16 v14, p7

    move-object/from16 v15, p8

    move-object/from16 v10, p11

    sget-object v1, Lc43/v;->w:Lc43/v;

    new-instance v0, Lio/sentry/internal/debugmeta/c;

    const/16 v2, 0x13

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3}, Lio/sentry/internal/debugmeta/c;-><init>(IB)V

    new-instance v2, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v2, v13}, Lio/sentry/internal/debugmeta/c;-><init>(Lbc3/c0;)V

    const-string v3, "publishOptions"

    invoke-static {v12, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "coroutineScope"

    invoke-static {v13, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "mediaConstraints"

    move-object/from16 v4, p5

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "sfuClient"

    invoke-static {v14, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "sessionId"

    invoke-static {v15, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "tracer"

    invoke-static {v10, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v9, 0x1

    const-string v11, "Publisher"

    const/4 v3, 0x0

    sget-object v4, Ld33/a0;->w:Ld33/a0;

    const v8, 0x124f80

    move-object/from16 v5, p6

    move-object/from16 v6, p9

    move-object/from16 v7, p10

    move-object/from16 v16, v0

    move-object/from16 v17, v2

    move-object/from16 v0, p0

    move-object/from16 v2, p5

    invoke-direct/range {v0 .. v11}, Le33/u;-><init>(Lc43/v;Lorg/webrtc/MediaConstraints;Le33/e;Lc93/m;Lc93/m;Lc93/a;Lc93/a;IZLl53/m;Ljava/lang/String;)V

    move-object/from16 v1, p1

    iput-object v1, v0, Le33/n;->w:Lt23/x1;

    move-object/from16 v1, p2

    iput-object v1, v0, Le33/n;->x:Le33/j0;

    iput-object v12, v0, Le33/n;->y:Ljava/util/List;

    iput-object v13, v0, Le33/n;->z:Lbc3/c0;

    iput v8, v0, Le33/n;->A:I

    iput-object v14, v0, Le33/n;->B:Lio/getstream/video/android/core/api/SignalServerService;

    iput-object v15, v0, Le33/n;->C:Ljava/lang/String;

    iput-object v6, v0, Le33/n;->D:Lc93/a;

    iput-object v7, v0, Le33/n;->E:Lc93/a;

    move-object/from16 v1, v16

    iput-object v1, v0, Le33/n;->F:Lio/sentry/internal/debugmeta/c;

    iput-object v10, v0, Le33/n;->G:Ll53/m;

    move-object/from16 v1, v17

    iput-object v1, v0, Le33/n;->H:Lio/sentry/internal/debugmeta/c;

    new-instance v1, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    const/16 v2, 0x500

    const/16 v3, 0x2d0

    const/16 v4, 0x18

    const/16 v5, 0x1e

    invoke-direct {v1, v2, v3, v4, v5}, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;-><init>(IIII)V

    iput-object v1, v0, Le33/n;->I:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    new-instance v1, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    invoke-direct {v1, v2, v3, v4, v5}, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;-><init>(IIII)V

    iput-object v1, v0, Le33/n;->J:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    new-instance v1, Ln53/x1;

    invoke-direct {v1, v13}, Ln53/x1;-><init>(Lbc3/c0;)V

    iput-object v1, v0, Le33/n;->L:Ln53/x1;

    new-instance v1, Lgm/r;

    invoke-direct {v1, v13}, Lgm/r;-><init>(Lbc3/c0;)V

    iput-object v1, v0, Le33/n;->M:Lgm/r;

    return-void
.end method


# virtual methods
.method public final A(Lstream/video/sfu/models/TrackType;)V
    .locals 7

    iget-object v0, p0, Le33/n;->F:Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "trackType"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lio/sentry/internal/debugmeta/c;->x()Ljava/util/ArrayList;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Li33/b;

    iget-object v3, v3, Li33/b;->a:Lstream/video/sfu/models/PublishOption;

    invoke-virtual {v3}, Lstream/video/sfu/models/PublishOption;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v3

    if-ne v3, p1, :cond_0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li33/b;

    iget-object v2, v2, Li33/b;->b:Lorg/webrtc/RtpTransceiver;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/webrtc/RtpTransceiver;

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->y:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "[trackPublishing] Unpublishing track: "

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    invoke-interface {v2, v5, v4, v3, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    invoke-virtual {v1}, Lorg/webrtc/RtpTransceiver;->getSender()Lorg/webrtc/RtpSender;

    move-result-object v1

    invoke-virtual {v1}, Lorg/webrtc/RtpSender;->track()Lorg/webrtc/MediaStreamTrack;

    move-result-object v1

    if-eqz v1, :cond_3

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lsc3/l;->n(Lorg/webrtc/MediaStreamTrack;Z)V

    invoke-virtual {v1}, Lorg/webrtc/MediaStreamTrack;->id()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ":"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Le33/u;->j:Ll53/m;

    const-string v4, "unpublishtrack"

    invoke-virtual {v3, v2, v4}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Le33/n;->s(Lorg/webrtc/MediaStreamTrack;)V

    goto :goto_2

    :cond_5
    return-void
.end method

.method public final n(Ljava/util/List;Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;Lorg/webrtc/MediaStreamTrack;Lstream/video/sfu/models/PublishOption;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    move-object/from16 v2, p4

    new-instance v3, Le33/c;

    invoke-direct {v3, v1}, Le33/c;-><init>(Le33/n;)V

    sget-object v4, Lj33/d;->a:Ljava/lang/Object;

    invoke-virtual {v2}, Lstream/video/sfu/models/PublishOption;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v4

    invoke-static {v4}, Lj33/d;->b(Lstream/video/sfu/models/TrackType;)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    new-instance v4, Lorg/webrtc/RtpParameters$Encoding;

    const/4 v6, 0x1

    invoke-direct {v4, v5, v6, v5}, Lorg/webrtc/RtpParameters$Encoding;-><init>(Ljava/lang/String;ZLjava/lang/Double;)V

    invoke-virtual {v3}, Le33/c;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lstream/video/sfu/models/AudioBitrateProfile;

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Lstream/video/sfu/models/PublishOption;->getAudio_bitrate_profiles()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lstream/video/sfu/models/AudioBitrate;

    invoke-virtual {v8}, Lstream/video/sfu/models/AudioBitrate;->getProfile()Lstream/video/sfu/models/AudioBitrateProfile;

    move-result-object v8

    if-ne v8, v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v7, v5

    :goto_0
    check-cast v7, Lstream/video/sfu/models/AudioBitrate;

    if-eqz v7, :cond_2

    invoke-virtual {v7}, Lstream/video/sfu/models/AudioBitrate;->getBitrate()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v4, Lorg/webrtc/RtpParameters$Encoding;->maxBitrateBps:Ljava/lang/Integer;

    :cond_2
    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto/16 :goto_8

    :cond_3
    if-eqz v0, :cond_4

    invoke-static {v0}, Lj33/d;->e(Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;)Lstream/video/sfu/models/VideoDimension;

    move-result-object v3

    goto :goto_1

    :cond_4
    invoke-virtual {v2}, Lstream/video/sfu/models/PublishOption;->getVideo_dimension()Lstream/video/sfu/models/VideoDimension;

    move-result-object v3

    if-nez v3, :cond_5

    new-instance v6, Lstream/video/sfu/models/VideoDimension;

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/16 v7, 0x500

    const/16 v8, 0x2d0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lstream/video/sfu/models/VideoDimension;-><init>(IILne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, v6

    :cond_5
    :goto_1
    invoke-static {v3, v2}, Lj33/d;->a(Lstream/video/sfu/models/VideoDimension;Lstream/video/sfu/models/PublishOption;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v2}, Lstream/video/sfu/models/PublishOption;->getCodec()Lstream/video/sfu/models/Codec;

    move-result-object v4

    if-eqz v4, :cond_6

    invoke-virtual {v4}, Lstream/video/sfu/models/Codec;->getName()Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_6
    move-object v4, v5

    :goto_2
    invoke-static {v4}, Lj33/d;->c(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_10

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lj33/c;

    iget-object v7, v7, Lj33/c;->b:Ljava/lang/String;

    const-string v8, "f"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    goto :goto_3

    :cond_8
    move-object v6, v5

    :goto_3
    check-cast v6, Lj33/c;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lj33/c;

    iget-object v8, v8, Lj33/c;->b:Ljava/lang/String;

    const-string v9, "h"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    goto :goto_4

    :cond_a
    move-object v7, v5

    :goto_4
    check-cast v7, Lj33/c;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const-string v8, "q"

    if-eqz v4, :cond_c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v9, v4

    check-cast v9, Lj33/c;

    iget-object v9, v9, Lj33/c;->b:Ljava/lang/String;

    invoke-static {v9, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_b

    goto :goto_5

    :cond_c
    move-object v4, v5

    :goto_5
    check-cast v4, Lj33/c;

    const/16 v3, 0xfd

    if-eqz v6, :cond_d

    invoke-static {v6, v8, v3}, Lj33/c;->a(Lj33/c;Ljava/lang/String;I)Lj33/c;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto :goto_6

    :cond_d
    if-eqz v7, :cond_e

    invoke-static {v7, v8, v3}, Lj33/c;->a(Lj33/c;Ljava/lang/String;I)Lj33/c;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto :goto_6

    :cond_e
    if-eqz v4, :cond_f

    const/16 v3, 0xff

    invoke-static {v4, v5, v3}, Lj33/c;->a(Lj33/c;Ljava/lang/String;I)Lj33/c;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto :goto_6

    :cond_f
    move-object v3, v5

    :goto_6
    if-nez v3, :cond_10

    sget-object v3, Lm83/y;->w:Lm83/y;

    :cond_10
    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v3, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_12

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lj33/c;

    new-instance v7, Lorg/webrtc/RtpParameters$Encoding;

    iget-object v8, v6, Lj33/c;->b:Ljava/lang/String;

    iget-boolean v9, v6, Lj33/c;->a:Z

    iget-object v10, v6, Lj33/c;->h:Ljava/lang/Double;

    invoke-direct {v7, v8, v9, v10}, Lorg/webrtc/RtpParameters$Encoding;-><init>(Ljava/lang/String;ZLjava/lang/Double;)V

    iget-object v8, v6, Lj33/c;->g:Ljava/lang/String;

    iput-object v8, v7, Lorg/webrtc/RtpParameters$Encoding;->scalabilityMode:Ljava/lang/String;

    iget v8, v6, Lj33/c;->e:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    iput-object v8, v7, Lorg/webrtc/RtpParameters$Encoding;->maxBitrateBps:Ljava/lang/Integer;

    iget-object v6, v6, Lj33/c;->f:Ljava/lang/Integer;

    if-nez v6, :cond_11

    const/16 v6, 0x1e

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    :cond_11
    iput-object v6, v7, Lorg/webrtc/RtpParameters$Encoding;->maxFramerate:Ljava/lang/Integer;

    invoke-virtual {v2}, Lstream/video/sfu/models/PublishOption;->getMax_temporal_layers()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    iput-object v6, v7, Lorg/webrtc/RtpParameters$Encoding;->numTemporalLayers:Ljava/lang/Integer;

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_12
    move-object v3, v4

    :goto_8
    :try_start_0
    invoke-virtual {v1}, Le33/u;->f()Lb23/k;

    move-result-object v4

    iget-object v6, v4, Lb23/k;->c:Lb23/e;

    iget-object v7, v4, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->y:Lb23/g;

    invoke-interface {v6, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v9, ")"

    const-string v10, " transceiver. (trackID: "

    if-eqz v6, :cond_13

    :try_start_1
    iget-object v4, v4, Lb23/k;->b:Lb23/j;

    invoke-virtual {v2}, Lstream/video/sfu/models/PublishOption;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v6

    invoke-virtual/range {p3 .. p3}, Lorg/webrtc/MediaStreamTrack;->id()Ljava/lang/String;

    move-result-object v11

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "Adding "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ", sendEncodings: "

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v8, v7, v6, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_9

    :catch_0
    move-exception v0

    goto/16 :goto_c

    :cond_13
    :goto_9
    invoke-virtual {v1}, Le33/u;->f()Lb23/k;

    move-result-object v4

    iget-object v6, v4, Lb23/k;->c:Lb23/e;

    iget-object v7, v4, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v6, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_16

    iget-object v4, v4, Lb23/k;->b:Lb23/j;

    if-eqz v0, :cond_14

    iget v6, v0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->width:I

    iget v11, v0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->height:I

    iget-object v0, v0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->framerate:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, "x"

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, "@"

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "fps"

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_15

    :cond_14
    const-string v0, "null"

    :cond_15
    invoke-virtual {v2}, Lstream/video/sfu/models/PublishOption;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v6

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v11

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "Transceiver init details - captureFormat: "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", publishOption: "

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", encodings count: "

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v8, v7, v0, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_16
    move-object v0, v3

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v4, 0x0

    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_19

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v7, v4, 0x1

    if-ltz v4, :cond_18

    check-cast v6, Lorg/webrtc/RtpParameters$Encoding;

    invoke-virtual {v1}, Le33/u;->f()Lb23/k;

    move-result-object v8

    iget-object v11, v8, Lb23/k;->c:Lb23/e;

    iget-object v12, v8, Lb23/k;->a:Ljava/lang/String;

    sget-object v13, Lb23/g;->y:Lb23/g;

    invoke-interface {v11, v13, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_17

    iget-object v8, v8, Lb23/k;->b:Lb23/j;

    invoke-static {v6}, Lj33/d;->d(Lorg/webrtc/RtpParameters$Encoding;)Ljava/lang/String;

    move-result-object v6

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "  Encoding["

    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "]: "

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v8, v13, v12, v4, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_17
    move v4, v7

    goto :goto_a

    :cond_18
    invoke-static {}, Lwb3/f;->d0()V

    throw v5

    :cond_19
    invoke-virtual {v1}, Le33/u;->e()Lorg/webrtc/PeerConnection;

    move-result-object v0

    new-instance v4, Lorg/webrtc/RtpTransceiver$RtpTransceiverInit;

    sget-object v6, Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;->SEND_ONLY:Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;

    move-object/from16 v7, p1

    invoke-direct {v4, v6, v7, v3}, Lorg/webrtc/RtpTransceiver$RtpTransceiverInit;-><init>(Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;Ljava/util/List;Ljava/util/List;)V

    move-object/from16 v3, p3

    invoke-virtual {v0, v3, v4}, Lorg/webrtc/PeerConnection;->addTransceiver(Lorg/webrtc/MediaStreamTrack;Lorg/webrtc/RtpTransceiver$RtpTransceiverInit;)Lorg/webrtc/RtpTransceiver;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1, v0, v2}, Le33/n;->o(Lorg/webrtc/RtpTransceiver;Lstream/video/sfu/models/PublishOption;)V

    invoke-virtual {v1}, Le33/u;->f()Lb23/k;

    move-result-object v4

    iget-object v6, v4, Lb23/k;->c:Lb23/e;

    iget-object v7, v4, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->y:Lb23/g;

    invoke-interface {v6, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1b

    iget-object v4, v4, Lb23/k;->b:Lb23/j;

    invoke-virtual {v2}, Lstream/video/sfu/models/PublishOption;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v6

    invoke-virtual {v3}, Lorg/webrtc/MediaStreamTrack;->id()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lorg/webrtc/RtpTransceiver;->getSender()Lorg/webrtc/RtpSender;

    move-result-object v11

    if-eqz v11, :cond_1a

    invoke-virtual {v11}, Lorg/webrtc/RtpSender;->getParameters()Lorg/webrtc/RtpParameters;

    move-result-object v11

    if-eqz v11, :cond_1a

    iget-object v11, v11, Lorg/webrtc/RtpParameters;->encodings:Ljava/util/List;

    if-eqz v11, :cond_1a

    move-object v12, v11

    check-cast v12, Ljava/lang/Iterable;

    sget-object v16, Le33/b;->w:Le33/b;

    const/16 v17, 0x1f

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v11

    goto :goto_b

    :cond_1a
    move-object v11, v5

    :goto_b
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "Added "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", encodings: "

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v4, v8, v7, v3, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1b
    iget-object v3, v1, Le33/n;->F:Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v3, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v3, Ljava/util/Map;

    const-string v4, "cache"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lio/sentry/internal/debugmeta/c;->y(Lstream/video/sfu/models/PublishOption;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Li33/b;

    invoke-direct {v5, v0, v2}, Li33/b;-><init>(Lorg/webrtc/RtpTransceiver;Lstream/video/sfu/models/PublishOption;)V

    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :goto_c
    invoke-virtual {v1}, Le33/u;->f()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    iget-object v5, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->F:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1c

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    invoke-virtual {v2}, Lstream/video/sfu/models/PublishOption;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v7, "Failed to add transceiver for "

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v6, v5, v2, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1c
    return-void
.end method

.method public final o(Lorg/webrtc/RtpTransceiver;Lstream/video/sfu/models/PublishOption;)V
    .locals 6

    const-string v0, "Applied initial degradationPreference="

    invoke-virtual {p2}, Lstream/video/sfu/models/PublishOption;->getDegradation_preference()Lstream/video/sfu/models/DegradationPreference;

    move-result-object v1

    invoke-static {v1}, Lj33/b;->a(Lstream/video/sfu/models/DegradationPreference;)Lorg/webrtc/RtpParameters$DegradationPreference;

    move-result-object v1

    if-nez v1, :cond_0

    goto/16 :goto_0

    :cond_0
    :try_start_0
    invoke-virtual {p1}, Lorg/webrtc/RtpTransceiver;->getSender()Lorg/webrtc/RtpSender;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lorg/webrtc/RtpSender;->getParameters()Lorg/webrtc/RtpParameters;

    move-result-object v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    iget-object v3, v2, Lorg/webrtc/RtpParameters;->degradationPreference:Lorg/webrtc/RtpParameters$DegradationPreference;

    if-eq v3, v1, :cond_3

    iput-object v1, v2, Lorg/webrtc/RtpParameters;->degradationPreference:Lorg/webrtc/RtpParameters$DegradationPreference;

    invoke-virtual {p1, v2}, Lorg/webrtc/RtpSender;->setParameters(Lorg/webrtc/RtpParameters;)Z

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object p1

    iget-object v2, p1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    iget-object v4, p1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p1, Lb23/k;->b:Lb23/j;

    iget-object p1, p1, Lb23/k;->a:Ljava/lang/String;

    invoke-virtual {p2}, Lstream/video/sfu/models/PublishOption;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v4

    invoke-virtual {p2}, Lstream/video/sfu/models/PublishOption;->getId()I

    move-result p2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " for "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " (publishOptionId="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ")"

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    invoke-interface {v2, v3, p1, p2, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    sget-object p2, Lb23/i;->a:Lb23/i;

    sget-object p2, Lb23/i;->d:Lb23/e;

    sget-object v0, Lb23/g;->F:Lb23/g;

    const-string v1, "SafeCall"

    invoke-interface {p2, v0, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3

    sget-object p2, Lb23/i;->c:Lb23/j;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Exception occurred: "

    invoke-static {v3, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v0, v1, v2, p1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public final onIceConnectionChange(Lorg/webrtc/PeerConnection$IceConnectionState;)V
    .locals 3

    invoke-super {p0, p1}, Le33/u;->onIceConnectionChange(Lorg/webrtc/PeerConnection$IceConnectionState;)V

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Le33/a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    :goto_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Le33/n;->H:Lio/sentry/internal/debugmeta/c;

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Le33/i;

    invoke-direct {p1, p0, v1}, Le33/i;-><init>(Le33/n;Lq83/d;)V

    invoke-virtual {v2, p1}, Lio/sentry/internal/debugmeta/c;->E(Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_2
    new-instance p1, Le33/h;

    invoke-direct {p1, p0, v1}, Le33/h;-><init>(Le33/n;Lq83/d;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, p1}, Lio/sentry/internal/debugmeta/c;->E(Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_3
    iget-object p1, v2, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast p1, Lbc3/c2;

    if-eqz p1, :cond_4

    invoke-virtual {p1, v1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public final onRenegotiationNeeded()V
    .locals 4

    new-instance v0, La20/b;

    const/16 v1, 0xd

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2, v1}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v1, 0x3

    iget-object v3, p0, Le33/n;->z:Lbc3/c0;

    invoke-static {v3, v2, v2, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final p()V
    .locals 8

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    iget-object v1, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    const-string v4, "Stopping publishing all tracks"

    invoke-interface {v1, v2, v0, v4, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Le33/n;->F:Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v0}, Lio/sentry/internal/debugmeta/c;->x()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li33/b;

    :try_start_0
    iget-object v1, v1, Li33/b;->b:Lorg/webrtc/RtpTransceiver;

    invoke-virtual {v1}, Lorg/webrtc/RtpTransceiver;->stop()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->F:Lb23/g;

    const-string v5, "SafeCall"

    invoke-interface {v2, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v2, Lb23/i;->c:Lb23/j;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    const-string v7, "Exception occurred: "

    invoke-static {v7, v6}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v2, v4, v5, v6, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Le33/n;->F:Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v0}, Lio/sentry/internal/debugmeta/c;->x()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li33/b;

    :try_start_1
    iget-object v2, v1, Li33/b;->b:Lorg/webrtc/RtpTransceiver;

    invoke-virtual {v2}, Lorg/webrtc/RtpTransceiver;->stop()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v2

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v4

    iget-object v5, v4, Lb23/k;->c:Lb23/e;

    sget-object v6, Lb23/g;->E:Lb23/g;

    iget-object v7, v4, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v5, v6, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    iget-object v5, v4, Lb23/k;->b:Lb23/j;

    iget-object v4, v4, Lb23/k;->a:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    const-string v7, "Transceiver already stopped: "

    invoke-static {v7, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v5, v6, v4, v2, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    :goto_2
    :try_start_2
    iget-object v1, v1, Li33/b;->b:Lorg/webrtc/RtpTransceiver;

    invoke-virtual {v1}, Lorg/webrtc/RtpTransceiver;->dispose()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    :catch_2
    move-exception v1

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v2

    iget-object v4, v2, Lb23/k;->c:Lb23/e;

    sget-object v5, Lb23/g;->E:Lb23/g;

    iget-object v6, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v5, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v4, v2, Lb23/k;->b:Lb23/j;

    iget-object v2, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v6, "Transceiver already disposed: "

    invoke-static {v6, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v5, v2, v1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, Le33/u;->b()V

    return-void
.end method

.method public final q()Ljava/util/List;
    .locals 7

    sget-object v0, Lm83/y;->w:Lm83/y;

    :try_start_0
    iget-object v1, p0, Le33/n;->F:Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v1}, Lio/sentry/internal/debugmeta/c;->x()Ljava/util/ArrayList;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li33/b;

    iget-object v3, v3, Li33/b;->a:Lstream/video/sfu/models/PublishOption;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_1

    :cond_0
    move-object v0, v2

    goto :goto_2

    :goto_1
    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->F:Lb23/g;

    const-string v4, "SafeCall"

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v2, Lb23/i;->c:Lb23/j;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    const-string v6, "Exception occurred: "

    invoke-static {v6, v5}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v3, v4, v5, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_2
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final r(Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 10

    monitor-enter p0

    const/4 v0, 0x0

    if-nez p2, :cond_1

    :try_start_0
    iget-object p2, p0, Le33/u;->o:Lorg/webrtc/SessionDescription;

    if-eqz p2, :cond_0

    iget-object p2, p2, Lorg/webrtc/SessionDescription;->description:Ljava/lang/String;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_0
    move-object p2, v0

    :cond_1
    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Le33/n;->F:Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v2}, Lio/sentry/internal/debugmeta/c;->x()Ljava/util/ArrayList;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Li33/b;

    iget-object v5, v5, Li33/b;->b:Lorg/webrtc/RtpTransceiver;

    invoke-virtual {v5}, Lorg/webrtc/RtpTransceiver;->getSender()Lorg/webrtc/RtpSender;

    move-result-object v5

    invoke-virtual {v5}, Lorg/webrtc/RtpSender;->track()Lorg/webrtc/MediaStreamTrack;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lorg/webrtc/MediaStreamTrack;->isDisposed()Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li33/b;

    iget-object v4, v3, Li33/b;->a:Lstream/video/sfu/models/PublishOption;

    iget-object v3, v3, Li33/b;->b:Lorg/webrtc/RtpTransceiver;

    invoke-virtual {p0, p1, v3, v4, p2}, Le33/n;->z(Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;Lorg/webrtc/RtpTransceiver;Lstream/video/sfu/models/PublishOption;Ljava/lang/String;)Lstream/video/sfu/models/TrackInfo;

    move-result-object v3

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v5

    iget-object v6, v5, Lb23/k;->c:Lb23/e;

    sget-object v7, Lb23/g;->z:Lb23/g;

    iget-object v8, v5, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v6, v7, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4

    iget-object v6, v5, Lb23/k;->b:Lb23/j;

    iget-object v5, v5, Lb23/k;->a:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Announced track: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " -> "

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v6, v7, v5, v4, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :cond_5
    monitor-exit p0

    return-object v1

    :goto_3
    monitor-exit p0

    throw p1
.end method

.method public final s(Lorg/webrtc/MediaStreamTrack;)V
    .locals 7

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lorg/webrtc/MediaStreamTrack;->enabled()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1}, Lorg/webrtc/MediaStreamTrack;->state()Lorg/webrtc/MediaStreamTrack$State;

    move-result-object v4

    invoke-virtual {p1}, Lorg/webrtc/MediaStreamTrack;->id()Ljava/lang/String;

    move-result-object p1

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "[trackPublishing] Track: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v0, v2, v3, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final t(Ljava/lang/String;ZLs83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p3, Le33/d;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Le33/d;

    iget v1, v0, Le33/d;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le33/d;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Le33/d;

    invoke-direct {v0, p0, p3}, Le33/d;-><init>(Le33/n;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Le33/d;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le33/d;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p3, Le33/g;

    const/4 v2, 0x0

    invoke-direct {p3, p0, p2, p1, v2}, Le33/g;-><init>(Le33/n;ZLjava/lang/String;Lq83/d;)V

    iput v3, v0, Le33/d;->y:I

    iget-object p1, p0, Le33/n;->L:Ln53/x1;

    const-string p2, "publisherNegotiate"

    invoke-virtual {p1, p2, p3, v0}, Ln53/x1;->c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final u(Lstream/video/sfu/models/TrackType;)Lorg/webrtc/MediaStreamTrack;
    .locals 6

    iget-object v0, p0, Le33/n;->w:Lt23/x1;

    iget-object v1, p0, Le33/n;->x:Le33/j0;

    const-string v2, "toString(...)"

    const-string v3, "trackType"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Le33/a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    const/4 v4, 0x1

    if-eq v3, v4, :cond_3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_2

    const/4 v4, 0x3

    if-ne v3, v4, :cond_1

    invoke-static {v2}, Ldc/b;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v2, v0, Lt23/x1;->p:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v3, v0, Lt23/x1;->m:Lorg/webrtc/VideoSource;

    if-nez v3, :cond_0

    iget-object v3, v0, Lt23/x1;->b:Lt23/c0;

    invoke-virtual {v3}, Lt23/c0;->j()Le33/j0;

    move-result-object v3

    iget-object v4, v0, Lt23/x1;->k:Lq33/b;

    const-string v5, "filterVideoProcessor"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Le33/j0;->b()Lorg/webrtc/PeerConnectionFactory;

    move-result-object v3

    const/4 v5, 0x1

    invoke-virtual {v3, v5}, Lorg/webrtc/PeerConnectionFactory;->createVideoSource(Z)Lorg/webrtc/VideoSource;

    move-result-object v3

    invoke-virtual {v3, v4}, Lorg/webrtc/VideoSource;->setVideoProcessor(Lorg/webrtc/VideoProcessor;)V

    iput-object v3, v0, Lt23/x1;->m:Lorg/webrtc/VideoSource;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, v0, Lt23/x1;->m:Lorg/webrtc/VideoSource;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    invoke-virtual {v1, p1, v0}, Le33/j0;->e(Ljava/lang/String;Lorg/webrtc/VideoSource;)Lorg/webrtc/VideoTrack;

    move-result-object p1

    return-object p1

    :goto_1
    monitor-exit v2

    throw p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown track type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v2}, Ldc/b;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Lt23/x1;->c()Lorg/webrtc/VideoSource;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Le33/j0;->e(Ljava/lang/String;Lorg/webrtc/VideoSource;)Lorg/webrtc/VideoTrack;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {v2}, Ldc/b;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Lt23/x1;->b()Lorg/webrtc/AudioSource;

    move-result-object v0

    invoke-virtual {v1}, Le33/j0;->b()Lorg/webrtc/PeerConnectionFactory;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lorg/webrtc/PeerConnectionFactory;->createAudioTrack(Ljava/lang/String;Lorg/webrtc/AudioSource;)Lorg/webrtc/AudioTrack;

    move-result-object p1

    const-string v0, "createAudioTrack(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final v(Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;Ls83/c;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p4, Le33/j;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Le33/j;

    iget v1, v0, Le33/j;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le33/j;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Le33/j;

    invoke-direct {v0, p0, p4}, Le33/j;-><init>(Le33/n;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Le33/j;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le33/j;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p4, Ll83/n;

    iget-object p1, p4, Ll83/n;->w:Ljava/lang/Object;

    move-object v5, p0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v4, Le33/k;

    const/4 v9, 0x0

    move-object v5, p0

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    invoke-direct/range {v4 .. v9}, Le33/k;-><init>(Le33/n;Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;Lq83/d;)V

    iput v3, v0, Le33/j;->y:I

    iget-object p1, v5, Le33/n;->L:Ln53/x1;

    const-string p2, "publishStream"

    invoke-virtual {p1, p2, v4, v0}, Ln53/x1;->c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    instance-of p2, p1, Ll83/m;

    if-eqz p2, :cond_4

    const/4 p1, 0x0

    :cond_4
    return-object p1
.end method

.method public final w(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Le33/l;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Le33/l;

    iget v1, v0, Le33/l;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le33/l;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Le33/l;

    invoke-direct {v0, p0, p2}, Le33/l;-><init>(Le33/n;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Le33/l;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le33/l;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p1, p2, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, La33/c;

    const/4 v2, 0x0

    const/4 v4, 0x4

    invoke-direct {p2, p0, p1, v2, v4}, La33/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v3, v0, Le33/l;->y:I

    iget-object p1, p0, Le33/n;->M:Lgm/r;

    const-string v2, "restartIce"

    invoke-virtual {p1, v2, p2, v0}, Lgm/r;->N(Ljava/lang/String;La33/c;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final x(Ls83/c;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p1, Le33/m;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Le33/m;

    iget v1, v0, Le33/m;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le33/m;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Le33/m;

    invoke-direct {v0, p0, p1}, Le33/m;-><init>(Le33/n;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Le33/m;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le33/m;->y:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_5

    :catch_0
    move-exception p1

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Le33/u;->v:Lb30/m;

    if-eqz p1, :cond_a

    iget-object v2, p0, Le33/n;->F:Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v2}, Lio/sentry/internal/debugmeta/c;->x()Ljava/util/ArrayList;

    move-result-object v2

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-static {v5}, Lm83/g0;->W(I)I

    move-result v5

    const/16 v6, 0x10

    if-ge v5, v6, :cond_3

    move v5, v6

    :cond_3
    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6, v5}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li33/b;

    iget-object v7, v5, Li33/b;->b:Lorg/webrtc/RtpTransceiver;

    invoke-virtual {v7}, Lorg/webrtc/RtpTransceiver;->getSender()Lorg/webrtc/RtpSender;

    move-result-object v7

    invoke-virtual {v7}, Lorg/webrtc/RtpSender;->track()Lorg/webrtc/MediaStreamTrack;

    move-result-object v7

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Lorg/webrtc/MediaStreamTrack;->id()Ljava/lang/String;

    move-result-object v7

    goto :goto_2

    :cond_4
    move-object v7, v4

    :goto_2
    iget-object v5, v5, Li33/b;->a:Lstream/video/sfu/models/PublishOption;

    invoke-virtual {v5}, Lstream/video/sfu/models/PublishOption;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v5

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_5
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_6
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    if-eqz v7, :cond_6

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v2, v7, v6}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_7
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v6

    invoke-static {v6}, Lm83/g0;->W(I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v7, Ljava/lang/String;

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v5, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_8
    iput v3, v0, Le33/m;->y:I

    new-instance v2, Lbc3/m;

    invoke-static {v0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v2}, Lbc3/m;->s()V

    iget-object v0, p1, Lb30/m;->x:Ljava/lang/Object;

    check-cast v0, Lorg/webrtc/PeerConnection;

    new-instance v3, Lgm/r;

    const/4 v6, 0x4

    invoke-direct {v3, p1, v5, v2, v6}, Lgm/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v0, v3}, Lorg/webrtc/PeerConnection;->getStats(Lorg/webrtc/RTCStatsCollectorCallback;)V

    invoke-virtual {v2}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v1, :cond_9

    return-object v1

    :cond_9
    :goto_5
    check-cast p1, Lh33/a;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_6
    sget-object v0, Lb23/i;->a:Lb23/i;

    sget-object v0, Lb23/i;->d:Lb23/e;

    sget-object v1, Lb23/g;->F:Lb23/g;

    const-string v2, "SafeCall"

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    sget-object v0, Lb23/i;->c:Lb23/j;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    const-string v5, "Exception occurred: "

    invoke-static {v5, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3, p1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_a
    return-object v4
.end method

.method public final y(Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;Ljava/util/List;)V
    .locals 7

    const-string v0, "publishOptions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    iget-object v1, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    const-string v4, "New publish options: "

    invoke-static {v4, p2}, Ldc/b;->q(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v2, v0, v4, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lstream/video/sfu/models/PublishOption;

    invoke-virtual {v0}, Lstream/video/sfu/models/PublishOption;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v1

    const-string v2, "trackType"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Le33/n;->F:Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v2}, Lio/sentry/internal/debugmeta/c;->x()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li33/b;

    iget-object v5, v4, Li33/b;->a:Lstream/video/sfu/models/PublishOption;

    invoke-virtual {v5}, Lstream/video/sfu/models/PublishOption;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v5

    if-ne v5, v1, :cond_2

    iget-object v4, v4, Li33/b;->b:Lorg/webrtc/RtpTransceiver;

    invoke-virtual {v4}, Lorg/webrtc/RtpTransceiver;->getSender()Lorg/webrtc/RtpSender;

    move-result-object v4

    invoke-virtual {v4}, Lorg/webrtc/RtpSender;->track()Lorg/webrtc/MediaStreamTrack;

    move-result-object v4

    if-nez v4, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v4}, Lorg/webrtc/MediaStreamTrack;->state()Lorg/webrtc/MediaStreamTrack$State;

    move-result-object v5

    sget-object v6, Lorg/webrtc/MediaStreamTrack$State;->LIVE:Lorg/webrtc/MediaStreamTrack$State;

    if-ne v5, v6, :cond_2

    invoke-virtual {v4}, Lorg/webrtc/MediaStreamTrack;->enabled()Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v1, p0, Le33/n;->F:Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v1, v0}, Lio/sentry/internal/debugmeta/c;->r(Lstream/video/sfu/models/PublishOption;)Lorg/webrtc/RtpTransceiver;

    move-result-object v1

    if-eqz v1, :cond_4

    const/4 v1, 0x1

    goto :goto_2

    :cond_4
    const/4 v1, 0x0

    :goto_2
    if-nez v1, :cond_1

    invoke-virtual {v0}, Lstream/video/sfu/models/PublishOption;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v1

    invoke-virtual {p0, v1}, Le33/n;->u(Lstream/video/sfu/models/TrackType;)Lorg/webrtc/MediaStreamTrack;

    move-result-object v1

    sget-object v2, Lm83/y;->w:Lm83/y;

    if-nez p1, :cond_5

    iget-object v4, p0, Le33/n;->J:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    goto :goto_3

    :cond_5
    move-object v4, p1

    :goto_3
    invoke-virtual {p0, v2, v4, v1, v0}, Le33/n;->n(Ljava/util/List;Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;Lorg/webrtc/MediaStreamTrack;Lstream/video/sfu/models/PublishOption;)V

    goto :goto_0

    :cond_6
    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    sget-object v4, Lb23/g;->y:Lb23/g;

    iget-object v5, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Not publishing "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v4, v0, v1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_0

    :cond_7
    iget-object p1, p0, Le33/n;->F:Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1}, Lio/sentry/internal/debugmeta/c;->x()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_8
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Li33/b;

    iget-object v0, p2, Li33/b;->a:Lstream/video/sfu/models/PublishOption;

    iget-object p2, p2, Li33/b;->b:Lorg/webrtc/RtpTransceiver;

    iget-object v1, p0, Le33/n;->F:Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v1, v0}, Lio/sentry/internal/debugmeta/c;->r(Lstream/video/sfu/models/PublishOption;)Lorg/webrtc/RtpTransceiver;

    move-result-object v1

    if-eqz v1, :cond_8

    :try_start_0
    invoke-virtual {p2}, Lorg/webrtc/RtpTransceiver;->stop()V

    invoke-virtual {p2}, Lorg/webrtc/RtpTransceiver;->dispose()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    move-exception p2

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->F:Lb23/g;

    const-string v3, "SafeCall"

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    sget-object v1, Lb23/i;->c:Lb23/j;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    const-string v5, "Exception occurred: "

    invoke-static {v5, v4}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v2, v3, v4, p2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    :goto_5
    iget-object p2, p0, Le33/n;->F:Lio/sentry/internal/debugmeta/c;

    iget-object p2, p2, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast p2, Ljava/util/Map;

    invoke-static {v0}, Lio/sentry/internal/debugmeta/c;->y(Lstream/video/sfu/models/PublishOption;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_a
    return-void
.end method

.method public final z(Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;Lorg/webrtc/RtpTransceiver;Lstream/video/sfu/models/PublishOption;Ljava/lang/String;)Lstream/video/sfu/models/TrackInfo;
    .locals 50

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    invoke-virtual/range {p2 .. p2}, Lorg/webrtc/RtpTransceiver;->getSender()Lorg/webrtc/RtpSender;

    move-result-object v3

    invoke-virtual {v3}, Lorg/webrtc/RtpSender;->track()Lorg/webrtc/MediaStreamTrack;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lstream/video/sfu/models/PublishOption;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v4

    sget-object v5, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_SCREEN_SHARE:Lstream/video/sfu/models/TrackType;

    if-ne v4, v5, :cond_0

    invoke-virtual {v1}, Lstream/video/sfu/models/PublishOption;->getVideo_dimension()Lstream/video/sfu/models/VideoDimension;

    move-result-object v4

    if-nez v4, :cond_2

    iget-object v4, v0, Le33/n;->I:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    invoke-static {v4}, Lj33/d;->e(Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;)Lstream/video/sfu/models/VideoDimension;

    move-result-object v4

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    invoke-static/range {p1 .. p1}, Lj33/d;->e(Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;)Lstream/video/sfu/models/VideoDimension;

    move-result-object v4

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lstream/video/sfu/models/PublishOption;->getVideo_dimension()Lstream/video/sfu/models/VideoDimension;

    move-result-object v4

    if-nez v4, :cond_2

    iget-object v4, v0, Le33/n;->J:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    invoke-static {v4}, Lj33/d;->e(Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;)Lstream/video/sfu/models/VideoDimension;

    move-result-object v4

    :cond_2
    :goto_0
    invoke-virtual {v3}, Lorg/webrtc/MediaStreamTrack;->state()Lorg/webrtc/MediaStreamTrack$State;

    move-result-object v5

    sget-object v6, Lorg/webrtc/MediaStreamTrack$State;->LIVE:Lorg/webrtc/MediaStreamTrack$State;

    if-ne v5, v6, :cond_3

    const/4 v5, 0x1

    goto :goto_1

    :cond_3
    const/4 v5, 0x0

    :goto_1
    invoke-virtual {v1}, Lstream/video/sfu/models/PublishOption;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v6

    invoke-static {v6}, Lj33/d;->b(Lstream/video/sfu/models/TrackType;)Z

    move-result v6

    iget-object v9, v0, Le33/n;->F:Lio/sentry/internal/debugmeta/c;

    const/4 v10, 0x0

    if-nez v6, :cond_6

    if-eqz v5, :cond_5

    invoke-virtual {v1}, Lstream/video/sfu/models/PublishOption;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v6

    invoke-static {v6}, Lj33/d;->b(Lstream/video/sfu/models/TrackType;)Z

    move-result v6

    if-eqz v6, :cond_4

    goto :goto_2

    :cond_4
    invoke-static {v4, v1}, Lj33/d;->a(Lstream/video/sfu/models/VideoDimension;Lstream/video/sfu/models/PublishOption;)Ljava/util/ArrayList;

    move-result-object v4

    goto :goto_3

    :cond_5
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v9, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v4, Ljava/util/Map;

    invoke-static {v1}, Lio/sentry/internal/debugmeta/c;->y(Lstream/video/sfu/models/PublishOption;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li33/a;

    if-eqz v4, :cond_6

    iget-object v4, v4, Li33/a;->b:Ljava/util/List;

    goto :goto_3

    :cond_6
    :goto_2
    move-object v4, v10

    :goto_3
    sget-object v6, Lm83/y;->w:Lm83/y;

    if-nez v4, :cond_7

    move-object v11, v6

    goto :goto_4

    :cond_7
    move-object v11, v4

    :goto_4
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v12, v9, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v12, Ljava/util/Map;

    invoke-static {v1}, Lio/sentry/internal/debugmeta/c;->y(Lstream/video/sfu/models/PublishOption;)Ljava/lang/String;

    move-result-object v13

    invoke-interface {v12, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Li33/a;

    if-eqz v13, :cond_8

    iput-object v11, v13, Li33/a;->b:Ljava/util/List;

    goto :goto_5

    :cond_8
    invoke-static {v1}, Lio/sentry/internal/debugmeta/c;->y(Lstream/video/sfu/models/PublishOption;)Ljava/lang/String;

    move-result-object v13

    new-instance v14, Li33/a;

    invoke-direct {v14, v1, v11}, Li33/a;-><init>(Lstream/video/sfu/models/PublishOption;Ljava/util/List;)V

    invoke-interface {v12, v13, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_5
    invoke-virtual {v3}, Lorg/webrtc/MediaStreamTrack;->id()Ljava/lang/String;

    move-result-object v16

    if-nez v4, :cond_9

    move-object v4, v6

    :cond_9
    check-cast v4, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v4, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v3, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lj33/c;

    iget-object v12, v11, Lj33/c;->b:Ljava/lang/String;

    iget v13, v11, Lj33/c;->e:I

    iget-object v14, v11, Lj33/c;->f:Ljava/lang/Integer;

    if-eqz v14, :cond_a

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    move/from16 v21, v14

    goto :goto_7

    :cond_a
    const/16 v21, 0x0

    :goto_7
    iget-object v14, v11, Lj33/c;->b:Ljava/lang/String;

    const-string v15, "q"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_b

    sget-object v14, Lstream/video/sfu/models/VideoQuality;->VIDEO_QUALITY_LOW_UNSPECIFIED:Lstream/video/sfu/models/VideoQuality;

    :goto_8
    move-object/from16 v22, v14

    goto :goto_9

    :cond_b
    const-string v15, "h"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_c

    sget-object v14, Lstream/video/sfu/models/VideoQuality;->VIDEO_QUALITY_MID:Lstream/video/sfu/models/VideoQuality;

    goto :goto_8

    :cond_c
    sget-object v14, Lstream/video/sfu/models/VideoQuality;->VIDEO_QUALITY_HIGH:Lstream/video/sfu/models/VideoQuality;

    goto :goto_8

    :goto_9
    new-instance v19, Lstream/video/sfu/models/VideoDimension;

    iget v14, v11, Lj33/c;->c:I

    iget v11, v11, Lj33/c;->d:I

    const/16 v27, 0x4

    const/16 v28, 0x0

    const/16 v26, 0x0

    move/from16 v25, v11

    move/from16 v24, v14

    move-object/from16 v23, v19

    invoke-direct/range {v23 .. v28}, Lstream/video/sfu/models/VideoDimension;-><init>(IILne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v17, Lstream/video/sfu/models/VideoLayer;

    const/16 v24, 0x20

    const/16 v25, 0x0

    const/16 v23, 0x0

    move-object/from16 v18, v12

    move/from16 v20, v13

    invoke-direct/range {v17 .. v25}, Lstream/video/sfu/models/VideoLayer;-><init>(Ljava/lang/String;Lstream/video/sfu/models/VideoDimension;IILstream/video/sfu/models/VideoQuality;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v11, v17

    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_d
    invoke-virtual {v1}, Lstream/video/sfu/models/PublishOption;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v17

    iget-object v4, v9, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v4, Ljava/util/Map;

    invoke-interface {v4}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v9, 0x0

    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_10

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    if-ltz v9, :cond_f

    check-cast v11, Li33/b;

    iget-object v11, v11, Li33/b;->a:Lstream/video/sfu/models/PublishOption;

    invoke-static {v11}, Lio/sentry/internal/debugmeta/c;->y(Lstream/video/sfu/models/PublishOption;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v1}, Lio/sentry/internal/debugmeta/c;->y(Lstream/video/sfu/models/PublishOption;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_e

    goto :goto_b

    :cond_e
    add-int/lit8 v9, v9, 0x1

    goto :goto_a

    :cond_f
    invoke-static {}, Lwb3/f;->d0()V

    throw v10

    :cond_10
    const/4 v9, -0x1

    :goto_b
    invoke-virtual/range {p2 .. p2}, Lorg/webrtc/RtpTransceiver;->getMid()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Le33/u;->f()Lb23/k;

    move-result-object v11

    iget-object v12, v11, Lb23/k;->c:Lb23/e;

    sget-object v13, Lb23/g;->x:Lb23/g;

    iget-object v14, v11, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v12, v13, v14}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_11

    iget-object v11, v11, Lb23/k;->b:Lb23/j;

    const-string v12, "Transceiver mid: "

    invoke-static {v12, v4}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v11, v13, v14, v12, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_11
    if-eqz v4, :cond_12

    :goto_c
    move-object/from16 v21, v3

    move-object/from16 v19, v4

    move/from16 v22, v5

    :goto_d
    const/16 v20, 0x1

    goto/16 :goto_4a

    :cond_12
    if-ltz v9, :cond_13

    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_c

    :cond_13
    if-nez v2, :cond_14

    :goto_e
    move-object/from16 v21, v3

    move/from16 v22, v5

    goto/16 :goto_49

    :cond_14
    invoke-virtual/range {p2 .. p2}, Lorg/webrtc/RtpTransceiver;->getSender()Lorg/webrtc/RtpSender;

    move-result-object v4

    invoke-virtual {v4}, Lorg/webrtc/RtpSender;->track()Lorg/webrtc/MediaStreamTrack;

    move-result-object v4

    if-nez v4, :cond_15

    goto :goto_e

    :cond_15
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v21, v3

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 p2, v4

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    move/from16 v22, v5

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v23, v5

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    const-string v24, "\r\n"

    move-object/from16 v25, v4

    filled-new-array/range {v24 .. v24}, [Ljava/lang/String;

    move-result-object v4

    move-object/from16 v24, v3

    const/4 v3, 0x6

    invoke-static {v2, v4, v3}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v26

    if-eqz v26, :cond_17

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v27, v3

    check-cast v27, Ljava/lang/String;

    invoke-virtual/range {v27 .. v27}, Ljava/lang/String;->length()I

    move-result v27

    if-lez v27, :cond_16

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_16
    const/4 v3, 0x6

    goto :goto_f

    :cond_17
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_9f

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_10
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_96

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    move-object/from16 p4, v2

    const/4 v2, 0x2

    if-lt v4, v2, :cond_95

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v4, 0x3d

    if-ne v2, v4, :cond_95

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/4 v4, 0x2

    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "substring(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln53/o0;

    move-object/from16 v28, v1

    const/16 v1, 0x76

    if-ne v2, v1, :cond_1b

    sget-object v1, Ln53/c0;->a:Lyb3/p;

    invoke-virtual {v1, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v1

    if-nez v1, :cond_18

    move-object/from16 v29, v0

    const/4 v2, 0x0

    goto :goto_11

    :cond_18
    invoke-virtual {v1}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v2, Ln53/t1;

    move-object/from16 v29, v0

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-direct {v2, v0, v1}, Ln53/t1;-><init>(J)V

    :goto_11
    if-eqz v2, :cond_19

    if-eqz v4, :cond_19

    iput-object v2, v4, Ln53/o0;->a:Ln53/t1;

    :cond_19
    :goto_12
    move-object v0, v7

    move-object v2, v8

    :cond_1a
    :goto_13
    move-object/from16 v3, v23

    move-object/from16 v8, v28

    move-object/from16 v7, v29

    goto/16 :goto_42

    :cond_1b
    move-object/from16 v29, v0

    const/16 v0, 0x6f

    if-ne v2, v0, :cond_1d

    sget-object v0, Ln53/c0;->b:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_1c

    const/4 v0, 0x0

    goto :goto_14

    :cond_1c
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Lyb3/l;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v31, v2

    check-cast v31, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Lyb3/l;

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v3

    check-cast v3, Lyb3/l;

    const/4 v1, 0x3

    invoke-virtual {v3, v1}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v3

    check-cast v3, Lyb3/l;

    move-object/from16 v27, v0

    const/4 v0, 0x4

    invoke-virtual {v3, v0}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v36, v0

    check-cast v36, Ljava/lang/String;

    invoke-virtual/range {v27 .. v27}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v3, 0x5

    invoke-virtual {v0, v3}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual/range {v27 .. v27}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v3

    check-cast v3, Lyb3/l;

    move-object/from16 v27, v0

    const/4 v0, 0x6

    invoke-virtual {v3, v0}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v39, v3

    check-cast v39, Ljava/lang/String;

    new-instance v30, Ln53/v0;

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v32

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v34

    invoke-static/range {v27 .. v27}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v37

    invoke-direct/range {v30 .. v39}, Ln53/v0;-><init>(Ljava/lang/String;JJLjava/lang/String;JLjava/lang/String;)V

    move-object/from16 v0, v30

    :goto_14
    if-eqz v0, :cond_19

    if-eqz v4, :cond_19

    iput-object v0, v4, Ln53/o0;->b:Ln53/v0;

    goto/16 :goto_12

    :cond_1d
    const/16 v0, 0x73

    if-ne v2, v0, :cond_1f

    sget-object v0, Ln53/c0;->c:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_1e

    const/4 v1, 0x0

    goto :goto_15

    :cond_1e
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Ln53/u0;

    invoke-direct {v1, v0}, Ln53/u0;-><init>(Ljava/lang/String;)V

    :goto_15
    if-eqz v1, :cond_19

    if-eqz v4, :cond_19

    iput-object v1, v4, Ln53/o0;->c:Ln53/u0;

    goto/16 :goto_12

    :cond_1f
    const/16 v0, 0x69

    if-ne v2, v0, :cond_21

    sget-object v0, Ln53/c0;->d:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_20

    const/4 v1, 0x0

    goto :goto_16

    :cond_20
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Ln53/t;

    invoke-direct {v1, v0}, Ln53/t;-><init>(Ljava/lang/String;)V

    :goto_16
    if-eqz v1, :cond_19

    if-eqz v4, :cond_19

    iput-object v1, v4, Ln53/o0;->d:Ln53/t;

    goto/16 :goto_12

    :cond_21
    const/16 v0, 0x75

    if-ne v2, v0, :cond_23

    sget-object v0, Ln53/c0;->e:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_22

    const/4 v1, 0x0

    goto :goto_17

    :cond_22
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Ln53/s1;

    invoke-direct {v1, v0}, Ln53/s1;-><init>(Ljava/lang/String;)V

    :goto_17
    if-eqz v1, :cond_19

    if-eqz v4, :cond_19

    iput-object v1, v4, Ln53/o0;->e:Ln53/s1;

    goto/16 :goto_12

    :cond_23
    const/16 v0, 0x65

    if-ne v2, v0, :cond_25

    sget-object v0, Ln53/c0;->f:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_24

    const/4 v1, 0x0

    goto :goto_18

    :cond_24
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Ln53/v;

    invoke-direct {v1, v0}, Ln53/v;-><init>(Ljava/lang/String;)V

    :goto_18
    if-eqz v1, :cond_19

    if-eqz v4, :cond_19

    iput-object v1, v4, Ln53/o0;->f:Ln53/v;

    goto/16 :goto_12

    :cond_25
    const/16 v0, 0x70

    if-ne v2, v0, :cond_27

    sget-object v0, Ln53/c0;->g:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_26

    const/4 v1, 0x0

    goto :goto_19

    :cond_26
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Ln53/w0;

    invoke-direct {v1, v0}, Ln53/w0;-><init>(Ljava/lang/String;)V

    :goto_19
    if-eqz v1, :cond_19

    if-eqz v4, :cond_19

    iput-object v1, v4, Ln53/o0;->g:Ln53/w0;

    goto/16 :goto_12

    :cond_27
    const/16 v0, 0x7a

    if-ne v2, v0, :cond_29

    sget-object v0, Ln53/c0;->h:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_28

    const/4 v1, 0x0

    goto :goto_1a

    :cond_28
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Ln53/p1;

    invoke-direct {v1, v0}, Ln53/p1;-><init>(Ljava/lang/String;)V

    :goto_1a
    if-eqz v1, :cond_19

    if-eqz v4, :cond_19

    iput-object v1, v4, Ln53/o0;->h:Ln53/p1;

    goto/16 :goto_12

    :cond_29
    const/16 v0, 0x72

    if-ne v2, v0, :cond_2b

    sget-object v0, Ln53/c0;->i:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_2a

    const/4 v1, 0x0

    goto :goto_1b

    :cond_2a
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Ln53/z0;

    invoke-direct {v1, v0}, Ln53/z0;-><init>(Ljava/lang/String;)V

    :goto_1b
    if-eqz v1, :cond_19

    if-eqz v4, :cond_19

    iput-object v1, v4, Ln53/o0;->i:Ln53/z0;

    goto/16 :goto_12

    :cond_2b
    const/16 v0, 0x74

    if-ne v2, v0, :cond_2e

    sget-object v0, Ln53/c0;->j:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_2c

    move-object/from16 v31, v7

    move-object/from16 v32, v8

    const/4 v2, 0x0

    goto :goto_1c

    :cond_2c
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v3, 0x2

    invoke-virtual {v0, v3}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v2, Ln53/q1;

    move-object v3, v0

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    move-object/from16 v31, v7

    move-object/from16 v32, v8

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v7

    invoke-direct {v2, v0, v1, v7, v8}, Ln53/q1;-><init>(JJ)V

    :goto_1c
    if-eqz v2, :cond_2d

    if-eqz v4, :cond_2d

    iput-object v2, v4, Ln53/o0;->j:Ln53/q1;

    :cond_2d
    :goto_1d
    move-object/from16 v3, v23

    move-object/from16 v8, v28

    move-object/from16 v7, v29

    move-object/from16 v0, v31

    :goto_1e
    move-object/from16 v2, v32

    goto/16 :goto_42

    :cond_2e
    move-object/from16 v31, v7

    move-object/from16 v32, v8

    const/16 v0, 0x63

    if-ne v2, v0, :cond_30

    sget-object v0, Ln53/c0;->k:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_2f

    const/4 v2, 0x0

    goto :goto_1f

    :cond_2f
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v3, 0x2

    invoke-virtual {v0, v3}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v2, Ln53/o;

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v7

    invoke-direct {v2, v7, v8, v0}, Ln53/o;-><init>(JLjava/lang/String;)V

    :goto_1f
    if-eqz v2, :cond_2d

    if-eqz v4, :cond_2d

    iput-object v2, v4, Ln53/o0;->k:Ln53/o;

    goto :goto_1d

    :cond_30
    const/16 v0, 0x62

    if-ne v2, v0, :cond_33

    sget-object v0, Ln53/c0;->l:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_31

    const/4 v2, 0x0

    goto :goto_20

    :cond_31
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v3, 0x2

    invoke-virtual {v0, v3}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v2, Ln53/h;

    invoke-direct {v2, v1, v0}, Ln53/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :goto_20
    if-eqz v2, :cond_2d

    if-eqz v4, :cond_32

    iget-object v0, v4, Ln53/o0;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1d

    :cond_32
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1d

    :cond_33
    const/16 v0, 0x6d

    if-ne v2, v0, :cond_35

    sget-object v0, Ln53/c0;->m:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_34

    const/4 v0, 0x0

    goto :goto_21

    :cond_34
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v34, v1

    check-cast v34, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Lyb3/l;

    const/4 v3, 0x2

    invoke-virtual {v1, v3}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Lyb3/l;

    const/4 v3, 0x3

    invoke-virtual {v2, v3}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v35, v2

    check-cast v35, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v38, v0

    check-cast v38, Ljava/lang/String;

    new-instance v33, Ln53/r0;

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v36

    invoke-direct/range {v33 .. v38}, Ln53/r0;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    move-object/from16 v0, v33

    :goto_21
    if-eqz v0, :cond_2d

    new-instance v1, Ln53/o0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Ln53/o0;->l:Ljava/util/ArrayList;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Ln53/o0;->n:Ljava/util/ArrayList;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Ln53/o0;->o:Ljava/util/ArrayList;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Ln53/o0;->r:Ljava/util/ArrayList;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Ln53/o0;->s:Ljava/util/ArrayList;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Ln53/o0;->t:Ljava/util/ArrayList;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Ln53/o0;->v:Ljava/util/ArrayList;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Ln53/o0;->H:Ljava/util/ArrayList;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Ln53/o0;->L:Ljava/util/ArrayList;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Ln53/o0;->M:Ljava/util/ArrayList;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Ln53/o0;->O:Ljava/util/ArrayList;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Ln53/o0;->T:Ljava/util/ArrayList;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Ln53/o0;->U:Ljava/util/ArrayList;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Ln53/o0;->d0:Ljava/util/ArrayList;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v1, Ln53/o0;->l0:Ljava/util/ArrayList;

    iput-object v0, v1, Ln53/o0;->m:Ln53/r0;

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1d

    :cond_35
    const/16 v0, 0x61

    if-ne v2, v0, :cond_2d

    sget-object v0, Ln53/c0;->n:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_36

    const/4 v0, 0x0

    goto :goto_22

    :cond_36
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Lyb3/l;

    const/4 v7, 0x2

    invoke-virtual {v2, v7}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v36, v2

    check-cast v36, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Lyb3/l;

    const/4 v7, 0x3

    invoke-virtual {v2, v7}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v7, 0x4

    invoke-virtual {v0, v7}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v33, Ln53/g1;

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v34

    invoke-static {v2}, Lvp/c;->p0(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v37

    invoke-static {v0}, Lvp/c;->q0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v38

    invoke-direct/range {v33 .. v38}, Ln53/g1;-><init>(JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V

    move-object/from16 v0, v33

    :goto_22
    if-eqz v0, :cond_38

    if-eqz v4, :cond_37

    iget-object v1, v4, Ln53/o0;->n:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1d

    :cond_37
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1d

    :cond_38
    sget-object v0, Ln53/c0;->o:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_39

    const/4 v2, 0x0

    goto :goto_23

    :cond_39
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v7, 0x2

    invoke-virtual {v0, v7}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v2, Ln53/a0;

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v7

    invoke-direct {v2, v7, v8, v0}, Ln53/a0;-><init>(JLjava/lang/String;)V

    :goto_23
    if-eqz v2, :cond_3b

    if-eqz v4, :cond_3a

    iget-object v0, v4, Ln53/o0;->o:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1d

    :cond_3a
    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1d

    :cond_3b
    sget-object v0, Ln53/c0;->p:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_3c

    const/4 v1, 0x0

    goto :goto_24

    :cond_3c
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Ln53/r;

    invoke-direct {v1, v0}, Ln53/r;-><init>(Ljava/lang/String;)V

    :goto_24
    if-eqz v1, :cond_3d

    if-eqz v4, :cond_2d

    iput-object v1, v4, Ln53/o0;->p:Ln53/r;

    goto/16 :goto_1d

    :cond_3d
    sget-object v0, Ln53/c0;->q:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_3e

    const/4 v0, 0x0

    goto :goto_25

    :cond_3e
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Lyb3/l;

    const/4 v7, 0x2

    invoke-virtual {v2, v7}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v7

    check-cast v7, Lyb3/l;

    const/4 v8, 0x3

    invoke-virtual {v7, v8}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v8, 0x4

    invoke-virtual {v0, v8}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v33, Ln53/b1;

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v34

    invoke-static {v2}, Lvp/c;->q0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v36

    invoke-static {v7}, Lvp/c;->p0(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v37

    invoke-static {v0}, Lvp/c;->q0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v38

    invoke-direct/range {v33 .. v38}, Ln53/b1;-><init>(JLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V

    move-object/from16 v0, v33

    :goto_25
    if-eqz v0, :cond_3f

    if-eqz v4, :cond_2d

    iput-object v0, v4, Ln53/o0;->q:Ln53/b1;

    goto/16 :goto_1d

    :cond_3f
    sget-object v0, Ln53/c0;->r:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_40

    const/4 v2, 0x0

    goto :goto_26

    :cond_40
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v7, 0x2

    invoke-virtual {v0, v7}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v2, Ln53/d1;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v7

    invoke-direct {v2, v1, v7, v8}, Ln53/d1;-><init>(Ljava/lang/String;J)V

    :goto_26
    if-eqz v2, :cond_42

    if-eqz v4, :cond_41

    iget-object v0, v4, Ln53/o0;->r:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1d

    :cond_41
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1d

    :cond_42
    sget-object v0, Ln53/c0;->s:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_43

    const/4 v7, 0x0

    goto :goto_27

    :cond_43
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Lyb3/l;

    const/4 v7, 0x2

    invoke-virtual {v2, v7}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v7, 0x3

    invoke-virtual {v0, v7}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v7, Ln53/c1;

    invoke-static {v0}, Lvp/c;->q0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v1, v2, v0}, Ln53/c1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_27
    if-eqz v7, :cond_45

    if-eqz v4, :cond_44

    iget-object v0, v4, Ln53/o0;->s:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1d

    :cond_44
    invoke-virtual {v14, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1d

    :cond_45
    sget-object v0, Ln53/c0;->t:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_46

    const/4 v0, 0x0

    goto :goto_28

    :cond_46
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Lyb3/l;

    const/4 v7, 0x2

    invoke-virtual {v2, v7}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v7

    check-cast v7, Lyb3/l;

    const/4 v8, 0x3

    invoke-virtual {v7, v8}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v8

    check-cast v8, Lyb3/l;

    move-object/from16 v33, v0

    const/4 v0, 0x4

    invoke-virtual {v8, v0}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v39, v8

    check-cast v39, Ljava/lang/String;

    invoke-virtual/range {v33 .. v33}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v8, 0x5

    invoke-virtual {v0, v8}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v34, Ln53/x;

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v35

    invoke-static {v2}, Lvp/c;->q0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v37

    invoke-static {v7}, Lvp/c;->q0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v38

    invoke-static {v0}, Lvp/c;->q0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v40

    invoke-direct/range {v34 .. v40}, Ln53/x;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v0, v34

    :goto_28
    if-eqz v0, :cond_48

    if-eqz v4, :cond_47

    iget-object v1, v4, Ln53/o0;->t:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1d

    :cond_47
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1d

    :cond_48
    sget-object v0, Ln53/c0;->u:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_49

    const/4 v1, 0x0

    goto :goto_29

    :cond_49
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Ln53/y;

    invoke-direct {v1, v0}, Ln53/y;-><init>(Ljava/lang/String;)V

    :goto_29
    if-eqz v1, :cond_4a

    if-eqz v4, :cond_2d

    iput-object v1, v4, Ln53/o0;->u:Ln53/y;

    goto/16 :goto_1d

    :cond_4a
    sget-object v0, Ln53/c0;->v:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_4b

    const/4 v0, 0x0

    goto :goto_2a

    :cond_4b
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Lyb3/l;

    const/4 v7, 0x2

    invoke-virtual {v2, v7}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v34, v2

    check-cast v34, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Lyb3/l;

    const/4 v7, 0x3

    invoke-virtual {v2, v7}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v35, v2

    check-cast v35, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v33, Ln53/s;

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v36

    invoke-static {v0}, Lvp/c;->q0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v38

    invoke-direct/range {v33 .. v38}, Ln53/s;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    move-object/from16 v0, v33

    :goto_2a
    if-eqz v0, :cond_4d

    if-eqz v4, :cond_4c

    iget-object v1, v4, Ln53/o0;->v:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1d

    :cond_4c
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1d

    :cond_4d
    sget-object v0, Ln53/c0;->w:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_4e

    const/4 v1, 0x0

    goto :goto_2b

    :cond_4e
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Ln53/j1;

    invoke-direct {v1, v0}, Ln53/j1;-><init>(Ljava/lang/String;)V

    :goto_2b
    if-eqz v1, :cond_4f

    if-eqz v4, :cond_2d

    iput-object v1, v4, Ln53/o0;->w:Ln53/j1;

    goto/16 :goto_1d

    :cond_4f
    sget-object v0, Ln53/c0;->x:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_50

    const/4 v1, 0x0

    goto :goto_2c

    :cond_50
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Ln53/p;

    invoke-direct {v1, v0}, Ln53/p;-><init>(Ljava/lang/String;)V

    :goto_2c
    if-eqz v1, :cond_51

    if-eqz v4, :cond_2d

    iput-object v1, v4, Ln53/o0;->x:Ln53/p;

    goto/16 :goto_1d

    :cond_51
    sget-object v0, Ln53/c0;->y:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_52

    const/4 v1, 0x0

    goto :goto_2d

    :cond_52
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Ln53/q0;

    invoke-direct {v1, v0}, Ln53/q0;-><init>(Ljava/lang/String;)V

    :goto_2d
    if-eqz v1, :cond_53

    if-eqz v4, :cond_2d

    iput-object v1, v4, Ln53/o0;->y:Ln53/q0;

    goto/16 :goto_1d

    :cond_53
    sget-object v0, Ln53/c0;->z:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_54

    const/4 v1, 0x0

    goto :goto_2e

    :cond_54
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Ln53/s0;

    invoke-direct {v1, v0}, Ln53/s0;-><init>(Ljava/lang/String;)V

    :goto_2e
    if-eqz v1, :cond_55

    if-eqz v4, :cond_2d

    iput-object v1, v4, Ln53/o0;->z:Ln53/s0;

    goto/16 :goto_1d

    :cond_55
    sget-object v0, Ln53/c0;->A:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_56

    const/4 v1, 0x0

    goto :goto_2f

    :cond_56
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Ln53/x0;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v7

    invoke-direct {v1, v7, v8}, Ln53/x0;-><init>(J)V

    :goto_2f
    if-eqz v1, :cond_57

    if-eqz v4, :cond_2d

    iput-object v1, v4, Ln53/o0;->A:Ln53/x0;

    goto/16 :goto_1d

    :cond_57
    sget-object v0, Ln53/c0;->B:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_58

    const/4 v1, 0x0

    goto :goto_30

    :cond_58
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Ln53/n0;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v7

    invoke-direct {v1, v7, v8}, Ln53/n0;-><init>(J)V

    :goto_30
    if-eqz v1, :cond_59

    if-eqz v4, :cond_2d

    iput-object v1, v4, Ln53/o0;->B:Ln53/n0;

    goto/16 :goto_1d

    :cond_59
    sget-object v0, Ln53/c0;->C:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_5a

    const/4 v1, 0x0

    goto :goto_31

    :cond_5a
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Ln53/u;

    invoke-direct {v1, v0}, Ln53/u;-><init>(Ljava/lang/String;)V

    :goto_31
    if-eqz v1, :cond_5b

    if-eqz v4, :cond_2d

    iput-object v1, v4, Ln53/o0;->C:Ln53/u;

    goto/16 :goto_1d

    :cond_5b
    sget-object v0, Ln53/c0;->D:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_5c

    const/4 v1, 0x0

    goto :goto_32

    :cond_5c
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Ln53/e0;

    invoke-direct {v1, v0}, Ln53/e0;-><init>(Ljava/lang/String;)V

    :goto_32
    if-eqz v1, :cond_5d

    if-eqz v4, :cond_2d

    iput-object v1, v4, Ln53/o0;->D:Ln53/e0;

    goto/16 :goto_1d

    :cond_5d
    sget-object v0, Ln53/c0;->E:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_5e

    const/4 v1, 0x0

    goto :goto_33

    :cond_5e
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Ln53/h0;

    invoke-direct {v1, v0}, Ln53/h0;-><init>(Ljava/lang/String;)V

    :goto_33
    if-eqz v1, :cond_5f

    if-eqz v4, :cond_2d

    iput-object v1, v4, Ln53/o0;->E:Ln53/h0;

    goto/16 :goto_1d

    :cond_5f
    sget-object v0, Ln53/c0;->F:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_60

    const/4 v1, 0x0

    goto :goto_34

    :cond_60
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Ln53/g0;

    invoke-direct {v1, v0}, Ln53/g0;-><init>(Ljava/lang/String;)V

    :goto_34
    if-eqz v1, :cond_61

    if-eqz v4, :cond_2d

    iput-object v1, v4, Ln53/o0;->F:Ln53/g0;

    goto/16 :goto_1d

    :cond_61
    sget-object v0, Ln53/c0;->G:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_62

    const/4 v2, 0x0

    goto :goto_35

    :cond_62
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v7, 0x2

    invoke-virtual {v0, v7}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v2, Ln53/z;

    invoke-direct {v2, v1, v0}, Ln53/z;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :goto_35
    if-eqz v2, :cond_63

    if-eqz v4, :cond_2d

    iput-object v2, v4, Ln53/o0;->G:Ln53/z;

    goto/16 :goto_1d

    :cond_63
    sget-object v0, Ln53/c0;->H:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_64

    const/4 v0, 0x0

    goto/16 :goto_36

    :cond_64
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v34, v1

    check-cast v34, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Lyb3/l;

    const/4 v7, 0x2

    invoke-virtual {v1, v7}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Lyb3/l;

    const/4 v7, 0x3

    invoke-virtual {v2, v7}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v37, v2

    check-cast v37, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Lyb3/l;

    const/4 v7, 0x4

    invoke-virtual {v2, v7}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v7

    check-cast v7, Lyb3/l;

    const/4 v8, 0x5

    invoke-virtual {v7, v8}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v40, v7

    check-cast v40, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v7

    check-cast v7, Lyb3/l;

    const/4 v8, 0x6

    invoke-virtual {v7, v8}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v26

    const/4 v8, 0x7

    move-object/from16 v30, v0

    move-object/from16 v0, v26

    check-cast v0, Lyb3/l;

    invoke-virtual {v0, v8}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v43, v0

    check-cast v43, Ljava/lang/String;

    invoke-virtual/range {v30 .. v30}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    const/16 v8, 0x8

    check-cast v0, Lyb3/l;

    invoke-virtual {v0, v8}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual/range {v30 .. v30}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v8

    move-object/from16 v26, v0

    const/16 v0, 0x9

    check-cast v8, Lyb3/l;

    invoke-virtual {v8, v0}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual/range {v30 .. v30}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v8

    check-cast v8, Lyb3/l;

    move-object/from16 v33, v0

    const/16 v0, 0xa

    invoke-virtual {v8, v0}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual/range {v30 .. v30}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v18

    const/16 v0, 0xb

    move-object/from16 v35, v1

    move-object/from16 v1, v18

    check-cast v1, Lyb3/l;

    invoke-virtual {v1, v0}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual/range {v30 .. v30}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v1

    move-object/from16 v18, v0

    const/16 v0, 0xc

    check-cast v1, Lyb3/l;

    invoke-virtual {v1, v0}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual/range {v30 .. v30}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v1

    move-object/from16 v30, v0

    const/16 v0, 0xd

    check-cast v1, Lyb3/l;

    invoke-virtual {v1, v0}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-object/from16 v1, v33

    new-instance v33, Ln53/n;

    invoke-static/range {v35 .. v35}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v35

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v38

    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v41

    invoke-static/range {v26 .. v26}, Lvp/c;->q0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v44

    invoke-static {v1}, Lvp/c;->p0(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v45

    invoke-static {v8}, Lvp/c;->q0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v46

    invoke-static/range {v18 .. v18}, Lvp/c;->p0(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v47

    invoke-static/range {v30 .. v30}, Lvp/c;->p0(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v48

    invoke-static {v0}, Lvp/c;->p0(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v49

    invoke-direct/range {v33 .. v49}, Ln53/n;-><init>(Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V

    move-object/from16 v0, v33

    :goto_36
    if-eqz v0, :cond_66

    if-eqz v4, :cond_65

    iget-object v1, v4, Ln53/o0;->H:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1d

    :cond_65
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1d

    :cond_66
    sget-object v0, Ln53/c0;->I:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_67

    const/4 v1, 0x0

    goto :goto_37

    :cond_67
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Ln53/w;

    invoke-direct {v1, v0}, Ln53/w;-><init>(Ljava/lang/String;)V

    :goto_37
    if-eqz v1, :cond_68

    if-eqz v4, :cond_2d

    iput-object v1, v4, Ln53/o0;->I:Ln53/w;

    goto/16 :goto_1d

    :cond_68
    sget-object v0, Ln53/c0;->J:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_69

    const/4 v1, 0x0

    goto :goto_38

    :cond_69
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Ln53/y0;

    invoke-direct {v1, v0}, Ln53/y0;-><init>(Ljava/lang/String;)V

    :goto_38
    if-eqz v1, :cond_6a

    if-eqz v4, :cond_2d

    iput-object v1, v4, Ln53/o0;->J:Ln53/y0;

    goto/16 :goto_1d

    :cond_6a
    sget-object v0, Ln53/c0;->K:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_6b

    const/4 v1, 0x0

    goto :goto_39

    :cond_6b
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Ln53/f0;

    invoke-direct {v1, v0}, Ln53/f0;-><init>(Ljava/lang/String;)V

    :goto_39
    if-eqz v1, :cond_6c

    if-eqz v4, :cond_2d

    iput-object v1, v4, Ln53/o0;->K:Ln53/f0;

    goto/16 :goto_1d

    :cond_6c
    sget-object v0, Ln53/c0;->L:Lyb3/p;

    invoke-virtual {v0, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v0

    if-nez v0, :cond_6d

    const/4 v7, 0x0

    goto :goto_3a

    :cond_6d
    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Lyb3/l;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Lyb3/l;

    const/4 v7, 0x2

    invoke-virtual {v2, v7}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    const/4 v7, 0x3

    invoke-virtual {v0, v7}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v7, Ln53/o1;

    invoke-static {v2}, Lvp/c;->q0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Lvp/c;->q0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v1, v2, v0}, Ln53/o1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_3a
    if-eqz v7, :cond_6f

    if-eqz v4, :cond_6e

    iget-object v0, v4, Ln53/o0;->L:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1d

    :cond_6e
    move-object/from16 v0, v31

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_3b
    move-object/from16 v3, v23

    move-object/from16 v8, v28

    move-object/from16 v7, v29

    goto/16 :goto_1e

    :cond_6f
    move-object/from16 v0, v31

    sget-object v1, Ln53/c0;->M:Lyb3/p;

    invoke-virtual {v1, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v1

    if-nez v1, :cond_70

    const/4 v1, 0x0

    goto :goto_3c

    :cond_70
    invoke-virtual {v1}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v2

    const/4 v7, 0x1

    check-cast v2, Lyb3/l;

    invoke-virtual {v2, v7}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v1

    const/4 v7, 0x2

    check-cast v1, Lyb3/l;

    invoke-virtual {v1, v7}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v7, Ln53/n1;

    invoke-direct {v7, v2, v1}, Ln53/n1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v1, v7

    :goto_3c
    if-eqz v1, :cond_72

    if-eqz v4, :cond_71

    iget-object v2, v4, Ln53/o0;->M:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3b

    :cond_71
    move-object/from16 v2, v32

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_13

    :cond_72
    move-object/from16 v2, v32

    sget-object v1, Ln53/c0;->N:Lyb3/p;

    invoke-virtual {v1, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v1

    if-nez v1, :cond_73

    const/4 v1, 0x0

    goto :goto_3d

    :cond_73
    invoke-virtual {v1}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v7

    const/4 v8, 0x1

    check-cast v7, Lyb3/l;

    invoke-virtual {v7, v8}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v1}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v1

    const/4 v8, 0x2

    check-cast v1, Lyb3/l;

    invoke-virtual {v1, v8}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v8, Ln53/t0;

    invoke-direct {v8, v7, v1}, Ln53/t0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v1, v8

    :goto_3d
    if-eqz v1, :cond_74

    if-eqz v4, :cond_1a

    iput-object v1, v4, Ln53/o0;->N:Ln53/t0;

    goto/16 :goto_13

    :cond_74
    sget-object v1, Ln53/c0;->O:Lyb3/p;

    invoke-virtual {v1, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v1

    if-nez v1, :cond_75

    const/4 v1, 0x0

    goto :goto_3e

    :cond_75
    invoke-virtual {v1}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v7

    const/4 v8, 0x1

    check-cast v7, Lyb3/l;

    invoke-virtual {v7, v8}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v1}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v1

    const/4 v8, 0x2

    check-cast v1, Lyb3/l;

    invoke-virtual {v1, v8}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v8, Ln53/d0;

    invoke-direct {v8, v7, v1}, Ln53/d0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v1, v8

    :goto_3e
    if-eqz v1, :cond_78

    if-eqz v4, :cond_76

    iget-object v3, v4, Ln53/o0;->O:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_13

    :cond_76
    move-object/from16 v7, v29

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_77
    :goto_3f
    move-object/from16 v3, v23

    move-object/from16 v8, v28

    goto/16 :goto_42

    :cond_78
    move-object/from16 v7, v29

    sget-object v1, Ln53/c0;->P:Lyb3/p;

    invoke-virtual {v1, v3}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v1

    if-nez v1, :cond_79

    const/4 v1, 0x0

    goto :goto_40

    :cond_79
    invoke-virtual {v1}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v1

    const/4 v8, 0x1

    check-cast v1, Lyb3/l;

    invoke-virtual {v1, v8}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v8, Ln53/e1;

    invoke-direct {v8, v1}, Ln53/e1;-><init>(Ljava/lang/String;)V

    move-object v1, v8

    :goto_40
    if-eqz v1, :cond_7a

    if-eqz v4, :cond_77

    iput-object v1, v4, Ln53/o0;->P:Ln53/e1;

    goto :goto_3f

    :cond_7a
    invoke-static {v3}, Ln53/c0;->o(Ljava/lang/String;)Ln53/f1;

    move-result-object v1

    if-eqz v1, :cond_7b

    if-eqz v4, :cond_77

    iput-object v1, v4, Ln53/o0;->Q:Ln53/f1;

    goto :goto_3f

    :cond_7b
    invoke-static {v3}, Ln53/c0;->p(Ljava/lang/String;)Ln53/h1;

    move-result-object v1

    if-eqz v1, :cond_7c

    if-eqz v4, :cond_77

    iput-object v1, v4, Ln53/o0;->R:Ln53/h1;

    goto :goto_3f

    :cond_7c
    invoke-static {v3}, Ln53/c0;->v(Ljava/lang/String;)Ln53/u1;

    move-result-object v1

    if-eqz v1, :cond_7d

    if-eqz v4, :cond_77

    iput-object v1, v4, Ln53/o0;->S:Ln53/u1;

    goto :goto_3f

    :cond_7d
    invoke-static {v3}, Ln53/c0;->n(Ljava/lang/String;)Ln53/a1;

    move-result-object v1

    if-eqz v1, :cond_80

    if-eqz v4, :cond_7e

    iget-object v3, v4, Ln53/o0;->T:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3f

    :cond_7e
    move-object/from16 v8, v28

    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7f
    :goto_41
    move-object/from16 v3, v23

    goto/16 :goto_42

    :cond_80
    move-object/from16 v8, v28

    invoke-static {v3}, Ln53/c0;->h(Ljava/lang/String;)Ln53/i0;

    move-result-object v1

    if-eqz v1, :cond_82

    if-eqz v4, :cond_81

    iget-object v3, v4, Ln53/o0;->U:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_41

    :cond_81
    move-object/from16 v3, v24

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_41

    :cond_82
    invoke-static {v3}, Ln53/c0;->r(Ljava/lang/String;)Ln53/l1;

    move-result-object v1

    if-eqz v1, :cond_83

    if-eqz v4, :cond_7f

    iput-object v1, v4, Ln53/o0;->V:Ln53/l1;

    goto :goto_41

    :cond_83
    invoke-static {v3}, Ln53/c0;->s(Ljava/lang/String;)Ln53/k1;

    move-result-object v1

    if-eqz v1, :cond_84

    if-eqz v4, :cond_7f

    iput-object v1, v4, Ln53/o0;->W:Ln53/k1;

    goto :goto_41

    :cond_84
    invoke-static {v3}, Ln53/c0;->g(Ljava/lang/String;)Ln53/b0;

    move-result-object v1

    if-eqz v1, :cond_85

    if-eqz v4, :cond_7f

    iput-object v1, v4, Ln53/o0;->X:Ln53/b0;

    goto :goto_41

    :cond_85
    invoke-static {v3}, Ln53/c0;->t(Ljava/lang/String;)Ln53/m1;

    move-result-object v1

    if-eqz v1, :cond_86

    if-eqz v4, :cond_7f

    iput-object v1, v4, Ln53/o0;->Y:Ln53/m1;

    goto :goto_41

    :cond_86
    invoke-static {v3}, Ln53/c0;->e(Ljava/lang/String;)Ln53/m;

    move-result-object v1

    if-eqz v1, :cond_87

    if-eqz v4, :cond_7f

    iput-object v1, v4, Ln53/o0;->Z:Ln53/m;

    goto :goto_41

    :cond_87
    invoke-static {v3}, Ln53/c0;->k(Ljava/lang/String;)Ln53/l0;

    move-result-object v1

    if-eqz v1, :cond_88

    if-eqz v4, :cond_7f

    iput-object v1, v4, Ln53/o0;->a0:Ln53/l0;

    goto :goto_41

    :cond_88
    invoke-static {v3}, Ln53/c0;->q(Ljava/lang/String;)Ln53/i1;

    move-result-object v1

    if-eqz v1, :cond_89

    if-eqz v4, :cond_7f

    iput-object v1, v4, Ln53/o0;->b0:Ln53/i1;

    goto :goto_41

    :cond_89
    invoke-static {v3}, Ln53/c0;->l(Ljava/lang/String;)Ln53/m0;

    move-result-object v1

    if-eqz v1, :cond_8a

    if-eqz v4, :cond_7f

    iput-object v1, v4, Ln53/o0;->c0:Ln53/m0;

    goto :goto_41

    :cond_8a
    invoke-static {v3}, Ln53/c0;->u(Ljava/lang/String;)Ln53/r1;

    move-result-object v1

    if-eqz v1, :cond_8c

    if-eqz v4, :cond_8b

    iget-object v3, v4, Ln53/o0;->d0:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_41

    :cond_8b
    move-object/from16 v3, v25

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_41

    :cond_8c
    invoke-static {v3}, Ln53/c0;->m(Ljava/lang/String;)Ln53/p0;

    move-result-object v1

    if-eqz v1, :cond_8d

    if-eqz v4, :cond_7f

    iput-object v1, v4, Ln53/o0;->e0:Ln53/p0;

    goto/16 :goto_41

    :cond_8d
    invoke-static {v3}, Ln53/c0;->j(Ljava/lang/String;)Ln53/k0;

    move-result-object v1

    if-eqz v1, :cond_8e

    if-eqz v4, :cond_7f

    iput-object v1, v4, Ln53/o0;->f0:Ln53/k0;

    goto/16 :goto_41

    :cond_8e
    invoke-static {v3}, Ln53/c0;->f(Ljava/lang/String;)Ln53/q;

    move-result-object v1

    if-eqz v1, :cond_8f

    if-eqz v4, :cond_7f

    iput-object v1, v4, Ln53/o0;->g0:Ln53/q;

    goto/16 :goto_41

    :cond_8f
    invoke-static {v3}, Ln53/c0;->b(Ljava/lang/String;)Ln53/j;

    move-result-object v1

    if-eqz v1, :cond_90

    if-eqz v4, :cond_7f

    iput-object v1, v4, Ln53/o0;->h0:Ln53/j;

    goto/16 :goto_41

    :cond_90
    invoke-static {v3}, Ln53/c0;->a(Ljava/lang/String;)Ln53/i;

    move-result-object v1

    if-eqz v1, :cond_91

    if-eqz v4, :cond_7f

    iput-object v1, v4, Ln53/o0;->i0:Ln53/i;

    goto/16 :goto_41

    :cond_91
    invoke-static {v3}, Ln53/c0;->d(Ljava/lang/String;)Ln53/l;

    move-result-object v1

    if-eqz v1, :cond_92

    if-eqz v4, :cond_7f

    invoke-virtual {v4, v1}, Ln53/o0;->c(Ln53/l;)V

    goto/16 :goto_41

    :cond_92
    invoke-static {v3}, Ln53/c0;->c(Ljava/lang/String;)Ln53/k;

    move-result-object v1

    if-eqz v1, :cond_93

    if-eqz v4, :cond_7f

    invoke-virtual {v4, v1}, Ln53/o0;->b(Ln53/k;)V

    goto/16 :goto_41

    :cond_93
    invoke-static {v3}, Ln53/c0;->i(Ljava/lang/String;)Ln53/j0;

    move-result-object v1

    if-eqz v1, :cond_7f

    if-eqz v4, :cond_94

    invoke-virtual {v4}, Ln53/o0;->a()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_41

    :cond_94
    move-object/from16 v3, v23

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_42
    move-object v1, v7

    move-object v7, v0

    move-object v0, v1

    move-object/from16 v23, v3

    move-object v1, v8

    move-object v8, v2

    move-object/from16 v2, p4

    goto/16 :goto_10

    :cond_95
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid SDP line"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_96
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_97
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ln53/o0;

    iget-object v3, v2, Ln53/o0;->m:Ln53/r0;

    if-eqz v3, :cond_98

    iget-object v3, v3, Ln53/r0;->a:Ljava/lang/String;

    goto :goto_43

    :cond_98
    const/4 v3, 0x0

    :goto_43
    invoke-virtual/range {p2 .. p2}, Lorg/webrtc/MediaStreamTrack;->kind()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9a

    iget-object v2, v2, Ln53/o0;->z:Ln53/s0;

    if-eqz v2, :cond_99

    iget-object v2, v2, Ln53/s0;->a:Ljava/lang/String;

    if-eqz v2, :cond_99

    invoke-virtual/range {p2 .. p2}, Lorg/webrtc/MediaStreamTrack;->id()Ljava/lang/String;

    move-result-object v3

    const-string v4, "id(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v3}, Lyb3/r;->V(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    goto :goto_44

    :cond_99
    const/4 v4, 0x1

    :goto_44
    if-eqz v4, :cond_9a

    const/4 v4, 0x1

    goto :goto_45

    :cond_9a
    const/4 v4, 0x0

    :goto_45
    if-eqz v4, :cond_97

    goto :goto_46

    :cond_9b
    const/4 v1, 0x0

    :goto_46
    check-cast v1, Ln53/o0;

    invoke-virtual/range {p0 .. p0}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->x:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9d

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    if-eqz v1, :cond_9c

    iget-object v2, v1, Ln53/o0;->y:Ln53/q0;

    if-eqz v2, :cond_9c

    iget-object v10, v2, Ln53/q0;->a:Ljava/lang/String;

    goto :goto_47

    :cond_9c
    const/4 v10, 0x0

    :goto_47
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "Media section (mid): "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v4, v3, v2}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_9d
    if-eqz v1, :cond_9e

    iget-object v0, v1, Ln53/o0;->y:Ln53/q0;

    if-eqz v0, :cond_9e

    iget-object v4, v0, Ln53/q0;->a:Ljava/lang/String;

    :goto_48
    move-object/from16 v19, v4

    goto/16 :goto_d

    :cond_9e
    :goto_49
    const-string v4, ""

    goto :goto_48

    :goto_4a
    xor-int/lit8 v23, v22, 0x1

    invoke-virtual/range {p3 .. p3}, Lstream/video/sfu/models/PublishOption;->getCodec()Lstream/video/sfu/models/Codec;

    move-result-object v24

    invoke-virtual/range {p3 .. p3}, Lstream/video/sfu/models/PublishOption;->getId()I

    move-result v25

    new-instance v15, Lstream/video/sfu/models/TrackInfo;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 v28, 0xc50

    const/16 v29, 0x0

    const/16 v20, 0x0

    move-object/from16 v18, v21

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-direct/range {v15 .. v29}, Lstream/video/sfu/models/TrackInfo;-><init>(Ljava/lang/String;Lstream/video/sfu/models/TrackType;Ljava/util/List;Ljava/lang/String;ZZZZLstream/video/sfu/models/Codec;IZLne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v15

    :cond_9f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid empty SDP"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
