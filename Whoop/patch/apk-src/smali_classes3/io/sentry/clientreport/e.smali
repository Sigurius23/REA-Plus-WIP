.class public final Lio/sentry/clientreport/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/v1;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lio/sentry/clientreport/e;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Z)V
    .locals 0

    .line 2
    const/4 p1, 0x2

    iput p1, p0, Lio/sentry/clientreport/e;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lio/sentry/j3;)Lio/sentry/protocol/v;
    .locals 1

    new-instance v0, Lio/sentry/protocol/v;

    invoke-interface {p0}, Lio/sentry/j3;->nextString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lio/sentry/protocol/v;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static c(Lio/sentry/v0;Ljava/lang/String;)Ljava/lang/IllegalStateException;
    .locals 2

    const-string v0, "Missing required field \""

    const-string v1, "\""

    invoke-static {v0, p1, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-interface {p0, v1, p1, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method


# virtual methods
.method public final a(Lio/sentry/j3;Lio/sentry/v0;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Lio/sentry/clientreport/e;->a:I

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, -0x1

    const/4 v6, 0x0

    packed-switch v0, :pswitch_data_0

    invoke-interface {p1}, Lio/sentry/j3;->beginObject()V

    new-instance v0, Lio/sentry/rrweb/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :goto_0
    invoke-interface {p1}, Lio/sentry/j3;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v7

    sget-object v8, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v7, v8, :cond_5

    invoke-interface {p1}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v8

    sparse-switch v8, :sswitch_data_0

    :goto_1
    move v8, v5

    goto :goto_2

    :sswitch_0
    const-string v8, "timeOffset"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_0

    goto :goto_1

    :cond_0
    move v8, v1

    goto :goto_2

    :sswitch_1
    const-string v8, "id"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1

    goto :goto_1

    :cond_1
    move v8, v2

    goto :goto_2

    :sswitch_2
    const-string v8, "y"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2

    goto :goto_1

    :cond_2
    move v8, v3

    goto :goto_2

    :sswitch_3
    const-string v8, "x"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    goto :goto_1

    :cond_3
    move v8, v4

    :goto_2
    packed-switch v8, :pswitch_data_1

    if-nez v6, :cond_4

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    :cond_4
    invoke-interface {p1, p2, v6, v7}, Lio/sentry/j3;->I(Lio/sentry/v0;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_0
    invoke-interface {p1}, Lio/sentry/j3;->nextLong()J

    move-result-wide v7

    iput-wide v7, v0, Lio/sentry/rrweb/h;->z:J

    goto :goto_0

    :pswitch_1
    invoke-interface {p1}, Lio/sentry/j3;->nextInt()I

    move-result v7

    iput v7, v0, Lio/sentry/rrweb/h;->w:I

    goto :goto_0

    :pswitch_2
    invoke-interface {p1}, Lio/sentry/j3;->nextFloat()F

    move-result v7

    iput v7, v0, Lio/sentry/rrweb/h;->y:F

    goto :goto_0

    :pswitch_3
    invoke-interface {p1}, Lio/sentry/j3;->nextFloat()F

    move-result v7

    iput v7, v0, Lio/sentry/rrweb/h;->x:F

    goto :goto_0

    :cond_5
    iput-object v6, v0, Lio/sentry/rrweb/h;->E:Ljava/util/HashMap;

    invoke-interface {p1}, Lio/sentry/j3;->endObject()V

    return-object v0

    :pswitch_4
    invoke-static {}, Lio/sentry/rrweb/f;->values()[Lio/sentry/rrweb/f;

    move-result-object p2

    invoke-interface {p1}, Lio/sentry/j3;->nextInt()I

    move-result p1

    aget-object p1, p2, p1

    return-object p1

    :pswitch_5
    invoke-static {}, Lio/sentry/rrweb/d;->values()[Lio/sentry/rrweb/d;

    move-result-object p2

    invoke-interface {p1}, Lio/sentry/j3;->nextInt()I

    move-result p1

    aget-object p1, p2, p1

    return-object p1

    :pswitch_6
    invoke-interface {p1}, Lio/sentry/j3;->beginObject()V

    new-instance v0, Lio/sentry/protocol/profiling/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :goto_3
    invoke-interface {p1}, Lio/sentry/j3;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v1

    sget-object v2, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v1, v2, :cond_9

    invoke-interface {p1}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "priority"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    const-string v2, "name"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    if-nez v6, :cond_6

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    :cond_6
    invoke-interface {p1, p2, v6, v1}, Lio/sentry/j3;->I(Lio/sentry/v0;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_3

    :cond_7
    invoke-interface {p1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/protocol/profiling/c;->w:Ljava/lang/String;

    goto :goto_3

    :cond_8
    invoke-interface {p1}, Lio/sentry/j3;->nextInt()I

    move-result v1

    iput v1, v0, Lio/sentry/protocol/profiling/c;->x:I

    goto :goto_3

    :cond_9
    iput-object v6, v0, Lio/sentry/protocol/profiling/c;->y:Ljava/util/HashMap;

    invoke-interface {p1}, Lio/sentry/j3;->endObject()V

    return-object v0

    :pswitch_7
    invoke-interface {p1}, Lio/sentry/j3;->beginObject()V

    new-instance v0, Lio/sentry/protocol/profiling/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :goto_4
    invoke-interface {p1}, Lio/sentry/j3;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v1

    sget-object v7, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v1, v7, :cond_e

    invoke-interface {p1}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v7

    sparse-switch v7, :sswitch_data_1

    :goto_5
    move v7, v5

    goto :goto_6

    :sswitch_4
    const-string v7, "stack_id"

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_a

    goto :goto_5

    :cond_a
    move v7, v2

    goto :goto_6

    :sswitch_5
    const-string v7, "timestamp"

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_b

    goto :goto_5

    :cond_b
    move v7, v3

    goto :goto_6

    :sswitch_6
    const-string v7, "thread_id"

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_c

    goto :goto_5

    :cond_c
    move v7, v4

    :goto_6
    packed-switch v7, :pswitch_data_2

    if-nez v6, :cond_d

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    :cond_d
    invoke-interface {p1, p2, v6, v1}, Lio/sentry/j3;->I(Lio/sentry/v0;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_4

    :pswitch_8
    invoke-interface {p1}, Lio/sentry/j3;->nextInt()I

    move-result v1

    iput v1, v0, Lio/sentry/protocol/profiling/b;->x:I

    goto :goto_4

    :pswitch_9
    invoke-interface {p1}, Lio/sentry/j3;->nextDouble()D

    move-result-wide v7

    iput-wide v7, v0, Lio/sentry/protocol/profiling/b;->w:D

    goto :goto_4

    :pswitch_a
    invoke-interface {p1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/protocol/profiling/b;->y:Ljava/lang/String;

    goto :goto_4

    :cond_e
    iput-object v6, v0, Lio/sentry/protocol/profiling/b;->z:Ljava/util/HashMap;

    invoke-interface {p1}, Lio/sentry/j3;->endObject()V

    return-object v0

    :pswitch_b
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Lio/sentry/j3;->beginArray()V

    :goto_7
    invoke-interface {p1}, Lio/sentry/j3;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_10

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Lio/sentry/j3;->beginArray()V

    :goto_8
    invoke-interface {p1}, Lio/sentry/j3;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-interface {p1}, Lio/sentry/j3;->nextInt()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_f
    invoke-interface {p1}, Lio/sentry/j3;->endArray()V

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_10
    invoke-interface {p1}, Lio/sentry/j3;->endArray()V

    return-object p2

    :pswitch_c
    invoke-interface {p1}, Lio/sentry/j3;->beginObject()V

    new-instance v0, Lio/sentry/protocol/profiling/a;

    invoke-direct {v0}, Lio/sentry/protocol/profiling/a;-><init>()V

    :cond_11
    :goto_9
    invoke-interface {p1}, Lio/sentry/j3;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v7

    sget-object v8, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v7, v8, :cond_17

    invoke-interface {p1}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v8

    sparse-switch v8, :sswitch_data_2

    :goto_a
    move v8, v5

    goto :goto_b

    :sswitch_7
    const-string v8, "thread_metadata"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_12

    goto :goto_a

    :cond_12
    move v8, v1

    goto :goto_b

    :sswitch_8
    const-string v8, "samples"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_13

    goto :goto_a

    :cond_13
    move v8, v2

    goto :goto_b

    :sswitch_9
    const-string v8, "stacks"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_14

    goto :goto_a

    :cond_14
    move v8, v3

    goto :goto_b

    :sswitch_a
    const-string v8, "frames"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_15

    goto :goto_a

    :cond_15
    move v8, v4

    :goto_b
    packed-switch v8, :pswitch_data_3

    if-nez v6, :cond_16

    new-instance v6, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v6}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_16
    invoke-interface {p1, p2, v6, v7}, Lio/sentry/j3;->I(Lio/sentry/v0;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_9

    :pswitch_d
    new-instance v7, Lio/sentry/clientreport/e;

    const/4 v8, 0x6

    invoke-direct {v7, v8}, Lio/sentry/clientreport/e;-><init>(I)V

    invoke-interface {p1, p2, v7}, Lio/sentry/j3;->y0(Lio/sentry/v0;Lio/sentry/v1;)Ljava/util/HashMap;

    move-result-object v7

    if-eqz v7, :cond_11

    iput-object v7, v0, Lio/sentry/protocol/profiling/a;->z:Ljava/util/Map;

    goto :goto_9

    :pswitch_e
    new-instance v7, Lio/sentry/clientreport/e;

    const/4 v8, 0x5

    invoke-direct {v7, v8}, Lio/sentry/clientreport/e;-><init>(I)V

    invoke-interface {p1, p2, v7}, Lio/sentry/j3;->c1(Lio/sentry/v0;Lio/sentry/v1;)Ljava/util/ArrayList;

    move-result-object v7

    if-eqz v7, :cond_11

    iput-object v7, v0, Lio/sentry/protocol/profiling/a;->w:Ljava/util/List;

    goto :goto_9

    :pswitch_f
    new-instance v7, Lio/sentry/clientreport/e;

    const/4 v8, 0x4

    invoke-direct {v7, v8}, Lio/sentry/clientreport/e;-><init>(I)V

    invoke-interface {p1, p2, v7}, Lio/sentry/j3;->Z(Lio/sentry/v0;Lio/sentry/v1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    if-eqz v7, :cond_11

    iput-object v7, v0, Lio/sentry/protocol/profiling/a;->x:Ljava/util/List;

    goto :goto_9

    :pswitch_10
    new-instance v7, Lio/sentry/clientreport/a;

    const/16 v8, 0x18

    invoke-direct {v7, v8}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-interface {p1, p2, v7}, Lio/sentry/j3;->c1(Lio/sentry/v0;Lio/sentry/v1;)Ljava/util/ArrayList;

    move-result-object v7

    if-eqz v7, :cond_11

    iput-object v7, v0, Lio/sentry/protocol/profiling/a;->y:Ljava/util/List;

    goto/16 :goto_9

    :cond_17
    iput-object v6, v0, Lio/sentry/protocol/profiling/a;->E:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {p1}, Lio/sentry/j3;->endObject()V

    return-object v0

    :pswitch_11
    invoke-static {p1}, Lio/sentry/clientreport/e;->b(Lio/sentry/j3;)Lio/sentry/protocol/v;

    move-result-object p1

    return-object p1

    :pswitch_12
    invoke-interface {p1}, Lio/sentry/j3;->beginObject()V

    move-object v0, v6

    move-object v1, v0

    :goto_c
    invoke-interface {p1}, Lio/sentry/j3;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v2

    sget-object v3, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v2, v3, :cond_1b

    invoke-interface {p1}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "result"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1a

    const-string v3, "flag"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_19

    if-nez v1, :cond_18

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_18
    invoke-interface {p1, p2, v1, v2}, Lio/sentry/j3;->I(Lio/sentry/v0;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_c

    :cond_19
    invoke-interface {p1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v2

    move-object v6, v2

    goto :goto_c

    :cond_1a
    invoke-interface {p1}, Lio/sentry/j3;->W()Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_c

    :cond_1b
    if-eqz v6, :cond_1d

    if-eqz v0, :cond_1c

    new-instance p2, Lio/sentry/protocol/g;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object v6, p2, Lio/sentry/protocol/g;->w:Ljava/lang/String;

    iput-boolean v0, p2, Lio/sentry/protocol/g;->x:Z

    iput-object v1, p2, Lio/sentry/protocol/g;->y:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {p1}, Lio/sentry/j3;->endObject()V

    return-object p2

    :cond_1c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Missing required field \"result\""

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-interface {p2, v1, v0, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_1d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Missing required field \"flag\""

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-interface {p2, v1, v0, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :pswitch_13
    invoke-interface {p1}, Lio/sentry/j3;->beginObject()V

    move-object v0, v6

    move-object v1, v0

    move-object v7, v1

    :goto_d
    invoke-interface {p1}, Lio/sentry/j3;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v8

    sget-object v9, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    const-string v10, "category"

    const-string v11, "reason"

    const-string v12, "quantity"

    if-ne v8, v9, :cond_22

    invoke-interface {p1}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    move-result v9

    sparse-switch v9, :sswitch_data_3

    :goto_e
    move v9, v5

    goto :goto_f

    :sswitch_b
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1e

    goto :goto_e

    :cond_1e
    move v9, v2

    goto :goto_f

    :sswitch_c
    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1f

    goto :goto_e

    :cond_1f
    move v9, v3

    goto :goto_f

    :sswitch_d
    invoke-virtual {v8, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_20

    goto :goto_e

    :cond_20
    move v9, v4

    :goto_f
    packed-switch v9, :pswitch_data_4

    if-nez v7, :cond_21

    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    :cond_21
    invoke-interface {p1, p2, v7, v8}, Lio/sentry/j3;->I(Lio/sentry/v0;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_d

    :pswitch_14
    invoke-interface {p1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v0

    goto :goto_d

    :pswitch_15
    invoke-interface {p1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v6

    goto :goto_d

    :pswitch_16
    invoke-interface {p1}, Lio/sentry/j3;->s0()Ljava/lang/Long;

    move-result-object v1

    goto :goto_d

    :cond_22
    invoke-interface {p1}, Lio/sentry/j3;->endObject()V

    if-eqz v6, :cond_25

    if-eqz v0, :cond_24

    if-eqz v1, :cond_23

    new-instance p1, Lio/sentry/clientreport/f;

    invoke-direct {p1, v6, v0, v1}, Lio/sentry/clientreport/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    iput-object v7, p1, Lio/sentry/clientreport/f;->z:Ljava/util/HashMap;

    return-object p1

    :cond_23
    invoke-static {p2, v12}, Lio/sentry/clientreport/e;->c(Lio/sentry/v0;Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object p1

    throw p1

    :cond_24
    invoke-static {p2, v10}, Lio/sentry/clientreport/e;->c(Lio/sentry/v0;Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object p1

    throw p1

    :cond_25
    invoke-static {p2, v11}, Lio/sentry/clientreport/e;->c(Lio/sentry/v0;Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object p1

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_c
        :pswitch_b
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x78 -> :sswitch_3
        0x79 -> :sswitch_2
        0xd1b -> :sswitch_1
        0x27aa95c0 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x5d1dd090 -> :sswitch_6
        0x3492916 -> :sswitch_5
        0x4da54232 -> :sswitch_4
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        -0x4b7d7b5a -> :sswitch_a
        -0x35327115 -> :sswitch_9
        0x6f274009 -> :sswitch_8
        0x7adfc9c4 -> :sswitch_7
    .end sparse-switch

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
    .end packed-switch

    :sswitch_data_3
    .sparse-switch
        -0x4c979b75 -> :sswitch_d
        -0x37ba6dbc -> :sswitch_c
        0x302bcfe -> :sswitch_b
    .end sparse-switch

    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_16
        :pswitch_15
        :pswitch_14
    .end packed-switch
.end method
