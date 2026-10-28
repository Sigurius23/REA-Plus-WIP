.class public Le33/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/webrtc/PeerConnection$Observer;


# instance fields
.field public final a:Lc43/v;

.field public final b:Lorg/webrtc/MediaConstraints;

.field public final c:Lkotlin/jvm/functions/Function1;

.field public final d:Lc93/m;

.field public final e:Lc93/m;

.field public final f:Lc93/a;

.field public final g:Lc93/a;

.field public final h:I

.field public final i:Z

.field public final j:Ll53/m;

.field public final k:Ljava/lang/String;

.field public final l:Lmc3/c;

.field public final m:Lmc3/c;

.field public final n:Lmc3/c;

.field public o:Lorg/webrtc/SessionDescription;

.field public final p:Ljava/util/ArrayList;

.field public final q:Ljava/lang/String;

.field public final r:Lec3/h2;

.field public final s:Lec3/h2;

.field public final t:Ll83/p;

.field public u:Lorg/webrtc/PeerConnection;

.field public v:Lb30/m;


# direct methods
.method public constructor <init>(Lc43/v;Lorg/webrtc/MediaConstraints;Le33/e;Lc93/m;Lc93/m;Lc93/a;Lc93/a;IZLl53/m;Ljava/lang/String;)V
    .locals 1

    const-string v0, "mediaConstraints"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tracer"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le33/u;->a:Lc43/v;

    iput-object p2, p0, Le33/u;->b:Lorg/webrtc/MediaConstraints;

    iput-object p3, p0, Le33/u;->c:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Le33/u;->d:Lc93/m;

    iput-object p5, p0, Le33/u;->e:Lc93/m;

    iput-object p6, p0, Le33/u;->f:Lc93/a;

    iput-object p7, p0, Le33/u;->g:Lc93/a;

    iput p8, p0, Le33/u;->h:I

    iput-boolean p9, p0, Le33/u;->i:Z

    iput-object p10, p0, Le33/u;->j:Ll53/m;

    iput-object p11, p0, Le33/u;->k:Ljava/lang/String;

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p3

    iput-object p3, p0, Le33/u;->l:Lmc3/c;

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p3

    iput-object p3, p0, Le33/u;->m:Lmc3/c;

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p3

    iput-object p3, p0, Le33/u;->n:Lmc3/c;

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Le33/u;->p:Ljava/util/ArrayList;

    invoke-static {p1}, Lx43/j;->U(Lc43/v;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Le33/u;->q:Ljava/lang/String;

    const/4 p3, 0x0

    invoke-static {p3}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p4

    iput-object p4, p0, Le33/u;->r:Lec3/h2;

    invoke-static {p3}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p4

    iput-object p4, p0, Le33/u;->s:Lec3/h2;

    const-string p4, "Call:PeerConnection:"

    invoke-virtual {p4, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-static {p0, p4}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p4

    iput-object p4, p0, Le33/u;->t:Ll83/p;

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object p4

    iget-object p5, p4, Lb23/k;->c:Lb23/e;

    sget-object p6, Lb23/g;->z:Lb23/g;

    iget-object p7, p4, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {p5, p6, p7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p5

    if-eqz p5, :cond_0

    iget-object p4, p4, Lb23/k;->b:Lb23/j;

    new-instance p5, Ljava/lang/StringBuilder;

    const-string p8, "<init> #sfu; #"

    invoke-direct {p5, p8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "; mediaConstraints: "

    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p4, p6, p7, p1, p3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static i(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "vp9"

    const-string v1, "VP9"

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    const-string v0, "vp8"

    const-string v1, "VP8"

    invoke-static {p0, v0, v1, v2}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    const-string v0, "h264"

    const-string v1, "H264"

    invoke-static {p0, v0, v1, v2}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lio/getstream/video/android/core/model/IceCandidate;Ls83/c;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, Le33/o;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Le33/o;

    iget v1, v0, Le33/o;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le33/o;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Le33/o;

    invoke-direct {v0, p0, p2}, Le33/o;-><init>(Le33/u;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Le33/o;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le33/o;->E:I

    const/4 v3, 0x0

    const-string v4, "[addIceCandidate] #sfu; #"

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v5, :cond_1

    iget-object p1, v0, Le33/o;->x:Lorg/webrtc/IceCandidate;

    iget-object v0, v0, Le33/o;->w:Le33/u;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p2, "<this>"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lorg/webrtc/IceCandidate;

    invoke-virtual {p1}, Lio/getstream/video/android/core/model/IceCandidate;->getSdpMid$stream_video_android_core_release()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lio/getstream/video/android/core/model/IceCandidate;->getSdpMLineIndex$stream_video_android_core_release()I

    move-result v6

    invoke-virtual {p1}, Lio/getstream/video/android/core/model/IceCandidate;->getCandidate$stream_video_android_core_release()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, v2, v6, p1}, Lorg/webrtc/IceCandidate;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object p1

    iget-object v2, p1, Lb23/k;->c:Lb23/e;

    iget-object v6, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v8, p0, Le33/u;->q:Ljava/lang/String;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "; rtcIceCandidate: "

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v7, v6, v2, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    invoke-virtual {p0}, Le33/u;->e()Lorg/webrtc/PeerConnection;

    move-result-object p1

    iput-object p0, v0, Le33/o;->w:Le33/u;

    iput-object p2, v0, Le33/o;->x:Lorg/webrtc/IceCandidate;

    iput v5, v0, Le33/o;->E:I

    new-instance v2, Lq83/l;

    invoke-static {v0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v0

    invoke-direct {v2, v0}, Lq83/l;-><init>(Lq83/d;)V

    new-instance v0, Lp33/b;

    const/4 v5, 0x0

    invoke-direct {v0, v2, v5}, Lp33/b;-><init>(Lq83/l;I)V

    invoke-virtual {p1, p2, v0}, Lorg/webrtc/PeerConnection;->addIceCandidate(Lorg/webrtc/IceCandidate;Lorg/webrtc/AddIceObserver;)V

    invoke-virtual {v2}, Lq83/l;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object v0, p2

    move-object p2, p1

    move-object p1, v0

    move-object v0, p0

    :goto_1
    move-object v1, p2

    check-cast v1, Ln23/h;

    invoke-virtual {v0}, Le33/u;->f()Lb23/k;

    move-result-object v2

    iget-object v5, v2, Lb23/k;->c:Lb23/e;

    iget-object v6, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->x:Lb23/g;

    invoke-interface {v5, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_5

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    iget-object v5, v0, Le33/u;->q:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "; completed: "

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v7, v6, v1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    iget-object v0, v0, Le33/u;->j:Ll53/m;

    sget-object v1, Ll53/a;->x:[Ll53/a;

    const-string v1, "addIceCandidate"

    invoke-virtual {p1}, Lorg/webrtc/IceCandidate;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, v1}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p2
.end method

.method public final b()V
    .locals 8

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[close] #sfu; #"

    const-string v5, "; no args, debugText: "

    iget-object v6, p0, Le33/u;->q:Ljava/lang/String;

    iget-object v7, p0, Le33/u;->k:Ljava/lang/String;

    invoke-static {v1, v6, v5, v7}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    sget-object v0, Ll53/a;->x:[Ll53/a;

    const-string v0, "close"

    iget-object v1, p0, Le33/u;->j:Ll53/m;

    invoke-virtual {v1, v4, v0}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Le33/u;->e()Lorg/webrtc/PeerConnection;

    move-result-object v0

    invoke-virtual {v0}, Lorg/webrtc/PeerConnection;->close()V

    return-void
.end method

.method public final c(Lorg/webrtc/MediaConstraints;Ls83/c;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, Le33/p;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Le33/p;

    iget v1, v0, Le33/p;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le33/p;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Le33/p;

    invoke-direct {v0, p0, p2}, Le33/p;-><init>(Le33/u;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Le33/p;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le33/p;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    const-string v5, "[createAnswer] #sfu; #"

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Le33/p;->w:Le33/u;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object p2

    iget-object v2, p2, Lb23/k;->c:Lb23/e;

    iget-object v6, p2, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object p2, p2, Lb23/k;->b:Lb23/j;

    iget-object v2, p0, Le33/u;->q:Ljava/lang/String;

    const-string v8, "; no args"

    invoke-static {v5, v2, v8}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v7, v6, v2, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iput-object p0, v0, Le33/p;->w:Le33/u;

    iput v4, v0, Le33/p;->z:I

    new-instance p2, Lq83/l;

    invoke-static {v0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v0

    invoke-direct {p2, v0}, Lq83/l;-><init>(Lq83/d;)V

    new-instance v0, Lp33/b;

    invoke-direct {v0, p2, v4}, Lp33/b;-><init>(Lq83/l;I)V

    invoke-virtual {p0}, Le33/u;->e()Lorg/webrtc/PeerConnection;

    move-result-object v2

    invoke-virtual {v2, v0, p1}, Lorg/webrtc/PeerConnection;->createAnswer(Lorg/webrtc/SdpObserver;Lorg/webrtc/MediaConstraints;)V

    invoke-virtual {p2}, Lq83/l;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    move-object p1, p0

    :goto_1
    move-object v0, p2

    check-cast v0, Ln23/h;

    invoke-virtual {p1}, Le33/u;->f()Lb23/k;

    move-result-object v1

    iget-object v2, p1, Le33/u;->q:Ljava/lang/String;

    iget-object v4, v1, Lb23/k;->c:Lb23/e;

    iget-object v6, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->y:Lb23/g;

    invoke-interface {v4, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "; result: "

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v7, v6, v4, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    instance-of v1, v0, Ln23/g;

    if-eqz v1, :cond_7

    invoke-virtual {p1}, Le33/u;->f()Lb23/k;

    move-result-object v1

    iget-object v4, v1, Lb23/k;->c:Lb23/e;

    iget-object v6, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_6

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    move-object v4, v0

    check-cast v4, Ln23/g;

    iget-object v4, v4, Ln23/g;->a:Ljava/lang/Object;

    check-cast v4, Lorg/webrtc/SessionDescription;

    iget-object v4, v4, Lorg/webrtc/SessionDescription;->description:Ljava/lang/String;

    const-string v8, "; sdp: "

    invoke-static {v5, v2, v8, v4}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v7, v6, v2, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    iget-boolean v1, p1, Le33/u;->i:Z

    if-eqz v1, :cond_8

    iget-object p1, p1, Le33/u;->j:Ll53/m;

    sget-object v1, Ll53/a;->x:[Ll53/a;

    check-cast v0, Ln23/g;

    iget-object v0, v0, Ln23/g;->a:Ljava/lang/Object;

    check-cast v0, Lorg/webrtc/SessionDescription;

    iget-object v0, v0, Lorg/webrtc/SessionDescription;->description:Ljava/lang/String;

    const-string v1, "createAnswer"

    invoke-virtual {p1, v0, v1}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p2

    :cond_7
    instance-of v1, v0, Ln23/f;

    if-eqz v1, :cond_8

    invoke-virtual {p1}, Le33/u;->f()Lb23/k;

    move-result-object p1

    iget-object v1, p1, Lb23/k;->c:Lb23/e;

    iget-object v4, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->F:Lb23/g;

    invoke-interface {v1, v6, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    check-cast v0, Ln23/f;

    iget-object v0, v0, Ln23/f;->a:Ln23/e;

    invoke-virtual {v0}, Ln23/e;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "; error: "

    invoke-static {v5, v2, v1, v0}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v6, v4, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    return-object p2
.end method

.method public final d(Lorg/webrtc/MediaConstraints;Ls83/c;)Ljava/lang/Object;
    .locals 6

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[createOffer] #sfu; #"

    const-string v4, "; no args"

    iget-object v5, p0, Le33/u;->q:Ljava/lang/String;

    invoke-static {v1, v5, v4}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    new-instance v0, Lq83/l;

    invoke-static {p2}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p2

    invoke-direct {v0, p2}, Lq83/l;-><init>(Lq83/d;)V

    new-instance p2, Lp33/b;

    const/4 v1, 0x1

    invoke-direct {p2, v0, v1}, Lp33/b;-><init>(Lq83/l;I)V

    invoke-virtual {p0}, Le33/u;->e()Lorg/webrtc/PeerConnection;

    move-result-object v1

    invoke-virtual {v1, p2, p1}, Lorg/webrtc/PeerConnection;->createOffer(Lorg/webrtc/SdpObserver;Lorg/webrtc/MediaConstraints;)V

    sget-object p2, Ll53/a;->x:[Ll53/a;

    const-string p2, "createOffer"

    invoke-virtual {p1}, Lorg/webrtc/MediaConstraints;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Le33/u;->j:Ll53/m;

    invoke-virtual {v1, p1, p2}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lq83/l;->a()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    return-object p1
.end method

.method public final e()Lorg/webrtc/PeerConnection;
    .locals 1

    iget-object v0, p0, Le33/u;->u:Lorg/webrtc/PeerConnection;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "connection"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final f()Lb23/k;
    .locals 1

    iget-object v0, p0, Le33/u;->t:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method public final g(Lio/getstream/video/android/core/model/IceCandidate;Ls83/c;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p2, Le33/q;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Le33/q;

    iget v1, v0, Le33/q;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le33/q;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Le33/q;

    invoke-direct {v0, p0, p2}, Le33/q;-><init>(Le33/u;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Le33/q;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le33/q;->G:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Le33/q;->w:Ljava/lang/Object;

    check-cast p1, Lmc3/a;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_5

    :catchall_0
    move-exception p2

    goto/16 :goto_7

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Le33/q;->z:Lmc3/c;

    iget-object v1, v0, Le33/q;->y:Lmc3/a;

    iget-object v2, v0, Le33/q;->x:Lio/getstream/video/android/core/model/IceCandidate;

    iget-object v0, v0, Le33/q;->w:Ljava/lang/Object;

    check-cast v0, Le33/u;

    :try_start_1
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object p2, v1

    goto/16 :goto_3

    :catchall_1
    move-exception p2

    move-object p1, v1

    goto/16 :goto_7

    :cond_3
    iget-object p1, v0, Le33/q;->y:Lmc3/a;

    iget-object v2, v0, Le33/q;->x:Lio/getstream/video/android/core/model/IceCandidate;

    iget-object v5, v0, Le33/q;->w:Ljava/lang/Object;

    check-cast v5, Le33/u;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, p1

    move-object p1, v2

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Le33/q;->w:Ljava/lang/Object;

    iput-object p1, v0, Le33/q;->x:Lio/getstream/video/android/core/model/IceCandidate;

    iget-object p2, p0, Le33/u;->m:Lmc3/c;

    iput-object p2, v0, Le33/q;->y:Lmc3/a;

    iput v5, v0, Le33/q;->G:I

    invoke-virtual {p2, v0}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_5

    goto/16 :goto_4

    :cond_5
    move-object v5, p0

    :goto_1
    :try_start_2
    invoke-virtual {v5}, Le33/u;->e()Lorg/webrtc/PeerConnection;

    move-result-object v2

    iget-object v7, v5, Le33/u;->q:Ljava/lang/String;

    invoke-virtual {v2}, Lorg/webrtc/PeerConnection;->getRemoteDescription()Lorg/webrtc/SessionDescription;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    const-string v8, "[handleNewIceCandidate] #ice; #sfu; #"

    if-nez v2, :cond_8

    :try_start_3
    invoke-virtual {v5}, Le33/u;->f()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v9, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v10, Lb23/g;->y:Lb23/g;

    invoke-interface {v3, v10, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "; Remote desc is null, storing candidate: "

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v10, v9, v3, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :catchall_2
    move-exception p1

    move-object v11, p2

    move-object p2, p1

    move-object p1, v11

    goto :goto_7

    :cond_6
    :goto_2
    iget-object v2, v5, Le33/u;->n:Lmc3/c;

    iput-object v5, v0, Le33/q;->w:Ljava/lang/Object;

    iput-object p1, v0, Le33/q;->x:Lio/getstream/video/android/core/model/IceCandidate;

    iput-object p2, v0, Le33/q;->y:Lmc3/a;

    iput-object v2, v0, Le33/q;->z:Lmc3/c;

    iput v4, v0, Le33/q;->G:I

    invoke-virtual {v2, v0}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-ne v0, v1, :cond_7

    goto :goto_4

    :cond_7
    move-object v0, v2

    move-object v2, p1

    move-object p1, v0

    move-object v0, v5

    :goto_3
    :try_start_4
    iget-object v0, v0, Le33/u;->p:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :try_start_5
    invoke-interface {p1, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    goto :goto_6

    :catchall_3
    move-exception v0

    invoke-interface {p1, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw v0

    :cond_8
    invoke-virtual {v5}, Le33/u;->f()Lb23/k;

    move-result-object v2

    iget-object v4, v2, Lb23/k;->c:Lb23/e;

    iget-object v9, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v10, Lb23/g;->y:Lb23/g;

    invoke-interface {v4, v10, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_9

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "; Remote desc is set, adding candidate: "

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v10, v9, v4, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    iput-object p2, v0, Le33/q;->w:Ljava/lang/Object;

    iput-object v6, v0, Le33/q;->x:Lio/getstream/video/android/core/model/IceCandidate;

    iput-object v6, v0, Le33/q;->y:Lmc3/a;

    iput v3, v0, Le33/q;->G:I

    invoke-virtual {v5, p1, v0}, Le33/u;->a(Lio/getstream/video/android/core/model/IceCandidate;Ls83/c;)Ljava/lang/Object;

    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    if-ne p1, v1, :cond_a

    :goto_4
    return-object v1

    :cond_a
    move-object p1, p2

    :goto_5
    move-object p2, p1

    :goto_6
    invoke-interface {p2, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_7
    invoke-interface {p1, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p2
.end method

.method public final h(Lorg/webrtc/PeerConnection;)V
    .locals 5

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[initialize] #sfu; #"

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Le33/u;->q:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "; peerConnection: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iput-object p1, p0, Le33/u;->u:Lorg/webrtc/PeerConnection;

    new-instance p1, Lb30/m;

    invoke-virtual {p0}, Le33/u;->e()Lorg/webrtc/PeerConnection;

    move-result-object v0

    iget-object v1, p0, Le33/u;->a:Lc43/v;

    invoke-static {v1}, Luf/c0;->n0(Lc43/v;)Lstream/video/sfu/models/PeerType;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lb30/m;-><init>(Lorg/webrtc/PeerConnection;Lstream/video/sfu/models/PeerType;)V

    iput-object p1, p0, Le33/u;->v:Lb30/m;

    invoke-virtual {p0}, Le33/u;->e()Lorg/webrtc/PeerConnection;

    move-result-object p1

    invoke-virtual {p1}, Lorg/webrtc/PeerConnection;->connectionState()Lorg/webrtc/PeerConnection$PeerConnectionState;

    move-result-object p1

    iget-object v0, p0, Le33/u;->r:Lec3/h2;

    invoke-virtual {v0, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    invoke-virtual {p0}, Le33/u;->e()Lorg/webrtc/PeerConnection;

    move-result-object p1

    invoke-virtual {p1}, Lorg/webrtc/PeerConnection;->iceConnectionState()Lorg/webrtc/PeerConnection$IceConnectionState;

    move-result-object p1

    iget-object v0, p0, Le33/u;->s:Lec3/h2;

    invoke-virtual {v0, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void
.end method

.method public final j(Ls83/c;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p1, Le33/r;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Le33/r;

    iget v1, v0, Le33/r;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le33/r;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Le33/r;

    invoke-direct {v0, p0, p1}, Le33/r;-><init>(Le33/u;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Le33/r;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le33/r;->F:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v2, v0, Le33/r;->y:Ljava/util/Iterator;

    iget-object v4, v0, Le33/r;->x:Lmc3/a;

    iget-object v6, v0, Le33/r;->w:Le33/u;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Le33/r;->x:Lmc3/a;

    iget-object v4, v0, Le33/r;->w:Le33/u;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p1, v2

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object p1

    iget-object v2, p1, Lb23/k;->c:Lb23/e;

    iget-object v6, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    iget-object v2, p0, Le33/u;->p:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const-string v8, "[processIceCandidates] #ice; #sfu; #"

    const-string v9, "; count: "

    iget-object v10, p0, Le33/u;->q:Ljava/lang/String;

    invoke-static {v2, v8, v10, v9}, Lm4/a;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v7, v6, v2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    iput-object p0, v0, Le33/r;->w:Le33/u;

    iget-object p1, p0, Le33/u;->n:Lmc3/c;

    iput-object p1, v0, Le33/r;->x:Lmc3/a;

    iput v4, v0, Le33/r;->F:I

    invoke-virtual {p1, v0}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_5

    goto :goto_3

    :cond_5
    move-object v4, p0

    :goto_1
    :try_start_1
    iget-object v2, v4, Le33/u;->p:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v6, v4

    move-object v4, p1

    :cond_6
    :goto_2
    :try_start_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/video/android/core/model/IceCandidate;

    iput-object v6, v0, Le33/r;->w:Le33/u;

    iput-object v4, v0, Le33/r;->x:Lmc3/a;

    iput-object v2, v0, Le33/r;->y:Ljava/util/Iterator;

    iput v3, v0, Le33/r;->F:I

    invoke-virtual {v6, p1, v0}, Le33/u;->a(Lio/getstream/video/android/core/model/IceCandidate;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_3
    return-object v1

    :cond_7
    iget-object p1, v6, Le33/u;->p:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {v4, v5}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_1
    move-exception v0

    move-object v4, p1

    move-object p1, v0

    :goto_4
    invoke-interface {v4, v5}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method

.method public final k(Lorg/webrtc/SessionDescription;Ls83/c;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p2, Le33/s;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Le33/s;

    iget v1, v0, Le33/s;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le33/s;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Le33/s;

    invoke-direct {v0, p0, p2}, Le33/s;-><init>(Le33/u;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Le33/s;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le33/s;->F:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Le33/s;->y:Lmc3/a;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception p2

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Le33/s;->y:Lmc3/a;

    iget-object v2, v0, Le33/s;->x:Lorg/webrtc/SessionDescription;

    iget-object v4, v0, Le33/s;->w:Le33/u;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v2, Lorg/webrtc/SessionDescription;

    iget-object p2, p1, Lorg/webrtc/SessionDescription;->type:Lorg/webrtc/SessionDescription$Type;

    iget-object v6, p1, Lorg/webrtc/SessionDescription;->description:Ljava/lang/String;

    const-string v7, "description"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6}, Le33/u;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v2, p2, v6}, Lorg/webrtc/SessionDescription;-><init>(Lorg/webrtc/SessionDescription$Type;Ljava/lang/String;)V

    iput-object v2, p0, Le33/u;->o:Lorg/webrtc/SessionDescription;

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object p2

    iget-object v6, p2, Lb23/k;->c:Lb23/e;

    iget-object v7, p2, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->y:Lb23/g;

    invoke-interface {v6, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4

    iget-object p2, p2, Lb23/k;->b:Lb23/j;

    iget-object v6, p1, Lorg/webrtc/SessionDescription;->type:Lorg/webrtc/SessionDescription$Type;

    iget-object p1, p1, Lorg/webrtc/SessionDescription;->description:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "SessionDescription(type="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, ", description="

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v6, "[setLocalDescription] #sfu; #"

    const-string v9, "; offerSdp: "

    iget-object v10, p0, Le33/u;->q:Ljava/lang/String;

    invoke-static {v6, v10, v9, p1}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v8, v7, p1, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    iput-object p0, v0, Le33/s;->w:Le33/u;

    iput-object v2, v0, Le33/s;->x:Lorg/webrtc/SessionDescription;

    iget-object p1, p0, Le33/u;->l:Lmc3/c;

    iput-object p1, v0, Le33/s;->y:Lmc3/a;

    iput v4, v0, Le33/s;->F:I

    invoke-virtual {p1, v0}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_2

    :cond_5
    move-object v4, p0

    :goto_1
    :try_start_1
    iput-object v4, v0, Le33/s;->w:Le33/u;

    iput-object v2, v0, Le33/s;->x:Lorg/webrtc/SessionDescription;

    iput-object p1, v0, Le33/s;->y:Lmc3/a;

    iput v3, v0, Le33/s;->F:I

    new-instance p2, Lq83/l;

    invoke-static {v0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v0

    invoke-direct {p2, v0}, Lq83/l;-><init>(Lq83/d;)V

    new-instance v0, Lp33/b;

    invoke-direct {v0, p2, v3}, Lp33/b;-><init>(Lq83/l;I)V

    invoke-virtual {v4}, Le33/u;->e()Lorg/webrtc/PeerConnection;

    move-result-object v3

    invoke-virtual {v3, v0, v2}, Lorg/webrtc/PeerConnection;->setLocalDescription(Lorg/webrtc/SdpObserver;Lorg/webrtc/SessionDescription;)V

    iget-object v0, v4, Le33/u;->j:Ll53/m;

    sget-object v3, Ll53/a;->x:[Ll53/a;

    const-string v3, "setLocalDescription"

    iget-object v2, v2, Lorg/webrtc/SessionDescription;->description:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lq83/l;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    :goto_3
    check-cast p2, Ln23/h;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {p1, v5}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object p2

    :goto_4
    invoke-interface {p1, v5}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p2
.end method

.method public final l(Lorg/webrtc/SessionDescription;Ls83/c;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    const-string v2, "[setRemoteDescription] #ice; #sfu; #"

    instance-of v3, v0, Le33/t;

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Le33/t;

    iget v4, v3, Le33/t;->H:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Le33/t;->H:I

    goto :goto_0

    :cond_0
    new-instance v3, Le33/t;

    invoke-direct {v3, v1, v0}, Le33/t;-><init>(Le33/u;Ls83/c;)V

    :goto_0
    iget-object v0, v3, Le33/t;->F:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Le33/t;->H:I

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v5, :cond_4

    if-eq v5, v8, :cond_3

    if-eq v5, v7, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v2, v3, Le33/t;->x:Ljava/lang/Object;

    check-cast v2, Lmc3/a;

    iget-object v3, v3, Le33/t;->w:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/g0;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v5, v3, Le33/t;->E:Lkotlin/jvm/internal/g0;

    iget-object v7, v3, Le33/t;->z:Lmc3/a;

    iget-object v8, v3, Le33/t;->y:Lkotlin/jvm/internal/g0;

    iget-object v10, v3, Le33/t;->x:Ljava/lang/Object;

    check-cast v10, Lorg/webrtc/SessionDescription;

    iget-object v11, v3, Le33/t;->w:Ljava/lang/Object;

    check-cast v11, Le33/u;

    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto/16 :goto_2

    :catchall_1
    move-exception v0

    move-object v2, v7

    goto/16 :goto_5

    :cond_3
    iget-object v5, v3, Le33/t;->z:Lmc3/a;

    iget-object v8, v3, Le33/t;->y:Lkotlin/jvm/internal/g0;

    iget-object v10, v3, Le33/t;->x:Ljava/lang/Object;

    check-cast v10, Lorg/webrtc/SessionDescription;

    iget-object v11, v3, Le33/t;->w:Ljava/lang/Object;

    check-cast v11, Le33/u;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, v10

    move-object v10, v5

    move-object v5, v0

    move-object v0, v8

    goto :goto_1

    :cond_4
    invoke-static {v0}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object v0

    iput-object v1, v3, Le33/t;->w:Ljava/lang/Object;

    move-object/from16 v5, p1

    iput-object v5, v3, Le33/t;->x:Ljava/lang/Object;

    iput-object v0, v3, Le33/t;->y:Lkotlin/jvm/internal/g0;

    iget-object v10, v1, Le33/u;->m:Lmc3/c;

    iput-object v10, v3, Le33/t;->z:Lmc3/a;

    iput v8, v3, Le33/t;->H:I

    invoke-virtual {v10, v3}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v4, :cond_5

    goto/16 :goto_3

    :cond_5
    move-object v11, v1

    :goto_1
    :try_start_2
    iput-object v11, v3, Le33/t;->w:Ljava/lang/Object;

    iput-object v5, v3, Le33/t;->x:Ljava/lang/Object;

    iput-object v0, v3, Le33/t;->y:Lkotlin/jvm/internal/g0;

    iput-object v10, v3, Le33/t;->z:Lmc3/a;

    iput-object v0, v3, Le33/t;->E:Lkotlin/jvm/internal/g0;

    iput v7, v3, Le33/t;->H:I

    new-instance v8, Lq83/l;

    invoke-static {v3}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v12

    invoke-direct {v8, v12}, Lq83/l;-><init>(Lq83/d;)V

    new-instance v12, Lp33/b;

    invoke-direct {v12, v8, v7}, Lp33/b;-><init>(Lq83/l;I)V

    invoke-virtual {v11}, Le33/u;->e()Lorg/webrtc/PeerConnection;

    move-result-object v7

    new-instance v13, Lorg/webrtc/SessionDescription;

    iget-object v14, v5, Lorg/webrtc/SessionDescription;->type:Lorg/webrtc/SessionDescription$Type;

    iget-object v15, v5, Lorg/webrtc/SessionDescription;->description:Ljava/lang/String;

    const-string v6, "description"

    invoke-static {v15, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v15}, Le33/u;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v13, v14, v6}, Lorg/webrtc/SessionDescription;-><init>(Lorg/webrtc/SessionDescription$Type;Ljava/lang/String;)V

    invoke-virtual {v7, v12, v13}, Lorg/webrtc/PeerConnection;->setRemoteDescription(Lorg/webrtc/SdpObserver;Lorg/webrtc/SessionDescription;)V

    invoke-virtual {v8}, Lq83/l;->a()Ljava/lang/Object;

    move-result-object v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne v6, v4, :cond_6

    goto :goto_3

    :cond_6
    move-object v8, v0

    move-object v7, v10

    move-object v10, v5

    move-object v0, v6

    move-object v5, v8

    :goto_2
    :try_start_3
    iput-object v0, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-virtual {v11}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v5, v0, Lb23/k;->c:Lb23/e;

    iget-object v6, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v12, Lb23/g;->y:Lb23/g;

    invoke-interface {v5, v12, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_7

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    iget-object v5, v11, Le33/u;->q:Ljava/lang/String;

    iget-object v13, v8, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "; result: "

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v12, v6, v2, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    iget-object v0, v11, Le33/u;->j:Ll53/m;

    sget-object v2, Ll53/a;->x:[Ll53/a;

    const-string v2, "setRemoteDescription"

    iget-object v5, v10, Lorg/webrtc/SessionDescription;->description:Ljava/lang/String;

    invoke-virtual {v0, v5, v2}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v8, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Ln23/h;

    instance-of v0, v0, Ln23/g;

    if-eqz v0, :cond_9

    iput-object v8, v3, Le33/t;->w:Ljava/lang/Object;

    iput-object v7, v3, Le33/t;->x:Ljava/lang/Object;

    iput-object v9, v3, Le33/t;->y:Lkotlin/jvm/internal/g0;

    iput-object v9, v3, Le33/t;->z:Lmc3/a;

    iput-object v9, v3, Le33/t;->E:Lkotlin/jvm/internal/g0;

    const/4 v0, 0x3

    iput v0, v3, Le33/t;->H:I

    invoke-virtual {v11, v3}, Le33/u;->j(Ls83/c;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne v0, v4, :cond_8

    :goto_3
    return-object v4

    :cond_8
    move-object v2, v7

    move-object v3, v8

    :goto_4
    move-object v7, v2

    move-object v8, v3

    :cond_9
    invoke-interface {v7, v9}, Lmc3/a;->i(Ljava/lang/Object;)V

    iget-object v0, v8, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    return-object v0

    :catchall_2
    move-exception v0

    move-object v2, v10

    :goto_5
    invoke-interface {v2, v9}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw v0
.end method

.method public final m(Lstream/video/sfu/models/TrackType;Ljava/lang/String;Ljava/util/List;)V
    .locals 4

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    move-object v0, p3

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v1, ":"

    const-string v2, "ontrack"

    if-nez v0, :cond_0

    :try_start_1
    iget-object v0, p0, Le33/u;->j:Ll53/m;

    sget-object v3, Ll53/a;->x:[Ll53/a;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, v2}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    iget-object p3, p0, Le33/u;->j:Ll53/m;

    sget-object v0, Ll53/a;->x:[Ll53/a;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1, v2}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :goto_0
    sget-object p2, Lb23/i;->a:Lb23/i;

    sget-object p2, Lb23/i;->d:Lb23/e;

    sget-object p3, Lb23/g;->F:Lb23/g;

    const-string v0, "SafeCall"

    invoke-interface {p2, p3, v0}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    sget-object p2, Lb23/i;->c:Lb23/j;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Exception occurred: "

    invoke-static {v2, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, p3, v0, v1, p1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.method public onAddStream(Lorg/webrtc/MediaStream;)V
    .locals 5

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[onAddStream] #sfu; #track; #"

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Le33/u;->q:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "; stream: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Le33/u;->c:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public final onAddTrack(Lorg/webrtc/RtpReceiver;[Lorg/webrtc/MediaStream;)V
    .locals 13

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    const-string v5, "[onAddTrack] #sfu; #track; #"

    iget-object v6, p0, Le33/u;->q:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "; receiver: "

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", mediaStreams: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v2, v3, p1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    if-eqz p2, :cond_7

    array-length p1, p2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_7

    aget-object v1, p2, v0

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v7, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->x:Lb23/g;

    invoke-interface {v3, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "; mediaStream: "

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v8, v7, v3, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget-object v2, v1, Lorg/webrtc/MediaStream;->audioTracks:Ljava/util/List;

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lorg/webrtc/AudioTrack;

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v8

    iget-object v9, v8, Lb23/k;->c:Lb23/e;

    iget-object v10, v8, Lb23/k;->a:Ljava/lang/String;

    sget-object v11, Lb23/g;->x:Lb23/g;

    invoke-interface {v9, v11, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_2

    iget-object v8, v8, Lb23/k;->b:Lb23/j;

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v7}, Lp33/q;->a(Lorg/webrtc/MediaStreamTrack;)Ljava/lang/String;

    move-result-object v9

    const-string v12, "; remoteAudioTrack: "

    invoke-static {v5, v6, v12, v9}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v11, v10, v9, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    invoke-virtual {v7, v3}, Lorg/webrtc/MediaStreamTrack;->setEnabled(Z)Z

    goto :goto_1

    :cond_3
    iget-object v2, v1, Lorg/webrtc/MediaStream;->videoTracks:Ljava/util/List;

    if-eqz v2, :cond_5

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lorg/webrtc/VideoTrack;

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v8

    iget-object v9, v8, Lb23/k;->c:Lb23/e;

    iget-object v10, v8, Lb23/k;->a:Ljava/lang/String;

    sget-object v11, Lb23/g;->x:Lb23/g;

    invoke-interface {v9, v11, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_4

    iget-object v8, v8, Lb23/k;->b:Lb23/j;

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v7}, Lp33/q;->a(Lorg/webrtc/MediaStreamTrack;)Ljava/lang/String;

    move-result-object v9

    const-string v12, "; remoteVideoTrack: "

    invoke-static {v5, v6, v12, v9}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v11, v10, v9, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    invoke-virtual {v7, v3}, Lorg/webrtc/MediaStreamTrack;->setEnabled(Z)Z

    goto :goto_2

    :cond_5
    iget-object v2, p0, Le33/u;->c:Lkotlin/jvm/functions/Function1;

    if-eqz v2, :cond_6

    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_7
    return-void
.end method

.method public final onConnectionChange(Lorg/webrtc/PeerConnection$PeerConnectionState;)V
    .locals 6

    const-string v0, "newState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "[onConnectionChange] #sfu; #"

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Le33/u;->q:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "; newState: "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Le33/u;->r:Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v4, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    sget-object v0, Ll53/a;->x:[Ll53/a;

    const-string v0, "onconnectionstatechange"

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Le33/u;->j:Ll53/m;

    invoke-virtual {v1, p1, v0}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final onDataChannel(Lorg/webrtc/DataChannel;)V
    .locals 5

    sget-object v0, Ll53/a;->x:[Ll53/a;

    const-string v0, "ondatachannel"

    iget-object v1, p0, Le33/u;->j:Ll53/m;

    invoke-virtual {v1, p1, v0}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[onDataChannel] #sfu; #"

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Le33/u;->q:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "; channel: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v0, v2, v3, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final onIceCandidate(Lorg/webrtc/IceCandidate;)V
    .locals 6

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[onIceCandidate] #sfu; #"

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Le33/u;->q:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "; candidate: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    if-nez p1, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Le33/u;->e:Lc93/m;

    if-eqz v0, :cond_2

    new-instance v1, Lio/getstream/video/android/core/model/IceCandidate;

    iget-object v2, p1, Lorg/webrtc/IceCandidate;->sdpMid:Ljava/lang/String;

    const-string v3, "sdpMid"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget v3, p1, Lorg/webrtc/IceCandidate;->sdpMLineIndex:I

    iget-object v4, p1, Lorg/webrtc/IceCandidate;->sdp:Ljava/lang/String;

    const-string v5, "sdp"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, ""

    invoke-direct {v1, v2, v3, v4, v5}, Lio/getstream/video/android/core/model/IceCandidate;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Le33/u;->a:Lc43/v;

    invoke-interface {v0, v1, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    sget-object v0, Ll53/a;->x:[Ll53/a;

    const-string v0, "onicecandidate"

    invoke-virtual {p1}, Lorg/webrtc/IceCandidate;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Le33/u;->j:Ll53/m;

    invoke-virtual {v1, p1, v0}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final onIceCandidateError(Lorg/webrtc/IceCandidateErrorEvent;)V
    .locals 11

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->F:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    iget v4, p1, Lorg/webrtc/IceCandidateErrorEvent;->errorCode:I

    iget-object v5, p1, Lorg/webrtc/IceCandidateErrorEvent;->errorText:Ljava/lang/String;

    iget-object v6, p1, Lorg/webrtc/IceCandidateErrorEvent;->address:Ljava/lang/String;

    iget v7, p1, Lorg/webrtc/IceCandidateErrorEvent;->port:I

    iget-object p1, p1, Lorg/webrtc/IceCandidateErrorEvent;->url:Ljava/lang/String;

    const-string v8, ", "

    const-string v9, ", address="

    const-string v10, "IceCandidateErrorEvent(errorCode="

    invoke-static {v4, v10, v8, v5, v9}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ", port="

    const-string v8, ", url="

    invoke-static {v7, v6, v5, v8, v4}, Ld;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v5, ")"

    invoke-static {p1, v5, v4}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    const-string v4, "[onIceCandidateError] #sfu; #"

    const-string v5, "; event: "

    iget-object v6, p0, Le33/u;->q:Ljava/lang/String;

    invoke-static {v4, v6, v5, p1}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v2, v3, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.method public final onIceCandidatesRemoved([Lorg/webrtc/IceCandidate;)V
    .locals 5

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[onIceCandidatesRemoved] #sfu; #"

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Le33/u;->q:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "; iceCandidates: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v0, v2, v3, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public onIceConnectionChange(Lorg/webrtc/PeerConnection$IceConnectionState;)V
    .locals 8

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    iget-object v5, p0, Le33/u;->s:Lec3/h2;

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "[onIceConnectionChange] #ice; #sfu; #"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v7, p0, Le33/u;->q:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "; oldIceState: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", newState: "

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-virtual {v5, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    sget-object v0, Ll53/a;->x:[Ll53/a;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    :cond_1
    iget-object p1, p0, Le33/u;->j:Ll53/m;

    const-string v0, "oniceconnectionstatechange"

    invoke-virtual {p1, v4, v0}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final onIceConnectionReceivingChange(Z)V
    .locals 6

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[onIceConnectionReceivingChange] #sfu; #"

    const-string v4, "; receiving: "

    iget-object v5, p0, Le33/u;->q:Ljava/lang/String;

    invoke-static {v1, v5, v4, p1}, Ld13/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v0, v2, v3, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final onIceGatheringChange(Lorg/webrtc/PeerConnection$IceGatheringState;)V
    .locals 6

    sget-object v0, Ll53/a;->x:[Ll53/a;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    iget-object v2, p0, Le33/u;->j:Ll53/m;

    const-string v3, "onicegatheringstatechange"

    invoke-virtual {v2, v1, v3}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->z:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "[onIceGatheringChange] #sfu; #"

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Le33/u;->q:Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "; newState: "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v4, v3, p1, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.method public onRemoveStream(Lorg/webrtc/MediaStream;)V
    .locals 5

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->x:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[onRemoveStream] #sfu; #track; #"

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Le33/u;->q:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "; stream: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v0, v2, v3, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final onRemoveTrack(Lorg/webrtc/RtpReceiver;)V
    .locals 5

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[onRemoveTrack] #sfu; #track; #"

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Le33/u;->q:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "; receiver: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v0, v2, v3, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public onRenegotiationNeeded()V
    .locals 7

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[onRenegotiationNeeded] #sfu; #"

    const-string v5, "; no args"

    iget-object v6, p0, Le33/u;->q:Ljava/lang/String;

    invoke-static {v1, v6, v5}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    sget-object v0, Ll53/a;->x:[Ll53/a;

    const-string v0, "onnegotiationneeded"

    iget-object v1, p0, Le33/u;->j:Ll53/m;

    invoke-virtual {v1, v4, v0}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le33/u;->d:Lc93/m;

    if-eqz v0, :cond_1

    iget-object v1, p0, Le33/u;->a:Lc43/v;

    invoke-interface {v0, p0, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public final onSelectedCandidatePairChanged(Lorg/webrtc/CandidatePairChangeEvent;)V
    .locals 5

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[onSelectedCandidatePairChanged] #sfu; #"

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Le33/u;->q:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "; event: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v0, v2, v3, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final onSignalingChange(Lorg/webrtc/PeerConnection$SignalingState;)V
    .locals 6

    sget-object v0, Ll53/a;->x:[Ll53/a;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    iget-object v2, p0, Le33/u;->j:Ll53/m;

    const-string v3, "onsignalingstatechange"

    invoke-virtual {v2, v1, v3}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "[onSignalingChange] #sfu; #"

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Le33/u;->q:Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "; newState: "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v4, v3, p1, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.method public final onTrack(Lorg/webrtc/RtpTransceiver;)V
    .locals 5

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[onTrack] #sfu; #"

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Le33/u;->q:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "; transceiver: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v0, v2, v3, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "StreamPeerConnection(type=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Le33/u;->q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', constraints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le33/u;->b:Lorg/webrtc/MediaConstraints;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
