.class public final Lh5/d1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lh5/c1;


# direct methods
.method public constructor <init>(ILandroid/view/animation/Interpolator;J)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, Lh5/b1;

    invoke-static {p1, p2, p3, p4}, Lh5/z0;->b(ILandroid/view/animation/Interpolator;J)Landroid/view/WindowInsetsAnimation;

    move-result-object p1

    invoke-direct {v0, p1}, Lh5/b1;-><init>(Landroid/view/WindowInsetsAnimation;)V

    iput-object v0, p0, Lh5/d1;->a:Lh5/c1;

    return-void

    :cond_0
    new-instance v0, Lh5/y0;

    invoke-direct {v0, p1, p2, p3, p4}, Lh5/y0;-><init>(ILandroid/view/animation/Interpolator;J)V

    iput-object v0, p0, Lh5/d1;->a:Lh5/c1;

    return-void
.end method
