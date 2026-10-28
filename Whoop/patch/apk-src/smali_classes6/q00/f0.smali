.class public final Lq00/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:Lkotlin/jvm/functions/Function1;

.field public final synthetic H:Lbc3/c0;

.field public final synthetic I:Lkotlin/jvm/functions/Function1;

.field public final synthetic J:Lkotlin/jvm/functions/Function1;

.field public final synthetic K:Lkotlin/jvm/functions/Function1;

.field public final synthetic L:Lkotlin/jvm/functions/Function1;

.field public final synthetic M:Lc93/a;

.field public final synthetic N:Lc93/a;

.field public final synthetic O:Lc93/a;

.field public final synthetic P:Lc93/a;

.field public final synthetic w:Lq00/i0;

.field public final synthetic x:Lg40/m3;

.field public final synthetic y:Lx30/e0;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lq00/i0;Lg40/m3;Lx30/e0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq00/f0;->w:Lq00/i0;

    iput-object p2, p0, Lq00/f0;->x:Lg40/m3;

    iput-object p3, p0, Lq00/f0;->y:Lx30/e0;

    iput-object p4, p0, Lq00/f0;->z:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lq00/f0;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lq00/f0;->F:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lq00/f0;->G:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lq00/f0;->H:Lbc3/c0;

    iput-object p9, p0, Lq00/f0;->I:Lkotlin/jvm/functions/Function1;

    iput-object p10, p0, Lq00/f0;->J:Lkotlin/jvm/functions/Function1;

    iput-object p11, p0, Lq00/f0;->K:Lkotlin/jvm/functions/Function1;

    iput-object p12, p0, Lq00/f0;->L:Lkotlin/jvm/functions/Function1;

    iput-object p13, p0, Lq00/f0;->M:Lc93/a;

    iput-object p14, p0, Lq00/f0;->N:Lc93/a;

    iput-object p15, p0, Lq00/f0;->O:Lc93/a;

    move-object/from16 p1, p16

    iput-object p1, p0, Lq00/f0;->P:Lc93/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Ll0/y;

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    const-string v4, "$this$ScrollableTopLevelColumn"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, v3, 0x11

    const/16 v3, 0x10

    if-ne v1, v3, :cond_1

    move-object v1, v2

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    iget-object v1, v0, Lq00/f0;->w:Lq00/i0;

    iget-object v4, v1, Lq00/i0;->o:Ljava/lang/Boolean;

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    move v8, v4

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lq00/i0;->d()Ly00/c0;

    move-result-object v4

    const/4 v6, 0x1

    if-eqz v4, :cond_3

    invoke-virtual {v1, v4}, Lq00/i0;->e(Ly00/c0;)Z

    move-result v4

    if-ne v4, v6, :cond_3

    move v8, v5

    goto :goto_1

    :cond_3
    move v8, v6

    :goto_1
    move-object v13, v2

    check-cast v13, Lp1/q;

    const v2, -0x650322ee

    invoke-virtual {v13, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, v0, Lq00/f0;->F:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v13, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v2, v0, Lq00/f0;->G:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v13, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v2, v0, Lq00/f0;->H:Lbc3/c0;

    invoke-virtual {v13, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v1, v4

    iget-object v4, v0, Lq00/f0;->I:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v13, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v1, v4

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_4

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v4, v1, :cond_5

    :cond_4
    new-instance v14, La00/h;

    const/16 v20, 0x11

    iget-object v15, v0, Lq00/f0;->w:Lq00/i0;

    iget-object v1, v0, Lq00/f0;->F:Lkotlin/jvm/functions/Function1;

    iget-object v4, v0, Lq00/f0;->G:Lkotlin/jvm/functions/Function1;

    iget-object v6, v0, Lq00/f0;->I:Lkotlin/jvm/functions/Function1;

    move-object/from16 v16, v1

    move-object/from16 v18, v2

    move-object/from16 v17, v4

    move-object/from16 v19, v6

    invoke-direct/range {v14 .. v20}, La00/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v13, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v4, v14

    :cond_5
    check-cast v4, Lc93/a;

    invoke-virtual {v13, v5}, Lp1/q;->q(Z)V

    iget-object v1, v0, Lq00/f0;->I:Lkotlin/jvm/functions/Function1;

    const v21, 0x8006

    iget-object v7, v0, Lq00/f0;->w:Lq00/i0;

    iget-object v9, v0, Lq00/f0;->x:Lg40/m3;

    iget-object v10, v0, Lq00/f0;->y:Lx30/e0;

    iget-object v11, v0, Lq00/f0;->z:Lkotlin/jvm/functions/Function1;

    iget-object v12, v0, Lq00/f0;->E:Lkotlin/jvm/functions/Function1;

    iget-object v14, v0, Lq00/f0;->J:Lkotlin/jvm/functions/Function1;

    iget-object v15, v0, Lq00/f0;->K:Lkotlin/jvm/functions/Function1;

    iget-object v2, v0, Lq00/f0;->L:Lkotlin/jvm/functions/Function1;

    iget-object v5, v0, Lq00/f0;->M:Lc93/a;

    iget-object v6, v0, Lq00/f0;->G:Lkotlin/jvm/functions/Function1;

    move-object/from16 v19, v1

    move-object/from16 v16, v2

    move-object/from16 v17, v5

    move-object/from16 v18, v6

    move-object/from16 v20, v13

    move-object v13, v4

    invoke-static/range {v7 .. v21}, Lse/h;->n(Lq00/i0;ZLg40/m3;Lx30/e0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v13, v20

    int-to-float v1, v3

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v13, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    iget-object v12, v0, Lq00/f0;->P:Lc93/a;

    const/4 v14, 0x0

    iget-object v9, v0, Lq00/f0;->w:Lq00/i0;

    iget-object v10, v0, Lq00/f0;->N:Lc93/a;

    iget-object v11, v0, Lq00/f0;->O:Lc93/a;

    invoke-static/range {v9 .. v14}, Lse/h;->a(Lq00/i0;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
