.class public final Lsh/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lkotlin/jvm/internal/b0;

.field public final synthetic c:Lsh/k;


# direct methods
.method public synthetic constructor <init>(Lsh/k;Lkotlin/jvm/internal/b0;I)V
    .locals 0

    iput p3, p0, Lsh/w;->a:I

    iput-object p1, p0, Lsh/w;->c:Lsh/k;

    iput-object p2, p0, Lsh/w;->b:Lkotlin/jvm/internal/b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onHeaderDecoded(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$ImageInfo;Landroid/graphics/ImageDecoder$Source;)V
    .locals 7

    iget p3, p0, Lsh/w;->a:I

    packed-switch p3, :pswitch_data_0

    invoke-virtual {p2}, Landroid/graphics/ImageDecoder$ImageInfo;->getSize()Landroid/util/Size;

    move-result-object p2

    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    move-result p3

    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    move-result p2

    iget-object v0, p0, Lsh/w;->c:Lsh/k;

    check-cast v0, Lvh/d;

    iget-object v0, v0, Lvh/d;->b:Lfi/o;

    iget-object v1, v0, Lfi/o;->b:Lgi/i;

    iget-object v2, v0, Lfi/o;->c:Lgi/g;

    sget-object v3, Lfi/j;->b:Lf93/a;

    invoke-static {v0, v3}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lgi/i;

    invoke-static {p3, p2, v1, v2, v3}, Ls/s;->f(IILgi/i;Lgi/g;Lgi/i;)J

    move-result-wide v1

    const/16 v3, 0x20

    shr-long v3, v1, v3

    long-to-int v3, v3

    const-wide v4, 0xffffffffL

    and-long/2addr v1, v4

    long-to-int v1, v1

    const/4 v2, 0x1

    if-lez p3, :cond_3

    if-lez p2, :cond_3

    if-ne p3, v3, :cond_0

    if-eq p2, v1, :cond_3

    :cond_0
    iget-object v4, v0, Lfi/o;->c:Lgi/g;

    invoke-static {p3, p2, v3, v1, v4}, Ls/s;->g(IIIILgi/g;)D

    move-result-wide v3

    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    cmpg-double v1, v3, v5

    if-gez v1, :cond_1

    move v1, v2

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iget-object v5, p0, Lsh/w;->b:Lkotlin/jvm/internal/b0;

    iput-boolean v1, v5, Lkotlin/jvm/internal/b0;->w:Z

    if-nez v1, :cond_2

    iget-object v1, v0, Lfi/o;->d:Lgi/d;

    sget-object v5, Lgi/d;->w:Lgi/d;

    if-ne v1, v5, :cond_3

    :cond_2
    int-to-double v5, p3

    mul-double/2addr v5, v3

    invoke-static {v5, v6}, Le93/b;->W(D)I

    move-result p3

    int-to-double v5, p2

    mul-double/2addr v3, v5

    invoke-static {v3, v4}, Le93/b;->W(D)I

    move-result p2

    invoke-virtual {p1, p3, p2}, Landroid/graphics/ImageDecoder;->setTargetSize(II)V

    :cond_3
    invoke-static {v0}, Lfi/k;->a(Lfi/o;)Landroid/graphics/Bitmap$Config;

    move-result-object p2

    invoke-static {p2}, Lx30/s0;->u(Landroid/graphics/Bitmap$Config;)Z

    move-result p2

    if-eqz p2, :cond_4

    const/4 p2, 0x3

    goto :goto_1

    :cond_4
    move p2, v2

    :goto_1
    invoke-virtual {p1, p2}, Landroid/graphics/ImageDecoder;->setAllocator(I)V

    sget-object p2, Lfi/k;->g:Lf93/a;

    invoke-static {v0, p2}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    xor-int/2addr p2, v2

    invoke-virtual {p1, p2}, Landroid/graphics/ImageDecoder;->setMemorySizePolicy(I)V

    sget-object p2, Lfi/k;->c:Lf93/a;

    invoke-static {v0, p2}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/graphics/ColorSpace;

    if-eqz p3, :cond_5

    invoke-static {v0, p2}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/graphics/ColorSpace;

    invoke-virtual {p1, p2}, Landroid/graphics/ImageDecoder;->setTargetColorSpace(Landroid/graphics/ColorSpace;)V

    :cond_5
    sget-object p2, Lvh/f;->b:Lf93/a;

    invoke-static {v0, p2}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_6

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/graphics/ImageDecoder;->setPostProcessor(Landroid/graphics/PostProcessor;)V

    return-void

    :cond_6
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :pswitch_0
    invoke-virtual {p2}, Landroid/graphics/ImageDecoder$ImageInfo;->getSize()Landroid/util/Size;

    move-result-object p2

    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    move-result p3

    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    move-result p2

    iget-object v0, p0, Lsh/w;->c:Lsh/k;

    check-cast v0, Lsh/x;

    iget-object v0, v0, Lsh/x;->c:Lfi/o;

    iget-object v1, v0, Lfi/o;->b:Lgi/i;

    iget-object v2, v0, Lfi/o;->c:Lgi/g;

    sget-object v3, Lfi/j;->b:Lf93/a;

    invoke-static {v0, v3}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lgi/i;

    invoke-static {p3, p2, v1, v2, v3}, Ls/s;->f(IILgi/i;Lgi/g;Lgi/i;)J

    move-result-wide v1

    const/16 v3, 0x20

    shr-long v3, v1, v3

    long-to-int v3, v3

    const-wide v4, 0xffffffffL

    and-long/2addr v1, v4

    long-to-int v1, v1

    const/4 v2, 0x1

    if-lez p3, :cond_a

    if-lez p2, :cond_a

    if-ne p3, v3, :cond_7

    if-eq p2, v1, :cond_a

    :cond_7
    iget-object v4, v0, Lfi/o;->c:Lgi/g;

    invoke-static {p3, p2, v3, v1, v4}, Ls/s;->g(IIIILgi/g;)D

    move-result-wide v3

    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    cmpg-double v1, v3, v5

    if-gez v1, :cond_8

    move v1, v2

    goto :goto_2

    :cond_8
    const/4 v1, 0x0

    :goto_2
    iget-object v5, p0, Lsh/w;->b:Lkotlin/jvm/internal/b0;

    iput-boolean v1, v5, Lkotlin/jvm/internal/b0;->w:Z

    if-nez v1, :cond_9

    iget-object v1, v0, Lfi/o;->d:Lgi/d;

    sget-object v5, Lgi/d;->w:Lgi/d;

    if-ne v1, v5, :cond_a

    :cond_9
    int-to-double v5, p3

    mul-double/2addr v5, v3

    invoke-static {v5, v6}, Le93/b;->W(D)I

    move-result p3

    int-to-double v5, p2

    mul-double/2addr v3, v5

    invoke-static {v3, v4}, Le93/b;->W(D)I

    move-result p2

    invoke-virtual {p1, p3, p2}, Landroid/graphics/ImageDecoder;->setTargetSize(II)V

    :cond_a
    new-instance p2, Lsh/t;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1, p2}, Landroid/graphics/ImageDecoder;->setOnPartialImageListener(Landroid/graphics/ImageDecoder$OnPartialImageListener;)V

    invoke-static {v0}, Lfi/k;->a(Lfi/o;)Landroid/graphics/Bitmap$Config;

    move-result-object p2

    invoke-static {p2}, Lx30/s0;->u(Landroid/graphics/Bitmap$Config;)Z

    move-result p2

    if-eqz p2, :cond_b

    const/4 p2, 0x3

    goto :goto_3

    :cond_b
    move p2, v2

    :goto_3
    invoke-virtual {p1, p2}, Landroid/graphics/ImageDecoder;->setAllocator(I)V

    sget-object p2, Lfi/k;->g:Lf93/a;

    invoke-static {v0, p2}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    xor-int/2addr p2, v2

    invoke-virtual {p1, p2}, Landroid/graphics/ImageDecoder;->setMemorySizePolicy(I)V

    sget-object p2, Lfi/k;->c:Lf93/a;

    invoke-static {v0, p2}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/graphics/ColorSpace;

    if-eqz p3, :cond_c

    invoke-static {v0, p2}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/graphics/ColorSpace;

    invoke-virtual {p1, p2}, Landroid/graphics/ImageDecoder;->setTargetColorSpace(Landroid/graphics/ColorSpace;)V

    :cond_c
    sget-object p2, Lfi/k;->d:Lf93/a;

    invoke-static {v0, p2}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    xor-int/2addr p2, v2

    invoke-virtual {p1, p2}, Landroid/graphics/ImageDecoder;->setUnpremultipliedRequired(Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
