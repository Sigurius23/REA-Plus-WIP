.class public final Llg0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u00002\u00020\u0001B3\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00062\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0014\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001b\u001a\u0004\u0008\u001f\u0010\u001d\u00a8\u0006 "
    }
    d2 = {
        "Llg0/c;",
        "",
        "Llg0/a;",
        "currentDialogType",
        "Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementModels;",
        "response",
        "",
        "manualRefresh",
        "displayRefreshingSpinner",
        "<init>",
        "(Llg0/a;Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementModels;ZZ)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Llg0/a;",
        "()Llg0/a;",
        "b",
        "Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementModels;",
        "()Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementModels;",
        "c",
        "Z",
        "getManualRefresh",
        "()Z",
        "d",
        "getDisplayRefreshingSpinner",
        "advanced-labs-management_release"
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
.field private final a:Llg0/a;

.field private final b:Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementModels;

.field private final c:Z

.field private final d:Z


# direct methods
.method public constructor <init>(Llg0/a;Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementModels;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Llg0/c;->a:Llg0/a;

    .line 3
    iput-object p2, p0, Llg0/c;->b:Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementModels;

    .line 4
    iput-boolean p3, p0, Llg0/c;->c:Z

    .line 5
    iput-boolean p4, p0, Llg0/c;->d:Z

    return-void
.end method

.method public synthetic constructor <init>(Llg0/a;Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementModels;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move p4, v0

    .line 6
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Llg0/c;-><init>(Llg0/a;Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementModels;ZZ)V

    return-void
.end method


# virtual methods
.method public final a()Llg0/a;
    .locals 1

    iget-object v0, p0, Llg0/c;->a:Llg0/a;

    return-object v0
.end method

.method public final b()Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementModels;
    .locals 1

    iget-object v0, p0, Llg0/c;->b:Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementModels;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llg0/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llg0/c;

    iget-object v1, p0, Llg0/c;->a:Llg0/a;

    iget-object v3, p1, Llg0/c;->a:Llg0/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llg0/c;->b:Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementModels;

    iget-object v3, p1, Llg0/c;->b:Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementModels;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Llg0/c;->c:Z

    iget-boolean v3, p1, Llg0/c;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Llg0/c;->d:Z

    iget-boolean p1, p1, Llg0/c;->d:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Llg0/c;->a:Llg0/a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Llg0/c;->b:Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementModels;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementModels;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-boolean v1, p0, Llg0/c;->c:Z

    invoke-static {v0, v2, v1}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Llg0/c;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Llg0/c;->a:Llg0/a;

    iget-object v1, p0, Llg0/c;->b:Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementModels;

    iget-boolean v2, p0, Llg0/c;->c:Z

    iget-boolean v3, p0, Llg0/c;->d:Z

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "AdvancedLabsManagementDomainState(currentDialogType="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", response="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", manualRefresh="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", displayRefreshingSpinner="

    const-string v1, ")"

    invoke-static {v4, v2, v0, v3, v1}, Lvl/b;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
