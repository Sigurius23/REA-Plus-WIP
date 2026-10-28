.class public final Lcom/whoop/data/remote/domain/response/journal/JournalEntry;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001B+\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000cJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007H\u00c6\u0003J8\u0010\u0015\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\u0008\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0005H\u00d6\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\u0008\u000b\u0010\u000cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/response/journal/JournalEntry;",
        "",
        "journalEntryId",
        "",
        "notes",
        "",
        "trackedBehaviors",
        "",
        "Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;",
        "<init>",
        "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V",
        "getJournalEntryId",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getNotes",
        "()Ljava/lang/String;",
        "getTrackedBehaviors",
        "()Ljava/util/List;",
        "component1",
        "component2",
        "component3",
        "copy",
        "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/data/remote/domain/response/journal/JournalEntry;",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
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
.field private final journalEntryId:Ljava/lang/Integer;

.field private final notes:Ljava/lang/String;

.field private final trackedBehaviors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntry;->journalEntryId:Ljava/lang/Integer;

    iput-object p2, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntry;->notes:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntry;->trackedBehaviors:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/response/journal/JournalEntry;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/response/journal/JournalEntry;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntry;->journalEntryId:Ljava/lang/Integer;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntry;->notes:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntry;->trackedBehaviors:Ljava/util/List;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/data/remote/domain/response/journal/JournalEntry;->copy(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/data/remote/domain/response/journal/JournalEntry;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntry;->journalEntryId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntry;->notes:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntry;->trackedBehaviors:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/data/remote/domain/response/journal/JournalEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;",
            ">;)",
            "Lcom/whoop/data/remote/domain/response/journal/JournalEntry;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/data/remote/domain/response/journal/JournalEntry;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/data/remote/domain/response/journal/JournalEntry;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/response/journal/JournalEntry;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/response/journal/JournalEntry;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntry;->journalEntryId:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/response/journal/JournalEntry;->journalEntryId:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntry;->notes:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/response/journal/JournalEntry;->notes:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntry;->trackedBehaviors:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/data/remote/domain/response/journal/JournalEntry;->trackedBehaviors:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getJournalEntryId()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntry;->journalEntryId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getNotes()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntry;->notes:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrackedBehaviors()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/response/journal/TrackedBehavior;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntry;->trackedBehaviors:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntry;->journalEntryId:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntry;->notes:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntry;->trackedBehaviors:Ljava/util/List;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntry;->journalEntryId:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntry;->notes:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntry;->trackedBehaviors:Ljava/util/List;

    const-string v3, ", notes="

    const-string v4, ", trackedBehaviors="

    const-string v5, "JournalEntry(journalEntryId="

    invoke-static {v5, v3, v0, v1, v4}, Lr80/c;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-static {v0, v2, v1}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
