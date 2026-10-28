.class public abstract Ls50/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\t\u0010\u0008\u001a!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u000f\u0010\r\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u0015\u0010\u0011\u001a\u00020\u0010*\u0004\u0018\u00010\u000fH\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\"\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\"\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0015\u00a8\u0006\u0019"
    }
    d2 = {
        "Ls50/d;",
        "viewState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll83/a0;",
        "g",
        "(Ls50/d;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "p",
        "(Ls50/d;Landroidx/compose/runtime/Composer;I)V",
        "n",
        "Ls50/e;",
        "l",
        "(Ls50/e;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "j",
        "(Landroidx/compose/runtime/Composer;I)V",
        "Lhy0/b2;",
        "Li2/x;",
        "r",
        "(Lhy0/b2;Landroidx/compose/runtime/Composer;I)J",
        "Ly3/f;",
        "a",
        "F",
        "CHEVRONS_WIDTH",
        "b",
        "CHEVRONS_HEIGHT",
        "access_release"
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
.field private static final a:F

.field private static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x4

    int-to-float v0, v0

    const/high16 v1, 0x41080000    # 8.5f

    mul-float/2addr v1, v0

    sput v1, Ls50/c;->a:F

    mul-float/2addr v0, v0

    sput v0, Ls50/c;->b:F

    return-void
.end method

.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ls50/c;->k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ls50/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ls50/c;->o(Ls50/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ls50/d;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ls50/c;->h(Ls50/d;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ls50/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ls50/c;->q(Ls50/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ls50/d;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ls50/c;->i(Ls50/d;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ls50/e;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ls50/c;->m(Ls50/e;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Ls50/d;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 13

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v10, p2

    check-cast v10, Lp1/q;

    const v0, 0x2192159f

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v1, 0x4

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v10, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v10, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int v0, p3, v0

    goto :goto_2

    :cond_2
    move/from16 v0, p3

    :goto_2
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    goto :goto_4

    :cond_3
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_5

    invoke-virtual {v10, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_3

    :cond_4
    const/16 v3, 0x10

    :goto_3
    or-int/2addr v0, v3

    :cond_5
    :goto_4
    and-int/lit8 v3, v0, 0x13

    const/16 v4, 0x12

    const/4 v5, 0x1

    if-eq v3, v4, :cond_6

    move v3, v5

    goto :goto_5

    :cond_6
    const/4 v3, 0x0

    :goto_5
    and-int/2addr v0, v5

    invoke-virtual {v10, v0, v3}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_8

    if-eqz v2, :cond_7

    sget-object p1, Lb2/t;->w:Lb2/t;

    :cond_7
    const-string v0, "MeasurementProgress"

    invoke-static {p1, v0}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v2, 0x3

    int-to-float v2, v2

    int-to-float v1, v1

    mul-float/2addr v2, v1

    invoke-static {v2}, Lt0/j;->e(F)Lt0/i;

    move-result-object v5

    new-instance v1, Lr12/a;

    const/16 v2, 0x11

    invoke-direct {v1, p0, v2}, Lr12/a;-><init>(Ljava/lang/Object;I)V

    const v2, -0x141467f1

    invoke-static {v2, v10, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    const/high16 v11, 0xc00000

    const/16 v12, 0x76

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, v0

    invoke-static/range {v1 .. v12}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    :goto_6
    move-object v3, p1

    goto :goto_7

    :cond_8
    invoke-virtual {v10}, Lp1/q;->X()V

    goto :goto_6

    :goto_7
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_9

    new-instance v0, Lqk2/i;

    const/16 v5, 0xd

    move-object v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lqk2/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final h(Ls50/d;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/2addr p2, v2

    move-object v7, p1

    check-cast v7, Lp1/q;

    invoke-virtual {v7, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object p1, Lb2/t;->w:Lb2/t;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p2, p1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    int-to-float p2, v3

    const/16 v0, 0x8

    int-to-float v0, v0

    mul-float/2addr p2, v0

    const/4 v3, 0x3

    int-to-float v4, v3

    mul-float/2addr v4, v0

    invoke-static {p1, p2, p2, p2, v4}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-static {p2}, Ll0/m;->i(F)Ll0/k;

    move-result-object p2

    sget-object v0, Lb2/e;->M:Lb2/k;

    const/4 v4, 0x6

    invoke-static {p2, v0, v7, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object p2

    iget-wide v4, v7, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v7, p1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-eqz v6, :cond_1

    invoke-virtual {v7, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_1
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v7, v5, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->f:La3/i;

    invoke-static {v7, p2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->j:La3/i;

    iget-boolean v4, v7, Lp1/q;->S:Z

    if-nez v4, :cond_2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    invoke-static {v0, v7, v0, p2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object p2, La3/k;->d:La3/i;

    invoke-static {v7, p2, p1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget p1, Lhy0/c2;->p:I

    sget p2, Lc41/p2;->v:I

    or-int/2addr p1, p2

    invoke-static {p0, v7, p1}, Ls50/c;->p(Ls50/d;Landroidx/compose/runtime/Composer;I)V

    invoke-static {p0, v7, p1}, Ls50/c;->n(Ls50/d;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p0}, Ls50/d;->a()Lc41/p2;

    move-result-object v5

    if-nez v5, :cond_4

    const p0, 0x3d46c065

    invoke-virtual {v7, p0}, Lp1/q;->e0(I)V

    :goto_2
    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_4
    const p0, 0x3d46c066

    invoke-virtual {v7, p0}, Lp1/q;->e0(I)V

    shl-int/lit8 v8, p2, 0x3

    const/4 v9, 0x5

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lc41/r2;->f(Landroidx/compose/ui/Modifier;Lc41/p2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_2

    :goto_3
    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_5
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_4
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Ls50/d;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Ls50/c;->g(Ls50/d;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Landroidx/compose/runtime/Composer;I)V
    .locals 10

    move-object v7, p0

    check-cast v7, Lp1/q;

    const p0, 0xda2741d

    invoke-virtual {v7, p0}, Lp1/q;->g0(I)Lp1/q;

    const/4 p0, 0x0

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, p0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {v7, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Ls50/c;->a:F

    sget v1, Ls50/c;->b:F

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v0, v1}, Landroidx/compose/foundation/layout/d;->r(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget v0, Lf50/a;->a:I

    invoke-static {v0, v7, p0}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v0

    const/16 v8, 0x1b0

    const/16 v9, 0x78

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v9}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lq81/f;

    const/16 v1, 0xc

    invoke-direct {v0, p1, v1}, Lq81/f;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Ls50/c;->j(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Ls50/e;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 36

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v1, -0xb638e5f

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_1
    move-object/from16 v1, p0

    move/from16 v2, p3

    :goto_1
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_2

    move-object/from16 v4, p1

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :goto_3
    and-int/lit8 v5, v2, 0x13

    const/4 v6, 0x0

    const/16 v7, 0x12

    const/4 v8, 0x1

    if-eq v5, v7, :cond_5

    move v5, v8

    goto :goto_4

    :cond_5
    move v5, v6

    :goto_4
    and-int/2addr v2, v8

    invoke-virtual {v0, v2, v5}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_a

    sget-object v2, Lb2/t;->w:Lb2/t;

    if-eqz v3, :cond_6

    move-object v3, v2

    goto :goto_5

    :cond_6
    move-object v3, v4

    :goto_5
    invoke-virtual {v1}, Ls50/e;->b()Lhy0/b2;

    move-result-object v4

    invoke-static {v4, v0, v6}, Ls50/c;->r(Lhy0/b2;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v4

    sget-object v9, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    invoke-static {v9, v10, v0, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v9, v0, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v0, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v13, v0, Lp1/q;->S:Z

    if-eqz v13, :cond_7

    invoke-virtual {v0, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_7
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_6
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v0, v12, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v0, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v10, v0, Lp1/q;->S:Z

    if-nez v10, :cond_8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_9

    :cond_8
    invoke-static {v9, v0, v9, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v0, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Ls50/e;->a()Ljava/lang/String;

    move-result-object v9

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v10, v0, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->M()Lb91/a;

    move-result-object v20

    new-instance v12, Lw3/k;

    const/4 v13, 0x3

    invoke-direct {v12, v13}, Lw3/k;-><init>(I)V

    sget v14, Lb91/a;->d:I

    shl-int/lit8 v24, v14, 0x12

    const v25, 0x2fdf8

    move-object v14, v2

    move-object v7, v3

    move-wide v2, v4

    const-wide/16 v4, 0x0

    move v15, v6

    const/4 v6, 0x0

    move-object/from16 v16, v7

    const/4 v7, 0x0

    move/from16 v17, v8

    const/4 v8, 0x0

    move-object/from16 v22, v0

    move-object v0, v9

    move-object/from16 v18, v10

    const-wide/16 v9, 0x0

    move/from16 v19, v11

    const/4 v11, 0x0

    move/from16 v23, v13

    move-object/from16 v21, v14

    const-wide/16 v13, 0x0

    move/from16 v26, v15

    const/4 v15, 0x0

    move-object/from16 v27, v16

    const/16 v16, 0x0

    move/from16 v28, v17

    const/16 v17, 0x0

    move-object/from16 v29, v18

    const/16 v18, 0x0

    move/from16 v30, v19

    const/16 v19, 0x0

    move-object/from16 v31, v21

    const/16 v21, 0x0

    move/from16 v32, v23

    const/16 v23, 0x30

    move-object/from16 v33, v29

    move/from16 v34, v30

    move-object/from16 v35, v31

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v22

    move-object/from16 v14, v35

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-static {v15, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Ls50/e;->c()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v5, v33

    move/from16 v6, v34

    invoke-virtual {v5, v0, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->C()Lb91/a;

    move-result-object v20

    new-instance v12, Lw3/k;

    const/4 v5, 0x3

    invoke-direct {v12, v5}, Lw3/k;-><init>(I)V

    move-object v0, v4

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v22

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    move-object/from16 v5, v27

    goto :goto_7

    :cond_a
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v5, v4

    :goto_7
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_b

    new-instance v2, Lqk2/i;

    const/16 v7, 0xe

    move-object/from16 v3, p0

    move/from16 v4, p3

    move/from16 v6, p4

    invoke-direct/range {v2 .. v7}, Lqk2/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v2, v0, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final m(Ls50/e;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Ls50/c;->l(Ls50/e;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Ls50/d;Landroidx/compose/runtime/Composer;I)V
    .locals 10

    check-cast p1, Lp1/q;

    const v0, 0x2ed8103

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p2, 0x6

    const/4 v1, 0x2

    if-nez v0, :cond_2

    and-int/lit8 v0, p2, 0x8

    if-nez v0, :cond_0

    invoke-virtual {p1, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    or-int/2addr v0, p2

    goto :goto_2

    :cond_2
    move v0, p2

    :goto_2
    and-int/lit8 v2, v0, 0x3

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v2, v1, :cond_3

    move v1, v3

    goto :goto_3

    :cond_3
    move v1, v4

    :goto_3
    and-int/2addr v0, v3

    invoke-virtual {p1, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_7

    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v5, Ll0/m;->g:Ll0/h;

    sget-object v6, Lb2/e;->K:Lb2/l;

    const/16 v7, 0x36

    invoke-static {v5, v6, p1, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v6, p1, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {p1}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {p1, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {p1}, Lp1/q;->i0()V

    iget-boolean v9, p1, Lp1/q;->S:Z

    if-eqz v9, :cond_4

    invoke-virtual {p1, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_4
    invoke-virtual {p1}, Lp1/q;->s0()V

    :goto_4
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {p1, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {p1, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, p1, Lp1/q;->S:Z

    if-nez v7, :cond_5

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_6

    :cond_5
    invoke-static {v6, p1, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {p1, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p0}, Ls50/d;->e()Ls50/e;

    move-result-object v2

    sget-object v5, Ll0/t1;->a:Ll0/t1;

    invoke-virtual {v5, v1, v3, v0}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v2, v6, p1, v4, v4}, Ls50/c;->l(Ls50/e;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-static {p1, v4}, Ls50/c;->j(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p0}, Ls50/d;->c()Ls50/e;

    move-result-object v2

    invoke-virtual {v5, v1, v3, v0}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v2, v6, p1, v4, v4}, Ls50/c;->l(Ls50/e;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-static {p1, v4}, Ls50/c;->j(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p0}, Ls50/d;->g()Ls50/e;

    move-result-object v2

    invoke-virtual {v5, v1, v3, v0}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v2, v0, p1, v4, v4}, Ls50/c;->l(Ls50/e;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_7
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_8

    new-instance v0, Ls50/b;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p2, v1}, Ls50/b;-><init>(Ls50/d;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final o(Ls50/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Ls50/c;->n(Ls50/d;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Ls50/d;Landroidx/compose/runtime/Composer;I)V
    .locals 30

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v7, p1

    check-cast v7, Lp1/q;

    const v2, -0x4275dac9

    invoke-virtual {v7, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v4, 0x2

    if-nez v2, :cond_2

    and-int/lit8 v2, v1, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_1

    :cond_1
    move v2, v4

    :goto_1
    or-int/2addr v2, v1

    goto :goto_2

    :cond_2
    move v2, v1

    :goto_2
    and-int/lit8 v5, v2, 0x3

    const/4 v11, 0x1

    if-eq v5, v4, :cond_3

    move v5, v11

    goto :goto_3

    :cond_3
    const/4 v5, 0x0

    :goto_3
    and-int/2addr v2, v11

    invoke-virtual {v7, v2, v5}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_e

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    int-to-float v4, v4

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float/2addr v4, v8

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    sget-object v9, Lb2/e;->K:Lb2/l;

    const/16 v12, 0x36

    invoke-static {v4, v9, v7, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v13, v7, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v7, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v3, v7, Lp1/q;->S:Z

    if-eqz v3, :cond_4

    invoke-virtual {v7, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_4
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_4
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v7, v3, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v7, v4, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v10, v7, Lp1/q;->S:Z

    if-nez v10, :cond_5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_6

    :cond_5
    invoke-static {v13, v7, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v7, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v12, v2

    const-wide/16 v18, 0x0

    cmpl-double v6, v12, v18

    if-lez v6, :cond_7

    move v6, v11

    goto :goto_5

    :cond_7
    const/4 v6, 0x0

    :goto_5
    if-nez v6, :cond_8

    const-string v6, "invalid weight; must be greater than zero"

    invoke-static {v6}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_8
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v6, v2, v11}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    int-to-float v2, v11

    const/16 v12, 0x36

    invoke-static {v2, v8, v9, v7, v12}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v2

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v7, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v12, v7, Lp1/q;->S:Z

    if-eqz v12, :cond_9

    invoke-virtual {v7, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v7, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v7, Lp1/q;->S:Z

    if-nez v2, :cond_a

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    :cond_a
    invoke-static {v8, v7, v8, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v7, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Ls50/d;->b()Lgz0/m0;

    move-result-object v2

    if-nez v2, :cond_c

    const v2, 0x6136c061

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    const/4 v2, 0x0

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_c
    const v3, 0x6136c062

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    const/4 v3, 0x5

    int-to-float v3, v3

    const/4 v4, 0x4

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v2}, Lgz0/m0;->toWhoopIcon()I

    move-result v2

    const/4 v3, 0x6

    invoke-static {v2, v7, v3}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v2

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v3, v7, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->b1()J

    move-result-wide v5

    const/16 v8, 0x1b0

    const/4 v9, 0x0

    const/4 v3, 0x0

    invoke-static/range {v2 .. v9}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v2, 0x0

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    :goto_7
    invoke-virtual {v0}, Ls50/d;->h()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "toUpperCase(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v7, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->L()Lb91/a;

    move-result-object v22

    invoke-virtual {v4, v7, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v4

    sget v6, Lb91/a;->d:I

    shl-int/lit8 v26, v6, 0x12

    const v27, 0x2fffa

    move/from16 v16, v2

    move-object v2, v3

    const/4 v3, 0x0

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move v13, v11

    const-wide/16 v11, 0x0

    move v14, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v18, v15

    move/from16 v17, v16

    const-wide/16 v15, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v23, v20

    const/16 v20, 0x0

    move/from16 v25, v21

    const/16 v21, 0x0

    move/from16 v28, v23

    const/16 v23, 0x0

    move/from16 v29, v25

    const/16 v25, 0x0

    move/from16 v0, v28

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Ls50/d;->f()Lhy0/c2;

    move-result-object v8

    if-nez v8, :cond_d

    const v2, -0x58df197b

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    :goto_8
    const/4 v2, 0x0

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_d
    const v2, -0x58df197a

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    const/high16 v2, 0x3fc00000    # 1.5f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v21

    const/16 v24, 0x6fff

    const/16 v25, 0x0

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

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v8 .. v25}, Lhy0/c2;->b(Lhy0/c2;Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;Lhy0/s0;ZZIIFLcom/whoop/navigation/e;Ljava/lang/Float;FLl0/k1;ILjava/lang/Object;)Lhy0/c2;

    move-result-object v2

    sget v3, Lhy0/c2;->p:I

    invoke-static {v2, v7, v3}, Lhy0/z1;->c(Lhy0/c2;Landroidx/compose/runtime/Composer;I)V

    goto :goto_8

    :goto_9
    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_e
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_f

    new-instance v2, Ls50/b;

    const/4 v3, 0x0

    move-object/from16 v4, p0

    invoke-direct {v2, v4, v1, v3}, Ls50/b;-><init>(Ls50/d;II)V

    iput-object v2, v0, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final q(Ls50/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Ls50/c;->p(Ls50/d;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lhy0/b2;Landroidx/compose/runtime/Composer;I)J
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-nez p0, :cond_0

    move-object p0, p1

    check-cast p0, Lp1/q;

    const p2, 0x62c404ca

    invoke-virtual {p0, p2}, Lp1/q;->e0(I)V

    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    move-object p0, v0

    goto :goto_0

    :cond_0
    move-object v2, p1

    check-cast v2, Lp1/q;

    const v3, 0x13b3be17

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    and-int/lit8 p2, p2, 0xe

    invoke-static {p0, v2, p2}, Lhy0/z1;->g(Lhy0/b2;Landroidx/compose/runtime/Composer;I)Lhy0/a2;

    move-result-object p0

    invoke-virtual {v2, v1}, Lp1/q;->q(Z)V

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lhy0/a2;->j()J

    move-result-wide v2

    new-instance v0, Li2/x;

    invoke-direct {v0, v2, v3}, Li2/x;-><init>(J)V

    :cond_1
    check-cast p1, Lp1/q;

    if-nez v0, :cond_2

    const p0, 0x13b3c3d4

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    sget p2, Lx81/d;->b:I

    invoke-static {p0, p1, p2, v1}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide p0

    goto :goto_1

    :cond_2
    const p0, 0x13b3bd88

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    iget-wide p0, v0, Li2/x;->a:J

    :goto_1
    return-wide p0
.end method
