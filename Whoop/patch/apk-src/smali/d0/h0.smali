.class public final Ld0/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/d0;


# instance fields
.field public final a:I

.field public final b:Ld0/z;

.field public final c:J

.field public final d:J


# direct methods
.method public constructor <init>(IILd0/z;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ld0/h0;->a:I

    iput-object p3, p0, Ld0/h0;->b:Ld0/z;

    int-to-long v0, p1

    const-wide/32 v2, 0xf4240

    mul-long/2addr v0, v2

    iput-wide v0, p0, Ld0/h0;->c:J

    int-to-long p1, p2

    mul-long/2addr p1, v2

    iput-wide p1, p0, Ld0/h0;->d:J

    return-void
.end method


# virtual methods
.method public final b(FFFJ)F
    .locals 9

    iget-wide v1, p0, Ld0/h0;->d:J

    sub-long v1, p4, v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-gez v5, :cond_0

    move-wide v1, v3

    :cond_0
    iget-wide v5, p0, Ld0/h0;->c:J

    cmp-long v7, v1, v5

    if-lez v7, :cond_1

    move-wide v6, v5

    goto :goto_0

    :cond_1
    move-wide v6, v1

    :goto_0
    cmp-long v1, v6, v3

    if-nez v1, :cond_2

    return p3

    :cond_2
    const-wide/32 v1, 0xf4240

    sub-long v4, v6, v1

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    invoke-virtual/range {v0 .. v5}, Ld0/h0;->e(FFFJ)F

    move-result v8

    move-wide v4, v6

    invoke-virtual/range {v0 .. v5}, Ld0/h0;->e(FFFJ)F

    move-result v1

    sub-float/2addr v1, v8

    const/high16 v0, 0x447a0000    # 1000.0f

    mul-float/2addr v1, v0

    return v1
.end method

.method public final d(FFF)J
    .locals 2

    iget-wide p1, p0, Ld0/h0;->d:J

    iget-wide v0, p0, Ld0/h0;->c:J

    add-long/2addr p1, v0

    return-wide p1
.end method

.method public final e(FFFJ)F
    .locals 2

    iget-wide v0, p0, Ld0/h0;->d:J

    sub-long/2addr p4, v0

    const-wide/16 v0, 0x0

    cmp-long p3, p4, v0

    if-gez p3, :cond_0

    move-wide p4, v0

    :cond_0
    iget-wide v0, p0, Ld0/h0;->c:J

    cmp-long p3, p4, v0

    if-lez p3, :cond_1

    move-wide p4, v0

    :cond_1
    iget p3, p0, Ld0/h0;->a:I

    if-nez p3, :cond_2

    const/high16 p3, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_2
    long-to-float p3, p4

    long-to-float p4, v0

    div-float/2addr p3, p4

    :goto_0
    iget-object p4, p0, Ld0/h0;->b:Ld0/z;

    invoke-interface {p4, p3}, Ld0/z;->i(F)F

    move-result p3

    const/4 p4, 0x1

    int-to-float p4, p4

    sub-float/2addr p4, p3

    mul-float/2addr p4, p1

    mul-float/2addr p2, p3

    add-float/2addr p2, p4

    return p2
.end method
