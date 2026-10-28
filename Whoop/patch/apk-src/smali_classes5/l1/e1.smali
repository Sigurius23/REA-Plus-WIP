.class public final Ll1/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ll1/y;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:Ll1/n3;

.field public final synthetic w:Lm1/o;

.field public final synthetic x:J

.field public final synthetic y:Li93/j;

.field public final synthetic z:Landroidx/compose/ui/Modifier;


# direct methods
.method public constructor <init>(Lm1/o;JLi93/j;Landroidx/compose/ui/Modifier;Ll1/y;Lkotlin/jvm/functions/Function1;Ll1/n3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/e1;->w:Lm1/o;

    iput-wide p2, p0, Ll1/e1;->x:J

    iput-object p4, p0, Ll1/e1;->y:Li93/j;

    iput-object p5, p0, Ll1/e1;->z:Landroidx/compose/ui/Modifier;

    iput-object p6, p0, Ll1/e1;->E:Ll1/y;

    iput-object p7, p0, Ll1/e1;->F:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Ll1/e1;->G:Ll1/n3;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x2

    if-eq v3, v6, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    and-int/2addr v2, v4

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, v0, Ll1/e1;->w:Lm1/o;

    invoke-virtual {v2}, Lm1/o;->b()Lm1/n;

    move-result-object v3

    move-object v7, v2

    check-cast v7, Lm1/q;

    iget v8, v3, Lm1/n;->w:I

    iget v3, v3, Lm1/n;->x:I

    invoke-static {v8, v3, v4}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    move-result-object v3

    invoke-virtual {v7, v3}, Lm1/q;->e(Ljava/time/LocalDate;)Lm1/r;

    move-result-object v3

    iget v11, v3, Lm1/r;->a:I

    iget-wide v3, v0, Ll1/e1;->x:J

    invoke-virtual {v2, v3, v4}, Lm1/o;->a(J)Lm1/r;

    move-result-object v3

    iget v10, v3, Lm1/r;->a:I

    iget-object v3, v0, Ll1/e1;->y:Li93/j;

    iget v4, v3, Li93/h;->w:I

    sub-int v4, v10, v4

    const/4 v7, 0x3

    sub-int/2addr v4, v7

    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-static {v4, v1, v6}, Lo0/a0;->a(ILandroidx/compose/runtime/Composer;I)Lo0/y;

    move-result-object v4

    new-instance v5, Lo0/b;

    invoke-direct {v5, v7}, Lo0/b;-><init>(I)V

    iget-object v6, v0, Ll1/e1;->E:Ll1/y;

    iget-wide v7, v6, Ll1/y;->a:J

    sget-object v9, Li2/w0;->a:Li2/v0;

    iget-object v12, v0, Ll1/e1;->z:Landroidx/compose/ui/Modifier;

    invoke-static {v12, v7, v8, v9}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v16, Ll0/m;->f:Ll0/h;

    sget v7, Ll1/f1;->g:F

    invoke-static {v7}, Ll0/m;->i(F)Ll0/k;

    move-result-object v17

    invoke-virtual {v1, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v1, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v2, v3

    invoke-virtual {v1, v10}, Lp1/q;->e(I)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v1, v11}, Lp1/q;->e(I)Z

    move-result v3

    or-int/2addr v2, v3

    iget-object v3, v0, Ll1/e1;->F:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    iget-object v3, v0, Ll1/e1;->G:Ll1/n3;

    invoke-virtual {v1, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v1, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_2

    :cond_1
    new-instance v7, Ll1/c1;

    iget-object v8, v0, Ll1/e1;->y:Li93/j;

    iget-object v9, v0, Ll1/e1;->w:Lm1/o;

    iget-object v12, v0, Ll1/e1;->F:Lkotlin/jvm/functions/Function1;

    iget-object v13, v0, Ll1/e1;->G:Ll1/n3;

    iget-object v14, v0, Ll1/e1;->E:Ll1/y;

    invoke-direct/range {v7 .. v14}, Ll1/c1;-><init>(Li93/j;Lm1/o;IILkotlin/jvm/functions/Function1;Ll1/n3;Ll1/y;)V

    invoke-virtual {v1, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v3, v7

    :cond_2
    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/high16 v18, 0x1b0000

    const/16 v19, 0x398

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v8, v15

    const/4 v15, 0x0

    move-object v9, v4

    move-object v7, v5

    move-object/from16 v12, v16

    move-object/from16 v11, v17

    move-object/from16 v17, v1

    move-object/from16 v16, v3

    invoke-static/range {v7 .. v19}, Lse/h;->k(Lo0/b;Landroidx/compose/ui/Modifier;Lo0/y;Ll0/k1;Ll0/l;Ll0/i;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    move-object/from16 v17, v1

    invoke-virtual/range {v17 .. v17}, Lp1/q;->X()V

    :goto_1
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
