.class public final Lbd1/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Lbd1/u;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lbd1/q;",
        "Lm91/f;",
        "Lbd1/u;",
        "<init>",
        "()V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Landroidx/compose/ui/Modifier;Lbd1/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "design-showcase_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lbd1/q;Landroidx/compose/ui/Modifier;Lbd1/u;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lbd1/q;->e(Lbd1/q;Landroidx/compose/ui/Modifier;Lbd1/u;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lbd1/u;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lbd1/q;->d(Lbd1/u;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lbd1/u;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 4

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-virtual {p0}, Lbd1/u;->e()Lkd1/h;

    move-result-object p2

    if-eqz p2, :cond_1

    const p2, 0x36de624

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lbd1/u;->e()Lkd1/h;

    move-result-object p0

    sget p2, Lkd1/h;->d:I

    invoke-static {p0, p1, p2}, Lbd1/t;->n(Lkd1/h;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lbd1/u;->b()Ly3/f;

    move-result-object p2

    if-eqz p2, :cond_2

    const p2, 0x36df176

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lbd1/u;->b()Ly3/f;

    move-result-object p2

    iget p2, p2, Ly3/f;->w:F

    invoke-virtual {p0}, Lbd1/u;->c()Ljava/lang/String;

    move-result-object p0

    invoke-static {p2, p0, p1, v3}, Lbd1/t;->m(FLjava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lbd1/u;->a()Lkd1/h;

    move-result-object p2

    if-eqz p2, :cond_3

    const p2, 0x36e0050

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lbd1/u;->a()Lkd1/h;

    move-result-object p0

    sget p2, Lkd1/h;->d:I

    invoke-static {p0, p1, p2}, Lbd1/t;->l(Lkd1/h;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_3
    const p0, 0x6a52ff65

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lbd1/q;Landroidx/compose/ui/Modifier;Lbd1/u;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Lbd1/q;->c(Landroidx/compose/ui/Modifier;Lbd1/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Lbd1/u;

    invoke-virtual/range {p0 .. p5}, Lbd1/q;->c(Landroidx/compose/ui/Modifier;Lbd1/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public c(Landroidx/compose/ui/Modifier;Lbd1/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lbd1/u;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v3, p2

    const-string v0, "modifier"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemState"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p4

    check-cast v12, Lp1/q;

    const v0, 0x705e9ac0

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x30

    const/16 v1, 0x10

    if-nez v0, :cond_2

    and-int/lit8 v0, p5, 0x40

    if-nez v0, :cond_0

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/16 v0, 0x20

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    or-int v0, p5, v0

    goto :goto_2

    :cond_2
    move/from16 v0, p5

    :goto_2
    and-int/lit8 v5, v0, 0x11

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v5, v1, :cond_3

    move v1, v7

    goto :goto_3

    :cond_3
    move v1, v6

    :goto_3
    and-int/2addr v0, v7

    invoke-virtual {v12, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v6, v1}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x2

    int-to-float v1, v1

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v1, v5

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v3}, Lbd1/u;->a()Lkd1/h;

    move-result-object v0

    if-eqz v0, :cond_4

    const v0, -0x6ec0985a

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-static {v0, v12, v1, v6}, Ldc/b;->e(Lx81/d;Lp1/q;IZ)J

    move-result-wide v0

    :goto_4
    move-wide v7, v0

    goto :goto_5

    :cond_4
    const v0, -0x6ebf989a

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-static {v0, v12, v1, v6}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v0

    goto :goto_4

    :goto_5
    new-instance v0, La80/c;

    const/16 v1, 0xe

    invoke-direct {v0, v3, v1}, La80/c;-><init>(Ljava/lang/Object;I)V

    const v1, 0x4144d7bd

    invoke-static {v1, v12, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v11

    const v13, 0x180006

    const/16 v14, 0x3a

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v5 .. v14}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_6

    :cond_5
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_6

    new-instance v0, Lm;

    const/16 v6, 0x17

    move-object v1, p0

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lm;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method
