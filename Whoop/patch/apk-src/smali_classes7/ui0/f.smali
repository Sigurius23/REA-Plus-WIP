.class public abstract Lui0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0007\u00b2\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lcom/whoop/whoopaction/domain/models/LoadingTreatment;",
        "treatment",
        "Ll83/a0;",
        "c",
        "(Lcom/whoop/whoopaction/domain/models/LoadingTreatment;Landroidx/compose/runtime/Composer;I)V",
        "",
        "currentIndex",
        "arch-v2_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lcom/whoop/whoopaction/domain/models/LoadingTreatment;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lui0/f;->g(Lcom/whoop/whoopaction/domain/models/LoadingTreatment;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/whoopaction/domain/models/LoadingTreatment;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lui0/f;->d(Lcom/whoop/whoopaction/domain/models/LoadingTreatment;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/whoop/whoopaction/domain/models/LoadingTreatment;Landroidx/compose/runtime/Composer;I)V
    .locals 20

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "treatment"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p1

    check-cast v15, Lp1/q;

    const v2, 0x6ed46c97

    invoke-virtual {v15, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v3, 0x2

    const/4 v4, 0x4

    if-nez v2, :cond_2

    and-int/lit8 v2, v1, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v15, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    move v2, v4

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    or-int/2addr v2, v1

    goto :goto_2

    :cond_2
    move v2, v1

    :goto_2
    and-int/lit8 v5, v2, 0x3

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eq v5, v3, :cond_3

    move v3, v6

    goto :goto_3

    :cond_3
    move v3, v7

    :goto_3
    and-int/lit8 v5, v2, 0x1

    invoke-virtual {v15, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-virtual {v0}, Lcom/whoop/whoopaction/domain/models/LoadingTreatment;->getMessages()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_4

    const v2, 0x620a9e7a

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    sget-object v3, Lsz0/p0$c;->e:Lsz0/p0$c;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget v2, Lsz0/p0$c;->f:I

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v5, v5, 0x3

    or-int v16, v2, v5

    const/16 v17, 0x0

    const/16 v18, 0xffc

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v2, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v3 .. v18}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    invoke-virtual {v15, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_c

    new-instance v4, Lui0/e;

    invoke-direct {v4, v0, v1, v2}, Lui0/e;-><init>(Lcom/whoop/whoopaction/domain/models/LoadingTreatment;II)V

    :goto_4
    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_4
    move v5, v7

    const v7, 0x620c46ab

    invoke-virtual {v15, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v5}, Lp1/q;->q(Z)V

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v7, v8, :cond_5

    invoke-static {v5, v15}, Lr80/c;->v(ILp1/q;)Lp1/h1;

    move-result-object v7

    :cond_5
    check-cast v7, Lp1/a1;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v9

    if-le v9, v6, :cond_a

    const v9, 0x620dbf07

    invoke-virtual {v15, v9}, Lp1/q;->e0(I)V

    and-int/lit8 v9, v2, 0xe

    if-eq v9, v4, :cond_7

    and-int/lit8 v2, v2, 0x8

    if-eqz v2, :cond_6

    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_5

    :cond_6
    move v2, v5

    goto :goto_6

    :cond_7
    :goto_5
    move v2, v6

    :goto_6
    invoke-virtual {v15, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_8

    if-ne v4, v8, :cond_9

    :cond_8
    new-instance v4, Lui0/f$a;

    const/4 v2, 0x0

    invoke-direct {v4, v0, v3, v7, v2}, Lui0/f$a;-><init>(Lcom/whoop/whoopaction/domain/models/LoadingTreatment;Ljava/util/List;Lp1/a1;Lq83/d;)V

    invoke-virtual {v15, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v4, Lc93/m;

    sget-object v2, Lcom/whoop/whoopaction/domain/models/LoadingTreatment;->Companion:Lcom/whoop/whoopaction/domain/models/LoadingTreatment$Companion;

    invoke-static {v15, v4, v0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v15, v5}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_a
    const v2, 0x6212072b

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v5}, Lp1/q;->q(Z)V

    :goto_7
    new-instance v2, Lsz0/p0$d;

    invoke-static {v7}, Lui0/f;->e(Lp1/a1;)I

    move-result v4

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-direct {v2, v3}, Lsz0/p0$d;-><init>(Lcom/whoop/design/util/TextResource;)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget v3, Lsz0/p0$d;->f:I

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v5, v5, 0x3

    or-int v16, v3, v5

    const/16 v17, 0x0

    const/16 v18, 0xffc

    const/4 v5, 0x0

    move v3, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move/from16 v19, v3

    move-object v3, v2

    move/from16 v2, v19

    invoke-static/range {v3 .. v18}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    goto :goto_8

    :cond_b
    move v2, v6

    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_c

    new-instance v4, Lui0/e;

    invoke-direct {v4, v0, v1, v2}, Lui0/e;-><init>(Lcom/whoop/whoopaction/domain/models/LoadingTreatment;II)V

    goto/16 :goto_4

    :cond_c
    return-void
.end method

.method private static final d(Lcom/whoop/whoopaction/domain/models/LoadingTreatment;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lui0/f;->c(Lcom/whoop/whoopaction/domain/models/LoadingTreatment;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lp1/a1;)I
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0}, Lp1/h1;->x()I

    move-result p0

    return p0
.end method

.method private static final f(Lp1/a1;I)V
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0, p1}, Lp1/h1;->y(I)V

    return-void
.end method

.method private static final g(Lcom/whoop/whoopaction/domain/models/LoadingTreatment;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lui0/f;->c(Lcom/whoop/whoopaction/domain/models/LoadingTreatment;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic h(Lp1/a1;)I
    .locals 0

    invoke-static {p0}, Lui0/f;->e(Lp1/a1;)I

    move-result p0

    return p0
.end method

.method public static final synthetic i(Lp1/a1;I)V
    .locals 0

    invoke-static {p0, p1}, Lui0/f;->f(Lp1/a1;I)V

    return-void
.end method
