.class public final Lne3/w;
.super Lne3/r;
.source "SourceFile"


# instance fields
.field public final w:Ljava/security/MessageDigest;


# direct methods
.method public constructor <init>(Lne3/e;)V
    .locals 2

    const-string v0, "SHA-256"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    const-string v1, "getInstance(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lne3/r;-><init>(Lne3/n0;)V

    iput-object v0, p0, Lne3/w;->w:Ljava/security/MessageDigest;

    return-void
.end method


# virtual methods
.method public final b()Lne3/l;
    .locals 2

    iget-object v0, p0, Lne3/w;->w:Ljava/security/MessageDigest;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    new-instance v1, Lne3/l;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v1, v0}, Lne3/l;-><init>([B)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    throw v0
.end method

.method public final write(Lne3/h;J)V
    .locals 9

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v1, p1, Lne3/h;->x:J

    const-wide/16 v3, 0x0

    move-wide v5, p2

    invoke-static/range {v1 .. v6}, Lne3/b;->e(JJJ)V

    iget-object p2, p1, Lne3/h;->w:Lne3/k0;

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const-wide/16 v0, 0x0

    :goto_0
    cmp-long p3, v0, v5

    if-gez p3, :cond_1

    sub-long v2, v5, v0

    iget p3, p2, Lne3/k0;->c:I

    iget v4, p2, Lne3/k0;->b:I

    sub-int/2addr p3, v4

    int-to-long v7, p3

    invoke-static {v2, v3, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int p3, v2

    iget-object v2, p0, Lne3/w;->w:Ljava/security/MessageDigest;

    if-eqz v2, :cond_0

    iget-object v3, p2, Lne3/k0;->a:[B

    iget v4, p2, Lne3/k0;->b:I

    invoke-virtual {v2, v3, v4, p3}, Ljava/security/MessageDigest;->update([BII)V

    int-to-long v2, p3

    add-long/2addr v0, v2

    iget-object p2, p2, Lne3/k0;->f:Lne3/k0;

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    throw p1

    :cond_1
    invoke-super {p0, p1, v5, v6}, Lne3/r;->write(Lne3/h;J)V

    return-void
.end method
