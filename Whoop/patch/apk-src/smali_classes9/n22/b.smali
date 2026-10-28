.class public abstract Ln22/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u001d\u0010\u0003\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u000f\u0010\u0005\u001a\u00020\u0001H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a)\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c*\u00020\u00072\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\"\u001a\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\"\u001a\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0013\u00a8\u0006\u0017"
    }
    d2 = {
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "iconContent",
        "e",
        "(Lc93/m;Landroidx/compose/runtime/Composer;I)V",
        "h",
        "(Landroidx/compose/runtime/Composer;I)V",
        "Ld0/l0;",
        "",
        "index",
        "",
        "label",
        "Lp1/t2;",
        "",
        "j",
        "(Ld0/l0;ILjava/lang/String;Landroidx/compose/runtime/Composer;I)Lp1/t2;",
        "",
        "Li2/x;",
        "a",
        "Ljava/util/List;",
        "gradientBorderColors",
        "b",
        "gradientFillColors",
        "pairing-ui_release"
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
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li2/x;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li2/x;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const-wide v0, 0xff66bcffL

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    new-instance v2, Li2/x;

    invoke-direct {v2, v0, v1}, Li2/x;-><init>(J)V

    const-wide v0, 0xff4c9bd9L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    new-instance v3, Li2/x;

    invoke-direct {v3, v0, v1}, Li2/x;-><init>(J)V

    const-wide v0, 0xff0093e7L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    new-instance v4, Li2/x;

    invoke-direct {v4, v0, v1}, Li2/x;-><init>(J)V

    filled-new-array {v2, v3, v4}, [Li2/x;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ln22/b;->a:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li2/x;

    iget-wide v1, v1, Li2/x;->a:J

    const v3, 0x3e4ccccd    # 0.2f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v4, Li2/x;

    invoke-direct {v4, v1, v2}, Li2/x;-><init>(J)V

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li2/x;

    iget-wide v1, v1, Li2/x;->a:J

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v5, Li2/x;

    invoke-direct {v5, v1, v2}, Li2/x;-><init>(J)V

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/x;

    iget-wide v0, v0, Li2/x;->a:J

    invoke-static {v3, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v0

    new-instance v2, Li2/x;

    invoke-direct {v2, v0, v1}, Li2/x;-><init>(J)V

    filled-new-array {v4, v5, v2}, [Li2/x;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ln22/b;->b:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ln22/b;->i(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ln22/b;->g(Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Lk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ln22/b;->f(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ld0/o0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ln22/b;->k(Ld0/o0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lc93/m;Landroidx/compose/runtime/Composer;I)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/m;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "iconContent"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p1

    check-cast v8, Lp1/q;

    const v2, -0x6b3dff8

    invoke-virtual {v8, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v11, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v11

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v3, v2, 0x3

    const/4 v13, 0x0

    if-eq v3, v11, :cond_2

    const/4 v3, 0x1

    goto :goto_2

    :cond_2
    move v3, v13

    :goto_2
    and-int/lit8 v4, v2, 0x1

    invoke-virtual {v8, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_b

    const-string v3, "pulse"

    invoke-static {v3, v8, v13}, Ld0/f;->s(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ld0/l0;

    move-result-object v3

    sget-object v4, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v8, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-virtual {v8, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    iget v4, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    sget-object v6, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v8, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly3/c;

    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    const/4 v14, 0x3

    div-int/2addr v4, v14

    invoke-interface {v6, v4}, Ly3/c;->e0(I)F

    move-result v4

    invoke-interface {v6, v4}, Ly3/c;->q0(F)F

    move-result v5

    const v4, -0x293b7f31

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15, v14}, Ljava/util/ArrayList;-><init>(I)V

    move v4, v13

    :goto_3
    if-ge v4, v14, :cond_3

    const v6, 0x3dcccccd    # 0.1f

    mul-float/2addr v6, v5

    sget-object v7, Ld0/b0;->c:Lb23/h;

    const/16 v9, 0xfa0

    invoke-static {v9, v13, v7, v11}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v7

    sget-object v9, Ld0/v0;->w:Ld0/v0;

    mul-int/lit16 v10, v4, 0xfa0

    div-int/2addr v10, v14

    mul-int/lit8 v10, v10, -0x1

    int-to-long v11, v10

    move v10, v6

    new-instance v6, Ld0/i0;

    invoke-direct {v6, v7, v9, v11, v12}, Ld0/i0;-><init>(Ld0/y;Ld0/v0;J)V

    const-string v7, "radius"

    invoke-static {v4, v7}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/16 v9, 0x1008

    move v11, v4

    move v4, v10

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Ld0/f;->g(Ld0/l0;FFLd0/i0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/j0;

    move-result-object v4

    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v11, 0x1

    const/4 v11, 0x2

    goto :goto_3

    :cond_3
    invoke-virtual {v8, v13}, Lp1/q;->q(Z)V

    const v4, -0x293b387c

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v14}, Ljava/util/ArrayList;-><init>(I)V

    move v5, v13

    :goto_4
    const/16 v6, 0x8

    if-ge v5, v14, :cond_4

    const-string v7, "fill"

    invoke-static {v5, v7}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v3, v5, v7, v8, v6}, Ln22/b;->j(Ld0/l0;ILjava/lang/String;Landroidx/compose/runtime/Composer;I)Lp1/t2;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_4
    invoke-virtual {v8, v13}, Lp1/q;->q(Z)V

    const v5, -0x293b1e9a

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v14}, Ljava/util/ArrayList;-><init>(I)V

    move v7, v13

    :goto_5
    if-ge v7, v14, :cond_5

    const-string v9, "border"

    invoke-static {v7, v9}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v3, v7, v9, v8, v6}, Ln22/b;->j(Ld0/l0;ILjava/lang/String;Landroidx/compose/runtime/Composer;I)Lp1/t2;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    :cond_5
    invoke-virtual {v8, v13}, Lp1/q;->q(Z)V

    const/high16 v3, 0x3f800000    # 1.0f

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v9, 0x1bd

    int-to-float v9, v9

    invoke-static {v9, v7}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v10, Lb2/e;->E:Lb2/m;

    invoke-static {v10, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v10

    iget-wide v11, v8, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v8, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v14, v8, Lp1/q;->S:Z

    if-eqz v14, :cond_6

    invoke-virtual {v8, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_6
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_6
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v8, v13, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v8, v10, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v12, v8, Lp1/q;->S:Z

    if-nez v12, :cond_7

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_8

    :cond_7
    invoke-static {v11, v8, v11, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v8, v10, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v9, v3}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v8, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v8, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-virtual {v8, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_9

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v7, v6, :cond_a

    :cond_9
    new-instance v7, Ljs2/h;

    const/16 v6, 0x1a

    invoke-direct {v7, v15, v4, v5, v6}, Ljs2/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/4 v4, 0x6

    invoke-static {v3, v7, v8, v4}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    and-int/lit8 v2, v2, 0xe

    const/4 v3, 0x1

    invoke-static {v2, v0, v8, v3}, Ldc/b;->z(ILc93/m;Lp1/q;Z)V

    goto :goto_7

    :cond_b
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_c

    new-instance v3, Ln22/a;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v1, v4}, Ln22/a;-><init>(Lc93/m;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final f(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lk2/e;)Ll83/a0;
    .locals 18

    move-object/from16 v0, p3

    const-string v1, "$this$Canvas"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p0

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    const/4 v1, 0x0

    move v9, v1

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v10, v9, 0x1

    if-ltz v9, :cond_1

    check-cast v1, Lp1/t2;

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    const v2, 0x3dcccccd    # 0.1f

    cmpg-float v3, v1, v2

    if-gez v3, :cond_0

    goto :goto_1

    :cond_0
    move v2, v1

    :goto_1
    sget-object v11, Li2/t;->b:Li2/s;

    sget-object v12, Ln22/b;->b:Ljava/util/List;

    invoke-interface {v0}, Lk2/e;->B0()J

    move-result-wide v13

    const/16 v16, 0x8

    move v15, v2

    invoke-static/range {v11 .. v16}, Li2/s;->g(Li2/s;Ljava/util/List;JFI)Li2/u0;

    move-result-object v1

    invoke-interface {v0}, Lk2/e;->B0()J

    move-result-wide v3

    move-object/from16 v12, p1

    invoke-interface {v12, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lp1/t2;

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    const/16 v7, 0x60

    sget-object v6, Lk2/h;->a:Lk2/h;

    invoke-static/range {v0 .. v7}, Lk2/e;->G(Lk2/e;Li2/t;FJFLk2/f;I)V

    sget-object v12, Ln22/b;->a:Ljava/util/List;

    invoke-interface {v0}, Lk2/e;->B0()J

    move-result-wide v3

    const/16 v1, 0x20

    shr-long/2addr v3, v1

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    sub-float/2addr v3, v2

    invoke-interface {v0}, Lk2/e;->B0()J

    move-result-wide v4

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    sub-float/2addr v4, v2

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v13, v3

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    shl-long/2addr v13, v1

    and-long/2addr v3, v6

    or-long/2addr v13, v3

    invoke-interface {v0}, Lk2/e;->B0()J

    move-result-wide v3

    shr-long/2addr v3, v1

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    add-float/2addr v3, v2

    invoke-interface {v0}, Lk2/e;->B0()J

    move-result-wide v4

    and-long/2addr v4, v6

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    add-float/2addr v4, v2

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    move v5, v1

    move/from16 p0, v2

    int-to-long v1, v3

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    shl-long/2addr v1, v5

    and-long/2addr v3, v6

    or-long v15, v1, v3

    const/16 v17, 0x8

    invoke-static/range {v11 .. v17}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object v1

    invoke-interface {v0}, Lk2/e;->B0()J

    move-result-wide v3

    new-instance v6, Lk2/i;

    const/4 v2, 0x2

    int-to-float v2, v2

    invoke-interface {v0, v2}, Ly3/c;->q0(F)F

    move-result v12

    const/16 v16, 0x0

    const/16 v17, 0x1e

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v11, v6

    invoke-direct/range {v11 .. v17}, Lk2/i;-><init>(FFIILi2/t0;I)V

    move-object/from16 v11, p2

    invoke-interface {v11, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp1/t2;

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v5

    const/16 v7, 0x60

    move/from16 v2, p0

    invoke-static/range {v0 .. v7}, Lk2/e;->G(Lk2/e;Li2/t;FJFLk2/f;I)V

    move-object/from16 v0, p3

    move v9, v10

    goto/16 :goto_0

    :cond_1
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Ln22/b;->e(Lc93/m;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h(Landroidx/compose/runtime/Composer;I)V
    .locals 8

    move-object v5, p0

    check-cast v5, Lp1/q;

    const p0, -0x21a46eac

    invoke-virtual {v5, p0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    and-int/lit8 v0, p1, 0x1

    invoke-virtual {v5, v0, p0}, Lp1/q;->U(IZ)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lx81/d;->a:Lx81/d;

    invoke-virtual {p0}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/a;->n()I

    move-result v0

    const/4 v1, 0x6

    invoke-static {v0, v5, v1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v0

    sget v1, Lx81/d;->b:I

    invoke-virtual {p0, v5, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->y()J

    move-result-wide v3

    const/16 p0, 0xa

    int-to-float p0, p0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr p0, v1

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {p0, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v6, 0x1b0

    const/4 v7, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v7}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lm22/t;

    const/4 v1, 0x3

    invoke-direct {v0, p1, v1}, Lm22/t;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final i(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Ln22/b;->h(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Ld0/l0;ILjava/lang/String;Landroidx/compose/runtime/Composer;I)Lp1/t2;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld0/l0;",
            "I",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Lp1/t2;"
        }
    .end annotation

    move-object v5, p3

    check-cast v5, Lp1/q;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne p3, v0, :cond_0

    new-instance p3, Lmx1/o;

    const/16 v0, 0xe

    invoke-direct {p3, v0}, Lmx1/o;-><init>(I)V

    invoke-virtual {v5, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast p3, Lkotlin/jvm/functions/Function1;

    invoke-static {p3}, Ld0/f;->r(Lkotlin/jvm/functions/Function1;)Ld0/p0;

    move-result-object p3

    sget-object v0, Ld0/v0;->w:Ld0/v0;

    mul-int/lit16 p1, p1, 0xfa0

    div-int/lit8 p1, p1, 0x3

    mul-int/lit8 p1, p1, -0x1

    int-to-long v1, p1

    new-instance v3, Ld0/i0;

    invoke-direct {v3, p3, v0, v1, v2}, Ld0/i0;-><init>(Ld0/y;Ld0/v0;J)V

    and-int/lit8 p1, p4, 0xe

    or-int/lit16 p1, p1, 0x11b8

    shl-int/lit8 p3, p4, 0x6

    const p4, 0xe000

    and-int/2addr p3, p4

    or-int v6, p1, p3

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    move-object v0, p0

    move-object v4, p2

    invoke-static/range {v0 .. v7}, Ld0/f;->g(Ld0/l0;FFLd0/i0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/j0;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Ld0/o0;)Ll83/a0;
    .locals 5

    const-string v0, "$this$keyframes"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xfa0

    iput v0, p0, Ld0/o0;->a:I

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1}, Ld0/o0;->a(ILjava/lang/Float;)Ld0/n0;

    move-result-object v2

    sget-object v3, Ld0/b0;->c:Lb23/h;

    iput-object v3, v2, Ld0/n0;->b:Ld0/z;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/16 v4, 0x535

    invoke-virtual {p0, v4, v2}, Ld0/o0;->a(ILjava/lang/Float;)Ld0/n0;

    move-result-object v2

    iput-object v3, v2, Ld0/n0;->b:Ld0/z;

    invoke-virtual {p0, v0, v1}, Ld0/o0;->a(ILjava/lang/Float;)Ld0/n0;

    move-result-object p0

    iput-object v3, p0, Ld0/n0;->b:Ld0/z;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
