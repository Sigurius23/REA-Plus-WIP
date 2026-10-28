.class public final Lsn/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsn/r0;


# instance fields
.field public final w:Lsn/r0;

.field public final x:J


# direct methods
.method public constructor <init>(Lsn/r0;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsn/d0;->w:Lsn/r0;

    iput-wide p2, p0, Lsn/d0;->x:J

    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 1

    iget-object v0, p0, Lsn/d0;->w:Lsn/r0;

    invoke-interface {v0}, Lsn/r0;->b()Z

    move-result v0

    return v0
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Lsn/d0;->w:Lsn/r0;

    invoke-interface {v0}, Lsn/r0;->c()V

    return-void
.end method

.method public final e(Lxl/a;Lum/c;I)I
    .locals 4

    iget-object v0, p0, Lsn/d0;->w:Lsn/r0;

    invoke-interface {v0, p1, p2, p3}, Lsn/r0;->e(Lxl/a;Lum/c;I)I

    move-result p1

    const/4 p3, -0x4

    if-ne p1, p3, :cond_0

    iget-wide v0, p2, Lum/c;->F:J

    iget-wide v2, p0, Lsn/d0;->x:J

    add-long/2addr v0, v2

    const-wide/16 v2, 0x0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iput-wide v0, p2, Lum/c;->F:J

    :cond_0
    return p1
.end method

.method public final j(J)I
    .locals 2

    iget-wide v0, p0, Lsn/d0;->x:J

    sub-long/2addr p1, v0

    iget-object v0, p0, Lsn/d0;->w:Lsn/r0;

    invoke-interface {v0, p1, p2}, Lsn/r0;->j(J)I

    move-result p1

    return p1
.end method
