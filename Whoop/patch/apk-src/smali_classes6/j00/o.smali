.class public final Lj00/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Ln00/d;

.field public final synthetic F:Z

.field public final synthetic G:Lg2/s;

.field public final synthetic H:Z

.field public final synthetic I:Lg40/z1;

.field public final synthetic J:Lg2/s;

.field public final synthetic K:Lg40/m3;

.field public final synthetic L:Lg2/s;

.field public final synthetic M:Ljava/lang/String;

.field public final synthetic w:Lc93/a;

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Lg40/m3;


# direct methods
.method public constructor <init>(Lc93/a;ZZLg40/m3;Ln00/d;ZLg2/s;ZLg40/z1;Lg2/s;Lg40/m3;Lg2/s;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj00/o;->w:Lc93/a;

    iput-boolean p2, p0, Lj00/o;->x:Z

    iput-boolean p3, p0, Lj00/o;->y:Z

    iput-object p4, p0, Lj00/o;->z:Lg40/m3;

    iput-object p5, p0, Lj00/o;->E:Ln00/d;

    iput-boolean p6, p0, Lj00/o;->F:Z

    iput-object p7, p0, Lj00/o;->G:Lg2/s;

    iput-boolean p8, p0, Lj00/o;->H:Z

    iput-object p9, p0, Lj00/o;->I:Lg40/z1;

    iput-object p10, p0, Lj00/o;->J:Lg2/s;

    iput-object p11, p0, Lj00/o;->K:Lg40/m3;

    iput-object p12, p0, Lj00/o;->L:Lg2/s;

    iput-object p13, p0, Lj00/o;->M:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Lc0/i0;

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    const-string v3, "$this$AnimatedVisibility"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v9, v2

    check-cast v9, Lp1/q;

    const v1, -0x6a8c3a2e

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    iget-object v1, v0, Lj00/o;->w:Lc93/a;

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_0

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_1

    :cond_0
    new-instance v3, Lj00/n;

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-direct {v3, v1, v4, v2}, Lj00/n;-><init>(Lc93/a;Lq83/d;I)V

    invoke-virtual {v9, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v3, Lc93/m;

    const/4 v1, 0x0

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    invoke-static {v9, v3, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, Lb2/t;->w:Lb2/t;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const-string v4, "LinkInlineSignupRemainingFields"

    invoke-static {v3, v4}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Ll0/m;->c:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    invoke-static {v4, v5, v9, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v5, v9, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v9, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v8, v9, Lp1/q;->S:Z

    if-eqz v8, :cond_2

    invoke-virtual {v9, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_0
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v9, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v9, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v9, Lp1/q;->S:Z

    if-nez v6, :cond_3

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    :cond_3
    invoke-static {v5, v9, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v9, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v3

    iget-wide v5, v3, Ld40/n;->c:J

    invoke-static {v9}, Ld40/r;->l(Landroidx/compose/runtime/Composer;)Ld40/o;

    move-result-object v3

    iget v7, v3, Ld40/o;->c:F

    const/4 v10, 0x0

    const/16 v11, 0x9

    const/4 v4, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v11}, Lge3/g;->b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    const/4 v3, 0x7

    const/4 v4, 0x6

    const/4 v13, 0x1

    iget-boolean v5, v0, Lj00/o;->x:Z

    move v6, v4

    iget-boolean v4, v0, Lj00/o;->y:Z

    iget-boolean v14, v0, Lj00/o;->F:Z

    if-eqz v5, :cond_6

    const v5, 0x3fba7aac

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    if-eqz v14, :cond_5

    move v7, v6

    goto :goto_1

    :cond_5
    move v7, v3

    :goto_1
    const/4 v11, 0x0

    const/16 v12, 0x60

    iget-object v5, v0, Lj00/o;->z:Lg40/m3;

    iget-object v6, v0, Lj00/o;->E:Ln00/d;

    iget-object v8, v0, Lj00/o;->G:Lg2/s;

    move-object v10, v9

    const/4 v9, 0x0

    invoke-static/range {v4 .. v12}, Lug/m;->a(ZLg40/m3;Ln00/d;ILg2/s;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v10

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    move v12, v4

    move v3, v13

    move v13, v14

    goto :goto_5

    :cond_6
    const v5, 0x3fc24d14

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    iget-boolean v5, v0, Lj00/o;->H:Z

    move v7, v5

    iget-object v5, v0, Lj00/o;->I:Lg40/z1;

    if-nez v7, :cond_7

    iget-object v7, v5, Lg40/z1;->a:Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_7

    move v8, v13

    goto :goto_2

    :cond_7
    move v8, v1

    :goto_2
    if-eqz v14, :cond_8

    move v12, v6

    :goto_3
    move-object v10, v9

    move v9, v14

    goto :goto_4

    :cond_8
    move v12, v3

    goto :goto_3

    :goto_4
    const/16 v14, 0x40

    const/16 v15, 0x8c

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v11, v10

    iget-object v10, v0, Lj00/o;->J:Lg2/s;

    move v3, v13

    move-object v13, v11

    const/4 v11, 0x0

    invoke-static/range {v4 .. v15}, Ldp/d;->g(ZLg40/z1;Landroidx/compose/ui/Modifier;Lc93/m;ZZLg2/s;Lc93/m;ILandroidx/compose/runtime/Composer;II)V

    move-object v12, v13

    move v13, v9

    move-object v9, v12

    move v12, v4

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    :goto_5
    invoke-static {v9}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v4

    iget-wide v5, v4, Ld40/n;->c:J

    invoke-static {v9}, Ld40/r;->l(Landroidx/compose/runtime/Composer;)Ld40/o;

    move-result-object v4

    iget v7, v4, Ld40/o;->c:F

    const/4 v10, 0x0

    const/16 v11, 0x9

    const/4 v4, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v11}, Lge3/g;->b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    const v4, 0x2317385b

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    if-eqz v13, :cond_9

    const/16 v15, 0x180

    const/16 v16, 0x378

    iget-object v4, v0, Lj00/o;->K:Lg40/m3;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v13, v10

    const/4 v10, 0x0

    iget-object v11, v0, Lj00/o;->L:Lg2/s;

    move v5, v12

    const/4 v12, 0x0

    move-object v14, v13

    const/4 v13, 0x0

    invoke-static/range {v4 .. v16}, Lg40/j4;->c(Lg40/m3;ZILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILg2/s;ZZLandroidx/compose/runtime/Composer;II)V

    move-object v9, v14

    :cond_9
    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    iget-object v4, v0, Lj00/o;->M:Ljava/lang/String;

    if-eqz v4, :cond_a

    move v5, v3

    goto :goto_6

    :cond_a
    move v5, v1

    :goto_6
    new-instance v1, Lg1/q6;

    const/4 v6, 0x2

    invoke-direct {v1, v4, v6}, Lg1/q6;-><init>(Ljava/lang/String;I)V

    const v4, -0x4ae98e6d

    invoke-static {v4, v9, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    const v12, 0x180006

    const/16 v13, 0x1e

    sget-object v4, Ll0/z;->a:Ll0/z;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v14, v9

    const/4 v9, 0x0

    move-object v11, v14

    invoke-static/range {v4 .. v13}, Landroidx/compose/animation/b;->e(Ll0/y;ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v11

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    return-object v2
.end method
