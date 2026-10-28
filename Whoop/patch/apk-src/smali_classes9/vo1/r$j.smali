.class public final Lvo1/r$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvo1/r;->k0(Lso1/c0$f;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic E:Lkotlin/jvm/functions/Function1;

.field final synthetic F:Lkotlin/jvm/functions/Function1;

.field final synthetic G:Lkotlin/jvm/functions/Function1;

.field final synthetic H:Lkotlin/jvm/functions/Function1;

.field final synthetic w:Ljava/util/List;

.field final synthetic x:Lso1/c0$f;

.field final synthetic y:Lbc3/c0;

.field final synthetic z:Lg1/y3;


# direct methods
.method public constructor <init>(Ljava/util/List;Lso1/c0$f;Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lvo1/r$j;->w:Ljava/util/List;

    iput-object p2, p0, Lvo1/r$j;->x:Lso1/c0$f;

    iput-object p3, p0, Lvo1/r$j;->y:Lbc3/c0;

    iput-object p4, p0, Lvo1/r$j;->z:Lg1/y3;

    iput-object p5, p0, Lvo1/r$j;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lvo1/r$j;->F:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lvo1/r$j;->G:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lvo1/r$j;->H:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p2

    and-int/lit8 v2, p4, 0x6

    const/4 v3, 0x2

    const/4 v4, 0x4

    if-nez v2, :cond_1

    move-object/from16 v2, p3

    check-cast v2, Lp1/q;

    move-object/from16 v5, p1

    invoke-virtual {v2, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int v2, p4, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p4

    :goto_1
    and-int/lit8 v5, p4, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p3

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v1}, Lp1/q;->e(I)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :cond_3
    and-int/lit16 v5, v2, 0x93

    const/16 v6, 0x92

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v5, v6, :cond_4

    move v5, v7

    goto :goto_3

    :cond_4
    move v5, v8

    :goto_3
    and-int/2addr v2, v7

    move-object/from16 v6, p3

    check-cast v6, Lp1/q;

    invoke-virtual {v6, v2, v5}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_f

    iget-object v2, v0, Lvo1/r$j;->w:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lm91/u;

    const v2, -0x6cf37ab8

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    const/16 v2, 0x8

    if-nez v1, :cond_5

    int-to-float v1, v3

    int-to-float v5, v2

    mul-float/2addr v1, v5

    goto :goto_4

    :cond_5
    int-to-float v1, v8

    :goto_4
    instance-of v5, v9, Lh51/f;

    if-nez v5, :cond_6

    instance-of v5, v9, Lso1/c;

    if-nez v5, :cond_6

    int-to-float v3, v3

    int-to-float v5, v2

    mul-float/2addr v3, v5

    goto :goto_5

    :cond_6
    int-to-float v3, v8

    :goto_5
    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v3, v1}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Lb2/e;->w:Lb2/m;

    invoke-static {v3, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v10, v6, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v6, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v13, v6, Lp1/q;->S:Z

    if-eqz v13, :cond_7

    invoke-virtual {v6, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_7
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_6
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v6, v12, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v6, v3, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v11, v6, Lp1/q;->S:Z

    if-nez v11, :cond_8

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_9

    :cond_8
    invoke-static {v10, v6, v10, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v6, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object v10, v0, Lvo1/r$j;->y:Lbc3/c0;

    iget-object v11, v0, Lvo1/r$j;->z:Lg1/y3;

    iget-object v12, v0, Lvo1/r$j;->E:Lkotlin/jvm/functions/Function1;

    iget-object v13, v0, Lvo1/r$j;->F:Lkotlin/jvm/functions/Function1;

    iget-object v14, v0, Lvo1/r$j;->G:Lkotlin/jvm/functions/Function1;

    iget-object v15, v0, Lvo1/r$j;->H:Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lvo1/r$j;->x:Lso1/c0$f;

    const/16 v18, 0x200

    move-object/from16 v16, v1

    move-object/from16 v17, v6

    invoke-static/range {v9 .. v18}, Lvo1/r;->K0(Lm91/u;Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lso1/c0$f;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v1, v17

    invoke-virtual {v1, v7}, Lp1/q;->q(Z)V

    instance-of v3, v9, Lso1/n0;

    if-nez v3, :cond_e

    instance-of v3, v9, Lso1/e;

    const/4 v6, 0x0

    if-eqz v3, :cond_a

    move-object v3, v9

    check-cast v3, Lso1/e;

    goto :goto_7

    :cond_a
    move-object v3, v6

    :goto_7
    if-eqz v3, :cond_b

    invoke-virtual {v3}, Lso1/e;->j()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternType;

    move-result-object v6

    :cond_b
    sget-object v3, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternType;->YOUR_CYCLES:Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternType;

    if-ne v6, v3, :cond_c

    goto :goto_8

    :cond_c
    iget-object v3, v0, Lvo1/r$j;->x:Lso1/c0$f;

    invoke-virtual {v3}, Lso1/c0$f;->j()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    const v3, -0x6ce4eed9

    invoke-virtual {v1, v3}, Lp1/q;->e0(I)V

    int-to-float v2, v2

    int-to-float v3, v4

    invoke-static {v2, v3, v5, v1, v8}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_9

    :cond_d
    const v2, -0x6ce3bb07

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v8}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_e
    :goto_8
    const v2, -0x6ce6cf59

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    const/4 v2, 0x3

    int-to-float v2, v2

    int-to-float v3, v4

    invoke-static {v2, v3, v5, v1, v8}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    :goto_9
    invoke-virtual {v1, v8}, Lp1/q;->q(Z)V

    return-void

    :cond_f
    move-object v1, v6

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

    invoke-virtual {p0, p1, p2, p3, p4}, Lvo1/r$j;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
