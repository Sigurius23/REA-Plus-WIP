.class public final Lh10/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le10/j;


# instance fields
.field public final a:Lb20/f;

.field public final b:Lay/y;

.field public final c:Lc93/a;

.field public final d:Ljava/util/Set;


# direct methods
.method public constructor <init>(Lb20/f;Lay/y;Lc93/a;Ljava/util/Set;)V
    .locals 1

    const-string v0, "errorReporter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "passiveChallengeWarmer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKeyProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productUsage"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh10/a;->a:Lb20/f;

    iput-object p2, p0, Lh10/a;->b:Lay/y;

    iput-object p3, p0, Lh10/a;->c:Lc93/a;

    iput-object p4, p0, Lh10/a;->d:Ljava/util/Set;

    return-void
.end method

.method public static i(Le10/t0;Ljava/lang/String;)Le10/t0;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object v1, p0, Le10/t0;->w:Ly00/d5;

    iget-object v1, v1, Ly00/d5;->R:Ly00/a6;

    if-eqz v1, :cond_0

    iget-object v1, v1, Ly00/a6;->x:Ly00/d;

    new-instance v2, Ly00/a6;

    invoke-direct {v2, p1, v1}, Ly00/a6;-><init>(Ljava/lang/String;Ly00/d;)V

    goto :goto_0

    :cond_0
    new-instance v2, Ly00/a6;

    invoke-direct {v2, p1, v0}, Ly00/a6;-><init>(Ljava/lang/String;Ly00/d;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Le10/t0;->w:Ly00/d5;

    iget-object v2, p1, Ly00/d5;->R:Ly00/a6;

    :goto_0
    iget-object p1, p0, Le10/t0;->w:Ly00/d5;

    const v1, 0x3dffff

    invoke-static {p1, v2, v0, v1}, Ly00/d5;->f(Ly00/d5;Ly00/a6;Ln83/i;I)Ly00/d5;

    move-result-object p1

    const/16 v1, 0x2e

    invoke-static {p0, p1, v0, v1}, Le10/t0;->b(Le10/t0;Ly00/d5;Ly00/u5;I)Le10/t0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Le10/l;Le10/k;)V
    .locals 1

    check-cast p1, Lj/d;

    check-cast p2, Ldy/c;

    check-cast p3, Le10/t0;

    const-string v0, "confirmationOption"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "confirmationArgs"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void
.end method

.method public final b(Le10/l;)Le10/l;
    .locals 1

    const-string v0, "confirmationOption"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Le10/t0;

    if-eqz v0, :cond_0

    check-cast p1, Le10/t0;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final c(Le10/l;Le10/k;)Z
    .locals 1

    check-cast p1, Le10/t0;

    const-string v0, "confirmationArgs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p2, Le10/k;->x:Lv00/c0;

    iget-object p2, p2, Lv00/c0;->b0:Ly00/c3;

    if-eqz p2, :cond_0

    iget-object p2, p1, Le10/t0;->w:Ly00/d5;

    iget-object p2, p2, Ly00/d5;->w:Ljava/lang/String;

    const-string v0, "card"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-boolean p1, p1, Le10/t0;->E:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final d(Lv00/c0;)V
    .locals 4

    const-string v0, "paymentMethodMetadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lv00/c0;->b0:Ly00/c3;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lh10/a;->c:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lh10/a;->b:Lay/y;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "publishableKey"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "productUsage"

    iget-object v3, p0, Lh10/a;->d:Ljava/util/Set;

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v1, Lay/y;->a:Lj/d;

    if-eqz v1, :cond_1

    new-instance v2, Lfy/e;

    invoke-direct {v2, p1, v0, v3}, Lfy/e;-><init>(Ly00/c3;Ljava/lang/String;Ljava/util/Set;)V

    const/4 p1, 0x0

    invoke-virtual {v1, v2, p1}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final e(Le10/l;Le10/k;Le10/h0;)Ljava/lang/Object;
    .locals 4

    check-cast p1, Le10/t0;

    iget-object p1, p2, Le10/k;->x:Lv00/c0;

    iget-object p1, p1, Lv00/c0;->b0:Ly00/c3;

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    new-instance p3, Le10/c;

    new-instance v0, Ldy/c;

    iget-object v1, p0, Lh10/a;->c:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lh10/a;->d:Ljava/util/Set;

    invoke-direct {v0, p1, v1, v2}, Ldy/c;-><init>(Ly00/c3;Ljava/lang/String;Ljava/util/Set;)V

    const/4 p1, 0x0

    invoke-direct {p3, v0, p1, p2}, Le10/c;-><init>(Ljava/lang/Object;ZLn10/c0;)V

    return-object p3

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p3, "Passive challenge params are null"

    invoke-direct {p1, p3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    sget-object v0, Lb20/e;->W:Lb20/e;

    sget v1, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {p1}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v1

    const/4 v2, 0x4

    iget-object v3, p0, Lh10/a;->a:Lb20/f;

    invoke-static {v3, v0, v1, p2, v2}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    new-instance p2, Le10/b;

    invoke-static {p3}, Ls4/i;->i(Ljava/lang/String;)Lzy/d;

    move-result-object p3

    sget-object v0, Le10/r;->a:Le10/r;

    invoke-direct {p2, p1, p3, v0}, Le10/b;-><init>(Ljava/lang/Throwable;Lzy/c;Le10/u;)V

    return-object p2
.end method

.method public final f(Le10/l;Le10/k;Ln10/c0;Landroid/os/Parcelable;)Le10/i;
    .locals 0

    check-cast p1, Le10/t0;

    check-cast p4, Ldy/f;

    const-string p3, "confirmationOption"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "confirmationArgs"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "result"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p3, p4, Ldy/d;

    if-eqz p3, :cond_0

    new-instance p3, Le10/g;

    const/4 p4, 0x0

    invoke-static {p1, p4}, Lh10/a;->i(Le10/t0;Ljava/lang/String;)Le10/t0;

    move-result-object p1

    invoke-direct {p3, p1, p2}, Le10/g;-><init>(Le10/v0;Le10/k;)V

    return-object p3

    :cond_0
    instance-of p3, p4, Ldy/e;

    if-eqz p3, :cond_1

    new-instance p3, Le10/g;

    check-cast p4, Ldy/e;

    iget-object p4, p4, Ldy/e;->w:Ljava/lang/String;

    invoke-static {p1, p4}, Lh10/a;->i(Le10/t0;Ljava/lang/String;)Le10/t0;

    move-result-object p1

    invoke-direct {p3, p1, p2}, Le10/g;-><init>(Le10/v0;Le10/k;)V

    return-object p3

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final g(Lj/c;Lcom/whoop/profile/view/edit/n;)Ljava/lang/Object;
    .locals 4

    const-string v0, "activityResultCaller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh10/a;->b:Lay/y;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerContract;

    invoke-direct {v1}, Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerContract;-><init>()V

    iget-object v2, v0, Lay/y;->a:Lj/d;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lj/d;->b()V

    :cond_0
    new-instance v2, Ley/a;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ley/a;-><init>(I)V

    invoke-interface {p1, v1, v2}, Lj/c;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object v1

    iput-object v1, v0, Lay/y;->a:Lj/d;

    new-instance v0, Lcom/stripe/android/challenge/passive/PassiveChallengeActivityContract;

    invoke-direct {v0}, Lcom/stripe/android/challenge/passive/PassiveChallengeActivityContract;-><init>()V

    new-instance v1, Lf10/a;

    const/4 v2, 0x2

    invoke-direct {v1, p2, v2}, Lf10/a;-><init>(Lcom/whoop/profile/view/edit/n;I)V

    invoke-interface {p1, v0, v1}, Lj/c;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object p1

    return-object p1
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1

    const-string v0, "ChallengePassive"

    return-object v0
.end method

.method public final h(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lj/d;

    const-string v0, "launcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lh10/a;->b:Lay/y;

    iget-object v0, p1, Lay/y;->a:Lj/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj/d;->b()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p1, Lay/y;->a:Lj/d;

    return-void
.end method
