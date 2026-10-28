.class public final Lqw2/b$d;
.super Lqw2/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqw2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001c\u001a\u0004\u0008\u0015\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lqw2/b$d;",
        "Lqw2/b;",
        "Lcom/whoop/navigation/e;",
        "destination",
        "Lj02/s;",
        "dismissEvent",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "action",
        "<init>",
        "(Lcom/whoop/navigation/e;Lj02/s;Lcom/whoop/whoopaction/domain/models/Action;)V",
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
        "Lcom/whoop/navigation/e;",
        "b",
        "()Lcom/whoop/navigation/e;",
        "Lj02/s;",
        "c",
        "()Lj02/s;",
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
.field public static final d:I


# instance fields
.field private final a:Lcom/whoop/navigation/e;

.field private final b:Lj02/s;

.field private final c:Lcom/whoop/whoopaction/domain/models/Action;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lj02/s;->d:I

    sget v1, Lcom/whoop/navigation/e;->d:I

    or-int/2addr v0, v1

    sput v0, Lqw2/b$d;->d:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/navigation/e;Lj02/s;Lcom/whoop/whoopaction/domain/models/Action;)V
    .locals 1

    const-string v0, "destination"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "action"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lqw2/b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lqw2/b$d;->a:Lcom/whoop/navigation/e;

    iput-object p2, p0, Lqw2/b$d;->b:Lj02/s;

    iput-object p3, p0, Lqw2/b$d;->c:Lcom/whoop/whoopaction/domain/models/Action;

    return-void
.end method


# virtual methods
.method public a()Lcom/whoop/whoopaction/domain/models/Action;
    .locals 1

    iget-object v0, p0, Lqw2/b$d;->c:Lcom/whoop/whoopaction/domain/models/Action;

    return-object v0
.end method

.method public final b()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lqw2/b$d;->a:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final c()Lj02/s;
    .locals 1

    iget-object v0, p0, Lqw2/b$d;->b:Lj02/s;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lqw2/b$d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lqw2/b$d;

    iget-object v1, p0, Lqw2/b$d;->a:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lqw2/b$d;->a:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lqw2/b$d;->b:Lj02/s;

    iget-object v3, p1, Lqw2/b$d;->b:Lj02/s;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lqw2/b$d;->c:Lcom/whoop/whoopaction/domain/models/Action;

    iget-object p1, p1, Lqw2/b$d;->c:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lqw2/b$d;->a:Lcom/whoop/navigation/e;

    invoke-virtual {v0}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lqw2/b$d;->b:Lj02/s;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lj02/s;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lqw2/b$d;->c:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lqw2/b$d;->a:Lcom/whoop/navigation/e;

    iget-object v1, p0, Lqw2/b$d;->b:Lj02/s;

    iget-object v2, p0, Lqw2/b$d;->c:Lcom/whoop/whoopaction/domain/models/Action;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "NavigateTo(destination="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", dismissEvent="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", action="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
