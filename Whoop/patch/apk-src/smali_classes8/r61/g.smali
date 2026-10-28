.class public abstract Lr61/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\r\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\r\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\r\u0010\u000c\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\t\u001a\r\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000b\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\"\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0018\u00b2\u0006\u000e\u0010\u0017\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "e",
        "(Landroidx/compose/runtime/Composer;I)V",
        "Lh71/j;",
        "state",
        "c",
        "(Lh71/j;Landroidx/compose/runtime/Composer;I)V",
        "Lj71/b$g;",
        "j",
        "()Lj71/b$g;",
        "h",
        "()Lh71/j;",
        "k",
        "i",
        "Lj71/b$h;",
        "a",
        "Lj71/b$h;",
        "linePlot",
        "Lj71/b$m;",
        "b",
        "Lj71/b$m;",
        "labelsPlot",
        "Lcom/whoop/design/util/TextResource;",
        "scrubValue",
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


# static fields
.field private static final a:Lj71/b$h;

.field private static final b:Lj71/b$m;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    const/16 v0, 0x96

    const/4 v1, 0x0

    invoke-static {v1, v0}, Le93/b;->i0(II)Li93/j;

    move-result-object v0

    new-instance v4, Ljava/util/ArrayList;

    const/16 v12, 0xa

    invoke-static {v0, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

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

    int-to-float v2, v2

    const/high16 v3, 0x43150000    # 149.0f

    div-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-interface {v4, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x7

    invoke-static {v1, v0}, Le93/b;->i0(II)Li93/j;

    move-result-object v0

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v0, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Lm83/e0;

    invoke-virtual {v2}, Lm83/e0;->nextInt()I

    move-result v2

    int-to-float v2, v2

    const/high16 v5, 0x40c00000    # 6.0f

    div-float/2addr v2, v5

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    sget-object v0, Lr61/g$c;->w:Lr61/g$c;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v5

    new-instance v2, Lj71/b$h;

    const/16 v10, 0x60

    const/4 v11, 0x0

    const v6, 0x3d4ccccd    # 0.05f

    const-string v7, "lines plot1"

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v11}, Lj71/b$h;-><init>(Ljava/util/List;Ljava/util/List;Ly81/e;FLjava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Lr61/g;->a:Lj71/b$h;

    const/16 v0, 0x1e

    invoke-static {v1, v0}, Le93/b;->i0(II)Li93/j;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    move-object v2, v0

    check-cast v2, Lm83/e0;

    invoke-virtual {v2}, Lm83/e0;->nextInt()I

    move-result v2

    new-instance v3, Lyy0/c;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "s"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    int-to-float v2, v2

    const/high16 v5, 0x41f00000    # 30.0f

    div-float v7, v2, v5

    const/16 v10, 0x36

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v11}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    new-instance v0, Lg71/d;

    const-wide/16 v2, 0x0

    invoke-direct {v0, v2, v3, v1}, Lg71/d;-><init>(DLjava/util/List;)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    new-instance v4, Lj71/b$m;

    const/16 v9, 0xc

    const/4 v10, 0x0

    const-string v6, "sec labels"

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lj71/b$m;-><init>(Ljava/util/List;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v4, Lr61/g;->b:Lj71/b$m;

    return-void
.end method

.method public static synthetic a(Lh71/j;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lr61/g;->d(Lh71/j;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lr61/g;->f(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lh71/j;Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v1, p0

    move/from16 v14, p2

    move-object/from16 v11, p1

    check-cast v11, Lp1/q;

    const v0, -0x6bcdbc15    # -9.000098E-27f

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v14, 0x6

    const/4 v2, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    or-int/2addr v0, v14

    goto :goto_1

    :cond_1
    move v0, v14

    :goto_1
    and-int/lit8 v3, v0, 0x3

    const/4 v4, 0x0

    const/4 v15, 0x1

    if-eq v3, v2, :cond_2

    move v3, v15

    goto :goto_2

    :cond_2
    move v3, v4

    :goto_2
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v11, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_6

    sget-object v3, Lb2/t;->w:Lb2/t;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const v5, 0x3faaaaab

    invoke-static {v3, v4, v5}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    int-to-float v2, v2

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v2, v5

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Lb2/e;->w:Lb2/m;

    invoke-static {v5, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v5, v11, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v11, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v8, v11, Lp1/q;->S:Z

    if-eqz v8, :cond_3

    invoke-virtual {v11, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_3
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v11, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v11, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v11, Lp1/q;->S:Z

    if-nez v6, :cond_4

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    :cond_4
    invoke-static {v5, v11, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v11, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v3, 0xa

    const/4 v4, 0x0

    invoke-static {v2, v4, v2, v4, v3}, Landroidx/compose/foundation/layout/a;->c(FFFFI)Ll0/l1;

    move-result-object v8

    shl-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0x70

    const/high16 v2, 0xc00000

    or-int v12, v0, v2

    const/16 v13, 0x37d

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v0 .. v13}, Lh71/g;->l(Landroidx/compose/ui/Modifier;Lh71/j;Lh71/i;Li71/b;JLkotlin/jvm/functions/Function1;Lf0/r1;Ll0/k1;Ld61/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_6
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_7

    new-instance v2, Los0/d;

    const/16 v3, 0x16

    invoke-direct {v2, v1, v14, v3}, Los0/d;-><init>(Ljava/lang/Object;II)V

    iput-object v2, v0, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final d(Lh71/j;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lr61/g;->c(Lh71/j;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final e(Landroidx/compose/runtime/Composer;I)V
    .locals 8

    move-object v5, p0

    check-cast v5, Lp1/q;

    const p0, 0x213a77c2

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

    sget-object p0, Lr61/d;->a:Lr61/d;

    invoke-virtual {p0}, Lr61/d;->b()Lc93/m;

    move-result-object v4

    const/16 v6, 0x6000

    const/16 v7, 0xf

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v7}, Lx81/e;->n(Lcom/whoop/data/repositories/FeatureFlagChecker;Lfy1/l;Ldp0/g;La91/b;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lq81/f;

    const/4 v1, 0x6

    invoke-direct {v0, p1, v1}, Lq81/f;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final f(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lr61/g;->e(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic g(Lh71/j;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lr61/g;->c(Lh71/j;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final h()Lh71/j;
    .locals 9

    new-instance v0, Lh71/j;

    invoke-static {}, Lr61/g;->j()Lj71/b$g;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [Lj71/b;

    sget-object v3, Lr61/g;->a:Lj71/b$h;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    sget-object v3, Lr61/g;->b:Lj71/b$m;

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x2

    aput-object v1, v2, v3

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    new-instance v4, Li71/e$b;

    const/16 v1, 0x190

    invoke-direct {v4, v1}, Li71/e$b;-><init>(I)V

    const/16 v7, 0x31

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/high16 v3, 0x41700000    # 15.0f

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lh71/j;-><init>(Lh71/k;Ljava/util/List;FLi71/e;Lcom/whoop/design/util/TextResource;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static final i()Lh71/j;
    .locals 9

    new-instance v0, Lh71/j;

    invoke-static {}, Lr61/g;->k()Lj71/b$g;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [Lj71/b;

    sget-object v3, Lr61/g;->a:Lj71/b$h;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    sget-object v3, Lr61/g;->b:Lj71/b$m;

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x2

    aput-object v1, v2, v3

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    new-instance v4, Li71/e$b;

    const/16 v1, 0x190

    invoke-direct {v4, v1}, Li71/e$b;-><init>(I)V

    const/16 v7, 0x31

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/high16 v3, 0x41700000    # 15.0f

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lh71/j;-><init>(Lh71/k;Ljava/util/List;FLi71/e;Lcom/whoop/design/util/TextResource;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static final j()Lj71/b$g;
    .locals 27

    new-instance v0, Li93/j;

    const/4 v1, 0x0

    const/16 v2, 0xbb8

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Li93/h;-><init>(III)V

    new-instance v5, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    move-object v4, v0

    check-cast v4, Lm83/e0;

    invoke-virtual {v4}, Lm83/e0;->nextInt()I

    move-result v4

    int-to-float v4, v4

    const/high16 v6, 0x43480000    # 200.0f

    div-float v6, v4, v6

    const/high16 v7, 0x43b40000    # 360.0f

    mul-float/2addr v6, v7

    float-to-double v6, v6

    const-wide v8, 0x3f91df46a2529d39L    # 0.017453292519943295

    mul-double/2addr v6, v8

    int-to-float v8, v2

    div-float v10, v4, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v6

    double-to-float v4, v6

    const/high16 v6, 0x3e800000    # 0.25f

    mul-float/2addr v4, v6

    const/high16 v6, 0x3f000000    # 0.5f

    add-float v11, v4, v6

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    const-string v6, "%.2f"

    invoke-static {v6, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-instance v9, Lu61/e;

    new-instance v12, La71/a;

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v14

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    const/16 v25, 0xff9

    const/16 v26, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v12 .. v26}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v16, 0x1c

    move-object v15, v12

    const/4 v12, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v9 .. v17}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v7, Lk61/c;

    sget-object v0, Lr61/g$a;->w:Lr61/g$a;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v14

    const/16 v18, 0x37

    const/16 v19, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    move-object v10, v7

    invoke-direct/range {v10 .. v19}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lu61/a;

    new-instance v8, Li71/d;

    const/4 v0, 0x2

    const/4 v2, 0x0

    invoke-direct {v8, v1, v2, v0, v2}, Li71/d;-><init>(ILjava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v9, 0x2

    const/4 v10, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v4 .. v10}, Lu61/a;-><init>(Ljava/util/List;Lk61/a;Lk61/c;Li71/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    new-instance v5, Lj71/b$g;

    const/16 v12, 0x3c

    const/4 v13, 0x0

    const-string v7, "scrollline1"

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v5 .. v13}, Lj71/b$g;-><init>(Ljava/util/List;Ljava/lang/String;ZLi71/g;Li71/h;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5
.end method

.method public static final k()Lj71/b$g;
    .locals 32

    new-instance v0, Lk61/c;

    sget-object v1, Lr61/g$b;->w:Lr61/g$b;

    invoke-static {v1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v4

    const/16 v8, 0x37

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Li93/j;

    const/4 v2, 0x6

    const/4 v8, 0x1

    invoke-direct {v1, v7, v2, v8}, Li93/h;-><init>(III)V

    new-instance v10, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v1, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v10, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v1, v11

    check-cast v1, Lm83/e0;

    invoke-virtual {v1}, Lm83/e0;->nextInt()I

    move-result v1

    mul-int/lit16 v1, v1, 0x1f4

    new-instance v2, Li93/j;

    const/16 v3, 0x190

    invoke-direct {v2, v7, v3, v8}, Li93/h;-><init>(III)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v2, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/16 v5, 0xbb8

    if-eqz v4, :cond_0

    move-object v4, v2

    check-cast v4, Lm83/e0;

    invoke-virtual {v4}, Lm83/e0;->nextInt()I

    move-result v4

    add-int/2addr v4, v1

    int-to-float v4, v4

    const/high16 v6, 0x43480000    # 200.0f

    div-float v6, v4, v6

    const/high16 v12, 0x43b40000    # 360.0f

    mul-float/2addr v6, v12

    float-to-double v12, v6

    const-wide v14, 0x3f91df46a2529d39L    # 0.017453292519943295

    mul-double/2addr v12, v14

    int-to-float v5, v5

    div-float v15, v4, v5

    invoke-static {v12, v13}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    double-to-float v4, v4

    const/high16 v5, 0x3e800000    # 0.25f

    mul-float/2addr v4, v5

    const/high16 v5, 0x3f000000    # 0.5f

    add-float v16, v4, v5

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    const-string v5, "%.2f"

    invoke-static {v5, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-instance v14, Lu61/e;

    new-instance v17, La71/a;

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v19

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    const/16 v30, 0xff9

    const/16 v31, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v17 .. v31}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v21, 0x1c

    move-object/from16 v20, v17

    const/16 v17, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v14 .. v22}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    new-instance v2, Lu61/a;

    new-instance v4, Li71/d;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-direct {v4, v1, v5}, Li71/d;-><init>(ILjava/lang/Integer;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v1, v3

    move-object v3, v0

    move-object v0, v2

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v6}, Lu61/a;-><init>(Ljava/util/List;Lk61/a;Lk61/c;Li71/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v0

    move-object v0, v3

    invoke-interface {v10, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_1
    new-instance v9, Lj71/b$g;

    const/16 v16, 0x3c

    const/16 v17, 0x0

    const-string v11, "scrollline2"

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v9 .. v17}, Lj71/b$g;-><init>(Ljava/util/List;Ljava/lang/String;ZLi71/g;Li71/h;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9
.end method
