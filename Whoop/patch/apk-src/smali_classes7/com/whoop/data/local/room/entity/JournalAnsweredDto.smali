.class public final Lcom/whoop/data/local/room/entity/JournalAnsweredDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0012\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010\u0015\u001a\u00020\u00052\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018H\u00d6\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aH\u00d6\u0081\u0004R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000cR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0004\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\r\"\u0004\u0008\u0010\u0010\u000f\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/whoop/data/local/room/entity/JournalAnsweredDto;",
        "",
        "cycleId",
        "",
        "isJournalShown",
        "",
        "isJournalAnswered",
        "<init>",
        "(JZZ)V",
        "getCycleId",
        "()J",
        "setCycleId",
        "(J)V",
        "()Z",
        "setJournalShown",
        "(Z)V",
        "setJournalAnswered",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private cycleId:J

.field private isJournalAnswered:Z

.field private isJournalShown:Z


# direct methods
.method public constructor <init>(JZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;->cycleId:J

    iput-boolean p3, p0, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;->isJournalShown:Z

    iput-boolean p4, p0, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;->isJournalAnswered:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/data/local/room/entity/JournalAnsweredDto;JZZILjava/lang/Object;)Lcom/whoop/data/local/room/entity/JournalAnsweredDto;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-wide p1, p0, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;->cycleId:J

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-boolean p3, p0, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;->isJournalShown:Z

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    iget-boolean p4, p0, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;->isJournalAnswered:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;->copy(JZZ)Lcom/whoop/data/local/room/entity/JournalAnsweredDto;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;->cycleId:J

    return-wide v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;->isJournalShown:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;->isJournalAnswered:Z

    return v0
.end method

.method public final copy(JZZ)Lcom/whoop/data/local/room/entity/JournalAnsweredDto;
    .locals 1

    new-instance v0, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;-><init>(JZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;

    iget-wide v3, p0, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;->cycleId:J

    iget-wide v5, p1, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;->cycleId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;->isJournalShown:Z

    iget-boolean v3, p1, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;->isJournalShown:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;->isJournalAnswered:Z

    iget-boolean p1, p1, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;->isJournalAnswered:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getCycleId()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;->cycleId:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;->cycleId:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;->isJournalShown:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;->isJournalAnswered:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isJournalAnswered()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;->isJournalAnswered:Z

    return v0
.end method

.method public final isJournalShown()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;->isJournalShown:Z

    return v0
.end method

.method public final setCycleId(J)V
    .locals 0

    iput-wide p1, p0, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;->cycleId:J

    return-void
.end method

.method public final setJournalAnswered(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;->isJournalAnswered:Z

    return-void
.end method

.method public final setJournalShown(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;->isJournalShown:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-wide v0, p0, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;->cycleId:J

    iget-boolean v2, p0, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;->isJournalShown:Z

    iget-boolean v3, p0, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;->isJournalAnswered:Z

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "JournalAnsweredDto(cycleId="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", isJournalShown="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isJournalAnswered="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
