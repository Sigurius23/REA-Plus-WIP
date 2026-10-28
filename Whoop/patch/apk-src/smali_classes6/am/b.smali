.class public final Lam/b;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lam/g;

.field public final synthetic F:I

.field public final synthetic G:Lam/a;

.field public final synthetic H:Ljava/util/ArrayList;

.field public final synthetic I:Ljava/util/ArrayList;

.field public final synthetic w:Ljava/util/ArrayList;

.field public final synthetic x:Ly2/t0;

.field public final synthetic y:F

.field public final synthetic z:Lam/g;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Ly2/t0;FLam/g;Lam/g;ILam/a;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 1

    sget-object v0, Lam/f;->w:Lam/f;

    iput-object p1, p0, Lam/b;->w:Ljava/util/ArrayList;

    iput-object p2, p0, Lam/b;->x:Ly2/t0;

    iput p3, p0, Lam/b;->y:F

    iput-object p4, p0, Lam/b;->z:Lam/g;

    iput-object p5, p0, Lam/b;->E:Lam/g;

    iput p6, p0, Lam/b;->F:I

    iput-object p7, p0, Lam/b;->G:Lam/a;

    iput-object p8, p0, Lam/b;->H:Ljava/util/ArrayList;

    iput-object p9, p0, Lam/b;->I:Ljava/util/ArrayList;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Ly2/i1;

    const-string v2, "$this$layout"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lam/f;->w:Lam/f;

    iget-object v2, v0, Lam/b;->w:Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v7, v5, 0x1

    if-ltz v5, :cond_9

    check-cast v6, Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v9

    new-array v10, v9, [I

    move v11, v4

    :goto_1
    iget-object v12, v0, Lam/b;->x:Ly2/t0;

    if-ge v11, v9, :cond_1

    invoke-interface {v6, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ly2/j1;

    sget-object v14, Lam/f;->w:Lam/f;

    iget v13, v13, Ly2/j1;->w:I

    invoke-static {v6}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v14

    if-ge v11, v14, :cond_0

    iget v14, v0, Lam/b;->y:F

    invoke-interface {v12, v14}, Ly3/c;->F(F)I

    move-result v12

    goto :goto_2

    :cond_0
    move v12, v4

    :goto_2
    add-int/2addr v13, v12

    aput v13, v10, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_1
    invoke-static {v2}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v11

    if-ge v5, v11, :cond_2

    iget-object v11, v0, Lam/b;->z:Lam/g;

    iget-object v11, v11, Lam/g;->w:Ll0/l;

    goto :goto_3

    :cond_2
    iget-object v11, v0, Lam/b;->E:Lam/g;

    iget-object v11, v11, Lam/g;->w:Ll0/l;

    :goto_3
    new-array v13, v9, [I

    move v14, v4

    :goto_4
    if-ge v14, v9, :cond_3

    aput v4, v13, v14

    add-int/lit8 v14, v14, 0x1

    goto :goto_4

    :cond_3
    iget v9, v0, Lam/b;->F:I

    invoke-interface {v11, v12, v9, v10, v13}, Ll0/l;->b(Ly3/c;I[I[I)V

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v9, v4

    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    add-int/lit8 v11, v9, 0x1

    if-ltz v9, :cond_7

    check-cast v10, Ly2/j1;

    iget-object v12, v0, Lam/b;->G:Lam/a;

    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/16 p1, 0x0

    iget-object v8, v0, Lam/b;->H:Ljava/util/ArrayList;

    if-eqz v12, :cond_6

    if-eq v12, v15, :cond_5

    const/4 v15, 0x2

    if-ne v12, v15, :cond_4

    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    sget-object v12, Lam/f;->w:Lam/f;

    iget v12, v10, Ly2/j1;->x:I

    sub-int/2addr v8, v12

    :goto_6
    move/from16 v19, v5

    move v12, v9

    goto :goto_7

    :cond_4
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_5
    move v8, v4

    goto :goto_6

    :cond_6
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    sget-object v12, Lam/f;->w:Lam/f;

    iget v12, v10, Ly2/j1;->x:I

    sub-int/2addr v8, v12

    invoke-static {v4, v8}, Lv63/b;->a(II)J

    move-result-wide v16

    sget-object v8, Ly3/m;->w:Ly3/m;

    move v12, v9

    const/16 v18, 0x20

    shr-long v8, v16, v18

    long-to-int v8, v8

    move/from16 v19, v5

    const-wide/16 v4, 0x0

    long-to-int v4, v4

    sub-int/2addr v8, v4

    int-to-float v5, v8

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v5, v8

    const-wide v20, 0xffffffffL

    move/from16 v22, v8

    and-long v8, v16, v20

    long-to-int v8, v8

    sub-int/2addr v8, v4

    int-to-float v4, v8

    div-float v4, v4, v22

    int-to-float v8, v15

    add-float/2addr v8, v14

    mul-float/2addr v5, v8

    mul-float/2addr v8, v4

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v4

    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    move-result v5

    int-to-long v8, v4

    shl-long v8, v8, v18

    int-to-long v4, v5

    and-long v4, v4, v20

    or-long/2addr v4, v8

    and-long v4, v4, v20

    long-to-int v8, v4

    :goto_7
    sget-object v4, Lam/f;->w:Lam/f;

    aget v4, v13, v12

    iget-object v5, v0, Lam/b;->I:Ljava/util/ArrayList;

    move/from16 v9, v19

    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    add-int/2addr v5, v8

    invoke-virtual {v1, v10, v4, v5, v14}, Ly2/i1;->f(Ly2/j1;IIF)V

    move v5, v9

    move v9, v11

    const/4 v4, 0x0

    goto/16 :goto_5

    :cond_7
    const/16 p1, 0x0

    invoke-static {}, Lwb3/f;->d0()V

    throw p1

    :cond_8
    move v5, v7

    goto/16 :goto_0

    :cond_9
    const/16 p1, 0x0

    invoke-static {}, Lwb3/f;->d0()V

    throw p1

    :cond_a
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
