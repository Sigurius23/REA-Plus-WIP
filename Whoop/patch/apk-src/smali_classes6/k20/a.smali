.class public final Lk20/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv30/b;


# instance fields
.field public final a:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

.field public final b:Lyy/j;

.field public final c:Lyy/n;

.field public final d:Lb10/b;

.field public final e:Lbz/c;

.field public final f:Lv03/d;

.field public final g:Lq83/j;

.field public final h:Lbz/i;

.field public final i:Lk83/a;

.field public final j:Lq/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lyy/j;Lyy/n;Lb10/b;Lbz/c;Lv03/d;Lq83/j;Lbz/i;Lk83/a;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsRequestExecutor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsRequestV2Executor"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentAnalyticsRequestFactory"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "durationProvider"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodMetadataProvider"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lk20/a;->a:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    iput-object p3, p0, Lk20/a;->b:Lyy/j;

    iput-object p4, p0, Lk20/a;->c:Lyy/n;

    iput-object p5, p0, Lk20/a;->d:Lb10/b;

    iput-object p6, p0, Lk20/a;->e:Lbz/c;

    iput-object p7, p0, Lk20/a;->f:Lv03/d;

    iput-object p8, p0, Lk20/a;->g:Lq83/j;

    iput-object p9, p0, Lk20/a;->h:Lbz/i;

    iput-object p10, p0, Lk20/a;->i:Lk83/a;

    new-instance p2, Lq/f;

    invoke-direct {p2, p1}, Lq/f;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lk20/a;->j:Lq/f;

    return-void
.end method

.method public static synthetic i(Lk20/a;Lk20/t;)V
    .locals 1

    iget-object v0, p0, Lk20/a;->i:Lk83/a;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv00/c0;

    invoke-virtual {p0, p1, v0}, Lk20/a;->h(Lk20/t;Lv00/c0;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    sget-object v0, Lbz/b;->E:Lbz/b;

    iget-object v1, p0, Lk20/a;->e:Lbz/c;

    check-cast v1, Lbz/a;

    invoke-virtual {v1, v0}, Lbz/a;->a(Lbz/b;)Lkotlin/time/Duration;

    move-result-object v0

    new-instance v1, Lk20/n;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lk20/n;-><init>(Lkotlin/time/Duration;I)V

    invoke-static {p0, v1}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    return-void
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lk20/a;->e:Lbz/c;

    sget-object v1, Lbz/b;->E:Lbz/b;

    invoke-static {v0, v1}, Lvd/e;->f0(Lbz/c;Lbz/b;)V

    new-instance v0, Lk20/l;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lk20/l;-><init>(I)V

    invoke-static {p0, v0}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    return-void
.end method

.method public final c(Ljava/lang/Throwable;)V
    .locals 1

    new-instance v0, Lk20/j;

    invoke-direct {v0, p1}, Lk20/j;-><init>(Ljava/lang/Throwable;)V

    invoke-static {p0, v0}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v0, "Card scan check failed: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lk20/a;->h:Lbz/i;

    invoke-virtual {v0, p1}, Lbz/i;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final d(Ljava/lang/Throwable;)V
    .locals 3

    sget-object v0, Lbz/b;->E:Lbz/b;

    iget-object v1, p0, Lk20/a;->e:Lbz/c;

    check-cast v1, Lbz/a;

    invoke-virtual {v1, v0}, Lbz/a;->a(Lbz/b;)Lkotlin/time/Duration;

    move-result-object v0

    new-instance v1, Lk20/n;

    const/4 v2, 0x1

    invoke-direct {v1, v0, p1, v2}, Lk20/n;-><init>(Lkotlin/time/Duration;Ljava/lang/Throwable;I)V

    invoke-static {p0, v1}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    return-void
.end method

.method public final e()V
    .locals 2

    new-instance v0, Lk20/l;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lk20/l;-><init>(I)V

    invoke-static {p0, v0}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    return-void
.end method

.method public final f()V
    .locals 3

    sget-object v0, Lbz/b;->E:Lbz/b;

    iget-object v1, p0, Lk20/a;->e:Lbz/c;

    check-cast v1, Lbz/a;

    invoke-virtual {v1, v0}, Lbz/a;->a(Lbz/b;)Lkotlin/time/Duration;

    move-result-object v0

    new-instance v1, Lk20/n;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, Lk20/n;-><init>(Lkotlin/time/Duration;I)V

    invoke-static {p0, v1}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    return-void
.end method

.method public final g(Lx30/s0;)V
    .locals 4

    iget-object v0, p0, Lk20/a;->g:Lq83/j;

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    new-instance v1, Landroidx/room/e;

    const/16 v2, 0x11

    const/4 v3, 0x0

    invoke-direct {v1, p0, p1, v3, v2}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {v0, v3, v3, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final h(Lk20/t;Lv00/c0;)V
    .locals 7

    iget-object v0, p0, Lk20/a;->g:Lq83/j;

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    new-instance v1, Lay/u;

    const/16 v6, 0x8

    const/4 v5, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {v0, v5, v5, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final j(Ly00/i;)V
    .locals 2

    sget-object v0, Lk20/c;->w:[Lk20/c;

    const-string v0, "selectedBrand"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lk20/j;

    sget-object v1, Lk20/m;->x:Lk20/m;

    invoke-direct {v0, v1, p1}, Lk20/j;-><init>(Lk20/m;Ly00/i;)V

    invoke-static {p0, v0}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    return-void
.end method

.method public final k(Lhy/h;)V
    .locals 4

    new-instance v0, Lk20/n;

    invoke-direct {v0, p1}, Lk20/n;-><init>(Lhy/h;)V

    iget-object p1, p0, Lk20/a;->g:Lq83/j;

    invoke-static {p1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p1

    new-instance v1, Lh20/i0;

    const/16 v2, 0x10

    const/4 v3, 0x0

    invoke-direct {v1, p0, v0, v3, v2}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v0, 0x3

    invoke-static {p1, v3, v3, v1, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final l(Ljava/util/List;Ljava/util/List;La30/n1;Z)V
    .locals 4

    const-string v0, "visiblePaymentMethods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hiddenPaymentMethods"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    sget-object v1, La30/g1;->w:La30/g1;

    invoke-virtual {p3, v1}, La30/n1;->a(La30/g1;)La30/l1;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    iget-boolean v1, p3, La30/n1;->d:Z

    if-eqz v1, :cond_1

    move v1, v3

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    if-eqz p3, :cond_2

    sget-object v0, La30/g1;->w:La30/g1;

    invoke-virtual {p3, v0}, La30/n1;->b(La30/g1;)La30/m1;

    move-result-object v0

    :cond_2
    if-eqz v0, :cond_3

    iget-boolean p3, p3, La30/n1;->d:Z

    if-eqz p3, :cond_3

    move v2, v3

    :cond_3
    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object p3

    if-eqz v1, :cond_4

    const-string v0, "google_pay"

    invoke-virtual {p3, v0}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_4
    if-eqz v2, :cond_5

    const-string v0, "link"

    invoke-virtual {p3, v0}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_5
    check-cast p1, Ljava/util/Collection;

    invoke-virtual {p3, p1}, Ln83/c;->addAll(Ljava/util/Collection;)Z

    invoke-static {p3}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object p1

    new-instance p3, Lk20/o;

    invoke-direct {p3, p1, p2, p4}, Lk20/o;-><init>(Ln83/c;Ljava/util/List;Z)V

    invoke-static {p0, p3}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    return-void
.end method

.method public final m(Lq20/y;Lk20/h;)V
    .locals 9

    const-string v0, "paymentSelection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lbz/b;->x:Lbz/b;

    iget-object v1, p0, Lk20/a;->e:Lbz/c;

    check-cast v1, Lbz/a;

    invoke-virtual {v1, v0}, Lbz/a;->a(Lbz/b;)Lkotlin/time/Duration;

    move-result-object v5

    new-instance v4, Lk20/p;

    invoke-direct {v4, p2}, Lk20/p;-><init>(Lk20/h;)V

    new-instance v2, Lk20/s;

    const/4 v7, 0x0

    const/4 v8, 0x0

    iget-object v3, p0, Lk20/a;->a:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    move-object v6, p1

    invoke-direct/range {v2 .. v8}, Lk20/s;-><init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lk20/r;Lkotlin/time/Duration;Lq20/y;Ln10/c0;Ljava/lang/String;)V

    invoke-static {p0, v2}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    return-void
.end method

.method public final n(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Lc10/a;

    invoke-direct {v0, p1}, Lc10/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lk20/a;->g(Lx30/s0;)V

    new-instance v0, Lk20/l;

    const/4 v1, 0x5

    invoke-direct {v0, p1, v1}, Lk20/l;-><init>(Ljava/lang/String;I)V

    invoke-static {p0, v0}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    return-void
.end method

.method public final o(Ljava/lang/String;)V
    .locals 2

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lk20/a;->e:Lbz/c;

    sget-object v1, Lbz/b;->z:Lbz/b;

    invoke-static {v0, v1}, Lvd/e;->f0(Lbz/c;Lbz/b;)V

    new-instance v0, Lc10/b;

    invoke-direct {v0, p1}, Lc10/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lk20/a;->g(Lx30/s0;)V

    new-instance v0, Lk20/l;

    const/16 v1, 0x9

    invoke-direct {v0, p1, v1}, Lk20/l;-><init>(Ljava/lang/String;I)V

    invoke-static {p0, v0}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    return-void
.end method

.method public final p(Lq20/y;Ln10/c0;Ljava/lang/String;)V
    .locals 7

    const-string v0, "paymentSelection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lq20/w;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lq20/w;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, v0, Lq20/w;->y:Lq20/u;

    if-eqz v0, :cond_1

    iget-object p1, v0, Lq20/u;->w:Lq20/y;

    :cond_1
    move-object v4, p1

    sget-object p1, Lbz/b;->x:Lbz/b;

    iget-object v0, p0, Lk20/a;->e:Lbz/c;

    check-cast v0, Lbz/a;

    invoke-virtual {v0, p1}, Lbz/a;->a(Lbz/b;)Lkotlin/time/Duration;

    move-result-object v3

    new-instance v0, Lk20/s;

    iget-object v1, p0, Lk20/a;->a:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    sget-object v2, Lk20/q;->a:Lk20/q;

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v0 .. v6}, Lk20/s;-><init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lk20/r;Lkotlin/time/Duration;Lq20/y;Ln10/c0;Ljava/lang/String;)V

    invoke-static {p0, v0}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    return-void
.end method

.method public final q(Lq20/y;)V
    .locals 3

    sget-object v0, Lbz/b;->z:Lbz/b;

    iget-object v1, p0, Lk20/a;->e:Lbz/c;

    check-cast v1, Lbz/a;

    invoke-virtual {v1, v0}, Lbz/a;->a(Lbz/b;)Lkotlin/time/Duration;

    move-result-object v0

    new-instance v1, Lc10/h;

    invoke-static {p1}, Lk20/u;->a(Lq20/y;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lc10/h;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lk20/a;->g(Lx30/s0;)V

    new-instance v1, Lk20/l;

    invoke-static {p1}, Lk20/u;->a(Lq20/y;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lk20/u;->b(Lq20/y;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v0, v2, p1}, Lk20/l;-><init>(Lkotlin/time/Duration;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0, v1}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    return-void
.end method

.method public final r(Ljava/lang/String;)V
    .locals 3

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lc10/e;

    invoke-direct {v0, p1}, Lc10/e;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lk20/a;->g(Lx30/s0;)V

    new-instance v0, Lk20/j;

    const-string v1, "link"

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    iget-object v1, p0, Lk20/a;->i:Lk83/a;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv00/c0;

    if-eqz v1, :cond_0

    iget-object v2, v1, Lv00/c0;->T:Ly00/p2;

    :cond_0
    sget-object v1, Ly00/p2;->x:Ly00/p2;

    if-ne v2, v1, :cond_1

    const-string v2, "link_card_brand"

    goto :goto_0

    :cond_1
    const-string v2, "instant_debits"

    :cond_2
    :goto_0
    invoke-direct {v0, p1, v2}, Lk20/j;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0, v0}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    return-void
.end method

.method public final s(Lq20/y;)V
    .locals 2

    const-string v0, "paymentSelection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lq20/w;

    if-eqz v0, :cond_0

    new-instance v0, Lc10/f;

    invoke-static {p1}, Lk20/u;->a(Lq20/y;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lc10/f;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lk20/a;->g(Lx30/s0;)V

    :cond_0
    new-instance v0, Lk20/i;

    iget-object v1, p0, Lk20/a;->a:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    invoke-direct {v0, v1, p1}, Lk20/i;-><init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lq20/y;)V

    invoke-static {p0, v0}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    return-void
.end method

.method public final t(Lt20/u;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lt20/t;

    if-eqz v0, :cond_0

    new-instance p1, Lk20/k;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lk20/k;-><init>(I)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lt20/s;

    if-eqz v0, :cond_1

    new-instance v0, Lk20/j;

    check-cast p1, Lt20/s;

    invoke-direct {v0, p1}, Lk20/j;-><init>(Lt20/s;)V

    move-object p1, v0

    :goto_0
    invoke-static {p0, p1}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    return-void

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
