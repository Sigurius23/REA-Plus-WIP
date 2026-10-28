.class public abstract Lg81/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a5\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a?\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000e2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\"\u001d\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\"\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Lg81/c;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "e",
        "(Lg81/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "",
        "id",
        "Lm91/u;",
        "header",
        "",
        "items",
        "footer",
        "i",
        "(Ljava/lang/String;Lm91/u;Ljava/util/List;Lm91/u;)Lg81/c;",
        "Lp1/t1;",
        "",
        "a",
        "Lp1/t1;",
        "h",
        "()Lp1/t1;",
        "LocalIsInRecommendationTileGroup",
        "Li2/t;",
        "b",
        "Li2/t;",
        "groupBackgroundGradient",
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
.field private static final a:Lp1/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t1;"
        }
    .end annotation
.end field

.field private static final b:Li2/t;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lfw0/a;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Lfw0/a;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Lg81/b;->a:Lp1/t1;

    sget-object v2, Li2/t;->b:Li2/s;

    invoke-static {}, Lgb1/b0;->n()Ljava/util/List;

    move-result-object v3

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const v6, 0x432d51ec    # 173.32f

    const/4 v7, 0x1

    invoke-static/range {v2 .. v9}, Lgb1/u;->b(Li2/s;Ljava/util/List;Ljava/util/List;IFZILjava/lang/Object;)Li2/t;

    move-result-object v0

    sput-object v0, Lg81/b;->b:Li2/t;

    return-void
.end method

.method public static synthetic a(Lg81/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lg81/b;->f(Lg81/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Z
    .locals 1

    invoke-static {}, Lg81/b;->d()Z

    move-result v0

    return v0
.end method

.method public static synthetic c(Lg81/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lg81/b;->g(Lg81/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public static final e(Lg81/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg81/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lp1/q;

    const v0, 0x2384cb73

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x6

    const/4 v2, 0x2

    const/4 v3, 0x4

    if-nez v0, :cond_1

    invoke-virtual {p3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_1
    move v0, p4

    :goto_1
    and-int/lit8 v4, p4, 0x30

    if-nez v4, :cond_3

    invoke-virtual {p3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :cond_3
    and-int/lit8 v4, p5, 0x4

    if-eqz v4, :cond_4

    or-int/lit16 v0, v0, 0x180

    goto :goto_4

    :cond_4
    and-int/lit16 v5, p4, 0x180

    if-nez v5, :cond_6

    invoke-virtual {p3, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x100

    goto :goto_3

    :cond_5
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v0, v5

    :cond_6
    :goto_4
    and-int/lit16 v5, v0, 0x93

    const/16 v6, 0x92

    const/4 v7, 0x1

    if-eq v5, v6, :cond_7

    move v5, v7

    goto :goto_5

    :cond_7
    const/4 v5, 0x0

    :goto_5
    and-int/2addr v0, v7

    invoke-virtual {p3, v0, v5}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_c

    if-eqz v4, :cond_8

    sget-object p2, Lb2/t;->w:Lb2/t;

    :cond_8
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v3, v3

    mul-float/2addr v3, v3

    invoke-static {v3}, Lt0/j;->e(F)Lt0/i;

    move-result-object v4

    invoke-static {v0, v4}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v4, v7

    invoke-static {}, Lgb1/b0;->B0()Li2/t;

    move-result-object v5

    invoke-static {v3}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    invoke-static {v4, v0, v5, v3}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v3, Lg81/b;->b:Li2/t;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    invoke-static {v0, v3, v4, v5, v6}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v2, v2

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    sget-object v3, Lb2/e;->M:Lb2/k;

    invoke-static {v2, v3, p3, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v3, p3, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {p3}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {p3, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {p3}, Lp1/q;->i0()V

    iget-boolean v6, p3, Lp1/q;->S:Z

    if-eqz v6, :cond_9

    invoke-virtual {p3, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {p3}, Lp1/q;->s0()V

    :goto_6
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {p3, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {p3, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, p3, Lp1/q;->S:Z

    if-nez v4, :cond_a

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    :cond_a
    invoke-static {v3, p3, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {p3, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lg81/b;->a:Lp1/t1;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v2}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    new-instance v2, Lf01/f;

    const/16 v3, 0x12

    invoke-direct {v2, v3, p0, p1}, Lf01/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v3, 0x6392f7a9

    invoke-static {v3, p3, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    const/16 v3, 0x38

    invoke-static {v0, v2, p3, v3}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p3, v7}, Lp1/q;->q(Z)V

    :goto_7
    move-object v5, p2

    goto :goto_8

    :cond_c
    invoke-virtual {p3}, Lp1/q;->X()V

    goto :goto_7

    :goto_8
    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_d

    new-instance v0, Lf02/c;

    const/16 v3, 0xb

    move-object v4, p0

    move-object v6, p1

    move v1, p4

    move v2, p5

    invoke-direct/range {v0 .. v6}, Lf02/c;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final f(Lg81/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/2addr p3, v2

    move-object v8, p2

    check-cast v8, Lp1/q;

    invoke-virtual {v8, p3, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-virtual {p0}, Lg81/c;->b()Lm91/u;

    move-result-object v4

    if-nez v4, :cond_1

    const p2, -0x743cfc6a

    invoke-virtual {v8, p2}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    move-object v7, p1

    goto :goto_1

    :cond_1
    const p2, -0x743cfc69

    invoke-virtual {v8, p2}, Lp1/q;->e0(I)V

    const/4 v9, 0x0

    const/4 v10, 0x6

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p1

    invoke-static/range {v4 .. v10}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    :goto_1
    invoke-virtual {p0}, Lg81/c;->c()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_6

    const p1, -0x743aa692

    invoke-virtual {v8, p1}, Lp1/q;->e0(I)V

    sget-object p1, Lb2/t;->w:Lb2/t;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p2, p1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    const/16 p2, 0x8

    int-to-float p2, p2

    const/high16 p3, 0x3fc00000    # 1.5f

    mul-float/2addr p2, p3

    invoke-static {p2}, Ll0/m;->i(F)Ll0/k;

    move-result-object p2

    sget-object p3, Lb2/e;->M:Lb2/k;

    const/4 v0, 0x6

    invoke-static {p2, p3, v8, v0}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object p2

    iget-wide v0, v8, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result p3

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v0

    invoke-static {v8, p1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object v1, La3/l;->a:La3/k;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v4, v8, Lp1/q;->S:Z

    if-eqz v4, :cond_2

    invoke-virtual {v8, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_2
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_2
    sget-object v1, La3/k;->g:La3/i;

    invoke-static {v8, v1, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->f:La3/i;

    invoke-static {v8, p2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->j:La3/i;

    iget-boolean v0, v8, Lp1/q;->S:Z

    if-nez v0, :cond_3

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    invoke-static {p3, v8, p3, p2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object p2, La3/k;->d:La3/i;

    invoke-static {v8, p2, p1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const p1, 0x11e3126c

    invoke-virtual {v8, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lg81/c;->c()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object v4, p2

    check-cast v4, Lm91/u;

    const/4 v9, 0x0

    const/4 v10, 0x6

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v10}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_5
    invoke-static {v8, v3, v2, v3}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_4

    :cond_6
    const p1, -0x743553e7

    invoke-virtual {v8, p1}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    :goto_4
    invoke-virtual {p0}, Lg81/c;->a()Lm91/u;

    move-result-object v4

    if-nez v4, :cond_7

    const p0, -0x7434cc0a

    invoke-virtual {v8, p0}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_7
    const p0, -0x7434cc09

    invoke-virtual {v8, p0}, Lp1/q;->e0(I)V

    const/4 v9, 0x0

    const/4 v10, 0x6

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v10}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_8
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_5
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lg81/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lg81/b;->e(Lg81/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h()Lp1/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lp1/t1;"
        }
    .end annotation

    sget-object v0, Lg81/b;->a:Lp1/t1;

    return-object v0
.end method

.method public static final i(Ljava/lang/String;Lm91/u;Ljava/util/List;Lm91/u;)Lg81/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lm91/u;",
            "Ljava/util/List<",
            "+",
            "Lm91/u;",
            ">;",
            "Lm91/u;",
            ")",
            "Lg81/c;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lg81/c;

    invoke-direct {v0, p0, p1, p2, p3}, Lg81/c;-><init>(Ljava/lang/String;Lm91/u;Ljava/util/List;Lm91/u;)V

    return-object v0
.end method

.method public static synthetic j(Ljava/lang/String;Lm91/u;Ljava/util/List;Lm91/u;ILjava/lang/Object;)Lg81/c;
    .locals 14

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    const-string p0, "sample-recommendation-group"

    :cond_0
    and-int/lit8 v0, p4, 0x2

    if-eqz v0, :cond_1

    new-instance v1, Lsz0/c0;

    sget-object v3, Lb91/c;->H4:Lb91/c;

    sget-object v4, Ly81/f;->BRAND_WHITE:Ly81/f;

    const/16 v12, 0x3f0

    const/4 v13, 0x0

    const-string v2, "Today\'s recommendation"

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v1 .. v13}, Lsz0/c0;-><init>(Ljava/lang/String;Lb91/c;Ly81/f;ILgz0/m0;Ljava/lang/Integer;Ljava/lang/Integer;Li2/t;ZLsz0/y;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_1
    move-object v1, p1

    :goto_0
    and-int/lit8 v0, p4, 0x4

    if-eqz v0, :cond_2

    const/16 v11, 0x17c

    const/4 v12, 0x0

    const-string v2, "rec-1"

    const-string v3, "STRENGTH TRAINING"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v2 .. v12}, Lh31/l;->j(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Lm91/u;Lh31/n;ZLh31/b;ILjava/lang/Object;)Lh31/q;

    move-result-object v0

    const-string v2, "rec-2"

    const-string v3, "ZONE 2 RUN"

    invoke-static/range {v2 .. v12}, Lh31/l;->j(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Lm91/u;Lh31/n;ZLh31/b;ILjava/lang/Object;)Lh31/q;

    move-result-object v2

    const/16 v12, 0x17c

    const/4 v13, 0x0

    const-string v3, "rec-3"

    const-string v4, "PROTEIN"

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v3 .. v13}, Lh31/l;->j(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Lm91/u;Lh31/n;ZLh31/b;ILjava/lang/Object;)Lh31/q;

    move-result-object v3

    filled-new-array {v0, v2, v3}, [Lh31/q;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object/from16 v0, p2

    :goto_1
    and-int/lit8 v2, p4, 0x8

    if-eqz v2, :cond_3

    sget-object v3, Lh31/f;->UNCOMMITTED:Lh31/f;

    sget-object v5, Lgz0/m0;->ADD:Lgz0/m0;

    sget-object v7, Lh31/c;->LIST:Lh31/c;

    const/16 v8, 0x8

    const/4 v9, 0x0

    const-string v4, "COMMIT"

    const/4 v6, 0x0

    invoke-static/range {v3 .. v9}, Lh31/e;->k(Lh31/f;Ljava/lang/String;Lgz0/m0;ZLh31/c;ILjava/lang/Object;)Lh31/g;

    move-result-object v2

    goto :goto_2

    :cond_3
    move-object/from16 v2, p3

    :goto_2
    invoke-static {p0, v1, v0, v2}, Lg81/b;->i(Ljava/lang/String;Lm91/u;Ljava/util/List;Lm91/u;)Lg81/c;

    move-result-object p0

    return-object p0
.end method
