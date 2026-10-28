.class public final Lam/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/r0;


# instance fields
.field public final synthetic a:F

.field public final synthetic b:Lam/h;

.field public final synthetic c:F

.field public final synthetic d:Lam/g;

.field public final synthetic e:Lam/g;

.field public final synthetic f:Lam/a;


# direct methods
.method public constructor <init>(FLam/h;FLam/g;Lam/g;Lam/a;)V
    .locals 1

    sget-object v0, Lam/f;->w:Lam/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lam/c;->a:F

    iput-object p2, p0, Lam/c;->b:Lam/h;

    iput p3, p0, Lam/c;->c:F

    iput-object p4, p0, Lam/c;->d:Lam/g;

    iput-object p5, p0, Lam/c;->e:Lam/g;

    iput-object p6, p0, Lam/c;->f:Lam/a;

    return-void
.end method

.method public static final f(Ljava/util/ArrayList;Lkotlin/jvm/internal/e0;Ly2/t0;FLjava/util/ArrayList;Ljava/util/ArrayList;Lkotlin/jvm/internal/e0;Ljava/util/ArrayList;Lkotlin/jvm/internal/e0;Lkotlin/jvm/internal/e0;)V
    .locals 1

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p1, Lkotlin/jvm/internal/e0;->w:I

    invoke-interface {p2, p3}, Ly3/c;->F(F)I

    move-result p2

    add-int/2addr p2, v0

    iput p2, p1, Lkotlin/jvm/internal/e0;->w:I

    :cond_0
    invoke-static {p4}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p0, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    iget p0, p6, Lkotlin/jvm/internal/e0;->w:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p5, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    iget p0, p1, Lkotlin/jvm/internal/e0;->w:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p7, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    iget p0, p1, Lkotlin/jvm/internal/e0;->w:I

    iget p2, p6, Lkotlin/jvm/internal/e0;->w:I

    add-int/2addr p0, p2

    iput p0, p1, Lkotlin/jvm/internal/e0;->w:I

    iget p0, p8, Lkotlin/jvm/internal/e0;->w:I

    iget p1, p9, Lkotlin/jvm/internal/e0;->w:I

    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    iput p0, p8, Lkotlin/jvm/internal/e0;->w:I

    invoke-virtual {p4}, Ljava/util/ArrayList;->clear()V

    const/4 p0, 0x0

    iput p0, p9, Lkotlin/jvm/internal/e0;->w:I

    iput p0, p6, Lkotlin/jvm/internal/e0;->w:I

    return-void
.end method


# virtual methods
.method public final a(Ly2/t0;Ljava/util/List;J)Ly2/s0;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v3, p1

    const-string v1, "$this$Layout"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "measurables"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Lkotlin/jvm/internal/e0;

    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    new-instance v2, Lkotlin/jvm/internal/e0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v10, Lkotlin/jvm/internal/e0;

    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lkotlin/jvm/internal/e0;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    sget-object v4, Lam/f;->w:Lam/f;

    invoke-static/range {p3 .. p4}, Ly3/a;->k(J)I

    move-result v11

    invoke-static/range {p3 .. p4}, Ly3/a;->i(J)I

    move-result v12

    invoke-static/range {p3 .. p4}, Ly3/a;->j(J)I

    move-result v13

    const/4 v4, 0x0

    const/16 v14, 0xd

    invoke-static {v12, v4, v14}, Ly3/b;->b(III)J

    move-result-wide v14

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_0
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly2/q0;

    invoke-interface {v4, v14, v15}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v4

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v17

    move-wide/from16 p3, v14

    iget v14, v0, Lam/c;->a:F

    if-nez v17, :cond_0

    iget v15, v10, Lkotlin/jvm/internal/e0;->w:I

    invoke-interface {v3, v14}, Ly3/c;->F(F)I

    move-result v17

    add-int v17, v17, v15

    sget-object v15, Lam/f;->w:Lam/f;

    iget v15, v4, Ly2/j1;->w:I

    add-int v15, v15, v17

    if-gt v15, v12, :cond_1

    :cond_0
    move-object v15, v4

    goto :goto_1

    :cond_1
    move-object v15, v4

    iget v4, v0, Lam/c;->c:F

    invoke-static/range {v1 .. v10}, Lam/c;->f(Ljava/util/ArrayList;Lkotlin/jvm/internal/e0;Ly2/t0;FLjava/util/ArrayList;Ljava/util/ArrayList;Lkotlin/jvm/internal/e0;Ljava/util/ArrayList;Lkotlin/jvm/internal/e0;Lkotlin/jvm/internal/e0;)V

    :goto_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_2

    iget v4, v10, Lkotlin/jvm/internal/e0;->w:I

    invoke-interface {v3, v14}, Ly3/c;->F(F)I

    move-result v14

    add-int/2addr v14, v4

    iput v14, v10, Lkotlin/jvm/internal/e0;->w:I

    :cond_2
    invoke-virtual {v5, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v4, v10, Lkotlin/jvm/internal/e0;->w:I

    sget-object v14, Lam/f;->w:Lam/f;

    iget v14, v15, Ly2/j1;->w:I

    add-int/2addr v14, v4

    iput v14, v10, Lkotlin/jvm/internal/e0;->w:I

    iget v4, v7, Lkotlin/jvm/internal/e0;->w:I

    iget v14, v15, Ly2/j1;->x:I

    invoke-static {v4, v14}, Ljava/lang/Math;->max(II)I

    move-result v4

    iput v4, v7, Lkotlin/jvm/internal/e0;->w:I

    move-wide/from16 v14, p3

    goto :goto_0

    :cond_3
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_4

    iget v4, v0, Lam/c;->c:F

    invoke-static/range {v1 .. v10}, Lam/c;->f(Ljava/util/ArrayList;Lkotlin/jvm/internal/e0;Ly2/t0;FLjava/util/ArrayList;Ljava/util/ArrayList;Lkotlin/jvm/internal/e0;Ljava/util/ArrayList;Lkotlin/jvm/internal/e0;Lkotlin/jvm/internal/e0;)V

    :cond_4
    const v3, 0x7fffffff

    if-eq v12, v3, :cond_5

    iget-object v3, v0, Lam/c;->b:Lam/h;

    sget-object v4, Lam/h;->x:Lam/h;

    if-ne v3, v4, :cond_5

    :goto_2
    move v7, v12

    goto :goto_3

    :cond_5
    iget v3, v9, Lkotlin/jvm/internal/e0;->w:I

    invoke-static {v3, v11}, Ljava/lang/Math;->max(II)I

    move-result v12

    goto :goto_2

    :goto_3
    iget v2, v2, Lkotlin/jvm/internal/e0;->w:I

    invoke-static {v2, v13}, Ljava/lang/Math;->max(II)I

    move-result v11

    sget-object v2, Lam/f;->w:Lam/f;

    move-object v2, v1

    new-instance v1, Lam/b;

    move-object v9, v6

    iget-object v6, v0, Lam/c;->e:Lam/g;

    move-object v10, v8

    iget-object v8, v0, Lam/c;->f:Lam/a;

    iget v4, v0, Lam/c;->a:F

    iget-object v5, v0, Lam/c;->d:Lam/g;

    move-object/from16 v3, p1

    invoke-direct/range {v1 .. v10}, Lam/b;-><init>(Ljava/util/ArrayList;Ly2/t0;FLam/g;Lam/g;ILam/a;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    sget-object v2, Lm83/z;->w:Lm83/z;

    invoke-interface {v3, v7, v11, v2, v1}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object v1

    return-object v1
.end method
