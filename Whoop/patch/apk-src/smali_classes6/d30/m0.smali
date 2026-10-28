.class public final Ld30/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Ljava/lang/String;

.field public final synthetic F:Ljava/lang/String;

.field public final synthetic G:Lh20/g1;

.field public final synthetic H:Ljava/lang/String;

.field public final synthetic I:Lkotlin/jvm/functions/Function3;

.field public final synthetic w:Z

.field public final synthetic x:Z

.field public final synthetic y:Lx1/b;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZZLx1/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh20/g1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ld30/m0;->w:Z

    iput-boolean p2, p0, Ld30/m0;->x:Z

    iput-object p3, p0, Ld30/m0;->y:Lx1/b;

    iput-object p4, p0, Ld30/m0;->z:Ljava/lang/String;

    iput-object p5, p0, Ld30/m0;->E:Ljava/lang/String;

    iput-object p6, p0, Ld30/m0;->F:Ljava/lang/String;

    iput-object p7, p0, Ld30/m0;->G:Lh20/g1;

    iput-object p8, p0, Ld30/m0;->H:Ljava/lang/String;

    iput-object p9, p0, Ld30/m0;->I:Lkotlin/jvm/functions/Function3;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    move-object v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    move-object/from16 v0, p3

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    and-int/lit8 v1, v0, 0x6

    if-nez v1, :cond_1

    move-object v1, v4

    check-cast v1, Lp1/q;

    invoke-virtual {v1, p1}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v0, v1

    :cond_1
    and-int/lit8 v0, v0, 0x13

    const/16 v1, 0x12

    if-ne v0, v1, :cond_3

    move-object v0, v4

    check-cast v0, Lp1/q;

    invoke-virtual {v0}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lp1/q;->X()V

    goto/16 :goto_4

    :cond_3
    :goto_1
    const/16 v0, 0xc

    int-to-float v0, v0

    invoke-static {v0}, Ll0/m;->i(F)Ll0/k;

    move-result-object v0

    sget-object v1, Lb2/e;->K:Lb2/l;

    const/16 v2, 0x36

    invoke-static {v0, v1, v4, v2}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    invoke-static {v4}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v1

    move-object v10, v4

    check-cast v10, Lp1/q;

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-eqz v7, :cond_4

    invoke-virtual {v10, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_2
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v4, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v4, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v2, v10, Lp1/q;->S:Z

    if-nez v2, :cond_5

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    :cond_5
    invoke-static {v1, v10, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v4, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object v6, p0, Ld30/m0;->G:Lh20/g1;

    iget-object v0, v6, Lh20/g1;->w:Lh20/f1;

    instance-of v1, v0, Lh20/z0;

    const/4 v11, 0x1

    sget-object v12, Ll0/t1;->a:Ll0/t1;

    if-nez v1, :cond_8

    instance-of v0, v0, Lh20/b1;

    if-eqz v0, :cond_7

    goto :goto_3

    :cond_7
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v12, v3, v11, v0}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    :cond_8
    :goto_3
    move-object v7, v3

    const/4 v9, 0x0

    iget-boolean v0, p0, Ld30/m0;->w:Z

    iget-boolean v1, p0, Ld30/m0;->x:Z

    iget-object v2, p0, Ld30/m0;->y:Lx1/b;

    iget-object v3, p0, Ld30/m0;->z:Ljava/lang/String;

    move-object v8, v4

    iget-object v4, p0, Ld30/m0;->E:Ljava/lang/String;

    iget-object v5, p0, Ld30/m0;->F:Ljava/lang/String;

    invoke-static/range {v0 .. v9}, Lkotlin/jvm/internal/j;->l(ZZLx1/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh20/g1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const v0, -0x7f0c531e

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    iget-object v0, p0, Ld30/m0;->H:Ljava/lang/String;

    if-eqz v0, :cond_9

    const/4 v5, 0x0

    const/16 v6, 0xe

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, v8

    invoke-static/range {v0 .. v6}, Lio/sentry/config/a;->k(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;II)V

    :cond_9
    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    const v1, -0x7f0c47c2

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    iget-object v1, p0, Ld30/m0;->I:Lkotlin/jvm/functions/Function3;

    if-eqz v1, :cond_a

    if-eqz p1, :cond_a

    const/4 p1, 0x6

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, v12, v8, p1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
