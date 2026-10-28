.class public final Lg10/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le10/j;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/stripe/android/shoppay/ShopPayActivityContract;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lg10/a;->a:I

    const-string v0, "shopPayActivityContract"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lg10/a;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lv20/v;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lg10/a;->a:I

    const-string v0, "bacsMandateConfirmationLauncherFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lg10/a;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lxz/x;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lg10/a;->a:I

    const-string v0, "linkAccountManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lg10/a;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Le10/l;Le10/k;)V
    .locals 6

    iget v0, p0, Lg10/a;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lj/d;

    check-cast p2, Ll83/a0;

    check-cast p3, Lq10/a;

    const-string p2, "confirmationOption"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "confirmationArgs"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lh30/e;

    iget-object p4, p4, Le10/k;->x:Lv00/c0;

    iget-object v0, p3, Lq10/a;->w:Lh20/g3;

    iget-object v1, p3, Lq10/a;->x:Ljava/lang/String;

    iget-object v2, p4, Lv00/c0;->J:Ljava/lang/String;

    if-nez v2, :cond_0

    iget-object v2, p3, Lq10/a;->y:Ljava/lang/String;

    :cond_0
    invoke-direct {p2, p4, v0, v1, v2}, Lh30/e;-><init>(Lv00/c0;Lh20/g3;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void

    :pswitch_0
    check-cast p1, Lo10/b;

    check-cast p2, Lo10/c;

    check-cast p3, Lo10/g;

    const-string v0, "confirmationOption"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "confirmationArgs"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lo10/b;->a:Lcom/whoop/profile/view/edit/n;

    new-instance p3, Lo10/d;

    iget-object p2, p2, Lo10/c;->a:Le10/v0;

    invoke-direct {p3, p2}, Lo10/d;-><init>(Le10/v0;)V

    invoke-virtual {p1, p3}, Lcom/whoop/profile/view/edit/n;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_1
    check-cast p1, Lv20/u;

    check-cast p2, Lv20/t;

    check-cast p3, Lg10/b;

    const-string v0, "confirmationOption"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "confirmationArgs"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p4, Le10/k;->x:Lv00/c0;

    iget-object v5, p3, Lv00/c0;->f0:Lh20/h1;

    const-string p3, "appearance"

    invoke-static {v5, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lv20/u;->a:Lj/d;

    new-instance v0, Lv20/f;

    iget-object v1, p2, Lv20/t;->b:Ljava/lang/String;

    iget-object v2, p2, Lv20/t;->a:Ljava/lang/String;

    iget-object v3, p2, Lv20/t;->d:Ljava/lang/String;

    iget-object v4, p2, Lv20/t;->c:Ljava/lang/String;

    invoke-direct/range {v0 .. v5}, Lv20/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh20/h1;)V

    const/4 p2, 0x0

    invoke-virtual {p1, v0, p2}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Le10/l;)Le10/l;
    .locals 1

    iget v0, p0, Lg10/a;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "confirmationOption"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lq10/a;

    if-eqz v0, :cond_0

    check-cast p1, Lq10/a;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1

    :pswitch_0
    const-string v0, "confirmationOption"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lo10/g;

    if-eqz v0, :cond_1

    check-cast p1, Lo10/g;

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return-object p1

    :pswitch_1
    const-string v0, "confirmationOption"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lg10/b;

    if-eqz v0, :cond_2

    check-cast p1, Lg10/b;

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Le10/l;Le10/k;)Z
    .locals 1

    iget v0, p0, Lg10/a;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lq10/a;

    invoke-static {p1, p2}, Lds/p;->u(Le10/l;Le10/k;)V

    :goto_0
    const/4 p1, 0x1

    return p1

    :pswitch_0
    check-cast p1, Lo10/g;

    invoke-static {p1, p2}, Lds/p;->u(Le10/l;Le10/k;)V

    goto :goto_0

    :pswitch_1
    check-cast p1, Lg10/b;

    invoke-static {p1, p2}, Lds/p;->u(Le10/l;Le10/k;)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Lv00/c0;)V
    .locals 1

    iget v0, p0, Lg10/a;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Lds/p;->t(Lv00/c0;)V

    return-void

    :pswitch_0
    invoke-static {p1}, Lds/p;->t(Lv00/c0;)V

    return-void

    :pswitch_1
    invoke-static {p1}, Lds/p;->t(Lv00/c0;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Le10/l;Le10/k;Le10/h0;)Ljava/lang/Object;
    .locals 4

    iget p2, p0, Lg10/a;->a:I

    const/4 v0, 0x0

    packed-switch p2, :pswitch_data_0

    check-cast p1, Lq10/a;

    new-instance p1, Le10/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    const/4 p3, 0x0

    invoke-direct {p1, p2, p3, v0}, Le10/c;-><init>(Ljava/lang/Object;ZLn10/c0;)V

    return-object p1

    :pswitch_0
    check-cast p1, Lo10/g;

    invoke-virtual {p0, p1, p3}, Lg10/a;->i(Lo10/g;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lg10/b;

    iget-object p1, p1, Lg10/b;->w:Ly00/d5;

    const-string p2, "params"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p1, Ly00/d5;->V:Ljava/util/Map;

    iget-object p3, p1, Ly00/d5;->P:Ly00/v3;

    sget-object v1, Ly00/f4;->G:Lt9/c0;

    invoke-virtual {p1}, Ly00/d5;->c0()Ljava/util/Map;

    move-result-object p1

    check-cast p1, Ljava/util/LinkedHashMap;

    const-string v1, "bacs_debit"

    invoke-virtual {p1, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Ljava/util/Map;

    if-eqz v1, :cond_0

    check-cast p1, Ljava/util/Map;

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_1

    const-string v1, "account_number"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v0

    :goto_1
    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_2

    check-cast v1, Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object v1, v0

    :goto_2
    if-eqz p1, :cond_3

    const-string v2, "sort_code"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_3

    :cond_3
    move-object p1, v0

    :goto_3
    instance-of v2, p1, Ljava/lang/String;

    if-eqz v2, :cond_4

    check-cast p1, Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object p1, v0

    :goto_4
    if-eqz v1, :cond_5

    if-eqz p1, :cond_5

    new-instance v2, Ly00/q4;

    invoke-direct {v2, v1, p1}, Ly00/q4;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :cond_5
    move-object v2, v0

    :goto_5
    const-string p1, "billing_details"

    if-eqz p3, :cond_6

    iget-object v1, p3, Ly00/v3;->y:Ljava/lang/String;

    if-nez v1, :cond_b

    :cond_6
    if-eqz p2, :cond_7

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_6

    :cond_7
    move-object v1, v0

    :goto_6
    instance-of v3, v1, Ljava/util/Map;

    if-eqz v3, :cond_8

    check-cast v1, Ljava/util/Map;

    goto :goto_7

    :cond_8
    move-object v1, v0

    :goto_7
    if-eqz v1, :cond_9

    const-string v3, "name"

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_8

    :cond_9
    move-object v1, v0

    :goto_8
    instance-of v3, v1, Ljava/lang/String;

    if-eqz v3, :cond_a

    check-cast v1, Ljava/lang/String;

    goto :goto_9

    :cond_a
    move-object v1, v0

    :cond_b
    :goto_9
    if-eqz p3, :cond_c

    iget-object p3, p3, Ly00/v3;->x:Ljava/lang/String;

    if-nez p3, :cond_11

    :cond_c
    if-eqz p2, :cond_d

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_a

    :cond_d
    move-object p1, v0

    :goto_a
    instance-of p2, p1, Ljava/util/Map;

    if-eqz p2, :cond_e

    check-cast p1, Ljava/util/Map;

    goto :goto_b

    :cond_e
    move-object p1, v0

    :goto_b
    if-eqz p1, :cond_f

    const-string p2, "email"

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_c

    :cond_f
    move-object p1, v0

    :goto_c
    instance-of p2, p1, Ljava/lang/String;

    if-eqz p2, :cond_10

    check-cast p1, Ljava/lang/String;

    move-object p3, p1

    goto :goto_d

    :cond_10
    move-object p3, v0

    :cond_11
    :goto_d
    if-eqz v2, :cond_12

    if-eqz v1, :cond_12

    if-eqz p3, :cond_12

    new-instance p1, Lv20/t;

    iget-object p2, v2, Ly00/q4;->w:Ljava/lang/String;

    iget-object v2, v2, Ly00/q4;->x:Ljava/lang/String;

    invoke-direct {p1, v1, p3, p2, v2}, Lv20/t;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_e

    :cond_12
    move-object p1, v0

    :goto_e
    if-eqz p1, :cond_13

    new-instance p2, Le10/c;

    const/4 p3, 0x1

    invoke-direct {p2, p1, p3, v0}, Le10/c;-><init>(Ljava/lang/Object;ZLn10/c0;)V

    goto :goto_f

    :cond_13
    new-instance p2, Le10/b;

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p3, "Given confirmation option does not have expected Bacs data!"

    invoke-direct {p1, p3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    const p3, 0x7f1410f2

    invoke-static {p3}, Ls4/i;->h(I)Lzy/b;

    move-result-object p3

    sget-object v0, Le10/r;->a:Le10/r;

    invoke-direct {p2, p1, p3, v0}, Le10/b;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    :goto_f
    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Le10/l;Le10/k;Ln10/c0;Landroid/os/Parcelable;)Le10/i;
    .locals 1

    iget v0, p0, Lg10/a;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lq10/a;

    check-cast p4, Lh30/i;

    const-string v0, "confirmationOption"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "confirmationArgs"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "result"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lh30/f;->w:Lh30/f;

    invoke-virtual {p4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Le10/e;

    sget-object p2, Le10/m;->y:Le10/m;

    invoke-direct {p1, p2}, Le10/e;-><init>(Le10/m;)V

    goto :goto_0

    :cond_0
    instance-of p1, p4, Lh30/g;

    if-eqz p1, :cond_1

    new-instance p1, Le10/h;

    iget-object p2, p2, Le10/k;->y:Ly00/c8;

    const/4 p4, 0x0

    invoke-direct {p1, p2, p3, p4}, Le10/h;-><init>(Ly00/c8;Ln10/c0;Z)V

    goto :goto_0

    :cond_1
    instance-of p1, p4, Lh30/h;

    if-eqz p1, :cond_3

    new-instance p1, Le10/f;

    check-cast p4, Lh30/h;

    iget-object p2, p4, Lh30/h;->w:Ljava/lang/Throwable;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_2

    const-string p3, ""

    :cond_2
    invoke-static {p3}, Ls4/i;->i(Ljava/lang/String;)Lzy/d;

    move-result-object p3

    sget-object p4, Le10/t;->a:Le10/t;

    invoke-direct {p1, p2, p3, p4}, Le10/f;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    :goto_0
    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    check-cast p1, Lo10/g;

    check-cast p4, Lo10/d;

    const-string p3, "confirmationOption"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "confirmationArgs"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "result"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Le10/g;

    iget-object p3, p4, Lo10/d;->w:Le10/v0;

    invoke-direct {p1, p3, p2}, Le10/g;-><init>(Le10/v0;Le10/k;)V

    return-object p1

    :pswitch_1
    check-cast p1, Lg10/b;

    check-cast p4, Lv20/k;

    const-string p3, "confirmationOption"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "confirmationArgs"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "result"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p3, p4, Lv20/i;

    if-eqz p3, :cond_4

    new-instance p3, Le10/t0;

    iget-object p1, p1, Lg10/b;->w:Ly00/d5;

    const/4 p4, 0x0

    const/4 v0, 0x0

    invoke-direct {p3, p1, v0, v0, p4}, Le10/t0;-><init>(Ly00/d5;Ly00/u5;Ly00/j5;Z)V

    new-instance p1, Le10/g;

    invoke-direct {p1, p3, p2}, Le10/g;-><init>(Le10/v0;Le10/k;)V

    goto :goto_1

    :cond_4
    instance-of p1, p4, Lv20/j;

    if-eqz p1, :cond_5

    new-instance p1, Le10/e;

    sget-object p2, Le10/m;->x:Le10/m;

    invoke-direct {p1, p2}, Le10/e;-><init>(Le10/m;)V

    goto :goto_1

    :cond_5
    instance-of p1, p4, Lv20/h;

    if-eqz p1, :cond_6

    new-instance p1, Le10/e;

    sget-object p2, Le10/m;->y:Le10/m;

    invoke-direct {p1, p2}, Le10/e;-><init>(Le10/m;)V

    :goto_1
    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Lj/c;Lcom/whoop/profile/view/edit/n;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lg10/a;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "activityResultCaller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg10/a;->b:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/shoppay/ShopPayActivityContract;

    new-instance v1, Lf10/a;

    const/16 v2, 0x8

    invoke-direct {v1, p2, v2}, Lf10/a;-><init>(Lcom/whoop/profile/view/edit/n;I)V

    invoke-interface {p1, v0, v1}, Lj/c;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object p1

    return-object p1

    :pswitch_0
    const-string v0, "activityResultCaller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lo10/b;

    invoke-direct {p1, p2}, Lo10/b;-><init>(Lcom/whoop/profile/view/edit/n;)V

    return-object p1

    :pswitch_1
    const-string v0, "activityResultCaller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg10/a;->b:Ljava/lang/Object;

    check-cast v0, Lv20/v;

    new-instance v1, Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationContract;

    invoke-direct {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationContract;-><init>()V

    new-instance v2, Lf10/a;

    const/4 v3, 0x1

    invoke-direct {v2, p2, v3}, Lf10/a;-><init>(Lcom/whoop/profile/view/edit/n;I)V

    invoke-interface {p1, v1, v2}, Lj/c;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p2, "activityResultLauncher"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lv20/u;

    invoke-direct {p2, p1}, Lv20/u;-><init>(Lj/d;)V

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lg10/a;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "ShopPay"

    return-object v0

    :pswitch_0
    const-string v0, "LinkPassthrough"

    return-object v0

    :pswitch_1
    const-string v0, "Bacs"

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic h(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lg10/a;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lj/d;

    return-void

    :pswitch_0
    check-cast p1, Lo10/b;

    return-void

    :pswitch_1
    check-cast p1, Lv20/u;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public i(Lo10/g;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lo10/e;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lo10/e;

    iget v1, v0, Lo10/e;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lo10/e;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lo10/e;

    invoke-direct {v0, p0, p2}, Lo10/e;-><init>(Lg10/a;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lo10/e;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lo10/e;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p1, p2, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, v0, Lo10/e;->y:I

    invoke-virtual {p0, p1, v0}, Lg10/a;->j(Lo10/g;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_4

    check-cast p1, Le10/v0;

    new-instance p2, Le10/c;

    new-instance v0, Lo10/c;

    invoke-direct {v0, p1}, Lo10/c;-><init>(Le10/v0;)V

    const/4 p1, 0x0

    invoke-direct {p2, v0, v3, p1}, Le10/c;-><init>(Ljava/lang/Object;ZLn10/c0;)V

    return-object p2

    :cond_4
    new-instance p1, Le10/b;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    sget-object v1, Lm83/y;->w:Lm83/y;

    const v2, 0x7f1410f2

    invoke-static {v2, v0, v1}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v0

    sget-object v1, Le10/r;->a:Le10/r;

    invoke-direct {p1, p2, v0, v1}, Le10/b;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    return-object p1
.end method

.method public j(Lo10/g;Ls83/c;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, Lo10/f;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lo10/f;

    iget v1, v0, Lo10/f;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lo10/f;->y:I

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lo10/f;

    invoke-direct {v0, p0, p2}, Lo10/f;-><init>(Lg10/a;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object p2, v7, Lo10/f;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v7, Lo10/f;->y:I

    const/4 v8, 0x0

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p1, p2, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lg10/a;->b:Ljava/lang/Object;

    move-object v1, p2

    check-cast v1, Lxz/x;

    move p2, v2

    iget-object v2, p1, Lo10/g;->w:Ljava/lang/String;

    iget-object v3, p1, Lo10/g;->x:Ljava/lang/String;

    iget-object v4, p1, Lo10/g;->z:Ljava/lang/String;

    iget-object v5, p1, Lo10/g;->y:Ljava/lang/String;

    iget-object p1, p1, Lo10/g;->E:Ly00/r3;

    if-eqz p1, :cond_3

    iget-object p1, p1, Ly00/r3;->w:Ljava/lang/String;

    move-object v6, p1

    goto :goto_2

    :cond_3
    move-object v6, v8

    :goto_2
    iput p2, v7, Lo10/f;->y:I

    invoke-virtual/range {v1 .. v7}, Lxz/x;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_3
    instance-of p2, p1, Ll83/m;

    if-nez p2, :cond_7

    :try_start_0
    check-cast p1, Ly00/h6;

    iget-object p1, p1, Ly00/h6;->x:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    new-instance p1, Lz00/a;

    const/16 v0, 0x1d

    invoke-direct {p1, v0}, Lz00/a;-><init>(I)V

    invoke-virtual {p1, p2}, Lz00/a;->d(Lorg/json/JSONObject;)Ly00/o4;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v0

    move-object p1, v0

    :try_start_2
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_4
    instance-of p2, p1, Ll83/m;

    if-eqz p2, :cond_5

    move-object p1, v8

    :cond_5
    check-cast p1, Ly00/o4;

    if-eqz p1, :cond_6

    goto :goto_5

    :cond_6
    const-string p1, "Required value was null."

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :cond_7
    :goto_5
    instance-of p2, p1, Ll83/m;

    if-nez p2, :cond_8

    check-cast p1, Ly00/o4;

    new-instance p2, Le10/u0;

    const/16 v0, 0x18

    invoke-direct {p2, p1, v8, v0}, Le10/u0;-><init>(Ly00/o4;Ly00/u5;I)V

    move-object p1, p2

    :cond_8
    return-object p1
.end method
