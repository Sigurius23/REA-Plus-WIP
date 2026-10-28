.class public final Lh00/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lc93/m;

.field public final synthetic G:Lkotlin/jvm/functions/Function1;

.field public final synthetic H:Lc93/a;

.field public final synthetic I:Lc93/a;

.field public final synthetic J:Lkotlin/jvm/functions/Function1;

.field public final synthetic K:Lc93/a;

.field public final synthetic L:Lc93/a;

.field public final synthetic M:Lwz/e1;

.field public final synthetic N:Lp1/c1;

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Leb/u0;

.field public final synthetic y:Lh00/j;

.field public final synthetic z:Lh40/k;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/Modifier;Leb/u0;Lh00/j;Lh40/k;Lkotlin/jvm/functions/Function1;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lwz/e1;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh00/g;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lh00/g;->x:Leb/u0;

    iput-object p3, p0, Lh00/g;->y:Lh00/j;

    iput-object p4, p0, Lh00/g;->z:Lh40/k;

    iput-object p5, p0, Lh00/g;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lh00/g;->F:Lc93/m;

    iput-object p7, p0, Lh00/g;->G:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lh00/g;->H:Lc93/a;

    iput-object p9, p0, Lh00/g;->I:Lc93/a;

    iput-object p10, p0, Lh00/g;->J:Lkotlin/jvm/functions/Function1;

    iput-object p11, p0, Lh00/g;->K:Lc93/a;

    iput-object p12, p0, Lh00/g;->L:Lc93/a;

    iput-object p13, p0, Lh00/g;->M:Lwz/e1;

    iput-object p14, p0, Lh00/g;->N:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v2, v2, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v2, v0, Lh00/g;->N:Lp1/c1;

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Lkotlin/jvm/functions/Function3;

    check-cast v1, Lp1/q;

    const v3, -0x26759463

    invoke-virtual {v1, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v3, v4, :cond_2

    new-instance v3, Lf1/a0;

    const/16 v5, 0xf

    invoke-direct {v3, v5, v2}, Lf1/a0;-><init>(ILp1/c1;)V

    invoke-virtual {v1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v8, v3

    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    const v3, -0x267583d3

    invoke-virtual {v1, v3}, Lp1/q;->e0(I)V

    iget-object v3, v0, Lh00/g;->z:Lh40/k;

    invoke-virtual {v1, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_3

    if-ne v6, v4, :cond_4

    :cond_3
    new-instance v6, Lh00/f;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {v6, v3, v4, v5}, Lh00/f;-><init>(Lh40/k;Lq83/d;I)V

    invoke-virtual {v1, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v9, v6

    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    iget-object v2, v0, Lh00/g;->M:Lwz/e1;

    const/16 v20, 0x6000

    iget-object v4, v0, Lh00/g;->w:Landroidx/compose/ui/Modifier;

    iget-object v5, v0, Lh00/g;->x:Leb/u0;

    iget-object v6, v0, Lh00/g;->y:Lh00/j;

    iget-object v10, v0, Lh00/g;->E:Lkotlin/jvm/functions/Function1;

    iget-object v11, v0, Lh00/g;->F:Lc93/m;

    iget-object v12, v0, Lh00/g;->G:Lkotlin/jvm/functions/Function1;

    iget-object v13, v0, Lh00/g;->H:Lc93/a;

    iget-object v14, v0, Lh00/g;->I:Lc93/a;

    iget-object v15, v0, Lh00/g;->J:Lkotlin/jvm/functions/Function1;

    iget-object v3, v0, Lh00/g;->K:Lc93/a;

    move-object/from16 v19, v1

    iget-object v1, v0, Lh00/g;->L:Lc93/a;

    move-object/from16 v17, v1

    move-object/from16 v18, v2

    move-object/from16 v16, v3

    invoke-static/range {v4 .. v20}, Ltx/f;->g(Landroidx/compose/ui/Modifier;Leb/u0;Lh00/j;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lwz/e1;Landroidx/compose/runtime/Composer;I)V

    :goto_1
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
