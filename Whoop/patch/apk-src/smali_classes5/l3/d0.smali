.class public final Ll3/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:J

.field public final c:I


# direct methods
.method public constructor <init>(JJI)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ll3/d0;->a:J

    iput-wide p3, p0, Ll3/d0;->b:J

    iput p5, p0, Ll3/d0;->c:I

    sget-object p5, Ly3/o;->b:[Ly3/p;

    const-wide v0, 0xff00000000L

    and-long/2addr p1, v0

    const-wide/16 v2, 0x0

    cmp-long p1, p1, v2

    if-nez p1, :cond_0

    const-string p1, "width cannot be TextUnit.Unspecified"

    invoke-static {p1}, Lr3/a;->a(Ljava/lang/String;)V

    :cond_0
    and-long p1, p3, v0

    cmp-long p1, p1, v2

    if-nez p1, :cond_1

    const-string p1, "height cannot be TextUnit.Unspecified"

    invoke-static {p1}, Lr3/a;->a(Ljava/lang/String;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-wide v0, p0, Ll3/d0;->b:J

    return-wide v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Ll3/d0;->c:I

    return v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Ll3/d0;->a:J

    return-wide v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ll3/d0;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Ll3/d0;

    iget-wide v0, p1, Ll3/d0;->a:J

    iget-wide v2, p0, Ll3/d0;->a:J

    invoke-static {v2, v3, v0, v1}, Ly3/o;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    iget-wide v0, p0, Ll3/d0;->b:J

    iget-wide v2, p1, Ll3/d0;->b:J

    invoke-static {v0, v1, v2, v3}, Ly3/o;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    iget v0, p0, Ll3/d0;->c:I

    iget p1, p1, Ll3/d0;->c:I

    if-ne v0, p1, :cond_4

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_4
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 4

    sget-object v0, Ly3/o;->b:[Ly3/p;

    iget-wide v0, p0, Ll3/d0;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Ll3/d0;->b:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget v1, p0, Ll3/d0;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Placeholder(width="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Ll3/d0;->a:J

    invoke-static {v1, v2}, Ly3/o;->e(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll3/d0;->b:J

    invoke-static {v1, v2}, Ly3/o;->e(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", placeholderVerticalAlign="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    iget v2, p0, Ll3/d0;->c:I

    if-ne v2, v1, :cond_0

    const-string v1, "AboveBaseline"

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    if-ne v2, v1, :cond_1

    const-string v1, "Top"

    goto :goto_0

    :cond_1
    const/4 v1, 0x3

    if-ne v2, v1, :cond_2

    const-string v1, "Bottom"

    goto :goto_0

    :cond_2
    const/4 v1, 0x4

    if-ne v2, v1, :cond_3

    const-string v1, "Center"

    goto :goto_0

    :cond_3
    const/4 v1, 0x5

    if-ne v2, v1, :cond_4

    const-string v1, "TextTop"

    goto :goto_0

    :cond_4
    const/4 v1, 0x6

    if-ne v2, v1, :cond_5

    const-string v1, "TextBottom"

    goto :goto_0

    :cond_5
    const/4 v1, 0x7

    if-ne v2, v1, :cond_6

    const-string v1, "TextCenter"

    goto :goto_0

    :cond_6
    const-string v1, "Invalid"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
