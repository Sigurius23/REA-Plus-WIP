.class public final Lcom/whoop/data/onboarding/OnboardingStatus;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010\u000e\u001a\u00020\u00052\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u00d6\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u00d6\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\n\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/whoop/data/onboarding/OnboardingStatus;",
        "",
        "type",
        "Lcom/whoop/data/onboarding/FeatureEducationType;",
        "isCompleted",
        "",
        "<init>",
        "(Lcom/whoop/data/onboarding/FeatureEducationType;Z)V",
        "getType",
        "()Lcom/whoop/data/onboarding/FeatureEducationType;",
        "()Z",
        "component1",
        "component2",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "core_release"
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
.field private final isCompleted:Z

.field private final type:Lcom/whoop/data/onboarding/FeatureEducationType;


# direct methods
.method public constructor <init>(Lcom/whoop/data/onboarding/FeatureEducationType;Z)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/data/onboarding/OnboardingStatus;->type:Lcom/whoop/data/onboarding/FeatureEducationType;

    iput-boolean p2, p0, Lcom/whoop/data/onboarding/OnboardingStatus;->isCompleted:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/data/onboarding/OnboardingStatus;Lcom/whoop/data/onboarding/FeatureEducationType;ZILjava/lang/Object;)Lcom/whoop/data/onboarding/OnboardingStatus;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/whoop/data/onboarding/OnboardingStatus;->type:Lcom/whoop/data/onboarding/FeatureEducationType;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-boolean p2, p0, Lcom/whoop/data/onboarding/OnboardingStatus;->isCompleted:Z

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/onboarding/OnboardingStatus;->copy(Lcom/whoop/data/onboarding/FeatureEducationType;Z)Lcom/whoop/data/onboarding/OnboardingStatus;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/whoop/data/onboarding/FeatureEducationType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatus;->type:Lcom/whoop/data/onboarding/FeatureEducationType;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/onboarding/OnboardingStatus;->isCompleted:Z

    return v0
.end method

.method public final copy(Lcom/whoop/data/onboarding/FeatureEducationType;Z)Lcom/whoop/data/onboarding/OnboardingStatus;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/data/onboarding/OnboardingStatus;

    invoke-direct {v0, p1, p2}, Lcom/whoop/data/onboarding/OnboardingStatus;-><init>(Lcom/whoop/data/onboarding/FeatureEducationType;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/onboarding/OnboardingStatus;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/onboarding/OnboardingStatus;

    iget-object v1, p0, Lcom/whoop/data/onboarding/OnboardingStatus;->type:Lcom/whoop/data/onboarding/FeatureEducationType;

    iget-object v3, p1, Lcom/whoop/data/onboarding/OnboardingStatus;->type:Lcom/whoop/data/onboarding/FeatureEducationType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/data/onboarding/OnboardingStatus;->isCompleted:Z

    iget-boolean p1, p1, Lcom/whoop/data/onboarding/OnboardingStatus;->isCompleted:Z

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getType()Lcom/whoop/data/onboarding/FeatureEducationType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatus;->type:Lcom/whoop/data/onboarding/FeatureEducationType;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatus;->type:Lcom/whoop/data/onboarding/FeatureEducationType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/whoop/data/onboarding/OnboardingStatus;->isCompleted:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isCompleted()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/onboarding/OnboardingStatus;->isCompleted:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/whoop/data/onboarding/OnboardingStatus;->type:Lcom/whoop/data/onboarding/FeatureEducationType;

    iget-boolean v1, p0, Lcom/whoop/data/onboarding/OnboardingStatus;->isCompleted:Z

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "OnboardingStatus(type="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isCompleted="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
