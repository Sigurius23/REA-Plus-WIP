.class public final Lly0/e$g;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lly0/e;->g(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;Ly71/g;JZLandroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "a",
        "(Landroidx/compose/runtime/Composer;I)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation


# instance fields
.field final synthetic E:Lb91/a;

.field final synthetic F:Ly71/g;

.field final synthetic G:Lcom/whoop/design/util/TextResource;

.field final synthetic H:J

.field final synthetic I:Z

.field final synthetic w:Lp1/c1;

.field final synthetic x:Le4/k;

.field final synthetic y:Lc93/a;

.field final synthetic z:Lcom/whoop/design/util/TextResource;


# direct methods
.method public constructor <init>(Lp1/c1;Le4/k;Lc93/a;Lcom/whoop/design/util/TextResource;Lb91/a;Ly71/g;Lcom/whoop/design/util/TextResource;JZ)V
    .locals 0

    iput-object p1, p0, Lly0/e$g;->w:Lp1/c1;

    iput-object p2, p0, Lly0/e$g;->x:Le4/k;

    iput-object p3, p0, Lly0/e$g;->y:Lc93/a;

    iput-object p4, p0, Lly0/e$g;->z:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lly0/e$g;->E:Lb91/a;

    iput-object p6, p0, Lly0/e$g;->F:Ly71/g;

    iput-object p7, p0, Lly0/e$g;->G:Lcom/whoop/design/util/TextResource;

    iput-wide p8, p0, Lly0/e$g;->H:J

    iput-boolean p10, p0, Lly0/e$g;->I:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/runtime/Composer;I)V
    .locals 42

    move-object/from16 v0, p0

    and-int/lit8 v1, p2, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    move-object/from16 v1, p1

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    return-void

    :cond_1
    :goto_0
    iget-object v1, v0, Lly0/e$g;->w:Lp1/c1;

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    invoke-interface {v1, v3}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    iget-object v1, v0, Lly0/e$g;->x:Le4/k;

    iget v3, v1, Le4/k;->b:I

    invoke-virtual {v1}, Le4/k;->e()V

    iget-object v1, v0, Lly0/e$g;->x:Le4/k;

    move-object/from16 v9, p1

    check-cast v9, Lp1/q;

    const v4, 0x145ef1ed

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Le4/k;->d()Lad3/z;

    move-result-object v1

    iget-object v1, v1, Lad3/z;->x:Ljava/lang/Object;

    check-cast v1, Le4/k;

    invoke-virtual {v1}, Le4/k;->c()Le4/f;

    move-result-object v4

    invoke-virtual {v1}, Le4/k;->c()Le4/f;

    move-result-object v5

    invoke-virtual {v1}, Le4/k;->c()Le4/f;

    move-result-object v1

    iget-object v6, v0, Lly0/e$g;->z:Lcom/whoop/design/util/TextResource;

    const/4 v7, 0x0

    invoke-static {v6, v9, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    sget-object v8, Lx81/d;->a:Lx81/d;

    const/4 v10, 0x6

    invoke-virtual {v8, v9, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v11

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-ne v8, v13, :cond_2

    sget-object v8, Lly0/e$a;->w:Lly0/e$a;

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v8, Lkotlin/jvm/functions/Function1;

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v14, v4, v8}, Le4/k;->b(Landroidx/compose/ui/Modifier;Le4/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    iget-object v15, v0, Lly0/e$g;->E:Lb91/a;

    const/16 v28, 0x0

    const v29, 0x2fff8

    move-object/from16 v16, v5

    move-object v5, v8

    move-object/from16 v26, v9

    const-wide/16 v8, 0x0

    move/from16 v17, v10

    const/4 v10, 0x0

    move/from16 v18, v7

    move-wide/from16 v40, v11

    move-object v12, v4

    move-object v4, v6

    move-wide/from16 v6, v40

    const/4 v11, 0x0

    move-object/from16 v19, v12

    const/4 v12, 0x0

    move-object/from16 v21, v13

    move-object/from16 v20, v14

    const-wide/16 v13, 0x0

    move-object/from16 v24, v15

    const/4 v15, 0x0

    move-object/from16 v22, v16

    const/16 v16, 0x0

    move/from16 v23, v17

    move/from16 v25, v18

    const-wide/16 v17, 0x0

    move-object/from16 v27, v19

    const/16 v19, 0x0

    move-object/from16 v30, v20

    const/16 v20, 0x0

    move-object/from16 v31, v21

    const/16 v21, 0x0

    move-object/from16 v32, v22

    const/16 v22, 0x0

    move/from16 v33, v23

    const/16 v23, 0x0

    move/from16 v34, v25

    const/16 v25, 0x0

    move-object/from16 v35, v27

    const/16 v27, 0x0

    move-object/from16 v38, v30

    move-object/from16 v39, v31

    move-object/from16 v37, v32

    move/from16 v2, v34

    move-object/from16 v36, v35

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v26

    iget-object v4, v0, Lly0/e$g;->F:Ly71/g;

    if-nez v4, :cond_3

    const v1, 0x1464bea6

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    move-object/from16 v13, v36

    move-object/from16 v12, v38

    move-object/from16 v14, v39

    goto :goto_1

    :cond_3
    const v4, 0x1464bea7

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    iget-object v4, v0, Lly0/e$g;->F:Ly71/g;

    invoke-virtual {v4}, Ly71/g;->b()I

    move-result v5

    const/4 v6, 0x6

    invoke-static {v5, v9, v6}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    invoke-virtual {v4}, Ly71/g;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v4, v9, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x2

    int-to-float v6, v6

    const/4 v7, 0x4

    int-to-float v7, v7

    mul-float/2addr v6, v7

    move-object/from16 v12, v38

    invoke-static {v6, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object/from16 v13, v36

    invoke-virtual {v9, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v14, v39

    if-nez v7, :cond_4

    if-ne v8, v14, :cond_5

    :cond_4
    new-instance v8, Lly0/e$b;

    invoke-direct {v8, v13}, Lly0/e$b;-><init>(Le4/f;)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v6, v1, v8}, Le4/k;->b(Landroidx/compose/ui/Modifier;Le4/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    iget-wide v7, v0, Lly0/e$g;->H:J

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v40, v5

    move-object v5, v4

    move-object/from16 v4, v40

    invoke-static/range {v4 .. v11}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    :goto_1
    iget-object v1, v0, Lly0/e$g;->G:Lcom/whoop/design/util/TextResource;

    const/4 v4, 0x0

    if-eqz v1, :cond_6

    invoke-static {v1}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v5

    if-eqz v5, :cond_6

    move-object v6, v1

    goto :goto_2

    :cond_6
    move-object v6, v4

    :goto_2
    if-nez v6, :cond_7

    const v1, 0x146dfd6d

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_7
    const v1, 0x146dfd6e

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    iget-object v4, v0, Lly0/e$g;->z:Lcom/whoop/design/util/TextResource;

    iget-object v5, v0, Lly0/e$g;->E:Lb91/a;

    iget-boolean v7, v0, Lly0/e$g;->I:Z

    invoke-virtual {v9, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v1, :cond_8

    if-ne v8, v14, :cond_9

    :cond_8
    new-instance v8, Lly0/e$c;

    invoke-direct {v8, v13}, Lly0/e$c;-><init>(Le4/f;)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v8, Lkotlin/jvm/functions/Function1;

    move-object/from16 v1, v37

    invoke-static {v12, v1, v8}, Le4/k;->b(Landroidx/compose/ui/Modifier;Le4/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v10, 0x0

    invoke-static/range {v4 .. v10}, Lly0/e;->o(Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    :goto_3
    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    iget-object v1, v0, Lly0/e$g;->x:Le4/k;

    iget v1, v1, Le4/k;->b:I

    if-eq v1, v3, :cond_a

    iget-object v1, v0, Lly0/e$g;->y:Lc93/a;

    invoke-static {v1, v9}, Lp1/x;->k(Lc93/a;Landroidx/compose/runtime/Composer;)V

    :cond_a
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lly0/e$g;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
