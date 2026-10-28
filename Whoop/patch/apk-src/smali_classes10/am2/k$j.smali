.class public final Lam2/k$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lam2/k;->A(Lcm2/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic E:Lp1/c1;

.field final synthetic F:Lp1/c1;

.field final synthetic w:Ljava/util/List;

.field final synthetic x:Lp1/c1;

.field final synthetic y:Lp1/c1;

.field final synthetic z:Lp1/c1;


# direct methods
.method public constructor <init>(Ljava/util/List;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;)V
    .locals 0

    iput-object p1, p0, Lam2/k$j;->w:Ljava/util/List;

    iput-object p2, p0, Lam2/k$j;->x:Lp1/c1;

    iput-object p3, p0, Lam2/k$j;->y:Lp1/c1;

    iput-object p4, p0, Lam2/k$j;->z:Lp1/c1;

    iput-object p5, p0, Lam2/k$j;->E:Lp1/c1;

    iput-object p6, p0, Lam2/k$j;->F:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 20

    move-object/from16 v0, p0

    move/from16 v1, p2

    and-int/lit8 v2, p4, 0x6

    if-nez v2, :cond_1

    move-object/from16 v2, p3

    check-cast v2, Lp1/q;

    move-object/from16 v3, p1

    invoke-virtual {v2, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p4, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p4

    :goto_1
    and-int/lit8 v3, p4, 0x30

    if-nez v3, :cond_3

    move-object/from16 v3, p3

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v1}, Lp1/q;->e(I)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit16 v3, v2, 0x93

    const/16 v4, 0x92

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eq v3, v4, :cond_4

    move v3, v5

    goto :goto_3

    :cond_4
    move v3, v6

    :goto_3
    and-int/2addr v2, v5

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_b

    iget-object v2, v0, Lam2/k$j;->w:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Lcm2/p;

    const v1, 0x406386e4

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v14}, Lcm2/p;->a()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lcom/whoop/design/util/TextResource;

    if-eqz v2, :cond_5

    const v1, 0x40640f9a

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v14}, Lcm2/p;->a()Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lcom/whoop/design/util/TextResource;

    const/16 v18, 0x0

    const/16 v19, 0xf7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v17, v12

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    invoke-static/range {v7 .. v19}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v12, v17

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    goto/16 :goto_4

    :cond_5
    instance-of v1, v1, Lbm2/n;

    if-eqz v1, :cond_a

    const v1, 0x4066e323

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v14}, Lcm2/p;->a()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lbm2/n;

    invoke-virtual {v12, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-nez v1, :cond_6

    if-ne v2, v3, :cond_7

    :cond_6
    new-instance v2, Lam2/k$c;

    iget-object v1, v0, Lam2/k$j;->x:Lp1/c1;

    iget-object v4, v0, Lam2/k$j;->y:Lp1/c1;

    invoke-direct {v2, v14, v1, v4}, Lam2/k$c;-><init>(Lcm2/p;Lp1/c1;Lp1/c1;)V

    invoke-virtual {v12, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v8, v2

    check-cast v8, Lc93/a;

    invoke-virtual {v12, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_8

    if-ne v2, v3, :cond_9

    :cond_8
    new-instance v13, Lam2/k$d;

    iget-object v15, v0, Lam2/k$j;->x:Lp1/c1;

    iget-object v1, v0, Lam2/k$j;->z:Lp1/c1;

    iget-object v2, v0, Lam2/k$j;->E:Lp1/c1;

    iget-object v3, v0, Lam2/k$j;->F:Lp1/c1;

    move-object/from16 v16, v1

    move-object/from16 v17, v2

    move-object/from16 v18, v3

    invoke-direct/range {v13 .. v18}, Lam2/k$d;-><init>(Lcm2/p;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;)V

    invoke-virtual {v12, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v13

    :cond_9
    move-object v9, v2

    check-cast v9, Lc93/a;

    new-instance v10, Lg1/n7;

    sget-object v1, Lbm2/t0;->NOT_EXPANDED:Lbm2/t0;

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-direct {v10, v1, v2, v3}, Lg1/n7;-><init>(Ljava/lang/Enum;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v14}, Lcm2/p;->b()Ljava/lang/String;

    move-result-object v11

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v7 .. v14}, Lbm2/m;->h(Lbm2/n;Lc93/a;Lc93/a;Lg1/n7;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_a
    const v1, 0x4074c93c

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    :goto_4
    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    return-void

    :cond_b
    invoke-virtual {v12}, Lp1/q;->X()V

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

    invoke-virtual {p0, p1, p2, p3, p4}, Lam2/k$j;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
