.class public final Ll1/l2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ld0/e;

.field public final synthetic F:Lbc3/c0;

.field public final synthetic G:Lkotlin/jvm/functions/Function1;

.field public final synthetic H:Landroidx/compose/ui/Modifier;

.field public final synthetic I:F

.field public final synthetic J:Z

.field public final synthetic K:Li2/a1;

.field public final synthetic L:J

.field public final synthetic M:J

.field public final synthetic N:F

.field public final synthetic O:Lc93/m;

.field public final synthetic P:Lc93/m;

.field public final synthetic Q:Lx1/b;

.field public final synthetic w:J

.field public final synthetic x:Lc93/a;

.field public final synthetic y:Ll1/w3;

.field public final synthetic z:Ll1/o2;


# direct methods
.method public constructor <init>(JLc93/a;Ll1/w3;Ll1/o2;Ld0/e;Lbc3/c0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FZLi2/a1;JJFLc93/m;Lc93/m;Lx1/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ll1/l2;->w:J

    iput-object p3, p0, Ll1/l2;->x:Lc93/a;

    iput-object p4, p0, Ll1/l2;->y:Ll1/w3;

    iput-object p5, p0, Ll1/l2;->z:Ll1/o2;

    iput-object p6, p0, Ll1/l2;->E:Ld0/e;

    iput-object p7, p0, Ll1/l2;->F:Lbc3/c0;

    iput-object p8, p0, Ll1/l2;->G:Lkotlin/jvm/functions/Function1;

    iput-object p9, p0, Ll1/l2;->H:Landroidx/compose/ui/Modifier;

    iput p10, p0, Ll1/l2;->I:F

    iput-boolean p11, p0, Ll1/l2;->J:Z

    iput-object p12, p0, Ll1/l2;->K:Li2/a1;

    iput-wide p13, p0, Ll1/l2;->L:J

    move-wide p1, p15

    iput-wide p1, p0, Ll1/l2;->M:J

    move/from16 p1, p17

    iput p1, p0, Ll1/l2;->N:F

    move-object/from16 p1, p18

    iput-object p1, p0, Ll1/l2;->O:Lc93/m;

    move-object/from16 p1, p19

    iput-object p1, p0, Ll1/l2;->P:Lc93/m;

    move-object/from16 p1, p20

    iput-object p1, p0, Ll1/l2;->Q:Lx1/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v3, v4, :cond_0

    move v3, v6

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    and-int/2addr v2, v6

    move-object v12, v1

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_6

    sget-object v1, Lb2/t;->w:Lb2/t;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1}, Ll0/f;->i(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_1

    new-instance v2, Lkx1/b;

    const/16 v3, 0xf

    invoke-direct {v2, v3}, Lkx1/b;-><init>(I)V

    invoke-virtual {v12, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v5, v2}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->w:Lb2/m;

    invoke-static {v2, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v3, v12, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v12, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-eqz v8, :cond_2

    invoke-virtual {v12, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_1
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v12, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v12, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, v12, Lp1/q;->S:Z

    if-nez v4, :cond_3

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    :cond_3
    invoke-static {v3, v12, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v12, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object v1, v0, Ll1/l2;->y:Ll1/w3;

    iget-object v2, v1, Ll1/w3;->e:Lm1/g;

    iget-object v2, v2, Lm1/g;->h:Lp1/f0;

    invoke-virtual {v2}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll1/x3;

    sget-object v3, Ll1/x3;->w:Ll1/x3;

    if-eq v2, v3, :cond_5

    move v10, v6

    goto :goto_2

    :cond_5
    move v10, v5

    :goto_2
    iget-object v2, v0, Ll1/l2;->z:Ll1/o2;

    iget-boolean v11, v2, Ll1/o2;->c:Z

    const/4 v13, 0x0

    iget-wide v7, v0, Ll1/l2;->w:J

    iget-object v9, v0, Ll1/l2;->x:Lc93/a;

    invoke-static/range {v7 .. v13}, Ll1/n2;->d(JLc93/a;ZZLandroidx/compose/runtime/Composer;I)V

    move-object/from16 v24, v12

    const/16 v25, 0x46

    iget-object v7, v0, Ll1/l2;->E:Ld0/e;

    iget-object v8, v0, Ll1/l2;->F:Lbc3/c0;

    iget-object v10, v0, Ll1/l2;->G:Lkotlin/jvm/functions/Function1;

    iget-object v11, v0, Ll1/l2;->H:Landroidx/compose/ui/Modifier;

    iget v13, v0, Ll1/l2;->I:F

    iget-boolean v14, v0, Ll1/l2;->J:Z

    iget-object v15, v0, Ll1/l2;->K:Li2/a1;

    iget-wide v2, v0, Ll1/l2;->L:J

    iget-wide v4, v0, Ll1/l2;->M:J

    iget v12, v0, Ll1/l2;->N:F

    iget-object v6, v0, Ll1/l2;->O:Lc93/m;

    move-object/from16 v16, v1

    iget-object v1, v0, Ll1/l2;->P:Lc93/m;

    move-object/from16 v22, v1

    iget-object v1, v0, Ll1/l2;->Q:Lx1/b;

    move-object/from16 v23, v1

    move-wide/from16 v18, v4

    move-object/from16 v21, v6

    move/from16 v20, v12

    move-object/from16 v12, v16

    move-wide/from16 v16, v2

    invoke-static/range {v7 .. v25}, Ll1/n2;->c(Ld0/e;Lbc3/c0;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ll1/w3;FZLi2/a1;JJFLc93/m;Lc93/m;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v12, v24

    const/4 v1, 0x1

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_6
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
