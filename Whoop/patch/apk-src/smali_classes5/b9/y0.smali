.class public final Lb9/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/i0;
.implements Lg9/e;


# instance fields
.field public final w:Lb9/a1;

.field public final synthetic x:Lb9/b1;


# direct methods
.method public constructor <init>(Lb9/b1;Lb9/a1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb9/y0;->x:Lb9/b1;

    iput-object p2, p0, Lb9/y0;->w:Lb9/a1;

    return-void
.end method


# virtual methods
.method public final a(ILl9/c0;Ll9/t;Ll9/y;)V
    .locals 6

    invoke-virtual {p0, p1, p2}, Lb9/y0;->g(ILl9/c0;)Landroid/util/Pair;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object p1, p0, Lb9/y0;->x:Lb9/b1;

    iget-object p1, p1, Lb9/b1;->k:Ljava/lang/Object;

    check-cast p1, Lx8/r;

    new-instance v0, Lb9/v0;

    const/4 v5, 0x1

    move-object v1, p0

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lb9/v0;-><init>(Lb9/y0;Landroid/util/Pair;Ll9/t;Ll9/y;I)V

    invoke-virtual {p1, v0}, Lx8/r;->c(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final b(ILl9/c0;Ll9/t;Ll9/y;Ljava/io/IOException;Z)V
    .locals 8

    invoke-virtual {p0, p1, p2}, Lb9/y0;->g(ILl9/c0;)Landroid/util/Pair;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object p1, p0, Lb9/y0;->x:Lb9/b1;

    iget-object p1, p1, Lb9/b1;->k:Ljava/lang/Object;

    check-cast p1, Lx8/r;

    new-instance v0, Lb9/x0;

    const/4 v7, 0x0

    move-object v1, p0

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v7}, Lb9/x0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/io/IOException;ZI)V

    invoke-virtual {p1, v0}, Lx8/r;->c(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final c(ILl9/c0;Ll9/t;Ll9/y;)V
    .locals 6

    invoke-virtual {p0, p1, p2}, Lb9/y0;->g(ILl9/c0;)Landroid/util/Pair;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object p1, p0, Lb9/y0;->x:Lb9/b1;

    iget-object p1, p1, Lb9/b1;->k:Ljava/lang/Object;

    check-cast p1, Lx8/r;

    new-instance v0, Lb9/v0;

    const/4 v5, 0x0

    move-object v1, p0

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lb9/v0;-><init>(Lb9/y0;Landroid/util/Pair;Ll9/t;Ll9/y;I)V

    invoke-virtual {p1, v0}, Lx8/r;->c(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final d(ILl9/c0;Ll9/y;)V
    .locals 2

    invoke-virtual {p0, p1, p2}, Lb9/y0;->g(ILl9/c0;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lb9/y0;->x:Lb9/b1;

    iget-object p2, p2, Lb9/b1;->k:Ljava/lang/Object;

    check-cast p2, Lx8/r;

    new-instance v0, Lb9/w0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p3, v1}, Lb9/w0;-><init>(Lb9/y0;Landroid/util/Pair;Ll9/y;I)V

    invoke-virtual {p2, v0}, Lx8/r;->c(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final e(ILl9/c0;Ll9/y;)V
    .locals 2

    invoke-virtual {p0, p1, p2}, Lb9/y0;->g(ILl9/c0;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lb9/y0;->x:Lb9/b1;

    iget-object p2, p2, Lb9/b1;->k:Ljava/lang/Object;

    check-cast p2, Lx8/r;

    new-instance v0, Lb9/w0;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, p3, v1}, Lb9/w0;-><init>(Lb9/y0;Landroid/util/Pair;Ll9/y;I)V

    invoke-virtual {p2, v0}, Lx8/r;->c(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final f(ILl9/c0;Ll9/t;Ll9/y;I)V
    .locals 6

    invoke-virtual {p0, p1, p2}, Lb9/y0;->g(ILl9/c0;)Landroid/util/Pair;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object p1, p0, Lb9/y0;->x:Lb9/b1;

    iget-object p1, p1, Lb9/b1;->k:Ljava/lang/Object;

    check-cast p1, Lx8/r;

    new-instance v0, Llive/hms/video/factories/e;

    move-object v1, p0

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Llive/hms/video/factories/e;-><init>(Lb9/y0;Landroid/util/Pair;Ll9/t;Ll9/y;I)V

    invoke-virtual {p1, v0}, Lx8/r;->c(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final g(ILl9/c0;)Landroid/util/Pair;
    .locals 7

    iget-object v0, p0, Lb9/y0;->w:Lb9/a1;

    const/4 v1, 0x0

    if-eqz p2, :cond_3

    const/4 v2, 0x0

    :goto_0
    iget-object v3, v0, Lb9/a1;->c:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    iget-object v3, v0, Lb9/a1;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll9/c0;

    iget-wide v3, v3, Ll9/c0;->d:J

    iget-wide v5, p2, Ll9/c0;->d:J

    cmp-long v3, v3, v5

    if-nez v3, :cond_0

    iget-object v2, p2, Ll9/c0;->a:Ljava/lang/Object;

    iget-object v3, v0, Lb9/a1;->b:Ljava/lang/Object;

    sget v4, Lb9/h1;->k:I

    invoke-static {v3, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v2

    invoke-virtual {p2, v2}, Ll9/c0;->a(Ljava/lang/Object;)Ll9/c0;

    move-result-object p2

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    move-object p2, v1

    :goto_1
    if-nez p2, :cond_2

    return-object v1

    :cond_2
    move-object v1, p2

    :cond_3
    iget p2, v0, Lb9/a1;->d:I

    add-int/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method
