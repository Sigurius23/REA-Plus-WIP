.class public final Luw0/l$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luw0/l;->t(Ljava/util/List;Ly81/e;Lm91/u;Lkotlin/jvm/functions/Function1;Lg2/i;Landroidx/compose/runtime/Composer;I)V
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

.field final synthetic x:Ly81/e;

.field final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Ljava/util/List;Ly81/e;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Luw0/l$g;->w:Ljava/util/List;

    iput-object p2, p0, Luw0/l$g;->x:Ly81/e;

    iput-object p3, p0, Luw0/l$g;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 21

    move-object/from16 v0, p0

    move/from16 v1, p2

    and-int/lit8 v2, p4, 0x6

    const/4 v3, 0x4

    if-nez v2, :cond_1

    move-object/from16 v2, p3

    check-cast v2, Lp1/q;

    move-object/from16 v4, p1

    invoke-virtual {v2, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

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

    if-eqz v2, :cond_a

    iget-object v2, v0, Luw0/l$g;->w:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkm0/g;

    const v2, -0x30e3ba52

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lkm0/g;->a()Lm91/u;

    move-result-object v8

    sget-object v12, Lb2/t;->w:Lb2/t;

    if-nez v8, :cond_9

    const v2, -0x30e420e5

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    int-to-float v2, v3

    mul-float/2addr v2, v2

    invoke-static {v2, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v11, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    int-to-float v3, v6

    const/16 v17, 0x7

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move/from16 v16, v3

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-object v4, v12

    invoke-virtual {v1}, Lkm0/g;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v3

    if-eqz v3, :cond_5

    const v3, -0x30deb050

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    invoke-virtual {v1}, Lkm0/g;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    goto :goto_4

    :cond_5
    const v3, -0x30ddcb53

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    sget v3, Lpw0/a;->a:I

    invoke-static {v11, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    :goto_4
    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v5, v11, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->b1()J

    move-result-wide v13

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v5, v5, 0x9

    or-int/lit8 v19, v5, 0x6

    const/16 v20, 0xd6

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    move-object/from16 v18, v11

    move-object v11, v3

    invoke-static/range {v8 .. v20}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v11, v18

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v11, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const v2, 0x48bf2e92

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lkm0/g;->c()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkm0/d;

    new-instance v12, Lkm0/a;

    invoke-virtual {v2}, Lkm0/d;->getId()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v2}, Lkm0/d;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual {v2}, Lkm0/d;->g()Z

    move-result v15

    invoke-virtual {v2}, Lkm0/d;->a()Lkd1/o;

    move-result-object v16

    invoke-virtual {v2}, Lkm0/d;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v17

    iget-object v3, v0, Luw0/l$g;->x:Ly81/e;

    invoke-virtual {v2}, Lkm0/d;->b()Lhy0/h1;

    move-result-object v19

    invoke-virtual {v2}, Lkm0/d;->e()Ljava/util/List;

    move-result-object v20

    move-object/from16 v18, v3

    invoke-direct/range {v12 .. v20}, Lkm0/a;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLkd1/o;Lcom/whoop/design/util/TextResource;Ly81/e;Lhy0/h1;Ljava/util/List;)V

    iget-object v2, v0, Luw0/l$g;->y:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_6

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_7

    :cond_6
    new-instance v3, Luw0/l$d;

    iget-object v2, v0, Luw0/l$g;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {v3, v2}, Luw0/l$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v10, v3

    check-cast v10, Lkotlin/jvm/functions/Function1;

    move-object v8, v12

    sget v12, Lkm0/a;->i:I

    const/4 v13, 0x2

    const/4 v9, 0x0

    invoke-static/range {v8 .. v13}, Lkm0/b;->d(Lkm0/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_8
    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    :goto_6
    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    return-void

    :cond_9
    move-object v4, v12

    const v1, -0x30e420e4

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    int-to-float v1, v3

    invoke-static {v1, v1, v4, v11}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const/4 v13, 0x0

    const/16 v14, 0xe

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v12, v11

    const/4 v11, 0x0

    invoke-static/range {v8 .. v14}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v11, v12

    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_a
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

    invoke-virtual {p0, p1, p2, p3, p4}, Luw0/l$g;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
