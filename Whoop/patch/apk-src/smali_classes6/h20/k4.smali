.class public final Lh20/k4;
.super Le30/c;
.source "SourceFile"


# instance fields
.field public final c0:Lh20/w3;

.field public final d0:La30/a0;

.field public final e0:Lqy/d;

.field public final f0:Lb20/f;

.field public final g0:Ll20/a;

.field public final h0:Lw20/a0;

.field public final i0:Lec3/w1;

.field public final j0:Lec3/w1;

.field public final k0:Lec3/h2;

.field public l0:Lh20/f4;

.field public final m0:Ln53/e;

.field public n0:Lh20/d0;

.field public final o0:Ln53/e;

.field public final p0:Ln53/e;

.field public final q0:Ln53/e;

.field public final r0:Ln53/e;

.field public final s0:Le10/r0;

.field public final t0:Ln53/e;


# direct methods
.method public constructor <init>(Lh20/w3;Lk20/a;La30/a0;Lz20/g;Lqy/d;Lq83/j;Landroidx/lifecycle/k1;Lh20/x;Le10/n0;Lzx/o;Lb20/f;Ll20/a;Lw20/a0;Lny/d;Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;)V
    .locals 21

    move-object/from16 v11, p1

    move-object/from16 v2, p2

    move-object/from16 v12, p3

    move-object/from16 v13, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    move-object/from16 v14, p9

    move-object/from16 v15, p11

    move-object/from16 v0, p12

    move-object/from16 v1, p13

    const-string v3, "args"

    invoke-static {v11, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "eventReporter"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "paymentElementLoader"

    invoke-static {v12, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "customerRepository"

    move-object/from16 v7, p4

    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "logger"

    invoke-static {v13, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "workContext"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "savedStateHandle"

    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "linkHandler"

    invoke-static {v6, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "confirmationHandlerFactory"

    invoke-static {v14, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "cardAccountRangeRepositoryFactory"

    move-object/from16 v8, p10

    invoke-static {v8, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "errorReporter"

    invoke-static {v15, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "cvcRecollectionHandler"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "cvcRecollectionInteractorFactory"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "tapToAddCollectionHandler"

    move-object/from16 v9, p14

    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "mode"

    move-object/from16 v10, p15

    invoke-static {v10, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v11, Lh20/w3;->x:Lh20/x1;

    const/4 v8, 0x1

    move-object v14, v0

    move-object v3, v7

    move-object/from16 v0, p0

    move-object/from16 v7, p10

    invoke-direct/range {v0 .. v10}, Le30/c;-><init>(Lh20/x1;Lk20/a;Lz20/g;Lq83/j;Landroidx/lifecycle/k1;Lh20/x;Lzx/o;ZLny/d;Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;)V

    move-object v8, v2

    move-object v10, v5

    iput-object v11, v0, Lh20/k4;->c0:Lh20/w3;

    iput-object v12, v0, Lh20/k4;->d0:La30/a0;

    iput-object v13, v0, Lh20/k4;->e0:Lqy/d;

    iput-object v15, v0, Lh20/k4;->f0:Lb20/f;

    iput-object v14, v0, Lh20/k4;->g0:Ll20/a;

    move-object/from16 v1, p13

    iput-object v1, v0, Lh20/k4;->h0:Lw20/a0;

    new-instance v11, La33/d;

    iget-object v12, v0, Le30/c;->w:Lh20/x1;

    iget-object v1, v0, Le30/c;->M:Lr20/d;

    iget-object v13, v1, Lr20/d;->g:Ln53/e;

    iget-object v14, v0, Le30/c;->b0:Ln53/e;

    iget-object v15, v0, Le30/c;->L:Lec3/h2;

    iget-object v1, v0, Le30/c;->P:Lec3/r1;

    iget-object v2, v0, Le30/c;->S:Lec3/h2;

    iget-object v3, v0, Le30/c;->X:Lec3/h2;

    new-instance v4, Lf1/w1;

    const/16 v5, 0x15

    invoke-direct {v4, v5, v0, v8}, Lf1/w1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v20, Lb30/i0;

    const/4 v6, 0x0

    const/16 v7, 0xa

    move-object/from16 v16, v1

    const/4 v1, 0x0

    move-object/from16 v18, v3

    const-class v3, Lh20/k4;

    move-object/from16 v19, v4

    const-string v4, "onDisabledClick"

    const-string v5, "onDisabledClick()V"

    move-object/from16 v9, p8

    move-object/from16 v17, v2

    move-object v2, v0

    move-object/from16 v0, v20

    invoke-direct/range {v0 .. v7}, Lb30/i0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    move-object v0, v2

    invoke-direct/range {v11 .. v20}, La33/d;-><init>(Lh20/x1;Ln53/e;Ln53/e;Lec3/f2;Lec3/r1;Lec3/h2;Lec3/h2;Lc93/a;Lc93/a;)V

    const/4 v1, 0x6

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v2, v3, v4, v1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v1

    iput-object v1, v0, Lh20/k4;->i0:Lec3/w1;

    iput-object v1, v0, Lh20/k4;->j0:Lec3/w1;

    invoke-static {v4}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, v0, Lh20/k4;->k0:Lec3/h2;

    sget-object v2, Lh20/f4;->x:Lh20/f4;

    iput-object v2, v0, Lh20/k4;->l0:Lh20/f4;

    new-instance v2, Lh20/d4;

    invoke-direct {v2, v0, v3}, Lh20/d4;-><init>(Lh20/k4;I)V

    invoke-static {v1, v2}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v2

    iput-object v2, v0, Lh20/k4;->m0:Ln53/e;

    new-instance v3, Ld30/k;

    const/4 v5, 0x1

    invoke-direct {v3, v11, v5}, Ld30/k;-><init>(Ljava/lang/Object;I)V

    move-object/from16 v19, v3

    invoke-static/range {v13 .. v19}, Lbi/g;->s(Lec3/f2;Lec3/f2;Lec3/f2;Lec3/f2;Lec3/f2;Lec3/f2;Lc93/p;)Ln53/e;

    move-result-object v3

    new-instance v5, Ldo0/c;

    const/16 v6, 0x14

    invoke-direct {v5, v6}, Ldo0/c;-><init>(I)V

    invoke-static {v3, v5}, Lbi/g;->y(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v3

    iput-object v3, v0, Lh20/k4;->o0:Ln53/e;

    new-instance v3, Lh00/l0;

    const/4 v5, 0x7

    invoke-direct {v3, v5}, Lh00/l0;-><init>(I)V

    invoke-static {v2, v3}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v2

    iput-object v2, v0, Lh20/k4;->p0:Ln53/e;

    iget-object v2, v9, Lh20/x;->c:Lec3/h2;

    iget-object v3, v9, Lh20/x;->a:Lwz/l1;

    iget-object v3, v3, Lwz/l1;->c:Ln53/e;

    iget-object v5, v0, Le30/c;->b0:Ln53/e;

    iget-object v6, v0, Le30/c;->L:Lec3/h2;

    new-instance v7, Las1/j;

    const/4 v9, 0x6

    invoke-direct {v7, v0, v9}, Las1/j;-><init>(Ljava/lang/Object;I)V

    invoke-static {v2, v3, v5, v6, v7}, Lbi/g;->q(Lec3/f2;Lec3/f2;Lec3/f2;Lec3/f2;Lc93/n;)Ln53/e;

    move-result-object v2

    iput-object v2, v0, Lh20/k4;->q0:Ln53/e;

    new-instance v2, Lh20/d4;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3}, Lh20/d4;-><init>(Lh20/k4;I)V

    invoke-static {v1, v2}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v1

    iput-object v1, v0, Lh20/k4;->r0:Ln53/e;

    invoke-static {v0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v1

    move-object/from16 v14, p9

    invoke-virtual {v14, v1}, Le10/n0;->a(Lbc3/c0;)Le10/r0;

    move-result-object v1

    iput-object v1, v0, Lh20/k4;->s0:Le10/r0;

    iget-object v1, v1, Le10/r0;->k:Lec3/r1;

    new-instance v2, Lh00/l0;

    const/16 v3, 0x8

    invoke-direct {v2, v3}, Lh00/l0;-><init>(I)V

    invoke-static {v1, v2}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v1

    iput-object v1, v0, Lh20/k4;->t0:Ln53/e;

    invoke-static {v0, v10}, Lrv/n;->c(Landroidx/lifecycle/w1;Landroidx/lifecycle/k1;)Lvv1/c;

    new-instance v1, Lk20/o;

    iget-object v2, v8, Lk20/a;->a:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    invoke-direct {v1, v2}, Lk20/o;-><init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;)V

    invoke-virtual {v8, v1, v4}, Lk20/a;->h(Lk20/t;Lv00/c0;)V

    invoke-static {v0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v1

    new-instance v2, Lh20/e4;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v4, v3}, Lh20/e4;-><init>(Lh20/k4;Lq83/d;I)V

    const/4 v3, 0x2

    move-object/from16 v9, p6

    invoke-static {v1, v9, v4, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static final A(Lh20/k4;Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p1, Lh20/j4;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lh20/j4;

    iget v1, v0, Lh20/j4;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh20/j4;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh20/j4;

    invoke-direct {v0, p0, p1}, Lh20/j4;-><init>(Lh20/k4;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lh20/j4;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh20/j4;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, Lh20/j4;->w:Lh20/k4;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Le30/c;->y:Lq83/j;

    new-instance v2, Lh20/e4;

    const/4 v6, 0x2

    invoke-direct {v2, p0, v3, v6}, Lh20/e4;-><init>(Lh20/k4;Lq83/d;I)V

    iput-object p0, v0, Lh20/j4;->w:Lh20/k4;

    iput v5, v0, Lh20/j4;->z:I

    invoke-static {p1, v2, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_5

    check-cast p1, La30/v0;

    new-instance v2, La30/f1;

    invoke-direct {v2, p1}, La30/f1;-><init>(La30/v0;)V

    iput-object v3, v0, Lh20/j4;->w:Lh20/k4;

    iput v4, v0, Lh20/j4;->z:I

    invoke-virtual {p0, v2, v0}, Lh20/k4;->E(La30/f1;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_6

    :goto_2
    return-object v1

    :cond_5
    iget-object p1, p0, Le30/c;->K:Lec3/h2;

    invoke-virtual {p1, v3}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object p1, p0, Lh20/k4;->e0:Lqy/d;

    const-string v0, "Payment Sheet error"

    invoke-virtual {p1, v0, v2}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p0, p0, Lh20/k4;->i0:Lec3/w1;

    new-instance p1, Lh20/a4;

    invoke-direct {p1, v2}, Lh20/a4;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p0, p1}, Lec3/w1;->a(Ljava/lang/Object;)Z

    :cond_6
    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final B(Lh20/k4;Le10/x;)V
    .locals 6

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Le30/c;->z:Landroidx/lifecycle/k1;

    instance-of v1, p1, Le10/w;

    const-string v2, "IN_PROGRESS_PAYMENT_SELECTION"

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    check-cast p1, Le10/w;

    iget-object v1, p1, Le10/w;->b:Ln10/c0;

    iget-object p1, p1, Le10/w;->a:Ly00/c8;

    invoke-interface {p1}, Ly00/c8;->getId()Ljava/lang/String;

    move-result-object p1

    const/4 v4, 0x0

    invoke-virtual {p0, v1, v4, p1}, Lh20/k4;->D(Ln10/c0;ZLjava/lang/String;)V

    goto/16 :goto_2

    :cond_0
    instance-of v1, p1, Le10/v;

    if-eqz v1, :cond_7

    check-cast p1, Le10/v;

    iget-object v1, p1, Le10/v;->c:Le10/u;

    iget-object v4, p1, Le10/v;->b:Lzy/c;

    sget-object v5, Le10/t;->a:Le10/t;

    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    sget-object v5, Le10/o;->a:Le10/o;

    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    instance-of v5, v1, Le10/q;

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    sget-object v5, Le10/p;->a:Le10/p;

    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    iget-object p1, p1, Le10/v;->a:Ljava/lang/Throwable;

    iget-object v1, p0, Lh20/k4;->e0:Lqy/d;

    const-string v4, "Payment Sheet error"

    invoke-virtual {v1, v4, p1}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p0, p0, Lh20/k4;->i0:Lec3/w1;

    new-instance v1, Lh20/a4;

    invoke-direct {v1, p1}, Lh20/a4;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p0, v1}, Lec3/w1;->a(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    sget-object p1, Le10/s;->a:Le10/s;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    sget-object p1, Le10/r;->a:Le10/r;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_4
    :goto_0
    invoke-virtual {p0, v4}, Lh20/k4;->H(Lzy/c;)V

    goto :goto_2

    :cond_5
    :goto_1
    invoke-static {p1}, Lds/q;->I(Le10/v;)Lk20/h;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {v0, v2}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq20/y;

    if-eqz v1, :cond_6

    iget-object v5, p0, Le30/c;->x:Lk20/a;

    invoke-virtual {v5, v1, p1}, Lk20/a;->m(Lq20/y;Lk20/h;)V

    :cond_6
    invoke-virtual {p0, v4}, Lh20/k4;->H(Lzy/c;)V

    goto :goto_2

    :cond_7
    instance-of p1, p1, Le10/n;

    if-eqz p1, :cond_9

    invoke-virtual {p0, v3}, Lh20/k4;->H(Lzy/c;)V

    :cond_8
    :goto_2
    invoke-virtual {v0, v3, v2}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :cond_9
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method


# virtual methods
.method public final C(Lq20/y;Lh20/f4;)V
    .locals 3

    iput-object p2, p0, Lh20/k4;->l0:Lh20/f4;

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p2

    new-instance v0, Lb2/y;

    const/16 v1, 0xc

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2, v1}, Lb2/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x2

    iget-object v1, p0, Le30/c;->y:Lq83/j;

    invoke-static {p2, v1, v2, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final D(Ln10/c0;ZLjava/lang/String;)V
    .locals 4

    iget-object v0, p0, Le30/c;->z:Landroidx/lifecycle/k1;

    const-string v1, "IN_PROGRESS_PAYMENT_SELECTION"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq20/y;

    if-eqz v2, :cond_0

    iget-object v3, p0, Le30/c;->x:Lk20/a;

    invoke-virtual {v3, v2, p1, p3}, Lk20/a;->p(Lq20/y;Ln10/c0;Ljava/lang/String;)V

    :cond_0
    if-eqz v2, :cond_1

    invoke-static {v2}, Lug/m;->G(Lq20/y;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Le30/c;->E:Lh20/x;

    invoke-virtual {p1}, Lh20/x;->b()V

    :cond_1
    const/4 p1, 0x0

    invoke-virtual {v0, p1, v1}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_2

    new-instance p1, Lh20/z3;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Lh20/z3;-><init>(Z)V

    iget-object p2, p0, Lh20/k4;->i0:Lec3/w1;

    invoke-virtual {p2, p1}, Lec3/w1;->a(Ljava/lang/Object;)Z

    return-void

    :cond_2
    new-instance p2, Lq20/a0;

    new-instance p3, Lh02/n0;

    const/4 v0, 0x3

    invoke-direct {p3, p0, v0}, Lh02/n0;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p2, p3}, Lq20/a0;-><init>(Lh02/n0;)V

    iget-object p3, p0, Lh20/k4;->k0:Lec3/h2;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3, p1, p2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final E(La30/f1;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lh20/h4;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh20/h4;

    iget v1, v0, Lh20/h4;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh20/h4;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh20/h4;

    invoke-direct {v0, p0, p2}, Lh20/h4;-><init>(Lh20/k4;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lh20/h4;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh20/h4;->E:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lh20/h4;->x:La30/f1;

    iget-object v0, v0, Lh20/h4;->w:Lh20/k4;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lh20/h4;->x:La30/f1;

    iget-object v2, v0, Lh20/h4;->w:Lh20/k4;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Lh20/h4;->w:Lh20/k4;

    iput-object p1, v0, Lh20/h4;->x:La30/f1;

    iput v4, v0, Lh20/h4;->E:I

    iget-object p2, p0, Lh20/k4;->s0:Le10/r0;

    invoke-virtual {p2, v0}, Le10/r0;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v2, p0

    :goto_1
    check-cast p2, Le10/x;

    instance-of v5, p2, Le10/w;

    if-eqz v5, :cond_5

    check-cast p2, Le10/w;

    iget-object p1, p2, Le10/w;->b:Ln10/c0;

    iget-object p2, p2, Le10/w;->a:Ly00/c8;

    invoke-interface {p2}, Ly00/c8;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p1, v4, p2}, Lh20/k4;->D(Ln10/c0;ZLjava/lang/String;)V

    goto :goto_4

    :cond_5
    iget-object p2, p1, La30/f1;->z:La30/e1;

    if-eqz p2, :cond_6

    const/4 p1, 0x0

    iget-object v0, v2, Le30/c;->K:Lec3/h2;

    invoke-virtual {v0, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object p1, v2, Lh20/k4;->e0:Lqy/d;

    const-string v0, "Payment Sheet error"

    invoke-virtual {p1, v0, p2}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p1, v2, Lh20/k4;->i0:Lec3/w1;

    new-instance v0, Lh20/a4;

    invoke-direct {v0, p2}, Lh20/a4;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p1, v0}, Lec3/w1;->a(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_6
    iput-object v2, v0, Lh20/h4;->w:Lh20/k4;

    iput-object p1, v0, Lh20/h4;->x:La30/f1;

    iput v3, v0, Lh20/h4;->E:I

    invoke-virtual {v2, p1, v0}, Lh20/k4;->G(La30/f1;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    :goto_2
    return-object v1

    :cond_7
    move-object v0, v2

    :goto_3
    iget-object p2, v0, Lh20/k4;->s0:Le10/r0;

    iget-object p1, p1, La30/f1;->E:Lv00/c0;

    invoke-virtual {p2, p1}, Le10/r0;->c(Lv00/c0;)V

    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final F(Lv00/c0;Lzy/c;)V
    .locals 3

    iget-object v0, p0, Le30/c;->M:Lr20/d;

    iget-object v1, v0, Lr20/d;->g:Ln53/e;

    iget-object v1, v1, Ln53/e;->y:Ll83/e;

    check-cast v1, Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr20/s;

    sget-object v2, Lr20/j;->w:Lr20/j;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p2}, Lh20/k4;->H(Lzy/c;)V

    invoke-virtual {p0}, Le30/c;->o()Lh20/x2;

    move-result-object p2

    sget-object v1, Lh20/x2;->w:Lh20/x2;

    iget-object v2, p0, Le30/c;->Z:Lh20/f;

    if-eq p2, v1, :cond_1

    invoke-static {p0, p1, v2}, Lse/h;->y(Le30/c;Lv00/c0;Lh20/f;)Ljava/util/List;

    move-result-object p1

    goto :goto_3

    :cond_1
    iget-object p2, v2, Lh20/f;->c:Ln53/e;

    iget-object p2, p2, Ln53/e;->y:Ll83/e;

    check-cast p2, Lc93/a;

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_4

    iget-object p2, p0, Le30/c;->a0:Lh20/z4;

    invoke-static {p0, p1, v2, p2}, Lv8/b;->m(Le30/c;Lv00/c0;Lh20/f;Lh20/z4;)Lb30/q0;

    move-result-object p1

    new-instance p2, Lr20/o;

    iget-object v1, p0, Le30/c;->L:Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv00/c0;

    if-eqz v1, :cond_2

    iget-object v1, v1, Lv00/c0;->w:Ly00/c8;

    iget-object v2, p0, Lh20/k4;->g0:Ll20/a;

    invoke-virtual {v2, v1}, Ll20/a;->a(Ly00/c8;)Z

    move-result v1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_3

    new-instance v1, Lr20/m;

    iget-object v2, p0, Le30/c;->V:Lec3/h2;

    invoke-direct {v1, v2}, Lr20/m;-><init>(Lec3/h2;)V

    goto :goto_1

    :cond_3
    sget-object v1, Lr20/l;->a:Lr20/l;

    :goto_1
    invoke-direct {p2, p1, v1}, Lr20/o;-><init>(Lb30/q0;Lr20/n;)V

    goto :goto_2

    :cond_4
    invoke-static {p0, p1}, Lug/m;->r(Le30/c;Lv00/c0;)Lb30/j0;

    move-result-object p1

    new-instance p2, Lr20/g;

    invoke-direct {p2, p1}, Lr20/g;-><init>(Lb30/j0;)V

    :goto_2
    invoke-static {p2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    :goto_3
    invoke-virtual {v0, p1}, Lr20/d;->d(Ljava/util/List;)V

    return-void
.end method

.method public final G(La30/f1;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lh20/i4;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh20/i4;

    iget v1, v0, Lh20/i4;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh20/i4;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh20/i4;

    invoke-direct {v0, p0, p2}, Lh20/i4;-><init>(Lh20/k4;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lh20/i4;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh20/i4;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lh20/i4;->w:Lh20/k4;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p2, Lbc3/q0;->a:Lkc3/e;

    sget-object p2, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {p2}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object p2

    new-instance v2, Landroidx/room/y0;

    invoke-direct {v2, p0, p1, v3}, Landroidx/room/y0;-><init>(Lh20/k4;La30/f1;Lq83/d;)V

    iput-object p0, v0, Lh20/i4;->w:Lh20/k4;

    iput v4, v0, Lh20/i4;->z:I

    invoke-static {p2, v2, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    :goto_1
    invoke-static {p1}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p2

    new-instance v0, Lh20/e4;

    invoke-direct {v0, p1, v3, v4}, Lh20/e4;-><init>(Lh20/k4;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {p2, v3, v3, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final H(Lzy/c;)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    new-instance v1, Lq20/d0;

    invoke-direct {v1, p1}, Lq20/d0;-><init>(Lzy/c;)V

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    new-instance p1, Lq20/b0;

    invoke-direct {p1, v1}, Lq20/b0;-><init>(Lq20/d0;)V

    iget-object v1, p0, Lh20/k4;->k0:Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v0, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    const-string p1, "processing"

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iget-object v1, p0, Le30/c;->z:Landroidx/lifecycle/k1;

    invoke-virtual {v1, v0, p1}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final g()V
    .locals 3

    iget-object v0, p0, Lh20/k4;->k0:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Lq20/b0;

    if-eqz v1, :cond_0

    new-instance v1, Lq20/b0;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lq20/b0;-><init>(Lq20/d0;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v2, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final j()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lh20/k4;->p0:Ln53/e;

    return-object v0
.end method

.method public final n()Lh20/d0;
    .locals 1

    iget-object v0, p0, Lh20/k4;->n0:Lh20/d0;

    return-object v0
.end method

.method public final p()Ln53/e;
    .locals 1

    iget-object v0, p0, Lh20/k4;->o0:Ln53/e;

    return-object v0
.end method

.method public final q()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lh20/k4;->r0:Ln53/e;

    return-object v0
.end method

.method public final r()Lec3/f2;
    .locals 1

    iget-object v0, p0, Lh20/k4;->q0:Ln53/e;

    return-object v0
.end method

.method public final u(Lq20/y;)V
    .locals 1

    iget-object v0, p0, Le30/c;->P:Lec3/r1;

    iget-object v0, v0, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Le30/c;->z(Lq20/y;)V

    if-eqz p1, :cond_0

    iget-object v0, p0, Le30/c;->x:Lk20/a;

    invoke-virtual {v0, p1}, Lk20/a;->s(Lq20/y;)V

    :cond_0
    return-void
.end method

.method public final v(Lzy/c;)V
    .locals 0

    invoke-virtual {p0, p1}, Lh20/k4;->H(Lzy/c;)V

    return-void
.end method

.method public final w()V
    .locals 3

    iget-object v0, p0, Le30/c;->x:Lk20/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lk20/k;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lk20/k;-><init>(I)V

    invoke-static {v0, v1}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    new-instance v0, Lh20/y3;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lh20/y3;-><init>(Z)V

    iget-object v1, p0, Lh20/k4;->i0:Lec3/w1;

    invoke-virtual {v1, v0}, Lec3/w1;->a(Ljava/lang/Object;)Z

    return-void
.end method

.method public final y(Lh20/d0;)V
    .locals 0

    iput-object p1, p0, Lh20/k4;->n0:Lh20/d0;

    return-void
.end method
