.class public final Lsz/z;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# instance fields
.field public final E:Lux/s0;

.field public final F:Lux/q;

.field public final G:Lsz/d;

.field public final H:Landroidx/lifecycle/k1;

.field public final I:Lb20/f;

.field public final J:Lq83/j;

.field public final K:Lec3/w1;

.field public final L:Lec3/q1;

.field public final M:Lec3/w1;

.field public final N:Lec3/q1;

.field public final w:Ldq/p;

.field public final x:Lyy/f;

.field public final y:Lsz/t;

.field public final z:Lb10/z0;


# direct methods
.method public constructor <init>(Ldq/p;Lyy/f;Lsz/t;Lb10/z0;Lux/s0;Lux/q;Lsz/d;Landroidx/lifecycle/k1;Lb20/f;Lq83/j;)V
    .locals 1

    const-string v0, "args"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, Lsz/z;->w:Ldq/p;

    iput-object p2, p0, Lsz/z;->x:Lyy/f;

    iput-object p3, p0, Lsz/z;->y:Lsz/t;

    iput-object p4, p0, Lsz/z;->z:Lb10/z0;

    iput-object p5, p0, Lsz/z;->E:Lux/s0;

    iput-object p6, p0, Lsz/z;->F:Lux/q;

    iput-object p7, p0, Lsz/z;->G:Lsz/d;

    iput-object p8, p0, Lsz/z;->H:Landroidx/lifecycle/k1;

    iput-object p9, p0, Lsz/z;->I:Lb20/f;

    iput-object p10, p0, Lsz/z;->J:Lq83/j;

    const/4 p1, 0x1

    const/4 p2, 0x0

    const/4 p3, 0x0

    const/4 p4, 0x6

    invoke-static {p1, p2, p3, p4}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p5

    iput-object p5, p0, Lsz/z;->K:Lec3/w1;

    invoke-static {p5}, Lec3/v;->g(Lec3/o1;)Lec3/q1;

    move-result-object p5

    iput-object p5, p0, Lsz/z;->L:Lec3/q1;

    invoke-static {p1, p2, p3, p4}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lsz/z;->M:Lec3/w1;

    invoke-static {p1}, Lec3/v;->g(Lec3/o1;)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lsz/z;->N:Lec3/q1;

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance p2, Lsz/q;

    const/4 p4, 0x1

    invoke-direct {p2, p0, p3, p4}, Lsz/q;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 p4, 0x2

    invoke-static {p1, p10, p3, p2, p4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static final g(Lsz/z;Ls83/c;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p1, Lsz/y;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lsz/y;

    iget v1, v0, Lsz/y;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lsz/y;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lsz/y;

    invoke-direct {v0, p0, p1}, Lsz/y;-><init>(Lsz/z;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lsz/y;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lsz/y;->z:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, Lsz/y;->w:Lsz/z;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_4

    :cond_3
    iget-object p0, v0, Lsz/y;->w:Lsz/z;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iput-object p0, v0, Lsz/y;->w:Lsz/z;

    iput v6, v0, Lsz/y;->z:I

    iget-object p1, p0, Lsz/z;->G:Lsz/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ls40/c0;

    const/4 v7, 0x2

    invoke-direct {v2, p1, v5, v7}, Ls40/c0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v2}, Lec3/s1;-><init>(Lc93/m;)V

    invoke-static {p1, v0}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_7

    :cond_5
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_6

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    goto :goto_3

    :cond_6
    const-string p1, "Google Pay is unavailable."

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_2
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_3
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_7

    check-cast p1, Ll83/a0;

    iget-object p1, p0, Lsz/z;->y:Lsz/t;

    iput-object p0, v0, Lsz/y;->w:Lsz/z;

    iput v4, v0, Lsz/y;->z:I

    invoke-virtual {p0, p1, v0}, Lsz/z;->j(Lsz/t;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_7

    :cond_7
    invoke-static {v2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :cond_8
    :goto_4
    instance-of v2, p1, Ll83/m;

    if-nez v2, :cond_9

    :try_start_2
    check-cast p1, Ljava/lang/String;

    const-string v2, "paymentDataRequestJson cannot be null!"

    new-instance v4, Ldq/m;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iput-boolean v6, v4, Ldq/m;->I:Z

    invoke-static {p1, v2}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, v4, Ldq/m;->J:Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object p1, v4

    goto :goto_5

    :catchall_1
    move-exception p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :cond_9
    :goto_5
    instance-of v2, p1, Ll83/m;

    if-nez v2, :cond_b

    check-cast p1, Ldq/m;

    iget-object p0, p0, Lsz/z;->w:Ldq/p;

    invoke-virtual {p0, p1}, Ldq/p;->c(Ldq/m;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    const-string p1, "loadPaymentData(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, v0, Lsz/y;->w:Lsz/z;

    iput v3, v0, Lsz/y;->z:I

    invoke-static {p0, v0}, Ls4/i;->c(Lcom/google/android/gms/tasks/Task;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    goto :goto_7

    :cond_a
    :goto_6
    check-cast p1, Lcom/google/android/gms/tasks/Task;

    :cond_b
    move-object v1, p1

    :goto_7
    return-object v1
.end method


# virtual methods
.method public final j(Lsz/t;Ls83/c;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p2, Lsz/w;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lsz/w;

    iget v1, v0, Lsz/w;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lsz/w;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lsz/w;

    invoke-direct {v0, p0, p2}, Lsz/w;-><init>(Lsz/z;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lsz/w;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lsz/w;->E:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lsz/w;->x:Lsz/t;

    iget-object v0, v0, Lsz/w;->w:Lsz/z;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p2, p2, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lsz/w;->x:Lsz/t;

    iget-object v0, v0, Lsz/w;->w:Lsz/z;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p2, p2, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p2, p1, Lsz/u;

    sget-object v2, Lm83/y;->w:Lm83/y;

    iget-object v5, p0, Lsz/z;->x:Lyy/f;

    iget-object v6, p0, Lsz/z;->z:Lb10/z0;

    if-eqz p2, :cond_6

    move-object p2, p1

    check-cast p2, Lsz/u;

    iget-object p2, p2, Lsz/u;->w:Ljava/lang/String;

    iput-object p0, v0, Lsz/w;->w:Lsz/z;

    iput-object p1, v0, Lsz/w;->x:Lsz/t;

    iput v4, v0, Lsz/w;->E:I

    invoke-virtual {v6, p2, v5, v2, v0}, Lb10/z0;->Q(Ljava/lang/String;Lyy/f;Ljava/util/List;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v0, p0

    :goto_1
    instance-of v1, p2, Ll83/m;

    if-nez v1, :cond_8

    check-cast p2, Ly00/l3;

    iget-object v1, p2, Ly00/l3;->K:Ljava/lang/String;

    if-nez v1, :cond_5

    const-string v1, ""

    :cond_5
    move-object v2, p1

    check-cast v2, Lsz/u;

    iget-object v2, v2, Lsz/u;->y:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, p2, v1, v3, v2}, Lsz/z;->l(Ly00/c8;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lux/p;

    move-result-object p2

    goto :goto_4

    :cond_6
    instance-of p2, p1, Lsz/v;

    if-eqz p2, :cond_c

    move-object p2, p1

    check-cast p2, Lsz/v;

    iget-object p2, p2, Lsz/v;->w:Ljava/lang/String;

    iput-object p0, v0, Lsz/w;->w:Lsz/z;

    iput-object p1, v0, Lsz/w;->x:Lsz/t;

    iput v3, v0, Lsz/w;->E:I

    invoke-virtual {v6, p2, v5, v2, v0}, Lb10/z0;->R(Ljava/lang/String;Lyy/f;Ljava/util/List;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    :goto_2
    return-object v1

    :cond_7
    move-object v0, p0

    :goto_3
    instance-of v1, p2, Ll83/m;

    if-nez v1, :cond_8

    check-cast p2, Ly00/g6;

    move-object v1, p1

    check-cast v1, Lsz/v;

    iget-object v2, v1, Lsz/v;->y:Ljava/lang/String;

    iget-object v3, v1, Lsz/v;->z:Ljava/lang/Long;

    iget-object v1, v1, Lsz/v;->E:Ljava/lang/String;

    invoke-virtual {v0, p2, v2, v3, v1}, Lsz/z;->l(Ly00/c8;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lux/p;

    move-result-object p2

    :cond_8
    :goto_4
    instance-of v1, p2, Ll83/m;

    if-nez v1, :cond_b

    move-object v6, p2

    check-cast v6, Lux/p;

    iget-object v5, v0, Lsz/z;->F:Lux/q;

    new-instance v7, Lux/k;

    invoke-virtual {p1}, Lsz/t;->b()Lsz/k;

    move-result-object p2

    iget-object p2, p2, Lsz/k;->y:Ljava/lang/String;

    new-instance v0, Lux/m;

    sget-object v1, Lux/l;->x:Lux/l;

    invoke-direct {v0, v1}, Lux/m;-><init>(Lux/l;)V

    invoke-direct {v7, p2, v0}, Lux/k;-><init>(Ljava/lang/String;Lux/m;)V

    new-instance v8, Lux/j;

    invoke-virtual {p1}, Lsz/t;->b()Lsz/k;

    move-result-object p2

    iget-object p2, p2, Lsz/k;->E:Lsz/j;

    iget-boolean p2, p2, Lsz/j;->w:Z

    invoke-virtual {p1}, Lsz/t;->b()Lsz/k;

    move-result-object v0

    iget-object v0, v0, Lsz/k;->E:Lsz/j;

    iget-object v0, v0, Lsz/j;->x:Lsz/i;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_a

    if-ne v0, v4, :cond_9

    sget-object v0, Lux/i;->y:Lux/i;

    goto :goto_5

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_a
    sget-object v0, Lux/i;->x:Lux/i;

    :goto_5
    invoke-virtual {p1}, Lsz/t;->b()Lsz/k;

    move-result-object v1

    iget-object v1, v1, Lsz/k;->E:Lsz/j;

    iget-boolean v1, v1, Lsz/j;->y:Z

    invoke-direct {v8, p2, v0, v1}, Lux/j;-><init>(ZLux/i;Z)V

    invoke-virtual {p1}, Lsz/t;->b()Lsz/k;

    move-result-object p2

    iget-boolean v9, p2, Lsz/k;->z:Z

    invoke-virtual {p1}, Lsz/t;->b()Lsz/k;

    move-result-object p1

    iget-boolean p1, p1, Lsz/k;->G:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    invoke-static/range {v5 .. v10}, Lux/q;->c(Lux/q;Lux/p;Lux/k;Lux/j;ZLjava/lang/Boolean;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_b
    return-object p2

    :cond_c
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final l(Ly00/c8;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lux/p;
    .locals 11

    const-string v0, "stripeIntent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currencyCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ly00/l3;

    iget-object v1, p0, Lsz/z;->y:Lsz/t;

    if-eqz v0, :cond_0

    new-instance v2, Lux/p;

    sget-object v4, Lux/o;->z:Lux/o;

    invoke-virtual {v1}, Lsz/t;->b()Lsz/k;

    move-result-object p3

    iget-object v5, p3, Lsz/k;->x:Ljava/lang/String;

    check-cast p1, Ly00/l3;

    iget-object v6, p1, Ly00/l3;->w:Ljava/lang/String;

    iget-object v7, p1, Ly00/l3;->y:Ljava/lang/Long;

    const/4 v8, 0x0

    sget-object v9, Lux/n;->y:Lux/n;

    move-object v3, p2

    invoke-direct/range {v2 .. v9}, Lux/p;-><init>(Ljava/lang/String;Lux/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lux/n;)V

    return-object v2

    :cond_0
    move-object v3, p2

    instance-of p2, p1, Ly00/g6;

    if-eqz p2, :cond_2

    move-object v4, v3

    new-instance v3, Lux/p;

    sget-object v5, Lux/o;->y:Lux/o;

    invoke-virtual {v1}, Lsz/t;->b()Lsz/k;

    move-result-object p2

    iget-object v6, p2, Lsz/k;->x:Ljava/lang/String;

    check-cast p1, Ly00/g6;

    iget-object v7, p1, Ly00/g6;->w:Ljava/lang/String;

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    goto :goto_0

    :cond_1
    const-wide/16 p1, 0x0

    :goto_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    sget-object v10, Lux/n;->x:Lux/n;

    move-object v9, p4

    invoke-direct/range {v3 .. v10}, Lux/p;-><init>(Ljava/lang/String;Lux/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lux/n;)V

    return-object v3

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final n(ILandroid/content/Intent;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p3, Lsz/x;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lsz/x;

    iget v1, v0, Lsz/x;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lsz/x;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lsz/x;

    invoke-direct {v0, p0, p3}, Lsz/x;-><init>(Lsz/z;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lsz/x;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lsz/x;->y:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_3

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Lsz/z;->E:Lux/s0;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v2, 0xc350

    if-ne p1, v2, :cond_4

    if-eqz p2, :cond_4

    iput v4, v0, Lsz/x;->y:I

    invoke-virtual {p3, p2, v0}, Lux/s0;->c(Landroid/content/Intent;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_2

    :cond_4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v2, 0xc351

    if-ne p1, v2, :cond_5

    if-eqz p2, :cond_5

    iput v3, v0, Lsz/x;->y:I

    invoke-virtual {p3, p2, v0}, Lux/s0;->d(Landroid/content/Intent;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_5
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string p3, "Unexpected confirmation result."

    invoke-direct {p2, p3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object p3, Lb20/e;->G:Lb20/e;

    sget v0, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {p2}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ll83/k;

    const-string v2, "request_code"

    invoke-direct {v1, v2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p1

    iget-object v1, p0, Lsz/z;->I:Lb20/f;

    invoke-virtual {v1, p3, v0, p1}, Lb20/f;->a(Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;)V

    invoke-static {p2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :cond_6
    :goto_3
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_7

    check-cast p1, Lux/m0;

    sget-object p1, Lsz/m;->w:Lsz/m;

    return-object p1

    :cond_7
    new-instance p1, Lsz/n;

    invoke-direct {p1, p2}, Lsz/n;-><init>(Ljava/lang/Throwable;)V

    return-object p1
.end method
