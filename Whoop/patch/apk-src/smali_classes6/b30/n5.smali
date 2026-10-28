.class public final Lb30/n5;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:Lc93/a;

.field public final synthetic G:Lkotlin/jvm/functions/Function1;

.field public final synthetic H:Lkotlin/jvm/functions/Function1;

.field public final synthetic w:Ljava/util/List;

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Lh20/t0;


# direct methods
.method public constructor <init>(Ljava/util/List;ZZLh20/t0;FLc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lb30/n5;->w:Ljava/util/List;

    iput-boolean p2, p0, Lb30/n5;->x:Z

    iput-boolean p3, p0, Lb30/n5;->y:Z

    iput-object p4, p0, Lb30/n5;->z:Lh20/t0;

    iput p5, p0, Lb30/n5;->E:F

    iput-object p6, p0, Lb30/n5;->F:Lc93/a;

    iput-object p7, p0, Lb30/n5;->G:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lb30/n5;->H:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/foundation/lazy/a;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    move-object/from16 v3, p3

    check-cast v3, Landroidx/compose/runtime/Composer;

    move-object/from16 v4, p4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    and-int/lit8 v5, v4, 0x6

    const/4 v6, 0x2

    if-nez v5, :cond_1

    move-object v5, v3

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    move v5, v6

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    and-int/lit8 v4, v4, 0x30

    if-nez v4, :cond_3

    move-object v4, v3

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v2}, Lp1/q;->e(I)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v5, v4

    :cond_3
    and-int/lit16 v4, v5, 0x93

    const/16 v5, 0x92

    if-ne v4, v5, :cond_5

    move-object v4, v3

    check-cast v4, Lp1/q;

    invoke-virtual {v4}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v4}, Lp1/q;->X()V

    goto/16 :goto_6

    :cond_5
    :goto_3
    iget-object v4, v0, Lb30/n5;->w:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lh20/t0;

    check-cast v3, Lp1/q;

    const v2, 0x2d1a09ed

    invoke-virtual {v3, v2}, Lp1/q;->e0(I)V

    iget-boolean v2, v0, Lb30/n5;->x:Z

    iget-boolean v4, v0, Lb30/n5;->y:Z

    const/4 v5, 0x1

    const/4 v8, 0x0

    if-nez v2, :cond_7

    if-eqz v4, :cond_6

    invoke-virtual {v7}, Lh20/t0;->b()Z

    move-result v2

    if-eqz v2, :cond_7

    :cond_6
    move v9, v5

    goto :goto_4

    :cond_7
    move v9, v8

    :goto_4
    iget-object v2, v0, Lb30/n5;->z:Lh20/t0;

    invoke-static {v7, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    if-nez v4, :cond_8

    move v11, v5

    goto :goto_5

    :cond_8
    move v11, v8

    :goto_5
    const v2, -0x3017a0ca

    invoke-virtual {v3, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v2, v4, :cond_9

    sget-object v2, Lb30/m5;->w:Lb30/m5;

    invoke-virtual {v3, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v3, v8}, Lp1/q;->q(Z)V

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v8, v2}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v7}, Lh20/t0;->a()Lh20/s0;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v1, v2, v6}, Landroidx/compose/foundation/lazy/a;->a(Landroidx/compose/foundation/lazy/a;Landroidx/compose/ui/Modifier;I)Landroidx/compose/ui/Modifier;

    move-result-object v15

    iget-object v14, v0, Lb30/n5;->H:Lkotlin/jvm/functions/Function1;

    const/16 v17, 0x0

    move v1, v8

    iget v8, v0, Lb30/n5;->E:F

    iget-boolean v10, v0, Lb30/n5;->y:Z

    iget-object v12, v0, Lb30/n5;->F:Lc93/a;

    iget-object v13, v0, Lb30/n5;->G:Lkotlin/jvm/functions/Function1;

    move-object/from16 v16, v3

    invoke-static/range {v7 .. v17}, Lb30/o5;->f(Lh20/t0;FZZZLc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v3, v1}, Lp1/q;->q(Z)V

    :goto_6
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
