.class public final Le33/v0;
.super Le33/u;
.source "SourceFile"


# static fields
.field public static final Q:Lstream/video/sfu/models/VideoDimension;


# instance fields
.field public final A:Ll53/m;

.field public final B:Ld33/b0;

.field public final C:Lio/sentry/internal/debugmeta/c;

.field public final D:Lec3/h2;

.field public E:Lbc3/c2;

.field public final F:Ljava/util/concurrent/ConcurrentHashMap;

.field public final G:Ljava/util/concurrent/ConcurrentHashMap;

.field public final H:Ljava/util/concurrent/ConcurrentHashMap;

.field public final I:Ljava/util/concurrent/ConcurrentHashMap;

.field public final J:Ljava/util/concurrent/ConcurrentHashMap;

.field public final K:Ln53/x1;

.field public final L:Ljava/util/concurrent/ConcurrentHashMap;

.field public final M:Ljava/util/concurrent/ConcurrentHashMap;

.field public final N:Ljava/util/ArrayList;

.field public final O:Lec3/w1;

.field public final P:Lec3/w1;

.field public final w:Ljava/lang/String;

.field public final x:Lio/getstream/video/android/core/api/SignalServerService;

.field public final y:Lbc3/c0;

.field public final z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Lstream/video/sfu/models/VideoDimension;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/16 v1, 0x2d0

    const/16 v2, 0x500

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lstream/video/sfu/models/VideoDimension;-><init>(IILne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Le33/v0;->Q:Lstream/video/sfu/models/VideoDimension;

    new-instance v1, Lstream/video/sfu/models/VideoDimension;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/16 v2, 0xb4

    const/16 v3, 0x140

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lstream/video/sfu/models/VideoDimension;-><init>(IILne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lstream/video/sfu/models/VideoDimension;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lstream/video/sfu/models/VideoDimension;-><init>(IILne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lio/getstream/video/android/core/api/SignalServerService;Lbc3/c0;ZLl53/m;Landroidx/room/v0;Ly33/e;)V
    .locals 16

    move-object/from16 v12, p1

    move-object/from16 v13, p2

    move-object/from16 v14, p3

    move-object/from16 v10, p5

    sget-object v6, Ld33/b0;->y:Ld33/b0;

    sget-object v7, Ld33/b0;->z:Ld33/b0;

    new-instance v15, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v15, v14}, Lio/sentry/internal/debugmeta/c;-><init>(Lbc3/c0;)V

    const-string v0, "sessionId"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sfuClient"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tracer"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lc43/v;->x:Lc43/v;

    new-instance v2, Lorg/webrtc/MediaConstraints;

    invoke-direct {v2}, Lorg/webrtc/MediaConstraints;-><init>()V

    sget-object v3, Le33/e;->y:Le33/e;

    new-instance v5, Lc4/e;

    const/4 v0, 0x3

    move-object/from16 v4, p6

    invoke-direct {v5, v4, v0}, Lc4/e;-><init>(Ljava/lang/Object;I)V

    const/4 v9, 0x0

    const-string v11, "Subscriber"

    sget-object v4, Le33/k0;->w:Le33/k0;

    const/4 v8, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v11}, Le33/u;-><init>(Lc43/v;Lorg/webrtc/MediaConstraints;Le33/e;Lc93/m;Lc93/m;Lc93/a;Lc93/a;IZLl53/m;Ljava/lang/String;)V

    iput-object v12, v0, Le33/v0;->w:Ljava/lang/String;

    iput-object v13, v0, Le33/v0;->x:Lio/getstream/video/android/core/api/SignalServerService;

    iput-object v14, v0, Le33/v0;->y:Lbc3/c0;

    move/from16 v1, p4

    iput-boolean v1, v0, Le33/v0;->z:Z

    iput-object v10, v0, Le33/v0;->A:Ll53/m;

    iput-object v6, v0, Le33/v0;->B:Ld33/b0;

    iput-object v15, v0, Le33/v0;->C:Lio/sentry/internal/debugmeta/c;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, v0, Le33/v0;->D:Lec3/h2;

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, v0, Le33/v0;->F:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, v0, Le33/v0;->G:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, v0, Le33/v0;->H:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, v0, Le33/v0;->I:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, v0, Le33/v0;->J:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v1, Ln53/x1;

    invoke-direct {v1, v14}, Ln53/x1;-><init>(Lbc3/c0;)V

    iput-object v1, v0, Le33/v0;->K:Ln53/x1;

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, v0, Le33/v0;->L:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, v0, Le33/v0;->M:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Le33/v0;->N:Ljava/util/ArrayList;

    sget-object v1, Ldc3/a;->x:Ldc3/a;

    const/4 v2, 0x1

    const/16 v3, 0x64

    invoke-static {v2, v3, v1}, Lec3/v;->a(IILdc3/a;)Lec3/w1;

    move-result-object v2

    iput-object v2, v0, Le33/v0;->O:Lec3/w1;

    const/4 v2, 0x0

    invoke-static {v2, v3, v1}, Lec3/v;->a(IILdc3/a;)Lec3/w1;

    move-result-object v1

    iput-object v1, v0, Le33/v0;->P:Lec3/w1;

    return-void
.end method


# virtual methods
.method public final n(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Le33/o0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Le33/o0;

    iget v1, v0, Le33/o0;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le33/o0;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Le33/o0;

    invoke-direct {v0, p0, p2}, Le33/o0;-><init>(Le33/v0;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Le33/o0;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le33/o0;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Le33/o0;->w:Le33/v0;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p2, p2, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Le33/p0;

    const/4 v2, 0x0

    invoke-direct {p2, p1, p0, v2}, Le33/p0;-><init>(Ljava/lang/String;Le33/v0;Lq83/d;)V

    iput-object p0, v0, Le33/o0;->w:Le33/v0;

    iput v3, v0, Le33/o0;->z:I

    iget-object p1, p0, Le33/v0;->K:Ln53/x1;

    const-string v2, "subscriberNegotiate"

    invoke-virtual {p1, v2, p2, v0}, Ln53/x1;->c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    :goto_1
    invoke-static {p2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object p1, p1, Le33/v0;->A:Ll53/m;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_4

    const-string v0, "unknown"

    :cond_4
    const-string v1, "negotiate-error-submit"

    invoke-virtual {p1, v0, v1}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_5
    return-object p2
.end method

.method public final o(Lorg/webrtc/MediaStream;)V
    .locals 11

    const-string v0, "mediaStream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

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

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "[addStream] #sfu; #track; mediaStream: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v2, v0, v4, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Le33/v0;->L:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    const-string v4, "[addStream] #sfu; #track; trackPrefixToSessionIdMap is empty, adding to pending"

    invoke-interface {v1, v2, v0, v4, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget-object v0, p0, Le33/v0;->N:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Le33/v0;->N:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :cond_2
    invoke-virtual {p1}, Lorg/webrtc/MediaStream;->getId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getId(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    new-array v4, v1, [C

    const/16 v5, 0x3a

    const/4 v6, 0x0

    aput-char v5, v4, v6

    const/4 v5, 0x6

    invoke-static {v0, v4, v6, v5}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v5

    iget-object v6, v5, Lb23/k;->c:Lb23/e;

    iget-object v7, v5, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v6, v2, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    iget-object v6, v5, Lb23/k;->b:Lb23/j;

    iget-object v5, v5, Lb23/k;->a:Ljava/lang/String;

    const-string v7, "[addStream] #sfu; #track; trackPrefix: "

    const-string v8, ", trackTypeString: "

    invoke-static {v7, v4, v8, v0}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v6, v2, v5, v7, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iget-object v5, p0, Le33/v0;->L:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v5, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_b

    iget-object v6, p0, Le33/v0;->L:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v6, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/CharSequence;

    if-eqz v6, :cond_b

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-nez v6, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v2, "TRACK_TYPE_UNSPECIFIED"

    sget-object v4, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_UNSPECIFIED:Lstream/video/sfu/models/TrackType;

    new-instance v6, Ll83/k;

    invoke-direct {v6, v2, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v2, "TRACK_TYPE_AUDIO"

    sget-object v4, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_AUDIO:Lstream/video/sfu/models/TrackType;

    new-instance v7, Ll83/k;

    invoke-direct {v7, v2, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v2, "TRACK_TYPE_VIDEO"

    sget-object v4, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_VIDEO:Lstream/video/sfu/models/TrackType;

    new-instance v8, Ll83/k;

    invoke-direct {v8, v2, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v2, "TRACK_TYPE_SCREEN_SHARE"

    sget-object v4, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_SCREEN_SHARE:Lstream/video/sfu/models/TrackType;

    new-instance v9, Ll83/k;

    invoke-direct {v9, v2, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v2, "TRACK_TYPE_SCREEN_SHARE_AUDIO"

    sget-object v4, Lstream/video/sfu/models/TrackType;->TRACK_TYPE_SCREEN_SHARE_AUDIO:Lstream/video/sfu/models/TrackType;

    new-instance v10, Ll83/k;

    invoke-direct {v10, v2, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v6, v7, v8, v9, v10}, [Ll83/k;

    move-result-object v2

    invoke-static {v2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lstream/video/sfu/models/TrackType;

    if-nez v2, :cond_6

    sget-object v2, Lstream/video/sfu/models/TrackType;->Companion:Lstream/video/sfu/models/TrackType$Companion;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v2, v4}, Lstream/video/sfu/models/TrackType$Companion;->fromValue(I)Lstream/video/sfu/models/TrackType;

    move-result-object v2

    if-eqz v2, :cond_5

    goto :goto_0

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "trackType not recognized: "

    invoke-static {v1, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_0
    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v4, v0, Lb23/k;->c:Lb23/e;

    sget-object v6, Lb23/g;->z:Lb23/g;

    iget-object v7, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v6, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_7

    iget-object v4, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "[addStream] #sfu; mediaStream: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v4, v6, v0, v7, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    iget-object v0, p1, Lorg/webrtc/MediaStream;->audioTracks:Ljava/util/List;

    const-string v4, "audioTracks"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/webrtc/AudioTrack;

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v6

    iget-object v7, v6, Lb23/k;->c:Lb23/e;

    sget-object v8, Lb23/g;->x:Lb23/g;

    iget-object v9, v6, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v7, v8, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_8

    iget-object v7, v6, Lb23/k;->b:Lb23/j;

    iget-object v6, v6, Lb23/k;->a:Ljava/lang/String;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v4}, Lp33/q;->a(Lorg/webrtc/MediaStreamTrack;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "[addStream] #sfu; audioTrack: "

    invoke-static {v10, v9}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v7, v8, v6, v9, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    invoke-virtual {v4, v1}, Lorg/webrtc/MediaStreamTrack;->setEnabled(Z)Z

    new-instance v6, Lc43/a;

    invoke-virtual {p1}, Lorg/webrtc/MediaStream;->getId()Ljava/lang/String;

    move-result-object v7

    const-string v8, "getId(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v6, v7, v4}, Lc43/a;-><init>(Ljava/lang/String;Lorg/webrtc/AudioTrack;)V

    iget-object v7, p0, Le33/v0;->M:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v4}, Lorg/webrtc/MediaStreamTrack;->id()Ljava/lang/String;

    move-result-object v8

    const-string v9, "id(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, v8, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v7, p0, Le33/v0;->I:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v4}, Lorg/webrtc/MediaStreamTrack;->id()Ljava/lang/String;

    move-result-object v8

    const-string v9, "id(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, v8, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/webrtc/MediaStreamTrack;->id()Ljava/lang/String;

    move-result-object v4

    const-string v7, "id(...)"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lorg/webrtc/MediaStream;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    invoke-virtual {p0, v2, v4, v7}, Le33/u;->m(Lstream/video/sfu/models/TrackType;Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {p0, v5, v2, v6}, Le33/v0;->q(Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lc43/g;)V

    iget-object v4, p0, Le33/v0;->O:Lec3/w1;

    new-instance v7, Le33/l0;

    invoke-direct {v7, v5, v2, v6}, Le33/l0;-><init>(Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lc43/g;)V

    invoke-virtual {v4, v7}, Lec3/w1;->a(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_9
    iget-object v0, p1, Lorg/webrtc/MediaStream;->videoTracks:Ljava/util/List;

    const-string v4, "videoTracks"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/webrtc/VideoTrack;

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v6

    iget-object v7, v6, Lb23/k;->c:Lb23/e;

    sget-object v8, Lb23/g;->E:Lb23/g;

    iget-object v9, v6, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v7, v8, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_a

    iget-object v7, v6, Lb23/k;->b:Lb23/j;

    iget-object v6, v6, Lb23/k;->a:Ljava/lang/String;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v4}, Lp33/q;->a(Lorg/webrtc/MediaStreamTrack;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "[addStream] #sfu; #track; videoTrack: "

    invoke-static {v10, v9}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v7, v8, v6, v9, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_a
    invoke-virtual {v4, v1}, Lorg/webrtc/MediaStreamTrack;->setEnabled(Z)Z

    new-instance v6, Lc43/w;

    invoke-virtual {p1}, Lorg/webrtc/MediaStream;->getId()Ljava/lang/String;

    move-result-object v7

    const-string v8, "getId(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v6, v7, v4}, Lc43/w;-><init>(Ljava/lang/String;Lorg/webrtc/VideoTrack;)V

    iget-object v7, p0, Le33/v0;->M:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v4}, Lorg/webrtc/MediaStreamTrack;->id()Ljava/lang/String;

    move-result-object v8

    const-string v9, "id(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, v8, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v7, p0, Le33/v0;->I:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v4}, Lorg/webrtc/MediaStreamTrack;->id()Ljava/lang/String;

    move-result-object v8

    const-string v9, "id(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, v8, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/webrtc/MediaStreamTrack;->id()Ljava/lang/String;

    move-result-object v4

    const-string v7, "id(...)"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lorg/webrtc/MediaStream;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    invoke-virtual {p0, v2, v4, v7}, Le33/u;->m(Lstream/video/sfu/models/TrackType;Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {p0, v5, v2, v6}, Le33/v0;->q(Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lc43/g;)V

    iget-object v4, p0, Le33/v0;->O:Lec3/w1;

    new-instance v7, Le33/l0;

    invoke-direct {v7, v5, v2, v6}, Le33/l0;-><init>(Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lc43/g;)V

    invoke-virtual {v4, v7}, Lec3/w1;->a(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_b
    :goto_3
    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v5, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    iget-object v1, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "[addStream] skipping unrecognized trackPrefix "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " "

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ".id"

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v2, v0, p1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_c
    return-void
.end method

.method public final onAddStream(Lorg/webrtc/MediaStream;)V
    .locals 4

    invoke-super {p0, p1}, Le33/u;->onAddStream(Lorg/webrtc/MediaStream;)V

    if-nez p1, :cond_1

    invoke-virtual {p0}, Le33/u;->f()Lb23/k;

    move-result-object p1

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v1, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v0, v2, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v0, "[onAddStream] #sfu; #track; stream is null"

    const/4 v3, 0x0

    invoke-interface {p1, v2, v1, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void

    :cond_1
    invoke-virtual {p0, p1}, Le33/v0;->o(Lorg/webrtc/MediaStream;)V

    return-void
.end method

.method public final onIceConnectionChange(Lorg/webrtc/PeerConnection$IceConnectionState;)V
    .locals 3

    invoke-super {p0, p1}, Le33/u;->onIceConnectionChange(Lorg/webrtc/PeerConnection$IceConnectionState;)V

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Le33/n0;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    :goto_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Le33/v0;->C:Lio/sentry/internal/debugmeta/c;

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Le33/r0;

    invoke-direct {p1, p0, v1}, Le33/r0;-><init>(Le33/v0;Lq83/d;)V

    invoke-virtual {v2, p1}, Lio/sentry/internal/debugmeta/c;->E(Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_2
    new-instance p1, Le33/q0;

    invoke-direct {p1, p0, v1}, Le33/q0;-><init>(Le33/v0;Lq83/d;)V

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

.method public final onRemoveStream(Lorg/webrtc/MediaStream;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-super/range {p0 .. p1}, Le33/u;->onRemoveStream(Lorg/webrtc/MediaStream;)V

    if-nez v1, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-virtual {v0}, Le33/u;->f()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->z:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    const/4 v6, 0x0

    if-eqz v3, :cond_1

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v7, "[onRemoveStream] #sfu; #track; #orphaned-track; stream: "

    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v5, v4, v3, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget-object v2, v1, Lorg/webrtc/MediaStream;->audioTracks:Ljava/util/List;

    const-string v3, "audioTracks"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    iget-object v4, v0, Le33/v0;->P:Lec3/w1;

    iget-object v5, v0, Le33/v0;->J:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v7, ", trackId="

    const-string v8, ", trackType="

    iget-object v9, v0, Le33/v0;->I:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v10, v0, Le33/v0;->M:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/webrtc/AudioTrack;

    invoke-virtual {v3}, Lorg/webrtc/MediaStreamTrack;->id()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v10, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-virtual {v9, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lstream/video/sfu/models/TrackType;

    if-eqz v11, :cond_4

    if-eqz v12, :cond_4

    invoke-virtual {v0}, Le33/u;->f()Lb23/k;

    move-result-object v13

    iget-object v14, v13, Lb23/k;->c:Lb23/e;

    iget-object v15, v13, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->z:Lb23/g;

    invoke-interface {v14, v6, v15}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_2

    iget-object v13, v13, Lb23/k;->b:Lb23/j;

    new-instance v14, Ljava/lang/StringBuilder;

    const-string v0, "[onRemoveStream] #sfu; #track; #orphaned-track; Removing audio track for sessionId="

    invoke-direct {v14, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v7, 0x0

    invoke-interface {v13, v6, v15, v0, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    invoke-virtual {v5, v11}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v0, :cond_3

    invoke-virtual {v0, v12}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc43/g;

    :cond_3
    invoke-virtual {v10, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v9, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Le33/m0;

    invoke-direct {v0, v11, v12}, Le33/m0;-><init>(Ljava/lang/String;Lstream/video/sfu/models/TrackType;)V

    invoke-virtual {v4, v0}, Lec3/w1;->a(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-virtual/range {p0 .. p0}, Le33/u;->f()Lb23/k;

    move-result-object v0

    iget-object v4, v0, Lb23/k;->c:Lb23/e;

    iget-object v5, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->E:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v4, "[onRemoveStream] #sfu; #track; #orphaned-track; Could not find sessionId or trackType for removed audio track: "

    invoke-static {v4, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v7, 0x0

    invoke-interface {v0, v6, v5, v3, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    :goto_1
    move-object/from16 v0, p0

    const/4 v6, 0x0

    goto/16 :goto_0

    :cond_6
    iget-object v0, v1, Lorg/webrtc/MediaStream;->videoTracks:Ljava/util/List;

    const-string v1, "videoTracks"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/webrtc/VideoTrack;

    invoke-virtual {v1}, Lorg/webrtc/MediaStreamTrack;->id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v9, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lstream/video/sfu/models/TrackType;

    if-eqz v2, :cond_9

    if-eqz v3, :cond_9

    invoke-virtual/range {p0 .. p0}, Le33/u;->f()Lb23/k;

    move-result-object v6

    iget-object v11, v6, Lb23/k;->c:Lb23/e;

    iget-object v12, v6, Lb23/k;->a:Ljava/lang/String;

    sget-object v13, Lb23/g;->z:Lb23/g;

    invoke-interface {v11, v13, v12}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_7

    iget-object v6, v6, Lb23/k;->b:Lb23/j;

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v14, "[onRemoveStream] #sfu; #track; #orphaned-track; Removing video track for sessionId="

    invoke-direct {v11, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    const/4 v14, 0x0

    invoke-interface {v6, v13, v12, v11, v14}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    invoke-virtual {v5, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz v6, :cond_8

    invoke-virtual {v6, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lc43/g;

    :cond_8
    invoke-virtual {v10, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v9, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Le33/m0;

    invoke-direct {v1, v2, v3}, Le33/m0;-><init>(Ljava/lang/String;Lstream/video/sfu/models/TrackType;)V

    invoke-virtual {v4, v1}, Lec3/w1;->a(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_9
    invoke-virtual/range {p0 .. p0}, Le33/u;->f()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v6, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v11, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v11, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_a

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    const-string v3, "[onRemoveStream] #sfu; #track; #orphaned-track; Could not find sessionId or trackType for removed video track: "

    invoke-static {v3, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v14, 0x0

    invoke-interface {v2, v11, v6, v1, v14}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_2

    :cond_a
    :goto_3
    const/4 v14, 0x0

    goto/16 :goto_2

    :cond_b
    :goto_4
    return-void
.end method

.method public final p(Ls83/c;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p1, Le33/s0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Le33/s0;

    iget v1, v0, Le33/s0;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le33/s0;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Le33/s0;

    invoke-direct {v0, p0, p1}, Le33/s0;-><init>(Le33/v0;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Le33/s0;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le33/s0;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Le33/s0;->w:Le33/v0;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :catch_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    new-instance v4, Lstream/video/sfu/signal/ICERestartRequest;

    iget-object v5, p0, Le33/v0;->w:Ljava/lang/String;

    sget-object v6, Lstream/video/sfu/models/PeerType;->PEER_TYPE_SUBSCRIBER:Lstream/video/sfu/models/PeerType;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lstream/video/sfu/signal/ICERestartRequest;-><init>(Ljava/lang/String;Lstream/video/sfu/models/PeerType;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, Le33/v0;->x:Lio/getstream/video/android/core/api/SignalServerService;

    iput-object p0, v0, Le33/s0;->w:Le33/v0;

    iput v3, v0, Le33/s0;->z:I

    invoke-interface {p1, v4, v0}, Lio/getstream/video/android/core/api/SignalServerService;->iceRestart(Lstream/video/sfu/signal/ICERestartRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v1, p0

    :goto_1
    :try_start_2
    new-instance v0, Ln23/g;

    invoke-direct {v0, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    move-object v1, p0

    :goto_2
    sget-object v0, Lb23/i;->a:Lb23/i;

    sget-object v0, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->F:Lb23/g;

    const-string v3, "SafeApiCall"

    invoke-interface {v0, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lb23/i;->c:Lb23/j;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    const-string v5, "API call failed: "

    invoke-static {v5, v4}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v2, v3, v4, p1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    new-instance v0, Ln23/f;

    new-instance v2, Ln23/d;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_5

    const-string v3, "API call failed"

    :cond_5
    invoke-direct {v2, v3, p1}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v0, v2}, Ln23/f;-><init>(Ln23/e;)V

    :goto_3
    instance-of p1, v0, Ln23/g;

    if-nez p1, :cond_8

    instance-of p1, v0, Ln23/f;

    if-eqz p1, :cond_7

    move-object p1, v0

    check-cast p1, Ln23/f;

    iget-object p1, p1, Ln23/f;->a:Ln23/e;

    iget-object v2, v1, Le33/v0;->A:Ll53/m;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_6

    const-string p1, "unknown"

    :cond_6
    const-string v3, "iceRestart-error"

    invoke-virtual {v2, p1, v3}, Ll53/m;->b(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, v1, Le33/v0;->C:Lio/sentry/internal/debugmeta/c;

    iget-object p1, p1, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast p1, Lbc3/c2;

    if-eqz p1, :cond_8

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    goto :goto_4

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_8
    :goto_4
    return-object v0

    :goto_5
    throw p1
.end method

.method public final q(Ljava/lang/String;Lstream/video/sfu/models/TrackType;Lc43/g;)V
    .locals 2

    const-string v0, "sessionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iget-object v1, p0, Le33/v0;->J:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz p1, :cond_0

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final r(Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p1, Le33/u0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Le33/u0;

    iget v1, v0, Le33/u0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le33/u0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Le33/u0;

    invoke-direct {v0, p0, p1}, Le33/u0;-><init>(Le33/v0;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Le33/u0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le33/u0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Le33/u;->v:Lb30/m;

    if-eqz p1, :cond_4

    iget-object v2, p0, Le33/v0;->I:Ljava/util/concurrent/ConcurrentHashMap;

    iput v3, v0, Le33/u0;->y:I

    new-instance v4, Lbc3/m;

    invoke-static {v0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v0

    invoke-direct {v4, v3, v0}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v4}, Lbc3/m;->s()V

    iget-object v0, p1, Lb30/m;->x:Ljava/lang/Object;

    check-cast v0, Lorg/webrtc/PeerConnection;

    new-instance v3, Lgm/r;

    const/4 v5, 0x4

    invoke-direct {v3, p1, v2, v4, v5}, Lgm/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v0, v3}, Lorg/webrtc/PeerConnection;->getStats(Lorg/webrtc/RTCStatsCollectorCallback;)V

    invoke-virtual {v4}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lh33/a;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_2
    sget-object v0, Lb23/i;->a:Lb23/i;

    sget-object v0, Lb23/i;->d:Lb23/e;

    sget-object v1, Lb23/g;->F:Lb23/g;

    const-string v2, "SafeCall"

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lb23/i;->c:Lb23/j;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    const-string v4, "Exception occurred: "

    invoke-static {v4, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3, p1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    const/4 p1, 0x0

    return-object p1
.end method

.method public final s()Ljava/util/LinkedHashMap;
    .locals 3

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iget-object v1, p0, Le33/v0;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_0

    return-object v0

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0
.end method
