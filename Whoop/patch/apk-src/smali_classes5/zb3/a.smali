.class public final Lzb3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# static fields
.field public static final y:Lzb3/a;


# instance fields
.field public final w:J

.field public final x:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lzb3/a;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2, v1, v2}, Lzb3/a;-><init>(JJ)V

    sput-object v0, Lzb3/a;->y:Lzb3/a;

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lzb3/a;->w:J

    iput-wide p3, p0, Lzb3/a;->x:J

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 5

    check-cast p1, Lzb3/a;

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p1, Lzb3/a;->w:J

    iget-wide v2, p0, Lzb3/a;->w:J

    cmp-long v4, v2, v0

    if-eqz v4, :cond_0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result p1

    return p1

    :cond_0
    iget-wide v0, p0, Lzb3/a;->x:J

    iget-wide v2, p1, Lzb3/a;->x:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lzb3/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lzb3/a;

    iget-wide v3, p1, Lzb3/a;->w:J

    iget-wide v5, p0, Lzb3/a;->w:J

    cmp-long v1, v5, v3

    if-nez v1, :cond_2

    iget-wide v3, p0, Lzb3/a;->x:J

    iget-wide v5, p1, Lzb3/a;->x:J

    cmp-long p1, v3, v5

    if-nez p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 4

    iget-wide v0, p0, Lzb3/a;->w:J

    iget-wide v2, p0, Lzb3/a;->x:J

    xor-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    const/16 v0, 0x24

    new-array v3, v0, [B

    const/4 v5, 0x0

    const/4 v6, 0x4

    iget-wide v1, p0, Lzb3/a;->w:J

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ls2/a;->h(J[BIII)V

    const/16 v0, 0x8

    const/16 v7, 0x2d

    aput-byte v7, v3, v0

    const/4 v5, 0x4

    const/4 v6, 0x6

    iget-wide v1, p0, Lzb3/a;->w:J

    const/16 v4, 0x9

    invoke-static/range {v1 .. v6}, Ls2/a;->h(J[BIII)V

    const/16 v0, 0xd

    aput-byte v7, v3, v0

    const/4 v5, 0x6

    const/16 v6, 0x8

    iget-wide v1, p0, Lzb3/a;->w:J

    const/16 v4, 0xe

    invoke-static/range {v1 .. v6}, Ls2/a;->h(J[BIII)V

    const/16 v0, 0x12

    aput-byte v7, v3, v0

    const/4 v5, 0x0

    const/4 v6, 0x2

    iget-wide v1, p0, Lzb3/a;->x:J

    const/16 v4, 0x13

    invoke-static/range {v1 .. v6}, Ls2/a;->h(J[BIII)V

    const/16 v0, 0x17

    aput-byte v7, v3, v0

    const/4 v5, 0x2

    const/16 v6, 0x8

    iget-wide v1, p0, Lzb3/a;->x:J

    const/16 v4, 0x18

    invoke-static/range {v1 .. v6}, Ls2/a;->h(J[BIII)V

    invoke-static {v3}, Lyb3/y;->A([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
