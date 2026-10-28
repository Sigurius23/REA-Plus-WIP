.class public final Lz0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc4/i0;


# instance fields
.field public E:Ly3/j;

.field public final w:Le10/k0;

.field public x:Ly3/l;

.field public y:Ly3/m;

.field public z:Ly3/l;


# direct methods
.method public constructor <init>(Le10/k0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz0/k;->w:Le10/k0;

    return-void
.end method


# virtual methods
.method public final i(Ly3/k;JLy3/m;J)J
    .locals 7

    iget-object v0, p0, Lz0/k;->E:Ly3/j;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lz0/k;->x:Ly3/l;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    iget-wide v3, v1, Ly3/l;->a:J

    invoke-static {v3, v4, p2, p3}, Ly3/l;->a(JJ)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_2

    iget-object v1, p0, Lz0/k;->y:Ly3/m;

    if-ne v1, p4, :cond_2

    iget-object v1, p0, Lz0/k;->z:Ly3/l;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    iget-wide v1, v1, Ly3/l;->a:J

    invoke-static {v1, v2, p5, p6}, Ly3/l;->a(JJ)Z

    move-result v2

    :goto_1
    if-eqz v2, :cond_2

    iget-wide p1, v0, Ly3/j;->a:J

    return-wide p1

    :cond_2
    iget-object v0, p0, Lz0/k;->w:Le10/k0;

    move-object v1, p1

    move-wide v2, p2

    move-object v4, p4

    move-wide v5, p5

    invoke-virtual/range {v0 .. v6}, Le10/k0;->i(Ly3/k;JLy3/m;J)J

    move-result-wide p1

    new-instance p3, Ly3/l;

    invoke-direct {p3, v2, v3}, Ly3/l;-><init>(J)V

    iput-object p3, p0, Lz0/k;->x:Ly3/l;

    iput-object v4, p0, Lz0/k;->y:Ly3/m;

    new-instance p3, Ly3/l;

    invoke-direct {p3, v5, v6}, Ly3/l;-><init>(J)V

    iput-object p3, p0, Lz0/k;->z:Ly3/l;

    new-instance p3, Ly3/j;

    invoke-direct {p3, p1, p2}, Ly3/j;-><init>(J)V

    iput-object p3, p0, Lz0/k;->E:Ly3/j;

    return-wide p1
.end method
