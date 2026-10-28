.class public final Lfw/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lne3/n0;


# instance fields
.field public final w:Lne3/h;

.field public x:J


# direct methods
.method public constructor <init>(Lne3/h;J)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-lez v0, :cond_0

    iput-object p1, p0, Lfw/l;->w:Lne3/h;

    iput-wide p2, p0, Lfw/l;->x:J

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "limit has to be grater than 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final close()V
    .locals 1

    iget-object v0, p0, Lfw/l;->w:Lne3/h;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final flush()V
    .locals 1

    iget-object v0, p0, Lfw/l;->w:Lne3/h;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final timeout()Lne3/r0;
    .locals 1

    sget-object v0, Lne3/r0;->d:Lne3/q0;

    return-object v0
.end method

.method public final write(Lne3/h;J)V
    .locals 4

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, Lfw/l;->x:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    iget-object v0, p0, Lfw/l;->w:Lne3/h;

    invoke-virtual {v0, p1, p2, p3}, Lne3/h;->write(Lne3/h;J)V

    iget-wide v0, p0, Lfw/l;->x:J

    sub-long/2addr v0, p2

    iput-wide v0, p0, Lfw/l;->x:J

    :cond_0
    return-void
.end method
