.class public final synthetic Lno0/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lno0/e0;->w:I

    iput-object p1, p0, Lno0/e0;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lno0/e0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lno0/e0;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/l1;

    check-cast p1, Ljava/lang/Throwable;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Ldc/a;->d(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object p1

    invoke-virtual {v0, p1}, Lbc3/t1;->p(Ljava/util/concurrent/CancellationException;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lno0/e0;->x:Ljava/lang/Object;

    check-cast v0, Lpc2/f;

    check-cast p1, Ln0/q;

    invoke-static {v0, p1}, Lpc2/d;->c(Lpc2/f;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lno0/e0;->x:Ljava/lang/Object;

    check-cast v0, Lc2/l;

    check-cast p1, Ly2/y;

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ly2/q1;->f(Ly2/y;)Lh2/c;

    move-result-object p1

    iput-object p1, v0, Lc2/l;->b:Lh2/c;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lno0/e0;->x:Ljava/lang/Object;

    check-cast v0, Lp31/h;

    check-cast p1, Lkd1/l;

    invoke-static {v0, p1}, Lp31/f;->k(Lp31/h;Lkd1/l;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lno0/e0;->x:Ljava/lang/Object;

    check-cast v0, Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lno0/e0;->x:Ljava/lang/Object;

    check-cast v0, Lp1/i1;

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lp1/i1;->y(J)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lno0/e0;->x:Ljava/lang/Object;

    check-cast v0, Lp1/h1;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Lp1/h1;->y(I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lno0/e0;->x:Ljava/lang/Object;

    check-cast v0, Ly1/f;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Ly1/f;->d(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x1

    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lno0/e0;->x:Ljava/lang/Object;

    check-cast v0, Lp0/g0;

    check-cast p1, Lp1/i0;

    new-instance p1, Lb1/e;

    const/16 v1, 0xa

    invoke-direct {p1, v0, v1}, Lb1/e;-><init>(Ljava/lang/Object;I)V

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lno0/e0;->x:Ljava/lang/Object;

    check-cast v0, Lp0/z;

    check-cast p1, Lp1/i0;

    new-instance p1, Lb1/e;

    const/16 v1, 0x8

    invoke-direct {p1, v0, v1}, Lb1/e;-><init>(Ljava/lang/Object;I)V

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lno0/e0;->x:Ljava/lang/Object;

    check-cast v0, Loy2/l$l;

    check-cast p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;

    invoke-static {v0, p1}, Loy2/e;->g(Loy2/l$l;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;)Loy2/b;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lno0/e0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/core/details/view/CoreDetailsFragment;

    check-cast p1, Lcom/whoop/core/details/view/b;

    invoke-static {v0, p1}, Lcom/whoop/core/details/view/CoreDetailsFragment;->z(Lcom/whoop/core/details/view/CoreDetailsFragment;Lcom/whoop/core/details/view/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lno0/e0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;

    check-cast p1, Lje2/a$j;

    invoke-static {v0, p1}, Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;->y(Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;Lje2/a$j;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lno0/e0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/shepherd/fragment/ShepherdNotificationHistoryFragment;

    check-cast p1, Lxd2/h$p;

    invoke-static {v0, p1}, Lcom/whoop/shepherd/fragment/ShepherdNotificationHistoryFragment;->B(Lcom/whoop/shepherd/fragment/ShepherdNotificationHistoryFragment;Lxd2/h$p;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lno0/e0;->x:Ljava/lang/Object;

    check-cast v0, Lm72/f;

    check-cast p1, Lm72/e;

    invoke-static {v0, p1}, Lo72/f;->f(Lm72/f;Lm72/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lno0/e0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/sage/view/SageFragment;

    check-cast p1, La72/a;

    invoke-static {v0, p1}, Lcom/whoop/sage/view/SageFragment;->z(Lcom/whoop/sage/view/SageFragment;La72/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lno0/e0;->x:Ljava/lang/Object;

    check-cast v0, Lf72/d;

    check-cast p1, Lf72/b;

    invoke-static {v0, p1}, Lcom/whoop/sage/view/SageFragment;->B(Lf72/d;Lf72/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lno0/e0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/realtime/presentation/m;

    check-cast p1, Ljava/lang/Float;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/m;->a(Lcom/whoop/realtime/presentation/m;Ljava/lang/Float;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lno0/e0;->x:Ljava/lang/Object;

    check-cast v0, Lo01/c;

    check-cast p1, Li3/z;

    invoke-static {v0, p1}, Lo01/b;->e(Lo01/c;Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lno0/e0;->x:Ljava/lang/Object;

    check-cast v0, Lo0/y;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    neg-float p1, p1

    const/4 v1, 0x0

    cmpg-float v2, p1, v1

    if-gez v2, :cond_2

    invoke-virtual {v0}, Lo0/y;->d()Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_2
    cmpl-float v2, p1, v1

    if-lez v2, :cond_4

    invoke-virtual {v0}, Lo0/y;->c()Z

    move-result v2

    if-nez v2, :cond_4

    :cond_3
    move p1, v1

    goto/16 :goto_5

    :cond_4
    iget v2, v0, Lo0/y;->g:F

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    const/high16 v3, 0x3f000000    # 0.5f

    cmpg-float v2, v2, v3

    if-gtz v2, :cond_5

    goto :goto_2

    :cond_5
    const-string v2, "entered drag with non-zero pending scroll"

    invoke-static {v2}, Lk0/a;->c(Ljava/lang/String;)V

    :goto_2
    iget v2, v0, Lo0/y;->g:F

    add-float/2addr v2, p1

    iput v2, v0, Lo0/y;->g:F

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpl-float v2, v2, v3

    if-lez v2, :cond_a

    iget v2, v0, Lo0/y;->g:F

    invoke-static {v2}, Le93/b;->X(F)I

    move-result v4

    iget-object v5, v0, Lo0/y;->e:Lp1/k1;

    invoke-virtual {v5}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo0/o;

    iget-boolean v6, v0, Lo0/y;->b:Z

    const/4 v7, 0x1

    xor-int/2addr v6, v7

    invoke-virtual {v5, v4, v6}, Lo0/o;->d(IZ)Lo0/o;

    move-result-object v5

    if-eqz v5, :cond_7

    iget-object v6, v0, Lo0/y;->c:Lo0/o;

    if-eqz v6, :cond_7

    invoke-virtual {v6, v4, v7}, Lo0/o;->d(IZ)Lo0/o;

    move-result-object v4

    if-eqz v4, :cond_6

    iput-object v4, v0, Lo0/y;->c:Lo0/o;

    goto :goto_3

    :cond_6
    const/4 v5, 0x0

    :cond_7
    :goto_3
    if-eqz v5, :cond_8

    iget-boolean v4, v0, Lo0/y;->b:Z

    invoke-virtual {v0, v5, v4, v7}, Lo0/y;->f(Lo0/o;ZZ)V

    iget-object v4, v0, Lo0/y;->r:Lp1/c1;

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    invoke-interface {v4, v6}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    iget v4, v0, Lo0/y;->g:F

    sub-float/2addr v2, v4

    invoke-virtual {v0, v2, v5}, Lo0/y;->h(FLo0/o;)V

    goto :goto_4

    :cond_8
    iget-object v4, v0, Lo0/y;->j:La3/n0;

    if-eqz v4, :cond_9

    invoke-virtual {v4}, La3/n0;->m()V

    :cond_9
    iget v4, v0, Lo0/y;->g:F

    sub-float/2addr v2, v4

    invoke-virtual {v0}, Lo0/y;->g()Lo0/o;

    move-result-object v4

    invoke-virtual {v0, v2, v4}, Lo0/y;->h(FLo0/o;)V

    :cond_a
    :goto_4
    iget v2, v0, Lo0/y;->g:F

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpg-float v2, v2, v3

    if-gtz v2, :cond_b

    goto :goto_5

    :cond_b
    iget v2, v0, Lo0/y;->g:F

    sub-float/2addr p1, v2

    iput v1, v0, Lo0/y;->g:F

    :goto_5
    neg-float p1, p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lno0/e0;->x:Ljava/lang/Object;

    check-cast v0, Lo0/v;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Lo0/v;->c(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lno0/e0;->x:Ljava/lang/Object;

    check-cast v0, Ll0/k1;

    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {v0, p1}, Lny0/l0;->a(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lno0/e0;->x:Ljava/lang/Object;

    check-cast v0, Lny/g;

    check-cast p1, Lh20/l;

    sget-object v1, Lm83/y;->w:Lm83/y;

    if-eqz p1, :cond_c

    invoke-static {v1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    goto :goto_8

    :cond_c
    iget-object p1, v0, Lny/g;->d:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg40/i1;

    invoke-interface {v2}, Lg40/i1;->e()Lec3/f2;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_d
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_e

    invoke-static {v1}, Lm83/u;->j0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    goto :goto_7

    :cond_e
    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    const/4 v1, 0x0

    new-array v1, v1, [Lec3/l;

    invoke-interface {p1, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lec3/l;

    new-instance v1, Lg40/c;

    const/16 v2, 0x9

    invoke-direct {v1, p1, v2}, Lg40/c;-><init>([Lec3/l;I)V

    move-object p1, v1

    :goto_7
    new-instance v1, Lg40/d;

    const/16 v2, 0xb

    invoke-direct {v1, v0, v2}, Lg40/d;-><init>(Ljava/util/ArrayList;I)V

    new-instance v0, Ln53/e;

    invoke-direct {v0, p1, v1}, Ln53/e;-><init>(Lec3/l;Lc93/a;)V

    move-object p1, v0

    :goto_8
    return-object p1

    :pswitch_16
    iget-object v0, p0, Lno0/e0;->x:Ljava/lang/Object;

    check-cast v0, Lkw2/a;

    check-cast p1, Lkw2/b;

    invoke-static {v0, p1}, Lcom/whoop/whattoexpect/view/WhatToExpectFragment;->A(Lkw2/a;Lkw2/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lno0/e0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/whattoexpect/view/WhatToExpectFragment;

    check-cast p1, Llw2/a;

    invoke-static {v0, p1}, Lcom/whoop/whattoexpect/view/WhatToExpectFragment;->z(Lcom/whoop/whattoexpect/view/WhatToExpectFragment;Llw2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lno0/e0;->x:Ljava/lang/Object;

    check-cast v0, Lkw0/b;

    check-cast p1, Lkw0/a;

    invoke-static {v0, p1}, Lcom/whoop/core/details/sleep/view/SleepDetailsFragment;->L(Lkw0/b;Lkw0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lno0/e0;->x:Ljava/lang/Object;

    check-cast v0, Lmw0/c;

    check-cast p1, Lmw0/b;

    invoke-static {v0, p1}, Lnw0/j;->r(Lmw0/c;Lmw0/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lno0/e0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/user/journey/yearinreviewraf/YirRafFragment;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/whoop/user/journey/yearinreviewraf/YirRafFragment;->z(Lcom/whoop/user/journey/yearinreviewraf/YirRafFragment;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lno0/e0;->x:Ljava/lang/Object;

    check-cast v0, Lt0/i;

    check-cast p1, Li2/g0;

    invoke-static {v0, p1}, Lnq2/e;->j(Lt0/i;Li2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lno0/e0;->x:Ljava/lang/Object;

    check-cast v0, Llo0/l0;

    check-cast p1, Lc0/q;

    invoke-static {v0, p1}, Lno0/g0;->e(Llo0/l0;Lc0/q;)Lc0/l0;

    move-result-object p1

    return-object p1

    nop

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
