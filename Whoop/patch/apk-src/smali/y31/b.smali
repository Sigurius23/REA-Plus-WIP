.class public final Ly31/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Ly31/e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Ly31/b;",
        "Lm91/f;",
        "Ly31/e;",
        "<init>",
        "()V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Landroidx/compose/ui/Modifier;Ly31/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ly31/b;Landroidx/compose/ui/Modifier;Ly31/e;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ly31/b;->g(Ly31/b;Landroidx/compose/ui/Modifier;Ly31/e;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ldp0/g;Lkotlin/jvm/functions/Function1;Ly31/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ly31/b;->e(Ldp0/g;Lkotlin/jvm/functions/Function1;Ly31/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ly31/e;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ly31/b;->f(Ly31/e;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Ldp0/g;Lkotlin/jvm/functions/Function1;Ly31/a;)Ll83/a0;
    .locals 37

    const-string v0, "button"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ly31/a;->a()Lcom/whoop/navigation/AiAction;

    move-result-object v0

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    if-nez v0, :cond_0

    return-object v2

    :cond_0
    invoke-interface/range {p0 .. p0}, Ldp0/g;->o()Z

    move-result v3

    if-eqz v3, :cond_1

    return-object v2

    :cond_1
    const/4 v3, 0x1

    invoke-static {v0, v3}, Lcom/whoop/coacheverywherecommon/models/a;->b(Lcom/whoop/navigation/AiAction;Z)Lep0/j;

    move-result-object v4

    invoke-virtual {v0}, Lcom/whoop/navigation/AiAction;->getEntrypointExperience()Lcom/whoop/navigation/ChatEntrypointExperience;

    move-result-object v0

    sget-object v3, Lcom/whoop/navigation/ChatEntrypointExperience;->FAB_VOICE:Lcom/whoop/navigation/ChatEntrypointExperience;

    if-ne v0, v3, :cond_2

    sget-object v24, Lcom/whoop/navigation/ChatEntrypointExperience;->QUICK_VOICE:Lcom/whoop/navigation/ChatEntrypointExperience;

    const v28, 0x77ffff

    const/16 v29, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

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

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-static/range {v4 .. v29}, Lep0/j;->b(Lep0/j;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/coacheverywherecommon/models/CoachEducationType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLcom/whoop/navigation/ChatEntrypointExperience;Lcom/whoop/navigation/DrawerPresentation;Lcom/whoop/coacheverywherecommon/models/CoachEntry;ZILjava/lang/Object;)Lep0/j;

    move-result-object v34

    const/16 v35, 0x3

    const/16 v36, 0x0

    const-wide/16 v31, 0x0

    const/16 v33, 0x0

    move-object/from16 v30, p0

    invoke-static/range {v30 .. v36}, Ldp0/g;->f(Ldp0/g;JLjava/lang/String;Lep0/j;ILjava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Ly31/a;->c()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v1}, Ly31/a;->c()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    const/4 v9, 0x3

    const/4 v10, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    move-object v8, v4

    move-object/from16 v4, p0

    invoke-static/range {v4 .. v10}, Ldp0/g;->f(Ldp0/g;JLjava/lang/String;Lep0/j;ILjava/lang/Object;)V

    :goto_0
    return-object v2
.end method

.method private static final f(Ly31/e;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Ly31/e;->a()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Ly31/b;Landroidx/compose/ui/Modifier;Ly31/e;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Ly31/b;->d(Landroidx/compose/ui/Modifier;Ly31/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Ly31/e;

    invoke-virtual/range {p0 .. p5}, Ly31/b;->d(Landroidx/compose/ui/Modifier;Ly31/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public d(Landroidx/compose/ui/Modifier;Ly31/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ly31/e;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v7, p3

    move/from16 v8, p5

    const-string v0, "modifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p4

    check-cast v4, Lp1/q;

    const v0, -0x1346b5eb

    invoke-virtual {v4, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v8, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v8

    goto :goto_1

    :cond_1
    move v0, v8

    :goto_1
    and-int/lit8 v2, v8, 0x30

    if-nez v2, :cond_3

    invoke-virtual {v4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_3
    and-int/lit16 v2, v8, 0x180

    const/16 v3, 0x100

    if-nez v2, :cond_5

    invoke-virtual {v4, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    move v2, v3

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v0, v2

    :cond_5
    and-int/lit16 v2, v0, 0x93

    const/16 v5, 0x92

    const/4 v6, 0x0

    const/4 v9, 0x1

    if-eq v2, v5, :cond_6

    move v2, v9

    goto :goto_4

    :cond_6
    move v2, v6

    :goto_4
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v4, v5, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-static {}, Ldp0/h;->c()Lp1/t1;

    move-result-object v2

    invoke-virtual {v4, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldp0/g;

    invoke-virtual {v4, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    and-int/lit16 v10, v0, 0x380

    if-ne v10, v3, :cond_7

    move v11, v9

    goto :goto_5

    :cond_7
    move v11, v6

    :goto_5
    or-int/2addr v5, v11

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-nez v5, :cond_8

    if-ne v11, v12, :cond_9

    :cond_8
    new-instance v11, Lx30/j1;

    const/4 v5, 0x7

    invoke-direct {v11, v5, v2, v7}, Lx30/j1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v2, v11

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-ne v10, v3, :cond_a

    move v6, v9

    :cond_a
    or-int v3, v5, v6

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_b

    if-ne v5, v12, :cond_c

    :cond_b
    new-instance v5, Lwr0/r;

    const/16 v3, 0x10

    invoke-direct {v5, v3, p2, v7}, Lwr0/r;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object v3, v5

    check-cast v3, Lc93/a;

    and-int/lit8 v5, v0, 0x7e

    const/4 v6, 0x0

    move-object v0, p1

    move-object v1, p2

    invoke-static/range {v0 .. v6}, Ly31/d;->n(Landroidx/compose/ui/Modifier;Ly31/e;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_6

    :cond_d
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_e

    new-instance v0, Lxn2/d;

    const/16 v6, 0x16

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, v7

    move v5, v8

    invoke-direct/range {v0 .. v6}, Lxn2/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method
