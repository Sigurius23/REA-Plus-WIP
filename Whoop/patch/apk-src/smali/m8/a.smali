.class public abstract Lm8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj02/w;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Lj02/w;-><init>(I)V

    new-instance v1, Lp1/b0;

    invoke-direct {v1, v0}, Lp1/b0;-><init>(Lc93/a;)V

    sput-object v1, Lm8/a;->a:Lp1/b0;

    return-void
.end method

.method public static a(Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/f2;
    .locals 3

    check-cast p0, Lp1/q;

    sget-object v0, Lm8/a;->a:Lp1/b0;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/f2;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const v0, 0x4b1d16e9    # 1.0295017E7f

    invoke-virtual {p0, v0}, Lp1/q;->e0(I)V

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:Lp1/u2;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-static {v0}, Landroidx/lifecycle/o1;->h(Landroid/view/View;)Landroidx/lifecycle/f2;

    move-result-object v0

    :goto_0
    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    return-object v0

    :cond_0
    const v2, 0x4b1d128d    # 1.0293901E7f

    invoke-virtual {p0, v2}, Lp1/q;->e0(I)V

    goto :goto_0
.end method
