.class public final Lp40/d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/a;

.field public final synthetic F:Lm40/w;

.field public final synthetic G:Ly3/c;

.field public final synthetic H:I

.field public w:I

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/util/ArrayList;

.field public final synthetic z:Lec3/p1;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Lec3/p1;Lc93/a;Lm40/w;Ly3/c;ILq83/d;)V
    .locals 0

    iput-object p1, p0, Lp40/d;->y:Ljava/util/ArrayList;

    iput-object p2, p0, Lp40/d;->z:Lec3/p1;

    iput-object p3, p0, Lp40/d;->E:Lc93/a;

    iput-object p4, p0, Lp40/d;->F:Lm40/w;

    iput-object p5, p0, Lp40/d;->G:Ly3/c;

    iput p6, p0, Lp40/d;->H:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 8

    new-instance v0, Lp40/d;

    iget-object v5, p0, Lp40/d;->G:Ly3/c;

    iget v6, p0, Lp40/d;->H:I

    iget-object v1, p0, Lp40/d;->y:Ljava/util/ArrayList;

    iget-object v2, p0, Lp40/d;->z:Lec3/p1;

    iget-object v3, p0, Lp40/d;->E:Lc93/a;

    iget-object v4, p0, Lp40/d;->F:Lm40/w;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lp40/d;-><init>(Ljava/util/ArrayList;Lec3/p1;Lc93/a;Lm40/w;Ly3/c;ILq83/d;)V

    iput-object p1, v0, Lp40/d;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lp40/d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lp40/d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp40/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lp40/d;->w:I

    iget-object v3, v0, Lp40/d;->F:Lm40/w;

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v5, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_1

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lp40/d;->x:Ljava/lang/Object;

    check-cast v2, Lbc3/c0;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    iget-object v8, v0, Lp40/d;->y:Ljava/util/ArrayList;

    invoke-static {v8, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll3/e;

    new-instance v9, Ln43/a;

    const/16 v10, 0x8

    invoke-direct {v9, v8, v3, v4, v10}, Ln43/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v8, 0x3

    invoke-static {v2, v4, v9, v8}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iput v5, v0, Lp40/d;->w:I

    invoke-static {v6, v0}, Lbc3/f0;->f(Ljava/util/ArrayList;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast v2, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll83/k;

    iget-object v7, v6, Ll83/k;->x:Ljava/lang/Object;

    check-cast v7, Landroid/graphics/Bitmap;

    if-eqz v7, :cond_5

    new-instance v8, Ll83/k;

    iget-object v6, v6, Ll83/k;->w:Ljava/lang/Object;

    invoke-direct {v8, v6, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    :cond_5
    move-object v8, v4

    :goto_3
    if-eqz v8, :cond_4

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    invoke-static {v1}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v6

    invoke-static {v6}, Lm83/g0;->W(I)I

    move-result v6

    invoke-direct {v2, v6}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/graphics/Bitmap;

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    int-to-float v8, v8

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/graphics/Bitmap;

    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    int-to-float v9, v9

    invoke-static {v8, v9}, Ljc/x;->b(FF)J

    move-result-wide v8

    int-to-float v10, v5

    iget-object v11, v0, Lp40/d;->G:Ly3/c;

    invoke-interface {v11}, Ly3/c;->getDensity()F

    move-result v11

    div-float/2addr v10, v11

    invoke-static {v10, v8, v9}, Lh2/e;->g(FJ)J

    move-result-wide v8

    new-instance v10, Lu0/j0;

    new-instance v11, Ll3/d0;

    invoke-static {v8, v9}, Lh2/e;->e(J)F

    move-result v12

    const-wide v13, 0x100000000L

    invoke-static {v12, v13, v14}, Lv63/c;->j(FJ)J

    move-result-wide v15

    invoke-static {v8, v9}, Lh2/e;->c(J)F

    move-result v12

    invoke-static {v12, v13, v14}, Lv63/c;->j(FJ)J

    move-result-wide v12

    iget v14, v0, Lp40/d;->H:I

    move-wide/from16 v17, v15

    move/from16 v16, v14

    move-wide v14, v12

    move-wide/from16 v12, v17

    invoke-direct/range {v11 .. v16}, Ll3/d0;-><init>(JJI)V

    new-instance v12, Lp40/c;

    invoke-direct {v12, v6, v3, v8, v9}, Lp40/c;-><init>(Ljava/util/Map$Entry;Lm40/w;J)V

    new-instance v6, Lx1/b;

    const v8, 0x33320e15

    invoke-direct {v6, v12, v5, v8}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-direct {v10, v11, v6}, Lu0/j0;-><init>(Ll3/d0;Lx1/b;)V

    invoke-interface {v2, v7, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_7
    iget-object v1, v0, Lp40/d;->z:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v4, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v1, v0, Lp40/d;->E:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
