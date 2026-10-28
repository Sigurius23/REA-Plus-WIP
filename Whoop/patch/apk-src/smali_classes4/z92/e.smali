.class public final Lz92/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\u0008\u001a\u00020\u0007*\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001a\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lz92/e;",
        "",
        "Lcom/whoop/domain/model/User;",
        "user",
        "<init>",
        "(Lcom/whoop/domain/model/User;)V",
        "Lcom/whoop/domain/model/UserProfile;",
        "",
        "a",
        "(Lcom/whoop/domain/model/UserProfile;)I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "hashCode",
        "()I",
        "",
        "toString",
        "()Ljava/lang/String;",
        "Lcom/whoop/domain/model/User;",
        "b",
        "()Lcom/whoop/domain/model/User;",
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
.field private final a:Lcom/whoop/domain/model/User;


# direct methods
.method public constructor <init>(Lcom/whoop/domain/model/User;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz92/e;->a:Lcom/whoop/domain/model/User;

    return-void
.end method

.method private final a(Lcom/whoop/domain/model/UserProfile;)I
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/domain/model/UserProfile;->getGender()Lcom/whoop/domain/model/Gender;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/domain/model/Gender;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    mul-int/lit8 v1, v1, 0x1f

    invoke-virtual {p1}, Lcom/whoop/domain/model/UserProfile;->getHeight()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->hashCode(F)I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    invoke-virtual {p1}, Lcom/whoop/domain/model/UserProfile;->getWeight()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    invoke-virtual {p1}, Lcom/whoop/domain/model/UserProfile;->getBirthday()Lorg/joda/time/LocalDate;

    move-result-object v2

    invoke-virtual {v2}, Lorg/joda/time/LocalDate;->hashCode()I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    invoke-virtual {p1}, Lcom/whoop/domain/model/UserProfile;->getTimeZoneOffset()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    invoke-virtual {p1}, Lcom/whoop/domain/model/UserProfile;->getUnitSystem()Lcom/whoop/domain/model/UnitSystem;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/domain/model/UnitSystem;->toName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    invoke-virtual {p1}, Lcom/whoop/domain/model/UserProfile;->getFitnessLevel()Lcom/whoop/domain/model/FitnessLevel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/domain/model/FitnessLevel;->toNameKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    invoke-virtual {p1}, Lcom/whoop/domain/model/UserProfile;->getMaxHeartRate()I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    invoke-virtual {p1}, Lcom/whoop/domain/model/UserProfile;->getMinHeartRate()I

    move-result v1

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    invoke-virtual {p1}, Lcom/whoop/domain/model/UserProfile;->getPhysiologicalBaseline()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v0

    :cond_1
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    invoke-virtual {p1}, Lcom/whoop/domain/model/UserProfile;->getCanUploadData()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result p1

    add-int/2addr p1, v1

    return p1
.end method


# virtual methods
.method public final b()Lcom/whoop/domain/model/User;
    .locals 1

    iget-object v0, p0, Lz92/e;->a:Lcom/whoop/domain/model/User;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    const-class v2, Lz92/e;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    :cond_2
    const-string v1, "null cannot be cast to non-null type com.whoop.service.store.user.cache.UserUpdate"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lz92/e;

    iget-object p1, p1, Lz92/e;->a:Lcom/whoop/domain/model/User;

    if-nez p1, :cond_4

    iget-object p1, p0, Lz92/e;->a:Lcom/whoop/domain/model/User;

    if-nez p1, :cond_3

    return v0

    :cond_3
    return v2

    :cond_4
    iget-object v1, p0, Lz92/e;->a:Lcom/whoop/domain/model/User;

    if-nez v1, :cond_5

    return v2

    :cond_5
    if-ne v1, p1, :cond_6

    return v0

    :cond_6
    invoke-virtual {v1}, Lcom/whoop/domain/model/User;->getId()I

    move-result v3

    invoke-virtual {p1}, Lcom/whoop/domain/model/User;->getId()I

    move-result v4

    if-ne v3, v4, :cond_7

    invoke-virtual {v1}, Lcom/whoop/domain/model/User;->getCreatedAt()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/domain/model/User;->getCreatedAt()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v1}, Lcom/whoop/domain/model/User;->getFirstName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/domain/model/User;->getFirstName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v1}, Lcom/whoop/domain/model/User;->getLastName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/domain/model/User;->getLastName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v1}, Lcom/whoop/domain/model/User;->getFullName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/domain/model/User;->getFullName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v1}, Lcom/whoop/domain/model/User;->getEmailAddress()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/domain/model/User;->getEmailAddress()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v1}, Lcom/whoop/domain/model/User;->getUsername()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/domain/model/User;->getUsername()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v1}, Lcom/whoop/domain/model/User;->getAvatarUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/domain/model/User;->getAvatarUrl()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v1}, Lcom/whoop/domain/model/User;->getCity()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/domain/model/User;->getCity()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v1}, Lcom/whoop/domain/model/User;->getAdminDivision()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/domain/model/User;->getAdminDivision()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v1}, Lcom/whoop/domain/model/User;->getCountry()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/domain/model/User;->getCountry()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v1}, Lcom/whoop/domain/model/User;->getProfile()Lcom/whoop/domain/model/UserProfile;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/domain/model/User;->getProfile()Lcom/whoop/domain/model/UserProfile;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v1}, Lcom/whoop/domain/model/User;->getConcealed()Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/domain/model/User;->getConcealed()Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v1}, Lcom/whoop/domain/model/User;->getAge()I

    move-result v1

    invoke-virtual {p1}, Lcom/whoop/domain/model/User;->getAge()I

    move-result p1

    if-ne v1, p1, :cond_7

    return v0

    :cond_7
    return v2
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lz92/e;->a:Lcom/whoop/domain/model/User;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/domain/model/User;->getId()I

    move-result v2

    mul-int/lit8 v2, v2, 0x1f

    invoke-virtual {v0}, Lcom/whoop/domain/model/User;->getCreatedAt()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1f

    invoke-virtual {v0}, Lcom/whoop/domain/model/User;->getFirstName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v2, v3

    mul-int/lit8 v2, v2, 0x1f

    invoke-virtual {v0}, Lcom/whoop/domain/model/User;->getLastName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1f

    invoke-virtual {v0}, Lcom/whoop/domain/model/User;->getFullName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v2, v3

    mul-int/lit8 v2, v2, 0x1f

    invoke-virtual {v0}, Lcom/whoop/domain/model/User;->getEmailAddress()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1f

    invoke-virtual {v0}, Lcom/whoop/domain/model/User;->getUsername()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v2, v3

    mul-int/lit8 v2, v2, 0x1f

    invoke-virtual {v0}, Lcom/whoop/domain/model/User;->getAvatarUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1f

    invoke-virtual {v0}, Lcom/whoop/domain/model/User;->getCity()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_0
    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1f

    invoke-virtual {v0}, Lcom/whoop/domain/model/User;->getAdminDivision()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_2
    move v2, v1

    :goto_1
    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1f

    invoke-virtual {v0}, Lcom/whoop/domain/model/User;->getCountry()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v2, v3

    mul-int/lit8 v2, v2, 0x1f

    invoke-virtual {v0}, Lcom/whoop/domain/model/User;->getProfile()Lcom/whoop/domain/model/UserProfile;

    move-result-object v3

    invoke-direct {p0, v3}, Lz92/e;->a(Lcom/whoop/domain/model/UserProfile;)I

    move-result v3

    add-int/2addr v2, v3

    mul-int/lit8 v2, v2, 0x1f

    invoke-virtual {v0}, Lcom/whoop/domain/model/User;->getConcealed()Ljava/lang/Boolean;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    :cond_3
    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    invoke-virtual {v0}, Lcom/whoop/domain/model/User;->getAge()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lz92/e;->a:Lcom/whoop/domain/model/User;

    if-nez v0, :cond_0

    const-string v0, "UserUpdate(user=null)"

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/domain/model/User;->getId()I

    move-result v1

    invoke-virtual {v0}, Lcom/whoop/domain/model/User;->getCreatedAt()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/whoop/domain/model/User;->getUsername()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/whoop/domain/model/User;->getAvatarUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/whoop/domain/model/User;->getCountry()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lcom/whoop/domain/model/User;->getProfile()Lcom/whoop/domain/model/UserProfile;

    move-result-object v6

    const/4 v7, 0x0

    if-eqz v6, :cond_1

    invoke-virtual {v6}, Lcom/whoop/domain/model/UserProfile;->getGender()Lcom/whoop/domain/model/Gender;

    move-result-object v6

    goto :goto_0

    :cond_1
    move-object v6, v7

    :goto_0
    invoke-virtual {v0}, Lcom/whoop/domain/model/User;->getProfile()Lcom/whoop/domain/model/UserProfile;

    move-result-object v8

    if-eqz v8, :cond_2

    invoke-virtual {v8}, Lcom/whoop/domain/model/UserProfile;->getCanUploadData()Z

    move-result v7

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    :cond_2
    invoke-virtual {v0}, Lcom/whoop/domain/model/User;->getConcealed()Ljava/lang/Boolean;

    move-result-object v8

    invoke-virtual {v0}, Lcom/whoop/domain/model/User;->getAge()I

    move-result v0

    const-string v9, ", createdAt=\'"

    const-string v10, "\', username=\'"

    const-string v11, "UserUpdate(id="

    invoke-static {v1, v11, v9, v2, v10}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\', avatarUrl=\'"

    const-string v9, "\', country=\'"

    invoke-static {v1, v3, v2, v4, v9}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\', gender="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", canUploadData="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", concealed="

    const-string v3, ", age="

    invoke-static {v1, v7, v2, v8, v3}, Lc13/a;->w(Ljava/lang/StringBuilder;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V

    const-string v2, ")"

    invoke-static {v1, v0, v2}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
