.class public final synthetic Lam2/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V
    .locals 0

    .line 1
    iput p4, p0, Lam2/i0;->w:I

    iput-object p1, p0, Lam2/i0;->y:Ljava/lang/Object;

    iput-object p2, p0, Lam2/i0;->z:Ljava/lang/Object;

    iput-boolean p3, p0, Lam2/i0;->x:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZLjava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, Lam2/i0;->w:I

    iput-object p1, p0, Lam2/i0;->y:Ljava/lang/Object;

    iput-boolean p2, p0, Lam2/i0;->x:Z

    iput-object p3, p0, Lam2/i0;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lrv2/h$b;Lkotlin/jvm/functions/Function1;Z)V
    .locals 1

    .line 3
    const/16 v0, 0xc

    iput v0, p0, Lam2/i0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lam2/i0;->z:Ljava/lang/Object;

    iput-object p2, p0, Lam2/i0;->y:Ljava/lang/Object;

    iput-boolean p3, p0, Lam2/i0;->x:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 4
    iput p4, p0, Lam2/i0;->w:I

    iput-boolean p1, p0, Lam2/i0;->x:Z

    iput-object p2, p0, Lam2/i0;->y:Ljava/lang/Object;

    iput-object p3, p0, Lam2/i0;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lam2/i0;->w:I

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    iget-boolean v7, p0, Lam2/i0;->x:Z

    iget-object v8, p0, Lam2/i0;->z:Ljava/lang/Object;

    iget-object v9, p0, Lam2/i0;->y:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v9, Lol0/b;

    check-cast v8, Ljava/lang/String;

    check-cast p1, Lih0/b;

    invoke-static {v9, v8, v7, p1}, Lvl0/d;->g(Lol0/b;Ljava/lang/String;ZLih0/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast v9, Lh91/b;

    check-cast v8, Ljava/lang/Integer;

    check-cast p1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CalendarTileModel;

    invoke-static {v9, v8, v7, p1}, Lto1/l;->j(Lh91/b;Ljava/lang/Integer;ZLcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CalendarTileModel;)Lso1/b;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast v8, Lrv2/h$b;

    check-cast v9, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    invoke-static {v8, v9, v7, p1}, Lsv2/e;->P(Lrv2/h$b;Lkotlin/jvm/functions/Function1;ZLn0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast v9, Lq0/y;

    check-cast v8, Lbc3/c0;

    check-cast p1, Li3/z;

    if-eqz v7, :cond_0

    new-instance v0, Lq0/l;

    invoke-direct {v0, v8, v9, v4}, Lq0/l;-><init>(Lbc3/c0;Lq0/y;I)V

    sget-object v1, Li3/w;->a:[Lj93/z;

    sget-object v1, Li3/k;->x:Li3/y;

    new-instance v2, Li3/a;

    invoke-direct {v2, v5, v0}, Li3/a;-><init>(Ljava/lang/String;Ll83/e;)V

    check-cast p1, Li3/l;

    invoke-virtual {p1, v1, v2}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    new-instance v0, Lq0/l;

    invoke-direct {v0, v8, v9, v3}, Lq0/l;-><init>(Lbc3/c0;Lq0/y;I)V

    sget-object v1, Li3/k;->z:Li3/y;

    new-instance v2, Li3/a;

    invoke-direct {v2, v5, v0}, Li3/a;-><init>(Ljava/lang/String;Ll83/e;)V

    invoke-virtual {p1, v1, v2}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lq0/l;

    invoke-direct {v0, v8, v9, v2}, Lq0/l;-><init>(Lbc3/c0;Lq0/y;I)V

    sget-object v2, Li3/w;->a:[Lj93/z;

    sget-object v2, Li3/k;->y:Li3/y;

    new-instance v3, Li3/a;

    invoke-direct {v3, v5, v0}, Li3/a;-><init>(Ljava/lang/String;Ll83/e;)V

    check-cast p1, Li3/l;

    invoke-virtual {p1, v2, v3}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    new-instance v0, Lq0/l;

    invoke-direct {v0, v8, v9, v1}, Lq0/l;-><init>(Lbc3/c0;Lq0/y;I)V

    sget-object v1, Li3/k;->A:Li3/y;

    new-instance v2, Li3/a;

    invoke-direct {v2, v5, v0}, Li3/a;-><init>(Ljava/lang/String;Ll83/e;)V

    invoke-virtual {p1, v1, v2}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    :goto_0
    return-object v6

    :pswitch_3
    check-cast v9, Lc93/a;

    check-cast v8, Landroid/content/Context;

    check-cast p1, Ljava/util/List;

    const-string v0, "annotatedStringRanges"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v7, :cond_1

    invoke-interface {v9}, Lc93/a;->invoke()Ljava/lang/Object;

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll3/e;

    if-eqz p1, :cond_1

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Ll3/e;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    invoke-virtual {v8, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_1
    return-object v6

    :pswitch_4
    check-cast v9, Leb/u0;

    check-cast v8, Ll83/h;

    check-cast p1, Ljv2/a;

    invoke-static {v9, v7, v8, p1}, Lkv2/b;->k(Leb/u0;ZLl83/h;Ljv2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast v9, Lbc3/c0;

    check-cast v8, Lr0/a;

    check-cast p1, Lg2/v;

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lg2/w;

    invoke-virtual {p1}, Lg2/w;->a()Z

    move-result p1

    if-eqz p1, :cond_2

    if-eqz v7, :cond_2

    new-instance p1, Lg40/e2;

    invoke-direct {p1, v8, v5, v3}, Lg40/e2;-><init>(Lr0/a;Lq83/d;I)V

    invoke-static {v9, v5, v5, p1, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_2
    return-object v6

    :pswitch_6
    check-cast v9, Lkotlin/jvm/functions/Function1;

    check-cast v8, Lp1/c1;

    check-cast p1, Lg2/v;

    invoke-static {v7, v9, v8, p1}, Lhy0/v0;->i(ZLkotlin/jvm/functions/Function1;Lp1/c1;Lg2/v;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast v9, Landroid/content/Context;

    check-cast v8, Lp1/t2;

    check-cast p1, Li3/z;

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzy/c;

    invoke-interface {v0, v9}, Lzy/c;->M(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    if-nez v7, :cond_3

    new-instance v0, Ll3/g;

    const-string v1, ""

    const/4 v2, 0x6

    invoke-direct {v0, v2, v1, v5}, Ll3/g;-><init>(ILjava/lang/String;Ljava/util/ArrayList;)V

    sget-object v1, Li3/u;->E:Li3/y;

    sget-object v2, Li3/w;->a:[Lj93/z;

    const/16 v3, 0x12

    aget-object v2, v2, v3

    invoke-virtual {v1, p1, v0}, Li3/y;->a(Li3/z;Ljava/lang/Object;)V

    :cond_3
    return-object v6

    :pswitch_8
    check-cast v9, Ljava/lang/String;

    check-cast v8, Lg1/l6;

    check-cast p1, Li3/z;

    if-eqz v7, :cond_4

    invoke-static {p1, v4}, Li3/w;->f(Li3/z;I)V

    :cond_4
    invoke-static {v9, p1}, Li3/w;->g(Ljava/lang/String;Li3/z;)V

    new-instance v0, Lg1/i6;

    invoke-direct {v0, v8, v4}, Lg1/i6;-><init>(Lg1/l6;I)V

    sget-object v1, Li3/k;->u:Li3/y;

    new-instance v2, Li3/a;

    invoke-direct {v2, v5, v0}, Li3/a;-><init>(Ljava/lang/String;Ll83/e;)V

    check-cast p1, Li3/l;

    invoke-virtual {p1, v1, v2}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    return-object v6

    :pswitch_9
    check-cast v9, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;

    check-cast v8, Ljava/util/List;

    check-cast p1, Lq83/d;

    invoke-static {v9, v7, v8, p1}, Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;->g(Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao_Impl;ZLjava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast v9, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;

    check-cast v8, Ljava/util/List;

    check-cast p1, Lq83/d;

    invoke-static {v9, v7, v8, p1}, Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;->b(Lcom/whoop/data/local/room/dao/wipeable/MemberStoryDao_Impl;ZLjava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast v9, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;

    check-cast v8, Ljava/util/List;

    check-cast p1, Lq83/d;

    invoke-static {v9, v7, v8, p1}, Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;->h(Lcom/whoop/data/local/room/dao/wipeable/FeatureTeamDao_Impl;ZLjava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast v9, Ljava/lang/Integer;

    check-cast v8, Lc93/a;

    check-cast p1, Lcom/google/android/gms/wallet/button/PayButton;

    const-string v0, "button"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v2}, Lx30/s0;->y(Landroid/view/ViewGroup;I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_6

    if-eqz v9, :cond_5

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_1

    :cond_5
    invoke-virtual {v0}, Landroid/view/View;->getMinimumHeight()I

    move-result v1

    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setMinimumHeight(I)V

    :cond_6
    if-eqz v7, :cond_7

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_2

    :cond_7
    const/high16 v0, 0x3f000000    # 0.5f

    :goto_2
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {p1, v7}, Landroid/view/View;->setEnabled(Z)V

    if-eqz v7, :cond_8

    new-instance v0, Lb30/q1;

    invoke-direct {v0, v8, v4}, Lb30/q1;-><init>(Lc93/a;I)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/wallet/button/PayButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_3

    :cond_8
    invoke-virtual {p1, v5}, Lcom/google/android/gms/wallet/button/PayButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_3
    return-object v6

    :pswitch_d
    check-cast v9, Lkotlin/jvm/functions/Function1;

    check-cast v8, Lam2/p0;

    invoke-static {v9, v8, v7, p1}, Lam2/o0;->p(Lkotlin/jvm/functions/Function1;Lam2/p0;ZLjava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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
