.class public final Lf10/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le10/j;


# instance fields
.field public final a:Lb20/f;

.field public final b:Lt40/f;

.field public final c:Lbc3/c0;

.field public final d:Lq83/j;

.field public final e:Lq30/w0;

.field public final f:Lc93/a;

.field public final g:Ljava/util/Set;


# direct methods
.method public constructor <init>(Lb20/f;Lt40/f;Lbc3/c0;Lq83/j;Lq30/w0;Lc93/a;Ljava/util/Set;)V
    .locals 1

    const-string v0, "errorReporter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "integrityRequestManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attestationAnalyticsEventsReporter"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKeyProvider"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productUsage"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf10/b;->a:Lb20/f;

    iput-object p2, p0, Lf10/b;->b:Lt40/f;

    iput-object p3, p0, Lf10/b;->c:Lbc3/c0;

    iput-object p4, p0, Lf10/b;->d:Lq83/j;

    iput-object p5, p0, Lf10/b;->e:Lq30/w0;

    iput-object p6, p0, Lf10/b;->f:Lc93/a;

    iput-object p7, p0, Lf10/b;->g:Ljava/util/Set;

    return-void
.end method

.method public static i(Le10/t0;Ljava/lang/String;)Le10/t0;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object v1, p0, Le10/t0;->w:Ly00/d5;

    iget-object v1, v1, Ly00/d5;->R:Ly00/a6;

    if-eqz v1, :cond_0

    new-instance v2, Ly00/d;

    invoke-direct {v2, p1}, Ly00/d;-><init>(Ljava/lang/String;)V

    iget-object p1, v1, Ly00/a6;->w:Ljava/lang/String;

    new-instance v1, Ly00/a6;

    invoke-direct {v1, p1, v2}, Ly00/a6;-><init>(Ljava/lang/String;Ly00/d;)V

    goto :goto_0

    :cond_0
    new-instance v1, Ly00/a6;

    new-instance v2, Ly00/d;

    invoke-direct {v2, p1}, Ly00/d;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v0, v2}, Ly00/a6;-><init>(Ljava/lang/String;Ly00/d;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Le10/t0;->w:Ly00/d5;

    iget-object v1, p1, Ly00/d5;->R:Ly00/a6;

    :goto_0
    iget-object p1, p0, Le10/t0;->w:Ly00/d5;

    const v2, 0x3dffff

    invoke-static {p1, v1, v0, v2}, Ly00/d5;->f(Ly00/d5;Ly00/a6;Ln83/i;I)Ly00/d5;

    move-result-object p1

    const/16 v1, 0x1e

    invoke-static {p0, p1, v0, v1}, Le10/t0;->b(Le10/t0;Ly00/d5;Ly00/u5;I)Le10/t0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Le10/l;Le10/k;)V
    .locals 1

    check-cast p1, Lj/d;

    check-cast p2, Lwx/b;

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
    .locals 3

    check-cast p1, Le10/t0;

    const-string v0, "confirmationArgs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Le10/t0;->w:Ly00/d5;

    iget-object v1, v0, Ly00/d5;->w:Ljava/lang/String;

    const-string v2, "card"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object p2, p2, Le10/k;->x:Lv00/c0;

    iget-boolean p2, p2, Lv00/c0;->e0:Z

    if-eqz p2, :cond_2

    iget-boolean p1, p1, Le10/t0;->F:Z

    if-nez p1, :cond_2

    iget-object p1, v0, Ly00/d5;->R:Ly00/a6;

    if-eqz p1, :cond_0

    iget-object p1, p1, Ly00/a6;->x:Ly00/d;

    if-eqz p1, :cond_0

    iget-object p1, p1, Ly00/d;->w:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final d(Lv00/c0;)V
    .locals 4

    const-string v0, "paymentMethodMetadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p1, p1, Lv00/c0;->e0:Z

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance p1, La20/b;

    const/16 v0, 0x13

    const/4 v1, 0x0

    invoke-direct {p1, p0, v1, v0}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v0, 0x2

    iget-object v2, p0, Lf10/b;->c:Lbc3/c0;

    iget-object v3, p0, Lf10/b;->d:Lq83/j;

    invoke-static {v2, v3, v1, p1, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final e(Le10/l;Le10/k;Le10/h0;)Ljava/lang/Object;
    .locals 4

    check-cast p1, Le10/t0;

    iget-object p1, p2, Le10/k;->x:Lv00/c0;

    iget-boolean p1, p1, Lv00/c0;->e0:Z

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    new-instance p1, Le10/c;

    new-instance p3, Lwx/b;

    iget-object v0, p0, Lf10/b;->f:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lf10/b;->g:Ljava/util/Set;

    invoke-direct {p3, v0, v1}, Lwx/b;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    const/4 v0, 0x0

    invoke-direct {p1, p3, v0, p2}, Le10/c;-><init>(Ljava/lang/Object;ZLn10/c0;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p3, "Attestation is not enabled on intent confirmation"

    invoke-direct {p1, p3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    sget-object v0, Lb20/e;->X:Lb20/e;

    sget v1, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {p1}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v1

    const/4 v2, 0x4

    iget-object v3, p0, Lf10/b;->a:Lb20/f;

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

    check-cast p4, Lwx/e;

    const-string p3, "confirmationOption"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "confirmationArgs"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "result"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p3, p4, Lwx/c;

    if-eqz p3, :cond_0

    new-instance p3, Le10/g;

    const/4 p4, 0x0

    invoke-static {p1, p4}, Lf10/b;->i(Le10/t0;Ljava/lang/String;)Le10/t0;

    move-result-object p1

    invoke-direct {p3, p1, p2}, Le10/g;-><init>(Le10/v0;Le10/k;)V

    return-object p3

    :cond_0
    instance-of p3, p4, Lwx/d;

    if-eqz p3, :cond_1

    new-instance p3, Le10/g;

    check-cast p4, Lwx/d;

    iget-object p4, p4, Lwx/d;->w:Ljava/lang/String;

    invoke-static {p1, p4}, Lf10/b;->i(Le10/t0;Ljava/lang/String;)Le10/t0;

    move-result-object p1

    invoke-direct {p3, p1, p2}, Le10/g;-><init>(Le10/v0;Le10/k;)V

    return-object p3

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final g(Lj/c;Lcom/whoop/profile/view/edit/n;)Ljava/lang/Object;
    .locals 3

    const-string v0, "activityResultCaller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/attestation/AttestationActivityContract;

    invoke-direct {v0}, Lcom/stripe/android/attestation/AttestationActivityContract;-><init>()V

    new-instance v1, Lf10/a;

    const/4 v2, 0x0

    invoke-direct {v1, p2, v2}, Lf10/a;-><init>(Lcom/whoop/profile/view/edit/n;I)V

    invoke-interface {p1, v0, v1}, Lj/c;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object p1

    return-object p1
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1

    const-string v0, "Attestation"

    return-object v0
.end method

.method public final bridge synthetic h(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lj/d;

    return-void
.end method
