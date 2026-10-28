.class public final Lba/c;
.super Lt9/w;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lt9/e0;

.field public final synthetic c:Lan/d;


# direct methods
.method public constructor <init>(Lan/d;Lt9/e0;Lt9/e0;)V
    .locals 0

    iput-object p1, p0, Lba/c;->c:Lan/d;

    iput-object p3, p0, Lba/c;->b:Lt9/e0;

    invoke-direct {p0, p2}, Lt9/w;-><init>(Lt9/e0;)V

    return-void
.end method


# virtual methods
.method public final c(J)Lt9/d0;
    .locals 8

    iget-object v0, p0, Lba/c;->b:Lt9/e0;

    invoke-interface {v0, p1, p2}, Lt9/e0;->c(J)Lt9/d0;

    move-result-object p1

    new-instance p2, Lt9/d0;

    new-instance v0, Lt9/f0;

    iget-object v1, p1, Lt9/d0;->a:Lt9/f0;

    iget-wide v2, v1, Lt9/f0;->a:J

    iget-wide v4, v1, Lt9/f0;->b:J

    iget-object v1, p0, Lba/c;->c:Lan/d;

    iget-wide v6, v1, Lan/d;->x:J

    add-long/2addr v4, v6

    invoke-direct {v0, v2, v3, v4, v5}, Lt9/f0;-><init>(JJ)V

    new-instance v1, Lt9/f0;

    iget-object p1, p1, Lt9/d0;->b:Lt9/f0;

    iget-wide v2, p1, Lt9/f0;->a:J

    iget-wide v4, p1, Lt9/f0;->b:J

    add-long/2addr v4, v6

    invoke-direct {v1, v2, v3, v4, v5}, Lt9/f0;-><init>(JJ)V

    invoke-direct {p2, v0, v1}, Lt9/d0;-><init>(Lt9/f0;Lt9/f0;)V

    return-object p2
.end method
