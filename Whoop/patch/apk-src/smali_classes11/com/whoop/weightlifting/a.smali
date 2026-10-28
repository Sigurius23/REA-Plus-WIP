.class public abstract Lcom/whoop/weightlifting/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0087\u0001\u0010\u0017\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00112\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00002\u000e\u0008\u0002\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014H\u0007\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001a;\u0010\u001f\u001a\u00020\u0015\"\u0004\u0008\u0000\u0010\u0019*\u00020\u001a2\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150\u001dH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 \" \u0010%\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$\u00a8\u0006)\u00b2\u0006\u000c\u0010\'\u001a\u00020&8\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010(\u001a\u00020\u00118\nX\u008a\u0084\u0002"
    }
    d2 = {
        "",
        "startDestinationRoute",
        "deepLinkRoute",
        "Leb/u0;",
        "strengthTrainerNavController",
        "Leb/a0;",
        "globalNavController",
        "Lj02/o0;",
        "appNavigator",
        "Lfi0/a;",
        "analytics",
        "Lrr2/c;",
        "crashReporter",
        "Lin2/d;",
        "dispatcherFactory",
        "Landroidx/lifecycle/g0;",
        "lifecycleOwner",
        "",
        "processingEndWorkoutAction",
        "openTab",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onEndWorkoutActionProcessed",
        "s",
        "(Ljava/lang/String;Ljava/lang/String;Leb/u0;Leb/a0;Lj02/o0;Lfi0/a;Lrr2/c;Lin2/d;Landroidx/lifecycle/g0;ZLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;III)V",
        "ARGS",
        "Leb/s0;",
        "Lcom/whoop/weightlifting/StrengthTrainerDestination;",
        "destination",
        "Lkotlin/Function1;",
        "content",
        "N",
        "(Leb/s0;Lcom/whoop/weightlifting/StrengthTrainerDestination;Lkotlin/jvm/functions/Function3;)V",
        "Leb/q;",
        "Lcu2/a;",
        "a",
        "Lkotlin/jvm/functions/Function1;",
        "noNavArgs",
        "Lcu2/t;",
        "sharedViewModel",
        "isExerciseDetailsV2ExperimentEnabled",
        "weightlifting_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/profile/view/edit/form/c;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lcom/whoop/profile/view/edit/form/c;-><init>(I)V

    sput-object v0, Lcom/whoop/weightlifting/a;->a:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method private static final A(Leb/u0;Leb/a0;Ljava/lang/String;Lfi0/a;Lrr2/c;Lin2/d;Lj02/o0;Lcom/whoop/weightlifting/StrengthTrainerDestination$j$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    const-string v0, "it"

    move-object/from16 v1, p7

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p9, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p9, 0x1

    move-object/from16 v9, p8

    check-cast v9, Lp1/q;

    invoke-virtual {v9, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    invoke-static/range {v2 .. v11}, Lsv2/e;->N0(Leb/a0;Leb/a0;Ljava/lang/String;Lfi0/a;Lrr2/c;Lin2/d;Lj02/o0;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Leb/u0;Leb/a0;Lfi0/a;Lp1/t2;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    const-string p6, "entry"

    invoke-static {p4, p6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p6, Lcom/whoop/weightlifting/StrengthTrainerDestination$b;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$b;

    invoke-virtual {p6}, Lcom/whoop/weightlifting/StrengthTrainerDestination;->getNavArgsFactory()Lkotlin/jvm/functions/Function1;

    move-result-object p6

    invoke-interface {p6, p4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p6

    move-object v0, p6

    check-cast v0, Lcom/whoop/weightlifting/StrengthTrainerDestination$b$a;

    invoke-virtual {p4}, Leb/q;->b()Landroidx/lifecycle/k1;

    move-result-object p6

    const-string v1, "linkedExerciseId"

    invoke-virtual {p6, v1}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p6

    move-object v2, p6

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p4}, Leb/q;->b()Landroidx/lifecycle/k1;

    move-result-object v1

    new-instance v3, Lhv2/a;

    invoke-static {p3}, Lcom/whoop/weightlifting/a;->v(Lp1/t2;)Z

    move-result p3

    invoke-direct {v3, p0, p1, p3}, Lhv2/a;-><init>(Leb/a0;Leb/a0;Z)V

    const/4 v6, 0x0

    move-object v4, p2

    move-object v5, p5

    invoke-static/range {v0 .. v6}, Lhv2/i;->M(Lcom/whoop/weightlifting/StrengthTrainerDestination$b$a;Landroidx/lifecycle/k1;Ljava/lang/String;Lhv2/a;Lfi0/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Leb/u0;Lcom/whoop/weightlifting/StrengthTrainerDestination$f$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 2

    const-string v0, "navArgs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    move-object v0, p2

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p3, v0

    :cond_1
    and-int/lit8 v0, p3, 0x13

    const/16 v1, 0x12

    if-eq v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    and-int/lit8 v1, p3, 0x1

    check-cast p2, Lp1/q;

    invoke-virtual {p2, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_3

    and-int/lit8 p3, p3, 0xe

    invoke-static {p1, p0, p2, p3}, Lbv2/c;->j(Lcom/whoop/weightlifting/StrengthTrainerDestination$f$a;Leb/u0;Landroidx/compose/runtime/Composer;I)V

    goto :goto_2

    :cond_3
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Leb/u0;Leb/a0;Lp1/t2;Lcom/whoop/weightlifting/StrengthTrainerDestination$h$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 9

    const-string v0, "navArgs"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p5, 0x6

    if-nez v0, :cond_1

    move-object v0, p4

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p5, v0

    :cond_1
    and-int/lit8 v0, p5, 0x13

    const/16 v1, 0x12

    if-eq v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    and-int/lit8 v1, p5, 0x1

    move-object v6, p4

    check-cast v6, Lp1/q;

    invoke-virtual {v6, v1, v0}, Lp1/q;->U(IZ)Z

    move-result p4

    if-eqz p4, :cond_3

    invoke-static {p2}, Lcom/whoop/weightlifting/a;->v(Lp1/t2;)Z

    move-result v5

    and-int/lit8 v7, p5, 0xe

    const/4 v8, 0x0

    move-object v3, p0

    move-object v4, p1

    move-object v2, p3

    invoke-static/range {v2 .. v8}, Lev2/u;->O0(Lcom/whoop/weightlifting/StrengthTrainerDestination$h$a;Leb/u0;Leb/a0;ZLandroidx/compose/runtime/Composer;II)V

    goto :goto_2

    :cond_3
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Leb/u0;Leb/a0;Lj02/o0;Lfi0/a;Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    const-string v1, "navArgs"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p6, 0x6

    if-nez v1, :cond_1

    move-object v1, p5

    check-cast v1, Lp1/q;

    invoke-virtual {v1, p4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p6, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p6

    :goto_1
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    const/4 v9, 0x0

    if-eq v2, v3, :cond_2

    const/4 v2, 0x1

    goto :goto_2

    :cond_2
    move v2, v9

    :goto_2
    and-int/lit8 v3, v1, 0x1

    move-object v6, p5

    check-cast v6, Lp1/q;

    invoke-virtual {v6, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p4}, Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;->e()Z

    move-result v2

    if-eqz v2, :cond_3

    const v2, -0x49cba294

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    and-int/lit8 v7, v1, 0xe

    const/16 v8, 0x20

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v0, p4

    invoke-static/range {v0 .. v8}, Luu2/w;->J(Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;Leb/a0;Leb/a0;Lj02/o0;Lfi0/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v6, v9}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_3
    const v2, -0x49c68c56

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    and-int/lit8 v1, v1, 0xe

    invoke-static {p4, p0, p1, v6, v1}, Luu2/l;->D(Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;Leb/u0;Leb/a0;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v6, v9}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_4
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final F(Leb/u0;Leb/a0;Lj02/o0;Lp1/t2;Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 3

    const-string v0, "navArgs"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p5, Lp1/q;

    invoke-virtual {p5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_0

    new-instance v0, Lyu2/a;

    invoke-direct {v0, p0, p1, p2}, Lyu2/a;-><init>(Leb/a0;Leb/a0;Lj02/o0;)V

    invoke-virtual {p5, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    move-object p1, v0

    check-cast p1, Lyu2/a;

    invoke-static {p3}, Lcom/whoop/weightlifting/a;->v(Lp1/t2;)Z

    move-result p2

    and-int/lit8 p0, p6, 0xe

    move-object p3, p5

    const/4 p5, 0x0

    move-object v2, p4

    move p4, p0

    move-object p0, v2

    invoke-static/range {p0 .. p5}, Lyu2/e;->x(Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;Lyu2/a;ZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Leb/u0;Lp1/t2;Lcom/whoop/weightlifting/StrengthTrainerDestination$i$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    const-string v0, "navArgs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    move-object v0, p3

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p4, v0

    :cond_1
    and-int/lit8 v0, p4, 0x13

    const/16 v1, 0x12

    if-eq v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    and-int/lit8 v1, p4, 0x1

    move-object v5, p3

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v1, v0}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-static {p1}, Lcom/whoop/weightlifting/a;->v(Lp1/t2;)Z

    move-result v4

    and-int/lit8 v6, p4, 0xe

    const/4 v7, 0x0

    move-object v3, p0

    move-object v2, p2

    invoke-static/range {v2 .. v7}, Lkv2/b;->E(Lcom/whoop/weightlifting/StrengthTrainerDestination$i$a;Leb/u0;ZLandroidx/compose/runtime/Composer;II)V

    goto :goto_2

    :cond_3
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Leb/u0;Lcu2/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p1, v0, :cond_0

    move p1, v2

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    and-int/2addr p3, v2

    check-cast p2, Lp1/q;

    invoke-virtual {p2, p3, p1}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p0, p2, v1}, Ltu2/b;->m(Leb/a0;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Leb/u0;Lj02/o0;ZLc93/a;Ll83/h;Lp1/t2;Lcom/whoop/weightlifting/StrengthTrainerDestination$a$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    const-string v0, "navArgs"

    move-object/from16 v1, p6

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4}, Lcom/whoop/weightlifting/a;->u(Ll83/h;)Lcu2/t;

    move-result-object v2

    invoke-static/range {p5 .. p5}, Lcom/whoop/weightlifting/a;->v(Lp1/t2;)Z

    move-result v7

    and-int/lit8 v9, p8, 0xe

    const/4 v10, 0x0

    move-object v3, p0

    move-object v4, p1

    move v5, p2

    move-object v6, p3

    move-object/from16 v8, p7

    invoke-static/range {v1 .. v10}, Lqu2/h;->n0(Lcom/whoop/weightlifting/StrengthTrainerDestination$a$a;Lcu2/t;Leb/a0;Lj02/o0;ZLc93/a;ZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Lfi0/a;Leb/u0;Leb/a0;Lj02/o0;Lcom/whoop/weightlifting/StrengthTrainerDestination$g$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 15

    move-object/from16 v0, p4

    const-string v1, "navArgs"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p6, 0x6

    if-nez v1, :cond_1

    move-object/from16 v1, p5

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p6, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p6

    :goto_1
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    if-eq v2, v3, :cond_2

    const/4 v2, 0x1

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    and-int/lit8 v3, v1, 0x1

    move-object/from16 v4, p5

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_4

    sget-object v2, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v4, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Landroid/content/Context;

    invoke-static {}, Ldp0/h;->c()Lp1/t1;

    move-result-object v2

    invoke-virtual {v4, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Ldp0/g;

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_3

    new-instance v5, Lvv2/a;

    const/16 v13, 0x40

    const/4 v14, 0x0

    const/4 v12, 0x0

    move-object v9, p0

    move-object/from16 v6, p1

    move-object/from16 v7, p2

    move-object/from16 v10, p3

    invoke-direct/range {v5 .. v14}, Lvv2/a;-><init>(Leb/a0;Leb/a0;Landroid/content/Context;Lfi0/a;Lj02/o0;Ldp0/g;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v5

    :cond_3
    check-cast v2, Lvv2/a;

    and-int/lit8 v1, v1, 0xe

    invoke-static {v0, p0, v2, v4, v1}, Lvv2/e;->x(Lcom/whoop/weightlifting/StrengthTrainerDestination$g$a;Lfi0/a;Lvv2/a;Landroidx/compose/runtime/Composer;I)V

    goto :goto_3

    :cond_4
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Ljava/lang/String;Ljava/lang/String;Leb/u0;Leb/a0;Lj02/o0;Lfi0/a;Lrr2/c;Lin2/d;Landroidx/lifecycle/g0;ZLjava/lang/String;Lc93/a;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 17

    or-int/lit8 v0, p12, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v14

    invoke-static/range {p13 .. p13}, Lp1/x;->L(I)I

    move-result v15

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v16, p14

    move-object/from16 v13, p15

    invoke-static/range {v1 .. v16}, Lcom/whoop/weightlifting/a;->s(Ljava/lang/String;Ljava/lang/String;Leb/u0;Leb/a0;Lj02/o0;Lfi0/a;Lrr2/c;Lin2/d;Landroidx/lifecycle/g0;ZLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static final synthetic L(Ll83/h;)Lcu2/t;
    .locals 0

    invoke-static {p0}, Lcom/whoop/weightlifting/a;->u(Ll83/h;)Lcu2/t;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic M()Lkotlin/jvm/functions/Function1;
    .locals 1

    sget-object v0, Lcom/whoop/weightlifting/a;->a:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method private static final N(Leb/s0;Lcom/whoop/weightlifting/StrengthTrainerDestination;Lkotlin/jvm/functions/Function3;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ARGS:",
            "Ljava/lang/Object;",
            ">(",
            "Leb/s0;",
            "Lcom/whoop/weightlifting/StrengthTrainerDestination<",
            "TARGS;>;",
            "Lkotlin/jvm/functions/Function3;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/whoop/weightlifting/StrengthTrainerDestination;->getRoute()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/weightlifting/StrengthTrainerDestination;->getArguments()Ljava/util/List;

    move-result-object v1

    new-instance v2, Ll;

    const/16 v3, 0xe

    invoke-direct {v2, v3, p2, p1}, Ll;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Lx1/b;

    const/4 p2, 0x1

    const v3, 0x7135c0b2    # 8.9999586E29f

    invoke-direct {p1, v2, p2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/4 p2, 0x4

    invoke-static {p0, v0, v1, p1, p2}, Le93/b;->u(Leb/s0;Ljava/lang/String;Ljava/util/List;Lx1/b;I)V

    return-void
.end method

.method private static final O(Lkotlin/jvm/functions/Function3;Lcom/whoop/weightlifting/StrengthTrainerDestination;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    const-string p4, "navBackStackEntry"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/weightlifting/StrengthTrainerDestination;->getNavArgsFactory()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p0, p1, p3, p2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final P(Leb/q;)Lcu2/a;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lcu2/a;->a:Lcu2/a;

    return-object p0
.end method

.method public static synthetic a(Leb/u0;Leb/a0;Lj02/o0;Lp1/t2;Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/whoop/weightlifting/a;->F(Leb/u0;Leb/a0;Lj02/o0;Lp1/t2;Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ll83/h;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/weightlifting/a;->x(Ll83/h;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V

    return-void
.end method

.method public static synthetic c(Leb/q;)Lcu2/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/weightlifting/a;->P(Leb/q;)Lcu2/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Leb/u0;Leb/a0;Lp1/t2;Lcom/whoop/weightlifting/StrengthTrainerDestination$h$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/whoop/weightlifting/a;->D(Leb/u0;Leb/a0;Lp1/t2;Lcom/whoop/weightlifting/StrengthTrainerDestination$h$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function3;Lcom/whoop/weightlifting/StrengthTrainerDestination;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/whoop/weightlifting/a;->O(Lkotlin/jvm/functions/Function3;Lcom/whoop/weightlifting/StrengthTrainerDestination;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Leb/u0;Leb/a0;Ljava/lang/String;Lfi0/a;Lrr2/c;Lin2/d;Lj02/o0;Lcom/whoop/weightlifting/StrengthTrainerDestination$j$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lcom/whoop/weightlifting/a;->A(Leb/u0;Leb/a0;Ljava/lang/String;Lfi0/a;Lrr2/c;Lin2/d;Lj02/o0;Lcom/whoop/weightlifting/StrengthTrainerDestination$j$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Landroidx/lifecycle/g0;Ll83/h;Lp1/i0;)Lp1/h0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/weightlifting/a;->w(Landroidx/lifecycle/g0;Ll83/h;Lp1/i0;)Lp1/h0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljava/lang/String;Ljava/lang/String;Leb/u0;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/whoop/weightlifting/a;->z(Ljava/lang/String;Ljava/lang/String;Leb/u0;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Leb/u0;Lj02/o0;ZLc93/a;Ll83/h;Lp1/t2;Lcom/whoop/weightlifting/StrengthTrainerDestination$a$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lcom/whoop/weightlifting/a;->I(Leb/u0;Lj02/o0;ZLc93/a;Ll83/h;Lp1/t2;Lcom/whoop/weightlifting/StrengthTrainerDestination$a$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ljava/lang/String;Ljava/lang/String;Leb/u0;Leb/a0;Lj02/o0;Lfi0/a;Lrr2/c;Lin2/d;Landroidx/lifecycle/g0;ZLjava/lang/String;Lc93/a;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p16}, Lcom/whoop/weightlifting/a;->K(Ljava/lang/String;Ljava/lang/String;Leb/u0;Leb/a0;Lj02/o0;Lfi0/a;Lrr2/c;Lin2/d;Landroidx/lifecycle/g0;ZLjava/lang/String;Lc93/a;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Leb/u0;Leb/a0;Lj02/o0;Lfi0/a;Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/whoop/weightlifting/a;->E(Leb/u0;Leb/a0;Lj02/o0;Lfi0/a;Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Leb/u0;Lcu2/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/weightlifting/a;->H(Leb/u0;Lcu2/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Leb/u0;Lcom/whoop/weightlifting/StrengthTrainerDestination$f$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/weightlifting/a;->C(Leb/u0;Lcom/whoop/weightlifting/StrengthTrainerDestination$f$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n()Ll83/a0;
    .locals 1

    invoke-static {}, Lcom/whoop/weightlifting/a;->t()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic o(Leb/u0;Leb/a0;Lfi0/a;Lp1/t2;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/whoop/weightlifting/a;->B(Leb/u0;Leb/a0;Lfi0/a;Lp1/t2;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Ljava/lang/String;Ljava/lang/String;Leb/u0;Leb/a0;Ljava/lang/String;Lfi0/a;Lrr2/c;Lin2/d;Lj02/o0;Lp1/t2;ZLc93/a;Ll83/h;Leb/s0;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p13}, Lcom/whoop/weightlifting/a;->y(Ljava/lang/String;Ljava/lang/String;Leb/u0;Leb/a0;Ljava/lang/String;Lfi0/a;Lrr2/c;Lin2/d;Lj02/o0;Lp1/t2;ZLc93/a;Ll83/h;Leb/s0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lfi0/a;Leb/u0;Leb/a0;Lj02/o0;Lcom/whoop/weightlifting/StrengthTrainerDestination$g$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/whoop/weightlifting/a;->J(Lfi0/a;Leb/u0;Leb/a0;Lj02/o0;Lcom/whoop/weightlifting/StrengthTrainerDestination$g$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Leb/u0;Lp1/t2;Lcom/whoop/weightlifting/StrengthTrainerDestination$i$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/whoop/weightlifting/a;->G(Leb/u0;Lp1/t2;Lcom/whoop/weightlifting/StrengthTrainerDestination$i$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final s(Ljava/lang/String;Ljava/lang/String;Leb/u0;Leb/a0;Lj02/o0;Lfi0/a;Lrr2/c;Lin2/d;Landroidx/lifecycle/g0;ZLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;III)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Leb/u0;",
            "Leb/a0;",
            "Lj02/o0;",
            "Lfi0/a;",
            "Lrr2/c;",
            "Lin2/d;",
            "Landroidx/lifecycle/g0;",
            "Z",
            "Ljava/lang/String;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v14, p13

    move/from16 v15, p15

    const-string v0, "globalNavController"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appNavigator"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "crashReporter"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatcherFactory"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p12

    check-cast v0, Lp1/q;

    const v1, -0x7530be08

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v14, 0x6

    if-nez v1, :cond_2

    and-int/lit8 v1, v15, 0x1

    if-nez v1, :cond_0

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/4 v9, 0x4

    goto :goto_0

    :cond_0
    move-object/from16 v1, p0

    :cond_1
    const/4 v9, 0x2

    :goto_0
    or-int/2addr v9, v14

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v9, v14

    :goto_1
    and-int/lit8 v10, v15, 0x2

    if-eqz v10, :cond_4

    or-int/lit8 v9, v9, 0x30

    :cond_3
    move-object/from16 v13, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v13, v14, 0x30

    if-nez v13, :cond_3

    move-object/from16 v13, p1

    invoke-virtual {v0, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_5

    const/16 v16, 0x20

    goto :goto_2

    :cond_5
    const/16 v16, 0x10

    :goto_2
    or-int v9, v9, v16

    :goto_3
    and-int/lit16 v2, v14, 0x180

    if-nez v2, :cond_8

    and-int/lit8 v2, v15, 0x4

    if-nez v2, :cond_6

    move-object/from16 v2, p2

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_7

    const/16 v16, 0x100

    goto :goto_4

    :cond_6
    move-object/from16 v2, p2

    :cond_7
    const/16 v16, 0x80

    :goto_4
    or-int v9, v9, v16

    goto :goto_5

    :cond_8
    move-object/from16 v2, p2

    :goto_5
    and-int/lit16 v11, v14, 0xc00

    if-nez v11, :cond_a

    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_9

    const/16 v11, 0x800

    goto :goto_6

    :cond_9
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v9, v11

    :cond_a
    and-int/lit16 v11, v14, 0x6000

    if-nez v11, :cond_c

    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_b

    const/16 v11, 0x4000

    goto :goto_7

    :cond_b
    const/16 v11, 0x2000

    :goto_7
    or-int/2addr v9, v11

    :cond_c
    const/high16 v11, 0x30000

    and-int/2addr v11, v14

    if-nez v11, :cond_e

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_d

    const/high16 v11, 0x20000

    goto :goto_8

    :cond_d
    const/high16 v11, 0x10000

    :goto_8
    or-int/2addr v9, v11

    :cond_e
    const/high16 v11, 0x180000

    and-int/2addr v11, v14

    if-nez v11, :cond_10

    invoke-virtual {v0, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_f

    const/high16 v11, 0x100000

    goto :goto_9

    :cond_f
    const/high16 v11, 0x80000

    :goto_9
    or-int/2addr v9, v11

    :cond_10
    const/high16 v11, 0xc00000

    and-int/2addr v11, v14

    if-nez v11, :cond_12

    invoke-virtual {v0, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_11

    const/high16 v11, 0x800000

    goto :goto_a

    :cond_11
    const/high16 v11, 0x400000

    :goto_a
    or-int/2addr v9, v11

    :cond_12
    const/high16 v11, 0x6000000

    and-int/2addr v11, v14

    if-nez v11, :cond_15

    and-int/lit16 v11, v15, 0x100

    if-nez v11, :cond_13

    move-object/from16 v11, p8

    invoke-virtual {v0, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_14

    const/high16 v17, 0x4000000

    goto :goto_b

    :cond_13
    move-object/from16 v11, p8

    :cond_14
    const/high16 v17, 0x2000000

    :goto_b
    or-int v9, v9, v17

    goto :goto_c

    :cond_15
    move-object/from16 v11, p8

    :goto_c
    and-int/lit16 v3, v15, 0x200

    const/high16 v18, 0x30000000

    if-eqz v3, :cond_16

    or-int v9, v9, v18

    move/from16 v12, p9

    goto :goto_e

    :cond_16
    and-int v18, v14, v18

    move/from16 v12, p9

    if-nez v18, :cond_18

    invoke-virtual {v0, v12}, Lp1/q;->h(Z)Z

    move-result v19

    if-eqz v19, :cond_17

    const/high16 v19, 0x20000000

    goto :goto_d

    :cond_17
    const/high16 v19, 0x10000000

    :goto_d
    or-int v9, v9, v19

    :cond_18
    :goto_e
    and-int/lit16 v1, v15, 0x400

    if-eqz v1, :cond_19

    or-int/lit8 v19, p14, 0x6

    move/from16 v20, v19

    move/from16 v19, v1

    move-object/from16 v1, p10

    goto :goto_10

    :cond_19
    and-int/lit8 v19, p14, 0x6

    if-nez v19, :cond_1b

    move/from16 v19, v1

    move-object/from16 v1, p10

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_1a

    const/16 v20, 0x4

    goto :goto_f

    :cond_1a
    const/16 v20, 0x2

    :goto_f
    or-int v20, p14, v20

    goto :goto_10

    :cond_1b
    move/from16 v19, v1

    move-object/from16 v1, p10

    move/from16 v20, p14

    :goto_10
    and-int/lit16 v1, v15, 0x800

    if-eqz v1, :cond_1d

    or-int/lit8 v20, v20, 0x30

    :cond_1c
    move/from16 v21, v1

    move-object/from16 v1, p11

    goto :goto_12

    :cond_1d
    and-int/lit8 v21, p14, 0x30

    if-nez v21, :cond_1c

    move/from16 v21, v1

    move-object/from16 v1, p11

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_1e

    const/16 v16, 0x20

    goto :goto_11

    :cond_1e
    const/16 v16, 0x10

    :goto_11
    or-int v20, v20, v16

    :goto_12
    const v16, 0x12492493

    and-int v1, v9, v16

    const v2, 0x12492492

    const/16 v16, 0x1

    move/from16 v22, v3

    if-ne v1, v2, :cond_20

    and-int/lit8 v1, v20, 0x13

    const/16 v2, 0x12

    if-eq v1, v2, :cond_1f

    goto :goto_13

    :cond_1f
    const/4 v1, 0x0

    goto :goto_14

    :cond_20
    :goto_13
    move/from16 v1, v16

    :goto_14
    and-int/lit8 v2, v9, 0x1

    invoke-virtual {v0, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_3f

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v1, v14, 0x1

    const p12, -0xe000001

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-eqz v1, :cond_25

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v1

    if-eqz v1, :cond_21

    goto :goto_16

    :cond_21
    invoke-virtual {v0}, Lp1/q;->X()V

    and-int/lit8 v1, v15, 0x1

    if-eqz v1, :cond_22

    and-int/lit8 v9, v9, -0xf

    :cond_22
    and-int/lit8 v1, v15, 0x4

    if-eqz v1, :cond_23

    and-int/lit16 v9, v9, -0x381

    :cond_23
    and-int/lit16 v1, v15, 0x100

    if-eqz v1, :cond_24

    and-int v9, v9, p12

    :cond_24
    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v10, p10

    move/from16 v19, v9

    move-object v9, v11

    :goto_15
    move v11, v12

    move-object/from16 v12, p11

    goto/16 :goto_1c

    :cond_25
    :goto_16
    and-int/lit8 v1, v15, 0x1

    if-eqz v1, :cond_26

    sget-object v1, Lcom/whoop/weightlifting/StrengthTrainerDestination$j;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$j;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/StrengthTrainerDestination;->getRoute()Ljava/lang/String;

    move-result-object v1

    and-int/lit8 v9, v9, -0xf

    goto :goto_17

    :cond_26
    move-object/from16 v1, p0

    :goto_17
    if-eqz v10, :cond_27

    const/4 v13, 0x0

    :cond_27
    and-int/lit8 v10, v15, 0x4

    if-eqz v10, :cond_28

    const/4 v10, 0x0

    new-array v3, v10, [Leb/i1;

    invoke-static {v3, v0}, Lge3/g;->S([Leb/i1;Landroidx/compose/runtime/Composer;)Leb/u0;

    move-result-object v3

    and-int/lit16 v9, v9, -0x381

    goto :goto_18

    :cond_28
    move-object/from16 v3, p2

    :goto_18
    and-int/lit16 v10, v15, 0x100

    if-eqz v10, :cond_29

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()Lp1/t1;

    move-result-object v10

    invoke-virtual {v0, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/lifecycle/g0;

    and-int v9, v9, p12

    goto :goto_19

    :cond_29
    move-object v10, v11

    :goto_19
    if-eqz v22, :cond_2a

    const/4 v12, 0x0

    :cond_2a
    if-eqz v19, :cond_2b

    const/4 v11, 0x0

    goto :goto_1a

    :cond_2b
    move-object/from16 v11, p10

    :goto_1a
    move-object/from16 p0, v1

    if-eqz v21, :cond_2d

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_2c

    new-instance v1, Lcu2/l;

    move-object/from16 p1, v3

    const/4 v3, 0x0

    invoke-direct {v1, v3}, Lcu2/l;-><init>(I)V

    invoke-virtual {v0, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_1b

    :cond_2c
    move-object/from16 p1, v3

    :goto_1b
    check-cast v1, Lc93/a;

    move-object/from16 v3, p1

    move/from16 v19, v9

    move-object v9, v10

    move-object v10, v11

    move v11, v12

    move-object v12, v1

    move-object/from16 v1, p0

    goto :goto_1c

    :cond_2d
    move-object/from16 p1, v3

    move/from16 v19, v9

    move-object v9, v10

    move-object v10, v11

    goto :goto_15

    :goto_1c
    invoke-virtual {v0}, Lp1/q;->r()V

    move-object/from16 p0, v10

    const v10, -0x649fae96

    invoke-virtual {v0, v10}, Lp1/q;->f0(I)V

    sget-object v10, Lpf3/a;->b:Lnf3/a;

    if-eqz v10, :cond_3e

    iget-object v10, v10, Lnf3/a;->a:Lwf3/a;

    iget-object v10, v10, Lwf3/a;->d:Lxf3/c;

    move/from16 p1, v11

    const v11, -0x649fad62

    move-object/from16 p2, v12

    const v12, -0x384098

    move-object/from16 p8, v13

    const/4 v13, 0x0

    invoke-static {v0, v11, v0, v13, v12}, Lvl/b;->r(Lp1/q;ILp1/q;ZI)Ljf3/a;

    move-result-object v11

    const/4 v12, 0x0

    invoke-virtual {v0, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v0, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v21

    or-int v13, v13, v21

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v13, :cond_2f

    if-ne v12, v2, :cond_2e

    goto :goto_1e

    :cond_2e
    :goto_1d
    const/4 v10, 0x0

    goto :goto_1f

    :cond_2f
    :goto_1e
    sget-object v12, Ll83/i;->y:Ll83/i;

    new-instance v13, Lcom/whoop/weightlifting/a$a;

    const/4 v14, 0x0

    invoke-direct {v13, v10, v14, v14, v11}, Lcom/whoop/weightlifting/a$a;-><init>(Lxf3/c;Lvf3/a;Lc93/a;Ljf3/a;)V

    invoke-static {v12, v13}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v12

    invoke-virtual {v0, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_1d

    :goto_1f
    invoke-virtual {v0, v10}, Lp1/q;->q(Z)V

    move-object v13, v12

    check-cast v13, Ll83/h;

    invoke-virtual {v0, v10}, Lp1/q;->q(Z)V

    invoke-static {v13}, Lcom/whoop/weightlifting/a;->u(Ll83/h;)Lcu2/t;

    move-result-object v11

    invoke-virtual {v11}, Lcu2/t;->n()Lec3/f2;

    move-result-object v11

    invoke-static {v11, v0, v10}, Lp1/x;->o(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v11

    invoke-interface {v9}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v12

    invoke-virtual {v0, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    invoke-virtual {v0, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v21

    or-int v14, v14, v21

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v14, :cond_30

    if-ne v10, v2, :cond_31

    :cond_30
    new-instance v10, Lcom/whoop/profile/view/edit/n;

    const/4 v14, 0x4

    invoke-direct {v10, v14, v9, v13}, Lcom/whoop/profile/view/edit/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_31
    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-static {v12, v10, v0}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    invoke-static {v13}, Lcom/whoop/weightlifting/a;->u(Ll83/h;)Lcu2/t;

    move-result-object v10

    invoke-virtual {v0, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v12, v14

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v12, :cond_32

    if-ne v14, v2, :cond_33

    :cond_32
    new-instance v14, Lcom/whoop/weightlifting/a$b;

    const/4 v12, 0x0

    invoke-direct {v14, v3, v13, v12}, Lcom/whoop/weightlifting/a$b;-><init>(Leb/u0;Ll83/h;Lq83/d;)V

    invoke-virtual {v0, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_33
    check-cast v14, Lc93/m;

    invoke-static {v0, v14, v10}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz p8, :cond_34

    const-string v10, "deepLinkEntry"

    move-object v14, v10

    goto :goto_20

    :cond_34
    move-object v14, v1

    :goto_20
    and-int/lit8 v10, v19, 0x70

    const/16 v12, 0x20

    if-ne v10, v12, :cond_35

    move/from16 v10, v16

    goto :goto_21

    :cond_35
    const/4 v10, 0x0

    :goto_21
    and-int/lit8 v12, v19, 0xe

    xor-int/lit8 v12, v12, 0x6

    move-object/from16 p9, v9

    const/4 v9, 0x4

    if-le v12, v9, :cond_36

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_37

    :cond_36
    and-int/lit8 v12, v19, 0x6

    if-ne v12, v9, :cond_38

    :cond_37
    move/from16 v12, v16

    goto :goto_22

    :cond_38
    const/4 v12, 0x0

    :goto_22
    or-int/2addr v10, v12

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v10, v12

    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v10, v12

    and-int/lit8 v12, v20, 0xe

    if-ne v12, v9, :cond_39

    move/from16 v9, v16

    goto :goto_23

    :cond_39
    const/4 v9, 0x0

    :goto_23
    or-int/2addr v9, v10

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    invoke-virtual {v0, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    invoke-virtual {v0, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    invoke-virtual {v0, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    invoke-virtual {v0, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    const/high16 v10, 0x70000000

    and-int v10, v19, v10

    const/high16 v12, 0x20000000

    if-ne v10, v12, :cond_3a

    move/from16 v10, v16

    goto :goto_24

    :cond_3a
    const/4 v10, 0x0

    :goto_24
    or-int/2addr v9, v10

    and-int/lit8 v10, v20, 0x70

    const/16 v12, 0x20

    if-ne v10, v12, :cond_3b

    goto :goto_25

    :cond_3b
    const/16 v16, 0x0

    :goto_25
    or-int v9, v9, v16

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_3c

    if-ne v10, v2, :cond_3d

    :cond_3c
    move-object v2, v0

    goto :goto_26

    :cond_3d
    move-object/from16 v8, p0

    move/from16 v11, p1

    move-object/from16 v12, p2

    move-object/from16 v13, p8

    move-object/from16 v16, p9

    move-object v7, v1

    move-object v1, v3

    move-object/from16 p10, v14

    move-object v14, v0

    goto :goto_27

    :goto_26
    new-instance v0, Lcu2/p;

    move-object/from16 v12, p2

    move-object/from16 v16, p9

    move-object v9, v5

    move-object v10, v11

    move-object/from16 p10, v14

    move-object/from16 v5, p0

    move/from16 v11, p1

    move-object v14, v2

    move-object v2, v1

    move-object/from16 v1, p8

    invoke-direct/range {v0 .. v13}, Lcu2/p;-><init>(Ljava/lang/String;Ljava/lang/String;Leb/u0;Leb/a0;Ljava/lang/String;Lfi0/a;Lrr2/c;Lin2/d;Lj02/o0;Lp1/c1;ZLc93/a;Ll83/h;)V

    move-object v13, v1

    move-object v7, v2

    move-object v1, v3

    move-object v8, v5

    invoke-virtual {v14, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v10, v0

    :goto_27
    move-object v4, v10

    check-cast v4, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v0, v19, 0x6

    and-int/lit8 v6, v0, 0xe

    const/4 v3, 0x0

    move-object/from16 v2, p10

    move-object v5, v14

    invoke-static/range {v1 .. v6}, Lhg3/i;->e(Leb/u0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move-object v3, v1

    move-object v1, v7

    move v10, v11

    move-object/from16 v9, v16

    move-object v11, v8

    :goto_28
    move-object v2, v13

    goto :goto_29

    :cond_3e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "KoinApplication has not been started"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3f
    move-object v2, v0

    invoke-virtual {v2}, Lp1/q;->X()V

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object v5, v2

    move-object v9, v11

    move v10, v12

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    goto :goto_28

    :goto_29
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_40

    move-object v4, v0

    new-instance v0, Lcu2/q;

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v13, p13

    move/from16 v14, p14

    move-object/from16 v23, v4

    move-object/from16 v4, p3

    invoke-direct/range {v0 .. v15}, Lcu2/q;-><init>(Ljava/lang/String;Ljava/lang/String;Leb/u0;Leb/a0;Lj02/o0;Lfi0/a;Lrr2/c;Lin2/d;Landroidx/lifecycle/g0;ZLjava/lang/String;Lc93/a;III)V

    move-object/from16 v4, v23

    iput-object v0, v4, Lp1/v1;->d:Lc93/m;

    :cond_40
    return-void
.end method

.method private static final t()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final u(Ll83/h;)Lcu2/t;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/h;",
            ")",
            "Lcu2/t;"
        }
    .end annotation

    invoke-interface {p0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcu2/t;

    return-object p0
.end method

.method private static final v(Lp1/t2;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final w(Landroidx/lifecycle/g0;Ll83/h;Lp1/i0;)Lp1/h0;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lcu2/r;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Lcu2/r;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p0}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    new-instance p1, Lcom/whoop/weightlifting/a$d;

    invoke-direct {p1, p0, p2}, Lcom/whoop/weightlifting/a$d;-><init>(Landroidx/lifecycle/g0;Landroidx/lifecycle/e0;)V

    return-object p1
.end method

.method private static final x(Ll83/h;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Landroidx/lifecycle/v;->ON_START:Landroidx/lifecycle/v;

    if-ne p2, p1, :cond_0

    invoke-static {p0}, Lcom/whoop/weightlifting/a;->u(Ll83/h;)Lcu2/t;

    move-result-object p0

    invoke-virtual {p0}, Lcu2/t;->o()V

    :cond_0
    return-void
.end method

.method private static final y(Ljava/lang/String;Ljava/lang/String;Leb/u0;Leb/a0;Ljava/lang/String;Lfi0/a;Lrr2/c;Lin2/d;Lj02/o0;Lp1/t2;ZLc93/a;Ll83/h;Leb/s0;)Ll83/a0;
    .locals 11

    move-object/from16 v9, p9

    move-object/from16 v10, p13

    const-string v0, "$this$NavHost"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La80/f;

    const/16 v1, 0xa

    invoke-direct {v0, p0, p1, p2, v1}, La80/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance p0, Lx1/b;

    const/4 p1, 0x1

    const v1, -0x65d2a903

    invoke-direct {p0, v0, p1, v1}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/4 v0, 0x6

    const-string v1, "deepLinkEntry"

    const/4 v2, 0x0

    invoke-static {v10, v1, v2, p0, v0}, Le93/b;->u(Leb/s0;Ljava/lang/String;Ljava/util/List;Lx1/b;I)V

    sget-object p0, Lcom/whoop/weightlifting/StrengthTrainerDestination$j;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$j;

    new-instance v0, Lcu2/s;

    const/4 v8, 0x0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    invoke-direct/range {v0 .. v8}, Lcu2/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object v3, v7

    move-object v7, v4

    new-instance v4, Lx1/b;

    const v5, -0x5519419a

    invoke-direct {v4, v0, p1, v5}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {v10, p0, v4}, Lcom/whoop/weightlifting/a;->N(Leb/s0;Lcom/whoop/weightlifting/StrengthTrainerDestination;Lkotlin/jvm/functions/Function3;)V

    sget-object p0, Lcom/whoop/weightlifting/StrengthTrainerDestination$f;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$f;

    new-instance v0, Lcu2/n;

    const/4 v4, 0x1

    invoke-direct {v0, p2, v4}, Lcu2/n;-><init>(Leb/u0;I)V

    new-instance v4, Lx1/b;

    const v5, -0x3a638e19

    invoke-direct {v4, v0, p1, v5}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {v10, p0, v4}, Lcom/whoop/weightlifting/a;->N(Leb/s0;Lcom/whoop/weightlifting/StrengthTrainerDestination;Lkotlin/jvm/functions/Function3;)V

    sget-object p0, Lcom/whoop/weightlifting/StrengthTrainerDestination$h;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$h;

    new-instance v0, La80/f;

    const/16 v4, 0x9

    invoke-direct {v0, p2, p3, v9, v4}, La80/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance v4, Lx1/b;

    const v5, -0x1fadda98

    invoke-direct {v4, v0, p1, v5}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {v10, p0, v4}, Lcom/whoop/weightlifting/a;->N(Leb/s0;Lcom/whoop/weightlifting/StrengthTrainerDestination;Lkotlin/jvm/functions/Function3;)V

    sget-object p0, Lcom/whoop/weightlifting/StrengthTrainerDestination$e;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$e;

    new-instance v0, Lcu2/m;

    invoke-direct {v0, p2, p3, v3, v7}, Lcu2/m;-><init>(Leb/u0;Leb/a0;Lj02/o0;Lfi0/a;)V

    new-instance v4, Lx1/b;

    const v5, -0x4f82717

    invoke-direct {v4, v0, p1, v5}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {v10, p0, v4}, Lcom/whoop/weightlifting/a;->N(Leb/s0;Lcom/whoop/weightlifting/StrengthTrainerDestination;Lkotlin/jvm/functions/Function3;)V

    sget-object p0, Lcom/whoop/weightlifting/StrengthTrainerDestination$d;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$d;

    new-instance v0, Lat2/r;

    const/4 v5, 0x3

    move-object v4, v9

    invoke-direct/range {v0 .. v5}, Lat2/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance v2, Lx1/b;

    const v3, 0x15bd8c6a

    invoke-direct {v2, v0, p1, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {v10, p0, v2}, Lcom/whoop/weightlifting/a;->N(Leb/s0;Lcom/whoop/weightlifting/StrengthTrainerDestination;Lkotlin/jvm/functions/Function3;)V

    sget-object p0, Lcom/whoop/weightlifting/StrengthTrainerDestination$i;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$i;

    new-instance v0, Ll;

    const/16 v2, 0xd

    invoke-direct {v0, v2, p2, v4}, Ll;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lx1/b;

    const v3, 0x30733feb

    invoke-direct {v2, v0, p1, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {v10, p0, v2}, Lcom/whoop/weightlifting/a;->N(Leb/s0;Lcom/whoop/weightlifting/StrengthTrainerDestination;Lkotlin/jvm/functions/Function3;)V

    sget-object p0, Lcom/whoop/weightlifting/StrengthTrainerDestination$c;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$c;

    new-instance v0, Lcu2/n;

    const/4 v2, 0x0

    invoke-direct {v0, p2, v2}, Lcu2/n;-><init>(Leb/u0;I)V

    new-instance v2, Lx1/b;

    const v3, -0x1e924ebd

    invoke-direct {v2, v0, p1, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {v10, p0, v2}, Lcom/whoop/weightlifting/a;->N(Leb/s0;Lcom/whoop/weightlifting/StrengthTrainerDestination;Lkotlin/jvm/functions/Function3;)V

    sget-object p0, Lcom/whoop/weightlifting/StrengthTrainerDestination$a;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$a;

    new-instance v0, Lcu2/o;

    move-object/from16 v2, p8

    move/from16 v3, p10

    move-object/from16 v5, p12

    move-object v6, v4

    move-object/from16 v4, p11

    invoke-direct/range {v0 .. v6}, Lcu2/o;-><init>(Leb/u0;Lj02/o0;ZLc93/a;Ll83/h;Lp1/t2;)V

    move-object v3, v2

    new-instance v2, Lx1/b;

    const v4, 0x65dea6ed

    invoke-direct {v2, v0, p1, v4}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {v10, p0, v2}, Lcom/whoop/weightlifting/a;->N(Leb/s0;Lcom/whoop/weightlifting/StrengthTrainerDestination;Lkotlin/jvm/functions/Function3;)V

    sget-object p0, Lcom/whoop/weightlifting/StrengthTrainerDestination$g;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$g;

    new-instance v0, Lcu2/m;

    invoke-direct {v0, v7, p2, p3, v3}, Lcu2/m;-><init>(Lfi0/a;Leb/u0;Leb/a0;Lj02/o0;)V

    new-instance v2, Lx1/b;

    const v3, -0x7f6ba592

    invoke-direct {v2, v0, p1, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {v10, p0, v2}, Lcom/whoop/weightlifting/a;->N(Leb/s0;Lcom/whoop/weightlifting/StrengthTrainerDestination;Lkotlin/jvm/functions/Function3;)V

    sget-object p0, Lcom/whoop/weightlifting/StrengthTrainerDestination$b;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$b;

    invoke-virtual {p0}, Lcom/whoop/weightlifting/StrengthTrainerDestination;->getRoute()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/weightlifting/StrengthTrainerDestination;->getArguments()Ljava/util/List;

    move-result-object p0

    new-instance v0, Lat2/r;

    const/4 v5, 0x4

    move-object v2, p3

    move-object/from16 v4, p9

    move-object v3, v7

    invoke-direct/range {v0 .. v5}, Lat2/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance p2, Lx1/b;

    const v1, 0x18d6363a

    invoke-direct {p2, v0, p1, v1}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/4 p1, 0x4

    invoke-static {v10, v6, p0, p2, p1}, Le93/b;->u(Leb/s0;Ljava/lang/String;Ljava/util/List;Lx1/b;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Ljava/lang/String;Ljava/lang/String;Leb/u0;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    const-string p5, "it"

    invoke-static {p3, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p4, Lp1/q;

    invoke-virtual {p4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p3

    invoke-virtual {p4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p5

    or-int/2addr p3, p5

    invoke-virtual {p4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p5

    or-int/2addr p3, p5

    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p5

    if-nez p3, :cond_0

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne p5, p3, :cond_1

    :cond_0
    new-instance p5, Lcom/whoop/weightlifting/a$c;

    const/4 p3, 0x0

    invoke-direct {p5, p0, p1, p2, p3}, Lcom/whoop/weightlifting/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;Leb/u0;Lq83/d;)V

    invoke-virtual {p4, p5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast p5, Lc93/m;

    invoke-static {p0, p1, p5, p4}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
