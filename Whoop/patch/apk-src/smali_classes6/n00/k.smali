.class public final Ln00/k;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# static fields
.field public static final Q:J

.field public static final synthetic R:I


# instance fields
.field public final E:Lwz/m1;

.field public final F:Lkotlin/jvm/functions/Function1;

.field public final G:Lkotlin/jvm/functions/Function1;

.field public final H:Lwz/n0;

.field public final I:Lkotlin/jvm/functions/Function1;

.field public final J:Lb30/i0;

.field public final K:Lg40/f3;

.field public final L:Lg40/z1;

.field public final M:Lg40/f3;

.field public final N:Lec3/h2;

.field public final O:Lec3/r1;

.field public P:Z

.field public final w:Lwz/g0;

.field public final x:Lyz/b;

.field public final y:Lqy/d;

.field public final z:Lxz/x;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/4 v0, 0x1

    sget-object v1, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v0

    sput-wide v0, Ln00/k;->Q:J

    return-void
.end method

.method public constructor <init>(Lwz/g0;Lyz/b;Lqy/d;Lxz/x;Landroidx/lifecycle/k1;Lwz/m1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lwz/n0;Lkotlin/jvm/functions/Function1;Lb30/i0;)V
    .locals 11

    move-object/from16 v2, p6

    move-object/from16 v3, p7

    move-object/from16 v4, p8

    move-object/from16 v5, p9

    move-object/from16 v6, p10

    const-string v7, "configuration"

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "linkEventsReporter"

    invoke-static {p2, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "logger"

    invoke-static {p3, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "linkAccountManager"

    invoke-static {p4, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "dismissalCoordinator"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "navigateAndClearStack"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "moveToWeb"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "linkLaunchMode"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "dismissWithResult"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, Ln00/k;->w:Lwz/g0;

    iput-object p2, p0, Ln00/k;->x:Lyz/b;

    iput-object p3, p0, Ln00/k;->y:Lqy/d;

    iput-object p4, p0, Ln00/k;->z:Lxz/x;

    iput-object v2, p0, Ln00/k;->E:Lwz/m1;

    iput-object v3, p0, Ln00/k;->F:Lkotlin/jvm/functions/Function1;

    iput-object v4, p0, Ln00/k;->G:Lkotlin/jvm/functions/Function1;

    iput-object v5, p0, Ln00/k;->H:Lwz/n0;

    iput-object v6, p0, Ln00/k;->I:Lkotlin/jvm/functions/Function1;

    move-object/from16 v0, p11

    iput-object v0, p0, Ln00/k;->J:Lb30/i0;

    const-string v0, "use_link_configuration_customer_info"

    move-object/from16 v1, p5

    invoke-virtual {v1, v0}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v2, p1, Lwz/g0;->F:Lwz/f0;

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move-object v2, v3

    :goto_1
    sget-object v0, Lg40/z0;->F:Ljava/util/regex/Pattern;

    if-eqz v2, :cond_2

    iget-object v0, v2, Lwz/f0;->x:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object v0, v3

    :goto_2
    new-instance v4, Lg40/f3;

    new-instance v5, Lg40/z0;

    const/4 v6, 0x0

    invoke-direct {v5, v6, v1}, Lg40/z0;-><init>(ZI)V

    const/4 v7, 0x4

    invoke-direct {v4, v5, v0, v3, v7}, Lg40/f3;-><init>(Lg40/l3;Ljava/lang/String;Ldo0/c;I)V

    iput-object v4, p0, Ln00/k;->K:Lg40/f3;

    if-eqz v2, :cond_3

    iget-object v0, v2, Lwz/f0;->y:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object v0, v3

    :goto_3
    if-nez v0, :cond_4

    const-string v0, ""

    :cond_4
    if-eqz v2, :cond_5

    iget-object v4, v2, Lwz/f0;->z:Ljava/lang/String;

    goto :goto_4

    :cond_5
    move-object v4, v3

    :goto_4
    const/16 v5, 0x1c

    invoke-static {v0, v5, v4, v6, v6}, Lg40/l0;->a(Ljava/lang/String;ILjava/lang/String;ZZ)Lg40/z1;

    move-result-object v0

    iput-object v0, p0, Ln00/k;->L:Lg40/z1;

    if-eqz v2, :cond_6

    iget-object v0, v2, Lwz/f0;->w:Ljava/lang/String;

    goto :goto_5

    :cond_6
    move-object v0, v3

    :goto_5
    new-instance v4, Lg40/f3;

    new-instance v5, Lg40/l1;

    invoke-direct {v5}, Lg40/l1;-><init>()V

    invoke-direct {v4, v5, v0, v3, v7}, Lg40/f3;-><init>(Lg40/l3;Ljava/lang/String;Ldo0/c;I)V

    iput-object v4, p0, Ln00/k;->M:Lg40/f3;

    if-eqz v2, :cond_8

    iget-object v0, v2, Lwz/f0;->x:Ljava/lang/String;

    if-eqz v0, :cond_8

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_6

    :cond_7
    sget-object v0, Ln00/d;->y:Ln00/d;

    goto :goto_7

    :cond_8
    :goto_6
    sget-object v0, Ln00/d;->w:Ln00/d;

    :goto_7
    if-eqz v2, :cond_c

    invoke-static {p1}, Lse/g;->C(Lwz/g0;)Z

    move-result v4

    iget-object v5, v2, Lwz/f0;->x:Ljava/lang/String;

    if-eqz v5, :cond_c

    invoke-static {v5}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_9

    goto :goto_8

    :cond_9
    iget-object v5, v2, Lwz/f0;->y:Ljava/lang/String;

    if-eqz v5, :cond_c

    invoke-static {v5}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_a

    goto :goto_8

    :cond_a
    if-eqz v4, :cond_b

    iget-object v2, v2, Lwz/f0;->w:Ljava/lang/String;

    if-eqz v2, :cond_c

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_b

    goto :goto_8

    :cond_b
    move v2, v1

    goto :goto_9

    :cond_c
    :goto_8
    move v2, v6

    :goto_9
    iget-object v4, p1, Lwz/g0;->x:Ljava/lang/String;

    invoke-static {p1}, Lse/g;->C(Lwz/g0;)Z

    move-result v5

    iget-boolean p1, p1, Lwz/g0;->X:Z

    new-instance v7, Ln00/c;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move/from16 p7, p1

    move-object/from16 p8, v0

    move/from16 p5, v2

    move-object p4, v4

    move/from16 p6, v5

    move-object p3, v7

    move/from16 p9, v8

    move-object/from16 p10, v9

    move-object/from16 p11, v10

    invoke-direct/range {p3 .. p11}, Ln00/c;-><init>(Ljava/lang/String;ZZZLn00/d;ZLzy/c;Ljava/lang/String;)V

    move-object p1, p3

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Ln00/k;->N:Lec3/h2;

    invoke-static {p1}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Ln00/k;->O:Lec3/r1;

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance v0, Ln00/e;

    invoke-direct {v0, p0, v3, v6}, Ln00/e;-><init>(Ln00/k;Lq83/d;I)V

    const/4 v2, 0x3

    invoke-static {p1, v3, v3, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance v0, Ln00/e;

    invoke-direct {v0, p0, v3, v1}, Ln00/e;-><init>(Ln00/k;Lq83/d;I)V

    invoke-static {p1, v3, v3, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance v0, Ln00/e;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v3, v1}, Ln00/e;-><init>(Ln00/k;Lq83/d;I)V

    invoke-static {p1, v3, v3, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p1, Lyz/d;->w:Lyz/d;

    invoke-virtual {p2, p1, v3}, Lyz/b;->a(Ldz/i;Ljava/util/Map;)V

    return-void
.end method

.method public static final g(Ln00/k;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Ln00/f;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ln00/f;

    iget v1, v0, Ln00/f;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ln00/f;->z:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Ln00/f;

    invoke-direct {v0, p0, p2}, Ln00/f;-><init>(Ln00/k;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Ln00/f;->x:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ln00/f;->z:I

    const/4 v7, 0x2

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v2, :cond_2

    if-ne v1, v7, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v6, Ln00/f;->w:Ln00/k;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p1, p2, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_2

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p2, Ln00/d;->x:Ln00/d;

    invoke-virtual {p0, p2}, Ln00/k;->q(Ln00/d;)V

    iget-object v1, p0, Ln00/k;->z:Lxz/x;

    sget-object v3, Ly00/c2;->x:Ly00/c2;

    iget-object p2, p0, Ln00/k;->w:Lwz/g0;

    invoke-virtual {p2}, Lwz/g0;->b()Ljava/lang/String;

    move-result-object v5

    iput-object p0, v6, Ln00/f;->w:Ln00/k;

    iput v2, v6, Ln00/f;->z:I

    const/4 v4, 0x1

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Lxz/x;->k(Ljava/lang/String;Ly00/c2;ZLjava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_3

    :cond_4
    :goto_2
    sget-object p2, Ln00/d;->w:Ln00/d;

    invoke-virtual {p0, p2}, Ln00/k;->q(Ln00/d;)V

    invoke-static {p1}, Ls30/b;->w(Ljava/lang/Object;)Lxz/m0;

    move-result-object p1

    new-instance p2, Ld0/d;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {p2, p0, v2, v1}, Ld0/d;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object v2, v6, Ln00/f;->w:Ln00/k;

    iput v7, v6, Ln00/f;->z:I

    invoke-virtual {p0, p1, p2, v6}, Ln00/k;->l(Lxz/m0;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_5

    :goto_3
    return-object v0

    :cond_5
    :goto_4
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final j(Ln00/k;Ls83/c;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Ln00/k;->L:Lg40/z1;

    instance-of v1, p1, Ln00/g;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Ln00/g;

    iget v2, v1, Ln00/g;->F:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Ln00/g;->F:I

    :goto_0
    move-object v9, v1

    goto :goto_1

    :cond_0
    new-instance v1, Ln00/g;

    invoke-direct {v1, p0, p1}, Ln00/g;-><init>(Ln00/k;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object p1, v9, Ln00/g;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v9, Ln00/g;->F:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-boolean p0, v9, Ln00/g;->y:Z

    iget-object v1, v9, Ln00/g;->x:Lwz/m1;

    iget-object v0, v9, Ln00/g;->w:Ln00/k;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_2

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_4

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ln00/k;->E:Lwz/m1;

    iget-boolean v10, p1, Lwz/m1;->a:Z

    const/4 v2, 0x0

    iput-boolean v2, p1, Lwz/m1;->a:Z

    :try_start_1
    iget-object v2, p0, Ln00/k;->z:Lxz/x;

    iget-object v4, p0, Ln00/k;->K:Lg40/f3;

    iget-object v4, v4, Lg40/f3;->n:Lec3/r1;

    iget-object v4, v4, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v4}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    iget-object v5, v0, Lg40/z1;->f:Lec3/r1;

    iget-object v5, v5, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v5}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const-string v6, "phoneNumber"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v0, Lg40/z1;->k:Ln53/e;

    iget-object v6, v6, Ln53/e;->y:Ll83/e;

    check-cast v6, Lc93/a;

    invoke-interface {v6}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg40/k2;

    invoke-virtual {v6, v5}, Lg40/k2;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lg40/z1;->u()Ljava/lang/String;

    move-result-object v0

    const-string v6, "PHONE_NUMBER"

    iget-object v7, p0, Ln00/k;->M:Lg40/f3;

    iget-object v7, v7, Lg40/f3;->n:Lec3/r1;

    iget-object v7, v7, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v7}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    sget-object v8, Lj00/e0;->z:Lj00/e0;

    iput-object p0, v9, Ln00/g;->w:Ln00/k;

    iput-object p1, v9, Ln00/g;->x:Lwz/m1;

    iput-boolean v10, v9, Ln00/g;->y:Z

    iput v3, v9, Ln00/g;->F:I

    move-object v3, v4

    move-object v4, v5

    move-object v5, v0

    invoke-virtual/range {v2 .. v9}, Lxz/x;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj00/e0;Ls83/c;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v1, p1

    move-object p1, v0

    move-object v0, p0

    move p0, v10

    :goto_2
    iput-boolean p0, v1, Lwz/m1;->a:Z

    invoke-static {p1}, Ls30/b;->w(Ljava/lang/Object;)Lxz/m0;

    move-result-object p0

    instance-of p1, p0, Lxz/i0;

    if-eqz p1, :cond_4

    iget-object p1, v0, Ln00/k;->G:Lkotlin/jvm/functions/Function1;

    check-cast p0, Lxz/i0;

    iget-object p0, p0, Lxz/i0;->a:Ljava/lang/Throwable;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_4
    instance-of p1, p0, Lxz/j0;

    if-eqz p1, :cond_5

    check-cast p0, Lxz/j0;

    iget-object p0, p0, Lxz/j0;->a:Ljava/lang/Throwable;

    invoke-static {v0, p0}, Ln00/k;->p(Ln00/k;Ljava/lang/Throwable;)V

    iget-object p1, v0, Ln00/k;->x:Lyz/b;

    invoke-virtual {p1, p0}, Lyz/b;->e(Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_5
    instance-of p1, p0, Lxz/l0;

    if-eqz p1, :cond_6

    check-cast p0, Lxz/l0;

    iget-object p0, p0, Lxz/l0;->a:Ld00/l;

    invoke-virtual {v0, p0}, Ln00/k;->n(Ld00/l;)V

    iget-object p0, v0, Ln00/k;->x:Lyz/b;

    invoke-virtual {p0}, Lyz/b;->d()V

    goto :goto_3

    :cond_6
    sget-object p1, Lxz/k0;->a:Lxz/k0;

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    new-instance p0, Lcom/stripe/android/link/NoLinkAccountFoundException;

    invoke-direct {p0}, Lcom/stripe/android/link/NoLinkAccountFoundException;-><init>()V

    invoke-static {v0, p0}, Ln00/k;->p(Ln00/k;Ljava/lang/Throwable;)V

    iget-object p0, v0, Ln00/k;->x:Lyz/b;

    new-instance p1, Lcom/stripe/android/link/NoLinkAccountFoundException;

    invoke-direct {p1}, Lcom/stripe/android/link/NoLinkAccountFoundException;-><init>()V

    invoke-virtual {p0, p1}, Lyz/b;->e(Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_7
    instance-of p1, p0, Lxz/h0;

    if-eqz p1, :cond_8

    check-cast p0, Lxz/h0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Ln00/d;->w:Ln00/d;

    invoke-virtual {v0, p1}, Ln00/k;->q(Ln00/d;)V

    iget-object p0, p0, Lxz/h0;->a:Ljava/lang/Throwable;

    const p1, 0x7f1410f1

    invoke-static {p1}, Ls4/i;->h(I)Lzy/b;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Ln00/k;->o(Ljava/lang/Throwable;Lzy/c;)V

    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_8
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :catchall_1
    move-exception v0

    move-object p0, v0

    move-object v1, p1

    move-object p1, p0

    move p0, v10

    :goto_4
    iput-boolean p0, v1, Lwz/m1;->a:Z

    throw p1
.end method

.method public static synthetic p(Ln00/k;Ljava/lang/Throwable;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lx30/s0;->H(Ljava/lang/Throwable;)Lzy/c;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, p1, v0}, Ln00/k;->o(Ljava/lang/Throwable;Lzy/c;)V

    return-void
.end method


# virtual methods
.method public final l(Lxz/m0;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;
    .locals 2

    instance-of v0, p1, Lxz/i0;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-eqz v0, :cond_0

    check-cast p1, Lxz/i0;

    iget-object p1, p1, Lxz/i0;->a:Ljava/lang/Throwable;

    iget-object p2, p0, Ln00/k;->G:Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    :cond_0
    instance-of v0, p1, Lxz/j0;

    if-eqz v0, :cond_1

    sget-object p2, Ln00/d;->y:Ln00/d;

    invoke-virtual {p0, p2}, Ln00/k;->q(Ln00/d;)V

    check-cast p1, Lxz/j0;

    iget-object p1, p1, Lxz/j0;->a:Ljava/lang/Throwable;

    invoke-static {p0, p1}, Ln00/k;->p(Ln00/k;Ljava/lang/Throwable;)V

    return-object v1

    :cond_1
    instance-of v0, p1, Lxz/l0;

    if-eqz v0, :cond_2

    check-cast p1, Lxz/l0;

    iget-object p1, p1, Lxz/l0;->a:Ld00/l;

    invoke-virtual {p0, p1}, Ln00/k;->n(Ld00/l;)V

    iget-object p1, p0, Ln00/k;->x:Lyz/b;

    invoke-virtual {p1}, Lyz/b;->d()V

    return-object v1

    :cond_2
    sget-object v0, Lxz/k0;->a:Lxz/k0;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p2, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_3

    return-object p1

    :cond_3
    return-object v1

    :cond_4
    instance-of p2, p1, Lxz/h0;

    if-eqz p2, :cond_5

    check-cast p1, Lxz/h0;

    sget-object p2, Ln00/d;->w:Ln00/d;

    invoke-virtual {p0, p2}, Ln00/k;->q(Ln00/d;)V

    iget-object p1, p1, Lxz/h0;->a:Ljava/lang/Throwable;

    const p2, 0x7f1410f1

    invoke-static {p2}, Ls4/i;->h(I)Lzy/b;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ln00/k;->o(Ljava/lang/Throwable;Lzy/c;)V

    return-object v1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final n(Ld00/l;)V
    .locals 8

    iget-boolean v0, p1, Ld00/l;->K:Z

    if-eqz v0, :cond_0

    sget-object v0, Lwz/y0;->d:Lwz/y0;

    goto :goto_0

    :cond_0
    iget-boolean v0, p1, Ld00/l;->J:Z

    if-eqz v0, :cond_1

    sget-object v0, Lwz/d1;->d:Lwz/d1;

    goto :goto_0

    :cond_1
    sget-object v0, Lwz/c1;->d:Lwz/c1;

    :goto_0
    iget-object v1, p0, Ln00/k;->H:Lwz/n0;

    instance-of v1, v1, Lwz/i0;

    if-eqz v1, :cond_2

    sget-object v1, Lwz/c1;->d:Lwz/c1;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v2, Lwz/n;

    new-instance v3, Lwz/d;

    const/4 v0, 0x0

    invoke-direct {v3, p1, v0}, Lwz/d;-><init>(Ld00/l;Lwz/c;)V

    const/4 v6, 0x0

    const/16 v7, 0xc

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lwz/n;-><init>(Lwz/e;Lwz/u0;Ly00/j0;Ljava/lang/Boolean;I)V

    iget-object p1, p0, Ln00/k;->I:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_2
    sget-object p1, Lwz/c1;->d:Lwz/c1;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Ln00/k;->J:Lb30/i0;

    invoke-virtual {p1}, Lb30/i0;->invoke()Ljava/lang/Object;

    return-void

    :cond_3
    iget-object p1, p0, Ln00/k;->F:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final o(Ljava/lang/Throwable;Lzy/c;)V
    .locals 8

    if-eqz p1, :cond_0

    iget-object v0, p0, Ln00/k;->y:Lqy/d;

    const-string v1, "SignUpViewModel Error: "

    invoke-virtual {v0, v1, p1}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    iget-object p1, p0, Ln00/k;->N:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ln00/c;

    const-string v2, "it"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/16 v7, 0xbf

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, p2

    invoke-static/range {v1 .. v7}, Ln00/c;->a(Ln00/c;ZLn00/d;ZLzy/c;Ljava/lang/String;I)Ln00/c;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    move-object p2, v5

    goto :goto_0
.end method

.method public final q(Ln00/d;)V
    .locals 9

    :goto_0
    iget-object v0, p0, Ln00/k;->N:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ln00/c;

    const-string v3, "old"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x0

    const/16 v8, 0xef

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v4, p1

    invoke-static/range {v2 .. v8}, Ln00/c;->a(Ln00/c;ZLn00/d;ZLzy/c;Ljava/lang/String;I)Ln00/c;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    move-object p1, v4

    goto :goto_0
.end method
