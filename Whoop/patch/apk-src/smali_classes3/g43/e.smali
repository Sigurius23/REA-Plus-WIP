.class public final Lg43/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ll83/p;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    const-string v0, "Throttler"

    invoke-static {p0, v0}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lg43/e;->a:Ll83/p;

    .line 3
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lg43/e;->b:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public constructor <init>(Lg43/k;Lg43/q;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    const-string p1, "Video:MediaSessionController"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lg43/e;->a:Ll83/p;

    .line 6
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lg43/e;->b:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public static c(Lg43/e;Landroid/support/v4/media/session/p;Lt23/c0;Landroid/support/v4/media/c;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p4, Lg43/c;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lg43/c;

    iget v1, v0, Lg43/c;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lg43/c;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lg43/c;

    invoke-direct {v0, p0, p4}, Lg43/c;-><init>(Lg43/e;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Lg43/c;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lg43/c;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lg43/c;->w:Landroid/support/v4/media/session/p;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p3, p4

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p0, p0, Lg43/e;->a:Ll83/p;

    invoke-virtual {p0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lb23/k;

    iget-object p4, p0, Lb23/k;->c:Lb23/e;

    iget-object v2, p0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->y:Lb23/g;

    invoke-interface {p4, v4, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_3

    iget-object p0, p0, Lb23/k;->b:Lb23/j;

    new-instance p4, Ljava/lang/StringBuilder;

    const-string v5, "[updateMetadata] Updating media metadata for session: "

    invoke-direct {p4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    const/4 v5, 0x0

    invoke-interface {p0, v4, v2, p4, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p0, Landroid/support/v4/media/MediaMetadataCompat;->y:La0/g;

    const-string p4, "android.media.metadata.DURATION"

    invoke-virtual {p0, p4}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {p0, p4}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    if-nez p0, :cond_4

    goto :goto_1

    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "The android.media.metadata.DURATION key cannot be used to put a long"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    :goto_1
    iget-object p0, p3, Landroid/support/v4/media/c;->a:Landroid/os/Bundle;

    const-wide/16 v4, -0x1

    invoke-virtual {p0, p4, v4, v5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    sget-object p0, Lio/getstream/video/android/model/StreamCallId;->Companion:Lio/getstream/video/android/model/b;

    iget-object p2, p2, Lt23/c0;->v:Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2}, Lio/getstream/video/android/model/b;->a(Ljava/lang/String;)Lio/getstream/video/android/model/StreamCallId;

    iput-object p1, v0, Lg43/c;->w:Landroid/support/v4/media/session/p;

    iput v3, v0, Lg43/c;->z:I

    if-ne p3, v1, :cond_6

    return-object v1

    :cond_6
    :goto_2
    check-cast p3, Landroid/support/v4/media/c;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Landroid/support/v4/media/MediaMetadataCompat;

    iget-object p2, p3, Landroid/support/v4/media/c;->a:Landroid/os/Bundle;

    invoke-direct {p0, p2}, Landroid/support/v4/media/MediaMetadataCompat;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {p1, p0}, Landroid/support/v4/media/session/p;->b(Landroid/support/v4/media/MediaMetadataCompat;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static d(Lg43/e;Landroid/support/v4/media/session/p;Lt23/c0;Landroid/support/v4/media/session/s;Ls83/c;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    instance-of v5, v4, Lg43/d;

    if-eqz v5, :cond_0

    move-object v5, v4

    check-cast v5, Lg43/d;

    iget v6, v5, Lg43/d;->z:I

    const/high16 v7, -0x80000000

    and-int v8, v6, v7

    if-eqz v8, :cond_0

    sub-int/2addr v6, v7

    iput v6, v5, Lg43/d;->z:I

    goto :goto_0

    :cond_0
    new-instance v5, Lg43/d;

    invoke-direct {v5, v0, v4}, Lg43/d;-><init>(Lg43/e;Ls83/c;)V

    :goto_0
    iget-object v4, v5, Lg43/d;->x:Ljava/lang/Object;

    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v7, v5, Lg43/d;->z:I

    const/4 v8, 0x1

    if-eqz v7, :cond_2

    if-ne v7, v8, :cond_1

    iget-object v0, v5, Lg43/d;->w:Landroid/support/v4/media/session/p;

    invoke-static {v4}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v3, v4

    goto/16 :goto_4

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v4}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v0, Lg43/e;->a:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    iget-object v4, v0, Lb23/k;->c:Lb23/e;

    iget-object v7, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v9, Lb23/g;->y:Lb23/g;

    invoke-interface {v4, v9, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    const/4 v10, 0x0

    if-eqz v4, :cond_3

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v11, "[updatePlaybackState] Updating media metadata for session: "

    invoke-direct {v4, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v9, v7, v4, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iget-object v0, v2, Lt23/c0;->C:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld33/h1;

    if-eqz v0, :cond_4

    iget-object v0, v0, Ld33/h1;->z:Lec3/h2;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le33/v0;

    if-eqz v0, :cond_4

    iget-object v0, v0, Le33/v0;->D:Lec3/h2;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    goto :goto_1

    :cond_4
    move-object v0, v10

    :goto_1
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/4 v0, 0x3

    goto :goto_2

    :cond_5
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 v0, 0x2

    goto :goto_2

    :cond_6
    const/4 v0, 0x0

    :goto_2
    iget-object v2, v2, Lt23/c0;->p:Lt23/s0;

    iget-object v2, v2, Lt23/s0;->K:Lec3/r1;

    iget-object v2, v2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/time/Duration;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lkotlin/time/Duration;->unbox-impl()J

    move-result-wide v9

    invoke-static {v9, v10}, Lkotlin/time/Duration;->getInWholeMilliseconds-impl(J)J

    move-result-wide v9

    new-instance v2, Ljava/lang/Long;

    invoke-direct {v2, v9, v10}, Ljava/lang/Long;-><init>(J)V

    move-object v10, v2

    :cond_7
    if-eqz v10, :cond_8

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    goto :goto_3

    :cond_8
    const-wide/16 v9, -0x1

    :goto_3
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v11

    iput v0, v3, Landroid/support/v4/media/session/s;->b:I

    iput-wide v9, v3, Landroid/support/v4/media/session/s;->c:J

    iput-wide v11, v3, Landroid/support/v4/media/session/s;->e:J

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, v3, Landroid/support/v4/media/session/s;->d:F

    iput-object v1, v5, Lg43/d;->w:Landroid/support/v4/media/session/p;

    iput v8, v5, Lg43/d;->z:I

    if-ne v3, v6, :cond_9

    return-object v6

    :cond_9
    move-object v0, v1

    :goto_4
    check-cast v3, Landroid/support/v4/media/session/s;

    new-instance v4, Landroid/support/v4/media/session/PlaybackStateCompat;

    iget v5, v3, Landroid/support/v4/media/session/s;->b:I

    iget-wide v6, v3, Landroid/support/v4/media/session/s;->c:J

    iget v10, v3, Landroid/support/v4/media/session/s;->d:F

    iget-wide v1, v3, Landroid/support/v4/media/session/s;->e:J

    iget-object v8, v3, Landroid/support/v4/media/session/s;->a:Ljava/util/ArrayList;

    iget-wide v11, v3, Landroid/support/v4/media/session/s;->f:J

    const/16 v20, 0x0

    move-object/from16 v17, v8

    const-wide/16 v8, 0x0

    move-wide/from16 v18, v11

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-wide v15, v1

    invoke-direct/range {v4 .. v20}, Landroid/support/v4/media/session/PlaybackStateCompat;-><init>(IJJFJILjava/lang/CharSequence;JLjava/util/ArrayList;JLandroid/os/Bundle;)V

    invoke-virtual {v0, v4}, Landroid/support/v4/media/session/p;->c(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method


# virtual methods
.method public a(Lio/getstream/video/android/model/StreamCallId;)V
    .locals 5

    iget-object v0, p0, Lg43/e;->a:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[clear] Clearing media session for call: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lg43/e;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lio/getstream/video/android/model/StreamCallId;->getCid()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public b(Landroid/app/Application;Lio/getstream/video/android/model/StreamCallId;Ljava/lang/String;)Landroid/support/v4/media/session/p;
    .locals 23

    move-object/from16 v0, p1

    const-string v1, "application"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "callId"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lio/getstream/video/android/model/StreamCallId;->getCid()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v3, p0

    iget-object v4, v3, Lg43/e;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v4, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/media/session/p;

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v2}, Lio/getstream/video/android/model/StreamCallId;->getCid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/media/session/p;

    if-nez v1, :cond_1

    new-instance v1, Landroid/support/v4/media/session/p;

    move-object/from16 v5, p3

    invoke-direct {v1, v0, v5}, Landroid/support/v4/media/session/p;-><init>(Landroid/app/Application;Ljava/lang/String;)V

    :cond_1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    new-instance v5, Landroid/support/v4/media/MediaMetadataCompat;

    invoke-direct {v5, v0}, Landroid/support/v4/media/MediaMetadataCompat;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {v1, v5}, Landroid/support/v4/media/session/p;->b(Landroid/support/v4/media/MediaMetadataCompat;)V

    new-instance v19, Ljava/util/ArrayList;

    invoke-direct/range {v19 .. v19}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Landroid/support/v4/media/session/PlaybackStateCompat;

    const/16 v16, 0x0

    const/16 v22, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v20, -0x1

    invoke-direct/range {v6 .. v22}, Landroid/support/v4/media/session/PlaybackStateCompat;-><init>(IJJFJILjava/lang/CharSequence;JLjava/util/ArrayList;JLandroid/os/Bundle;)V

    invoke-virtual {v1, v6}, Landroid/support/v4/media/session/p;->c(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    invoke-virtual {v2}, Lio/getstream/video/android/model/StreamCallId;->getCid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method
