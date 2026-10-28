.class public final Lj3/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La0/g0;

.field public b:Lj3/d;

.field public c:J

.field public d:J

.field public e:J

.field public f:J

.field public g:[F


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, La0/t;->a:La0/g0;

    new-instance v0, La0/g0;

    invoke-direct {v0}, La0/g0;-><init>()V

    iput-object v0, p0, Lj3/e;->a:La0/g0;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lj3/e;->c:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lj3/e;->d:J

    iput-wide v0, p0, Lj3/e;->e:J

    return-void
.end method


# virtual methods
.method public final a(Lj3/d;JJ[FJ)V
    .locals 10

    move-wide/from16 v1, p7

    iget-wide v3, p1, Lj3/d;->g:J

    sub-long v5, v1, v3

    const-wide/16 v7, 0x0

    cmp-long v5, v5, v7

    if-gtz v5, :cond_1

    const-wide/high16 v5, -0x8000000000000000L

    cmp-long v3, v3, v5

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v3, 0x1

    :goto_1
    if-eqz v3, :cond_2

    iput-wide v1, p1, Lj3/d;->g:J

    iget-wide v1, p1, Lj3/d;->e:J

    iget-wide v3, p1, Lj3/d;->f:J

    move-object v0, p1

    move-wide v5, p2

    move-wide v7, p4

    move-object/from16 v9, p6

    invoke-virtual/range {v0 .. v9}, Lj3/d;->a(JJJJ[F)V

    :cond_2
    return-void
.end method

.method public final b(Lj3/d;JJJ)V
    .locals 10

    move-wide/from16 v1, p6

    iget-wide v3, p1, Lj3/d;->g:J

    const-wide/16 v5, 0x0

    sub-long v7, v1, v3

    cmp-long v5, v7, v5

    if-gez v5, :cond_1

    const-wide/high16 v5, -0x8000000000000000L

    cmp-long v3, v3, v5

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v3, 0x1

    :goto_1
    iput-wide p2, p1, Lj3/d;->e:J

    move-wide v6, p4

    iput-wide v6, p1, Lj3/d;->f:J

    if-eqz v3, :cond_2

    iput-wide v1, p1, Lj3/d;->g:J

    iget-wide v5, p0, Lj3/e;->d:J

    iget-wide v7, p0, Lj3/e;->e:J

    iget-object v9, p0, Lj3/e;->g:[F

    move-object v0, p1

    move-wide v1, p2

    move-wide v3, p4

    invoke-virtual/range {v0 .. v9}, Lj3/d;->a(JJJJ[F)V

    :cond_2
    return-void
.end method
