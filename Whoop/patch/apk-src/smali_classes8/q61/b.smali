.class public abstract Lq61/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0015\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0015\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0006H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\t\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\u000f\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a\u000f\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/runtime/Composer;I)V",
        "Lj61/h;",
        "f",
        "()Lj61/h;",
        "",
        "Lj61/f;",
        "i",
        "()Ljava/util/List;",
        "Lj61/c;",
        "d",
        "",
        "xIndex",
        "Lj71/b$b;",
        "e",
        "(I)Lj71/b$b;",
        "Lj71/b$f;",
        "h",
        "()Lj71/b$f;",
        "Lg61/b;",
        "g",
        "()Lg61/b;",
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

    invoke-static {p0, p1, p2}, Lq61/b;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move/from16 v0, p1

    move-object/from16 v8, p0

    check-cast v8, Lp1/q;

    const v1, -0x883c157

    invoke-virtual {v8, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    and-int/lit8 v4, v0, 0x1

    invoke-virtual {v8, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_1

    sget-object v3, Lb2/t;->w:Lb2/t;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v3, v1, v4}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    new-instance v9, Lj71/c;

    invoke-static {}, Lq61/b;->f()Lj61/h;

    move-result-object v10

    invoke-static {v2}, Lq61/b;->e(I)Lj71/b$b;

    move-result-object v4

    const/4 v5, 0x2

    invoke-static {v5}, Lq61/b;->e(I)Lj71/b$b;

    move-result-object v6

    const/4 v7, 0x3

    invoke-static {v7}, Lq61/b;->e(I)Lj71/b$b;

    move-result-object v11

    const/4 v12, 0x4

    invoke-static {v12}, Lq61/b;->e(I)Lj71/b$b;

    move-result-object v13

    const/4 v14, 0x5

    invoke-static {v14}, Lq61/b;->e(I)Lj71/b$b;

    move-result-object v15

    invoke-static {}, Lq61/b;->h()Lj71/b$f;

    move-result-object v16

    move/from16 p0, v1

    const/4 v1, 0x6

    new-array v1, v1, [Lj71/b;

    aput-object v4, v1, p0

    aput-object v6, v1, v2

    aput-object v11, v1, v5

    aput-object v13, v1, v7

    aput-object v15, v1, v12

    aput-object v16, v1, v14

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    const/16 v14, 0xc

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, Lj71/c;-><init>(Lj61/h;Ljava/util/List;Lcom/whoop/design/models/items/graph/LayoutDirection;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v9

    const/4 v9, 0x6

    const/16 v10, 0x7c

    move-object v1, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v10}, Lb61/k;->p(Landroidx/compose/ui/Modifier;Lj71/c;Lj71/c;Lj71/c;ZLb61/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v2, Lm22/t;

    const/16 v3, 0x1b

    invoke-direct {v2, v0, v3}, Lm22/t;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lq61/b;->b(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d()Ljava/util/List;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lj61/c;",
            ">;"
        }
    .end annotation

    new-instance v0, Lj61/c;

    sget-object v6, Lj61/a;->X_AXIS:Lj61/a;

    sget-object v7, Lj61/e;->REGION_HIGHLIGHT:Lj61/e;

    const/16 v14, 0x1f90

    const/4 v15, 0x0

    const/high16 v1, 0x3f200000    # 0.625f

    const/4 v2, 0x0

    const v3, 0x3e124925

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v0 .. v15}, Lj61/c;-><init>(FFFFLy81/e;Lj61/a;Lj61/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lj61/b;ZFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lj61/c;

    sget-object v7, Lj61/a;->Y_AXIS:Lj61/a;

    sget-object v8, Lj61/e;->AVERAGE_MARKER:Lj61/e;

    const/16 v15, 0x1f90

    const/16 v16, 0x0

    const/high16 v3, 0x3f400000    # 0.75f

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v1 .. v16}, Lj61/c;-><init>(FFFFLy81/e;Lj61/a;Lj61/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lj61/b;ZFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v0, v1}, [Lj61/c;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private static final e(I)Lj71/b$b;
    .locals 15

    new-instance v0, Lj71/b$b;

    new-instance v1, Le71/b;

    int-to-float p0, p0

    const/high16 v2, 0x41000000    # 8.0f

    div-float/2addr p0, v2

    const v2, 0x3f59999a    # 0.85f

    mul-float v3, p0, v2

    sget-object v2, Lq61/b$a;->w:Lq61/b$a;

    invoke-static {v2}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v2

    invoke-static {v2}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v4

    const/16 v9, 0x79

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Le71/b;-><init>(FFLi91/a;FFLa71/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    new-instance v6, Lu61/d;

    const-string v1, "14.0"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget-object v1, Lq61/b$b;->w:Lq61/b$b;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v8

    const/16 v11, 0x8

    const/4 v12, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lu61/d;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Le71/a;

    const/16 v13, 0x190

    const/4 v14, 0x0

    const v7, 0x3d99999a    # 0.075f

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v10, v6

    move v6, p0

    invoke-direct/range {v3 .. v14}, Le71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;FFLjava/lang/Float;Lu61/d;Lu61/d;La71/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/16 v5, 0xc

    const/4 v6, 0x0

    const-string v2, "id"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lj71/b$b;-><init>(Ljava/util/List;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final f()Lj61/h;
    .locals 17

    invoke-static {}, Lq61/b;->i()Ljava/util/List;

    move-result-object v6

    new-instance v5, Lh2/c;

    const/4 v0, 0x0

    const v1, 0x3d23d70a    # 0.04f

    invoke-direct {v5, v0, v1, v0, v1}, Lh2/c;-><init>(FFFF)V

    invoke-static {}, Lq61/b;->d()Ljava/util/List;

    move-result-object v7

    new-instance v8, Lj61/g;

    const/16 v13, 0xf

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v8 .. v14}, Lj61/g;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lq61/b;->g()Lg61/b;

    move-result-object v4

    new-instance v0, Lj61/h;

    const/16 v15, 0x1f07

    const/16 v16, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v0 .. v16}, Lj61/h;-><init>(Lg61/b;Lg61/b;Lg61/b;Lg61/b;Lh2/c;Ljava/util/List;Ljava/util/List;Lj61/g;ZZLg61/g;JFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final g()Lg61/b;
    .locals 17

    new-instance v0, Lg61/b;

    new-instance v1, Lyy0/c;

    const-string v2, "Sun"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v3, "1"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/16 v8, 0x34

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/high16 v5, 0x3e000000    # 0.125f

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lyy0/c;

    const-string v3, "Mon"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const-string v4, "2"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const/16 v9, 0x34

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/high16 v6, 0x3e800000    # 0.25f

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lyy0/c;

    const-string v4, "Tue"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const-string v5, "3"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const/16 v10, 0x34

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/high16 v7, 0x3ec00000    # 0.375f

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v11}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lyy0/c;

    const-string v5, "Wed"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const-string v6, "4"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const/16 v11, 0x34

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/high16 v8, 0x3f000000    # 0.5f

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v4 .. v12}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lyy0/c;

    const-string v6, "Thu"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const-string v7, "5"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const/16 v12, 0x34

    const/4 v13, 0x0

    const/4 v8, 0x0

    const/high16 v9, 0x3f200000    # 0.625f

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v5 .. v13}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lyy0/c;

    const-string v7, "Fri"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const-string v8, "6"

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const/16 v13, 0x34

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/high16 v10, 0x3f400000    # 0.75f

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v6 .. v14}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v7, "Sat"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    sget-object v7, Lq61/b$c;->w:Lq61/b$c;

    invoke-static {v7}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v11

    const-string v7, "7"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    new-instance v7, Lyy0/c;

    const/16 v15, 0x30

    const/16 v16, 0x0

    const/high16 v12, 0x3f600000    # 0.875f

    const/4 v13, 0x0

    move-object v8, v7

    invoke-direct/range {v8 .. v16}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array/range {v1 .. v7}, [Lyy0/c;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/16 v9, 0xfc

    const/4 v10, 0x0

    const v1, 0x3dcccccd    # 0.1f

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v10}, Lg61/b;-><init>(FLjava/util/List;FLg61/d;Lcom/whoop/design/util/TextResource;ZLg61/c;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final h()Lj71/b$f;
    .locals 12

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Li93/j;

    const/4 v2, 0x1

    const/4 v3, 0x7

    invoke-direct {v0, v2, v3, v2}, Li93/h;-><init>(III)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lm83/e0;

    invoke-virtual {v2}, Lm83/e0;->nextInt()I

    move-result v2

    new-instance v3, Lq61/c;

    int-to-float v2, v2

    const/high16 v4, 0x41000000    # 8.0f

    div-float v4, v2, v4

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/i0;->i()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    sget-object v2, Lq61/b$d;->w:Lq61/b$d;

    invoke-static {v2}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v8

    const/16 v10, 0x8

    const/4 v11, 0x0

    const v5, 0x3cf5c28f    # 0.03f

    const/4 v7, 0x0

    const v9, 0x3d8f5c29    # 0.07f

    invoke-direct/range {v3 .. v11}, Lq61/c;-><init>(FFLjava/lang/Integer;Ly81/e;Ly81/e;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v0, Lj71/b$f;

    const-string v2, "icon"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xc

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lj71/b$f;-><init>(Ljava/util/List;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final i()Ljava/util/List;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lj61/f;",
            ">;"
        }
    .end annotation

    new-instance v0, Lj61/f;

    const/16 v8, 0x7e

    const/4 v9, 0x0

    const v1, 0x3f59999a    # 0.85f

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lj61/f;

    const/16 v9, 0x7e

    const/4 v10, 0x0

    const v2, 0x3f2e147b    # 0.68f

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lj61/f;

    const/16 v10, 0x7e

    const/4 v11, 0x0

    const v3, 0x3f028f5c    # 0.51f

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v11}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lj61/f;

    const/16 v11, 0x7e

    const/4 v12, 0x0

    const v4, 0x3eae147b    # 0.34f

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v12}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lj61/f;

    const/16 v12, 0x7e

    const/4 v13, 0x0

    const v5, 0x3e2e147b    # 0.17f

    const/4 v11, 0x0

    invoke-direct/range {v4 .. v13}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lj61/f;

    const/16 v13, 0x7e

    const/4 v14, 0x0

    const/4 v6, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v5 .. v14}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array/range {v0 .. v5}, [Lj61/f;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
