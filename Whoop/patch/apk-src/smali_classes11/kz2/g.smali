.class public final Lkz2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Lh51/f;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lkz2/g;",
        "Lm91/f;",
        "Lh51/f;",
        "<init>",
        "()V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Landroidx/compose/ui/Modifier;Lh51/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "whooplabs_release"
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

.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Lkz2/g;->d()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Lkz2/g;Landroidx/compose/ui/Modifier;Lh51/f;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lkz2/g;->e(Lkz2/g;Landroidx/compose/ui/Modifier;Lh51/f;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final e(Lkz2/g;Landroidx/compose/ui/Modifier;Lh51/f;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Lkz2/g;->c(Landroidx/compose/ui/Modifier;Lh51/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Lh51/f;

    invoke-virtual/range {p0 .. p5}, Lkz2/g;->c(Landroidx/compose/ui/Modifier;Lh51/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public c(Landroidx/compose/ui/Modifier;Lh51/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lh51/f;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v0, p5

    const-string v1, "modifier"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "itemState"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onViewEvent"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p4

    check-cast v1, Lp1/q;

    const v5, -0x646c4179

    invoke-virtual {v1, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v0, 0x30

    if-nez v5, :cond_2

    and-int/lit8 v5, v0, 0x40

    if-nez v5, :cond_0

    invoke-virtual {v1, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_0
    if-eqz v5, :cond_1

    const/16 v5, 0x20

    goto :goto_1

    :cond_1
    const/16 v5, 0x10

    :goto_1
    or-int/2addr v5, v0

    goto :goto_2

    :cond_2
    move v5, v0

    :goto_2
    and-int/lit16 v6, v0, 0x180

    if-nez v6, :cond_4

    invoke-virtual {v1, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x100

    goto :goto_3

    :cond_3
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v5, v6

    :cond_4
    and-int/lit16 v6, v5, 0x91

    const/16 v7, 0x90

    const/4 v8, 0x0

    if-eq v6, v7, :cond_5

    const/4 v6, 0x1

    goto :goto_4

    :cond_5
    move v6, v8

    :goto_4
    and-int/lit8 v7, v5, 0x1

    invoke-virtual {v1, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-static {}, Lx81/e;->p()Lp1/t1;

    move-result-object v6

    invoke-virtual {v1, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v7, "dwl-landing-v2"

    invoke-interface {v6, v7}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v6

    invoke-virtual {v3}, Lh51/f;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    if-eqz v6, :cond_6

    :goto_5
    move v10, v8

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Lh51/f;->l()Z

    move-result v8

    goto :goto_5

    :goto_6
    invoke-virtual {v3}, Lh51/f;->c()Ly71/g;

    move-result-object v8

    invoke-virtual {v3}, Lh51/f;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v3}, Lh51/f;->j()Z

    move-result v9

    invoke-virtual {v3}, Lh51/f;->h()Ljava/util/List;

    move-result-object v11

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-ne v6, v12, :cond_7

    new-instance v6, Lku2/a;

    const/16 v12, 0x18

    invoke-direct {v6, v12}, Lku2/a;-><init>(I)V

    invoke-virtual {v1, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object/from16 v18, v6

    check-cast v18, Lc93/a;

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v12, v6, 0x9

    or-int/2addr v6, v12

    sget v12, Ly71/g;->c:I

    shl-int/lit8 v12, v12, 0xc

    or-int v21, v6, v12

    shl-int/lit8 v5, v5, 0x3

    and-int/lit16 v5, v5, 0x1c00

    or-int/lit16 v5, v5, 0x6000

    const v23, 0x9f06

    move/from16 v22, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    move-object/from16 v17, p3

    move-object/from16 v20, v1

    invoke-static/range {v4 .. v23}, Lh51/d;->m(Lcom/whoop/design/util/TextResource;Li91/a;Lb91/c;Lcom/whoop/design/util/TextResource;Ly71/g;ZZLjava/util/List;Lb2/f;Lkotlin/jvm/functions/Function3;Ly81/e;Li91/a;Lkd1/o;Lkotlin/jvm/functions/Function1;Lc93/a;ZLandroidx/compose/runtime/Composer;III)V

    goto :goto_7

    :cond_8
    move-object/from16 v20, v1

    invoke-virtual/range {v20 .. v20}, Lp1/q;->X()V

    :goto_7
    invoke-virtual/range {v20 .. v20}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_9

    new-instance v0, Lj41/a;

    const/16 v6, 0x1a

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lj41/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method
