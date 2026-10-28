.class public final Lc4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc4/i0;


# instance fields
.field public final w:Lb2/h;

.field public final x:J


# direct methods
.method public constructor <init>(Lb2/h;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc4/a;->w:Lb2/h;

    iput-wide p2, p0, Lc4/a;->x:J

    return-void
.end method


# virtual methods
.method public final i(Ly3/k;JLy3/m;J)J
    .locals 14

    invoke-virtual {p1}, Ly3/k;->c()I

    move-result v0

    invoke-virtual {p1}, Ly3/k;->a()I

    move-result v1

    int-to-long v2, v0

    const/16 v0, 0x20

    shl-long/2addr v2, v0

    int-to-long v4, v1

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    or-long v11, v2, v4

    iget-object v8, p0, Lc4/a;->w:Lb2/h;

    const-wide/16 v9, 0x0

    move-object/from16 v13, p4

    invoke-interface/range {v8 .. v13}, Lb2/h;->a(JJLy3/m;)J

    move-result-wide v1

    iget-object v8, p0, Lc4/a;->w:Lb2/h;

    move-wide/from16 v11, p5

    invoke-interface/range {v8 .. v13}, Lb2/h;->a(JJLy3/m;)J

    move-result-wide v3

    shr-long v8, v3, v0

    long-to-int v5, v8

    neg-int v5, v5

    and-long/2addr v3, v6

    long-to-int v3, v3

    neg-int v3, v3

    int-to-long v4, v5

    shl-long/2addr v4, v0

    int-to-long v8, v3

    and-long/2addr v8, v6

    or-long v3, v4, v8

    iget-wide v8, p0, Lc4/a;->x:J

    shr-long v10, v8, v0

    long-to-int v5, v10

    sget-object v10, Ly3/m;->w:Ly3/m;

    if-ne v13, v10, :cond_0

    const/4 v10, 0x1

    goto :goto_0

    :cond_0
    const/4 v10, -0x1

    :goto_0
    mul-int/2addr v5, v10

    and-long/2addr v8, v6

    long-to-int v8, v8

    int-to-long v9, v5

    shl-long/2addr v9, v0

    int-to-long v11, v8

    and-long v5, v11, v6

    or-long/2addr v5, v9

    invoke-virtual {p1}, Ly3/k;->b()J

    move-result-wide v7

    invoke-static {v7, v8, v1, v2}, Ly3/j;->d(JJ)J

    move-result-wide v0

    invoke-static {v0, v1, v3, v4}, Ly3/j;->d(JJ)J

    move-result-wide v0

    invoke-static {v0, v1, v5, v6}, Ly3/j;->d(JJ)J

    move-result-wide v0

    return-wide v0
.end method
