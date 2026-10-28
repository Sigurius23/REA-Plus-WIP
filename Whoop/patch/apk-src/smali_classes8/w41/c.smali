.class public abstract Lw41/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a.\u0010\u000b\u001a\u00020\u00042\u001c\u0010\n\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0008\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0081@\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/google/android/gms/maps/model/LatLngBounds;",
        "bounds",
        "Leu/g;",
        "cameraPositionState",
        "Ll83/a0;",
        "b",
        "(Lcom/google/android/gms/maps/model/LatLngBounds;Leu/g;Landroidx/compose/runtime/Composer;I)V",
        "Lkotlin/Function1;",
        "Lq83/d;",
        "",
        "animate",
        "d",
        "(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lcom/google/android/gms/maps/model/LatLngBounds;Leu/g;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lw41/c;->c(Lcom/google/android/gms/maps/model/LatLngBounds;Leu/g;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lcom/google/android/gms/maps/model/LatLngBounds;Leu/g;Landroidx/compose/runtime/Composer;I)V
    .locals 6

    const-string v0, "bounds"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraPositionState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, -0x3238fdd2

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p2, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    const/16 v2, 0x20

    if-nez v1, :cond_4

    and-int/lit8 v1, p3, 0x40

    if-nez v1, :cond_2

    invoke-virtual {p2, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_2

    :cond_2
    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_2
    if-eqz v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    const/16 v1, 0x10

    :goto_3
    or-int/2addr v0, v1

    :cond_4
    and-int/lit8 v1, v0, 0x13

    const/16 v3, 0x12

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v1, v3, :cond_5

    move v1, v5

    goto :goto_4

    :cond_5
    move v1, v4

    :goto_4
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {p2, v3, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_a

    and-int/lit8 v1, v0, 0x70

    if-eq v1, v2, :cond_6

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_7

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_6
    move v4, v5

    :cond_7
    invoke-virtual {p2, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v4

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_8

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v1, v0, :cond_9

    :cond_8
    new-instance v1, Lw41/c$a;

    const/4 v0, 0x0

    invoke-direct {v1, p1, p0, v0}, Lw41/c$a;-><init>(Leu/g;Lcom/google/android/gms/maps/model/LatLngBounds;Lq83/d;)V

    invoke-virtual {p2, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v1, Lc93/m;

    invoke-static {p2, v1, p0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    goto :goto_5

    :cond_a
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_b

    new-instance v0, Lv90/e;

    const/16 v1, 0xc

    invoke-direct {v0, p0, p1, p3, v1}, Lv90/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final c(Lcom/google/android/gms/maps/model/LatLngBounds;Leu/g;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lw41/c;->b(Lcom/google/android/gms/maps/model/LatLngBounds;Leu/g;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation runtime Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lw41/c$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lw41/c$b;

    iget v1, v0, Lw41/c$b;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lw41/c$b;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lw41/c$b;

    invoke-direct {v0, p1}, Lw41/c$b;-><init>(Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lw41/c$b;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lw41/c$b;->y:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p0, v0, Lw41/c$b;->w:Ljava/lang/Object;

    check-cast p0, Lkotlin/jvm/functions/Function1;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    const/4 p1, 0x0

    :try_start_1
    iput-object p1, v0, Lw41/c$b;->w:Ljava/lang/Object;

    iput v4, v0, Lw41/c$b;->y:I

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p0, v1, :cond_3

    return-object v1

    :goto_1
    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    invoke-virtual {p1}, Ltr2/n$a;->c()Ltr2/n;

    move-result-object p1

    const-string v0, "NullPointerException on Live Activity GoogleMap"

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {p1, v0, p0, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_3

    :goto_2
    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    invoke-virtual {p1}, Ltr2/n$a;->c()Ltr2/n;

    move-result-object p1

    const-string v0, "IllegalStateException on Live Activity GoogleMap"

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {p1, v0, p0, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_3
    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
