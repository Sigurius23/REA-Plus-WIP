.class public abstract Lw61/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Ly61/b;",
        "barState",
        "Ll83/a0;",
        "c",
        "(Ly61/b;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(JLy81/i;)Li2/t;
    .locals 0

    invoke-static {p0, p1, p2}, Lw61/d;->d(JLy81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ly61/b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lw61/d;->e(Ly61/b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ly61/b;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "barState"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p1

    check-cast v6, Lp1/q;

    const v2, -0x1ad073b8

    invoke-virtual {v6, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_2

    and-int/lit8 v2, v1, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v6, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    or-int/2addr v2, v1

    goto :goto_2

    :cond_2
    move v2, v1

    :goto_2
    and-int/lit8 v4, v2, 0x3

    const/4 v5, 0x1

    const/4 v7, 0x0

    if-eq v4, v3, :cond_3

    move v3, v5

    goto :goto_3

    :cond_3
    move v3, v7

    :goto_3
    and-int/2addr v2, v5

    invoke-virtual {v6, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {v0}, Ly61/b;->a()Ly81/e;

    move-result-object v2

    invoke-interface {v2, v6, v7}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v2

    invoke-virtual {v0}, Ly61/b;->c()F

    move-result v9

    new-instance v13, Lp91/a;

    const/16 v15, 0xf

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v10, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v10 .. v16}, Lp91/a;-><init>(FFZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v14, 0x8

    const/4 v15, 0x0

    sget-object v8, Lb2/t;->w:Lb2/t;

    move-object v13, v10

    const/4 v10, 0x0

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static/range {v8 .. v15}, Lp91/e;->f(Landroidx/compose/ui/Modifier;FFFFLp91/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v6, v2, v3}, Lp1/q;->f(J)Z

    move-result v5

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v5, :cond_4

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v8, v5, :cond_5

    :cond_4
    new-instance v8, Lcom/whoop/data/local/room/dao/persistent/d;

    const/4 v5, 0x4

    invoke-direct {v8, v2, v3, v5}, Lcom/whoop/data/local/room/dao/persistent/d;-><init>(JI)V

    invoke-virtual {v6, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v8}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v2

    sget-object v3, Lk91/a;->e:Lk91/a$a;

    int-to-float v5, v7

    invoke-virtual {v3, v5}, Lk91/a$a;->a(F)Lk91/a;

    move-result-object v5

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, v4

    move-object v4, v2

    invoke-static/range {v3 .. v8}, Laz0/b;->b(Landroidx/compose/ui/Modifier;Li91/a;Lk91/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_6
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_7

    new-instance v3, Lbp0/o;

    const/16 v4, 0x9

    invoke-direct {v3, v0, v1, v4}, Lbp0/o;-><init>(Ljava/lang/Object;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final d(JLy81/i;)Li2/t;
    .locals 2

    const-string v0, "$this$brushBackground"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Li2/t;->b:Li2/s;

    const v0, 0x3dcccccd    # 0.1f

    invoke-static {v0, p0, p1}, Li2/x;->c(FJ)J

    move-result-wide p0

    new-instance v0, Li2/x;

    invoke-direct {v0, p0, p1}, Li2/x;-><init>(J)V

    sget-wide p0, Li2/x;->m:J

    new-instance v1, Li2/x;

    invoke-direct {v1, p0, p1}, Li2/x;-><init>(J)V

    filled-new-array {v0, v1}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 p1, 0x0

    const/16 v0, 0xe

    invoke-static {p2, p0, p1, p1, v0}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Ly61/b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lw61/d;->c(Ly61/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
