.class public final Lpj2/i$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpj2/i;->G0(Lnj2/p;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)V
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

.field final synthetic x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lpj2/i$g;->w:Ljava/util/List;

    iput-object p2, p0, Lpj2/i$g;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 20

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

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v4, v5, :cond_4

    move v4, v7

    goto :goto_3

    :cond_4
    move v4, v6

    :goto_3
    and-int/2addr v2, v7

    move-object/from16 v5, p3

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v2, v4}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_a

    iget-object v2, v0, Lpj2/i$g;->w:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnj2/y;

    const v2, -0x7aaa4774

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    int-to-float v2, v3

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float v9, v2, v3

    const/4 v10, 0x0

    const/4 v13, 0x2

    sget-object v8, Lb2/t;->w:Lb2/t;

    move v11, v9

    move v12, v9

    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->w:Lb2/m;

    invoke-static {v3, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v8, v5, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v10, v5, Lp1/q;->S:Z

    if-eqz v10, :cond_5

    invoke-virtual {v5, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_4
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v5, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v5, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v8, v5, Lp1/q;->S:Z

    if-nez v8, :cond_6

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_7

    :cond_6
    invoke-static {v4, v5, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v5, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lnj2/y;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v1}, Lnj2/y;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v1}, Lnj2/y;->g()Ljava/util/List;

    move-result-object v10

    invoke-virtual {v1}, Lnj2/y;->c()Ljava/util/List;

    move-result-object v11

    invoke-virtual {v1}, Lnj2/y;->d()Ljava/util/List;

    move-result-object v12

    invoke-virtual {v1}, Lnj2/y;->a()Lnj2/u;

    move-result-object v13

    invoke-virtual {v1}, Lnj2/y;->b()Lnj2/v;

    move-result-object v14

    invoke-virtual {v1}, Lnj2/y;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v15

    iget-object v1, v0, Lpj2/i$g;->x:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_8

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v2, v1, :cond_9

    :cond_8
    new-instance v2, Lpj2/i$d;

    iget-object v1, v0, Lpj2/i$g;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {v2, v1}, Lpj2/i$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object/from16 v16, v2

    check-cast v16, Lkotlin/jvm/functions/Function1;

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v2, v1, 0x3

    or-int/2addr v2, v1

    shl-int/lit8 v3, v1, 0xf

    or-int/2addr v2, v3

    shl-int/lit8 v3, v1, 0x12

    or-int/2addr v2, v3

    shl-int/lit8 v1, v1, 0x15

    or-int v18, v2, v1

    const/16 v19, 0x0

    move-object/from16 v17, v5

    invoke-static/range {v8 .. v19}, Lqj2/a;->u(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnj2/u;Lnj2/v;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v1, v17

    invoke-virtual {v1, v7}, Lp1/q;->q(Z)V

    invoke-virtual {v1, v6}, Lp1/q;->q(Z)V

    return-void

    :cond_a
    move-object v1, v5

    invoke-virtual {v1}, Lp1/q;->X()V

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

    invoke-virtual {p0, p1, p2, p3, p4}, Lpj2/i$g;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
