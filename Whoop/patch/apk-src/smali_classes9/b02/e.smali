.class public final Lb02/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u00002\u00020\u0001B1\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ:\u0010\u000b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0016\u001a\u0004\u0008\u0004\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001e\u001a\u0004\u0008\u001a\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lb02/e;",
        "",
        "",
        "isLoading",
        "isError",
        "Lb02/a;",
        "data",
        "Lao2/b;",
        "cartIndicator",
        "<init>",
        "(ZZLb02/a;Lao2/b;)V",
        "a",
        "(ZZLb02/a;Lao2/b;)Lb02/e;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Z",
        "e",
        "()Z",
        "b",
        "c",
        "Lb02/a;",
        "d",
        "()Lb02/a;",
        "Lao2/b;",
        "()Lao2/b;",
        "native-store_release"
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
.field private final a:Z

.field private final b:Z

.field private final c:Lb02/a;

.field private final d:Lao2/b;


# direct methods
.method public constructor <init>(ZZLb02/a;Lao2/b;)V
    .locals 1

    const-string v0, "cartIndicator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lb02/e;->a:Z

    .line 3
    iput-boolean p2, p0, Lb02/e;->b:Z

    .line 4
    iput-object p3, p0, Lb02/e;->c:Lb02/a;

    .line 5
    iput-object p4, p0, Lb02/e;->d:Lao2/b;

    return-void
.end method

.method public synthetic constructor <init>(ZZLb02/a;Lao2/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    const/4 p3, 0x0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    .line 6
    new-instance v0, Lao2/b;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lao2/b;-><init>(ILcom/whoop/navigation/e;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p4, v0

    .line 7
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lb02/e;-><init>(ZZLb02/a;Lao2/b;)V

    return-void
.end method

.method public static synthetic b(Lb02/e;ZZLb02/a;Lao2/b;ILjava/lang/Object;)Lb02/e;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-boolean p1, p0, Lb02/e;->a:Z

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-boolean p2, p0, Lb02/e;->b:Z

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lb02/e;->c:Lb02/a;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lb02/e;->d:Lao2/b;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lb02/e;->a(ZZLb02/a;Lao2/b;)Lb02/e;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(ZZLb02/a;Lao2/b;)Lb02/e;
    .locals 1

    const-string v0, "cartIndicator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lb02/e;

    invoke-direct {v0, p1, p2, p3, p4}, Lb02/e;-><init>(ZZLb02/a;Lao2/b;)V

    return-object v0
.end method

.method public final c()Lao2/b;
    .locals 1

    iget-object v0, p0, Lb02/e;->d:Lao2/b;

    return-object v0
.end method

.method public final d()Lb02/a;
    .locals 1

    iget-object v0, p0, Lb02/e;->c:Lb02/a;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lb02/e;->a:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lb02/e;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lb02/e;

    iget-boolean v1, p0, Lb02/e;->a:Z

    iget-boolean v3, p1, Lb02/e;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lb02/e;->b:Z

    iget-boolean v3, p1, Lb02/e;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lb02/e;->c:Lb02/a;

    iget-object v3, p1, Lb02/e;->c:Lb02/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lb02/e;->d:Lao2/b;

    iget-object p1, p1, Lb02/e;->d:Lao2/b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lb02/e;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lb02/e;->b:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lb02/e;->c:Lb02/a;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lb02/a;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lb02/e;->d:Lao2/b;

    invoke-virtual {v1}, Lao2/b;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-boolean v0, p0, Lb02/e;->a:Z

    iget-boolean v1, p0, Lb02/e;->b:Z

    iget-object v2, p0, Lb02/e;->c:Lb02/a;

    iget-object v3, p0, Lb02/e;->d:Lao2/b;

    const-string v4, ", isError="

    const-string v5, ", data="

    const-string v6, "PdpViewState(isLoading="

    invoke-static {v6, v4, v5, v0, v1}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cartIndicator="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
