.class public final Lzb/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lzb/c;

.field public final synthetic b:Lzb/d;


# direct methods
.method public constructor <init>(Lzb/d;Lzb/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzb/a;->b:Lzb/d;

    iput-object p2, p0, Lzb/a;->a:Lzb/c;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lzb/a;->a:Lzb/c;

    invoke-static {p1, v0}, Lzb/d;->c(FLzb/c;)V

    const/4 v1, 0x0

    iget-object v2, p0, Lzb/a;->b:Lzb/d;

    invoke-virtual {v2, p1, v0, v1}, Lzb/d;->a(FLzb/c;Z)V

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method
