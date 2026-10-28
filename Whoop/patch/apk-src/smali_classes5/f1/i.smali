.class public final Lf1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc4/i0;


# instance fields
.field public final w:Lb2/h;

.field public final x:Lf1/m;

.field public y:J


# direct methods
.method public constructor <init>(Lb2/h;Lf1/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/i;->w:Lb2/h;

    iput-object p2, p0, Lf1/i;->x:Lf1/m;

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lf1/i;->y:J

    return-void
.end method


# virtual methods
.method public final i(Ly3/k;JLy3/m;J)J
    .locals 6

    iget-object p2, p0, Lf1/i;->x:Lf1/m;

    invoke-interface {p2}, Lf1/m;->a()J

    move-result-wide p2

    const-wide v0, 0x7fffffff7fffffffL

    and-long/2addr v0, p2

    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-wide p2, p0, Lf1/i;->y:J

    :goto_0
    iput-wide p2, p0, Lf1/i;->y:J

    iget-object v0, p0, Lf1/i;->w:Lb2/h;

    const-wide/16 v3, 0x0

    move-object v5, p4

    move-wide v1, p5

    invoke-interface/range {v0 .. v5}, Lb2/h;->a(JJLy3/m;)J

    move-result-wide p4

    invoke-virtual {p1}, Ly3/k;->b()J

    move-result-wide v0

    invoke-static {p2, p3}, Lvo/b;->C(J)J

    move-result-wide p1

    invoke-static {v0, v1, p1, p2}, Ly3/j;->d(JJ)J

    move-result-wide p1

    invoke-static {p1, p2, p4, p5}, Ly3/j;->d(JJ)J

    move-result-wide p1

    return-wide p1
.end method
