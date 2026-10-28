.class public abstract Lc41/q5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;II)V",
        "design_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lc41/q5;->c(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;II)V
    .locals 30

    move-object/from16 v2, p1

    const-string v0, "title"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v1, 0x7be99f57

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p4, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v3, p3, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int v4, p3, v4

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move/from16 v4, p3

    :goto_1
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_4
    and-int/lit8 v5, v4, 0x13

    const/16 v6, 0x12

    if-eq v5, v6, :cond_5

    const/4 v5, 0x1

    goto :goto_3

    :cond_5
    const/4 v5, 0x0

    :goto_3
    and-int/lit8 v6, v4, 0x1

    invoke-virtual {v0, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_7

    if-eqz v1, :cond_6

    sget-object v1, Lb2/t;->w:Lb2/t;

    move/from16 v29, v4

    move-object v4, v1

    move/from16 v1, v29

    goto :goto_4

    :cond_6
    move v1, v4

    move-object v4, v3

    :goto_4
    shr-int/lit8 v3, v1, 0x3

    and-int/lit8 v3, v3, 0xe

    invoke-static {v2, v0, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v5, Lx81/d;->a:Lx81/d;

    const/4 v6, 0x6

    invoke-virtual {v5, v0, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->P()Lb91/a;

    move-result-object v23

    invoke-virtual {v5, v0, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v5

    shl-int/lit8 v1, v1, 0x3

    and-int/lit8 v26, v1, 0x70

    const/16 v27, 0x0

    const v28, 0x2fff8

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    move-object/from16 v25, v0

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object v1, v4

    goto :goto_5

    :cond_7
    move-object/from16 v25, v0

    invoke-virtual/range {v25 .. v25}, Lp1/q;->X()V

    move-object v1, v3

    :goto_5
    invoke-virtual/range {v25 .. v25}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_8

    new-instance v0, Lc41/p5;

    const/4 v5, 0x0

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lc41/p5;-><init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final c(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lc41/q5;->b(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
