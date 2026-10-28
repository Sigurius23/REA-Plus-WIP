.class public abstract Lh/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lh/c;->y:Lh/c;

    new-instance v1, Lp1/b0;

    invoke-direct {v1, v0}, Lp1/b0;-><init>(Lc93/a;)V

    sput-object v1, Lh/g;->a:Lp1/b0;

    return-void
.end method

.method public static a(Landroidx/compose/runtime/Composer;)Lj/k;
    .locals 3

    check-cast p0, Lp1/q;

    sget-object v0, Lh/g;->a:Lp1/b0;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj/k;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    const v0, 0x3bff58db

    invoke-virtual {p0, v0}, Lp1/q;->e0(I)V

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    :goto_0
    instance-of v2, v0, Landroid/content/ContextWrapper;

    if-eqz v2, :cond_1

    instance-of v2, v0, Lj/k;

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    check-cast v0, Lj/k;

    :goto_2
    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    return-object v0

    :cond_2
    const v2, 0x3bff5577

    invoke-virtual {p0, v2}, Lp1/q;->e0(I)V

    goto :goto_2
.end method
