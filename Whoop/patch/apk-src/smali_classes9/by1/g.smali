.class public abstract Lby1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a?\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\"\u0017\u0010\u000f\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lyx1/f;",
        "viewState",
        "Lkotlin/Function1;",
        "Lxx1/b;",
        "Ll83/a0;",
        "onNavigationEvent",
        "Lvx1/a;",
        "onAnalyticsEvent",
        "d",
        "(Lyx1/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lyx1/c;",
        "a",
        "Lyx1/c;",
        "getSampleReturnsBffData",
        "()Lyx1/c;",
        "sampleReturnsBffData",
        "membership_release"
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
.field private static final a:Lyx1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Lyx1/c;

    const-string v1, "Return Instructions"

    move-object v2, v1

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const-string v3, "Return window closes on Feb 17, 2025."

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const-string v4, "If you miss it, you\'ll be charged"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    new-instance v5, Lyx1/b;

    sget-object v6, Lgz0/m0;->RETURN:Lgz0/m0;

    const-string v7, "Place your items in their original shipping box along with the commercial invoice."

    invoke-direct {v5, v6, v7}, Lyx1/b;-><init>(Lgz0/m0;Ljava/lang/String;)V

    new-instance v6, Lyx1/b;

    sget-object v7, Lgz0/m0;->SHIPPING_BOX:Lgz0/m0;

    const-string v8, "Attach the shipping label to the top of the box."

    invoke-direct {v6, v7, v8}, Lyx1/b;-><init>(Lgz0/m0;Ljava/lang/String;)V

    new-instance v7, Lyx1/b;

    sget-object v8, Lgz0/m0;->SHIPPING:Lgz0/m0;

    const-string v9, "Drop off the box at any shipping location, find one near you using [this link](https.whoop.com)."

    invoke-direct {v7, v8, v9}, Lyx1/b;-><init>(Lgz0/m0;Ljava/lang/String;)V

    filled-new-array {v5, v6, v7}, [Lyx1/b;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    new-instance v6, Lyx1/a;

    const-string v7, "SHIPPING LABEL"

    const-string v8, "https://whoop.com"

    const-string v9, "/mock/path/shipping_label.pdf"

    invoke-direct {v6, v7, v8, v9}, Lyx1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v7, Lyx1/a;

    const-string v10, "COMMERCIAL INVOICE"

    invoke-direct {v7, v10, v8, v9}, Lyx1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v10, Lyx1/a;

    const-string v11, "DANGEROUS GOODS"

    invoke-direct {v10, v11, v8, v9}, Lyx1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    filled-new-array {v6, v7, v10}, [Lyx1/a;

    move-result-object v6

    invoke-static {v6}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    const-string v7, "Make sure all items are returned in their original condition. If anything gets damaged, you\'ll be charged a fee. Shipping costs may apply, depending on the service provider."

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const-string v8, "RETURN AND REFUND POLICY"

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const-string v9, "https://support.whoop.com/s/article/Return-Policy?language=en_US"

    move-object v12, v4

    move-object v4, v2

    move-object v2, v3

    move-object v3, v12

    invoke-direct/range {v0 .. v9}, Lyx1/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    sput-object v0, Lby1/g;->a:Lyx1/c;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lyx1/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lby1/g;->f(Lkotlin/jvm/functions/Function1;Lyx1/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lyx1/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lby1/g;->g(Lyx1/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lby1/g;->e(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lyx1/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyx1/f;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v0, p4

    const-string v4, "viewState"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onNavigationEvent"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onAnalyticsEvent"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p3

    check-cast v13, Lp1/q;

    const v4, 0x96ace0a

    invoke-virtual {v13, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v0, 0x6

    const/4 v6, 0x2

    if-nez v4, :cond_1

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move v4, v6

    :goto_0
    or-int/2addr v4, v0

    goto :goto_1

    :cond_1
    move v4, v0

    :goto_1
    and-int/lit8 v7, v0, 0x30

    if-nez v7, :cond_3

    invoke-virtual {v13, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    :cond_3
    and-int/lit16 v7, v0, 0x180

    const/16 v9, 0x100

    if-nez v7, :cond_5

    invoke-virtual {v13, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    move v7, v9

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v4, v7

    :cond_5
    and-int/lit16 v7, v4, 0x93

    const/16 v10, 0x92

    const/4 v11, 0x0

    if-eq v7, v10, :cond_6

    const/4 v7, 0x1

    goto :goto_4

    :cond_6
    move v7, v11

    :goto_4
    and-int/lit8 v10, v4, 0x1

    invoke-virtual {v13, v10, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_18

    invoke-virtual {v1}, Lyx1/f;->a()Lyx1/c;

    move-result-object v23

    if-nez v23, :cond_7

    const v4, -0x1bfca478

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v11}, Lp1/q;->q(Z)V

    goto/16 :goto_f

    :cond_7
    const v7, -0x1bfca477

    invoke-virtual {v13, v7}, Lp1/q;->e0(I)V

    and-int/lit16 v7, v4, 0x380

    if-ne v7, v9, :cond_8

    const/4 v10, 0x1

    goto :goto_5

    :cond_8
    move v10, v11

    :goto_5
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    sget-object v15, Lp1/l;->a:Lp1/v0;

    const/4 v5, 0x0

    if-nez v10, :cond_9

    if-ne v14, v15, :cond_a

    :cond_9
    new-instance v14, Lby1/g$a;

    invoke-direct {v14, v3, v5}, Lby1/g$a;-><init>(Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v13, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v14, Lc93/m;

    invoke-static {v13, v14, v5}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {}, Lgb1/b0;->U()Li2/t;

    move-result-object v10

    sget-object v14, Lb2/t;->w:Lb2/t;

    const/4 v8, 0x0

    const/4 v12, 0x6

    invoke-static {v14, v10, v5, v8, v12}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v10}, Ll0/f;->l(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    int-to-float v9, v6

    const/16 v12, 0x8

    int-to-float v12, v12

    mul-float/2addr v9, v12

    invoke-static {v10, v9, v8, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v6}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v8, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    invoke-static {v8, v10, v13, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    move/from16 v22, v12

    iget-wide v11, v13, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v13, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v24, La3/l;->a:La3/k;

    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v1, v13, Lp1/q;->S:Z

    if-eqz v1, :cond_b

    invoke-virtual {v13, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_b
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_6
    sget-object v1, La3/k;->g:La3/i;

    invoke-static {v13, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v13, v5, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    move/from16 v24, v4

    iget-boolean v4, v13, Lp1/q;->S:Z

    if-nez v4, :cond_c

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    move/from16 v25, v7

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    goto :goto_7

    :cond_c
    move/from16 v25, v7

    :goto_7
    invoke-static {v11, v13, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v13, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {v23 .. v23}, Lyx1/c;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    and-int/lit8 v11, v24, 0x70

    move/from16 v26, v7

    or-int v7, v26, v11

    invoke-static {v6, v2, v13, v7}, Lby1/f;->c(Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move/from16 v21, v9

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-static {v6, v13, v7}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v9

    const/16 v7, 0xe

    invoke-static {v14, v9, v7}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v8, v10, v13, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v9, v13, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v13, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v6, v13, Lp1/q;->S:Z

    if-eqz v6, :cond_e

    invoke-virtual {v13, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_e
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v13, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v5, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v13, Lp1/q;->S:Z

    if-nez v0, :cond_f

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    :cond_f
    invoke-static {v9, v13, v9, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    invoke-static {v13, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {v23 .. v23}, Lyx1/c;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual/range {v23 .. v23}, Lyx1/c;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    new-instance v8, Lc41/n0$e;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {v8, v0, v1, v0}, Lc41/n0$e;-><init>(Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v9, Lkd1/l;->UNKNOWN:Lkd1/l;

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v15, :cond_11

    new-instance v0, Lbs1/n;

    const/16 v4, 0x13

    invoke-direct {v0, v4}, Lbs1/n;-><init>(I)V

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object v12, v0

    check-cast v12, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v0, v26, 0x3

    const v4, 0xc06000

    or-int/2addr v0, v4

    shl-int/lit8 v4, v26, 0x6

    or-int/2addr v0, v4

    sget v4, Lc41/n0$e;->e:I

    shl-int/lit8 v4, v4, 0x9

    or-int/2addr v0, v4

    move-object v4, v15

    const/16 v15, 0x61

    const/4 v5, 0x0

    const/4 v10, 0x0

    move/from16 v17, v11

    const/4 v11, 0x0

    move-object/from16 v27, v4

    move-object v2, v14

    move/from16 p3, v17

    const/4 v3, 0x4

    const/16 v28, 0x6

    move v14, v0

    move v4, v1

    move/from16 v1, v25

    move/from16 v0, v26

    move/from16 v25, v21

    invoke-static/range {v5 .. v15}, Lc41/l0;->i(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc41/n0;Lkd1/l;Lcom/whoop/navigation/e;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    int-to-float v3, v3

    mul-float v3, v3, v22

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v13, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {v23 .. v23}, Lyx1/c;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual/range {v23 .. v23}, Lyx1/c;->e()Ljava/util/List;

    move-result-object v6

    invoke-static {v5, v6, v13, v0}, Lby1/a;->f(Lcom/whoop/design/util/TextResource;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v13, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const v0, 0x6732e289    # 8.447601E23f

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {v23 .. v23}, Lyx1/c;->c()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_17

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lyx1/a;

    invoke-virtual {v5}, Lyx1/a;->a()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_12

    invoke-virtual {v6}, Ljava/lang/Object;->hashCode()I

    move-result v11

    goto :goto_a

    :cond_12
    const/4 v11, 0x0

    :goto_a
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "download_"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    invoke-virtual {v5}, Lyx1/a;->b()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    sget-object v6, Lg1/v0;->a:Ll0/l1;

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v13, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->V0()J

    move-result-wide v8

    invoke-virtual {v6, v13, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v10

    invoke-virtual {v6, v13, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->X0()J

    move-result-wide v14

    invoke-virtual {v6, v13, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->W0()J

    move-result-wide v18

    move-wide/from16 v32, v10

    move-object v10, v5

    move-wide v11, v14

    move-object v15, v6

    move-wide v5, v8

    move v9, v7

    move-wide/from16 v7, v32

    const/4 v14, 0x0

    move-object/from16 v20, v15

    const/4 v15, 0x0

    move-object/from16 v29, v0

    move-object/from16 v31, v2

    move/from16 v30, v3

    move v2, v9

    move-object v0, v10

    move-wide/from16 v9, v18

    move-object/from16 v3, v20

    invoke-static/range {v5 .. v15}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v12

    int-to-float v5, v4

    invoke-virtual {v3, v13, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->b1()J

    move-result-wide v2

    invoke-static {v5, v2, v3}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v14

    const/16 v2, 0x100

    if-ne v1, v2, :cond_13

    move v11, v4

    goto :goto_b

    :cond_13
    const/4 v11, 0x0

    :goto_b
    invoke-virtual {v13, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v3, v11

    move/from16 v5, p3

    const/16 v6, 0x20

    if-ne v5, v6, :cond_14

    move v11, v4

    goto :goto_c

    :cond_14
    const/4 v11, 0x0

    :goto_c
    or-int/2addr v3, v11

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v3, :cond_16

    move-object/from16 v3, v27

    if-ne v7, v3, :cond_15

    goto :goto_d

    :cond_15
    move-object/from16 v9, p1

    move-object/from16 v10, p2

    goto :goto_e

    :cond_16
    move-object/from16 v3, v27

    :goto_d
    new-instance v7, Lc;

    const/16 v8, 0x16

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    invoke-direct {v7, v10, v0, v9, v8}, Lc;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v13, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_e
    move-object/from16 v18, v7

    check-cast v18, Lc93/a;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v20, v0, 0x12

    const/16 v21, 0x0

    const/16 v22, 0x1d3e

    move/from16 v26, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v19, v13

    const/4 v13, 0x0

    const/4 v15, 0x0

    move v0, v5

    move-object/from16 v5, v16

    const/16 v16, 0x0

    move-object/from16 v11, v17

    const/16 v17, 0x0

    invoke-static/range {v5 .. v22}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v19

    move/from16 v9, v25

    move-object/from16 v5, v31

    invoke-static {v9, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v13, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move/from16 p3, v0

    move-object/from16 v27, v3

    move-object v2, v5

    move-object/from16 v0, v29

    move/from16 v3, v30

    goto/16 :goto_9

    :cond_17
    move-object v5, v2

    move v6, v3

    const/4 v7, 0x0

    invoke-static {v13, v7, v5, v6, v13}, Lhc3/i;->r(Lp1/q;ZLb2/t;FLp1/q;)V

    invoke-virtual/range {v23 .. v23}, Lyx1/c;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual/range {v23 .. v23}, Lyx1/c;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual/range {v23 .. v23}, Lyx1/c;->i()Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v5, v1, 0x3

    or-int/2addr v1, v5

    shl-int/lit8 v5, v24, 0x6

    and-int/lit16 v6, v5, 0x1c00

    or-int/2addr v1, v6

    const v6, 0xe000

    and-int/2addr v5, v6

    or-int v8, v1, v5

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move v1, v4

    move-object v7, v13

    move-object v4, v0

    invoke-static/range {v2 .. v8}, Lby1/d;->d(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v6, 0x0

    invoke-static {v13, v1, v1, v6}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_f

    :cond_18
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_f
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_19

    new-instance v0, Lj;

    const/16 v5, 0x14

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lj;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method private static final e(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;Lyx1/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 5

    new-instance v0, Lvx1/a$a;

    invoke-virtual {p1}, Lyx1/a;->b()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toLowerCase(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "_"

    const/4 v3, 0x0

    const-string v4, " "

    invoke-static {v1, v4, v2, v3}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lvx1/a$a;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lyx1/a;->a()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance p1, Lxx1/b$c;

    invoke-direct {p1, p0}, Lxx1/b$c;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lyx1/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lby1/g;->d(Lyx1/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
