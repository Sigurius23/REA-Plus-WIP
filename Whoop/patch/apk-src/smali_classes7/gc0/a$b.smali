.class public final Lgc0/a$b;
.super Lgc0/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgc0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0017\u001a\u0004\u0008\u0013\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lgc0/a$b;",
        "Lgc0/a;",
        "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;",
        "nextScreenId",
        "Lgc0/b;",
        "content",
        "<init>",
        "(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;Lgc0/b;)V",
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
        "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;",
        "b",
        "()Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;",
        "Lgc0/b;",
        "()Lgc0/b;",
        "advanced-labs_release"
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
.field private final a:Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;

.field private final b:Lgc0/b;


# direct methods
.method public constructor <init>(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;Lgc0/b;)V
    .locals 1

    const-string v0, "content"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lgc0/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lgc0/a$b;->a:Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;

    iput-object p2, p0, Lgc0/a$b;->b:Lgc0/b;

    return-void
.end method


# virtual methods
.method public final a()Lgc0/b;
    .locals 1

    iget-object v0, p0, Lgc0/a$b;->b:Lgc0/b;

    return-object v0
.end method

.method public final b()Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;
    .locals 1

    iget-object v0, p0, Lgc0/a$b;->a:Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lgc0/a$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lgc0/a$b;

    iget-object v1, p0, Lgc0/a$b;->a:Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;

    iget-object v3, p1, Lgc0/a$b;->a:Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lgc0/a$b;->b:Lgc0/b;

    iget-object p1, p1, Lgc0/a$b;->b:Lgc0/b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lgc0/a$b;->a:Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lgc0/a$b;->b:Lgc0/b;

    invoke-virtual {v1}, Lgc0/b;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lgc0/a$b;->a:Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;

    iget-object v1, p0, Lgc0/a$b;->b:Lgc0/b;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Forward(nextScreenId="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", content="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
