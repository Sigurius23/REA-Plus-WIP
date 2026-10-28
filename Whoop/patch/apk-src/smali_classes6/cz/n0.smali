.class public final Lcz/n0;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# instance fields
.field public final E:La33/d;

.field public final F:Lq83/j;

.field public final G:Lcz/i;

.field public final H:Lb20/f;

.field public final I:Lbz/i;

.field public final J:Lec3/h2;

.field public final K:Z

.field public final L:Lec3/h2;

.field public final M:Ln53/e;

.field public final N:Lec3/h2;

.field public final O:Lec3/h2;

.field public final P:Le10/r0;

.field public final Q:Lec3/h2;

.field public final R:Lec3/h2;

.field public final S:Ln53/e;

.field public final w:Lq20/y;

.field public final x:Lhm/d;

.field public final y:Lhm/d;

.field public final z:Lcz/b;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lq20/y;Lcz/b;Lcz/h;Lqy/d;La33/d;Lq83/j;Lux/y;Ljava/util/Set;Le10/n0;Lcz/i;Lb20/f;Landroidx/lifecycle/k1;Lbz/i;)V
    .locals 1

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "integrationType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "eventReporter"

    invoke-static {p6, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "workContext"

    invoke-static {p7, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "paymentConfiguration"

    invoke-static {p8, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "productUsage"

    invoke-static {p9, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "confirmationHandlerFactory"

    invoke-static {p10, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "customerSheetLoader"

    invoke-static {p11, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "errorReporter"

    invoke-static {p12, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "savedStateHandle"

    invoke-static {p13, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "userFacingLogger"

    invoke-static {p14, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p5, Lhz/a;->b:Lec3/h2;

    invoke-static {p5}, Ls2/e;->n(Lec3/h2;)Lhm/d;

    move-result-object p5

    sget-object v0, Lhz/a;->c:Lec3/h2;

    invoke-static {v0}, Ls2/e;->n(Lec3/h2;)Lhm/d;

    move-result-object v0

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p2, p0, Lcz/n0;->w:Lq20/y;

    iput-object p5, p0, Lcz/n0;->x:Lhm/d;

    iput-object v0, p0, Lcz/n0;->y:Lhm/d;

    iput-object p3, p0, Lcz/n0;->z:Lcz/b;

    iput-object p6, p0, Lcz/n0;->E:La33/d;

    iput-object p7, p0, Lcz/n0;->F:Lq83/j;

    iput-object p11, p0, Lcz/n0;->G:Lcz/i;

    iput-object p12, p0, Lcz/n0;->H:Lb20/f;

    iput-object p14, p0, Lcz/n0;->I:Lbz/i;

    new-instance p2, Lzx/o;

    invoke-direct {p2, p1, p9}, Lzx/o;-><init>(Landroid/content/Context;Ljava/util/Set;)V

    iget-object p1, p0, Lcz/n0;->w:Lq20/y;

    new-instance p2, Lcz/a;

    sget-object p5, Lmy/b;->x:Lmy/b;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    new-instance p5, Lcz/e0;

    sget-object p9, Lm83/y;->w:Lm83/y;

    invoke-direct {p5, p9, p1, p2, p3}, Lcz/e0;-><init>(Ljava/util/List;Lq20/y;Lcz/a;Lcz/b;)V

    invoke-static {p5}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lcz/n0;->J:Lec3/h2;

    iget-object p2, p8, Lux/y;->w:Ljava/lang/String;

    const-string p5, "pk_test"

    const/4 p8, 0x0

    invoke-static {p2, p5, p8}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p2

    const/4 p5, 0x1

    xor-int/2addr p2, p5

    iput-boolean p2, p0, Lcz/n0;->K:Z

    new-instance p2, Lcz/q0;

    invoke-virtual {p0}, Lcz/n0;->o()Z

    move-result p9

    invoke-direct {p2, p9}, Lcz/q0;-><init>(Z)V

    invoke-static {p2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p2

    iput-object p2, p0, Lcz/n0;->L:Lec3/h2;

    new-instance p9, Lcom/whoop/profile/view/edit/form/c;

    const/16 p11, 0x18

    invoke-direct {p9, p11}, Lcom/whoop/profile/view/edit/form/c;-><init>(I)V

    invoke-static {p2, p9}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object p2

    iput-object p2, p0, Lcz/n0;->M:Ln53/e;

    const/4 p9, 0x0

    invoke-static {p9}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p11

    iput-object p11, p0, Lcz/n0;->N:Lec3/h2;

    iput-object p11, p0, Lcz/n0;->O:Lec3/h2;

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p11

    invoke-virtual {p10, p11}, Le10/n0;->a(Lbc3/c0;)Le10/r0;

    move-result-object p10

    iput-object p10, p0, Lcz/n0;->P:Le10/r0;

    sget-object p10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p10}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p10

    iput-object p10, p0, Lcz/n0;->Q:Lec3/h2;

    new-instance p11, Lcz/f0;

    invoke-direct {p11, p8, p9}, Lcz/f0;-><init>(ZLjava/lang/String;)V

    invoke-static {p11}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p11

    iput-object p11, p0, Lcz/n0;->R:Lec3/h2;

    new-instance p12, Lb30/a1;

    const/16 p14, 0x8

    invoke-direct {p12, p0, p14}, Lb30/a1;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1, p11, p10, p12}, Lbi/g;->t(Lec3/f2;Lec3/f2;Lec3/f2;Lkotlin/jvm/functions/Function3;)Ln53/e;

    move-result-object p1

    iput-object p1, p0, Lcz/n0;->S:Ln53/e;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iget-boolean p1, p3, Lcz/b;->K:Z

    new-instance p10, Lb5/d;

    invoke-direct {p10, p8, p1, p13}, Lb5/d;-><init>(ZZLandroidx/lifecycle/k1;)V

    iget-object p1, p3, Lcz/b;->w:Lh20/h1;

    invoke-static {p1}, Luf/c0;->f0(Lh20/h1;)V

    new-instance p1, Ldz/f;

    invoke-direct {p1, p3, p4}, Ldz/f;-><init>(Lcz/b;Lcz/h;)V

    invoke-virtual {p6, p1}, La33/d;->m(Ldz/i;)V

    iget-object p1, p2, Ln53/e;->y:Ll83/e;

    check-cast p1, Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Lcz/q0;

    const/4 p2, 0x2

    if-eqz p1, :cond_0

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance p3, Lcz/c0;

    invoke-direct {p3, p0, p9, p8}, Lcz/c0;-><init>(Lcz/n0;Lq83/d;I)V

    invoke-static {p1, p7, p9, p3, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance p3, Lcz/c0;

    invoke-direct {p3, p0, p9, p5}, Lcz/c0;-><init>(Lcz/n0;Lq83/d;I)V

    const/4 p4, 0x3

    invoke-static {p1, p9, p9, p3, p4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance p3, Lcz/c0;

    invoke-direct {p3, p0, p9, p2}, Lcz/c0;-><init>(Lcz/n0;Lq83/d;I)V

    invoke-static {p1, p9, p9, p3, p4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance p2, Lcz/c0;

    invoke-direct {p2, p0, p9, p4}, Lcz/c0;-><init>(Lcz/n0;Lq83/d;I)V

    invoke-static {p1, p9, p9, p2, p4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static final g(Lcz/n0;Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p1, Lcz/g0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcz/g0;

    iget v1, v0, Lcz/g0;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcz/g0;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcz/g0;

    invoke-direct {v0, p0, p1}, Lcz/g0;-><init>(Lcz/n0;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lcz/g0;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcz/g0;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, Lcz/g0;->w:Lcz/n0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcz/n0;->F:Lq83/j;

    new-instance v2, Lcz/c0;

    const/4 v6, 0x4

    invoke-direct {v2, p0, v5, v6}, Lcz/c0;-><init>(Lcz/n0;Lq83/d;I)V

    iput-object p0, v0, Lcz/g0;->w:Lcz/n0;

    iput v4, v0, Lcz/g0;->z:I

    invoke-static {p1, v2, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v2

    iget-object v2, v2, Ln8/a;->w:Lq83/j;

    new-instance v4, Lcz/d0;

    invoke-direct {v4, p1, p0, v5}, Lcz/d0;-><init>(Ljava/lang/Object;Lcz/n0;Lq83/d;)V

    iput-object v5, v0, Lcz/g0;->w:Lcz/n0;

    iput v3, v0, Lcz/g0;->z:I

    invoke-static {v2, v4, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final j(Lcz/n0;Ly00/o4;Lq83/d;)V
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, p2, Lcz/j0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcz/j0;

    iget v1, v0, Lcz/j0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcz/j0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcz/j0;

    invoke-direct {v0, p0, p2}, Lcz/j0;-><init>(Lcz/n0;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lcz/j0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, v0, Lcz/j0;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    if-ne v1, v2, :cond_2

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    if-nez p2, :cond_1

    invoke-static {}, Lcom/squareup/wire/n;->x()V

    const/4 p0, 0x0

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/ClassCastException;

    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    throw p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput v2, v0, Lcz/j0;->y:I

    invoke-virtual {p0, p1, v0}, Lcz/n0;->r(Ly00/o4;Ls83/c;)V

    return-void
.end method

.method public static final l(Lcz/n0;Ly00/o4;Lh20/a;Lq83/d;)V
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, p3, Lcz/m0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcz/m0;

    iget v1, v0, Lcz/m0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcz/m0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcz/m0;

    invoke-direct {v0, p0, p3}, Lcz/m0;-><init>(Lcz/n0;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lcz/m0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, v0, Lcz/m0;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    if-ne v1, v2, :cond_2

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    if-nez p3, :cond_1

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/ClassCastException;

    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    throw p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iput v2, v0, Lcz/m0;->y:I

    invoke-virtual {p0, p1, p2, v0}, Lcz/n0;->p(Ly00/o4;Lh20/a;Ls83/c;)V

    return-void
.end method


# virtual methods
.method public final n(Lcz/b0;)V
    .locals 30

    move-object/from16 v2, p0

    move-object/from16 v0, p1

    const-string v1, "viewAction"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v0, Lcz/s;

    iget-object v3, v2, Lcz/n0;->N:Lec3/h2;

    if-eqz v1, :cond_1

    :cond_0
    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcz/z0;

    new-instance v1, Lcz/x0;

    iget-object v4, v2, Lcz/n0;->w:Lq20/y;

    invoke-direct {v1, v4}, Lcz/x0;-><init>(Lq20/y;)V

    invoke-virtual {v3, v0, v1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_7

    :cond_1
    instance-of v1, v0, Lcz/j;

    const/4 v4, 0x0

    const/4 v8, 0x0

    if-nez v1, :cond_2f

    instance-of v1, v0, Lcz/p;

    iget-object v9, v2, Lcz/n0;->E:La33/d;

    if-eqz v1, :cond_2

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ldz/d;

    invoke-direct {v0, v4}, Ldz/d;-><init>(I)V

    invoke-virtual {v9, v0}, La33/d;->m(Ldz/i;)V

    return-void

    :cond_2
    instance-of v1, v0, Lcz/r;

    if-eqz v1, :cond_3

    check-cast v0, Lcz/r;

    iget-object v0, v0, Lcz/r;->a:Ly00/i;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "brand"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ldz/c;

    invoke-direct {v1, v0}, Ldz/c;-><init>(Ly00/i;)V

    invoke-virtual {v9, v1}, La33/d;->m(Ldz/i;)V

    return-void

    :cond_3
    instance-of v1, v0, Lcz/l;

    if-eqz v1, :cond_4

    check-cast v0, Lcz/l;

    sget-object v0, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->x:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v9, La33/d;->z:Ljava/lang/Object;

    check-cast v0, Lq83/j;

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    new-instance v1, La13/h;

    invoke-direct {v1, v9, v8}, La13/h;-><init>(La33/d;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v8, v8, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_4
    instance-of v1, v0, Lcz/q;

    if-eqz v1, :cond_5

    check-cast v0, Lcz/q;

    iget-object v0, v0, Lcz/q;->a:Ldz/i;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v9, v0}, La33/d;->m(Ldz/i;)V

    return-void

    :cond_5
    instance-of v1, v0, Lcz/m;

    if-eqz v1, :cond_6

    invoke-virtual {v2}, Lcz/n0;->q()V

    return-void

    :cond_6
    instance-of v1, v0, Lcz/t;

    const/4 v10, 0x2

    iget-object v4, v2, Lcz/n0;->Q:Lec3/h2;

    const/4 v11, 0x1

    iget-object v5, v2, Lcz/n0;->J:Lec3/h2;

    if-eqz v1, :cond_9

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcz/e0;

    iget-boolean v0, v0, Lcz/e0;->g:Z

    if-nez v0, :cond_7

    goto/16 :goto_7

    :cond_7
    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ldz/d;

    invoke-direct {v1, v11}, Ldz/d;-><init>(I)V

    invoke-virtual {v9, v1}, La33/d;->m(Ldz/i;)V

    goto :goto_0

    :cond_8
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ldz/d;

    invoke-direct {v1, v10}, Ldz/d;-><init>(I)V

    invoke-virtual {v9, v1}, La33/d;->m(Ldz/i;)V

    :goto_0
    xor-int/2addr v0, v11

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v4, v8, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_9
    instance-of v1, v0, Lcz/x;

    iget-object v12, v2, Lcz/n0;->L:Lec3/h2;

    if-eqz v1, :cond_b

    check-cast v0, Lcz/x;

    iget-object v13, v0, Lcz/x;->a:Lh20/l;

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcz/e0;

    new-instance v14, Lcz/s0;

    move-object v15, v14

    invoke-virtual {v2}, Lcz/n0;->o()Z

    move-result v14

    move-object/from16 v16, v15

    iget-boolean v15, v0, Lcz/e0;->e:Z

    iget-object v1, v2, Lcz/n0;->z:Lcz/b;

    iget-object v3, v1, Lcz/b;->E:Lh20/l1;

    iget-object v4, v3, Lh20/l1;->z:Lh20/j1;

    invoke-virtual {v3}, Lh20/l1;->b()Ljava/util/Set;

    move-result-object v19

    new-instance v3, Lv00/j0;

    iget-object v0, v0, Lcz/e0;->d:Lcz/b;

    iget-object v0, v0, Lcz/b;->J:Lh20/t1;

    invoke-direct {v3, v0}, Lv00/j0;-><init>(Lh20/t1;)V

    new-instance v0, Landroidx/room/v0;

    const/4 v6, 0x0

    const/4 v7, 0x2

    move-object v5, v1

    const/4 v1, 0x2

    move-object/from16 v17, v3

    const-class v3, Lcz/n0;

    move-object/from16 v18, v4

    const-string v4, "removeExecutor"

    move-object/from16 v20, v5

    const-string v5, "removeExecutor(Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    move-object/from16 v11, v20

    invoke-direct/range {v0 .. v7}, Landroidx/room/v0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    move-object/from16 v24, v0

    new-instance v0, Lcz/i0;

    const/4 v7, 0x0

    const/4 v1, 0x3

    const-class v3, Lcz/n0;

    const-string v4, "updatePaymentMethodExecutor"

    const-string v5, "updatePaymentMethodExecutor-0E7RQCE(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/CardUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    move-object/from16 v2, p0

    invoke-direct/range {v0 .. v7}, Lcz/i0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    sget-object v1, Lmy/b;->z:Lmy/b;

    iget-object v3, v11, Lcz/b;->F:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lmy/b;->a(Ljava/lang/String;)Lzy/b;

    move-result-object v21

    move-object/from16 v1, v16

    move-object/from16 v16, v13

    new-instance v13, Lb30/y0;

    new-instance v3, Lb3/z0;

    invoke-direct {v3, v10, v10, v8}, Lb3/z0;-><init>(IILq83/d;)V

    new-instance v4, Lck1/c;

    const/16 v5, 0xe

    invoke-direct {v4, v2, v5}, Lck1/c;-><init>(Ljava/lang/Object;I)V

    new-instance v5, La1/j;

    const/16 v6, 0x1d

    invoke-direct {v5, v2, v6}, La1/j;-><init>(Ljava/lang/Object;I)V

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v25, v0

    move-object/from16 v26, v3

    move-object/from16 v27, v4

    move-object/from16 v28, v5

    invoke-direct/range {v13 .. v28}, Lb30/y0;-><init>(ZZLh20/l;Lux/a;Lh20/j1;Ljava/util/Set;ZLzy/b;ZZLc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;)V

    invoke-virtual {v2}, Lcz/n0;->o()Z

    move-result v0

    invoke-direct {v1, v13, v0}, Lcz/s0;-><init>(Lb30/y0;Z)V

    instance-of v0, v1, Lcz/s0;

    if-eqz v0, :cond_a

    sget-object v0, Ldz/k;->y:Ldz/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Ldz/h;

    const/4 v4, 0x1

    invoke-direct {v3, v0, v4}, Ldz/h;-><init>(Ldz/k;I)V

    invoke-virtual {v9, v3}, La33/d;->m(Ldz/i;)V

    :cond_a
    invoke-virtual {v12}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    check-cast v3, Ljava/util/Collection;

    invoke-static {v1, v3}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v12, v0, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    return-void

    :cond_b
    instance-of v1, v0, Lcz/w;

    const-string v6, "state"

    if-eqz v1, :cond_f

    check-cast v0, Lcz/w;

    iget-object v0, v0, Lcz/w;->a:Lq20/y;

    instance-of v1, v0, Lq20/j;

    if-nez v1, :cond_d

    instance-of v1, v0, Lq20/w;

    if-eqz v1, :cond_c

    goto :goto_1

    :cond_c
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Unsupported payment selection "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_d
    :goto_1
    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_e

    goto/16 :goto_7

    :cond_e
    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcz/e0;

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v1, Lcz/e0;->a:Ljava/util/List;

    iget-object v4, v1, Lcz/e0;->c:Lcz/a;

    iget-object v1, v1, Lcz/e0;->d:Lcz/b;

    const-string v6, "configuration"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lcz/e0;

    invoke-direct {v6, v3, v0, v4, v1}, Lcz/e0;-><init>(Ljava/util/List;Lq20/y;Lcz/a;Lcz/b;)V

    invoke-virtual {v5, v8, v6}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_f
    instance-of v1, v0, Lcz/y;

    iget-object v4, v2, Lcz/n0;->M:Ln53/e;

    if-eqz v1, :cond_16

    iget-object v0, v4, Ln53/e;->y:Ll83/e;

    check-cast v0, Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcz/t0;

    instance-of v1, v0, Lcz/p0;

    if-eqz v1, :cond_11

    check-cast v0, Lcz/p0;

    iget-object v0, v0, Lcz/p0;->q:Lb30/p3;

    if-eqz v0, :cond_10

    iget-object v0, v0, Lb30/p3;->c:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void

    :cond_10
    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcz/e0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lb20/e;->c0:Lb20/e;

    const/4 v1, 0x6

    iget-object v4, v2, Lcz/n0;->H:Lb20/f;

    invoke-static {v4, v0, v8, v8, v1}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    new-instance v0, Lcz/y0;

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v4, "No customer metadata available on confirmation!"

    invoke-direct {v1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcz/y0;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3, v8, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_11
    instance-of v1, v0, Lcz/r0;

    const-string v3, " is not supported"

    if-eqz v1, :cond_15

    iget-object v1, v2, Lcz/n0;->R:Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcz/f0;

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v4, Lcz/f0;->b:Ljava/lang/String;

    new-instance v6, Lcz/f0;

    const/4 v7, 0x1

    invoke-direct {v6, v7, v4}, Lcz/f0;-><init>(ZLjava/lang/String;)V

    invoke-virtual {v1, v8, v6}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    check-cast v0, Lcz/r0;

    iget-object v0, v0, Lcz/r0;->e:Lq20/y;

    instance-of v1, v0, Lq20/j;

    if-eqz v1, :cond_12

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcz/e0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Le;

    const/16 v3, 0x1a

    invoke-direct {v1, v2, v8, v8, v3}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iget-object v3, v2, Lcz/n0;->F:Lq83/j;

    invoke-static {v0, v3, v8, v1, v10}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_12
    instance-of v1, v0, Lq20/w;

    if-eqz v1, :cond_13

    check-cast v0, Lq20/w;

    invoke-virtual {v2, v0}, Lcz/n0;->t(Lq20/w;)V

    return-void

    :cond_13
    if-nez v0, :cond_14

    invoke-virtual {v2, v8}, Lcz/n0;->t(Lq20/w;)V

    return-void

    :cond_14
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_15
    new-instance v0, Ljava/lang/IllegalStateException;

    iget-object v1, v4, Ln53/e;->y:Ll83/e;

    check-cast v1, Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_16
    instance-of v1, v0, Lcz/k;

    if-eqz v1, :cond_19

    check-cast v0, Lcz/k;

    iget-object v0, v0, Lcz/k;->a:Lu00/f;

    iget-object v1, v4, Ln53/e;->y:Ll83/e;

    check-cast v1, Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Lcz/p0;

    if-eqz v3, :cond_17

    move-object v8, v1

    check-cast v8, Lcz/p0;

    :cond_17
    if-eqz v8, :cond_18

    iget-object v1, v8, Lcz/p0;->c:Ljava/lang/String;

    iget-object v0, v0, Lu00/f;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    goto/16 :goto_7

    :cond_18
    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcz/e0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Required value was null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_19
    instance-of v1, v0, Lcz/v;

    if-eqz v1, :cond_1a

    check-cast v0, Lcz/v;

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcz/e0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_1a
    instance-of v1, v0, Lcz/z;

    const/16 v3, 0xa

    if-eqz v1, :cond_1e

    check-cast v0, Lcz/z;

    :cond_1b
    invoke-virtual {v12}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcz/t0;

    instance-of v6, v5, Lcz/p0;

    if-nez v6, :cond_1c

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1c
    throw v8

    :cond_1d
    invoke-virtual {v12, v0, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1b

    goto/16 :goto_7

    :cond_1e
    instance-of v1, v0, Lcz/a0;

    if-eqz v1, :cond_22

    check-cast v0, Lcz/a0;

    :cond_1f
    invoke-virtual {v12}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_21

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcz/t0;

    instance-of v6, v5, Lcz/p0;

    if-eqz v6, :cond_20

    move-object v13, v5

    check-cast v13, Lcz/p0;

    const/16 v28, 0x0

    const v29, 0xe7fff

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-static/range {v13 .. v29}, Lcz/p0;->c(Lcz/p0;Ljava/lang/String;Lo20/b;Ljava/util/List;Ls20/a;Lq20/y;ZZLzy/c;Lzy/b;ZLb30/p3;Lzy/c;ZZLq20/s;I)Lcz/p0;

    move-result-object v5

    :cond_20
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_21
    invoke-virtual {v12, v0, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1f

    goto/16 :goto_7

    :cond_22
    instance-of v1, v0, Lcz/n;

    if-eqz v1, :cond_26

    check-cast v0, Lcz/n;

    :cond_23
    invoke-virtual {v12}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_25

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcz/t0;

    instance-of v6, v5, Lcz/p0;

    if-eqz v6, :cond_24

    move-object v13, v5

    check-cast v13, Lcz/p0;

    const v5, 0x7f140feb

    invoke-static {v5}, Ls4/i;->h(I)Lzy/b;

    move-result-object v22

    const/16 v27, 0x0

    const v29, 0xbefff

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    invoke-static/range {v13 .. v29}, Lcz/p0;->c(Lcz/p0;Ljava/lang/String;Lo20/b;Ljava/util/List;Ls20/a;Lq20/y;ZZLzy/c;Lzy/b;ZLb30/p3;Lzy/c;ZZLq20/s;I)Lcz/p0;

    move-result-object v5

    :cond_24
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_25
    invoke-virtual {v12, v0, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_23

    goto/16 :goto_7

    :cond_26
    instance-of v1, v0, Lcz/u;

    if-eqz v1, :cond_2a

    check-cast v0, Lcz/u;

    :cond_27
    invoke-virtual {v12}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_29

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcz/t0;

    instance-of v6, v5, Lcz/p0;

    if-eqz v6, :cond_28

    move-object v13, v5

    check-cast v13, Lcz/p0;

    const/16 v28, 0x0

    const v29, 0xffbff

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-static/range {v13 .. v29}, Lcz/p0;->c(Lcz/p0;Ljava/lang/String;Lo20/b;Ljava/util/List;Ls20/a;Lq20/y;ZZLzy/c;Lzy/b;ZLb30/p3;Lzy/c;ZZLq20/s;I)Lcz/p0;

    move-result-object v5

    :cond_28
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_29
    invoke-virtual {v12, v0, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_27

    goto :goto_7

    :cond_2a
    instance-of v0, v0, Lcz/o;

    if-eqz v0, :cond_2e

    :cond_2b
    invoke-virtual {v12}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcz/t0;

    instance-of v6, v5, Lcz/p0;

    if-eqz v6, :cond_2c

    move-object v13, v5

    check-cast v13, Lcz/p0;

    const/16 v28, 0x0

    const v29, 0xdffff

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-static/range {v13 .. v29}, Lcz/p0;->c(Lcz/p0;Ljava/lang/String;Lo20/b;Ljava/util/List;Ls20/a;Lq20/y;ZZLzy/c;Lzy/b;ZLb30/p3;Lzy/c;ZZLq20/s;I)Lcz/p0;

    move-result-object v5

    :cond_2c
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_2d
    invoke-virtual {v12, v0, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2b

    :goto_7
    return-void

    :cond_2e
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2f
    invoke-virtual {v2, v4}, Lcz/n0;->u(Z)V

    throw v8
.end method

.method public final o()Z
    .locals 1

    iget-object v0, p0, Lcz/n0;->J:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcz/e0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v0, p0, Lcz/n0;->K:Z

    return v0
.end method

.method public final p(Ly00/o4;Lh20/a;Ls83/c;)V
    .locals 7

    instance-of v0, p3, Lcz/h0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcz/h0;

    iget v1, v0, Lcz/h0;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcz/h0;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcz/h0;

    invoke-direct {v0, p0, p3}, Lcz/h0;-><init>(Lcz/n0;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lcz/h0;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcz/h0;->F:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v4, :cond_3

    if-ne v2, v3, :cond_2

    iget-object p1, v0, Lcz/h0;->x:Ljava/lang/Object;

    check-cast p1, Lh20/a;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    if-nez p3, :cond_1

    invoke-static {}, Lcom/squareup/wire/n;->x()V

    throw v5

    :cond_1
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    iget-object p2, v0, Lcz/h0;->y:Lh20/a;

    iget-object p1, v0, Lcz/h0;->x:Ljava/lang/Object;

    check-cast p1, Ly00/o4;

    iget-object v1, v0, Lcz/h0;->w:Lcz/n0;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Lcz/h0;->w:Lcz/n0;

    iput-object p1, v0, Lcz/h0;->x:Ljava/lang/Object;

    iput-object p2, v0, Lcz/h0;->y:Lh20/a;

    iput v4, v0, Lcz/h0;->F:I

    iget-object p3, p0, Lcz/n0;->x:Lhm/d;

    invoke-virtual {p3, v0}, Lhm/d;->e(Ls83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    return-void

    :cond_5
    move-object v1, p0

    :goto_1
    if-nez p3, :cond_7

    iget-object p1, p1, Ly00/o4;->w:Ljava/lang/String;

    iget-object p1, p2, Lh20/a;->c:Ly00/i;

    if-eqz p1, :cond_6

    new-instance p3, Ly00/w5;

    iget-object p1, p1, Ly00/i;->w:Ljava/lang/String;

    invoke-direct {p3, p1}, Ly00/w5;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    move-object p3, v5

    :goto_2
    iget-object p1, p2, Lh20/a;->d:Ly00/v3;

    iget-object v2, p2, Lh20/a;->a:Ljava/lang/Integer;

    iget-object v4, p2, Lh20/a;->b:Ljava/lang/Integer;

    const-string v6, "CustomerSheet"

    invoke-static {v6}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v6

    invoke-static {v2, v4, p3, p1, v6}, Lt9/c0;->g(Ljava/lang/Integer;Ljava/lang/Integer;Ly00/w5;Ly00/v3;Ljava/util/Set;)Ly00/x5;

    iput-object v1, v0, Lcz/h0;->w:Lcz/n0;

    iput-object p2, v0, Lcz/h0;->x:Ljava/lang/Object;

    iput-object v5, v0, Lcz/h0;->y:Lh20/a;

    iput v3, v0, Lcz/h0;->F:I

    throw v5

    :cond_7
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1
.end method

.method public final q()V
    .locals 9

    iget-object v0, p0, Lcz/n0;->L:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    new-instance v0, Lcz/x0;

    iget-object v1, p0, Lcz/n0;->w:Lq20/y;

    invoke-direct {v0, v1}, Lcz/x0;-><init>(Lq20/y;)V

    iget-object v1, p0, Lcz/n0;->N:Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v2, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_0
    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcz/t0;

    instance-of v6, v5, Lcz/p0;

    if-eqz v6, :cond_1

    sget-object v5, Ldz/k;->w:Ldz/k;

    goto :goto_0

    :cond_1
    instance-of v6, v5, Lcz/r0;

    if-eqz v6, :cond_2

    sget-object v5, Ldz/k;->x:Ldz/k;

    goto :goto_0

    :cond_2
    instance-of v5, v5, Lcz/s0;

    if-eqz v5, :cond_3

    sget-object v5, Ldz/k;->y:Ldz/k;

    goto :goto_0

    :cond_3
    move-object v5, v2

    :goto_0
    if-eqz v5, :cond_4

    iget-object v6, p0, Lcz/n0;->E:La33/d;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, Ldz/l;->a:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v7, v7, v8

    if-ne v7, v3, :cond_4

    new-instance v7, Ldz/h;

    const/4 v8, 0x0

    invoke-direct {v7, v5, v8}, Ldz/h;-><init>(Ldz/k;I)V

    invoke-virtual {v6, v7}, La33/d;->m(Ldz/i;)V

    :cond_4
    invoke-static {v3, v4}, Lm83/s;->A0(ILjava/util/List;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method public final r(Ly00/o4;Ls83/c;)V
    .locals 6

    instance-of v0, p2, Lcz/k0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcz/k0;

    iget v1, v0, Lcz/k0;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcz/k0;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcz/k0;

    invoke-direct {v0, p0, p2}, Lcz/k0;-><init>(Lcz/n0;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lcz/k0;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcz/k0;->E:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v4, :cond_3

    if-ne v2, v3, :cond_2

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    if-nez p2, :cond_1

    invoke-static {}, Lcom/squareup/wire/n;->x()V

    throw v5

    :cond_1
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    iget-object p1, v0, Lcz/k0;->x:Ly00/o4;

    iget-object v1, v0, Lcz/k0;->w:Lcz/n0;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Lcz/k0;->w:Lcz/n0;

    iput-object p1, v0, Lcz/k0;->x:Ly00/o4;

    iput v4, v0, Lcz/k0;->E:I

    iget-object p2, p0, Lcz/n0;->x:Lhm/d;

    invoke-virtual {p2, v0}, Lhm/d;->e(Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    return-void

    :cond_5
    move-object v1, p0

    :goto_1
    if-nez p2, :cond_6

    iget-object p2, p1, Ly00/o4;->w:Ljava/lang/String;

    iput-object v1, v0, Lcz/k0;->w:Lcz/n0;

    iput-object p1, v0, Lcz/k0;->x:Ly00/o4;

    iput v3, v0, Lcz/k0;->E:I

    throw v5

    :cond_6
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1
.end method

.method public final t(Lq20/w;)V
    .locals 7

    iget-object v0, p0, Lcz/n0;->J:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcz/e0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Lcz/l0;

    const/4 v6, 0x1

    const/4 v4, 0x0

    move-object v5, v4

    move-object v2, p0

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, Lcz/l0;-><init>(Lcz/n0;Lq20/w;Ljava/lang/Boolean;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {v0, v4, v4, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final u(Z)V
    .locals 1

    iget-object p1, p0, Lcz/n0;->J:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcz/e0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Required value was null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
