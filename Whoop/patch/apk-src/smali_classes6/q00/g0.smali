.class public final Lq00/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:Lkotlin/jvm/functions/Function1;

.field public final synthetic H:Lkotlin/jvm/functions/Function1;

.field public final synthetic I:Lbc3/c0;

.field public final synthetic J:Lkotlin/jvm/functions/Function1;

.field public final synthetic K:Lkotlin/jvm/functions/Function1;

.field public final synthetic L:Lkotlin/jvm/functions/Function1;

.field public final synthetic M:Lkotlin/jvm/functions/Function1;

.field public final synthetic N:Lc93/a;

.field public final synthetic O:Lc93/a;

.field public final synthetic P:Lc93/a;

.field public final synthetic Q:Lc93/a;

.field public final synthetic w:Lq00/i0;

.field public final synthetic x:Lc93/a;

.field public final synthetic y:Lg40/m3;

.field public final synthetic z:Lx30/e0;


# direct methods
.method public constructor <init>(Lq00/i0;Lc93/a;Lg40/m3;Lx30/e0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq00/g0;->w:Lq00/i0;

    iput-object p2, p0, Lq00/g0;->x:Lc93/a;

    iput-object p3, p0, Lq00/g0;->y:Lg40/m3;

    iput-object p4, p0, Lq00/g0;->z:Lx30/e0;

    iput-object p5, p0, Lq00/g0;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lq00/g0;->F:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lq00/g0;->G:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lq00/g0;->H:Lkotlin/jvm/functions/Function1;

    iput-object p9, p0, Lq00/g0;->I:Lbc3/c0;

    iput-object p10, p0, Lq00/g0;->J:Lkotlin/jvm/functions/Function1;

    iput-object p11, p0, Lq00/g0;->K:Lkotlin/jvm/functions/Function1;

    iput-object p12, p0, Lq00/g0;->L:Lkotlin/jvm/functions/Function1;

    iput-object p13, p0, Lq00/g0;->M:Lkotlin/jvm/functions/Function1;

    iput-object p14, p0, Lq00/g0;->N:Lc93/a;

    iput-object p15, p0, Lq00/g0;->O:Lc93/a;

    move-object/from16 p1, p16

    iput-object p1, p0, Lq00/g0;->P:Lc93/a;

    move-object/from16 p1, p17

    iput-object p1, p0, Lq00/g0;->Q:Lc93/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Lc0/o;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    move-object/from16 v3, p3

    check-cast v3, Landroidx/compose/runtime/Composer;

    move-object/from16 v4, p4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    const-string v4, "$this$AnimatedContent"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    check-cast v3, Lp1/q;

    const v2, 0x3f77a3be

    invoke-virtual {v3, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lb2/t;->w:Lb2/t;

    const-string v5, "wallet_screen_loader_tag"

    invoke-static {v2, v5}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x2

    invoke-static {v2, v1, v3, v5, v6}, Lug/m;->b(Landroidx/compose/ui/Modifier;Ly3/f;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v3, v4}, Lp1/q;->q(Z)V

    goto/16 :goto_0

    :cond_0
    check-cast v3, Lp1/q;

    const v2, 0x3f7a1f5d

    invoke-virtual {v3, v2}, Lp1/q;->e0(I)V

    const v2, 0x6d670180

    invoke-virtual {v3, v2}, Lp1/q;->e0(I)V

    iget-object v2, v0, Lq00/g0;->w:Lq00/i0;

    iget-object v5, v2, Lq00/i0;->u:Lzy/c;

    if-eqz v5, :cond_1

    iget-object v6, v0, Lq00/g0;->x:Lc93/a;

    invoke-static {v5, v6, v3, v4}, Lse/h;->c(Lzy/c;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    :cond_1
    invoke-virtual {v3, v4}, Lp1/q;->q(Z)V

    sget-object v5, Lb3/v1;->i:Lp1/u2;

    invoke-virtual {v3, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg2/i;

    iget-boolean v6, v2, Lq00/i0;->g:Z

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    const v7, 0x6d6727cf

    invoke-virtual {v3, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v3, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_2

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v8, v7, :cond_3

    :cond_2
    new-instance v8, Lo23/p;

    const/4 v7, 0x5

    invoke-direct {v8, v2, v5, v1, v7}, Lo23/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v3, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v8, Lc93/m;

    invoke-virtual {v3, v4}, Lp1/q;->q(Z)V

    invoke-static {v3, v8, v6}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v9, Lq00/f0;

    iget-object v2, v0, Lq00/g0;->P:Lc93/a;

    iget-object v5, v0, Lq00/g0;->Q:Lc93/a;

    iget-object v10, v0, Lq00/g0;->w:Lq00/i0;

    iget-object v11, v0, Lq00/g0;->y:Lg40/m3;

    iget-object v12, v0, Lq00/g0;->z:Lx30/e0;

    iget-object v13, v0, Lq00/g0;->E:Lkotlin/jvm/functions/Function1;

    iget-object v14, v0, Lq00/g0;->F:Lkotlin/jvm/functions/Function1;

    iget-object v15, v0, Lq00/g0;->G:Lkotlin/jvm/functions/Function1;

    iget-object v6, v0, Lq00/g0;->H:Lkotlin/jvm/functions/Function1;

    iget-object v7, v0, Lq00/g0;->I:Lbc3/c0;

    iget-object v8, v0, Lq00/g0;->J:Lkotlin/jvm/functions/Function1;

    iget-object v4, v0, Lq00/g0;->K:Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lq00/g0;->L:Lkotlin/jvm/functions/Function1;

    move-object/from16 v20, v1

    iget-object v1, v0, Lq00/g0;->M:Lkotlin/jvm/functions/Function1;

    move-object/from16 v21, v1

    iget-object v1, v0, Lq00/g0;->N:Lc93/a;

    move-object/from16 v22, v1

    iget-object v1, v0, Lq00/g0;->O:Lc93/a;

    move-object/from16 v23, v1

    move-object/from16 v24, v2

    move-object/from16 v19, v4

    move-object/from16 v25, v5

    move-object/from16 v16, v6

    move-object/from16 v17, v7

    move-object/from16 v18, v8

    invoke-direct/range {v9 .. v25}, Lq00/f0;-><init>(Lq00/i0;Lg40/m3;Lx30/e0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;)V

    const v1, -0x2aea2a9b

    invoke-static {v1, v3, v9}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x30

    const/4 v4, 0x0

    invoke-static {v4, v1, v3, v2}, Lvd/f;->c(Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    const/4 v1, 0x0

    invoke-virtual {v3, v1}, Lp1/q;->q(Z)V

    :goto_0
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
