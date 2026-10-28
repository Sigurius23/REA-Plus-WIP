.class public final Ld33/j0;
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

    iput-object p1, p0, Ld33/j0;->y:Ld33/h1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    new-instance v0, Ld33/j0;

    iget-object v1, p0, Ld33/j0;->y:Ld33/h1;

    invoke-direct {v0, v1, p2}, Ld33/j0;-><init>(Ld33/h1;Lq83/d;)V

    iput-object p1, v0, Ld33/j0;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lt23/q1;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ld33/j0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld33/j0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld33/j0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Ld33/j0;->y:Ld33/h1;

    iget-object v1, v0, Ld33/h1;->A:Lec3/h2;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Ld33/j0;->w:I

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v3, :cond_2

    if-eq v3, v6, :cond_1

    if-ne v3, v5, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Ld33/j0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld33/j0;->x:Ljava/lang/Object;

    check-cast p1, Lt23/q1;

    iget-object v3, v0, Ld33/h1;->b:Lt23/c0;

    iget-object v3, v3, Lt23/c0;->p:Lt23/s0;

    iget-object v3, v3, Lt23/s0;->M:Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    sget-object v7, Lio/getstream/android/video/generated/models/OwnCapability$Screenshare;->INSTANCE:Lio/getstream/android/video/generated/models/OwnCapability$Screenshare;

    invoke-interface {v3, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    sget-object v7, Lt23/o1;->a:Lt23/o1;

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    if-eqz v3, :cond_6

    sget-object p1, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_SCREEN_SHARE:Lstream/video/sfu/models/TrackType;

    invoke-virtual {v0, v6, p1}, Ld33/h1;->F(ZLstream/video/sfu/models/TrackType;)V

    invoke-virtual {v0, p1}, Ld33/h1;->j(Lstream/video/sfu/models/TrackType;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le33/n;

    const/4 v5, 0x0

    if-eqz v1, :cond_4

    iput-object v3, p0, Ld33/j0;->x:Ljava/lang/Object;

    iput v6, p0, Ld33/j0;->w:I

    invoke-virtual {v1, v3, p1, v5, p0}, Le33/n;->v(Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    goto :goto_1

    :cond_3
    move-object v1, v3

    :goto_0
    move-object v5, p1

    check-cast v5, Lorg/webrtc/MediaStreamTrack;

    move-object v3, v1

    :cond_4
    sget-object p1, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_SCREEN_SHARE:Lstream/video/sfu/models/TrackType;

    new-instance v1, Lc43/w;

    const-string v2, "null cannot be cast to non-null type org.webrtc.VideoTrack"

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lorg/webrtc/VideoTrack;

    invoke-direct {v1, v3, v5}, Lc43/w;-><init>(Ljava/lang/String;Lorg/webrtc/VideoTrack;)V

    invoke-virtual {v0, p1, v1}, Ld33/h1;->E(Lstream/video/sfu/models/TrackType;Lc43/g;)V

    return-object v4

    :cond_5
    sget-object p1, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_SCREEN_SHARE:Lstream/video/sfu/models/TrackType;

    const/4 v3, 0x0

    invoke-virtual {v0, v3, p1}, Ld33/h1;->F(ZLstream/video/sfu/models/TrackType;)V

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le33/n;

    if-eqz v0, :cond_6

    iput v5, p0, Ld33/j0;->w:I

    invoke-virtual {v0, p1}, Le33/n;->A(Lstream/video/sfu/models/TrackType;)V

    if-ne v4, v2, :cond_6

    :goto_1
    return-object v2

    :cond_6
    return-object v4
.end method
