.class public final Lz0/j;
.super Landroid/view/ActionMode$Callback2;
.source "SourceFile"

# interfaces
.implements Landroid/view/ActionMode$Callback;


# instance fields
.field public final a:Lz0/d;


# direct methods
.method public constructor <init>(Lz0/d;)V
    .locals 0

    invoke-direct {p0}, Landroid/view/ActionMode$Callback2;-><init>()V

    iput-object p1, p0, Lz0/j;->a:Lz0/d;

    return-void
.end method


# virtual methods
.method public final onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z
    .locals 0

    iget-object p1, p0, Lz0/j;->a:Lz0/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    return p1
.end method

.method public final onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z
    .locals 0

    iget-object p1, p0, Lz0/j;->a:Lz0/d;

    invoke-virtual {p1, p2}, Lz0/d;->a(Landroid/view/Menu;)Z

    invoke-interface {p2}, Landroid/view/Menu;->size()I

    move-result p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onDestroyActionMode(Landroid/view/ActionMode;)V
    .locals 0

    iget-object p1, p0, Lz0/j;->a:Lz0/d;

    iget-object p1, p1, Lz0/d;->a:Lz0/e;

    invoke-virtual {p1}, Lz0/e;->close()V

    return-void
.end method

.method public final onGetContentRect(Landroid/view/ActionMode;Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 2

    iget-object p1, p0, Lz0/j;->a:Lz0/d;

    iget-object p1, p1, Lz0/d;->c:Lz0/b;

    invoke-virtual {p1}, Lz0/b;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh2/c;

    iget p2, p1, Lh2/c;->a:F

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    iget v0, p1, Lh2/c;->b:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget v1, p1, Lh2/c;->c:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iget p1, p1, Lh2/c;->d:F

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    invoke-virtual {p3, p2, v0, v1, p1}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method

.method public final onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z
    .locals 0

    iget-object p1, p0, Lz0/j;->a:Lz0/d;

    invoke-virtual {p1, p2}, Lz0/d;->a(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method
