.class public final Lo52/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u00002\u00020\u0001B%\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0018\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u001b\u001a\u0004\u0008\u0014\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lo52/t0;",
        "",
        "Lp92/j;",
        "strainRecoveryMapper",
        "Lo52/v0;",
        "strainCoachStates",
        "Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;",
        "cycleMetadata",
        "<init>",
        "(Lp92/j;Lo52/v0;Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;)V",
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
        "Lp92/j;",
        "c",
        "()Lp92/j;",
        "b",
        "Lo52/v0;",
        "()Lo52/v0;",
        "Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;",
        "()Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;",
        "realtime-activity_release"
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
.field private final a:Lp92/j;

.field private final b:Lo52/v0;

.field private final c:Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;


# direct methods
.method public constructor <init>(Lp92/j;Lo52/v0;Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;)V
    .locals 1

    const-string v0, "strainCoachStates"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lo52/t0;->a:Lp92/j;

    .line 3
    iput-object p2, p0, Lo52/t0;->b:Lo52/v0;

    .line 4
    iput-object p3, p0, Lo52/t0;->c:Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;

    return-void
.end method

.method public synthetic constructor <init>(Lp92/j;Lo52/v0;Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lo52/t0;-><init>(Lp92/j;Lo52/v0;Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;
    .locals 1

    iget-object v0, p0, Lo52/t0;->c:Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;

    return-object v0
.end method

.method public final b()Lo52/v0;
    .locals 1

    iget-object v0, p0, Lo52/t0;->b:Lo52/v0;

    return-object v0
.end method

.method public final c()Lp92/j;
    .locals 1

    iget-object v0, p0, Lo52/t0;->a:Lp92/j;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lo52/t0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lo52/t0;

    iget-object v1, p0, Lo52/t0;->a:Lp92/j;

    iget-object v3, p1, Lo52/t0;->a:Lp92/j;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lo52/t0;->b:Lo52/v0;

    iget-object v3, p1, Lo52/t0;->b:Lo52/v0;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lo52/t0;->c:Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;

    iget-object p1, p1, Lo52/t0;->c:Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lo52/t0;->a:Lp92/j;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lo52/t0;->b:Lo52/v0;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-object v0, p0, Lo52/t0;->c:Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v2, v1

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lo52/t0;->a:Lp92/j;

    iget-object v1, p0, Lo52/t0;->b:Lo52/v0;

    iget-object v2, p0, Lo52/t0;->c:Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "StartActivityViewModelEvent(strainRecoveryMapper="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", strainCoachStates="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", cycleMetadata="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
