.class public final Lkt1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u001d\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J&\u0010\u0008\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lkt1/b;",
        "",
        "Lkt1/e;",
        "currentScreenType",
        "Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;",
        "labradorEligibilityResponse",
        "<init>",
        "(Lkt1/e;Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;)V",
        "a",
        "(Lkt1/e;Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;)Lkt1/b;",
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
        "Lkt1/e;",
        "c",
        "()Lkt1/e;",
        "b",
        "Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;",
        "d",
        "()Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;",
        "labrador_release"
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
.field private final a:Lkt1/e;

.field private final b:Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;


# direct methods
.method public constructor <init>(Lkt1/e;Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;)V
    .locals 1

    const-string v0, "currentScreenType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lkt1/b;->a:Lkt1/e;

    .line 3
    iput-object p2, p0, Lkt1/b;->b:Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;

    return-void
.end method

.method public synthetic constructor <init>(Lkt1/e;Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 4
    sget-object p1, Lkt1/e$c;->a:Lkt1/e$c;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2}, Lkt1/b;-><init>(Lkt1/e;Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;)V

    return-void
.end method

.method public static synthetic b(Lkt1/b;Lkt1/e;Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;ILjava/lang/Object;)Lkt1/b;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lkt1/b;->a:Lkt1/e;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lkt1/b;->b:Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lkt1/b;->a(Lkt1/e;Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;)Lkt1/b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lkt1/e;Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;)Lkt1/b;
    .locals 1

    const-string v0, "currentScreenType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkt1/b;

    invoke-direct {v0, p1, p2}, Lkt1/b;-><init>(Lkt1/e;Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;)V

    return-object v0
.end method

.method public final c()Lkt1/e;
    .locals 1

    iget-object v0, p0, Lkt1/b;->a:Lkt1/e;

    return-object v0
.end method

.method public final d()Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;
    .locals 1

    iget-object v0, p0, Lkt1/b;->b:Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lkt1/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lkt1/b;

    iget-object v1, p0, Lkt1/b;->a:Lkt1/e;

    iget-object v3, p1, Lkt1/b;->a:Lkt1/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lkt1/b;->b:Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;

    iget-object p1, p1, Lkt1/b;->b:Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lkt1/b;->a:Lkt1/e;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lkt1/b;->b:Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lkt1/b;->a:Lkt1/e;

    iget-object v1, p0, Lkt1/b;->b:Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "LabradorEligibilityDomainState(currentScreenType="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", labradorEligibilityResponse="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
