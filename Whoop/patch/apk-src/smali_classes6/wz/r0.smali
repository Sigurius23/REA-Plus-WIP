.class public final Lwz/r0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/stripe/android/link/LinkActivityContract;

.field public final c:Lxz/n0;

.field public final d:Lyz/a;

.field public e:Lj/d;


# direct methods
.method public constructor <init>(Ln20/c;Ljava/lang/String;Lcom/stripe/android/link/LinkActivityContract;Lxz/n0;)V
    .locals 1

    const-string v0, "linkAnalyticsComponentFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentElementCallbackIdentifier"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkActivityContract"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkStore"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lwz/r0;->a:Ljava/lang/String;

    iput-object p3, p0, Lwz/r0;->b:Lcom/stripe/android/link/LinkActivityContract;

    iput-object p4, p0, Lwz/r0;->c:Lxz/n0;

    invoke-virtual {p1}, Ln20/c;->a()Ln10/n0;

    move-result-object p1

    invoke-virtual {p1}, Ln10/n0;->a()Lyz/a;

    move-result-object p1

    iput-object p1, p0, Lwz/r0;->d:Lyz/a;

    return-void
.end method


# virtual methods
.method public final a(Lwz/q;Lkotlin/jvm/functions/Function1;)V
    .locals 5

    iget-object v0, p0, Lwz/r0;->d:Lyz/a;

    iget-object v0, v0, Lyz/a;->a:Lyz/b;

    const-string v1, "linkActivityResult"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, p1, Lwz/m;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    move-object v3, p1

    check-cast v3, Lwz/m;

    iget-object v3, v3, Lwz/m;->w:Lwz/l;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    if-eqz v3, :cond_2

    const/4 v4, 0x1

    if-eq v3, v4, :cond_1

    const/4 v0, 0x2

    if-ne v3, v0, :cond_0

    goto :goto_1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object v3, Lyz/c;->G:Lyz/c;

    invoke-virtual {v0, v3, v2}, Lyz/b;->a(Ldz/i;Ljava/util/Map;)V

    goto :goto_1

    :cond_2
    sget-object v3, Lyz/c;->E:Lyz/c;

    invoke-virtual {v0, v3, v2}, Lyz/b;->a(Ldz/i;Ljava/util/Map;)V

    goto :goto_1

    :cond_3
    instance-of v3, p1, Lwz/p;

    if-nez v3, :cond_6

    instance-of v3, p1, Lwz/n;

    if-eqz v3, :cond_4

    goto :goto_0

    :cond_4
    instance-of v2, p1, Lwz/o;

    if-eqz v2, :cond_5

    move-object v2, p1

    check-cast v2, Lwz/o;

    iget-object v2, v2, Lwz/o;->w:Ljava/lang/Throwable;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "error"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "error_message"

    invoke-static {v2}, Ls4/b;->k(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    sget-object v3, Lyz/c;->F:Lyz/c;

    invoke-virtual {v0, v3, v2}, Lyz/b;->a(Ldz/i;Ljava/util/Map;)V

    goto :goto_1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    :goto_0
    sget-object v3, Lyz/c;->J:Lyz/c;

    invoke-virtual {v0, v3, v2}, Lyz/b;->a(Ldz/i;Ljava/util/Map;)V

    :goto_1
    instance-of v0, p1, Lwz/p;

    if-nez v0, :cond_9

    instance-of v0, p1, Lwz/n;

    if-eqz v0, :cond_7

    goto :goto_2

    :cond_7
    if-nez v1, :cond_a

    instance-of v0, p1, Lwz/o;

    if-eqz v0, :cond_8

    goto :goto_3

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_9
    :goto_2
    iget-object v0, p0, Lwz/r0;->c:Lxz/n0;

    invoke-virtual {v0}, Lxz/n0;->a()V

    :cond_a
    :goto_3
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final b(Lv00/c0;Lwz/d;Lwz/g0;Lwz/h0;Lwz/n0;)V
    .locals 7

    const-string v0, "configuration"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodMetadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccountInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "launchMode"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkExpressMode"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lwz/k;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lwz/k;-><init>(Lv00/c0;Lwz/d;Lwz/g0;Lwz/h0;Lwz/n0;)V

    iget-object p1, p0, Lwz/r0;->e:Lj/d;

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1, v1, p2}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    :cond_0
    iget-object p1, p0, Lwz/r0;->d:Lyz/a;

    iget-object p1, p1, Lyz/a;->a:Lyz/b;

    sget-object p3, Lyz/c;->H:Lyz/c;

    invoke-virtual {p1, p3, p2}, Lyz/b;->a(Ldz/i;Ljava/util/Map;)V

    return-void
.end method

.method public final c(Ljava/lang/String;Lj/j;Lkotlin/jvm/functions/Function1;)V
    .locals 2

    const-string v0, "activityResultRegistry"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwz/r0;->a:Ljava/lang/String;

    const-string v1, "_"

    invoke-static {v0, v1, p1}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lv10/p;

    invoke-direct {v0, p0, p3}, Lv10/p;-><init>(Lwz/r0;Lkotlin/jvm/functions/Function1;)V

    iget-object p3, p0, Lwz/r0;->b:Lcom/stripe/android/link/LinkActivityContract;

    invoke-virtual {p2, p1, p3, v0}, Lj/j;->d(Ljava/lang/String;Lk/b;Lj/b;)Lj/i;

    move-result-object p1

    iput-object p1, p0, Lwz/r0;->e:Lj/d;

    return-void
.end method
