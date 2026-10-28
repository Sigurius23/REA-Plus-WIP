.class public final Ldh/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldh/j;


# instance fields
.field public final a:Ldh/x;

.field public final b:Lmh/m;


# direct methods
.method public constructor <init>(Ldh/x;Lmh/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldh/w;->a:Ldh/x;

    iput-object p2, p0, Ldh/w;->b:Lmh/m;

    return-void
.end method


# virtual methods
.method public final a(Lq83/d;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p1, Ldh/t;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ldh/t;

    iget v1, v0, Ldh/t;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ldh/t;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Ldh/t;

    check-cast p1, Ls83/c;

    invoke-direct {v0, p0, p1}, Ldh/t;-><init>(Ldh/w;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Ldh/t;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ldh/t;->E:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Ldh/t;->w:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/b0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Ldh/t;->x:Lkotlin/jvm/internal/b0;

    iget-object v4, v0, Ldh/t;->w:Ljava/lang/Object;

    check-cast v4, Ldh/w;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lkotlin/jvm/internal/b0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    new-instance v2, Ld30/l;

    const/4 v5, 0x6

    invoke-direct {v2, v5, p0, p1}, Ld30/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object p0, v0, Ldh/t;->w:Ljava/lang/Object;

    iput-object p1, v0, Ldh/t;->x:Lkotlin/jvm/internal/b0;

    iput v4, v0, Ldh/t;->E:I

    invoke-static {v2, v0}, Lbc3/f0;->G(Lc93/a;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v4, v2

    move-object v2, p1

    move-object p1, v4

    move-object v4, p0

    :goto_1
    check-cast p1, Landroid/graphics/drawable/Drawable;

    iput-object v2, v0, Ldh/t;->w:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, v0, Ldh/t;->x:Lkotlin/jvm/internal/b0;

    iput v3, v0, Ldh/t;->E:I

    invoke-virtual {v4, p1, v0}, Ldh/w;->c(Landroid/graphics/drawable/Drawable;Ls83/c;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v0, v2

    :goto_3
    check-cast p1, Landroid/graphics/drawable/Drawable;

    iget-boolean v0, v0, Lkotlin/jvm/internal/b0;->w:Z

    new-instance v1, Ldh/h;

    invoke-direct {v1, p1, v0}, Ldh/h;-><init>(Landroid/graphics/drawable/Drawable;Z)V

    return-object v1
.end method

.method public final b(Ldh/x;)Landroid/graphics/ImageDecoder$Source;
    .locals 4

    invoke-virtual {p1}, Ldh/x;->V0()Lne3/e0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lne3/e0;->toFile()Ljava/io/File;

    move-result-object p1

    invoke-static {p1}, Landroid/graphics/ImageDecoder;->createSource(Ljava/io/File;)Landroid/graphics/ImageDecoder$Source;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ldh/x;->b()Ldt/b;

    move-result-object v0

    instance-of v1, v0, Ldh/a;

    iget-object v2, p0, Ldh/w;->b:Lmh/m;

    if-eqz v1, :cond_1

    iget-object p1, v2, Lmh/m;->a:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    check-cast v0, Ldh/a;

    iget-object v0, v0, Ldh/a;->a:Ljava/lang/String;

    invoke-static {p1, v0}, Landroid/graphics/ImageDecoder;->createSource(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/ImageDecoder$Source;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v1, v0, Ldh/f;

    if-eqz v1, :cond_2

    iget-object p1, v2, Lmh/m;->a:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    check-cast v0, Ldh/f;

    iget-object v0, v0, Ldh/f;->a:Landroid/net/Uri;

    invoke-static {p1, v0}, Landroid/graphics/ImageDecoder;->createSource(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/ImageDecoder$Source;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of v1, v0, Ldh/y;

    if-eqz v1, :cond_3

    check-cast v0, Ldh/y;

    iget-object v1, v0, Ldh/y;->a:Ljava/lang/String;

    iget-object v3, v2, Lmh/m;->a:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object p1, v2, Lmh/m;->a:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    iget v0, v0, Ldh/y;->b:I

    invoke-static {p1, v0}, Landroid/graphics/ImageDecoder;->createSource(Landroid/content/res/Resources;I)Landroid/graphics/ImageDecoder$Source;

    move-result-object p1

    return-object p1

    :cond_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_4

    invoke-virtual {p1}, Ldh/x;->d1()Lne3/j;

    move-result-object p1

    invoke-interface {p1}, Lne3/j;->n()[B

    move-result-object p1

    invoke-static {p1}, Landroid/graphics/ImageDecoder;->createSource([B)Landroid/graphics/ImageDecoder$Source;

    move-result-object p1

    return-object p1

    :cond_4
    const/16 v1, 0x1e

    if-ne v0, v1, :cond_5

    invoke-virtual {p1}, Ldh/x;->d1()Lne3/j;

    move-result-object p1

    invoke-interface {p1}, Lne3/j;->n()[B

    move-result-object p1

    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {p1}, Landroid/graphics/ImageDecoder;->createSource(Ljava/nio/ByteBuffer;)Landroid/graphics/ImageDecoder$Source;

    move-result-object p1

    return-object p1

    :cond_5
    invoke-virtual {p1}, Ldh/x;->D0()Lne3/e0;

    move-result-object p1

    invoke-virtual {p1}, Lne3/e0;->toFile()Ljava/io/File;

    move-result-object p1

    invoke-static {p1}, Landroid/graphics/ImageDecoder;->createSource(Ljava/io/File;)Landroid/graphics/ImageDecoder$Source;

    move-result-object p1

    return-object p1
.end method

.method public final c(Landroid/graphics/drawable/Drawable;Ls83/c;)Landroid/graphics/drawable/Drawable;
    .locals 4

    instance-of v0, p2, Ldh/v;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ldh/v;

    iget v1, v0, Ldh/v;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ldh/v;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Ldh/v;

    invoke-direct {v0, p0, p2}, Ldh/v;-><init>(Ldh/w;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Ldh/v;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v0, v0, Ldh/v;->y:I

    if-eqz v0, :cond_2

    const/4 p1, 0x1

    if-ne v0, p1, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    const/4 p1, 0x0

    move-object p2, p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p2, p1, Landroid/graphics/drawable/AnimatedImageDrawable;

    if-nez p2, :cond_3

    return-object p1

    :cond_3
    move-object p2, p1

    check-cast p2, Landroid/graphics/drawable/AnimatedImageDrawable;

    iget-object v0, p0, Ldh/w;->b:Lmh/m;

    iget-object v1, v0, Lmh/m;->l:Lmh/n;

    iget-object v0, v0, Lmh/m;->l:Lmh/n;

    const-string v2, "coil#repeat_count"

    iget-object v1, v1, Lmh/n;->w:Ljava/util/Map;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lr;->t(Ljava/lang/Object;)V

    const/4 v1, -0x1

    invoke-virtual {p2, v1}, Landroid/graphics/drawable/AnimatedImageDrawable;->setRepeatCount(I)V

    const-string p2, "coil#animation_start_callback"

    iget-object v1, v0, Lmh/n;->w:Ljava/util/Map;

    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lr;->t(Ljava/lang/Object;)V

    const-string p2, "coil#animation_end_callback"

    iget-object v0, v0, Lmh/n;->w:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lr;->t(Ljava/lang/Object;)V

    move-object p2, p0

    :goto_1
    new-instance v0, Lfh/b;

    iget-object p2, p2, Ldh/w;->b:Lmh/m;

    iget-object p2, p2, Lmh/m;->e:Lnh/g;

    invoke-direct {v0, p1, p2}, Lfh/b;-><init>(Landroid/graphics/drawable/Drawable;Lnh/g;)V

    return-object v0
.end method
