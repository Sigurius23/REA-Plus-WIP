.class public Lbc/l0;
.super Lce/w;
.source "SourceFile"


# static fields
.field public static F:Z = true

.field public static G:Z = true

.field public static H:Z = true

.field public static I:Z = true


# virtual methods
.method public f0(Landroid/view/View;I)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ne v0, v1, :cond_0

    invoke-super {p0, p1, p2}, Lce/w;->f0(Landroid/view/View;I)V

    return-void

    :cond_0
    sget-boolean v0, Lbc/l0;->I:Z

    if-eqz v0, :cond_1

    :try_start_0
    invoke-static {p1, p2}, Lbc/k0;->a(Landroid/view/View;I)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, Lbc/l0;->I:Z

    :cond_1
    return-void
.end method

.method public o0(Landroid/view/View;IIII)V
    .locals 1

    sget-boolean v0, Lbc/l0;->H:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, p2, p3, p4, p5}, Lbc/j0;->a(Landroid/view/View;IIII)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, Lbc/l0;->H:Z

    :cond_0
    return-void
.end method

.method public p0(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1

    sget-boolean v0, Lbc/l0;->F:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, p2}, Lbc/i0;->b(Landroid/view/View;Landroid/graphics/Matrix;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, Lbc/l0;->F:Z

    :cond_0
    return-void
.end method

.method public q0(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1

    sget-boolean v0, Lbc/l0;->G:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, p2}, Lbc/i0;->c(Landroid/view/View;Landroid/graphics/Matrix;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, Lbc/l0;->G:Z

    :cond_0
    return-void
.end method
