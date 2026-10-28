.class public final Lur1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ<\u0010\u000b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\r\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0018\u001a\u0004\u0008\u001b\u0010\u001aR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lur1/d;",
        "",
        "",
        "title",
        "Lcom/whoop/data/remote/domain/dto/JournalDayInfo;",
        "nextDay",
        "previousDay",
        "",
        "isLoading",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalDayInfo;Lcom/whoop/data/remote/domain/dto/JournalDayInfo;Z)V",
        "a",
        "(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalDayInfo;Lcom/whoop/data/remote/domain/dto/JournalDayInfo;Z)Lur1/d;",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "e",
        "b",
        "Lcom/whoop/data/remote/domain/dto/JournalDayInfo;",
        "c",
        "()Lcom/whoop/data/remote/domain/dto/JournalDayInfo;",
        "d",
        "Z",
        "f",
        "()Z",
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
.field private final a:Ljava/lang/String;

.field private final b:Lcom/whoop/data/remote/domain/dto/JournalDayInfo;

.field private final c:Lcom/whoop/data/remote/domain/dto/JournalDayInfo;

.field private final d:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalDayInfo;Lcom/whoop/data/remote/domain/dto/JournalDayInfo;Z)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lur1/d;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lur1/d;->b:Lcom/whoop/data/remote/domain/dto/JournalDayInfo;

    .line 4
    iput-object p3, p0, Lur1/d;->c:Lcom/whoop/data/remote/domain/dto/JournalDayInfo;

    .line 5
    iput-boolean p4, p0, Lur1/d;->d:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalDayInfo;Lcom/whoop/data/remote/domain/dto/JournalDayInfo;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lur1/d;-><init>(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalDayInfo;Lcom/whoop/data/remote/domain/dto/JournalDayInfo;Z)V

    return-void
.end method

.method public static synthetic b(Lur1/d;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalDayInfo;Lcom/whoop/data/remote/domain/dto/JournalDayInfo;ZILjava/lang/Object;)Lur1/d;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lur1/d;->a:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lur1/d;->b:Lcom/whoop/data/remote/domain/dto/JournalDayInfo;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lur1/d;->c:Lcom/whoop/data/remote/domain/dto/JournalDayInfo;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lur1/d;->d:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lur1/d;->a(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalDayInfo;Lcom/whoop/data/remote/domain/dto/JournalDayInfo;Z)Lur1/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalDayInfo;Lcom/whoop/data/remote/domain/dto/JournalDayInfo;Z)Lur1/d;
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lur1/d;

    invoke-direct {v0, p1, p2, p3, p4}, Lur1/d;-><init>(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalDayInfo;Lcom/whoop/data/remote/domain/dto/JournalDayInfo;Z)V

    return-object v0
.end method

.method public final c()Lcom/whoop/data/remote/domain/dto/JournalDayInfo;
    .locals 1

    iget-object v0, p0, Lur1/d;->b:Lcom/whoop/data/remote/domain/dto/JournalDayInfo;

    return-object v0
.end method

.method public final d()Lcom/whoop/data/remote/domain/dto/JournalDayInfo;
    .locals 1

    iget-object v0, p0, Lur1/d;->c:Lcom/whoop/data/remote/domain/dto/JournalDayInfo;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lur1/d;->a:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lur1/d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lur1/d;

    iget-object v1, p0, Lur1/d;->a:Ljava/lang/String;

    iget-object v3, p1, Lur1/d;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lur1/d;->b:Lcom/whoop/data/remote/domain/dto/JournalDayInfo;

    iget-object v3, p1, Lur1/d;->b:Lcom/whoop/data/remote/domain/dto/JournalDayInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lur1/d;->c:Lcom/whoop/data/remote/domain/dto/JournalDayInfo;

    iget-object v3, p1, Lur1/d;->c:Lcom/whoop/data/remote/domain/dto/JournalDayInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lur1/d;->d:Z

    iget-boolean p1, p1, Lur1/d;->d:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lur1/d;->d:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lur1/d;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lur1/d;->b:Lcom/whoop/data/remote/domain/dto/JournalDayInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/data/remote/domain/dto/JournalDayInfo;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lur1/d;->c:Lcom/whoop/data/remote/domain/dto/JournalDayInfo;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/data/remote/domain/dto/JournalDayInfo;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lur1/d;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lur1/d;->a:Ljava/lang/String;

    iget-object v1, p0, Lur1/d;->b:Lcom/whoop/data/remote/domain/dto/JournalDayInfo;

    iget-object v2, p0, Lur1/d;->c:Lcom/whoop/data/remote/domain/dto/JournalDayInfo;

    iget-boolean v3, p0, Lur1/d;->d:Z

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "DatePickerDomainState(title="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", nextDay="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", previousDay="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isLoading="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
