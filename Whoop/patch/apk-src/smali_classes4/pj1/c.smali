.class public final Lpj1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J#\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00162\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0013H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u00142\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0016H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ&\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u000e2\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0013H\u0086@\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010&\u00a8\u0006\'"
    }
    d2 = {
        "Lpj1/c;",
        "",
        "Lcom/whoop/healthconnect/domain/HealthConnectApi;",
        "healthConnectApi",
        "Ltr2/n;",
        "logger",
        "Lu92/d;",
        "sharedPreferences",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lcom/whoop/healthconnect/domain/HealthConnectApi;Ltr2/n;Lu92/d;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;",
        "records",
        "Lb7/b;",
        "client",
        "Lpj1/e;",
        "g",
        "(Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;Lb7/b;Lq83/d;)Ljava/lang/Object;",
        "",
        "",
        "permissions",
        "",
        "d",
        "(Ljava/util/Set;)Ljava/util/List;",
        "f",
        "(Ljava/util/List;)Ljava/lang/String;",
        "healthConnectClient",
        "grantedPermissions",
        "Ll83/a0;",
        "e",
        "(Lb7/b;Ljava/util/Set;Lq83/d;)Ljava/lang/Object;",
        "a",
        "Lcom/whoop/healthconnect/domain/HealthConnectApi;",
        "b",
        "Ltr2/n;",
        "c",
        "Lu92/d;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "health-connect_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lcom/whoop/healthconnect/domain/HealthConnectApi;

.field private final b:Ltr2/n;

.field private final c:Lu92/d;

.field private final d:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public constructor <init>(Lcom/whoop/healthconnect/domain/HealthConnectApi;Ltr2/n;Lu92/d;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "healthConnectApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sharedPreferences"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lpj1/c;->a:Lcom/whoop/healthconnect/domain/HealthConnectApi;

    .line 3
    iput-object p2, p0, Lpj1/c;->b:Ltr2/n;

    .line 4
    iput-object p3, p0, Lpj1/c;->c:Lu92/d;

    .line 5
    iput-object p4, p0, Lpj1/c;->d:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/healthconnect/domain/HealthConnectApi;Ltr2/n;Lu92/d;Lcom/whoop/data/repositories/FeatureFlagChecker;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    .line 6
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "HealthConnectWhoopRecordsWriter"

    invoke-virtual {p2, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lpj1/c;-><init>(Lcom/whoop/healthconnect/domain/HealthConnectApi;Ltr2/n;Lu92/d;Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    return-void
.end method

.method public static final synthetic a(Lpj1/c;)Lcom/whoop/healthconnect/domain/HealthConnectApi;
    .locals 0

    iget-object p0, p0, Lpj1/c;->a:Lcom/whoop/healthconnect/domain/HealthConnectApi;

    return-object p0
.end method

.method public static final synthetic b(Lpj1/c;Ljava/util/List;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lpj1/c;->f(Ljava/util/List;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lpj1/c;Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;Lb7/b;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lpj1/c;->g(Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;Lb7/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final d(Ljava/util/Set;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "."

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x6

    invoke-static {v1, v2, v3}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private final f(Ljava/util/List;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    check-cast v0, Ljava/lang/String;

    const-string v2, ","

    invoke-static {v0, v2, v1}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Empty collection can\'t be reduced."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final g(Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;Lb7/b;Lq83/d;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;",
            "Lb7/b;",
            "Lq83/d<",
            "-",
            "Lpj1/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    move-object/from16 v2, p3

    instance-of v3, v2, Lpj1/c$c;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lpj1/c$c;

    iget v4, v3, Lpj1/c$c;->G:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lpj1/c$c;->G:I

    goto :goto_0

    :cond_0
    new-instance v3, Lpj1/c$c;

    invoke-direct {v3, v1, v2}, Lpj1/c$c;-><init>(Lpj1/c;Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lpj1/c$c;->E:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lpj1/c$c;->G:I

    const-class v6, Lm7/d1;

    const-class v7, Lm7/z;

    const-class v8, Lm7/o0;

    const-class v9, Lm7/t0;

    const-class v10, Lm7/s0;

    const-class v11, Lm7/x0;

    const-class v12, Lm7/a;

    const-class v13, Lm7/w;

    packed-switch v5, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    iget-object v0, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    check-cast v0, Lb7/b;

    iget-object v0, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    :try_start_0
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_1a

    :catch_0
    move-exception v0

    goto/16 :goto_1b

    :pswitch_1
    iget v0, v3, Lpj1/c$c;->z:I

    iget-object v5, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    iget-object v7, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    check-cast v7, Lb7/b;

    iget-object v8, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    check-cast v8, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    :try_start_1
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_18

    :pswitch_2
    iget v0, v3, Lpj1/c$c;->z:I

    iget-object v5, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    iget-object v8, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    check-cast v8, Lb7/b;

    iget-object v9, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    check-cast v9, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    :try_start_2
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_17

    :pswitch_3
    iget v0, v3, Lpj1/c$c;->z:I

    iget-object v5, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    iget-object v9, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    check-cast v9, Lb7/b;

    iget-object v10, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    check-cast v10, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    :try_start_3
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto/16 :goto_16

    :pswitch_4
    iget v0, v3, Lpj1/c$c;->z:I

    iget-object v5, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    iget-object v10, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    check-cast v10, Lb7/b;

    iget-object v11, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    check-cast v11, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    :try_start_4
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto/16 :goto_15

    :pswitch_5
    iget v0, v3, Lpj1/c$c;->z:I

    iget-object v5, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    iget-object v11, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    check-cast v11, Lb7/b;

    iget-object v12, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    check-cast v12, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    :try_start_5
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    goto/16 :goto_14

    :pswitch_6
    iget v0, v3, Lpj1/c$c;->z:I

    iget-object v5, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    iget-object v11, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    check-cast v11, Lb7/b;

    iget-object v12, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    check-cast v12, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    :try_start_6
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    goto/16 :goto_13

    :pswitch_7
    iget v0, v3, Lpj1/c$c;->z:I

    iget-object v5, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    iget-object v12, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    check-cast v12, Lb7/b;

    iget-object v13, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    check-cast v13, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    :try_start_7
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    goto/16 :goto_12

    :pswitch_8
    iget v0, v3, Lpj1/c$c;->z:I

    iget-object v5, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    iget-object v13, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    check-cast v13, Lb7/b;

    iget-object v14, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    check-cast v14, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    :try_start_8
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    move-object/from16 v16, v12

    move-object v12, v13

    goto/16 :goto_11

    :pswitch_9
    iget v0, v3, Lpj1/c$c;->z:I

    iget-object v5, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    iget-object v14, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    check-cast v14, Lb7/b;

    iget-object v15, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    check-cast v15, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    :try_start_9
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1

    move-object/from16 v16, v12

    move-object/from16 v17, v13

    goto/16 :goto_10

    :catch_1
    move-exception v0

    goto/16 :goto_1c

    :pswitch_a
    iget v0, v3, Lpj1/c$c;->z:I

    iget-object v5, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    iget-object v14, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    check-cast v14, Lb7/b;

    iget-object v15, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    check-cast v15, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    :try_start_a
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1

    move-object/from16 v16, v12

    move-object/from16 v17, v13

    goto/16 :goto_e

    :pswitch_b
    iget v0, v3, Lpj1/c$c;->z:I

    iget-object v5, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    iget-object v14, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    check-cast v14, Lb7/b;

    iget-object v15, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    check-cast v15, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    :try_start_b
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_1

    move-object/from16 v16, v12

    move-object/from16 v17, v13

    goto/16 :goto_c

    :pswitch_c
    iget v0, v3, Lpj1/c$c;->z:I

    iget-object v5, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    iget-object v14, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    check-cast v14, Lb7/b;

    iget-object v15, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    check-cast v15, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    :try_start_c
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_1

    move-object/from16 v16, v12

    move-object/from16 v17, v13

    goto/16 :goto_a

    :pswitch_d
    iget v0, v3, Lpj1/c$c;->z:I

    iget-object v5, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    iget-object v14, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    check-cast v14, Lb7/b;

    iget-object v15, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    check-cast v15, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    :try_start_d
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_1

    move-object/from16 v16, v12

    move-object/from16 v17, v13

    goto/16 :goto_8

    :pswitch_e
    iget v0, v3, Lpj1/c$c;->z:I

    iget-object v5, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    iget-object v14, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    check-cast v14, Lb7/b;

    iget-object v15, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    check-cast v15, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    :try_start_e
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_1

    move-object/from16 v16, v12

    move-object/from16 v17, v13

    goto/16 :goto_6

    :pswitch_f
    iget v0, v3, Lpj1/c$c;->z:I

    iget-object v5, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    iget-object v14, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    check-cast v14, Lb7/b;

    iget-object v15, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    check-cast v15, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    :try_start_f
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_1

    move-object/from16 v16, v12

    move-object/from16 v17, v13

    goto/16 :goto_4

    :pswitch_10
    iget v0, v3, Lpj1/c$c;->z:I

    iget-object v5, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    iget-object v14, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    check-cast v14, Lb7/b;

    iget-object v15, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    check-cast v15, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    :try_start_10
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_1

    move-object v1, v5

    goto :goto_2

    :pswitch_11
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_11
    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->getExerciseSessionRecords()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    new-instance v14, Ljava/util/ArrayList;
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_1

    const/16 v15, 0xa

    :try_start_12
    invoke-static {v5, v15}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v14, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;

    invoke-virtual {v5}, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;->toRecord()Lm7/w;

    move-result-object v5

    invoke-interface {v14, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :catch_2
    move-exception v0

    move-object/from16 v1, p0

    goto/16 :goto_1c

    :cond_1
    const/4 v1, 0x0

    iput-object v1, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    iput-object v0, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    move-object/from16 v1, p1

    iput-object v1, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    const/4 v5, 0x0

    iput v5, v3, Lpj1/c$c;->z:I

    const/4 v5, 0x1

    iput v5, v3, Lpj1/c$c;->G:I

    invoke-static {v0, v2, v14, v3}, Lpj1/d;->b(Lb7/b;Lj93/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_2

    goto/16 :goto_19

    :cond_2
    move-object v14, v0

    const/4 v0, 0x0

    :goto_2
    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->getActiveCaloriesBurnedRecords()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    new-instance v15, Ljava/util/ArrayList;

    move-object/from16 v16, v12

    move-object/from16 v17, v13

    const/16 v12, 0xa

    invoke-static {v5, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v15, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/whoop/healthconnect/domain/models/HealthConnectActiveCaloriesBurnedModel;

    invoke-virtual {v12}, Lcom/whoop/healthconnect/domain/models/HealthConnectActiveCaloriesBurnedModel;->toRecord()Lm7/a;

    move-result-object v12

    invoke-interface {v15, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_3
    const/4 v5, 0x0

    iput-object v5, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    iput-object v14, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    iput-object v1, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    iput v0, v3, Lpj1/c$c;->z:I

    const/4 v5, 0x2

    iput v5, v3, Lpj1/c$c;->G:I

    invoke-static {v14, v2, v15, v3}, Lpj1/d;->b(Lb7/b;Lj93/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_4

    goto/16 :goto_19

    :cond_4
    move-object v5, v1

    :goto_4
    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v5}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->getSleepSessionRecords()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    const/16 v15, 0xa

    invoke-static {v2, v15}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/whoop/healthconnect/domain/models/HealthConnectSleepSessionModel;

    invoke-virtual {v13}, Lcom/whoop/healthconnect/domain/models/HealthConnectSleepSessionModel;->toRecord()Lm7/x0;

    move-result-object v13

    invoke-interface {v12, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_5
    const/4 v2, 0x0

    iput-object v2, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    iput-object v14, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    iput-object v5, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    iput v0, v3, Lpj1/c$c;->z:I

    const/4 v2, 0x3

    iput v2, v3, Lpj1/c$c;->G:I

    invoke-static {v14, v1, v12, v3}, Lpj1/d;->b(Lb7/b;Lj93/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_6

    goto/16 :goto_19

    :cond_6
    :goto_6
    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v5}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->getRespiratoryRateRecords()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    const/16 v15, 0xa

    invoke-static {v2, v15}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/whoop/healthconnect/domain/models/HealthConnectRespiratoryRateModel;

    invoke-virtual {v13}, Lcom/whoop/healthconnect/domain/models/HealthConnectRespiratoryRateModel;->toRecord()Lm7/s0;

    move-result-object v13

    invoke-interface {v12, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_7
    const/4 v2, 0x0

    iput-object v2, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    iput-object v14, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    iput-object v5, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    iput v0, v3, Lpj1/c$c;->z:I

    const/4 v2, 0x4

    iput v2, v3, Lpj1/c$c;->G:I

    invoke-static {v14, v1, v12, v3}, Lpj1/d;->b(Lb7/b;Lj93/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_8

    goto/16 :goto_19

    :cond_8
    :goto_8
    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v5}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->getRestingHeartRateRecords()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    const/16 v15, 0xa

    invoke-static {v2, v15}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/whoop/healthconnect/domain/models/HealthConnectRestingHeartRateModel;

    invoke-virtual {v13}, Lcom/whoop/healthconnect/domain/models/HealthConnectRestingHeartRateModel;->toRecord()Lm7/t0;

    move-result-object v13

    invoke-interface {v12, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_9
    const/4 v2, 0x0

    iput-object v2, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    iput-object v14, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    iput-object v5, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    iput v0, v3, Lpj1/c$c;->z:I

    const/4 v2, 0x5

    iput v2, v3, Lpj1/c$c;->G:I

    invoke-static {v14, v1, v12, v3}, Lpj1/d;->b(Lb7/b;Lj93/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_a

    goto/16 :goto_19

    :cond_a
    :goto_a
    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v5}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->getOxygenSaturationRecords()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    const/16 v15, 0xa

    invoke-static {v2, v15}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;

    invoke-virtual {v13}, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;->toRecord()Lm7/o0;

    move-result-object v13

    invoke-interface {v12, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_b
    const/4 v2, 0x0

    iput-object v2, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    iput-object v14, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    iput-object v5, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    iput v0, v3, Lpj1/c$c;->z:I

    const/4 v2, 0x6

    iput v2, v3, Lpj1/c$c;->G:I

    invoke-static {v14, v1, v12, v3}, Lpj1/d;->b(Lb7/b;Lj93/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_c

    goto/16 :goto_19

    :cond_c
    :goto_c
    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v5}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->getHeartRateRecords()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    const/16 v15, 0xa

    invoke-static {v2, v15}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/whoop/healthconnect/domain/models/HealthConnectHeartRateModel;

    invoke-virtual {v13}, Lcom/whoop/healthconnect/domain/models/HealthConnectHeartRateModel;->toRecord()Lm7/z;

    move-result-object v13

    invoke-interface {v12, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_d
    const/4 v2, 0x0

    iput-object v2, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    iput-object v14, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    iput-object v5, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    iput v0, v3, Lpj1/c$c;->z:I

    const/4 v2, 0x7

    iput v2, v3, Lpj1/c$c;->G:I

    invoke-static {v14, v1, v12, v3}, Lpj1/d;->b(Lb7/b;Lj93/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_e

    goto/16 :goto_19

    :cond_e
    :goto_e
    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v5}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->getStepRecords()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    const/16 v15, 0xa

    invoke-static {v2, v15}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;

    invoke-virtual {v13}, Lcom/whoop/healthconnect/domain/models/StepsRecordModel;->toRecord()Lm7/d1;

    move-result-object v13

    invoke-interface {v12, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_f

    :cond_f
    const/4 v2, 0x0

    iput-object v2, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    iput-object v14, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    iput-object v5, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    iput v0, v3, Lpj1/c$c;->z:I

    const/16 v2, 0x8

    iput v2, v3, Lpj1/c$c;->G:I

    invoke-static {v14, v1, v12, v3}, Lpj1/d;->b(Lb7/b;Lj93/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v1
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_2

    if-ne v1, v4, :cond_10

    goto/16 :goto_19

    :cond_10
    :goto_10
    :try_start_13
    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    move-object/from16 v2, v17

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v5}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->getDeletedExerciseSessionRecords()Ljava/util/List;

    move-result-object v2

    const/4 v12, 0x0

    iput-object v12, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    iput-object v14, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    iput-object v5, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    iput v0, v3, Lpj1/c$c;->z:I

    const/16 v12, 0x9

    iput v12, v3, Lpj1/c$c;->G:I

    invoke-static {v14, v1, v2, v3}, Lpj1/d;->a(Lb7/b;Lj93/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_11

    goto/16 :goto_19

    :cond_11
    move-object v12, v14

    :goto_11
    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    move-object/from16 v2, v16

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v5}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->getDeletedActiveCaloriesBurnedRecords()Ljava/util/List;

    move-result-object v2

    const/4 v13, 0x0

    iput-object v13, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    iput-object v12, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    iput-object v5, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    iput v0, v3, Lpj1/c$c;->z:I

    const/16 v15, 0xa

    iput v15, v3, Lpj1/c$c;->G:I

    invoke-static {v12, v1, v2, v3}, Lpj1/d;->a(Lb7/b;Lj93/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_12

    goto/16 :goto_19

    :cond_12
    :goto_12
    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v5}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->getDeletedSleepSessionRecords()Ljava/util/List;

    move-result-object v2

    const/4 v13, 0x0

    iput-object v13, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    iput-object v12, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    iput-object v5, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    iput v0, v3, Lpj1/c$c;->z:I

    const/16 v11, 0xb

    iput v11, v3, Lpj1/c$c;->G:I

    invoke-static {v12, v1, v2, v3}, Lpj1/d;->a(Lb7/b;Lj93/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_13

    goto/16 :goto_19

    :cond_13
    move-object v11, v12

    :goto_13
    const-class v1, Lm7/y0;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v5}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->getDeletedSleepStageRecords()Ljava/util/List;

    move-result-object v2

    const/4 v13, 0x0

    iput-object v13, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    iput-object v11, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    iput-object v5, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    iput v0, v3, Lpj1/c$c;->z:I

    const/16 v12, 0xc

    iput v12, v3, Lpj1/c$c;->G:I

    invoke-static {v11, v1, v2, v3}, Lpj1/d;->a(Lb7/b;Lj93/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_14

    goto/16 :goto_19

    :cond_14
    :goto_14
    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v5}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->getDeletedRespiratoryRateRecords()Ljava/util/List;

    move-result-object v2

    const/4 v13, 0x0

    iput-object v13, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    iput-object v11, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    iput-object v5, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    iput v0, v3, Lpj1/c$c;->z:I

    const/16 v10, 0xd

    iput v10, v3, Lpj1/c$c;->G:I

    invoke-static {v11, v1, v2, v3}, Lpj1/d;->a(Lb7/b;Lj93/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_15

    goto/16 :goto_19

    :cond_15
    move-object v10, v11

    :goto_15
    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v5}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->getDeletedRestingHeartRateRecords()Ljava/util/List;

    move-result-object v2

    const/4 v13, 0x0

    iput-object v13, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    iput-object v10, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    iput-object v5, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    iput v0, v3, Lpj1/c$c;->z:I

    const/16 v9, 0xe

    iput v9, v3, Lpj1/c$c;->G:I

    invoke-static {v10, v1, v2, v3}, Lpj1/d;->a(Lb7/b;Lj93/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_16

    goto :goto_19

    :cond_16
    move-object v9, v10

    :goto_16
    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v5}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->getDeletedOxygenSaturationRecords()Ljava/util/List;

    move-result-object v2

    const/4 v13, 0x0

    iput-object v13, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    iput-object v9, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    iput-object v5, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    iput v0, v3, Lpj1/c$c;->z:I

    const/16 v8, 0xf

    iput v8, v3, Lpj1/c$c;->G:I

    invoke-static {v9, v1, v2, v3}, Lpj1/d;->a(Lb7/b;Lj93/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_17

    goto :goto_19

    :cond_17
    move-object v8, v9

    :goto_17
    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v5}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->getDeletedHeartRateRecords()Ljava/util/List;

    move-result-object v2

    const/4 v13, 0x0

    iput-object v13, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    iput-object v8, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    iput-object v5, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    iput v0, v3, Lpj1/c$c;->z:I

    const/16 v7, 0x10

    iput v7, v3, Lpj1/c$c;->G:I

    invoke-static {v8, v1, v2, v3}, Lpj1/d;->a(Lb7/b;Lj93/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_18

    goto :goto_19

    :cond_18
    move-object v7, v8

    :goto_18
    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v5}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->getDeletedStepRecords()Ljava/util/List;

    move-result-object v2

    const/4 v13, 0x0

    iput-object v13, v3, Lpj1/c$c;->w:Ljava/lang/Object;

    iput-object v13, v3, Lpj1/c$c;->x:Ljava/lang/Object;

    iput-object v13, v3, Lpj1/c$c;->y:Ljava/lang/Object;

    iput v0, v3, Lpj1/c$c;->z:I

    const/16 v0, 0x11

    iput v0, v3, Lpj1/c$c;->G:I

    invoke-static {v7, v1, v2, v3}, Lpj1/d;->a(Lb7/b;Lj93/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_3

    if-ne v0, v4, :cond_19

    :goto_19
    return-object v4

    :cond_19
    :goto_1a
    sget-object v0, Lpj1/e;->SUCCESS:Lpj1/e;

    return-object v0

    :catch_3
    move-exception v0

    move-object/from16 v1, p0

    :goto_1b
    iget-object v2, v1, Lpj1/c;->b:Ltr2/n;

    const-string v3, "Deleting Health Connect records"

    const/4 v5, 0x0

    new-array v4, v5, [Lqr2/a$a;

    invoke-interface {v2, v3, v0, v4}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    sget-object v0, Lpj1/e;->FAILED:Lpj1/e;

    return-object v0

    :goto_1c
    iget-object v2, v1, Lpj1/c;->b:Ltr2/n;

    const-string v3, "Writing Whoop events"

    const/4 v5, 0x0

    new-array v4, v5, [Lqr2/a$a;

    invoke-interface {v2, v3, v0, v4}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    sget-object v0, Lpj1/e;->FAILED:Lpj1/e;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final e(Lb7/b;Ljava/util/Set;Lq83/d;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb7/b;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    instance-of v2, v1, Lpj1/c$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lpj1/c$a;

    iget v3, v2, Lpj1/c$a;->K:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lpj1/c$a;->K:I

    goto :goto_0

    :cond_0
    new-instance v2, Lpj1/c$a;

    invoke-direct {v2, v0, v1}, Lpj1/c$a;-><init>(Lpj1/c;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lpj1/c$a;->I:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lpj1/c$a;->K:I

    const-string v5, "health_connect_whoop_records_token"

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v6, :cond_1

    iget v4, v2, Lpj1/c$a;->H:I

    iget-object v9, v2, Lpj1/c$a;->G:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v10, v2, Lpj1/c$a;->F:Ljava/lang/Object;

    check-cast v10, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    iget-object v10, v2, Lpj1/c$a;->E:Ljava/lang/Object;

    check-cast v10, Lu02/a;

    iget-object v11, v2, Lpj1/c$a;->z:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    iget-object v12, v2, Lpj1/c$a;->y:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    iget-object v13, v2, Lpj1/c$a;->x:Ljava/lang/Object;

    check-cast v13, Ljava/util/Set;

    iget-object v13, v2, Lpj1/c$a;->w:Ljava/lang/Object;

    check-cast v13, Lb7/b;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v4, v2, Lpj1/c$a;->H:I

    iget-object v9, v2, Lpj1/c$a;->z:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v10, v2, Lpj1/c$a;->y:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    iget-object v11, v2, Lpj1/c$a;->x:Ljava/lang/Object;

    check-cast v11, Ljava/util/Set;

    iget-object v11, v2, Lpj1/c$a;->w:Ljava/lang/Object;

    check-cast v11, Lb7/b;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v12, v10

    move-object v13, v11

    move-object v11, v9

    goto :goto_2

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lpj1/c;->d(Ljava/util/Set;)Ljava/util/List;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_8

    iget-object v4, v0, Lpj1/c;->c:Lu92/d;

    invoke-virtual {v4, v5}, Lu92/d;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v9, 0x0

    move-object v14, v2

    move-object v2, v1

    move-object/from16 v1, p1

    :goto_1
    sget-object v10, Lu02/a;->a:Lu02/a$a;

    move-object v11, v10

    iget-object v10, v0, Lpj1/c;->b:Ltr2/n;

    new-instance v13, Lpj1/c$b;

    invoke-direct {v13, v0, v4, v2, v8}, Lpj1/c$b;-><init>(Lpj1/c;Ljava/lang/String;Ljava/util/List;Lq83/d;)V

    iput-object v1, v14, Lpj1/c$a;->w:Ljava/lang/Object;

    iput-object v8, v14, Lpj1/c$a;->x:Ljava/lang/Object;

    iput-object v2, v14, Lpj1/c$a;->y:Ljava/lang/Object;

    iput-object v4, v14, Lpj1/c$a;->z:Ljava/lang/Object;

    iput-object v8, v14, Lpj1/c$a;->E:Ljava/lang/Object;

    iput-object v8, v14, Lpj1/c$a;->F:Ljava/lang/Object;

    iput-object v8, v14, Lpj1/c$a;->G:Ljava/lang/Object;

    iput v9, v14, Lpj1/c$a;->H:I

    iput v7, v14, Lpj1/c$a;->K:I

    move v12, v9

    move-object v9, v11

    const/4 v11, 0x0

    move v15, v12

    const/4 v12, 0x0

    move/from16 v16, v15

    const/4 v15, 0x6

    move/from16 v17, v16

    const/16 v16, 0x0

    invoke-static/range {v9 .. v16}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v3, :cond_4

    goto :goto_3

    :cond_4
    move-object v13, v1

    move-object v12, v2

    move-object v11, v4

    move-object v1, v9

    move-object v2, v14

    move/from16 v4, v17

    :goto_2
    move-object v10, v1

    check-cast v10, Lu02/a;

    instance-of v1, v10, Lu02/a$c;

    if-eqz v1, :cond_6

    move-object v1, v10

    check-cast v1, Lu02/a$c;

    invoke-virtual {v1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    invoke-virtual {v1}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->getToken()Ljava/lang/String;

    move-result-object v9

    iput-object v13, v2, Lpj1/c$a;->w:Ljava/lang/Object;

    iput-object v8, v2, Lpj1/c$a;->x:Ljava/lang/Object;

    iput-object v12, v2, Lpj1/c$a;->y:Ljava/lang/Object;

    iput-object v11, v2, Lpj1/c$a;->z:Ljava/lang/Object;

    iput-object v10, v2, Lpj1/c$a;->E:Ljava/lang/Object;

    iput-object v8, v2, Lpj1/c$a;->F:Ljava/lang/Object;

    iput-object v9, v2, Lpj1/c$a;->G:Ljava/lang/Object;

    iput v4, v2, Lpj1/c$a;->H:I

    iput v6, v2, Lpj1/c$a;->K:I

    invoke-direct {v0, v1, v13, v2}, Lpj1/c;->g(Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;Lb7/b;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_5

    :goto_3
    return-object v3

    :cond_5
    :goto_4
    check-cast v1, Lpj1/e;

    sget-object v14, Lpj1/e;->SUCCESS:Lpj1/e;

    if-ne v1, v14, :cond_6

    iget-object v1, v0, Lpj1/c;->c:Lu92/d;

    invoke-virtual {v1, v5, v9}, Lu92/d;->v(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    move-object v14, v2

    move-object v2, v12

    move-object v1, v13

    add-int/lit8 v9, v4, 0x1

    instance-of v4, v10, Lu02/a$c;

    if-nez v4, :cond_8

    const/4 v4, 0x3

    if-le v9, v4, :cond_7

    goto :goto_5

    :cond_7
    move-object v4, v11

    goto :goto_1

    :cond_8
    :goto_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
