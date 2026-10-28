.class public final Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0015\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0081\u0008\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\nH\u00c6\u0003JG\u0010\u001e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u00c6\u0001J\u0014\u0010\u001f\u001a\u00020 2\u0008\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\"\u001a\u00020#H\u00d6\u0081\u0004J\n\u0010$\u001a\u00020\nH\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0016\u00a8\u0006%"
    }
    d2 = {
        "Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;",
        "",
        "unitSystem",
        "Lcom/whoop/domain/model/UnitSystem;",
        "height",
        "Lcom/whoop/design/util/TextResource;",
        "weight",
        "profileData",
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;",
        "currentHeightValue",
        "",
        "currentWeightValue",
        "<init>",
        "(Lcom/whoop/domain/model/UnitSystem;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Ljava/lang/String;Ljava/lang/String;)V",
        "getUnitSystem",
        "()Lcom/whoop/domain/model/UnitSystem;",
        "getHeight",
        "()Lcom/whoop/design/util/TextResource;",
        "getWeight",
        "getProfileData",
        "()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;",
        "getCurrentHeightValue",
        "()Ljava/lang/String;",
        "getCurrentWeightValue",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "profile_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final currentHeightValue:Ljava/lang/String;

.field private final currentWeightValue:Ljava/lang/String;

.field private final height:Lcom/whoop/design/util/TextResource;

.field private final profileData:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

.field private final unitSystem:Lcom/whoop/domain/model/UnitSystem;

.field private final weight:Lcom/whoop/design/util/TextResource;


# direct methods
.method public constructor <init>(Lcom/whoop/domain/model/UnitSystem;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "unitSystem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "height"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "weight"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentHeightValue"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentWeightValue"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->unitSystem:Lcom/whoop/domain/model/UnitSystem;

    iput-object p2, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->height:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->weight:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->profileData:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

    iput-object p5, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->currentHeightValue:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->currentWeightValue:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;Lcom/whoop/domain/model/UnitSystem;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->unitSystem:Lcom/whoop/domain/model/UnitSystem;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->height:Lcom/whoop/design/util/TextResource;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->weight:Lcom/whoop/design/util/TextResource;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->profileData:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->currentHeightValue:Ljava/lang/String;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->currentWeightValue:Ljava/lang/String;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->copy(Lcom/whoop/domain/model/UnitSystem;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/whoop/domain/model/UnitSystem;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->unitSystem:Lcom/whoop/domain/model/UnitSystem;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->height:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->weight:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component4()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->profileData:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->currentHeightValue:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->currentWeightValue:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/domain/model/UnitSystem;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;
    .locals 8

    const-string v0, "unitSystem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "height"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "weight"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentHeightValue"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentWeightValue"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;-><init>(Lcom/whoop/domain/model/UnitSystem;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;

    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->unitSystem:Lcom/whoop/domain/model/UnitSystem;

    iget-object v3, p1, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->unitSystem:Lcom/whoop/domain/model/UnitSystem;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->height:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->height:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->weight:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->weight:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->profileData:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

    iget-object v3, p1, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->profileData:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->currentHeightValue:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->currentHeightValue:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->currentWeightValue:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->currentWeightValue:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getCurrentHeightValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->currentHeightValue:Ljava/lang/String;

    return-object v0
.end method

.method public final getCurrentWeightValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->currentWeightValue:Ljava/lang/String;

    return-object v0
.end method

.method public final getHeight()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->height:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getProfileData()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->profileData:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

    return-object v0
.end method

.method public final getUnitSystem()Lcom/whoop/domain/model/UnitSystem;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->unitSystem:Lcom/whoop/domain/model/UnitSystem;

    return-object v0
.end method

.method public final getWeight()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->weight:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->unitSystem:Lcom/whoop/domain/model/UnitSystem;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->height:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->weight:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->profileData:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->currentHeightValue:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->currentWeightValue:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->unitSystem:Lcom/whoop/domain/model/UnitSystem;

    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->height:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->weight:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->profileData:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

    iget-object v4, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->currentHeightValue:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;->currentWeightValue:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "HeightWeightGroupedField(unitSystem="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", height="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", weight="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", profileData="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", currentHeightValue="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", currentWeightValue="

    const-string v1, ")"

    invoke-static {v6, v4, v0, v5, v1}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
