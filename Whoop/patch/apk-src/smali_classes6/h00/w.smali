.class public final Lh00/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lh00/j;

.field public final synthetic G:Lc93/a;

.field public final synthetic H:Lc93/a;

.field public final synthetic I:Lc93/a;

.field public final synthetic J:Lc93/m;

.field public final synthetic K:Lkotlin/jvm/functions/Function1;

.field public final synthetic L:Lkotlin/jvm/functions/Function1;

.field public final synthetic M:Lkotlin/jvm/functions/Function1;

.field public final synthetic N:Lc93/a;

.field public final synthetic O:Lwz/e1;

.field public final synthetic w:Lkotlin/jvm/functions/Function3;

.field public final synthetic x:Lbc3/c0;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Leb/u0;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function3;Lbc3/c0;Lkotlin/jvm/functions/Function1;Leb/u0;Lkotlin/jvm/functions/Function1;Lh00/j;Lc93/a;Lc93/a;Lc93/a;Lc93/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lwz/e1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh00/w;->w:Lkotlin/jvm/functions/Function3;

    iput-object p2, p0, Lh00/w;->x:Lbc3/c0;

    iput-object p3, p0, Lh00/w;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lh00/w;->z:Leb/u0;

    iput-object p5, p0, Lh00/w;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lh00/w;->F:Lh00/j;

    iput-object p7, p0, Lh00/w;->G:Lc93/a;

    iput-object p8, p0, Lh00/w;->H:Lc93/a;

    iput-object p9, p0, Lh00/w;->I:Lc93/a;

    iput-object p10, p0, Lh00/w;->J:Lc93/m;

    iput-object p11, p0, Lh00/w;->K:Lkotlin/jvm/functions/Function1;

    iput-object p12, p0, Lh00/w;->L:Lkotlin/jvm/functions/Function1;

    iput-object p13, p0, Lh00/w;->M:Lkotlin/jvm/functions/Function1;

    iput-object p14, p0, Lh00/w;->N:Lc93/a;

    iput-object p15, p0, Lh00/w;->O:Lwz/e1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v1, v1, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    move-object v1, v12

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    goto/16 :goto_4

    :cond_1
    :goto_0
    sget-object v1, Lb2/t;->w:Lb2/t;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Ll0/m;->c:Ll0/g;

    sget-object v3, Lb2/e;->M:Lb2/k;

    const/4 v4, 0x0

    invoke-static {v2, v3, v12, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    invoke-static {v12}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v3

    move-object v14, v12

    check-cast v14, Lp1/q;

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v12, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v7, v14, Lp1/q;->S:Z

    if-eqz v7, :cond_2

    invoke-virtual {v14, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v12, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v12, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v5, v14, Lp1/q;->S:Z

    if-nez v5, :cond_3

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    :cond_3
    invoke-static {v3, v14, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v12, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, 0x6ccd9667

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    iget-object v6, v0, Lh00/w;->w:Lkotlin/jvm/functions/Function3;

    invoke-virtual {v14, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    iget-object v7, v0, Lh00/w;->x:Lbc3/c0;

    invoke-virtual {v14, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v10, v0, Lh00/w;->y:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v14, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v8, v0, Lh00/w;->z:Leb/u0;

    invoke-virtual {v14, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v9, v0, Lh00/w;->E:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v14, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-nez v1, :cond_6

    if-ne v2, v3, :cond_5

    goto :goto_2

    :cond_5
    move-object v1, v8

    goto :goto_3

    :cond_6
    :goto_2
    new-instance v5, La00/h;

    const/16 v11, 0x9

    invoke-direct/range {v5 .. v11}, La00/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object v1, v8

    invoke-virtual {v14, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v5

    :goto_3
    check-cast v2, Lc93/a;

    invoke-virtual {v14, v4}, Lp1/q;->q(Z)V

    const/4 v15, 0x1

    invoke-static {v2, v4, v12, v4, v15}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    const/4 v2, 0x0

    iget-object v5, v0, Lh00/w;->F:Lh00/j;

    iget-object v6, v0, Lh00/w;->G:Lc93/a;

    invoke-static {v5, v2, v6, v12, v4}, Lse/b;->i(Lh00/j;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    const v2, 0x6ccdf413

    invoke-virtual {v14, v2}, Lp1/q;->e0(I)V

    iget-object v2, v0, Lh00/w;->J:Lc93/m;

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_7

    if-ne v6, v3, :cond_8

    :cond_7
    new-instance v6, Ld30/d1;

    const/4 v5, 0x3

    invoke-direct {v6, v5, v2}, Ld30/d1;-><init>(ILc93/m;)V

    invoke-virtual {v14, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v14, v4}, Lp1/q;->q(Z)V

    const v2, 0x6cce28c0

    invoke-virtual {v14, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v14, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v2, v5

    invoke-virtual {v14, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v2, v5

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_9

    if-ne v5, v3, :cond_a

    :cond_9
    new-instance v5, Ld30/r;

    const/16 v2, 0x15

    invoke-direct {v5, v7, v10, v9, v2}, Ld30/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v14, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object v11, v5

    check-cast v11, Lc93/a;

    invoke-virtual {v14, v4}, Lp1/q;->q(Z)V

    const/4 v13, 0x0

    iget-object v2, v0, Lh00/w;->H:Lc93/a;

    iget-object v3, v0, Lh00/w;->I:Lc93/a;

    iget-object v5, v0, Lh00/w;->K:Lkotlin/jvm/functions/Function1;

    move-object v4, v6

    iget-object v6, v0, Lh00/w;->L:Lkotlin/jvm/functions/Function1;

    iget-object v8, v0, Lh00/w;->M:Lkotlin/jvm/functions/Function1;

    iget-object v9, v0, Lh00/w;->N:Lc93/a;

    move-object v7, v10

    iget-object v10, v0, Lh00/w;->O:Lwz/e1;

    invoke-static/range {v1 .. v13}, Ltx/f;->k(Leb/u0;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lwz/e1;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v14, v15}, Lp1/q;->q(Z)V

    :goto_4
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
