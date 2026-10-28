.class final Llo2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000f\u0008\u0082\u0008\u0018\u00002\u00020\u0001B9\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJB\u0010\u000b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0016\u001a\u0004\u0008\u001a\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0016\u001a\u0004\u0008\u001b\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0016\u001a\u0004\u0008\u001c\u0010\u0018R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u0019\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Llo2/a;",
        "",
        "",
        "universalCheckoutWasConfigured",
        "effectiveScreenReadyForViewEmitted",
        "screenViewedEmitted",
        "stripeFlowControllerInitializationFailed",
        "Llo2/b;",
        "combinedResult",
        "<init>",
        "(ZZZZLlo2/b;)V",
        "a",
        "(ZZZZLlo2/b;)Llo2/a;",
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
        "getUniversalCheckoutWasConfigured",
        "()Z",
        "b",
        "c",
        "d",
        "e",
        "Llo2/b;",
        "()Llo2/b;",
        "universal-checkout_release"
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

.field private final c:Z

.field private final d:Z

.field private final e:Llo2/b;


# direct methods
.method public constructor <init>(ZZZZLlo2/b;)V
    .locals 1

    const-string v0, "combinedResult"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Llo2/a;->a:Z

    .line 3
    iput-boolean p2, p0, Llo2/a;->b:Z

    .line 4
    iput-boolean p3, p0, Llo2/a;->c:Z

    .line 5
    iput-boolean p4, p0, Llo2/a;->d:Z

    .line 6
    iput-object p5, p0, Llo2/a;->e:Llo2/b;

    return-void
.end method

.method public synthetic constructor <init>(ZZZZLlo2/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    .line 7
    new-instance p5, Llo2/b;

    const/4 p6, 0x3

    const/4 p7, 0x0

    invoke-direct {p5, p7, p7, p6, p7}, Llo2/b;-><init>(Lko2/c;Ljo2/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_4
    move-object p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    .line 8
    invoke-direct/range {p1 .. p6}, Llo2/a;-><init>(ZZZZLlo2/b;)V

    return-void
.end method


# virtual methods
.method public final a(ZZZZLlo2/b;)Llo2/a;
    .locals 7

    const-string v0, "combinedResult"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llo2/a;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Llo2/a;-><init>(ZZZZLlo2/b;)V

    return-object v1
.end method

.method public final b()Llo2/b;
    .locals 1

    iget-object v0, p0, Llo2/a;->e:Llo2/b;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Llo2/a;->b:Z

    return v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Llo2/a;->c:Z

    return v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Llo2/a;->d:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llo2/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llo2/a;

    iget-boolean v1, p0, Llo2/a;->a:Z

    iget-boolean v3, p1, Llo2/a;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Llo2/a;->b:Z

    iget-boolean v3, p1, Llo2/a;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Llo2/a;->c:Z

    iget-boolean v3, p1, Llo2/a;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Llo2/a;->d:Z

    iget-boolean v3, p1, Llo2/a;->d:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Llo2/a;->e:Llo2/b;

    iget-object p1, p1, Llo2/a;->e:Llo2/b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Llo2/a;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Llo2/a;->b:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Llo2/a;->c:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Llo2/a;->d:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Llo2/a;->e:Llo2/b;

    invoke-virtual {v1}, Llo2/b;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-boolean v0, p0, Llo2/a;->a:Z

    iget-boolean v1, p0, Llo2/a;->b:Z

    iget-boolean v2, p0, Llo2/a;->c:Z

    iget-boolean v3, p0, Llo2/a;->d:Z

    iget-object v4, p0, Llo2/a;->e:Llo2/b;

    const-string v5, ", effectiveScreenReadyForViewEmitted="

    const-string v6, ", screenViewedEmitted="

    const-string v7, "EmissionState(universalCheckoutWasConfigured="

    invoke-static {v7, v5, v6, v0, v1}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", stripeFlowControllerInitializationFailed="

    const-string v5, ", combinedResult="

    invoke-static {v0, v2, v1, v3, v5}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
