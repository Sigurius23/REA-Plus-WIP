.class public final Lc01/e$d;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc01/e;->o(Lc01/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic E:Lc01/i;

.field final synthetic w:Lp1/c1;

.field final synthetic x:Le4/k;

.field final synthetic y:Lc93/a;

.field final synthetic z:Landroidx/compose/ui/Modifier;


# direct methods
.method public constructor <init>(Lp1/c1;Le4/k;Lc93/a;Landroidx/compose/ui/Modifier;Lc01/i;)V
    .locals 0

    iput-object p1, p0, Lc01/e$d;->w:Lp1/c1;

    iput-object p2, p0, Lc01/e$d;->x:Le4/k;

    iput-object p3, p0, Lc01/e$d;->y:Lc93/a;

    iput-object p4, p0, Lc01/e$d;->z:Landroidx/compose/ui/Modifier;

    iput-object p5, p0, Lc01/e$d;->E:Lc01/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/runtime/Composer;I)V
    .locals 38

    move-object/from16 v0, p0

    const/4 v1, 0x3

    and-int/lit8 v2, p2, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lp1/q;->X()V

    return-void

    :cond_1
    :goto_0
    iget-object v2, v0, Lc01/e$d;->w:Lp1/c1;

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    invoke-interface {v2, v4}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    iget-object v2, v0, Lc01/e$d;->x:Le4/k;

    iget v4, v2, Le4/k;->b:I

    invoke-virtual {v2}, Le4/k;->e()V

    iget-object v2, v0, Lc01/e$d;->x:Le4/k;

    move-object/from16 v5, p1

    check-cast v5, Lp1/q;

    const v6, 0x67eae821

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Le4/k;->d()Lad3/z;

    move-result-object v2

    iget-object v2, v2, Lad3/z;->x:Ljava/lang/Object;

    check-cast v2, Le4/k;

    invoke-virtual {v2}, Le4/k;->c()Le4/f;

    move-result-object v6

    invoke-virtual {v2}, Le4/k;->c()Le4/f;

    move-result-object v7

    invoke-virtual {v2}, Le4/k;->c()Le4/f;

    move-result-object v2

    iget-object v8, v0, Lc01/e$d;->z:Landroidx/compose/ui/Modifier;

    int-to-float v3, v3

    const/4 v9, 0x4

    int-to-float v9, v9

    mul-float/2addr v3, v9

    invoke-static {v3, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    iget-object v8, v0, Lc01/e$d;->E:Lc01/i;

    invoke-virtual {v8}, Lc01/i;->b()Ly81/e;

    move-result-object v8

    const/4 v9, 0x0

    invoke-interface {v8, v5, v9}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v10

    sget-object v8, Li2/w0;->a:Li2/v0;

    invoke-static {v3, v10, v11, v8}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v5, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-nez v8, :cond_2

    if-ne v10, v11, :cond_3

    :cond_2
    new-instance v10, Lc01/e$e;

    invoke-direct {v10, v7}, Lc01/e$e;-><init>(Le4/f;)V

    invoke-virtual {v5, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v6, v10}, Le4/k;->b(Landroidx/compose/ui/Modifier;Le4/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3, v5, v9}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v3, :cond_4

    if-ne v8, v11, :cond_5

    :cond_4
    new-instance v8, Lc01/e$f;

    invoke-direct {v8, v6}, Lc01/e$f;-><init>(Le4/f;)V

    invoke-virtual {v5, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v8, Lkotlin/jvm/functions/Function1;

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v7, v8}, Le4/k;->b(Landroidx/compose/ui/Modifier;Le4/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    iget-object v8, v0, Lc01/e$d;->E:Lc01/i;

    invoke-virtual {v8}, Lc01/i;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static {v8, v5, v9}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    sget-object v10, Lx81/d;->a:Lx81/d;

    const/4 v12, 0x6

    invoke-virtual {v10, v5, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->y()J

    move-result-wide v13

    invoke-virtual {v10, v5, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v15

    invoke-virtual {v15}, Lb91/d;->D()Lb91/a;

    move-result-object v25

    const/16 v29, 0x0

    const v30, 0x2fff8

    move/from16 v16, v9

    move-object v15, v10

    const-wide/16 v9, 0x0

    move-object/from16 v17, v11

    const/4 v11, 0x0

    move/from16 v18, v12

    const/4 v12, 0x0

    move-object/from16 v27, v5

    move-object v5, v8

    move-wide/from16 v36, v13

    move-object v14, v7

    move-wide/from16 v7, v36

    const/4 v13, 0x0

    move-object/from16 v19, v14

    move-object/from16 v20, v15

    const-wide/16 v14, 0x0

    move/from16 v21, v16

    const/16 v16, 0x0

    move-object/from16 v22, v17

    const/16 v17, 0x0

    move/from16 v24, v18

    move-object/from16 v23, v19

    const-wide/16 v18, 0x0

    move-object/from16 v26, v20

    const/16 v20, 0x0

    move/from16 v28, v21

    const/16 v21, 0x0

    move-object/from16 v31, v22

    const/16 v22, 0x0

    move-object/from16 v32, v23

    const/16 v23, 0x0

    move/from16 v33, v24

    const/16 v24, 0x0

    move-object/from16 v34, v26

    const/16 v26, 0x0

    move/from16 v35, v28

    const/16 v28, 0x0

    move-object/from16 p1, v31

    move/from16 v31, v4

    move-object/from16 v4, p1

    move-object/from16 p1, v3

    move-object/from16 v3, v32

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    int-to-float v1, v1

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float v13, v1, v6

    const/16 v16, 0x0

    const/16 v17, 0xe

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v12, p1

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v5, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_6

    if-ne v7, v4, :cond_7

    :cond_6
    new-instance v7, Lc01/e$g;

    invoke-direct {v7, v3}, Lc01/e$g;-><init>(Le4/f;)V

    invoke-virtual {v5, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2, v7}, Le4/k;->b(Landroidx/compose/ui/Modifier;Le4/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    iget-object v1, v0, Lc01/e$d;->E:Lc01/i;

    invoke-virtual {v1}, Lc01/i;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v5, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v15, v34

    const/4 v3, 0x6

    invoke-virtual {v15, v5, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->c1()J

    move-result-wide v7

    invoke-virtual {v15, v5, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    const/16 v29, 0x0

    const v30, 0x2fff8

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    move-object/from16 v27, v5

    move-object v5, v1

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    iget-object v1, v0, Lc01/e$d;->x:Le4/k;

    iget v1, v1, Le4/k;->b:I

    move/from16 v2, v31

    if-eq v1, v2, :cond_8

    iget-object v1, v0, Lc01/e$d;->y:Lc93/a;

    invoke-static {v1, v5}, Lp1/x;->k(Lc93/a;Landroidx/compose/runtime/Composer;)V

    :cond_8
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lc01/e$d;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
