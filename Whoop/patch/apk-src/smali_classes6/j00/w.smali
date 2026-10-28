.class public final Lj00/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Lc93/a;

.field public final synthetic G:Z

.field public final synthetic H:Lg40/m3;

.field public final synthetic I:Ln00/d;

.field public final synthetic J:Z

.field public final synthetic K:Ljava/lang/String;

.field public final synthetic L:Lp1/c1;

.field public final synthetic M:Lg2/s;

.field public final synthetic N:Lp1/t2;

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Z

.field public final synthetic y:Lg40/m3;

.field public final synthetic z:Lg40/z1;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/Modifier;ZLg40/m3;Lg40/z1;ZLc93/a;ZLg40/m3;Ln00/d;ZLjava/lang/String;Lp1/c1;Lg2/s;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj00/w;->w:Landroidx/compose/ui/Modifier;

    iput-boolean p2, p0, Lj00/w;->x:Z

    iput-object p3, p0, Lj00/w;->y:Lg40/m3;

    iput-object p4, p0, Lj00/w;->z:Lg40/z1;

    iput-boolean p5, p0, Lj00/w;->E:Z

    iput-object p6, p0, Lj00/w;->F:Lc93/a;

    iput-boolean p7, p0, Lj00/w;->G:Z

    iput-object p8, p0, Lj00/w;->H:Lg40/m3;

    iput-object p9, p0, Lj00/w;->I:Ln00/d;

    iput-boolean p10, p0, Lj00/w;->J:Z

    iput-object p11, p0, Lj00/w;->K:Ljava/lang/String;

    iput-object p12, p0, Lj00/w;->L:Lp1/c1;

    iput-object p13, p0, Lj00/w;->M:Lg2/s;

    iput-object p14, p0, Lj00/w;->N:Lp1/t2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Lc0/i0;

    move-object/from16 v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    const-string v2, "$this$AnimatedVisibility"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Ll0/m;->c:Ll0/g;

    sget-object v2, Lb2/e;->M:Lb2/k;

    const/4 v9, 0x0

    invoke-static {v1, v2, v7, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    invoke-static {v7}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v2

    move-object v10, v7

    check-cast v10, Lp1/q;

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    iget-object v4, v0, Lj00/w;->w:Landroidx/compose/ui/Modifier;

    invoke-static {v7, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v6, v10, Lp1/q;->S:Z

    if-eqz v6, :cond_0

    invoke-virtual {v10, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_0
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v7, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v7, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v3, v10, Lp1/q;->S:Z

    if-nez v3, :cond_1

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    :cond_1
    invoke-static {v2, v10, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v7, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, Lb2/t;->w:Lb2/t;

    const/16 v1, 0x8

    iget-boolean v2, v0, Lj00/w;->x:Z

    iget-object v3, v0, Lj00/w;->y:Lg40/m3;

    iget-object v4, v0, Lj00/w;->z:Lg40/z1;

    move v5, v2

    iget-boolean v2, v0, Lj00/w;->E:Z

    iget-boolean v6, v0, Lj00/w;->G:Z

    iget-object v8, v0, Lj00/w;->I:Ln00/d;

    if-eqz v5, :cond_6

    const v5, -0x246e0017

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-interface {v3}, Lg40/m3;->l()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3

    const-string v3, ""

    :cond_3
    iget-object v5, v4, Lg40/z1;->e:Lec3/h2;

    iget-object v4, v4, Lg40/z1;->k:Ln53/e;

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    iget-object v12, v4, Ln53/e;->y:Ll83/e;

    check-cast v12, Lc93/a;

    invoke-interface {v12}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lg40/k2;

    invoke-virtual {v12}, Lg40/k2;->c()Ljava/lang/String;

    move-result-object v12

    invoke-static {v5, v12}, Lyb3/r;->q0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget-object v4, v4, Ln53/e;->y:Ll83/e;

    check-cast v4, Lc93/a;

    invoke-interface {v4}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v4

    instance-of v12, v4, Lg40/j2;

    if-eqz v12, :cond_4

    check-cast v4, Lg40/j2;

    goto :goto_1

    :cond_4
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_5

    invoke-virtual {v4, v5}, Lg40/j2;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    :cond_5
    move-object v4, v5

    int-to-float v13, v1

    const/4 v15, 0x0

    const/16 v16, 0xd

    const/4 v12, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object v1, v8

    const/16 v8, 0xc00

    move v11, v6

    iget-object v6, v0, Lj00/w;->F:Lc93/a;

    move-object/from16 v18, v1

    move/from16 v17, v11

    invoke-static/range {v2 .. v8}, Luf/c0;->m(ZLjava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v10, v9}, Lp1/q;->q(Z)V

    move v1, v9

    move-object v0, v10

    move/from16 v10, v17

    move-object/from16 v6, v18

    goto/16 :goto_4

    :cond_6
    move/from16 v17, v6

    move-object/from16 v18, v8

    const v5, -0x246824b5

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    iget-object v5, v0, Lj00/w;->N:Lp1/t2;

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg40/h1;

    iget-object v6, v0, Lj00/w;->L:Lp1/c1;

    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    if-eqz v17, :cond_7

    int-to-float v1, v1

    :goto_2
    move v13, v1

    goto :goto_3

    :cond_7
    int-to-float v1, v9

    goto :goto_2

    :goto_3
    const/4 v15, 0x0

    const/16 v16, 0xd

    const/4 v12, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v14

    const v1, -0x22348df8

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v1, :cond_8

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v11, v1, :cond_9

    :cond_8
    new-instance v11, Lg11/b;

    const/16 v1, 0x16

    invoke-direct {v11, v1, v6}, Lg11/b;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v13, v11

    check-cast v13, Lc93/a;

    invoke-virtual {v10, v9}, Lp1/q;->q(Z)V

    const/16 v20, 0x0

    const v21, 0xc000

    move-object/from16 v1, v18

    move-object/from16 v18, v7

    move v7, v2

    move-object v2, v5

    iget-object v5, v0, Lj00/w;->H:Lg40/m3;

    move v12, v8

    const/4 v8, 0x0

    move v6, v9

    iget-boolean v9, v0, Lj00/w;->J:Z

    iget-object v11, v0, Lj00/w;->K:Ljava/lang/String;

    iget-object v15, v0, Lj00/w;->M:Lg2/s;

    const/16 v16, 0x0

    move-object/from16 v19, v10

    move/from16 v10, v17

    const/16 v17, 0x0

    move-object/from16 v22, v19

    const v19, 0x180200

    move v0, v6

    move-object v6, v1

    move v1, v0

    move-object/from16 v0, v22

    invoke-static/range {v2 .. v21}, Lj00/q;->b(Lg40/h1;Lg40/m3;Lg40/z1;Lg40/m3;Ln00/d;ZZZZLjava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;Lg2/s;Lg2/s;Lg2/s;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v18

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    :goto_4
    const/4 v12, 0x1

    if-nez v10, :cond_b

    sget-object v2, Ln00/d;->y:Ln00/d;

    if-ne v6, v2, :cond_a

    goto :goto_5

    :cond_a
    move v3, v1

    goto :goto_6

    :cond_b
    :goto_5
    move v3, v12

    :goto_6
    new-instance v1, Lg40/d4;

    const/4 v2, 0x1

    invoke-direct {v1, v10, v2}, Lg40/d4;-><init>(ZI)V

    const v2, -0x7a3fc763

    invoke-static {v2, v7, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    const v10, 0x180006

    const/16 v11, 0x1e

    sget-object v2, Ll0/z;->a:Ll0/z;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v18, v7

    const/4 v7, 0x0

    move-object/from16 v9, v18

    invoke-static/range {v2 .. v11}, Landroidx/compose/animation/b;->e(Ll0/y;ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v0, v12}, Lp1/q;->q(Z)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
