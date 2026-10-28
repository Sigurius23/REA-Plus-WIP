.class public final Ldh/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/g0;

.field public final synthetic b:Ldh/w;

.field public final synthetic c:Lkotlin/jvm/internal/b0;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Ldh/w;Lkotlin/jvm/internal/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldh/u;->a:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Ldh/u;->b:Ldh/w;

    iput-object p3, p0, Ldh/u;->c:Lkotlin/jvm/internal/b0;

    return-void
.end method


# virtual methods
.method public final onHeaderDecoded(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$ImageInfo;Landroid/graphics/ImageDecoder$Source;)V
    .locals 6

    iget-object p3, p0, Ldh/u;->a:Lkotlin/jvm/internal/g0;

    iput-object p1, p3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-virtual {p2}, Landroid/graphics/ImageDecoder$ImageInfo;->getSize()Landroid/util/Size;

    move-result-object p2

    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    move-result p3

    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    move-result p2

    iget-object v0, p0, Ldh/u;->b:Ldh/w;

    iget-object v0, v0, Ldh/w;->b:Lmh/m;

    iget-object v1, v0, Lmh/m;->d:Lnh/h;

    iget-object v2, v0, Lmh/m;->e:Lnh/g;

    sget-object v3, Lnh/h;->c:Lnh/h;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v1, p3

    goto :goto_0

    :cond_0
    iget-object v1, v1, Lnh/h;->a:Ldt/b;

    invoke-static {v1, v2}, Lio/sentry/config/a;->c0(Ldt/b;Lnh/g;)I

    move-result v1

    :goto_0
    iget-object v2, v0, Lmh/m;->d:Lnh/h;

    iget-object v4, v0, Lmh/m;->e:Lnh/g;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    move v2, p2

    goto :goto_1

    :cond_1
    iget-object v2, v2, Lnh/h;->b:Ldt/b;

    invoke-static {v2, v4}, Lio/sentry/config/a;->c0(Ldt/b;Lnh/g;)I

    move-result v2

    :goto_1
    const/4 v3, 0x1

    if-lez p3, :cond_5

    if-lez p2, :cond_5

    if-ne p3, v1, :cond_2

    if-eq p2, v2, :cond_5

    :cond_2
    iget-object v4, v0, Lmh/m;->e:Lnh/g;

    invoke-static {p3, p2, v1, v2, v4}, Landroidx/room/c1;->k(IIIILnh/g;)D

    move-result-wide v1

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    cmpg-double v4, v1, v4

    if-gez v4, :cond_3

    move v4, v3

    goto :goto_2

    :cond_3
    const/4 v4, 0x0

    :goto_2
    iget-object v5, p0, Ldh/u;->c:Lkotlin/jvm/internal/b0;

    iput-boolean v4, v5, Lkotlin/jvm/internal/b0;->w:Z

    if-nez v4, :cond_4

    iget-boolean v4, v0, Lmh/m;->f:Z

    if-nez v4, :cond_5

    :cond_4
    int-to-double v4, p3

    mul-double/2addr v4, v1

    invoke-static {v4, v5}, Le93/b;->W(D)I

    move-result p3

    int-to-double v4, p2

    mul-double/2addr v1, v4

    invoke-static {v1, v2}, Le93/b;->W(D)I

    move-result p2

    invoke-virtual {p1, p3, p2}, Landroid/graphics/ImageDecoder;->setTargetSize(II)V

    :cond_5
    iget-object p2, v0, Lmh/m;->b:Landroid/graphics/Bitmap$Config;

    sget-object p3, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    if-ne p2, p3, :cond_6

    const/4 p2, 0x3

    goto :goto_3

    :cond_6
    move p2, v3

    :goto_3
    invoke-virtual {p1, p2}, Landroid/graphics/ImageDecoder;->setAllocator(I)V

    iget-boolean p2, v0, Lmh/m;->g:Z

    xor-int/2addr p2, v3

    invoke-virtual {p1, p2}, Landroid/graphics/ImageDecoder;->setMemorySizePolicy(I)V

    iget-object p2, v0, Lmh/m;->c:Landroid/graphics/ColorSpace;

    if-eqz p2, :cond_7

    invoke-virtual {p1, p2}, Landroid/graphics/ImageDecoder;->setTargetColorSpace(Landroid/graphics/ColorSpace;)V

    :cond_7
    iget-boolean p2, v0, Lmh/m;->h:Z

    xor-int/2addr p2, v3

    invoke-virtual {p1, p2}, Landroid/graphics/ImageDecoder;->setUnpremultipliedRequired(Z)V

    iget-object p2, v0, Lmh/m;->l:Lmh/n;

    const-string p3, "coil#animated_transformation"

    iget-object p2, p2, Lmh/n;->w:Ljava/util/Map;

    invoke-interface {p2, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lr;->t(Ljava/lang/Object;)V

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/graphics/ImageDecoder;->setPostProcessor(Landroid/graphics/PostProcessor;)V

    return-void
.end method
