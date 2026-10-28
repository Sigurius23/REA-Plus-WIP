.class public final Lg1/g7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Z

.field public final synthetic w:Ljava/util/Map;

.field public final synthetic x:Lg1/n7;

.field public final synthetic y:Lg1/x4;

.field public final synthetic z:Lc93/m;


# direct methods
.method public constructor <init>(Ljava/util/Map;Lg1/n7;Lg1/x4;Lc93/m;ZZ)V
    .locals 1

    sget-object v0, Lg1/d7;->a:Ld0/i1;

    sget-object v0, Lh0/d2;->w:Lh0/d2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/g7;->w:Ljava/util/Map;

    iput-object p2, p0, Lg1/g7;->x:Lg1/n7;

    iput-object p3, p0, Lg1/g7;->y:Lg1/x4;

    iput-object p4, p0, Lg1/g7;->z:Lc93/m;

    iput-boolean p5, p0, Lg1/g7;->E:Z

    iput-boolean p6, p0, Lg1/g7;->F:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/ui/Modifier;

    move-object/from16 v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    check-cast v1, Lp1/q;

    const v2, 0x29934e9

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    iget-object v2, v0, Lg1/g7;->w:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_7

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, Lm83/s;->y0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v4

    if-ne v3, v4, :cond_6

    sget-object v3, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v1, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Ly3/c;

    iget-object v3, v0, Lg1/g7;->x:Lg1/n7;

    iget-object v4, v3, Lg1/n7;->i:Lp1/k1;

    invoke-virtual {v4}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    invoke-interface {v4}, Ljava/util/Map;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, v3, Lg1/n7;->c:Lp1/k1;

    invoke-virtual {v4}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v2}, Lj93/l0;->g(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Float;

    move-result-object v4

    if-eqz v4, :cond_0

    iget-object v5, v3, Lg1/n7;->e:Lp1/g1;

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v6

    invoke-virtual {v5, v6}, Lp1/g1;->y(F)V

    iget-object v5, v3, Lg1/n7;->g:Lp1/g1;

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-virtual {v5, v4}, Lp1/g1;->y(F)V

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "The initial value must have an associated anchor."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    invoke-virtual {v1, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v1, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    iget-object v5, v0, Lg1/g7;->y:Lg1/x4;

    invoke-virtual {v1, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    iget-object v5, v0, Lg1/g7;->z:Lc93/m;

    invoke-virtual {v1, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v1, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    sget v5, Lg1/d7;->b:F

    invoke-virtual {v1, v5}, Lp1/q;->d(F)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-nez v4, :cond_2

    if-ne v5, v11, :cond_3

    :cond_2
    new-instance v4, Lbh/h;

    const/4 v10, 0x0

    iget-object v5, v0, Lg1/g7;->x:Lg1/n7;

    iget-object v6, v0, Lg1/g7;->w:Ljava/util/Map;

    iget-object v7, v0, Lg1/g7;->y:Lg1/x4;

    iget-object v9, v0, Lg1/g7;->z:Lc93/m;

    invoke-direct/range {v4 .. v10}, Lbh/h;-><init>(Lg1/n7;Ljava/util/Map;Lg1/x4;Ly3/c;Lc93/m;Lq83/d;)V

    invoke-virtual {v1, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v5, v4

    :cond_3
    check-cast v5, Lc93/m;

    invoke-static {v2, v3, v5, v1}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    iget-object v2, v3, Lg1/n7;->d:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v17

    iget-object v13, v3, Lg1/n7;->p:Lh0/z;

    sget-object v14, Lh0/d2;->x:Lh0/d2;

    invoke-virtual {v1, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_4

    if-ne v4, v11, :cond_5

    :cond_4
    new-instance v4, Lg1/f7;

    const/4 v2, 0x0

    invoke-direct {v4, v3, v2}, Lg1/f7;-><init>(Lg1/n7;Lq83/d;)V

    invoke-virtual {v1, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object/from16 v19, v4

    check-cast v19, Lkotlin/jvm/functions/Function3;

    iget-boolean v2, v0, Lg1/g7;->F:Z

    const/16 v21, 0x20

    sget-object v12, Lb2/t;->w:Lb2/t;

    iget-boolean v15, v0, Lg1/g7;->E:Z

    const/16 v16, 0x0

    const/16 v18, 0x0

    move/from16 v20, v2

    invoke-static/range {v12 .. v21}, Lh0/k1;->a(Landroidx/compose/ui/Modifier;Lh0/n1;Lh0/d2;ZLj0/i;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ZI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lp1/q;->q(Z)V

    return-object v2

    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "You cannot have two anchors mapped to the same state."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "You must have at least one anchor."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
