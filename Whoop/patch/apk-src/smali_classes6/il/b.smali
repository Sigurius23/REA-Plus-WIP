.class public final Lil/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzk/z;
.implements Lzk/v;


# instance fields
.field public final w:Landroid/graphics/drawable/Drawable;

.field public final synthetic x:I


# direct methods
.method public constructor <init>(ILandroid/graphics/drawable/Drawable;)V
    .locals 0

    iput p1, p0, Lil/b;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "Argument must not be null"

    invoke-static {p2, p1}, Lpf/c;->p(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lil/b;->w:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public static b(Landroid/graphics/drawable/Drawable;)Lil/b;
    .locals 2

    if-eqz p0, :cond_0

    new-instance v0, Lil/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lil/b;-><init>(ILandroid/graphics/drawable/Drawable;)V

    return-object v0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private final d()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    iget v0, p0, Lil/b;->x:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lil/b;->w:Landroid/graphics/drawable/Drawable;

    check-cast v0, Lkl/b;

    invoke-virtual {v0}, Lkl/b;->stop()V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lkl/b;->z:Z

    iget-object v0, v0, Lkl/b;->w:Lar/a;

    iget-object v0, v0, Lar/a;->b:Ljava/lang/Object;

    check-cast v0, Lkl/g;

    iget-object v2, v0, Lkl/g;->d:Lcom/bumptech/glide/h;

    iget-object v3, v0, Lkl/g;->c:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    iget-object v3, v0, Lkl/g;->l:Landroid/graphics/Bitmap;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    iget-object v5, v0, Lkl/g;->e:Lal/b;

    invoke-interface {v5, v3}, Lal/b;->h(Landroid/graphics/Bitmap;)V

    iput-object v4, v0, Lkl/g;->l:Landroid/graphics/Bitmap;

    :cond_0
    const/4 v3, 0x0

    iput-boolean v3, v0, Lkl/g;->f:Z

    iget-object v3, v0, Lkl/g;->i:Lkl/d;

    if-eqz v3, :cond_1

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/h;->k(Lql/i;)V

    iput-object v4, v0, Lkl/g;->i:Lkl/d;

    :cond_1
    iget-object v3, v0, Lkl/g;->k:Lkl/d;

    if-eqz v3, :cond_2

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/h;->k(Lql/i;)V

    iput-object v4, v0, Lkl/g;->k:Lkl/d;

    :cond_2
    iget-object v3, v0, Lkl/g;->m:Lkl/d;

    if-eqz v3, :cond_3

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/h;->k(Lql/i;)V

    iput-object v4, v0, Lkl/g;->m:Lkl/d;

    :cond_3
    iget-object v2, v0, Lkl/g;->a:Luk/e;

    iget-object v3, v2, Luk/e;->c:Lcom/google/crypto/tink/internal/l0;

    iput-object v4, v2, Luk/e;->l:Luk/c;

    iget-object v5, v2, Luk/e;->i:[B

    if-eqz v5, :cond_4

    iget-object v6, v3, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v6, Lal/g;

    invoke-virtual {v6, v5}, Lal/g;->g(Ljava/lang/Object;)V

    :cond_4
    iget-object v5, v2, Luk/e;->j:[I

    if-eqz v5, :cond_5

    iget-object v6, v3, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v6, Lal/g;

    invoke-virtual {v6, v5}, Lal/g;->g(Ljava/lang/Object;)V

    :cond_5
    iget-object v5, v2, Luk/e;->m:Landroid/graphics/Bitmap;

    if-eqz v5, :cond_6

    iget-object v6, v3, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v6, Lal/b;

    invoke-interface {v6, v5}, Lal/b;->h(Landroid/graphics/Bitmap;)V

    :cond_6
    iput-object v4, v2, Luk/e;->m:Landroid/graphics/Bitmap;

    iput-object v4, v2, Luk/e;->d:Ljava/nio/ByteBuffer;

    iput-object v4, v2, Luk/e;->s:Ljava/lang/Boolean;

    iget-object v2, v2, Luk/e;->e:[B

    if-eqz v2, :cond_7

    iget-object v3, v3, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v3, Lal/g;

    invoke-virtual {v3, v2}, Lal/g;->g(Ljava/lang/Object;)V

    :cond_7
    iput-boolean v1, v0, Lkl/g;->j:Z

    :pswitch_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c()Ljava/lang/Class;
    .locals 1

    iget v0, p0, Lil/b;->x:I

    packed-switch v0, :pswitch_data_0

    const-class v0, Lkl/b;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lil/b;->w:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lil/b;->w:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v1

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public final getSize()I
    .locals 4

    iget v0, p0, Lil/b;->x:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lil/b;->w:Landroid/graphics/drawable/Drawable;

    check-cast v0, Lkl/b;

    iget-object v0, v0, Lkl/b;->w:Lar/a;

    iget-object v0, v0, Lar/a;->b:Ljava/lang/Object;

    check-cast v0, Lkl/g;

    iget-object v1, v0, Lkl/g;->a:Luk/e;

    iget-object v2, v1, Luk/e;->d:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/Buffer;->limit()I

    move-result v2

    iget-object v3, v1, Luk/e;->i:[B

    array-length v3, v3

    add-int/2addr v2, v3

    iget-object v1, v1, Luk/e;->j:[I

    array-length v1, v1

    mul-int/lit8 v1, v1, 0x4

    add-int/2addr v1, v2

    iget v0, v0, Lkl/g;->n:I

    add-int/2addr v1, v0

    return v1

    :pswitch_0
    iget-object v0, p0, Lil/b;->w:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    mul-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x4

    const/4 v1, 0x1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public initialize()V
    .locals 2

    iget v0, p0, Lil/b;->x:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lil/b;->w:Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    goto :goto_0

    :cond_0
    instance-of v1, v0, Lkl/b;

    if-eqz v1, :cond_1

    check-cast v0, Lkl/b;

    iget-object v0, v0, Lkl/b;->w:Lar/a;

    iget-object v0, v0, Lar/a;->b:Ljava/lang/Object;

    check-cast v0, Lkl/g;

    invoke-virtual {v0}, Lkl/g;->c()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    :cond_1
    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lil/b;->w:Landroid/graphics/drawable/Drawable;

    check-cast v0, Lkl/b;

    iget-object v0, v0, Lkl/b;->w:Lar/a;

    iget-object v0, v0, Lar/a;->b:Ljava/lang/Object;

    check-cast v0, Lkl/g;

    invoke-virtual {v0}, Lkl/g;->c()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
