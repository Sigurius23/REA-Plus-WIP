.class public final Lqw2/b$e;
.super Lqw2/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqw2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\r\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008\u001e\u0010 R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001f\u001a\u0004\u0008\u001a\u0010 R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010!\u001a\u0004\u0008\u0017\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Lqw2/b$e;",
        "Lqw2/b;",
        "",
        "stateKey",
        "Lcom/whoop/whoopaction/domain/models/PickMediaSource;",
        "source",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "onSuccess",
        "onError",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "action",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/PickMediaSource;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/whoopaction/domain/models/Action;)V",
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
        "Ljava/lang/String;",
        "e",
        "b",
        "Lcom/whoop/whoopaction/domain/models/PickMediaSource;",
        "d",
        "()Lcom/whoop/whoopaction/domain/models/PickMediaSource;",
        "c",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "()Lcom/whoop/whoopaction/domain/models/Action;",
        "whoop-action_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final f:I


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/whoop/whoopaction/domain/models/PickMediaSource;

.field private final c:Lcom/whoop/navigation/models/GenericInteraction;

.field private final d:Lcom/whoop/navigation/models/GenericInteraction;

.field private final e:Lcom/whoop/whoopaction/domain/models/Action;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/whoop/navigation/models/GenericInteraction;->$stable:I

    sput v0, Lqw2/b$e;->f:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/PickMediaSource;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/whoopaction/domain/models/Action;)V
    .locals 1

    const-string v0, "stateKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "action"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lqw2/b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lqw2/b$e;->a:Ljava/lang/String;

    iput-object p2, p0, Lqw2/b$e;->b:Lcom/whoop/whoopaction/domain/models/PickMediaSource;

    iput-object p3, p0, Lqw2/b$e;->c:Lcom/whoop/navigation/models/GenericInteraction;

    iput-object p4, p0, Lqw2/b$e;->d:Lcom/whoop/navigation/models/GenericInteraction;

    iput-object p5, p0, Lqw2/b$e;->e:Lcom/whoop/whoopaction/domain/models/Action;

    return-void
.end method


# virtual methods
.method public a()Lcom/whoop/whoopaction/domain/models/Action;
    .locals 1

    iget-object v0, p0, Lqw2/b$e;->e:Lcom/whoop/whoopaction/domain/models/Action;

    return-object v0
.end method

.method public final b()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lqw2/b$e;->d:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final c()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lqw2/b$e;->c:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final d()Lcom/whoop/whoopaction/domain/models/PickMediaSource;
    .locals 1

    iget-object v0, p0, Lqw2/b$e;->b:Lcom/whoop/whoopaction/domain/models/PickMediaSource;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqw2/b$e;->a:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lqw2/b$e;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lqw2/b$e;

    iget-object v1, p0, Lqw2/b$e;->a:Ljava/lang/String;

    iget-object v3, p1, Lqw2/b$e;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lqw2/b$e;->b:Lcom/whoop/whoopaction/domain/models/PickMediaSource;

    iget-object v3, p1, Lqw2/b$e;->b:Lcom/whoop/whoopaction/domain/models/PickMediaSource;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lqw2/b$e;->c:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p1, Lqw2/b$e;->c:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lqw2/b$e;->d:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p1, Lqw2/b$e;->d:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lqw2/b$e;->e:Lcom/whoop/whoopaction/domain/models/Action;

    iget-object p1, p1, Lqw2/b$e;->e:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lqw2/b$e;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lqw2/b$e;->b:Lcom/whoop/whoopaction/domain/models/PickMediaSource;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lqw2/b$e;->c:Lcom/whoop/navigation/models/GenericInteraction;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lqw2/b$e;->d:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lqw2/b$e;->e:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lqw2/b$e;->a:Ljava/lang/String;

    iget-object v1, p0, Lqw2/b$e;->b:Lcom/whoop/whoopaction/domain/models/PickMediaSource;

    iget-object v2, p0, Lqw2/b$e;->c:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p0, Lqw2/b$e;->d:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v4, p0, Lqw2/b$e;->e:Lcom/whoop/whoopaction/domain/models/Action;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "PickMedia(stateKey="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", source="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", onSuccess="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", onError="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", action="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
