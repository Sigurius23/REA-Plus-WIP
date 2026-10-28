.class public final Lgh/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgh/h;


# instance fields
.field public final synthetic a:I

.field public final b:Lmh/m;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lmh/m;I)V
    .locals 0

    iput p3, p0, Lgh/c;->a:I

    iput-object p1, p0, Lgh/c;->c:Ljava/lang/Object;

    iput-object p2, p0, Lgh/c;->b:Lmh/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq83/d;)Ljava/lang/Object;
    .locals 7

    iget p1, p0, Lgh/c;->a:I

    const/4 v0, 0x0

    iget-object v1, p0, Lgh/c;->c:Ljava/lang/Object;

    iget-object v2, p0, Lgh/c;->b:Lmh/m;

    packed-switch p1, :pswitch_data_0

    check-cast v1, Landroid/graphics/drawable/Drawable;

    sget-object p1, Lqh/d;->a:[Landroid/graphics/Bitmap$Config;

    instance-of p1, v1, Landroid/graphics/drawable/VectorDrawable;

    if-nez p1, :cond_0

    instance-of p1, v1, Lcc/p;

    if-eqz p1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :cond_1
    new-instance p1, Lgh/e;

    if-eqz v0, :cond_2

    iget-object v3, v2, Lmh/m;->b:Landroid/graphics/Bitmap$Config;

    iget-object v4, v2, Lmh/m;->d:Lnh/h;

    iget-object v5, v2, Lmh/m;->e:Lnh/g;

    iget-boolean v6, v2, Lmh/m;->f:Z

    invoke-static {v1, v3, v4, v5, v6}, Ls2/e;->r(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;Lnh/h;Lnh/g;Z)Landroid/graphics/Bitmap;

    move-result-object v1

    iget-object v2, v2, Lmh/m;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    new-instance v3, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v3, v2, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    move-object v1, v3

    :cond_2
    sget-object v2, Ldh/g;->x:Ldh/g;

    invoke-direct {p1, v1, v0, v2}, Lgh/e;-><init>(Landroid/graphics/drawable/Drawable;ZLdh/g;)V

    return-object p1

    :pswitch_0
    check-cast v1, Ljava/nio/ByteBuffer;

    :try_start_0
    new-instance p1, Lne3/h;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1, v1}, Lne3/h;->write(Ljava/nio/ByteBuffer;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    new-instance v0, Lgh/n;

    iget-object v1, v2, Lmh/m;->a:Landroid/content/Context;

    new-instance v2, Ldh/z;

    new-instance v3, Lal0/f;

    const/4 v4, 0x3

    invoke-direct {v3, v1, v4}, Lal0/f;-><init>(Landroid/content/Context;I)V

    const/4 v1, 0x0

    invoke-direct {v2, p1, v3, v1}, Ldh/z;-><init>(Lne3/j;Lc93/a;Ldt/b;)V

    sget-object p1, Ldh/g;->x:Ldh/g;

    invoke-direct {v0, v2, v1, p1}, Lgh/n;-><init>(Ldh/x;Ljava/lang/String;Ldh/g;)V

    return-object v0

    :catchall_0
    move-exception p1

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    throw p1

    :pswitch_1
    new-instance p1, Lgh/e;

    check-cast v1, Landroid/graphics/Bitmap;

    iget-object v2, v2, Lmh/m;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    new-instance v3, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v3, v2, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    sget-object v1, Ldh/g;->x:Ldh/g;

    invoke-direct {p1, v3, v0, v1}, Lgh/e;-><init>(Landroid/graphics/drawable/Drawable;ZLdh/g;)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
