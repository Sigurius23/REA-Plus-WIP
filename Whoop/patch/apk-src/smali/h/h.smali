.class public abstract Lh/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lh/c;->z:Lh/c;

    new-instance v1, Lp1/b0;

    invoke-direct {v1, v0}, Lp1/b0;-><init>(Lc93/a;)V

    sput-object v1, Lh/h;->a:Lp1/b0;

    return-void
.end method

.method public static a(Landroidx/compose/runtime/Composer;)Lg/b0;
    .locals 3

    check-cast p0, Lp1/q;

    sget-object v0, Lh/h;->a:Lp1/b0;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg/b0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const v0, 0x206f5359

    invoke-virtual {p0, v0}, Lp1/q;->e0(I)V

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:Lp1/u2;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-static {v0}, Landroidx/room/c1;->t(Landroid/view/View;)Lg/b0;

    move-result-object v0

    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    goto :goto_0

    :cond_0
    const v2, 0x206f49c8

    invoke-virtual {p0, v2}, Lp1/q;->e0(I)V

    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    :goto_0
    if-nez v0, :cond_3

    const v0, 0x206f5b2c

    invoke-virtual {p0, v0}, Lp1/q;->e0(I)V

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    :goto_1
    instance-of v2, v0, Landroid/content/ContextWrapper;

    if-eqz v2, :cond_2

    instance-of v2, v0, Lg/b0;

    if-eqz v2, :cond_1

    goto :goto_2

    :cond_1
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_2
    check-cast v0, Lg/b0;

    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    return-object v0

    :cond_3
    const v2, 0x206f4a19

    invoke-virtual {p0, v2}, Lp1/q;->e0(I)V

    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    return-object v0
.end method
