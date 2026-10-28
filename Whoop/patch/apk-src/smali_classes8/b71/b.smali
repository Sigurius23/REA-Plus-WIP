.class public abstract Lb71/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001aU\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000bH\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/runtime/Composer;I)V",
        "Lj71/c;",
        "d",
        "(Landroidx/compose/runtime/Composer;I)Lj71/c;",
        "Lcom/whoop/design/util/TextResource;",
        "topText",
        "bottomText",
        "Ly81/e;",
        "color",
        "",
        "xPercent",
        "yPercent",
        "widthPercent",
        "heightPercent",
        "Lc71/a;",
        "e",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFFFLandroidx/compose/runtime/Composer;II)Lc71/a;",
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
.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lb71/b;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, -0x2b7cb88a

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-static {v2, v1, v0}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lfy1/i;->a:Lfy1/i;

    invoke-static {v1, v2, v0}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v1, v2}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v1, Lb3/v1;->l:Lp1/u2;

    iget-object v2, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v1, v0, v2}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v0

    new-array v0, v0, [Lp1/u1;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp1/u1;

    new-instance v1, Lb71/b$a;

    invoke-direct {v1}, Lb71/b$a;-><init>()V

    const v2, -0x124c2861

    invoke-static {v2, p0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p0, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, La11/h;

    const/16 v1, 0x1a

    invoke-direct {v0, p1, v1}, La11/h;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lb71/b;->b(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final d(Landroidx/compose/runtime/Composer;I)Lj71/c;
    .locals 25

    new-instance v0, Lj71/c;

    const/16 v6, 0x1c

    const/4 v7, 0x0

    const-string v1, "TrendPlot Graph"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Le61/i;->s(Ljava/lang/String;ZZZZILjava/lang/Object;)Lj61/h;

    move-result-object v8

    const/16 v23, 0x1ffd

    const/16 v24, 0x0

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

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    invoke-static/range {v8 .. v24}, Lj61/h;->b(Lj61/h;Lg61/b;Lg61/b;Lg61/b;Lg61/b;Lh2/c;Ljava/util/List;Ljava/util/List;Lj61/g;ZZLg61/g;JFILjava/lang/Object;)Lj61/h;

    move-result-object v1

    const-string v2, "53"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget-object v5, Ly81/f;->BRAND_WHITE:Ly81/f;

    const v11, 0x1b6d80

    const/4 v12, 0x0

    const v6, 0x3e19999a    # 0.15f

    const/high16 v7, 0x3f000000    # 0.5f

    const v8, 0x3de147ae    # 0.11f

    const v9, 0x3c23d70a    # 0.01f

    move-object/from16 v10, p0

    invoke-static/range {v3 .. v12}, Lb71/b;->e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFFFLandroidx/compose/runtime/Composer;II)Lc71/a;

    move-result-object v3

    const-string v4, "54"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const-string v4, "+2%"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget-object v8, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    const v14, 0x1b6d80

    const/4 v15, 0x0

    const v9, 0x3e8a3d71    # 0.27f

    const v10, 0x3f051eb8    # 0.52f

    const v11, 0x3de147ae    # 0.11f

    const v12, 0x3c23d70a    # 0.01f

    move-object/from16 v13, p0

    invoke-static/range {v6 .. v15}, Lb71/b;->e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFFFLandroidx/compose/runtime/Composer;II)Lc71/a;

    move-result-object v4

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const-string v16, "-2%"

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget-object v8, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    const v9, 0x3ec7ae14    # 0.39f

    const/high16 v10, 0x3f000000    # 0.5f

    invoke-static/range {v6 .. v15}, Lb71/b;->e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFFFLandroidx/compose/runtime/Composer;II)Lc71/a;

    move-result-object v17

    move-object v15, v8

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const v13, 0x1b6d80

    const/4 v14, 0x0

    const v8, 0x3f028f5c    # 0.51f

    const/high16 v9, 0x3f000000    # 0.5f

    const v10, 0x3de147ae    # 0.11f

    const v11, 0x3c23d70a    # 0.01f

    move-object/from16 v12, p0

    move-object v7, v5

    move-object v5, v2

    invoke-static/range {v5 .. v14}, Lb71/b;->e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFFFLandroidx/compose/runtime/Composer;II)Lc71/a;

    move-result-object v2

    const-string v5, "49"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const-string v5, "-4%"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const v14, 0x1b6d80

    move-object v8, v15

    const/4 v15, 0x0

    const v9, 0x3f2147ae    # 0.63f

    const v10, 0x3eeb851f    # 0.46f

    const v11, 0x3de147ae    # 0.11f

    const v12, 0x3c23d70a    # 0.01f

    move-object/from16 v13, p0

    invoke-static/range {v6 .. v15}, Lb71/b;->e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFFFLandroidx/compose/runtime/Composer;II)Lc71/a;

    move-result-object v5

    const-string v6, "47"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const/high16 v9, 0x3f400000    # 0.75f

    const v10, 0x3ee147ae    # 0.44f

    invoke-static/range {v6 .. v15}, Lb71/b;->e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFFFLandroidx/compose/runtime/Composer;II)Lc71/a;

    move-result-object v18

    move-object/from16 v16, v2

    move-object v13, v3

    move-object v14, v4

    move-object/from16 v15, v17

    move-object/from16 v17, v5

    filled-new-array/range {v13 .. v18}, [Lc71/a;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    new-instance v3, Lj71/b$k;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const-string v5, "trend preview"

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lj71/b$k;-><init>(Ljava/util/List;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lj71/c;-><init>(Lj61/h;Ljava/util/List;Lcom/whoop/design/models/items/graph/LayoutDirection;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFFFLandroidx/compose/runtime/Composer;II)Lc71/a;
    .locals 13

    and-int/lit8 v0, p9, 0x1

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p0

    :cond_0
    move-object v1, p0

    and-int/lit8 p0, p9, 0x2

    if-eqz p0, :cond_1

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    :cond_1
    move-object v2, p1

    and-int/lit8 p0, p9, 0x4

    if-eqz p0, :cond_2

    sget-object p0, Ly81/f;->BRAND_WHITE:Ly81/f;

    move-object v4, p0

    goto :goto_0

    :cond_2
    move-object v4, p2

    :goto_0
    and-int/lit8 p0, p9, 0x8

    const/4 p1, 0x0

    if-eqz p0, :cond_3

    move v6, p1

    goto :goto_1

    :cond_3
    move/from16 v6, p3

    :goto_1
    and-int/lit8 p0, p9, 0x10

    if-eqz p0, :cond_4

    move v7, p1

    goto :goto_2

    :cond_4
    move/from16 v7, p4

    :goto_2
    and-int/lit8 p0, p9, 0x20

    if-eqz p0, :cond_5

    move v8, p1

    goto :goto_3

    :cond_5
    move/from16 v8, p5

    :goto_3
    and-int/lit8 p0, p9, 0x40

    if-eqz p0, :cond_6

    move v9, p1

    goto :goto_4

    :cond_6
    move/from16 v9, p6

    :goto_4
    new-instance v0, Lc71/a;

    const/16 v11, 0x204

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v10, 0x0

    move-object v5, v4

    invoke-direct/range {v0 .. v12}, Lc71/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Ly81/e;FFFFLcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
