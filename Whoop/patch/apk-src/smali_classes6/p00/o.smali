.class public final Lp00/o;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# instance fields
.field public final E:Lqy/d;

.field public final F:Lwz/n0;

.field public final G:Lwz/s1;

.field public final H:Lm7/l0;

.field public final I:Lc93/a;

.field public final J:Lc93/a;

.field public final K:Lkotlin/jvm/functions/Function1;

.field public final L:Lec3/h2;

.field public final M:Lec3/h2;

.field public final N:Lg40/o1;

.field public final O:Lec3/r1;

.field public P:Z

.field public final w:Ld00/l;

.field public final x:Lxz/f0;

.field public final y:Lxz/x;

.field public final z:Lyz/b;


# direct methods
.method public constructor <init>(Ld00/l;Lxz/f0;Lxz/x;Lyz/b;Lqy/d;Lwz/n0;Lwz/s1;ZLm7/l0;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p10

    move-object/from16 v9, p11

    move-object/from16 v10, p12

    const-string v11, "linkAccount"

    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "linkAccountHolder"

    invoke-static {v2, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "linkAccountManager"

    invoke-static {v3, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "linkEventsReporter"

    invoke-static {v4, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "logger"

    invoke-static {v5, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "linkLaunchMode"

    invoke-static {v6, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "webLinkAuthChannel"

    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "onChangeEmailRequested"

    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "onDismissClicked"

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "dismissWithResult"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object v1, v0, Lp00/o;->w:Ld00/l;

    iput-object v2, v0, Lp00/o;->x:Lxz/f0;

    iput-object v3, v0, Lp00/o;->y:Lxz/x;

    iput-object v4, v0, Lp00/o;->z:Lyz/b;

    iput-object v5, v0, Lp00/o;->E:Lqy/d;

    iput-object v6, v0, Lp00/o;->F:Lwz/n0;

    iput-object v7, v0, Lp00/o;->G:Lwz/s1;

    move-object/from16 v2, p9

    iput-object v2, v0, Lp00/o;->H:Lm7/l0;

    iput-object v8, v0, Lp00/o;->I:Lc93/a;

    iput-object v9, v0, Lp00/o;->J:Lc93/a;

    iput-object v10, v0, Lp00/o;->K:Lkotlin/jvm/functions/Function1;

    iget-object v2, v1, Ld00/l;->M:Ljava/lang/String;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    move/from16 v17, v3

    goto :goto_0

    :cond_0
    move/from16 v17, v4

    :goto_0
    iget-object v11, v1, Ld00/l;->F:Ljava/lang/String;

    iget-object v12, v1, Ld00/l;->H:Ljava/lang/String;

    if-eqz p8, :cond_2

    instance-of v2, v6, Lwz/m0;

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    move v14, v4

    goto :goto_2

    :cond_2
    :goto_1
    move v14, v3

    :goto_2
    iget-object v2, v1, Ld00/l;->z:Ld00/m;

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    iget-object v2, v2, Ld00/m;->x:Ld00/k;

    goto :goto_3

    :cond_3
    move-object v2, v3

    :goto_3
    instance-of v5, v2, Ld00/j;

    if-eqz v5, :cond_4

    check-cast v2, Ld00/j;

    goto :goto_4

    :cond_4
    move-object v2, v3

    :goto_4
    if-eqz v2, :cond_5

    iget-object v2, v2, Ld00/j;->w:Lcom/stripe/android/model/ConsentUi$ConsentSection;

    move-object/from16 v16, v2

    goto :goto_5

    :cond_5
    move-object/from16 v16, v3

    :goto_5
    new-instance v5, Lp00/q;

    const/4 v10, 0x0

    const/4 v15, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    move/from16 v13, p8

    invoke-direct/range {v5 .. v17}, Lp00/q;-><init>(ZZLzy/c;ZZLjava/lang/String;Ljava/lang/String;ZZLq00/o;Lcom/stripe/android/model/ConsentUi$ConsentSection;Z)V

    invoke-static {v5}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    iput-object v2, v0, Lp00/o;->L:Lec3/h2;

    iput-object v2, v0, Lp00/o;->M:Lec3/h2;

    sget-object v5, Lcom/stripe/android/ui/core/elements/OTPSpec;->INSTANCE:Lcom/stripe/android/ui/core/elements/OTPSpec;

    invoke-virtual {v5}, Lcom/stripe/android/ui/core/elements/OTPSpec;->transform()Lg40/o1;

    move-result-object v5

    iput-object v5, v0, Lp00/o;->N:Lg40/o1;

    invoke-virtual {v5}, Lg40/o1;->e()Lec3/f2;

    move-result-object v5

    new-instance v6, Lbm/g;

    check-cast v5, Ln53/e;

    const/4 v7, 0x4

    invoke-direct {v6, v5, v7}, Lbm/g;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v5

    sget-object v7, Lec3/z1;->b:Lec3/b2;

    invoke-static {v6, v5, v7, v3}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object v5

    iput-object v5, v0, Lp00/o;->O:Lec3/r1;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp00/q;

    iget-boolean v2, v2, Lp00/q;->L:Z

    const/4 v5, 0x3

    if-eqz v2, :cond_6

    invoke-static {v0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v1

    new-instance v2, Lp00/l;

    const/4 v4, 0x3

    invoke-direct {v2, v0, v3, v4}, Lp00/l;-><init>(Lp00/o;Lq83/d;I)V

    invoke-static {v1, v3, v3, v2, v5}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_6

    :cond_6
    iget-object v1, v1, Ld00/l;->L:Ld00/f;

    sget-object v2, Ld00/d;->a:Ld00/d;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual {v0, v4}, Lp00/o;->p(Z)V

    :cond_7
    :goto_6
    invoke-static {v0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v1

    new-instance v2, Lp00/l;

    const/4 v4, 0x1

    invoke-direct {v2, v0, v3, v4}, Lp00/l;-><init>(Lp00/o;Lq83/d;I)V

    invoke-static {v1, v3, v3, v2, v5}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-static {v0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v1

    new-instance v2, Lp00/l;

    const/4 v4, 0x2

    invoke-direct {v2, v0, v3, v4}, Lp00/l;-><init>(Lp00/o;Lq83/d;I)V

    invoke-static {v1, v3, v3, v2, v5}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method


# virtual methods
.method public final g()V
    .locals 8

    :cond_0
    iget-object v0, p0, Lp00/o;->L:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lp00/q;

    const-string v3, "it"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/16 v7, 0xffb

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lp00/q;->b(Lp00/q;ZLzy/c;ZZI)Lp00/q;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method public final j()V
    .locals 8

    :cond_0
    iget-object v0, p0, Lp00/o;->L:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lp00/q;

    const-string v3, "it"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/16 v7, 0xfef

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lp00/q;->b(Lp00/q;ZLzy/c;ZZI)Lp00/q;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method public final l()V
    .locals 8

    :cond_0
    iget-object v0, p0, Lp00/o;->L:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lp00/q;

    const-string v3, "it"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/16 v7, 0xffd

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lp00/q;->b(Lp00/q;ZLzy/c;ZZI)Lp00/q;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method public final n(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 13

    instance-of v0, p2, Lp00/m;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lp00/m;

    iget v1, v0, Lp00/m;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lp00/m;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lp00/m;

    invoke-direct {v0, p0, p2}, Lp00/m;-><init>(Lp00/o;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lp00/m;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lp00/m;->z:I

    const/4 v3, 0x0

    const-string v4, "it"

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v5, :cond_1

    iget-object p1, v0, Lp00/m;->w:Lp00/o;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p2, p2, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_3
    iget-object p2, p0, Lp00/o;->L:Lec3/h2;

    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lp00/q;

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v10, 0x0

    const/16 v11, 0xffa

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lp00/q;->b(Lp00/q;ZLzy/c;ZZI)Lp00/q;

    move-result-object v6

    invoke-virtual {p2, v2, v6}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    iget-boolean p2, p0, Lp00/o;->P:Z

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    if-eqz p2, :cond_4

    goto :goto_1

    :cond_4
    move-object v2, v3

    :goto_1
    iput-object p0, v0, Lp00/m;->w:Lp00/o;

    iput v5, v0, Lp00/m;->z:I

    iget-object p2, p0, Lp00/o;->y:Lxz/x;

    invoke-virtual {p2, p1, v2, v0}, Lxz/x;->a(Ljava/lang/String;Ljava/lang/Boolean;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    return-object v1

    :cond_5
    move-object p1, p0

    :goto_2
    invoke-static {p2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_d

    check-cast p2, Ld00/l;

    iget-object v1, p1, Lp00/o;->L:Lec3/h2;

    iget-object v2, p1, Lp00/o;->y:Lxz/x;

    iget-object v6, p1, Lp00/o;->K:Lkotlin/jvm/functions/Function1;

    :cond_6
    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lp00/q;

    invoke-static {v7, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v11, 0x0

    const/16 v12, 0xffe

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lp00/q;->b(Lp00/q;ZLzy/c;ZZI)Lp00/q;

    move-result-object v7

    invoke-virtual {v1, v0, v7}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p1, Lp00/o;->F:Lwz/n0;

    instance-of v1, v0, Lwz/i0;

    instance-of v0, v0, Lwz/j0;

    if-eqz v0, :cond_9

    iget-object p2, p2, Ld00/l;->z:Ld00/m;

    if-eqz p2, :cond_7

    iget-object v0, p2, Ld00/m;->x:Ld00/k;

    goto :goto_3

    :cond_7
    move-object v0, v3

    :goto_3
    if-eqz v0, :cond_a

    if-eqz p2, :cond_8

    iget-object p2, p2, Ld00/m;->x:Ld00/k;

    goto :goto_4

    :cond_8
    move-object p2, v3

    :goto_4
    instance-of p2, p2, Ld00/j;

    if-eqz p2, :cond_9

    goto :goto_5

    :cond_9
    const/4 v5, 0x0

    :cond_a
    :goto_5
    if-eqz v1, :cond_b

    new-instance v7, Lwz/n;

    invoke-static {v2}, Ls3/d;->j(Lxz/x;)Lwz/e;

    move-result-object v8

    const/4 v11, 0x0

    const/16 v12, 0xe

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lwz/n;-><init>(Lwz/e;Lwz/u0;Ly00/j0;Ljava/lang/Boolean;I)V

    invoke-interface {v6, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    :cond_b
    if-eqz v5, :cond_c

    new-instance v0, Lwz/n;

    invoke-static {v2}, Ls3/d;->j(Lxz/x;)Lwz/e;

    move-result-object v1

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v5, 0x6

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lwz/n;-><init>(Lwz/e;Lwz/u0;Ly00/j0;Ljava/lang/Boolean;I)V

    invoke-interface {v6, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    :cond_c
    iget-object p1, p1, Lp00/o;->H:Lm7/l0;

    invoke-virtual {p1, v3}, Lm7/l0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    :cond_d
    iget-object p2, p1, Lp00/o;->N:Lg40/o1;

    iget-object p2, p2, Lg40/o1;->b:Lg40/m1;

    iget-object p2, p2, Lg40/m1;->b:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, ""

    invoke-virtual {v1, v3, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_6

    :cond_e
    invoke-static {v0}, Lv8/b;->x(Ljava/lang/Throwable;)Lzy/c;

    move-result-object v7

    iget-object p2, p1, Lp00/o;->E:Lqy/d;

    const-string v1, "VerificationViewModel Error: "

    invoke-virtual {p2, v1, v0}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p2, p1, Lp00/o;->L:Lec3/h2;

    :cond_f
    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lp00/q;

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v9, 0x0

    const/16 v10, 0xffa

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lp00/q;->b(Lp00/q;ZLzy/c;ZZI)Lp00/q;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_f

    :goto_7
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final o()V
    .locals 8

    iget-object v0, p0, Lp00/o;->z:Lyz/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lyz/e;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v2, Ll83/k;

    const-string v3, "verification_type"

    const-string v4, "SMS"

    invoke-direct {v2, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lyz/b;->a(Ldz/i;Ljava/util/Map;)V

    :cond_0
    iget-object v0, p0, Lp00/o;->L:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lp00/q;

    const-string v3, "it"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/16 v7, 0xff7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static/range {v2 .. v7}, Lp00/q;->b(Lp00/q;ZLzy/c;ZZI)Lp00/q;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lp00/o;->p(Z)V

    return-void
.end method

.method public final p(Z)V
    .locals 8

    :cond_0
    iget-object v0, p0, Lp00/o;->L:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lp00/q;

    const-string v3, "it"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/16 v7, 0xffb

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lp00/q;->b(Lp00/q;ZLzy/c;ZZI)Lp00/q;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Lp00/n;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lp00/n;-><init>(Lp00/o;ZLq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
