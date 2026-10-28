.class public final Ln3/a;
.super Landroid/text/SegmentFinder;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lxl/a;


# direct methods
.method public constructor <init>(Lxl/a;)V
    .locals 0

    iput-object p1, p0, Ln3/a;->a:Lxl/a;

    invoke-direct {p0}, Landroid/text/SegmentFinder;-><init>()V

    return-void
.end method


# virtual methods
.method public final nextEndBoundary(I)I
    .locals 1

    iget-object v0, p0, Ln3/a;->a:Lxl/a;

    invoke-virtual {v0, p1}, Lxl/a;->d(I)I

    move-result p1

    return p1
.end method

.method public final nextStartBoundary(I)I
    .locals 1

    iget-object v0, p0, Ln3/a;->a:Lxl/a;

    invoke-virtual {v0, p1}, Lxl/a;->b(I)I

    move-result p1

    return p1
.end method

.method public final previousEndBoundary(I)I
    .locals 1

    iget-object v0, p0, Ln3/a;->a:Lxl/a;

    invoke-virtual {v0, p1}, Lxl/a;->f(I)I

    move-result p1

    return p1
.end method

.method public final previousStartBoundary(I)I
    .locals 1

    iget-object v0, p0, Ln3/a;->a:Lxl/a;

    invoke-virtual {v0, p1}, Lxl/a;->c(I)I

    move-result p1

    return p1
.end method
