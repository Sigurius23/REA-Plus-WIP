.class public final Lh40/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lt0/i;

.field public final b:J

.field public final c:J


# direct methods
.method public constructor <init>(Lt0/i;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh40/e;->a:Lt0/i;

    iput-wide p2, p0, Lh40/e;->b:J

    iput-wide p4, p0, Lh40/e;->c:J

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lh40/e;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lh40/e;

    iget-object v0, p0, Lh40/e;->a:Lt0/i;

    iget-object v1, p1, Lh40/e;->a:Lt0/i;

    invoke-virtual {v0, v1}, Lt0/i;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-wide v0, p0, Lh40/e;->b:J

    iget-wide v2, p1, Lh40/e;->b:J

    invoke-static {v0, v1, v2, v3}, Li2/x;->d(JJ)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-wide v0, p0, Lh40/e;->c:J

    iget-wide v2, p1, Lh40/e;->c:J

    invoke-static {v0, v1, v2, v3}, Li2/x;->d(JJ)Z

    move-result p1

    if-nez p1, :cond_4

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_4
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lh40/e;->a:Lt0/i;

    invoke-virtual {v0}, Lt0/i;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    sget v2, Li2/x;->o:I

    iget-wide v2, p0, Lh40/e;->b:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v1, p0, Lh40/e;->c:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    iget-wide v0, p0, Lh40/e;->b:J

    invoke-static {v0, v1}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, Lh40/e;->c:J

    invoke-static {v1, v2}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "StripeBottomSheetLayoutInfo(sheetShape="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lh40/e;->a:Lt0/i;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", sheetBackgroundColor="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", scrimColor="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v1, v0, v2}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
