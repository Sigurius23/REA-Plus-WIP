.class final Lcom/whoop/ui/home/redesign/view/MainActivity$o;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/ui/home/redesign/view/MainActivity;->T0(Z)V
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
    c = "com.whoop.ui.home.redesign.view.MainActivity$onSplashFinished$1"
    f = "MainActivity.kt"
    l = {
        0x166
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcom/whoop/ui/home/redesign/view/MainActivity;


# direct methods
.method public constructor <init>(Lcom/whoop/ui/home/redesign/view/MainActivity;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/ui/home/redesign/view/MainActivity;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/ui/home/redesign/view/MainActivity$o;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$o;->x:Lcom/whoop/ui/home/redesign/view/MainActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lcom/whoop/ui/home/redesign/view/MainActivity$o;

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$o;->x:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-direct {p1, v0, p2}, Lcom/whoop/ui/home/redesign/view/MainActivity$o;-><init>(Lcom/whoop/ui/home/redesign/view/MainActivity;Lq83/d;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/ui/home/redesign/view/MainActivity$o;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/ui/home/redesign/view/MainActivity$o;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/ui/home/redesign/view/MainActivity$o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/ui/home/redesign/view/MainActivity$o;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$o;->w:I

    const-string v2, "splashVideoView"

    const-string v3, "splashView"

    const/4 v4, 0x1

    const/16 v5, 0x8

    const/4 v6, 0x0

    const-string v7, "activityBinding"

    if-eqz v1, :cond_1

    if-ne v1, v4, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$o;->x:Lcom/whoop/ui/home/redesign/view/MainActivity;

    iput v4, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$o;->w:I

    invoke-static {p1, p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->V(Lcom/whoop/ui/home/redesign/view/MainActivity;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$o;->x:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-static {p1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->E(Lcom/whoop/ui/home/redesign/view/MainActivity;)Lii0/g;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object p1, p1, Lii0/g;->e:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$o;->x:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-static {p1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->E(Lcom/whoop/ui/home/redesign/view/MainActivity;)Lii0/g;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object p1, p1, Lii0/g;->d:Landroid/widget/VideoView;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_3
    invoke-static {v7}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6

    :cond_4
    invoke-static {v7}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6

    :goto_1
    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$o;->x:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-static {v0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->E(Lcom/whoop/ui/home/redesign/view/MainActivity;)Lii0/g;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v0, v0, Lii0/g;->e:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$o;->x:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-static {v0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->E(Lcom/whoop/ui/home/redesign/view/MainActivity;)Lii0/g;

    move-result-object v0

    if-nez v0, :cond_5

    invoke-static {v7}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6

    :cond_5
    iget-object v0, v0, Lii0/g;->d:Landroid/widget/VideoView;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    throw p1

    :cond_6
    invoke-static {v7}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6
.end method
