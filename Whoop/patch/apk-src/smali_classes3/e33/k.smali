.class public final Le33/k;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Le33/n;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Lstream/video/sfu/models/TrackType;

.field public final synthetic z:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;


# direct methods
.method public constructor <init>(Le33/n;Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Le33/k;->w:Le33/n;

    iput-object p2, p0, Le33/k;->x:Ljava/lang/String;

    iput-object p3, p0, Le33/k;->y:Lstream/video/sfu/models/TrackType;

    iput-object p4, p0, Le33/k;->z:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 6

    new-instance v0, Le33/k;

    iget-object v3, p0, Le33/k;->y:Lstream/video/sfu/models/TrackType;

    iget-object v4, p0, Le33/k;->z:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    iget-object v1, p0, Le33/k;->w:Le33/n;

    iget-object v2, p0, Le33/k;->x:Ljava/lang/String;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Le33/k;-><init>(Le33/n;Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Le33/k;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le33/k;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Le33/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Le33/k;->w:Le33/n;

    iget-object v0, p1, Le33/n;->F:Lio/sentry/internal/debugmeta/c;

    iget-object v1, p1, Le33/n;->y:Ljava/util/List;

    const-string v2, "streamId"

    iget-object v3, p0, Le33/k;->x:Ljava/lang/String;

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "trackType"

    iget-object v4, p0, Le33/k;->y:Lstream/video/sfu/models/TrackType;

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Le33/u;->f()Lb23/k;

    move-result-object v2

    iget-object v5, v2, Lb23/k;->c:Lb23/e;

    sget-object v6, Lb23/g;->z:Lb23/g;

    iget-object v7, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v5, v6, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    const/4 v8, 0x0

    if-eqz v5, :cond_0

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v9, "[trackPublishing] Publishing track: "

    invoke-direct {v5, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v6, v7, v5, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    instance-of v5, v2, Ljava/util/Collection;

    if-eqz v5, :cond_1

    move-object v5, v2

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_1

    goto/16 :goto_0

    :cond_1
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lstream/video/sfu/models/PublishOption;

    invoke-virtual {v5}, Lstream/video/sfu/models/PublishOption;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v5

    if-ne v5, v4, :cond_2

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lstream/video/sfu/models/PublishOption;

    invoke-virtual {v2}, Lstream/video/sfu/models/PublishOption;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v5

    if-ne v5, v4, :cond_3

    invoke-virtual {v0, v2}, Lio/sentry/internal/debugmeta/c;->r(Lstream/video/sfu/models/PublishOption;)Lorg/webrtc/RtpTransceiver;

    move-result-object v1

    sget-object v5, Lm83/y;->w:Lm83/y;

    iget-object v6, p0, Le33/k;->z:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    const-string v7, "id(...)"

    if-eqz v1, :cond_8

    :try_start_0
    invoke-virtual {v1}, Lorg/webrtc/RtpTransceiver;->getSender()Lorg/webrtc/RtpSender;

    move-result-object v1

    invoke-virtual {v1}, Lorg/webrtc/RtpSender;->track()Lorg/webrtc/MediaStreamTrack;

    move-result-object v9

    const/4 v10, 0x1

    if-eqz v9, :cond_5

    invoke-virtual {v9}, Lorg/webrtc/MediaStreamTrack;->isDisposed()Z

    move-result v11

    if-nez v11, :cond_5

    invoke-virtual {p1}, Le33/u;->f()Lb23/k;

    move-result-object v1

    iget-object v11, v1, Lb23/k;->c:Lb23/e;

    iget-object v12, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v13, Lb23/g;->y:Lb23/g;

    invoke-interface {v11, v13, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_4

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v11, "[trackPublishing] Track already exists."

    invoke-interface {v1, v13, v12, v11, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    invoke-static {v9, v10}, Lsc3/l;->n(Lorg/webrtc/MediaStreamTrack;Z)V

    invoke-virtual {p1, v9}, Le33/n;->s(Lorg/webrtc/MediaStreamTrack;)V

    invoke-virtual {v9}, Lorg/webrtc/MediaStreamTrack;->id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v4, v1, v5}, Le33/u;->m(Lstream/video/sfu/models/TrackType;Ljava/lang/String;Ljava/util/List;)V

    return-object v9

    :cond_5
    invoke-virtual {p1}, Le33/u;->f()Lb23/k;

    move-result-object v9

    iget-object v11, v9, Lb23/k;->c:Lb23/e;

    iget-object v12, v9, Lb23/k;->a:Ljava/lang/String;

    sget-object v13, Lb23/g;->y:Lb23/g;

    invoke-interface {v11, v13, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_6

    iget-object v9, v9, Lb23/k;->b:Lb23/j;

    const-string v11, "[trackPublishing] Track is disposed, creating new one."

    invoke-interface {v9, v13, v12, v11, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    invoke-virtual {v2}, Lstream/video/sfu/models/PublishOption;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v9

    invoke-virtual {p1, v9}, Le33/n;->u(Lstream/video/sfu/models/TrackType;)Lorg/webrtc/MediaStreamTrack;

    move-result-object v9

    invoke-virtual {v9}, Lorg/webrtc/MediaStreamTrack;->id()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v4, v11, v5}, Le33/u;->m(Lstream/video/sfu/models/TrackType;Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {v1, v9, v10}, Lorg/webrtc/RtpSender;->setTrack(Lorg/webrtc/MediaStreamTrack;Z)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v9

    :catch_0
    invoke-virtual {p1}, Le33/u;->f()Lb23/k;

    move-result-object v1

    iget-object v9, v1, Lb23/k;->c:Lb23/e;

    iget-object v10, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v11, Lb23/g;->E:Lb23/g;

    invoke-interface {v9, v11, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_7

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-virtual {v2}, Lstream/video/sfu/models/PublishOption;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v9

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "Failed to set track for "

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v9, ", creating new transceiver"

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v1, v11, v10, v9, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    iget-object v0, v0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-static {v2}, Lio/sentry/internal/debugmeta/c;->y(Lstream/video/sfu/models/PublishOption;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lstream/video/sfu/models/PublishOption;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v0

    invoke-virtual {p1, v0}, Le33/n;->u(Lstream/video/sfu/models/TrackType;)Lorg/webrtc/MediaStreamTrack;

    move-result-object v0

    invoke-virtual {v0}, Lorg/webrtc/MediaStreamTrack;->id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v4, v1, v5}, Le33/u;->m(Lstream/video/sfu/models/TrackType;Ljava/lang/String;Ljava/util/List;)V

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {p1, v1, v6, v0, v2}, Le33/n;->n(Ljava/util/List;Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;Lorg/webrtc/MediaStreamTrack;Lstream/video/sfu/models/PublishOption;)V

    return-object v0

    :cond_8
    invoke-virtual {p1}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v9, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v10, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v10, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v11, "[trackPublishing] No transceiver found for "

    invoke-direct {v1, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v11, ", creating new track and transceiver."

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v10, v9, v1, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    invoke-virtual {v2}, Lstream/video/sfu/models/PublishOption;->getTrack_type()Lstream/video/sfu/models/TrackType;

    move-result-object v0

    invoke-virtual {p1, v0}, Le33/n;->u(Lstream/video/sfu/models/TrackType;)Lorg/webrtc/MediaStreamTrack;

    move-result-object v0

    invoke-virtual {v0}, Lorg/webrtc/MediaStreamTrack;->id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v4, v1, v5}, Le33/u;->m(Lstream/video/sfu/models/TrackType;Ljava/lang/String;Ljava/util/List;)V

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {p1, v1, v6, v0, v2}, Le33/n;->n(Ljava/util/List;Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;Lorg/webrtc/MediaStreamTrack;Lstream/video/sfu/models/PublishOption;)V

    return-object v0

    :cond_a
    :goto_0
    invoke-virtual {p1}, Le33/u;->f()Lb23/k;

    move-result-object p1

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v1, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->F:Lb23/g;

    invoke-interface {v0, v2, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "[trackPublishing] No publish options found for "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v1, v0, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_b
    return-object v8
.end method
