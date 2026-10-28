.class public final Lsr1/e$d;
.super Lsr1/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsr1/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\r\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001a\u001a\u0004\u0008\u001e\u0010\u001cR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001f\u001a\u0004\u0008\u001d\u0010\u000eR\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010 \u001a\u0004\u0008\u0016\u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lsr1/e$d;",
        "Lsr1/e;",
        "Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;",
        "journalTrackerRequest",
        "",
        "isDefaultAnswerToggleEnabled",
        "isDefaultAnswerToggleVisible",
        "",
        "requestDate",
        "",
        "cycleId",
        "<init>",
        "(Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;ZZLjava/lang/String;J)V",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;",
        "b",
        "()Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;",
        "Z",
        "d",
        "()Z",
        "c",
        "e",
        "Ljava/lang/String;",
        "J",
        "()J",
        "journal_release"
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
.field private final a:Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;

.field private final b:Z

.field private final c:Z

.field private final d:Ljava/lang/String;

.field private final e:J


# direct methods
.method public constructor <init>(Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;ZZLjava/lang/String;J)V
    .locals 1

    const-string v0, "journalTrackerRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestDate"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lsr1/e;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lsr1/e$d;->a:Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;

    iput-boolean p2, p0, Lsr1/e$d;->b:Z

    iput-boolean p3, p0, Lsr1/e$d;->c:Z

    iput-object p4, p0, Lsr1/e$d;->d:Ljava/lang/String;

    iput-wide p5, p0, Lsr1/e$d;->e:J

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-wide v0, p0, Lsr1/e$d;->e:J

    return-wide v0
.end method

.method public final b()Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;
    .locals 1

    iget-object v0, p0, Lsr1/e$d;->a:Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lsr1/e$d;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lsr1/e$d;->b:Z

    return v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lsr1/e$d;->c:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lsr1/e$d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lsr1/e$d;

    iget-object v1, p0, Lsr1/e$d;->a:Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;

    iget-object v3, p1, Lsr1/e$d;->a:Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lsr1/e$d;->b:Z

    iget-boolean v3, p1, Lsr1/e$d;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lsr1/e$d;->c:Z

    iget-boolean v3, p1, Lsr1/e$d;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lsr1/e$d;->d:Ljava/lang/String;

    iget-object v3, p1, Lsr1/e$d;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lsr1/e$d;->e:J

    iget-wide v5, p1, Lsr1/e$d;->e:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lsr1/e$d;->a:Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lsr1/e$d;->b:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lsr1/e$d;->c:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lsr1/e$d;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-wide v1, p0, Lsr1/e$d;->e:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lsr1/e$d;->a:Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;

    iget-boolean v1, p0, Lsr1/e$d;->b:Z

    iget-boolean v2, p0, Lsr1/e$d;->c:Z

    iget-object v3, p0, Lsr1/e$d;->d:Ljava/lang/String;

    iget-wide v4, p0, Lsr1/e$d;->e:J

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "SavingV2(journalTrackerRequest="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isDefaultAnswerToggleEnabled="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isDefaultAnswerToggleVisible="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", requestDate="

    const-string v1, ", cycleId="

    invoke-static {v6, v2, v0, v3, v1}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ")"

    invoke-static {v4, v5, v0, v6}, Ld;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
