.class public final Lcom/whoop/straphistorysync/sync/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/straphistorysync/sync/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/straphistorysync/sync/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00d6\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0011\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/whoop/straphistorysync/sync/c$b;",
        "Lcom/whoop/straphistorysync/sync/c;",
        "Loh2/a;",
        "metadata",
        "<init>",
        "(Loh2/a;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Loh2/a;",
        "()Loh2/a;",
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
.field private final a:Loh2/a;


# direct methods
.method public constructor <init>(Loh2/a;)V
    .locals 1

    const-string v0, "metadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/straphistorysync/sync/c$b;->a:Loh2/a;

    return-void
.end method

.method public synthetic constructor <init>(Loh2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    sget-object p1, Loh2/a;->g:Loh2/a$a;

    invoke-virtual {p1}, Loh2/a$a;->a()Loh2/a$b;

    move-result-object p1

    invoke-virtual {p1}, Loh2/a$b;->b()Loh2/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lcom/whoop/straphistorysync/sync/c$b;-><init>(Loh2/a;)V

    return-void
.end method


# virtual methods
.method public a()Loh2/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/c$b;->a:Loh2/a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/straphistorysync/sync/c$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/straphistorysync/sync/c$b;

    iget-object v1, p0, Lcom/whoop/straphistorysync/sync/c$b;->a:Loh2/a;

    iget-object p1, p1, Lcom/whoop/straphistorysync/sync/c$b;->a:Loh2/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/c$b;->a:Loh2/a;

    invoke-virtual {v0}, Loh2/a;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/whoop/straphistorysync/sync/c$b;->a()Loh2/a;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "BurstState.Running(metadata="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
