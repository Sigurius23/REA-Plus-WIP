.class public final Lbw/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Landroid/view/animation/PathInterpolator;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v1, v2, v2}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    const v0, 0x3ecccccd    # 0.4f

    new-instance v3, Landroid/view/animation/PathInterpolator;

    invoke-direct {v3, v0, v1, v0, v2}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    return-void
.end method
