.class public final Lcom/whoop/straphistorysync/sync/f$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/straphistorysync/sync/f$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/straphistorysync/sync/f$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0086\u0008\u0018\u00002\u00020\u0001B%\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\r\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u0014\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/whoop/straphistorysync/sync/f$b$a;",
        "Lcom/whoop/straphistorysync/sync/f$b;",
        "Lbi2/l;",
        "savedPacketCounts",
        "",
        "successfulBurstCount",
        "Lbi2/k;",
        "gapSummary",
        "<init>",
        "(Lbi2/l;ILbi2/k;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lbi2/l;",
        "b",
        "()Lbi2/l;",
        "I",
        "c",
        "Lbi2/k;",
        "()Lbi2/k;",
        "strap-history-sync_release"
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
.field private final a:Lbi2/l;

.field private final b:I

.field private final c:Lbi2/k;


# direct methods
.method public constructor <init>(Lbi2/l;ILbi2/k;)V
    .locals 1

    const-string v0, "savedPacketCounts"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gapSummary"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/straphistorysync/sync/f$b$a;->a:Lbi2/l;

    .line 3
    iput p2, p0, Lcom/whoop/straphistorysync/sync/f$b$a;->b:I

    .line 4
    iput-object p3, p0, Lcom/whoop/straphistorysync/sync/f$b$a;->c:Lbi2/k;

    return-void
.end method

.method public synthetic constructor <init>(Lbi2/l;ILbi2/k;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 5
    new-instance v0, Lbi2/l;

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lbi2/l;-><init>(Ljava/util/Map;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 6
    new-instance v0, Lbi2/k;

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lbi2/k;-><init>(IIJIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p3, v0

    .line 7
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/straphistorysync/sync/f$b$a;-><init>(Lbi2/l;ILbi2/k;)V

    return-void
.end method


# virtual methods
.method public a()Lbi2/k;
    .locals 1

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/f$b$a;->c:Lbi2/k;

    return-object v0
.end method

.method public b()Lbi2/l;
    .locals 1

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/f$b$a;->a:Lbi2/l;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/whoop/straphistorysync/sync/f$b$a;->b:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/straphistorysync/sync/f$b$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/straphistorysync/sync/f$b$a;

    iget-object v1, p0, Lcom/whoop/straphistorysync/sync/f$b$a;->a:Lbi2/l;

    iget-object v3, p1, Lcom/whoop/straphistorysync/sync/f$b$a;->a:Lbi2/l;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/straphistorysync/sync/f$b$a;->b:I

    iget v3, p1, Lcom/whoop/straphistorysync/sync/f$b$a;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/straphistorysync/sync/f$b$a;->c:Lbi2/k;

    iget-object p1, p1, Lcom/whoop/straphistorysync/sync/f$b$a;->c:Lbi2/k;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/f$b$a;->a:Lbi2/l;

    invoke-virtual {v0}, Lbi2/l;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/straphistorysync/sync/f$b$a;->b:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/straphistorysync/sync/f$b$a;->c:Lbi2/k;

    invoke-virtual {v1}, Lbi2/k;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Lcom/whoop/straphistorysync/sync/f$b$a;->c()I

    move-result v0

    invoke-virtual {p0}, Lcom/whoop/straphistorysync/sync/f$b$a;->b()Lbi2/l;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/straphistorysync/sync/f$b$a;->a()Lbi2/k;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "HPS.Disconnected(successfulBurstCount="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", counts="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", gaps="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
