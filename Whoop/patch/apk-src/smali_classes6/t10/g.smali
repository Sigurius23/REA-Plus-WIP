.class public final synthetic Lt10/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/paymentelement/embedded/form/FormActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;I)V
    .locals 0

    iput p2, p0, Lt10/g;->w:I

    iput-object p1, p0, Lt10/g;->x:Lcom/stripe/android/paymentelement/embedded/form/FormActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 33

    move-object/from16 v0, p0

    iget v1, v0, Lt10/g;->w:I

    iget-object v3, v0, Lt10/g;->x:Lcom/stripe/android/paymentelement/embedded/form/FormActivity;

    packed-switch v1, :pswitch_data_0

    iget-object v1, v3, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->F:Lt10/d;

    if-eqz v1, :cond_9

    iget-object v4, v1, Lt10/d;->c:Lc10/n;

    iget-object v5, v1, Lt10/d;->d:Ls10/f;

    iget-object v6, v1, Lt10/d;->f:Lt10/t;

    iget-object v6, v6, Lt10/t;->a:Lc93/a;

    if-eqz v6, :cond_0

    invoke-interface {v6}, Lc93/a;->invoke()Ljava/lang/Object;

    goto/16 :goto_3

    :cond_0
    iget-object v5, v5, Ls10/f;->b:Lec3/r1;

    iget-object v6, v5, Lec3/r1;->w:Lec3/f2;

    iget-object v5, v5, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v6}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lq20/y;

    if-eqz v6, :cond_1

    iget-object v7, v1, Lt10/d;->g:Lk20/a;

    invoke-virtual {v7, v6}, Lk20/a;->q(Lq20/y;)V

    :cond_1
    iget-object v6, v4, Lc10/n;->T:Lc10/o;

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    if-eqz v6, :cond_7

    const/4 v7, 0x1

    if-ne v6, v7, :cond_6

    iget-object v6, v1, Lt10/d;->a:Lv00/c0;

    invoke-interface {v5}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lq20/y;

    if-eqz v5, :cond_4

    iget-object v8, v4, Lc10/n;->w:Ljava/lang/String;

    iget-object v9, v4, Lc10/n;->x:Lh20/c2;

    iget-object v10, v4, Lc10/n;->y:Lh20/h2;

    iget-object v12, v4, Lc10/n;->z:Lh20/i1;

    iget-object v13, v4, Lc10/n;->E:Li20/b;

    iget-boolean v14, v4, Lc10/n;->F:Z

    iget-boolean v15, v4, Lc10/n;->G:Z

    iget-object v7, v4, Lc10/n;->J:Lh20/l1;

    iget-object v11, v4, Lc10/n;->K:Ljava/util/ArrayList;

    iget-boolean v2, v4, Lc10/n;->L:Z

    iget-object v0, v4, Lc10/n;->M:Ljava/util/List;

    move-object/from16 v19, v0

    iget-object v0, v4, Lc10/n;->N:Ljava/util/List;

    move-object/from16 v20, v0

    iget-object v0, v4, Lc10/n;->O:Lh20/t1;

    move-object/from16 v21, v0

    iget-object v0, v4, Lc10/n;->Q:Ljava/util/ArrayList;

    move-object/from16 v17, v11

    iget-object v11, v4, Lc10/n;->S:Lh20/w2;

    move-object/from16 v23, v0

    iget-object v0, v4, Lc10/n;->U:Ljava/util/LinkedHashMap;

    move-object/from16 v27, v0

    iget-boolean v0, v4, Lc10/n;->V:Z

    move/from16 v29, v0

    iget-object v0, v4, Lc10/n;->W:Ljava/lang/String;

    move-object/from16 v30, v0

    iget-object v0, v4, Lc10/n;->H:Lh20/h1;

    iget-object v4, v4, Lc10/n;->P:Ljava/util/ArrayList;

    move-object/from16 v16, v7

    new-instance v7, Lmy/a;

    const/16 v28, 0x0

    const/16 v26, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-object/from16 v31, v0

    move/from16 v18, v2

    move-object/from16 v22, v4

    invoke-direct/range {v7 .. v31}, Lmy/a;-><init>(Ljava/lang/String;Lh20/c2;Lh20/h2;Lh20/w2;Lh20/i1;Li20/b;ZZLh20/l1;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Lh20/t1;Ljava/util/List;Ljava/util/List;Lh20/g3;Ljava/lang/String;Lwz/d0;Ljava/util/Map;Lh20/q3;ZLjava/lang/String;Lh20/h1;)V

    iget-object v0, v6, Lv00/c0;->l0:La30/l0;

    if-eqz v0, :cond_2

    iget-object v0, v0, La30/l0;->w:Lwz/g0;

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    iget-object v2, v6, Lv00/c0;->Y:Lux/b;

    invoke-static {v5, v7, v0, v2}, Lds/q;->K(Lq20/y;Lmy/a;Lwz/g0;Lux/b;)Le10/l;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    new-instance v2, Le10/k;

    invoke-direct {v2, v0, v6}, Le10/k;-><init>(Le10/l;Lv00/c0;)V

    goto :goto_2

    :cond_4
    :goto_1
    const/4 v2, 0x0

    :goto_2
    if-eqz v2, :cond_5

    iget-object v0, v1, Lt10/d;->h:Lbc3/c0;

    new-instance v4, Ls40/c0;

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-direct {v4, v1, v2, v6, v5}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v1, 0x3

    invoke-static {v0, v6, v6, v4, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_5
    :goto_3
    const/4 v2, 0x0

    goto :goto_4

    :cond_6
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_7
    new-instance v2, Lt10/r;

    invoke-interface {v5}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq20/y;

    const/4 v1, 0x0

    invoke-direct {v2, v0, v1}, Lt10/r;-><init>(Lq20/y;Z)V

    :goto_4
    if-eqz v2, :cond_8

    invoke-virtual {v3, v2}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->o(Lt10/s;)V

    invoke-virtual {v3}, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->finish()V

    :cond_8
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_9
    const-string v0, "confirmationHelper"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/16 v32, 0x0

    throw v32

    :pswitch_0
    sget v0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->G:I

    iget-object v0, v3, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->w:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt10/p;

    if-eqz v0, :cond_a

    return-object v0

    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Required value was null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    sget v0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->G:I

    new-instance v0, La20/h;

    new-instance v1, Lt10/g;

    const/4 v2, 0x2

    invoke-direct {v1, v3, v2}, Lt10/g;-><init>(Lcom/stripe/android/paymentelement/embedded/form/FormActivity;I)V

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, La20/h;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :pswitch_2
    const/16 v32, 0x0

    sget v0, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;->G:I

    invoke-virtual {v3}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "getIntent(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_b

    const-string v1, "extra_activity_args"

    const-class v2, Lt10/p;

    invoke-static {v0, v2, v1}, Ldt/b;->u(Landroid/os/Bundle;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lt10/p;

    goto :goto_5

    :cond_b
    move-object/from16 v2, v32

    :goto_5
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
