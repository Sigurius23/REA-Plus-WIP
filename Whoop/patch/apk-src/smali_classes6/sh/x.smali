.class public final Lsh/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsh/k;


# instance fields
.field public final a:Landroid/graphics/ImageDecoder$Source;

.field public final b:Ljava/lang/AutoCloseable;

.field public final c:Lfi/o;

.field public final d:Lmc3/i;


# direct methods
.method public constructor <init>(Landroid/graphics/ImageDecoder$Source;Ljava/lang/AutoCloseable;Lfi/o;Lmc3/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsh/x;->a:Landroid/graphics/ImageDecoder$Source;

    iput-object p2, p0, Lsh/x;->b:Ljava/lang/AutoCloseable;

    iput-object p3, p0, Lsh/x;->c:Lfi/o;

    iput-object p4, p0, Lsh/x;->d:Lmc3/i;

    return-void
.end method


# virtual methods
.method public final a(Lq83/d;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p1, Lsh/v;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lsh/v;

    iget v1, v0, Lsh/v;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lsh/v;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lsh/v;

    check-cast p1, Ls83/c;

    invoke-direct {v0, p0, p1}, Lsh/v;-><init>(Lsh/x;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lsh/v;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lsh/v;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lsh/v;->x:Lmc3/i;

    iget-object v0, v0, Lsh/v;->w:Lsh/x;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Lsh/v;->w:Lsh/x;

    iget-object p1, p0, Lsh/x;->d:Lmc3/i;

    iput-object p1, v0, Lsh/v;->x:Lmc3/i;

    iput v3, v0, Lsh/v;->E:I

    invoke-virtual {p1, v0}, Lmc3/h;->a(Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    move-object v1, p1

    :goto_1
    :try_start_0
    iget-object p1, v0, Lsh/x;->b:Ljava/lang/AutoCloseable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v2, Lkotlin/jvm/internal/b0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iget-object v3, v0, Lsh/x;->a:Landroid/graphics/ImageDecoder$Source;

    new-instance v4, Lsh/w;

    const/4 v5, 0x0

    invoke-direct {v4, v0, v2, v5}, Lsh/w;-><init>(Lsh/k;Lkotlin/jvm/internal/b0;I)V

    invoke-static {v3, v4}, Landroid/graphics/ImageDecoder;->decodeBitmap(Landroid/graphics/ImageDecoder$Source;Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;)Landroid/graphics/Bitmap;

    move-result-object v0

    new-instance v3, Lsh/i;

    new-instance v4, Lrh/a;

    invoke-direct {v4, v0}, Lrh/a;-><init>(Landroid/graphics/Bitmap;)V

    iget-boolean v0, v2, Lkotlin/jvm/internal/b0;->w:Z

    invoke-direct {v3, v4, v0}, Lsh/i;-><init>(Lrh/j;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v0, 0x0

    :try_start_2
    invoke-static {p1, v0}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v1}, Lmc3/h;->d()V

    return-object v3

    :catchall_0
    move-exception p1

    goto :goto_2

    :catchall_1
    move-exception v0

    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception v2

    :try_start_4
    invoke-static {p1, v0}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_2
    invoke-virtual {v1}, Lmc3/h;->d()V

    throw p1
.end method
