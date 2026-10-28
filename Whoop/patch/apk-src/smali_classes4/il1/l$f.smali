.class final Lil1/l$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lil1/l;->e(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lil1/l$c;",
        "accumulator",
        "Lil1/u;",
        "action",
        "<anonymous>",
        "(Lil1/l$c;Lil1/u;)Lil1/l$c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.home.domain.HomeActionReducer$reduce$1"
    f = "HomeActionReducer.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lil1/l;


# direct methods
.method public constructor <init>(Lil1/l;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lil1/l;",
            "Lq83/d<",
            "-",
            "Lil1/l$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lil1/l$f;->z:Lil1/l;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lil1/l$c;Lil1/u;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lil1/l$c;",
            "Lil1/u;",
            "Lq83/d<",
            "-",
            "Lil1/l$c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lil1/l$f;

    iget-object v1, p0, Lil1/l$f;->z:Lil1/l;

    invoke-direct {v0, v1, p3}, Lil1/l$f;-><init>(Lil1/l;Lq83/d;)V

    iput-object p1, v0, Lil1/l$f;->x:Ljava/lang/Object;

    iput-object p2, v0, Lil1/l$f;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lil1/l$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lil1/l$c;

    check-cast p2, Lil1/u;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lil1/l$f;->f(Lil1/l$c;Lil1/u;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lil1/l$f;->x:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lil1/l$c;

    iget-object v1, v0, Lil1/l$f;->y:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Lil1/u;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, v0, Lil1/l$f;->w:I

    if-nez v1, :cond_13

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v1, v7, Lil1/u$b;

    if-eqz v1, :cond_1

    check-cast v7, Lil1/u$b;

    invoke-virtual {v7}, Lil1/u$b;->b()Lfm1/g;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {v2}, Lil1/l$c;->e()Lfm1/g;

    move-result-object v1

    :cond_0
    move-object v6, v1

    invoke-virtual {v7, v6}, Lil1/u$b;->a(Lfm1/g;)Lil1/u$b;

    move-result-object v7

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    invoke-static/range {v2 .. v9}, Lil1/l$c;->b(Lil1/l$c;Ljava/time/LocalDate;JLfm1/g;Lil1/u;ILjava/lang/Object;)Lil1/l$c;

    move-result-object v1

    return-object v1

    :cond_1
    instance-of v1, v7, Lil1/u$a;

    if-eqz v1, :cond_2

    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v9}, Lil1/l$c;->b(Lil1/l$c;Ljava/time/LocalDate;JLfm1/g;Lil1/u;ILjava/lang/Object;)Lil1/l$c;

    move-result-object v1

    return-object v1

    :cond_2
    instance-of v1, v7, Lil1/u$c;

    if-eqz v1, :cond_12

    move-object v8, v7

    check-cast v8, Lil1/u$c;

    invoke-virtual {v8}, Lil1/u$c;->d()Lem1/r;

    move-result-object v1

    sget-object v3, Lem1/r;->AUTO_REFRESH:Lem1/r;

    const-string v4, "now(...)"

    if-ne v1, v3, :cond_5

    iget-object v1, v0, Lil1/l$f;->z:Lil1/l;

    invoke-static {v1}, Lil1/l;->d(Lil1/l;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v1

    const-string v3, "home-redesign-android-refresh-fix"

    invoke-interface {v1, v3}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, v0, Lil1/l$f;->z:Lil1/l;

    invoke-static {v1}, Lil1/l;->a(Lil1/l;)Ljava/time/Clock;

    move-result-object v1

    invoke-virtual {v1}, Ljava/time/Clock;->millis()J

    move-result-wide v5

    invoke-virtual {v2}, Lil1/l$c;->d()J

    move-result-wide v9

    sub-long/2addr v5, v9

    const-wide/32 v9, 0x927c0

    cmp-long v1, v5, v9

    if-ltz v1, :cond_3

    new-instance v9, Lil1/l$c;

    iget-object v1, v0, Lil1/l$f;->z:Lil1/l;

    invoke-static {v1}, Lil1/l;->a(Lil1/l;)Ljava/time/Clock;

    move-result-object v1

    invoke-static {v1}, Ljava/time/LocalDate;->now(Ljava/time/Clock;)Ljava/time/LocalDate;

    move-result-object v10

    invoke-static {v10, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lil1/l$f;->z:Lil1/l;

    invoke-static {v1}, Lil1/l;->a(Lil1/l;)Ljava/time/Clock;

    move-result-object v1

    invoke-virtual {v1}, Ljava/time/Clock;->millis()J

    move-result-wide v11

    const/16 v15, 0xc

    const/16 v16, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v9 .. v16}, Lil1/l$c;-><init>(Ljava/time/LocalDate;JLfm1/g;Lil1/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9

    :cond_3
    invoke-virtual {v8}, Lil1/u$c;->c()Lfm1/g;

    move-result-object v1

    if-nez v1, :cond_4

    invoke-virtual {v2}, Lil1/l$c;->e()Lfm1/g;

    move-result-object v1

    :cond_4
    move-object v10, v1

    const/16 v13, 0x9

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v8 .. v14}, Lil1/u$c;->b(Lil1/u$c;Ljava/time/LocalDate;Lfm1/g;ZLem1/r;ILjava/lang/Object;)Lil1/u$c;

    move-result-object v7

    const/4 v8, 0x7

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v9}, Lil1/l$c;->b(Lil1/l$c;Ljava/time/LocalDate;JLfm1/g;Lil1/u;ILjava/lang/Object;)Lil1/l$c;

    move-result-object v1

    return-object v1

    :cond_5
    iget-object v1, v0, Lil1/l$f;->z:Lil1/l;

    invoke-static {v1}, Lil1/l;->b(Lil1/l;)Ljs0/c;

    move-result-object v1

    sget-object v3, Lcom/whoop/data/repositories/HomeTimedRefreshStateResetMillis;->INSTANCE:Lcom/whoop/data/repositories/HomeTimedRefreshStateResetMillis;

    invoke-virtual {v1}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object v1

    invoke-virtual {v3}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v3

    sget-object v6, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v7, Ljava/lang/Long;

    invoke-virtual {v6, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v6, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    const/4 v10, 0x0

    if-eqz v9, :cond_6

    invoke-virtual {v1, v5}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_c

    invoke-static {v1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v10

    goto/16 :goto_0

    :cond_6
    sget-object v9, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v6, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-virtual {v1, v5}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_c

    invoke-static {v1}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v10

    goto :goto_0

    :cond_7
    sget-object v9, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v6, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-virtual {v1, v5}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_c

    invoke-static {v1}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v10

    goto :goto_0

    :cond_8
    sget-object v9, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v6, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-virtual {v1, v5}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_c

    invoke-static {v1}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v10

    goto :goto_0

    :cond_9
    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v6, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    invoke-virtual {v1, v5}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_c

    invoke-static {v1}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v10

    goto :goto_0

    :cond_a
    const-class v9, Ljava/lang/String;

    invoke-virtual {v6, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v7, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-virtual {v1, v5}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    goto :goto_0

    :cond_b
    move-object v10, v3

    :cond_c
    :goto_0
    if-nez v10, :cond_d

    goto :goto_1

    :cond_d
    move-object v3, v10

    :goto_1
    if-eqz v3, :cond_11

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    iget-object v1, v0, Lil1/l$f;->z:Lil1/l;

    invoke-static {v1}, Lil1/l;->a(Lil1/l;)Ljava/time/Clock;

    move-result-object v1

    invoke-virtual {v1}, Ljava/time/Clock;->millis()J

    move-result-wide v9

    invoke-virtual {v2}, Lil1/l$c;->d()J

    move-result-wide v11

    sub-long v11, v9, v11

    cmp-long v1, v11, v5

    if-ltz v1, :cond_e

    new-instance v1, Lil1/l$b;

    iget-object v3, v0, Lil1/l$f;->z:Lil1/l;

    invoke-static {v3}, Lil1/l;->a(Lil1/l;)Ljava/time/Clock;

    move-result-object v3

    invoke-static {v3}, Ljava/time/LocalDate;->now(Ljava/time/Clock;)Ljava/time/LocalDate;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lem1/r;->OVERRIDE:Lem1/r;

    invoke-direct {v1, v3, v4}, Lil1/l$b;-><init>(Ljava/time/LocalDate;Lem1/r;)V

    goto :goto_2

    :cond_e
    new-instance v1, Lil1/l$b;

    invoke-virtual {v8}, Lil1/u$c;->e()Ljava/time/LocalDate;

    move-result-object v3

    if-nez v3, :cond_f

    invoke-virtual {v2}, Lil1/l$c;->f()Ljava/time/LocalDate;

    move-result-object v3

    :cond_f
    invoke-virtual {v8}, Lil1/u$c;->d()Lem1/r;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Lil1/l$b;-><init>(Ljava/time/LocalDate;Lem1/r;)V

    :goto_2
    invoke-virtual {v1}, Lil1/l$b;->a()Ljava/time/LocalDate;

    move-result-object v3

    invoke-virtual {v1}, Lil1/l$b;->a()Ljava/time/LocalDate;

    move-result-object v4

    invoke-virtual {v8}, Lil1/u$c;->c()Lfm1/g;

    move-result-object v5

    if-nez v5, :cond_10

    invoke-virtual {v2}, Lil1/l$c;->e()Lfm1/g;

    move-result-object v5

    :cond_10
    const/4 v6, 0x1

    invoke-virtual {v1}, Lil1/l$b;->b()Lem1/r;

    move-result-object v1

    invoke-virtual {v8, v4, v5, v6, v1}, Lil1/u$c;->a(Ljava/time/LocalDate;Lfm1/g;ZLem1/r;)Lil1/u$c;

    move-result-object v7

    const/4 v8, 0x4

    move-wide v4, v9

    const/4 v9, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v9}, Lil1/l$c;->b(Lil1/l$c;Ljava/time/LocalDate;JLfm1/g;Lil1/u;ILjava/lang/Object;)Lil1/l$c;

    move-result-object v1

    return-object v1

    :cond_11
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "null cannot be cast to non-null type kotlin.Long"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_12
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_13
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
