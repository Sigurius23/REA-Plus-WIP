.class public final Lx30/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lx30/h0;->w:I

    iput-object p1, p0, Lx30/h0;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v0, p0

    iget v1, v0, Lx30/h0;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Lg53/m;

    sget-object v2, Lt23/j3;->t:Lt23/i3;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lt23/i3;->b:Lt23/j3;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v2, Lt23/b4;

    invoke-virtual {v2}, Lt23/b4;->r()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    if-eqz v2, :cond_3

    instance-of v2, v1, Lg53/d;

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    check-cast v1, Lg53/d;

    iget-object v1, v1, Lg53/d;->b:Lg53/b;

    sget-object v2, Ly23/a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    if-ne v1, v4, :cond_3

    iget-object v1, v0, Lx30/h0;->x:Ljava/lang/Object;

    check-cast v1, Lb30/m;

    iget-object v1, v1, Lb30/m;->z:Ljava/lang/Object;

    check-cast v1, Lpg3/p;

    const-string v2, "toString(...)"

    invoke-static {v2}, Ldc/b;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v1, v1, Lpg3/p;->x:Ljava/lang/Object;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v3, v4}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v1, v0, Lx30/h0;->x:Ljava/lang/Object;

    check-cast v1, Lb30/m;

    iget-object v4, v1, Lb30/m;->F:Ljava/lang/Object;

    check-cast v4, Lec3/h2;

    iget-object v1, v1, Lb30/m;->y:Ljava/lang/Object;

    check-cast v1, Lz23/c;

    invoke-static {v2}, Ldc/b;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iget-object v2, v1, Lz23/c;->d:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v7, v1, Lz23/c;->b:Lpg3/p;

    iget-object v7, v7, Lpg3/p;->y:Ljava/lang/Object;

    check-cast v7, Lec3/r1;

    iget-object v7, v7, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v7}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    sget-object v8, Lb33/e;->w:Lb33/e;

    new-instance v9, Lb33/b;

    invoke-direct {v9, v5, v6, v10, v7}, Lb33/b;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v10, v9}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lz23/c;->a:La33/d;

    iget-object v5, v1, Lz23/c;->c:Lz23/a;

    sget-object v9, Lb33/g;->x:Lb33/g;

    const/16 v24, 0x0

    const v25, 0x7fffe3

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v5 .. v25}, Lz23/a;->a(Lz23/a;Ljava/lang/String;Ljava/lang/String;Lb33/f;Lb33/g;Ljava/lang/String;Ls93/k;Ljava/lang/String;Ljava/lang/Long;Lb33/c;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb33/i;Ljava/lang/Boolean;Lw23/t;Ljava/lang/Boolean;Ljava/lang/Boolean;I)Lio/getstream/android/video/generated/models/ClientEvent;

    move-result-object v1

    invoke-virtual {v2, v1}, La33/d;->P(Lio/getstream/android/video/generated/models/ClientEvent;)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4, v3, v10}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_1
    instance-of v2, v1, Lg53/c;

    const-string v5, ""

    if-eqz v2, :cond_2

    iget-object v1, v0, Lx30/h0;->x:Ljava/lang/Object;

    check-cast v1, Lb30/m;

    iget-object v1, v1, Lb30/m;->F:Ljava/lang/Object;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_3

    iget-object v1, v0, Lx30/h0;->x:Ljava/lang/Object;

    check-cast v1, Lb30/m;

    iget-object v2, v1, Lb30/m;->y:Ljava/lang/Object;

    check-cast v2, Lz23/c;

    iget-object v1, v1, Lb30/m;->F:Ljava/lang/Object;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    sget v6, Lio/sentry/internal/debugmeta/c;->E:I

    new-instance v7, Ljava/lang/Integer;

    invoke-direct {v7, v6}, Ljava/lang/Integer;-><init>(I)V

    invoke-static {v2, v1, v4, v7}, Lz23/c;->c(Lz23/c;Ljava/lang/String;ZLjava/lang/Integer;)V

    iget-object v1, v0, Lx30/h0;->x:Ljava/lang/Object;

    check-cast v1, Lb30/m;

    iget-object v1, v1, Lb30/m;->F:Ljava/lang/Object;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v3, v5}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    instance-of v1, v1, Lg53/f;

    if-eqz v1, :cond_3

    iget-object v1, v0, Lx30/h0;->x:Ljava/lang/Object;

    check-cast v1, Lb30/m;

    iget-object v1, v1, Lb30/m;->F:Ljava/lang/Object;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_3

    iget-object v1, v0, Lx30/h0;->x:Ljava/lang/Object;

    check-cast v1, Lb30/m;

    iget-object v2, v1, Lb30/m;->y:Ljava/lang/Object;

    check-cast v2, Lz23/c;

    iget-object v1, v1, Lb30/m;->F:Ljava/lang/Object;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    sget v4, Lio/sentry/internal/debugmeta/c;->E:I

    new-instance v6, Ljava/lang/Integer;

    invoke-direct {v6, v4}, Ljava/lang/Integer;-><init>(I)V

    const/4 v4, 0x0

    invoke-static {v2, v1, v4, v6}, Lz23/c;->c(Lz23/c;Ljava/lang/String;ZLjava/lang/Integer;)V

    iget-object v1, v0, Lx30/h0;->x:Ljava/lang/Object;

    check-cast v1, Lb30/m;

    iget-object v1, v1, Lb30/m;->F:Ljava/lang/Object;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v3, v5}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_3
    :goto_1
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Lzx/b;

    iget-object v2, v0, Lx30/h0;->x:Ljava/lang/Object;

    check-cast v2, Lx30/p0;

    iget-object v3, v1, Lzx/b;->a:Ljava/lang/Object;

    invoke-static {v3}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly00/b;

    const/4 v4, 0x0

    if-eqz v3, :cond_4

    iget v3, v3, Ly00/b;->x:I

    iget-object v5, v2, Lx30/p0;->k:Lec3/h2;

    new-instance v6, Ljava/lang/Integer;

    invoke-direct {v6, v3}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5, v4, v6}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_4
    iget-object v1, v1, Lzx/b;->b:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v1, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly00/b;

    iget-object v5, v5, Ly00/b;->y:Ly00/a;

    iget-object v5, v5, Ly00/a;->x:Ly00/i;

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    invoke-static {v3}, Lm83/s;->y0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    iget-object v2, v2, Lx30/p0;->p:Lec3/h2;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, v4, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
