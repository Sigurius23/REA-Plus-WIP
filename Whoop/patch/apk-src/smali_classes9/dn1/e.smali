.class public final Ldn1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldn1/c;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J&\u0010\u0008\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0014\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Ldn1/e;",
        "",
        "Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;",
        "response",
        "Ldn1/i;",
        "selectedValue",
        "<init>",
        "(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;Ldn1/i;)V",
        "b",
        "(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;Ldn1/i;)Ldn1/e;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;",
        "()Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;",
        "Ldn1/i;",
        "d",
        "()Ldn1/i;",
        "home-customization_release"
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
.field private final a:Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;

.field private final b:Ldn1/i;


# direct methods
.method public constructor <init>(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;Ldn1/i;)V
    .locals 1

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ldn1/e;->a:Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;

    .line 3
    iput-object p2, p0, Ldn1/e;->b:Ldn1/i;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;Ldn1/i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2}, Ldn1/e;-><init>(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;Ldn1/i;)V

    return-void
.end method

.method public static synthetic c(Ldn1/e;Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;Ldn1/i;ILjava/lang/Object;)Ldn1/e;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Ldn1/e;->a:Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Ldn1/e;->b:Ldn1/i;

    :cond_1
    invoke-virtual {p0, p1, p2}, Ldn1/e;->b(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;Ldn1/i;)Ldn1/e;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;
    .locals 1

    iget-object v0, p0, Ldn1/e;->a:Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;

    return-object v0
.end method

.method public final b(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;Ldn1/i;)Ldn1/e;
    .locals 1

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldn1/e;

    invoke-direct {v0, p1, p2}, Ldn1/e;-><init>(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;Ldn1/i;)V

    return-object v0
.end method

.method public final d()Ldn1/i;
    .locals 1

    iget-object v0, p0, Ldn1/e;->b:Ldn1/i;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ldn1/e;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ldn1/e;

    iget-object v1, p0, Ldn1/e;->a:Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;

    iget-object v3, p1, Ldn1/e;->a:Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ldn1/e;->b:Ldn1/i;

    iget-object p1, p1, Ldn1/e;->b:Ldn1/i;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Ldn1/e;->a:Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;

    invoke-virtual {v0}, Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ldn1/e;->b:Ldn1/i;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ldn1/i;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Ldn1/e;->a:Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;

    iget-object v1, p0, Ldn1/e;->b:Ldn1/i;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Result(response="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", selectedValue="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
