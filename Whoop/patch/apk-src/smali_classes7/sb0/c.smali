.class public final Lsb0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u00002\u00020\u0001B?\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJH\u0010\r\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00082\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#R\u0017\u0010\n\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010!\u001a\u0004\u0008 \u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lsb0/c;",
        "",
        "",
        "selectedSegmentId",
        "Lsb0/a;",
        "currentDialogType",
        "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;",
        "response",
        "",
        "manualRefresh",
        "displayRefreshingSpinner",
        "<init>",
        "(Ljava/lang/String;Lsb0/a;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;ZZ)V",
        "a",
        "(Ljava/lang/String;Lsb0/a;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;ZZ)Lsb0/c;",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "f",
        "b",
        "Lsb0/a;",
        "c",
        "()Lsb0/a;",
        "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;",
        "e",
        "()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;",
        "d",
        "Z",
        "getManualRefresh",
        "()Z",
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
.field private final a:Ljava/lang/String;

.field private final b:Lsb0/a;

.field private final c:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;

.field private final d:Z

.field private final e:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lsb0/a;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lsb0/c;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lsb0/c;->b:Lsb0/a;

    .line 4
    iput-object p3, p0, Lsb0/c;->c:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;

    .line 5
    iput-boolean p4, p0, Lsb0/c;->d:Z

    .line 6
    iput-boolean p5, p0, Lsb0/c;->e:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lsb0/a;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p7, p6, 0x8

    const/4 v0, 0x0

    if-eqz p7, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    move p6, v0

    :goto_0
    move p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_4
    move p6, p5

    goto :goto_0

    .line 7
    :goto_1
    invoke-direct/range {p1 .. p6}, Lsb0/c;-><init>(Ljava/lang/String;Lsb0/a;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;ZZ)V

    return-void
.end method

.method public static synthetic b(Lsb0/c;Ljava/lang/String;Lsb0/a;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;ZZILjava/lang/Object;)Lsb0/c;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lsb0/c;->a:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lsb0/c;->b:Lsb0/a;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lsb0/c;->c:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-boolean p4, p0, Lsb0/c;->d:Z

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-boolean p5, p0, Lsb0/c;->e:Z

    :cond_4
    move p6, p4

    move p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lsb0/c;->a(Ljava/lang/String;Lsb0/a;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;ZZ)Lsb0/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lsb0/a;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;ZZ)Lsb0/c;
    .locals 6

    new-instance v0, Lsb0/c;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lsb0/c;-><init>(Ljava/lang/String;Lsb0/a;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;ZZ)V

    return-object v0
.end method

.method public final c()Lsb0/a;
    .locals 1

    iget-object v0, p0, Lsb0/c;->b:Lsb0/a;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lsb0/c;->e:Z

    return v0
.end method

.method public final e()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;
    .locals 1

    iget-object v0, p0, Lsb0/c;->c:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lsb0/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lsb0/c;

    iget-object v1, p0, Lsb0/c;->a:Ljava/lang/String;

    iget-object v3, p1, Lsb0/c;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lsb0/c;->b:Lsb0/a;

    iget-object v3, p1, Lsb0/c;->b:Lsb0/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lsb0/c;->c:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;

    iget-object v3, p1, Lsb0/c;->c:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lsb0/c;->d:Z

    iget-boolean v3, p1, Lsb0/c;->d:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lsb0/c;->e:Z

    iget-boolean p1, p1, Lsb0/c;->e:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lsb0/c;->a:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lsb0/c;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lsb0/c;->b:Lsb0/a;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lsb0/c;->c:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-boolean v1, p0, Lsb0/c;->d:Z

    invoke-static {v0, v2, v1}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lsb0/c;->e:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lsb0/c;->a:Ljava/lang/String;

    iget-object v1, p0, Lsb0/c;->b:Lsb0/a;

    iget-object v2, p0, Lsb0/c;->c:Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;

    iget-boolean v3, p0, Lsb0/c;->d:Z

    iget-boolean v4, p0, Lsb0/c;->e:Z

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "AdvancedLabsDomainState(selectedSegmentId="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", currentDialogType="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", response="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", manualRefresh="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", displayRefreshingSpinner="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
