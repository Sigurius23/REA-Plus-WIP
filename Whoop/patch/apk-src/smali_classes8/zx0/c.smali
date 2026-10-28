.class public final Lzx0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u00002\u00020\u0001B=\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bJF\u0010\u000c\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00062\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001e\u001a\u0004\u0008!\u0010 R\u0017\u0010\t\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u001e\u001a\u0004\u0008\"\u0010 \u00a8\u0006#"
    }
    d2 = {
        "Lzx0/c;",
        "",
        "Lzx0/a;",
        "currentDialogType",
        "Lcom/whoop/deepdive/domain/models/DeepDiveModels;",
        "response",
        "",
        "manualRefresh",
        "displayRefreshingSpinner",
        "isInHomeCalibrationExperimentTestGroup",
        "<init>",
        "(Lzx0/a;Lcom/whoop/deepdive/domain/models/DeepDiveModels;ZZZ)V",
        "a",
        "(Lzx0/a;Lcom/whoop/deepdive/domain/models/DeepDiveModels;ZZZ)Lzx0/c;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lzx0/a;",
        "c",
        "()Lzx0/a;",
        "b",
        "Lcom/whoop/deepdive/domain/models/DeepDiveModels;",
        "d",
        "()Lcom/whoop/deepdive/domain/models/DeepDiveModels;",
        "Z",
        "getManualRefresh",
        "()Z",
        "getDisplayRefreshingSpinner",
        "e",
        "deep-dive_release"
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
.field private final a:Lzx0/a;

.field private final b:Lcom/whoop/deepdive/domain/models/DeepDiveModels;

.field private final c:Z

.field private final d:Z

.field private final e:Z


# direct methods
.method public constructor <init>(Lzx0/a;Lcom/whoop/deepdive/domain/models/DeepDiveModels;ZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lzx0/c;->a:Lzx0/a;

    .line 3
    iput-object p2, p0, Lzx0/c;->b:Lcom/whoop/deepdive/domain/models/DeepDiveModels;

    .line 4
    iput-boolean p3, p0, Lzx0/c;->c:Z

    .line 5
    iput-boolean p4, p0, Lzx0/c;->d:Z

    .line 6
    iput-boolean p5, p0, Lzx0/c;->e:Z

    return-void
.end method

.method public synthetic constructor <init>(Lzx0/a;Lcom/whoop/deepdive/domain/models/DeepDiveModels;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
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

    const/4 v0, 0x0

    if-eqz p7, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    move p6, v0

    :goto_0
    move p5, p4

    move p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_4
    move p6, p5

    goto :goto_0

    .line 7
    :goto_1
    invoke-direct/range {p1 .. p6}, Lzx0/c;-><init>(Lzx0/a;Lcom/whoop/deepdive/domain/models/DeepDiveModels;ZZZ)V

    return-void
.end method

.method public static synthetic b(Lzx0/c;Lzx0/a;Lcom/whoop/deepdive/domain/models/DeepDiveModels;ZZZILjava/lang/Object;)Lzx0/c;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lzx0/c;->a:Lzx0/a;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lzx0/c;->b:Lcom/whoop/deepdive/domain/models/DeepDiveModels;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-boolean p3, p0, Lzx0/c;->c:Z

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-boolean p4, p0, Lzx0/c;->d:Z

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-boolean p5, p0, Lzx0/c;->e:Z

    :cond_4
    move p6, p4

    move p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lzx0/c;->a(Lzx0/a;Lcom/whoop/deepdive/domain/models/DeepDiveModels;ZZZ)Lzx0/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lzx0/a;Lcom/whoop/deepdive/domain/models/DeepDiveModels;ZZZ)Lzx0/c;
    .locals 6

    new-instance v0, Lzx0/c;

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lzx0/c;-><init>(Lzx0/a;Lcom/whoop/deepdive/domain/models/DeepDiveModels;ZZZ)V

    return-object v0
.end method

.method public final c()Lzx0/a;
    .locals 1

    iget-object v0, p0, Lzx0/c;->a:Lzx0/a;

    return-object v0
.end method

.method public final d()Lcom/whoop/deepdive/domain/models/DeepDiveModels;
    .locals 1

    iget-object v0, p0, Lzx0/c;->b:Lcom/whoop/deepdive/domain/models/DeepDiveModels;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lzx0/c;->e:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lzx0/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lzx0/c;

    iget-object v1, p0, Lzx0/c;->a:Lzx0/a;

    iget-object v3, p1, Lzx0/c;->a:Lzx0/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lzx0/c;->b:Lcom/whoop/deepdive/domain/models/DeepDiveModels;

    iget-object v3, p1, Lzx0/c;->b:Lcom/whoop/deepdive/domain/models/DeepDiveModels;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lzx0/c;->c:Z

    iget-boolean v3, p1, Lzx0/c;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lzx0/c;->d:Z

    iget-boolean v3, p1, Lzx0/c;->d:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lzx0/c;->e:Z

    iget-boolean p1, p1, Lzx0/c;->e:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lzx0/c;->a:Lzx0/a;

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

    iget-object v3, p0, Lzx0/c;->b:Lcom/whoop/deepdive/domain/models/DeepDiveModels;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/whoop/deepdive/domain/models/DeepDiveModels;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-boolean v1, p0, Lzx0/c;->c:Z

    invoke-static {v0, v2, v1}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lzx0/c;->d:Z

    invoke-static {v0, v2, v1}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lzx0/c;->e:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lzx0/c;->a:Lzx0/a;

    iget-object v1, p0, Lzx0/c;->b:Lcom/whoop/deepdive/domain/models/DeepDiveModels;

    iget-boolean v2, p0, Lzx0/c;->c:Z

    iget-boolean v3, p0, Lzx0/c;->d:Z

    iget-boolean v4, p0, Lzx0/c;->e:Z

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "DeepDiveDomainState(currentDialogType="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", response="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", manualRefresh="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", displayRefreshingSpinner="

    const-string v1, ", isInHomeCalibrationExperimentTestGroup="

    invoke-static {v5, v2, v0, v3, v1}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
