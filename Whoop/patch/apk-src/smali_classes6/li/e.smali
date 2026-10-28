.class public final Lli/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luh/f;


# instance fields
.field public final synthetic a:I

.field public final b:Lfi/o;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lfi/o;I)V
    .locals 0

    iput p3, p0, Lli/e;->a:I

    iput-object p1, p0, Lli/e;->c:Ljava/lang/Object;

    iput-object p2, p0, Lli/e;->b:Lfi/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq83/d;)Ljava/lang/Object;
    .locals 10

    iget p1, p0, Lli/e;->a:I

    const/4 v0, 0x0

    const/4 v1, 0x0

    iget-object v2, p0, Lli/e;->c:Ljava/lang/Object;

    iget-object v3, p0, Lli/e;->b:Lfi/o;

    packed-switch p1, :pswitch_data_0

    check-cast v2, Landroid/graphics/drawable/Drawable;

    sget-object p1, Lki/l;->a:[Landroid/graphics/Bitmap$Config;

    instance-of p1, v2, Landroid/graphics/drawable/VectorDrawable;

    const/4 v1, 0x1

    if-nez p1, :cond_1

    instance-of p1, v2, Lcc/p;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move p1, v0

    goto :goto_1

    :cond_1
    :goto_0
    move p1, v1

    :goto_1
    new-instance v4, Luh/g;

    if-eqz p1, :cond_3

    invoke-static {v3}, Lfi/k;->a(Lfi/o;)Landroid/graphics/Bitmap$Config;

    move-result-object v5

    iget-object v6, v3, Lfi/o;->b:Lgi/i;

    iget-object v7, v3, Lfi/o;->c:Lgi/g;

    iget-object v8, v3, Lfi/o;->d:Lgi/d;

    sget-object v9, Lgi/d;->x:Lgi/d;

    if-ne v8, v9, :cond_2

    move v0, v1

    :cond_2
    invoke-static {v2, v5, v6, v7, v0}, Lbi/g;->v(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;Lgi/i;Lgi/g;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v1, v3, Lfi/o;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    new-instance v2, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v2, v1, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    :cond_3
    invoke-static {v2}, Lrh/o;->c(Landroid/graphics/drawable/Drawable;)Lrh/j;

    move-result-object v0

    sget-object v1, Lsh/h;->x:Lsh/h;

    invoke-direct {v4, v0, p1, v1}, Luh/g;-><init>(Lrh/j;ZLsh/h;)V

    return-object v4

    :pswitch_0
    new-instance p1, Luh/h;

    check-cast v2, Ljava/nio/ByteBuffer;

    new-instance v0, Luh/b;

    invoke-direct {v0, v2}, Luh/b;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-static {v0}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v0

    iget-object v3, v3, Lfi/o;->f:Lne3/p;

    new-instance v4, Lsh/f;

    invoke-direct {v4, v2}, Lsh/f;-><init>(Ljava/nio/ByteBuffer;)V

    new-instance v2, Lsh/s;

    invoke-direct {v2, v0, v3, v4}, Lsh/s;-><init>(Lne3/j;Lne3/p;Ls2/a;)V

    sget-object v0, Lsh/h;->x:Lsh/h;

    invoke-direct {p1, v2, v1, v0}, Luh/h;-><init>(Lsh/q;Ljava/lang/String;Lsh/h;)V

    return-object p1

    :pswitch_1
    new-instance p1, Lne3/h;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    check-cast v2, [B

    invoke-virtual {p1, v2}, Lne3/h;->write([B)V

    iget-object v0, v3, Lfi/o;->f:Lne3/p;

    invoke-static {p1, v0}, Ls2/d;->h(Lne3/j;Lne3/p;)Lsh/s;

    move-result-object p1

    sget-object v0, Lsh/h;->x:Lsh/h;

    new-instance v2, Luh/h;

    invoke-direct {v2, p1, v1, v0}, Luh/h;-><init>(Lsh/q;Ljava/lang/String;Lsh/h;)V

    return-object v2

    :pswitch_2
    new-instance p1, Luh/g;

    check-cast v2, Landroid/graphics/Bitmap;

    iget-object v1, v3, Lfi/o;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    new-instance v3, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v3, v1, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-static {v3}, Lrh/o;->c(Landroid/graphics/drawable/Drawable;)Lrh/j;

    move-result-object v1

    sget-object v2, Lsh/h;->x:Lsh/h;

    invoke-direct {p1, v1, v0, v2}, Luh/g;-><init>(Lrh/j;ZLsh/h;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lli/c;

    check-cast v2, Landroid/media/MediaDataSource;

    invoke-direct {p1, v2}, Lli/c;-><init>(Landroid/media/MediaDataSource;)V

    invoke-static {p1}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object p1

    iget-object v0, v3, Lfi/o;->f:Lne3/p;

    new-instance v3, Lli/d;

    invoke-direct {v3, v2}, Lli/d;-><init>(Landroid/media/MediaDataSource;)V

    new-instance v2, Lsh/s;

    invoke-direct {v2, p1, v0, v3}, Lsh/s;-><init>(Lne3/j;Lne3/p;Ls2/a;)V

    new-instance p1, Luh/h;

    sget-object v0, Lsh/h;->y:Lsh/h;

    invoke-direct {p1, v2, v1, v0}, Luh/h;-><init>(Lsh/q;Ljava/lang/String;Lsh/h;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
