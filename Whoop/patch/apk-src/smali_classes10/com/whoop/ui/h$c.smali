.class Lcom/whoop/ui/h$c;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/ui/h;->K()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/whoop/ui/h;


# direct methods
.method public constructor <init>(Lcom/whoop/ui/h;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/ui/h$c;->a:Lcom/whoop/ui/h;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    iget-object p1, p0, Lcom/whoop/ui/h$c;->a:Lcom/whoop/ui/h;

    invoke-static {p1}, Lcom/whoop/ui/h;->G(Lcom/whoop/ui/h;)Llh3/b;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Llh3/b;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    iget-object p1, p0, Lcom/whoop/ui/h$c;->a:Lcom/whoop/ui/h;

    invoke-static {p1}, Lcom/whoop/ui/h;->G(Lcom/whoop/ui/h;)Llh3/b;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Llh3/b;->onNext(Ljava/lang/Object;)V

    return-void
.end method
