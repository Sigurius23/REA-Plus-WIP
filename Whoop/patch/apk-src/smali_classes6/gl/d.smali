.class public abstract Lgl/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwk/l;


# virtual methods
.method public final b(Landroid/content/Context;Lzk/z;II)Lzk/z;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lzk/z;",
            "II)",
            "Lzk/z;"
        }
    .end annotation

    invoke-static {p3, p4}, Ltl/l;->h(II)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p1}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;)Lcom/bumptech/glide/b;

    move-result-object p1

    iget-object p1, p1, Lcom/bumptech/glide/b;->x:Lal/b;

    invoke-interface {p2}, Lzk/z;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    const/high16 v1, -0x80000000

    if-ne p3, v1, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p3

    :cond_0
    if-ne p4, v1, :cond_1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p4

    :cond_1
    invoke-virtual {p0, p1, v0, p3, p4}, Lgl/d;->c(Lal/b;Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_2

    return-object p2

    :cond_2
    invoke-static {p1, p3}, Lgl/c;->b(Lal/b;Landroid/graphics/Bitmap;)Lgl/c;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, " or height: "

    const-string v0, " less than or equal to zero and not Target.SIZE_ORIGINAL"

    const-string v1, "Cannot apply transformation on width: "

    invoke-static {p3, p4, v1, p2, v0}, Lm4/a;->e(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract c(Lal/b;Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
.end method
