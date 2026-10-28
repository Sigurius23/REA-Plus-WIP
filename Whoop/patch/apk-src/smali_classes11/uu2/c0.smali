.class public final Luu2/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Luu2/h0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Luu2/c0;",
        "Lm91/f;",
        "Luu2/h0;",
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
        "(Landroidx/compose/ui/Modifier;Luu2/h0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "weightlifting_release"
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

.method public static synthetic a(Luu2/c0;Landroidx/compose/ui/Modifier;Luu2/h0;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Luu2/c0;->e(Luu2/c0;Landroidx/compose/ui/Modifier;Luu2/h0;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Luu2/h0;Lkotlin/jvm/functions/Function1;Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Luu2/c0;->d(Luu2/h0;Lkotlin/jvm/functions/Function1;Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Luu2/h0;Lkotlin/jvm/functions/Function1;Landroid/content/Context;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Luu2/h0;->k()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    sget-object v0, Luu2/g;->a:Luu2/g;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/whoop/video/VideoActivity;

    invoke-direct {p1, p2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "videoUrl"

    invoke-virtual {p1, v0, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p2, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Luu2/c0;Landroidx/compose/ui/Modifier;Luu2/h0;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Luu2/c0;->c(Landroidx/compose/ui/Modifier;Luu2/h0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Luu2/h0;

    invoke-virtual/range {p0 .. p5}, Luu2/c0;->c(Landroidx/compose/ui/Modifier;Luu2/h0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public c(Landroidx/compose/ui/Modifier;Luu2/h0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Luu2/h0;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    const-string v0, "modifier"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemState"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v0, -0x40d8f6a9

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v6, v5, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :cond_3
    and-int/lit16 v6, v5, 0x180

    const/16 v7, 0x100

    if-nez v6, :cond_5

    invoke-virtual {v10, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    move v6, v7

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v0, v6

    :cond_5
    and-int/lit16 v6, v0, 0x93

    const/16 v8, 0x92

    const/4 v12, 0x0

    if-eq v6, v8, :cond_6

    const/4 v6, 0x1

    goto :goto_4

    :cond_6
    move v6, v12

    :goto_4
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v10, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_d

    sget-object v6, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v10, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/content/Context;

    int-to-float v8, v1

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float/2addr v8, v9

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v11}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    move-object v15, v14

    const-wide/high16 v13, 0x3fe0000000000000L    # 0.5

    double-to-float v8, v13

    mul-float/2addr v8, v9

    invoke-static {v8, v11}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/4 v9, 0x0

    invoke-static {v2, v8, v9, v1}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v8, Ll0/m;->c:Ll0/g;

    sget-object v9, Lb2/e;->M:Lb2/k;

    invoke-static {v8, v9, v10, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    move-object/from16 v16, v13

    iget-wide v12, v10, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v10, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-eqz v13, :cond_7

    invoke-virtual {v10, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_5
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v10, v12, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v10, v8, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-nez v11, :cond_8

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_9

    :cond_8
    invoke-static {v9, v10, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v10, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v3}, Luu2/h0;->c()Lkd1/o;

    move-result-object v1

    invoke-virtual {v3}, Luu2/h0;->k()Ljava/lang/String;

    move-result-object v8

    move-object v9, v8

    invoke-virtual {v3}, Luu2/h0;->j()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    and-int/lit16 v0, v0, 0x380

    if-ne v0, v7, :cond_a

    const/4 v0, 0x1

    goto :goto_6

    :cond_a
    const/4 v0, 0x0

    :goto_6
    or-int/2addr v0, v11

    invoke-virtual {v10, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v0, v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v0, :cond_b

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v7, v0, :cond_c

    :cond_b
    new-instance v7, Lre1/k;

    const/16 v0, 0xb

    invoke-direct {v7, v3, v4, v6, v0}, Lre1/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v7, Lc93/a;

    sget v11, Lkd1/o;->a:I

    move-object v6, v9

    move-object v9, v7

    move-object v7, v6

    move-object v6, v1

    invoke-static/range {v6 .. v11}, Luu2/e0;->q(Lkd1/o;Ljava/lang/String;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    move-object v8, v15

    invoke-static {v10, v8}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v3}, Luu2/h0;->e()Lgu2/a;

    move-result-object v0

    const/4 v14, 0x0

    invoke-static {v0, v10, v14}, Luu2/e0;->r(Lgu2/a;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v9, v16

    invoke-static {v10, v9}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v3}, Luu2/h0;->a()Lgu2/a;

    move-result-object v6

    invoke-virtual {v3}, Luu2/h0;->b()Lgu2/a;

    move-result-object v7

    const/16 v11, 0xd80

    invoke-static/range {v6 .. v11}, Luu2/e0;->p(Lgu2/a;Lgu2/a;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v3}, Luu2/h0;->h()Lgu2/a;

    move-result-object v6

    invoke-virtual {v3}, Luu2/h0;->i()Lgu2/a;

    move-result-object v7

    invoke-static/range {v6 .. v11}, Luu2/e0;->t(Lgu2/a;Lgu2/a;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v3}, Luu2/h0;->f()Lgu2/a;

    move-result-object v0

    invoke-virtual {v3}, Luu2/h0;->g()Lm91/u;

    move-result-object v1

    const/16 v6, 0x180

    invoke-static {v0, v1, v9, v10, v6}, Luu2/e0;->s(Lgu2/a;Lm91/u;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_d
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_e

    new-instance v0, Ltu1/c;

    const/16 v6, 0x14

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v6}, Ltu1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method
