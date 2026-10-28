.class public final Lh0/t0;
.super Ls83/h;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lcz0/d;

.field public final synthetic F:Lgw1/a;

.field public final synthetic G:Lcz0/e;

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lcz0/c;


# direct methods
.method public constructor <init>(Lcz0/c;Lcz0/d;Lgw1/a;Lcz0/e;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lh0/t0;->z:Lcz0/c;

    iput-object p2, p0, Lh0/t0;->E:Lcz0/d;

    iput-object p3, p0, Lh0/t0;->F:Lgw1/a;

    iput-object p4, p0, Lh0/t0;->G:Lcz0/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/h;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6

    new-instance v0, Lh0/t0;

    iget-object v3, p0, Lh0/t0;->F:Lgw1/a;

    iget-object v4, p0, Lh0/t0;->G:Lcz0/e;

    iget-object v1, p0, Lh0/t0;->z:Lcz0/c;

    iget-object v2, p0, Lh0/t0;->E:Lcz0/d;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lh0/t0;-><init>(Lcz0/c;Lcz0/d;Lgw1/a;Lcz0/e;Lq83/d;)V

    iput-object p1, v0, Lh0/t0;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu2/b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh0/t0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/t0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/t0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lh0/t0;->x:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lh0/t0;->y:Ljava/lang/Object;

    check-cast v0, Lu2/b;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    goto/16 :goto_6

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lh0/t0;->y:Ljava/lang/Object;

    check-cast v1, Lu2/b;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lh0/t0;->y:Ljava/lang/Object;

    check-cast v1, Lu2/b;

    :try_start_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lh0/t0;->y:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lu2/b;

    :try_start_3
    iput-object v1, p0, Lh0/t0;->y:Ljava/lang/Object;

    iput v4, p0, Lh0/t0;->x:I

    invoke-static {v1, p0, v3}, Lh0/o3;->c(Lu2/b;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_2

    :cond_4
    :goto_0
    check-cast p1, Lu2/r;

    iget-wide v4, p1, Lu2/r;->a:J

    iput-object v1, p0, Lh0/t0;->y:Ljava/lang/Object;

    iput v3, p0, Lh0/t0;->x:I

    invoke-static {v1, v4, v5, p0}, Lh0/z0;->d(Lu2/b;JLs83/a;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    check-cast p1, Lu2/r;

    if-eqz p1, :cond_a

    iget-object v3, p0, Lh0/t0;->z:Lcz0/c;

    iget-wide v4, p1, Lu2/r;->c:J

    new-instance v6, Lh2/b;

    invoke-direct {v6, v4, v5}, Lh2/b;-><init>(J)V

    invoke-virtual {v3, v6}, Lcz0/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v3, p1, Lu2/r;->a:J

    iget-object p1, p0, Lh0/t0;->G:Lcz0/e;

    new-instance v5, Leg/j;

    const/16 v6, 0x1a

    invoke-direct {v5, p1, v6}, Leg/j;-><init>(Ljava/lang/Object;I)V

    iput-object v1, p0, Lh0/t0;->y:Ljava/lang/Object;

    iput v2, p0, Lh0/t0;->x:I

    invoke-static {v1, v3, v4, v5, p0}, Lh0/z0;->j(Lu2/b;JLkotlin/jvm/functions/Function1;Ls83/a;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_2
    return-object v0

    :cond_6
    move-object v0, v1

    :goto_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_9

    check-cast v0, Lu2/g0;

    iget-object p1, v0, Lu2/g0;->F:Lu2/h0;

    iget-object p1, p1, Lu2/h0;->T:Lu2/k;

    iget-object p1, p1, Lu2/k;->a:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_4
    if-ge v1, v0, :cond_8

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lu2/r;

    invoke-static {v2}, Lu2/d0;->d(Lu2/r;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v2}, Lu2/r;->a()V

    :cond_7
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_8
    iget-object p1, p0, Lh0/t0;->E:Lcz0/d;

    invoke-virtual {p1}, Lcz0/d;->invoke()Ljava/lang/Object;

    goto :goto_5

    :cond_9
    sget p1, Lh0/z0;->a:F
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_0

    :cond_a
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_6
    sget v0, Lh0/z0;->a:F

    throw p1
.end method
