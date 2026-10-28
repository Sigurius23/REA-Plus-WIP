.class public final Lr51/e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr51/e;->i(Landroidx/compose/ui/Modifier;Lr51/f;Lb91/a;Li2/x;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/n;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Ljava/util/List;

.field final synthetic x:F

.field final synthetic y:Lp1/c1;

.field final synthetic z:Lp1/t2;


# direct methods
.method public constructor <init>(Ljava/util/List;FLp1/c1;Lp1/t2;)V
    .locals 0

    iput-object p1, p0, Lr51/e$c;->w:Ljava/util/List;

    iput p2, p0, Lr51/e$c;->x:F

    iput-object p3, p0, Lr51/e$c;->y:Lp1/c1;

    iput-object p4, p0, Lr51/e$c;->z:Lp1/t2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 38

    move-object/from16 v0, p0

    move/from16 v1, p2

    and-int/lit8 v2, p4, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_1

    move-object/from16 v2, p3

    check-cast v2, Lp1/q;

    move-object/from16 v4, p1

    invoke-virtual {v2, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int v2, p4, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p4

    :goto_1
    and-int/lit8 v4, p4, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p3

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1}, Lp1/q;->e(I)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v2, v4

    :cond_3
    and-int/lit16 v4, v2, 0x93

    const/16 v5, 0x92

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eq v4, v5, :cond_4

    move v4, v6

    goto :goto_3

    :cond_4
    move v4, v7

    :goto_3
    and-int/2addr v2, v6

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    invoke-virtual {v11, v2, v4}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v2, v0, Lr51/e$c;->w:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr51/g;

    const v4, -0x40389819

    invoke-virtual {v11, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lr51/g;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v4, v11, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    new-instance v13, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual {v2}, Lr51/g;->c()Ljava/lang/String;

    move-result-object v5

    const-string v6, "\u2009\u2009\u2009"

    invoke-static {v5, v6, v4}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v13, v4}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    iget v4, v0, Lr51/e$c;->x:F

    sget-object v5, Lb2/t;->w:Lb2/t;

    const/4 v6, 0x0

    invoke-static {v5, v4, v6, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v12, Ly71/o;->p:Ly71/o$c;

    iget-object v3, v0, Lr51/e$c;->y:Lp1/c1;

    invoke-static {v3}, Lr51/e;->w(Lp1/c1;)Lr51/g;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lr51/g;->b()Ljava/lang/String;

    move-result-object v3

    goto :goto_4

    :cond_5
    const/4 v3, 0x0

    :goto_4
    invoke-virtual {v2}, Lr51/g;->b()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v28

    const v36, 0x7f7ffe

    const/16 v37, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    invoke-static/range {v12 .. v37}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v9

    iget-object v3, v0, Lr51/e$c;->y:Lp1/c1;

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_6

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v4, v3, :cond_7

    :cond_6
    new-instance v4, Lr51/e$a;

    iget-object v3, v0, Lr51/e$c;->y:Lp1/c1;

    invoke-direct {v4, v2, v3}, Lr51/e$a;-><init>(Lr51/g;Lp1/c1;)V

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v10, v4

    check-cast v10, Lc93/a;

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v8 .. v13}, Ly71/n;->c(Landroidx/compose/ui/Modifier;Ly71/o;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    iget-object v2, v0, Lr51/e$c;->z:Lp1/t2;

    invoke-static {v2}, Lr51/e;->y(Lp1/t2;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v2

    if-eq v1, v2, :cond_8

    const v1, -0x402d7322

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    const-wide/high16 v1, 0x3ff8000000000000L    # 1.5

    double-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    invoke-static {v1, v2, v5, v11, v7}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    goto :goto_5

    :cond_8
    const v1, -0x402c2509

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    :goto_5
    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    return-void

    :cond_9
    invoke-virtual {v11}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lr51/e$c;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
