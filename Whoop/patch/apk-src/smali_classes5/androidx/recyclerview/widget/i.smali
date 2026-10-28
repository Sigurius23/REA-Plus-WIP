.class public final Landroidx/recyclerview/widget/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/recyclerview/widget/a1;


# instance fields
.field public E:Ljava/lang/Object;

.field public final w:Landroidx/recyclerview/widget/a1;

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/a1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/recyclerview/widget/i;->x:I

    const/4 v0, -0x1

    iput v0, p0, Landroidx/recyclerview/widget/i;->y:I

    iput v0, p0, Landroidx/recyclerview/widget/i;->z:I

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/recyclerview/widget/i;->E:Ljava/lang/Object;

    iput-object p1, p0, Landroidx/recyclerview/widget/i;->w:Landroidx/recyclerview/widget/a1;

    return-void
.end method


# virtual methods
.method public final a(II)V
    .locals 4

    iget v0, p0, Landroidx/recyclerview/widget/i;->x:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget v0, p0, Landroidx/recyclerview/widget/i;->y:I

    if-lt p1, v0, :cond_0

    iget v2, p0, Landroidx/recyclerview/widget/i;->z:I

    add-int v3, v0, v2

    if-gt p1, v3, :cond_0

    add-int/2addr v2, p2

    iput v2, p0, Landroidx/recyclerview/widget/i;->z:I

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Landroidx/recyclerview/widget/i;->y:I

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/i;->e()V

    iput p1, p0, Landroidx/recyclerview/widget/i;->y:I

    iput p2, p0, Landroidx/recyclerview/widget/i;->z:I

    iput v1, p0, Landroidx/recyclerview/widget/i;->x:I

    return-void
.end method

.method public final b(II)V
    .locals 3

    iget v0, p0, Landroidx/recyclerview/widget/i;->x:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget v0, p0, Landroidx/recyclerview/widget/i;->y:I

    if-lt v0, p1, :cond_0

    add-int v2, p1, p2

    if-gt v0, v2, :cond_0

    iget v0, p0, Landroidx/recyclerview/widget/i;->z:I

    add-int/2addr v0, p2

    iput v0, p0, Landroidx/recyclerview/widget/i;->z:I

    iput p1, p0, Landroidx/recyclerview/widget/i;->y:I

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/i;->e()V

    iput p1, p0, Landroidx/recyclerview/widget/i;->y:I

    iput p2, p0, Landroidx/recyclerview/widget/i;->z:I

    iput v1, p0, Landroidx/recyclerview/widget/i;->x:I

    return-void
.end method

.method public final c(IILjava/lang/Object;)V
    .locals 5

    iget v0, p0, Landroidx/recyclerview/widget/i;->x:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget v0, p0, Landroidx/recyclerview/widget/i;->y:I

    iget v2, p0, Landroidx/recyclerview/widget/i;->z:I

    add-int/2addr v2, v0

    if-gt p1, v2, :cond_0

    add-int v3, p1, p2

    if-lt v3, v0, :cond_0

    iget-object v4, p0, Landroidx/recyclerview/widget/i;->E:Ljava/lang/Object;

    if-ne v4, p3, :cond_0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Landroidx/recyclerview/widget/i;->y:I

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result p1

    iget p2, p0, Landroidx/recyclerview/widget/i;->y:I

    sub-int/2addr p1, p2

    iput p1, p0, Landroidx/recyclerview/widget/i;->z:I

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/i;->e()V

    iput p1, p0, Landroidx/recyclerview/widget/i;->y:I

    iput p2, p0, Landroidx/recyclerview/widget/i;->z:I

    iput-object p3, p0, Landroidx/recyclerview/widget/i;->E:Ljava/lang/Object;

    iput v1, p0, Landroidx/recyclerview/widget/i;->x:I

    return-void
.end method

.method public final d(II)V
    .locals 1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/i;->e()V

    iget-object v0, p0, Landroidx/recyclerview/widget/i;->w:Landroidx/recyclerview/widget/a1;

    invoke-interface {v0, p1, p2}, Landroidx/recyclerview/widget/a1;->d(II)V

    return-void
.end method

.method public final e()V
    .locals 4

    iget v0, p0, Landroidx/recyclerview/widget/i;->x:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    iget-object v2, p0, Landroidx/recyclerview/widget/i;->w:Landroidx/recyclerview/widget/a1;

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget v0, p0, Landroidx/recyclerview/widget/i;->y:I

    iget v1, p0, Landroidx/recyclerview/widget/i;->z:I

    iget-object v3, p0, Landroidx/recyclerview/widget/i;->E:Ljava/lang/Object;

    invoke-interface {v2, v0, v1, v3}, Landroidx/recyclerview/widget/a1;->c(IILjava/lang/Object;)V

    goto :goto_0

    :cond_2
    iget v0, p0, Landroidx/recyclerview/widget/i;->y:I

    iget v1, p0, Landroidx/recyclerview/widget/i;->z:I

    invoke-interface {v2, v0, v1}, Landroidx/recyclerview/widget/a1;->b(II)V

    goto :goto_0

    :cond_3
    iget v0, p0, Landroidx/recyclerview/widget/i;->y:I

    iget v1, p0, Landroidx/recyclerview/widget/i;->z:I

    invoke-interface {v2, v0, v1}, Landroidx/recyclerview/widget/a1;->a(II)V

    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/recyclerview/widget/i;->E:Ljava/lang/Object;

    const/4 v0, 0x0

    iput v0, p0, Landroidx/recyclerview/widget/i;->x:I

    return-void
.end method
