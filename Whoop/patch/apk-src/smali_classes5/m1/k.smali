.class public final Lm1/k;
.super Ls83/h;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public E:I

.field public synthetic F:Ljava/lang/Object;

.field public final synthetic G:Lbc3/c0;

.field public final synthetic H:Ll1/x4;

.field public x:Lec3/p1;

.field public y:Lu2/l;

.field public z:J


# direct methods
.method public constructor <init>(Lbc3/c0;Ll1/x4;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lm1/k;->G:Lbc3/c0;

    iput-object p2, p0, Lm1/k;->H:Ll1/x4;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/h;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    new-instance v0, Lm1/k;

    iget-object v1, p0, Lm1/k;->G:Lbc3/c0;

    iget-object v2, p0, Lm1/k;->H:Ll1/x4;

    invoke-direct {v0, v1, v2, p2}, Lm1/k;-><init>(Lbc3/c0;Ll1/x4;Lq83/d;)V

    iput-object p1, v0, Lm1/k;->F:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu2/b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lm1/k;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lm1/k;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lm1/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lm1/k;->E:I

    const/4 v2, 0x2

    const/4 v3, 0x3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v2, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Lm1/k;->F:Ljava/lang/Object;

    check-cast v0, Lec3/p1;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_7

    :catchall_0
    move-exception p1

    goto/16 :goto_8

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lm1/k;->y:Lu2/l;

    iget-object v2, p0, Lm1/k;->x:Lec3/p1;

    iget-object v6, p0, Lm1/k;->F:Ljava/lang/Object;

    check-cast v6, Lu2/b;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto/16 :goto_3

    :catchall_1
    move-exception p1

    move-object v0, v2

    goto/16 :goto_8

    :catch_0
    move-object v8, v1

    move-object v1, v2

    goto/16 :goto_5

    :cond_2
    iget-wide v6, p0, Lm1/k;->z:J

    iget-object v1, p0, Lm1/k;->y:Lu2/l;

    iget-object v8, p0, Lm1/k;->x:Lec3/p1;

    iget-object v9, p0, Lm1/k;->F:Ljava/lang/Object;

    check-cast v9, Lu2/b;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, v8

    move-object v8, v1

    move-object v1, v10

    move-wide v11, v6

    move-object v6, v9

    :goto_0
    move-wide v9, v11

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lm1/k;->F:Ljava/lang/Object;

    check-cast p1, Lu2/b;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    check-cast p1, Lu2/g0;

    invoke-virtual {p1}, Lu2/g0;->f()Lb3/j3;

    move-result-object v6

    invoke-interface {v6}, Lb3/j3;->c()J

    move-result-wide v6

    sget-object v8, Lu2/l;->w:Lu2/l;

    iput-object p1, p0, Lm1/k;->F:Ljava/lang/Object;

    iput-object v1, p0, Lm1/k;->x:Lec3/p1;

    iput-object v8, p0, Lm1/k;->y:Lu2/l;

    iput-wide v6, p0, Lm1/k;->z:J

    iput v4, p0, Lm1/k;->E:I

    invoke-static {p1, p0, v4}, Lh0/o3;->c(Lu2/b;Lq83/d;I)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v0, :cond_4

    goto :goto_6

    :cond_4
    move-wide v11, v6

    move-object v6, p1

    move-object p1, v9

    goto :goto_0

    :goto_1
    check-cast p1, Lu2/r;

    iget p1, p1, Lu2/r;->i:I

    if-ne p1, v4, :cond_5

    goto :goto_2

    :cond_5
    if-ne p1, v3, :cond_9

    :goto_2
    :try_start_2
    new-instance p1, Lb30/g2;

    const/4 v7, 0x3

    invoke-direct {p1, v8, v5, v7}, Lb30/g2;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object v6, p0, Lm1/k;->F:Ljava/lang/Object;

    iput-object v1, p0, Lm1/k;->x:Lec3/p1;

    iput-object v8, p0, Lm1/k;->y:Lu2/l;

    iput v2, p0, Lm1/k;->E:I

    move-object v2, v6

    check-cast v2, Lu2/g0;

    invoke-virtual {v2, v9, v10, p1, p0}, Lu2/g0;->k(JLc93/m;Ls83/a;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne p1, v0, :cond_6

    goto :goto_6

    :cond_6
    move-object v2, v1

    :goto_3
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, v5, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_9

    :goto_4
    move-object v0, v1

    goto :goto_8

    :catchall_2
    move-exception p1

    goto :goto_4

    :catch_1
    :goto_5
    :try_start_3
    iget-object p1, p0, Lm1/k;->G:Lbc3/c0;

    sget-object v2, Lbc3/d0;->z:Lbc3/d0;

    new-instance v7, Lg20/p;

    iget-object v9, p0, Lm1/k;->H:Ll1/x4;

    const/16 v10, 0x1a

    invoke-direct {v7, v1, v9, v5, v10}, Lg20/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {p1, v5, v2, v7, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iput-object v1, p0, Lm1/k;->F:Ljava/lang/Object;

    iput-object v5, p0, Lm1/k;->x:Lec3/p1;

    iput-object v5, p0, Lm1/k;->y:Lu2/l;

    iput v3, p0, Lm1/k;->E:I

    invoke-static {v6, v8, p0}, Lh0/o3;->j(Lu2/b;Lu2/l;Ls83/a;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-ne p1, v0, :cond_7

    :goto_6
    return-object v0

    :cond_7
    move-object v0, v1

    :goto_7
    :try_start_4
    check-cast p1, Lu2/r;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lu2/r;->a()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_8
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v5, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_9

    :goto_8
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v5, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    throw p1

    :cond_9
    :goto_9
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
