.class public final Ls40/i1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ls40/b1;

    invoke-direct {v0, p1}, Ls40/b1;-><init>(Landroid/content/Context;)V

    iget v1, v0, Ls40/b1;->b:I

    const v2, 0x7f0604ce

    invoke-static {p1, v1, v2}, Ls40/i1;->a(Landroid/content/Context;II)I

    move-result v1

    iput v1, p0, Ls40/i1;->a:I

    iget v2, v0, Ls40/b1;->c:I

    const v3, 0x7f0604de

    invoke-static {p1, v2, v3}, Ls40/i1;->a(Landroid/content/Context;II)I

    iget v0, v0, Ls40/b1;->e:I

    const v2, 0x7f0604db

    invoke-static {p1, v0, v2}, Ls40/i1;->a(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Ls40/i1;->b:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0b005b

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v2

    invoke-static {v1, v2}, Lv4/a;->g(II)I

    move-result v1

    iput v1, p0, Ls40/i1;->c:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p1

    invoke-static {v0, p1}, Lv4/a;->g(II)I

    move-result p1

    iput p1, p0, Ls40/i1;->d:I

    return-void
.end method

.method public static a(Landroid/content/Context;II)I
    .locals 2

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    invoke-static {p0, p2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p0

    return p0

    :cond_0
    return p1
.end method
