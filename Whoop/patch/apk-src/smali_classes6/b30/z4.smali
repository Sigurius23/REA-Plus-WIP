.class public final Lb30/z4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Ljava/lang/String;

.field public final synthetic G:Ljava/lang/Integer;

.field public final synthetic H:Z

.field public final synthetic I:Z

.field public final synthetic J:Z

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Lc93/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZZLc93/a;ILjava/lang/String;Ljava/lang/Integer;ZZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/z4;->w:Ljava/lang/String;

    iput-boolean p2, p0, Lb30/z4;->x:Z

    iput-boolean p3, p0, Lb30/z4;->y:Z

    iput-object p4, p0, Lb30/z4;->z:Lc93/a;

    iput p5, p0, Lb30/z4;->E:I

    iput-object p6, p0, Lb30/z4;->F:Ljava/lang/String;

    iput-object p7, p0, Lb30/z4;->G:Ljava/lang/Integer;

    iput-boolean p8, p0, Lb30/z4;->H:Z

    iput-boolean p9, p0, Lb30/z4;->I:Z

    iput-boolean p10, p0, Lb30/z4;->J:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Ll0/u;

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    const-string v4, "$this$BadgedBox"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, v3, 0x11

    const/16 v3, 0x10

    if-ne v1, v3, :cond_1

    move-object v1, v2

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "SAVED_PAYMENT_METHOD_CARD_TEST_TAG_"

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v0, Lb30/z4;->w:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v1}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    iget-object v4, v0, Lb30/z4;->z:Lc93/a;

    iget-boolean v5, v0, Lb30/z4;->x:Z

    iget-boolean v6, v0, Lb30/z4;->y:Z

    invoke-static {v1, v5, v6, v4}, Landroidx/compose/foundation/selection/b;->b(Landroidx/compose/ui/Modifier;ZZLc93/a;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object v14, v2

    check-cast v14, Lp1/q;

    const v2, 0x503a1f2e

    invoke-virtual {v14, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v6}, Lp1/q;->h(Z)Z

    move-result v2

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-nez v2, :cond_2

    if-ne v4, v9, :cond_3

    :cond_2
    new-instance v4, Lb30/x4;

    const/4 v2, 0x0

    invoke-direct {v4, v6, v2}, Lb30/x4;-><init>(ZI)V

    invoke-virtual {v14, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x0

    invoke-virtual {v14, v2}, Lp1/q;->q(Z)V

    invoke-static {v1, v2, v4}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v4, Ll0/m;->c:Ll0/g;

    sget-object v6, Lb2/e;->M:Lb2/k;

    invoke-static {v4, v6, v14, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v6, v14, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v14, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v10, v14, Lp1/q;->S:Z

    if-eqz v10, :cond_4

    invoke-virtual {v14, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_4
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_1
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v14, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v14, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v7, v14, Lp1/q;->S:Z

    if-nez v7, :cond_5

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_6

    :cond_5
    invoke-static {v6, v14, v6, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v14, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v1, 0x0

    iget v4, v0, Lb30/z4;->E:I

    invoke-static {v1, v5, v14, v4, v2}, Lb30/a5;->c(Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V

    sget-object v1, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v14, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/c1;

    invoke-virtual {v1}, Lg1/c1;->e()J

    move-result-wide v10

    const/4 v1, 0x4

    int-to-float v5, v1

    const/4 v1, 0x6

    int-to-float v4, v1

    const/4 v7, 0x0

    const/16 v8, 0x8

    move v6, v4

    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const v6, 0x45187233

    invoke-virtual {v14, v6}, Lp1/q;->e0(I)V

    iget-object v6, v0, Lb30/z4;->F:Ljava/lang/String;

    invoke-virtual {v14, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_7

    if-ne v8, v9, :cond_8

    :cond_7
    new-instance v8, Lb30/y4;

    const/4 v7, 0x0

    invoke-direct {v8, v6, v7}, Lb30/y4;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v14, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v14, v2}, Lp1/q;->q(Z)V

    invoke-static {v1, v2, v8}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v15, 0x0

    const/16 v16, 0x0

    iget-object v7, v0, Lb30/z4;->G:Ljava/lang/Integer;

    iget-object v8, v0, Lb30/z4;->w:Ljava/lang/String;

    iget-boolean v12, v0, Lb30/z4;->H:Z

    iget-boolean v13, v0, Lb30/z4;->I:Z

    move-wide v9, v10

    move-object v11, v1

    invoke-static/range {v7 .. v16}, Lo73/a;->g(Ljava/lang/Integer;Ljava/lang/String;JLandroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;II)V

    const v1, 0x45188626

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    iget-boolean v1, v0, Lb30/z4;->J:Z

    if-eqz v1, :cond_9

    const/4 v7, 0x0

    const/16 v8, 0x8

    move v6, v4

    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1, v14, v2}, Lup/d;->c(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :cond_9
    invoke-virtual {v14, v2}, Lp1/q;->q(Z)V

    const/4 v1, 0x1

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
