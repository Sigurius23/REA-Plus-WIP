.class public final Le9/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/k0;


# instance fields
.field public final a:Ll9/y0;

.field public final b:Lqg3/d;

.field public final c:Lca/a;

.field public d:J

.field public final synthetic e:Le9/p;


# direct methods
.method public constructor <init>(Le9/p;Lko/o;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le9/o;->e:Le9/p;

    new-instance p1, Ll9/y0;

    const/4 v0, 0x0

    invoke-direct {p1, p2, v0, v0}, Ll9/y0;-><init>(Lko/o;Lg9/h;Lg9/d;)V

    iput-object p1, p0, Le9/o;->a:Ll9/y0;

    new-instance p1, Lqg3/d;

    const/4 p2, 0x4

    const/4 v0, 0x0

    invoke-direct {p1, p2, v0}, Lqg3/d;-><init>(IC)V

    iput-object p1, p0, Le9/o;->b:Lqg3/d;

    new-instance p1, Lca/a;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, La9/e;-><init>(I)V

    iput-object p1, p0, Le9/o;->c:Lca/a;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Le9/o;->d:J

    return-void
.end method


# virtual methods
.method public final a(Lu8/p;)V
    .locals 1

    iget-object v0, p0, Le9/o;->a:Ll9/y0;

    invoke-virtual {v0, p1}, Ll9/y0;->a(Lu8/p;)V

    return-void
.end method

.method public final b(JIIILt9/j0;)V
    .locals 7

    iget-object v0, p0, Le9/o;->a:Ll9/y0;

    move-wide v1, p1

    move v3, p3

    move v4, p4

    move v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Ll9/y0;->b(JIIILt9/j0;)V

    :cond_0
    :goto_0
    iget-object p1, p0, Le9/o;->a:Ll9/y0;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ll9/y0;->o(Z)Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Le9/o;->c:Lca/a;

    invoke-virtual {p1}, La9/e;->o()V

    iget-object p3, p0, Le9/o;->a:Ll9/y0;

    iget-object p4, p0, Le9/o;->b:Lqg3/d;

    invoke-virtual {p3, p4, p1, p2, p2}, Ll9/y0;->r(Lqg3/d;La9/e;IZ)I

    move-result p3

    const/4 p4, -0x4

    if-ne p3, p4, :cond_1

    invoke-virtual {p1}, La9/e;->r()V

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    iget-wide p3, p1, La9/e;->G:J

    iget-object p5, p0, Le9/o;->e:Le9/p;

    iget-object p5, p5, Le9/p;->y:Lda/b;

    invoke-virtual {p5, p1}, Lvd/f;->m(Lca/a;)Lu8/c0;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    iget-object p1, p1, Lu8/c0;->a:[Lu8/b0;

    aget-object p1, p1, p2

    check-cast p1, Lea/a;

    iget-object p2, p1, Lea/a;->a:Ljava/lang/String;

    iget-object p5, p1, Lea/a;->b:Ljava/lang/String;

    const-string p6, "urn:mpeg:dash:event:2012"

    invoke-virtual {p6, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p2, "1"

    invoke-virtual {p2, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    const-string p2, "2"

    invoke-virtual {p2, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    const-string p2, "3"

    invoke-virtual {p2, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    :cond_4
    const-wide p5, -0x7fffffffffffffffL    # -4.9E-324

    :try_start_0
    iget-object p1, p1, Lea/a;->e:[B

    invoke-static {p1}, Lx8/t;->n([B)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lx8/t;->M(Ljava/lang/String;)J

    move-result-wide p1
    :try_end_0
    .catch Landroidx/media3/common/ParserException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-wide p1, p5

    :goto_2
    cmp-long p5, p1, p5

    if-nez p5, :cond_5

    goto :goto_0

    :cond_5
    new-instance p5, Le9/n;

    invoke-direct {p5, p3, p4, p1, p2}, Le9/n;-><init>(JJ)V

    iget-object p1, p0, Le9/o;->e:Le9/p;

    iget-object p1, p1, Le9/p;->z:Landroid/os/Handler;

    const/4 p2, 0x1

    invoke-virtual {p1, p2, p5}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    :cond_6
    iget-object p1, p0, Le9/o;->a:Ll9/y0;

    iget-object p2, p1, Ll9/y0;->a:Ll9/w0;

    monitor-enter p1

    :try_start_1
    iget p3, p1, Ll9/y0;->s:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez p3, :cond_7

    monitor-exit p1

    const-wide/16 p3, -0x1

    goto :goto_3

    :cond_7
    :try_start_2
    invoke-virtual {p1, p3}, Ll9/y0;->e(I)J

    move-result-wide p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p1

    :goto_3
    invoke-virtual {p2, p3, p4}, Ll9/w0;->c(J)V

    return-void

    :catchall_0
    move-exception v0

    move-object p2, v0

    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p2
.end method

.method public final c(Lu8/h;IZ)I
    .locals 1

    iget-object v0, p0, Le9/o;->a:Ll9/y0;

    invoke-virtual {v0, p1, p2, p3}, Ll9/y0;->c(Lu8/h;IZ)I

    move-result p1

    return p1
.end method

.method public final d(Lx8/n;II)V
    .locals 1

    iget-object p3, p0, Le9/o;->a:Ll9/y0;

    const/4 v0, 0x0

    invoke-virtual {p3, p1, p2, v0}, Ll9/y0;->d(Lx8/n;II)V

    return-void
.end method
