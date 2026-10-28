.class public final Lsc2/y$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsc2/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0008J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u0008\u00a8\u0006\u000c"
    }
    d2 = {
        "Lsc2/y$a;",
        "Landroid/animation/Animator$AnimatorListener;",
        "<init>",
        "(Lsc2/y;)V",
        "Landroid/animation/Animator;",
        "p0",
        "Ll83/a0;",
        "onAnimationStart",
        "(Landroid/animation/Animator;)V",
        "onAnimationCancel",
        "onAnimationRepeat",
        "onAnimationEnd",
        "app_prodStandardRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic a:Lsc2/y;


# direct methods
.method public constructor <init>(Lsc2/y;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lsc2/y$a;->a:Lsc2/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lsc2/y$a;->a:Lsc2/y;

    invoke-virtual {p1}, Lsc2/y;->P()Lcom/airbnb/lottie/LottieAnimationView;

    move-result-object p1

    iget-object p1, p1, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iget-object p1, p1, Lqi/w;->x:Ldj/e;

    iget v0, p1, Ldj/e;->z:F

    neg-float v0, v0

    iput v0, p1, Ldj/e;->z:F

    iget-object p1, p0, Lsc2/y$a;->a:Lsc2/y;

    invoke-virtual {p1}, Lsc2/y;->P()Lcom/airbnb/lottie/LottieAnimationView;

    move-result-object p1

    iget-object p1, p1, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iget-object p1, p1, Lqi/w;->x:Ldj/e;

    invoke-virtual {p1}, Ldj/e;->removeAllListeners()V

    iget-object p1, p0, Lsc2/y$a;->a:Lsc2/y;

    invoke-virtual {p1}, Lsc2/y;->O()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lsc2/y$a;->a:Lsc2/y;

    invoke-virtual {p1}, Lsc2/y;->P()Lcom/airbnb/lottie/LottieAnimationView;

    move-result-object p1

    invoke-virtual {p1}, Lcom/airbnb/lottie/LottieAnimationView;->d()V

    iget-object p1, p0, Lsc2/y$a;->a:Lsc2/y;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lsc2/y;->g0(Z)V

    :cond_0
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
