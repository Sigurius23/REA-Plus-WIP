.class public final Lmp/y0;
.super Lmp/b1;
.source "SourceFile"


# instance fields
.field public final w:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lmp/y0;->w:J

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 4

    iget-wide v0, p0, Lmp/y0;->w:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/16 v0, 0x20

    :goto_0
    invoke-static {v0}, Lmp/b1;->d(B)I

    move-result v0

    return v0
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 4

    check-cast p1, Lmp/b1;

    invoke-virtual {p0}, Lmp/y0;->a()I

    move-result v0

    invoke-virtual {p1}, Lmp/b1;->a()I

    move-result v1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lmp/y0;->a()I

    move-result v0

    invoke-virtual {p1}, Lmp/b1;->a()I

    move-result p1

    sub-int/2addr v0, p1

    return v0

    :cond_0
    check-cast p1, Lmp/y0;

    iget-wide v0, p0, Lmp/y0;->w:J

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    iget-wide v2, p1, Lmp/y0;->w:J

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-gez p1, :cond_1

    const/4 p1, -0x1

    return p1

    :cond_1
    if-lez p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    const-class v2, Lmp/y0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    check-cast p1, Lmp/y0;

    iget-wide v2, p0, Lmp/y0;->w:J

    iget-wide v4, p1, Lmp/y0;->w:J

    cmp-long p1, v2, v4

    if-nez p1, :cond_3

    return v0

    :cond_3
    return v1
.end method

.method public final hashCode()I
    .locals 3

    invoke-virtual {p0}, Lmp/y0;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-wide v1, p0, Lmp/y0;->w:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    iget-wide v0, p0, Lmp/y0;->w:J

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
