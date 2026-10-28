.class public final Le10/r0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:Lbc3/c0;

.field public final c:Landroidx/lifecycle/k1;

.field public final d:Lb20/f;

.field public final e:Lq83/j;

.field public final f:Lqy/d;

.field public final g:Le10/k0;

.field public final h:Le10/m0;

.field public final i:Z

.field public final j:Lec3/h2;

.field public final k:Lec3/r1;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Lbc3/c0;Landroidx/lifecycle/k1;Lb20/f;Lq83/j;Lqy/d;Le10/k0;)V
    .locals 1

    const-string v0, "savedStateHandle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ioContext"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationSaver"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le10/r0;->a:Ljava/util/ArrayList;

    iput-object p2, p0, Le10/r0;->b:Lbc3/c0;

    iput-object p3, p0, Le10/r0;->c:Landroidx/lifecycle/k1;

    iput-object p4, p0, Le10/r0;->d:Lb20/f;

    iput-object p5, p0, Le10/r0;->e:Lq83/j;

    iput-object p6, p0, Le10/r0;->f:Lqy/d;

    iput-object p7, p0, Le10/r0;->g:Le10/k0;

    const-string p1, "AwaitingConfirmationResult"

    invoke-virtual {p3, p1}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le10/m0;

    iput-object p1, p0, Le10/r0;->h:Le10/m0;

    if-eqz p1, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    iput-boolean p3, p0, Le10/r0;->i:Z

    if-eqz p1, :cond_1

    new-instance p4, Le10/z;

    iget-object p1, p1, Le10/m0;->x:Le10/l;

    invoke-direct {p4, p1}, Le10/z;-><init>(Le10/l;)V

    goto :goto_1

    :cond_1
    sget-object p4, Le10/a0;->a:Le10/a0;

    :goto_1
    invoke-static {p4}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Le10/r0;->j:Lec3/h2;

    invoke-static {p1}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Le10/r0;->k:Lec3/r1;

    if-eqz p3, :cond_2

    new-instance p1, Le10/l0;

    const/4 p3, 0x0

    invoke-direct {p1, p0, p3}, Le10/l0;-><init>(Le10/r0;Lq83/d;)V

    const/4 p4, 0x3

    invoke-static {p2, p3, p3, p1, p4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_2
    return-void
.end method

.method public static final a(Le10/r0;Le10/k;Ls83/i;)Ljava/lang/Object;
    .locals 6

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p1, Le10/k;->w:Le10/l;

    iget-object v1, p0, Le10/r0;->j:Lec3/h2;

    new-instance v2, Le10/z;

    invoke-direct {v2, v0}, Le10/z;-><init>(Le10/l;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v1, p0, Le10/r0;->a:Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Le10/i0;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v4, Le10/i0;->b:Le10/j;

    invoke-interface {v4, v0}, Le10/j;->b(Le10/l;)Le10/l;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-interface {v4, v5, p1}, Le10/j;->c(Le10/l;Le10/k;)Z

    move-result v4

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_0

    goto :goto_1

    :cond_2
    move-object v2, v3

    :goto_1
    check-cast v2, Le10/i0;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-nez v2, :cond_3

    iget-object p1, p0, Le10/r0;->d:Lb20/f;

    sget-object p2, Lb20/e;->U:Lb20/e;

    sget v2, Lcom/stripe/android/core/exception/StripeException;->E:I

    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Attempting to confirm intent for invalid confirmation option: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v2

    const/4 v4, 0x4

    invoke-static {p1, p2, v2, v3, v4}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    new-instance p1, Le10/v;

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Attempted to confirm invalid "

    const-string v3, " confirmation type"

    invoke-static {v2, v0, v3}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    const v0, 0x7f1410f2

    invoke-static {v0}, Ls4/i;->h(I)Lzy/b;

    move-result-object v0

    sget-object v2, Le10/r;->a:Le10/r;

    invoke-direct {p1, p2, v0, v2}, Le10/v;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    invoke-virtual {p0, p1}, Le10/r0;->e(Le10/x;)V

    return-object v1

    :cond_3
    invoke-virtual {p0, v0, p1, v2, p2}, Le10/r0;->d(Le10/l;Le10/k;Le10/i0;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_4

    return-object p0

    :cond_4
    return-object v1
.end method


# virtual methods
.method public final b(Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p1, Le10/o0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Le10/o0;

    iget v1, v0, Le10/o0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le10/o0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Le10/o0;

    invoke-direct {v0, p0, p1}, Le10/o0;-><init>(Le10/r0;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Le10/o0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le10/o0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Le10/r0;->j:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le10/b0;

    instance-of v4, v2, Le10/a0;

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    return-object v5

    :cond_3
    instance-of v4, v2, Le10/y;

    if-eqz v4, :cond_4

    check-cast v2, Le10/y;

    iget-object p1, v2, Le10/y;->a:Le10/x;

    return-object p1

    :cond_4
    instance-of v2, v2, Le10/z;

    if-eqz v2, :cond_7

    new-instance v2, Ld33/x;

    const/4 v4, 0x2

    const/4 v6, 0x1

    invoke-direct {v2, v4, v6, v5}, Ld33/x;-><init>(IILq83/d;)V

    iput v3, v0, Le10/o0;->y:I

    invoke-static {p1, v2, v0}, Lec3/v;->z(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_1
    if-eqz p1, :cond_6

    check-cast p1, Le10/y;

    iget-object p1, p1, Le10/y;->a:Le10/x;

    return-object p1

    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type com.stripe.android.paymentelement.confirmation.ConfirmationHandler.State.Complete"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final c(Lv00/c0;)V
    .locals 2

    const-string v0, "paymentMethodMetadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le10/r0;->a:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le10/i0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v1, Le10/i0;->b:Le10/j;

    invoke-interface {v1, p1}, Le10/j;->d(Lv00/c0;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final d(Le10/l;Le10/k;Le10/i0;Ls83/c;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p4, Le10/p0;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Le10/p0;

    iget v1, v0, Le10/p0;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le10/p0;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Le10/p0;

    invoke-direct {v0, p0, p4}, Le10/p0;-><init>(Le10/r0;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Le10/p0;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le10/p0;->F:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p3, v0, Le10/p0;->y:Le10/i0;

    iget-object p1, v0, Le10/p0;->x:Le10/l;

    iget-object p2, v0, Le10/p0;->w:Le10/r0;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v4, La1/h;

    const/4 v8, 0x0

    const/16 v9, 0x11

    move-object v6, p1

    move-object v7, p2

    move-object v5, p3

    invoke-direct/range {v4 .. v9}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p0, v0, Le10/p0;->w:Le10/r0;

    iput-object v6, v0, Le10/p0;->x:Le10/l;

    iput-object v5, v0, Le10/p0;->y:Le10/i0;

    iput v3, v0, Le10/p0;->F:I

    iget-object p1, p0, Le10/r0;->e:Lq83/j;

    invoke-static {p1, v4, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    move-object p2, p0

    move-object p3, v5

    move-object p1, v6

    :goto_1
    check-cast p4, Le10/f0;

    instance-of v0, p4, Le10/e0;

    if-eqz v0, :cond_4

    iget-object p3, p3, Le10/i0;->e:Ljava/lang/String;

    check-cast p4, Le10/e0;

    iget-boolean v0, p4, Le10/e0;->b:Z

    iget-object p2, p2, Le10/r0;->c:Landroidx/lifecycle/k1;

    new-instance v1, Le10/m0;

    invoke-direct {v1, p3, p1, v0}, Le10/m0;-><init>(Ljava/lang/String;Le10/l;Z)V

    const-string p1, "AwaitingConfirmationResult"

    invoke-virtual {p2, v1, p1}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p4, Le10/e0;->a:La00/h;

    invoke-virtual {p1}, La00/h;->invoke()Ljava/lang/Object;

    goto :goto_2

    :cond_4
    instance-of p1, p4, Le10/d0;

    if-eqz p1, :cond_5

    new-instance p1, Le10/v;

    check-cast p4, Le10/d0;

    iget-object p3, p4, Le10/d0;->a:Ljava/lang/Throwable;

    iget-object v0, p4, Le10/d0;->b:Lzy/c;

    iget-object p4, p4, Le10/d0;->c:Le10/u;

    invoke-direct {p1, p3, v0, p4}, Le10/v;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    invoke-virtual {p2, p1}, Le10/r0;->e(Le10/x;)V

    goto :goto_2

    :cond_5
    instance-of p1, p4, Le10/c0;

    if-eqz p1, :cond_6

    new-instance p1, Le10/w;

    check-cast p4, Le10/c0;

    iget-object p3, p4, Le10/c0;->a:Ly00/c8;

    iget-object v0, p4, Le10/c0;->b:Ln10/c0;

    iget-boolean p4, p4, Le10/c0;->c:Z

    invoke-direct {p1, p3, v0, p4}, Le10/w;-><init>(Ly00/c8;Ln10/c0;Z)V

    invoke-virtual {p2, p1}, Le10/r0;->e(Le10/x;)V

    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final e(Le10/x;)V
    .locals 12

    iget-object v0, p0, Le10/r0;->f:Lqy/d;

    invoke-interface {p1, v0}, Le10/x;->a(Lqy/d;)V

    new-instance v0, Le10/y;

    invoke-direct {v0, p1}, Le10/y;-><init>(Le10/x;)V

    iget-object v1, p0, Le10/r0;->j:Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    instance-of v0, p1, Le10/w;

    const-string v1, "INITIAL_CONFIRMATION_ARGUMENTS_KEY"

    iget-object v3, p0, Le10/r0;->c:Landroidx/lifecycle/k1;

    if-eqz v0, :cond_12

    invoke-virtual {v3, v1}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le10/k;

    if-eqz v0, :cond_12

    check-cast p1, Le10/w;

    iget-object p1, p1, Le10/w;->a:Ly00/c8;

    iget-object v4, v0, Le10/k;->w:Le10/l;

    iget-object v0, v0, Le10/k;->x:Lv00/c0;

    iget-boolean v0, v0, Lv00/c0;->a0:Z

    iget-object v5, p0, Le10/r0;->g:Le10/k0;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v6, "stripeIntent"

    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "confirmationOption"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v6, v4, Le10/t0;

    const/4 v7, 0x0

    const/4 v8, 0x1

    sget-object v9, Lq20/f0;->w:Lq20/f0;

    sget-object v10, Lq20/g0;->w:Lq20/g0;

    if-eqz v6, :cond_4

    check-cast v4, Le10/t0;

    invoke-interface {p1}, Ly00/c8;->Y()Ly00/o4;

    move-result-object v6

    instance-of v11, p1, Ly00/l3;

    if-eqz v11, :cond_0

    move-object v8, p1

    check-cast v8, Ly00/l3;

    iget-object v11, v4, Le10/t0;->w:Ly00/d5;

    iget-object v11, v11, Ly00/d5;->w:Ljava/lang/String;

    invoke-virtual {v8, v11}, Ly00/l3;->b(Ljava/lang/String;)Z

    move-result v8

    goto :goto_0

    :cond_0
    instance-of v11, p1, Ly00/g6;

    if-eqz v11, :cond_3

    :goto_0
    if-nez v0, :cond_2

    iget-boolean v0, v4, Le10/t0;->z:Z

    if-nez v0, :cond_2

    if-eqz v8, :cond_1

    goto :goto_1

    :cond_1
    move-object v6, v2

    :cond_2
    :goto_1
    if-eqz v6, :cond_b

    new-instance v0, Lq20/i0;

    iget-object v4, v6, Ly00/o4;->w:Ljava/lang/String;

    invoke-direct {v0, v4, v7}, Lq20/i0;-><init>(Ljava/lang/String;Z)V

    goto :goto_6

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    instance-of v0, v4, Le10/u0;

    if-eqz v0, :cond_9

    check-cast v4, Le10/u0;

    iget-object v0, v4, Le10/u0;->w:Ly00/o4;

    iget-object v4, v0, Ly00/o4;->H:Ly00/z3;

    if-eqz v4, :cond_5

    iget-object v4, v4, Ly00/z3;->J:La10/j;

    if-eqz v4, :cond_5

    iget-object v4, v4, La10/j;->w:La10/h;

    goto :goto_2

    :cond_5
    move-object v4, v2

    :goto_2
    if-nez v4, :cond_6

    const/4 v4, -0x1

    goto :goto_3

    :cond_6
    sget-object v6, Le10/j0;->a:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v6, v4

    :goto_3
    if-eq v4, v8, :cond_8

    const/4 v6, 0x2

    if-eq v4, v6, :cond_7

    new-instance v4, Lq20/i0;

    iget-object v0, v0, Ly00/o4;->w:Ljava/lang/String;

    invoke-direct {v4, v0, v7}, Lq20/i0;-><init>(Ljava/lang/String;Z)V

    move-object v0, v4

    goto :goto_6

    :cond_7
    :goto_4
    move-object v0, v10

    goto :goto_6

    :cond_8
    :goto_5
    move-object v0, v9

    goto :goto_6

    :cond_9
    instance-of v0, v4, Ll10/c;

    if-eqz v0, :cond_a

    goto :goto_5

    :cond_a
    instance-of v0, v4, Lo10/a;

    if-eqz v0, :cond_b

    goto :goto_4

    :cond_b
    move-object v0, v2

    :goto_6
    if-eqz v0, :cond_12

    iget-object v4, v5, Le10/k0;->x:Ljava/lang/Object;

    check-cast v4, Lh20/h;

    invoke-interface {p1}, Ly00/c8;->Y()Ly00/o4;

    move-result-object p1

    if-eqz p1, :cond_c

    iget-object p1, p1, Ly00/o4;->G:Ljava/lang/String;

    goto :goto_7

    :cond_c
    move-object p1, v2

    :goto_7
    new-instance v5, La00/g;

    iget-object v6, v4, Lh20/h;->a:Landroid/content/Context;

    iget-object v4, v4, Lh20/h;->b:Lq83/j;

    invoke-direct {v5, v6, p1, v4}, La00/g;-><init>(Landroid/content/Context;Ljava/lang/String;Lq83/j;)V

    invoke-virtual {v0, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    const-string v0, "google_pay"

    goto :goto_8

    :cond_d
    invoke-virtual {v0, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    const-string v0, "link"

    goto :goto_8

    :cond_e
    instance-of v4, v0, Lq20/i0;

    if-eqz v4, :cond_f

    check-cast v0, Lq20/i0;

    iget-object v4, v0, Lq20/i0;->w:Ljava/lang/String;

    iget-boolean v0, v0, Lq20/i0;->x:Z

    const-string v6, "payment_method:"

    const-string v7, ":"

    invoke-static {v6, v4, v7, v0}, Ld13/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    goto :goto_8

    :cond_f
    const-string v0, ""

    :goto_8
    iget-object v4, v5, La00/g;->E:Ljava/lang/Object;

    check-cast v4, Ll83/p;

    invoke-virtual {v4}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v4

    const-string v5, "getValue(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Landroid/content/SharedPreferences;

    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    if-eqz p1, :cond_10

    const-string v5, "customer["

    const-string v6, "]"

    invoke-static {v5, p1, v6}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_11

    :cond_10
    const-string p1, "guest"

    :cond_11
    invoke-interface {v4, p1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_12
    invoke-virtual {v3, v2, v1}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "AwaitingConfirmationResult"

    invoke-virtual {v3, p1}, Landroidx/lifecycle/k1;->d(Ljava/lang/String;)V

    return-void
.end method

.method public final f(Lj/c;Landroidx/lifecycle/g0;)V
    .locals 10

    const-string v0, "activityResultCaller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le10/r0;->a:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le10/i0;

    new-instance v2, La1/e;

    const/4 v8, 0x0

    const/16 v9, 0x19

    const/4 v3, 0x1

    const-class v5, Le10/r0;

    const-string v6, "onResult"

    const-string v7, "onResult(Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;)V"

    move-object v4, p0

    invoke-direct/range {v2 .. v9}, La1/e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v1, Le10/i0;->b:Le10/j;

    new-instance v5, Lcom/whoop/profile/view/edit/n;

    const/16 v6, 0xe

    invoke-direct {v5, v6, v1, v2}, Lcom/whoop/profile/view/edit/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v3, p1, v5}, Le10/j;->g(Lj/c;Lcom/whoop/profile/view/edit/n;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v1, Le10/i0;->c:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object v4, p0

    invoke-interface {p2}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    new-instance p2, Le10/q0;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, Le10/q0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    return-void
.end method

.method public final g(Le10/k;Ls83/c;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Le10/r0;->c:Landroidx/lifecycle/k1;

    const-string v1, "INITIAL_CONFIRMATION_ARGUMENTS_KEY"

    invoke-virtual {v0, p1, v1}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le10/r0;->b:Lbc3/c0;

    invoke-interface {v0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    new-instance v1, Ld30/o;

    const/4 v2, 0x0

    const/4 v3, 0x7

    invoke-direct {v1, p0, p1, v2, v3}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
