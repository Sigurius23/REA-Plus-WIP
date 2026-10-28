.class public final Ll1/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Li93/j;

.field public final synthetic F:Lm1/r;

.field public final synthetic G:Ll1/n3;

.field public final synthetic H:Lm1/o;

.field public final synthetic I:Ll1/y;

.field public final synthetic w:J

.field public final synthetic x:Lp1/c1;

.field public final synthetic y:Lbc3/c0;

.field public final synthetic z:Ln0/u;


# direct methods
.method public constructor <init>(JLp1/c1;Lbc3/c0;Ln0/u;Li93/j;Lm1/r;Ll1/n3;Lm1/o;Ll1/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ll1/w0;->w:J

    iput-object p3, p0, Ll1/w0;->x:Lp1/c1;

    iput-object p4, p0, Ll1/w0;->y:Lbc3/c0;

    iput-object p5, p0, Ll1/w0;->z:Ln0/u;

    iput-object p6, p0, Ll1/w0;->E:Li93/j;

    iput-object p7, p0, Ll1/w0;->F:Lm1/r;

    iput-object p8, p0, Ll1/w0;->G:Ll1/n3;

    iput-object p9, p0, Ll1/w0;->H:Lm1/o;

    iput-object p10, p0, Ll1/w0;->I:Ll1/y;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Lc0/i0;

    move-object/from16 v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    const v2, 0x7f1407e3

    invoke-static {v1, v2}, Lm1/e0;->i(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    move-object v8, v1

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-nez v1, :cond_0

    if-ne v3, v4, :cond_1

    :cond_0
    new-instance v3, Lht2/d;

    const/16 v1, 0xf

    invoke-direct {v3, v2, v1}, Lht2/d;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v3, Lkotlin/jvm/functions/Function1;

    sget-object v1, Lb2/t;->w:Lb2/t;

    const/4 v2, 0x0

    invoke-static {v1, v2, v3}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Ll0/m;->c:Ll0/g;

    sget-object v6, Lb2/e;->M:Lb2/k;

    invoke-static {v5, v6, v8, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v5, v8, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v8, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-eqz v9, :cond_2

    invoke-virtual {v8, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_0
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v8, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v8, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v6, v8, Lp1/q;->S:Z

    if-nez v6, :cond_3

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    :cond_3
    invoke-static {v5, v8, v5, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v8, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v2, Ll1/f1;->a:F

    const/4 v3, 0x7

    int-to-float v3, v3

    mul-float/2addr v2, v3

    sget v3, Ll1/l1;->a:F

    sub-float/2addr v2, v3

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->k(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget v2, Ll1/f1;->c:F

    const/4 v3, 0x0

    const/4 v5, 0x2

    invoke-static {v1, v2, v3, v5}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    iget-object v11, v0, Ll1/w0;->x:Lp1/c1;

    invoke-virtual {v8, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    iget-object v10, v0, Ll1/w0;->y:Lbc3/c0;

    invoke-virtual {v8, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v12, v0, Ll1/w0;->z:Ln0/u;

    invoke-virtual {v8, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v13, v0, Ll1/w0;->E:Li93/j;

    invoke-virtual {v8, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v14, v0, Ll1/w0;->F:Lm1/r;

    invoke-virtual {v8, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_5

    if-ne v2, v4, :cond_6

    :cond_5
    new-instance v9, Lam2/r;

    const/16 v15, 0x15

    const/16 v16, 0x0

    invoke-direct/range {v9 .. v16}, Lam2/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v9

    :cond_6
    move-object v6, v2

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v12, 0x6

    iget-wide v4, v0, Ll1/w0;->w:J

    iget-object v7, v0, Ll1/w0;->G:Ll1/n3;

    move-object v11, v8

    iget-object v8, v0, Ll1/w0;->H:Lm1/o;

    iget-object v10, v0, Ll1/w0;->I:Ll1/y;

    move-object v9, v13

    invoke-static/range {v3 .. v12}, Ll1/f1;->n(Landroidx/compose/ui/Modifier;JLkotlin/jvm/functions/Function1;Ll1/n3;Lm1/o;Li93/j;Ll1/y;Landroidx/compose/runtime/Composer;I)V

    iget-wide v4, v10, Ll1/y;->x:J

    const/4 v7, 0x0

    const/4 v9, 0x3

    const/4 v3, 0x0

    const/4 v6, 0x0

    move-object v8, v11

    invoke-static/range {v3 .. v9}, Ll1/k3;->d(Landroidx/compose/ui/Modifier;JFILandroidx/compose/runtime/Composer;I)V

    const/4 v1, 0x1

    invoke-virtual {v11, v1}, Lp1/q;->q(Z)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
