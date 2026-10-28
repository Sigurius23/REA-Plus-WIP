.class public final synthetic Lov2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lov2/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly3/e;)V
    .locals 0

    .line 2
    const/16 p1, 0x12

    iput p1, p0, Lov2/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lov2/f;->w:I

    const/4 v1, 0x1

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ln6/n;

    instance-of v0, p1, Ln6/d;

    if-nez v0, :cond_1

    instance-of p1, p1, Lo6/b;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v3

    :cond_1
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ln6/i;

    instance-of v0, p1, Lp6/w;

    if-eqz v0, :cond_2

    goto/16 :goto_7

    :cond_2
    invoke-interface {p1}, Ln6/i;->c()Ln6/o;

    move-result-object v0

    new-instance v2, Lov2/f;

    const/16 v4, 0x1d

    invoke-direct {v2, v4}, Lov2/f;-><init>(I)V

    invoke-interface {v0, v2}, Ln6/o;->c(Lkotlin/jvm/functions/Function1;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_7

    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ln6/i;->c()Ln6/o;

    move-result-object v4

    sget-object v5, Lp6/i1;->y:Lp6/i1;

    invoke-interface {v4, v5}, Ln6/o;->c(Lkotlin/jvm/functions/Function1;)Z

    move-result v5

    sget-object v6, Ln6/m;->a:Ln6/m;

    const/4 v7, 0x0

    if-eqz v5, :cond_4

    new-instance v5, Ll83/k;

    invoke-direct {v5, v7, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v8, Lp6/b1;->P:Lp6/b1;

    invoke-interface {v4, v5, v8}, Ln6/o;->a(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll83/k;

    goto :goto_1

    :cond_4
    new-instance v5, Ll83/k;

    invoke-direct {v5, v7, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v4, v5

    :goto_1
    iget-object v5, v4, Ll83/k;->w:Ljava/lang/Object;

    check-cast v5, Ln6/e;

    iget-object v4, v4, Ll83/k;->x:Ljava/lang/Object;

    check-cast v4, Ln6/o;

    const/4 v8, 0x2

    if-eqz v5, :cond_7

    instance-of v9, v5, Ln6/d;

    if-eqz v9, :cond_5

    new-instance v9, Ln6/j;

    invoke-direct {v9}, Ln6/j;-><init>()V

    invoke-static {v6}, Ls2/d;->k(Ln6/o;)Ln6/o;

    move-result-object v10

    iput-object v10, v9, Ln6/j;->a:Ln6/o;

    check-cast v5, Ln6/d;

    iget-object v5, v5, Ln6/d;->a:Ln6/a;

    iput-object v5, v9, Ln6/j;->b:Ln6/r;

    iput v8, v9, Ln6/j;->d:I

    iput-object v7, v9, Ln6/j;->c:Ljava/lang/Float;

    goto :goto_3

    :cond_5
    instance-of v9, v5, Ln6/c;

    if-eqz v9, :cond_6

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    :goto_2
    move-object v9, v7

    :goto_3
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    new-instance v10, Lp0/w0;

    invoke-direct {v10, v8}, Lp0/w0;-><init>(I)V

    invoke-interface {v4, v5, v10}, Ln6/o;->a(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    if-le v5, v1, :cond_8

    const-string v5, "GlanceAppWidget"

    const-string v8, "More than one clickable defined on the same GlanceModifier, only the last one will be used."

    invoke-static {v5, v8}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_8
    sget-object v5, Lp6/i1;->z:Lp6/i1;

    invoke-interface {v4, v5}, Ln6/o;->c(Lkotlin/jvm/functions/Function1;)Z

    move-result v5

    if-eqz v5, :cond_9

    new-instance v5, Ll83/k;

    invoke-direct {v5, v7, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v8, Lp6/b1;->Q:Lp6/b1;

    invoke-interface {v4, v5, v8}, Ln6/o;->a(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll83/k;

    goto :goto_4

    :cond_9
    new-instance v5, Ll83/k;

    invoke-direct {v5, v7, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v4, v5

    :goto_4
    iget-object v5, v4, Ll83/k;->w:Ljava/lang/Object;

    check-cast v5, Lo6/b;

    iget-object v4, v4, Ll83/k;->x:Ljava/lang/Object;

    check-cast v4, Ln6/o;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v5, :cond_a

    new-instance v5, Ln6/a;

    const v8, 0x7f08046e

    invoke-direct {v5, v8}, Ln6/a;-><init>(I)V

    new-instance v8, Ln6/j;

    invoke-direct {v8}, Ln6/j;-><init>()V

    invoke-static {v6}, Ls2/d;->k(Ln6/o;)Ln6/o;

    move-result-object v6

    iput-object v6, v8, Ln6/j;->a:Ln6/o;

    iput-object v5, v8, Ln6/j;->b:Ln6/r;

    goto :goto_5

    :cond_a
    move-object v8, v7

    :goto_5
    new-instance v5, Lp6/h1;

    invoke-direct {v5, v3}, Lp6/h1;-><init>(I)V

    invoke-interface {v4, v5}, Ln6/o;->c(Lkotlin/jvm/functions/Function1;)Z

    move-result v3

    if-eqz v3, :cond_b

    new-instance v1, Lp6/y;

    const/4 v3, 0x3

    invoke-direct {v1, v7, v3}, Lp6/y;-><init>(Ln6/o;I)V

    new-instance v5, Lp0/w0;

    invoke-direct {v5, v3}, Lp0/w0;-><init>(I)V

    invoke-interface {v4, v1, v5}, Ln6/o;->a(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp6/y;

    goto :goto_6

    :cond_b
    new-instance v3, Lp6/y;

    invoke-direct {v3, v4, v1}, Lp6/y;-><init>(Ln6/o;I)V

    move-object v1, v3

    :goto_6
    iget-object v3, v1, Lp6/y;->a:Ln6/o;

    iget-object v1, v1, Lp6/y;->b:Ln6/o;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v1}, Ls2/d;->k(Ln6/o;)Ln6/o;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lv6/j;

    invoke-direct {v1}, Lv6/j;-><init>()V

    invoke-static {v0}, Lbi/g;->n(Ljava/util/ArrayList;)Ln6/o;

    move-result-object v0

    iput-object v0, v1, Lv6/j;->c:Ln6/o;

    invoke-static {v2}, Lbi/g;->n(Ljava/util/ArrayList;)Ln6/o;

    move-result-object v0

    invoke-interface {p1, v0}, Ln6/i;->b(Ln6/o;)V

    iget-object v0, v1, Ln6/k;->b:Ljava/util/ArrayList;

    if-eqz v9, :cond_c

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_c
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v8, :cond_d

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_d
    move-object p1, v1

    :goto_7
    return-object p1

    :pswitch_1
    check-cast p1, Lr6/a;

    sget v0, Landroidx/glance/appwidget/MyPackageReplacedReceiver;->a:I

    invoke-static {}, Lr6/g;->n()Lr6/f;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/glance/appwidget/protobuf/y;->a()Landroidx/glance/appwidget/protobuf/a0;

    move-result-object v0

    check-cast v0, Lr6/g;

    invoke-virtual {p1}, Landroidx/glance/appwidget/protobuf/y;->c()V

    iget-object p1, p1, Landroidx/glance/appwidget/protobuf/y;->x:Landroidx/glance/appwidget/protobuf/a0;

    check-cast p1, Lr6/n;

    invoke-static {p1, v0}, Lr6/n;->s(Lr6/n;Lr6/g;)V

    return-object v2

    :pswitch_2
    check-cast p1, Ln6/n;

    sget-object p1, Lp6/c1;->a:Ljava/lang/Object;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_3
    check-cast p1, Ly3/h;

    iget-wide v0, p1, Ly3/h;->a:J

    invoke-static {v0, v1}, Ly3/h;->c(J)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ly3/h;

    iget-wide v0, p1, Ly3/h;->a:J

    invoke-static {v0, v1}, Ly3/h;->c(J)F

    move-result v0

    iget-wide v1, p1, Ly3/h;->a:J

    invoke-static {v1, v2}, Ly3/h;->b(J)F

    move-result p1

    mul-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-static {p1}, Lp50/b;->a(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lc0/q;

    invoke-static {p1}, Lp41/c;->d(Lc0/q;)Lc0/l0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Ll3/r0;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v2

    :pswitch_8
    check-cast p1, Li3/z;

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v2

    :pswitch_9
    check-cast p1, Lkd1/l;

    invoke-static {p1}, Lp31/f;->b(Lkd1/l;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    invoke-static {p1}, Lnh3/a;->d(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1

    :pswitch_b
    check-cast p1, Ltw0/c;

    invoke-static {p1}, Lp12/x;->p(Ltw0/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {p1}, Lp12/x;->s(F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lp12/g;

    invoke-static {p1}, Lp12/x;->m(Lp12/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    invoke-static {p1}, Lp11/e;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Landroid/app/NotificationChannel;

    invoke-static {p1}, Lcom/whoop/workmanager/PushNotificationPermissionStatusWorker;->k(Landroid/app/NotificationChannel;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    :pswitch_10
    invoke-static {p1}, Loz0/b;->c(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;

    invoke-static {p1}, Loy2/e;->q(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;)Loy2/b;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Loy2/b$c;

    invoke-static {p1}, Loy2/e;->p(Loy2/b$c;)Loy2/b$c;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Loy2/b$c;

    invoke-static {p1}, Loy2/e;->f(Loy2/b$c;)Loy2/b$c;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Loy2/b$c;

    invoke-static {p1}, Loy2/e;->i(Loy2/b$c;)Loy2/b$c;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;

    invoke-static {p1}, Loy2/e;->r(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;)Loy2/b;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;

    invoke-static {p1}, Loy2/e;->a(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;)Loy2/b;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lmh/h;

    invoke-static {p1}, Lox2/h;->t(Lmh/h;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lk2/c;

    invoke-static {p1}, Lox2/h;->h(Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lkw2/b;

    invoke-static {p1}, Low2/f;->j(Lkw2/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Llw2/a;

    invoke-static {p1}, Low2/f;->h(Llw2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lcom/whoop/analytics/AnalyticEventModel;

    invoke-static {p1}, Lcom/whoop/core/details/view/a;->j(Lcom/whoop/analytics/AnalyticEventModel;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    invoke-static {p1}, Lov2/g;->b(Ljava/lang/Object;)Ll83/a0;

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
