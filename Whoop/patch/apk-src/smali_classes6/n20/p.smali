.class public final Ln20/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La30/a0;

.field public final b:Lq83/j;

.field public final c:Ln20/u;

.field public final d:Lg73/a;

.field public final e:Ln20/k;

.field public final f:Ljava/util/concurrent/atomic/AtomicReference;

.field public g:Z


# direct methods
.method public constructor <init>(La30/a0;Lq83/j;Ln20/u;Lg73/a;Ln20/k;)V
    .locals 1

    const-string v0, "paymentElementLoader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentSelectionUpdater"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationHandler"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln20/p;->a:La30/a0;

    iput-object p2, p0, Ln20/p;->b:Lq83/j;

    iput-object p3, p0, Ln20/p;->c:Ln20/u;

    iput-object p4, p0, Ln20/p;->d:Lg73/a;

    iput-object p5, p0, Ln20/p;->e:Ln20/k;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Ln20/p;->f:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static final a(Ln20/p;La30/q0;Lh20/x1;ZLjo2/d;Ls83/c;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Ln20/p;->c:Ln20/u;

    instance-of v1, p5, Ln20/n;

    if-eqz v1, :cond_0

    move-object v1, p5

    check-cast v1, Ln20/n;

    iget v2, v1, Ln20/n;->G:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Ln20/n;->G:I

    goto :goto_0

    :cond_0
    new-instance v1, Ln20/n;

    invoke-direct {v1, p0, p5}, Ln20/n;-><init>(Ln20/p;Ls83/c;)V

    :goto_0
    iget-object p5, v1, Ln20/n;->E:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Ln20/n;->G:I

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    const/4 v5, 0x0

    packed-switch v3, :pswitch_data_0

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_0
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v4

    :pswitch_1
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v4

    :pswitch_2
    iget-object p0, v1, Ln20/n;->x:Ljava/lang/Object;

    check-cast p0, Ljo2/d;

    iget-object p1, v1, Ln20/n;->w:Ln20/p;

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_3
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v4

    :pswitch_4
    iget-object p0, v1, Ln20/n;->z:Ln20/m;

    iget-object p4, v1, Ln20/n;->y:Ljo2/d;

    iget-object p1, v1, Ln20/n;->x:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lh20/x1;

    iget-object p1, v1, Ln20/n;->w:Ln20/p;

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p5, Ll83/n;

    iget-object p3, p5, Ll83/n;->w:Ljava/lang/Object;

    move-object p5, p0

    move-object p0, p1

    goto :goto_1

    :pswitch_5
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v4

    :pswitch_6
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p5, p2, Lh20/x1;->H:Lh20/h1;

    invoke-static {p5}, Luf/c0;->f0(Lh20/h1;)V

    new-instance p5, Ln20/m;

    invoke-direct {p5, p1, p2}, Ln20/m;-><init>(La30/t0;Lh20/x1;)V

    iget-object v3, v0, Ln20/u;->F:Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln20/m;

    invoke-static {v3, p5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 p1, 0x1

    iput p1, v1, Ln20/n;->G:I

    invoke-static {p0, p4, v5, v1}, Ln20/p;->b(Ln20/p;Ljo2/d;Ljava/lang/Throwable;Ln20/n;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v2, :cond_6

    goto/16 :goto_3

    :cond_1
    iget-object v0, v0, Ln20/u;->I:Lvv1/c;

    invoke-virtual {v0}, Lvv1/c;->invoke()Ljava/lang/Object;

    iget-object v0, p0, Ln20/p;->a:La30/a0;

    new-instance v3, La30/n0;

    invoke-direct {v3, p2}, La30/n0;-><init>(Lh20/x1;)V

    new-instance v6, La30/u0;

    const/4 v7, 0x0

    invoke-direct {v6, v7, p3}, La30/u0;-><init>(ZZ)V

    iput-object p0, v1, Ln20/n;->w:Ln20/p;

    iput-object p2, v1, Ln20/n;->x:Ljava/lang/Object;

    iput-object p4, v1, Ln20/n;->y:Ljo2/d;

    iput-object p5, v1, Ln20/n;->z:Ln20/m;

    const/4 p3, 0x2

    iput p3, v1, Ln20/n;->G:I

    invoke-virtual {v0, p1, v3, v6, v1}, La30/a0;->g(La30/t0;La30/n0;La30/u0;Ls83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v2, :cond_2

    goto :goto_3

    :cond_2
    :goto_1
    invoke-static {p3}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_5

    check-cast p3, La30/v0;

    iget-object p1, p3, La30/v0;->z:La30/e1;

    if-eqz p1, :cond_3

    iput-object v5, v1, Ln20/n;->w:Ln20/p;

    iput-object v5, v1, Ln20/n;->x:Ljava/lang/Object;

    iput-object v5, v1, Ln20/n;->y:Ljo2/d;

    iput-object v5, v1, Ln20/n;->z:Ln20/m;

    const/4 p2, 0x3

    iput p2, v1, Ln20/n;->G:I

    invoke-static {p0, p4, p1, v1}, Ln20/p;->b(Ln20/p;Ljo2/d;Ljava/lang/Throwable;Ln20/n;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v2, :cond_6

    goto :goto_3

    :cond_3
    iget-object p1, p0, Ln20/p;->c:Ln20/u;

    iget-object p1, p1, Ln20/u;->F:Lec3/h2;

    invoke-virtual {p1, p5}, Lec3/h2;->j(Ljava/lang/Object;)V

    new-instance p1, La30/f1;

    invoke-direct {p1, p3}, La30/f1;-><init>(La30/v0;)V

    iput-object p0, v1, Ln20/n;->w:Ln20/p;

    iput-object p4, v1, Ln20/n;->x:Ljava/lang/Object;

    iput-object v5, v1, Ln20/n;->y:Ljo2/d;

    iput-object v5, v1, Ln20/n;->z:Ln20/m;

    const/4 p3, 0x4

    iput p3, v1, Ln20/n;->G:I

    invoke-virtual {p0, p1, p2, v1}, Ln20/p;->c(La30/f1;Lh20/x1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_4

    goto :goto_3

    :cond_4
    move-object p1, p0

    move-object p0, p4

    :goto_2
    iput-object v5, v1, Ln20/n;->w:Ln20/p;

    iput-object v5, v1, Ln20/n;->x:Ljava/lang/Object;

    const/4 p2, 0x5

    iput p2, v1, Ln20/n;->G:I

    invoke-static {p1, p0, v5, v1}, Ln20/p;->b(Ln20/p;Ljo2/d;Ljava/lang/Throwable;Ln20/n;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v2, :cond_6

    goto :goto_3

    :cond_5
    iput-object v5, v1, Ln20/n;->w:Ln20/p;

    iput-object v5, v1, Ln20/n;->x:Ljava/lang/Object;

    iput-object v5, v1, Ln20/n;->y:Ljo2/d;

    iput-object v5, v1, Ln20/n;->z:Ln20/m;

    const/4 p2, 0x6

    iput p2, v1, Ln20/n;->G:I

    invoke-static {p0, p4, p1, v1}, Ln20/p;->b(Ln20/p;Ljo2/d;Ljava/lang/Throwable;Ln20/n;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v2, :cond_6

    :goto_3
    return-object v2

    :cond_6
    return-object v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final b(Ln20/p;Ljo2/d;Ljava/lang/Throwable;Ln20/n;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Ln20/p;->b:Lq83/j;

    new-instance v1, Lay/u;

    const/4 v5, 0x0

    const/16 v6, 0xa

    move-object v2, p0

    move-object v4, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, v1, p3}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final c(La30/f1;Lh20/x1;Ls83/c;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p3, Ln20/o;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Ln20/o;

    iget v1, v0, Ln20/o;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ln20/o;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Ln20/o;

    invoke-direct {v0, p0, p3}, Ln20/o;-><init>(Ln20/p;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Ln20/o;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ln20/o;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Ln20/o;->x:La30/f1;

    iget-object p2, v0, Ln20/o;->w:Ln20/p;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v7, p0

    goto/16 :goto_b

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Ln20/p;->c:Ln20/u;

    iget-object v2, p0, Ln20/p;->d:Lg73/a;

    iget-object v4, p3, Ln20/u;->E:Lq20/y;

    iget-object v5, p0, Ln20/p;->c:Ln20/u;

    invoke-virtual {v5}, Ln20/u;->g()Ln20/h;

    move-result-object v5

    const/4 v10, 0x0

    if-eqz v5, :cond_3

    iget-object v5, v5, Ln20/h;->x:Lh20/x1;

    goto :goto_1

    :cond_3
    move-object v5, v10

    :goto_1
    iget-object v6, p0, Ln20/p;->c:Ln20/u;

    iget-boolean v6, v6, Ln20/u;->z:Z

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "newState"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "newConfig"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v4, :cond_4

    iget-object v4, p1, La30/f1;->y:Lq20/y;

    :cond_4
    if-eqz v4, :cond_12

    iget-object v2, p1, La30/f1;->E:Lv00/c0;

    invoke-virtual {v2}, Lv00/c0;->S()Ljava/util/List;

    move-result-object v6

    instance-of v7, v4, Lq20/t;

    const/4 v8, 0x0

    if-eqz v7, :cond_8

    move-object v7, v4

    check-cast v7, Lq20/t;

    invoke-virtual {v7}, Lq20/t;->i()Ly00/d5;

    move-result-object v9

    iget-object v9, v9, Ly00/d5;->w:Ljava/lang/String;

    const-string v11, "paymentMethodCode"

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v11, Lv00/d0;->b:Ll83/p;

    invoke-virtual {v11}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/Map;

    invoke-interface {v11, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lv00/b0;

    if-eqz v9, :cond_5

    invoke-interface {v9, v2}, Lv00/b0;->c(Lv00/c0;)Z

    move-result v2

    goto :goto_2

    :cond_5
    move v2, v8

    :goto_2
    if-eqz v2, :cond_6

    invoke-virtual {v7}, Lq20/t;->i()Ly00/d5;

    move-result-object v2

    iget-boolean v2, v2, Ly00/d5;->x:Z

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_3

    :cond_6
    move v2, v8

    :goto_3
    invoke-virtual {v7}, Lq20/t;->i()Ly00/d5;

    move-result-object v7

    iget-object v7, v7, Ly00/d5;->w:Ljava/lang/String;

    invoke-interface {v6, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    if-nez v2, :cond_7

    :goto_4
    move v2, v3

    goto/16 :goto_8

    :cond_7
    :goto_5
    move v2, v8

    goto :goto_8

    :cond_8
    instance-of v7, v4, Lq20/w;

    if-eqz v7, :cond_b

    move-object v2, v4

    check-cast v2, Lq20/w;

    iget-object v2, v2, Lq20/w;->x:Ly00/o4;

    iget-object v7, v2, Ly00/o4;->E:Ly00/f4;

    if-eqz v7, :cond_9

    iget-object v7, v7, Ly00/f4;->w:Ljava/lang/String;

    goto :goto_6

    :cond_9
    move-object v7, v10

    :goto_6
    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v6, v7}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    iget-object v6, p1, La30/f1;->x:La30/a;

    if-eqz v6, :cond_a

    iget-object v6, v6, La30/a;->w:Ljava/util/List;

    goto :goto_7

    :cond_a
    sget-object v6, Lm83/y;->w:Lm83/y;

    :goto_7
    invoke-interface {v6, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_4

    :cond_b
    instance-of v6, v4, Lq20/j;

    if-eqz v6, :cond_c

    iget-boolean v2, v2, Lv00/c0;->Q:Z

    goto :goto_8

    :cond_c
    instance-of v6, v4, Lq20/m;

    if-eqz v6, :cond_d

    iget-object v2, v2, Lv00/c0;->l0:La30/l0;

    if-eqz v2, :cond_7

    goto :goto_4

    :cond_d
    instance-of v6, v4, Lq20/i;

    if-eqz v6, :cond_e

    move-object v6, v4

    check-cast v6, Lq20/i;

    iget-object v6, v6, Lq20/i;->x:Ljava/lang/String;

    invoke-virtual {v2, v6}, Lv00/c0;->C(Ljava/lang/String;)Z

    move-result v2

    goto :goto_8

    :cond_e
    instance-of v6, v4, Lq20/g;

    if-eqz v6, :cond_f

    move-object v6, v4

    check-cast v6, Lq20/g;

    iget-object v6, v6, Lq20/g;->x:Ljava/lang/String;

    invoke-virtual {v2, v6}, Lv00/c0;->y(Ljava/lang/String;)Z

    move-result v2

    goto :goto_8

    :cond_f
    instance-of v2, v4, Lq20/x;

    if-eqz v2, :cond_13

    goto :goto_5

    :goto_8
    if-eqz v2, :cond_11

    if-eqz v5, :cond_10

    invoke-static {v5}, Lio/sentry/config/a;->m(Lh20/x1;)Lmy/a;

    move-result-object v2

    invoke-static {p2}, Lio/sentry/config/a;->m(Lh20/x1;)Lmy/a;

    move-result-object v5

    new-instance v6, Lmy/c;

    iget-object v7, v2, Lmy/a;->E:Lh20/i1;

    iget-object v9, v2, Lmy/a;->I:Lh20/l1;

    iget-object v2, v2, Lmy/a;->N:Lh20/t1;

    invoke-direct {v6, v7, v9, v2}, Lmy/c;-><init>(Lh20/i1;Lh20/l1;Lh20/t1;)V

    new-instance v2, Lmy/c;

    iget-object v7, v5, Lmy/a;->E:Lh20/i1;

    iget-object v9, v5, Lmy/a;->I:Lh20/l1;

    iget-object v5, v5, Lmy/a;->N:Lh20/t1;

    invoke-direct {v2, v7, v9, v5}, Lmy/c;-><init>(Lh20/i1;Lh20/l1;Lh20/t1;)V

    invoke-virtual {v6, v2}, Lmy/c;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    move v2, v3

    goto :goto_9

    :cond_10
    move v2, v8

    :goto_9
    if-nez v2, :cond_11

    move v8, v3

    :cond_11
    if-eqz v8, :cond_12

    goto :goto_a

    :cond_12
    move-object v4, v10

    goto :goto_a

    :cond_13
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :goto_a
    iput-object v4, p3, Ln20/u;->E:Lq20/y;

    iget-object p3, p0, Ln20/p;->b:Lq83/j;

    new-instance v6, Lay/u;

    const/16 v11, 0xb

    move-object v7, p0

    move-object v8, p1

    move-object v9, p2

    invoke-direct/range {v6 .. v11}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object v7, v0, Ln20/o;->w:Ln20/p;

    iput-object v8, v0, Ln20/o;->x:La30/f1;

    iput v3, v0, Ln20/o;->E:I

    invoke-static {p3, v6, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_14

    return-object v1

    :cond_14
    move-object p2, v7

    move-object p1, v8

    :goto_b
    iget-object p2, p2, Ln20/p;->e:Ln20/k;

    iget-object p1, p1, La30/f1;->E:Lv00/c0;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p3, "paymentMethodMetadata"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p2, Ln20/k;->b:Le10/r0;

    invoke-virtual {p2, p1}, Le10/r0;->c(Lv00/c0;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
