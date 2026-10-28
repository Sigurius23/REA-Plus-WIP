.class public final Lcom/whoop/realtime/presentation/j$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/realtime/presentation/j;->r0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0006J\u0017\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0006\u00a8\u0006\n"
    }
    d2 = {
        "com/whoop/realtime/presentation/j$i",
        "Landroid/animation/Animator$AnimatorListener;",
        "Landroid/animation/Animator;",
        "animator",
        "Ll83/a0;",
        "onAnimationRepeat",
        "(Landroid/animation/Animator;)V",
        "onAnimationEnd",
        "onAnimationCancel",
        "onAnimationStart",
        "core-ktx_release"
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
.field final synthetic a:Lcom/whoop/realtime/presentation/j;


# direct methods
.method public constructor <init>(Lcom/whoop/realtime/presentation/j;Lcom/whoop/realtime/presentation/j;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/realtime/presentation/j$i;->a:Lcom/whoop/realtime/presentation/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lcom/whoop/realtime/presentation/j$i;->a:Lcom/whoop/realtime/presentation/j;

    invoke-static {p1}, Lcom/whoop/realtime/presentation/j;->S(Lcom/whoop/realtime/presentation/j;)Lkotlin/jvm/functions/Function1;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/whoop/realtime/presentation/j$i;->a:Lcom/whoop/realtime/presentation/j;

    invoke-static {p1}, Lcom/whoop/realtime/presentation/j;->V(Lcom/whoop/realtime/presentation/j;)Lcom/whoop/realtime/presentation/k;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/realtime/presentation/k;->U()V

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lcom/whoop/realtime/presentation/j$i;->a:Lcom/whoop/realtime/presentation/j;

    invoke-static {p1}, Lcom/whoop/realtime/presentation/j;->U(Lcom/whoop/realtime/presentation/j;)Lo52/k0;

    move-result-object p1

    invoke-interface {p1}, Lo52/k0;->h()Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/j$i;->a:Lcom/whoop/realtime/presentation/j;

    invoke-static {p1}, Lcom/whoop/realtime/presentation/j;->V(Lcom/whoop/realtime/presentation/j;)Lcom/whoop/realtime/presentation/k;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/realtime/presentation/k;->V()V

    return-void
.end method
