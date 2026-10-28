.class public final Lqa/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/k0;


# instance fields
.field public final a:Lt9/k0;

.field public final b:Lqa/j;

.field public final c:Lx8/n;

.field public d:I

.field public e:I

.field public f:[B

.field public g:Lqa/l;

.field public h:Lu8/p;

.field public i:Z


# direct methods
.method public constructor <init>(Lt9/k0;Lqa/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqa/m;->a:Lt9/k0;

    iput-object p2, p0, Lqa/m;->b:Lqa/j;

    const/4 p1, 0x0

    iput p1, p0, Lqa/m;->d:I

    iput p1, p0, Lqa/m;->e:I

    sget-object p1, Lx8/t;->c:[B

    iput-object p1, p0, Lqa/m;->f:[B

    new-instance p1, Lx8/n;

    invoke-direct {p1}, Lx8/n;-><init>()V

    iput-object p1, p0, Lqa/m;->c:Lx8/n;

    return-void
.end method


# virtual methods
.method public final a(Lu8/p;)V
    .locals 6

    iget-object v0, p1, Lu8/p;->n:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p1, Lu8/p;->n:Ljava/lang/String;

    invoke-static {v0}, Lu8/d0;->i(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lva3/g;->d(Z)V

    iget-object v1, p0, Lqa/m;->h:Lu8/p;

    invoke-virtual {p1, v1}, Lu8/p;->equals(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, p0, Lqa/m;->b:Lqa/j;

    if-nez v1, :cond_2

    iput-object p1, p0, Lqa/m;->h:Lu8/p;

    invoke-interface {v2, p1}, Lqa/j;->g(Lu8/p;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v2, p1}, Lqa/j;->h(Lu8/p;)Lqa/l;

    move-result-object v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    iput-object v1, p0, Lqa/m;->g:Lqa/l;

    :cond_2
    iget-object v1, p0, Lqa/m;->g:Lqa/l;

    iget-object v3, p0, Lqa/m;->a:Lt9/k0;

    if-nez v1, :cond_3

    invoke-interface {v3, p1}, Lt9/k0;->a(Lu8/p;)V

    return-void

    :cond_3
    invoke-virtual {p1}, Lu8/p;->a()Lu8/o;

    move-result-object v1

    const-string v4, "application/x-media3-cues"

    invoke-static {v4}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Lu8/o;->m:Ljava/lang/String;

    iput-object v0, v1, Lu8/o;->j:Ljava/lang/String;

    const-wide v4, 0x7fffffffffffffffL

    iput-wide v4, v1, Lu8/o;->r:J

    invoke-interface {v2, p1}, Lqa/j;->i(Lu8/p;)I

    move-result p1

    iput p1, v1, Lu8/o;->I:I

    invoke-static {v1, v3}, Ljh3/c;->w(Lu8/o;Lt9/k0;)V

    return-void
.end method

.method public final b(JIIILt9/j0;)V
    .locals 8

    iget-object v0, p0, Lqa/m;->g:Lqa/l;

    if-nez v0, :cond_0

    iget-object v1, p0, Lqa/m;->a:Lt9/k0;

    move-wide v2, p1

    move v4, p3

    move v5, p4

    move v6, p5

    move-object v7, p6

    invoke-interface/range {v1 .. v7}, Lt9/k0;->b(JIIILt9/j0;)V

    return-void

    :cond_0
    move-wide v2, p1

    move v4, p3

    move v6, p5

    move-object v7, p6

    const/4 v1, 0x0

    if-nez v7, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    move p1, v1

    :goto_0
    const-string p2, "DRM on subtitles is not supported"

    invoke-static {p1, p2}, Lva3/g;->e(ZLjava/lang/String;)V

    iget p1, p0, Lqa/m;->e:I

    sub-int/2addr p1, v6

    sub-int p3, p1, p4

    :try_start_0
    iget-object p1, p0, Lqa/m;->g:Lqa/l;

    iget-object p2, p0, Lqa/m;->f:[B

    sget-object p5, Lqa/k;->c:Lqa/k;

    new-instance p6, Lc9/f;

    invoke-direct {p6, p0, v2, v3, v4}, Lc9/f;-><init>(Lqa/m;JI)V

    invoke-interface/range {p1 .. p6}, Lqa/l;->k([BIILqa/k;Lx8/d;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object p1, v0

    iget-boolean p2, p0, Lqa/m;->i:Z

    if-eqz p2, :cond_3

    const-string p2, "SubtitleTranscodingTO"

    const-string p5, "Parsing subtitles failed, ignoring sample."

    invoke-static {p2, p5, p1}, Lx8/a;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    add-int/2addr p3, p4

    iput p3, p0, Lqa/m;->d:I

    iget p1, p0, Lqa/m;->e:I

    if-ne p3, p1, :cond_2

    iput v1, p0, Lqa/m;->d:I

    iput v1, p0, Lqa/m;->e:I

    :cond_2
    return-void

    :cond_3
    throw p1
.end method

.method public final c(Lu8/h;IZ)I
    .locals 2

    iget-object v0, p0, Lqa/m;->g:Lqa/l;

    if-nez v0, :cond_0

    iget-object v0, p0, Lqa/m;->a:Lt9/k0;

    invoke-interface {v0, p1, p2, p3}, Lt9/k0;->c(Lu8/h;IZ)I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p0, p2}, Lqa/m;->e(I)V

    iget-object v0, p0, Lqa/m;->f:[B

    iget v1, p0, Lqa/m;->e:I

    invoke-interface {p1, v0, v1, p2}, Lu8/h;->read([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_2

    if-eqz p3, :cond_1

    return p2

    :cond_1
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_2
    iget p2, p0, Lqa/m;->e:I

    add-int/2addr p2, p1

    iput p2, p0, Lqa/m;->e:I

    return p1
.end method

.method public final d(Lx8/n;II)V
    .locals 1

    iget-object v0, p0, Lqa/m;->g:Lqa/l;

    if-nez v0, :cond_0

    iget-object v0, p0, Lqa/m;->a:Lt9/k0;

    invoke-interface {v0, p1, p2, p3}, Lt9/k0;->d(Lx8/n;II)V

    return-void

    :cond_0
    invoke-virtual {p0, p2}, Lqa/m;->e(I)V

    iget-object p3, p0, Lqa/m;->f:[B

    iget v0, p0, Lqa/m;->e:I

    invoke-virtual {p1, p3, v0, p2}, Lx8/n;->e([BII)V

    iget p1, p0, Lqa/m;->e:I

    add-int/2addr p1, p2

    iput p1, p0, Lqa/m;->e:I

    return-void
.end method

.method public final e(I)V
    .locals 4

    iget-object v0, p0, Lqa/m;->f:[B

    array-length v0, v0

    iget v1, p0, Lqa/m;->e:I

    sub-int/2addr v0, v1

    if-lt v0, p1, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lqa/m;->d:I

    sub-int/2addr v1, v0

    mul-int/lit8 v0, v1, 0x2

    add-int/2addr p1, v1

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iget-object v0, p0, Lqa/m;->f:[B

    array-length v2, v0

    if-gt p1, v2, :cond_1

    move-object p1, v0

    goto :goto_0

    :cond_1
    new-array p1, p1, [B

    :goto_0
    iget v2, p0, Lqa/m;->d:I

    const/4 v3, 0x0

    invoke-static {v0, v2, p1, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput v3, p0, Lqa/m;->d:I

    iput v1, p0, Lqa/m;->e:I

    iput-object p1, p0, Lqa/m;->f:[B

    return-void
.end method
