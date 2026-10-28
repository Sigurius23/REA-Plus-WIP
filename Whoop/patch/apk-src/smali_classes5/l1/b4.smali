.class public final Ll1/b4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lf0/t;

.field public final synthetic F:Z

.field public final synthetic G:Lj0/i;

.field public final synthetic H:Z

.field public final synthetic I:Lc93/a;

.field public final synthetic J:F

.field public final synthetic K:Lx1/b;

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Li2/a1;

.field public final synthetic y:J

.field public final synthetic z:F


# direct methods
.method public constructor <init>(Landroidx/compose/ui/Modifier;Li2/a1;JFLf0/t;ZLj0/i;ZLc93/a;FLx1/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/b4;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Ll1/b4;->x:Li2/a1;

    iput-wide p3, p0, Ll1/b4;->y:J

    iput p5, p0, Ll1/b4;->z:F

    iput-object p6, p0, Ll1/b4;->E:Lf0/t;

    iput-boolean p7, p0, Ll1/b4;->F:Z

    iput-object p8, p0, Ll1/b4;->G:Lj0/i;

    iput-boolean p9, p0, Ll1/b4;->H:Z

    iput-object p10, p0, Ll1/b4;->I:Lc93/a;

    iput p11, p0, Ll1/b4;->J:F

    iput-object p12, p0, Ll1/b4;->K:Lx1/b;

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

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_4

    sget-object v2, Ll1/w1;->a:Ly2/m;

    sget-object v2, Landroidx/compose/material3/MinimumInteractiveModifier;->w:Landroidx/compose/material3/MinimumInteractiveModifier;

    iget-object v3, v0, Ll1/b4;->w:Landroidx/compose/ui/Modifier;

    invoke-interface {v3, v2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    iget-wide v2, v0, Ll1/b4;->y:J

    iget v4, v0, Ll1/b4;->z:F

    invoke-static {v2, v3, v4, v1}, Ll1/c4;->d(JFLp1/q;)J

    move-result-wide v9

    sget-object v2, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v1, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    iget v3, v0, Ll1/b4;->J:F

    check-cast v2, Ly3/c;

    invoke-interface {v2, v3}, Ly3/c;->q0(F)F

    move-result v12

    iget-object v8, v0, Ll1/b4;->x:Li2/a1;

    iget-object v11, v0, Ll1/b4;->E:Lf0/t;

    invoke-static/range {v7 .. v12}, Ll1/c4;->c(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;F)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/4 v2, 0x0

    const/4 v3, 0x7

    invoke-static {v2, v3, v5}, Ll1/l3;->a(FIZ)Landroidx/compose/material3/c;

    move-result-object v16

    iget-boolean v2, v0, Ll1/b4;->H:Z

    iget-object v3, v0, Ll1/b4;->I:Lc93/a;

    iget-boolean v14, v0, Ll1/b4;->F:Z

    iget-object v15, v0, Ll1/b4;->G:Lj0/i;

    const/16 v18, 0x0

    move/from16 v17, v2

    move-object/from16 v19, v3

    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/selection/b;->a(Landroidx/compose/ui/Modifier;ZLj0/i;Lf0/v0;ZLi3/i;Lc93/a;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2}, Lm1/e0;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->w:Lb2/m;

    invoke-static {v3, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v7, v1, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v1, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v9, v1, Lp1/q;->S:Z

    if-eqz v9, :cond_1

    invoke-virtual {v1, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_1
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v1, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v1, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v7, v1, Lp1/q;->S:Z

    if-nez v7, :cond_2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    :cond_2
    invoke-static {v4, v1, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v1, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object v2, v0, Ll1/b4;->K:Lx1/b;

    invoke-static {v5, v2, v1, v6}, Lih0/d0;->y(ILx1/b;Lp1/q;Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
