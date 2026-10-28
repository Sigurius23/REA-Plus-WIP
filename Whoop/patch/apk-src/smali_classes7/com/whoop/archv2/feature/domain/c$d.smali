.class public final Lcom/whoop/archv2/feature/domain/c$d;
.super Lcom/whoop/archv2/feature/domain/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/archv2/feature/domain/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u00002\u00020\u0001B)\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0015\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0018\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001b\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/whoop/archv2/feature/domain/c$d;",
        "Lcom/whoop/archv2/feature/domain/c;",
        "Lcom/whoop/navigation/models/ApiRequest;",
        "apiRequest",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "callerOnStartInteraction",
        "Lcom/whoop/archv2/feature/domain/m;",
        "genericTopItems",
        "<init>",
        "(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/archv2/feature/domain/m;)V",
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
        "Lcom/whoop/navigation/models/ApiRequest;",
        "()Lcom/whoop/navigation/models/ApiRequest;",
        "b",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "c",
        "Lcom/whoop/archv2/feature/domain/m;",
        "()Lcom/whoop/archv2/feature/domain/m;",
        "arch-v2_release"
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
.field private final a:Lcom/whoop/navigation/models/ApiRequest;

.field private final b:Lcom/whoop/navigation/models/GenericInteraction;

.field private final c:Lcom/whoop/archv2/feature/domain/m;


# direct methods
.method public constructor <init>(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/archv2/feature/domain/m;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/whoop/archv2/feature/domain/c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/whoop/archv2/feature/domain/c$d;->a:Lcom/whoop/navigation/models/ApiRequest;

    iput-object p2, p0, Lcom/whoop/archv2/feature/domain/c$d;->b:Lcom/whoop/navigation/models/GenericInteraction;

    iput-object p3, p0, Lcom/whoop/archv2/feature/domain/c$d;->c:Lcom/whoop/archv2/feature/domain/m;

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/navigation/models/ApiRequest;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/c$d;->a:Lcom/whoop/navigation/models/ApiRequest;

    return-object v0
.end method

.method public final b()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/c$d;->b:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final c()Lcom/whoop/archv2/feature/domain/m;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/c$d;->c:Lcom/whoop/archv2/feature/domain/m;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/archv2/feature/domain/c$d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/archv2/feature/domain/c$d;

    iget-object v1, p0, Lcom/whoop/archv2/feature/domain/c$d;->a:Lcom/whoop/navigation/models/ApiRequest;

    iget-object v3, p1, Lcom/whoop/archv2/feature/domain/c$d;->a:Lcom/whoop/navigation/models/ApiRequest;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/archv2/feature/domain/c$d;->b:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p1, Lcom/whoop/archv2/feature/domain/c$d;->b:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/archv2/feature/domain/c$d;->c:Lcom/whoop/archv2/feature/domain/m;

    iget-object p1, p1, Lcom/whoop/archv2/feature/domain/c$d;->c:Lcom/whoop/archv2/feature/domain/m;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/c$d;->a:Lcom/whoop/navigation/models/ApiRequest;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/navigation/models/ApiRequest;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/archv2/feature/domain/c$d;->b:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/archv2/feature/domain/c$d;->c:Lcom/whoop/archv2/feature/domain/m;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/archv2/feature/domain/m;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/archv2/feature/domain/c$d;->a:Lcom/whoop/navigation/models/ApiRequest;

    iget-object v1, p0, Lcom/whoop/archv2/feature/domain/c$d;->b:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v2, p0, Lcom/whoop/archv2/feature/domain/c$d;->c:Lcom/whoop/archv2/feature/domain/m;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Init(apiRequest="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", callerOnStartInteraction="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", genericTopItems="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
