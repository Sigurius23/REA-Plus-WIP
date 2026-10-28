.class public final Lb3/n1;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements Lf3/a;


# instance fields
.field public O:Landroid/view/ViewGroup;


# virtual methods
.method public final o0(Landroidx/compose/ui/node/NodeCoordinator;La3/z0;Ls83/c;)Ljava/lang/Object;
    .locals 2

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1}, Landroidx/compose/ui/node/NodeCoordinator;->Z(J)J

    move-result-wide v0

    invoke-virtual {p2}, La3/z0;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh2/c;

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0, v1}, Lh2/c;->l(J)Lh2/c;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    iget-object p2, p0, Lb3/n1;->O:Landroid/view/ViewGroup;

    invoke-static {p1}, Li2/w0;->D(Lh2/c;)Landroid/graphics/Rect;

    move-result-object p1

    const/4 p3, 0x0

    invoke-virtual {p2, p1, p3}, Landroid/view/View;->requestRectangleOnScreen(Landroid/graphics/Rect;Z)Z

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
