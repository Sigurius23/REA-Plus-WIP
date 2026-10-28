.class public final Lor/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Lor/g;


# direct methods
.method public constructor <init>(Lor/g;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor/f;->c:Lor/g;

    iput-object p2, p0, Lor/f;->a:Landroid/view/View;

    iput-object p3, p0, Lor/f;->b:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    iget-object v0, p0, Lor/f;->b:Landroid/view/View;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    iget-object v1, p0, Lor/f;->c:Lor/g;

    iget-object v2, p0, Lor/f;->a:Landroid/view/View;

    invoke-virtual {v1, v2, v0, p1}, Lor/g;->c(Landroid/view/View;Landroid/view/View;F)V

    return-void
.end method
