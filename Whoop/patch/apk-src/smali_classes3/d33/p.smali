.class public final Ld33/p;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Ld33/h1;


# direct methods
.method public constructor <init>(Ld33/h1;)V
    .locals 0

    iput-object p1, p0, Ld33/p;->w:Ld33/h1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p1

    check-cast v0, Lorg/webrtc/audio/JavaAudioDeviceModule$AudioSamples;

    const-string v1, "it"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p0

    iget-object v2, v1, Ld33/p;->w:Ld33/h1;

    iget-object v2, v2, Ld33/h1;->b:Lt23/c0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v2, Lt23/c0;->x:La00/g;

    invoke-virtual {v0}, Lorg/webrtc/audio/JavaAudioDeviceModule$AudioSamples;->getData()[B

    move-result-object v0

    const-string v3, "getData(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v2, La00/g;->y:Ljava/lang/Object;

    check-cast v3, Ljava/util/LinkedHashMap;

    array-length v4, v0

    div-int/lit8 v4, v4, 0x2

    new-array v5, v4, [S

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    if-ge v7, v4, :cond_0

    mul-int/lit8 v8, v7, 0x2

    add-int/lit8 v9, v8, 0x1

    aget-byte v9, v0, v9

    and-int/lit16 v9, v9, 0xff

    shl-int/lit8 v9, v9, 0x8

    aget-byte v8, v0, v8

    and-int/lit16 v8, v8, 0xff

    or-int/2addr v8, v9

    int-to-short v8, v8

    aput-short v8, v5, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_0
    const-wide/16 v7, 0x0

    move-wide v9, v7

    :goto_1
    if-ge v6, v4, :cond_1

    aget-short v0, v5, v6

    int-to-double v11, v0

    const/16 v0, 0x7fff

    int-to-double v13, v0

    div-double/2addr v11, v13

    mul-double/2addr v11, v11

    add-double/2addr v9, v11

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    int-to-double v4, v4

    div-double/2addr v9, v4

    invoke-static {v9, v10}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    const/16 v0, 0x14

    int-to-double v9, v0

    invoke-static {v4, v5}, Ljava/lang/Math;->log10(D)D

    move-result-wide v4

    mul-double/2addr v4, v9

    sget-object v0, Lp33/a;->a:Li93/j;

    iget v6, v0, Li93/h;->w:I

    int-to-double v9, v6

    cmpg-double v9, v4, v9

    if-gez v9, :cond_2

    const/4 v0, 0x0

    goto :goto_2

    :cond_2
    iget v0, v0, Li93/h;->x:I

    int-to-double v9, v0

    cmpl-double v0, v4, v9

    if-lez v0, :cond_3

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_2

    :cond_3
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v9

    sub-double v9, v4, v9

    sget v0, Lp33/a;->b:I

    int-to-double v11, v0

    div-double/2addr v9, v11

    invoke-static {v9, v10}, Ljava/lang/Math;->abs(D)D

    move-result-wide v9

    double-to-float v0, v9

    :goto_2
    iget-object v6, v2, La00/g;->z:Ljava/lang/Object;

    check-cast v6, Lec3/h2;

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v9, 0x0

    invoke-virtual {v6, v9, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-static {v4, v5}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_9

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    const-wide/16 v11, 0x258

    if-nez v0, :cond_4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    const-string v6, "<get-keys>(...)"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->O0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    const-string v6, "last(...)"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v15

    sub-long/2addr v13, v15

    cmp-long v0, v13, v11

    if-lez v0, :cond_4

    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->clear()V

    :cond_4
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    const-string v5, "next(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/util/Map$Entry;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    const-string v9, "<get-key>(...)"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v9

    sub-long/2addr v5, v9

    cmp-long v4, v5, v11

    if-lez v4, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_3

    :cond_6
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v4, "<get-values>(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Double;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    add-double/2addr v7, v4

    goto :goto_4

    :cond_7
    invoke-virtual {v3}, Ljava/util/AbstractMap;->size()I

    move-result v0

    int-to-double v4, v0

    div-double/2addr v7, v4

    :cond_8
    const/16 v0, -0x2d

    int-to-double v4, v0

    cmpl-double v0, v7, v4

    if-ltz v0, :cond_9

    iget-object v0, v2, La00/g;->x:Ljava/lang/Object;

    check-cast v0, Lt23/l;

    invoke-virtual {v0}, Lt23/l;->invoke()Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->clear()V

    :cond_9
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
