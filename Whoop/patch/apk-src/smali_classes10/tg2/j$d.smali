.class public final Ltg2/j$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltg2/j;->g(Ln82/c;Ln82/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
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

.field final synthetic x:I

.field final synthetic y:Lkotlin/jvm/functions/Function1;

.field final synthetic z:Ln82/c;


# direct methods
.method public constructor <init>(Ljava/util/List;ILkotlin/jvm/functions/Function1;Ln82/c;)V
    .locals 0

    iput-object p1, p0, Ltg2/j$d;->w:Ljava/util/List;

    iput p2, p0, Ltg2/j$d;->x:I

    iput-object p3, p0, Ltg2/j$d;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Ltg2/j$d;->z:Ln82/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 21

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

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v2, v4}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v2, v0, Ltg2/j$d;->w:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly71/o;

    const v4, -0x25001b1c

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lb2/t;->w:Lb2/t;

    const/16 v5, 0x8

    if-nez v1, :cond_5

    const v8, -0x25000cb4

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    int-to-float v3, v3

    int-to-float v8, v5

    mul-float/2addr v3, v8

    const/4 v8, 0x0

    invoke-static {v4, v8, v3, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    iget v3, v0, Ltg2/j$d;->x:I

    invoke-static {v3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v11

    sget v3, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v3, v3, 0x9

    or-int/lit8 v19, v3, 0x6

    const/16 v20, 0xf6

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v18, v12

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    invoke-static/range {v8 .. v20}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v12, v18

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_5
    const v3, -0x24fd1dec

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    :goto_4
    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    iget-object v8, v0, Ltg2/j$d;->y:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v12, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v3, v8

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v3, :cond_6

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v8, v3, :cond_7

    :cond_6
    new-instance v8, Ltg2/j$a;

    iget-object v3, v0, Ltg2/j$d;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {v8, v2, v3}, Ltg2/j$a;-><init>(Ly71/o;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v12, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v11, v8

    check-cast v11, Lkotlin/jvm/functions/Function1;

    sget v13, Ly71/o;->q:I

    const/4 v14, 0x6

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v8, v2

    invoke-static/range {v8 .. v14}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    iget-object v2, v0, Ltg2/j$d;->z:Ln82/c;

    invoke-virtual {v2}, Ln82/c;->h()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v6

    if-ne v1, v2, :cond_8

    const v1, -0x24f8919b

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    int-to-float v1, v6

    int-to-float v2, v5

    invoke-static {v1, v2, v4, v12, v7}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    goto :goto_5

    :cond_8
    const v1, -0x24f7690c

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    :goto_5
    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    return-void

    :cond_9
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

    invoke-virtual {p0, p1, p2, p3, p4}, Ltg2/j$d;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
