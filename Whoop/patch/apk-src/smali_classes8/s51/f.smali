.class public final synthetic Ls51/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ls51/f;->w:I

    iput-object p2, p0, Ls51/f;->y:Ljava/lang/Object;

    iput-object p3, p0, Ls51/f;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p3, p0, Ls51/f;->w:I

    iput-object p1, p0, Ls51/f;->x:Ljava/lang/Object;

    iput-object p2, p0, Ls51/f;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lu0/r1;Ll3/e;Lb3/b3;)V
    .locals 0

    .line 3
    const/16 p1, 0x16

    iput p1, p0, Ls51/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ls51/f;->y:Ljava/lang/Object;

    iput-object p3, p0, Ls51/f;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    iget v1, v0, Ls51/f;->w:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Ls51/f;->y:Ljava/lang/Object;

    check-cast v1, Lri0/e;

    iget-object v2, v0, Ls51/f;->x:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2}, Lui0/n;->j(Lri0/e;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_0
    iget-object v1, v0, Ls51/f;->y:Ljava/lang/Object;

    check-cast v1, Lld1/c;

    iget-object v2, v0, Ls51/f;->x:Ljava/lang/Object;

    check-cast v2, Lwg2/a;

    invoke-static {v1, v2}, Lug2/d;->b(Lld1/c;Lwg2/a;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1
    iget-object v1, v0, Ls51/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, v0, Ls51/f;->y:Ljava/lang/Object;

    check-cast v2, Ltd2/i$b;

    invoke-static {v1, v2}, Lud2/e;->l(Lkotlin/jvm/functions/Function1;Ltd2/i$b;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_2
    iget-object v1, v0, Ls51/f;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/e0;

    iget-object v2, v0, Ls51/f;->x:Ljava/lang/Object;

    check-cast v2, Luc3/f;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Only found "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, v1, Lkotlin/jvm/internal/e0;->w:I

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " digits in a row, but need to parse "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Luc3/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1

    :pswitch_3
    iget-object v1, v0, Ls51/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, v0, Ls51/f;->y:Ljava/lang/Object;

    check-cast v2, Lu80/a;

    invoke-static {v1, v2}, Lu80/c;->c(Lkotlin/jvm/functions/Function1;Lu80/a;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_4
    iget-object v1, v0, Ls51/f;->y:Ljava/lang/Object;

    check-cast v1, Lu70/f;

    iget-object v2, v0, Ls51/f;->x:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2}, Lu70/e;->b(Lu70/f;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_5
    iget-object v1, v0, Ls51/f;->y:Ljava/lang/Object;

    check-cast v1, Landroid/view/View;

    iget-object v2, v0, Ls51/f;->x:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    invoke-static {v1, v2}, Lu11/i;->j(Landroid/view/View;Lp1/c1;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

    :pswitch_6
    iget-object v1, v0, Ls51/f;->y:Ljava/lang/Object;

    check-cast v1, Ll3/e;

    iget-object v2, v0, Ls51/f;->x:Ljava/lang/Object;

    check-cast v2, Lb3/b3;

    iget-object v1, v1, Ll3/e;->a:Ljava/lang/Object;

    check-cast v1, Ll3/v;

    instance-of v3, v1, Ll3/u;

    if-eqz v3, :cond_1

    move-object v3, v1

    check-cast v3, Ll3/u;

    iget-object v3, v3, Ll3/u;->c:Li20/z0;

    if-eqz v3, :cond_0

    invoke-virtual {v3, v1}, Li20/z0;->a(Ll3/v;)V

    goto :goto_0

    :cond_0
    :try_start_0
    check-cast v1, Ll3/u;

    iget-object v1, v1, Ll3/u;->a:Ljava/lang/String;

    check-cast v2, Lb3/e1;

    invoke-virtual {v2, v1}, Lb3/e1;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_1
    instance-of v2, v1, Ll3/t;

    if-eqz v2, :cond_2

    move-object v2, v1

    check-cast v2, Ll3/t;

    iget-object v2, v2, Ll3/t;->c:Li20/z0;

    if-eqz v2, :cond_2

    invoke-virtual {v2, v1}, Li20/z0;->a(Ll3/v;)V

    :catch_0
    :cond_2
    :goto_0
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_7
    iget-object v1, v0, Ls51/f;->y:Ljava/lang/Object;

    check-cast v1, Lu0/r1;

    iget-object v2, v0, Ls51/f;->x:Ljava/lang/Object;

    check-cast v2, Ll3/g;

    if-eqz v1, :cond_6

    iget-object v3, v1, Lu0/r1;->c:Lz1/p;

    invoke-virtual {v3}, Lz1/p;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v3, v1, Lu0/r1;->b:Ll3/g;

    goto :goto_2

    :cond_3
    new-instance v4, Lu0/x0;

    iget-object v5, v1, Lu0/r1;->b:Ll3/g;

    invoke-direct {v4, v5}, Lu0/x0;-><init>(Ll3/g;)V

    invoke-virtual {v3}, Lz1/p;->size()I

    move-result v5

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_4

    invoke-virtual {v3, v6}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-interface {v7, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_4
    iget-object v3, v4, Lu0/x0;->b:Ll3/g;

    :goto_2
    iput-object v3, v1, Lu0/r1;->b:Ll3/g;

    if-nez v3, :cond_5

    goto :goto_3

    :cond_5
    move-object v2, v3

    :cond_6
    :goto_3
    return-object v2

    :pswitch_8
    iget-object v1, v0, Ls51/f;->y:Ljava/lang/Object;

    check-cast v1, Lq3/y;

    iget-object v2, v0, Ls51/f;->x:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    iget-wide v3, v1, Lq3/y;->b:J

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lq3/y;

    iget-wide v5, v5, Lq3/y;->b:J

    invoke-static {v3, v4, v5, v6}, Ll3/u0;->b(JJ)Z

    move-result v3

    if-eqz v3, :cond_7

    iget-object v3, v1, Lq3/y;->c:Ll3/u0;

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lq3/y;

    iget-object v4, v4, Lq3/y;->c:Ll3/u0;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    :cond_7
    invoke-interface {v2, v1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_8
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_9
    iget-object v1, v0, Ls51/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, v0, Ls51/f;->y:Ljava/lang/Object;

    check-cast v2, Ltz0/c;

    invoke-static {v1, v2}, Ltz0/b;->a(Lkotlin/jvm/functions/Function1;Ltz0/c;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_a
    iget-object v1, v0, Ls51/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, v0, Ls51/f;->y:Ljava/lang/Object;

    check-cast v2, Lty1/k;

    invoke-static {v1, v2}, Lty1/i;->x(Lkotlin/jvm/functions/Function1;Lty1/k;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_b
    iget-object v1, v0, Ls51/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, v0, Ls51/f;->y:Ljava/lang/Object;

    check-cast v2, Ltx0/g;

    invoke-static {v1, v2}, Ltx0/d;->j(Lkotlin/jvm/functions/Function1;Ltx0/g;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_c
    iget-object v1, v0, Ls51/f;->y:Ljava/lang/Object;

    check-cast v1, Lp1/t2;

    iget-object v2, v0, Ls51/f;->x:Ljava/lang/Object;

    check-cast v2, Ll83/h;

    invoke-static {v1, v2}, Ltu2/b;->e(Lp1/t2;Ll83/h;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_d
    iget-object v1, v0, Ls51/f;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;

    iget-object v2, v0, Ls51/f;->x:Ljava/lang/Object;

    check-cast v2, Lp1/t2;

    invoke-static {v1, v2}, Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;->B(Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;Lp1/t2;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_e
    iget-object v1, v0, Ls51/f;->y:Ljava/lang/Object;

    check-cast v1, Lt21/d;

    iget-object v2, v0, Ls51/f;->x:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2}, Lt21/g;->e(Lt21/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_f
    iget-object v1, v0, Ls51/f;->y:Ljava/lang/Object;

    check-cast v1, Lt20/n;

    iget-object v2, v0, Ls51/f;->x:Ljava/lang/Object;

    move-object v7, v2

    check-cast v7, Ls20/a;

    iget-boolean v4, v1, Lt20/n;->a:Z

    iget-object v5, v1, Lt20/n;->b:Lq20/c;

    iget-object v6, v1, Lt20/n;->c:Ly00/p2;

    iget-object v2, v1, Lt20/n;->j:Ljava/lang/String;

    iget-boolean v8, v1, Lt20/n;->e:Z

    iget-boolean v9, v1, Lt20/n;->f:Z

    iget-boolean v10, v1, Lt20/n;->g:Z

    iget-object v11, v1, Lt20/n;->h:Ljava/lang/String;

    iget-object v12, v1, Lt20/n;->i:Ljava/lang/String;

    iget-object v13, v1, Lt20/n;->d:Ljava/lang/String;

    iget-object v3, v1, Lt20/n;->l:Lq20/y;

    instance-of v14, v3, Lq20/s;

    if-eqz v14, :cond_9

    check-cast v3, Lq20/s;

    :goto_4
    move-object v14, v3

    goto :goto_5

    :cond_9
    const/4 v3, 0x0

    goto :goto_4

    :goto_5
    iget-object v15, v1, Lt20/n;->k:Li20/b;

    iget-boolean v3, v1, Lt20/n;->u:Z

    move-object/from16 v16, v2

    iget-object v2, v1, Lt20/n;->v:Lf20/b;

    move-object/from16 v17, v2

    iget-boolean v2, v1, Lt20/n;->w:Z

    move/from16 v19, v2

    iget-object v2, v1, Lt20/n;->x:Lh20/i3;

    move-object/from16 v20, v2

    iget-object v2, v1, Lt20/n;->y:Ljava/lang/String;

    move-object/from16 v21, v2

    iget-boolean v2, v1, Lt20/n;->z:Z

    iget-object v1, v1, Lt20/n;->A:Ly00/n;

    move/from16 v18, v3

    new-instance v3, Lt20/v;

    move-object/from16 v23, v1

    move/from16 v22, v2

    invoke-direct/range {v3 .. v23}, Lt20/v;-><init>(ZLq20/c;Ly00/p2;Ls20/a;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq20/s;Li20/b;Ljava/lang/String;Lf20/b;ZZLh20/i3;Ljava/lang/String;ZLy00/n;)V

    return-object v3

    :pswitch_10
    iget-object v1, v0, Ls51/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, v0, Ls51/f;->y:Ljava/lang/Object;

    check-cast v2, Lsz0/q;

    invoke-static {v1, v2}, Lsz0/n;->b(Lkotlin/jvm/functions/Function1;Lsz0/q;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_11
    iget-object v1, v0, Ls51/f;->y:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    iget-object v2, v0, Ls51/f;->x:Ljava/lang/Object;

    check-cast v2, Lux1/d;

    invoke-static {v1, v2}, Lsx1/j;->k(Lc93/m;Lux1/d;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_12
    iget-object v1, v0, Ls51/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, v0, Ls51/f;->y:Ljava/lang/Object;

    check-cast v2, Lrv2/c;

    invoke-static {v1, v2}, Lsv2/e;->A(Lkotlin/jvm/functions/Function1;Lrv2/c;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_13
    iget-object v1, v0, Ls51/f;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    iget-object v2, v0, Ls51/f;->x:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    invoke-static {v1, v2}, Lst1/n;->i(Ljava/util/Map;Lp1/c1;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

    :pswitch_14
    iget-object v1, v0, Ls51/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, v0, Ls51/f;->y:Ljava/lang/Object;

    check-cast v2, Lrt1/c;

    invoke-static {v1, v2}, Lst1/l;->c(Lkotlin/jvm/functions/Function1;Lrt1/c;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_15
    iget-object v1, v0, Ls51/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, v0, Ls51/f;->y:Ljava/lang/Object;

    check-cast v2, Lrt1/d;

    invoke-static {v1, v2}, Lst1/l;->k(Lkotlin/jvm/functions/Function1;Lrt1/d;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_16
    iget-object v1, v0, Ls51/f;->y:Ljava/lang/Object;

    check-cast v1, Lrt1/h$b;

    iget-object v2, v0, Ls51/f;->x:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2}, Lst1/l;->l(Lrt1/h$b;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_17
    iget-object v1, v0, Ls51/f;->y:Ljava/lang/Object;

    check-cast v1, Lng2/c;

    iget-object v2, v0, Ls51/f;->x:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    invoke-static {v1, v2}, Lsg2/v;->a(Lng2/c;Lp1/c1;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_18
    iget-object v1, v0, Ls51/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, v0, Ls51/f;->y:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/educationModels/PodcastPlayer;

    invoke-static {v1, v2}, Lse1/a;->a(Lkotlin/jvm/functions/Function1;Lcom/whoop/educationModels/PodcastPlayer;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_19
    iget-object v1, v0, Ls51/f;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/realtime/service/RealTimeActivityService;

    iget-object v2, v0, Ls51/f;->x:Ljava/lang/Object;

    check-cast v2, Lp92/e;

    invoke-static {v2, v1}, Lcom/whoop/realtime/service/RealTimeActivityService;->a(Lp92/e;Lcom/whoop/realtime/service/RealTimeActivityService;)Luf3/a;

    move-result-object v1

    return-object v1

    :pswitch_1a
    iget-object v1, v0, Ls51/f;->y:Ljava/lang/Object;

    check-cast v1, Ls51/i;

    iget-object v2, v0, Ls51/f;->x:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2}, Ls51/l;->d(Ls51/i;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1b
    iget-object v1, v0, Ls51/f;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, v0, Ls51/f;->y:Ljava/lang/Object;

    check-cast v2, Ls51/e;

    invoke-static {v1, v2}, Ls51/g;->e(Lkotlin/jvm/functions/Function1;Ls51/e;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1c
    iget-object v1, v0, Ls51/f;->y:Ljava/lang/Object;

    check-cast v1, Ls51/h;

    iget-object v2, v0, Ls51/f;->x:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2}, Ls51/g;->d(Ls51/h;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
