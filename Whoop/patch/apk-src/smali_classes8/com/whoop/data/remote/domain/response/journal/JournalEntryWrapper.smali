.class public final Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000b\u0010\u000c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u00d6\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u00d6\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;",
        "",
        "journalEntry",
        "Lcom/whoop/data/remote/domain/response/journal/JournalEntry;",
        "metadata",
        "Lcom/whoop/data/remote/domain/response/journal/JournalMetadata;",
        "<init>",
        "(Lcom/whoop/data/remote/domain/response/journal/JournalEntry;Lcom/whoop/data/remote/domain/response/journal/JournalMetadata;)V",
        "getJournalEntry",
        "()Lcom/whoop/data/remote/domain/response/journal/JournalEntry;",
        "getMetadata",
        "()Lcom/whoop/data/remote/domain/response/journal/JournalMetadata;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
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
.field private final journalEntry:Lcom/whoop/data/remote/domain/response/journal/JournalEntry;

.field private final metadata:Lcom/whoop/data/remote/domain/response/journal/JournalMetadata;


# direct methods
.method public constructor <init>(Lcom/whoop/data/remote/domain/response/journal/JournalEntry;Lcom/whoop/data/remote/domain/response/journal/JournalMetadata;)V
    .locals 1

    const-string v0, "metadata"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;->journalEntry:Lcom/whoop/data/remote/domain/response/journal/JournalEntry;

    iput-object p2, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;->metadata:Lcom/whoop/data/remote/domain/response/journal/JournalMetadata;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;Lcom/whoop/data/remote/domain/response/journal/JournalEntry;Lcom/whoop/data/remote/domain/response/journal/JournalMetadata;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;->journalEntry:Lcom/whoop/data/remote/domain/response/journal/JournalEntry;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;->metadata:Lcom/whoop/data/remote/domain/response/journal/JournalMetadata;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;->copy(Lcom/whoop/data/remote/domain/response/journal/JournalEntry;Lcom/whoop/data/remote/domain/response/journal/JournalMetadata;)Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/whoop/data/remote/domain/response/journal/JournalEntry;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;->journalEntry:Lcom/whoop/data/remote/domain/response/journal/JournalEntry;

    return-object v0
.end method

.method public final component2()Lcom/whoop/data/remote/domain/response/journal/JournalMetadata;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;->metadata:Lcom/whoop/data/remote/domain/response/journal/JournalMetadata;

    return-object v0
.end method

.method public final copy(Lcom/whoop/data/remote/domain/response/journal/JournalEntry;Lcom/whoop/data/remote/domain/response/journal/JournalMetadata;)Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;
    .locals 1

    const-string v0, "metadata"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;

    invoke-direct {v0, p1, p2}, Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;-><init>(Lcom/whoop/data/remote/domain/response/journal/JournalEntry;Lcom/whoop/data/remote/domain/response/journal/JournalMetadata;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;->journalEntry:Lcom/whoop/data/remote/domain/response/journal/JournalEntry;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;->journalEntry:Lcom/whoop/data/remote/domain/response/journal/JournalEntry;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;->metadata:Lcom/whoop/data/remote/domain/response/journal/JournalMetadata;

    iget-object p1, p1, Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;->metadata:Lcom/whoop/data/remote/domain/response/journal/JournalMetadata;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getJournalEntry()Lcom/whoop/data/remote/domain/response/journal/JournalEntry;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;->journalEntry:Lcom/whoop/data/remote/domain/response/journal/JournalEntry;

    return-object v0
.end method

.method public final getMetadata()Lcom/whoop/data/remote/domain/response/journal/JournalMetadata;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;->metadata:Lcom/whoop/data/remote/domain/response/journal/JournalMetadata;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;->journalEntry:Lcom/whoop/data/remote/domain/response/journal/JournalEntry;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/response/journal/JournalEntry;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;->metadata:Lcom/whoop/data/remote/domain/response/journal/JournalMetadata;

    invoke-virtual {v1}, Lcom/whoop/data/remote/domain/response/journal/JournalMetadata;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;->journalEntry:Lcom/whoop/data/remote/domain/response/journal/JournalEntry;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;->metadata:Lcom/whoop/data/remote/domain/response/journal/JournalMetadata;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "JournalEntryWrapper(journalEntry="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", metadata="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
