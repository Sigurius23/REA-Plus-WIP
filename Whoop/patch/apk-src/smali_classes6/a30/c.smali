.class public final La30/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/d;


# instance fields
.field public final synthetic w:I

.field public final x:Lv03/h;

.field public final y:Lv03/h;

.field public final z:Lv03/h;


# direct methods
.method public synthetic constructor <init>(Lv03/h;Lv03/h;Lv03/h;I)V
    .locals 0

    iput p4, p0, La30/c;->w:I

    iput-object p1, p0, La30/c;->x:Lv03/h;

    iput-object p2, p0, La30/c;->y:Lv03/h;

    iput-object p3, p0, La30/c;->z:Lv03/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lny/d;Lny/d;Lb20/f;Landroid/content/Context;Lq83/j;)Lny/h;
    .locals 1

    const-string v0, "isStripeTerminalSdkAvailable"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "terminalWrapper"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "errorReporter"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "applicationContext"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "workContext"

    invoke-static {p4, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lny/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-object p0
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 7

    iget v0, p0, La30/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La30/c;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyy/j;

    iget-object v1, p0, La30/c;->y:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lyy/c;

    iget-object v2, p0, La30/c;->z:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbz/c;

    const-string v3, "analyticsRequestExecutor"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "analyticsRequestFactory"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "durationProvider"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lq30/w0;

    invoke-direct {v3, v0, v1, v2}, Lq30/w0;-><init>(Lyy/j;Lyy/c;Lbz/c;)V

    return-object v3

    :pswitch_0
    iget-object v0, p0, La30/c;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, La30/c;->y:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lqy/d;

    iget-object v2, p0, La30/c;->z:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb20/f;

    new-instance v3, Ltz/a;

    invoke-direct {v3, v0, v1, v2}, Ltz/a;-><init>(Landroid/content/Context;Lqy/d;Lb20/f;)V

    return-object v3

    :pswitch_1
    iget-object v0, p0, La30/c;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxz/n0;

    iget-object v1, p0, La30/c;->y:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwz/l1;

    iget-object v2, p0, La30/c;->z:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln20/c;

    const-string v3, "linkStore"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "linkConfigurationCoordinator"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "linkAnalyticsComponentFactory"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ln20/c;->a()Ln10/n0;

    move-result-object v2

    invoke-virtual {v2}, Ln10/n0;->a()Lyz/a;

    move-result-object v2

    new-instance v3, Li10/a;

    invoke-direct {v3, v1, v2, v0}, Li10/a;-><init>(Lwz/l1;Lyz/a;Lxz/n0;)V

    return-object v3

    :pswitch_2
    iget-object v0, p0, La30/c;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwz/r0;

    iget-object v1, p0, La30/c;->y:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxz/n0;

    iget-object v2, p0, La30/c;->z:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lxz/f0;

    new-instance v3, Li10/a;

    invoke-direct {v3, v0, v1, v2}, Li10/a;-><init>(Lwz/r0;Lxz/n0;Lxz/f0;)V

    return-object v3

    :pswitch_3
    new-instance v0, Lny/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lny/d;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget-object v2, p0, La30/c;->x:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb20/f;

    iget-object v3, p0, La30/c;->y:Lv03/h;

    invoke-interface {v3}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Context;

    iget-object v4, p0, La30/c;->z:Lv03/h;

    invoke-interface {v4}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lq83/j;

    invoke-static {v0, v1, v2, v3, v4}, La30/c;->a(Lny/d;Lny/d;Lb20/f;Landroid/content/Context;Lq83/j;)Lny/h;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, La30/c;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb20/f;

    new-instance v1, Lay/y;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget-object v2, p0, La30/c;->y:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc93/a;

    iget-object v3, p0, La30/c;->z:Lv03/h;

    invoke-interface {v3}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Set;

    new-instance v4, Lh10/a;

    invoke-direct {v4, v0, v1, v2, v3}, Lh10/a;-><init>(Lb20/f;Lay/y;Lc93/a;Ljava/util/Set;)V

    return-object v4

    :pswitch_5
    iget-object v0, p0, La30/c;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, La30/c;->y:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq83/j;

    iget-object v2, p0, La30/c;->z:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqy/d;

    const-string v3, "application"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "coroutineContext"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "logger"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lyy/n;

    new-instance v4, Lab/i0;

    const/16 v5, 0xe

    invoke-direct {v4, v1, v2, v5}, Lab/i0;-><init>(Lq83/j;Lqy/d;I)V

    new-instance v1, Lq30/w0;

    invoke-direct {v1, v0}, Lq30/w0;-><init>(Landroid/content/Context;)V

    invoke-direct {v3, v0, v4, v2, v1}, Lyy/n;-><init>(Landroid/content/Context;Lab/i0;Lqy/d;Lq30/w0;)V

    return-object v3

    :pswitch_6
    iget-object v0, p0, La30/c;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, La30/c;->y:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc93/a;

    iget-object v2, p0, La30/c;->z:Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Set;

    new-instance v3, Lb10/b;

    invoke-direct {v3, v0, v2, v1}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    return-object v3

    :pswitch_7
    iget-object v0, p0, La30/c;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, La30/g;

    iget-object v0, p0, La30/c;->y:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, La30/e0;

    iget-object v0, p0, La30/c;->z:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lxz/n0;

    new-instance v5, Lu00/e;

    const/16 v0, 0xb

    invoke-direct {v5, v0}, Lu00/e;-><init>(I)V

    new-instance v6, Lt9/p;

    const/16 v0, 0x8

    invoke-direct {v6, v0}, Lt9/p;-><init>(I)V

    new-instance v1, La30/f;

    invoke-direct/range {v1 .. v6}, La30/f;-><init>(La30/g;La30/e0;Lxz/n0;Lu00/e;Lt9/p;)V

    return-object v1

    :pswitch_8
    iget-object v0, p0, La30/c;->x:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll20/a;

    iget-object v1, p0, La30/c;->y:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    new-instance v2, Lu00/e;

    const/16 v3, 0xb

    invoke-direct {v2, v3}, Lu00/e;-><init>(I)V

    new-instance v3, La00/g;

    iget-object v4, p0, La30/c;->z:Lv03/h;

    invoke-direct {v3, v0, v1, v4, v2}, La00/g;-><init>(Ll20/a;Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lk83/a;Lu00/e;)V

    return-object v3

    :pswitch_data_0
    .packed-switch 0x0
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
