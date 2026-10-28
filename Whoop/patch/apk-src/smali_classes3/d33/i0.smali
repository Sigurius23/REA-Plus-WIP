.class public final Ld33/i0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public w:I

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ld33/h1;


# direct methods
.method public constructor <init>(Ld33/h1;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Ld33/i0;->y:Ld33/h1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    new-instance v0, Ld33/i0;

    iget-object v1, p0, Ld33/i0;->y:Ld33/h1;

    invoke-direct {v0, v1, p2}, Ld33/i0;-><init>(Ld33/h1;Lq83/d;)V

    iput-object p1, v0, Ld33/i0;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lt23/q1;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld33/i0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld33/i0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld33/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Ld33/i0;->y:Ld33/h1;

    iget-object v1, v0, Ld33/h1;->A:Lec3/h2;

    iget-object v2, v0, Ld33/h1;->b:Lt23/c0;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, p0, Ld33/i0;->w:I

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v4, :cond_2

    if-eq v4, v7, :cond_1

    if-ne v4, v6, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Ld33/i0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld33/i0;->x:Ljava/lang/Object;

    check-cast p1, Lt23/q1;

    iget-object v4, v2, Lt23/c0;->p:Lt23/s0;

    iget-object v4, v4, Lt23/s0;->M:Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    sget-object v8, Lio/getstream/android/video/generated/models/OwnCapability$SendVideo;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$SendVideo;

    invoke-interface {v4, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    sget-object v8, Lt23/o1;->a:Lt23/o1;

    invoke-static {p1, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-virtual {v2}, Lt23/c0;->h()Lt23/x1;

    move-result-object p1

    iget-object p1, p1, Lt23/x1;->e:Lt23/e1;

    iget-object p1, p1, Lt23/e1;->q:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    const/4 v6, 0x0

    if-nez p1, :cond_3

    invoke-virtual {v0}, Ld33/h1;->s()Lb23/k;

    move-result-object p1

    iget-object v8, p1, Lb23/k;->c:Lb23/e;

    iget-object v9, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v10, Lb23/g;->y:Lb23/g;

    invoke-interface {v8, v10, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_4

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v8, "Camera resolution is null. This will result in an empty video track."

    invoke-interface {p1, v10, v9, v8, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Ld33/h1;->s()Lb23/k;

    move-result-object v8

    iget-object v9, v8, Lb23/k;->c:Lb23/e;

    iget-object v10, v8, Lb23/k;->a:Ljava/lang/String;

    sget-object v11, Lb23/g;->y:Lb23/g;

    invoke-interface {v9, v11, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_4

    iget-object v8, v8, Lb23/k;->b:Lb23/j;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v12, "Camera resolution: "

    invoke-direct {v9, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v8, v11, v10, p1, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    :goto_0
    if-eqz v4, :cond_7

    sget-object p1, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_VIDEO:Lstream/video/sfu/models/TrackType;

    invoke-virtual {v0, v7, p1}, Ld33/h1;->F(ZLstream/video/sfu/models/TrackType;)V

    invoke-virtual {v0, p1}, Ld33/h1;->j(Lstream/video/sfu/models/TrackType;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le33/n;

    if-eqz v1, :cond_6

    invoke-virtual {v2}, Lt23/c0;->h()Lt23/x1;

    move-result-object v2

    iget-object v2, v2, Lt23/x1;->e:Lt23/e1;

    iget-object v2, v2, Lt23/e1;->q:Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    iput-object v4, p0, Ld33/i0;->x:Ljava/lang/Object;

    iput v7, p0, Ld33/i0;->w:I

    invoke-virtual {v1, v4, p1, v2, p0}, Le33/n;->v(Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_5

    goto :goto_2

    :cond_5
    move-object v1, v4

    :goto_1
    move-object v6, p1

    check-cast v6, Lorg/webrtc/MediaStreamTrack;

    move-object v4, v1

    :cond_6
    sget-object p1, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_VIDEO:Lstream/video/sfu/models/TrackType;

    new-instance v1, Lc43/w;

    const-string v2, "null cannot be cast to non-null type org.webrtc.VideoTrack"

    invoke-static {v6, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Lorg/webrtc/VideoTrack;

    invoke-direct {v1, v4, v6}, Lc43/w;-><init>(Ljava/lang/String;Lorg/webrtc/VideoTrack;)V

    invoke-virtual {v0, p1, v1}, Ld33/h1;->E(Lstream/video/sfu/models/TrackType;Lc43/g;)V

    return-object v5

    :cond_7
    invoke-virtual {v0}, Ld33/h1;->s()Lb23/k;

    move-result-object p1

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v1, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->y:Lb23/g;

    invoke-interface {v0, v2, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v0, "[listenToMediaChanges#enableCamera] No capability to send video."

    invoke-interface {p1, v2, v1, v0, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v5

    :cond_8
    sget-object p1, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_VIDEO:Lstream/video/sfu/models/TrackType;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, p1}, Ld33/h1;->F(ZLstream/video/sfu/models/TrackType;)V

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le33/n;

    if-eqz v0, :cond_9

    iput v6, p0, Ld33/i0;->w:I

    invoke-virtual {v0, p1}, Le33/n;->A(Lstream/video/sfu/models/TrackType;)V

    if-ne v5, v3, :cond_9

    :goto_2
    return-object v3

    :cond_9
    return-object v5
.end method
