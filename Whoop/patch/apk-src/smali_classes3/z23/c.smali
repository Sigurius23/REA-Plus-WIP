.class public final Lz23/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La33/d;

.field public final b:Lpg3/p;

.field public final c:Lz23/a;

.field public final d:Ljava/util/concurrent/ConcurrentHashMap;

.field public final e:Ljava/util/concurrent/ConcurrentHashMap;

.field public final f:Lty/c;


# direct methods
.method public constructor <init>(La33/d;Lpg3/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz23/c;->a:La33/d;

    iput-object p2, p0, Lz23/c;->b:Lpg3/p;

    const-string p1, "ClientEventReporter"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    new-instance p1, Lz23/a;

    invoke-direct {p1, p2}, Lz23/a;-><init>(Lpg3/p;)V

    iput-object p1, p0, Lz23/c;->c:Lz23/a;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lz23/c;->d:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lz23/c;->e:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance p1, Lty/c;

    const/16 p2, 0x1c

    invoke-direct {p1, p2}, Lty/c;-><init>(I)V

    iput-object p1, p0, Lz23/c;->f:Lty/c;

    return-void
.end method

.method public static b(Lz23/c;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    and-int/lit8 v1, p7, 0x8

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    move-object/from16 v1, p4

    :goto_0
    and-int/lit8 v3, p7, 0x10

    if-eqz v3, :cond_1

    move-object v3, v2

    goto :goto_1

    :cond_1
    move-object/from16 v3, p5

    :goto_1
    and-int/lit8 v4, p7, 0x20

    if-eqz v4, :cond_2

    move-object v14, v2

    goto :goto_2

    :cond_2
    move-object/from16 v14, p6

    :goto_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "stageId"

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v0, Lz23/c;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v4, v6}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lb33/h;

    if-nez v4, :cond_3

    goto :goto_5

    :cond_3
    instance-of v5, v4, Lb33/j;

    if-eqz v5, :cond_7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    invoke-virtual {v4}, Lb33/h;->a()J

    move-result-wide v9

    sub-long/2addr v7, v9

    check-cast v4, Lb33/j;

    move-object v5, v1

    iget-object v1, v0, Lz23/c;->c:Lz23/a;

    move-object v9, v2

    iget-object v2, v4, Lb33/j;->a:Ljava/lang/String;

    move-object v10, v3

    iget-object v3, v4, Lb33/j;->b:Ljava/lang/String;

    sget-object v11, Lb33/d;->y:Lb33/d;

    move-object v12, v5

    sget-object v5, Lb33/g;->y:Lb33/g;

    if-eqz p2, :cond_4

    sget-object v13, Lb33/c;->x:Lb33/c;

    goto :goto_3

    :cond_4
    sget-object v13, Lb33/c;->y:Lb33/c;

    :goto_3
    if-nez p2, :cond_5

    goto :goto_4

    :cond_5
    move-object v12, v9

    :goto_4
    if-nez p2, :cond_6

    move-object v9, v10

    :cond_6
    move-wide v15, v7

    iget-object v8, v4, Lb33/j;->f:Ljava/lang/String;

    iget-object v7, v4, Lb33/j;->g:Ls93/k;

    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/16 v20, 0x0

    const v21, 0x7fe000

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v22, v9

    move-object v9, v4

    move-object v4, v11

    move-object v11, v10

    move-object v10, v13

    move-object/from16 v13, v22

    invoke-static/range {v1 .. v21}, Lz23/a;->a(Lz23/a;Ljava/lang/String;Ljava/lang/String;Lb33/f;Lb33/g;Ljava/lang/String;Ls93/k;Ljava/lang/String;Ljava/lang/Long;Lb33/c;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb33/i;Ljava/lang/Boolean;Lw23/t;Ljava/lang/Boolean;Ljava/lang/Boolean;I)Lio/getstream/android/video/generated/models/ClientEvent;

    move-result-object v1

    iget-object v0, v0, Lz23/c;->a:La33/d;

    invoke-virtual {v0, v1}, La33/d;->P(Lio/getstream/android/video/generated/models/ClientEvent;)V

    :cond_7
    :goto_5
    return-void
.end method

.method public static c(Lz23/c;Ljava/lang/String;ZLjava/lang/Integer;)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    const-string v1, "stageId"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lz23/c;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, v6}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb33/h;

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    instance-of v2, v1, Lb33/b;

    if-eqz v2, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1}, Lb33/h;->a()J

    move-result-wide v4

    sub-long/2addr v2, v4

    iget-object v1, v0, Lz23/c;->a:La33/d;

    iget-object v0, v0, Lz23/c;->c:Lz23/a;

    if-eqz p2, :cond_1

    sget-object v4, Lb33/c;->x:Lb33/c;

    :goto_0
    move-object v10, v4

    goto :goto_1

    :cond_1
    sget-object v4, Lb33/c;->y:Lb33/c;

    goto :goto_0

    :goto_1
    sget-object v5, Lb33/g;->y:Lb33/g;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    const/16 v20, 0x0

    const v21, 0x7ff063

    const/4 v2, 0x0

    const/4 v3, 0x0

    sget-object v4, Lb33/e;->w:Lb33/e;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object v11, v1

    move-object v1, v0

    move-object v0, v11

    move-object/from16 v11, p3

    invoke-static/range {v1 .. v21}, Lz23/a;->a(Lz23/a;Ljava/lang/String;Ljava/lang/String;Lb33/f;Lb33/g;Ljava/lang/String;Ls93/k;Ljava/lang/String;Ljava/lang/Long;Lb33/c;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb33/i;Ljava/lang/Boolean;Lw23/t;Ljava/lang/Boolean;Ljava/lang/Boolean;I)Lio/getstream/android/video/generated/models/ClientEvent;

    move-result-object v1

    invoke-virtual {v0, v1}, La33/d;->P(Lio/getstream/android/video/generated/models/ClientEvent;)V

    :cond_2
    :goto_2
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ls93/k;ZLw23/t;Ljava/lang/String;Ljava/lang/String;)V
    .locals 23

    move-object/from16 v0, p0

    iget-object v1, v0, Lz23/c;->d:Ljava/util/concurrent/ConcurrentHashMap;

    move-object/from16 v7, p3

    invoke-virtual {v1, v7}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb33/h;

    if-nez v1, :cond_0

    goto :goto_4

    :cond_0
    instance-of v2, v1, Lb33/j;

    if-eqz v2, :cond_4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1}, Lb33/h;->a()J

    move-result-wide v4

    sub-long/2addr v2, v4

    check-cast v1, Lb33/j;

    sget-object v5, Lb33/d;->E:Lb33/d;

    sget-object v6, Lb33/g;->y:Lb33/g;

    if-eqz p8, :cond_1

    sget-object v4, Lb33/c;->x:Lb33/c;

    :goto_0
    move-object v11, v4

    goto :goto_1

    :cond_1
    sget-object v4, Lb33/c;->y:Lb33/c;

    goto :goto_0

    :goto_1
    const/4 v4, 0x0

    if-nez p8, :cond_2

    move-object/from16 v13, p10

    goto :goto_2

    :cond_2
    move-object v13, v4

    :goto_2
    if-nez p8, :cond_3

    move-object/from16 v14, p11

    goto :goto_3

    :cond_3
    move-object v14, v4

    :goto_3
    iget-object v4, v1, Lb33/j;->j:Lb33/i;

    iget-boolean v1, v1, Lb33/j;->k:Z

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v18

    const/16 v21, 0x0

    const/high16 v22, 0x7c0000

    iget-object v2, v0, Lz23/c;->c:Lz23/a;

    const/16 v20, 0x0

    move-object/from16 v3, p1

    move-object/from16 v16, p4

    move-object/from16 v9, p5

    move-object/from16 v15, p6

    move-object/from16 v8, p7

    move-object/from16 v19, p9

    move-object/from16 v17, v4

    move-object/from16 v4, p2

    invoke-static/range {v2 .. v22}, Lz23/a;->a(Lz23/a;Ljava/lang/String;Ljava/lang/String;Lb33/f;Lb33/g;Ljava/lang/String;Ls93/k;Ljava/lang/String;Ljava/lang/Long;Lb33/c;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb33/i;Ljava/lang/Boolean;Lw23/t;Ljava/lang/Boolean;Ljava/lang/Boolean;I)Lio/getstream/android/video/generated/models/ClientEvent;

    move-result-object v1

    iget-object v2, v0, Lz23/c;->a:La33/d;

    invoke-virtual {v2, v1}, La33/d;->P(Lio/getstream/android/video/generated/models/ClientEvent;)V

    :cond_4
    :goto_4
    return-void
.end method
