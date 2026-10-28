.class public final Lw23/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:Lw23/p;

.field public final synthetic x:Lkotlin/jvm/internal/i;

.field public final synthetic y:Lb33/i;


# direct methods
.method public constructor <init>(Lw23/p;Lkotlin/jvm/functions/Function1;Lb33/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw23/j;->w:Lw23/p;

    check-cast p2, Lkotlin/jvm/internal/i;

    iput-object p2, p0, Lw23/j;->x:Lkotlin/jvm/internal/i;

    iput-object p3, p0, Lw23/j;->y:Lb33/i;

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Lw23/s;

    iget-object v2, v1, Lw23/s;->b:Lorg/webrtc/PeerConnection$PeerConnectionState;

    iget-object v3, v0, Lw23/j;->w:Lw23/p;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lw23/i;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v4, v2

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eq v2, v6, :cond_1

    if-eq v2, v5, :cond_0

    if-eq v2, v4, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    sget-object v2, Lx23/f;->y:Lx23/f;

    goto :goto_0

    :cond_1
    sget-object v2, Lx23/f;->x:Lx23/f;

    :goto_0
    if-eqz v2, :cond_b

    iget-object v7, v0, Lw23/j;->x:Lkotlin/jvm/internal/i;

    invoke-interface {v7, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget v2, v1, Lw23/s;->a:I

    iget-object v7, v1, Lw23/s;->c:Lw23/t;

    iget-object v1, v1, Lw23/s;->b:Lorg/webrtc/PeerConnection$PeerConnectionState;

    move-object/from16 v16, v7

    iget-object v7, v3, Lw23/p;->d:Lz23/c;

    iget-object v8, v3, Lw23/p;->a:Ljava/lang/String;

    iget-object v9, v3, Lw23/p;->b:Ljava/lang/String;

    iget-object v10, v3, Lw23/p;->e:Lso/q;

    iget-object v10, v10, Lso/q;->x:Ljava/lang/Object;

    check-cast v10, Lec3/r1;

    iget-object v11, v10, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v11}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lw23/h;

    iget-object v11, v11, Lw23/h;->b:Ljava/lang/String;

    if-nez v11, :cond_2

    const-string v11, "unknown"

    :cond_2
    move-object v12, v11

    iget-object v11, v10, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v11}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lw23/h;

    iget-object v11, v11, Lw23/h;->a:Ls93/k;

    if-nez v11, :cond_3

    sget-object v11, Lx23/e;->w:Lx23/e;

    :cond_3
    move-object v14, v11

    iget-object v3, v3, Lw23/p;->f:La30/w0;

    iget-object v3, v3, La30/w0;->y:Ljava/lang/Object;

    check-cast v3, Lec3/r1;

    iget-object v3, v3, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v11, v3

    check-cast v11, Ljava/lang/String;

    iget-object v3, v10, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lw23/h;

    iget-object v13, v3, Lw23/h;->e:Ljava/lang/String;

    iget-object v3, v7, Lz23/c;->e:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v10, v7, Lz23/c;->f:Lty/c;

    const-string v15, "callId"

    invoke-static {v8, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "callType"

    invoke-static {v9, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "sfuId"

    invoke-static {v11, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v1, :cond_4

    const/4 v15, -0x1

    goto :goto_1

    :cond_4
    sget-object v15, Lz23/b;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v17

    aget v15, v15, v17

    :goto_1
    iget-object v4, v0, Lw23/j;->y:Lb33/i;

    const-string v0, "peerConnectionState"

    if-eq v15, v6, :cond_9

    if-eq v15, v5, :cond_7

    const/4 v5, 0x3

    if-eq v15, v5, :cond_5

    goto/16 :goto_4

    :cond_5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v10, Lty/c;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz23/d;

    if-nez v0, :cond_6

    goto/16 :goto_4

    :cond_6
    iget-object v10, v0, Lz23/d;->a:Ljava/lang/String;

    const-string v17, "ICE connectivity checks failed"

    const-string v18, "ICE_CONNECTIVITY_FAILED"

    const/4 v15, 0x0

    invoke-virtual/range {v7 .. v18}, Lz23/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ls93/k;ZLw23/t;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_4

    :cond_7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lt9/p;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Lt9/p;-><init>(I)V

    invoke-virtual {v3, v4, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v10, Lty/c;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz23/d;

    if-nez v0, :cond_8

    goto/16 :goto_4

    :cond_8
    iget-object v10, v0, Lz23/d;->a:Ljava/lang/String;

    const/4 v15, 0x1

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-virtual/range {v7 .. v18}, Lz23/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ls93/k;ZLw23/t;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_4

    :cond_9
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_a

    :goto_2
    move/from16 v29, v6

    goto :goto_3

    :cond_a
    const/4 v6, 0x0

    goto :goto_2

    :goto_3
    const-string v0, "toString(...)"

    invoke-static {v0}, Ldc/b;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v22

    iget-object v0, v7, Lz23/c;->d:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v21, Lb33/d;->E:Lb33/d;

    new-instance v17, Lb33/j;

    const/16 v30, 0x200

    move-object/from16 v28, v4

    move-object/from16 v18, v8

    move-object/from16 v19, v9

    move-object/from16 v26, v11

    move-object/from16 v24, v12

    move-object/from16 v27, v13

    move-object/from16 v25, v14

    invoke-direct/range {v17 .. v30}, Lb33/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb33/d;JLjava/lang/String;Ls93/k;Ljava/lang/String;Ljava/lang/String;Lb33/i;ZI)V

    move-object/from16 v3, v17

    move-object/from16 v1, v20

    move-object/from16 v22, v28

    invoke-virtual {v0, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v2, v10, Lty/c;->x:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v3, Lz23/d;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object v1, v3, Lz23/d;->a:Ljava/lang/String;

    invoke-virtual {v2, v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v7, Lz23/c;->a:La33/d;

    iget-object v7, v7, Lz23/c;->c:Lz23/a;

    sget-object v11, Lb33/g;->x:Lb33/g;

    invoke-static/range {v29 .. v29}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v23

    move-object/from16 v3, v26

    const/16 v26, 0x0

    const v27, 0x7c0f80

    const/4 v15, 0x0

    move-object/from16 v24, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v25, 0x0

    move-object/from16 v20, v13

    move-object v13, v14

    move-object/from16 v10, v21

    move-object/from16 v21, v3

    move-object v14, v12

    move-object v12, v1

    invoke-static/range {v7 .. v27}, Lz23/a;->a(Lz23/a;Ljava/lang/String;Ljava/lang/String;Lb33/f;Lb33/g;Ljava/lang/String;Ls93/k;Ljava/lang/String;Ljava/lang/Long;Lb33/c;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb33/i;Ljava/lang/Boolean;Lw23/t;Ljava/lang/Boolean;Ljava/lang/Boolean;I)Lio/getstream/android/video/generated/models/ClientEvent;

    move-result-object v1

    invoke-virtual {v0, v1}, La33/d;->P(Lio/getstream/android/video/generated/models/ClientEvent;)V

    :cond_b
    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
