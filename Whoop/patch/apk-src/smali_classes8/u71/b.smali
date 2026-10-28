.class public abstract Lu71/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lu71/j;",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Lu71/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lu71/j;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lu71/b;->e(Lu71/j;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lu71/b;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lu71/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu71/j;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v0, "itemState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v9, p2

    check-cast v9, Lp1/q;

    const p2, 0x194c6df6

    invoke-virtual {v9, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    const/4 v0, 0x2

    if-nez p2, :cond_1

    invoke-virtual {v9, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    move p2, v0

    :goto_0
    or-int/2addr p2, p3

    goto :goto_1

    :cond_1
    move p2, p3

    :goto_1
    and-int/lit8 v1, p4, 0x2

    if-eqz v1, :cond_2

    or-int/lit8 p2, p2, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_4

    invoke-virtual {v9, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_2

    :cond_3
    const/16 v2, 0x10

    :goto_2
    or-int/2addr p2, v2

    :cond_4
    :goto_3
    and-int/lit8 v2, p2, 0x13

    const/16 v3, 0x12

    if-eq v2, v3, :cond_5

    const/4 v2, 0x1

    goto :goto_4

    :cond_5
    const/4 v2, 0x0

    :goto_4
    and-int/lit8 v4, p2, 0x1

    invoke-virtual {v9, v4, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_b

    if-eqz v1, :cond_7

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne p1, v1, :cond_6

    new-instance p1, Lu0/r;

    const/16 v1, 0x1d

    invoke-direct {p1, v1}, Lu0/r;-><init>(I)V

    invoke-virtual {v9, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast p1, Lkotlin/jvm/functions/Function1;

    :cond_7
    move-object v8, p1

    invoke-virtual {p0}, Lu71/j;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p0}, Lu71/j;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move p1, v3

    new-instance v3, Ly71/g;

    invoke-virtual {p0}, Lu71/j;->e()I

    move-result v4

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5, v0, v5}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lu71/j;->a()Lu71/e;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lu71/e;->a()Ly71/g;

    move-result-object v0

    goto :goto_5

    :cond_8
    move-object v0, v5

    :goto_5
    invoke-virtual {p0}, Lu71/j;->a()Lu71/e;

    move-result-object v4

    if-eqz v4, :cond_9

    invoke-virtual {v4}, Lu71/e;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    goto :goto_6

    :cond_9
    move-object v4, v5

    :goto_6
    invoke-virtual {p0}, Lu71/j;->a()Lu71/e;

    move-result-object v6

    if-eqz v6, :cond_a

    invoke-virtual {v6}, Lu71/e;->b()Lhy0/o1;

    move-result-object v5

    :cond_a
    move-object v6, v5

    sget-object v7, Lc41/g;->ONBOARDING:Lc41/g;

    const/high16 v5, 0x1c00000

    shl-int/lit8 p1, p2, 0x12

    and-int/2addr p1, v5

    const/high16 p2, 0x180000

    or-int v10, p1, p2

    const/4 v11, 0x0

    move-object v5, v0

    invoke-static/range {v1 .. v11}, Lc41/e;->e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/g;Lcom/whoop/design/util/TextResource;Ly71/g;Lhy0/o1;Lc41/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v8

    goto :goto_7

    :cond_b
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v2, p1

    :goto_7
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_c

    new-instance v0, Lu71/a;

    const/4 v5, 0x0

    move-object v1, p0

    move v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lu71/a;-><init>(Lu71/j;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final d(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lu71/j;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lu71/b;->c(Lu71/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
