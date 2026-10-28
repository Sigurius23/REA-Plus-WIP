.class public abstract Lc0/t1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    move-result v0

    sput v0, Lc0/t1;->a:F

    return-void
.end method

.method public static final a(Landroidx/compose/runtime/Composer;)Ld0/x;
    .locals 3

    sget-object v0, Lb3/v1;->h:Lp1/u2;

    check-cast p0, Lp1/q;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/c;

    invoke-interface {v0}, Ly3/c;->getDensity()F

    move-result v1

    invoke-virtual {p0, v1}, Lp1/q;->d(F)Z

    move-result v1

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v2, v1, :cond_1

    :cond_0
    new-instance v1, Lbu/c;

    invoke-direct {v1, v0}, Lbu/c;-><init>(Ly3/c;)V

    new-instance v2, Ld0/x;

    invoke-direct {v2, v1}, Ld0/x;-><init>(Ld0/e0;)V

    invoke-virtual {p0, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v2, Ld0/x;

    return-object v2
.end method
