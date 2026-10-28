.class final Lcom/whoop/home/view/HomeFragment$o;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/home/view/HomeFragment;->I2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.home.view.HomeFragment$showInAppReview$1"
    f = "HomeFragment.kt"
    l = {
        0x35a,
        0x35e,
        0x360
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lcom/whoop/home/view/HomeFragment;


# direct methods
.method public constructor <init>(Lcom/whoop/home/view/HomeFragment;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/home/view/HomeFragment;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/home/view/HomeFragment$o;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/home/view/HomeFragment$o;->z:Lcom/whoop/home/view/HomeFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/home/view/HomeFragment$o;

    iget-object v1, p0, Lcom/whoop/home/view/HomeFragment$o;->z:Lcom/whoop/home/view/HomeFragment;

    invoke-direct {v0, v1, p2}, Lcom/whoop/home/view/HomeFragment$o;-><init>(Lcom/whoop/home/view/HomeFragment;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/home/view/HomeFragment$o;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/home/view/HomeFragment$o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/home/view/HomeFragment$o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/home/view/HomeFragment$o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/home/view/HomeFragment$o;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    const-string v0, "In App review request failed "

    iget-object v1, p0, Lcom/whoop/home/view/HomeFragment$o;->y:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lcom/whoop/home/view/HomeFragment$o;->x:I

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v3, :cond_3

    if-eq v3, v6, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v0, p0, Lcom/whoop/home/view/HomeFragment$o;->w:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/tasks/Task;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/google/android/play/core/review/ReviewException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_3

    :catch_0
    move-exception p1

    goto/16 :goto_4

    :catch_1
    move-exception p1

    goto/16 :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v3, p0, Lcom/whoop/home/view/HomeFragment$o;->w:Ljava/lang/Object;

    check-cast v3, Lcom/google/android/gms/tasks/Task;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/google/android/play/core/review/ReviewException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/whoop/home/view/HomeFragment$o;->y:Ljava/lang/Object;

    iput v6, p0, Lcom/whoop/home/view/HomeFragment$o;->x:I

    const-wide/16 v8, 0x7d0

    invoke-static {v8, v9, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_4

    goto :goto_2

    :cond_4
    :goto_0
    :try_start_2
    iget-object p1, p0, Lcom/whoop/home/view/HomeFragment$o;->z:Lcom/whoop/home/view/HomeFragment;

    invoke-static {p1}, Lcom/whoop/home/view/HomeFragment;->C0(Lcom/whoop/home/view/HomeFragment;)Lur/b;

    move-result-object p1

    check-cast p1, Lur/d;

    invoke-virtual {p1}, Lur/d;->b()Lcq/u;

    move-result-object v3

    const-string p1, "requestReviewFlow(...)"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/whoop/home/view/HomeFragment$o;->y:Ljava/lang/Object;

    iput-object v3, p0, Lcom/whoop/home/view/HomeFragment$o;->w:Ljava/lang/Object;

    iput v5, p0, Lcom/whoop/home/view/HomeFragment$o;->x:I

    invoke-static {v3, p0}, Lcom/squareup/wire/n;->o(Lcom/google/android/gms/tasks/Task;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    invoke-virtual {v3}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/whoop/home/view/HomeFragment$o;->z:Lcom/whoop/home/view/HomeFragment;

    invoke-static {p1}, Lcom/whoop/home/view/HomeFragment;->C0(Lcom/whoop/home/view/HomeFragment;)Lur/b;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/home/view/HomeFragment$o;->z:Lcom/whoop/home/view/HomeFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object v0

    invoke-virtual {v3}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lur/a;

    check-cast p1, Lur/d;

    invoke-virtual {p1, v0, v3}, Lur/d;->a(Landroid/app/Activity;Lur/a;)Lcq/u;

    move-result-object p1

    const-string v0, "launchReviewFlow(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/whoop/home/view/HomeFragment$o;->y:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whoop/home/view/HomeFragment$o;->w:Ljava/lang/Object;

    iput v4, p0, Lcom/whoop/home/view/HomeFragment$o;->x:I

    invoke-static {p1, p0}, Lcom/squareup/wire/n;->o(Lcom/google/android/gms/tasks/Task;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_6

    :goto_2
    return-object v2

    :cond_6
    :goto_3
    iget-object p1, p0, Lcom/whoop/home/view/HomeFragment$o;->z:Lcom/whoop/home/view/HomeFragment;

    invoke-static {p1}, Lcom/whoop/home/view/HomeFragment;->G0(Lcom/whoop/home/view/HomeFragment;)Lem1/u;

    move-result-object p1

    sget-object v0, Lem1/w$b;->a:Lem1/w$b;

    invoke-virtual {p1, v0}, Lem1/u;->p0(Lem1/t;)V

    goto :goto_6

    :cond_7
    iget-object p1, p0, Lcom/whoop/home/view/HomeFragment$o;->z:Lcom/whoop/home/view/HomeFragment;

    invoke-static {p1}, Lcom/whoop/home/view/HomeFragment;->z0(Lcom/whoop/home/view/HomeFragment;)Ltr2/n;

    move-result-object p1

    invoke-virtual {v3}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v7, [Lqr2/a$a;

    invoke-interface {p1, v0, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_2
    .catch Lcom/google/android/play/core/review/ReviewException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_6

    :goto_4
    invoke-interface {v1}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->o(Lq83/j;)V

    iget-object v0, p0, Lcom/whoop/home/view/HomeFragment$o;->z:Lcom/whoop/home/view/HomeFragment;

    invoke-static {v0}, Lcom/whoop/home/view/HomeFragment;->z0(Lcom/whoop/home/view/HomeFragment;)Ltr2/n;

    move-result-object v0

    const-string v1, "In-App Review failed with error:"

    new-array v2, v7, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_6

    :goto_5
    iget-object v0, p0, Lcom/whoop/home/view/HomeFragment$o;->z:Lcom/whoop/home/view/HomeFragment;

    invoke-static {v0}, Lcom/whoop/home/view/HomeFragment;->z0(Lcom/whoop/home/view/HomeFragment;)Ltr2/n;

    move-result-object v0

    iget-object p1, p1, Lcom/google/android/gms/common/api/ApiException;->w:Lcom/google/android/gms/common/api/Status;

    iget p1, p1, Lcom/google/android/gms/common/api/Status;->w:I

    const-string v1, "In App review failed with review exception, code: "

    invoke-static {p1, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v1, v7, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
