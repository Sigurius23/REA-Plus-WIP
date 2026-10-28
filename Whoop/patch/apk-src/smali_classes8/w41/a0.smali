.class public abstract Lw41/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lw41/z$b;",
        "mapState",
        "Ll83/a0;",
        "b",
        "(Lw41/z$b;Landroidx/compose/runtime/Composer;I)V",
        "Landroid/content/Context;",
        "context",
        "",
        "drawableRes",
        "Landroid/graphics/Bitmap;",
        "d",
        "(Landroid/content/Context;I)Landroid/graphics/Bitmap;",
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
.method public static synthetic a(Lw41/z$b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lw41/a0;->c(Lw41/z$b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lw41/z$b;Landroidx/compose/runtime/Composer;I)V
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "mapState"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, 0x4596e6f5

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v1, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    and-int/lit8 v5, v3, 0x3

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eq v5, v4, :cond_2

    move v4, v6

    goto :goto_2

    :cond_2
    move v4, v7

    :goto_2
    and-int/2addr v3, v6

    invoke-virtual {v2, v3, v4}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {v0}, Lw41/b;->c(Lw41/z$b;)Ljava/util/List;

    move-result-object v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    const/4 v5, 0x6

    invoke-virtual {v4, v2, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->k0()J

    move-result-wide v4

    invoke-static {v4, v5, v3, v2, v7}, Lbi/g;->f(JLjava/util/List;Landroidx/compose/runtime/Composer;I)V

    new-instance v3, Leu/j0;

    invoke-virtual {v0}, Lw41/z$b;->f()Lw41/w;

    move-result-object v4

    invoke-static {v4}, Lw41/p;->a(Lw41/w;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v4

    invoke-direct {v3, v4}, Leu/j0;-><init>(Lcom/google/android/gms/maps/model/LatLng;)V

    sget-object v4, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v2, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/content/Context;

    invoke-virtual {v0}, Lw41/z$b;->e()I

    move-result v6

    invoke-static {v5, v6}, Lw41/a0;->d(Landroid/content/Context;I)Landroid/graphics/Bitmap;

    move-result-object v5

    invoke-static {v5}, Ls6/a;->e(Landroid/graphics/Bitmap;)Lwp/b;

    move-result-object v5

    invoke-virtual {v0}, Lw41/z$b;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static {v6, v2, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v10

    const/4 v15, 0x0

    const/16 v17, 0x8

    move-object v6, v4

    const/4 v4, 0x0

    move-object v8, v6

    move v9, v7

    move-object v7, v5

    const-wide/16 v5, 0x0

    move-object v11, v8

    move v12, v9

    const-wide/16 v8, 0x0

    move-object v13, v11

    const/4 v11, 0x0

    move v14, v12

    const/4 v12, 0x0

    move-object/from16 v16, v13

    const/4 v13, 0x0

    move/from16 v18, v14

    const/4 v14, 0x0

    move-object/from16 v0, v16

    move-object/from16 v16, v2

    move-object v2, v0

    move/from16 v0, v18

    invoke-static/range {v3 .. v17}, Lo73/a;->h(Leu/j0;FJLwp/b;JLjava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v3, v16

    new-instance v4, Leu/j0;

    invoke-virtual/range {p0 .. p0}, Lw41/z$b;->b()Lw41/w;

    move-result-object v5

    invoke-static {v5}, Lw41/p;->a(Lw41/w;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v5

    invoke-direct {v4, v5}, Leu/j0;-><init>(Lcom/google/android/gms/maps/model/LatLng;)V

    invoke-virtual {v3, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    invoke-virtual/range {p0 .. p0}, Lw41/z$b;->a()I

    move-result v5

    invoke-static {v2, v5}, Lw41/a0;->d(Landroid/content/Context;I)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-static {v2}, Ls6/a;->e(Landroid/graphics/Bitmap;)Lwp/b;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lw41/z$b;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v3, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v10

    move-object v3, v4

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    invoke-static/range {v3 .. v17}, Lo73/a;->h(Leu/j0;FJLwp/b;JLjava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_3

    :cond_3
    move-object/from16 v16, v2

    invoke-virtual/range {v16 .. v16}, Lp1/q;->X()V

    :goto_3
    invoke-virtual/range {v16 .. v16}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v2, Lsl0/j2;

    const/16 v3, 0x19

    move-object/from16 v4, p0

    invoke-direct {v2, v4, v1, v3}, Lsl0/j2;-><init>(Ljava/lang/Object;II)V

    iput-object v2, v0, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method private static final c(Lw41/z$b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lw41/a0;->b(Lw41/z$b;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final d(Landroid/content/Context;I)Landroid/graphics/Bitmap;
    .locals 4
    .annotation runtime Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    const-string p1, "getDrawable(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/graphics/Canvas;

    invoke-direct {p1}, Landroid/graphics/Canvas;-><init>()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    const-string v1, "createBitmap(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v3, v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-object v0
.end method
