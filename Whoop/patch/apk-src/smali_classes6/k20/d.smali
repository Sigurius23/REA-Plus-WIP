.class public final Lk20/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/lifecycle/k1;

.field public final b:Lk20/a;

.field public final c:Le30/a;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/k1;Lk20/a;Ln53/e;Ln8/a;Le30/a;)V
    .locals 1

    const-string v0, "savedStateHandle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentScreen"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk20/d;->a:Landroidx/lifecycle/k1;

    iput-object p2, p0, Lk20/d;->b:Lk20/a;

    iput-object p5, p0, Lk20/d;->c:Le30/a;

    new-instance p1, Lh20/i0;

    const/16 p2, 0x11

    const/4 p5, 0x0

    invoke-direct {p1, p3, p0, p5, p2}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p2, 0x3

    invoke-static {p4, p5, p5, p1, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    iget-object v0, p0, Lk20/d;->a:Landroidx/lifecycle/k1;

    const-string v1, "previously_sent_deep_link_event"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_1

    iget-object v2, p0, Lk20/d;->b:Lk20/a;

    new-instance v3, Lk20/i;

    iget-object v4, v2, Lk20/a;->a:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    const/4 v5, 0x1

    invoke-direct {v3, v4, v5}, Lk20/i;-><init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;I)V

    invoke-static {v2, v3}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v2, v1}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 5

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lk20/d;->a:Landroidx/lifecycle/k1;

    const-string v1, "previously_interacted_payment_form"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lk20/d;->b:Lk20/a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lc10/g;

    invoke-direct {v3, p1}, Lc10/g;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lk20/a;->g(Lx30/s0;)V

    new-instance v3, Lk20/l;

    const/4 v4, 0x6

    invoke-direct {v3, p1, v4}, Lk20/l;-><init>(Ljava/lang/String;I)V

    invoke-static {v2, v3}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    invoke-virtual {v0, p1, v1}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final c(Z)V
    .locals 5

    iget-object v0, p0, Lk20/d;->a:Landroidx/lifecycle/k1;

    const-string v1, "previously_presented_sheet"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_2

    iget-object v2, p0, Lk20/d;->b:Lk20/a;

    if-eqz p1, :cond_1

    new-instance p1, Lc10/c;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v2, p1}, Lk20/a;->g(Lx30/s0;)V

    new-instance p1, Lk20/i;

    iget-object v3, v2, Lk20/a;->a:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    const/4 v4, 0x3

    invoke-direct {p1, v3, v4}, Lk20/i;-><init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;I)V

    invoke-static {v2, p1}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    goto :goto_1

    :cond_1
    new-instance p1, Lc10/c;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v2, p1}, Lk20/a;->g(Lx30/s0;)V

    new-instance p1, Lk20/i;

    iget-object v3, v2, Lk20/a;->a:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    const/4 v4, 0x5

    invoke-direct {p1, v3, v4}, Lk20/i;-><init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;I)V

    invoke-static {v2, p1}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    :cond_2
    :goto_1
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, p1, v1}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
