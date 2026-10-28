.class public final Lli/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lne3/p0;


# instance fields
.field public final w:Landroid/media/MediaDataSource;

.field public final x:J

.field public y:J


# direct methods
.method public constructor <init>(Landroid/media/MediaDataSource;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lli/c;->w:Landroid/media/MediaDataSource;

    invoke-virtual {p1}, Landroid/media/MediaDataSource;->getSize()J

    move-result-wide v0

    iput-wide v0, p0, Lli/c;->x:J

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    iget-object v0, p0, Lli/c;->w:Landroid/media/MediaDataSource;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public final h1(Lne3/h;J)J
    .locals 6

    iget-wide v0, p0, Lli/c;->y:J

    iget-wide v2, p0, Lli/c;->x:J

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    const-wide/16 p1, -0x1

    return-wide p1

    :cond_0
    sub-long/2addr v2, v0

    invoke-static {p2, p3, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    long-to-int v5, p2

    new-array v3, v5, [B

    iget-wide v1, p0, Lli/c;->y:J

    const/4 v4, 0x0

    iget-object v0, p0, Lli/c;->w:Landroid/media/MediaDataSource;

    invoke-virtual/range {v0 .. v5}, Landroid/media/MediaDataSource;->readAt(J[BII)I

    move-result p2

    iget-wide v0, p0, Lli/c;->y:J

    int-to-long v4, p2

    add-long/2addr v0, v4

    iput-wide v0, p0, Lli/c;->y:J

    const/4 p3, 0x0

    invoke-virtual {p1, v3, p3, p2}, Lne3/h;->write([BII)V

    return-wide v4
.end method

.method public final timeout()Lne3/r0;
    .locals 1

    sget-object v0, Lne3/r0;->d:Lne3/q0;

    return-object v0
.end method
