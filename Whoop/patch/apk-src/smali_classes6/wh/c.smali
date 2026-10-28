.class public final Lwh/c;
.super Landroid/graphics/drawable/Animatable2$AnimationCallback;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lc93/a;

.field public final synthetic b:Lc93/a;


# direct methods
.method public constructor <init>(Lc93/a;Lc93/a;)V
    .locals 0

    iput-object p1, p0, Lwh/c;->a:Lc93/a;

    iput-object p2, p0, Lwh/c;->b:Lc93/a;

    invoke-direct {p0}, Landroid/graphics/drawable/Animatable2$AnimationCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iget-object p1, p0, Lwh/c;->b:Lc93/a;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final onAnimationStart(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iget-object p1, p0, Lwh/c;->a:Lc93/a;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method
