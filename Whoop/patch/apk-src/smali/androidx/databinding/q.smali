.class public final Landroidx/databinding/q;
.super Landroidx/databinding/b;
.source "SourceFile"


# virtual methods
.method public final a(Ljava/lang/Object;Landroidx/databinding/a;I)V
    .locals 0

    invoke-static {p1}, Lr;->t(Ljava/lang/Object;)V

    check-cast p2, Landroidx/databinding/a0;

    const/4 p1, 0x1

    const/4 p2, 0x0

    if-eq p3, p1, :cond_2

    const/4 p1, 0x2

    if-eq p3, p1, :cond_1

    const/4 p1, 0x3

    if-eq p3, p1, :cond_0

    return-void

    :cond_0
    throw p2

    :cond_1
    throw p2

    :cond_2
    throw p2
.end method
