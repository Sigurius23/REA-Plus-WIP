.class public final Lbe/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luf/o;


# instance fields
.field public final E:Lvg/c;

.field public final w:Lmf/u;

.field public final x:Lbe/k;

.field public final y:J

.field public final z:Lug/a;


# direct methods
.method public constructor <init>(Lmf/u;Lbe/k;JLug/a;)V
    .locals 1

    const-string v0, "clock"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/q;->w:Lmf/u;

    iput-object p2, p0, Lbe/q;->x:Lbe/k;

    iput-wide p3, p0, Lbe/q;->y:J

    iput-object p5, p0, Lbe/q;->z:Lug/a;

    new-instance p1, Lvg/c;

    sget-object p2, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/16 p2, 0x78

    sget-object p3, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {p2, p3}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide p2

    invoke-direct {p1, p2, p3, p5}, Lvg/c;-><init>(JLug/a;)V

    iput-object p1, p0, Lbe/q;->E:Lvg/c;

    return-void
.end method

.method public static final a(Lbe/q;Lug/a;Luf/u;Ls83/c;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    instance-of v2, v1, Lbe/o;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lbe/o;

    iget v3, v2, Lbe/o;->I:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lbe/o;->I:I

    goto :goto_0

    :cond_0
    new-instance v2, Lbe/o;

    invoke-direct {v2, v0, v1}, Lbe/o;-><init>(Lbe/q;Ls83/c;)V

    :goto_0
    iget-object v1, v2, Lbe/o;->G:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lbe/o;->I:I

    const-string v5, "x-aws-ec2-metadata-token-ttl-seconds"

    const/4 v6, 0x5

    const/4 v7, 0x4

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v4, :cond_6

    if-eq v4, v10, :cond_5

    if-eq v4, v9, :cond_4

    if-eq v4, v8, :cond_3

    if-eq v4, v7, :cond_2

    if-eq v4, v6, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v2, Lbe/o;->E:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_2
    iget-object v0, v2, Lbe/o;->E:Ljava/lang/Object;

    check-cast v0, Lbe/n;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v0

    :cond_3
    iget-wide v4, v2, Lbe/o;->F:J

    iget-object v8, v2, Lbe/o;->z:Lrf/l;

    iget-object v0, v2, Lbe/o;->w:Lug/a;

    :try_start_0
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_4
    iget-object v0, v2, Lbe/o;->x:Log/g;

    iget-object v4, v2, Lbe/o;->w:Lug/a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v13, v4

    goto/16 :goto_2

    :cond_5
    iget-object v4, v2, Lbe/o;->y:Lvf/b;

    iget-object v12, v2, Lbe/o;->x:Log/g;

    iget-object v13, v2, Lbe/o;->w:Lug/a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_6
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v2}, Lq83/d;->getContext()Lq83/j;

    move-result-object v1

    const-class v4, Lbe/q;

    sget-object v12, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v12, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-interface {v4}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_11

    invoke-static {v1, v4}, Lvd/f;->B(Lq83/j;Ljava/lang/String;)Lgm/r;

    move-result-object v1

    new-instance v4, Lb1/h;

    const/16 v12, 0x1b

    invoke-direct {v4, v12}, Lb1/h;-><init>(I)V

    invoke-virtual {v1, v11, v4}, Lgm/r;->s(Ljava/lang/Throwable;Lc93/a;)V

    new-instance v4, Lvf/b;

    invoke-direct {v4}, Lvf/b;-><init>()V

    sget-object v12, Lmf/r;->y:Lmf/r;

    iput-object v12, v4, Lvf/b;->w:Lmf/r;

    iget-wide v12, v0, Lbe/q;->y:J

    invoke-static {v12, v13}, Lkotlin/time/Duration;->getInWholeSeconds-impl(J)J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v12

    iget-object v13, v4, Lvf/b;->y:Lmf/c;

    invoke-virtual {v13, v12, v5}, La2/a;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p2

    iget-object v12, v12, Luf/u;->b:Ljava/lang/Object;

    check-cast v12, Lvf/b;

    iget-object v12, v12, Lvf/b;->y:Lmf/c;

    const-string v14, "User-Agent"

    invoke-virtual {v12, v14}, La2/a;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    if-eqz v12, :cond_7

    invoke-virtual {v13, v12, v14}, La2/a;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_7
    iget-object v12, v4, Lvf/b;->x:Lcg/j;

    iget-object v12, v12, Lcg/j;->z:Lbd3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v13, "/latest/api/token"

    invoke-virtual {v12, v13}, Lbd3/k;->e(Ljava/lang/String;)V

    iget-object v12, v0, Lbe/q;->x:Lbe/k;

    move-object/from16 v13, p1

    iput-object v13, v2, Lbe/o;->w:Lug/a;

    iput-object v1, v2, Lbe/o;->x:Log/g;

    iput-object v4, v2, Lbe/o;->y:Lvf/b;

    iput v10, v2, Lbe/o;->I:I

    iget-object v12, v12, Lbe/k;->x:Ls/m2;

    invoke-virtual {v12, v2}, Ls/m2;->g(Ls83/c;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v3, :cond_8

    goto/16 :goto_6

    :cond_8
    move-object/from16 v16, v12

    move-object v12, v1

    move-object/from16 v1, v16

    :goto_1
    check-cast v1, Lef/a;

    new-instance v14, Luf/u;

    new-instance v15, Ldg/a;

    invoke-direct {v15}, Ldg/a;-><init>()V

    invoke-direct {v14, v15, v4}, Luf/u;-><init>(Ldg/a;Ljava/lang/Object;)V

    invoke-static {v14, v1}, Lrv/n;->k(Luf/u;Lef/a;)V

    iget-object v0, v0, Lbe/q;->w:Lmf/u;

    iput-object v13, v2, Lbe/o;->w:Lug/a;

    iput-object v12, v2, Lbe/o;->x:Log/g;

    iput-object v11, v2, Lbe/o;->y:Lvf/b;

    iput v9, v2, Lbe/o;->I:I

    invoke-virtual {v4}, Lvf/b;->b()Lvf/h;

    move-result-object v1

    new-instance v4, Ldg/a;

    invoke-direct {v4}, Ldg/a;-><init>()V

    invoke-virtual {v0, v4, v1, v2}, Lmf/u;->b(Ldg/a;Lvf/h;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_9

    goto/16 :goto_6

    :cond_9
    move-object v0, v12

    :goto_2
    check-cast v1, Lrf/l;

    new-instance v4, Lbe/e;

    invoke-direct {v4, v1, v10}, Lbe/e;-><init>(Lrf/l;I)V

    invoke-interface {v0, v11, v4}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    :try_start_1
    iget-object v0, v1, Lrf/l;->x:Lwf/a;

    iget-object v4, v0, Lwf/a;->a:Lmf/t;

    sget-object v9, Lmf/t;->c:Lmf/t;

    invoke-virtual {v4, v9}, Lmf/t;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_e

    iget-object v4, v0, Lwf/a;->b:Lmf/h;

    invoke-interface {v4, v5}, Lgf/t;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_d

    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    iget-object v0, v0, Lwf/a;->c:Lmf/l;

    iput-object v13, v2, Lbe/o;->w:Lug/a;

    iput-object v11, v2, Lbe/o;->x:Log/g;

    iput-object v11, v2, Lbe/o;->y:Lvf/b;

    iput-object v1, v2, Lbe/o;->z:Lrf/l;

    iput-wide v4, v2, Lbe/o;->F:J

    iput v8, v2, Lbe/o;->I:I

    invoke-static {v0, v2}, Lx30/s0;->B(Lmf/l;Ls83/c;)Ljava/io/Serializable;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v0, v3, :cond_a

    goto/16 :goto_6

    :cond_a
    move-object v8, v1

    move-object v1, v0

    move-object v0, v13

    :goto_3
    :try_start_2
    check-cast v1, [B

    if-eqz v1, :cond_c

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lug/b;->x:Lt9/p;

    invoke-static {}, Lt9/p;->t()Lug/b;

    move-result-object v0

    sget-object v9, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object v9, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v4, v5, v9}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lug/b;->d(J)Lug/b;

    move-result-object v0

    new-instance v4, Lbe/n;

    invoke-direct {v4, v1, v0}, Lbe/n;-><init>([BLug/b;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iput-object v11, v2, Lbe/o;->w:Lug/a;

    iput-object v11, v2, Lbe/o;->x:Log/g;

    iput-object v11, v2, Lbe/o;->y:Lvf/b;

    iput-object v11, v2, Lbe/o;->z:Lrf/l;

    iput-object v4, v2, Lbe/o;->E:Ljava/lang/Object;

    iput v7, v2, Lbe/o;->I:I

    invoke-static {v8, v2}, Lx43/j;->q(Lrf/l;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_b

    goto :goto_6

    :cond_b
    return-object v4

    :cond_c
    :try_start_3
    new-instance v0, Laws/sdk/kotlin/runtime/config/imds/EC2MetadataError;

    sget-object v1, Lmf/t;->c:Lmf/t;

    const-string v4, "No token provided in IMDS response"

    invoke-direct {v0, v1, v4}, Laws/sdk/kotlin/runtime/config/imds/EC2MetadataError;-><init>(Lmf/t;Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_1
    move-exception v0

    move-object v8, v1

    goto :goto_5

    :cond_d
    :try_start_4
    new-instance v0, Laws/sdk/kotlin/runtime/config/imds/EC2MetadataError;

    const-string v4, "No TTL provided in IMDS response"

    invoke-direct {v0, v9, v4}, Laws/sdk/kotlin/runtime/config/imds/EC2MetadataError;-><init>(Lmf/t;Ljava/lang/String;)V

    throw v0

    :cond_e
    sget-object v0, Lmf/t;->e:Lmf/t;

    invoke-virtual {v4, v0}, Lmf/t;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    const-string v0, "Request forbidden: IMDS is disabled or the caller has insufficient permissions."

    goto :goto_4

    :cond_f
    const-string v0, "Failed to retrieve IMDS token"

    :goto_4
    new-instance v5, Laws/sdk/kotlin/runtime/config/imds/EC2MetadataError;

    invoke-direct {v5, v4, v0}, Laws/sdk/kotlin/runtime/config/imds/EC2MetadataError;-><init>(Lmf/t;Ljava/lang/String;)V

    throw v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_5
    iput-object v11, v2, Lbe/o;->w:Lug/a;

    iput-object v11, v2, Lbe/o;->x:Log/g;

    iput-object v11, v2, Lbe/o;->y:Lvf/b;

    iput-object v11, v2, Lbe/o;->z:Lrf/l;

    iput-object v0, v2, Lbe/o;->E:Ljava/lang/Object;

    iput v6, v2, Lbe/o;->I:I

    invoke-static {v8, v2}, Lx43/j;->q(Lrf/l;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_10

    :goto_6
    return-object v3

    :cond_10
    :goto_7
    throw v0

    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "logger<T> cannot be used on an anonymous object"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final b(Luf/u;Lq83/d;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lbe/p;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lbe/p;

    iget v1, v0, Lbe/p;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lbe/p;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lbe/p;

    check-cast p2, Ls83/c;

    invoke-direct {v0, p0, p2}, Lbe/p;-><init>(Lbe/q;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lbe/p;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lbe/p;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lbe/p;->w:Luf/u;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, La33/c;

    const/4 v2, 0x0

    const/4 v4, 0x3

    invoke-direct {p2, p0, p1, v2, v4}, La33/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lbe/p;->w:Luf/u;

    iput v3, v0, Lbe/p;->z:I

    iget-object v2, p0, Lbe/q;->E:Lvg/c;

    invoke-virtual {v2, p2, v0}, Lvg/c;->b(Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lbe/n;

    iget-object v0, p1, Luf/u;->b:Ljava/lang/Object;

    check-cast v0, Lvf/b;

    iget-object v0, v0, Lvf/b;->y:Lmf/c;

    iget-object p2, p2, Lbe/n;->a:[B

    invoke-static {p2}, Lyb3/y;->A([B)Ljava/lang/String;

    move-result-object p2

    const-string v1, "x-aws-ec2-metadata-token"

    invoke-virtual {v0, p2, v1}, La2/a;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final c(Lm63/d;)V
    .locals 3

    iget-object p1, p1, Lm63/d;->x:Ljava/lang/Object;

    check-cast p1, Lio/sentry/android/replay/video/d;

    iget-object p1, p1, Lio/sentry/android/replay/video/d;->c:Ljava/lang/Object;

    check-cast p1, Lag/e;

    sget-object v0, Lag/f;->w:Lag/f;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lag/f;->x:Lag/f;

    new-instance v1, Lag/e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lag/e;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v1, v0}, Lag/e;->c(Lag/b;Lag/f;)V

    return-void
.end method

.method public final bridge synthetic d(Ljava/lang/Object;Lag/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Luf/u;

    invoke-virtual {p0, p1, p2}, Lbe/q;->b(Luf/u;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
