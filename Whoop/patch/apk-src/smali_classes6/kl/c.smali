.class public final Lkl/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwk/l;


# instance fields
.field public final b:Lwk/l;


# direct methods
.method public constructor <init>(Lwk/l;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Argument must not be null"

    invoke-static {p1, v0}, Lpf/c;->p(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lkl/c;->b:Lwk/l;

    return-void
.end method


# virtual methods
.method public final a(Ljava/security/MessageDigest;)V
    .locals 1

    iget-object v0, p0, Lkl/c;->b:Lwk/l;

    invoke-interface {v0, p1}, Lwk/e;->a(Ljava/security/MessageDigest;)V

    return-void
.end method

.method public final b(Landroid/content/Context;Lzk/z;II)Lzk/z;
    .locals 4

    invoke-interface {p2}, Lzk/z;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkl/b;

    invoke-static {p1}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;)Lcom/bumptech/glide/b;

    move-result-object v1

    iget-object v1, v1, Lcom/bumptech/glide/b;->x:Lal/b;

    iget-object v2, v0, Lkl/b;->w:Lar/a;

    iget-object v2, v2, Lar/a;->b:Ljava/lang/Object;

    check-cast v2, Lkl/g;

    invoke-virtual {v2}, Lkl/g;->c()Landroid/graphics/Bitmap;

    move-result-object v2

    new-instance v3, Lgl/c;

    invoke-direct {v3, v1, v2}, Lgl/c;-><init>(Lal/b;Landroid/graphics/Bitmap;)V

    iget-object v1, p0, Lkl/c;->b:Lwk/l;

    invoke-interface {v1, p1, v3, p3, p4}, Lwk/l;->b(Landroid/content/Context;Lzk/z;II)Lzk/z;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_0

    invoke-virtual {v3}, Lgl/c;->a()V

    :cond_0
    invoke-interface {p1}, Lzk/z;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    iget-object p3, v0, Lkl/b;->w:Lar/a;

    iget-object p3, p3, Lar/a;->b:Ljava/lang/Object;

    check-cast p3, Lkl/g;

    invoke-virtual {p3, v1, p1}, Lkl/g;->i(Lwk/l;Landroid/graphics/Bitmap;)V

    return-object p2
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lkl/c;

    if-eqz v0, :cond_0

    check-cast p1, Lkl/c;

    iget-object v0, p0, Lkl/c;->b:Lwk/l;

    iget-object p1, p1, Lkl/c;->b:Lwk/l;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lkl/c;->b:Lwk/l;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
