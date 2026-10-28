.class public final Lx20/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:I

.field public final c:Lx20/o;

.field public final d:Z


# direct methods
.method public constructor <init>(JILx20/o;Z)V
    .locals 1

    const-string v0, "pollingState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lx20/p;->a:J

    iput p3, p0, Lx20/p;->b:I

    iput-object p4, p0, Lx20/p;->c:Lx20/o;

    iput-boolean p5, p0, Lx20/p;->d:Z

    return-void
.end method

.method public static a(Lx20/p;JLx20/o;ZI)Lx20/p;
    .locals 6

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    iget-wide p1, p0, Lx20/p;->a:J

    :cond_0
    move-wide v1, p1

    iget v3, p0, Lx20/p;->b:I

    and-int/lit8 p1, p5, 0x4

    if-eqz p1, :cond_1

    iget-object p3, p0, Lx20/p;->c:Lx20/o;

    :cond_1
    move-object v4, p3

    and-int/lit8 p1, p5, 0x8

    if-eqz p1, :cond_2

    iget-boolean p4, p0, Lx20/p;->d:Z

    :cond_2
    move v5, p4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p0, "pollingState"

    invoke-static {v4, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lx20/p;

    invoke-direct/range {v0 .. v5}, Lx20/p;-><init>(JILx20/o;Z)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lx20/p;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lx20/p;

    iget-wide v3, p0, Lx20/p;->a:J

    iget-wide v5, p1, Lx20/p;->a:J

    invoke-static {v3, v4, v5, v6}, Lkotlin/time/Duration;->equals-impl0(JJ)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lx20/p;->b:I

    iget v3, p1, Lx20/p;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lx20/p;->c:Lx20/o;

    iget-object v3, p1, Lx20/p;->c:Lx20/o;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lx20/p;->d:Z

    iget-boolean p1, p1, Lx20/p;->d:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-wide v0, p0, Lx20/p;->a:J

    invoke-static {v0, v1}, Lkotlin/time/Duration;->hashCode-impl(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lx20/p;->b:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lx20/p;->c:Lx20/o;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lx20/p;->d:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    iget-wide v0, p0, Lx20/p;->a:J

    invoke-static {v0, v1}, Lkotlin/time/Duration;->toString-impl(J)Ljava/lang/String;

    move-result-object v0

    const-string v1, ", ctaText="

    const-string v2, ", pollingState="

    iget v3, p0, Lx20/p;->b:I

    const-string v4, "PollingUiState(durationRemaining="

    invoke-static {v3, v4, v0, v1, v2}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lx20/p;->c:Lx20/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shouldShowQrCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lx20/p;->d:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
