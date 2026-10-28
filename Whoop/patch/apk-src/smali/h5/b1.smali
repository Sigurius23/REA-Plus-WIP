.class public final Lh5/b1;
.super Lh5/c1;
.source "SourceFile"


# instance fields
.field public final e:Landroid/view/WindowInsetsAnimation;


# direct methods
.method public constructor <init>(Landroid/view/WindowInsetsAnimation;)V
    .locals 4

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    invoke-direct {p0, v3, v0, v1, v2}, Lh5/c1;-><init>(ILandroid/view/animation/Interpolator;J)V

    iput-object p1, p0, Lh5/b1;->e:Landroid/view/WindowInsetsAnimation;

    return-void
.end method

.method public static e(Landroid/view/WindowInsetsAnimation$Bounds;)Lv4/b;
    .locals 0

    invoke-virtual {p0}, Landroid/view/WindowInsetsAnimation$Bounds;->getUpperBound()Landroid/graphics/Insets;

    move-result-object p0

    invoke-static {p0}, Lv4/b;->c(Landroid/graphics/Insets;)Lv4/b;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/view/WindowInsetsAnimation$Bounds;)Lv4/b;
    .locals 0

    invoke-virtual {p0}, Landroid/view/WindowInsetsAnimation$Bounds;->getLowerBound()Landroid/graphics/Insets;

    move-result-object p0

    invoke-static {p0}, Lv4/b;->c(Landroid/graphics/Insets;)Lv4/b;

    move-result-object p0

    return-object p0
.end method

.method public static g(Landroid/view/View;Landroidx/datastore/preferences/protobuf/l;)V
    .locals 1

    if-eqz p1, :cond_0

    new-instance v0, Lh5/a1;

    invoke-direct {v0, p1}, Lh5/a1;-><init>(Landroidx/datastore/preferences/protobuf/l;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Landroid/view/View;->setWindowInsetsAnimationCallback(Landroid/view/WindowInsetsAnimation$Callback;)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-object v0, p0, Lh5/b1;->e:Landroid/view/WindowInsetsAnimation;

    invoke-virtual {v0}, Landroid/view/WindowInsetsAnimation;->getDurationMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public final b()F
    .locals 1

    iget-object v0, p0, Lh5/b1;->e:Landroid/view/WindowInsetsAnimation;

    invoke-virtual {v0}, Landroid/view/WindowInsetsAnimation;->getInterpolatedFraction()F

    move-result v0

    return v0
.end method

.method public final c()I
    .locals 1

    iget-object v0, p0, Lh5/b1;->e:Landroid/view/WindowInsetsAnimation;

    invoke-virtual {v0}, Landroid/view/WindowInsetsAnimation;->getTypeMask()I

    move-result v0

    return v0
.end method

.method public final d(F)V
    .locals 1

    iget-object v0, p0, Lh5/b1;->e:Landroid/view/WindowInsetsAnimation;

    invoke-virtual {v0, p1}, Landroid/view/WindowInsetsAnimation;->setFraction(F)V

    return-void
.end method
